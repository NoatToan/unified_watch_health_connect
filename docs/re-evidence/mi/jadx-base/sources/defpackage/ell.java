package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ell extends g87 {
    public static final BigInteger h = all.j;
    public int[] g;

    public ell() {
        this.g = bhg.f();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrF = bhg.f();
        cll.a(this.g, ((ell) g87Var).g, iArrF);
        return new ell(iArrF);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrF = bhg.f();
        cll.b(this.g, iArrF);
        return new ell(iArrF);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrF = bhg.f();
        w6g.d(cll.f5460a, ((ell) g87Var).g, iArrF);
        cll.e(iArrF, this.g, iArrF);
        return new ell(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ell) {
            return bhg.k(this.g, ((ell) obj).g);
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
        w6g.d(cll.f5460a, this.g, iArrF);
        return new ell(iArrF);
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
        cll.e(this.g, ((ell) g87Var).g, iArrF);
        return new ell(iArrF);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrF = bhg.f();
        cll.g(this.g, iArrF);
        return new ell(iArrF);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (bhg.t(iArr) || bhg.r(iArr)) {
            return this;
        }
        int[] iArrF = bhg.f();
        int[] iArrF2 = bhg.f();
        cll.j(iArr, iArrF);
        cll.e(iArrF, iArr, iArrF);
        cll.k(iArrF, 2, iArrF2);
        cll.e(iArrF2, iArrF, iArrF2);
        cll.k(iArrF2, 4, iArrF);
        cll.e(iArrF, iArrF2, iArrF);
        cll.k(iArrF, 8, iArrF2);
        cll.e(iArrF2, iArrF, iArrF2);
        cll.k(iArrF2, 16, iArrF);
        cll.e(iArrF, iArrF2, iArrF);
        cll.k(iArrF, 32, iArrF);
        cll.e(iArrF, iArr, iArrF);
        cll.k(iArrF, 96, iArrF);
        cll.e(iArrF, iArr, iArrF);
        cll.k(iArrF, 94, iArrF);
        cll.j(iArrF, iArrF2);
        if (bhg.k(iArr, iArrF2)) {
            return new ell(iArrF);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrF = bhg.f();
        cll.j(this.g, iArrF);
        return new ell(iArrF);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrF = bhg.f();
        cll.m(this.g, ((ell) g87Var).g, iArrF);
        return new ell(iArrF);
    }

    @Override // defpackage.g87
    public boolean s() {
        return bhg.o(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return bhg.H(this.g);
    }

    public ell(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.g = cll.d(bigInteger);
    }

    public ell(int[] iArr) {
        this.g = iArr;
    }
}
