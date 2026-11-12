package com.huawei.hms.hwid;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13545a;

    public af() {
    }

    public af(String str) {
        this.f13545a = str;
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", this.f13545a);
            return jSONObject.toString();
        } catch (JSONException unused) {
            ar.d("ReadSmsInputBean", "toJson failed", true);
            return null;
        }
    }
}
