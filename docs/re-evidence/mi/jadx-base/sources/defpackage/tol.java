package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class tol extends h87 {
    public long[] g;

    public tol(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.g = rol.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        long[] jArrA = chg.a();
        rol.a(this.g, ((tol) h87Var).g, jArrA);
        return new tol(jArrA);
    }

    @Override // defpackage.h87
    public h87 b() {
        long[] jArrA = chg.a();
        rol.c(this.g, jArrA);
        return new tol(jArrA);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        return j(h87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tol) {
            return chg.c(this.g, ((tol) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return 283;
    }

    @Override // defpackage.h87
    public h87 g() {
        long[] jArrA = chg.a();
        rol.j(this.g, jArrA);
        return new tol(jArrA);
    }

    @Override // defpackage.h87
    public boolean h() {
        return chg.e(this.g);
    }

    public int hashCode() {
        return wj1.o(this.g, 0, 5) ^ 2831275;
    }

    @Override // defpackage.h87
    public boolean i() {
        return chg.f(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        long[] jArrA = chg.a();
        rol.k(this.g, ((tol) h87Var).g, jArrA);
        return new tol(jArrA);
    }

    @Override // defpackage.h87
    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return l(h87Var, h87Var2, h87Var3);
    }

    @Override // defpackage.h87
    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((tol) h87Var).g;
        long[] jArr3 = ((tol) h87Var2).g;
        long[] jArr4 = ((tol) h87Var3).g;
        long[] jArrJ = xgg.j(9);
        rol.l(jArr, jArr2, jArrJ);
        rol.l(jArr3, jArr4, jArrJ);
        long[] jArrA = chg.a();
        rol.m(jArrJ, jArrA);
        return new tol(jArrA);
    }

    @Override // defpackage.h87
    public h87 m() {
        return this;
    }

    @Override // defpackage.h87
    public h87 n() {
        long[] jArrA = chg.a();
        rol.o(this.g, jArrA);
        return new tol(jArrA);
    }

    @Override // defpackage.h87
    public h87 o() {
        long[] jArrA = chg.a();
        rol.p(this.g, jArrA);
        return new tol(jArrA);
    }

    @Override // defpackage.h87
    public h87 p(h87 h87Var, h87 h87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((tol) h87Var).g;
        long[] jArr3 = ((tol) h87Var2).g;
        long[] jArrJ = xgg.j(9);
        rol.q(jArr, jArrJ);
        rol.l(jArr2, jArr3, jArrJ);
        long[] jArrA = chg.a();
        rol.m(jArrJ, jArrA);
        return new tol(jArrA);
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
        return chg.g(this.g);
    }

    public tol() {
        this.g = chg.a();
    }

    public tol(long[] jArr) {
        this.g = jArr;
    }
}
