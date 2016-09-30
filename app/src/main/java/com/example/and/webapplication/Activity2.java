package com.example.and.webapplication;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Activity2 extends AppCompatActivity {

    Intent intent1;
    // WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com/"));
        startActivity(intent1);
        //
        //webView = (WebView)findViewById(R.id.webView);
        // webView.getSettings().setJavaScriptEnabled(true);
        // intent1 = new Intent(Intent.ACTION_VIEW,webView.loadUrl("http://m.naver.com"));
        // webView.loadUrl("http://m.naver.com");
    }
}
