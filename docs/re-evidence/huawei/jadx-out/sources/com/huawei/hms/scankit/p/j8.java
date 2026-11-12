package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public final class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16170c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public j8(s sVar) {
        this(sVar, 10, sVar.d() / 2, sVar.b() / 2);
    }

    public j8(s sVar, int i, int i2, int i3) throws a {
        this.f16168a = sVar;
        int iB = sVar.b();
        this.f16169b = iB;
        int iD = sVar.d();
        this.f16170c = iD;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.d = i5;
        int i6 = i2 + i4;
        this.e = i6;
        int i7 = i3 - i4;
        this.g = i7;
        int i8 = i3 + i4;
        this.f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= iB || i6 >= iD) {
            throw a.a();
        }
    }

    private u6[] b(int[] iArr) throws a {
        int i = iArr[1] - iArr[0];
        u6 u6VarA = null;
        u6 u6VarA2 = null;
        for (int i2 = 1; u6VarA2 == null && i2 < i; i2++) {
            int i3 = iArr[0];
            int i4 = iArr[3];
            u6VarA2 = a(i3, i4 - i2, i3 + i2, i4);
        }
        if (u6VarA2 == null) {
            throw a.a();
        }
        u6 u6VarA3 = null;
        for (int i5 = 1; u6VarA3 == null && i5 < i; i5++) {
            int i6 = iArr[0];
            int i7 = iArr[2];
            u6VarA3 = a(i6, i7 + i5, i6 + i5, i7);
        }
        if (u6VarA3 == null) {
            throw a.a();
        }
        u6 u6VarA4 = null;
        for (int i8 = 1; u6VarA4 == null && i8 < i; i8++) {
            int i9 = iArr[1];
            int i10 = iArr[2];
            u6VarA4 = a(i9, i10 + i8, i9 - i8, i10);
        }
        if (u6VarA4 == null) {
            throw a.a();
        }
        for (int i11 = 1; u6VarA == null && i11 < i; i11++) {
            int i12 = iArr[1];
            int i13 = iArr[3];
            u6VarA = a(i12, i13 - i11, i12 - i11, i13);
        }
        if (u6VarA != null) {
            return a(u6VarA, u6VarA2, u6VarA4, u6VarA3);
        }
        throw a.a();
    }

    private void e(int[] iArr) {
        while (true) {
            int i = iArr[2];
            if (i < 0) {
                return;
            }
            boolean zA = a(iArr[0], iArr[1], i, true);
            if (zA) {
                iArr[2] = iArr[2] - 1;
                iArr[5] = 1;
                iArr[10] = 1;
            } else if (iArr[10] != 1) {
                iArr[2] = iArr[2] - 1;
            }
            if (!zA && iArr[10] == 1) {
                return;
            }
        }
    }

    private void c(int[] iArr) {
        while (true) {
            int i = iArr[0];
            if (i < 0) {
                return;
            }
            boolean zA = a(iArr[2], iArr[3], i, false);
            if (zA) {
                iArr[0] = iArr[0] - 1;
                iArr[5] = 1;
                iArr[9] = 1;
            } else if (iArr[9] != 1) {
                iArr[0] = iArr[0] - 1;
            }
            if (!zA && iArr[9] == 1) {
                return;
            }
        }
    }

    private void d(int[] iArr) {
        while (true) {
            int i = iArr[1];
            if (i >= this.f16170c) {
                return;
            }
            boolean zA = a(iArr[2], iArr[3], i, false);
            if (zA) {
                iArr[1] = iArr[1] + 1;
                iArr[5] = 1;
                iArr[7] = 1;
            } else if (iArr[7] != 1) {
                iArr[1] = iArr[1] + 1;
            }
            if (!zA && iArr[7] == 1) {
                return;
            }
        }
    }

    private u6[] a(u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4) {
        float fB = u6Var.b();
        float fC = u6Var.c();
        float fB2 = u6Var2.b();
        float fC2 = u6Var2.c();
        float fB3 = u6Var3.b();
        float fC3 = u6Var3.c();
        float fB4 = u6Var4.b();
        float fC4 = u6Var4.c();
        if (fB < this.f16170c / 2.0f) {
            return new u6[]{new u6(fB4 - 1.0f, fC4 + 1.0f), new u6(fB2 + 1.0f, fC2 + 1.0f), new u6(fB3 - 1.0f, fC3 - 1.0f), new u6(fB + 1.0f, fC - 1.0f)};
        }
        return new u6[]{new u6(fB4 + 1.0f, fC4 + 1.0f), new u6(fB2 + 1.0f, fC2 - 1.0f), new u6(fB3 - 1.0f, fC3 + 1.0f), new u6(fB - 1.0f, fC - 1.0f)};
    }

    private boolean a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f16168a.b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f16168a.b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public u6[] a() throws a {
        int[] iArr = {this.d, this.e, this.g, this.f, 0, 1, 0, 0, 0, 0, 0};
        while (iArr[5] == 1) {
            iArr[5] = 0;
            d(iArr);
            if (iArr[1] >= this.f16170c) {
                iArr[4] = 1;
                break;
            }
            a(iArr);
            if (iArr[3] >= this.f16169b) {
                iArr[4] = 1;
                break;
            }
            c(iArr);
            if (iArr[0] < 0) {
                iArr[4] = 1;
                break;
            }
            e(iArr);
            if (iArr[2] < 0) {
                iArr[4] = 1;
                break;
            }
            if (iArr[5] == 1) {
                iArr[6] = 1;
            }
        }
        if (iArr[4] != 1 && iArr[6] == 1) {
            return b(iArr);
        }
        throw a.a();
    }

    private u6 a(float f, float f2, float f3, float f4) {
        int iA = s4.a(s4.a(f, f2, f3, f4));
        float f5 = iA;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < iA; i++) {
            float f8 = i;
            int iA2 = s4.a((f8 * f6) + f);
            int iA3 = s4.a((f8 * f7) + f2);
            if (this.f16168a.b(iA2, iA3)) {
                return new u6(iA2, iA3);
            }
        }
        return null;
    }

    private void a(int[] iArr) {
        while (true) {
            int i = iArr[3];
            if (i >= this.f16169b) {
                return;
            }
            boolean zA = a(iArr[0], iArr[1], i, true);
            if (zA) {
                iArr[3] = iArr[3] + 1;
                iArr[5] = 1;
                iArr[8] = 1;
            } else if (iArr[8] != 1) {
                iArr[3] = iArr[3] + 1;
            }
            if (!zA && iArr[8] == 1) {
                return;
            }
        }
    }
}
