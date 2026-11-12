package com.huawei.hms.hwid;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b extends am {
    public static b a(String str) throws JSONException {
        return new b().a(new JSONObject(str));
    }

    protected b a(JSONObject jSONObject) {
        this.f13548a = jSONObject.optString("appId", null);
        this.f13549b = jSONObject.optString("packageName", null);
        this.f13550c = jSONObject.optLong("hmsSdkVersion");
        this.d = jSONObject.optString("subAppId", null);
        return this;
    }
}
