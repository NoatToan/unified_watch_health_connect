package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class gpl extends g87 {
    public long[] g;

    public gpl() {
        this.g = hhg.a();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        long[] jArrA = hhg.a();
        epl.a(this.g, ((gpl) g87Var).g, jArrA);
        return new gpl(jArrA);
    }

    @Override // defpackage.g87
    public g87 b() {
        long[] jArrA = hhg.a();
        epl.c(this.g, jArrA);
        return new gpl(jArrA);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        return j(g87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpl) {
            return hhg.c(this.g, ((gpl) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return 409;
    }

    @Override // defpackage.g87
    public g87 g() {
        long[] jArrA = hhg.a();
        epl.j(this.g, jArrA);
        return new gpl(jArrA);
    }

    @Override // defpackage.g87
    public boolean h() {
        return hhg.e(this.g);
    }

    public int hashCode() {
        return vj1.u(this.g, 0, 7) ^ 4090087;
    }

    @Override // defpackage.g87
    public boolean i() {
        return hhg.f(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        long[] jArrA = hhg.a();
        epl.k(this.g, ((gpl) g87Var).g, jArrA);
        return new gpl(jArrA);
    }

    @Override // defpackage.g87
    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return l(g87Var, g87Var2, g87Var3);
    }

    @Override // defpackage.g87
    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((gpl) g87Var).g;
        long[] jArr3 = ((gpl) g87Var2).g;
        long[] jArr4 = ((gpl) g87Var3).g;
        long[] jArrJ = mhg.j(13);
        epl.l(jArr, jArr2, jArrJ);
        epl.l(jArr3, jArr4, jArrJ);
        long[] jArrA = hhg.a();
        epl.m(jArrJ, jArrA);
        return new gpl(jArrA);
    }

    @Override // defpackage.g87
    public g87 m() {
        return this;
    }

    @Override // defpackage.g87
    public g87 n() {
        long[] jArrA = hhg.a();
        epl.o(this.g, jArrA);
        return new gpl(jArrA);
    }

    @Override // defpackage.g87
    public g87 o() {
        long[] jArrA = hhg.a();
        epl.p(this.g, jArrA);
        return new gpl(jArrA);
    }

    @Override // defpackage.g87
    public g87 p(g87 g87Var, g87 g87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((gpl) g87Var).g;
        long[] jArr3 = ((gpl) g87Var2).g;
        long[] jArrJ = mhg.j(13);
        epl.q(jArr, jArrJ);
        epl.l(jArr2, jArr3, jArrJ);
        long[] jArrA = hhg.a();
        epl.m(jArrJ, jArrA);
        return new gpl(jArrA);
    }

    @Override // defpackage.g87
    public g87 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrA = hhg.a();
        epl.r(this.g, i, jArrA);
        return new gpl(jArrA);
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
        return hhg.g(this.g);
    }

    public gpl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.g = epl.d(bigInteger);
    }

    public gpl(long[] jArr) {
        this.g = jArr;
    }
}
