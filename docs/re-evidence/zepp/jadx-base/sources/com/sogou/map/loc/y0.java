package com.sogou.map.loc;

import com.huami.nfc.web.Constant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class y0 {
    private double a;
    private double b;
    private double c;
    private float d;
    private float e;
    private float f;
    private long g;
    private long h;
    private int i;
    private String j = null;

    public y0(double d, double d2, double d3, float f, long j, float f2, float f3, long j2) {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = -1.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0L;
        this.h = 0L;
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = f;
        this.g = j;
        this.f = f2;
        this.e = f3;
        this.h = j2;
    }

    public final long a() {
        return this.h;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final String d() {
        return this.j;
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        j0.j(jSONObject, Constant.KEY_LONGITUDE, Double.valueOf(this.a));
        j0.j(jSONObject, Constant.KEY_LATITUDE, Double.valueOf(this.b));
        j0.j(jSONObject, "altitude", Double.valueOf(this.c));
        j0.j(jSONObject, "accuracy", Float.valueOf(this.d));
        j0.j(jSONObject, "speed", Float.valueOf(this.f));
        j0.j(jSONObject, "bearing", Float.valueOf(this.e));
        j0.j(jSONObject, "gpsTime", Long.valueOf(this.g));
        j0.j(jSONObject, "gainTime", Long.valueOf(this.h));
        j0.j(jSONObject, "recordTime", Long.valueOf(this.h));
        j0.j(jSONObject, "wifiState", Integer.valueOf(this.i));
        j0.j(jSONObject, "type", this.j);
        return jSONObject.toString();
    }
}
