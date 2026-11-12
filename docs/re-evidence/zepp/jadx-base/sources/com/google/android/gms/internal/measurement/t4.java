package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class t4 extends v4 {
    public t4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.v4
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.v4
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.v4
    public final void c(Object obj, long j, boolean z) {
        if (w4.i) {
            w4.d(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            w4.e(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v4
    public final void d(Object obj, long j, byte b) {
        if (w4.i) {
            w4.d(obj, j, b);
        } else {
            w4.e(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v4
    public final void e(Object obj, long j, double d) {
        o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.v4
    public final void f(Object obj, long j, float f) {
        n(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.v4
    public final boolean g(Object obj, long j) {
        return w4.i ? w4.y(obj, j) : w4.z(obj, j);
    }
}
