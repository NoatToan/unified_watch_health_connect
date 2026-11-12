package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ykl extends h97.b {
    public ykl(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        wkl wklVar = (wkl) this.c;
        if (wklVar.i()) {
            return a87VarI.t();
        }
        wkl wklVar2 = (wkl) this.f19826b;
        wkl wklVar3 = (wkl) this.d[0];
        int[] iArrF = bhg.f();
        ukl.i(wklVar.g, iArrF);
        int[] iArrF2 = bhg.f();
        ukl.i(iArrF, iArrF2);
        int[] iArrF3 = bhg.f();
        ukl.i(wklVar2.g, iArrF3);
        ukl.h(bhg.b(iArrF3, iArrF3, iArrF3), iArrF3);
        ukl.d(iArrF, wklVar2.g, iArrF);
        ukl.h(mhg.F(8, iArrF, 2, 0), iArrF);
        int[] iArrF4 = bhg.f();
        ukl.h(mhg.G(8, iArrF2, 3, 0, iArrF4), iArrF4);
        wkl wklVar4 = new wkl(iArrF2);
        ukl.i(iArrF3, wklVar4.g);
        int[] iArr = wklVar4.g;
        ukl.k(iArr, iArrF, iArr);
        int[] iArr2 = wklVar4.g;
        ukl.k(iArr2, iArrF, iArr2);
        wkl wklVar5 = new wkl(iArrF);
        ukl.k(iArrF, wklVar4.g, wklVar5.g);
        int[] iArr3 = wklVar5.g;
        ukl.d(iArr3, iArrF3, iArr3);
        int[] iArr4 = wklVar5.g;
        ukl.k(iArr4, iArrF4, iArr4);
        wkl wklVar6 = new wkl(iArrF3);
        ukl.l(wklVar.g, wklVar6.g);
        if (!wklVar3.h()) {
            int[] iArr5 = wklVar6.g;
            ukl.d(iArr5, wklVar3.g, iArr5);
        }
        return new ykl(a87VarI, wklVar4, wklVar5, new g87[]{wklVar6}, this.e);
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
        wkl wklVar = (wkl) this.f19826b;
        wkl wklVar2 = (wkl) this.c;
        wkl wklVar3 = (wkl) h97Var.q();
        wkl wklVar4 = (wkl) h97Var.r();
        wkl wklVar5 = (wkl) this.d[0];
        wkl wklVar6 = (wkl) h97Var.s(0);
        int[] iArrH = bhg.h();
        int[] iArrF = bhg.f();
        int[] iArrF2 = bhg.f();
        int[] iArrF3 = bhg.f();
        boolean zH = wklVar5.h();
        if (zH) {
            iArr = wklVar3.g;
            iArr2 = wklVar4.g;
        } else {
            ukl.i(wklVar5.g, iArrF2);
            ukl.d(iArrF2, wklVar3.g, iArrF);
            ukl.d(iArrF2, wklVar5.g, iArrF2);
            ukl.d(iArrF2, wklVar4.g, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = wklVar6.h();
        if (zH2) {
            iArr3 = wklVar.g;
            iArr4 = wklVar2.g;
        } else {
            ukl.i(wklVar6.g, iArrF3);
            ukl.d(iArrF3, wklVar.g, iArrH);
            ukl.d(iArrF3, wklVar6.g, iArrF3);
            ukl.d(iArrF3, wklVar2.g, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = bhg.f();
        ukl.k(iArr3, iArr, iArrF4);
        ukl.k(iArr4, iArr2, iArrF);
        if (bhg.t(iArrF4)) {
            return bhg.t(iArrF) ? G() : a87VarI.t();
        }
        ukl.i(iArrF4, iArrF2);
        int[] iArrF5 = bhg.f();
        ukl.d(iArrF2, iArrF4, iArrF5);
        ukl.d(iArrF2, iArr3, iArrF2);
        ukl.f(iArrF5, iArrF5);
        bhg.w(iArr4, iArrF5, iArrH);
        ukl.h(bhg.b(iArrF2, iArrF2, iArrF5), iArrF5);
        wkl wklVar7 = new wkl(iArrF3);
        ukl.i(iArrF, wklVar7.g);
        int[] iArr5 = wklVar7.g;
        ukl.k(iArr5, iArrF5, iArr5);
        wkl wklVar8 = new wkl(iArrF5);
        ukl.k(iArrF2, wklVar7.g, wklVar8.g);
        ukl.e(wklVar8.g, iArrF, iArrH);
        ukl.g(iArrH, wklVar8.g);
        wkl wklVar9 = new wkl(iArrF4);
        if (!zH) {
            int[] iArr6 = wklVar9.g;
            ukl.d(iArr6, wklVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = wklVar9.g;
            ukl.d(iArr7, wklVar6.g, iArr7);
        }
        return new ykl(a87VarI, wklVar7, wklVar8, new g87[]{wklVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new ykl(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new ykl(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public ykl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public ykl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
