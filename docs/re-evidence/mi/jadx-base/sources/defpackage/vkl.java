package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class vkl extends h87 {
    public static final BigInteger h = rkl.i;
    public int[] g;

    public vkl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.g = tkl.c(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrF = ahg.f();
        tkl.a(this.g, ((vkl) h87Var).g, iArrF);
        return new vkl(iArrF);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrF = ahg.f();
        tkl.b(this.g, iArrF);
        return new vkl(iArrF);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrF = ahg.f();
        v6g.d(tkl.f34795a, ((vkl) h87Var).g, iArrF);
        tkl.d(iArrF, this.g, iArrF);
        return new vkl(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vkl) {
            return ahg.k(this.g, ((vkl) obj).g);
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
        v6g.d(tkl.f34795a, this.g, iArrF);
        return new vkl(iArrF);
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
        tkl.d(this.g, ((vkl) h87Var).g, iArrF);
        return new vkl(iArrF);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrF = ahg.f();
        tkl.f(this.g, iArrF);
        return new vkl(iArrF);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (ahg.t(iArr) || ahg.r(iArr)) {
            return this;
        }
        int[] iArrF = ahg.f();
        tkl.i(iArr, iArrF);
        tkl.d(iArrF, iArr, iArrF);
        int[] iArrF2 = ahg.f();
        tkl.i(iArrF, iArrF2);
        tkl.d(iArrF2, iArr, iArrF2);
        int[] iArrF3 = ahg.f();
        tkl.j(iArrF2, 3, iArrF3);
        tkl.d(iArrF3, iArrF2, iArrF3);
        tkl.j(iArrF3, 3, iArrF3);
        tkl.d(iArrF3, iArrF2, iArrF3);
        tkl.j(iArrF3, 2, iArrF3);
        tkl.d(iArrF3, iArrF, iArrF3);
        int[] iArrF4 = ahg.f();
        tkl.j(iArrF3, 11, iArrF4);
        tkl.d(iArrF4, iArrF3, iArrF4);
        tkl.j(iArrF4, 22, iArrF3);
        tkl.d(iArrF3, iArrF4, iArrF3);
        int[] iArrF5 = ahg.f();
        tkl.j(iArrF3, 44, iArrF5);
        tkl.d(iArrF5, iArrF3, iArrF5);
        int[] iArrF6 = ahg.f();
        tkl.j(iArrF5, 88, iArrF6);
        tkl.d(iArrF6, iArrF5, iArrF6);
        tkl.j(iArrF6, 44, iArrF5);
        tkl.d(iArrF5, iArrF3, iArrF5);
        tkl.j(iArrF5, 3, iArrF3);
        tkl.d(iArrF3, iArrF2, iArrF3);
        tkl.j(iArrF3, 23, iArrF3);
        tkl.d(iArrF3, iArrF4, iArrF3);
        tkl.j(iArrF3, 6, iArrF3);
        tkl.d(iArrF3, iArrF, iArrF3);
        tkl.j(iArrF3, 2, iArrF3);
        tkl.i(iArrF3, iArrF);
        if (ahg.k(iArr, iArrF)) {
            return new vkl(iArrF3);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrF = ahg.f();
        tkl.i(this.g, iArrF);
        return new vkl(iArrF);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrF = ahg.f();
        tkl.k(this.g, ((vkl) h87Var).g, iArrF);
        return new vkl(iArrF);
    }

    @Override // defpackage.h87
    public boolean r() {
        return ahg.o(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return ahg.H(this.g);
    }

    public vkl() {
        this.g = ahg.f();
    }

    public vkl(int[] iArr) {
        this.g = iArr;
    }
}
