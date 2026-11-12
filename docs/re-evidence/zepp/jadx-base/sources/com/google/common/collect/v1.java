package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
class v1<K> extends u1<K> {
    private static final int r = -2;

    @VisibleForTesting
    public transient long[] o;
    private transient int p;
    private transient int q;

    public v1() {
        this(3);
    }

    public static <K> v1<K> F() {
        return new v1<>();
    }

    public static <K> v1<K> G(int i) {
        return new v1<>(i);
    }

    private int H(int i) {
        return (int) (this.o[i] >>> 32);
    }

    private int I(int i) {
        return (int) this.o[i];
    }

    private void J(int i, int i2) {
        long[] jArr = this.o;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    private void K(int i, int i2) {
        if (i == -2) {
            this.p = i2;
        } else {
            L(i, i2);
        }
        if (i2 == -2) {
            this.q = i;
        } else {
            J(i2, i);
        }
    }

    private void L(int i, int i2) {
        long[] jArr = this.o;
        jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
    }

    @Override // com.google.common.collect.u1
    public void a() {
        super.a();
        this.p = -2;
        this.q = -2;
    }

    @Override // com.google.common.collect.u1
    public int f() {
        int i = this.p;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.u1
    public void o(int i, float f) {
        super.o(i, f);
        this.p = -2;
        this.q = -2;
        long[] jArr = new long[i];
        this.o = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.u1
    public void p(int i, K k, int i2, int i3) {
        super.p(i, k, i2, i3);
        K(this.q, i);
        K(i, -2);
    }

    @Override // com.google.common.collect.u1
    public void q(int i) {
        int iD = D() - 1;
        K(H(i), I(i));
        if (i < iD) {
            K(H(iD), i);
            K(i, I(iD));
        }
        super.q(i);
    }

    @Override // com.google.common.collect.u1
    public int t(int i) {
        int I = I(i);
        if (I == -2) {
            return -1;
        }
        return I;
    }

    @Override // com.google.common.collect.u1
    public int u(int i, int i2) {
        return i == D() ? i2 : i;
    }

    @Override // com.google.common.collect.u1
    public void z(int i) {
        super.z(i);
        long[] jArr = this.o;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.o = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public v1(int i) {
        this(i, 1.0f);
    }

    public v1(int i, float f) {
        super(i, f);
    }

    public v1(u1<K> u1Var) {
        o(u1Var.D(), 1.0f);
        int iF = u1Var.f();
        while (iF != -1) {
            v(u1Var.j(iF), u1Var.l(iF));
            iF = u1Var.t(iF);
        }
    }
}
