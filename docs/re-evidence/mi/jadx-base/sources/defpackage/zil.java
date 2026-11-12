package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class zil extends h87 {
    public static final BigInteger h = vil.i;
    public int[] g;

    public zil(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.g = xil.c(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrC = tgg.c();
        xil.a(this.g, ((zil) h87Var).g, iArrC);
        return new zil(iArrC);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrC = tgg.c();
        xil.b(this.g, iArrC);
        return new zil(iArrC);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrC = tgg.c();
        v6g.d(xil.f39164a, ((zil) h87Var).g, iArrC);
        xil.d(iArrC, this.g, iArrC);
        return new zil(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zil) {
            return tgg.e(this.g, ((zil) obj).g);
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
        v6g.d(xil.f39164a, this.g, iArrC);
        return new zil(iArrC);
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
        xil.d(this.g, ((zil) h87Var).g, iArrC);
        return new zil(iArrC);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrC = tgg.c();
        xil.f(this.g, iArrC);
        return new zil(iArrC);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (tgg.j(iArr) || tgg.i(iArr)) {
            return this;
        }
        int[] iArrC = tgg.c();
        xil.i(iArr, iArrC);
        xil.d(iArrC, iArr, iArrC);
        int[] iArrC2 = tgg.c();
        xil.j(iArrC, 2, iArrC2);
        xil.d(iArrC2, iArrC, iArrC2);
        xil.j(iArrC2, 4, iArrC);
        xil.d(iArrC, iArrC2, iArrC);
        xil.j(iArrC, 8, iArrC2);
        xil.d(iArrC2, iArrC, iArrC2);
        xil.j(iArrC2, 16, iArrC);
        xil.d(iArrC, iArrC2, iArrC);
        xil.j(iArrC, 32, iArrC2);
        xil.d(iArrC2, iArrC, iArrC2);
        xil.j(iArrC2, 64, iArrC);
        xil.d(iArrC, iArrC2, iArrC);
        xil.i(iArrC, iArrC2);
        xil.d(iArrC2, iArr, iArrC2);
        xil.j(iArrC2, 29, iArrC2);
        xil.i(iArrC2, iArrC);
        if (tgg.e(iArr, iArrC)) {
            return new zil(iArrC2);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrC = tgg.c();
        xil.i(this.g, iArrC);
        return new zil(iArrC);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrC = tgg.c();
        xil.k(this.g, ((zil) h87Var).g, iArrC);
        return new zil(iArrC);
    }

    @Override // defpackage.h87
    public boolean r() {
        return tgg.g(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return tgg.t(this.g);
    }

    public zil() {
        this.g = tgg.c();
    }

    public zil(int[] iArr) {
        this.g = iArr;
    }
}
