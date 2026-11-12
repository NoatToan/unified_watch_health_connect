package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebIsEnvReadyResponse;

/* JADX INFO: loaded from: classes34.dex */
class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebIsEnvReadyResponse f13717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f13718b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("WebIsEnvReadyResultCallback", "onResponse request success...");
        this.f13718b.f13720a.a(this.f13717a);
    }

    o(p pVar, WebIsEnvReadyResponse webIsEnvReadyResponse) {
        this.f13718b = pVar;
        this.f13717a = webIsEnvReadyResponse;
    }
}
