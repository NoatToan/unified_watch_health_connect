package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebObtainOwnedPurchasesResponse;

/* JADX INFO: loaded from: classes34.dex */
class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebObtainOwnedPurchasesResponse f13762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f13763b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("WebObtainOwnedPurchasesResultCallback", "onResponse request success...");
        this.f13763b.f13764a.a(this.f13762a);
    }

    q(s sVar, WebObtainOwnedPurchasesResponse webObtainOwnedPurchasesResponse) {
        this.f13763b = sVar;
        this.f13762a = webObtainOwnedPurchasesResponse;
    }
}
