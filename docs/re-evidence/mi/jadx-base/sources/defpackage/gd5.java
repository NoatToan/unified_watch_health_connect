package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class gd5 extends h97.b {
    public gd5(a87 a87Var, g87 g87Var, g87 g87Var2) {
        this(a87Var, g87Var, g87Var2, false);
    }

    @Override // defpackage.h97
    public h97 E() {
        return (t() || this.c.i()) ? this : K(false).a(this);
    }

    @Override // defpackage.h97
    public h97 G() {
        if (t()) {
            return this;
        }
        return this.c.i() ? i().t() : K(true);
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
        return this.c.i() ? h97Var : K(false).a(h97Var);
    }

    public ed5 I(ed5 ed5Var, int[] iArr) {
        ed5 ed5Var2 = (ed5) i().n();
        if (ed5Var.h()) {
            return ed5Var2;
        }
        ed5 ed5Var3 = new ed5();
        if (iArr == null) {
            iArr = ed5Var3.g;
            cd5.j(ed5Var.g, iArr);
        }
        cd5.j(iArr, ed5Var3.g);
        int[] iArr2 = ed5Var3.g;
        cd5.e(iArr2, ed5Var2.g, iArr2);
        return ed5Var3;
    }

    public ed5 J() {
        g87[] g87VarArr = this.d;
        ed5 ed5Var = (ed5) g87VarArr[1];
        if (ed5Var != null) {
            return ed5Var;
        }
        ed5 ed5VarI = I((ed5) g87VarArr[0], null);
        g87VarArr[1] = ed5VarI;
        return ed5VarI;
    }

    public gd5 K(boolean z) {
        ed5 ed5Var;
        ed5 ed5Var2 = (ed5) this.f19826b;
        ed5 ed5Var3 = (ed5) this.c;
        ed5 ed5Var4 = (ed5) this.d[0];
        ed5 ed5VarJ = J();
        int[] iArrF = bhg.f();
        cd5.j(ed5Var2.g, iArrF);
        cd5.i(bhg.b(iArrF, iArrF, iArrF) + bhg.d(ed5VarJ.g, iArrF), iArrF);
        int[] iArrF2 = bhg.f();
        cd5.o(ed5Var3.g, iArrF2);
        int[] iArrF3 = bhg.f();
        cd5.e(iArrF2, ed5Var3.g, iArrF3);
        int[] iArrF4 = bhg.f();
        cd5.e(iArrF3, ed5Var2.g, iArrF4);
        cd5.o(iArrF4, iArrF4);
        int[] iArrF5 = bhg.f();
        cd5.j(iArrF3, iArrF5);
        cd5.o(iArrF5, iArrF5);
        ed5 ed5Var5 = new ed5(iArrF3);
        cd5.j(iArrF, ed5Var5.g);
        int[] iArr = ed5Var5.g;
        cd5.n(iArr, iArrF4, iArr);
        int[] iArr2 = ed5Var5.g;
        cd5.n(iArr2, iArrF4, iArr2);
        ed5 ed5Var6 = new ed5(iArrF4);
        cd5.n(iArrF4, ed5Var5.g, ed5Var6.g);
        int[] iArr3 = ed5Var6.g;
        cd5.e(iArr3, iArrF, iArr3);
        int[] iArr4 = ed5Var6.g;
        cd5.n(iArr4, iArrF5, iArr4);
        ed5 ed5Var7 = new ed5(iArrF2);
        if (!bhg.r(ed5Var4.g)) {
            int[] iArr5 = ed5Var7.g;
            cd5.e(iArr5, ed5Var4.g, iArr5);
        }
        if (z) {
            ed5Var = new ed5(iArrF5);
            int[] iArr6 = ed5Var.g;
            cd5.e(iArr6, ed5VarJ.g, iArr6);
            int[] iArr7 = ed5Var.g;
            cd5.o(iArr7, iArr7);
        } else {
            ed5Var = null;
        }
        return new gd5(i(), ed5Var5, ed5Var6, new g87[]{ed5Var7, ed5Var}, this.e);
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
        ed5 ed5Var = (ed5) this.f19826b;
        ed5 ed5Var2 = (ed5) this.c;
        ed5 ed5Var3 = (ed5) this.d[0];
        ed5 ed5Var4 = (ed5) h97Var.q();
        ed5 ed5Var5 = (ed5) h97Var.r();
        ed5 ed5Var6 = (ed5) h97Var.s(0);
        int[] iArrH = bhg.h();
        int[] iArrF = bhg.f();
        int[] iArrF2 = bhg.f();
        int[] iArrF3 = bhg.f();
        boolean zH = ed5Var3.h();
        if (zH) {
            iArr = ed5Var4.g;
            iArr2 = ed5Var5.g;
        } else {
            cd5.j(ed5Var3.g, iArrF2);
            cd5.e(iArrF2, ed5Var4.g, iArrF);
            cd5.e(iArrF2, ed5Var3.g, iArrF2);
            cd5.e(iArrF2, ed5Var5.g, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = ed5Var6.h();
        if (zH2) {
            iArr3 = ed5Var.g;
            iArr4 = ed5Var2.g;
        } else {
            cd5.j(ed5Var6.g, iArrF3);
            cd5.e(iArrF3, ed5Var.g, iArrH);
            cd5.e(iArrF3, ed5Var6.g, iArrF3);
            cd5.e(iArrF3, ed5Var2.g, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = bhg.f();
        cd5.n(iArr3, iArr, iArrF4);
        cd5.n(iArr4, iArr2, iArrF);
        if (bhg.t(iArrF4)) {
            return bhg.t(iArrF) ? G() : a87VarI.t();
        }
        int[] iArrF5 = bhg.f();
        cd5.j(iArrF4, iArrF5);
        int[] iArrF6 = bhg.f();
        cd5.e(iArrF5, iArrF4, iArrF6);
        cd5.e(iArrF5, iArr3, iArrF2);
        cd5.g(iArrF6, iArrF6);
        bhg.w(iArr4, iArrF6, iArrH);
        cd5.i(bhg.b(iArrF2, iArrF2, iArrF6), iArrF6);
        ed5 ed5Var7 = new ed5(iArrF3);
        cd5.j(iArrF, ed5Var7.g);
        int[] iArr5 = ed5Var7.g;
        cd5.n(iArr5, iArrF6, iArr5);
        ed5 ed5Var8 = new ed5(iArrF6);
        cd5.n(iArrF2, ed5Var7.g, ed5Var8.g);
        cd5.f(ed5Var8.g, iArrF, iArrH);
        cd5.h(iArrH, ed5Var8.g);
        ed5 ed5Var9 = new ed5(iArrF4);
        if (!zH) {
            int[] iArr6 = ed5Var9.g;
            cd5.e(iArr6, ed5Var3.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = ed5Var9.g;
            cd5.e(iArr7, ed5Var6.g, iArr7);
        }
        if (!zH || !zH2) {
            iArrF5 = null;
        }
        return new gd5(a87VarI, ed5Var7, ed5Var8, new g87[]{ed5Var9, I(ed5Var9, iArrF5)}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new gd5(null, f(), g());
    }

    @Override // defpackage.h97
    public g87 s(int i) {
        return i == 1 ? J() : super.s(i);
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new gd5(i(), this.f19826b, this.c.m(), this.d, this.e);
    }

    public gd5(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public gd5(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
