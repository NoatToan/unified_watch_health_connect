package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class wpl extends h97.a {
    public wpl(a87 a87Var, g87 g87Var, g87 g87Var2) {
        this(a87Var, g87Var, g87Var2, false);
    }

    @Override // defpackage.h97
    public h97 G() {
        if (t()) {
            return this;
        }
        a87 a87VarI = i();
        g87 g87Var = this.f19826b;
        if (g87Var.i()) {
            return a87VarI.t();
        }
        g87 g87Var2 = this.c;
        g87 g87VarO = this.d[0];
        boolean zH = g87VarO.h();
        g87 g87VarO2 = zH ? g87VarO : g87VarO.o();
        g87 g87VarA = zH ? g87Var2.o().a(g87Var2) : g87Var2.a(g87VarO).j(g87Var2);
        if (g87VarA.i()) {
            return new wpl(a87VarI, g87VarA, a87VarI.o(), this.e);
        }
        g87 g87VarO3 = g87VarA.o();
        g87 g87VarJ = zH ? g87VarA : g87VarA.j(g87VarO2);
        g87 g87VarO4 = g87Var2.a(g87Var).o();
        if (!zH) {
            g87VarO = g87VarO2.o();
        }
        return new wpl(a87VarI, g87VarO3, g87VarO4.a(g87VarA).a(g87VarO2).j(g87VarO4).a(g87VarO).a(g87VarO3).a(g87VarJ), new g87[]{g87VarJ}, this.e);
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
        g87 g87VarA = g87VarO3.a(g87Var2.j(g87Var3));
        g87 g87VarB = g87VarO.b();
        g87 g87VarL = g87VarB.j(g87VarO4).a(g87VarO3).l(g87VarA, g87VarO2, g87VarO4);
        g87 g87VarJ = g87VarN.j(g87VarO4);
        g87 g87VarO5 = g87VarJ.a(g87VarA).o();
        if (g87VarO5.i()) {
            return g87VarL.i() ? h97Var.G() : a87VarI.t();
        }
        if (g87VarL.i()) {
            return new wpl(a87VarI, g87VarL, a87VarI.o(), this.e);
        }
        g87 g87VarJ2 = g87VarL.o().j(g87VarJ);
        g87 g87VarJ3 = g87VarL.j(g87VarO5).j(g87VarO4);
        return new wpl(a87VarI, g87VarJ2, g87VarL.a(g87VarO5).o().l(g87VarA, g87VarB, g87VarJ3), new g87[]{g87VarJ3}, this.e);
    }

    @Override // defpackage.h97
    public h97 a(h97 h97Var) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        spl splVar;
        spl splVar2;
        spl splVar3;
        if (t()) {
            return h97Var;
        }
        if (h97Var.t()) {
            return this;
        }
        a87 a87VarI = i();
        spl splVar4 = (spl) this.f19826b;
        spl splVar5 = (spl) h97Var.n();
        if (splVar4.i()) {
            return splVar5.i() ? a87VarI.t() : h97Var.a(this);
        }
        spl splVar6 = (spl) this.c;
        spl splVar7 = (spl) this.d[0];
        spl splVar8 = (spl) h97Var.o();
        spl splVar9 = (spl) h97Var.s(0);
        long[] jArrA = lhg.a();
        long[] jArrA2 = lhg.a();
        long[] jArrA3 = lhg.a();
        long[] jArrA4 = lhg.a();
        long[] jArrP = splVar7.h() ? null : qpl.p(splVar7.g);
        if (jArrP == null) {
            jArr = splVar5.g;
            jArr2 = splVar8.g;
        } else {
            qpl.n(splVar5.g, jArrP, jArrA2);
            qpl.n(splVar8.g, jArrP, jArrA4);
            jArr = jArrA2;
            jArr2 = jArrA4;
        }
        long[] jArrP2 = splVar9.h() ? null : qpl.p(splVar9.g);
        if (jArrP2 == null) {
            jArr3 = splVar4.g;
            jArr4 = splVar6.g;
        } else {
            qpl.n(splVar4.g, jArrP2, jArrA);
            qpl.n(splVar6.g, jArrP2, jArrA3);
            jArr3 = jArrA;
            jArr4 = jArrA3;
        }
        qpl.b(jArr4, jArr2, jArrA3);
        qpl.b(jArr3, jArr, jArrA4);
        if (lhg.f(jArrA4)) {
            return lhg.f(jArrA3) ? G() : a87VarI.t();
        }
        if (splVar5.i()) {
            h97 h97VarY = y();
            spl splVar10 = (spl) h97VarY.q();
            g87 g87VarR = h97VarY.r();
            g87 g87VarD = g87VarR.a(splVar8).d(splVar10);
            spl splVar11 = (spl) g87VarD.o().a(g87VarD).a(splVar10);
            if (splVar11.i()) {
                return new wpl(a87VarI, splVar11, a87VarI.o(), this.e);
            }
            spl splVar12 = (spl) g87VarD.j(splVar10.a(splVar11)).a(splVar11).a(g87VarR).d(splVar11).a(splVar11);
            splVar3 = (spl) a87VarI.m(z77.f40976b);
            splVar = splVar12;
            splVar2 = splVar11;
        } else {
            qpl.t(jArrA4, jArrA4);
            long[] jArrP3 = qpl.p(jArrA3);
            qpl.n(jArr3, jArrP3, jArrA);
            qpl.n(jArr, jArrP3, jArrA2);
            spl splVar13 = new spl(jArrA);
            qpl.l(jArrA, jArrA2, splVar13.g);
            if (splVar13.i()) {
                return new wpl(a87VarI, splVar13, a87VarI.o(), this.e);
            }
            spl splVar14 = new spl(jArrA3);
            qpl.n(jArrA4, jArrP3, splVar14.g);
            if (jArrP2 != null) {
                long[] jArr5 = splVar14.g;
                qpl.n(jArr5, jArrP2, jArr5);
            }
            long[] jArrB = lhg.b();
            qpl.b(jArrA2, jArrA4, jArrA4);
            qpl.u(jArrA4, jArrB);
            qpl.b(splVar6.g, splVar7.g, jArrA4);
            qpl.m(jArrA4, splVar14.g, jArrB);
            spl splVar15 = new spl(jArrA4);
            qpl.q(jArrB, splVar15.g);
            if (jArrP != null) {
                long[] jArr6 = splVar14.g;
                qpl.n(jArr6, jArrP, jArr6);
            }
            splVar = splVar15;
            splVar2 = splVar13;
            splVar3 = splVar14;
        }
        return new wpl(a87VarI, splVar2, splVar, new g87[]{splVar3}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new wpl(null, f(), g());
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
        return new wpl(this.f19825a, g87Var, g87Var2.a(g87Var3), new g87[]{g87Var3}, this.e);
    }

    public wpl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public wpl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
