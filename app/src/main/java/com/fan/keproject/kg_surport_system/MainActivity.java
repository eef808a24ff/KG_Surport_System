package com.fan.keproject.kg_surport_system;

//import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.wv);

//        webView.loadUrl("http://www.baidu.com");

        Log.e("start", "wait");
        get();

    }

    public void get(){

        new Thread(){
            @Override
            public void run() {
                FindByName finder = new FindByName();
//                webView.loadUrl("http://www.baidu.com");
                String cot = finder.findMovie("12 Monkeys");
                Log.e("erro", cot);
            }
        }.start();

    }

}
