package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebOrderResp;

/* JADX INFO: loaded from: classes34.dex */
class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebOrderResp f13767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f13768b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("WebOrderDetailResultCallback", "WebOrderDetailResultCallback request success...");
        this.f13768b.f13770a.a(this.f13767a);
    }

    t(u uVar, WebOrderResp webOrderResp) {
        this.f13768b = uVar;
        this.f13767a = webOrderResp;
    }
}
