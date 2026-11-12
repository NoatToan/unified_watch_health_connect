package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class a06 extends zz5 {
    public final boolean c;

    public a06(i53 i53Var, boolean z) {
        super(i53Var);
        this.c = z;
    }

    public void g(f12 f12Var) {
        r34[] r34VarArrD = d();
        m();
        l(r34VarArrD, f12Var);
        i53 i53VarA = a();
        atk atkVarH = this.c ? i53VarA.h() : i53VarA.i();
        atk atkVarB = this.c ? i53VarA.b() : i53VarA.c();
        int iE = e((int) atkVarH.d());
        int iE2 = e((int) atkVarB.d());
        int iC = -1;
        int i = 0;
        int iMax = 1;
        while (iE < iE2) {
            r34 r34Var = r34VarArrD[iE];
            if (r34Var != null) {
                int iC2 = r34Var.c() - iC;
                if (iC2 == 0) {
                    i++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i);
                        iC = r34Var.c();
                    } else if (iC2 < 0 || r34Var.c() >= f12Var.c() || iC2 > iE) {
                        r34VarArrD[iE] = null;
                    } else {
                        if (iMax > 2) {
                            iC2 *= iMax - 2;
                        }
                        boolean z = iC2 >= iE;
                        for (int i2 = 1; i2 <= iC2 && !z; i2++) {
                            z = r34VarArrD[iE - i2] != null;
                        }
                        if (z) {
                            r34VarArrD[iE] = null;
                        } else {
                            iC = r34Var.c();
                        }
                    }
                    i = 1;
                }
            }
            iE++;
        }
    }

    public final void h(f12 f12Var) {
        i53 i53VarA = a();
        atk atkVarH = this.c ? i53VarA.h() : i53VarA.i();
        atk atkVarB = this.c ? i53VarA.b() : i53VarA.c();
        int iE = e((int) atkVarB.d());
        r34[] r34VarArrD = d();
        int iC = -1;
        int i = 0;
        int iMax = 1;
        for (int iE2 = e((int) atkVarH.d()); iE2 < iE; iE2++) {
            r34 r34Var = r34VarArrD[iE2];
            if (r34Var != null) {
                r34Var.j();
                int iC2 = r34Var.c() - iC;
                if (iC2 == 0) {
                    i++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i);
                        iC = r34Var.c();
                    } else if (r34Var.c() >= f12Var.c()) {
                        r34VarArrD[iE2] = null;
                    } else {
                        iC = r34Var.c();
                    }
                    i = 1;
                }
            }
        }
    }

    public f12 i() {
        r34[] r34VarArrD = d();
        h12 h12Var = new h12();
        h12 h12Var2 = new h12();
        h12 h12Var3 = new h12();
        h12 h12Var4 = new h12();
        for (r34 r34Var : r34VarArrD) {
            if (r34Var != null) {
                r34Var.j();
                int iE = r34Var.e() % 30;
                int iC = r34Var.c();
                if (!this.c) {
                    iC += 2;
                }
                int i = iC % 3;
                if (i == 0) {
                    h12Var2.b((iE * 3) + 1);
                } else if (i == 1) {
                    h12Var4.b(iE / 3);
                    h12Var3.b(iE % 3);
                } else if (i == 2) {
                    h12Var.b(iE + 1);
                }
            }
        }
        if (h12Var.a().length == 0 || h12Var2.a().length == 0 || h12Var3.a().length == 0 || h12Var4.a().length == 0 || h12Var.a()[0] <= 0 || h12Var2.a()[0] + h12Var3.a()[0] < 3 || h12Var2.a()[0] + h12Var3.a()[0] > 90) {
            return null;
        }
        f12 f12Var = new f12(h12Var.a()[0], h12Var2.a()[0], h12Var3.a()[0], h12Var4.a()[0]);
        l(r34VarArrD, f12Var);
        return f12Var;
    }

    public int[] j() {
        int iC;
        f12 f12VarI = i();
        if (f12VarI == null) {
            return null;
        }
        h(f12VarI);
        int iC2 = f12VarI.c();
        int[] iArr = new int[iC2];
        for (r34 r34Var : d()) {
            if (r34Var != null && (iC = r34Var.c()) < iC2) {
                iArr[iC] = iArr[iC] + 1;
            }
        }
        return iArr;
    }

    public boolean k() {
        return this.c;
    }

    public final void l(r34[] r34VarArr, f12 f12Var) {
        for (int i = 0; i < r34VarArr.length; i++) {
            r34 r34Var = r34VarArr[i];
            if (r34Var != null) {
                int iE = r34Var.e() % 30;
                int iC = r34Var.c();
                if (iC > f12Var.c()) {
                    r34VarArr[i] = null;
                } else {
                    if (!this.c) {
                        iC += 2;
                    }
                    int i2 = iC % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && iE + 1 != f12Var.a()) {
                                r34VarArr[i] = null;
                            }
                        } else if (iE / 3 != f12Var.b() || iE % 3 != f12Var.d()) {
                            r34VarArr[i] = null;
                        }
                    } else if ((iE * 3) + 1 != f12Var.e()) {
                        r34VarArr[i] = null;
                    }
                }
            }
        }
    }

    public final void m() {
        for (r34 r34Var : d()) {
            if (r34Var != null) {
                r34Var.j();
            }
        }
    }

    @Override // defpackage.zz5
    public String toString() {
        return "IsLeft: " + this.c + '\n' + super.toString();
    }
}
