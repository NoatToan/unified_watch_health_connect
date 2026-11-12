package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class qjl extends g87 {
    public static final BigInteger h = mjl.j;
    public int[] g;

    public qjl() {
        this.g = wgg.e();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrE = wgg.e();
        ojl.a(this.g, ((qjl) g87Var).g, iArrE);
        return new qjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrE = wgg.e();
        ojl.b(this.g, iArrE);
        return new qjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrE = wgg.e();
        w6g.d(ojl.f29226a, ((qjl) g87Var).g, iArrE);
        ojl.d(iArrE, this.g, iArrE);
        return new qjl(iArrE);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qjl) {
            return wgg.j(this.g, ((qjl) obj).g);
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
        w6g.d(ojl.f29226a, this.g, iArrE);
        return new qjl(iArrE);
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
        ojl.d(this.g, ((qjl) g87Var).g, iArrE);
        return new qjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrE = wgg.e();
        ojl.f(this.g, iArrE);
        return new qjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (wgg.s(iArr) || wgg.q(iArr)) {
            return this;
        }
        int[] iArrE = wgg.e();
        ojl.i(iArr, iArrE);
        ojl.d(iArrE, iArr, iArrE);
        int[] iArrE2 = wgg.e();
        ojl.i(iArrE, iArrE2);
        ojl.d(iArrE2, iArr, iArrE2);
        int[] iArrE3 = wgg.e();
        ojl.j(iArrE2, 3, iArrE3);
        ojl.d(iArrE3, iArrE2, iArrE3);
        ojl.j(iArrE3, 2, iArrE3);
        ojl.d(iArrE3, iArrE, iArrE3);
        ojl.j(iArrE3, 8, iArrE);
        ojl.d(iArrE, iArrE3, iArrE);
        ojl.j(iArrE, 3, iArrE3);
        ojl.d(iArrE3, iArrE2, iArrE3);
        int[] iArrE4 = wgg.e();
        ojl.j(iArrE3, 16, iArrE4);
        ojl.d(iArrE4, iArrE, iArrE4);
        ojl.j(iArrE4, 35, iArrE);
        ojl.d(iArrE, iArrE4, iArrE);
        ojl.j(iArrE, 70, iArrE4);
        ojl.d(iArrE4, iArrE, iArrE4);
        ojl.j(iArrE4, 19, iArrE);
        ojl.d(iArrE, iArrE3, iArrE);
        ojl.j(iArrE, 20, iArrE);
        ojl.d(iArrE, iArrE3, iArrE);
        ojl.j(iArrE, 4, iArrE);
        ojl.d(iArrE, iArrE2, iArrE);
        ojl.j(iArrE, 6, iArrE);
        ojl.d(iArrE, iArrE2, iArrE);
        ojl.i(iArrE, iArrE);
        ojl.i(iArrE, iArrE2);
        if (wgg.j(iArr, iArrE2)) {
            return new qjl(iArrE);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrE = wgg.e();
        ojl.i(this.g, iArrE);
        return new qjl(iArrE);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrE = wgg.e();
        ojl.k(this.g, ((qjl) g87Var).g, iArrE);
        return new qjl(iArrE);
    }

    @Override // defpackage.g87
    public boolean s() {
        return wgg.n(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return wgg.F(this.g);
    }

    public qjl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.g = ojl.c(bigInteger);
    }

    public qjl(int[] iArr) {
        this.g = iArr;
    }
}
