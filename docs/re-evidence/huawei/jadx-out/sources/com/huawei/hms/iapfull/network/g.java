package com.huawei.hms.iapfull.network;

import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.iapfull.network.model.WebBaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public class g<T extends WebBaseResponse> implements ResultCallback<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h<T> f13716a;

    @Override // com.huawei.hms.framework.network.restclient.ResultCallback
    public void onResponse(Response<T> response) {
        if (response.getBody() != null) {
            this.f13716a.a(response.getBody());
            return;
        }
        this.f13716a.onFailure(new Throwable("code:" + response.getCode()));
    }

    @Override // com.huawei.hms.framework.network.restclient.ResultCallback
    public void onFailure(Throwable th) {
        this.f13716a.onFailure(th);
    }

    public g(h<T> hVar) {
        this.f13716a = hVar;
    }
}
