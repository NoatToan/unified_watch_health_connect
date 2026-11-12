package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebProductDetailResponse;

/* JADX INFO: loaded from: classes34.dex */
class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebProductDetailResponse f13812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a0 f13813b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("WebProductDetailCallback", "WebProductDetailResultCallback request success...");
        this.f13813b.f13635a.a(this.f13812a);
    }

    z(a0 a0Var, WebProductDetailResponse webProductDetailResponse) {
        this.f13813b = a0Var;
        this.f13812a = webProductDetailResponse;
    }
}
