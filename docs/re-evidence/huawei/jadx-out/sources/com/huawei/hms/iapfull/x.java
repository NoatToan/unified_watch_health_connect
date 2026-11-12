package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.network.model.WebPayPayResponse;

/* JADX INFO: loaded from: classes34.dex */
class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebPayPayResponse f13804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f13805b;

    @Override // java.lang.Runnable
    public void run() {
        if (this.f13804a.getReturnCode() == 0) {
            y0.b("WebPayResultCallback", "WebPayResultCallback request success...");
            this.f13805b.f13809a.a(this.f13804a);
        } else {
            y0.a("WebPayResultCallback", "WebPayResultCallback request returncode failure...");
            this.f13805b.f13809a.a(this.f13804a.getReturnCode(), this.f13804a.getReturnDesc());
        }
    }

    x(y yVar, WebPayPayResponse webPayPayResponse) {
        this.f13805b = yVar;
        this.f13804a = webPayPayResponse;
    }
}
