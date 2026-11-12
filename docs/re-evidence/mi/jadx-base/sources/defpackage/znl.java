package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class znl extends h87 {
    public long[] g;

    public znl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.g = xnl.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        long[] jArrG = ahg.g();
        xnl.a(this.g, ((znl) h87Var).g, jArrG);
        return new znl(jArrG);
    }

    @Override // defpackage.h87
    public h87 b() {
        long[] jArrG = ahg.g();
        xnl.c(this.g, jArrG);
        return new znl(jArrG);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        return j(h87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof znl) {
            return ahg.l(this.g, ((znl) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return 233;
    }

    @Override // defpackage.h87
    public h87 g() {
        long[] jArrG = ahg.g();
        xnl.j(this.g, jArrG);
        return new znl(jArrG);
    }

    @Override // defpackage.h87
    public boolean h() {
        return ahg.s(this.g);
    }

    public int hashCode() {
        return wj1.o(this.g, 0, 4) ^ 2330074;
    }

    @Override // defpackage.h87
    public boolean i() {
        return ahg.u(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        long[] jArrG = ahg.g();
        xnl.k(this.g, ((znl) h87Var).g, jArrG);
        return new znl(jArrG);
    }

    @Override // defpackage.h87
    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return l(h87Var, h87Var2, h87Var3);
    }

    @Override // defpackage.h87
    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((znl) h87Var).g;
        long[] jArr3 = ((znl) h87Var2).g;
        long[] jArr4 = ((znl) h87Var3).g;
        long[] jArrI = ahg.i();
        xnl.l(jArr, jArr2, jArrI);
        xnl.l(jArr3, jArr4, jArrI);
        long[] jArrG = ahg.g();
        xnl.m(jArrI, jArrG);
        return new znl(jArrG);
    }

    @Override // defpackage.h87
    public h87 m() {
        return this;
    }

    @Override // defpackage.h87
    public h87 n() {
        long[] jArrG = ahg.g();
        xnl.o(this.g, jArrG);
        return new znl(jArrG);
    }

    @Override // defpackage.h87
    public h87 o() {
        long[] jArrG = ahg.g();
        xnl.p(this.g, jArrG);
        return new znl(jArrG);
    }

    @Override // defpackage.h87
    public h87 p(h87 h87Var, h87 h87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((znl) h87Var).g;
        long[] jArr3 = ((znl) h87Var2).g;
        long[] jArrI = ahg.i();
        xnl.q(jArr, jArrI);
        xnl.l(jArr2, jArr3, jArrI);
        long[] jArrG = ahg.g();
        xnl.m(jArrI, jArrG);
        return new znl(jArrG);
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

    public znl() {
        this.g = ahg.g();
    }

    public znl(long[] jArr) {
        this.g = jArr;
    }
}
