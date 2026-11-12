package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.network.model.AliPaySignResponse;

/* JADX INFO: loaded from: classes34.dex */
class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AliPaySignResponse f13654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f13655b;

    @Override // java.lang.Runnable
    public void run() {
        this.f13655b.f13661a.a(this.f13654a);
    }

    e(f fVar, AliPaySignResponse aliPaySignResponse) {
        this.f13655b = fVar;
        this.f13654a = aliPaySignResponse;
    }
}
