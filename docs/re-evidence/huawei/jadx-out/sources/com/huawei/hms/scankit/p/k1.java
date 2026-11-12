package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class k1 implements l8 {
    private static s a(c0 c0Var, int i, int i2, int i3) {
        s sVar;
        int iC = c0Var.c();
        int iB = c0Var.b();
        int i4 = i3 * 2;
        int i5 = iC + i4;
        int i6 = i4 + iB;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (iC * iMin)) / 2;
        int i8 = (iMax2 - (iB * iMin)) / 2;
        if (i2 >= iB && i >= iC) {
            sVar = new s(i, i2);
        } else {
            sVar = new s(iC, iB);
            i7 = 0;
            i8 = 0;
        }
        sVar.a();
        int i9 = 0;
        while (i9 < iB) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < iC) {
                if (c0Var.a(i10, i9) == 1) {
                    sVar.a(i11, i8, iMin, iMin);
                }
                i10++;
                i11 += iMin;
            }
            i9++;
            i8 += iMin;
        }
        return sVar;
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (!str.isEmpty()) {
            if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
                throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + barcodeFormat);
            }
            if (i >= 0 && i2 >= 0) {
                e7 e7Var = e7.FORCE_SQUARE;
                int i3 = 4;
                if (map != null) {
                    e7 e7Var2 = (e7) map.get(u2.DATA_MATRIX_SHAPE);
                    if (e7Var2 != null) {
                        e7Var = e7Var2;
                    }
                    j1.a(map.get(u2.MIN_SIZE));
                    j1.a(map.get(u2.MAX_SIZE));
                    u2 u2Var = u2.MARGIN;
                    if (map.containsKey(u2Var)) {
                        i3 = Integer.parseInt(map.get(u2Var).toString());
                    }
                }
                String strA = d4.a(str, e7Var, (m2) null, (m2) null);
                d7 d7VarA = d7.a(strA.length(), e7Var, null, null, true);
                z1 z1Var = new z1(z2.a(strA, d7VarA), d7VarA.f(), d7VarA.e());
                z1Var.a();
                return a(z1Var, d7VarA, i, i2, i3);
            }
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    private static s a(z1 z1Var, d7 d7Var, int i, int i2, int i3) {
        int iF = d7Var.f();
        int iE = d7Var.e();
        c0 c0Var = new c0(d7Var.h(), d7Var.g());
        int i4 = 0;
        for (int i5 = 0; i5 < iE; i5++) {
            if (i5 % d7Var.e == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < d7Var.h(); i7++) {
                    c0Var.a(i6, i4, i7 % 2 == 0);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < iF; i9++) {
                if (i9 % d7Var.d == 0) {
                    c0Var.a(i8, i4, true);
                    i8++;
                }
                c0Var.a(i8, i4, z1Var.a(i9, i5));
                int i10 = i8 + 1;
                int i11 = d7Var.d;
                if (i9 % i11 == i11 - 1) {
                    c0Var.a(i10, i4, i5 % 2 == 0);
                    i8 += 2;
                } else {
                    i8 = i10;
                }
            }
            int i12 = i4 + 1;
            int i13 = d7Var.e;
            if (i5 % i13 == i13 - 1) {
                int i14 = 0;
                for (int i15 = 0; i15 < d7Var.h(); i15++) {
                    c0Var.a(i14, i12, true);
                    i14++;
                }
                i4 += 2;
            } else {
                i4 = i12;
            }
        }
        return a(c0Var, i, i2, i3);
    }
}
