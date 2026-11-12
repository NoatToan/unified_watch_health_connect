package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebObtainOwnedPurchasesResponse;
import com.huawei.hms.iapfull.network.model.WebBaseResponse;

/* JADX INFO: loaded from: classes34.dex */
public class s implements com.huawei.hms.iapfull.network.h<WebObtainOwnedPurchasesResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i1 f13764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13765b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13765b.execute(new q(this, (WebObtainOwnedPurchasesResponse) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebObtainOwnedPurchasesResultCallback", "onFailure request failure...");
            s.this.f13764a.a(60005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13765b.execute(new a());
    }

    public s(i1 i1Var) {
        this.f13764a = i1Var;
    }
}
