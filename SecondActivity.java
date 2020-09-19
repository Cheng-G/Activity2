package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    public final static String TAG="tag";
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"执行生命周期函数：===SecondActivity onCreate()===");
        setContentView(R.layout.secondactivity_layout);
        Intent in = getIntent();


    }

    public void onStart(){
        super.onStart();
        Log.e(TAG,"执行生命周期函数：===SecondActivity onSatrt()===");
    }

    public void onResume(){
        super.onResume();
        Log.e(TAG,"执行生命周期函数：===SecondActivity onResume()===");
    }

    public void onPause(){
        super.onPause();
        Log.e(TAG,"执行生命周期函数：===SecondActivity onPause()===");
    }

    public void onStop(){
        super.onStop();
        Log.e(TAG,"执行生命周期函数：===SecondActivity onStop()===");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"执行生命周期函数：===SecondActivity onDestroy()===");
    }


}

