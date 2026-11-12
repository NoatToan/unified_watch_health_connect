package com.huawei.hwcloudjs;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes10.dex */
final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f17062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f17063b;

    @Override // java.lang.Runnable
    public void run() {
        this.f17062a.getSettings().setSavePassword(false);
        this.f17062a.loadUrl(this.f17063b);
    }

    d(WebView webView, String str) {
        this.f17062a = webView;
        this.f17063b = str;
    }
}
