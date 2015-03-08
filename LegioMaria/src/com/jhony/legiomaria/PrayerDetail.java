package com.jhony.legiomaria;
import com.jhony.legiomaria.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class PrayerDetail extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		String id = intent.getStringExtra("prayer");
		String tag = intent.getStringExtra("tag");
		
		this.setTitle("Legio Marie| Prayers");
		setContentView(R.layout.activity_prayer_detail);
		
		TextView ff=(TextView)findViewById(R.id.prayer);
		TextView ff2=(TextView)findViewById(R.id.header);
		ff2.setText(tag);
		ff.setMovementMethod(new ScrollingMovementMethod());
		
		ff.setText(id);
		
		
		
	}

	
}
