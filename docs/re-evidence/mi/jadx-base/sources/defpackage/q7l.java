package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class q7l extends g87 {
    public static final BigInteger h = o7l.j;
    public int[] g;

    public q7l() {
        this.g = bhg.f();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrF = bhg.f();
        p7l.a(this.g, ((q7l) g87Var).g, iArrF);
        return new q7l(iArrF);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrF = bhg.f();
        p7l.b(this.g, iArrF);
        return new q7l(iArrF);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrF = bhg.f();
        w6g.d(p7l.f30090a, ((q7l) g87Var).g, iArrF);
        p7l.e(iArrF, this.g, iArrF);
        return new q7l(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q7l) {
            return bhg.k(this.g, ((q7l) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrF = bhg.f();
        w6g.d(p7l.f30090a, this.g, iArrF);
        return new q7l(iArrF);
    }

    @Override // defpackage.g87
    public boolean h() {
        return bhg.r(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 8);
    }

    @Override // defpackage.g87
    public boolean i() {
        return bhg.t(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrF = bhg.f();
        p7l.e(this.g, ((q7l) g87Var).g, iArrF);
        return new q7l(iArrF);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrF = bhg.f();
        p7l.g(this.g, iArrF);
        return new q7l(iArrF);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (bhg.t(iArr) || bhg.r(iArr)) {
            return this;
        }
        int[] iArrF = bhg.f();
        p7l.j(iArr, iArrF);
        p7l.e(iArrF, iArr, iArrF);
        int[] iArrF2 = bhg.f();
        p7l.k(iArrF, 2, iArrF2);
        p7l.e(iArrF2, iArrF, iArrF2);
        int[] iArrF3 = bhg.f();
        p7l.k(iArrF2, 2, iArrF3);
        p7l.e(iArrF3, iArrF, iArrF3);
        p7l.k(iArrF3, 6, iArrF);
        p7l.e(iArrF, iArrF3, iArrF);
        int[] iArrF4 = bhg.f();
        p7l.k(iArrF, 12, iArrF4);
        p7l.e(iArrF4, iArrF, iArrF4);
        p7l.k(iArrF4, 6, iArrF);
        p7l.e(iArrF, iArrF3, iArrF);
        p7l.j(iArrF, iArrF3);
        p7l.e(iArrF3, iArr, iArrF3);
        p7l.k(iArrF3, 31, iArrF4);
        p7l.e(iArrF4, iArrF3, iArrF);
        p7l.k(iArrF4, 32, iArrF4);
        p7l.e(iArrF4, iArrF, iArrF4);
        p7l.k(iArrF4, 62, iArrF4);
        p7l.e(iArrF4, iArrF, iArrF4);
        p7l.k(iArrF4, 4, iArrF4);
        p7l.e(iArrF4, iArrF2, iArrF4);
        p7l.k(iArrF4, 32, iArrF4);
        p7l.e(iArrF4, iArr, iArrF4);
        p7l.k(iArrF4, 62, iArrF4);
        p7l.j(iArrF4, iArrF2);
        if (bhg.k(iArr, iArrF2)) {
            return new q7l(iArrF4);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrF = bhg.f();
        p7l.j(this.g, iArrF);
        return new q7l(iArrF);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrF = bhg.f();
        p7l.m(this.g, ((q7l) g87Var).g, iArrF);
        return new q7l(iArrF);
    }

    @Override // defpackage.g87
    public boolean s() {
        return bhg.o(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return bhg.H(this.g);
    }

    public q7l(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.g = p7l.d(bigInteger);
    }

    public q7l(int[] iArr) {
        this.g = iArr;
    }
}
