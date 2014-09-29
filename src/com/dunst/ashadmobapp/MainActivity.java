package com.dunst.ashadmobapp;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        AdView adview = (AdView) this.findViewById(R.id.adView);
        AdRequest ar = new AdRequest.Builder().build();
        adview.loadAd(ar);
    }
}
