package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class dd5 extends h87 {
    public static final BigInteger h = zc5.i;
    public static final int[] i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public int[] g;

    public dd5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.g = bd5.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrF = ahg.f();
        bd5.a(this.g, ((dd5) h87Var).g, iArrF);
        return new dd5(iArrF);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrF = ahg.f();
        bd5.b(this.g, iArrF);
        return new dd5(iArrF);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrF = ahg.f();
        v6g.d(bd5.f4077a, ((dd5) h87Var).g, iArrF);
        bd5.e(iArrF, this.g, iArrF);
        return new dd5(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dd5) {
            return ahg.k(this.g, ((dd5) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.h87
    public h87 g() {
        int[] iArrF = ahg.f();
        v6g.d(bd5.f4077a, this.g, iArrF);
        return new dd5(iArrF);
    }

    @Override // defpackage.h87
    public boolean h() {
        return ahg.r(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ wj1.n(this.g, 0, 8);
    }

    @Override // defpackage.h87
    public boolean i() {
        return ahg.t(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        int[] iArrF = ahg.f();
        bd5.e(this.g, ((dd5) h87Var).g, iArrF);
        return new dd5(iArrF);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrF = ahg.f();
        bd5.g(this.g, iArrF);
        return new dd5(iArrF);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (ahg.t(iArr) || ahg.r(iArr)) {
            return this;
        }
        int[] iArrF = ahg.f();
        bd5.j(iArr, iArrF);
        bd5.e(iArrF, iArr, iArrF);
        bd5.j(iArrF, iArrF);
        bd5.e(iArrF, iArr, iArrF);
        int[] iArrF2 = ahg.f();
        bd5.j(iArrF, iArrF2);
        bd5.e(iArrF2, iArr, iArrF2);
        int[] iArrF3 = ahg.f();
        bd5.k(iArrF2, 3, iArrF3);
        bd5.e(iArrF3, iArrF, iArrF3);
        bd5.k(iArrF3, 4, iArrF);
        bd5.e(iArrF, iArrF2, iArrF);
        bd5.k(iArrF, 4, iArrF3);
        bd5.e(iArrF3, iArrF2, iArrF3);
        bd5.k(iArrF3, 15, iArrF2);
        bd5.e(iArrF2, iArrF3, iArrF2);
        bd5.k(iArrF2, 30, iArrF3);
        bd5.e(iArrF3, iArrF2, iArrF3);
        bd5.k(iArrF3, 60, iArrF2);
        bd5.e(iArrF2, iArrF3, iArrF2);
        bd5.k(iArrF2, 11, iArrF3);
        bd5.e(iArrF3, iArrF, iArrF3);
        bd5.k(iArrF3, 120, iArrF);
        bd5.e(iArrF, iArrF2, iArrF);
        bd5.j(iArrF, iArrF);
        bd5.j(iArrF, iArrF2);
        if (ahg.k(iArr, iArrF2)) {
            return new dd5(iArrF);
        }
        bd5.e(iArrF, i, iArrF);
        bd5.j(iArrF, iArrF2);
        if (ahg.k(iArr, iArrF2)) {
            return new dd5(iArrF);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrF = ahg.f();
        bd5.j(this.g, iArrF);
        return new dd5(iArrF);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrF = ahg.f();
        bd5.n(this.g, ((dd5) h87Var).g, iArrF);
        return new dd5(iArrF);
    }

    @Override // defpackage.h87
    public boolean r() {
        return ahg.o(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return ahg.H(this.g);
    }

    public dd5() {
        this.g = ahg.f();
    }

    public dd5(int[] iArr) {
        this.g = iArr;
    }
}
