package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.network.model.QueryWithholdResultResponse;

/* JADX INFO: loaded from: classes34.dex */
class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ QueryWithholdResultResponse f13680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f13681b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("QueryWithholdCallback", "queryWithhold success");
        this.f13681b.f13684a.a(this.f13680a);
    }

    i(j jVar, QueryWithholdResultResponse queryWithholdResultResponse) {
        this.f13681b = jVar;
        this.f13680a = queryWithholdResultResponse;
    }
}
