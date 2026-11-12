package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ikl extends h97.b {
    public ikl(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        gkl gklVar = (gkl) this.c;
        if (gklVar.i()) {
            return a87VarI.t();
        }
        gkl gklVar2 = (gkl) this.f19826b;
        gkl gklVar3 = (gkl) this.d[0];
        int[] iArrD = zgg.d();
        ekl.i(gklVar.g, iArrD);
        int[] iArrD2 = zgg.d();
        ekl.i(iArrD, iArrD2);
        int[] iArrD3 = zgg.d();
        ekl.i(gklVar2.g, iArrD3);
        ekl.h(zgg.b(iArrD3, iArrD3, iArrD3), iArrD3);
        ekl.d(iArrD, gklVar2.g, iArrD);
        ekl.h(mhg.F(7, iArrD, 2, 0), iArrD);
        int[] iArrD4 = zgg.d();
        ekl.h(mhg.G(7, iArrD2, 3, 0, iArrD4), iArrD4);
        gkl gklVar4 = new gkl(iArrD2);
        ekl.i(iArrD3, gklVar4.g);
        int[] iArr = gklVar4.g;
        ekl.k(iArr, iArrD, iArr);
        int[] iArr2 = gklVar4.g;
        ekl.k(iArr2, iArrD, iArr2);
        gkl gklVar5 = new gkl(iArrD);
        ekl.k(iArrD, gklVar4.g, gklVar5.g);
        int[] iArr3 = gklVar5.g;
        ekl.d(iArr3, iArrD3, iArr3);
        int[] iArr4 = gklVar5.g;
        ekl.k(iArr4, iArrD4, iArr4);
        gkl gklVar6 = new gkl(iArrD3);
        ekl.l(gklVar.g, gklVar6.g);
        if (!gklVar3.h()) {
            int[] iArr5 = gklVar6.g;
            ekl.d(iArr5, gklVar3.g, iArr5);
        }
        return new ikl(a87VarI, gklVar4, gklVar5, new g87[]{gklVar6}, this.e);
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
        gkl gklVar = (gkl) this.f19826b;
        gkl gklVar2 = (gkl) this.c;
        gkl gklVar3 = (gkl) h97Var.q();
        gkl gklVar4 = (gkl) h97Var.r();
        gkl gklVar5 = (gkl) this.d[0];
        gkl gklVar6 = (gkl) h97Var.s(0);
        int[] iArrE = zgg.e();
        int[] iArrD = zgg.d();
        int[] iArrD2 = zgg.d();
        int[] iArrD3 = zgg.d();
        boolean zH = gklVar5.h();
        if (zH) {
            iArr = gklVar3.g;
            iArr2 = gklVar4.g;
        } else {
            ekl.i(gklVar5.g, iArrD2);
            ekl.d(iArrD2, gklVar3.g, iArrD);
            ekl.d(iArrD2, gklVar5.g, iArrD2);
            ekl.d(iArrD2, gklVar4.g, iArrD2);
            iArr = iArrD;
            iArr2 = iArrD2;
        }
        boolean zH2 = gklVar6.h();
        if (zH2) {
            iArr3 = gklVar.g;
            iArr4 = gklVar2.g;
        } else {
            ekl.i(gklVar6.g, iArrD3);
            ekl.d(iArrD3, gklVar.g, iArrE);
            ekl.d(iArrD3, gklVar6.g, iArrD3);
            ekl.d(iArrD3, gklVar2.g, iArrD3);
            iArr3 = iArrE;
            iArr4 = iArrD3;
        }
        int[] iArrD4 = zgg.d();
        ekl.k(iArr3, iArr, iArrD4);
        ekl.k(iArr4, iArr2, iArrD);
        if (zgg.k(iArrD4)) {
            return zgg.k(iArrD) ? G() : a87VarI.t();
        }
        ekl.i(iArrD4, iArrD2);
        int[] iArrD5 = zgg.d();
        ekl.d(iArrD2, iArrD4, iArrD5);
        ekl.d(iArrD2, iArr3, iArrD2);
        ekl.f(iArrD5, iArrD5);
        zgg.l(iArr4, iArrD5, iArrE);
        ekl.h(zgg.b(iArrD2, iArrD2, iArrD5), iArrD5);
        gkl gklVar7 = new gkl(iArrD3);
        ekl.i(iArrD, gklVar7.g);
        int[] iArr5 = gklVar7.g;
        ekl.k(iArr5, iArrD5, iArr5);
        gkl gklVar8 = new gkl(iArrD5);
        ekl.k(iArrD2, gklVar7.g, gklVar8.g);
        ekl.e(gklVar8.g, iArrD, iArrE);
        ekl.g(iArrE, gklVar8.g);
        gkl gklVar9 = new gkl(iArrD4);
        if (!zH) {
            int[] iArr6 = gklVar9.g;
            ekl.d(iArr6, gklVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = gklVar9.g;
            ekl.d(iArr7, gklVar6.g, iArr7);
        }
        return new ikl(a87VarI, gklVar7, gklVar8, new g87[]{gklVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new ikl(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new ikl(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public ikl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public ikl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
