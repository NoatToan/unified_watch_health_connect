package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebProductInfoResp;

/* JADX INFO: loaded from: classes34.dex */
class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebProductInfoResp f13638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c0 f13639b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("WebProductInfoResultCallback", "onResponse request success...");
        this.f13639b.f13642a.a(this.f13638a);
    }

    b0(c0 c0Var, WebProductInfoResp webProductInfoResp) {
        this.f13639b = c0Var;
        this.f13638a = webProductInfoResp;
    }
}
