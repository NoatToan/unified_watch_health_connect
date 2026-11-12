package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.network.model.QueryOrderResponse;

/* JADX INFO: loaded from: classes34.dex */
class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ QueryOrderResponse f13667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13668b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("QueryOrderCallback", "queryOrder success");
        this.f13668b.f13675a.a(this.f13667a);
    }

    g(h hVar, QueryOrderResponse queryOrderResponse) {
        this.f13668b = hVar;
        this.f13667a = queryOrderResponse;
    }
}
