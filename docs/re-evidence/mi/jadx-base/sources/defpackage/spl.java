package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class spl extends g87 {
    public long[] g;

    public spl() {
        this.g = lhg.a();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        long[] jArrA = lhg.a();
        qpl.b(this.g, ((spl) g87Var).g, jArrA);
        return new spl(jArrA);
    }

    @Override // defpackage.g87
    public g87 b() {
        long[] jArrA = lhg.a();
        qpl.f(this.g, jArrA);
        return new spl(jArrA);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        return j(g87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spl) {
            return lhg.c(this.g, ((spl) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return 571;
    }

    @Override // defpackage.g87
    public g87 g() {
        long[] jArrA = lhg.a();
        qpl.k(this.g, jArrA);
        return new spl(jArrA);
    }

    @Override // defpackage.g87
    public boolean h() {
        return lhg.e(this.g);
    }

    public int hashCode() {
        return vj1.u(this.g, 0, 9) ^ 5711052;
    }

    @Override // defpackage.g87
    public boolean i() {
        return lhg.f(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        long[] jArrA = lhg.a();
        qpl.l(this.g, ((spl) g87Var).g, jArrA);
        return new spl(jArrA);
    }

    @Override // defpackage.g87
    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return l(g87Var, g87Var2, g87Var3);
    }

    @Override // defpackage.g87
    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((spl) g87Var).g;
        long[] jArr3 = ((spl) g87Var2).g;
        long[] jArr4 = ((spl) g87Var3).g;
        long[] jArrB = lhg.b();
        qpl.m(jArr, jArr2, jArrB);
        qpl.m(jArr3, jArr4, jArrB);
        long[] jArrA = lhg.a();
        qpl.q(jArrB, jArrA);
        return new spl(jArrA);
    }

    @Override // defpackage.g87
    public g87 m() {
        return this;
    }

    @Override // defpackage.g87
    public g87 n() {
        long[] jArrA = lhg.a();
        qpl.s(this.g, jArrA);
        return new spl(jArrA);
    }

    @Override // defpackage.g87
    public g87 o() {
        long[] jArrA = lhg.a();
        qpl.t(this.g, jArrA);
        return new spl(jArrA);
    }

    @Override // defpackage.g87
    public g87 p(g87 g87Var, g87 g87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((spl) g87Var).g;
        long[] jArr3 = ((spl) g87Var2).g;
        long[] jArrB = lhg.b();
        qpl.u(jArr, jArrB);
        qpl.m(jArr2, jArr3, jArrB);
        long[] jArrA = lhg.a();
        qpl.q(jArrB, jArrA);
        return new spl(jArrA);
    }

    @Override // defpackage.g87
    public g87 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrA = lhg.a();
        qpl.v(this.g, i, jArrA);
        return new spl(jArrA);
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
        return lhg.g(this.g);
    }

    public spl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.g = qpl.g(bigInteger);
    }

    public spl(long[] jArr) {
        this.g = jArr;
    }
}
