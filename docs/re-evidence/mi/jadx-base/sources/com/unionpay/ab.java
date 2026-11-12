package com.unionpay;

/* JADX INFO: loaded from: classes6.dex */
final class ab implements af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewJavascriptBridge f10747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10748b;

    public ab(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.f10747a = webViewJavascriptBridge;
        this.f10748b = str;
    }

    @Override // com.unionpay.af
    public final void a(String str) {
        this.f10747a._callbackJs(this.f10748b, str);
    }
}
