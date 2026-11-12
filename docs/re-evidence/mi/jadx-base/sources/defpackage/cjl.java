package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class cjl extends h97.b {
    public cjl(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        ajl ajlVar = (ajl) this.c;
        if (ajlVar.i()) {
            return a87VarI.t();
        }
        ajl ajlVar2 = (ajl) this.f19826b;
        ajl ajlVar3 = (ajl) this.d[0];
        int[] iArrC = ugg.c();
        int[] iArrC2 = ugg.c();
        int[] iArrC3 = ugg.c();
        yil.i(ajlVar.g, iArrC3);
        int[] iArrC4 = ugg.c();
        yil.i(iArrC3, iArrC4);
        boolean zH = ajlVar3.h();
        int[] iArr = ajlVar3.g;
        if (!zH) {
            yil.i(iArr, iArrC2);
            iArr = iArrC2;
        }
        yil.k(ajlVar2.g, iArr, iArrC);
        yil.a(ajlVar2.g, iArr, iArrC2);
        yil.d(iArrC2, iArrC, iArrC2);
        yil.h(ugg.b(iArrC2, iArrC2, iArrC2), iArrC2);
        yil.d(iArrC3, ajlVar2.g, iArrC3);
        yil.h(mhg.F(5, iArrC3, 2, 0), iArrC3);
        yil.h(mhg.G(5, iArrC4, 3, 0, iArrC), iArrC);
        ajl ajlVar4 = new ajl(iArrC4);
        yil.i(iArrC2, ajlVar4.g);
        int[] iArr2 = ajlVar4.g;
        yil.k(iArr2, iArrC3, iArr2);
        int[] iArr3 = ajlVar4.g;
        yil.k(iArr3, iArrC3, iArr3);
        ajl ajlVar5 = new ajl(iArrC3);
        yil.k(iArrC3, ajlVar4.g, ajlVar5.g);
        int[] iArr4 = ajlVar5.g;
        yil.d(iArr4, iArrC2, iArr4);
        int[] iArr5 = ajlVar5.g;
        yil.k(iArr5, iArrC, iArr5);
        ajl ajlVar6 = new ajl(iArrC2);
        yil.l(ajlVar.g, ajlVar6.g);
        if (!zH) {
            int[] iArr6 = ajlVar6.g;
            yil.d(iArr6, ajlVar3.g, iArr6);
        }
        return new cjl(a87VarI, ajlVar4, ajlVar5, new g87[]{ajlVar6}, this.e);
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
        ajl ajlVar = (ajl) this.f19826b;
        ajl ajlVar2 = (ajl) this.c;
        ajl ajlVar3 = (ajl) h97Var.q();
        ajl ajlVar4 = (ajl) h97Var.r();
        ajl ajlVar5 = (ajl) this.d[0];
        ajl ajlVar6 = (ajl) h97Var.s(0);
        int[] iArrD = ugg.d();
        int[] iArrC = ugg.c();
        int[] iArrC2 = ugg.c();
        int[] iArrC3 = ugg.c();
        boolean zH = ajlVar5.h();
        if (zH) {
            iArr = ajlVar3.g;
            iArr2 = ajlVar4.g;
        } else {
            yil.i(ajlVar5.g, iArrC2);
            yil.d(iArrC2, ajlVar3.g, iArrC);
            yil.d(iArrC2, ajlVar5.g, iArrC2);
            yil.d(iArrC2, ajlVar4.g, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = ajlVar6.h();
        if (zH2) {
            iArr3 = ajlVar.g;
            iArr4 = ajlVar2.g;
        } else {
            yil.i(ajlVar6.g, iArrC3);
            yil.d(iArrC3, ajlVar.g, iArrD);
            yil.d(iArrC3, ajlVar6.g, iArrC3);
            yil.d(iArrC3, ajlVar2.g, iArrC3);
            iArr3 = iArrD;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = ugg.c();
        yil.k(iArr3, iArr, iArrC4);
        yil.k(iArr4, iArr2, iArrC);
        if (ugg.j(iArrC4)) {
            return ugg.j(iArrC) ? G() : a87VarI.t();
        }
        yil.i(iArrC4, iArrC2);
        int[] iArrC5 = ugg.c();
        yil.d(iArrC2, iArrC4, iArrC5);
        yil.d(iArrC2, iArr3, iArrC2);
        yil.f(iArrC5, iArrC5);
        ugg.k(iArr4, iArrC5, iArrD);
        yil.h(ugg.b(iArrC2, iArrC2, iArrC5), iArrC5);
        ajl ajlVar7 = new ajl(iArrC3);
        yil.i(iArrC, ajlVar7.g);
        int[] iArr5 = ajlVar7.g;
        yil.k(iArr5, iArrC5, iArr5);
        ajl ajlVar8 = new ajl(iArrC5);
        yil.k(iArrC2, ajlVar7.g, ajlVar8.g);
        yil.e(ajlVar8.g, iArrC, iArrD);
        yil.g(iArrD, ajlVar8.g);
        ajl ajlVar9 = new ajl(iArrC4);
        if (!zH) {
            int[] iArr6 = ajlVar9.g;
            yil.d(iArr6, ajlVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = ajlVar9.g;
            yil.d(iArr7, ajlVar6.g, iArr7);
        }
        return new cjl(a87VarI, ajlVar7, ajlVar8, new g87[]{ajlVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new cjl(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new cjl(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public cjl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public cjl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
