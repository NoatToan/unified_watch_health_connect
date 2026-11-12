package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.network.model.DeveloperSignResponse;

/* JADX INFO: loaded from: classes34.dex */
class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DeveloperSignResponse f13640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f13641b;

    @Override // java.lang.Runnable
    public void run() {
        if ("0".equals(this.f13640a.getReturnCode())) {
            y0.b("DeveloperSignCallback", "request success...");
            this.f13641b.f13646a.a(this.f13640a);
        } else {
            this.f13641b.f13646a.a(this.f13640a.getReturnCode(), this.f13640a.getReturnDesc());
        }
    }

    c(d dVar, DeveloperSignResponse developerSignResponse) {
        this.f13641b = dVar;
        this.f13640a = developerSignResponse;
    }
}
