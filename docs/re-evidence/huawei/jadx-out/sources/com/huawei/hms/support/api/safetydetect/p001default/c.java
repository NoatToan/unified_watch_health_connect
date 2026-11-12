package com.huawei.hms.support.api.safetydetect.p001default;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16560a;

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.f16560a);
        } catch (JSONException e) {
            Log.e("AntiFraudRequest", "Json conversion exception! " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public c(String str) {
        this.f16560a = str;
    }
}
