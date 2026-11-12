package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
class u1<K> {
    private static final int i = 1073741824;
    public static final float j = 1.0f;
    private static final long k = 4294967295L;
    private static final long l = -4294967296L;
    public static final int m = 3;
    public static final int n = -1;
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int d;
    private transient int[] e;

    @VisibleForTesting
    public transient long[] f;
    private transient float g;
    private transient int h;

    public class a extends Multisets.f<K> {

        @NullableDecl
        public final K a;
        public int b;

        public a(int i) {
            this.a = (K) u1.this.a[i];
            this.b = i;
        }

        @CanIgnoreReturnValue
        public int a(int i) {
            b();
            int i2 = this.b;
            if (i2 == -1) {
                u1.this.v(this.a, i);
                return 0;
            }
            int[] iArr = u1.this.b;
            int i3 = iArr[i2];
            iArr[i2] = i;
            return i3;
        }

        public void b() {
            int i = this.b;
            if (i == -1 || i >= u1.this.D() || !Objects.equal(this.a, u1.this.a[this.b])) {
                this.b = u1.this.n(this.a);
            }
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            b();
            int i = this.b;
            if (i == -1) {
                return 0;
            }
            return u1.this.b[i];
        }

        @Override // com.google.common.collect.Multiset.Entry
        public K getElement() {
            return this.a;
        }
    }

    public u1() {
        o(3, 1.0f);
    }

