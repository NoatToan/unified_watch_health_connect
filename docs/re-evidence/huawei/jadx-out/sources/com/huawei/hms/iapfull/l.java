package com.huawei.hms.iapfull;

import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.iapfull.network.model.BaseResponse;
import com.huawei.hms.iapfull.network.model.ReportPayResultResponse;

/* JADX INFO: loaded from: classes34.dex */
public class l implements com.huawei.hms.iapfull.network.e<ReportPayResultResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s0 f13691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13692b = new c1();

    @Override // com.huawei.hms.iapfull.network.e
    public void a(BaseResponse baseResponse, Headers headers) {
        this.f13692b.execute(new k(this, (ReportPayResultResponse) baseResponse, headers));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("ReportPayResutCallback", "request failure...");
            l.this.f13691a.a("30005", "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.e
    public void onFailure(Throwable th) {
        this.f13692b.execute(new a());
    }

    public l(s0 s0Var) {
        this.f13691a = s0Var;
    }
}
