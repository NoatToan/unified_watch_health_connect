package com.huawei.hms.support.api.safetydetect.p001default;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class b0 extends e {
    private static final String d = "b0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f16559c;

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f16557a);
            jSONObject.put("appId", this.f16558b);
            JSONArray jSONArray = new JSONArray();
            int[] iArr = this.f16559c;
            if (iArr != null) {
                for (int i : iArr) {
                    jSONArray.put(i);
                }
            }
            jSONObject.put("threatTypes", jSONArray);
        } catch (JSONException e) {
            Log.e(d, "Json conversion exception! " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public b0(String str, String str2, int... iArr) {
        this.f16557a = str;
        this.f16558b = str2;
        this.f16559c = iArr;
    }
}
