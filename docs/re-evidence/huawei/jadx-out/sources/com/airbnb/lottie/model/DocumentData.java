package com.airbnb.lottie.model;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes21.dex */
public class DocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f1930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PointF f1931c;
    public int d;
    public float e;
    public int f;
    public float g;
    public boolean h;
    public float i;
    public Justification j;
    public String k;
    public float m;
    public int o;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        a(str, str2, f, justification, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public DocumentData() {
    }

    public void a(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.k = str;
        this.f1929a = str2;
        this.g = f;
        this.j = justification;
        this.o = i;
        this.i = f2;
        this.e = f3;
        this.d = i2;
        this.f = i3;
        this.m = f4;
        this.h = z;
        this.f1930b = pointF;
        this.f1931c = pointF2;
    }

    public int hashCode() {
        int iHashCode = (int) ((((this.k.hashCode() * 31) + this.f1929a.hashCode()) * 31) + this.g);
        int iOrdinal = this.j.ordinal();
        int i = this.o;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.i);
        return (((((((iHashCode * 31) + iOrdinal) * 31) + i) * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.d;
    }
}
