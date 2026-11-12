package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class aml extends g87 {
    public long[] g;

    public aml() {
        this.g = sgg.d();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        long[] jArrD = sgg.d();
        yll.a(this.g, ((aml) g87Var).g, jArrD);
        return new aml(jArrD);
    }

    @Override // defpackage.g87
    public g87 b() {
        long[] jArrD = sgg.d();
        yll.c(this.g, jArrD);
        return new aml(jArrD);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        return j(g87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aml) {
            return sgg.h(this.g, ((aml) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return 113;
    }

    @Override // defpackage.g87
    public g87 g() {
        long[] jArrD = sgg.d();
        yll.h(this.g, jArrD);
        return new aml(jArrD);
    }

    @Override // defpackage.g87
    public boolean h() {
        return sgg.n(this.g);
    }

    public int hashCode() {
        return vj1.u(this.g, 0, 2) ^ 113009;
    }

    @Override // defpackage.g87
    public boolean i() {
        return sgg.p(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        long[] jArrD = sgg.d();
        yll.i(this.g, ((aml) g87Var).g, jArrD);
        return new aml(jArrD);
    }

    @Override // defpackage.g87
    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return l(g87Var, g87Var2, g87Var3);
    }

    @Override // defpackage.g87
    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((aml) g87Var).g;
        long[] jArr3 = ((aml) g87Var2).g;
        long[] jArr4 = ((aml) g87Var3).g;
        long[] jArrF = sgg.f();
        yll.j(jArr, jArr2, jArrF);
        yll.j(jArr3, jArr4, jArrF);
        long[] jArrD = sgg.d();
        yll.k(jArrF, jArrD);
        return new aml(jArrD);
    }

    @Override // defpackage.g87
    public g87 m() {
        return this;
    }

    @Override // defpackage.g87
    public g87 n() {
        long[] jArrD = sgg.d();
        yll.m(this.g, jArrD);
        return new aml(jArrD);
    }

    @Override // defpackage.g87
    public g87 o() {
        long[] jArrD = sgg.d();
        yll.n(this.g, jArrD);
        return new aml(jArrD);
    }

    @Override // defpackage.g87
    public g87 p(g87 g87Var, g87 g87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((aml) g87Var).g;
        long[] jArr3 = ((aml) g87Var2).g;
        long[] jArrF = sgg.f();
        yll.o(jArr, jArrF);
        yll.j(jArr2, jArr3, jArrF);
        long[] jArrD = sgg.d();
        yll.k(jArrF, jArrD);
        return new aml(jArrD);
    }

    @Override // defpackage.g87
    public g87 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrD = sgg.d();
        yll.p(this.g, i, jArrD);
        return new aml(jArrD);
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
        return sgg.w(this.g);
    }

    public aml(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.g = yll.d(bigInteger);
    }

    public aml(long[] jArr) {
        this.g = jArr;
    }
}
