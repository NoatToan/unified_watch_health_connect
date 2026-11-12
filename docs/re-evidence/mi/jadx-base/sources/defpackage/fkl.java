package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fkl extends h87 {
    public static final BigInteger h = bkl.i;
    public static final int[] i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public int[] g;

    public fkl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.g = dkl.c(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrD = ygg.d();
        dkl.a(this.g, ((fkl) h87Var).g, iArrD);
        return new fkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrD = ygg.d();
        dkl.b(this.g, iArrD);
        return new fkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrD = ygg.d();
        v6g.d(dkl.f15630a, ((fkl) h87Var).g, iArrD);
        dkl.d(iArrD, this.g, iArrD);
        return new fkl(iArrD);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fkl) {
            return ygg.f(this.g, ((fkl) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.h87
    public h87 g() {
        int[] iArrD = ygg.d();
        v6g.d(dkl.f15630a, this.g, iArrD);
        return new fkl(iArrD);
    }

    @Override // defpackage.h87
    public boolean h() {
        return ygg.j(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ wj1.n(this.g, 0, 7);
    }

    @Override // defpackage.h87
    public boolean i() {
        return ygg.k(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        int[] iArrD = ygg.d();
        dkl.d(this.g, ((fkl) h87Var).g, iArrD);
        return new fkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrD = ygg.d();
        dkl.f(this.g, iArrD);
        return new fkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (ygg.k(iArr) || ygg.j(iArr)) {
            return this;
        }
        int[] iArrD = ygg.d();
        dkl.i(iArr, iArrD);
        dkl.d(iArrD, iArr, iArrD);
        dkl.i(iArrD, iArrD);
        dkl.d(iArrD, iArr, iArrD);
        int[] iArrD2 = ygg.d();
        dkl.i(iArrD, iArrD2);
        dkl.d(iArrD2, iArr, iArrD2);
        int[] iArrD3 = ygg.d();
        dkl.j(iArrD2, 4, iArrD3);
        dkl.d(iArrD3, iArrD2, iArrD3);
        int[] iArrD4 = ygg.d();
        dkl.j(iArrD3, 3, iArrD4);
        dkl.d(iArrD4, iArrD, iArrD4);
        dkl.j(iArrD4, 8, iArrD4);
        dkl.d(iArrD4, iArrD3, iArrD4);
        dkl.j(iArrD4, 4, iArrD3);
        dkl.d(iArrD3, iArrD2, iArrD3);
        dkl.j(iArrD3, 19, iArrD2);
        dkl.d(iArrD2, iArrD4, iArrD2);
        int[] iArrD5 = ygg.d();
        dkl.j(iArrD2, 42, iArrD5);
        dkl.d(iArrD5, iArrD2, iArrD5);
        dkl.j(iArrD5, 23, iArrD2);
        dkl.d(iArrD2, iArrD3, iArrD2);
        dkl.j(iArrD2, 84, iArrD3);
        dkl.d(iArrD3, iArrD5, iArrD3);
        dkl.j(iArrD3, 20, iArrD3);
        dkl.d(iArrD3, iArrD4, iArrD3);
        dkl.j(iArrD3, 3, iArrD3);
        dkl.d(iArrD3, iArr, iArrD3);
        dkl.j(iArrD3, 2, iArrD3);
        dkl.d(iArrD3, iArr, iArrD3);
        dkl.j(iArrD3, 4, iArrD3);
        dkl.d(iArrD3, iArrD, iArrD3);
        dkl.i(iArrD3, iArrD3);
        dkl.i(iArrD3, iArrD5);
        if (ygg.f(iArr, iArrD5)) {
            return new fkl(iArrD3);
        }
        dkl.d(iArrD3, i, iArrD3);
        dkl.i(iArrD3, iArrD5);
        if (ygg.f(iArr, iArrD5)) {
            return new fkl(iArrD3);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrD = ygg.d();
        dkl.i(this.g, iArrD);
        return new fkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrD = ygg.d();
        dkl.k(this.g, ((fkl) h87Var).g, iArrD);
        return new fkl(iArrD);
    }

    @Override // defpackage.h87
    public boolean r() {
        return ygg.h(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return ygg.t(this.g);
    }

    public fkl() {
        this.g = ygg.d();
    }

    public fkl(int[] iArr) {
        this.g = iArr;
    }
}
