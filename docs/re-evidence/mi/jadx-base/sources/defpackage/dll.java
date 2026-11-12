package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class dll extends h87 {
    public static final BigInteger h = zkl.i;
    public int[] g;

    public dll(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.g = bll.d(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrF = ahg.f();
        bll.a(this.g, ((dll) h87Var).g, iArrF);
        return new dll(iArrF);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrF = ahg.f();
        bll.b(this.g, iArrF);
        return new dll(iArrF);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrF = ahg.f();
        v6g.d(bll.f4343a, ((dll) h87Var).g, iArrF);
        bll.e(iArrF, this.g, iArrF);
        return new dll(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dll) {
            return ahg.k(this.g, ((dll) obj).g);
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
        v6g.d(bll.f4343a, this.g, iArrF);
        return new dll(iArrF);
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
        bll.e(this.g, ((dll) h87Var).g, iArrF);
        return new dll(iArrF);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrF = ahg.f();
        bll.g(this.g, iArrF);
        return new dll(iArrF);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (ahg.t(iArr) || ahg.r(iArr)) {
            return this;
        }
        int[] iArrF = ahg.f();
        int[] iArrF2 = ahg.f();
        bll.j(iArr, iArrF);
        bll.e(iArrF, iArr, iArrF);
        bll.k(iArrF, 2, iArrF2);
        bll.e(iArrF2, iArrF, iArrF2);
        bll.k(iArrF2, 4, iArrF);
        bll.e(iArrF, iArrF2, iArrF);
        bll.k(iArrF, 8, iArrF2);
        bll.e(iArrF2, iArrF, iArrF2);
        bll.k(iArrF2, 16, iArrF);
        bll.e(iArrF, iArrF2, iArrF);
        bll.k(iArrF, 32, iArrF);
        bll.e(iArrF, iArr, iArrF);
        bll.k(iArrF, 96, iArrF);
        bll.e(iArrF, iArr, iArrF);
        bll.k(iArrF, 94, iArrF);
        bll.j(iArrF, iArrF2);
        if (ahg.k(iArr, iArrF2)) {
            return new dll(iArrF);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrF = ahg.f();
        bll.j(this.g, iArrF);
        return new dll(iArrF);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrF = ahg.f();
        bll.m(this.g, ((dll) h87Var).g, iArrF);
        return new dll(iArrF);
    }

    @Override // defpackage.h87
    public boolean r() {
        return ahg.o(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return ahg.H(this.g);
    }

    public dll() {
        this.g = ahg.f();
    }

    public dll(int[] iArr) {
        this.g = iArr;
    }
}
