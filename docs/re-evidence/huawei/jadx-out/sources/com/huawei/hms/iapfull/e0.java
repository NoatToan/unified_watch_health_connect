package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebPurchaseInfoResp;
import com.huawei.hms.iapfull.network.model.WebBaseResponse;

/* JADX INFO: loaded from: classes34.dex */
public class e0 implements com.huawei.hms.iapfull.network.h<WebPurchaseInfoResp> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m1 f13656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13657b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13657b.execute(new d0(this, (WebPurchaseInfoResp) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebPurchaseInfoResultCallback", "WebPurchaseInfoResultCallback request failure...");
            e0.this.f13656a.a(30005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13657b.execute(new a());
    }

    public e0(m1 m1Var) {
        this.f13656a = m1Var;
    }
}
