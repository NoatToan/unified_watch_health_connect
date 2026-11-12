package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebPurchaseInfoResp;

/* JADX INFO: loaded from: classes34.dex */
class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebPurchaseInfoResp f13649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e0 f13650b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("WebPurchaseInfoResultCallback", "WebPurchaseInfoResultCallback request success...");
        this.f13650b.f13656a.a(this.f13649a);
    }

    d0(e0 e0Var, WebPurchaseInfoResp webPurchaseInfoResp) {
        this.f13650b = e0Var;
        this.f13649a = webPurchaseInfoResp;
    }
}
