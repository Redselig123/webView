package com.example.webview.configWebView

import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.webview.R

class WebViewConfig : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val web_view = findViewById<WebView>(R.id.web_view_id)
        web_view.webViewClient = WebViewClient()
        web_view.settings.apply {
            javaScriptEnabled = true
            setSupportZoom(true)
            builtInZoomControls = true
            displayZoomControls = false
        }
        web_view.loadUrl("https://www.reddit.com/r/pics/comments/1hvpj1m/symmetrical_bald_eagle_gliding_over_water/#lightbox")
    }
}