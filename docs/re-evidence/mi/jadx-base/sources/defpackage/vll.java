package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class vll extends i97.b {
    public vll(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        tll tllVar = (tll) this.c;
        if (tllVar.i()) {
            return b87VarI.q();
        }
        tll tllVar2 = (tll) this.f20903b;
        tll tllVar3 = (tll) this.d[0];
        int[] iArrI = xgg.i(17);
        int[] iArrI2 = xgg.i(17);
        int[] iArrI3 = xgg.i(17);
        rll.j(tllVar.g, iArrI3);
        int[] iArrI4 = xgg.i(17);
        rll.j(iArrI3, iArrI4);
        boolean zH = tllVar3.h();
        int[] iArr = tllVar3.g;
        if (!zH) {
            rll.j(iArr, iArrI2);
            iArr = iArrI2;
        }
        rll.l(tllVar2.g, iArr, iArrI);
        rll.a(tllVar2.g, iArr, iArrI2);
        rll.f(iArrI2, iArrI, iArrI2);
        xgg.c(17, iArrI2, iArrI2, iArrI2);
        rll.i(iArrI2);
        rll.f(iArrI3, tllVar2.g, iArrI3);
        xgg.F(17, iArrI3, 2, 0);
        rll.i(iArrI3);
        xgg.G(17, iArrI4, 3, 0, iArrI);
        rll.i(iArrI);
        tll tllVar4 = new tll(iArrI4);
        rll.j(iArrI2, tllVar4.g);
        int[] iArr2 = tllVar4.g;
        rll.l(iArr2, iArrI3, iArr2);
        int[] iArr3 = tllVar4.g;
        rll.l(iArr3, iArrI3, iArr3);
        tll tllVar5 = new tll(iArrI3);
        rll.l(iArrI3, tllVar4.g, tllVar5.g);
        int[] iArr4 = tllVar5.g;
        rll.f(iArr4, iArrI2, iArr4);
        int[] iArr5 = tllVar5.g;
        rll.l(iArr5, iArrI, iArr5);
        tll tllVar6 = new tll(iArrI2);
        rll.m(tllVar.g, tllVar6.g);
        if (!zH) {
            int[] iArr6 = tllVar6.g;
            rll.f(iArr6, tllVar3.g, iArr6);
        }
        return new vll(b87VarI, tllVar4, tllVar5, new h87[]{tllVar6}, this.e);
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
        tll tllVar = (tll) this.f20903b;
        tll tllVar2 = (tll) this.c;
        tll tllVar3 = (tll) i97Var.p();
        tll tllVar4 = (tll) i97Var.q();
        tll tllVar5 = (tll) this.d[0];
        tll tllVar6 = (tll) i97Var.r(0);
        int[] iArrI = xgg.i(17);
        int[] iArrI2 = xgg.i(17);
        int[] iArrI3 = xgg.i(17);
        int[] iArrI4 = xgg.i(17);
        boolean zH = tllVar5.h();
        if (zH) {
            iArr = tllVar3.g;
            iArr2 = tllVar4.g;
        } else {
            rll.j(tllVar5.g, iArrI3);
            rll.f(iArrI3, tllVar3.g, iArrI2);
            rll.f(iArrI3, tllVar5.g, iArrI3);
            rll.f(iArrI3, tllVar4.g, iArrI3);
            iArr = iArrI2;
            iArr2 = iArrI3;
        }
        boolean zH2 = tllVar6.h();
        if (zH2) {
            iArr3 = tllVar.g;
            iArr4 = tllVar2.g;
        } else {
            rll.j(tllVar6.g, iArrI4);
            rll.f(iArrI4, tllVar.g, iArrI);
            rll.f(iArrI4, tllVar6.g, iArrI4);
            rll.f(iArrI4, tllVar2.g, iArrI4);
            iArr3 = iArrI;
            iArr4 = iArrI4;
        }
        int[] iArrI5 = xgg.i(17);
        rll.l(iArr3, iArr, iArrI5);
        rll.l(iArr4, iArr2, iArrI2);
        if (xgg.v(17, iArrI5)) {
            return xgg.v(17, iArrI2) ? A() : b87VarI.q();
        }
        rll.j(iArrI5, iArrI3);
        int[] iArrI6 = xgg.i(17);
        rll.f(iArrI3, iArrI5, iArrI6);
        rll.f(iArrI3, iArr3, iArrI3);
        rll.f(iArr4, iArrI6, iArrI);
        tll tllVar7 = new tll(iArrI4);
        rll.j(iArrI2, tllVar7.g);
        int[] iArr5 = tllVar7.g;
        rll.a(iArr5, iArrI6, iArr5);
        int[] iArr6 = tllVar7.g;
        rll.l(iArr6, iArrI3, iArr6);
        int[] iArr7 = tllVar7.g;
        rll.l(iArr7, iArrI3, iArr7);
        tll tllVar8 = new tll(iArrI6);
        rll.l(iArrI3, tllVar7.g, tllVar8.g);
        rll.f(tllVar8.g, iArrI2, iArrI2);
        rll.l(iArrI2, iArrI, tllVar8.g);
        tll tllVar9 = new tll(iArrI5);
        if (!zH) {
            int[] iArr8 = tllVar9.g;
            rll.f(iArr8, tllVar5.g, iArr8);
        }
        if (!zH2) {
            int[] iArr9 = tllVar9.g;
            rll.f(iArr9, tllVar6.g, iArr9);
        }
        return new vll(b87VarI, tllVar7, tllVar8, new h87[]{tllVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new vll(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new vll(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public vll(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public vll(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
