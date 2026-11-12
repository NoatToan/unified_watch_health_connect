package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class kt1 implements epr {
    public static cp2 b(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return c(r98.d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public static cp2 c(ht1 ht1Var, int i, int i2) {
        cp2 cp2VarA = ht1Var.a();
        if (cp2VarA == null) {
            throw new IllegalStateException();
        }
        int iK = cp2VarA.k();
        int iH = cp2VarA.h();
        int iMax = Math.max(i, iK);
        int iMax2 = Math.max(i2, iH);
        int iMin = Math.min(iMax / iK, iMax2 / iH);
        int i3 = (iMax - (iK * iMin)) / 2;
        int i4 = (iMax2 - (iH * iMin)) / 2;
        cp2 cp2Var = new cp2(iMax, iMax2);
        int i5 = 0;
        while (i5 < iH) {
            int i6 = 0;
            int i7 = i3;
            while (i6 < iK) {
                if (cp2VarA.e(i6, i5)) {
                    cp2Var.p(i7, i4, iMin, iMin);
                }
                i6++;
                i7 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return cp2Var;
    }

    @Override // defpackage.epr
    public cp2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charsetForName = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            i3 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i4 = Integer.parseInt(map.get(encodeHintType3).toString());
            }
        }
        return b(str, barcodeFormat, i, i2, charsetForName, i3, i4);
    }
}
