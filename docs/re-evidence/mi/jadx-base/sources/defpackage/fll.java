package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class fll extends i97.b {
    public fll(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        dll dllVar = (dll) this.c;
        if (dllVar.i()) {
            return b87VarI.q();
        }
        dll dllVar2 = (dll) this.f20903b;
        dll dllVar3 = (dll) this.d[0];
        int[] iArrF = ahg.f();
        int[] iArrF2 = ahg.f();
        int[] iArrF3 = ahg.f();
        bll.j(dllVar.g, iArrF3);
        int[] iArrF4 = ahg.f();
        bll.j(iArrF3, iArrF4);
        boolean zH = dllVar3.h();
        int[] iArr = dllVar3.g;
        if (!zH) {
            bll.j(iArr, iArrF2);
            iArr = iArrF2;
        }
        bll.m(dllVar2.g, iArr, iArrF);
        bll.a(dllVar2.g, iArr, iArrF2);
        bll.e(iArrF2, iArrF, iArrF2);
        bll.i(ahg.b(iArrF2, iArrF2, iArrF2), iArrF2);
        bll.e(iArrF3, dllVar2.g, iArrF3);
        bll.i(xgg.F(8, iArrF3, 2, 0), iArrF3);
        bll.i(xgg.G(8, iArrF4, 3, 0, iArrF), iArrF);
        dll dllVar4 = new dll(iArrF4);
        bll.j(iArrF2, dllVar4.g);
        int[] iArr2 = dllVar4.g;
        bll.m(iArr2, iArrF3, iArr2);
        int[] iArr3 = dllVar4.g;
        bll.m(iArr3, iArrF3, iArr3);
        dll dllVar5 = new dll(iArrF3);
        bll.m(iArrF3, dllVar4.g, dllVar5.g);
        int[] iArr4 = dllVar5.g;
        bll.e(iArr4, iArrF2, iArr4);
        int[] iArr5 = dllVar5.g;
        bll.m(iArr5, iArrF, iArr5);
        dll dllVar6 = new dll(iArrF2);
        bll.n(dllVar.g, dllVar6.g);
        if (!zH) {
            int[] iArr6 = dllVar6.g;
            bll.e(iArr6, dllVar3.g, iArr6);
        }
        return new fll(b87VarI, dllVar4, dllVar5, new h87[]{dllVar6}, this.e);
    }

    @Override // defpackage.i97
    public i97 a(i97 i97Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (s()) {
            return i97Var;
        }
        if (i97Var.s()) {
            return this;
        }
        if (this == i97Var) {
            return A();
        }
        b87 b87VarI = i();
        dll dllVar = (dll) this.f20903b;
        dll dllVar2 = (dll) this.c;
        dll dllVar3 = (dll) i97Var.p();
        dll dllVar4 = (dll) i97Var.q();
        dll dllVar5 = (dll) this.d[0];
        dll dllVar6 = (dll) i97Var.r(0);
        int[] iArrH = ahg.h();
        int[] iArrF = ahg.f();
        int[] iArrF2 = ahg.f();
        int[] iArrF3 = ahg.f();
        boolean zH = dllVar5.h();
        if (zH) {
            iArr = dllVar3.g;
            iArr2 = dllVar4.g;
        } else {
            bll.j(dllVar5.g, iArrF2);
            bll.e(iArrF2, dllVar3.g, iArrF);
            bll.e(iArrF2, dllVar5.g, iArrF2);
            bll.e(iArrF2, dllVar4.g, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = dllVar6.h();
        if (zH2) {
            iArr3 = dllVar.g;
            iArr4 = dllVar2.g;
        } else {
            bll.j(dllVar6.g, iArrF3);
            bll.e(iArrF3, dllVar.g, iArrH);
            bll.e(iArrF3, dllVar6.g, iArrF3);
            bll.e(iArrF3, dllVar2.g, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = ahg.f();
        bll.m(iArr3, iArr, iArrF4);
        bll.m(iArr4, iArr2, iArrF);
        if (ahg.t(iArrF4)) {
            return ahg.t(iArrF) ? A() : b87VarI.q();
        }
        bll.j(iArrF4, iArrF2);
        int[] iArrF5 = ahg.f();
        bll.e(iArrF2, iArrF4, iArrF5);
        bll.e(iArrF2, iArr3, iArrF2);
        bll.g(iArrF5, iArrF5);
        ahg.w(iArr4, iArrF5, iArrH);
        bll.i(ahg.b(iArrF2, iArrF2, iArrF5), iArrF5);
        dll dllVar7 = new dll(iArrF3);
        bll.j(iArrF, dllVar7.g);
        int[] iArr5 = dllVar7.g;
        bll.m(iArr5, iArrF5, iArr5);
        dll dllVar8 = new dll(iArrF5);
        bll.m(iArrF2, dllVar7.g, dllVar8.g);
        bll.f(dllVar8.g, iArrF, iArrH);
        bll.h(iArrH, dllVar8.g);
        dll dllVar9 = new dll(iArrF4);
        if (!zH) {
            int[] iArr6 = dllVar9.g;
            bll.e(iArr6, dllVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = dllVar9.g;
            bll.e(iArr7, dllVar6.g, iArr7);
        }
        return new fll(b87VarI, dllVar7, dllVar8, new h87[]{dllVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new fll(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new fll(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public fll(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public fll(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
