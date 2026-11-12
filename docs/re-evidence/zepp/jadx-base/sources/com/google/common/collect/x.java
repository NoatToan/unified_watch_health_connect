package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
class x<K, V> extends v<K, V> {
    private static final int v = -2;

    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient long[] r;
    private transient int s;
    private transient int t;
    private final boolean u;

    public x() {
        this(3);
    }

    public static <K, V> x<K, V> I() {
        return new x<>();
    }

    public static <K, V> x<K, V> J(int i) {
        return new x<>(i);
    }

    private int K(int i) {
        return (int) (this.r[i] >>> 32);
    }

    private void L(int i, int i2) {
        long[] jArr = this.r;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    private void M(int i, int i2) {
        if (i == -2) {
            this.s = i2;
        } else {
            N(i, i2);
        }
        if (i2 == -2) {
            this.t = i;
        } else {
            L(i2, i);
        }
    }

    private void N(int i, int i2) {
        long[] jArr = this.r;
        jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
    }

    @Override // com.google.common.collect.v
    public void C(int i) {
        super.C(i);
        this.r = Arrays.copyOf(this.r, i);
    }

    @Override // com.google.common.collect.v, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.s = -2;
        this.t = -2;
    }

    @Override // com.google.common.collect.v
    public void f(int i) {
        if (this.u) {
            M(K(i), r(i));
            M(this.t, i);
            M(i, -2);
            this.f++;
        }
    }

    @Override // com.google.common.collect.v
    public int g(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.v
    public int o() {
        return this.s;
    }

    @Override // com.google.common.collect.v
    public int r(int i) {
        return (int) this.r[i];
    }

    @Override // com.google.common.collect.v
    public void u(int i, float f) {
        super.u(i, f);
        this.s = -2;
        this.t = -2;
        long[] jArr = new long[i];
        this.r = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.v
    public void v(int i, K k, V v2, int i2) {
        super.v(i, k, v2, i2);
        M(this.t, i);
        M(i, -2);
    }

    @Override // com.google.common.collect.v
    public void x(int i) {
        int size = size() - 1;
        M(K(i), r(i));
        if (i < size) {
            M(K(size), i);
            M(i, r(size));
        }
        super.x(i);
    }

    public x(int i) {
        this(i, 1.0f, false);
    }

    public x(int i, float f, boolean z) {
        super(i, f);
        this.u = z;
    }
}
