package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class lml extends h87 {
    public long[] g;

    public lml(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.g = jml.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        long[] jArrF = vgg.f();
        jml.a(this.g, ((lml) h87Var).g, jArrF);
        return new lml(jArrF);
    }

    @Override // defpackage.h87
    public h87 b() {
        long[] jArrF = vgg.f();
        jml.c(this.g, jArrF);
        return new lml(jArrF);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        return j(h87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lml) {
            return vgg.k(this.g, ((lml) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return 131;
    }

    @Override // defpackage.h87
    public h87 g() {
        long[] jArrF = vgg.f();
        jml.i(this.g, jArrF);
        return new lml(jArrF);
    }

    @Override // defpackage.h87
    public boolean h() {
        return vgg.r(this.g);
    }

    public int hashCode() {
        return wj1.o(this.g, 0, 3) ^ 131832;
    }

    @Override // defpackage.h87
    public boolean i() {
        return vgg.t(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        long[] jArrF = vgg.f();
        jml.j(this.g, ((lml) h87Var).g, jArrF);
        return new lml(jArrF);
    }

    @Override // defpackage.h87
    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return l(h87Var, h87Var2, h87Var3);
    }

    @Override // defpackage.h87
    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((lml) h87Var).g;
        long[] jArr3 = ((lml) h87Var2).g;
        long[] jArr4 = ((lml) h87Var3).g;
        long[] jArrJ = xgg.j(5);
        jml.k(jArr, jArr2, jArrJ);
        jml.k(jArr3, jArr4, jArrJ);
        long[] jArrF = vgg.f();
        jml.l(jArrJ, jArrF);
        return new lml(jArrF);
    }

    @Override // defpackage.h87
    public h87 m() {
        return this;
    }

    @Override // defpackage.h87
    public h87 n() {
        long[] jArrF = vgg.f();
        jml.n(this.g, jArrF);
        return new lml(jArrF);
    }

    @Override // defpackage.h87
    public h87 o() {
        long[] jArrF = vgg.f();
        jml.o(this.g, jArrF);
        return new lml(jArrF);
    }

    @Override // defpackage.h87
    public h87 p(h87 h87Var, h87 h87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((lml) h87Var).g;
        long[] jArr3 = ((lml) h87Var2).g;
        long[] jArrJ = xgg.j(5);
        jml.p(jArr, jArrJ);
        jml.k(jArr2, jArr3, jArrJ);
        long[] jArrF = vgg.f();
        jml.l(jArrJ, jArrF);
        return new lml(jArrF);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        return a(h87Var);
    }

    @Override // defpackage.h87
    public boolean r() {
        return (this.g[0] & 1) != 0;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return vgg.G(this.g);
    }

    public lml() {
        this.g = vgg.f();
    }

    public lml(long[] jArr) {
        this.g = jArr;
    }
}
