package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends g87 {
    public long[] g;

    public mml() {
        this.g = wgg.f();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        long[] jArrF = wgg.f();
        kml.a(this.g, ((mml) g87Var).g, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public g87 b() {
        long[] jArrF = wgg.f();
        kml.c(this.g, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        return j(g87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mml) {
            return wgg.k(this.g, ((mml) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return 131;
    }

    @Override // defpackage.g87
    public g87 g() {
        long[] jArrF = wgg.f();
        kml.i(this.g, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public boolean h() {
        return wgg.r(this.g);
    }

    public int hashCode() {
        return vj1.u(this.g, 0, 3) ^ 131832;
    }

    @Override // defpackage.g87
    public boolean i() {
        return wgg.t(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        long[] jArrF = wgg.f();
        kml.j(this.g, ((mml) g87Var).g, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return l(g87Var, g87Var2, g87Var3);
    }

    @Override // defpackage.g87
    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((mml) g87Var).g;
        long[] jArr3 = ((mml) g87Var2).g;
        long[] jArr4 = ((mml) g87Var3).g;
        long[] jArrJ = mhg.j(5);
        kml.k(jArr, jArr2, jArrJ);
        kml.k(jArr3, jArr4, jArrJ);
        long[] jArrF = wgg.f();
        kml.l(jArrJ, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public g87 m() {
        return this;
    }

    @Override // defpackage.g87
    public g87 n() {
        long[] jArrF = wgg.f();
        kml.n(this.g, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public g87 o() {
        long[] jArrF = wgg.f();
        kml.o(this.g, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public g87 p(g87 g87Var, g87 g87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((mml) g87Var).g;
        long[] jArr3 = ((mml) g87Var2).g;
        long[] jArrJ = mhg.j(5);
        kml.p(jArr, jArrJ);
        kml.k(jArr2, jArr3, jArrJ);
        long[] jArrF = wgg.f();
        kml.l(jArrJ, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public g87 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrF = wgg.f();
        kml.q(this.g, i, jArrF);
        return new mml(jArrF);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        return a(g87Var);
    }

    @Override // defpackage.g87
    public boolean s() {
        return (this.g[0] & 1) != 0;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return wgg.G(this.g);
    }

    public mml(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.g = kml.d(bigInteger);
    }

    public mml(long[] jArr) {
        this.g = jArr;
    }
}
