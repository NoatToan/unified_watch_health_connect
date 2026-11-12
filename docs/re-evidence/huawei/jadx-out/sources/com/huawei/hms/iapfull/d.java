package com.huawei.hms.iapfull;

import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.iapfull.network.model.BaseResponse;
import com.huawei.hms.iapfull.network.model.DeveloperSignResponse;

/* JADX INFO: loaded from: classes10.dex */
public class d implements com.huawei.hms.iapfull.network.e<DeveloperSignResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q0 f13646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13647b = new c1();

    @Override // com.huawei.hms.iapfull.network.e
    public void a(BaseResponse baseResponse, Headers headers) {
        this.f13647b.execute(new c(this, (DeveloperSignResponse) baseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("DeveloperSignCallback", "request failure...");
            d.this.f13646a.a("30005", "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.e
    public void onFailure(Throwable th) {
        this.f13647b.execute(new a());
    }

    public d(q0 q0Var) {
        this.f13646a = q0Var;
    }
}
