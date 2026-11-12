package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class mfi implements epr {
    public static cp2 b(hfi hfiVar, int i, int i2, int i3) {
        k73 k73VarA = hfiVar.a();
        if (k73VarA == null) {
            throw new IllegalStateException();
        }
        int iE = k73VarA.e();
        int iD = k73VarA.d();
        int i4 = i3 << 1;
        int i5 = iE + i4;
        int i6 = i4 + iD;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (iE * iMin)) / 2;
        int i8 = (iMax2 - (iD * iMin)) / 2;
        cp2 cp2Var = new cp2(iMax, iMax2);
        int i9 = 0;
        while (i9 < iD) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < iE) {
                if (k73VarA.b(i10, i9) == 1) {
                    cp2Var.p(i11, i8, iMin, iMin);
                }
                i10++;
                i11 += iMin;
            }
            i9++;
            i8 += iMin;
        }
        return cp2Var;
    }

    @Override // defpackage.epr
    public cp2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        int i3 = 4;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i3 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
        }
        return b(t98.n(str, errorCorrectionLevelValueOf, map), i, i2, i3);
    }
}
