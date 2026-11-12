package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class qil extends h97.b {
    public qil(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        oil oilVar = (oil) this.c;
        if (oilVar.i()) {
            return a87VarI.t();
        }
        oil oilVar2 = (oil) this.f19826b;
        oil oilVar3 = (oil) this.d[0];
        int[] iArrC = sgg.c();
        int[] iArrC2 = sgg.c();
        int[] iArrC3 = sgg.c();
        mil.j(oilVar.g, iArrC3);
        int[] iArrC4 = sgg.c();
        mil.j(iArrC3, iArrC4);
        boolean zH = oilVar3.h();
        int[] iArr = oilVar3.g;
        if (!zH) {
            mil.j(iArr, iArrC2);
            iArr = iArrC2;
        }
        mil.m(oilVar2.g, iArr, iArrC);
        mil.a(oilVar2.g, iArr, iArrC2);
        mil.e(iArrC2, iArrC, iArrC2);
        mil.i(sgg.b(iArrC2, iArrC2, iArrC2), iArrC2);
        mil.e(iArrC3, oilVar2.g, iArrC3);
        mil.i(mhg.F(4, iArrC3, 2, 0), iArrC3);
        mil.i(mhg.G(4, iArrC4, 3, 0, iArrC), iArrC);
        oil oilVar4 = new oil(iArrC4);
        mil.j(iArrC2, oilVar4.g);
        int[] iArr2 = oilVar4.g;
        mil.m(iArr2, iArrC3, iArr2);
        int[] iArr3 = oilVar4.g;
        mil.m(iArr3, iArrC3, iArr3);
        oil oilVar5 = new oil(iArrC3);
        mil.m(iArrC3, oilVar4.g, oilVar5.g);
        int[] iArr4 = oilVar5.g;
        mil.e(iArr4, iArrC2, iArr4);
        int[] iArr5 = oilVar5.g;
        mil.m(iArr5, iArrC, iArr5);
        oil oilVar6 = new oil(iArrC2);
        mil.n(oilVar.g, oilVar6.g);
        if (!zH) {
            int[] iArr6 = oilVar6.g;
            mil.e(iArr6, oilVar3.g, iArr6);
        }
        return new qil(a87VarI, oilVar4, oilVar5, new g87[]{oilVar6}, this.e);
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
        oil oilVar = (oil) this.f19826b;
        oil oilVar2 = (oil) this.c;
        oil oilVar3 = (oil) h97Var.q();
        oil oilVar4 = (oil) h97Var.r();
        oil oilVar5 = (oil) this.d[0];
        oil oilVar6 = (oil) h97Var.s(0);
        int[] iArrE = sgg.e();
        int[] iArrC = sgg.c();
        int[] iArrC2 = sgg.c();
        int[] iArrC3 = sgg.c();
        boolean zH = oilVar5.h();
        if (zH) {
            iArr = oilVar3.g;
            iArr2 = oilVar4.g;
        } else {
            mil.j(oilVar5.g, iArrC2);
            mil.e(iArrC2, oilVar3.g, iArrC);
            mil.e(iArrC2, oilVar5.g, iArrC2);
            mil.e(iArrC2, oilVar4.g, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = oilVar6.h();
        if (zH2) {
            iArr3 = oilVar.g;
            iArr4 = oilVar2.g;
        } else {
            mil.j(oilVar6.g, iArrC3);
            mil.e(iArrC3, oilVar.g, iArrE);
            mil.e(iArrC3, oilVar6.g, iArrC3);
            mil.e(iArrC3, oilVar2.g, iArrC3);
            iArr3 = iArrE;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = sgg.c();
        mil.m(iArr3, iArr, iArrC4);
        mil.m(iArr4, iArr2, iArrC);
        if (sgg.o(iArrC4)) {
            return sgg.o(iArrC) ? G() : a87VarI.t();
        }
        mil.j(iArrC4, iArrC2);
        int[] iArrC5 = sgg.c();
        mil.e(iArrC2, iArrC4, iArrC5);
        mil.e(iArrC2, iArr3, iArrC2);
        mil.g(iArrC5, iArrC5);
        sgg.q(iArr4, iArrC5, iArrE);
        mil.i(sgg.b(iArrC2, iArrC2, iArrC5), iArrC5);
        oil oilVar7 = new oil(iArrC3);
        mil.j(iArrC, oilVar7.g);
        int[] iArr5 = oilVar7.g;
        mil.m(iArr5, iArrC5, iArr5);
        oil oilVar8 = new oil(iArrC5);
        mil.m(iArrC2, oilVar7.g, oilVar8.g);
        mil.f(oilVar8.g, iArrC, iArrE);
        mil.h(iArrE, oilVar8.g);
        oil oilVar9 = new oil(iArrC4);
        if (!zH) {
            int[] iArr6 = oilVar9.g;
            mil.e(iArr6, oilVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = oilVar9.g;
            mil.e(iArr7, oilVar6.g, iArr7);
        }
        return new qil(a87VarI, oilVar7, oilVar8, new g87[]{oilVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new qil(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new qil(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public qil(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public qil(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
