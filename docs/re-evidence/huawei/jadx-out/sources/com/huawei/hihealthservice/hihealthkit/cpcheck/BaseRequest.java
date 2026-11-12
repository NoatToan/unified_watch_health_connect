package com.huawei.hihealthservice.hihealthkit.cpcheck;

import defpackage.lcx;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseRequest<T> {
    protected Map<String, Object> mParams = new HashMap(10);
    protected String mUrl;

    public lcx.a<T> getRequestParamsBuilder() {
        return new lcx.a(this.mUrl).b("GET").b(this.mParams);
    }
}
