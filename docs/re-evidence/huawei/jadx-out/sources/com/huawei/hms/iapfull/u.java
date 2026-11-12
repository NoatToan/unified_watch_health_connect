package com.huawei.hms.iapfull;

import com.huawei.hms.iapfull.bean.WebOrderResp;
import com.huawei.hms.iapfull.network.model.WebBaseResponse;

/* JADX INFO: loaded from: classes34.dex */
public class u implements com.huawei.hms.iapfull.network.h<WebOrderResp> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j1 f13770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13771b = new c1();

    @Override // com.huawei.hms.iapfull.network.h
    public void a(WebBaseResponse webBaseResponse) {
        this.f13771b.execute(new t(this, (WebOrderResp) webBaseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("WebOrderDetailResultCallback", "WebOrderDetailResultCallback request failure...");
            u.this.f13770a.a(30005, "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.h
    public void onFailure(Throwable th) {
        this.f13771b.execute(new a());
    }

    public u(j1 j1Var) {
        this.f13770a = j1Var;
    }
}
