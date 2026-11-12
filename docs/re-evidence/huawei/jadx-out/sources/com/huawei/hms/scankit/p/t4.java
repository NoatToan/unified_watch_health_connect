package com.huawei.hms.scankit.p;

import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.up.model.UserInfomation;

/* JADX INFO: loaded from: classes10.dex */
abstract class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f16337a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f16338b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f16339c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, AgrConstant.HEALTH_AGREEMENT_CODE, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, AgrConstant.HEALTH_AGREEMENT_CODE, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, UserInfomation.WEIGHT_DEFAULT_ENGLISH, 158}, new int[]{6, 32, 58, 84, 110, TsExtractor.TS_STREAM_TYPE_DTS_HD, MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY}, new int[]{6, 26, 54, 82, 110, 138, MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static boolean b(int i) {
        return i == -1;
    }

    static void a(r rVar, b3 b3Var, b8 b8Var, int i, c0 c0Var) throws WriterException {
        a(c0Var);
        a(b8Var, c0Var);
        a(b3Var, i, c0Var);
        c(b8Var, c0Var);
        a(rVar, i, c0Var);
    }

    private static void d(c0 c0Var) {
        int i = 8;
        while (i < c0Var.c() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (b(c0Var.a(i, 6))) {
                c0Var.a(i, 6, i3);
            }
            if (b(c0Var.a(6, i))) {
                c0Var.a(6, i, i3);
            }
            i = i2;
        }
    }

    private static void b(c0 c0Var) throws WriterException {
        if (c0Var.a(8, c0Var.b() - 8) != 0) {
            c0Var.a(8, c0Var.b() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    private static void c(int i, int i2, c0 c0Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f16337a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                c0Var.a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    static int a(int i, int i2) {
        if (i2 != 0) {
            int iA = a(i2);
            int iA2 = i << (iA - 1);
            while (a(iA2) >= iA) {
                iA2 ^= i2 << (a(iA2) - iA);
            }
            return iA2;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    static void a(c0 c0Var) {
        c0Var.a((byte) -1);
    }

    static void a(b8 b8Var, c0 c0Var) throws WriterException {
        c(c0Var);
        b(c0Var);
        b(b8Var, c0Var);
        d(c0Var);
    }

    private static void d(int i, int i2, c0 c0Var) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (b(c0Var.a(i, i4))) {
                c0Var.a(i, i4, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    private static void b(int i, int i2, c0 c0Var) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f16338b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                c0Var.a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void c(c0 c0Var) throws WriterException {
        int length = f16337a[0].length;
        c(0, 0, c0Var);
        c(c0Var.c() - length, 0, c0Var);
        c(0, c0Var.c() - length, c0Var);
        a(0, 7, c0Var);
        a(c0Var.c() - 8, 7, c0Var);
        a(0, c0Var.c() - 8, c0Var);
        d(7, 0, c0Var);
        d(c0Var.b() - 8, 0, c0Var);
        d(7, c0Var.b() - 7, c0Var);
    }

    static void a(r rVar, int i, c0 c0Var) throws WriterException {
        boolean zB;
        int iC = c0Var.c() - 1;
        int iB = c0Var.b() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iC > 0) {
            if (iC == 6) {
                iC--;
            }
            while (iB >= 0 && iB < c0Var.b()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iC - i4;
                    if (b(c0Var.a(i5, iB))) {
                        if (i2 < rVar.d()) {
                            zB = rVar.b(i2);
                            i2++;
                        } else {
                            zB = false;
                        }
                        if (i != -1 && r4.a(i, i5, iB)) {
                            zB = !zB;
                        }
                        c0Var.a(i5, iB, zB);
                    }
                }
                iB += i3;
            }
            i3 = -i3;
            iB += i3;
            iC -= 2;
        }
        if (i2 == rVar.d()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i2 + '/' + rVar.d());
    }

    static void c(b8 b8Var, c0 c0Var) throws WriterException {
        if (b8Var.f() < 7) {
            return;
        }
        r rVar = new r();
        a(b8Var, rVar);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean zB = rVar.b(i);
                i--;
                c0Var.a(i2, (c0Var.b() - 11) + i3, zB);
                c0Var.a((c0Var.b() - 11) + i3, i2, zB);
            }
        }
    }

    private static void b(b8 b8Var, c0 c0Var) {
        if (b8Var.f() < 2) {
            return;
        }
        int iF = b8Var.f() - 1;
        int[][] iArr = f16339c;
        if (iF < iArr.length) {
            int[] iArr2 = iArr[iF];
            for (int i : iArr2) {
                if (i >= 0) {
                    for (int i2 : iArr2) {
                        if (i2 >= 0 && b(c0Var.a(i2, i))) {
                            b(i2 - 2, i - 2, c0Var);
                        }
                    }
                }
            }
        }
    }

    private static void a(int i, int i2, c0 c0Var) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (b(c0Var.a(i4, i2))) {
                c0Var.a(i4, i2, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    static void a(b3 b3Var, int i, c0 c0Var) throws WriterException {
        r rVar = new r();
        a(b3Var, i, rVar);
        for (int i2 = 0; i2 < rVar.d(); i2++) {
            boolean zB = rVar.b((rVar.d() - 1) - i2);
            int[] iArr = d[i2];
            c0Var.a(iArr[0], iArr[1], zB);
            if (i2 < 8) {
                c0Var.a((c0Var.c() - i2) - 1, 8, zB);
            } else {
                c0Var.a(8, (c0Var.b() - 7) + (i2 - 8), zB);
            }
        }
    }

    static int a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    static void a(b3 b3Var, int i, r rVar) throws WriterException {
        if (h6.a(i)) {
            int iB = (b3Var.b() << 3) | i;
            rVar.a(iB, 5);
            rVar.a(a(iB, 1335), 10);
            r rVar2 = new r();
            rVar2.a(21522, 15);
            rVar.b(rVar2);
            if (rVar.d() == 15) {
                return;
            }
            throw new WriterException("should not happen but we got: " + rVar.d());
        }
        throw new WriterException("Invalid mask pattern");
    }

    static void a(b8 b8Var, r rVar) throws WriterException {
        rVar.a(b8Var.f(), 6);
        rVar.a(a(b8Var.f(), 7973), 12);
        if (rVar.d() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + rVar.d());
    }
}
