package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebProductInfoResp;
import com.huawei.hms.iapfull.network.model.WebBaseResponse;

/* JADX INFO: loaded from: classes34.dex */
public class c0 implements com.huawei.hms.iapfull.network.h<WebProductInfoResp> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l1 f13642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13643b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13643b.execute(new b0(this, (WebProductInfoResp) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebProductInfoResultCallback", "onFailure request failure...");
            c0.this.f13642a.a(60005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13643b.execute(new a());
    }

    public c0(l1 l1Var) {
        this.f13642a = l1Var;
    }
}
