package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class xml extends h87 {
    public long[] g;

    public xml(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.g = vml.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        long[] jArrF = vgg.f();
        vml.a(this.g, ((xml) h87Var).g, jArrF);
        return new xml(jArrF);
    }

    @Override // defpackage.h87
    public h87 b() {
        long[] jArrF = vgg.f();
        vml.c(this.g, jArrF);
        return new xml(jArrF);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        return j(h87Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xml) {
            return vgg.k(this.g, ((xml) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return 163;
    }

    @Override // defpackage.h87
    public h87 g() {
        long[] jArrF = vgg.f();
        vml.i(this.g, jArrF);
        return new xml(jArrF);
    }

    @Override // defpackage.h87
    public boolean h() {
        return vgg.r(this.g);
    }

    public int hashCode() {
        return wj1.o(this.g, 0, 3) ^ 163763;
    }

    @Override // defpackage.h87
    public boolean i() {
        return vgg.t(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        long[] jArrF = vgg.f();
        vml.j(this.g, ((xml) h87Var).g, jArrF);
        return new xml(jArrF);
    }

    @Override // defpackage.h87
    public h87 k(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        return l(h87Var, h87Var2, h87Var3);
    }

    @Override // defpackage.h87
    public h87 l(h87 h87Var, h87 h87Var2, h87 h87Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((xml) h87Var).g;
        long[] jArr3 = ((xml) h87Var2).g;
        long[] jArr4 = ((xml) h87Var3).g;
        long[] jArrH = vgg.h();
        vml.k(jArr, jArr2, jArrH);
        vml.k(jArr3, jArr4, jArrH);
        long[] jArrF = vgg.f();
        vml.l(jArrH, jArrF);
        return new xml(jArrF);
    }

    @Override // defpackage.h87
    public h87 m() {
        return this;
    }

    @Override // defpackage.h87
    public h87 n() {
        long[] jArrF = vgg.f();
        vml.n(this.g, jArrF);
        return new xml(jArrF);
    }

    @Override // defpackage.h87
    public h87 o() {
        long[] jArrF = vgg.f();
        vml.o(this.g, jArrF);
        return new xml(jArrF);
    }

    @Override // defpackage.h87
    public h87 p(h87 h87Var, h87 h87Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((xml) h87Var).g;
        long[] jArr3 = ((xml) h87Var2).g;
        long[] jArrH = vgg.h();
        vml.p(jArr, jArrH);
        vml.k(jArr2, jArr3, jArrH);
        long[] jArrF = vgg.f();
        vml.l(jArrH, jArrF);
        return new xml(jArrF);
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
        return vgg.G(this.g);
    }

    public xml() {
        this.g = vgg.f();
    }

    public xml(long[] jArr) {
        this.g = jArr;
    }
}
