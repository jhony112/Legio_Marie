package com.jhony.models;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jhony.legiomaria.R;



public class OziAdapter extends ArrayAdapter {
	private LayoutInflater inflater;
	String[] heads;
	String[] bodyi;
	String hd, bd;
	int pix;

	public OziAdapter(Activity activity, String[] items, int resid) {
		super(activity, R.layout.row_pray, items);

		heads = items;
		pix = resid; // collect the image variable from the class
		inflater = activity.getWindow().getLayoutInflater();
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView = inflater.inflate(R.layout.row_pray, parent, false);

		TextView labelView = (TextView) rowView.findViewById(R.id.STitle);

		String pos = String.valueOf(position + 1);
		hd = heads[position].toString();

		// 4. Set the text for textView
		labelView.setText(hd);
		ImageView image =(ImageView) rowView.findViewById(R.id.imgdsc);
		image.setImageResource(pix); //set the image in the imageview
		// valView.setText(tweets.get(position).getDate());

		// 5. retrn rowView
		return rowView;
	}
}
