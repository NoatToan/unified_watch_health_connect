package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class akl extends h97.b {
    public akl(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        yjl yjlVar = (yjl) this.c;
        if (yjlVar.i()) {
            return a87VarI.t();
        }
        yjl yjlVar2 = (yjl) this.f19826b;
        yjl yjlVar3 = (yjl) this.d[0];
        int[] iArrE = wgg.e();
        int[] iArrE2 = wgg.e();
        int[] iArrE3 = wgg.e();
        wjl.j(yjlVar.g, iArrE3);
        int[] iArrE4 = wgg.e();
        wjl.j(iArrE3, iArrE4);
        boolean zH = yjlVar3.h();
        int[] iArr = yjlVar3.g;
        if (!zH) {
            wjl.j(iArr, iArrE2);
            iArr = iArrE2;
        }
        wjl.m(yjlVar2.g, iArr, iArrE);
        wjl.a(yjlVar2.g, iArr, iArrE2);
        wjl.e(iArrE2, iArrE, iArrE2);
        wjl.i(wgg.b(iArrE2, iArrE2, iArrE2), iArrE2);
        wjl.e(iArrE3, yjlVar2.g, iArrE3);
        wjl.i(mhg.F(6, iArrE3, 2, 0), iArrE3);
        wjl.i(mhg.G(6, iArrE4, 3, 0, iArrE), iArrE);
        yjl yjlVar4 = new yjl(iArrE4);
        wjl.j(iArrE2, yjlVar4.g);
        int[] iArr2 = yjlVar4.g;
        wjl.m(iArr2, iArrE3, iArr2);
        int[] iArr3 = yjlVar4.g;
        wjl.m(iArr3, iArrE3, iArr3);
        yjl yjlVar5 = new yjl(iArrE3);
        wjl.m(iArrE3, yjlVar4.g, yjlVar5.g);
        int[] iArr4 = yjlVar5.g;
        wjl.e(iArr4, iArrE2, iArr4);
        int[] iArr5 = yjlVar5.g;
        wjl.m(iArr5, iArrE, iArr5);
        yjl yjlVar6 = new yjl(iArrE2);
        wjl.n(yjlVar.g, yjlVar6.g);
        if (!zH) {
            int[] iArr6 = yjlVar6.g;
            wjl.e(iArr6, yjlVar3.g, iArr6);
        }
        return new akl(a87VarI, yjlVar4, yjlVar5, new g87[]{yjlVar6}, this.e);
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
        yjl yjlVar = (yjl) this.f19826b;
        yjl yjlVar2 = (yjl) this.c;
        yjl yjlVar3 = (yjl) h97Var.q();
        yjl yjlVar4 = (yjl) h97Var.r();
        yjl yjlVar5 = (yjl) this.d[0];
        yjl yjlVar6 = (yjl) h97Var.s(0);
        int[] iArrG = wgg.g();
        int[] iArrE = wgg.e();
        int[] iArrE2 = wgg.e();
        int[] iArrE3 = wgg.e();
        boolean zH = yjlVar5.h();
        if (zH) {
            iArr = yjlVar3.g;
            iArr2 = yjlVar4.g;
        } else {
            wjl.j(yjlVar5.g, iArrE2);
            wjl.e(iArrE2, yjlVar3.g, iArrE);
            wjl.e(iArrE2, yjlVar5.g, iArrE2);
            wjl.e(iArrE2, yjlVar4.g, iArrE2);
            iArr = iArrE;
            iArr2 = iArrE2;
        }
        boolean zH2 = yjlVar6.h();
        if (zH2) {
            iArr3 = yjlVar.g;
            iArr4 = yjlVar2.g;
        } else {
            wjl.j(yjlVar6.g, iArrE3);
            wjl.e(iArrE3, yjlVar.g, iArrG);
            wjl.e(iArrE3, yjlVar6.g, iArrE3);
            wjl.e(iArrE3, yjlVar2.g, iArrE3);
            iArr3 = iArrG;
            iArr4 = iArrE3;
        }
        int[] iArrE4 = wgg.e();
        wjl.m(iArr3, iArr, iArrE4);
        wjl.m(iArr4, iArr2, iArrE);
        if (wgg.s(iArrE4)) {
            return wgg.s(iArrE) ? G() : a87VarI.t();
        }
        wjl.j(iArrE4, iArrE2);
        int[] iArrE5 = wgg.e();
        wjl.e(iArrE2, iArrE4, iArrE5);
        wjl.e(iArrE2, iArr3, iArrE2);
        wjl.g(iArrE5, iArrE5);
        wgg.v(iArr4, iArrE5, iArrG);
        wjl.i(wgg.b(iArrE2, iArrE2, iArrE5), iArrE5);
        yjl yjlVar7 = new yjl(iArrE3);
        wjl.j(iArrE, yjlVar7.g);
        int[] iArr5 = yjlVar7.g;
        wjl.m(iArr5, iArrE5, iArr5);
        yjl yjlVar8 = new yjl(iArrE5);
        wjl.m(iArrE2, yjlVar7.g, yjlVar8.g);
        wjl.f(yjlVar8.g, iArrE, iArrG);
        wjl.h(iArrG, yjlVar8.g);
        yjl yjlVar9 = new yjl(iArrE4);
        if (!zH) {
            int[] iArr6 = yjlVar9.g;
            wjl.e(iArr6, yjlVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = yjlVar9.g;
            wjl.e(iArr7, yjlVar6.g, iArr7);
        }
        return new akl(a87VarI, yjlVar7, yjlVar8, new g87[]{yjlVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new akl(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new akl(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public akl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public akl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
