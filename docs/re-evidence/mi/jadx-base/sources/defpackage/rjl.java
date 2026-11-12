package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class rjl extends i97.b {
    public rjl(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        pjl pjlVar = (pjl) this.c;
        if (pjlVar.i()) {
            return b87VarI.q();
        }
        pjl pjlVar2 = (pjl) this.f20903b;
        pjl pjlVar3 = (pjl) this.d[0];
        int[] iArrE = vgg.e();
        njl.i(pjlVar.g, iArrE);
        int[] iArrE2 = vgg.e();
        njl.i(iArrE, iArrE2);
        int[] iArrE3 = vgg.e();
        njl.i(pjlVar2.g, iArrE3);
        njl.h(vgg.b(iArrE3, iArrE3, iArrE3), iArrE3);
        njl.d(iArrE, pjlVar2.g, iArrE);
        njl.h(xgg.F(6, iArrE, 2, 0), iArrE);
        int[] iArrE4 = vgg.e();
        njl.h(xgg.G(6, iArrE2, 3, 0, iArrE4), iArrE4);
        pjl pjlVar4 = new pjl(iArrE2);
        njl.i(iArrE3, pjlVar4.g);
        int[] iArr = pjlVar4.g;
        njl.k(iArr, iArrE, iArr);
        int[] iArr2 = pjlVar4.g;
        njl.k(iArr2, iArrE, iArr2);
        pjl pjlVar5 = new pjl(iArrE);
        njl.k(iArrE, pjlVar4.g, pjlVar5.g);
        int[] iArr3 = pjlVar5.g;
        njl.d(iArr3, iArrE3, iArr3);
        int[] iArr4 = pjlVar5.g;
        njl.k(iArr4, iArrE4, iArr4);
        pjl pjlVar6 = new pjl(iArrE3);
        njl.l(pjlVar.g, pjlVar6.g);
        if (!pjlVar3.h()) {
            int[] iArr5 = pjlVar6.g;
            njl.d(iArr5, pjlVar3.g, iArr5);
        }
        return new rjl(b87VarI, pjlVar4, pjlVar5, new h87[]{pjlVar6}, this.e);
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
        pjl pjlVar = (pjl) this.f20903b;
        pjl pjlVar2 = (pjl) this.c;
        pjl pjlVar3 = (pjl) i97Var.p();
        pjl pjlVar4 = (pjl) i97Var.q();
        pjl pjlVar5 = (pjl) this.d[0];
        pjl pjlVar6 = (pjl) i97Var.r(0);
        int[] iArrG = vgg.g();
        int[] iArrE = vgg.e();
        int[] iArrE2 = vgg.e();
        int[] iArrE3 = vgg.e();
        boolean zH = pjlVar5.h();
        if (zH) {
            iArr = pjlVar3.g;
            iArr2 = pjlVar4.g;
        } else {
            njl.i(pjlVar5.g, iArrE2);
            njl.d(iArrE2, pjlVar3.g, iArrE);
            njl.d(iArrE2, pjlVar5.g, iArrE2);
            njl.d(iArrE2, pjlVar4.g, iArrE2);
            iArr = iArrE;
            iArr2 = iArrE2;
        }
        boolean zH2 = pjlVar6.h();
        if (zH2) {
            iArr3 = pjlVar.g;
            iArr4 = pjlVar2.g;
        } else {
            njl.i(pjlVar6.g, iArrE3);
            njl.d(iArrE3, pjlVar.g, iArrG);
            njl.d(iArrE3, pjlVar6.g, iArrE3);
            njl.d(iArrE3, pjlVar2.g, iArrE3);
            iArr3 = iArrG;
            iArr4 = iArrE3;
        }
        int[] iArrE4 = vgg.e();
        njl.k(iArr3, iArr, iArrE4);
        njl.k(iArr4, iArr2, iArrE);
        if (vgg.s(iArrE4)) {
            return vgg.s(iArrE) ? A() : b87VarI.q();
        }
        njl.i(iArrE4, iArrE2);
        int[] iArrE5 = vgg.e();
        njl.d(iArrE2, iArrE4, iArrE5);
        njl.d(iArrE2, iArr3, iArrE2);
        njl.f(iArrE5, iArrE5);
        vgg.v(iArr4, iArrE5, iArrG);
        njl.h(vgg.b(iArrE2, iArrE2, iArrE5), iArrE5);
        pjl pjlVar7 = new pjl(iArrE3);
        njl.i(iArrE, pjlVar7.g);
        int[] iArr5 = pjlVar7.g;
        njl.k(iArr5, iArrE5, iArr5);
        pjl pjlVar8 = new pjl(iArrE5);
        njl.k(iArrE2, pjlVar7.g, pjlVar8.g);
        njl.e(pjlVar8.g, iArrE, iArrG);
        njl.g(iArrG, pjlVar8.g);
        pjl pjlVar9 = new pjl(iArrE4);
        if (!zH) {
            int[] iArr6 = pjlVar9.g;
            njl.d(iArr6, pjlVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = pjlVar9.g;
            njl.d(iArr7, pjlVar6.g, iArr7);
        }
        return new rjl(b87VarI, pjlVar7, pjlVar8, new h87[]{pjlVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new rjl(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new rjl(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public rjl(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public rjl(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
