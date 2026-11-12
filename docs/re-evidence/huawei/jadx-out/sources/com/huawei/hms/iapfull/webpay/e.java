package com.huawei.hms.iapfull.webpay;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes10.dex */
class e extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewActivity f13790a;

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        if (i == 100) {
            this.f13790a.f13779b.setVisibility(8);
        } else {
            this.f13790a.f13779b.setVisibility(0);
            this.f13790a.f13779b.setProgress(i);
        }
        super.onProgressChanged(webView, i);
    }

    e(WebViewActivity webViewActivity) {
        this.f13790a = webViewActivity;
    }
}
