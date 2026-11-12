package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class hjl extends h87 {
    public static final BigInteger h = djl.i;
    public int[] g;

    public hjl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.g = fjl.c(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrC = tgg.c();
        fjl.a(this.g, ((hjl) h87Var).g, iArrC);
        return new hjl(iArrC);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrC = tgg.c();
        fjl.b(this.g, iArrC);
        return new hjl(iArrC);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrC = tgg.c();
        v6g.d(fjl.f17853a, ((hjl) h87Var).g, iArrC);
        fjl.d(iArrC, this.g, iArrC);
        return new hjl(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hjl) {
            return tgg.e(this.g, ((hjl) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.h87
    public h87 g() {
        int[] iArrC = tgg.c();
        v6g.d(fjl.f17853a, this.g, iArrC);
        return new hjl(iArrC);
    }

    @Override // defpackage.h87
    public boolean h() {
        return tgg.i(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ wj1.n(this.g, 0, 5);
    }

    @Override // defpackage.h87
    public boolean i() {
        return tgg.j(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        int[] iArrC = tgg.c();
        fjl.d(this.g, ((hjl) h87Var).g, iArrC);
        return new hjl(iArrC);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrC = tgg.c();
        fjl.f(this.g, iArrC);
        return new hjl(iArrC);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (tgg.j(iArr) || tgg.i(iArr)) {
            return this;
        }
        int[] iArrC = tgg.c();
        fjl.i(iArr, iArrC);
        fjl.d(iArrC, iArr, iArrC);
        int[] iArrC2 = tgg.c();
        fjl.i(iArrC, iArrC2);
        fjl.d(iArrC2, iArr, iArrC2);
        int[] iArrC3 = tgg.c();
        fjl.i(iArrC2, iArrC3);
        fjl.d(iArrC3, iArr, iArrC3);
        int[] iArrC4 = tgg.c();
        fjl.j(iArrC3, 3, iArrC4);
        fjl.d(iArrC4, iArrC2, iArrC4);
        fjl.j(iArrC4, 7, iArrC3);
        fjl.d(iArrC3, iArrC4, iArrC3);
        fjl.j(iArrC3, 3, iArrC4);
        fjl.d(iArrC4, iArrC2, iArrC4);
        int[] iArrC5 = tgg.c();
        fjl.j(iArrC4, 14, iArrC5);
        fjl.d(iArrC5, iArrC3, iArrC5);
        fjl.j(iArrC5, 31, iArrC3);
        fjl.d(iArrC3, iArrC5, iArrC3);
        fjl.j(iArrC3, 62, iArrC5);
        fjl.d(iArrC5, iArrC3, iArrC5);
        fjl.j(iArrC5, 3, iArrC3);
        fjl.d(iArrC3, iArrC2, iArrC3);
        fjl.j(iArrC3, 18, iArrC3);
        fjl.d(iArrC3, iArrC4, iArrC3);
        fjl.j(iArrC3, 2, iArrC3);
        fjl.d(iArrC3, iArr, iArrC3);
        fjl.j(iArrC3, 3, iArrC3);
        fjl.d(iArrC3, iArrC, iArrC3);
        fjl.j(iArrC3, 6, iArrC3);
        fjl.d(iArrC3, iArrC2, iArrC3);
        fjl.j(iArrC3, 2, iArrC3);
        fjl.d(iArrC3, iArr, iArrC3);
        fjl.i(iArrC3, iArrC);
        if (tgg.e(iArr, iArrC)) {
            return new hjl(iArrC3);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrC = tgg.c();
        fjl.i(this.g, iArrC);
        return new hjl(iArrC);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrC = tgg.c();
        fjl.k(this.g, ((hjl) h87Var).g, iArrC);
        return new hjl(iArrC);
    }

    @Override // defpackage.h87
    public boolean r() {
        return tgg.g(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return tgg.t(this.g);
    }

    public hjl() {
        this.g = tgg.c();
    }

    public hjl(int[] iArr) {
        this.g = iArr;
    }
}
