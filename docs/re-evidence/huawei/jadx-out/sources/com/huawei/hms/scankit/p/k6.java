package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class k6 implements l8 {
    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (!str.isEmpty()) {
            if (barcodeFormat != BarcodeFormat.QR_CODE) {
                throw new IllegalArgumentException("Can only encode QR_CODE, but got " + barcodeFormat);
            }
            if (i >= 0 && i2 >= 0) {
                b3 b3VarValueOf = b3.L;
                Boolean bool = Boolean.FALSE;
                int i3 = 4;
                if (map != null) {
                    u2 u2Var = u2.ERROR_CORRECTION;
                    if (map.containsKey(u2Var)) {
                        b3VarValueOf = b3.valueOf(map.get(u2Var).toString());
                    }
                    u2 u2Var2 = u2.MARGIN;
                    i3 = map.containsKey(u2Var2) ? Integer.parseInt(map.get(u2Var2).toString()) : 4;
                    u2 u2Var3 = u2.LOGO;
                    if (map.containsKey(u2Var3)) {
                        bool = (Boolean) map.get(u2Var3);
                    }
                }
                return a(w2.a(str, b3VarValueOf, map), i, i2, i3, bool.booleanValue());
            }
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    private static s a(h6 h6Var, int i, int i2, int i3, boolean z) {
        int iMax;
        int iMax2;
        int iMin;
        c0 c0VarA = h6Var.a();
        if (c0VarA != null) {
            int iC = c0VarA.c();
            int iB = c0VarA.b();
            if (z) {
                iMax = Math.max(i, iC);
                iMax2 = Math.max(i2, iB);
                int i4 = i3 * 2;
                iMin = Math.min((iMax - i4) / iC, (iMax2 - i4) / iB);
            } else {
                int i5 = i3 * 2;
                int i6 = iC + i5;
                int i7 = i5 + iB;
                iMax = Math.max(i, i6);
                iMax2 = Math.max(i2, i7);
                iMin = Math.min(iMax / i6, iMax2 / i7);
            }
            int i8 = (iMax - (iC * iMin)) / 2;
            int i9 = (iMax2 - (iB * iMin)) / 2;
            s sVar = new s(iMax, iMax2);
            int i10 = 0;
            while (i10 < iB) {
                int i11 = 0;
                int i12 = i8;
                while (i11 < iC) {
                    if (c0VarA.a(i11, i10) == 1) {
                        sVar.a(i12, i9, iMin, iMin);
                    }
                    i11++;
                    i12 += iMin;
                }
                i10++;
                i9 += iMin;
            }
            return sVar;
        }
        throw new IllegalStateException();
    }
}
