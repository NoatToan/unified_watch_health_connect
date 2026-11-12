package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class aol extends g87 {
    public long[] g;

    public aol() {
        this.g = bhg.g();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        long[] jArrG = bhg.g();
        ynl.a(this.g, ((aol) g87Var).g, jArrG);
        return new aol(jArrG);
    }

    @Override // defpackage.g87
    public g87 b() {
        long[] jArrG = bhg.g();
        ynl.c(this.g, jArrG);
        return new aol(jArrG);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        return j(g87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aol) {
            return bhg.l(this.g, ((aol) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return 233;
    }

    @Override // defpackage.g87
    public g87 g() {
        long[] jArrG = bhg.g();
        ynl.j(this.g, jArrG);
        return new aol(jArrG);
    }

    @Override // defpackage.g87
    public boolean h() {
        return bhg.s(this.g);
    }

    public int hashCode() {
        return vj1.u(this.g, 0, 4) ^ 2330074;
    }

    @Override // defpackage.g87
    public boolean i() {
        return bhg.u(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        long[] jArrG = bhg.g();
        ynl.k(this.g, ((aol) g87Var).g, jArrG);
        return new aol(jArrG);
    }

    @Override // defpackage.g87
    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return l(g87Var, g87Var2, g87Var3);
    }

    @Override // defpackage.g87
    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((aol) g87Var).g;
        long[] jArr3 = ((aol) g87Var2).g;
        long[] jArr4 = ((aol) g87Var3).g;
        long[] jArrI = bhg.i();
        ynl.l(jArr, jArr2, jArrI);
        ynl.l(jArr3, jArr4, jArrI);
        long[] jArrG = bhg.g();
        ynl.m(jArrI, jArrG);
        return new aol(jArrG);
    }

    @Override // defpackage.g87
    public g87 m() {
        return this;
    }

    @Override // defpackage.g87
    public g87 n() {
        long[] jArrG = bhg.g();
        ynl.o(this.g, jArrG);
        return new aol(jArrG);
    }

    @Override // defpackage.g87
    public g87 o() {
        long[] jArrG = bhg.g();
        ynl.p(this.g, jArrG);
        return new aol(jArrG);
    }

    @Override // defpackage.g87
    public g87 p(g87 g87Var, g87 g87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((aol) g87Var).g;
        long[] jArr3 = ((aol) g87Var2).g;
        long[] jArrI = bhg.i();
        ynl.q(jArr, jArrI);
        ynl.l(jArr2, jArr3, jArrI);
        long[] jArrG = bhg.g();
        ynl.m(jArrI, jArrG);
        return new aol(jArrG);
    }

    @Override // defpackage.g87
    public g87 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrG = bhg.g();
        ynl.r(this.g, i, jArrG);
        return new aol(jArrG);
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
        return bhg.I(this.g);
    }

    public aol(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.g = ynl.d(bigInteger);
    }

    public aol(long[] jArr) {
        this.g = jArr;
    }
}
