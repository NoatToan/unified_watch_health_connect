package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebConsumeOwnedPurchaseResponse;
import com.huawei.hms.iapfull.network.model.WebBaseResponse;

/* JADX INFO: loaded from: classes34.dex */
public class n implements com.huawei.hms.iapfull.network.h<WebConsumeOwnedPurchaseResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g1 f13702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13703b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13703b.execute(new m(this, (WebConsumeOwnedPurchaseResponse) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebConsumeOwnedPurchaseResultCallback", "onFailure request failure...");
            n.this.f13702a.a(60005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13703b.execute(new a());
    }

    public n(g1 g1Var) {
        this.f13702a = g1Var;
    }
}
