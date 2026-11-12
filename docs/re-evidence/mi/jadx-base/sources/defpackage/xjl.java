package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class xjl extends h87 {
    public static final BigInteger h = tjl.i;
    public int[] g;

    public xjl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.g = vjl.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrE = vgg.e();
        vjl.a(this.g, ((xjl) h87Var).g, iArrE);
        return new xjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrE = vgg.e();
        vjl.b(this.g, iArrE);
        return new xjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrE = vgg.e();
        v6g.d(vjl.f36953a, ((xjl) h87Var).g, iArrE);
        vjl.e(iArrE, this.g, iArrE);
        return new xjl(iArrE);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xjl) {
            return vgg.j(this.g, ((xjl) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.h87
    public h87 g() {
        int[] iArrE = vgg.e();
        v6g.d(vjl.f36953a, this.g, iArrE);
        return new xjl(iArrE);
    }

    @Override // defpackage.h87
    public boolean h() {
        return vgg.q(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ wj1.n(this.g, 0, 6);
    }

    @Override // defpackage.h87
    public boolean i() {
        return vgg.s(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        int[] iArrE = vgg.e();
        vjl.e(this.g, ((xjl) h87Var).g, iArrE);
        return new xjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrE = vgg.e();
        vjl.g(this.g, iArrE);
        return new xjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (vgg.s(iArr) || vgg.q(iArr)) {
            return this;
        }
        int[] iArrE = vgg.e();
        int[] iArrE2 = vgg.e();
        vjl.j(iArr, iArrE);
        vjl.e(iArrE, iArr, iArrE);
        vjl.k(iArrE, 2, iArrE2);
        vjl.e(iArrE2, iArrE, iArrE2);
        vjl.k(iArrE2, 4, iArrE);
        vjl.e(iArrE, iArrE2, iArrE);
        vjl.k(iArrE, 8, iArrE2);
        vjl.e(iArrE2, iArrE, iArrE2);
        vjl.k(iArrE2, 16, iArrE);
        vjl.e(iArrE, iArrE2, iArrE);
        vjl.k(iArrE, 32, iArrE2);
        vjl.e(iArrE2, iArrE, iArrE2);
        vjl.k(iArrE2, 64, iArrE);
        vjl.e(iArrE, iArrE2, iArrE);
        vjl.k(iArrE, 62, iArrE);
        vjl.j(iArrE, iArrE2);
        if (vgg.j(iArr, iArrE2)) {
            return new xjl(iArrE);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrE = vgg.e();
        vjl.j(this.g, iArrE);
        return new xjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrE = vgg.e();
        vjl.m(this.g, ((xjl) h87Var).g, iArrE);
        return new xjl(iArrE);
    }

    @Override // defpackage.h87
    public boolean r() {
        return vgg.n(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return vgg.F(this.g);
    }

    public xjl() {
        this.g = vgg.e();
    }

    public xjl(int[] iArr) {
        this.g = iArr;
    }
}
