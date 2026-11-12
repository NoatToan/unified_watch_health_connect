package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i97 {
    public static h87[] g = new h87[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b87 f20902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h87 f20903b;
    public h87 c;
    public h87[] d;
    public boolean e;
    public Hashtable f;

    public static abstract class a extends i97 {
        public a(b87 b87Var, h87 h87Var, h87 h87Var2) {
            super(b87Var, h87Var, h87Var2);
        }

        @Override // defpackage.i97
        public boolean z() {
            h87 h87VarL;
            h87 h87VarP;
            b87 b87VarI = i();
            h87 h87Var = this.f20903b;
            h87 h87VarK = b87VarI.k();
            h87 h87VarL2 = b87VarI.l();
            int iN = b87VarI.n();
            if (iN != 6) {
                h87 h87Var2 = this.c;
                h87 h87VarJ = h87Var2.a(h87Var).j(h87Var2);
                if (iN != 0) {
                    if (iN != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    h87 h87Var3 = this.d[0];
                    if (!h87Var3.h()) {
                        h87 h87VarJ2 = h87Var3.j(h87Var3.o());
                        h87VarJ = h87VarJ.j(h87Var3);
                        h87VarK = h87VarK.j(h87Var3);
                        h87VarL2 = h87VarL2.j(h87VarJ2);
                    }
                }
                return h87VarJ.equals(h87Var.a(h87VarK).j(h87Var.o()).a(h87VarL2));
            }
            h87 h87Var4 = this.d[0];
            boolean zH = h87Var4.h();
            if (h87Var.i()) {
                h87 h87VarO = this.c.o();
                if (!zH) {
                    h87VarL2 = h87VarL2.j(h87Var4.o());
                }
                return h87VarO.equals(h87VarL2);
            }
            h87 h87Var5 = this.c;
            h87 h87VarO2 = h87Var.o();
            if (zH) {
                h87VarL = h87Var5.o().a(h87Var5).a(h87VarK);
                h87VarP = h87VarO2.o().a(h87VarL2);
            } else {
                h87 h87VarO3 = h87Var4.o();
                h87 h87VarO4 = h87VarO3.o();
                h87VarL = h87Var5.a(h87Var4).l(h87Var5, h87VarK, h87VarO3);
                h87VarP = h87VarO2.p(h87VarL2, h87VarO4);
            }
            return h87VarL.j(h87VarO2).equals(h87VarP);
        }

        public a(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr) {
            super(b87Var, h87Var, h87Var2, h87VarArr);
        }
    }

    public static abstract class b extends i97 {
        public b(b87 b87Var, h87 h87Var, h87 h87Var2) {
            super(b87Var, h87Var, h87Var2);
        }

        @Override // defpackage.i97
        public boolean h() {
            return g().r();
        }

        @Override // defpackage.i97
        public boolean z() {
            h87 h87Var = this.f20903b;
            h87 h87Var2 = this.c;
            h87 h87VarK = this.f20902a.k();
            h87 h87VarL = this.f20902a.l();
            h87 h87VarO = h87Var2.o();
            int iJ = j();
            if (iJ != 0) {
                if (iJ == 1) {
                    h87 h87Var3 = this.d[0];
                    if (!h87Var3.h()) {
                        h87 h87VarO2 = h87Var3.o();
                        h87 h87VarJ = h87Var3.j(h87VarO2);
                        h87VarO = h87VarO.j(h87Var3);
                        h87VarK = h87VarK.j(h87VarO2);
                        h87VarL = h87VarL.j(h87VarJ);
                    }
                } else {
                    if (iJ != 2 && iJ != 3 && iJ != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    h87 h87Var4 = this.d[0];
                    if (!h87Var4.h()) {
                        h87 h87VarO3 = h87Var4.o();
                        h87 h87VarO4 = h87VarO3.o();
                        h87 h87VarJ2 = h87VarO3.j(h87VarO4);
                        h87VarK = h87VarK.j(h87VarO4);
                        h87VarL = h87VarL.j(h87VarJ2);
                    }
                }
            }
            return h87VarO.equals(h87Var.o().a(h87VarK).j(h87Var).a(h87VarL));
        }

        public b(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr) {
            super(b87Var, h87Var, h87Var2, h87VarArr);
        }
    }

    public i97(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, m(b87Var));
    }

    public static h87[] m(b87 b87Var) {
        int iN = b87Var == null ? 0 : b87Var.n();
        if (iN == 0 || iN == 5) {
            return g;
        }
        h87 h87VarJ = b87Var.j(y77.f39884b);
        if (iN != 1 && iN != 2) {
            if (iN == 3) {
                return new h87[]{h87VarJ, h87VarJ, h87VarJ};
            }
            if (iN == 4) {
                return new h87[]{h87VarJ, b87Var.k()};
            }
            if (iN != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new h87[]{h87VarJ};
    }

    public abstract i97 A();

    public abstract i97 a(i97 i97Var);

    public void b() {
        if (!t()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public i97 c(h87 h87Var, h87 h87Var2) {
        return i().f(n().j(h87Var), o().j(h87Var2), this.e);
    }

    public abstract i97 d();

    public boolean e(i97 i97Var) {
        i97 i97VarW;
        if (i97Var == null) {
            return false;
        }
        b87 b87VarI = i();
        b87 b87VarI2 = i97Var.i();
        boolean z = b87VarI == null;
        boolean z2 = b87VarI2 == null;
        boolean zS = s();
        boolean zS2 = i97Var.s();
        if (zS || zS2) {
            if (zS && zS2) {
                return z || z2 || b87VarI.i(b87VarI2);
            }
            return false;
        }
        if (z && z2) {
            i97VarW = this;
        } else if (z) {
            i97Var = i97Var.w();
            i97VarW = this;
        } else if (z2) {
            i97VarW = w();
        } else {
            if (!b87VarI.i(b87VarI2)) {
                return false;
            }
            i97[] i97VarArr = {this, b87VarI.s(i97Var)};
            b87VarI.t(i97VarArr);
            i97VarW = i97VarArr[0];
            i97Var = i97VarArr[1];
        }
        return i97VarW.p().equals(i97Var.p()) && i97VarW.q().equals(i97Var.q());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i97) {
            return e((i97) obj);
        }
        return false;
    }

    public h87 f() {
        b();
        return p();
    }

    public h87 g() {
        b();
        return q();
    }

    public abstract boolean h();

    public int hashCode() {
        b87 b87VarI = i();
        int i = b87VarI == null ? 0 : ~b87VarI.hashCode();
        if (s()) {
            return i;
        }
        i97 i97VarW = w();
        return (i ^ (i97VarW.p().hashCode() * 17)) ^ (i97VarW.q().hashCode() * 257);
    }

    public b87 i() {
        return this.f20902a;
    }

    public int j() {
        b87 b87Var = this.f20902a;
        if (b87Var == null) {
            return 0;
        }
        return b87Var.n();
    }

    public final i97 k() {
        return w().d();
    }

    public byte[] l(boolean z) {
        if (s()) {
            return new byte[1];
        }
        i97 i97VarW = w();
        byte[] bArrE = i97VarW.p().e();
        if (z) {
            byte[] bArr = new byte[bArrE.length + 1];
            bArr[0] = (byte) (i97VarW.h() ? 3 : 2);
            System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
            return bArr;
        }
        byte[] bArrE2 = i97VarW.q().e();
        byte[] bArr2 = new byte[bArrE.length + bArrE2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(bArrE, 0, bArr2, 1, bArrE.length);
        System.arraycopy(bArrE2, 0, bArr2, bArrE.length + 1, bArrE2.length);
        return bArr2;
    }

    public final h87 n() {
        return this.f20903b;
    }

    public final h87 o() {
        return this.c;
    }

    public h87 p() {
        return this.f20903b;
    }

    public h87 q() {
        return this.c;
    }

    public h87 r(int i) {
        if (i >= 0) {
            h87[] h87VarArr = this.d;
            if (i < h87VarArr.length) {
                return h87VarArr[i];
            }
        }
        return null;
    }

    public boolean s() {
        if (this.f20903b != null && this.c != null) {
            h87[] h87VarArr = this.d;
            if (h87VarArr.length <= 0 || !h87VarArr[0].i()) {
                return false;
            }
        }
        return true;
    }

    public boolean t() {
        int iJ = j();
        return iJ == 0 || iJ == 5 || s() || this.d[0].h();
    }

    public String toString() {
        if (s()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(n());
        stringBuffer.append(',');
        stringBuffer.append(o());
        for (int i = 0; i < this.d.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.d[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public boolean u() {
        return s() || i() == null || (z() && y());
    }

    public abstract i97 v();

    public i97 w() {
        int iJ;
        if (s() || (iJ = j()) == 0 || iJ == 5) {
            return this;
        }
        h87 h87VarR = r(0);
        return h87VarR.h() ? this : x(h87VarR.g());
    }

    public i97 x(h87 h87Var) {
        int iJ = j();
        if (iJ != 1) {
            if (iJ == 2 || iJ == 3 || iJ == 4) {
                h87 h87VarO = h87Var.o();
                return c(h87VarO, h87VarO.j(h87Var));
            }
            if (iJ != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return c(h87Var, h87Var);
    }

    public boolean y() {
        BigInteger bigIntegerM = this.f20902a.m();
        return bigIntegerM == null || bigIntegerM.equals(y77.f39884b) || !u77.f(this, bigIntegerM).s();
    }

    public abstract boolean z();

    public static class c extends a {
        public c(b87 b87Var, h87 h87Var, h87 h87Var2) {
            this(b87Var, h87Var, h87Var2, false);
        }

        @Override // defpackage.i97
        public i97 A() {
            h87 h87VarA;
            if (s()) {
                return this;
            }
            b87 b87VarI = i();
            h87 h87VarJ = this.f20903b;
            if (h87VarJ.i()) {
                return b87VarI.q();
            }
            int iN = b87VarI.n();
            if (iN == 0) {
                h87 h87VarA2 = this.c.d(h87VarJ).a(h87VarJ);
                h87 h87VarA3 = h87VarA2.o().a(h87VarA2).a(b87VarI.k());
                return new c(b87VarI, h87VarA3, h87VarJ.p(h87VarA3, h87VarA2.b()), this.e);
            }
            if (iN == 1) {
                h87 h87VarJ2 = this.c;
                h87 h87Var = this.d[0];
                boolean zH = h87Var.h();
                h87 h87VarJ3 = zH ? h87VarJ : h87VarJ.j(h87Var);
                if (!zH) {
                    h87VarJ2 = h87VarJ2.j(h87Var);
                }
                h87 h87VarO = h87VarJ.o();
                h87 h87VarA4 = h87VarO.a(h87VarJ2);
                h87 h87VarO2 = h87VarJ3.o();
                h87 h87VarA5 = h87VarA4.a(h87VarJ3);
                h87 h87VarL = h87VarA5.l(h87VarA4, h87VarO2, b87VarI.k());
                return new c(b87VarI, h87VarJ3.j(h87VarL), h87VarO.o().l(h87VarJ3, h87VarL, h87VarA5), new h87[]{h87VarJ3.j(h87VarO2)}, this.e);
            }
            if (iN != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            h87 h87Var2 = this.c;
            h87 h87Var3 = this.d[0];
            boolean zH2 = h87Var3.h();
            h87 h87VarJ4 = zH2 ? h87Var2 : h87Var2.j(h87Var3);
            h87 h87VarO3 = zH2 ? h87Var3 : h87Var3.o();
            h87 h87VarK = b87VarI.k();
            h87 h87VarJ5 = zH2 ? h87VarK : h87VarK.j(h87VarO3);
            h87 h87VarA6 = h87Var2.o().a(h87VarJ4).a(h87VarJ5);
            if (h87VarA6.i()) {
                return new c(b87VarI, h87VarA6, b87VarI.l().n(), this.e);
            }
            h87 h87VarO4 = h87VarA6.o();
            h87 h87VarJ6 = zH2 ? h87VarA6 : h87VarA6.j(h87VarO3);
            h87 h87VarL2 = b87VarI.l();
            if (h87VarL2.c() < (b87VarI.p() >> 1)) {
                h87 h87VarO5 = h87Var2.a(h87VarJ).o();
                h87VarA = h87VarO5.a(h87VarA6).a(h87VarO3).j(h87VarO5).a(h87VarL2.h() ? h87VarJ5.a(h87VarO3).o() : h87VarJ5.p(h87VarL2, h87VarO3.o())).a(h87VarO4);
                if (h87VarK.i()) {
                    h87VarA = h87VarA.a(h87VarJ6);
                } else if (!h87VarK.h()) {
                    h87VarA = h87VarA.a(h87VarK.b().j(h87VarJ6));
                }
            } else {
                if (!zH2) {
                    h87VarJ = h87VarJ.j(h87Var3);
                }
                h87VarA = h87VarJ.p(h87VarA6, h87VarJ4).a(h87VarO4).a(h87VarJ6);
            }
            return new c(b87VarI, h87VarO4, h87VarA, new h87[]{h87VarJ6}, this.e);
        }

        @Override // defpackage.i97
        public i97 a(i97 i97Var) {
            h87 h87VarJ;
            h87 h87VarJ2;
            h87 h87VarJ3;
            h87 h87Var;
            h87 h87VarA;
            h87 h87VarJ4;
            if (s()) {
                return i97Var;
            }
            if (i97Var.s()) {
                return this;
            }
            b87 b87VarI = i();
            int iN = b87VarI.n();
            h87 h87VarJ5 = this.f20903b;
            h87 h87Var2 = i97Var.f20903b;
            if (iN == 0) {
                h87 h87Var3 = this.c;
                h87 h87Var4 = i97Var.c;
                h87 h87VarA2 = h87VarJ5.a(h87Var2);
                h87 h87VarA3 = h87Var3.a(h87Var4);
                if (h87VarA2.i()) {
                    return h87VarA3.i() ? A() : b87VarI.q();
                }
                h87 h87VarD = h87VarA3.d(h87VarA2);
                h87 h87VarA4 = h87VarD.o().a(h87VarD).a(h87VarA2).a(b87VarI.k());
                return new c(b87VarI, h87VarA4, h87VarD.j(h87VarJ5.a(h87VarA4)).a(h87VarA4).a(h87Var3), this.e);
            }
            if (iN == 1) {
                h87 h87Var5 = this.c;
                h87 h87VarJ6 = this.d[0];
                h87 h87Var6 = i97Var.c;
                h87 h87Var7 = i97Var.d[0];
                boolean zH = h87Var7.h();
                h87 h87VarA5 = h87VarJ6.j(h87Var6).a(zH ? h87Var5 : h87Var5.j(h87Var7));
                h87 h87VarA6 = h87VarJ6.j(h87Var2).a(zH ? h87VarJ5 : h87VarJ5.j(h87Var7));
                if (h87VarA6.i()) {
                    return h87VarA5.i() ? A() : b87VarI.q();
                }
                h87 h87VarO = h87VarA6.o();
                h87 h87VarJ7 = h87VarO.j(h87VarA6);
                if (!zH) {
                    h87VarJ6 = h87VarJ6.j(h87Var7);
                }
                h87 h87VarA7 = h87VarA5.a(h87VarA6);
                h87 h87VarA8 = h87VarA7.l(h87VarA5, h87VarO, b87VarI.k()).j(h87VarJ6).a(h87VarJ7);
                h87 h87VarJ8 = h87VarA6.j(h87VarA8);
                if (!zH) {
                    h87VarO = h87VarO.j(h87Var7);
                }
                return new c(b87VarI, h87VarJ8, h87VarA5.l(h87VarJ5, h87VarA6, h87Var5).l(h87VarO, h87VarA7, h87VarA8), new h87[]{h87VarJ7.j(h87VarJ6)}, this.e);
            }
            if (iN != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (h87VarJ5.i()) {
                return h87Var2.i() ? b87VarI.q() : i97Var.a(this);
            }
            h87 h87Var8 = this.c;
            h87 h87Var9 = this.d[0];
            h87 h87Var10 = i97Var.c;
            h87 h87Var11 = i97Var.d[0];
            boolean zH2 = h87Var9.h();
            if (zH2) {
                h87VarJ = h87Var2;
                h87VarJ2 = h87Var10;
            } else {
                h87VarJ = h87Var2.j(h87Var9);
                h87VarJ2 = h87Var10.j(h87Var9);
            }
            boolean zH3 = h87Var11.h();
            if (zH3) {
                h87VarJ3 = h87Var8;
            } else {
                h87VarJ5 = h87VarJ5.j(h87Var11);
                h87VarJ3 = h87Var8.j(h87Var11);
            }
            h87 h87VarA9 = h87VarJ3.a(h87VarJ2);
            h87 h87VarA10 = h87VarJ5.a(h87VarJ);
            if (h87VarA10.i()) {
                return h87VarA9.i() ? A() : b87VarI.q();
            }
            if (h87Var2.i()) {
                i97 i97VarW = w();
                h87 h87VarP = i97VarW.p();
                h87 h87VarQ = i97VarW.q();
                h87 h87VarD2 = h87VarQ.a(h87Var10).d(h87VarP);
                h87VarA = h87VarD2.o().a(h87VarD2).a(h87VarP).a(b87VarI.k());
                if (h87VarA.i()) {
                    return new c(b87VarI, h87VarA, b87VarI.l().n(), this.e);
                }
                h87 h87VarA11 = h87VarD2.j(h87VarP.a(h87VarA)).a(h87VarA).a(h87VarQ).d(h87VarA).a(h87VarA);
                h87VarJ4 = b87VarI.j(y77.f39884b);
                h87Var = h87VarA11;
            } else {
                h87 h87VarO2 = h87VarA10.o();
                h87 h87VarJ9 = h87VarA9.j(h87VarJ5);
                h87 h87VarJ10 = h87VarA9.j(h87VarJ);
                h87 h87VarJ11 = h87VarJ9.j(h87VarJ10);
                if (h87VarJ11.i()) {
                    return new c(b87VarI, h87VarJ11, b87VarI.l().n(), this.e);
                }
                h87 h87VarJ12 = h87VarA9.j(h87VarO2);
                h87 h87VarJ13 = !zH3 ? h87VarJ12.j(h87Var11) : h87VarJ12;
                h87 h87VarP2 = h87VarJ10.a(h87VarO2).p(h87VarJ13, h87Var8.a(h87Var9));
                if (!zH2) {
                    h87VarJ13 = h87VarJ13.j(h87Var9);
                }
                h87Var = h87VarP2;
                h87VarA = h87VarJ11;
                h87VarJ4 = h87VarJ13;
            }
            return new c(b87VarI, h87VarA, h87Var, new h87[]{h87VarJ4}, this.e);
        }

        @Override // defpackage.i97
        public i97 d() {
            return new c(null, f(), g());
        }

        @Override // defpackage.i97
        public boolean h() {
            h87 h87VarN = n();
            if (h87VarN.i()) {
                return false;
            }
            h87 h87VarO = o();
            int iJ = j();
            if (iJ == 5 || iJ == 6) {
                return h87VarO.r() != h87VarN.r();
            }
            return h87VarO.d(h87VarN).r();
        }

        @Override // defpackage.i97
        public h87 q() {
            int iJ = j();
            if (iJ != 5 && iJ != 6) {
                return this.c;
            }
            h87 h87Var = this.f20903b;
            h87 h87Var2 = this.c;
            if (s() || h87Var.i()) {
                return h87Var2;
            }
            h87 h87VarJ = h87Var2.a(h87Var).j(h87Var);
            if (6 != iJ) {
                return h87VarJ;
            }
            h87 h87Var3 = this.d[0];
            return !h87Var3.h() ? h87VarJ.d(h87Var3) : h87VarJ;
        }

        @Override // defpackage.i97
        public i97 v() {
            if (s()) {
                return this;
            }
            h87 h87Var = this.f20903b;
            if (h87Var.i()) {
                return this;
            }
            int iJ = j();
            if (iJ == 0) {
                return new c(this.f20902a, h87Var, this.c.a(h87Var), this.e);
            }
            if (iJ == 1) {
                return new c(this.f20902a, h87Var, this.c.a(h87Var), new h87[]{this.d[0]}, this.e);
            }
            if (iJ == 5) {
                return new c(this.f20902a, h87Var, this.c.b(), this.e);
            }
            if (iJ != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            h87 h87Var2 = this.c;
            h87 h87Var3 = this.d[0];
            return new c(this.f20902a, h87Var, h87Var2.a(h87Var3), new h87[]{h87Var3}, this.e);
        }

        public c(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
            super(b87Var, h87Var, h87Var2);
            if ((h87Var == null) == (h87Var2 == null)) {
                if (h87Var != null) {
                    h87.a.t(this.f20903b, this.c);
                    if (b87Var != null) {
                        h87.a.t(this.f20903b, this.f20902a.k());
                    }
                }
                this.e = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        public c(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
            super(b87Var, h87Var, h87Var2, h87VarArr);
            this.e = z;
        }
    }

    public static class d extends b {
        public d(b87 b87Var, h87 h87Var, h87 h87Var2) {
            this(b87Var, h87Var, h87Var2, false);
        }

        @Override // defpackage.i97
        public i97 A() {
            h87 h87VarQ;
            h87 h87VarD;
            if (s()) {
                return this;
            }
            b87 b87VarI = i();
            h87 h87Var = this.c;
            if (h87Var.i()) {
                return b87VarI.q();
            }
            int iN = b87VarI.n();
            h87 h87Var2 = this.f20903b;
            if (iN == 0) {
                h87 h87VarD2 = F(h87Var2.o()).a(i().k()).d(H(h87Var));
                h87 h87VarQ2 = h87VarD2.o().q(H(h87Var2));
                return new d(b87VarI, h87VarQ2, h87VarD2.j(h87Var2.q(h87VarQ2)).q(h87Var), this.e);
            }
            if (iN == 1) {
                h87 h87Var3 = this.d[0];
                boolean zH = h87Var3.h();
                h87 h87VarK = b87VarI.k();
                if (!h87VarK.i() && !zH) {
                    h87VarK = h87VarK.j(h87Var3.o());
                }
                h87 h87VarA = h87VarK.a(F(h87Var2.o()));
                h87 h87VarJ = zH ? h87Var : h87Var.j(h87Var3);
                h87 h87VarO = zH ? h87Var.o() : h87VarJ.j(h87Var);
                h87 h87VarD3 = D(h87Var2.j(h87VarO));
                h87 h87VarQ3 = h87VarA.o().q(H(h87VarD3));
                h87 h87VarH = H(h87VarJ);
                h87 h87VarJ2 = h87VarQ3.j(h87VarH);
                h87 h87VarH2 = H(h87VarO);
                return new d(b87VarI, h87VarJ2, h87VarD3.q(h87VarQ3).j(h87VarA).q(H(h87VarH2.o())), new h87[]{H(zH ? H(h87VarH2) : h87VarH.o()).j(h87VarJ)}, this.e);
            }
            if (iN != 2) {
                if (iN == 4) {
                    return G(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            h87 h87Var4 = this.d[0];
            boolean zH2 = h87Var4.h();
            h87 h87VarO2 = h87Var.o();
            h87 h87VarO3 = h87VarO2.o();
            h87 h87VarK2 = b87VarI.k();
            h87 h87VarM = h87VarK2.m();
            if (h87VarM.s().equals(BigInteger.valueOf(3L))) {
                h87 h87VarO4 = zH2 ? h87Var4 : h87Var4.o();
                h87VarQ = F(h87Var2.a(h87VarO4).j(h87Var2.q(h87VarO4)));
                h87VarD = D(h87VarO2.j(h87Var2));
            } else {
                h87 h87VarF = F(h87Var2.o());
                if (zH2) {
                    h87VarQ = h87VarF.a(h87VarK2);
                } else if (h87VarK2.i()) {
                    h87VarQ = h87VarF;
                } else {
                    h87 h87VarO5 = h87Var4.o().o();
                    h87VarQ = h87VarM.c() < h87VarK2.c() ? h87VarF.q(h87VarO5.j(h87VarM)) : h87VarF.a(h87VarO5.j(h87VarK2));
                }
                h87VarD = D(h87Var2.j(h87VarO2));
            }
            h87 h87VarQ4 = h87VarQ.o().q(H(h87VarD));
            h87 h87VarQ5 = h87VarD.q(h87VarQ4).j(h87VarQ).q(C(h87VarO3));
            h87 h87VarH3 = H(h87Var);
            if (!zH2) {
                h87VarH3 = h87VarH3.j(h87Var4);
            }
            return new d(b87VarI, h87VarQ4, h87VarQ5, new h87[]{h87VarH3}, this.e);
        }

        public h87 B(h87 h87Var, h87 h87Var2) {
            h87 h87VarK = i().k();
            if (h87VarK.i() || h87Var.h()) {
                return h87VarK;
            }
            if (h87Var2 == null) {
                h87Var2 = h87Var.o();
            }
            h87 h87VarO = h87Var2.o();
            h87 h87VarM = h87VarK.m();
            return h87VarM.c() < h87VarK.c() ? h87VarO.j(h87VarM).m() : h87VarO.j(h87VarK);
        }

        public h87 C(h87 h87Var) {
            return D(H(h87Var));
        }

        public h87 D(h87 h87Var) {
            return H(H(h87Var));
        }

        public h87 E() {
            h87[] h87VarArr = this.d;
            h87 h87Var = h87VarArr[1];
            if (h87Var != null) {
                return h87Var;
            }
            h87 h87VarB = B(h87VarArr[0], null);
            h87VarArr[1] = h87VarB;
            return h87VarB;
        }

        public h87 F(h87 h87Var) {
            return H(h87Var).a(h87Var);
        }

        public d G(boolean z) {
            h87 h87Var = this.f20903b;
            h87 h87Var2 = this.c;
            h87 h87Var3 = this.d[0];
            h87 h87VarE = E();
            h87 h87VarA = F(h87Var.o()).a(h87VarE);
            h87 h87VarH = H(h87Var2);
            h87 h87VarJ = h87VarH.j(h87Var2);
            h87 h87VarH2 = H(h87Var.j(h87VarJ));
            h87 h87VarQ = h87VarA.o().q(H(h87VarH2));
            h87 h87VarH3 = H(h87VarJ.o());
            h87 h87VarQ2 = h87VarA.j(h87VarH2.q(h87VarQ)).q(h87VarH3);
            h87 h87VarH4 = z ? H(h87VarH3.j(h87VarE)) : null;
            if (!h87Var3.h()) {
                h87VarH = h87VarH.j(h87Var3);
            }
            return new d(i(), h87VarQ, h87VarQ2, new h87[]{h87VarH, h87VarH4}, this.e);
        }

        public h87 H(h87 h87Var) {
            return h87Var.a(h87Var);
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5341. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        @Override // defpackage.i97
        public defpackage.i97 a(defpackage.i97 r17) {
            /*
                Method dump skipped, instruction units count: 534
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i97.d.a(i97):i97");
        }

        @Override // defpackage.i97
        public i97 d() {
            return new d(null, f(), g());
        }

        @Override // defpackage.i97
        public h87 r(int i) {
            return (i == 1 && 4 == j()) ? E() : super.r(i);
        }

        @Override // defpackage.i97
        public i97 v() {
            if (s()) {
                return this;
            }
            b87 b87VarI = i();
            return b87VarI.n() != 0 ? new d(b87VarI, this.f20903b, this.c.m(), this.d, this.e) : new d(b87VarI, this.f20903b, this.c.m(), this.e);
        }

        public d(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
            super(b87Var, h87Var, h87Var2);
            if ((h87Var == null) == (h87Var2 == null)) {
                this.e = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        public d(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
            super(b87Var, h87Var, h87Var2, h87VarArr);
            this.e = z;
        }
    }

    public i97(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr) {
        this.f = null;
        this.f20902a = b87Var;
        this.f20903b = h87Var;
        this.c = h87Var2;
        this.d = h87VarArr;
    }
}
