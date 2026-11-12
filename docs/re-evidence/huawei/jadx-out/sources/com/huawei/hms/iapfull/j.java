package com.huawei.hms.iapfull;

import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.iapfull.network.model.BaseResponse;
import com.huawei.hms.iapfull.network.model.QueryWithholdResultResponse;

/* JADX INFO: loaded from: classes10.dex */
public class j implements com.huawei.hms.iapfull.network.e<QueryWithholdResultResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v0 f13684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f13685b = new c1();

    @Override // com.huawei.hms.iapfull.network.e
    public void a(BaseResponse baseResponse, Headers headers) {
        this.f13685b.execute(new i(this, (QueryWithholdResultResponse) baseResponse));
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            y0.a("QueryWithholdCallback", "queryWithhold failure");
            j.this.f13684a.a("client10008", "network error");
        }

        a() {
        }
    }

    @Override // com.huawei.hms.iapfull.network.e
    public void onFailure(Throwable th) {
        this.f13685b.execute(new a());
    }

    public j(v0 v0Var) {
        this.f13684a = v0Var;
    }
}
