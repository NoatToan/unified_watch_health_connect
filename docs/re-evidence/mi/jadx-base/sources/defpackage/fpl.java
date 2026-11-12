package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fpl extends h87 {
    public long[] g;

    public fpl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.g = dpl.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        long[] jArrA = ghg.a();
        dpl.a(this.g, ((fpl) h87Var).g, jArrA);
        return new fpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 b() {
        long[] jArrA = ghg.a();
        dpl.c(this.g, jArrA);
        return new fpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        return j(h87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fpl) {
            return ghg.c(this.g, ((fpl) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return 409;
    }

    @Override // defpackage.h87
    public h87 g() {
        long[] jArrA = ghg.a();
        dpl.j(this.g, jArrA);
        return new fpl(jArrA);
    }

    @Override // defpackage.h87
    public boolean h() {
        return ghg.e(this.g);
    }

    public int hashCode() {
        return wj1.o(this.g, 0, 7) ^ 4090087;
    }

    @Override // defpackage.h87
    public boolean i() {
        return ghg.f(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        long[] jArrA = ghg.a();
        dpl.k(this.g, ((fpl) h87Var).g, jArrA);
        return new fpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return l(h87Var, h87Var2, h87Var3);
    }

    @Override // defpackage.h87
    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((fpl) h87Var).g;
        long[] jArr3 = ((fpl) h87Var2).g;
        long[] jArr4 = ((fpl) h87Var3).g;
        long[] jArrJ = xgg.j(13);
        dpl.l(jArr, jArr2, jArrJ);
        dpl.l(jArr3, jArr4, jArrJ);
        long[] jArrA = ghg.a();
        dpl.m(jArrJ, jArrA);
        return new fpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 m() {
        return this;
    }

    @Override // defpackage.h87
    public h87 n() {
        long[] jArrA = ghg.a();
        dpl.o(this.g, jArrA);
        return new fpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 o() {
        long[] jArrA = ghg.a();
        dpl.p(this.g, jArrA);
        return new fpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 p(h87 h87Var, h87 h87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((fpl) h87Var).g;
        long[] jArr3 = ((fpl) h87Var2).g;
        long[] jArrJ = xgg.j(13);
        dpl.q(jArr, jArrJ);
        dpl.l(jArr2, jArr3, jArrJ);
        long[] jArrA = ghg.a();
        dpl.m(jArrJ, jArrA);
        return new fpl(jArrA);
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
        return ghg.g(this.g);
    }

    public fpl() {
        this.g = ghg.a();
    }

    public fpl(long[] jArr) {
        this.g = jArr;
    }
}
