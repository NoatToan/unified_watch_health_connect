package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class til extends i97.b {
    public til(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        hjl hjlVar = (hjl) this.c;
        if (hjlVar.i()) {
            return b87VarI.q();
        }
        hjl hjlVar2 = (hjl) this.f20903b;
        hjl hjlVar3 = (hjl) this.d[0];
        int[] iArrC = tgg.c();
        fjl.i(hjlVar.g, iArrC);
        int[] iArrC2 = tgg.c();
        fjl.i(iArrC, iArrC2);
        int[] iArrC3 = tgg.c();
        fjl.i(hjlVar2.g, iArrC3);
        fjl.h(tgg.b(iArrC3, iArrC3, iArrC3), iArrC3);
        fjl.d(iArrC, hjlVar2.g, iArrC);
        fjl.h(xgg.F(5, iArrC, 2, 0), iArrC);
        int[] iArrC4 = tgg.c();
        fjl.h(xgg.G(5, iArrC2, 3, 0, iArrC4), iArrC4);
        hjl hjlVar4 = new hjl(iArrC2);
        fjl.i(iArrC3, hjlVar4.g);
        int[] iArr = hjlVar4.g;
        fjl.k(iArr, iArrC, iArr);
        int[] iArr2 = hjlVar4.g;
        fjl.k(iArr2, iArrC, iArr2);
        hjl hjlVar5 = new hjl(iArrC);
        fjl.k(iArrC, hjlVar4.g, hjlVar5.g);
        int[] iArr3 = hjlVar5.g;
        fjl.d(iArr3, iArrC3, iArr3);
        int[] iArr4 = hjlVar5.g;
        fjl.k(iArr4, iArrC4, iArr4);
        hjl hjlVar6 = new hjl(iArrC3);
        fjl.l(hjlVar.g, hjlVar6.g);
        if (!hjlVar3.h()) {
            int[] iArr5 = hjlVar6.g;
            fjl.d(iArr5, hjlVar3.g, iArr5);
        }
        return new til(b87VarI, hjlVar4, hjlVar5, new h87[]{hjlVar6}, this.e);
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
        hjl hjlVar = (hjl) this.f20903b;
        hjl hjlVar2 = (hjl) this.c;
        hjl hjlVar3 = (hjl) i97Var.p();
        hjl hjlVar4 = (hjl) i97Var.q();
        hjl hjlVar5 = (hjl) this.d[0];
        hjl hjlVar6 = (hjl) i97Var.r(0);
        int[] iArrD = tgg.d();
        int[] iArrC = tgg.c();
        int[] iArrC2 = tgg.c();
        int[] iArrC3 = tgg.c();
        boolean zH = hjlVar5.h();
        if (zH) {
            iArr = hjlVar3.g;
            iArr2 = hjlVar4.g;
        } else {
            fjl.i(hjlVar5.g, iArrC2);
            fjl.d(iArrC2, hjlVar3.g, iArrC);
            fjl.d(iArrC2, hjlVar5.g, iArrC2);
            fjl.d(iArrC2, hjlVar4.g, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = hjlVar6.h();
        if (zH2) {
            iArr3 = hjlVar.g;
            iArr4 = hjlVar2.g;
        } else {
            fjl.i(hjlVar6.g, iArrC3);
            fjl.d(iArrC3, hjlVar.g, iArrD);
            fjl.d(iArrC3, hjlVar6.g, iArrC3);
            fjl.d(iArrC3, hjlVar2.g, iArrC3);
            iArr3 = iArrD;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = tgg.c();
        fjl.k(iArr3, iArr, iArrC4);
        fjl.k(iArr4, iArr2, iArrC);
        if (tgg.j(iArrC4)) {
            return tgg.j(iArrC) ? A() : b87VarI.q();
        }
        fjl.i(iArrC4, iArrC2);
        int[] iArrC5 = tgg.c();
        fjl.d(iArrC2, iArrC4, iArrC5);
        fjl.d(iArrC2, iArr3, iArrC2);
        fjl.f(iArrC5, iArrC5);
        tgg.k(iArr4, iArrC5, iArrD);
        fjl.h(tgg.b(iArrC2, iArrC2, iArrC5), iArrC5);
        hjl hjlVar7 = new hjl(iArrC3);
        fjl.i(iArrC, hjlVar7.g);
        int[] iArr5 = hjlVar7.g;
        fjl.k(iArr5, iArrC5, iArr5);
        hjl hjlVar8 = new hjl(iArrC5);
        fjl.k(iArrC2, hjlVar7.g, hjlVar8.g);
        fjl.e(hjlVar8.g, iArrC, iArrD);
        fjl.g(iArrD, hjlVar8.g);
        hjl hjlVar9 = new hjl(iArrC4);
        if (!zH) {
            int[] iArr6 = hjlVar9.g;
            fjl.d(iArr6, hjlVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = hjlVar9.g;
            fjl.d(iArr7, hjlVar6.g, iArr7);
        }
        return new til(b87VarI, hjlVar7, hjlVar8, new h87[]{hjlVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new til(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new til(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public til(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public til(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
