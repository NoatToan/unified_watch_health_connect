package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class oil extends g87 {
    public static final BigInteger h = kil.j;
    public int[] g;

    public oil() {
        this.g = sgg.c();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrC = sgg.c();
        mil.a(this.g, ((oil) g87Var).g, iArrC);
        return new oil(iArrC);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrC = sgg.c();
        mil.b(this.g, iArrC);
        return new oil(iArrC);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrC = sgg.c();
        w6g.d(mil.f26218a, ((oil) g87Var).g, iArrC);
        mil.e(iArrC, this.g, iArrC);
        return new oil(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oil) {
            return sgg.g(this.g, ((oil) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrC = sgg.c();
        w6g.d(mil.f26218a, this.g, iArrC);
        return new oil(iArrC);
    }

    @Override // defpackage.g87
    public boolean h() {
        return sgg.m(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 4);
    }

    @Override // defpackage.g87
    public boolean i() {
        return sgg.o(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrC = sgg.c();
        mil.e(this.g, ((oil) g87Var).g, iArrC);
        return new oil(iArrC);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrC = sgg.c();
        mil.g(this.g, iArrC);
        return new oil(iArrC);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (sgg.o(iArr) || sgg.m(iArr)) {
            return this;
        }
        int[] iArrC = sgg.c();
        mil.j(iArr, iArrC);
        mil.e(iArrC, iArr, iArrC);
        int[] iArrC2 = sgg.c();
        mil.k(iArrC, 2, iArrC2);
        mil.e(iArrC2, iArrC, iArrC2);
        int[] iArrC3 = sgg.c();
        mil.k(iArrC2, 4, iArrC3);
        mil.e(iArrC3, iArrC2, iArrC3);
        mil.k(iArrC3, 2, iArrC2);
        mil.e(iArrC2, iArrC, iArrC2);
        mil.k(iArrC2, 10, iArrC);
        mil.e(iArrC, iArrC2, iArrC);
        mil.k(iArrC, 10, iArrC3);
        mil.e(iArrC3, iArrC2, iArrC3);
        mil.j(iArrC3, iArrC2);
        mil.e(iArrC2, iArr, iArrC2);
        mil.k(iArrC2, 95, iArrC2);
        mil.j(iArrC2, iArrC3);
        if (sgg.g(iArr, iArrC3)) {
            return new oil(iArrC2);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrC = sgg.c();
        mil.j(this.g, iArrC);
        return new oil(iArrC);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrC = sgg.c();
        mil.m(this.g, ((oil) g87Var).g, iArrC);
        return new oil(iArrC);
    }

    @Override // defpackage.g87
    public boolean s() {
        return sgg.k(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return sgg.v(this.g);
    }

    public oil(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.g = mil.d(bigInteger);
    }

    public oil(int[] iArr) {
        this.g = iArr;
    }
}
