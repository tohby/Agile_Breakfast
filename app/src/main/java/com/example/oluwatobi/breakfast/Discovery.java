package com.example.oluwatobi.breakfast;

/**
 * Created by oluwatobi on 3/19/2018.
 */
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Discovery extends Fragment{

    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.discovery, container, false);
        final WebView webView = (WebView) rootView.findViewById(R.id.thucwebview);
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
        webView.loadUrl("https://hocvienagile.com/agipedia-index/");
        return rootView;
    }

}
