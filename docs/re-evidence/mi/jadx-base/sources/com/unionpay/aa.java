package com.unionpay;

/* JADX INFO: loaded from: classes6.dex */
final class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f10745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ WebViewJavascriptBridge f10746b;

    public aa(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.f10746b = webViewJavascriptBridge;
        this.f10745a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10746b.mWebView.loadUrl(this.f10745a);
    }
}
