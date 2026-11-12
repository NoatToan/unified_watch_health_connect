package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class yml extends g87 {
    public long[] g;

    public yml() {
        this.g = wgg.f();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        long[] jArrF = wgg.f();
        wml.a(this.g, ((yml) g87Var).g, jArrF);
        return new yml(jArrF);
    }

    @Override // defpackage.g87
    public g87 b() {
        long[] jArrF = wgg.f();
        wml.c(this.g, jArrF);
        return new yml(jArrF);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        return j(g87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yml) {
            return wgg.k(this.g, ((yml) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return 163;
    }

    @Override // defpackage.g87
    public g87 g() {
        long[] jArrF = wgg.f();
        wml.i(this.g, jArrF);
        return new yml(jArrF);
    }

    @Override // defpackage.g87
    public boolean h() {
        return wgg.r(this.g);
    }

    public int hashCode() {
        return vj1.u(this.g, 0, 3) ^ 163763;
    }

    @Override // defpackage.g87
    public boolean i() {
        return wgg.t(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        long[] jArrF = wgg.f();
        wml.j(this.g, ((yml) g87Var).g, jArrF);
        return new yml(jArrF);
    }

    @Override // defpackage.g87
    public g87 k(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        return l(g87Var, g87Var2, g87Var3);
    }

    @Override // defpackage.g87
    public g87 l(g87 g87Var, g87 g87Var2, g87 g87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((yml) g87Var).g;
        long[] jArr3 = ((yml) g87Var2).g;
        long[] jArr4 = ((yml) g87Var3).g;
        long[] jArrH = wgg.h();
        wml.k(jArr, jArr2, jArrH);
        wml.k(jArr3, jArr4, jArrH);
        long[] jArrF = wgg.f();
        wml.l(jArrH, jArrF);
        return new yml(jArrF);
    }

    @Override // defpackage.g87
    public g87 m() {
        return this;
    }

    @Override // defpackage.g87
    public g87 n() {
        long[] jArrF = wgg.f();
        wml.n(this.g, jArrF);
        return new yml(jArrF);
    }

    @Override // defpackage.g87
    public g87 o() {
        long[] jArrF = wgg.f();
        wml.o(this.g, jArrF);
        return new yml(jArrF);
    }

    @Override // defpackage.g87
    public g87 p(g87 g87Var, g87 g87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((yml) g87Var).g;
        long[] jArr3 = ((yml) g87Var2).g;
        long[] jArrH = wgg.h();
        wml.p(jArr, jArrH);
        wml.k(jArr2, jArr3, jArrH);
        long[] jArrF = wgg.f();
        wml.l(jArrH, jArrF);
        return new yml(jArrF);
    }

    @Override // defpackage.g87
    public g87 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrF = wgg.f();
        wml.q(this.g, i, jArrF);
        return new yml(jArrF);
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
        return wgg.G(this.g);
    }

    public yml(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.g = wml.d(bigInteger);
    }

    public yml(long[] jArr) {
        this.g = jArr;
    }
}
