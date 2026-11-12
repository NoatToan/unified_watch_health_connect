package com.huawei.hms.support.api.safetydetect.p001default;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class d0 extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16561a;

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.f16561a);
        } catch (JSONException e) {
            Log.e("UserDetectRequest", "Json conversion exception! " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public d0(String str) {
        this.f16561a = str;
    }
}
