package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class okl extends g87 {
    public static final BigInteger h = kkl.j;
    public int[] g;

    public okl() {
        this.g = zgg.d();
    }

    public static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        mkl.e(iArr5, iArr3, iArr7);
        mkl.e(iArr7, iArr, iArr7);
        mkl.e(iArr4, iArr2, iArr6);
        mkl.a(iArr6, iArr7, iArr6);
        mkl.e(iArr4, iArr3, iArr7);
        zgg.c(iArr6, iArr4);
        mkl.e(iArr5, iArr2, iArr5);
        mkl.a(iArr5, iArr7, iArr5);
        mkl.j(iArr5, iArr6);
        mkl.e(iArr6, iArr, iArr6);
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        zgg.c(iArr, iArr4);
        int[] iArrD = zgg.d();
        int[] iArrD2 = zgg.d();
        for (int i = 0; i < 7; i++) {
            zgg.c(iArr2, iArrD);
            zgg.c(iArr3, iArrD2);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    w(iArr2, iArr3, iArr4, iArr5);
                }
            }
            u(iArr, iArrD, iArrD2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    public static void w(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        mkl.e(iArr2, iArr, iArr2);
        mkl.n(iArr2, iArr2);
        mkl.j(iArr, iArr4);
        mkl.a(iArr3, iArr4, iArr);
        mkl.e(iArr3, iArr4, iArr3);
        mkl.i(mhg.F(7, iArr3, 2, 0), iArr3);
    }

    public static boolean x(int[] iArr) {
        int[] iArrD = zgg.d();
        int[] iArrD2 = zgg.d();
        zgg.c(iArr, iArrD);
        for (int i = 0; i < 7; i++) {
            zgg.c(iArrD, iArrD2);
            mkl.k(iArrD, 1 << i, iArrD);
            mkl.e(iArrD, iArrD2, iArrD);
        }
        mkl.k(iArrD, 95, iArrD);
        return zgg.j(iArrD);
    }

    public static boolean y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrD = zgg.d();
        zgg.c(iArr2, iArrD);
        int[] iArrD2 = zgg.d();
        iArrD2[0] = 1;
        int[] iArrD3 = zgg.d();
        v(iArr, iArrD, iArrD2, iArrD3, iArr3);
        int[] iArrD4 = zgg.d();
        int[] iArrD5 = zgg.d();
        for (int i = 1; i < 96; i++) {
            zgg.c(iArrD, iArrD4);
            zgg.c(iArrD2, iArrD5);
            w(iArrD, iArrD2, iArrD3, iArr3);
            if (zgg.k(iArrD)) {
                w6g.d(mkl.f26960a, iArrD5, iArr3);
                mkl.e(iArr3, iArrD4, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrD = zgg.d();
        mkl.a(this.g, ((okl) g87Var).g, iArrD);
        return new okl(iArrD);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrD = zgg.d();
        mkl.b(this.g, iArrD);
        return new okl(iArrD);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrD = zgg.d();
        w6g.d(mkl.f26960a, ((okl) g87Var).g, iArrD);
        mkl.e(iArrD, this.g, iArrD);
        return new okl(iArrD);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof okl) {
            return zgg.f(this.g, ((okl) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrD = zgg.d();
        w6g.d(mkl.f26960a, this.g, iArrD);
        return new okl(iArrD);
    }

    @Override // defpackage.g87
    public boolean h() {
        return zgg.j(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 7);
    }

    @Override // defpackage.g87
    public boolean i() {
        return zgg.k(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrD = zgg.d();
        mkl.e(this.g, ((okl) g87Var).g, iArrD);
        return new okl(iArrD);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrD = zgg.d();
        mkl.g(this.g, iArrD);
        return new okl(iArrD);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (zgg.k(iArr) || zgg.j(iArr)) {
            return this;
        }
        int[] iArrD = zgg.d();
        mkl.g(iArr, iArrD);
        int[] iArrE = w6g.e(mkl.f26960a);
        int[] iArrD2 = zgg.d();
        if (!x(iArr)) {
            return null;
        }
        while (!y(iArrD, iArrE, iArrD2)) {
            mkl.b(iArrE, iArrE);
        }
        mkl.j(iArrD2, iArrE);
        if (zgg.f(iArr, iArrE)) {
            return new okl(iArrD2);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrD = zgg.d();
        mkl.j(this.g, iArrD);
        return new okl(iArrD);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrD = zgg.d();
        mkl.m(this.g, ((okl) g87Var).g, iArrD);
        return new okl(iArrD);
    }

    @Override // defpackage.g87
    public boolean s() {
        return zgg.h(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return zgg.t(this.g);
    }

    public okl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.g = mkl.d(bigInteger);
    }

    public okl(int[] iArr) {
        this.g = iArr;
    }
}
