package com.sogou.map.loc;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class x0 {
    private long a;
    private String b;
    private String c;

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        j0.j(jSONObject, "type", "cell");
        j0.j(jSONObject, "mcc", this.b);
        j0.j(jSONObject, "mnc", this.c);
        j0.j(jSONObject, "gainTime", Long.valueOf(this.a));
        j0.j(jSONObject, "recordTime", Long.valueOf(this.a));
        return jSONObject.toString();
    }

    public final void b(long j) {
        this.a = j;
    }

    public final void c(String str) {
        if (str == null || str.length() < 5) {
            return;
        }
        this.b = str.substring(0, 3);
        this.c = str.substring(3);
    }
}
