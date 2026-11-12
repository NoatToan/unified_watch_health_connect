package defpackage;

import java.util.Formatter;

/* JADX INFO: loaded from: classes5.dex */
public final class yz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12 f40709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zz5[] f40710b;
    public i53 c;
    public final int d;

    public yz5(f12 f12Var, i53 i53Var) {
        this.f40709a = f12Var;
        int iA = f12Var.a();
        this.d = iA;
        this.c = i53Var;
        this.f40710b = new zz5[iA + 2];
    }

    public static boolean b(r34 r34Var, r34 r34Var2) {
        if (r34Var2 == null || !r34Var2.g() || r34Var2.a() != r34Var.a()) {
            return false;
        }
        r34Var.i(r34Var2.c());
        return true;
    }

    public static int c(int i, int i2, r34 r34Var) {
        if (r34Var == null || r34Var.g()) {
            return i2;
        }
        if (!r34Var.h(i)) {
            return i2 + 1;
        }
        r34Var.i(i);
        return 0;
    }

    public final void a(zz5 zz5Var) {
        if (zz5Var != null) {
            ((a06) zz5Var).g(this.f40709a);
        }
    }

    public final int d() {
        int iF = f();
        if (iF == 0) {
            return 0;
        }
        for (int i = 1; i < this.d + 1; i++) {
            r34[] r34VarArrD = this.f40710b[i].d();
            for (int i2 = 0; i2 < r34VarArrD.length; i2++) {
                r34 r34Var = r34VarArrD[i2];
                if (r34Var != null && !r34Var.g()) {
                    e(i, i2, r34VarArrD);
                }
            }
        }
        return iF;
    }

    public final void e(int i, int i2, r34[] r34VarArr) {
        r34 r34Var = r34VarArr[i2];
        r34[] r34VarArrD = this.f40710b[i - 1].d();
        zz5 zz5Var = this.f40710b[i + 1];
        r34[] r34VarArrD2 = zz5Var != null ? zz5Var.d() : r34VarArrD;
        r34[] r34VarArr2 = new r34[14];
        r34VarArr2[2] = r34VarArrD[i2];
        r34VarArr2[3] = r34VarArrD2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            r34VarArr2[0] = r34VarArr[i3];
            r34VarArr2[4] = r34VarArrD[i3];
            r34VarArr2[5] = r34VarArrD2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            r34VarArr2[8] = r34VarArr[i4];
            r34VarArr2[10] = r34VarArrD[i4];
            r34VarArr2[11] = r34VarArrD2[i4];
        }
        if (i2 < r34VarArr.length - 1) {
            int i5 = i2 + 1;
            r34VarArr2[1] = r34VarArr[i5];
            r34VarArr2[6] = r34VarArrD[i5];
            r34VarArr2[7] = r34VarArrD2[i5];
        }
        if (i2 < r34VarArr.length - 2) {
            int i6 = i2 + 2;
            r34VarArr2[9] = r34VarArr[i6];
            r34VarArr2[12] = r34VarArrD[i6];
            r34VarArr2[13] = r34VarArrD2[i6];
        }
        for (int i7 = 0; i7 < 14 && !b(r34Var, r34VarArr2[i7]); i7++) {
        }
    }

    public final int f() {
        g();
        return h() + i();
    }

    public final void g() {
        zz5[] zz5VarArr = this.f40710b;
        zz5 zz5Var = zz5VarArr[0];
        if (zz5Var == null || zz5VarArr[this.d + 1] == null) {
            return;
        }
        r34[] r34VarArrD = zz5Var.d();
        r34[] r34VarArrD2 = this.f40710b[this.d + 1].d();
        for (int i = 0; i < r34VarArrD.length; i++) {
            r34 r34Var = r34VarArrD[i];
            if (r34Var != null && r34VarArrD2[i] != null && r34Var.c() == r34VarArrD2[i].c()) {
                for (int i2 = 1; i2 <= this.d; i2++) {
                    r34 r34Var2 = this.f40710b[i2].d()[i];
                    if (r34Var2 != null) {
                        r34Var2.i(r34VarArrD[i].c());
                        if (!r34Var2.g()) {
                            this.f40710b[i2].d()[i] = null;
                        }
                    }
                }
            }
        }
    }

    public final int h() {
        zz5 zz5Var = this.f40710b[0];
        if (zz5Var == null) {
            return 0;
        }
        r34[] r34VarArrD = zz5Var.d();
        int i = 0;
        for (int i2 = 0; i2 < r34VarArrD.length; i2++) {
            r34 r34Var = r34VarArrD[i2];
            if (r34Var != null) {
                int iC = r34Var.c();
                int iC2 = 0;
                for (int i3 = 1; i3 < this.d + 1 && iC2 < 2; i3++) {
                    r34 r34Var2 = this.f40710b[i3].d()[i2];
                    if (r34Var2 != null) {
                        iC2 = c(iC, iC2, r34Var2);
                        if (!r34Var2.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    public final int i() {
        zz5[] zz5VarArr = this.f40710b;
        int i = this.d;
        if (zz5VarArr[i + 1] == null) {
            return 0;
        }
        r34[] r34VarArrD = zz5VarArr[i + 1].d();
        int i2 = 0;
        for (int i3 = 0; i3 < r34VarArrD.length; i3++) {
            r34 r34Var = r34VarArrD[i3];
            if (r34Var != null) {
                int iC = r34Var.c();
                int iC2 = 0;
                for (int i4 = this.d + 1; i4 > 0 && iC2 < 2; i4--) {
                    r34 r34Var2 = this.f40710b[i4].d()[i3];
                    if (r34Var2 != null) {
                        iC2 = c(iC, iC2, r34Var2);
                        if (!r34Var2.g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.f40709a.b();
    }

    public int l() {
        return this.f40709a.c();
    }

    public i53 m() {
        return this.c;
    }

    public zz5 n(int i) {
        return this.f40710b[i];
    }

    public zz5[] o() {
        a(this.f40710b[0]);
        a(this.f40710b[this.d + 1]);
        int i = 928;
        while (true) {
            int iD = d();
            if (iD <= 0 || iD >= i) {
                break;
            }
            i = iD;
        }
        return this.f40710b;
    }

    public void p(i53 i53Var) {
        this.c = i53Var;
    }

    public void q(int i, zz5 zz5Var) {
        this.f40710b[i] = zz5Var;
    }

    public String toString() {
        zz5[] zz5VarArr = this.f40710b;
        zz5 zz5Var = zz5VarArr[0];
        if (zz5Var == null) {
            zz5Var = zz5VarArr[this.d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < zz5Var.d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.d + 2; i2++) {
                    zz5 zz5Var2 = this.f40710b[i2];
                    if (zz5Var2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        r34 r34Var = zz5Var2.d()[i];
                        if (r34Var == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(r34Var.c()), Integer.valueOf(r34Var.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
