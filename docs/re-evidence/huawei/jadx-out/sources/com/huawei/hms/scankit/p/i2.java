package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v6 f16131b;

    public i2(s sVar) {
        this.f16130a = sVar;
    }

    private static void a(f3 f3Var, f3 f3Var2, f3 f3Var3, float[] fArr) {
        float fB = f3Var.b() - f3Var2.b();
        float fC = f3Var.c() - f3Var2.c();
        float f = (fB * fB) + (fC * fC);
        float fB2 = f3Var.b() - f3Var3.b();
        float fC2 = f3Var.c() - f3Var3.c();
        float f2 = (fB2 * fB2) + (fC2 * fC2);
        float fB3 = f3Var2.b() - f3Var3.b();
        float fC3 = f3Var2.c() - f3Var3.c();
        float f3 = (fB3 * fB3) + (fC3 * fC3);
        if (f > f3 && f > f2) {
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f3;
        } else if (f3 > f && f3 > f2) {
            fArr[0] = f3;
            fArr[1] = f;
            fArr[2] = f2;
        } else {
            fArr[0] = f2;
            fArr[1] = f;
            fArr[2] = f3;
        }
    }

    private static float b(float f, float f2, float f3) {
        return Math.min(Math.min(f, f2), f3);
    }

    public static boolean a(f3 f3Var, f3 f3Var2, f3 f3Var3) {
        float[] fArr = new float[3];
        a(f3Var, f3Var2, f3Var3, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fSqrt = (float) Math.sqrt(f2);
        float fSqrt2 = (float) Math.sqrt(f3);
        float fSqrt3 = (float) Math.sqrt(f);
        if (fSqrt / fSqrt2 >= 1.8f || fSqrt2 / fSqrt >= 1.8f || b(fSqrt, fSqrt2, fSqrt3) <= a(f3Var.e(), f3Var2.e(), f3Var3.e()) * 6.0f) {
            return false;
        }
        float f4 = ((f2 + f3) - f) / ((fSqrt * 2.0f) * fSqrt2);
        float f5 = fSqrt3 * 2.0f;
        float f6 = ((f + f2) - f3) / (fSqrt * f5);
        float f7 = ((f + f3) - f2) / (f5 * fSqrt2);
        return Math.abs(f4) <= 0.342f && f6 >= 0.5736f && f6 <= 0.8191f && f7 >= 0.5736f && f7 <= 0.8191f;
    }

    public static boolean a(f3[] f3VarArr, f3[] f3VarArr2, int[] iArr) {
        f3 f3Var = f3VarArr[0];
        f3 f3Var2 = f3VarArr[1];
        f3 f3Var3 = f3VarArr[2];
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        float fB = f3Var3.b();
        float fB2 = f3Var2.b();
        float fB3 = f3Var.b();
        float fC = f3Var3.c();
        float fC2 = f3Var2.c();
        float fC3 = f3Var.c();
        float fE = ((f3Var.e() + f3Var2.e()) + f3Var3.e()) / 3.0f;
        for (int i4 = 0; i4 < f3VarArr2.length; i4++) {
            if (i4 != i && i4 != i2 && i4 != i3) {
                f3 f3Var4 = f3VarArr2[i4];
                float fB4 = ((fB - fB2) + fB3) - f3Var4.b();
                float fC4 = ((fC - fC2) + fC3) - f3Var4.c();
                if (((float) Math.sqrt((fB4 * fB4) + (fC4 * fC4))) < 10.0f * fE) {
                    return true;
                }
            }
        }
        return false;
    }

    public final f3[] a(Map map) {
        v6 v6Var = map == null ? null : (v6) map.get(m1.j);
        this.f16131b = v6Var;
        return new j3(this.f16130a, v6Var).a(map);
    }

    private static float a(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }
}
