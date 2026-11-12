package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class oll extends h97.b {
    public oll(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        mll mllVar = (mll) this.c;
        if (mllVar.i()) {
            return a87VarI.t();
        }
        mll mllVar2 = (mll) this.f19826b;
        mll mllVar3 = (mll) this.d[0];
        int[] iArrI = mhg.i(12);
        int[] iArrI2 = mhg.i(12);
        int[] iArrI3 = mhg.i(12);
        kll.j(mllVar.g, iArrI3);
        int[] iArrI4 = mhg.i(12);
        kll.j(iArrI3, iArrI4);
        boolean zH = mllVar3.h();
        int[] iArr = mllVar3.g;
        if (!zH) {
            kll.j(iArr, iArrI2);
            iArr = iArrI2;
        }
        kll.m(mllVar2.g, iArr, iArrI);
        kll.a(mllVar2.g, iArr, iArrI2);
        kll.f(iArrI2, iArrI, iArrI2);
        kll.i(mhg.c(12, iArrI2, iArrI2, iArrI2), iArrI2);
        kll.f(iArrI3, mllVar2.g, iArrI3);
        kll.i(mhg.F(12, iArrI3, 2, 0), iArrI3);
        kll.i(mhg.G(12, iArrI4, 3, 0, iArrI), iArrI);
        mll mllVar4 = new mll(iArrI4);
        kll.j(iArrI2, mllVar4.g);
        int[] iArr2 = mllVar4.g;
        kll.m(iArr2, iArrI3, iArr2);
        int[] iArr3 = mllVar4.g;
        kll.m(iArr3, iArrI3, iArr3);
        mll mllVar5 = new mll(iArrI3);
        kll.m(iArrI3, mllVar4.g, mllVar5.g);
        int[] iArr4 = mllVar5.g;
        kll.f(iArr4, iArrI2, iArr4);
        int[] iArr5 = mllVar5.g;
        kll.m(iArr5, iArrI, iArr5);
        mll mllVar6 = new mll(iArrI2);
        kll.n(mllVar.g, mllVar6.g);
        if (!zH) {
            int[] iArr6 = mllVar6.g;
            kll.f(iArr6, mllVar3.g, iArr6);
        }
        return new oll(a87VarI, mllVar4, mllVar5, new g87[]{mllVar6}, this.e);
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
        mll mllVar = (mll) this.f19826b;
        mll mllVar2 = (mll) this.c;
        mll mllVar3 = (mll) h97Var.q();
        mll mllVar4 = (mll) h97Var.r();
        mll mllVar5 = (mll) this.d[0];
        mll mllVar6 = (mll) h97Var.s(0);
        int[] iArrI = mhg.i(24);
        int[] iArrI2 = mhg.i(24);
        int[] iArrI3 = mhg.i(12);
        int[] iArrI4 = mhg.i(12);
        boolean zH = mllVar5.h();
        if (zH) {
            iArr = mllVar3.g;
            iArr2 = mllVar4.g;
        } else {
            kll.j(mllVar5.g, iArrI3);
            kll.f(iArrI3, mllVar3.g, iArrI2);
            kll.f(iArrI3, mllVar5.g, iArrI3);
            kll.f(iArrI3, mllVar4.g, iArrI3);
            iArr = iArrI2;
            iArr2 = iArrI3;
        }
        boolean zH2 = mllVar6.h();
        if (zH2) {
            iArr3 = mllVar.g;
            iArr4 = mllVar2.g;
        } else {
            kll.j(mllVar6.g, iArrI4);
            kll.f(iArrI4, mllVar.g, iArrI);
            kll.f(iArrI4, mllVar6.g, iArrI4);
            kll.f(iArrI4, mllVar2.g, iArrI4);
            iArr3 = iArrI;
            iArr4 = iArrI4;
        }
        int[] iArrI5 = mhg.i(12);
        kll.m(iArr3, iArr, iArrI5);
        int[] iArrI6 = mhg.i(12);
        kll.m(iArr4, iArr2, iArrI6);
        if (mhg.v(12, iArrI5)) {
            return mhg.v(12, iArrI6) ? G() : a87VarI.t();
        }
        kll.j(iArrI5, iArrI3);
        int[] iArrI7 = mhg.i(12);
        kll.f(iArrI3, iArrI5, iArrI7);
        kll.f(iArrI3, iArr3, iArrI3);
        kll.g(iArrI7, iArrI7);
        fhg.a(iArr4, iArrI7, iArrI);
        kll.i(mhg.c(12, iArrI3, iArrI3, iArrI7), iArrI7);
        mll mllVar7 = new mll(iArrI4);
        kll.j(iArrI6, mllVar7.g);
        int[] iArr5 = mllVar7.g;
        kll.m(iArr5, iArrI7, iArr5);
        mll mllVar8 = new mll(iArrI7);
        kll.m(iArrI3, mllVar7.g, mllVar8.g);
        fhg.a(mllVar8.g, iArrI6, iArrI2);
        kll.b(iArrI, iArrI2, iArrI);
        kll.h(iArrI, mllVar8.g);
        mll mllVar9 = new mll(iArrI5);
        if (!zH) {
            int[] iArr6 = mllVar9.g;
            kll.f(iArr6, mllVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = mllVar9.g;
            kll.f(iArr7, mllVar6.g, iArr7);
        }
        return new oll(a87VarI, mllVar7, mllVar8, new g87[]{mllVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new oll(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new oll(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public oll(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public oll(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
