package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class r7l extends h97.b {
    public r7l(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        q7l q7lVar = (q7l) this.c;
        if (q7lVar.i()) {
            return a87VarI.t();
        }
        q7l q7lVar2 = (q7l) this.f19826b;
        q7l q7lVar3 = (q7l) this.d[0];
        int[] iArrF = bhg.f();
        int[] iArrF2 = bhg.f();
        int[] iArrF3 = bhg.f();
        p7l.j(q7lVar.g, iArrF3);
        int[] iArrF4 = bhg.f();
        p7l.j(iArrF3, iArrF4);
        boolean zH = q7lVar3.h();
        int[] iArr = q7lVar3.g;
        if (!zH) {
            p7l.j(iArr, iArrF2);
            iArr = iArrF2;
        }
        p7l.m(q7lVar2.g, iArr, iArrF);
        p7l.a(q7lVar2.g, iArr, iArrF2);
        p7l.e(iArrF2, iArrF, iArrF2);
        p7l.i(bhg.b(iArrF2, iArrF2, iArrF2), iArrF2);
        p7l.e(iArrF3, q7lVar2.g, iArrF3);
        p7l.i(mhg.F(8, iArrF3, 2, 0), iArrF3);
        p7l.i(mhg.G(8, iArrF4, 3, 0, iArrF), iArrF);
        q7l q7lVar4 = new q7l(iArrF4);
        p7l.j(iArrF2, q7lVar4.g);
        int[] iArr2 = q7lVar4.g;
        p7l.m(iArr2, iArrF3, iArr2);
        int[] iArr3 = q7lVar4.g;
        p7l.m(iArr3, iArrF3, iArr3);
        q7l q7lVar5 = new q7l(iArrF3);
        p7l.m(iArrF3, q7lVar4.g, q7lVar5.g);
        int[] iArr4 = q7lVar5.g;
        p7l.e(iArr4, iArrF2, iArr4);
        int[] iArr5 = q7lVar5.g;
        p7l.m(iArr5, iArrF, iArr5);
        q7l q7lVar6 = new q7l(iArrF2);
        p7l.n(q7lVar.g, q7lVar6.g);
        if (!zH) {
            int[] iArr6 = q7lVar6.g;
            p7l.e(iArr6, q7lVar3.g, iArr6);
        }
        return new r7l(a87VarI, q7lVar4, q7lVar5, new g87[]{q7lVar6}, this.e);
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
        q7l q7lVar = (q7l) this.f19826b;
        q7l q7lVar2 = (q7l) this.c;
        q7l q7lVar3 = (q7l) h97Var.q();
        q7l q7lVar4 = (q7l) h97Var.r();
        q7l q7lVar5 = (q7l) this.d[0];
        q7l q7lVar6 = (q7l) h97Var.s(0);
        int[] iArrH = bhg.h();
        int[] iArrF = bhg.f();
        int[] iArrF2 = bhg.f();
        int[] iArrF3 = bhg.f();
        boolean zH = q7lVar5.h();
        if (zH) {
            iArr = q7lVar3.g;
            iArr2 = q7lVar4.g;
        } else {
            p7l.j(q7lVar5.g, iArrF2);
            p7l.e(iArrF2, q7lVar3.g, iArrF);
            p7l.e(iArrF2, q7lVar5.g, iArrF2);
            p7l.e(iArrF2, q7lVar4.g, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = q7lVar6.h();
        if (zH2) {
            iArr3 = q7lVar.g;
            iArr4 = q7lVar2.g;
        } else {
            p7l.j(q7lVar6.g, iArrF3);
            p7l.e(iArrF3, q7lVar.g, iArrH);
            p7l.e(iArrF3, q7lVar6.g, iArrF3);
            p7l.e(iArrF3, q7lVar2.g, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = bhg.f();
        p7l.m(iArr3, iArr, iArrF4);
        p7l.m(iArr4, iArr2, iArrF);
        if (bhg.t(iArrF4)) {
            return bhg.t(iArrF) ? G() : a87VarI.t();
        }
        p7l.j(iArrF4, iArrF2);
        int[] iArrF5 = bhg.f();
        p7l.e(iArrF2, iArrF4, iArrF5);
        p7l.e(iArrF2, iArr3, iArrF2);
        p7l.g(iArrF5, iArrF5);
        bhg.w(iArr4, iArrF5, iArrH);
        p7l.i(bhg.b(iArrF2, iArrF2, iArrF5), iArrF5);
        q7l q7lVar7 = new q7l(iArrF3);
        p7l.j(iArrF, q7lVar7.g);
        int[] iArr5 = q7lVar7.g;
        p7l.m(iArr5, iArrF5, iArr5);
        q7l q7lVar8 = new q7l(iArrF5);
        p7l.m(iArrF2, q7lVar7.g, q7lVar8.g);
        p7l.f(q7lVar8.g, iArrF, iArrH);
        p7l.h(iArrH, q7lVar8.g);
        q7l q7lVar9 = new q7l(iArrF4);
        if (!zH) {
            int[] iArr6 = q7lVar9.g;
            p7l.e(iArr6, q7lVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = q7lVar9.g;
            p7l.e(iArr7, q7lVar6.g, iArr7);
        }
        return new r7l(a87VarI, q7lVar7, q7lVar8, new g87[]{q7lVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new r7l(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new r7l(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public r7l(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public r7l(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
