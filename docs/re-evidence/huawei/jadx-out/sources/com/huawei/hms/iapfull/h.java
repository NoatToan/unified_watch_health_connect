package com.huawei.hms.iapfull;

import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.iapfull.network.model.BaseResponse;
import com.huawei.hms.iapfull.network.model.QueryOrderResponse;

/* JADX INFO: loaded from: classes10.dex */
public class h implements com.huawei.hms.iapfull.network.e<QueryOrderResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u0 f13675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13676b = new c1();

    @Override // com.huawei.hms.iapfull.network.e
    public void a(BaseResponse baseResponse, Headers headers) {
        this.f13676b.execute(new g(this, (QueryOrderResponse) baseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("QueryOrderCallback", "queryOrder failure");
            h.this.f13675a.a("30005", "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.e
    public void onFailure(Throwable th) {
        this.f13676b.execute(new a());
    }

    public h(u0 u0Var) {
        this.f13675a = u0Var;
    }
}
