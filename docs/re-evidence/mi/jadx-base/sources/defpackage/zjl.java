package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class zjl extends i97.b {
    public zjl(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        xjl xjlVar = (xjl) this.c;
        if (xjlVar.i()) {
            return b87VarI.q();
        }
        xjl xjlVar2 = (xjl) this.f20903b;
        xjl xjlVar3 = (xjl) this.d[0];
        int[] iArrE = vgg.e();
        int[] iArrE2 = vgg.e();
        int[] iArrE3 = vgg.e();
        vjl.j(xjlVar.g, iArrE3);
        int[] iArrE4 = vgg.e();
        vjl.j(iArrE3, iArrE4);
        boolean zH = xjlVar3.h();
        int[] iArr = xjlVar3.g;
        if (!zH) {
            vjl.j(iArr, iArrE2);
            iArr = iArrE2;
        }
        vjl.m(xjlVar2.g, iArr, iArrE);
        vjl.a(xjlVar2.g, iArr, iArrE2);
        vjl.e(iArrE2, iArrE, iArrE2);
        vjl.i(vgg.b(iArrE2, iArrE2, iArrE2), iArrE2);
        vjl.e(iArrE3, xjlVar2.g, iArrE3);
        vjl.i(xgg.F(6, iArrE3, 2, 0), iArrE3);
        vjl.i(xgg.G(6, iArrE4, 3, 0, iArrE), iArrE);
        xjl xjlVar4 = new xjl(iArrE4);
        vjl.j(iArrE2, xjlVar4.g);
        int[] iArr2 = xjlVar4.g;
        vjl.m(iArr2, iArrE3, iArr2);
        int[] iArr3 = xjlVar4.g;
        vjl.m(iArr3, iArrE3, iArr3);
        xjl xjlVar5 = new xjl(iArrE3);
        vjl.m(iArrE3, xjlVar4.g, xjlVar5.g);
        int[] iArr4 = xjlVar5.g;
        vjl.e(iArr4, iArrE2, iArr4);
        int[] iArr5 = xjlVar5.g;
        vjl.m(iArr5, iArrE, iArr5);
        xjl xjlVar6 = new xjl(iArrE2);
        vjl.n(xjlVar.g, xjlVar6.g);
        if (!zH) {
            int[] iArr6 = xjlVar6.g;
            vjl.e(iArr6, xjlVar3.g, iArr6);
        }
        return new zjl(b87VarI, xjlVar4, xjlVar5, new h87[]{xjlVar6}, this.e);
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
        xjl xjlVar = (xjl) this.f20903b;
        xjl xjlVar2 = (xjl) this.c;
        xjl xjlVar3 = (xjl) i97Var.p();
        xjl xjlVar4 = (xjl) i97Var.q();
        xjl xjlVar5 = (xjl) this.d[0];
        xjl xjlVar6 = (xjl) i97Var.r(0);
        int[] iArrG = vgg.g();
        int[] iArrE = vgg.e();
        int[] iArrE2 = vgg.e();
        int[] iArrE3 = vgg.e();
        boolean zH = xjlVar5.h();
        if (zH) {
            iArr = xjlVar3.g;
            iArr2 = xjlVar4.g;
        } else {
            vjl.j(xjlVar5.g, iArrE2);
            vjl.e(iArrE2, xjlVar3.g, iArrE);
            vjl.e(iArrE2, xjlVar5.g, iArrE2);
            vjl.e(iArrE2, xjlVar4.g, iArrE2);
            iArr = iArrE;
            iArr2 = iArrE2;
        }
        boolean zH2 = xjlVar6.h();
        if (zH2) {
            iArr3 = xjlVar.g;
            iArr4 = xjlVar2.g;
        } else {
            vjl.j(xjlVar6.g, iArrE3);
            vjl.e(iArrE3, xjlVar.g, iArrG);
            vjl.e(iArrE3, xjlVar6.g, iArrE3);
            vjl.e(iArrE3, xjlVar2.g, iArrE3);
            iArr3 = iArrG;
            iArr4 = iArrE3;
        }
        int[] iArrE4 = vgg.e();
        vjl.m(iArr3, iArr, iArrE4);
        vjl.m(iArr4, iArr2, iArrE);
        if (vgg.s(iArrE4)) {
            return vgg.s(iArrE) ? A() : b87VarI.q();
        }
        vjl.j(iArrE4, iArrE2);
        int[] iArrE5 = vgg.e();
        vjl.e(iArrE2, iArrE4, iArrE5);
        vjl.e(iArrE2, iArr3, iArrE2);
        vjl.g(iArrE5, iArrE5);
        vgg.v(iArr4, iArrE5, iArrG);
        vjl.i(vgg.b(iArrE2, iArrE2, iArrE5), iArrE5);
        xjl xjlVar7 = new xjl(iArrE3);
        vjl.j(iArrE, xjlVar7.g);
        int[] iArr5 = xjlVar7.g;
        vjl.m(iArr5, iArrE5, iArr5);
        xjl xjlVar8 = new xjl(iArrE5);
        vjl.m(iArrE2, xjlVar7.g, xjlVar8.g);
        vjl.f(xjlVar8.g, iArrE, iArrG);
        vjl.h(iArrG, xjlVar8.g);
        xjl xjlVar9 = new xjl(iArrE4);
        if (!zH) {
            int[] iArr6 = xjlVar9.g;
            vjl.e(iArr6, xjlVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = xjlVar9.g;
            vjl.e(iArr7, xjlVar6.g, iArr7);
        }
        return new zjl(b87VarI, xjlVar7, xjlVar8, new h87[]{xjlVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new zjl(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new zjl(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public zjl(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public zjl(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
