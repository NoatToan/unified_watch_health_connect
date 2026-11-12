package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.network.model.WebBaseResponse;
import com.huawei.hms.iapfull.network.model.WebPayPayResponse;

/* JADX INFO: loaded from: classes10.dex */
public class y implements com.huawei.hms.iapfull.network.h<WebPayPayResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n1 f13809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13810b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13810b.execute(new x(this, (WebPayPayResponse) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebPayResultCallback", "WebPayResultCallback request failure...");
            y.this.f13809a.a(30005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13810b.execute(new a());
    }

    public y(n1 n1Var) {
        this.f13809a = n1Var;
    }
}
