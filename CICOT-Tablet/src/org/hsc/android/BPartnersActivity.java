package org.hsc.android;

import java.util.List;



import org.hsc.model.Auditor;
import org.hsc.model.BPartner;
import org.hsc.model.Checklist;
import org.hsc.model.Item;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

public class BPartnersActivity extends ListActivity {
	private MyAndroidApp myapp;
	private String tag = this.getClass().getName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		myapp = MyAndroidApp.getApp(this);
//		List<BPartner> bpartners = myapp.getAllBPartners();
//        ArrayAdapter<BPartner> adapter = new ArrayAdapter<BPartner>(this, android.R.layout.simple_list_item_1,bpartners);
//        setListAdapter(adapter);
	}

}
