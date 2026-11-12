package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class yjl extends g87 {
    public static final BigInteger h = ujl.j;
    public int[] g;

    public yjl() {
        this.g = wgg.e();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrE = wgg.e();
        wjl.a(this.g, ((yjl) g87Var).g, iArrE);
        return new yjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrE = wgg.e();
        wjl.b(this.g, iArrE);
        return new yjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrE = wgg.e();
        w6g.d(wjl.f38034a, ((yjl) g87Var).g, iArrE);
        wjl.e(iArrE, this.g, iArrE);
        return new yjl(iArrE);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yjl) {
            return wgg.j(this.g, ((yjl) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrE = wgg.e();
        w6g.d(wjl.f38034a, this.g, iArrE);
        return new yjl(iArrE);
    }

    @Override // defpackage.g87
    public boolean h() {
        return wgg.q(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 6);
    }

    @Override // defpackage.g87
    public boolean i() {
        return wgg.s(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrE = wgg.e();
        wjl.e(this.g, ((yjl) g87Var).g, iArrE);
        return new yjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrE = wgg.e();
        wjl.g(this.g, iArrE);
        return new yjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (wgg.s(iArr) || wgg.q(iArr)) {
            return this;
        }
        int[] iArrE = wgg.e();
        int[] iArrE2 = wgg.e();
        wjl.j(iArr, iArrE);
        wjl.e(iArrE, iArr, iArrE);
        wjl.k(iArrE, 2, iArrE2);
        wjl.e(iArrE2, iArrE, iArrE2);
        wjl.k(iArrE2, 4, iArrE);
        wjl.e(iArrE, iArrE2, iArrE);
        wjl.k(iArrE, 8, iArrE2);
        wjl.e(iArrE2, iArrE, iArrE2);
        wjl.k(iArrE2, 16, iArrE);
        wjl.e(iArrE, iArrE2, iArrE);
        wjl.k(iArrE, 32, iArrE2);
        wjl.e(iArrE2, iArrE, iArrE2);
        wjl.k(iArrE2, 64, iArrE);
        wjl.e(iArrE, iArrE2, iArrE);
        wjl.k(iArrE, 62, iArrE);
        wjl.j(iArrE, iArrE2);
        if (wgg.j(iArr, iArrE2)) {
            return new yjl(iArrE);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrE = wgg.e();
        wjl.j(this.g, iArrE);
        return new yjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrE = wgg.e();
        wjl.m(this.g, ((yjl) g87Var).g, iArrE);
        return new yjl(iArrE);
    }

    @Override // defpackage.g87
    public boolean s() {
        return wgg.n(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return wgg.F(this.g);
    }

    public yjl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.g = wjl.d(bigInteger);
    }

    public yjl(int[] iArr) {
        this.g = iArr;
    }
}
