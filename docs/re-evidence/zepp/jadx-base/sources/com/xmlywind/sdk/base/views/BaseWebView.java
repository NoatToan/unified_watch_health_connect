package com.xmlywind.sdk.base.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.material.badge.BadgeDrawable;
import com.google.common.net.HttpHeaders;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.utils.r;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class BaseWebView extends WebView {
    private static boolean a = false;
    private Map<String, String> b;

    public BaseWebView(Context context) {
        super(context);
        this.b = new HashMap();
        a(getSettings());
        if (a) {
            return;
        }
        a(getContext());
        a = true;
    }

    private void a(Context context) {
        if (Build.VERSION.SDK_INT == 19) {
            WebView webView = new WebView(context.getApplicationContext());
            webView.setBackgroundColor(0);
            webView.loadDataWithBaseURL(null, "", "text/html", "UTF-8", null);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.width = 1;
            layoutParams.height = 1;
            layoutParams.type = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
            layoutParams.flags = 16777240;
            layoutParams.format = -2;
            layoutParams.gravity = BadgeDrawable.TOP_START;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.addView(webView, layoutParams);
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("UTF-8");
        webSettings.setCacheMode(2);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setBlockNetworkImage(false);
        webSettings.setBlockNetworkLoads(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        }
        webSettings.setAllowFileAccess(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowContentAccess(true);
        if (i < 16) {
            webSettings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (i >= 26) {
            webSettings.setSafeBrowsingEnabled(false);
        }
        if (i >= 21) {
            webSettings.setMixedContentMode(0);
        }
    }

    public void a(boolean z) {
        WebSettings settings;
        WebSettings.PluginState pluginState;
        if (Build.VERSION.SDK_INT >= 18) {
            return;
        }
        if (z) {
            settings = getSettings();
            pluginState = WebSettings.PluginState.ON;
        } else {
            settings = getSettings();
            pluginState = WebSettings.PluginState.OFF;
        }
        settings.setPluginState(pluginState);
    }

    public void b(boolean z) {
        if (z) {
            stopLoading();
            loadUrl("");
        }
        onPause();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        SigmobLog.d(" BaseWebView destroy called ");
        r.a(this);
        removeAllViews();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        this.b.put(HttpHeaders.REFERER, "");
        loadUrl(str, this.b);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
}
