package com.huawei.hms.scankit.p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes34.dex */
public abstract class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f16165a = 2.51f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f16166b = 0.03f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f16167c = 2.43f;
    private static float d = 0.59f;
    private static float e = 0.14f;
    private static HashMap f = new HashMap(255);

    private static int a(p4 p4Var) {
        byte[] bArrB = p4Var.b();
        if (bArrB == null) {
            return 1;
        }
        int iC = p4Var.c();
        int iA = p4Var.a();
        long j = 0;
        for (int i = iA / 4; i < (iA * 3) / 4; i++) {
            for (int i2 = iC / 4; i2 < (iC * 3) / 4; i2++) {
                j += (long) (bArrB[(i * iC) + i2] & 255);
            }
        }
        return (int) ((j / ((long) bArrB.length)) * 4);
    }

    private static int a(int i, float f2) {
        if (!f.containsKey(Integer.valueOf(i))) {
            float f3 = i / f2;
            int i2 = (int) ((f2 * (((f16165a * f3) + f16166b) * f3)) / ((f3 * ((f16167c * f3) + d)) + e));
            f.put(Integer.valueOf(i), Integer.valueOf(i2));
            return i2;
        }
        return ((Integer) f.get(Integer.valueOf(i))).intValue();
    }

    public static p4 b(p4 p4Var) {
        int iA = a(p4Var);
        int iC = p4Var.c();
        int iA2 = p4Var.a();
        byte[] bArrB = p4Var.b();
        byte[] bArr = new byte[iA2 * iC];
        for (int i = 0; i < iA2; i++) {
            for (int i2 = 0; i2 < iC; i2++) {
                int i3 = (i * iC) + i2;
                bArr[i3] = (byte) (a(bArrB[i3] & 255, iA) & 255);
            }
        }
        f = new HashMap(255);
        return new e6(bArr, iC, iA2, 0, 0, iC, iA2, false);
    }
}
