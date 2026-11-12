package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebProductDetailResponse;
import com.huawei.hms.iapfull.network.model.WebBaseResponse;

/* JADX INFO: loaded from: classes34.dex */
public class a0 implements com.huawei.hms.iapfull.network.h<WebProductDetailResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k1 f13635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13636b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13636b.execute(new z(this, (WebProductDetailResponse) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebProductDetailCallback", "WebProductDetailResultCallback request failure...");
            a0.this.f13635a.a(30005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13636b.execute(new a());
    }

    public a0(k1 k1Var) {
        this.f13635a = k1Var;
    }
}
