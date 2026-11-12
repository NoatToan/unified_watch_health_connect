package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class bjl extends i97.b {
    public bjl(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        zil zilVar = (zil) this.c;
        if (zilVar.i()) {
            return b87VarI.q();
        }
        zil zilVar2 = (zil) this.f20903b;
        zil zilVar3 = (zil) this.d[0];
        int[] iArrC = tgg.c();
        int[] iArrC2 = tgg.c();
        int[] iArrC3 = tgg.c();
        xil.i(zilVar.g, iArrC3);
        int[] iArrC4 = tgg.c();
        xil.i(iArrC3, iArrC4);
        boolean zH = zilVar3.h();
        int[] iArr = zilVar3.g;
        if (!zH) {
            xil.i(iArr, iArrC2);
            iArr = iArrC2;
        }
        xil.k(zilVar2.g, iArr, iArrC);
        xil.a(zilVar2.g, iArr, iArrC2);
        xil.d(iArrC2, iArrC, iArrC2);
        xil.h(tgg.b(iArrC2, iArrC2, iArrC2), iArrC2);
        xil.d(iArrC3, zilVar2.g, iArrC3);
        xil.h(xgg.F(5, iArrC3, 2, 0), iArrC3);
        xil.h(xgg.G(5, iArrC4, 3, 0, iArrC), iArrC);
        zil zilVar4 = new zil(iArrC4);
        xil.i(iArrC2, zilVar4.g);
        int[] iArr2 = zilVar4.g;
        xil.k(iArr2, iArrC3, iArr2);
        int[] iArr3 = zilVar4.g;
        xil.k(iArr3, iArrC3, iArr3);
        zil zilVar5 = new zil(iArrC3);
        xil.k(iArrC3, zilVar4.g, zilVar5.g);
        int[] iArr4 = zilVar5.g;
        xil.d(iArr4, iArrC2, iArr4);
        int[] iArr5 = zilVar5.g;
        xil.k(iArr5, iArrC, iArr5);
        zil zilVar6 = new zil(iArrC2);
        xil.l(zilVar.g, zilVar6.g);
        if (!zH) {
            int[] iArr6 = zilVar6.g;
            xil.d(iArr6, zilVar3.g, iArr6);
        }
        return new bjl(b87VarI, zilVar4, zilVar5, new h87[]{zilVar6}, this.e);
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
        zil zilVar = (zil) this.f20903b;
        zil zilVar2 = (zil) this.c;
        zil zilVar3 = (zil) i97Var.p();
        zil zilVar4 = (zil) i97Var.q();
        zil zilVar5 = (zil) this.d[0];
        zil zilVar6 = (zil) i97Var.r(0);
        int[] iArrD = tgg.d();
        int[] iArrC = tgg.c();
        int[] iArrC2 = tgg.c();
        int[] iArrC3 = tgg.c();
        boolean zH = zilVar5.h();
        if (zH) {
            iArr = zilVar3.g;
            iArr2 = zilVar4.g;
        } else {
            xil.i(zilVar5.g, iArrC2);
            xil.d(iArrC2, zilVar3.g, iArrC);
            xil.d(iArrC2, zilVar5.g, iArrC2);
            xil.d(iArrC2, zilVar4.g, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = zilVar6.h();
        if (zH2) {
            iArr3 = zilVar.g;
            iArr4 = zilVar2.g;
        } else {
            xil.i(zilVar6.g, iArrC3);
            xil.d(iArrC3, zilVar.g, iArrD);
            xil.d(iArrC3, zilVar6.g, iArrC3);
            xil.d(iArrC3, zilVar2.g, iArrC3);
            iArr3 = iArrD;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = tgg.c();
        xil.k(iArr3, iArr, iArrC4);
        xil.k(iArr4, iArr2, iArrC);
        if (tgg.j(iArrC4)) {
            return tgg.j(iArrC) ? A() : b87VarI.q();
        }
        xil.i(iArrC4, iArrC2);
        int[] iArrC5 = tgg.c();
        xil.d(iArrC2, iArrC4, iArrC5);
        xil.d(iArrC2, iArr3, iArrC2);
        xil.f(iArrC5, iArrC5);
        tgg.k(iArr4, iArrC5, iArrD);
        xil.h(tgg.b(iArrC2, iArrC2, iArrC5), iArrC5);
        zil zilVar7 = new zil(iArrC3);
        xil.i(iArrC, zilVar7.g);
        int[] iArr5 = zilVar7.g;
        xil.k(iArr5, iArrC5, iArr5);
        zil zilVar8 = new zil(iArrC5);
        xil.k(iArrC2, zilVar7.g, zilVar8.g);
        xil.e(zilVar8.g, iArrC, iArrD);
        xil.g(iArrD, zilVar8.g);
        zil zilVar9 = new zil(iArrC4);
        if (!zH) {
            int[] iArr6 = zilVar9.g;
            xil.d(iArr6, zilVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = zilVar9.g;
            xil.d(iArr7, zilVar6.g, iArr7);
        }
        return new bjl(b87VarI, zilVar7, zilVar8, new h87[]{zilVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new bjl(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new bjl(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public bjl(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public bjl(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
