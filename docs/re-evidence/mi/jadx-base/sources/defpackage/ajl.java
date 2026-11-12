package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ajl extends g87 {
    public static final BigInteger h = wil.j;
    public int[] g;

    public ajl() {
        this.g = ugg.c();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrC = ugg.c();
        yil.a(this.g, ((ajl) g87Var).g, iArrC);
        return new ajl(iArrC);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrC = ugg.c();
        yil.b(this.g, iArrC);
        return new ajl(iArrC);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrC = ugg.c();
        w6g.d(yil.f40219a, ((ajl) g87Var).g, iArrC);
        yil.d(iArrC, this.g, iArrC);
        return new ajl(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajl) {
            return ugg.e(this.g, ((ajl) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrC = ugg.c();
        w6g.d(yil.f40219a, this.g, iArrC);
        return new ajl(iArrC);
    }

    @Override // defpackage.g87
    public boolean h() {
        return ugg.i(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 5);
    }

    @Override // defpackage.g87
    public boolean i() {
        return ugg.j(this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrC = ugg.c();
        yil.d(this.g, ((ajl) g87Var).g, iArrC);
        return new ajl(iArrC);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrC = ugg.c();
        yil.f(this.g, iArrC);
        return new ajl(iArrC);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (ugg.j(iArr) || ugg.i(iArr)) {
            return this;
        }
        int[] iArrC = ugg.c();
        yil.i(iArr, iArrC);
        yil.d(iArrC, iArr, iArrC);
        int[] iArrC2 = ugg.c();
        yil.j(iArrC, 2, iArrC2);
        yil.d(iArrC2, iArrC, iArrC2);
        yil.j(iArrC2, 4, iArrC);
        yil.d(iArrC, iArrC2, iArrC);
        yil.j(iArrC, 8, iArrC2);
        yil.d(iArrC2, iArrC, iArrC2);
        yil.j(iArrC2, 16, iArrC);
        yil.d(iArrC, iArrC2, iArrC);
        yil.j(iArrC, 32, iArrC2);
        yil.d(iArrC2, iArrC, iArrC2);
        yil.j(iArrC2, 64, iArrC);
        yil.d(iArrC, iArrC2, iArrC);
        yil.i(iArrC, iArrC2);
        yil.d(iArrC2, iArr, iArrC2);
        yil.j(iArrC2, 29, iArrC2);
        yil.i(iArrC2, iArrC);
        if (ugg.e(iArr, iArrC)) {
            return new ajl(iArrC2);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrC = ugg.c();
        yil.i(this.g, iArrC);
        return new ajl(iArrC);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrC = ugg.c();
        yil.k(this.g, ((ajl) g87Var).g, iArrC);
        return new ajl(iArrC);
    }

    @Override // defpackage.g87
    public boolean s() {
        return ugg.g(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return ugg.t(this.g);
    }

    public ajl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.g = yil.c(bigInteger);
    }

    public ajl(int[] iArr) {
        this.g = iArr;
    }
}
