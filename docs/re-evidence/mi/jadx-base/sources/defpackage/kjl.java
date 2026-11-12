package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class kjl extends h97.b {
    public kjl(a87 a87Var, g87 g87Var, g87 g87Var2) {
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
        ijl ijlVar = (ijl) this.c;
        if (ijlVar.i()) {
            return a87VarI.t();
        }
        ijl ijlVar2 = (ijl) this.f19826b;
        ijl ijlVar3 = (ijl) this.d[0];
        int[] iArrC = ugg.c();
        int[] iArrC2 = ugg.c();
        int[] iArrC3 = ugg.c();
        gjl.i(ijlVar.g, iArrC3);
        int[] iArrC4 = ugg.c();
        gjl.i(iArrC3, iArrC4);
        boolean zH = ijlVar3.h();
        int[] iArr = ijlVar3.g;
        if (!zH) {
            gjl.i(iArr, iArrC2);
            iArr = iArrC2;
        }
        gjl.k(ijlVar2.g, iArr, iArrC);
        gjl.a(ijlVar2.g, iArr, iArrC2);
        gjl.d(iArrC2, iArrC, iArrC2);
        gjl.h(ugg.b(iArrC2, iArrC2, iArrC2), iArrC2);
        gjl.d(iArrC3, ijlVar2.g, iArrC3);
        gjl.h(mhg.F(5, iArrC3, 2, 0), iArrC3);
        gjl.h(mhg.G(5, iArrC4, 3, 0, iArrC), iArrC);
        ijl ijlVar4 = new ijl(iArrC4);
        gjl.i(iArrC2, ijlVar4.g);
        int[] iArr2 = ijlVar4.g;
        gjl.k(iArr2, iArrC3, iArr2);
        int[] iArr3 = ijlVar4.g;
        gjl.k(iArr3, iArrC3, iArr3);
        ijl ijlVar5 = new ijl(iArrC3);
        gjl.k(iArrC3, ijlVar4.g, ijlVar5.g);
        int[] iArr4 = ijlVar5.g;
        gjl.d(iArr4, iArrC2, iArr4);
        int[] iArr5 = ijlVar5.g;
        gjl.k(iArr5, iArrC, iArr5);
        ijl ijlVar6 = new ijl(iArrC2);
        gjl.l(ijlVar.g, ijlVar6.g);
        if (!zH) {
            int[] iArr6 = ijlVar6.g;
            gjl.d(iArr6, ijlVar3.g, iArr6);
        }
        return new kjl(a87VarI, ijlVar4, ijlVar5, new g87[]{ijlVar6}, this.e);
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
        ijl ijlVar = (ijl) this.f19826b;
        ijl ijlVar2 = (ijl) this.c;
        ijl ijlVar3 = (ijl) h97Var.q();
        ijl ijlVar4 = (ijl) h97Var.r();
        ijl ijlVar5 = (ijl) this.d[0];
        ijl ijlVar6 = (ijl) h97Var.s(0);
        int[] iArrD = ugg.d();
        int[] iArrC = ugg.c();
        int[] iArrC2 = ugg.c();
        int[] iArrC3 = ugg.c();
        boolean zH = ijlVar5.h();
        if (zH) {
            iArr = ijlVar3.g;
            iArr2 = ijlVar4.g;
        } else {
            gjl.i(ijlVar5.g, iArrC2);
            gjl.d(iArrC2, ijlVar3.g, iArrC);
            gjl.d(iArrC2, ijlVar5.g, iArrC2);
            gjl.d(iArrC2, ijlVar4.g, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = ijlVar6.h();
        if (zH2) {
            iArr3 = ijlVar.g;
            iArr4 = ijlVar2.g;
        } else {
            gjl.i(ijlVar6.g, iArrC3);
            gjl.d(iArrC3, ijlVar.g, iArrD);
            gjl.d(iArrC3, ijlVar6.g, iArrC3);
            gjl.d(iArrC3, ijlVar2.g, iArrC3);
            iArr3 = iArrD;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = ugg.c();
        gjl.k(iArr3, iArr, iArrC4);
        gjl.k(iArr4, iArr2, iArrC);
        if (ugg.j(iArrC4)) {
            return ugg.j(iArrC) ? G() : a87VarI.t();
        }
        gjl.i(iArrC4, iArrC2);
        int[] iArrC5 = ugg.c();
        gjl.d(iArrC2, iArrC4, iArrC5);
        gjl.d(iArrC2, iArr3, iArrC2);
        gjl.f(iArrC5, iArrC5);
        ugg.k(iArr4, iArrC5, iArrD);
        gjl.h(ugg.b(iArrC2, iArrC2, iArrC5), iArrC5);
        ijl ijlVar7 = new ijl(iArrC3);
        gjl.i(iArrC, ijlVar7.g);
        int[] iArr5 = ijlVar7.g;
        gjl.k(iArr5, iArrC5, iArr5);
        ijl ijlVar8 = new ijl(iArrC5);
        gjl.k(iArrC2, ijlVar7.g, ijlVar8.g);
        gjl.e(ijlVar8.g, iArrC, iArrD);
        gjl.g(iArrD, ijlVar8.g);
        ijl ijlVar9 = new ijl(iArrC4);
        if (!zH) {
            int[] iArr6 = ijlVar9.g;
            gjl.d(iArr6, ijlVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = ijlVar9.g;
            gjl.d(iArr7, ijlVar6.g, iArr7);
        }
        return new kjl(a87VarI, ijlVar7, ijlVar8, new g87[]{ijlVar9}, this.e);
    }

    @Override // defpackage.h97
    public h97 d() {
        return new kjl(null, f(), g());
    }

    @Override // defpackage.h97
    public h97 x() {
        return t() ? this : new kjl(this.f19825a, this.f19826b, this.c.m(), this.d, this.e);
    }

    public kjl(a87 a87Var, g87 g87Var, g87 g87Var2, boolean z) {
        super(a87Var, g87Var, g87Var2);
        if ((g87Var == null) != (g87Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.e = z;
    }

    public kjl(a87 a87Var, g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        super(a87Var, g87Var, g87Var2, g87VarArr);
        this.e = z;
    }
}
