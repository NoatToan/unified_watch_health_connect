package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h97 {
    public static g87[] g = new g87[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a87 f19825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g87 f19826b;
    public g87 c;
    public g87[] d;
    public boolean e;
    public Hashtable f;

    public static abstract class a extends h97 {
        public a(a87 a87Var, g87 g87Var, g87 g87Var2) {
            super(a87Var, g87Var, g87Var2);
        }

        @Override // defpackage.h97
        public boolean B() {
            g87 g87VarL;
            g87 g87VarP;
            a87 a87VarI = i();
            g87 g87Var = this.f19826b;
            g87 g87VarN = a87VarI.n();
            g87 g87VarO = a87VarI.o();
            int iQ = a87VarI.q();
            if (iQ != 6) {
                g87 g87Var2 = this.c;
                g87 g87VarJ = g87Var2.a(g87Var).j(g87Var2);
                if (iQ != 0) {
                    if (iQ != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    g87 g87Var3 = this.d[0];
                    if (!g87Var3.h()) {
                        g87 g87VarJ2 = g87Var3.j(g87Var3.o());
                        g87VarJ = g87VarJ.j(g87Var3);
                        g87VarN = g87VarN.j(g87Var3);
                        g87VarO = g87VarO.j(g87VarJ2);
                    }
                }
                return g87VarJ.equals(g87Var.a(g87VarN).j(g87Var.o()).a(g87VarO));
            }
            g87 g87Var4 = this.d[0];
            boolean zH = g87Var4.h();
            if (g87Var.i()) {
                g87 g87VarO2 = this.c.o();
                if (!zH) {
                    g87VarO = g87VarO.j(g87Var4.o());
                }
                return g87VarO2.equals(g87VarO);
            }
            g87 g87Var5 = this.c;
            g87 g87VarO3 = g87Var.o();
            if (zH) {
                g87VarL = g87Var5.o().a(g87Var5).a(g87VarN);
                g87VarP = g87VarO3.o().a(g87VarO);
            } else {
                g87 g87VarO4 = g87Var4.o();
                g87 g87VarO5 = g87VarO4.o();
                g87VarL = g87Var5.a(g87Var4).l(g87Var5, g87VarN, g87VarO4);
                g87VarP = g87VarO3.p(g87VarO, g87VarO5);
            }
            return g87VarL.j(g87VarO3).equals(g87VarP);
        }

        @Override // defpackage.h97
        public h97 C(g87 g87Var) {
            if (t()) {
                return this;
            }
            int iJ = j();
            if (iJ == 5) {
                g87 g87VarN = n();
                g87 g87VarO = o();
                return i().i(g87VarN, g87VarO.a(g87VarN).d(g87Var).a(g87VarN.j(g87Var)), p(), this.e);
            }
            if (iJ != 6) {
                return super.C(g87Var);
            }
            g87 g87VarN2 = n();
            g87 g87VarO2 = o();
            g87 g87Var2 = p()[0];
            g87 g87VarJ = g87VarN2.j(g87Var.o());
            return i().i(g87VarJ, g87VarO2.a(g87VarN2).a(g87VarJ), new g87[]{g87Var2.j(g87Var)}, this.e);
        }

        @Override // defpackage.h97
        public h97 D(g87 g87Var) {
            if (t()) {
                return this;
            }
            int iJ = j();
            if (iJ != 5 && iJ != 6) {
                return super.D(g87Var);
            }
            g87 g87VarN = n();
            return i().i(g87VarN, o().a(g87VarN).j(g87Var).a(g87VarN), p(), this.e);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0045  */
        public a I(int i) {
            h97 h97VarH;
            if (t()) {
                return this;
            }
            a87 a87VarI = i();
            int iQ = a87VarI.q();
            g87 g87Var = this.f19826b;
            if (iQ == 0) {
                h97VarH = a87VarI.h(g87Var.q(i), this.c.q(i), this.e);
            } else {
                if (iQ != 1) {
                    if (iQ == 5) {
                        h97VarH = a87VarI.h(g87Var.q(i), this.c.q(i), this.e);
                    } else if (iQ != 6) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                }
                h97VarH = a87VarI.i(g87Var.q(i), this.c.q(i), new g87[]{this.d[0].q(i)}, this.e);
            }
            return (a) h97VarH;
        }

        public a(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr) {
            super(a87Var, g87Var, g87Var2, g87VarArr);
        }
    }

    public static abstract class b extends h97 {
        public b(a87 a87Var, g87 g87Var, g87 g87Var2) {
            super(a87Var, g87Var, g87Var2);
        }

        @Override // defpackage.h97
        public boolean B() {
            g87 g87Var = this.f19826b;
            g87 g87Var2 = this.c;
            g87 g87VarN = this.f19825a.n();
            g87 g87VarO = this.f19825a.o();
            g87 g87VarO2 = g87Var2.o();
            int iJ = j();
            if (iJ != 0) {
                if (iJ == 1) {
                    g87 g87Var3 = this.d[0];
                    if (!g87Var3.h()) {
                        g87 g87VarO3 = g87Var3.o();
                        g87 g87VarJ = g87Var3.j(g87VarO3);
                        g87VarO2 = g87VarO2.j(g87Var3);
                        g87VarN = g87VarN.j(g87VarO3);
                        g87VarO = g87VarO.j(g87VarJ);
                    }
                } else {
                    if (iJ != 2 && iJ != 3 && iJ != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    g87 g87Var4 = this.d[0];
                    if (!g87Var4.h()) {
                        g87 g87VarO4 = g87Var4.o();
                        g87 g87VarO5 = g87VarO4.o();
                        g87 g87VarJ2 = g87VarO4.j(g87VarO5);
                        g87VarN = g87VarN.j(g87VarO5);
                        g87VarO = g87VarO.j(g87VarJ2);
                    }
                }
            }
            return g87VarO2.equals(g87Var.o().a(g87VarN).j(g87Var).a(g87VarO));
        }

        @Override // defpackage.h97
        public boolean h() {
            return g().s();
        }

        public b(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr) {
            super(a87Var, g87Var, g87Var2, g87VarArr);
        }
    }

    public static class c extends a {
        public c(a87 a87Var, g87 g87Var, g87 g87Var2) {
            this(a87Var, g87Var, g87Var2, false);
        }

        @Override // defpackage.h97
        public h97 G() {
            g87 g87VarA;
            if (t()) {
                return this;
            }
            a87 a87VarI = i();
            g87 g87VarJ = this.f19826b;
            if (g87VarJ.i()) {
                return a87VarI.t();
            }
            int iQ = a87VarI.q();
            if (iQ == 0) {
                g87 g87VarA2 = this.c.d(g87VarJ).a(g87VarJ);
                g87 g87VarA3 = g87VarA2.o().a(g87VarA2).a(a87VarI.n());
                return new c(a87VarI, g87VarA3, g87VarJ.p(g87VarA3, g87VarA2.b()), this.e);
            }
            if (iQ == 1) {
                g87 g87VarJ2 = this.c;
                g87 g87Var = this.d[0];
                boolean zH = g87Var.h();
                g87 g87VarJ3 = zH ? g87VarJ : g87VarJ.j(g87Var);
                if (!zH) {
                    g87VarJ2 = g87VarJ2.j(g87Var);
                }
                g87 g87VarO = g87VarJ.o();
                g87 g87VarA4 = g87VarO.a(g87VarJ2);
                g87 g87VarO2 = g87VarJ3.o();
                g87 g87VarA5 = g87VarA4.a(g87VarJ3);
                g87 g87VarL = g87VarA5.l(g87VarA4, g87VarO2, a87VarI.n());
                return new c(a87VarI, g87VarJ3.j(g87VarL), g87VarO.o().l(g87VarJ3, g87VarL, g87VarA5), new g87[]{g87VarJ3.j(g87VarO2)}, this.e);
            }
            if (iQ != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            g87 g87Var2 = this.c;
            g87 g87Var3 = this.d[0];
            boolean zH2 = g87Var3.h();
            g87 g87VarJ4 = zH2 ? g87Var2 : g87Var2.j(g87Var3);
            g87 g87VarO3 = zH2 ? g87Var3 : g87Var3.o();
            g87 g87VarN = a87VarI.n();
            g87 g87VarJ5 = zH2 ? g87VarN : g87VarN.j(g87VarO3);
            g87 g87VarA6 = g87Var2.o().a(g87VarJ4).a(g87VarJ5);
            if (g87VarA6.i()) {
                return new c(a87VarI, g87VarA6, a87VarI.o().n(), this.e);
            }
            g87 g87VarO4 = g87VarA6.o();
            g87 g87VarJ6 = zH2 ? g87VarA6 : g87VarA6.j(g87VarO3);
            g87 g87VarO5 = a87VarI.o();
            if (g87VarO5.c() < (a87VarI.s() >> 1)) {
                g87 g87VarO6 = g87Var2.a(g87VarJ).o();
                g87VarA = g87VarO6.a(g87VarA6).a(g87VarO3).j(g87VarO6).a(g87VarO5.h() ? g87VarJ5.a(g87VarO3).o() : g87VarJ5.p(g87VarO5, g87VarO3.o())).a(g87VarO4);
                if (!g87VarN.i()) {
                    if (!g87VarN.h()) {
                        g87VarA = g87VarA.a(g87VarN.b().j(g87VarJ6));
                    }
                }
                return new c(a87VarI, g87VarO4, g87VarA, new g87[]{g87VarJ6}, this.e);
            }
            if (!zH2) {
                g87VarJ = g87VarJ.j(g87Var3);
            }
            g87VarA = g87VarJ.p(g87VarA6, g87VarJ4).a(g87VarO4);
            g87VarA = g87VarA.a(g87VarJ6);
            return new c(a87VarI, g87VarO4, g87VarA, new g87[]{g87VarJ6}, this.e);
        }

        @Override // defpackage.h97
        public h97 H(h97 h97Var) {
            if (t()) {
                return h97Var;
            }
            if (h97Var.t()) {
                return G();
            }
            a87 a87VarI = i();
            g87 g87Var = this.f19826b;
            if (g87Var.i()) {
                return h97Var;
            }
            if (a87VarI.q() != 6) {
                return G().a(h97Var);
            }
            g87 g87Var2 = h97Var.f19826b;
            g87 g87Var3 = h97Var.d[0];
            if (g87Var2.i() || !g87Var3.h()) {
                return G().a(h97Var);
            }
            g87 g87Var4 = this.c;
            g87 g87Var5 = this.d[0];
            g87 g87Var6 = h97Var.c;
            g87 g87VarO = g87Var.o();
            g87 g87VarO2 = g87Var4.o();
            g87 g87VarO3 = g87Var5.o();
            g87 g87VarA = a87VarI.n().j(g87VarO3).a(g87VarO2).a(g87Var4.j(g87Var5));
            g87 g87VarB = g87Var6.b();
            g87 g87VarL = a87VarI.n().a(g87VarB).j(g87VarO3).a(g87VarO2).l(g87VarA, g87VarO, g87VarO3);
            g87 g87VarJ = g87Var2.j(g87VarO3);
            g87 g87VarO4 = g87VarJ.a(g87VarA).o();
            if (g87VarO4.i()) {
                return g87VarL.i() ? h97Var.G() : a87VarI.t();
            }
            if (g87VarL.i()) {
                return new c(a87VarI, g87VarL, a87VarI.o().n(), this.e);
            }
            g87 g87VarJ2 = g87VarL.o().j(g87VarJ);
            g87 g87VarJ3 = g87VarL.j(g87VarO4).j(g87VarO3);
            return new c(a87VarI, g87VarJ2, g87VarL.a(g87VarO4).o().l(g87VarA, g87VarB, g87VarJ3), new g87[]{g87VarJ3}, this.e);
        }

        @Override // defpackage.h97
        public h97 a(h97 h97Var) {
            g87 g87VarJ;
            g87 g87VarJ2;
            g87 g87VarJ3;
            g87 g87Var;
            g87 g87VarA;
            g87 g87VarM;
            if (t()) {
                return h97Var;
            }
            if (h97Var.t()) {
                return this;
            }
            a87 a87VarI = i();
            int iQ = a87VarI.q();
            g87 g87VarJ4 = this.f19826b;
            g87 g87Var2 = h97Var.f19826b;
            if (iQ == 0) {
                g87 g87Var3 = this.c;
                g87 g87Var4 = h97Var.c;
                g87 g87VarA2 = g87VarJ4.a(g87Var2);
                g87 g87VarA3 = g87Var3.a(g87Var4);
                if (g87VarA2.i()) {
                    return g87VarA3.i() ? G() : a87VarI.t();
                }
                g87 g87VarD = g87VarA3.d(g87VarA2);
                g87 g87VarA4 = g87VarD.o().a(g87VarD).a(g87VarA2).a(a87VarI.n());
                return new c(a87VarI, g87VarA4, g87VarD.j(g87VarJ4.a(g87VarA4)).a(g87VarA4).a(g87Var3), this.e);
            }
            if (iQ == 1) {
                g87 g87Var5 = this.c;
                g87 g87VarJ5 = this.d[0];
                g87 g87Var6 = h97Var.c;
                g87 g87Var7 = h97Var.d[0];
                boolean zH = g87Var7.h();
                g87 g87VarA5 = g87VarJ5.j(g87Var6).a(zH ? g87Var5 : g87Var5.j(g87Var7));
                g87 g87VarA6 = g87VarJ5.j(g87Var2).a(zH ? g87VarJ4 : g87VarJ4.j(g87Var7));
                if (g87VarA6.i()) {
                    return g87VarA5.i() ? G() : a87VarI.t();
                }
                g87 g87VarO = g87VarA6.o();
                g87 g87VarJ6 = g87VarO.j(g87VarA6);
                if (!zH) {
                    g87VarJ5 = g87VarJ5.j(g87Var7);
                }
                g87 g87VarA7 = g87VarA5.a(g87VarA6);
                g87 g87VarA8 = g87VarA7.l(g87VarA5, g87VarO, a87VarI.n()).j(g87VarJ5).a(g87VarJ6);
                g87 g87VarJ7 = g87VarA6.j(g87VarA8);
                if (!zH) {
                    g87VarO = g87VarO.j(g87Var7);
                }
                return new c(a87VarI, g87VarJ7, g87VarA5.l(g87VarJ4, g87VarA6, g87Var5).l(g87VarO, g87VarA7, g87VarA8), new g87[]{g87VarJ6.j(g87VarJ5)}, this.e);
            }
            if (iQ != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (g87VarJ4.i()) {
                return g87Var2.i() ? a87VarI.t() : h97Var.a(this);
            }
            g87 g87Var8 = this.c;
            g87 g87Var9 = this.d[0];
            g87 g87Var10 = h97Var.c;
            g87 g87Var11 = h97Var.d[0];
            boolean zH2 = g87Var9.h();
            if (zH2) {
                g87VarJ = g87Var2;
                g87VarJ2 = g87Var10;
            } else {
                g87VarJ = g87Var2.j(g87Var9);
                g87VarJ2 = g87Var10.j(g87Var9);
            }
            boolean zH3 = g87Var11.h();
            if (zH3) {
                g87VarJ3 = g87Var8;
            } else {
                g87VarJ4 = g87VarJ4.j(g87Var11);
                g87VarJ3 = g87Var8.j(g87Var11);
            }
            g87 g87VarA9 = g87VarJ3.a(g87VarJ2);
            g87 g87VarA10 = g87VarJ4.a(g87VarJ);
            if (g87VarA10.i()) {
                return g87VarA9.i() ? G() : a87VarI.t();
            }
            if (g87Var2.i()) {
                h97 h97VarY = y();
                g87 g87VarQ = h97VarY.q();
                g87 g87VarR = h97VarY.r();
                g87 g87VarD2 = g87VarR.a(g87Var10).d(g87VarQ);
                g87VarA = g87VarD2.o().a(g87VarD2).a(g87VarQ).a(a87VarI.n());
                if (g87VarA.i()) {
                    return new c(a87VarI, g87VarA, a87VarI.o().n(), this.e);
                }
                g87 g87VarA11 = g87VarD2.j(g87VarQ.a(g87VarA)).a(g87VarA).a(g87VarR).d(g87VarA).a(g87VarA);
                g87VarM = a87VarI.m(z77.f40976b);
                g87Var = g87VarA11;
            } else {
                g87 g87VarO2 = g87VarA10.o();
                g87 g87VarJ8 = g87VarA9.j(g87VarJ4);
                g87 g87VarJ9 = g87VarA9.j(g87VarJ);
                g87 g87VarJ10 = g87VarJ8.j(g87VarJ9);
                if (g87VarJ10.i()) {
                    return new c(a87VarI, g87VarJ10, a87VarI.o().n(), this.e);
                }
                g87 g87VarJ11 = g87VarA9.j(g87VarO2);
                g87 g87VarJ12 = !zH3 ? g87VarJ11.j(g87Var11) : g87VarJ11;
                g87 g87VarP = g87VarJ9.a(g87VarO2).p(g87VarJ12, g87Var8.a(g87Var9));
                if (!zH2) {
                    g87VarJ12 = g87VarJ12.j(g87Var9);
                }
                g87Var = g87VarP;
                g87VarA = g87VarJ10;
                g87VarM = g87VarJ12;
            }
            return new c(a87VarI, g87VarA, g87Var, new g87[]{g87VarM}, this.e);
        }

        @Override // defpackage.h97
        public h97 d() {
            return new c(null, f(), g());
        }

        @Override // defpackage.h97
        public boolean h() {
            g87 g87VarN = n();
            if (g87VarN.i()) {
                return false;
            }
            g87 g87VarO = o();
            int iJ = j();
            if (iJ == 5 || iJ == 6) {
                return g87VarO.s() != g87VarN.s();
            }
            return g87VarO.d(g87VarN).s();
        }

        @Override // defpackage.h97
        public g87 r() {
            int iJ = j();
            if (iJ != 5 && iJ != 6) {
                return this.c;
            }
            g87 g87Var = this.f19826b;
            g87 g87Var2 = this.c;
            if (t() || g87Var.i()) {
                return g87Var2;
            }
            g87 g87VarJ = g87Var2.a(g87Var).j(g87Var);
            if (6 != iJ) {
                return g87VarJ;
            }
            g87 g87Var3 = this.d[0];
            return !g87Var3.h() ? g87VarJ.d(g87Var3) : g87VarJ;
        }

        @Override // defpackage.h97
        public h97 x() {
            if (t()) {
                return this;
            }
            g87 g87Var = this.f19826b;
            if (g87Var.i()) {
                return this;
            }
            int iJ = j();
            if (iJ == 0) {
                return new c(this.f19825a, g87Var, this.c.a(g87Var), this.e);
            }
            if (iJ == 1) {
                return new c(this.f19825a, g87Var, this.c.a(g87Var), new g87[]{this.d[0]}, this.e);
            }
            if (iJ == 5) {
                return new c(this.f19825a, g87Var, this.c.b(), this.e);
            }
            if (iJ != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            g87 g87Var2 = this.c;
            g87 g87Var3 = this.d[0];
            return new c(this.f19825a, g87Var, g87Var2.a(g87Var3), new g87[]{g87Var3}, this.e);
        }

        public c(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
            super(a87Var, g87Var, g87Var2);
            if ((g87Var == null) != (g87Var2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (g87Var != null) {
                g87.a.u(this.f19826b, this.c);
                if (a87Var != null) {
                    g87.a.u(this.f19826b, this.f19825a.n());
                }
            }
            this.e = z;
        }

        public c(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
            super(a87Var, g87Var, g87Var2, g87VarArr);
            this.e = z;
        }
    }

    public static class d extends b {
        public d(a87 a87Var, g87 g87Var, g87 g87Var2) {
            this(a87Var, g87Var, g87Var2, false);
        }

        @Override // defpackage.h97
        public h97 E() {
            if (t()) {
                return this;
            }
            g87 g87Var = this.c;
            if (g87Var.i()) {
                return this;
            }
            a87 a87VarI = i();
            int iQ = a87VarI.q();
            if (iQ != 0) {
                return iQ != 4 ? G().a(this) : N(false).a(this);
            }
            g87 g87Var2 = this.f19826b;
            g87 g87VarO = O(g87Var);
            g87 g87VarO2 = g87VarO.o();
            g87 g87VarA = M(g87Var2.o()).a(i().n());
            g87 g87VarR = M(g87Var2).j(g87VarO2).r(g87VarA.o());
            if (g87VarR.i()) {
                return i().t();
            }
            g87 g87VarG = g87VarR.j(g87VarO).g();
            g87 g87VarJ = g87VarR.j(g87VarG).j(g87VarA);
            g87 g87VarR2 = g87VarO2.o().j(g87VarG).r(g87VarJ);
            g87 g87VarA2 = g87VarR2.r(g87VarJ).j(g87VarJ.a(g87VarR2)).a(g87Var2);
            return new d(a87VarI, g87VarA2, g87Var2.r(g87VarA2).j(g87VarR2).r(g87Var), this.e);
        }

        @Override // defpackage.h97
        public h97 F(int i) {
            g87 g87VarO;
            if (i < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (i == 0 || t()) {
                return this;
            }
            if (i == 1) {
                return G();
            }
            a87 a87VarI = i();
            g87 g87VarJ = this.c;
            if (g87VarJ.i()) {
                return a87VarI.t();
            }
            int iQ = a87VarI.q();
            g87 g87VarN = a87VarI.n();
            g87 g87VarJ2 = this.f19826b;
            g87[] g87VarArr = this.d;
            int i2 = 0;
            g87 g87VarM = g87VarArr.length < 1 ? a87VarI.m(z77.f40976b) : g87VarArr[0];
            if (!g87VarM.h() && iQ != 0) {
                if (iQ == 1) {
                    g87VarO = g87VarM.o();
                    g87VarJ2 = g87VarJ2.j(g87VarM);
                    g87VarJ = g87VarJ.j(g87VarO);
                } else if (iQ == 2) {
                    g87VarO = null;
                } else {
                    if (iQ != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    g87VarN = L();
                }
                g87VarN = I(g87VarM, g87VarO);
            }
            g87 g87Var = g87VarN;
            g87 g87VarR = g87VarJ;
            g87 g87Var2 = g87VarJ2;
            g87 g87VarO2 = g87Var;
            while (i2 < i) {
                if (g87VarR.i()) {
                    return a87VarI.t();
                }
                g87 g87VarM2 = M(g87Var2.o());
                g87 g87VarO3 = O(g87VarR);
                g87 g87VarJ3 = g87VarO3.j(g87VarR);
                g87 g87VarO4 = O(g87Var2.j(g87VarJ3));
                g87 g87VarO5 = O(g87VarJ3.o());
                if (!g87VarO2.i()) {
                    g87VarM2 = g87VarM2.a(g87VarO2);
                    g87VarO2 = O(g87VarO5.j(g87VarO2));
                }
                g87 g87VarR2 = g87VarM2.o().r(O(g87VarO4));
                g87VarR = g87VarM2.j(g87VarO4.r(g87VarR2)).r(g87VarO5);
                g87VarM = g87VarM.h() ? g87VarO3 : g87VarO3.j(g87VarM);
                i2++;
                g87Var2 = g87VarR2;
            }
            if (iQ == 0) {
                g87 g87VarG = g87VarM.g();
                g87 g87VarO6 = g87VarG.o();
                return new d(a87VarI, g87Var2.j(g87VarO6), g87VarR.j(g87VarO6.j(g87VarG)), this.e);
            }
            if (iQ == 1) {
                return new d(a87VarI, g87Var2.j(g87VarM), g87VarR, new g87[]{g87VarM.j(g87VarM.o())}, this.e);
            }
            if (iQ == 2) {
                return new d(a87VarI, g87Var2, g87VarR, new g87[]{g87VarM}, this.e);
            }
            if (iQ == 4) {
                return new d(a87VarI, g87Var2, g87VarR, new g87[]{g87VarM, g87VarO2}, this.e);
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        @Override // defpackage.h97
        public h97 G() {
            g87 g87VarR;
            g87 g87VarJ;
            if (t()) {
                return this;
            }
            a87 a87VarI = i();
            g87 g87Var = this.c;
            if (g87Var.i()) {
                return a87VarI.t();
            }
            int iQ = a87VarI.q();
            g87 g87Var2 = this.f19826b;
            if (iQ == 0) {
                g87 g87VarD = M(g87Var2.o()).a(i().n()).d(O(g87Var));
                g87 g87VarR2 = g87VarD.o().r(O(g87Var2));
                return new d(a87VarI, g87VarR2, g87VarD.j(g87Var2.r(g87VarR2)).r(g87Var), this.e);
            }
            if (iQ == 1) {
                g87 g87Var3 = this.d[0];
                boolean zH = g87Var3.h();
                g87 g87VarN = a87VarI.n();
                if (!g87VarN.i() && !zH) {
                    g87VarN = g87VarN.j(g87Var3.o());
                }
                g87 g87VarA = g87VarN.a(M(g87Var2.o()));
                g87 g87VarJ2 = zH ? g87Var : g87Var.j(g87Var3);
                g87 g87VarO = zH ? g87Var.o() : g87VarJ2.j(g87Var);
                g87 g87VarK = K(g87Var2.j(g87VarO));
                g87 g87VarR3 = g87VarA.o().r(O(g87VarK));
                g87 g87VarO2 = O(g87VarJ2);
                g87 g87VarJ3 = g87VarR3.j(g87VarO2);
                g87 g87VarO3 = O(g87VarO);
                return new d(a87VarI, g87VarJ3, g87VarK.r(g87VarR3).j(g87VarA).r(O(g87VarO3.o())), new g87[]{O(zH ? O(g87VarO3) : g87VarO2.o()).j(g87VarJ2)}, this.e);
            }
            if (iQ != 2) {
                if (iQ == 4) {
                    return N(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            g87 g87Var4 = this.d[0];
            boolean zH2 = g87Var4.h();
            g87 g87VarO4 = g87Var.o();
            g87 g87VarO5 = g87VarO4.o();
            g87 g87VarN2 = a87VarI.n();
            g87 g87VarM = g87VarN2.m();
            if (g87VarM.t().equals(BigInteger.valueOf(3L))) {
                g87 g87VarO6 = zH2 ? g87Var4 : g87Var4.o();
                g87VarR = M(g87Var2.a(g87VarO6).j(g87Var2.r(g87VarO6)));
                g87VarJ = g87VarO4.j(g87Var2);
            } else {
                g87 g87VarM2 = M(g87Var2.o());
                if (zH2) {
                    g87VarR = g87VarM2.a(g87VarN2);
                } else if (g87VarN2.i()) {
                    g87VarR = g87VarM2;
                } else {
                    g87 g87VarO7 = g87Var4.o().o();
                    if (g87VarM.c() < g87VarN2.c()) {
                        g87VarR = g87VarM2.r(g87VarO7.j(g87VarM));
                    } else {
                        g87VarN2 = g87VarO7.j(g87VarN2);
                        g87VarR = g87VarM2.a(g87VarN2);
                    }
                }
                g87VarJ = g87Var2.j(g87VarO4);
            }
            g87 g87VarK2 = K(g87VarJ);
            g87 g87VarR4 = g87VarR.o().r(O(g87VarK2));
            g87 g87VarR5 = g87VarK2.r(g87VarR4).j(g87VarR).r(J(g87VarO5));
            g87 g87VarO8 = O(g87Var);
            if (!zH2) {
                g87VarO8 = g87VarO8.j(g87Var4);
            }
            return new d(a87VarI, g87VarR4, g87VarR5, new g87[]{g87VarO8}, this.e);
        }

        @Override // defpackage.h97
        public h97 H(h97 h97Var) {
            if (this == h97Var) {
                return E();
            }
            if (t()) {
                return h97Var;
            }
            if (h97Var.t()) {
                return G();
            }
            g87 g87Var = this.c;
            if (g87Var.i()) {
                return h97Var;
            }
            a87 a87VarI = i();
            int iQ = a87VarI.q();
            if (iQ != 0) {
                return iQ != 4 ? G().a(h97Var) : N(false).a(h97Var);
            }
            g87 g87Var2 = this.f19826b;
            g87 g87Var3 = h97Var.f19826b;
            g87 g87Var4 = h97Var.c;
            g87 g87VarR = g87Var3.r(g87Var2);
            g87 g87VarR2 = g87Var4.r(g87Var);
            if (g87VarR.i()) {
                return g87VarR2.i() ? E() : this;
            }
            g87 g87VarO = g87VarR.o();
            g87 g87VarR3 = g87VarO.j(O(g87Var2).a(g87Var3)).r(g87VarR2.o());
            if (g87VarR3.i()) {
                return a87VarI.t();
            }
            g87 g87VarG = g87VarR3.j(g87VarR).g();
            g87 g87VarJ = g87VarR3.j(g87VarG).j(g87VarR2);
            g87 g87VarR4 = O(g87Var).j(g87VarO).j(g87VarR).j(g87VarG).r(g87VarJ);
            g87 g87VarA = g87VarR4.r(g87VarJ).j(g87VarJ.a(g87VarR4)).a(g87Var3);
            return new d(a87VarI, g87VarA, g87Var2.r(g87VarA).j(g87VarR4).r(g87Var), this.e);
        }

        public g87 I(g87 g87Var, g87 g87Var2) {
            g87 g87VarN = i().n();
            if (g87VarN.i() || g87Var.h()) {
                return g87VarN;
            }
            if (g87Var2 == null) {
                g87Var2 = g87Var.o();
            }
            g87 g87VarO = g87Var2.o();
            g87 g87VarM = g87VarN.m();
            return g87VarM.c() < g87VarN.c() ? g87VarO.j(g87VarM).m() : g87VarO.j(g87VarN);
        }

        public g87 J(g87 g87Var) {
            return K(O(g87Var));
        }

        public g87 K(g87 g87Var) {
            return O(O(g87Var));
        }

        public g87 L() {
            g87[] g87VarArr = this.d;
            g87 g87Var = g87VarArr[1];
            if (g87Var != null) {
                return g87Var;
            }
            g87 g87VarI = I(g87VarArr[0], null);
            g87VarArr[1] = g87VarI;
            return g87VarI;
        }

        public g87 M(g87 g87Var) {
            return O(g87Var).a(g87Var);
        }

        public d N(boolean z) {
            g87 g87Var = this.f19826b;
            g87 g87Var2 = this.c;
            g87 g87Var3 = this.d[0];
            g87 g87VarL = L();
            g87 g87VarA = M(g87Var.o()).a(g87VarL);
            g87 g87VarO = O(g87Var2);
            g87 g87VarJ = g87VarO.j(g87Var2);
            g87 g87VarO2 = O(g87Var.j(g87VarJ));
            g87 g87VarR = g87VarA.o().r(O(g87VarO2));
            g87 g87VarO3 = O(g87VarJ.o());
            g87 g87VarR2 = g87VarA.j(g87VarO2.r(g87VarR)).r(g87VarO3);
            g87 g87VarO4 = z ? O(g87VarO3.j(g87VarL)) : null;
            if (!g87Var3.h()) {
                g87VarO = g87VarO.j(g87Var3);
            }
            return new d(i(), g87VarR, g87VarR2, new g87[]{g87VarO, g87VarO4}, this.e);
        }

        public g87 O(g87 g87Var) {
            return g87Var.a(g87Var);
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5341. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        @Override // defpackage.h97
        public defpackage.h97 a(defpackage.h97 r17) {
            /*
                Method dump skipped, instruction units count: 534
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h97.d.a(h97):h97");
        }

        @Override // defpackage.h97
        public h97 d() {
            return new d(null, f(), g());
        }

        @Override // defpackage.h97
        public g87 s(int i) {
            return (i == 1 && 4 == j()) ? L() : super.s(i);
        }

        @Override // defpackage.h97
        public h97 x() {
            if (t()) {
                return this;
            }
            a87 a87VarI = i();
            return a87VarI.q() != 0 ? new d(a87VarI, this.f19826b, this.c.m(), this.d, this.e) : new d(a87VarI, this.f19826b, this.c.m(), this.e);
        }

        public d(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
            super(a87Var, g87Var, g87Var2);
            if ((g87Var == null) != (g87Var2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.e = z;
        }

        public d(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
            super(a87Var, g87Var, g87Var2, g87VarArr);
            this.e = z;
        }
    }

    public h97(a87 a87Var, g87 g87Var, g87 g87Var2) {
        this(a87Var, g87Var, g87Var2, m(a87Var));
    }

    public static g87[] m(a87 a87Var) {
        int iQ = a87Var == null ? 0 : a87Var.q();
        if (iQ == 0 || iQ == 5) {
            return g;
        }
        g87 g87VarM = a87Var.m(z77.f40976b);
        if (iQ != 1 && iQ != 2) {
            if (iQ == 3) {
                return new g87[]{g87VarM, g87VarM, g87VarM};
            }
            if (iQ == 4) {
                return new g87[]{g87VarM, a87Var.n()};
            }
            if (iQ != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new g87[]{g87VarM};
    }

    public boolean A() {
        BigInteger bigIntegerP = this.f19825a.p();
        return bigIntegerP == null || bigIntegerP.equals(z77.f40976b) || !v77.i(this, bigIntegerP).t();
    }

    public abstract boolean B();

    public h97 C(g87 g87Var) {
        return t() ? this : i().i(n().j(g87Var), o(), p(), this.e);
    }

    public h97 D(g87 g87Var) {
        return t() ? this : i().i(n(), o().j(g87Var), p(), this.e);
    }

    public h97 E() {
        return H(this);
    }

    public h97 F(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        h97 h97VarG = this;
        while (true) {
            i--;
            if (i < 0) {
                return h97VarG;
            }
            h97VarG = h97VarG.G();
        }
    }

    public abstract h97 G();

    public h97 H(h97 h97Var) {
        return G().a(h97Var);
    }

    public abstract h97 a(h97 h97Var);

    public void b() {
        if (!u()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public h97 c(g87 g87Var, g87 g87Var2) {
        return i().h(n().j(g87Var), o().j(g87Var2), this.e);
    }

    public abstract h97 d();

    public boolean e(h97 h97Var) {
        h97 h97VarY;
        if (h97Var == null) {
            return false;
        }
        a87 a87VarI = i();
        a87 a87VarI2 = h97Var.i();
        boolean z = a87VarI == null;
        boolean z2 = a87VarI2 == null;
        boolean zT = t();
        boolean zT2 = h97Var.t();
        if (zT || zT2) {
            if (zT && zT2) {
                return z || z2 || a87VarI.l(a87VarI2);
            }
            return false;
        }
        if (z && z2) {
            h97VarY = this;
        } else if (z) {
            h97Var = h97Var.y();
            h97VarY = this;
        } else if (z2) {
            h97VarY = y();
        } else {
            if (!a87VarI.l(a87VarI2)) {
                return false;
            }
            h97[] h97VarArr = {this, a87VarI.x(h97Var)};
            a87VarI.y(h97VarArr);
            h97VarY = h97VarArr[0];
            h97Var = h97VarArr[1];
        }
        return h97VarY.q().equals(h97Var.q()) && h97VarY.r().equals(h97Var.r());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h97) {
            return e((h97) obj);
        }
        return false;
    }

    public g87 f() {
        b();
        return q();
    }

    public g87 g() {
        b();
        return r();
    }

    public abstract boolean h();

    public int hashCode() {
        a87 a87VarI = i();
        int i = a87VarI == null ? 0 : ~a87VarI.hashCode();
        if (t()) {
            return i;
        }
        h97 h97VarY = y();
        return (i ^ (h97VarY.q().hashCode() * 17)) ^ (h97VarY.r().hashCode() * 257);
    }

    public a87 i() {
        return this.f19825a;
    }

    public int j() {
        a87 a87Var = this.f19825a;
        if (a87Var == null) {
            return 0;
        }
        return a87Var.q();
    }

    public final h97 k() {
        return y().d();
    }

    public byte[] l(boolean z) {
        if (t()) {
            return new byte[1];
        }
        h97 h97VarY = y();
        byte[] bArrE = h97VarY.q().e();
        if (z) {
            byte[] bArr = new byte[bArrE.length + 1];
            bArr[0] = (byte) (h97VarY.h() ? 3 : 2);
            System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
            return bArr;
        }
        byte[] bArrE2 = h97VarY.r().e();
        byte[] bArr2 = new byte[bArrE.length + bArrE2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(bArrE, 0, bArr2, 1, bArrE.length);
        System.arraycopy(bArrE2, 0, bArr2, bArrE.length + 1, bArrE2.length);
        return bArr2;
    }

    public final g87 n() {
        return this.f19826b;
    }

    public final g87 o() {
        return this.c;
    }

    public final g87[] p() {
        return this.d;
    }

    public g87 q() {
        return this.f19826b;
    }

    public g87 r() {
        return this.c;
    }

    public g87 s(int i) {
        if (i >= 0) {
            g87[] g87VarArr = this.d;
            if (i < g87VarArr.length) {
                return g87VarArr[i];
            }
        }
        return null;
    }

    public boolean t() {
        if (this.f19826b != null && this.c != null) {
            g87[] g87VarArr = this.d;
            if (g87VarArr.length <= 0 || !g87VarArr[0].i()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        if (t()) {
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
        int iJ = j();
        return iJ == 0 || iJ == 5 || t() || this.d[0].h();
    }

    public boolean v() {
        return t() || i() == null || (B() && A());
    }

    public h97 w(BigInteger bigInteger) {
        return i().u().a(this, bigInteger);
    }

    public abstract h97 x();

    public h97 y() {
        int iJ;
        if (t() || (iJ = j()) == 0 || iJ == 5) {
            return this;
        }
        g87 g87VarS = s(0);
        return g87VarS.h() ? this : z(g87VarS.g());
    }

    public h97 z(g87 g87Var) {
        int iJ = j();
        if (iJ != 1) {
            if (iJ == 2 || iJ == 3 || iJ == 4) {
                g87 g87VarO = g87Var.o();
                return c(g87VarO, g87VarO.j(g87Var));
            }
            if (iJ != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return c(g87Var, g87Var);
    }

    public h97(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr) {
        this.f = null;
        this.f19825a = a87Var;
        this.f19826b = g87Var;
        this.c = g87Var2;
        this.d = g87VarArr;
    }
}
