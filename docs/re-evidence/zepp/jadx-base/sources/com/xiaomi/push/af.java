package com.xiaomi.push;

import com.twitter.sdk.android.core.identity.AuthHandler;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class af {
    private int a;
    private long b;
    private long c;
    private String d;
    private long e;

    public af() {
        this(0, 0L, 0L, null);
    }

    public af(int i, long j, long j2, Exception exc) {
        this.a = i;
        this.b = j;
        this.e = j2;
        this.c = System.currentTimeMillis();
        if (exc != null) {
            this.d = exc.getClass().getSimpleName();
        }
    }

    public int a() {
        return this.a;
    }

    public af a(JSONObject jSONObject) {
        this.b = jSONObject.getLong(HMFwOnlineAnalyticsKt.COST);
        this.e = jSONObject.getLong("size");
        this.c = jSONObject.getLong(AuthHandler.d);
        this.a = jSONObject.getInt("wt");
        this.d = jSONObject.optString("expt");
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public JSONObject m3490a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HMFwOnlineAnalyticsKt.COST, this.b);
        jSONObject.put("size", this.e);
        jSONObject.put(AuthHandler.d, this.c);
        jSONObject.put("wt", this.a);
        jSONObject.put("expt", this.d);
        return jSONObject;
    }
}
