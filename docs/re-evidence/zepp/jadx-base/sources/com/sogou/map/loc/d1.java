package com.sogou.map.loc;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class d1 {
    private a1 a = null;
    private c1 b = null;
    private long c;

    public final a1 a() {
        return this.a;
    }

    public final void b(long j) {
        this.c = j;
    }

    public final void c(a1 a1Var) {
        this.a = a1Var;
    }

    public final void d(c1 c1Var) {
        this.b = c1Var;
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        j0.j(jSONObject, "recordTime", Long.valueOf(this.c));
        j0.j(jSONObject, "type", "wifi");
        a1 a1Var = this.a;
        if (a1Var != null) {
            j0.j(jSONObject, "linkedWifi", a1Var.a());
        }
        c1 c1Var = this.b;
        if (c1Var != null) {
            j0.j(jSONObject, "scanWifis", c1Var.a());
        }
        return jSONObject.toString();
    }
}
