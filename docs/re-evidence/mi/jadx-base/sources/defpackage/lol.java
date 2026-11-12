package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class lol extends h87 {
    public long[] g;

    public lol(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.g = jol.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        long[] jArrG = ahg.g();
        jol.a(this.g, ((lol) h87Var).g, jArrG);
        return new lol(jArrG);
    }

    @Override // defpackage.h87
    public h87 b() {
        long[] jArrG = ahg.g();
        jol.c(this.g, jArrG);
        return new lol(jArrG);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        return j(h87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lol) {
            return ahg.l(this.g, ((lol) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return 239;
    }

    @Override // defpackage.h87
    public h87 g() {
        long[] jArrG = ahg.g();
        jol.j(this.g, jArrG);
        return new lol(jArrG);
    }

    @Override // defpackage.h87
    public boolean h() {
        return ahg.s(this.g);
    }

    public int hashCode() {
        return wj1.o(this.g, 0, 4) ^ 23900158;
    }

    @Override // defpackage.h87
    public boolean i() {
        return ahg.u(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        long[] jArrG = ahg.g();
        jol.k(this.g, ((lol) h87Var).g, jArrG);
        return new lol(jArrG);
    }

    @Override // defpackage.h87
    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return l(h87Var, h87Var2, h87Var3);
    }

    @Override // defpackage.h87
    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((lol) h87Var).g;
        long[] jArr3 = ((lol) h87Var2).g;
        long[] jArr4 = ((lol) h87Var3).g;
        long[] jArrI = ahg.i();
        jol.l(jArr, jArr2, jArrI);
        jol.l(jArr3, jArr4, jArrI);
        long[] jArrG = ahg.g();
        jol.m(jArrI, jArrG);
        return new lol(jArrG);
    }

    @Override // defpackage.h87
    public h87 m() {
        return this;
    }

    @Override // defpackage.h87
    public h87 n() {
        long[] jArrG = ahg.g();
        jol.o(this.g, jArrG);
        return new lol(jArrG);
    }

    @Override // defpackage.h87
    public h87 o() {
        long[] jArrG = ahg.g();
        jol.p(this.g, jArrG);
        return new lol(jArrG);
    }

    @Override // defpackage.h87
    public h87 p(h87 h87Var, h87 h87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((lol) h87Var).g;
        long[] jArr3 = ((lol) h87Var2).g;
        long[] jArrI = ahg.i();
        jol.q(jArr, jArrI);
        jol.l(jArr2, jArr3, jArrI);
        long[] jArrG = ahg.g();
        jol.m(jArrI, jArrG);
        return new lol(jArrG);
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
        return ahg.I(this.g);
    }

    public lol() {
        this.g = ahg.g();
    }

    public lol(long[] jArr) {
        this.g = jArr;
    }
}