    private void A(int i2) {
        int length = this.f.length;
        if (i2 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                z(iMax);
            }
        }
    }

    private void B(int i2) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.g)) + 1;
        int[] iArrS = s(i2);
        long[] jArr = this.f;
        int length = iArrS.length - 1;
        for (int i4 = 0; i4 < this.c; i4++) {
            int i5 = i(jArr[i4]);
            int i6 = i5 & length;
            int i7 = iArrS[i6];
            iArrS[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.h = i3;
        this.e = iArrS;
    }

    private static long E(long j2, int i2) {
        return (j2 & l) | (((long) i2) & 4294967295L);
    }

    public static <K> u1<K> c() {
        return new u1<>();
    }

    public static <K> u1<K> d(int i2) {
        return new u1<>(i2);
    }

    private static int i(long j2) {
        return (int) (j2 >>> 32);
    }

    private static int k(long j2) {
        return (int) j2;
    }

    private int m() {
        return this.e.length - 1;
    }

    private static long[] r(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] s(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int x(@NullableDecl Object obj, int i2) {
        int iM = m() & i2;
        int i3 = this.e[iM];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (i(this.f[i3]) == i2 && Objects.equal(obj, this.a[i3])) {
                int i5 = this.b[i3];
                if (i4 == -1) {
                    this.e[iM] = k(this.f[i3]);
                } else {
                    long[] jArr = this.f;
                    jArr[i4] = E(jArr[i4], k(jArr[i3]));
                }
                q(i3);
                this.c--;
                this.d++;
                return i5;
            }
            int iK = k(this.f[i3]);
            if (iK == -1) {
                return 0;
            }
            i4 = i3;
            i3 = iK;
        }
    }

    public void C(int i2, int i3) {
        Preconditions.checkElementIndex(i2, this.c);
        this.b[i2] = i3;
    }

    public int D() {
        return this.c;
    }

    public void a() {
        this.d++;
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, 0);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1L);
        this.c = 0;
    }

    public boolean b(@NullableDecl Object obj) {
        return n(obj) != -1;
    }

    public void e(int i2) {
        if (i2 > this.f.length) {
            z(i2);
        }
        if (i2 >= this.h) {
            B(Math.max(2, Integer.highestOneBit(i2 - 1) << 1));
        }
    }

    public int f() {
        return this.c == 0 ? -1 : 0;
    }

    public int g(@NullableDecl Object obj) {
        int iN = n(obj);
        if (iN == -1) {
            return 0;
        }
        return this.b[iN];
    }

    public Multiset.Entry<K> h(int i2) {
        Preconditions.checkElementIndex(i2, this.c);
        return new a(i2);
    }

    public K j(int i2) {
        Preconditions.checkElementIndex(i2, this.c);
        return (K) this.a[i2];
    }

    public int l(int i2) {
        Preconditions.checkElementIndex(i2, this.c);
        return this.b[i2];
    }

    public int n(@NullableDecl Object obj) {
        int iD = b1.d(obj);
        int iK = this.e[m() & iD];
        while (iK != -1) {
            long j2 = this.f[iK];
            if (i(j2) == iD && Objects.equal(obj, this.a[iK])) {
                return iK;
            }
            iK = k(j2);
        }
        return -1;
    }

    public void o(int i2, float f) {
        Preconditions.checkArgument(i2 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f > 0.0f, "Illegal load factor");
        int iA = b1.a(i2, f);
        this.e = s(iA);
        this.g = f;
        this.a = new Object[i2];
        this.b = new int[i2];
        this.f = r(i2);
        this.h = Math.max(1, (int) (iA * f));
    }

    public void p(int i2, @NullableDecl K k2, int i3, int i4) {
        this.f[i2] = (((long) i4) << 32) | 4294967295L;
        this.a[i2] = k2;
        this.b[i2] = i3;
    }

    public void q(int i2) {
        int iD = D() - 1;
        if (i2 >= iD) {
            this.a[i2] = null;
            this.b[i2] = 0;
            this.f[i2] = -1;
            return;
        }
        Object[] objArr = this.a;
        objArr[i2] = objArr[iD];
        int[] iArr = this.b;
        iArr[i2] = iArr[iD];
        objArr[iD] = null;
        iArr[iD] = 0;
        long[] jArr = this.f;
        long j2 = jArr[iD];
        jArr[i2] = j2;
        jArr[iD] = -1;
        int i3 = i(j2) & m();
        int[] iArr2 = this.e;
        int i4 = iArr2[i3];
        if (i4 == iD) {
            iArr2[i3] = i2;
            return;
        }
        while (true) {
            long j3 = this.f[i4];
            int iK = k(j3);
            if (iK == iD) {
                this.f[i4] = E(j3, i2);
                return;
            }
            i4 = iK;
        }
    }

    public int t(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.c) {
            return i3;
        }
        return -1;
    }

    public int u(int i2, int i3) {
        return i2 - 1;
    }

    @CanIgnoreReturnValue
    public int v(@NullableDecl K k2, int i2) {
        u.d(i2, "count");
        long[] jArr = this.f;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int iD = b1.d(k2);
        int iM = m() & iD;
        int i3 = this.c;
        int[] iArr2 = this.e;
        int i4 = iArr2[iM];
        if (i4 == -1) {
            iArr2[iM] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (i(j2) == iD && Objects.equal(k2, objArr[i4])) {
                    int i5 = iArr[i4];
                    iArr[i4] = i2;
                    return i5;
                }
                int iK = k(j2);
                if (iK == -1) {
                    jArr[i4] = E(j2, i3);
                    break;
                }
                i4 = iK;
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i3 + 1;
        A(i6);
        p(i3, k2, i2, iD);
        this.c = i6;
        if (i3 >= this.h) {
            B(this.e.length * 2);
        }
        this.d++;
        return 0;
    }

    @CanIgnoreReturnValue
    public int w(@NullableDecl Object obj) {
        return x(obj, b1.d(obj));
    }

    @CanIgnoreReturnValue
    public int y(int i2) {
        return x(this.a[i2], i(this.f[i2]));
    }

    public void z(int i2) {
        this.a = Arrays.copyOf(this.a, i2);
        this.b = Arrays.copyOf(this.b, i2);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(jArrCopyOf, length, i2, -1L);
        }
        this.f = jArrCopyOf;
    }

    public u1(u1<? extends K> u1Var) {
        o(u1Var.D(), 1.0f);
        int iF = u1Var.f();
        while (iF != -1) {
            v(u1Var.j(iF), u1Var.l(iF));
            iF = u1Var.t(iF);
        }
    }

    public u1(int i2) {
        this(i2, 1.0f);
    }

    public u1(int i2, float f) {
        o(i2, f);
    }
}
