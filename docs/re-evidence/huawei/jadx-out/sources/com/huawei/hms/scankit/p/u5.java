package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class u5 implements l8 {
    private static s a(l5 l5Var, String str, int i, int i2, int i3, int i4) throws WriterException {
        l5Var.a(str, i);
        byte[][] bArrA = l5Var.a().a(1, 4);
        int length = i2 / bArrA[0].length;
        int length2 = i3 / bArrA.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            return a(l5Var.a().a(length, length * 4), i4);
        }
        return a(bArrA, i4);
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.PDF_417) {
            l5 l5Var = new l5();
            int i3 = 30;
            int i4 = 2;
            if (map != null) {
                u2 u2Var = u2.PDF417_COMPACT;
                if (map.containsKey(u2Var)) {
                    l5Var.a(Boolean.valueOf(map.get(u2Var).toString()).booleanValue());
                }
                u2 u2Var2 = u2.PDF417_COMPACTION;
                if (map.containsKey(u2Var2)) {
                    l5Var.a(y0.valueOf(map.get(u2Var2).toString()));
                }
                u2 u2Var3 = u2.PDF417_DIMENSIONS;
                if (!map.containsKey(u2Var3)) {
                    u2 u2Var4 = u2.MARGIN;
                    i3 = map.containsKey(u2Var4) ? Integer.parseInt(map.get(u2Var4).toString()) : 30;
                    u2 u2Var5 = u2.ERROR_CORRECTION;
                    i4 = map.containsKey(u2Var5) ? Integer.parseInt(map.get(u2Var5).toString()) : 2;
                    u2 u2Var6 = u2.CHARACTER_SET;
                    if (map.containsKey(u2Var6)) {
                        l5Var.a(Charset.forName(map.get(u2Var6).toString()));
                    }
                } else {
                    j1.a(map.get(u2Var3));
                    throw null;
                }
            }
            return a(l5Var, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got " + barcodeFormat);
    }

    private static s a(byte[][] bArr, int i) {
        int i2 = i * 2;
        s sVar = new s(bArr[0].length + i2, bArr.length + i2);
        sVar.a();
        int iB = (sVar.b() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    sVar.c(i4 + i, iB);
                }
            }
            i3++;
            iB--;
        }
        return sVar;
    }
}
