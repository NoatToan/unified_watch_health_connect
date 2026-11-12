package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class gll extends h97.b {
    public gll(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        ell ellVar = (ell) this.c;
        if (ellVar.i()) {
            return a87VarI.t();
        }
        ell ellVar2 = (ell) this.f19826b;
        ell ellVar3 = (ell) this.d[0];
        int[] iArrF = bhg.f();
        int[] iArrF2 = bhg.f();
        int[] iArrF3 = bhg.f();
        cll.j(ellVar.g, iArrF3);
        int[] iArrF4 = bhg.f();
        cll.j(iArrF3, iArrF4);
        boolean zH = ellVar3.h();
        int[] iArr = ellVar3.g;
        if (!zH) {
            cll.j(iArr, iArrF2);
            iArr = iArrF2;
        }
        cll.m(ellVar2.g, iArr, iArrF);
        cll.a(ellVar2.g, iArr, iArrF2);
        cll.e(iArrF2, iArrF, iArrF2);
        cll.i(bhg.b(iArrF2, iArrF2, iArrF2), iArrF2);
        cll.e(iArrF3, ellVar2.g, iArrF3);
        cll.i(mhg.F(8, iArrF3, 2, 0), iArrF3);
        cll.i(mhg.G(8, iArrF4, 3, 0, iArrF), iArrF);
        ell ellVar4 = new ell(iArrF4);
        cll.j(iArrF2, ellVar4.g);
        int[] iArr2 = ellVar4.g;
        cll.m(iArr2, iArrF3, iArr2);
        int[] iArr3 = ellVar4.g;
        cll.m(iArr3, iArrF3, iArr3);
        ell ellVar5 = new ell(iArrF3);
        cll.m(iArrF3, ellVar4.g, ellVar5.g);
        int[] iArr4 = ellVar5.g;
        cll.e(iArr4, iArrF2, iArr4);
        int[] iArr5 = ellVar5.g;
        cll.m(iArr5, iArrF, iArr5);
        ell ellVar6 = new ell(iArrF2);
        cll.n(ellVar.g, ellVar6.g);
        if (!zH) {
            int[] iArr6 = ellVar6.g;
            cll.e(iArr6, ellVar3.g, iArr6);
        }
        return new gll(a87VarI, ellVar4, ellVar5, new g87[]{ellVar6}, this.e);
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
        ell ellVar = (ell) this.f19826b;
        ell ellVar2 = (ell) this.c;
        ell ellVar3 = (ell) h97Var.q();
        ell ellVar4 = (ell) h97Var.r();
        ell ellVar5 = (ell) this.d[0];
        ell ellVar6 = (ell) h97Var.s(0);
        int[] iArrH = bhg.h();
        int[] iArrF = bhg.f();
        int[] iArrF2 = bhg.f();
        int[] iArrF3 = bhg.f();
        boolean zH = ellVar5.h();
        if (zH) {
            iArr = ellVar3.g;
            iArr2 = ellVar4.g;
        } else {
            cll.j(ellVar5.g, iArrF2);
            cll.e(iArrF2, ellVar3.g, iArrF);
            cll.e(iArrF2, ellVar5.g, iArrF2);
            cll.e(iArrF2, ellVar4.g, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = ellVar6.h();
        if (zH2) {
            iArr3 = ellVar.g;
            iArr4 = ellVar2.g;
        } else {
            cll.j(ellVar6.g, iArrF3);
            cll.e(iArrF3, ellVar.g, iArrH);
            cll.e(iArrF3, ellVar6.g, iArrF3);
            cll.e(iArrF3, ellVar2.g, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = bhg.f();
        cll.m(iArr3, iArr, iArrF4);
        cll.m(iArr4, iArr2, iArrF);
        if (bhg.t(iArrF4)) {
            return bhg.t(iArrF) ? G() : a87VarI.t();
        }
        cll.j(iArrF4, iArrF2);
        int[] iArrF5 = bhg.f();
        cll.e(iArrF2, iArrF4, iArrF5);
        cll.e(iArrF2, iArr3, iArrF2);
        cll.g(iArrF5, iArrF5);
        bhg.w(iArr4, iArrF5, iArrH);
        cll.i(bhg.b(iArrF2, iArrF2, iArrF5), iArrF5);
        ell ellVar7 = new ell(iArrF3);
        cll.j(iArrF, ellVar7.g);
        int[] iArr5 = ellVar7.g;
        cll.m(iArr5, iArrF5, iArr5);
        ell ellVar8 = new ell(iArrF5);
        cll.m(iArrF2, ellVar7.g, ellVar8.g);
        cll.f(ellVar8.g, iArrF, iArrH);
        cll.h(iArrH, ellVar8.g);
        ell ellVar9 = new ell(iArrF4);
        if (!zH) {
            int[] iArr6 = ellVar9.g;
            cll.e(iArr6, ellVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = ellVar9.g;
            cll.e(iArr7, ellVar6.g, iArr7);
        }
        return new gll(a87VarI, ellVar7, ellVar8, new g87[]{ellVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new gll(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new gll(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public gll(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public gll(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
