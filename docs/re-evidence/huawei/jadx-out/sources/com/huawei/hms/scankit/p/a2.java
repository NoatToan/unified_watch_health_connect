package com.huawei.hms.scankit.p;

import java.util.Formatter;

/* JADX INFO: loaded from: classes34.dex */
final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f15964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b2[] f15965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a0 f15966c;
    private final int d;

    a2(k kVar, a0 a0Var) {
        this.f15964a = kVar;
        int iA = kVar.a();
        this.d = iA;
        this.f15966c = a0Var;
        this.f15965b = new b2[iA + 2];
    }

    b2[] j() throws a {
        a(this.f15965b[0]);
        a(this.f15965b[this.d + 1]);
        int i = 928;
        while (true) {
            int iA = a();
            if (iA <= 0 || iA >= i) {
                break;
            }
            i = iA;
        }
        return this.f15965b;
    }

    private void a(b2 b2Var) throws a {
        if (b2Var != null) {
            try {
                ((c2) b2Var).a(this.f15964a);
            } catch (ClassCastException unused) {
                throw a.a();
            }
        }
    }

    private int b() {
        c();
        return d() + e();
    }

    private void c() {
        b2[] b2VarArr = this.f15965b;
        b2 b2Var = b2VarArr[0];
        if (b2Var == null || b2VarArr[this.d + 1] == null) {
            return;
        }
        x0[] x0VarArrB = b2Var.b();
        x0[] x0VarArrB2 = this.f15965b[this.d + 1].b();
        for (int i = 0; i < x0VarArrB.length; i++) {
            x0 x0Var = x0VarArrB[i];
            if (x0Var != null && x0VarArrB2[i] != null && x0Var.c() == x0VarArrB2[i].c()) {
                for (int i2 = 1; i2 <= this.d; i2++) {
                    x0 x0Var2 = this.f15965b[i2].b()[i];
                    if (x0Var2 != null) {
                        x0Var2.b(x0VarArrB[i].c());
                        if (!x0Var2.g()) {
                            this.f15965b[i2].b()[i] = null;
                        }
                    }
                }
            }
        }
    }

    private int e() {
        b2 b2Var = this.f15965b[this.d + 1];
        if (b2Var == null) {
            return 0;
        }
        x0[] x0VarArrB = b2Var.b();
        int i = 0;
        for (int i2 = 0; i2 < x0VarArrB.length; i2++) {
            x0 x0Var = x0VarArrB[i2];
            if (x0Var != null) {
                int iC = x0Var.c();
                int iA = 0;
                for (int i3 = this.d + 1; i3 > 0 && iA < 2; i3--) {
                    x0 x0Var2 = this.f15965b[i3].b()[i2];
                    if (x0Var2 != null) {
                        iA = a(iC, iA, x0Var2);
                        if (!x0Var2.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    private int d() {
        b2 b2Var = this.f15965b[0];
        if (b2Var == null) {
            return 0;
        }
        x0[] x0VarArrB = b2Var.b();
        int i = 0;
        for (int i2 = 0; i2 < x0VarArrB.length; i2++) {
            x0 x0Var = x0VarArrB[i2];
            if (x0Var != null) {
                int iC = x0Var.c();
                int iA = 0;
                for (int i3 = 1; i3 < this.d + 1 && iA < 2; i3++) {
                    x0 x0Var2 = this.f15965b[i3].b()[i2];
                    if (x0Var2 != null) {
                        iA = a(iC, iA, x0Var2);
                        if (!x0Var2.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    int f() {
        return this.d;
    }

    int h() {
        return this.f15964a.c();
    }

    int g() {
        return this.f15964a.b();
    }

    a0 i() {
        return this.f15966c;
    }

    public String toString() {
        b2[] b2VarArr = this.f15965b;
        b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            b2Var = b2VarArr[this.d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < b2Var.b().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.d + 2; i2++) {
                    b2 b2Var2 = this.f15965b[i2];
                    if (b2Var2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        x0 x0Var = b2Var2.b()[i];
                        if (x0Var == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(x0Var.c()), Integer.valueOf(x0Var.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    formatter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    private static boolean a(x0 x0Var, x0 x0Var2) {
        if (x0Var2 == null || !x0Var2.g() || x0Var2.a() != x0Var.a()) {
            return false;
        }
        x0Var.b(x0Var2.c());
        return true;
    }

    private static int a(int i, int i2, x0 x0Var) {
        if (x0Var == null || x0Var.g()) {
            return i2;
        }
        if (!x0Var.a(i)) {
            return i2 + 1;
        }
        x0Var.b(i);
        return 0;
    }

    private int a() {
        int iB = b();
        if (iB == 0) {
            return 0;
        }
        for (int i = 1; i < this.d + 1; i++) {
            x0[] x0VarArrB = this.f15965b[i].b();
            for (int i2 = 0; i2 < x0VarArrB.length; i2++) {
                x0 x0Var = x0VarArrB[i2];
                if (x0Var != null && !x0Var.g()) {
                    a(i, i2, x0VarArrB);
                }
            }
        }
        return iB;
    }

    private void a(int i, int i2, x0[] x0VarArr) {
        x0 x0Var = x0VarArr[i2];
        x0[] x0VarArrB = this.f15965b[i - 1].b();
        b2 b2Var = this.f15965b[i + 1];
        x0[] x0VarArrB2 = b2Var != null ? b2Var.b() : x0VarArrB;
        x0[] x0VarArr2 = new x0[14];
        x0VarArr2[2] = x0VarArrB[i2];
        x0VarArr2[3] = x0VarArrB2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            x0VarArr2[0] = x0VarArr[i3];
            x0VarArr2[4] = x0VarArrB[i3];
            x0VarArr2[5] = x0VarArrB2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            x0VarArr2[8] = x0VarArr[i4];
            x0VarArr2[10] = x0VarArrB[i4];
            x0VarArr2[11] = x0VarArrB2[i4];
        }
        if (i2 < x0VarArr.length - 1) {
            int i5 = i2 + 1;
            x0VarArr2[1] = x0VarArr[i5];
            x0VarArr2[6] = x0VarArrB[i5];
            x0VarArr2[7] = x0VarArrB2[i5];
        }
        if (i2 < x0VarArr.length - 2) {
            int i6 = i2 + 2;
            x0VarArr2[9] = x0VarArr[i6];
            x0VarArr2[12] = x0VarArrB[i6];
            x0VarArr2[13] = x0VarArrB2[i6];
        }
        for (int i7 = 0; i7 < 14 && !a(x0Var, x0VarArr2[i7]); i7++) {
        }
    }

    b2 a(int i) {
        return this.f15965b[i];
    }

    void a(a0 a0Var) {
        this.f15966c = a0Var;
    }

    void a(int i, b2 b2Var) {
        this.f15965b[i] = b2Var;
    }
}
