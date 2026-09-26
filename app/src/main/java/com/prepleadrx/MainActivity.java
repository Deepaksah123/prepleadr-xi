package com.prepleadrx;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        WebView w = new WebView(this);
        w.setWebViewClient(new WebViewClient());
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setDatabaseEnabled(true);
        s.setAllowFileAccess(true);
        s.setBuiltInZoomControls(false);
        s.setDisplayZoomControls(false);
        w.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        w.loadUrl("file:///android_asset/MARROW_UI_FINAL.html");
        setContentView(w);
    }
    @Override public void onBackPressed() {
        WebView w = (WebView)findViewById(android.R.id.content);
        super.onBackPressed();
    }
}
