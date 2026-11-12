package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16055a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16057c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final v6 i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16056b = new ArrayList(5);
    private final int[] h = new int[3];

    e(s sVar, int i, int i2, int i3, int i4, float f, v6 v6Var) {
        this.f16055a = sVar;
        this.f16057c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.i = v6Var;
    }

    private static float a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    private float a(int i, int i2, int i3, int i4) {
        int i5;
        s sVar = this.f16055a;
        int iB = sVar.b();
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i;
        while (i6 >= 0 && sVar.b(i2, i6)) {
            int i7 = iArr[1];
            if (i7 > i3) {
                break;
            }
            iArr[1] = i7 + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i3) {
            while (i6 >= 0 && !sVar.b(i2, i6)) {
                int i8 = iArr[0];
                if (i8 > i3) {
                    break;
                }
                iArr[0] = i8 + 1;
                i6--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < iB && sVar.b(i2, i9)) {
                int i10 = iArr[1];
                if (i10 > i3) {
                    break;
                }
                iArr[1] = i10 + 1;
                i9++;
            }
            if (i9 != iB && iArr[1] <= i3) {
                while (i9 < iB && !sVar.b(i2, i9)) {
                    int i11 = iArr[2];
                    if (i11 > i3) {
                        break;
                    }
                    iArr[2] = i11 + 1;
                    i9++;
                }
                int i12 = iArr[2];
                if (i12 <= i3 && (i5 = iArr[0] + iArr[1] + i12) < i4 * 3 && i5 * 3 > i4 && a(iArr)) {
                    return a(iArr, i9);
                }
            }
        }
        return Float.NaN;
    }

    d a() throws a {
        d dVarA;
        int i = this.f16057c;
        int i2 = this.f;
        int i3 = this.e + i;
        int i4 = this.d;
        int i5 = i2 / 2;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = ((i6 & 1) == 0 ? (i6 + 1) / 2 : -((i6 + 1) / 2)) + i4 + i5;
            int[] iArr = {0, 0, 0};
            int i8 = i;
            while (i8 < i3 && !this.f16055a.b(i8, i7)) {
                i8++;
            }
            d dVarA2 = a(i7, i8, i3, iArr);
            if (dVarA2 != null) {
                return dVarA2;
            }
            if (a(iArr) && (dVarA = a(iArr, i7, i3)) != null) {
                return dVarA;
            }
        }
        if (!this.f16056b.isEmpty()) {
            return (d) this.f16056b.get(0);
        }
        throw a.a();
    }

    private d a(int i, int i2, int i3, int[] iArr) {
        d dVarA;
        int i4 = 0;
        while (i2 < i3) {
            if (!this.f16055a.b(i2, i)) {
                if (i4 == 1) {
                    i4++;
                }
                iArr[i4] = iArr[i4] + 1;
            } else if (i4 == 1) {
                iArr[1] = iArr[1] + 1;
            } else if (i4 == 2) {
                if (a(iArr) && (dVarA = a(iArr, i, i2)) != null) {
                    return dVarA;
                }
                iArr[0] = iArr[2];
                iArr[1] = 1;
                iArr[2] = 0;
                i4 = 1;
            } else {
                i4++;
                iArr[i4] = iArr[i4] + 1;
            }
            i2++;
        }
        return null;
    }

    private boolean a(int[] iArr) {
        float f = this.g;
        float f2 = (3.0f * f) / 4.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    private d a(int[] iArr, int i, int i2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        float fA = a(iArr, i2);
        float fA2 = a(i, (int) fA, iArr[1] * 3, i3 + i4 + i5);
        if (Float.isNaN(fA2)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (d dVar : this.f16056b) {
            if (dVar.b(f, fA2, fA)) {
                return dVar.c(fA2, fA, f);
            }
        }
        d dVar2 = new d(fA, fA2, f);
        this.f16056b.add(dVar2);
        v6 v6Var = this.i;
        if (v6Var == null) {
            return null;
        }
        v6Var.a(dVar2);
        return null;
    }
}
