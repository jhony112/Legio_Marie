package com.jhony.legiomaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.jhony.models.OziAdapter;

public class PrayerActivity extends Activity  {
	private ArrayAdapter MessageArrayAdapter;
	
	String[] Prayers;
	Intent intent;
	String[] prayer_menu;
	TextView sd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		super.onCreate(savedInstanceState);

		prayer_menu = getResources().getStringArray(R.array.Prayer_menu);// get
		Prayers = getResources().getStringArray(R.array.Prayers);																// array
																			// of
																			// menu
		MessageArrayAdapter = new OziAdapter(this, prayer_menu,
				R.drawable.praying_hands);
		// custom lisview adapter class instance with image in imageview
		setContentView(R.layout.activity_prayer);
		ListView MessageLists = (ListView) findViewById(R.id.listView1);
		MessageLists.setAdapter(MessageArrayAdapter);
MessageLists.setOnItemClickListener(new OnItemClickListener(){
	
	public void onItemClick(AdapterView <?> arg0,View arg1,int position,long arg3){
		intent = new Intent(getBaseContext(), PrayerDetail.class);
		Toast.makeText(getBaseContext(), String.valueOf(position), 1000).show();
		intent.putExtra("prayer", Prayers[position]);
		intent.putExtra("tag", prayer_menu[position]);
		startActivity(intent);
		
	}//)
	
	
});
		// setListAdapter(MessageArrayAdapter);//sets the adapter for the
		// listview
		// getListView().setOnItemClickListener(this);
		// gets the
																	// prayers
																	// array
		this.sd = ((TextView) findViewById(R.id.header_text));
		this.sd.setText("Legio Marie | Prayers");
	}

	public void ListItemClick(View paramAdapterView, View paramView,
			int paramInt, long paramLong) { // TODO Auto-generated method stub
		this.intent = new Intent(this, PrayerDetail.class);
		Toast.makeText(this, "loed", 1000).show();
		this.intent.putExtra("prayer", this.Prayers[paramInt]);
		this.intent.putExtra("tag", this.prayer_menu[paramInt]);
		startActivity(this.intent);
	}

}
