package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aql extends h97.a {
    public aql(a87 a87Var, g87 g87Var, g87 g87Var2) {
        this(a87Var, g87Var, g87Var2, false);
    }

    @Override // defpackage.h97
    public h97 G() {
        long[] jArr;
        if (t()) {
            return this;
        }
        a87 a87VarI = i();
        spl splVar = (spl) this.f19826b;
        if (splVar.i()) {
            return a87VarI.t();
        }
        spl splVar2 = (spl) this.c;
        spl splVar3 = (spl) this.d[0];
        long[] jArrA = lhg.a();
        long[] jArrA2 = lhg.a();
        long[] jArrP = splVar3.h() ? null : qpl.p(splVar3.g);
        long[] jArr2 = splVar2.g;
        if (jArrP == null) {
            jArr = splVar3.g;
        } else {
            qpl.n(jArr2, jArrP, jArrA);
            qpl.t(splVar3.g, jArrA2);
            jArr2 = jArrA;
            jArr = jArrA2;
        }
        long[] jArrA3 = lhg.a();
        qpl.t(splVar2.g, jArrA3);
        qpl.d(jArr2, jArr, jArrA3);
        if (lhg.f(jArrA3)) {
            return new aql(a87VarI, new spl(jArrA3), ypl.l, this.e);
        }
        long[] jArrB = lhg.b();
        qpl.m(jArrA3, jArr2, jArrB);
        spl splVar4 = new spl(jArrA);
        qpl.t(jArrA3, splVar4.g);
        spl splVar5 = new spl(jArrA3);
        if (jArrP != null) {
            long[] jArr3 = splVar5.g;
            qpl.l(jArr3, jArr, jArr3);
        }
        long[] jArr4 = splVar.g;
        if (jArrP != null) {
            qpl.n(jArr4, jArrP, jArrA2);
            jArr4 = jArrA2;
        }
        qpl.u(jArr4, jArrB);
        qpl.q(jArrB, jArrA2);
        qpl.d(splVar4.g, splVar5.g, jArrA2);
        return new aql(a87VarI, splVar4, new spl(jArrA2), new g87[]{splVar5}, this.e);
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
        spl splVar = (spl) this.f19826b;
        if (splVar.i()) {
            return h97Var;
        }
        spl splVar2 = (spl) h97Var.n();
        spl splVar3 = (spl) h97Var.s(0);
        if (splVar2.i() || !splVar3.h()) {
            return G().a(h97Var);
        }
        spl splVar4 = (spl) this.c;
        spl splVar5 = (spl) this.d[0];
        spl splVar6 = (spl) h97Var.o();
        long[] jArrA = lhg.a();
        long[] jArrA2 = lhg.a();
        long[] jArrA3 = lhg.a();
        long[] jArrA4 = lhg.a();
        qpl.t(splVar.g, jArrA);
        qpl.t(splVar4.g, jArrA2);
        qpl.t(splVar5.g, jArrA3);
        qpl.l(splVar4.g, splVar5.g, jArrA4);
        qpl.d(jArrA3, jArrA2, jArrA4);
        long[] jArrP = qpl.p(jArrA3);
        qpl.n(splVar6.g, jArrP, jArrA3);
        qpl.b(jArrA3, jArrA2, jArrA3);
        long[] jArrB = lhg.b();
        qpl.m(jArrA3, jArrA4, jArrB);
        qpl.o(jArrA, jArrP, jArrB);
        qpl.q(jArrB, jArrA3);
        qpl.n(splVar2.g, jArrP, jArrA);
        qpl.b(jArrA, jArrA4, jArrA2);
        qpl.t(jArrA2, jArrA2);
        if (lhg.f(jArrA2)) {
            return lhg.f(jArrA3) ? h97Var.G() : a87VarI.t();
        }
        if (lhg.f(jArrA3)) {
            return new aql(a87VarI, new spl(jArrA3), ypl.l, this.e);
        }
        spl splVar7 = new spl();
        qpl.t(jArrA3, splVar7.g);
        long[] jArr = splVar7.g;
        qpl.l(jArr, jArrA, jArr);
        spl splVar8 = new spl(jArrA);
        qpl.l(jArrA3, jArrA2, splVar8.g);
        long[] jArr2 = splVar8.g;
        qpl.n(jArr2, jArrP, jArr2);
        spl splVar9 = new spl(jArrA2);
        qpl.b(jArrA3, jArrA2, splVar9.g);
        long[] jArr3 = splVar9.g;
        qpl.t(jArr3, jArr3);
        mhg.Q(18, jArrB);
        qpl.m(splVar9.g, jArrA4, jArrB);
        qpl.f(splVar6.g, jArrA4);
        qpl.m(jArrA4, splVar8.g, jArrB);
        qpl.q(jArrB, splVar9.g);
        return new aql(a87VarI, splVar7, splVar9, new g87[]{splVar8}, this.e);
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
            spl splVar11 = (spl) g87VarD.o().a(g87VarD).a(splVar10).b();
            if (splVar11.i()) {
                return new aql(a87VarI, splVar11, ypl.l, this.e);
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
                return new aql(a87VarI, splVar13, ypl.l, this.e);
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
        return new aql(a87VarI, splVar2, splVar, new g87[]{splVar3}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new aql(null, f(), g());
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
        return new aql(this.f19825a, g87Var, g87Var2.a(g87Var3), new g87[]{g87Var3}, this.e);
    }

    public aql(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public aql(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
