package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f16098a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f16099b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f16100c = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] d = {7, 1, 1, 3, 1, 1, 1, 2, 1};
    private static boolean e = false;

    private static void a(u6[] u6VarArr, u6[] u6VarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            u6VarArr[iArr[i]] = u6VarArr2[i];
        }
    }

    public static o5 a(p pVar, Map map, boolean z) {
        s sVarB = pVar.b();
        a(false);
        List listA = a(z, sVarB);
        if (listA.isEmpty()) {
            sVarB = sVarB.m1397clone();
            sVarB.e();
            listA = a(z, sVarB);
            a(true);
        }
        return new o5(sVarB, listA);
    }

    private static int[] a(s sVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        for (int i4 = 0; sVar.b(i, i2) && i > 0 && i4 < 3; i4++) {
            i--;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i5 = 0;
        int i6 = i;
        while (i < i3) {
            if (sVar.b(i, i2) != z2) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                if (i5 != length - 1) {
                    i5++;
                } else {
                    if (a(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i6, i};
                    }
                    i6 += iArr2[0] + iArr2[1];
                    int i7 = i5 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i7);
                    iArr2[i7] = 0;
                    iArr2[i5] = 0;
                    i5--;
                }
                iArr2[i5] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i5 != length - 1 || a(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i6, i - 1};
    }

    private static u6[] a(s sVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        u6[] u6VarArr = new u6[4];
        int[] iArr2 = new int[iArr.length];
        int i6 = i3;
        while (true) {
            if (i6 >= i) {
                z = false;
                break;
            }
            int[] iArrA = a(sVar, i4, i6, i2, false, iArr, iArr2);
            if (iArrA != null) {
                int i7 = i6;
                int[] iArr3 = iArrA;
                while (i7 > 0) {
                    int i8 = i7 - 1;
                    int[] iArrA2 = a(sVar, i4, i8, i2, false, iArr, iArr2);
                    if (iArrA2 == null) {
                        break;
                    }
                    iArr3 = iArrA2;
                    i7 = i8;
                }
                float f = i7;
                u6VarArr[0] = new u6(iArr3[0], f);
                u6VarArr[1] = new u6(iArr3[1], f);
                z = true;
                i6 = i7;
                break;
            }
            i6 += 5;
        }
        int i9 = i6 + 1;
        if (z) {
            int[] iArr4 = {(int) u6VarArr[0].b(), (int) u6VarArr[1].b()};
            int i10 = i9;
            int i11 = 0;
            while (true) {
                if (i10 >= i) {
                    i5 = i11;
                    break;
                }
                int i12 = i11;
                int[] iArrA3 = a(sVar, iArr4[0], i10, i2, false, iArr, iArr2);
                if (iArrA3 == null || Math.abs(iArr4[0] - iArrA3[0]) >= 5 || Math.abs(iArr4[1] - iArrA3[1]) >= 5) {
                    i5 = i12;
                    if (i5 > 25) {
                        break;
                    }
                    i11 = i5 + 1;
                } else {
                    iArr4 = iArrA3;
                    i11 = 0;
                }
                i10++;
            }
            i9 = i10 - (i5 + 1);
            float f2 = i9;
            u6VarArr[2] = new u6(iArr4[0], f2);
            u6VarArr[3] = new u6(iArr4[1], f2);
        }
        if (i9 - i6 < 10) {
            Arrays.fill(u6VarArr, (Object) null);
        }
        return u6VarArr;
    }

    private static u6[] a(s sVar, int i, int i2) {
        int iB = sVar.b();
        int iD = sVar.d();
        u6[] u6VarArr = new u6[8];
        a(u6VarArr, a(sVar, iB, iD, i, i2, f16100c), f16098a);
        u6 u6Var = u6VarArr[4];
        if (u6Var != null) {
            i2 = (int) u6Var.b();
            i = (int) u6VarArr[4].c();
        }
        a(u6VarArr, a(sVar, iB, iD, i, i2, d), f16099b);
        return u6VarArr;
    }

    private static float a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f5 = iArr2[i4] * f3;
            float f6 = i5;
            float f7 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f7 > f * f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f7;
        }
        return f4 / f2;
    }

    public static void a(boolean z) {
        e = z;
    }

    private static List a(boolean z, s sVar) {
        int iB;
        float fC;
        ArrayList<u6[]> arrayList = new ArrayList();
        int iMax = 0;
        loop0: while (true) {
            int i = 0;
            boolean z2 = false;
            while (iMax < sVar.b()) {
                u6[] u6VarArrA = a(sVar, iMax, i);
                if (u6VarArrA[0] == null && u6VarArrA[3] == null) {
                    if (!z2) {
                        break;
                    }
                    for (u6[] u6VarArr : arrayList) {
                        u6 u6Var = u6VarArr[1];
                        if (u6Var != null) {
                            iMax = (int) Math.max(iMax, u6Var.c());
                        }
                        u6 u6Var2 = u6VarArr[3];
                        if (u6Var2 != null) {
                            iMax = Math.max(iMax, (int) u6Var2.c());
                        }
                    }
                    iMax += 5;
                } else {
                    arrayList.add(u6VarArrA);
                    if (!z) {
                        break loop0;
                    }
                    u6 u6Var3 = u6VarArrA[2];
                    if (u6Var3 != null) {
                        iB = (int) u6Var3.b();
                        fC = u6VarArrA[2].c();
                    } else {
                        iB = (int) u6VarArrA[4].b();
                        fC = u6VarArrA[4].c();
                    }
                    i = iB;
                    iMax = (int) fC;
                    z2 = true;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    public static boolean a() {
        return e;
    }
}
