package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class p9f implements sgj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final atk[] f30147b = new atk[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps5 f30148a = new ps5();

    private static cp2 b(cp2 cp2Var) throws NotFoundException {
        int[] iArrG = cp2Var.g();
        if (iArrG == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = iArrG[0];
        int i2 = iArrG[1];
        int i3 = iArrG[2];
        int i4 = iArrG[3];
        cp2 cp2Var2 = new cp2(30, 33);
        for (int i5 = 0; i5 < 33; i5++) {
            int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
            for (int i7 = 0; i7 < 30; i7++) {
                if (cp2Var.e(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                    cp2Var2.n(i7, i5);
                }
            }
        }
        return cp2Var2;
    }

    @Override // defpackage.sgj
    public wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        ts5 ts5VarB = this.f30148a.b(b(cj2Var.a()), map);
        wsk wskVar = new wsk(ts5VarB.h(), ts5VarB.e(), f30147b, BarcodeFormat.MAXICODE);
        String strB = ts5VarB.b();
        if (strB != null) {
            wskVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        return wskVar;
    }

    @Override // defpackage.sgj
    public void reset() {
    }
}
