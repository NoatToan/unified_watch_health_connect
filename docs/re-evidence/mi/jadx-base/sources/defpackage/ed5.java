package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ed5 extends g87 {
    public static final BigInteger h = ad5.j;
    public static final int[] i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public int[] g;

    public ed5() {
        this.g = bhg.f();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrF = bhg.f();
        cd5.a(this.g, ((ed5) g87Var).g, iArrF);
        return new ed5(iArrF);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrF = bhg.f();
        cd5.b(this.g, iArrF);
        return new ed5(iArrF);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrF = bhg.f();
        w6g.d(cd5.f5205a, ((ed5) g87Var).g, iArrF);
        cd5.e(iArrF, this.g, iArrF);
        return new ed5(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ed5) {
            return bhg.k(this.g, ((ed5) obj).g);
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
        w6g.d(cd5.f5205a, this.g, iArrF);
        return new ed5(iArrF);
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
        cd5.e(this.g, ((ed5) g87Var).g, iArrF);
        return new ed5(iArrF);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrF = bhg.f();
        cd5.g(this.g, iArrF);
        return new ed5(iArrF);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (bhg.t(iArr) || bhg.r(iArr)) {
            return this;
        }
        int[] iArrF = bhg.f();
        cd5.j(iArr, iArrF);
        cd5.e(iArrF, iArr, iArrF);
        cd5.j(iArrF, iArrF);
        cd5.e(iArrF, iArr, iArrF);
        int[] iArrF2 = bhg.f();
        cd5.j(iArrF, iArrF2);
        cd5.e(iArrF2, iArr, iArrF2);
        int[] iArrF3 = bhg.f();
        cd5.k(iArrF2, 3, iArrF3);
        cd5.e(iArrF3, iArrF, iArrF3);
        cd5.k(iArrF3, 4, iArrF);
        cd5.e(iArrF, iArrF2, iArrF);
        cd5.k(iArrF, 4, iArrF3);
        cd5.e(iArrF3, iArrF2, iArrF3);
        cd5.k(iArrF3, 15, iArrF2);
        cd5.e(iArrF2, iArrF3, iArrF2);
        cd5.k(iArrF2, 30, iArrF3);
        cd5.e(iArrF3, iArrF2, iArrF3);
        cd5.k(iArrF3, 60, iArrF2);
        cd5.e(iArrF2, iArrF3, iArrF2);
        cd5.k(iArrF2, 11, iArrF3);
        cd5.e(iArrF3, iArrF, iArrF3);
        cd5.k(iArrF3, 120, iArrF);
        cd5.e(iArrF, iArrF2, iArrF);
        cd5.j(iArrF, iArrF);
        cd5.j(iArrF, iArrF2);
        if (bhg.k(iArr, iArrF2)) {
            return new ed5(iArrF);
        }
        cd5.e(iArrF, i, iArrF);
        cd5.j(iArrF, iArrF2);
        if (bhg.k(iArr, iArrF2)) {
            return new ed5(iArrF);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrF = bhg.f();
        cd5.j(this.g, iArrF);
        return new ed5(iArrF);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrF = bhg.f();
        cd5.n(this.g, ((ed5) g87Var).g, iArrF);
        return new ed5(iArrF);
    }

    @Override // defpackage.g87
    public boolean s() {
        return bhg.o(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return bhg.H(this.g);
    }

    public ed5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.g = cd5.d(bigInteger);
    }

    public ed5(int[] iArr) {
        this.g = iArr;
    }
}
