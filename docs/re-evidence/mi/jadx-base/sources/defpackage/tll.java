package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class tll extends h87 {
    public static final BigInteger h = pll.i;
    public int[] g;

    public tll(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.g = rll.c(bigInteger);
    }

    @Override // defpackage.h87
    public h87 a(h87 h87Var) {
        int[] iArrI = xgg.i(17);
        rll.a(this.g, ((tll) h87Var).g, iArrI);
        return new tll(iArrI);
    }

    @Override // defpackage.h87
    public h87 b() {
        int[] iArrI = xgg.i(17);
        rll.b(this.g, iArrI);
        return new tll(iArrI);
    }

    @Override // defpackage.h87
    public h87 d(h87 h87Var) {
        int[] iArrI = xgg.i(17);
        v6g.d(rll.f32682a, ((tll) h87Var).g, iArrI);
        rll.f(iArrI, this.g, iArrI);
        return new tll(iArrI);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tll) {
            return xgg.m(17, this.g, ((tll) obj).g);
        }
        return false;
    }

    @Override // defpackage.h87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.h87
    public h87 g() {
        int[] iArrI = xgg.i(17);
        v6g.d(rll.f32682a, this.g, iArrI);
        return new tll(iArrI);
    }

    @Override // defpackage.h87
    public boolean h() {
        return xgg.u(17, this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ wj1.n(this.g, 0, 17);
    }

    @Override // defpackage.h87
    public boolean i() {
        return xgg.v(17, this.g);
    }

    @Override // defpackage.h87
    public h87 j(h87 h87Var) {
        int[] iArrI = xgg.i(17);
        rll.f(this.g, ((tll) h87Var).g, iArrI);
        return new tll(iArrI);
    }

    @Override // defpackage.h87
    public h87 m() {
        int[] iArrI = xgg.i(17);
        rll.g(this.g, iArrI);
        return new tll(iArrI);
    }

    @Override // defpackage.h87
    public h87 n() {
        int[] iArr = this.g;
        if (xgg.v(17, iArr) || xgg.u(17, iArr)) {
            return this;
        }
        int[] iArrI = xgg.i(17);
        int[] iArrI2 = xgg.i(17);
        rll.k(iArr, SportSummary.VERSION_207, iArrI);
        rll.j(iArrI, iArrI2);
        if (xgg.m(17, iArr, iArrI2)) {
            return new tll(iArrI);
        }
        return null;
    }

    @Override // defpackage.h87
    public h87 o() {
        int[] iArrI = xgg.i(17);
        rll.j(this.g, iArrI);
        return new tll(iArrI);
    }

    @Override // defpackage.h87
    public h87 q(h87 h87Var) {
        int[] iArrI = xgg.i(17);
        rll.l(this.g, ((tll) h87Var).g, iArrI);
        return new tll(iArrI);
    }

    @Override // defpackage.h87
    public boolean r() {
        return xgg.o(this.g, 0) == 1;
    }

    @Override // defpackage.h87
    public BigInteger s() {
        return xgg.O(17, this.g);
    }

    public tll() {
        this.g = xgg.i(17);
    }

    public tll(int[] iArr) {
        this.g = iArr;
    }
}
