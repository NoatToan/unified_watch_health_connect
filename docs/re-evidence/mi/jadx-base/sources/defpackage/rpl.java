package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class rpl extends h87 {
    public long[] g;

    public rpl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.g = ppl.f(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        long[] jArrA = khg.a();
        ppl.b(this.g, ((rpl) h87Var).g, jArrA);
        return new rpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 b() {
        long[] jArrA = khg.a();
        ppl.e(this.g, jArrA);
        return new rpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        return j(h87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rpl) {
            return khg.c(this.g, ((rpl) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return 571;
    }

    @Override // defpackage.h87
    public h87 g() {
        long[] jArrA = khg.a();
        ppl.i(this.g, jArrA);
        return new rpl(jArrA);
    }

    @Override // defpackage.h87
    public boolean h() {
        return khg.e(this.g);
    }

    public int hashCode() {
        return wj1.o(this.g, 0, 9) ^ 5711052;
    }

    @Override // defpackage.h87
    public boolean i() {
        return khg.f(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        long[] jArrA = khg.a();
        ppl.j(this.g, ((rpl) h87Var).g, jArrA);
        return new rpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return l(h87Var, h87Var2, h87Var3);
    }

    @Override // defpackage.h87
    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((rpl) h87Var).g;
        long[] jArr3 = ((rpl) h87Var2).g;
        long[] jArr4 = ((rpl) h87Var3).g;
        long[] jArrB = khg.b();
        ppl.k(jArr, jArr2, jArrB);
        ppl.k(jArr3, jArr4, jArrB);
        long[] jArrA = khg.a();
        ppl.l(jArrB, jArrA);
        return new rpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 m() {
        return this;
    }

    @Override // defpackage.h87
    public h87 n() {
        long[] jArrA = khg.a();
        ppl.n(this.g, jArrA);
        return new rpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 o() {
        long[] jArrA = khg.a();
        ppl.o(this.g, jArrA);
        return new rpl(jArrA);
    }

    @Override // defpackage.h87
    public h87 p(h87 h87Var, h87 h87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((rpl) h87Var).g;
        long[] jArr3 = ((rpl) h87Var2).g;
        long[] jArrB = khg.b();
        ppl.p(jArr, jArrB);
        ppl.k(jArr2, jArr3, jArrB);
        long[] jArrA = khg.a();
        ppl.l(jArrB, jArrA);
        return new rpl(jArrA);
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
        return khg.g(this.g);
    }

    public rpl() {
        this.g = khg.a();
    }

    public rpl(long[] jArr) {
        this.g = jArr;
    }
}
