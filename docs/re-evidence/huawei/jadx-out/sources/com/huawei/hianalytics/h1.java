package com.huawei.hianalytics;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11546c;
    public final String d;

    public h1(String str, long j, long j2, String str2) {
        this.f11544a = str;
        this.f11545b = j;
        this.f11546c = j2;
        this.d = str2;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strA = d2.a(this.f11544a);
        if (!TextUtils.isEmpty(strA)) {
            strA = new StringBuilder(strA).reverse().toString();
        }
        jSONObject.put("label", strA);
        jSONObject.put("cnt", 1);
        jSONObject.put("firstTimeStamp", this.f11545b);
        jSONObject.put("lastTimeStamp", this.f11546c);
        jSONObject.put("version", "v2");
        jSONObject.put("packageName", this.d);
        return jSONObject;
    }
}
