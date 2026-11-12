package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class zll extends h87 {
    public long[] g;

    public zll(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.g = xll.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        long[] jArrD = rgg.d();
        xll.a(this.g, ((zll) h87Var).g, jArrD);
        return new zll(jArrD);
    }

    @Override // defpackage.h87
    public h87 b() {
        long[] jArrD = rgg.d();
        xll.c(this.g, jArrD);
        return new zll(jArrD);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        return j(h87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zll) {
            return rgg.h(this.g, ((zll) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return 113;
    }

    @Override // defpackage.h87
    public h87 g() {
        long[] jArrD = rgg.d();
        xll.h(this.g, jArrD);
        return new zll(jArrD);
    }

    @Override // defpackage.h87
    public boolean h() {
        return rgg.n(this.g);
    }

    public int hashCode() {
        return wj1.o(this.g, 0, 2) ^ 113009;
    }

    @Override // defpackage.h87
    public boolean i() {
        return rgg.p(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        long[] jArrD = rgg.d();
        xll.i(this.g, ((zll) h87Var).g, jArrD);
        return new zll(jArrD);
    }

    @Override // defpackage.h87
    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return l(h87Var, h87Var2, h87Var3);
    }

    @Override // defpackage.h87
    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((zll) h87Var).g;
        long[] jArr3 = ((zll) h87Var2).g;
        long[] jArr4 = ((zll) h87Var3).g;
        long[] jArrF = rgg.f();
        xll.j(jArr, jArr2, jArrF);
        xll.j(jArr3, jArr4, jArrF);
        long[] jArrD = rgg.d();
        xll.k(jArrF, jArrD);
        return new zll(jArrD);
    }

    @Override // defpackage.h87
    public h87 m() {
        return this;
    }

    @Override // defpackage.h87
    public h87 n() {
        long[] jArrD = rgg.d();
        xll.m(this.g, jArrD);
        return new zll(jArrD);
    }

    @Override // defpackage.h87
    public h87 o() {
        long[] jArrD = rgg.d();
        xll.n(this.g, jArrD);
        return new zll(jArrD);
    }

    @Override // defpackage.h87
    public h87 p(h87 h87Var, h87 h87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((zll) h87Var).g;
        long[] jArr3 = ((zll) h87Var2).g;
        long[] jArrF = rgg.f();
        xll.o(jArr, jArrF);
        xll.j(jArr2, jArr3, jArrF);
        long[] jArrD = rgg.d();
        xll.k(jArrF, jArrD);
        return new zll(jArrD);
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
        return rgg.w(this.g);
    }

    public zll() {
        this.g = rgg.d();
    }

    public zll(long[] jArr) {
        this.g = jArr;
    }
}
