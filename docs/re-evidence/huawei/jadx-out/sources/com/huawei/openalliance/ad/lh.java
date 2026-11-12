package com.huawei.openalliance.ad;

import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class lh<R> extends lc<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<R> f19450a;

    @Override // com.huawei.openalliance.ad.lc
    protected R a(String str) throws JSONException {
        try {
            return (R) com.huawei.openalliance.ad.utils.bk.a(str, this.f19450a, new Class[0]);
        } catch (JSONException e) {
            hw.c("JsonObjDataConverter", "convertStringToData json JSONException");
            throw e;
        }
    }

    public lh(Class<R> cls) {
        this.f19450a = cls;
    }
}
