package com.example.oluwatobi.breakfast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by oluwatobi on 3/19/2018.
 */

public class Resources extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.resources, container, false);
        final WebView webView = (android.webkit.WebView) rootView.findViewById(R.id.resourcewebview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url){
                webView.loadUrl("javascript:(function() { " +
                        "document.getElementsByTagName('header')[0].style.display=\"none\"; " +
                        "document.getElementById('footer').style.display= \"none\"; " +
                        "})()");
            }
        });
        webView.loadUrl("https://hocvienagile.com/tai-nguyen/");
        return rootView;
    }
}
