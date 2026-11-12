package com.huawei.hms.iapfull.network;

import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.iapfull.network.model.BaseResponse;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
public class a<T extends BaseResponse> implements ResultCallback<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e<T> f13708a;

    @Override // com.huawei.hms.framework.network.restclient.ResultCallback
    public void onResponse(Response<T> response) {
        if (response.getBody() != null) {
            this.f13708a.a(response.getBody(), response.getHeaders());
            return;
        }
        y0.a("Callback", "Callback onResponse response body is null");
        this.f13708a.onFailure(new Throwable("code:" + response.getCode()));
    }

    @Override // com.huawei.hms.framework.network.restclient.ResultCallback
    public void onFailure(Throwable th) {
        y0.a("Callback", "throwable.getMessage: " + th.getMessage());
        this.f13708a.onFailure(th);
    }

    public a(e<T> eVar) {
        this.f13708a = eVar;
    }
}
