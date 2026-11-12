package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class wnl extends h97.a {
    public wnl(a87 a87Var, g87 g87Var, g87 g87Var2) {
        this(a87Var, g87Var, g87Var2, false);
    }

    @Override // defpackage.h97
    public h97 G() {
        if (t()) {
            return this;
        }
        a87 a87VarI = i();
        g87 g87VarJ = this.f19826b;
        if (g87VarJ.i()) {
            return a87VarI.t();
        }
        g87 g87Var = this.c;
        g87 g87Var2 = this.d[0];
        boolean zH = g87Var2.h();
        g87 g87VarJ2 = zH ? g87Var : g87Var.j(g87Var2);
        g87 g87VarO = zH ? g87Var2 : g87Var2.o();
        g87 g87VarN = a87VarI.n();
        if (!zH) {
            g87VarN = g87VarN.j(g87VarO);
        }
        g87 g87VarA = g87Var.o().a(g87VarJ2).a(g87VarN);
        if (g87VarA.i()) {
            return new wnl(a87VarI, g87VarA, a87VarI.o().n(), this.e);
        }
        g87 g87VarO2 = g87VarA.o();
        g87 g87VarJ3 = zH ? g87VarA : g87VarA.j(g87VarO);
        if (!zH) {
            g87VarJ = g87VarJ.j(g87Var2);
        }
        return new wnl(a87VarI, g87VarO2, g87VarJ.p(g87VarA, g87VarJ2).a(g87VarO2).a(g87VarJ3), new g87[]{g87VarJ3}, this.e);
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
        g87 g87VarN = h97Var.n();
        g87 g87VarS = h97Var.s(0);
        if (g87VarN.i() || !g87VarS.h()) {
            return G().a(h97Var);
        }
        g87 g87Var2 = this.c;
        g87 g87Var3 = this.d[0];
        g87 g87VarO = h97Var.o();
        g87 g87VarO2 = g87Var.o();
        g87 g87VarO3 = g87Var2.o();
        g87 g87VarO4 = g87Var3.o();
        g87 g87VarA = a87VarI.n().j(g87VarO4).a(g87VarO3).a(g87Var2.j(g87Var3));
        g87 g87VarB = g87VarO.b();
        g87 g87VarL = a87VarI.n().a(g87VarB).j(g87VarO4).a(g87VarO3).l(g87VarA, g87VarO2, g87VarO4);
        g87 g87VarJ = g87VarN.j(g87VarO4);
        g87 g87VarO5 = g87VarJ.a(g87VarA).o();
        if (g87VarO5.i()) {
            return g87VarL.i() ? h97Var.G() : a87VarI.t();
        }
        if (g87VarL.i()) {
            return new wnl(a87VarI, g87VarL, a87VarI.o().n(), this.e);
        }
        g87 g87VarJ2 = g87VarL.o().j(g87VarJ);
        g87 g87VarJ3 = g87VarL.j(g87VarO5).j(g87VarO4);
        return new wnl(a87VarI, g87VarJ2, g87VarL.a(g87VarO5).o().l(g87VarA, g87VarB, g87VarJ3), new g87[]{g87VarJ3}, this.e);
    }

    @Override // defpackage.h97
    public h97 a(h97 h97Var) {
        g87 g87VarJ;
        g87 g87VarJ2;
        g87 g87VarJ3;
        g87 g87VarA;
        g87 g87Var;
        g87 g87VarM;
        if (t()) {
            return h97Var;
        }
        if (h97Var.t()) {
            return this;
        }
        a87 a87VarI = i();
        g87 g87VarJ4 = this.f19826b;
        g87 g87VarN = h97Var.n();
        if (g87VarJ4.i()) {
            return g87VarN.i() ? a87VarI.t() : h97Var.a(this);
        }
        g87 g87Var2 = this.c;
        g87 g87Var3 = this.d[0];
        g87 g87VarO = h97Var.o();
        g87 g87VarS = h97Var.s(0);
        boolean zH = g87Var3.h();
        if (zH) {
            g87VarJ = g87VarN;
            g87VarJ2 = g87VarO;
        } else {
            g87VarJ = g87VarN.j(g87Var3);
            g87VarJ2 = g87VarO.j(g87Var3);
        }
        boolean zH2 = g87VarS.h();
        if (zH2) {
            g87VarJ3 = g87Var2;
        } else {
            g87VarJ4 = g87VarJ4.j(g87VarS);
            g87VarJ3 = g87Var2.j(g87VarS);
        }
        g87 g87VarA2 = g87VarJ3.a(g87VarJ2);
        g87 g87VarA3 = g87VarJ4.a(g87VarJ);
        if (g87VarA3.i()) {
            return g87VarA2.i() ? G() : a87VarI.t();
        }
        if (g87VarN.i()) {
            h97 h97VarY = y();
            g87 g87VarQ = h97VarY.q();
            g87 g87VarR = h97VarY.r();
            g87 g87VarD = g87VarR.a(g87VarO).d(g87VarQ);
            g87VarA = g87VarD.o().a(g87VarD).a(g87VarQ).a(a87VarI.n());
            if (g87VarA.i()) {
                return new wnl(a87VarI, g87VarA, a87VarI.o().n(), this.e);
            }
            g87 g87VarA4 = g87VarD.j(g87VarQ.a(g87VarA)).a(g87VarA).a(g87VarR).d(g87VarA).a(g87VarA);
            g87VarM = a87VarI.m(z77.f40976b);
            g87Var = g87VarA4;
        } else {
            g87 g87VarO2 = g87VarA3.o();
            g87 g87VarJ5 = g87VarA2.j(g87VarJ4);
            g87 g87VarJ6 = g87VarA2.j(g87VarJ);
            g87 g87VarJ7 = g87VarJ5.j(g87VarJ6);
            if (g87VarJ7.i()) {
                return new wnl(a87VarI, g87VarJ7, a87VarI.o().n(), this.e);
            }
            g87 g87VarJ8 = g87VarA2.j(g87VarO2);
            g87 g87VarJ9 = !zH2 ? g87VarJ8.j(g87VarS) : g87VarJ8;
            g87 g87VarP = g87VarJ6.a(g87VarO2).p(g87VarJ9, g87Var2.a(g87Var3));
            if (!zH) {
                g87VarJ9 = g87VarJ9.j(g87Var3);
            }
            g87VarA = g87VarJ7;
            g87Var = g87VarP;
            g87VarM = g87VarJ9;
        }
        return new wnl(a87VarI, g87VarA, g87Var, new g87[]{g87VarM}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new wnl(null, f(), g());
    }

    @Override // defpackage.h97
    public boolean h() {
        g87 g87VarN = n();
        return (g87VarN.i() || o().s() == g87VarN.s()) ? false : true;
    }

    @Override // defpackage.h97
    public g87 r() {
        g87 g87Var = this.f19826b;
        g87 g87Var2 = this.c;
        if (t() || g87Var.i()) {
            return g87Var2;
        }
        g87 g87VarJ = g87Var2.a(g87Var).j(g87Var);
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
        g87 g87Var2 = this.c;
        g87 g87Var3 = this.d[0];
        return new wnl(this.f19825a, g87Var, g87Var2.a(g87Var3), new g87[]{g87Var3}, this.e);
    }

    public wnl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public wnl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
