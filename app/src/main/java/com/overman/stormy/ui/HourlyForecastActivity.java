package com.overman.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.overman.stormy.R;

public class HourlyForecastActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);
    }
}
