package com.hyanuun.helloapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method untuk menampilkan log
    private void showLog(String text){
        Log.d(getPackageName(), text);
    }

    @Override
    protected void onStart(){
        super.onStart();
        showLog("Activity started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        showLog("Activity resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        showLog("Activity pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        showLog("Activity stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        showLog("Activity is being destroyed");
    }

}