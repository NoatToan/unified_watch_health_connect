package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebConsumeOwnedPurchaseResponse;

/* JADX INFO: loaded from: classes34.dex */
class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebConsumeOwnedPurchaseResponse f13694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f13695b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("WebConsumeOwnedPurchaseResultCallback", "onResponse request success...");
        this.f13695b.f13702a.a(this.f13694a);
    }

    m(n nVar, WebConsumeOwnedPurchaseResponse webConsumeOwnedPurchaseResponse) {
        this.f13695b = nVar;
        this.f13694a = webConsumeOwnedPurchaseResponse;
    }
}
