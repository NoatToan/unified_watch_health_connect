package com.unionpay;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

/* JADX INFO: loaded from: classes6.dex */
final class ac extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewJavascriptBridge f10749a;

    private ac(WebViewJavascriptBridge webViewJavascriptBridge) {
        this.f10749a = webViewJavascriptBridge;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.cancel();
        Toast.makeText(this.f10749a.mContext, str2, 0).show();
        return true;
    }

    public /* synthetic */ ac(WebViewJavascriptBridge webViewJavascriptBridge, byte b2) {
        this(webViewJavascriptBridge);
    }
}
