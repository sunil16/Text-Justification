package com.example.sunil.justify2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.activity_main);

        String htmlText = " %s ";
        String myData = "Hello World! This tutorial is to show demo of displaying text with justify alignment in WebView.";

        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.loadData(String.format(htmlText, myData), "text/html", "utf-8");*/
        setContentView(R.layout.activity_main);

        WebView view = new WebView(this);
        view.setVerticalScrollBarEnabled(false);

        ((RelativeLayout)findViewById(R.id.rl)).addView(view);

        view.loadData(getString(R.string.app_name), "text/html; charset=utf-8", "utf-8");
    }
}
