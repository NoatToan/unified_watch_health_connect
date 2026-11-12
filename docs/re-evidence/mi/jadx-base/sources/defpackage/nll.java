package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class nll extends i97.b {
    public nll(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        lll lllVar = (lll) this.c;
        if (lllVar.i()) {
            return b87VarI.q();
        }
        lll lllVar2 = (lll) this.f20903b;
        lll lllVar3 = (lll) this.d[0];
        int[] iArrI = xgg.i(12);
        int[] iArrI2 = xgg.i(12);
        int[] iArrI3 = xgg.i(12);
        jll.j(lllVar.g, iArrI3);
        int[] iArrI4 = xgg.i(12);
        jll.j(iArrI3, iArrI4);
        boolean zH = lllVar3.h();
        int[] iArr = lllVar3.g;
        if (!zH) {
            jll.j(iArr, iArrI2);
            iArr = iArrI2;
        }
        jll.m(lllVar2.g, iArr, iArrI);
        jll.a(lllVar2.g, iArr, iArrI2);
        jll.f(iArrI2, iArrI, iArrI2);
        jll.i(xgg.c(12, iArrI2, iArrI2, iArrI2), iArrI2);
        jll.f(iArrI3, lllVar2.g, iArrI3);
        jll.i(xgg.F(12, iArrI3, 2, 0), iArrI3);
        jll.i(xgg.G(12, iArrI4, 3, 0, iArrI), iArrI);
        lll lllVar4 = new lll(iArrI4);
        jll.j(iArrI2, lllVar4.g);
        int[] iArr2 = lllVar4.g;
        jll.m(iArr2, iArrI3, iArr2);
        int[] iArr3 = lllVar4.g;
        jll.m(iArr3, iArrI3, iArr3);
        lll lllVar5 = new lll(iArrI3);
        jll.m(iArrI3, lllVar4.g, lllVar5.g);
        int[] iArr4 = lllVar5.g;
        jll.f(iArr4, iArrI2, iArr4);
        int[] iArr5 = lllVar5.g;
        jll.m(iArr5, iArrI, iArr5);
        lll lllVar6 = new lll(iArrI2);
        jll.n(lllVar.g, lllVar6.g);
        if (!zH) {
            int[] iArr6 = lllVar6.g;
            jll.f(iArr6, lllVar3.g, iArr6);
        }
        return new nll(b87VarI, lllVar4, lllVar5, new h87[]{lllVar6}, this.e);
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
        lll lllVar = (lll) this.f20903b;
        lll lllVar2 = (lll) this.c;
        lll lllVar3 = (lll) i97Var.p();
        lll lllVar4 = (lll) i97Var.q();
        lll lllVar5 = (lll) this.d[0];
        lll lllVar6 = (lll) i97Var.r(0);
        int[] iArrI = xgg.i(24);
        int[] iArrI2 = xgg.i(24);
        int[] iArrI3 = xgg.i(12);
        int[] iArrI4 = xgg.i(12);
        boolean zH = lllVar5.h();
        if (zH) {
            iArr = lllVar3.g;
            iArr2 = lllVar4.g;
        } else {
            jll.j(lllVar5.g, iArrI3);
            jll.f(iArrI3, lllVar3.g, iArrI2);
            jll.f(iArrI3, lllVar5.g, iArrI3);
            jll.f(iArrI3, lllVar4.g, iArrI3);
            iArr = iArrI2;
            iArr2 = iArrI3;
        }
        boolean zH2 = lllVar6.h();
        if (zH2) {
            iArr3 = lllVar.g;
            iArr4 = lllVar2.g;
        } else {
            jll.j(lllVar6.g, iArrI4);
            jll.f(iArrI4, lllVar.g, iArrI);
            jll.f(iArrI4, lllVar6.g, iArrI4);
            jll.f(iArrI4, lllVar2.g, iArrI4);
            iArr3 = iArrI;
            iArr4 = iArrI4;
        }
        int[] iArrI5 = xgg.i(12);
        jll.m(iArr3, iArr, iArrI5);
        int[] iArrI6 = xgg.i(12);
        jll.m(iArr4, iArr2, iArrI6);
        if (xgg.v(12, iArrI5)) {
            return xgg.v(12, iArrI6) ? A() : b87VarI.q();
        }
        jll.j(iArrI5, iArrI3);
        int[] iArrI7 = xgg.i(12);
        jll.f(iArrI3, iArrI5, iArrI7);
        jll.f(iArrI3, iArr3, iArrI3);
        jll.g(iArrI7, iArrI7);
        ehg.a(iArr4, iArrI7, iArrI);
        jll.i(xgg.c(12, iArrI3, iArrI3, iArrI7), iArrI7);
        lll lllVar7 = new lll(iArrI4);
        jll.j(iArrI6, lllVar7.g);
        int[] iArr5 = lllVar7.g;
        jll.m(iArr5, iArrI7, iArr5);
        lll lllVar8 = new lll(iArrI7);
        jll.m(iArrI3, lllVar7.g, lllVar8.g);
        ehg.a(lllVar8.g, iArrI6, iArrI2);
        jll.b(iArrI, iArrI2, iArrI);
        jll.h(iArrI, lllVar8.g);
        lll lllVar9 = new lll(iArrI5);
        if (!zH) {
            int[] iArr6 = lllVar9.g;
            jll.f(iArr6, lllVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = lllVar9.g;
            jll.f(iArr7, lllVar6.g, iArr7);
        }
        return new nll(b87VarI, lllVar7, lllVar8, new h87[]{lllVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new nll(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new nll(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public nll(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public nll(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
