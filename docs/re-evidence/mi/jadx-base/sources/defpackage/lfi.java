package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class lfi implements sgj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final atk[] f25014b = new atk[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qs5 f25015a = new qs5();

    private static cp2 b(cp2 cp2Var) throws NotFoundException {
        int[] iArrJ = cp2Var.j();
        int[] iArrF = cp2Var.f();
        if (iArrJ == null || iArrF == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fC = c(iArrJ, cp2Var);
        int i = iArrJ[1];
        int i2 = iArrF[1];
        int i3 = iArrJ[0];
        int i4 = iArrF[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3 && (i4 = i3 + i5) >= cp2Var.k()) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iRound = Math.round(((i4 - i3) + 1) / fC);
        int iRound2 = Math.round((i5 + 1) / fC);
        if (iRound <= 0 || iRound2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (iRound2 != iRound) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = (int) (fC / 2.0f);
        int i7 = i + i6;
        int i8 = i3 + i6;
        int i9 = (((int) ((iRound - 1) * fC)) + i8) - i4;
        if (i9 > 0) {
            if (i9 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i8 -= i9;
        }
        int i10 = (((int) ((iRound2 - 1) * fC)) + i7) - i2;
        if (i10 > 0) {
            if (i10 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i7 -= i10;
        }
        cp2 cp2Var2 = new cp2(iRound, iRound2);
        for (int i11 = 0; i11 < iRound2; i11++) {
            int i12 = ((int) (i11 * fC)) + i7;
            for (int i13 = 0; i13 < iRound; i13++) {
                if (cp2Var.e(((int) (i13 * fC)) + i8, i12)) {
                    cp2Var2.n(i13, i11);
                }
            }
        }
        return cp2Var2;
    }

    public static float c(int[] iArr, cp2 cp2Var) throws NotFoundException {
        int iH = cp2Var.h();
        int iK = cp2Var.k();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < iK && i2 < iH) {
            if (z != cp2Var.e(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i == iK || i2 == iH) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (i - iArr[0]) / 7.0f;
    }

    @Override // defpackage.sgj
    public final wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        atk[] atkVarArrB;
        ts5 ts5VarB;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            f06 f06VarE = new e06(cj2Var.a()).e(map);
            ts5 ts5VarB2 = this.f25015a.b(f06VarE.a(), map);
            atkVarArrB = f06VarE.b();
            ts5VarB = ts5VarB2;
        } else {
            ts5VarB = this.f25015a.b(b(cj2Var.a()), map);
            atkVarArrB = f25014b;
        }
        if (ts5VarB.d() instanceof jfi) {
            ((jfi) ts5VarB.d()).a(atkVarArrB);
        }
        wsk wskVar = new wsk(ts5VarB.h(), ts5VarB.e(), atkVarArrB, BarcodeFormat.QR_CODE);
        List<byte[]> listA = ts5VarB.a();
        if (listA != null) {
            wskVar.h(ResultMetadataType.BYTE_SEGMENTS, listA);
        }
        String strB = ts5VarB.b();
        if (strB != null) {
            wskVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        if (ts5VarB.i()) {
            wskVar.h(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(ts5VarB.g()));
            wskVar.h(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(ts5VarB.f()));
        }
        return wskVar;
    }

    @Override // defpackage.sgj
    public void reset() {
    }
}
