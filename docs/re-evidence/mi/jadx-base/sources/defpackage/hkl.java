package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class hkl extends i97.b {
    public hkl(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        fkl fklVar = (fkl) this.c;
        if (fklVar.i()) {
            return b87VarI.q();
        }
        fkl fklVar2 = (fkl) this.f20903b;
        fkl fklVar3 = (fkl) this.d[0];
        int[] iArrD = ygg.d();
        dkl.i(fklVar.g, iArrD);
        int[] iArrD2 = ygg.d();
        dkl.i(iArrD, iArrD2);
        int[] iArrD3 = ygg.d();
        dkl.i(fklVar2.g, iArrD3);
        dkl.h(ygg.b(iArrD3, iArrD3, iArrD3), iArrD3);
        dkl.d(iArrD, fklVar2.g, iArrD);
        dkl.h(xgg.F(7, iArrD, 2, 0), iArrD);
        int[] iArrD4 = ygg.d();
        dkl.h(xgg.G(7, iArrD2, 3, 0, iArrD4), iArrD4);
        fkl fklVar4 = new fkl(iArrD2);
        dkl.i(iArrD3, fklVar4.g);
        int[] iArr = fklVar4.g;
        dkl.k(iArr, iArrD, iArr);
        int[] iArr2 = fklVar4.g;
        dkl.k(iArr2, iArrD, iArr2);
        fkl fklVar5 = new fkl(iArrD);
        dkl.k(iArrD, fklVar4.g, fklVar5.g);
        int[] iArr3 = fklVar5.g;
        dkl.d(iArr3, iArrD3, iArr3);
        int[] iArr4 = fklVar5.g;
        dkl.k(iArr4, iArrD4, iArr4);
        fkl fklVar6 = new fkl(iArrD3);
        dkl.l(fklVar.g, fklVar6.g);
        if (!fklVar3.h()) {
            int[] iArr5 = fklVar6.g;
            dkl.d(iArr5, fklVar3.g, iArr5);
        }
        return new hkl(b87VarI, fklVar4, fklVar5, new h87[]{fklVar6}, this.e);
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
        fkl fklVar = (fkl) this.f20903b;
        fkl fklVar2 = (fkl) this.c;
        fkl fklVar3 = (fkl) i97Var.p();
        fkl fklVar4 = (fkl) i97Var.q();
        fkl fklVar5 = (fkl) this.d[0];
        fkl fklVar6 = (fkl) i97Var.r(0);
        int[] iArrE = ygg.e();
        int[] iArrD = ygg.d();
        int[] iArrD2 = ygg.d();
        int[] iArrD3 = ygg.d();
        boolean zH = fklVar5.h();
        if (zH) {
            iArr = fklVar3.g;
            iArr2 = fklVar4.g;
        } else {
            dkl.i(fklVar5.g, iArrD2);
            dkl.d(iArrD2, fklVar3.g, iArrD);
            dkl.d(iArrD2, fklVar5.g, iArrD2);
            dkl.d(iArrD2, fklVar4.g, iArrD2);
            iArr = iArrD;
            iArr2 = iArrD2;
        }
        boolean zH2 = fklVar6.h();
        if (zH2) {
            iArr3 = fklVar.g;
            iArr4 = fklVar2.g;
        } else {
            dkl.i(fklVar6.g, iArrD3);
            dkl.d(iArrD3, fklVar.g, iArrE);
            dkl.d(iArrD3, fklVar6.g, iArrD3);
            dkl.d(iArrD3, fklVar2.g, iArrD3);
            iArr3 = iArrE;
            iArr4 = iArrD3;
        }
        int[] iArrD4 = ygg.d();
        dkl.k(iArr3, iArr, iArrD4);
        dkl.k(iArr4, iArr2, iArrD);
        if (ygg.k(iArrD4)) {
            return ygg.k(iArrD) ? A() : b87VarI.q();
        }
        dkl.i(iArrD4, iArrD2);
        int[] iArrD5 = ygg.d();
        dkl.d(iArrD2, iArrD4, iArrD5);
        dkl.d(iArrD2, iArr3, iArrD2);
        dkl.f(iArrD5, iArrD5);
        ygg.l(iArr4, iArrD5, iArrE);
        dkl.h(ygg.b(iArrD2, iArrD2, iArrD5), iArrD5);
        fkl fklVar7 = new fkl(iArrD3);
        dkl.i(iArrD, fklVar7.g);
        int[] iArr5 = fklVar7.g;
        dkl.k(iArr5, iArrD5, iArr5);
        fkl fklVar8 = new fkl(iArrD5);
        dkl.k(iArrD2, fklVar7.g, fklVar8.g);
        dkl.e(fklVar8.g, iArrD, iArrE);
        dkl.g(iArrE, fklVar8.g);
        fkl fklVar9 = new fkl(iArrD4);
        if (!zH) {
            int[] iArr6 = fklVar9.g;
            dkl.d(iArr6, fklVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = fklVar9.g;
            dkl.d(iArr7, fklVar6.g, iArr7);
        }
        return new hkl(b87VarI, fklVar7, fklVar8, new h87[]{fklVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new hkl(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new hkl(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public hkl(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public hkl(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
