package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j8 f16067b;

    public e2(s sVar) {
        this.f16066a = sVar;
        this.f16067b = new j8(sVar);
    }

    private u6[] b(u6[] u6VarArr) {
        u6 u6Var = u6VarArr[0];
        u6 u6Var2 = u6VarArr[1];
        u6 u6Var3 = u6VarArr[3];
        u6 u6Var4 = u6VarArr[2];
        int iA = a(u6Var, u6Var2);
        int iA2 = a(u6Var2, u6Var3);
        int iA3 = a(u6Var3, u6Var4);
        int iA4 = a(u6Var4, u6Var);
        u6[] u6VarArr2 = {u6Var4, u6Var, u6Var2, u6Var3};
        if (iA > iA2) {
            u6VarArr2[0] = u6Var;
            u6VarArr2[1] = u6Var2;
            u6VarArr2[2] = u6Var3;
            u6VarArr2[3] = u6Var4;
            iA = iA2;
        }
        if (iA > iA3) {
            u6VarArr2[0] = u6Var2;
            u6VarArr2[1] = u6Var3;
            u6VarArr2[2] = u6Var4;
            u6VarArr2[3] = u6Var;
        } else {
            iA3 = iA;
        }
        if (iA3 > iA4) {
            u6VarArr2[0] = u6Var3;
            u6VarArr2[1] = u6Var4;
            u6VarArr2[2] = u6Var;
            u6VarArr2[3] = u6Var2;
        }
        return u6VarArr2;
    }

    private u6[] c(u6[] u6VarArr) {
        u6 u6Var = u6VarArr[0];
        u6 u6Var2 = u6VarArr[1];
        u6 u6Var3 = u6VarArr[2];
        u6 u6Var4 = u6VarArr[3];
        int iA = (a(u6Var, u6Var4) + 1) * 4;
        if (a(a(u6Var2, u6Var3, iA), u6Var) < a(a(u6Var3, u6Var2, iA), u6Var4)) {
            u6VarArr[0] = u6Var;
            u6VarArr[1] = u6Var2;
            u6VarArr[2] = u6Var3;
            u6VarArr[3] = u6Var4;
            return u6VarArr;
        }
        u6VarArr[0] = u6Var2;
        u6VarArr[1] = u6Var3;
        u6VarArr[2] = u6Var4;
        u6VarArr[3] = u6Var;
        return u6VarArr;
    }

    private u6 a(u6[] u6VarArr) {
        u6 u6Var = u6VarArr[0];
        u6 u6Var2 = u6VarArr[1];
        u6 u6Var3 = u6VarArr[2];
        u6 u6Var4 = u6VarArr[3];
        int iA = a(u6Var, u6Var4);
        u6 u6VarA = a(u6Var, u6Var2, (a(u6Var2, u6Var4) + 1) * 4);
        u6 u6VarA2 = a(u6Var3, u6Var2, (iA + 1) * 4);
        int iA2 = a(u6VarA, u6Var4);
        int iA3 = a(u6VarA2, u6Var4);
        float f = iA2 + 1;
        u6 u6Var5 = new u6(u6Var4.b() + ((u6Var3.b() - u6Var2.b()) / f), u6Var4.c() + ((u6Var3.c() - u6Var2.c()) / f));
        float f2 = iA3 + 1;
        u6 u6Var6 = new u6(u6Var4.b() + ((u6Var.b() - u6Var2.b()) / f2), u6Var4.c() + ((u6Var.c() - u6Var2.c()) / f2));
        if (!a(u6Var5)) {
            if (!a(u6Var6)) {
                return null;
            }
        } else if (!a(u6Var6) || a(u6VarA, u6Var5) + a(u6VarA2, u6Var5) > a(u6VarA, u6Var6) + a(u6VarA2, u6Var6)) {
            return u6Var5;
        }
        return u6Var6;
    }

    private u6[] d(u6[] u6VarArr) {
        u6 u6Var = u6VarArr[0];
        u6 u6Var2 = u6VarArr[1];
        u6 u6Var3 = u6VarArr[2];
        u6 u6Var4 = u6VarArr[3];
        int iA = a(u6Var, u6Var4);
        u6 u6VarA = a(u6Var, u6Var2, (a(u6Var3, u6Var4) + 1) * 4);
        u6 u6VarA2 = a(u6Var3, u6Var2, (iA + 1) * 4);
        int iA2 = a(u6VarA, u6Var4);
        int i = iA2 + 1;
        int iA3 = a(u6VarA2, u6Var4);
        int i2 = iA3 + 1;
        if ((i & 1) == 1) {
            i = iA2 + 2;
        }
        if ((i2 & 1) == 1) {
            i2 = iA3 + 2;
        }
        float fB = (((u6Var.b() + u6Var2.b()) + u6Var3.b()) + u6Var4.b()) / 4.0f;
        float fC = (((u6Var.c() + u6Var2.c()) + u6Var3.c()) + u6Var4.c()) / 4.0f;
        u6 u6VarA3 = a(u6Var, fB, fC);
        u6 u6VarA4 = a(u6Var2, fB, fC);
        u6 u6VarA5 = a(u6Var3, fB, fC);
        u6 u6VarA6 = a(u6Var4, fB, fC);
        int i3 = i2 * 4;
        int i4 = i * 4;
        return new u6[]{a(a(u6VarA3, u6VarA4, i3), u6VarA6, i4), a(a(u6VarA4, u6VarA3, i3), u6VarA5, i4), a(a(u6VarA5, u6VarA6, i3), u6VarA4, i4), a(a(u6VarA6, u6VarA5, i3), u6VarA3, i4)};
    }

    public k2 a() throws a {
        int iMax;
        int i;
        u6[] u6VarArrC = c(b(this.f16067b.a()));
        u6 u6VarA = a(u6VarArrC);
        u6VarArrC[3] = u6VarA;
        if (u6VarA != null) {
            u6[] u6VarArrD = d(u6VarArrC);
            u6 u6Var = u6VarArrD[0];
            u6 u6Var2 = u6VarArrD[1];
            u6 u6Var3 = u6VarArrD[2];
            u6 u6Var4 = u6VarArrD[3];
            int iA = a(u6Var, u6Var4);
            int i2 = iA + 1;
            int iA2 = a(u6Var3, u6Var4);
            int i3 = iA2 + 1;
            if ((i2 & 1) == 1) {
                i2 = iA + 2;
            }
            if ((i3 & 1) == 1) {
                i3 = iA2 + 2;
            }
            if (i2 * 4 >= i3 * 7 || i3 * 4 >= i2 * 7) {
                iMax = i2;
                i = i3;
            } else {
                iMax = Math.max(i2, i3);
                i = iMax;
            }
            return new k2(a(this.f16066a, u6Var, u6Var2, u6Var3, u6Var4, iMax, i), new u6[]{u6Var, u6Var2, u6Var3, u6Var4});
        }
        throw a.a();
    }

    private boolean a(u6 u6Var) {
        return u6Var.b() >= 0.0f && u6Var.b() < ((float) this.f16066a.d()) && u6Var.c() > 0.0f && u6Var.c() < ((float) this.f16066a.b());
    }

    private static u6 a(u6 u6Var, float f, float f2) {
        float fB = u6Var.b();
        float fC = u6Var.c();
        return new u6(fB < f ? fB - 1.0f : fB + 1.0f, fC < f2 ? fC - 1.0f : fC + 1.0f);
    }

    private static u6 a(u6 u6Var, u6 u6Var2, int i) {
        float f = i + 1;
        return new u6(u6Var.b() + ((u6Var2.b() - u6Var.b()) / f), u6Var.c() + ((u6Var2.c() - u6Var.c()) / f));
    }

    private int a(u6 u6Var, u6 u6Var2) {
        int i;
        int i2;
        e2 e2Var = this;
        int iB = (int) u6Var.b();
        int iC = (int) u6Var.c();
        int iB2 = (int) u6Var2.b();
        int iC2 = (int) u6Var2.c();
        boolean z = Math.abs(iC2 - iC) > Math.abs(iB2 - iB);
        if (z) {
            iC = iB;
            iB = iC;
            iC2 = iB2;
            iB2 = iC2;
        }
        int iAbs = Math.abs(iB2 - iB);
        int iAbs2 = Math.abs(iC2 - iC);
        int i3 = (-iAbs) / 2;
        int i4 = iC < iC2 ? 1 : -1;
        int i5 = iB < iB2 ? 1 : -1;
        boolean zB = e2Var.f16066a.b(z ? iC : iB, z ? iB : iC);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (iB != iB2) {
            int i9 = iB2;
            boolean zB2 = e2Var.f16066a.b(z ? iC : iB, z ? iB : iC);
            i8++;
            if (zB2 != zB) {
                i2 = iC2;
                i = iB;
                if (i8 > Math.ceil(((double) i6) / 1.5d)) {
                    i7++;
                    i6 -= (i6 - i8) / i7;
                    zB = zB2;
                    i8 = 0;
                }
            } else {
                i = iB;
                i2 = iC2;
            }
            i3 += iAbs2;
            int i10 = i2;
            if (i3 > 0) {
                if (iC == i10) {
                    return i7;
                }
                iC += i4;
                i3 -= iAbs;
            }
            iB = i + i5;
            e2Var = this;
            iC2 = i10;
            iB2 = i9;
        }
        return i7;
    }

    private static s a(s sVar, u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4, int i, int i2) {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return s3.a().a(sVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, u6Var.b(), u6Var.c(), u6Var4.b(), u6Var4.c(), u6Var3.b(), u6Var3.c(), u6Var2.b(), u6Var2.c());
    }
}
