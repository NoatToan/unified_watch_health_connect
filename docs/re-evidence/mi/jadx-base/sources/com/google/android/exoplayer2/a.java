package com.google.android.exoplayer2;

import android.util.Pair;
import defpackage.rk1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends v {
    public final int c;
    public final com.google.android.exoplayer2.source.t d;
    public final boolean e;

    public a(boolean z, com.google.android.exoplayer2.source.t tVar) {
        this.e = z;
        this.d = tVar;
        this.c = tVar.getLength();
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i);

    public final int B(int i, boolean z) {
        if (z) {
            return this.d.b(i);
        }
        if (i < this.c - 1) {
            return i + 1;
        }
        return -1;
    }

    public final int C(int i, boolean z) {
        if (z) {
            return this.d.a(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    public abstract v D(int i);

    @Override // com.google.android.exoplayer2.v
    public int a(boolean z) {
        if (this.c == 0) {
            return -1;
        }
        if (this.e) {
            z = false;
        }
        int iE = z ? this.d.e() : 0;
        while (D(iE).q()) {
            iE = B(iE, z);
            if (iE == -1) {
                return -1;
            }
        }
        return A(iE) + D(iE).a(z);
    }

    @Override // com.google.android.exoplayer2.v
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // com.google.android.exoplayer2.v
    public int c(boolean z) {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        if (this.e) {
            z = false;
        }
        int iC = z ? this.d.c() : i - 1;
        while (D(iC).q()) {
            iC = C(iC, z);
            if (iC == -1) {
                return -1;
            }
        }
        return A(iC) + D(iC).c(z);
    }

    @Override // com.google.android.exoplayer2.v
    public int e(int i, int i2, boolean z) {
        if (this.e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iU = u(i);
        int iA = A(iU);
        int iE = D(iU).e(i - iA, i2 != 2 ? i2 : 0, z);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.v
    public final v.b g(int i, v.b bVar, boolean z) {
        int iT = t(i);
        int iA = A(iT);
        D(iT).g(i - z(iT), bVar, z);
        bVar.c += iA;
        if (z) {
            bVar.f8447b = y(x(iT), rk1.e(bVar.f8447b));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.v
    public final v.b h(Object obj, v.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.c += iA;
        bVar.f8447b = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.v
    public int l(int i, int i2, boolean z) {
        if (this.e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iU = u(i);
        int iA = A(iU);
        int iL = D(iU).l(i - iA, i2 != 2 ? i2 : 0, z);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z);
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.v
    public final Object m(int i) {
        int iT = t(i);
        return y(x(iT), D(iT).m(i - z(iT)));
    }

    @Override // com.google.android.exoplayer2.v
    public final v.c o(int i, v.c cVar, long j) {
        int iU = u(i);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i - iA, cVar, j);
        Object objX = x(iU);
        if (!v.c.f8448r.equals(cVar.f8449a)) {
            objX = y(objX, cVar.f8449a);
        }
        cVar.f8449a = objX;
        cVar.o += iZ;
        cVar.p += iZ;
        return cVar;
    }

    public abstract int s(Object obj);

    public abstract int t(int i);

    public abstract int u(int i);

    public abstract Object x(int i);

    public abstract int z(int i);
}
