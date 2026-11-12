package com.unionpay;

/* JADX INFO: loaded from: classes6.dex */
final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f10824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10825b;
    final /* synthetic */ af c;
    final /* synthetic */ WebViewJavascriptBridge d;

    public z(WebViewJavascriptBridge webViewJavascriptBridge, ae aeVar, String str, af afVar) {
        this.d = webViewJavascriptBridge;
        this.f10824a = aeVar;
        this.f10825b = str;
        this.c = afVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ae aeVar = this.f10824a;
        if (aeVar != null) {
            aeVar.a(this.f10825b, this.c);
        }
    }
}
