package com.foodfate.swamphacks18.www.foodfate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleformat = new SimpleDateFormat("ss");

        String firstTime = simpleformat.format(calendar.getTime());
        int ftime = Integer.parseInt(firstTime);
        while(true) {
            String currentTime = simpleformat.format(calendar.getTime());
            int ctime = Integer.parseInt(currentTime);
            if (ctime-ftime>3 || ftime-ctime>3) break;
        }

        Intent toWheel = new Intent(this, WheelofFood.class);
        startActivity(toWheel);
    }
}
