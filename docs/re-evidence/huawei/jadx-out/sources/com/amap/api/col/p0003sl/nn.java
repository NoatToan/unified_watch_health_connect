package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public class nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3229b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3230c = 0;
    public double d = 0.0d;
    public double e = 0.0d;
    public double f = 0.0d;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public boolean j = false;

    public nn(String str) {
        this.f3228a = str;
    }

    public final double a(nn nnVar) {
        if (nnVar != null) {
            return ny.a(this.e, this.d, nnVar.e, nnVar.d);
        }
        return 0.0d;
    }
}
