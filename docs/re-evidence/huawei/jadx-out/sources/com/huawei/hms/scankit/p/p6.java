package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o3 f16266a;

    public p6(o3 o3Var) {
        this.f16266a = o3Var;
    }

    public void a(int[] iArr, int i) throws a {
        p3 p3Var = new p3(this.f16266a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            o3 o3Var = this.f16266a;
            int iA = p3Var.a(o3Var.a(o3Var.a() + i2));
            iArr2[(i - 1) - i2] = iA;
            if (iA != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        p3[] p3VarArrA = a(this.f16266a.b(i, 1), new p3(this.f16266a, iArr2), i);
        p3 p3Var2 = p3VarArrA[0];
        p3 p3Var3 = p3VarArrA[1];
        int[] iArrA = a(p3Var2);
        int[] iArrA2 = a(p3Var3, iArrA);
        for (int i3 = 0; i3 < iArrA.length; i3++) {
            int length = (iArr.length - 1) - this.f16266a.c(iArrA[i3]);
            if (length >= 0) {
                iArr[length] = o3.a(iArr[length], iArrA2[i3]);
            } else {
                throw a.a("Bad error location");
            }
        }
    }

    private int[] a(p3 p3Var) throws a {
        int iB = p3Var.b();
        if (iB == 1) {
            return new int[]{p3Var.b(1)};
        }
        int[] iArr = new int[iB];
        int i = 0;
        for (int i2 = 1; i2 < this.f16266a.c() && i < iB; i2++) {
            if (p3Var.a(i2) == 0) {
                iArr[i] = this.f16266a.b(i2);
                i++;
            }
        }
        if (i == iB) {
            return iArr;
        }
        throw a.a("Error locator degree does not match number of roots");
    }

    private int[] a(p3 p3Var, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int iB = this.f16266a.b(iArr[i]);
            int iC = 1;
            for (int i2 = 0; i2 < length; i2++) {
                if (i != i2) {
                    int iC2 = this.f16266a.c(iArr[i2], iB);
                    iC = this.f16266a.c(iC, (iC2 & 1) == 0 ? iC2 | 1 : iC2 & (-2));
                }
            }
            iArr2[i] = this.f16266a.c(p3Var.a(iB), this.f16266a.b(iC));
            if (this.f16266a.a() != 0) {
                iArr2[i] = this.f16266a.c(iArr2[i], iB);
            }
        }
        return iArr2;
    }

    private p3[] a(p3 p3Var, p3 p3Var2, int i) throws a {
        if (p3Var.b() >= p3Var2.b()) {
            p3Var2 = p3Var;
            p3Var = p3Var2;
        }
        p3 p3VarD = this.f16266a.d();
        p3 p3VarB = this.f16266a.b();
        while (p3Var.b() >= i / 2) {
            if (!p3Var.c()) {
                p3 p3VarD2 = this.f16266a.d();
                int iB = this.f16266a.b(p3Var.b(p3Var.b()));
                while (p3Var2.b() >= p3Var.b() && !p3Var2.c()) {
                    int iB2 = p3Var2.b() - p3Var.b();
                    int iC = this.f16266a.c(p3Var2.b(p3Var2.b()), iB);
                    p3VarD2 = p3VarD2.a(this.f16266a.b(iB2, iC));
                    p3Var2 = p3Var2.a(p3Var.a(iB2, iC));
                }
                p3 p3VarA = p3VarD2.c(p3VarB).a(p3VarD);
                if (p3Var2.b() >= p3Var.b()) {
                    throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                }
                p3 p3Var3 = p3Var2;
                p3Var2 = p3Var;
                p3Var = p3Var3;
                p3 p3Var4 = p3VarB;
                p3VarB = p3VarA;
                p3VarD = p3Var4;
            } else {
                throw a.a("r_{i-1} was zero");
            }
        }
        int iB3 = p3VarB.b(0);
        if (iB3 != 0) {
            int iB4 = this.f16266a.b(iB3);
            return new p3[]{p3VarB.c(iB4), p3Var.c(iB4)};
        }
        throw a.a("sigmaTilde(0) was zero");
    }
}
