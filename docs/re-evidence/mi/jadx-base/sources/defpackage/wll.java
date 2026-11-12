package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class wll extends h97.b {
    public wll(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        ull ullVar = (ull) this.c;
        if (ullVar.i()) {
            return a87VarI.t();
        }
        ull ullVar2 = (ull) this.f19826b;
        ull ullVar3 = (ull) this.d[0];
        int[] iArrI = mhg.i(17);
        int[] iArrI2 = mhg.i(17);
        int[] iArrI3 = mhg.i(17);
        sll.j(ullVar.g, iArrI3);
        int[] iArrI4 = mhg.i(17);
        sll.j(iArrI3, iArrI4);
        boolean zH = ullVar3.h();
        int[] iArr = ullVar3.g;
        if (!zH) {
            sll.j(iArr, iArrI2);
            iArr = iArrI2;
        }
        sll.l(ullVar2.g, iArr, iArrI);
        sll.a(ullVar2.g, iArr, iArrI2);
        sll.f(iArrI2, iArrI, iArrI2);
        mhg.c(17, iArrI2, iArrI2, iArrI2);
        sll.i(iArrI2);
        sll.f(iArrI3, ullVar2.g, iArrI3);
        mhg.F(17, iArrI3, 2, 0);
        sll.i(iArrI3);
        mhg.G(17, iArrI4, 3, 0, iArrI);
        sll.i(iArrI);
        ull ullVar4 = new ull(iArrI4);
        sll.j(iArrI2, ullVar4.g);
        int[] iArr2 = ullVar4.g;
        sll.l(iArr2, iArrI3, iArr2);
        int[] iArr3 = ullVar4.g;
        sll.l(iArr3, iArrI3, iArr3);
        ull ullVar5 = new ull(iArrI3);
        sll.l(iArrI3, ullVar4.g, ullVar5.g);
        int[] iArr4 = ullVar5.g;
        sll.f(iArr4, iArrI2, iArr4);
        int[] iArr5 = ullVar5.g;
        sll.l(iArr5, iArrI, iArr5);
        ull ullVar6 = new ull(iArrI2);
        sll.m(ullVar.g, ullVar6.g);
        if (!zH) {
            int[] iArr6 = ullVar6.g;
            sll.f(iArr6, ullVar3.g, iArr6);
        }
        return new wll(a87VarI, ullVar4, ullVar5, new g87[]{ullVar6}, this.e);
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
        ull ullVar = (ull) this.f19826b;
        ull ullVar2 = (ull) this.c;
        ull ullVar3 = (ull) h97Var.q();
        ull ullVar4 = (ull) h97Var.r();
        ull ullVar5 = (ull) this.d[0];
        ull ullVar6 = (ull) h97Var.s(0);
        int[] iArrI = mhg.i(17);
        int[] iArrI2 = mhg.i(17);
        int[] iArrI3 = mhg.i(17);
        int[] iArrI4 = mhg.i(17);
        boolean zH = ullVar5.h();
        if (zH) {
            iArr = ullVar3.g;
            iArr2 = ullVar4.g;
        } else {
            sll.j(ullVar5.g, iArrI3);
            sll.f(iArrI3, ullVar3.g, iArrI2);
            sll.f(iArrI3, ullVar5.g, iArrI3);
            sll.f(iArrI3, ullVar4.g, iArrI3);
            iArr = iArrI2;
            iArr2 = iArrI3;
        }
        boolean zH2 = ullVar6.h();
        if (zH2) {
            iArr3 = ullVar.g;
            iArr4 = ullVar2.g;
        } else {
            sll.j(ullVar6.g, iArrI4);
            sll.f(iArrI4, ullVar.g, iArrI);
            sll.f(iArrI4, ullVar6.g, iArrI4);
            sll.f(iArrI4, ullVar2.g, iArrI4);
            iArr3 = iArrI;
            iArr4 = iArrI4;
        }
        int[] iArrI5 = mhg.i(17);
        sll.l(iArr3, iArr, iArrI5);
        sll.l(iArr4, iArr2, iArrI2);
        if (mhg.v(17, iArrI5)) {
            return mhg.v(17, iArrI2) ? G() : a87VarI.t();
        }
        sll.j(iArrI5, iArrI3);
        int[] iArrI6 = mhg.i(17);
        sll.f(iArrI3, iArrI5, iArrI6);
        sll.f(iArrI3, iArr3, iArrI3);
        sll.f(iArr4, iArrI6, iArrI);
        ull ullVar7 = new ull(iArrI4);
        sll.j(iArrI2, ullVar7.g);
        int[] iArr5 = ullVar7.g;
        sll.a(iArr5, iArrI6, iArr5);
        int[] iArr6 = ullVar7.g;
        sll.l(iArr6, iArrI3, iArr6);
        int[] iArr7 = ullVar7.g;
        sll.l(iArr7, iArrI3, iArr7);
        ull ullVar8 = new ull(iArrI6);
        sll.l(iArrI3, ullVar7.g, ullVar8.g);
        sll.f(ullVar8.g, iArrI2, iArrI2);
        sll.l(iArrI2, iArrI, ullVar8.g);
        ull ullVar9 = new ull(iArrI5);
        if (!zH) {
            int[] iArr8 = ullVar9.g;
            sll.f(iArr8, ullVar5.g, iArr8);
        }
        if (!zH2) {
            int[] iArr9 = ullVar9.g;
            sll.f(iArr9, ullVar6.g, iArr9);
        }
        return new wll(a87VarI, ullVar7, ullVar8, new g87[]{ullVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new wll(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new wll(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public wll(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public wll(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
