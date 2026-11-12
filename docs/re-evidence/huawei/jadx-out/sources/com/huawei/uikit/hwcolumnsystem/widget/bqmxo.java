package com.huawei.uikit.hwcolumnsystem.widget;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import defpackage.xef;

/* JADX INFO: loaded from: classes20.dex */
public abstract class bqmxo {
    protected static final String f = "HwColumnDelegate";
    private static final float g = 1.0E-6f;
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29351c = 1;
    private float d;
    private float e;

    public bqmxo(Context context) {
    }

    private void p() {
        float f2 = this.d;
        float f3 = this.f29349a;
        if (f2 < f3) {
            this.f29351c = 0;
        } else if (f2 < f3 || f2 >= this.f29350b) {
            this.f29351c = 2;
        } else {
            this.f29351c = 1;
        }
    }

    public int a(int i2) {
        return a(i2, this.e);
    }

    protected abstract Pair<Integer, Integer> a(float f2);

    protected abstract Pair<Integer, String> a(int i2, String[] strArr, float f2);

    protected abstract xef a();

    protected abstract xef a(int i2, int i3, int i4);

    protected abstract xef a(int i2, Pair<Integer, Integer> pair, int i3, int i4, float f2);

    protected abstract int b(int i2, int i3, int i4);

    protected abstract xef b();

    void b(int i2, float f2) {
        if (Float.compare(f2, 0.0f) != 0) {
            this.e = f2;
            this.d = i2 / f2;
            p();
        }
    }

    protected abstract boolean b(int i2);

    protected abstract xef c();

    protected abstract xef c(int i2, int i3, int i4);

    protected abstract xef d();

    protected abstract xef d(int i2, int i3, int i4);

    protected abstract xef e();

    protected abstract xef f();

    protected abstract xef g();

    protected abstract xef h();

    protected abstract xef i();

    protected abstract xef j();

    protected abstract xef k();

    protected abstract xef l();

    protected abstract xef m();

    protected abstract xef n();

    protected abstract int o();

    public int a(int i2, float f2) {
        if (Float.compare(f2, 0.0f) != 0) {
            return (int) (i2 * f2);
        }
        throw new IllegalStateException("HwColumnDelegate constructor did not call superclass implementation");
    }

    public boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < g;
    }

    void a(int[] iArr) {
        int i2;
        if (iArr != null && iArr.length >= 2) {
            int i3 = iArr[0];
            if (i3 <= 0 || (i2 = iArr[1]) <= 0) {
                throw new IllegalArgumentException("Break points value cannot be zero!");
            }
            if (i3 == i2) {
                Log.w(f, "Break points cannot be the same.");
                return;
            }
            this.f29349a = Math.min(i3, i2);
            this.f29350b = Math.max(iArr[0], iArr[1]);
            p();
            return;
        }
        throw new IllegalArgumentException("Break points cannot be null or length less than 2!");
    }
}
