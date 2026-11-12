package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class lll extends h87 {
    public static final BigInteger h = hll.i;
    public int[] g;

    public lll(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.g = jll.e(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrI = xgg.i(12);
        jll.a(this.g, ((lll) h87Var).g, iArrI);
        return new lll(iArrI);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrI = xgg.i(12);
        jll.c(this.g, iArrI);
        return new lll(iArrI);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrI = xgg.i(12);
        v6g.d(jll.f22910a, ((lll) h87Var).g, iArrI);
        jll.f(iArrI, this.g, iArrI);
        return new lll(iArrI);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lll) {
            return xgg.m(12, this.g, ((lll) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.h87
    public h87 g() {
        int[] iArrI = xgg.i(12);
        v6g.d(jll.f22910a, this.g, iArrI);
        return new lll(iArrI);
    }

    @Override // defpackage.h87
    public boolean h() {
        return xgg.u(12, this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ wj1.n(this.g, 0, 12);
    }

    @Override // defpackage.h87
    public boolean i() {
        return xgg.v(12, this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        int[] iArrI = xgg.i(12);
        jll.f(this.g, ((lll) h87Var).g, iArrI);
        return new lll(iArrI);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrI = xgg.i(12);
        jll.g(this.g, iArrI);
        return new lll(iArrI);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (xgg.v(12, iArr) || xgg.u(12, iArr)) {
            return this;
        }
        int[] iArrI = xgg.i(12);
        int[] iArrI2 = xgg.i(12);
        int[] iArrI3 = xgg.i(12);
        int[] iArrI4 = xgg.i(12);
        jll.j(iArr, iArrI);
        jll.f(iArrI, iArr, iArrI);
        jll.k(iArrI, 2, iArrI2);
        jll.f(iArrI2, iArrI, iArrI2);
        jll.j(iArrI2, iArrI2);
        jll.f(iArrI2, iArr, iArrI2);
        jll.k(iArrI2, 5, iArrI3);
        jll.f(iArrI3, iArrI2, iArrI3);
        jll.k(iArrI3, 5, iArrI4);
        jll.f(iArrI4, iArrI2, iArrI4);
        jll.k(iArrI4, 15, iArrI2);
        jll.f(iArrI2, iArrI4, iArrI2);
        jll.k(iArrI2, 2, iArrI3);
        jll.f(iArrI, iArrI3, iArrI);
        jll.k(iArrI3, 28, iArrI3);
        jll.f(iArrI2, iArrI3, iArrI2);
        jll.k(iArrI2, 60, iArrI3);
        jll.f(iArrI3, iArrI2, iArrI3);
        jll.k(iArrI3, 120, iArrI2);
        jll.f(iArrI2, iArrI3, iArrI2);
        jll.k(iArrI2, 15, iArrI2);
        jll.f(iArrI2, iArrI4, iArrI2);
        jll.k(iArrI2, 33, iArrI2);
        jll.f(iArrI2, iArrI, iArrI2);
        jll.k(iArrI2, 64, iArrI2);
        jll.f(iArrI2, iArr, iArrI2);
        jll.k(iArrI2, 30, iArrI);
        jll.j(iArrI, iArrI2);
        if (xgg.m(12, iArr, iArrI2)) {
            return new lll(iArrI);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrI = xgg.i(12);
        jll.j(this.g, iArrI);
        return new lll(iArrI);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrI = xgg.i(12);
        jll.m(this.g, ((lll) h87Var).g, iArrI);
        return new lll(iArrI);
    }

    @Override // defpackage.h87
    public boolean r() {
        return xgg.o(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return xgg.O(12, this.g);
    }

    public lll() {
        this.g = xgg.i(12);
    }

    public lll(int[] iArr) {
        this.g = iArr;
    }
}
