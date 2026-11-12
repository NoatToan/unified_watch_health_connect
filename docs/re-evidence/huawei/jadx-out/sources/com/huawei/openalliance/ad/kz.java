package com.huawei.openalliance.ad;

import android.content.Context;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class kz extends kx<Object> {
    @Override // com.huawei.openalliance.ad.kx
    protected String a(Object obj) throws JSONException {
        if (obj == null) {
            return "";
        }
        try {
            return com.huawei.openalliance.ad.utils.bk.a(obj);
        } catch (JSONException e) {
            hw.c("JsonBeanConverter", "convert json JSONException!");
            throw e;
        }
    }

    @Override // com.huawei.openalliance.ad.la
    public String a() {
        return "application/json";
    }

    public kz(Context context) {
        super(context);
    }
}
