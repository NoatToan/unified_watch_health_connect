package com.huawei.hianalytics.visual;

import com.huawei.hianalytics.core.log.HiLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11698c;
    public final long d;

    public t0(String str, int i, String str2, long j) {
        this.f11696a = str;
        this.d = j;
        this.f11697b = i;
        this.f11698c = str2;
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", this.f11696a);
            jSONObject.put("time", this.d);
            jSONObject.put("id", this.f11697b);
            jSONObject.put("channelId", this.f11698c);
            return jSONObject.toString();
        } catch (JSONException unused) {
            HiLog.d("PushNotificationManager", "fail to put notification event toJson");
            return "";
        }
    }
}
