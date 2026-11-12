package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class gkl extends g87 {
    public static final BigInteger h = ckl.j;
    public static final int[] i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public int[] g;

    public gkl() {
        this.g = zgg.d();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrD = zgg.d();
        ekl.a(this.g, ((gkl) g87Var).g, iArrD);
        return new gkl(iArrD);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrD = zgg.d();
        ekl.b(this.g, iArrD);
        return new gkl(iArrD);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrD = zgg.d();
        w6g.d(ekl.f16742a, ((gkl) g87Var).g, iArrD);
        ekl.d(iArrD, this.g, iArrD);
        return new gkl(iArrD);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gkl) {
            return zgg.f(this.g, ((gkl) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrD = zgg.d();
        w6g.d(ekl.f16742a, this.g, iArrD);
        return new gkl(iArrD);
    }

    @Override // defpackage.g87
    public boolean h() {
        return zgg.j(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 7);
    }

    @Override // defpackage.g87
    public boolean i() {
        return zgg.k(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrD = zgg.d();
        ekl.d(this.g, ((gkl) g87Var).g, iArrD);
        return new gkl(iArrD);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrD = zgg.d();
        ekl.f(this.g, iArrD);
        return new gkl(iArrD);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (zgg.k(iArr) || zgg.j(iArr)) {
            return this;
        }
        int[] iArrD = zgg.d();
        ekl.i(iArr, iArrD);
        ekl.d(iArrD, iArr, iArrD);
        ekl.i(iArrD, iArrD);
        ekl.d(iArrD, iArr, iArrD);
        int[] iArrD2 = zgg.d();
        ekl.i(iArrD, iArrD2);
        ekl.d(iArrD2, iArr, iArrD2);
        int[] iArrD3 = zgg.d();
        ekl.j(iArrD2, 4, iArrD3);
        ekl.d(iArrD3, iArrD2, iArrD3);
        int[] iArrD4 = zgg.d();
        ekl.j(iArrD3, 3, iArrD4);
        ekl.d(iArrD4, iArrD, iArrD4);
        ekl.j(iArrD4, 8, iArrD4);
        ekl.d(iArrD4, iArrD3, iArrD4);
        ekl.j(iArrD4, 4, iArrD3);
        ekl.d(iArrD3, iArrD2, iArrD3);
        ekl.j(iArrD3, 19, iArrD2);
        ekl.d(iArrD2, iArrD4, iArrD2);
        int[] iArrD5 = zgg.d();
        ekl.j(iArrD2, 42, iArrD5);
        ekl.d(iArrD5, iArrD2, iArrD5);
        ekl.j(iArrD5, 23, iArrD2);
        ekl.d(iArrD2, iArrD3, iArrD2);
        ekl.j(iArrD2, 84, iArrD3);
        ekl.d(iArrD3, iArrD5, iArrD3);
        ekl.j(iArrD3, 20, iArrD3);
        ekl.d(iArrD3, iArrD4, iArrD3);
        ekl.j(iArrD3, 3, iArrD3);
        ekl.d(iArrD3, iArr, iArrD3);
        ekl.j(iArrD3, 2, iArrD3);
        ekl.d(iArrD3, iArr, iArrD3);
        ekl.j(iArrD3, 4, iArrD3);
        ekl.d(iArrD3, iArrD, iArrD3);
        ekl.i(iArrD3, iArrD3);
        ekl.i(iArrD3, iArrD5);
        if (zgg.f(iArr, iArrD5)) {
            return new gkl(iArrD3);
        }
        ekl.d(iArrD3, i, iArrD3);
        ekl.i(iArrD3, iArrD5);
        if (zgg.f(iArr, iArrD5)) {
            return new gkl(iArrD3);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrD = zgg.d();
        ekl.i(this.g, iArrD);
        return new gkl(iArrD);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrD = zgg.d();
        ekl.k(this.g, ((gkl) g87Var).g, iArrD);
        return new gkl(iArrD);
    }

    @Override // defpackage.g87
    public boolean s() {
        return zgg.h(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return zgg.t(this.g);
    }

    public gkl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.g = ekl.c(bigInteger);
    }

    public gkl(int[] iArr) {
        this.g = iArr;
    }
}
