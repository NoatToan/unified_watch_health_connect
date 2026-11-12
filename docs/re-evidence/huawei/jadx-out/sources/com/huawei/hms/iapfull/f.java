package com.huawei.hms.iapfull;

import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.iapfull.network.model.AliPaySignResponse;
import com.huawei.hms.iapfull.network.model.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public class f implements com.huawei.hms.iapfull.network.e<AliPaySignResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r0 f13661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13662b = new c1();

    @Override // com.huawei.hms.iapfull.network.e
    public void a(BaseResponse baseResponse, Headers headers) {
        this.f13662b.execute(new e(this, (AliPaySignResponse) baseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("PaySignCallback", "request failure...");
            f.this.f13661a.a("30005", "request failed");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.e
    public void onFailure(Throwable th) {
        this.f13662b.execute(new a());
    }

    public f(r0 r0Var) {
        this.f13661a = r0Var;
    }
}
