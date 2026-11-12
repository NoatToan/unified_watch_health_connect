package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class nil extends h87 {
    public static final BigInteger h = jil.i;
    public int[] g;

    public nil(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.g = lil.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrC = rgg.c();
        lil.a(this.g, ((nil) h87Var).g, iArrC);
        return new nil(iArrC);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrC = rgg.c();
        lil.b(this.g, iArrC);
        return new nil(iArrC);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrC = rgg.c();
        v6g.d(lil.f25105a, ((nil) h87Var).g, iArrC);
        lil.e(iArrC, this.g, iArrC);
        return new nil(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nil) {
            return rgg.g(this.g, ((nil) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.h87
    public h87 g() {
        int[] iArrC = rgg.c();
        v6g.d(lil.f25105a, this.g, iArrC);
        return new nil(iArrC);
    }

    @Override // defpackage.h87
    public boolean h() {
        return rgg.m(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ wj1.n(this.g, 0, 4);
    }

    @Override // defpackage.h87
    public boolean i() {
        return rgg.o(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        int[] iArrC = rgg.c();
        lil.e(this.g, ((nil) h87Var).g, iArrC);
        return new nil(iArrC);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrC = rgg.c();
        lil.g(this.g, iArrC);
        return new nil(iArrC);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (rgg.o(iArr) || rgg.m(iArr)) {
            return this;
        }
        int[] iArrC = rgg.c();
        lil.j(iArr, iArrC);
        lil.e(iArrC, iArr, iArrC);
        int[] iArrC2 = rgg.c();
        lil.k(iArrC, 2, iArrC2);
        lil.e(iArrC2, iArrC, iArrC2);
        int[] iArrC3 = rgg.c();
        lil.k(iArrC2, 4, iArrC3);
        lil.e(iArrC3, iArrC2, iArrC3);
        lil.k(iArrC3, 2, iArrC2);
        lil.e(iArrC2, iArrC, iArrC2);
        lil.k(iArrC2, 10, iArrC);
        lil.e(iArrC, iArrC2, iArrC);
        lil.k(iArrC, 10, iArrC3);
        lil.e(iArrC3, iArrC2, iArrC3);
        lil.j(iArrC3, iArrC2);
        lil.e(iArrC2, iArr, iArrC2);
        lil.k(iArrC2, 95, iArrC2);
        lil.j(iArrC2, iArrC3);
        if (rgg.g(iArr, iArrC3)) {
            return new nil(iArrC2);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrC = rgg.c();
        lil.j(this.g, iArrC);
        return new nil(iArrC);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrC = rgg.c();
        lil.m(this.g, ((nil) h87Var).g, iArrC);
        return new nil(iArrC);
    }

    @Override // defpackage.h87
    public boolean r() {
        return rgg.k(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return rgg.v(this.g);
    }

    public nil() {
        this.g = rgg.c();
    }

    public nil(int[] iArr) {
        this.g = iArr;
    }
}
