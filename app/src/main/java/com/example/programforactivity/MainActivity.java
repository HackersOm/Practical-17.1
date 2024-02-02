package com.example.programforactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("OnStart","Activity is started");

    }
    protected void onResume()
    {
        super.onResume();
        Log.d("OnResume","Activity is in interaction");

    }
    protected void onPause()
    {
        super.onPause();
        Log.d("OnPause","Activity is Minimized");

    }

    protected void onStop()
    {
        super.onStop();
        Log.d("OnStop","Activity get  Stop");

    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("OnDestroy","Activity get Destroyed");

    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("OnRestart","Activity is Restarted");

    }
}