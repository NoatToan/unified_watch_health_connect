package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.network.model.WebPayPayResponse;

/* JADX INFO: loaded from: classes34.dex */
class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebPayPayResponse f13773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f13774b;

    @Override // java.lang.Runnable
    public void run() {
        if (this.f13773a.getReturnCode() == 0) {
            y0.b("WebPayCreatePurchaseCallback", "onResponse request success...");
            this.f13774b.f13775a.a(this.f13773a);
        } else {
            y0.a("WebPayCreatePurchaseCallback", "onResponse request failure...");
            this.f13774b.f13775a.a(this.f13773a.getReturnCode(), this.f13773a.getErrMsg());
        }
    }

    v(w wVar, WebPayPayResponse webPayPayResponse) {
        this.f13774b = wVar;
        this.f13773a = webPayPayResponse;
    }
}
