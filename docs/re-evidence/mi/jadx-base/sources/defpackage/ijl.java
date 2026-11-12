package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ijl extends g87 {
    public static final BigInteger h = ejl.j;
    public int[] g;

    public ijl() {
        this.g = ugg.c();
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrC = ugg.c();
        gjl.a(this.g, ((ijl) g87Var).g, iArrC);
        return new ijl(iArrC);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrC = ugg.c();
        gjl.b(this.g, iArrC);
        return new ijl(iArrC);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrC = ugg.c();
        w6g.d(gjl.f19061a, ((ijl) g87Var).g, iArrC);
        gjl.d(iArrC, this.g, iArrC);
        return new ijl(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ijl) {
            return ugg.e(this.g, ((ijl) obj).g);
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
        w6g.d(gjl.f19061a, this.g, iArrC);
        return new ijl(iArrC);
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
        gjl.d(this.g, ((ijl) g87Var).g, iArrC);
        return new ijl(iArrC);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrC = ugg.c();
        gjl.f(this.g, iArrC);
        return new ijl(iArrC);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (ugg.j(iArr) || ugg.i(iArr)) {
            return this;
        }
        int[] iArrC = ugg.c();
        gjl.i(iArr, iArrC);
        gjl.d(iArrC, iArr, iArrC);
        int[] iArrC2 = ugg.c();
        gjl.i(iArrC, iArrC2);
        gjl.d(iArrC2, iArr, iArrC2);
        int[] iArrC3 = ugg.c();
        gjl.i(iArrC2, iArrC3);
        gjl.d(iArrC3, iArr, iArrC3);
        int[] iArrC4 = ugg.c();
        gjl.j(iArrC3, 3, iArrC4);
        gjl.d(iArrC4, iArrC2, iArrC4);
        gjl.j(iArrC4, 7, iArrC3);
        gjl.d(iArrC3, iArrC4, iArrC3);
        gjl.j(iArrC3, 3, iArrC4);
        gjl.d(iArrC4, iArrC2, iArrC4);
        int[] iArrC5 = ugg.c();
        gjl.j(iArrC4, 14, iArrC5);
        gjl.d(iArrC5, iArrC3, iArrC5);
        gjl.j(iArrC5, 31, iArrC3);
        gjl.d(iArrC3, iArrC5, iArrC3);
        gjl.j(iArrC3, 62, iArrC5);
        gjl.d(iArrC5, iArrC3, iArrC5);
        gjl.j(iArrC5, 3, iArrC3);
        gjl.d(iArrC3, iArrC2, iArrC3);
        gjl.j(iArrC3, 18, iArrC3);
        gjl.d(iArrC3, iArrC4, iArrC3);
        gjl.j(iArrC3, 2, iArrC3);
        gjl.d(iArrC3, iArr, iArrC3);
        gjl.j(iArrC3, 3, iArrC3);
        gjl.d(iArrC3, iArrC, iArrC3);
        gjl.j(iArrC3, 6, iArrC3);
        gjl.d(iArrC3, iArrC2, iArrC3);
        gjl.j(iArrC3, 2, iArrC3);
        gjl.d(iArrC3, iArr, iArrC3);
        gjl.i(iArrC3, iArrC);
        if (ugg.e(iArr, iArrC)) {
            return new ijl(iArrC3);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrC = ugg.c();
        gjl.i(this.g, iArrC);
        return new ijl(iArrC);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrC = ugg.c();
        gjl.k(this.g, ((ijl) g87Var).g, iArrC);
        return new ijl(iArrC);
    }

    @Override // defpackage.g87
    public boolean s() {
        return ugg.g(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return ugg.t(this.g);
    }

    public ijl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.g = gjl.c(bigInteger);
    }

    public ijl(int[] iArr) {
        this.g = iArr;
    }
}
