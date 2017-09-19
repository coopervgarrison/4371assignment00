package com.example.cooper.assignment00;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("cTAG", "onCreate() was called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("sTAG", "onStart() was called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("rTAG", "onResume() was called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("pTAG", "onPause() was called");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.i("rsTAG", "onRestart() was called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("spTAG", "onStop() was called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("dTAG", "onDestroy() was called");
    }
}
