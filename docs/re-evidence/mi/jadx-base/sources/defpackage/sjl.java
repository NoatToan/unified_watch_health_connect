package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class sjl extends h97.b {
    public sjl(a87 a87Var, g87 g87Var, g87 g87Var2) {
        this(a87Var, g87Var, g87Var2, false);
    }

    @Override // defpackage.h97
    public h97 E() {
        return (t() || this.c.i()) ? this : G().a(this);
    }

    @Override // defpackage.h97
    public h97 G() {
        if (t()) {
            return this;
        }
        a87 a87VarI = i();
        qjl qjlVar = (qjl) this.c;
        if (qjlVar.i()) {
            return a87VarI.t();
        }
        qjl qjlVar2 = (qjl) this.f19826b;
        qjl qjlVar3 = (qjl) this.d[0];
        int[] iArrE = wgg.e();
        ojl.i(qjlVar.g, iArrE);
        int[] iArrE2 = wgg.e();
        ojl.i(iArrE, iArrE2);
        int[] iArrE3 = wgg.e();
        ojl.i(qjlVar2.g, iArrE3);
        ojl.h(wgg.b(iArrE3, iArrE3, iArrE3), iArrE3);
        ojl.d(iArrE, qjlVar2.g, iArrE);
        ojl.h(mhg.F(6, iArrE, 2, 0), iArrE);
        int[] iArrE4 = wgg.e();
        ojl.h(mhg.G(6, iArrE2, 3, 0, iArrE4), iArrE4);
        qjl qjlVar4 = new qjl(iArrE2);
        ojl.i(iArrE3, qjlVar4.g);
        int[] iArr = qjlVar4.g;
        ojl.k(iArr, iArrE, iArr);
        int[] iArr2 = qjlVar4.g;
        ojl.k(iArr2, iArrE, iArr2);
        qjl qjlVar5 = new qjl(iArrE);
        ojl.k(iArrE, qjlVar4.g, qjlVar5.g);
        int[] iArr3 = qjlVar5.g;
        ojl.d(iArr3, iArrE3, iArr3);
        int[] iArr4 = qjlVar5.g;
        ojl.k(iArr4, iArrE4, iArr4);
        qjl qjlVar6 = new qjl(iArrE3);
        ojl.l(qjlVar.g, qjlVar6.g);
        if (!qjlVar3.h()) {
            int[] iArr5 = qjlVar6.g;
            ojl.d(iArr5, qjlVar3.g, iArr5);
        }
        return new sjl(a87VarI, qjlVar4, qjlVar5, new g87[]{qjlVar6}, this.e);
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
        return this.c.i() ? h97Var : G().a(h97Var);
    }

    @Override // defpackage.h97
    public h97 a(h97 h97Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (t()) {
            return h97Var;
        }
        if (h97Var.t()) {
            return this;
        }
        if (this == h97Var) {
            return G();
        }
        a87 a87VarI = i();
        qjl qjlVar = (qjl) this.f19826b;
        qjl qjlVar2 = (qjl) this.c;
        qjl qjlVar3 = (qjl) h97Var.q();
        qjl qjlVar4 = (qjl) h97Var.r();
        qjl qjlVar5 = (qjl) this.d[0];
        qjl qjlVar6 = (qjl) h97Var.s(0);
        int[] iArrG = wgg.g();
        int[] iArrE = wgg.e();
        int[] iArrE2 = wgg.e();
        int[] iArrE3 = wgg.e();
        boolean zH = qjlVar5.h();
        if (zH) {
            iArr = qjlVar3.g;
            iArr2 = qjlVar4.g;
        } else {
            ojl.i(qjlVar5.g, iArrE2);
            ojl.d(iArrE2, qjlVar3.g, iArrE);
            ojl.d(iArrE2, qjlVar5.g, iArrE2);
            ojl.d(iArrE2, qjlVar4.g, iArrE2);
            iArr = iArrE;
            iArr2 = iArrE2;
        }
        boolean zH2 = qjlVar6.h();
        if (zH2) {
            iArr3 = qjlVar.g;
            iArr4 = qjlVar2.g;
        } else {
            ojl.i(qjlVar6.g, iArrE3);
            ojl.d(iArrE3, qjlVar.g, iArrG);
            ojl.d(iArrE3, qjlVar6.g, iArrE3);
            ojl.d(iArrE3, qjlVar2.g, iArrE3);
            iArr3 = iArrG;
            iArr4 = iArrE3;
        }
        int[] iArrE4 = wgg.e();
        ojl.k(iArr3, iArr, iArrE4);
        ojl.k(iArr4, iArr2, iArrE);
        if (wgg.s(iArrE4)) {
            return wgg.s(iArrE) ? G() : a87VarI.t();
        }
        ojl.i(iArrE4, iArrE2);
        int[] iArrE5 = wgg.e();
        ojl.d(iArrE2, iArrE4, iArrE5);
        ojl.d(iArrE2, iArr3, iArrE2);
        ojl.f(iArrE5, iArrE5);
        wgg.v(iArr4, iArrE5, iArrG);
        ojl.h(wgg.b(iArrE2, iArrE2, iArrE5), iArrE5);
        qjl qjlVar7 = new qjl(iArrE3);
        ojl.i(iArrE, qjlVar7.g);
        int[] iArr5 = qjlVar7.g;
        ojl.k(iArr5, iArrE5, iArr5);
        qjl qjlVar8 = new qjl(iArrE5);
        ojl.k(iArrE2, qjlVar7.g, qjlVar8.g);
        ojl.e(qjlVar8.g, iArrE, iArrG);
        ojl.g(iArrG, qjlVar8.g);
        qjl qjlVar9 = new qjl(iArrE4);
        if (!zH) {
            int[] iArr6 = qjlVar9.g;
            ojl.d(iArr6, qjlVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = qjlVar9.g;
            ojl.d(iArr7, qjlVar6.g, iArr7);
        }
        return new sjl(a87VarI, qjlVar7, qjlVar8, new g87[]{qjlVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new sjl(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new sjl(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public sjl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public sjl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
