package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class fd5 extends i97.b {
    public fd5(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        return this.c.i() ? i().q() : D(true);
    }

    public dd5 B(dd5 dd5Var, int[] iArr) {
        dd5 dd5Var2 = (dd5) i().k();
        if (dd5Var.h()) {
            return dd5Var2;
        }
        dd5 dd5Var3 = new dd5();
        if (iArr == null) {
            iArr = dd5Var3.g;
            bd5.j(dd5Var.g, iArr);
        }
        bd5.j(iArr, dd5Var3.g);
        int[] iArr2 = dd5Var3.g;
        bd5.e(iArr2, dd5Var2.g, iArr2);
        return dd5Var3;
    }

    public dd5 C() {
        h87[] h87VarArr = this.d;
        dd5 dd5Var = (dd5) h87VarArr[1];
        if (dd5Var != null) {
            return dd5Var;
        }
        dd5 dd5VarB = B((dd5) h87VarArr[0], null);
        h87VarArr[1] = dd5VarB;
        return dd5VarB;
    }

    public fd5 D(boolean z) {
        dd5 dd5Var;
        dd5 dd5Var2 = (dd5) this.f20903b;
        dd5 dd5Var3 = (dd5) this.c;
        dd5 dd5Var4 = (dd5) this.d[0];
        dd5 dd5VarC = C();
        int[] iArrF = ahg.f();
        bd5.j(dd5Var2.g, iArrF);
        bd5.i(ahg.b(iArrF, iArrF, iArrF) + ahg.d(dd5VarC.g, iArrF), iArrF);
        int[] iArrF2 = ahg.f();
        bd5.o(dd5Var3.g, iArrF2);
        int[] iArrF3 = ahg.f();
        bd5.e(iArrF2, dd5Var3.g, iArrF3);
        int[] iArrF4 = ahg.f();
        bd5.e(iArrF3, dd5Var2.g, iArrF4);
        bd5.o(iArrF4, iArrF4);
        int[] iArrF5 = ahg.f();
        bd5.j(iArrF3, iArrF5);
        bd5.o(iArrF5, iArrF5);
        dd5 dd5Var5 = new dd5(iArrF3);
        bd5.j(iArrF, dd5Var5.g);
        int[] iArr = dd5Var5.g;
        bd5.n(iArr, iArrF4, iArr);
        int[] iArr2 = dd5Var5.g;
        bd5.n(iArr2, iArrF4, iArr2);
        dd5 dd5Var6 = new dd5(iArrF4);
        bd5.n(iArrF4, dd5Var5.g, dd5Var6.g);
        int[] iArr3 = dd5Var6.g;
        bd5.e(iArr3, iArrF, iArr3);
        int[] iArr4 = dd5Var6.g;
        bd5.n(iArr4, iArrF5, iArr4);
        dd5 dd5Var7 = new dd5(iArrF2);
        if (!ahg.r(dd5Var4.g)) {
            int[] iArr5 = dd5Var7.g;
            bd5.e(iArr5, dd5Var4.g, iArr5);
        }
        if (z) {
            dd5Var = new dd5(iArrF5);
            int[] iArr6 = dd5Var.g;
            bd5.e(iArr6, dd5VarC.g, iArr6);
            int[] iArr7 = dd5Var.g;
            bd5.o(iArr7, iArr7);
        } else {
            dd5Var = null;
        }
        return new fd5(i(), dd5Var5, dd5Var6, new h87[]{dd5Var7, dd5Var}, this.e);
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
        dd5 dd5Var = (dd5) this.f20903b;
        dd5 dd5Var2 = (dd5) this.c;
        dd5 dd5Var3 = (dd5) this.d[0];
        dd5 dd5Var4 = (dd5) i97Var.p();
        dd5 dd5Var5 = (dd5) i97Var.q();
        dd5 dd5Var6 = (dd5) i97Var.r(0);
        int[] iArrH = ahg.h();
        int[] iArrF = ahg.f();
        int[] iArrF2 = ahg.f();
        int[] iArrF3 = ahg.f();
        boolean zH = dd5Var3.h();
        if (zH) {
            iArr = dd5Var4.g;
            iArr2 = dd5Var5.g;
        } else {
            bd5.j(dd5Var3.g, iArrF2);
            bd5.e(iArrF2, dd5Var4.g, iArrF);
            bd5.e(iArrF2, dd5Var3.g, iArrF2);
            bd5.e(iArrF2, dd5Var5.g, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = dd5Var6.h();
        if (zH2) {
            iArr3 = dd5Var.g;
            iArr4 = dd5Var2.g;
        } else {
            bd5.j(dd5Var6.g, iArrF3);
            bd5.e(iArrF3, dd5Var.g, iArrH);
            bd5.e(iArrF3, dd5Var6.g, iArrF3);
            bd5.e(iArrF3, dd5Var2.g, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = ahg.f();
        bd5.n(iArr3, iArr, iArrF4);
        bd5.n(iArr4, iArr2, iArrF);
        if (ahg.t(iArrF4)) {
            return ahg.t(iArrF) ? A() : b87VarI.q();
        }
        int[] iArrF5 = ahg.f();
        bd5.j(iArrF4, iArrF5);
        int[] iArrF6 = ahg.f();
        bd5.e(iArrF5, iArrF4, iArrF6);
        bd5.e(iArrF5, iArr3, iArrF2);
        bd5.g(iArrF6, iArrF6);
        ahg.w(iArr4, iArrF6, iArrH);
        bd5.i(ahg.b(iArrF2, iArrF2, iArrF6), iArrF6);
        dd5 dd5Var7 = new dd5(iArrF3);
        bd5.j(iArrF, dd5Var7.g);
        int[] iArr5 = dd5Var7.g;
        bd5.n(iArr5, iArrF6, iArr5);
        dd5 dd5Var8 = new dd5(iArrF6);
        bd5.n(iArrF2, dd5Var7.g, dd5Var8.g);
        bd5.f(dd5Var8.g, iArrF, iArrH);
        bd5.h(iArrH, dd5Var8.g);
        dd5 dd5Var9 = new dd5(iArrF4);
        if (!zH) {
            int[] iArr6 = dd5Var9.g;
            bd5.e(iArr6, dd5Var3.g, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = dd5Var9.g;
            bd5.e(iArr7, dd5Var6.g, iArr7);
        }
        if (!zH || !zH2) {
            iArrF5 = null;
        }
        return new fd5(b87VarI, dd5Var7, dd5Var8, new h87[]{dd5Var9, B(dd5Var9, iArrF5)}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new fd5(null, f(), g());
    }

    @Override // defpackage.i97
    public h87 r(int i) {
        return i == 1 ? C() : super.r(i);
    }

    @Override // defpackage.i97
    public i97 v() {
        return s() ? this : new fd5(i(), this.f20903b, this.c.m(), this.d, this.e);
    }

    public fd5(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public fd5(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
