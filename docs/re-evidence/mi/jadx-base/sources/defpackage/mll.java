package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class mll extends g87 {
    public static final BigInteger h = ill.j;
    public int[] g;

    public mll() {
        this.g = mhg.i(12);
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrI = mhg.i(12);
        kll.a(this.g, ((mll) g87Var).g, iArrI);
        return new mll(iArrI);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrI = mhg.i(12);
        kll.c(this.g, iArrI);
        return new mll(iArrI);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrI = mhg.i(12);
        w6g.d(kll.f23964a, ((mll) g87Var).g, iArrI);
        kll.f(iArrI, this.g, iArrI);
        return new mll(iArrI);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mll) {
            return mhg.m(12, this.g, ((mll) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrI = mhg.i(12);
        w6g.d(kll.f23964a, this.g, iArrI);
        return new mll(iArrI);
    }

    @Override // defpackage.g87
    public boolean h() {
        return mhg.u(12, this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 12);
    }

    @Override // defpackage.g87
    public boolean i() {
        return mhg.v(12, this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrI = mhg.i(12);
        kll.f(this.g, ((mll) g87Var).g, iArrI);
        return new mll(iArrI);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrI = mhg.i(12);
        kll.g(this.g, iArrI);
        return new mll(iArrI);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (mhg.v(12, iArr) || mhg.u(12, iArr)) {
            return this;
        }
        int[] iArrI = mhg.i(12);
        int[] iArrI2 = mhg.i(12);
        int[] iArrI3 = mhg.i(12);
        int[] iArrI4 = mhg.i(12);
        kll.j(iArr, iArrI);
        kll.f(iArrI, iArr, iArrI);
        kll.k(iArrI, 2, iArrI2);
        kll.f(iArrI2, iArrI, iArrI2);
        kll.j(iArrI2, iArrI2);
        kll.f(iArrI2, iArr, iArrI2);
        kll.k(iArrI2, 5, iArrI3);
        kll.f(iArrI3, iArrI2, iArrI3);
        kll.k(iArrI3, 5, iArrI4);
        kll.f(iArrI4, iArrI2, iArrI4);
        kll.k(iArrI4, 15, iArrI2);
        kll.f(iArrI2, iArrI4, iArrI2);
        kll.k(iArrI2, 2, iArrI3);
        kll.f(iArrI, iArrI3, iArrI);
        kll.k(iArrI3, 28, iArrI3);
        kll.f(iArrI2, iArrI3, iArrI2);
        kll.k(iArrI2, 60, iArrI3);
        kll.f(iArrI3, iArrI2, iArrI3);
        kll.k(iArrI3, 120, iArrI2);
        kll.f(iArrI2, iArrI3, iArrI2);
        kll.k(iArrI2, 15, iArrI2);
        kll.f(iArrI2, iArrI4, iArrI2);
        kll.k(iArrI2, 33, iArrI2);
        kll.f(iArrI2, iArrI, iArrI2);
        kll.k(iArrI2, 64, iArrI2);
        kll.f(iArrI2, iArr, iArrI2);
        kll.k(iArrI2, 30, iArrI);
        kll.j(iArrI, iArrI2);
        if (mhg.m(12, iArr, iArrI2)) {
            return new mll(iArrI);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrI = mhg.i(12);
        kll.j(this.g, iArrI);
        return new mll(iArrI);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrI = mhg.i(12);
        kll.m(this.g, ((mll) g87Var).g, iArrI);
        return new mll(iArrI);
    }

    @Override // defpackage.g87
    public boolean s() {
        return mhg.o(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return mhg.O(12, this.g);
    }

    public mll(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.g = kll.e(bigInteger);
    }

    public mll(int[] iArr) {
        this.g = iArr;
    }
}
