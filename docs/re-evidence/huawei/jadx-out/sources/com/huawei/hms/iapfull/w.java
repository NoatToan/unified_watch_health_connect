package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.network.model.WebBaseResponse;
import com.huawei.hms.iapfull.network.model.WebPayPayResponse;

/* JADX INFO: loaded from: classes10.dex */
public class w implements com.huawei.hms.iapfull.network.h<WebPayPayResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n1 f13775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13776b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13776b.execute(new v(this, (WebPayPayResponse) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebPayCreatePurchaseCallback", "onFailure request failure...");
            w.this.f13775a.a(60005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13776b.execute(new a());
    }

    public w(n1 n1Var) {
        this.f13775a = n1Var;
    }
}
