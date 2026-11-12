package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xkl extends i97.b {
    public xkl(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        vkl vklVar = (vkl) this.c;
        if (vklVar.i()) {
            return b87VarI.q();
        }
        vkl vklVar2 = (vkl) this.f20903b;
        vkl vklVar3 = (vkl) this.d[0];
        int[] iArrF = ahg.f();
        tkl.i(vklVar.g, iArrF);
        int[] iArrF2 = ahg.f();
        tkl.i(iArrF, iArrF2);
        int[] iArrF3 = ahg.f();
        tkl.i(vklVar2.g, iArrF3);
        tkl.h(ahg.b(iArrF3, iArrF3, iArrF3), iArrF3);
        tkl.d(iArrF, vklVar2.g, iArrF);
        tkl.h(xgg.F(8, iArrF, 2, 0), iArrF);
        int[] iArrF4 = ahg.f();
        tkl.h(xgg.G(8, iArrF2, 3, 0, iArrF4), iArrF4);
        vkl vklVar4 = new vkl(iArrF2);
        tkl.i(iArrF3, vklVar4.g);
        int[] iArr = vklVar4.g;
        tkl.k(iArr, iArrF, iArr);
        int[] iArr2 = vklVar4.g;
        tkl.k(iArr2, iArrF, iArr2);
        vkl vklVar5 = new vkl(iArrF);
        tkl.k(iArrF, vklVar4.g, vklVar5.g);
        int[] iArr3 = vklVar5.g;
        tkl.d(iArr3, iArrF3, iArr3);
        int[] iArr4 = vklVar5.g;
        tkl.k(iArr4, iArrF4, iArr4);
        vkl vklVar6 = new vkl(iArrF3);
        tkl.l(vklVar.g, vklVar6.g);
        if (!vklVar3.h()) {
            int[] iArr5 = vklVar6.g;
            tkl.d(iArr5, vklVar3.g, iArr5);
        }
        return new xkl(b87VarI, vklVar4, vklVar5, new h87[]{vklVar6}, this.e);
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
        vkl vklVar = (vkl) this.f20903b;
        vkl vklVar2 = (vkl) this.c;
        vkl vklVar3 = (vkl) i97Var.p();
        vkl vklVar4 = (vkl) i97Var.q();
        vkl vklVar5 = (vkl) this.d[0];
        vkl vklVar6 = (vkl) i97Var.r(0);
        int[] iArrH = ahg.h();
        int[] iArrF = ahg.f();
        int[] iArrF2 = ahg.f();
        int[] iArrF3 = ahg.f();
        boolean zH = vklVar5.h();
        if (zH) {
            iArr = vklVar3.g;
            iArr2 = vklVar4.g;
        } else {
            tkl.i(vklVar5.g, iArrF2);
            tkl.d(iArrF2, vklVar3.g, iArrF);
            tkl.d(iArrF2, vklVar5.g, iArrF2);
            tkl.d(iArrF2, vklVar4.g, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = vklVar6.h();
        if (zH2) {
            iArr3 = vklVar.g;
            iArr4 = vklVar2.g;
        } else {
            tkl.i(vklVar6.g, iArrF3);
            tkl.d(iArrF3, vklVar.g, iArrH);
            tkl.d(iArrF3, vklVar6.g, iArrF3);
            tkl.d(iArrF3, vklVar2.g, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = ahg.f();
        tkl.k(iArr3, iArr, iArrF4);
        tkl.k(iArr4, iArr2, iArrF);
        if (ahg.t(iArrF4)) {
            return ahg.t(iArrF) ? A() : b87VarI.q();
        }
        tkl.i(iArrF4, iArrF2);
        int[] iArrF5 = ahg.f();
        tkl.d(iArrF2, iArrF4, iArrF5);
        tkl.d(iArrF2, iArr3, iArrF2);
        tkl.f(iArrF5, iArrF5);
        ahg.w(iArr4, iArrF5, iArrH);
        tkl.h(ahg.b(iArrF2, iArrF2, iArrF5), iArrF5);
        vkl vklVar7 = new vkl(iArrF3);
        tkl.i(iArrF, vklVar7.g);
        int[] iArr5 = vklVar7.g;
        tkl.k(iArr5, iArrF5, iArr5);
        vkl vklVar8 = new vkl(iArrF5);
        tkl.k(iArrF2, vklVar7.g, vklVar8.g);
        tkl.e(vklVar8.g, iArrF, iArrH);
        tkl.g(iArrH, vklVar8.g);
        vkl vklVar9 = new vkl(iArrF4);
        if (!zH) {
            int[] iArr6 = vklVar9.g;
            tkl.d(iArr6, vklVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = vklVar9.g;
            tkl.d(iArr7, vklVar6.g, iArr7);
        }
        return new xkl(b87VarI, vklVar7, vklVar8, new h87[]{vklVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new xkl(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new xkl(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public xkl(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public xkl(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
