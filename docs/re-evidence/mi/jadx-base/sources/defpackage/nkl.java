package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class nkl extends h87 {
    public static final BigInteger h = jkl.i;
    public int[] g;

    public nkl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.g = lkl.d(bigInteger);
    }

    public static void t(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        lkl.e(iArr5, iArr3, iArr7);
        lkl.e(iArr7, iArr, iArr7);
        lkl.e(iArr4, iArr2, iArr6);
        lkl.a(iArr6, iArr7, iArr6);
        lkl.e(iArr4, iArr3, iArr7);
        ygg.c(iArr6, iArr4);
        lkl.e(iArr5, iArr2, iArr5);
        lkl.a(iArr5, iArr7, iArr5);
        lkl.j(iArr5, iArr6);
        lkl.e(iArr6, iArr, iArr6);
    }

    public static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        ygg.c(iArr, iArr4);
        int[] iArrD = ygg.d();
        int[] iArrD2 = ygg.d();
        for (int i = 0; i < 7; i++) {
            ygg.c(iArr2, iArrD);
            ygg.c(iArr3, iArrD2);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    v(iArr2, iArr3, iArr4, iArr5);
                }
            }
            t(iArr, iArrD, iArrD2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        lkl.e(iArr2, iArr, iArr2);
        lkl.n(iArr2, iArr2);
        lkl.j(iArr, iArr4);
        lkl.a(iArr3, iArr4, iArr);
        lkl.e(iArr3, iArr4, iArr3);
        lkl.i(xgg.F(7, iArr3, 2, 0), iArr3);
    }

    public static boolean w(int[] iArr) {
        int[] iArrD = ygg.d();
        int[] iArrD2 = ygg.d();
        ygg.c(iArr, iArrD);
        for (int i = 0; i < 7; i++) {
            ygg.c(iArrD, iArrD2);
            lkl.k(iArrD, 1 << i, iArrD);
            lkl.e(iArrD, iArrD2, iArrD);
        }
        lkl.k(iArrD, 95, iArrD);
        return ygg.j(iArrD);
    }

    public static boolean x(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrD = ygg.d();
        ygg.c(iArr2, iArrD);
        int[] iArrD2 = ygg.d();
        iArrD2[0] = 1;
        int[] iArrD3 = ygg.d();
        u(iArr, iArrD, iArrD2, iArrD3, iArr3);
        int[] iArrD4 = ygg.d();
        int[] iArrD5 = ygg.d();
        for (int i = 1; i < 96; i++) {
            ygg.c(iArrD, iArrD4);
            ygg.c(iArrD2, iArrD5);
            v(iArrD, iArrD2, iArrD3, iArr3);
            if (ygg.k(iArrD)) {
                v6g.d(lkl.f25179a, iArrD5, iArr3);
                lkl.e(iArr3, iArrD4, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrD = ygg.d();
        lkl.a(this.g, ((nkl) h87Var).g, iArrD);
        return new nkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrD = ygg.d();
        lkl.b(this.g, iArrD);
        return new nkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrD = ygg.d();
        v6g.d(lkl.f25179a, ((nkl) h87Var).g, iArrD);
        lkl.e(iArrD, this.g, iArrD);
        return new nkl(iArrD);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nkl) {
            return ygg.f(this.g, ((nkl) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.h87
    public h87 g() {
        int[] iArrD = ygg.d();
        v6g.d(lkl.f25179a, this.g, iArrD);
        return new nkl(iArrD);
    }

    @Override // defpackage.h87
    public boolean h() {
        return ygg.j(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ wj1.n(this.g, 0, 7);
    }

    @Override // defpackage.h87
    public boolean i() {
        return ygg.k(this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        int[] iArrD = ygg.d();
        lkl.e(this.g, ((nkl) h87Var).g, iArrD);
        return new nkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrD = ygg.d();
        lkl.g(this.g, iArrD);
        return new nkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (ygg.k(iArr) || ygg.j(iArr)) {
            return this;
        }
        int[] iArrD = ygg.d();
        lkl.g(iArr, iArrD);
        int[] iArrE = v6g.e(lkl.f25179a);
        int[] iArrD2 = ygg.d();
        if (!w(iArr)) {
            return null;
        }
        while (!x(iArrD, iArrE, iArrD2)) {
            lkl.b(iArrE, iArrE);
        }
        lkl.j(iArrD2, iArrE);
        if (ygg.f(iArr, iArrE)) {
            return new nkl(iArrD2);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrD = ygg.d();
        lkl.j(this.g, iArrD);
        return new nkl(iArrD);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrD = ygg.d();
        lkl.m(this.g, ((nkl) h87Var).g, iArrD);
        return new nkl(iArrD);
    }

    @Override // defpackage.h87
    public boolean r() {
        return ygg.h(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return ygg.t(this.g);
    }

    public nkl() {
        this.g = ygg.d();
    }

    public nkl(int[] iArr) {
        this.g = iArr;
    }
}
