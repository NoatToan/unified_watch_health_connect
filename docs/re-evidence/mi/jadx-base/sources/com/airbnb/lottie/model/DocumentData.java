package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5674b;
    public float c;
    public Justification d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5675k;
    public PointF l;
    public PointF m;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        a(str, str2, f, justification, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public void a(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.f5673a = str;
        this.f5674b = str2;
        this.c = f;
        this.d = justification;
        this.e = i;
        this.f = f2;
        this.g = f3;
        this.h = i2;
        this.i = i3;
        this.j = f4;
        this.f5675k = z;
        this.l = pointF;
        this.m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f5673a.hashCode() * 31) + this.f5674b.hashCode()) * 31) + this.c)) * 31) + this.d.ordinal()) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }

    public DocumentData() {
    }
}
