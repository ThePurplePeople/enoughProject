package com.thepurplepeople.android.enough;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import com.thepurplepeople.android.enough.adapter.DefaultAdapter;
import com.thepurplepeople.android.enough.util.DummyContent;
import com.thepurplepeople.android.enough.view.pzv.PullToZoomListViewEx;

public class ParallaxActivity extends ActionBarActivity {
	
	public static final String TAG = "Parallax";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_parallax);
		
		PullToZoomListViewEx listView = (PullToZoomListViewEx) findViewById(R.id.list_view);
		//listView.setZoomEnabled(true);
		//listView.setParallax(true);
		//listView.showHeadView();
		listView.setAdapter(new DefaultAdapter(this, DummyContent.getDummyModelList(), false));
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
