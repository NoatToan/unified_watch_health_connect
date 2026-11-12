package com.huawei.hianalytics;

import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11578c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public int i;
    public String j;
    public final long k;
    public final ArrayList l;

    public l1() {
        this.f11576a = "";
        this.f11577b = "";
        this.f11578c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = 0L;
        this.h = 0L;
        this.i = 0;
        this.j = "";
        this.k = 0L;
        this.l = new ArrayList();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("item_id", this.f11577b);
        jSONObject.put("mc_title", this.f11578c);
        jSONObject.put("mc_artist", this.d);
        jSONObject.put("mc_album", this.f);
        jSONObject.put("mc_duration", this.e);
        jSONObject.put("play_start_time", this.g);
        jSONObject.put("play_duration", this.h);
        jSONObject.put("favorite_state", this.i);
        jSONObject.put("package_name", this.j);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f11577b, ((l1) obj).f11577b);
    }

    public final int hashCode() {
        return Objects.hash(this.f11577b);
    }

    public l1(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f11576a = jSONObject.optString("_id", "");
        this.f11577b = jSONObject.optString("item_id", "");
        this.f11578c = jSONObject.optString("mc_title", "");
        this.d = jSONObject.optString("mc_artist", "");
        this.f = jSONObject.optString("mc_album", "");
        this.e = jSONObject.optString("mc_duration", "");
        this.g = jSONObject.optLong("play_start_time", 0L);
        this.h = jSONObject.optLong("play_duration", 0L);
        this.i = jSONObject.optInt("favorite_state", 0);
        this.j = jSONObject.optString("package_name", "");
        this.k = jSONObject.optLong("event_time", 0L);
        this.l = new ArrayList();
    }
}
