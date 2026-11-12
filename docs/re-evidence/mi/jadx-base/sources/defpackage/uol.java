package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class uol extends g87 {
    public long[] g;

    public uol() {
        this.g = dhg.a();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        long[] jArrA = dhg.a();
        sol.a(this.g, ((uol) g87Var).g, jArrA);
        return new uol(jArrA);
    }

    @Override // defpackage.g87
    public g87 b() {
        long[] jArrA = dhg.a();
        sol.c(this.g, jArrA);
        return new uol(jArrA);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        return j(g87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uol) {
            return dhg.c(this.g, ((uol) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return 283;
    }

    @Override // defpackage.g87
    public g87 g() {
        long[] jArrA = dhg.a();
        sol.j(this.g, jArrA);
        return new uol(jArrA);
    }

    @Override // defpackage.g87
    public boolean h() {
        return dhg.e(this.g);
    }

    public int hashCode() {
        return vj1.u(this.g, 0, 5) ^ 2831275;
    }

    @Override // defpackage.g87
    public boolean i() {
        return dhg.f(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        long[] jArrA = dhg.a();
        sol.k(this.g, ((uol) g87Var).g, jArrA);
        return new uol(jArrA);
    }

    @Override // defpackage.g87
    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return l(g87Var, g87Var2, g87Var3);
    }

    @Override // defpackage.g87
    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((uol) g87Var).g;
        long[] jArr3 = ((uol) g87Var2).g;
        long[] jArr4 = ((uol) g87Var3).g;
        long[] jArrJ = mhg.j(9);
        sol.l(jArr, jArr2, jArrJ);
        sol.l(jArr3, jArr4, jArrJ);
        long[] jArrA = dhg.a();
        sol.m(jArrJ, jArrA);
        return new uol(jArrA);
    }

    @Override // defpackage.g87
    public g87 m() {
        return this;
    }

    @Override // defpackage.g87
    public g87 n() {
        long[] jArrA = dhg.a();
        sol.o(this.g, jArrA);
        return new uol(jArrA);
    }

    @Override // defpackage.g87
    public g87 o() {
        long[] jArrA = dhg.a();
        sol.p(this.g, jArrA);
        return new uol(jArrA);
    }

    @Override // defpackage.g87
    public g87 p(g87 g87Var, g87 g87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((uol) g87Var).g;
        long[] jArr3 = ((uol) g87Var2).g;
        long[] jArrJ = mhg.j(9);
        sol.q(jArr, jArrJ);
        sol.l(jArr2, jArr3, jArrJ);
        long[] jArrA = dhg.a();
        sol.m(jArrJ, jArrA);
        return new uol(jArrA);
    }

    @Override // defpackage.g87
    public g87 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrA = dhg.a();
        sol.r(this.g, i, jArrA);
        return new uol(jArrA);
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
        return dhg.g(this.g);
    }

    public uol(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.g = sol.d(bigInteger);
    }

    public uol(long[] jArr) {
        this.g = jArr;
    }
}
