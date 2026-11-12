package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class mol extends g87 {
    public long[] g;

    public mol() {
        this.g = bhg.g();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        long[] jArrG = bhg.g();
        kol.a(this.g, ((mol) g87Var).g, jArrG);
        return new mol(jArrG);
    }

    @Override // defpackage.g87
    public g87 b() {
        long[] jArrG = bhg.g();
        kol.c(this.g, jArrG);
        return new mol(jArrG);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        return j(g87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mol) {
            return bhg.l(this.g, ((mol) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return 239;
    }

    @Override // defpackage.g87
    public g87 g() {
        long[] jArrG = bhg.g();
        kol.j(this.g, jArrG);
        return new mol(jArrG);
    }

    @Override // defpackage.g87
    public boolean h() {
        return bhg.s(this.g);
    }

    public int hashCode() {
        return vj1.u(this.g, 0, 4) ^ 23900158;
    }

    @Override // defpackage.g87
    public boolean i() {
        return bhg.u(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        long[] jArrG = bhg.g();
        kol.k(this.g, ((mol) g87Var).g, jArrG);
        return new mol(jArrG);
    }

    @Override // defpackage.g87
    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return l(g87Var, g87Var2, g87Var3);
    }

    @Override // defpackage.g87
    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((mol) g87Var).g;
        long[] jArr3 = ((mol) g87Var2).g;
        long[] jArr4 = ((mol) g87Var3).g;
        long[] jArrI = bhg.i();
        kol.l(jArr, jArr2, jArrI);
        kol.l(jArr3, jArr4, jArrI);
        long[] jArrG = bhg.g();
        kol.m(jArrI, jArrG);
        return new mol(jArrG);
    }

    @Override // defpackage.g87
    public g87 m() {
        return this;
    }

    @Override // defpackage.g87
    public g87 n() {
        long[] jArrG = bhg.g();
        kol.o(this.g, jArrG);
        return new mol(jArrG);
    }

    @Override // defpackage.g87
    public g87 o() {
        long[] jArrG = bhg.g();
        kol.p(this.g, jArrG);
        return new mol(jArrG);
    }

    @Override // defpackage.g87
    public g87 p(g87 g87Var, g87 g87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((mol) g87Var).g;
        long[] jArr3 = ((mol) g87Var2).g;
        long[] jArrI = bhg.i();
        kol.q(jArr, jArrI);
        kol.l(jArr2, jArr3, jArrI);
        long[] jArrG = bhg.g();
        kol.m(jArrI, jArrG);
        return new mol(jArrG);
    }

    @Override // defpackage.g87
    public g87 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrG = bhg.g();
        kol.r(this.g, i, jArrG);
        return new mol(jArrG);
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

    public mol(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.g = kol.d(bigInteger);
    }

    public mol(long[] jArr) {
        this.g = jArr;
    }
}
