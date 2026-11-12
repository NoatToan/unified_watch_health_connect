package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wkl extends g87 {
    public static final BigInteger h = skl.j;
    public int[] g;

    public wkl() {
        this.g = bhg.f();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrF = bhg.f();
        ukl.a(this.g, ((wkl) g87Var).g, iArrF);
        return new wkl(iArrF);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrF = bhg.f();
        ukl.b(this.g, iArrF);
        return new wkl(iArrF);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrF = bhg.f();
        w6g.d(ukl.f35887a, ((wkl) g87Var).g, iArrF);
        ukl.d(iArrF, this.g, iArrF);
        return new wkl(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wkl) {
            return bhg.k(this.g, ((wkl) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrF = bhg.f();
        w6g.d(ukl.f35887a, this.g, iArrF);
        return new wkl(iArrF);
    }

    @Override // defpackage.g87
    public boolean h() {
        return bhg.r(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 8);
    }

    @Override // defpackage.g87
    public boolean i() {
        return bhg.t(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrF = bhg.f();
        ukl.d(this.g, ((wkl) g87Var).g, iArrF);
        return new wkl(iArrF);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrF = bhg.f();
        ukl.f(this.g, iArrF);
        return new wkl(iArrF);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (bhg.t(iArr) || bhg.r(iArr)) {
            return this;
        }
        int[] iArrF = bhg.f();
        ukl.i(iArr, iArrF);
        ukl.d(iArrF, iArr, iArrF);
        int[] iArrF2 = bhg.f();
        ukl.i(iArrF, iArrF2);
        ukl.d(iArrF2, iArr, iArrF2);
        int[] iArrF3 = bhg.f();
        ukl.j(iArrF2, 3, iArrF3);
        ukl.d(iArrF3, iArrF2, iArrF3);
        ukl.j(iArrF3, 3, iArrF3);
        ukl.d(iArrF3, iArrF2, iArrF3);
        ukl.j(iArrF3, 2, iArrF3);
        ukl.d(iArrF3, iArrF, iArrF3);
        int[] iArrF4 = bhg.f();
        ukl.j(iArrF3, 11, iArrF4);
        ukl.d(iArrF4, iArrF3, iArrF4);
        ukl.j(iArrF4, 22, iArrF3);
        ukl.d(iArrF3, iArrF4, iArrF3);
        int[] iArrF5 = bhg.f();
        ukl.j(iArrF3, 44, iArrF5);
        ukl.d(iArrF5, iArrF3, iArrF5);
        int[] iArrF6 = bhg.f();
        ukl.j(iArrF5, 88, iArrF6);
        ukl.d(iArrF6, iArrF5, iArrF6);
        ukl.j(iArrF6, 44, iArrF5);
        ukl.d(iArrF5, iArrF3, iArrF5);
        ukl.j(iArrF5, 3, iArrF3);
        ukl.d(iArrF3, iArrF2, iArrF3);
        ukl.j(iArrF3, 23, iArrF3);
        ukl.d(iArrF3, iArrF4, iArrF3);
        ukl.j(iArrF3, 6, iArrF3);
        ukl.d(iArrF3, iArrF, iArrF3);
        ukl.j(iArrF3, 2, iArrF3);
        ukl.i(iArrF3, iArrF);
        if (bhg.k(iArr, iArrF)) {
            return new wkl(iArrF3);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrF = bhg.f();
        ukl.i(this.g, iArrF);
        return new wkl(iArrF);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrF = bhg.f();
        ukl.k(this.g, ((wkl) g87Var).g, iArrF);
        return new wkl(iArrF);
    }

    @Override // defpackage.g87
    public boolean s() {
        return bhg.o(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return bhg.H(this.g);
    }

    public wkl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.g = ukl.c(bigInteger);
    }

    public wkl(int[] iArr) {
        this.g = iArr;
    }
}
