package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    public final static String TAG="tag";
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.e(TAG,"执行生命周期函数：===FirstActivity onCreate()===");
        setContentView(R.layout.firstactivity_layout);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(in);
            }
        });

    }

    protected void onActivityResult(int requestCode,int resultCode,@Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        Log.e(TAG,"data=val1+val2="+data.getStringExtra("back"));
    }

    public void onStart(){
        super.onStart();
        Log.e(TAG,"执行生命周期函数：===FirstActivity onSatrt()===");
    }

    public void onResume(){
        super.onResume();
        Log.e(TAG,"执行生命周期函数：===FirstActivity onResume()===");
    }

    public void onPause(){
        super.onPause();
        Log.e(TAG,"执行生命周期函数：===FirstActivity onPause()===");
    }

    public void onStop(){
        super.onStop();
        Log.e(TAG,"执行生命周期函数：===FirstActivity onStop()===");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"执行生命周期函数：===FirstActivity onDestroy()===");
    }



}

