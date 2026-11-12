package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public class da {
    public String a;
    public long b = 0;
    public long c = 0;
    public double d = 0.0d;
    public double e = 0.0d;
    public double f = 0.0d;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public boolean j = false;

    public da(String str) {
        this.a = str;
    }

    public final double a(da daVar) {
        if (daVar == null) {
            return 0.0d;
        }
        double d = this.e;
        double d2 = this.d;
        double d3 = daVar.e;
        double d4 = daVar.d;
        double d5 = (((90.0d - d2) * 21412.0d) / 90.0d) + 6356725.0d;
        double dCos = ((d3 * 0.01745329238474369d) - (d * 0.01745329238474369d)) * Math.cos((3.1415927410125732d * d2) / 180.0d) * d5;
        double d6 = ((d4 * 0.01745329238474369d) - (d2 * 0.01745329238474369d)) * d5;
        return Math.pow((dCos * dCos) + (d6 * d6), 0.5d);
    }
}
