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
public final class hm5 implements sgj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final atk[] f20228b = new atk[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final os5 f20229a = new os5();

    public static cp2 b(cp2 cp2Var) throws NotFoundException {
        int[] iArrJ = cp2Var.j();
        int[] iArrF = cp2Var.f();
        if (iArrJ == null || iArrF == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iC = c(iArrJ, cp2Var);
        int i = iArrJ[1];
        int i2 = iArrF[1];
        int i3 = iArrJ[0];
        int i4 = ((iArrF[0] - i3) + 1) / iC;
        int i5 = ((i2 - i) + 1) / iC;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = iC / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        cp2 cp2Var2 = new cp2(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * iC) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (cp2Var.e((i11 * iC) + i8, i10)) {
                    cp2Var2.n(i11, i9);
                }
            }
        }
        return cp2Var2;
    }

    public static int c(int[] iArr, cp2 cp2Var) throws NotFoundException {
        int iK = cp2Var.k();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < iK && cp2Var.e(i, i2)) {
            i++;
        }
        if (i == iK) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i3 = i - iArr[0];
        if (i3 != 0) {
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // defpackage.sgj
    public wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        atk[] atkVarArrB;
        ts5 ts5VarB;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            f06 f06VarC = new c06(cj2Var.a()).c();
            ts5 ts5VarB2 = this.f20229a.b(f06VarC.a());
            atkVarArrB = f06VarC.b();
            ts5VarB = ts5VarB2;
        } else {
            ts5VarB = this.f20229a.b(b(cj2Var.a()));
            atkVarArrB = f20228b;
        }
        wsk wskVar = new wsk(ts5VarB.h(), ts5VarB.e(), atkVarArrB, BarcodeFormat.DATA_MATRIX);
        List<byte[]> listA = ts5VarB.a();
        if (listA != null) {
            wskVar.h(ResultMetadataType.BYTE_SEGMENTS, listA);
        }
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
