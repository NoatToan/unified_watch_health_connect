package com.sogou.map.loc;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
class e1 {
    private static final byte[] f = new byte[0];
    public final long a;
    private final byte[] b;
    public final int c;
    public int d;
    public String e;

    public e1(String str, String str2, int i) {
        this(j0.r(str), j0.z(str2), i);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        j0.j(jSONObject, "ssid", c());
        j0.j(jSONObject, "bbsid", j0.f(this.a));
        j0.j(jSONObject, FirebaseAnalytics.Param.LEVEL, Integer.valueOf(this.c));
        j0.j(jSONObject, "capabilities", this.e);
        j0.j(jSONObject, "frequency", Integer.valueOf(this.d));
        j0.j(jSONObject, "type", "wifi");
        return jSONObject;
    }

    public final byte[] b() {
        return this.b;
    }

    public final String c() {
        return new String(this.b);
    }

    private e1(long j, byte[] bArr, int i) {
        this.a = j;
        this.b = bArr == null ? f : bArr;
        this.c = i;
    }
}
