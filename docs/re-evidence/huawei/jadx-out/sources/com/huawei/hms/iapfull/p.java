package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebIsEnvReadyResponse;
import com.huawei.hms.iapfull.network.model.WebBaseResponse;

/* JADX INFO: loaded from: classes34.dex */
public class p implements com.huawei.hms.iapfull.network.h<WebIsEnvReadyResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h1 f13720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13721b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13721b.execute(new o(this, (WebIsEnvReadyResponse) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebIsEnvReadyResultCallback", "onFailure request failure...");
            p.this.f13720a.a(60005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13721b.execute(new a());
    }

    public p(h1 h1Var) {
        this.f13720a = h1Var;
    }
}
