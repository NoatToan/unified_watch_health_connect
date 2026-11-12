package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ull extends g87 {
    public static final BigInteger h = qll.j;
    public int[] g;

    public ull() {
        this.g = mhg.i(17);
    }

    @Override // defpackage.g87
    public g87 a(g87 g87Var) {
        int[] iArrI = mhg.i(17);
        sll.a(this.g, ((ull) g87Var).g, iArrI);
        return new ull(iArrI);
    }

    @Override // defpackage.g87
    public g87 b() {
        int[] iArrI = mhg.i(17);
        sll.b(this.g, iArrI);
        return new ull(iArrI);
    }

    @Override // defpackage.g87
    public g87 d(g87 g87Var) {
        int[] iArrI = mhg.i(17);
        w6g.d(sll.f33766a, ((ull) g87Var).g, iArrI);
        sll.f(iArrI, this.g, iArrI);
        return new ull(iArrI);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ull) {
            return mhg.m(17, this.g, ((ull) obj).g);
        }
        return false;
    }

    @Override // defpackage.g87
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.g87
    public g87 g() {
        int[] iArrI = mhg.i(17);
        w6g.d(sll.f33766a, this.g, iArrI);
        return new ull(iArrI);
    }

    @Override // defpackage.g87
    public boolean h() {
        return mhg.u(17, this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ vj1.t(this.g, 0, 17);
    }

    @Override // defpackage.g87
    public boolean i() {
        return mhg.v(17, this.g);
    }

    @Override // defpackage.g87
    public g87 j(g87 g87Var) {
        int[] iArrI = mhg.i(17);
        sll.f(this.g, ((ull) g87Var).g, iArrI);
        return new ull(iArrI);
    }

    @Override // defpackage.g87
    public g87 m() {
        int[] iArrI = mhg.i(17);
        sll.g(this.g, iArrI);
        return new ull(iArrI);
    }

    @Override // defpackage.g87
    public g87 n() {
        int[] iArr = this.g;
        if (mhg.v(17, iArr) || mhg.u(17, iArr)) {
            return this;
        }
        int[] iArrI = mhg.i(17);
        int[] iArrI2 = mhg.i(17);
        sll.k(iArr, SportSummary.VERSION_207, iArrI);
        sll.j(iArrI, iArrI2);
        if (mhg.m(17, iArr, iArrI2)) {
            return new ull(iArrI);
        }
        return null;
    }

    @Override // defpackage.g87
    public g87 o() {
        int[] iArrI = mhg.i(17);
        sll.j(this.g, iArrI);
        return new ull(iArrI);
    }

    @Override // defpackage.g87
    public g87 r(g87 g87Var) {
        int[] iArrI = mhg.i(17);
        sll.l(this.g, ((ull) g87Var).g, iArrI);
        return new ull(iArrI);
    }

    @Override // defpackage.g87
    public boolean s() {
        return mhg.o(this.g, 0) == 1;
    }

    @Override // defpackage.g87
    public BigInteger t() {
        return mhg.O(17, this.g);
    }

    public ull(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.g = sll.c(bigInteger);
    }

    public ull(int[] iArr) {
        this.g = iArr;
    }
}
