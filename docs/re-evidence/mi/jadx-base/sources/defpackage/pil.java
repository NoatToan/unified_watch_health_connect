package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class pil extends i97.b {
    public pil(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        nil nilVar = (nil) this.c;
        if (nilVar.i()) {
            return b87VarI.q();
        }
        nil nilVar2 = (nil) this.f20903b;
        nil nilVar3 = (nil) this.d[0];
        int[] iArrC = rgg.c();
        int[] iArrC2 = rgg.c();
        int[] iArrC3 = rgg.c();
        lil.j(nilVar.g, iArrC3);
        int[] iArrC4 = rgg.c();
        lil.j(iArrC3, iArrC4);
        boolean zH = nilVar3.h();
        int[] iArr = nilVar3.g;
        if (!zH) {
            lil.j(iArr, iArrC2);
            iArr = iArrC2;
        }
        lil.m(nilVar2.g, iArr, iArrC);
        lil.a(nilVar2.g, iArr, iArrC2);
        lil.e(iArrC2, iArrC, iArrC2);
        lil.i(rgg.b(iArrC2, iArrC2, iArrC2), iArrC2);
        lil.e(iArrC3, nilVar2.g, iArrC3);
        lil.i(xgg.F(4, iArrC3, 2, 0), iArrC3);
        lil.i(xgg.G(4, iArrC4, 3, 0, iArrC), iArrC);
        nil nilVar4 = new nil(iArrC4);
        lil.j(iArrC2, nilVar4.g);
        int[] iArr2 = nilVar4.g;
        lil.m(iArr2, iArrC3, iArr2);
        int[] iArr3 = nilVar4.g;
        lil.m(iArr3, iArrC3, iArr3);
        nil nilVar5 = new nil(iArrC3);
        lil.m(iArrC3, nilVar4.g, nilVar5.g);
        int[] iArr4 = nilVar5.g;
        lil.e(iArr4, iArrC2, iArr4);
        int[] iArr5 = nilVar5.g;
        lil.m(iArr5, iArrC, iArr5);
        nil nilVar6 = new nil(iArrC2);
        lil.n(nilVar.g, nilVar6.g);
        if (!zH) {
            int[] iArr6 = nilVar6.g;
            lil.e(iArr6, nilVar3.g, iArr6);
        }
        return new pil(b87VarI, nilVar4, nilVar5, new h87[]{nilVar6}, this.e);
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
        nil nilVar = (nil) this.f20903b;
        nil nilVar2 = (nil) this.c;
        nil nilVar3 = (nil) i97Var.p();
        nil nilVar4 = (nil) i97Var.q();
        nil nilVar5 = (nil) this.d[0];
        nil nilVar6 = (nil) i97Var.r(0);
        int[] iArrE = rgg.e();
        int[] iArrC = rgg.c();
        int[] iArrC2 = rgg.c();
        int[] iArrC3 = rgg.c();
        boolean zH = nilVar5.h();
        if (zH) {
            iArr = nilVar3.g;
            iArr2 = nilVar4.g;
        } else {
            lil.j(nilVar5.g, iArrC2);
            lil.e(iArrC2, nilVar3.g, iArrC);
            lil.e(iArrC2, nilVar5.g, iArrC2);
            lil.e(iArrC2, nilVar4.g, iArrC2);
            iArr = iArrC;
            iArr2 = iArrC2;
        }
        boolean zH2 = nilVar6.h();
        if (zH2) {
            iArr3 = nilVar.g;
            iArr4 = nilVar2.g;
        } else {
            lil.j(nilVar6.g, iArrC3);
            lil.e(iArrC3, nilVar.g, iArrE);
            lil.e(iArrC3, nilVar6.g, iArrC3);
            lil.e(iArrC3, nilVar2.g, iArrC3);
            iArr3 = iArrE;
            iArr4 = iArrC3;
        }
        int[] iArrC4 = rgg.c();
        lil.m(iArr3, iArr, iArrC4);
        lil.m(iArr4, iArr2, iArrC);
        if (rgg.o(iArrC4)) {
            return rgg.o(iArrC) ? A() : b87VarI.q();
        }
        lil.j(iArrC4, iArrC2);
        int[] iArrC5 = rgg.c();
        lil.e(iArrC2, iArrC4, iArrC5);
        lil.e(iArrC2, iArr3, iArrC2);
        lil.g(iArrC5, iArrC5);
        rgg.q(iArr4, iArrC5, iArrE);
        lil.i(rgg.b(iArrC2, iArrC2, iArrC5), iArrC5);
        nil nilVar7 = new nil(iArrC3);
        lil.j(iArrC, nilVar7.g);
        int[] iArr5 = nilVar7.g;
        lil.m(iArr5, iArrC5, iArr5);
        nil nilVar8 = new nil(iArrC5);
        lil.m(iArrC2, nilVar7.g, nilVar8.g);
        lil.f(nilVar8.g, iArrC, iArrE);
        lil.h(iArrE, nilVar8.g);
        nil nilVar9 = new nil(iArrC4);
        if (!zH) {
            int[] iArr6 = nilVar9.g;
            lil.e(iArr6, nilVar5.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = nilVar9.g;
            lil.e(iArr7, nilVar6.g, iArr7);
        }
        return new pil(b87VarI, nilVar7, nilVar8, new h87[]{nilVar9}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new pil(null, f(), g());
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new pil(this.f20902a, this.f20903b, this.c.m(), this.d, this.e);
    }

    public pil(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public pil(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
