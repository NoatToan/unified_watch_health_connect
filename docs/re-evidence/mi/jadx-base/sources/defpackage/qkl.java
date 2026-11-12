package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class qkl extends h97.b {
    public qkl(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        okl oklVar = (okl) this.c;
        if (oklVar.i()) {
            return a87VarI.t();
        }
        okl oklVar2 = (okl) this.f19826b;
        okl oklVar3 = (okl) this.d[0];
        int[] iArrD = zgg.d();
        int[] iArrD2 = zgg.d();
        int[] iArrD3 = zgg.d();
        mkl.j(oklVar.g, iArrD3);
        int[] iArrD4 = zgg.d();
        mkl.j(iArrD3, iArrD4);
        boolean zH = oklVar3.h();
        int[] iArr = oklVar3.g;
        if (!zH) {
            mkl.j(iArr, iArrD2);
            iArr = iArrD2;
        }
        mkl.m(oklVar2.g, iArr, iArrD);
        mkl.a(oklVar2.g, iArr, iArrD2);
        mkl.e(iArrD2, iArrD, iArrD2);
        mkl.i(zgg.b(iArrD2, iArrD2, iArrD2), iArrD2);
        mkl.e(iArrD3, oklVar2.g, iArrD3);
        mkl.i(mhg.F(7, iArrD3, 2, 0), iArrD3);
        mkl.i(mhg.G(7, iArrD4, 3, 0, iArrD), iArrD);
        okl oklVar4 = new okl(iArrD4);
        mkl.j(iArrD2, oklVar4.g);
        int[] iArr2 = oklVar4.g;
        mkl.m(iArr2, iArrD3, iArr2);
        int[] iArr3 = oklVar4.g;
        mkl.m(iArr3, iArrD3, iArr3);
        okl oklVar5 = new okl(iArrD3);
        mkl.m(iArrD3, oklVar4.g, oklVar5.g);
        int[] iArr4 = oklVar5.g;
        mkl.e(iArr4, iArrD2, iArr4);
        int[] iArr5 = oklVar5.g;
        mkl.m(iArr5, iArrD, iArr5);
        okl oklVar6 = new okl(iArrD2);
        mkl.n(oklVar.g, oklVar6.g);
        if (!zH) {
            int[] iArr6 = oklVar6.g;
            mkl.e(iArr6, oklVar3.g, iArr6);
        }
        return new qkl(a87VarI, oklVar4, oklVar5, new g87[]{oklVar6}, this.e);
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
        okl oklVar = (okl) this.f19826b;
        okl oklVar2 = (okl) this.c;
        okl oklVar3 = (okl) h97Var.q();
        okl oklVar4 = (okl) h97Var.r();
        okl oklVar5 = (okl) this.d[0];
        okl oklVar6 = (okl) h97Var.s(0);
        int[] iArrE = zgg.e();
        int[] iArrD = zgg.d();
        int[] iArrD2 = zgg.d();
        int[] iArrD3 = zgg.d();
        boolean zH = oklVar5.h();
        if (zH) {
            iArr = oklVar3.g;
            iArr2 = oklVar4.g;
        } else {
            mkl.j(oklVar5.g, iArrD2);
            mkl.e(iArrD2, oklVar3.g, iArrD);
            mkl.e(iArrD2, oklVar5.g, iArrD2);
            mkl.e(iArrD2, oklVar4.g, iArrD2);
            iArr = iArrD;
            iArr2 = iArrD2;
        }
        boolean zH2 = oklVar6.h();
        if (zH2) {
            iArr3 = oklVar.g;
            iArr4 = oklVar2.g;
        } else {
            mkl.j(oklVar6.g, iArrD3);
            mkl.e(iArrD3, oklVar.g, iArrE);
            mkl.e(iArrD3, oklVar6.g, iArrD3);
            mkl.e(iArrD3, oklVar2.g, iArrD3);
            iArr3 = iArrE;
            iArr4 = iArrD3;
        }
        int[] iArrD4 = zgg.d();
        mkl.m(iArr3, iArr, iArrD4);
        mkl.m(iArr4, iArr2, iArrD);
        if (zgg.k(iArrD4)) {
            return zgg.k(iArrD) ? G() : a87VarI.t();
        }
        mkl.j(iArrD4, iArrD2);
        int[] iArrD5 = zgg.d();
        mkl.e(iArrD2, iArrD4, iArrD5);
        mkl.e(iArrD2, iArr3, iArrD2);
        mkl.g(iArrD5, iArrD5);
        zgg.l(iArr4, iArrD5, iArrE);
        mkl.i(zgg.b(iArrD2, iArrD2, iArrD5), iArrD5);
        okl oklVar7 = new okl(iArrD3);
        mkl.j(iArrD, oklVar7.g);
        int[] iArr5 = oklVar7.g;
        mkl.m(iArr5, iArrD5, iArr5);
        okl oklVar8 = new okl(iArrD5);
        mkl.m(iArrD2, oklVar7.g, oklVar8.g);
        mkl.f(oklVar8.g, iArrD, iArrE);
        mkl.h(iArrE, oklVar8.g);
        okl oklVar9 = new okl(iArrD4);
        if (!zH) {
            int[] iArr6 = oklVar9.g;
            mkl.e(iArr6, oklVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = oklVar9.g;
            mkl.e(iArr7, oklVar6.g, iArr7);
        }
        return new qkl(a87VarI, oklVar7, oklVar8, new g87[]{oklVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new qkl(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new qkl(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public qkl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public qkl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
