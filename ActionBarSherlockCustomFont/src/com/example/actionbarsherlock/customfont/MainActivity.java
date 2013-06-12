package com.example.actionbarsherlock.customfont;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		ActionBar abs = getSupportActionBar();
		abs.setDisplayShowTitleEnabled(true);
		abs.setDisplayUseLogoEnabled(false);
		abs.setDisplayShowHomeEnabled(false);
		abs.setDisplayHomeAsUpEnabled(true);
		abs.setHomeButtonEnabled(true); // if SDK >= 14 default is FALSE will can't click home button, So set to TRUE for clickable
		abs.setTitle("Hello world");
		
		int titleId = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
		if(titleId == 0)
		    titleId = R.id.abs__action_bar_title;

		TextView mAppName = (TextView) findViewById(titleId);
		mAppName.setTextSize(26);
		mAppName.setTextColor(Color.BLACK);
		Typeface face = Typeface.createFromAsset(getAssets(),"fonts/museo.ttf");
		mAppName.setTypeface(face);
	}

	
}
