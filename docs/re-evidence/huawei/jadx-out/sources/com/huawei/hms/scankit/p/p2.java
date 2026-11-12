package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class p2 extends r7 {
    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + q7.b(str);
            } catch (a e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
            }
            try {
                if (!q7.a((CharSequence) str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (a unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i = o2.j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iA = h5.a(zArr, 0, q7.f16286c, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iA += h5.a(zArr, iA, q7.g[iDigit], false);
        }
        int iA2 = iA + h5.a(zArr, iA, q7.d, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            iA2 += h5.a(zArr, iA2, q7.f[Character.digit(str.charAt(i3), 10)], true);
        }
        h5.a(zArr, iA2, q7.f16286c, true);
        return zArr;
    }
}
