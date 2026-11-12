package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements l8 {
    private static s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4, int i5) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return a(x2.a(str.getBytes(charset), i3, i4), i, i2, i5);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        int i5 = 4;
        if (map != null) {
            u2 u2Var = u2.CHARACTER_SET;
            if (map.containsKey(u2Var)) {
                charsetForName = Charset.forName(map.get(u2Var).toString());
            }
            u2 u2Var2 = u2.ERROR_CORRECTION;
            i3 = map.containsKey(u2Var2) ? Integer.parseInt(map.get(u2Var2).toString()) : 33;
            u2 u2Var3 = u2.AZTEC_LAYERS;
            i4 = map.containsKey(u2Var3) ? Integer.parseInt(map.get(u2Var3).toString()) : 0;
            u2 u2Var4 = u2.MARGIN;
            if (map.containsKey(u2Var4)) {
                i5 = Integer.parseInt(map.get(u2Var4).toString());
            }
        }
        return a(str, barcodeFormat, i, i2, charsetForName, i3, i4, i5);
    }

    private static s a(f fVar, int i, int i2, int i3) {
        s sVarA = fVar.a();
        if (sVarA != null) {
            int iD = sVarA.d();
            int iB = sVarA.b();
            int i4 = i3 * 2;
            int i5 = iD + i4;
            int i6 = i4 + iB;
            int iMax = Math.max(i, i5);
            int iMax2 = Math.max(i2, i6);
            int iMin = Math.min(iMax / i5, iMax2 / i6);
            int i7 = (iMax - (iD * iMin)) / 2;
            int i8 = (iMax2 - (iB * iMin)) / 2;
            s sVar = new s(iMax, iMax2);
            int i9 = 0;
            while (i9 < iB) {
                int i10 = 0;
                int i11 = i7;
                while (i10 < iD) {
                    if (sVarA.b(i10, i9)) {
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
        throw new IllegalStateException();
    }
}
