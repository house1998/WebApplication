package com.example.and.webapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {
    WebView webViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,Activity2.class);
                startActivity(i);
                finish();
            }
        },5000);




    }

    @Override
    public void onBackPressed(){
        //super.onBackPressed();
        if(webViewMain.canGoBack()){
            webViewMain.goBack();
        }
        else{
            finish();
        }
    }
}

