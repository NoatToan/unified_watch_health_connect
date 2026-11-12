package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class cgh implements epr {
    public static cp2 b(byte[][] bArr, int i) {
        int i2 = i * 2;
        cp2 cp2Var = new cp2(bArr[0].length + i2, bArr.length + i2);
        cp2Var.b();
        int iH = (cp2Var.h() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    cp2Var.n(i4 + i, iH);
                }
            }
            i3++;
            iH--;
        }
        return cp2Var;
    }

    public static cp2 c(tfh tfhVar, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        tfhVar.e(str, i);
        byte[][] bArrB = tfhVar.f().b(1, 4);
        if ((i3 > i2) != (bArrB[0].length < bArrB.length)) {
            bArrB = d(bArrB);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / bArrB[0].length;
        int length2 = i3 / bArrB.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(bArrB, i4);
        }
        byte[][] bArrB2 = tfhVar.f().b(length, length << 2);
        if (z) {
            bArrB2 = d(bArrB2);
        }
        return b(bArrB2, i4);
    }

    public static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // defpackage.epr
    public cp2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        tfh tfhVar = new tfh();
        int i3 = 30;
        int i4 = 2;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                tfhVar.h(Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                tfhVar.i(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                fx6 fx6Var = (fx6) map.get(encodeHintType3);
                tfhVar.j(fx6Var.a(), fx6Var.c(), fx6Var.b(), fx6Var.d());
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            i3 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            i4 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                tfhVar.k(Charset.forName(map.get(encodeHintType6).toString()));
            }
        }
        return c(tfhVar, str, i4, i, i2, i3);
    }
}
