package com.unionpay;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes6.dex */
final class ad extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewJavascriptBridge f10750a;

    private ad(WebViewJavascriptBridge webViewJavascriptBridge) {
        this.f10750a = webViewJavascriptBridge;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        com.unionpay.utils.j.a("test", "onPageFinished");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.unionpay.utils.j.a("uppay", "shouldOverrideUrlLoading：" + str);
        if (this.f10750a.mAllowScheme && !TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("HTTP")) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                this.f10750a.mContext.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public /* synthetic */ ad(WebViewJavascriptBridge webViewJavascriptBridge, byte b2) {
        this(webViewJavascriptBridge);
    }
}
