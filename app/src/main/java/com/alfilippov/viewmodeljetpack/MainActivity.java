package com.alfilippov.viewmodeljetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

import com.alfilippov.viewmodeljetpack.ViewModel.ChronometerViewModel;

/**
 * Tutorial AndroidJetPack
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChronometerViewModel chronometerViewModel = ViewModelProviders.of(this).
                get(ChronometerViewModel.class);
        Chronometer chronometer = findViewById(R.id.chronometer);
        if (chronometerViewModel.getmStartTime() == null) {

            long startTime = SystemClock.elapsedRealtime();
            chronometerViewModel.setmStartTime(startTime);
            chronometer.setBase(startTime);
        } else {

            chronometer.setBase(chronometerViewModel.getmStartTime());
        }

        chronometer.start();
    }
    }

