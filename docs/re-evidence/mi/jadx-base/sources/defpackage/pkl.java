package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class pkl extends i97.b {
    public pkl(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        nkl nklVar = (nkl) this.c;
        if (nklVar.i()) {
            return b87VarI.q();
        }
        nkl nklVar2 = (nkl) this.f20903b;
        nkl nklVar3 = (nkl) this.d[0];
        int[] iArrD = ygg.d();
        int[] iArrD2 = ygg.d();
        int[] iArrD3 = ygg.d();
        lkl.j(nklVar.g, iArrD3);
        int[] iArrD4 = ygg.d();
        lkl.j(iArrD3, iArrD4);
        boolean zH = nklVar3.h();
        int[] iArr = nklVar3.g;
        if (!zH) {
            lkl.j(iArr, iArrD2);
            iArr = iArrD2;
        }
        lkl.m(nklVar2.g, iArr, iArrD);
        lkl.a(nklVar2.g, iArr, iArrD2);
        lkl.e(iArrD2, iArrD, iArrD2);
        lkl.i(ygg.b(iArrD2, iArrD2, iArrD2), iArrD2);
        lkl.e(iArrD3, nklVar2.g, iArrD3);
        lkl.i(xgg.F(7, iArrD3, 2, 0), iArrD3);
        lkl.i(xgg.G(7, iArrD4, 3, 0, iArrD), iArrD);
        nkl nklVar4 = new nkl(iArrD4);
        lkl.j(iArrD2, nklVar4.g);
        int[] iArr2 = nklVar4.g;
        lkl.m(iArr2, iArrD3, iArr2);
        int[] iArr3 = nklVar4.g;
        lkl.m(iArr3, iArrD3, iArr3);
        nkl nklVar5 = new nkl(iArrD3);
        lkl.m(iArrD3, nklVar4.g, nklVar5.g);
        int[] iArr4 = nklVar5.g;
        lkl.e(iArr4, iArrD2, iArr4);
        int[] iArr5 = nklVar5.g;
        lkl.m(iArr5, iArrD, iArr5);
        nkl nklVar6 = new nkl(iArrD2);
        lkl.n(nklVar.g, nklVar6.g);
        if (!zH) {
            int[] iArr6 = nklVar6.g;
            lkl.e(iArr6, nklVar3.g, iArr6);
        }
        return new pkl(b87VarI, nklVar4, nklVar5, new h87[]{nklVar6}, this.e);
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
        nkl nklVar = (nkl) this.f20903b;
        nkl nklVar2 = (nkl) this.c;
        nkl nklVar3 = (nkl) i97Var.p();
        nkl nklVar4 = (nkl) i97Var.q();
        nkl nklVar5 = (nkl) this.d[0];
        nkl nklVar6 = (nkl) i97Var.r(0);
        int[] iArrE = ygg.e();
        int[] iArrD = ygg.d();
        int[] iArrD2 = ygg.d();
        int[] iArrD3 = ygg.d();
        boolean zH = nklVar5.h();
        if (zH) {
            iArr = nklVar3.g;
            iArr2 = nklVar4.g;
        } else {
            lkl.j(nklVar5.g, iArrD2);
            lkl.e(iArrD2, nklVar3.g, iArrD);
            lkl.e(iArrD2, nklVar5.g, iArrD2);
            lkl.e(iArrD2, nklVar4.g, iArrD2);
            iArr = iArrD;
            iArr2 = iArrD2;
        }
        boolean zH2 = nklVar6.h();
        if (zH2) {
            iArr3 = nklVar.g;
            iArr4 = nklVar2.g;
        } else {
            lkl.j(nklVar6.g, iArrD3);
            lkl.e(iArrD3, nklVar.g, iArrE);
            lkl.e(iArrD3, nklVar6.g, iArrD3);
            lkl.e(iArrD3, nklVar2.g, iArrD3);
            iArr3 = iArrE;
            iArr4 = iArrD3;
        }
        int[] iArrD4 = ygg.d();
        lkl.m(iArr3, iArr, iArrD4);
        lkl.m(iArr4, iArr2, iArrD);
        if (ygg.k(iArrD4)) {
            return ygg.k(iArrD) ? A() : b87VarI.q();
        }
        lkl.j(iArrD4, iArrD2);
        int[] iArrD5 = ygg.d();
        lkl.e(iArrD2, iArrD4, iArrD5);
        lkl.e(iArrD2, iArr3, iArrD2);
        lkl.g(iArrD5, iArrD5);
        ygg.l(iArr4, iArrD5, iArrE);
        lkl.i(ygg.b(iArrD2, iArrD2, iArrD5), iArrD5);
        nkl nklVar7 = new nkl(iArrD3);
        lkl.j(iArrD, nklVar7.g);
        int[] iArr5 = nklVar7.g;
        lkl.m(iArr5, iArrD5, iArr5);
        nkl nklVar8 = new nkl(iArrD5);
        lkl.m(iArrD2, nklVar7.g, nklVar8.g);
        lkl.f(nklVar8.g, iArrD, iArrE);
        lkl.h(iArrE, nklVar8.g);
        nkl nklVar9 = new nkl(iArrD4);
        if (!zH) {
            int[] iArr6 = nklVar9.g;
            lkl.e(iArr6, nklVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = nklVar9.g;
            lkl.e(iArr7, nklVar6.g, iArr7);
        }
        return new pkl(b87VarI, nklVar7, nklVar8, new h87[]{nklVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new pkl(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new pkl(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public pkl(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public pkl(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
