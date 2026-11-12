package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class pjl extends h87 {
    public static final BigInteger h = ljl.i;
    public int[] g;

    public pjl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.g = njl.c(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrE = vgg.e();
        njl.a(this.g, ((pjl) h87Var).g, iArrE);
        return new pjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrE = vgg.e();
        njl.b(this.g, iArrE);
        return new pjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrE = vgg.e();
        v6g.d(njl.f27986a, ((pjl) h87Var).g, iArrE);
        njl.d(iArrE, this.g, iArrE);
        return new pjl(iArrE);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pjl) {
            return vgg.j(this.g, ((pjl) obj).g);
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
        v6g.d(njl.f27986a, this.g, iArrE);
        return new pjl(iArrE);
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
        njl.d(this.g, ((pjl) h87Var).g, iArrE);
        return new pjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrE = vgg.e();
        njl.f(this.g, iArrE);
        return new pjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (vgg.s(iArr) || vgg.q(iArr)) {
            return this;
        }
        int[] iArrE = vgg.e();
        njl.i(iArr, iArrE);
        njl.d(iArrE, iArr, iArrE);
        int[] iArrE2 = vgg.e();
        njl.i(iArrE, iArrE2);
        njl.d(iArrE2, iArr, iArrE2);
        int[] iArrE3 = vgg.e();
        njl.j(iArrE2, 3, iArrE3);
        njl.d(iArrE3, iArrE2, iArrE3);
        njl.j(iArrE3, 2, iArrE3);
        njl.d(iArrE3, iArrE, iArrE3);
        njl.j(iArrE3, 8, iArrE);
        njl.d(iArrE, iArrE3, iArrE);
        njl.j(iArrE, 3, iArrE3);
        njl.d(iArrE3, iArrE2, iArrE3);
        int[] iArrE4 = vgg.e();
        njl.j(iArrE3, 16, iArrE4);
        njl.d(iArrE4, iArrE, iArrE4);
        njl.j(iArrE4, 35, iArrE);
        njl.d(iArrE, iArrE4, iArrE);
        njl.j(iArrE, 70, iArrE4);
        njl.d(iArrE4, iArrE, iArrE4);
        njl.j(iArrE4, 19, iArrE);
        njl.d(iArrE, iArrE3, iArrE);
        njl.j(iArrE, 20, iArrE);
        njl.d(iArrE, iArrE3, iArrE);
        njl.j(iArrE, 4, iArrE);
        njl.d(iArrE, iArrE2, iArrE);
        njl.j(iArrE, 6, iArrE);
        njl.d(iArrE, iArrE2, iArrE);
        njl.i(iArrE, iArrE);
        njl.i(iArrE, iArrE2);
        if (vgg.j(iArr, iArrE2)) {
            return new pjl(iArrE);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrE = vgg.e();
        njl.i(this.g, iArrE);
        return new pjl(iArrE);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrE = vgg.e();
        njl.k(this.g, ((pjl) h87Var).g, iArrE);
        return new pjl(iArrE);
    }

    @Override // defpackage.h87
    public boolean r() {
        return vgg.n(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return vgg.F(this.g);
    }

    public pjl() {
        this.g = vgg.e();
    }

    public pjl(int[] iArr) {
        this.g = iArr;
    }
}
