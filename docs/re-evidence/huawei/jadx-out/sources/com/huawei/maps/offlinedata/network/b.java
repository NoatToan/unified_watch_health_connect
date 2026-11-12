package com.huawei.maps.offlinedata.network;

import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b extends Callback {
    protected d a() {
        d dVar = new d();
        dVar.setReturnCode("-1000");
        return dVar;
    }

    public abstract void a(int i, d dVar, String str);

    public abstract void a(d dVar);

    @Override // com.huawei.hms.network.httpclient.Callback
    public void onFailure(Submit submit, Throwable th) {
        a(a(th), a(), th.getMessage());
    }

    @Override // com.huawei.hms.network.httpclient.Callback
    public void onResponse(Submit submit, Response response) {
        if (response.isOK()) {
            a((d) response.getBody());
        } else {
            a(response.getCode(), (d) response.getBody(), "data.getMessage()");
        }
    }

    private int a(Throwable th) {
        if (IOException.class.equals(th.getClass())) {
            return -2;
        }
        return NullPointerException.class.equals(th.getClass()) ? -3 : -1;
    }
}
