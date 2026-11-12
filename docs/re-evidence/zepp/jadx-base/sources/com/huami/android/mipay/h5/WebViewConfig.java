package com.huami.android.mipay.h5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\t"}, d2 = {"Landroid/webkit/WebView;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "setDefaultSetting", "Landroid/webkit/WebSettings;", "setDefaultConfig", "setAppCached", "configureDOMStorage", "mipay-h5_release"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "WebViewConfig")
public final class WebViewConfig {
    public static final void configureDOMStorage(@NotNull WebSettings webSettings, @NotNull Context context) {
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDatabasePath(context.getDir("database", 0).getPath());
    }

    public static final void setAppCached(@NotNull WebSettings webSettings, @NotNull Context context) {
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCachePath(context.getDir("cache", 0).getPath());
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void setDefaultConfig(@NotNull WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setCacheMode(-1);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(2);
        }
    }

    public static final void setDefaultSetting(@NotNull WebView webView, @NotNull Context context) {
        setDefaultConfig(webView.getSettings());
        setAppCached(webView.getSettings(), context);
        configureDOMStorage(webView.getSettings(), context);
    }
}
