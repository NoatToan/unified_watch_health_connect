package com.huawei.hianalytics;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11584c;
    public final long d;
    public final String e;

    public m1(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f11582a = jSONObject.optString("_id", "");
        this.f11583b = jSONObject.optString("item_id", "");
        this.f11584c = jSONObject.optString("metric_tag", "");
        this.d = jSONObject.optLong("event_time", 0L);
        this.e = jSONObject.optString("content_code", "");
    }
}
