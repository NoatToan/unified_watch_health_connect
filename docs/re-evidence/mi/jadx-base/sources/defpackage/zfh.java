package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zfh implements sgj {
    public static wsk[] b(cj2 cj2Var, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException, ChecksumException, FormatException {
        ArrayList arrayList = new ArrayList();
        wfh wfhVarB = d06.b(cj2Var, map, z);
        for (atk[] atkVarArr : wfhVarB.b()) {
            ts5 ts5VarI = bgh.i(wfhVarB.a(), atkVarArr[4], atkVarArr[5], atkVarArr[6], atkVarArr[7], e(atkVarArr), c(atkVarArr));
            wsk wskVar = new wsk(ts5VarI.h(), ts5VarI.e(), atkVarArr, BarcodeFormat.PDF_417);
            wskVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, ts5VarI.b());
            agh aghVar = (agh) ts5VarI.d();
            if (aghVar != null) {
                wskVar.h(ResultMetadataType.PDF417_EXTRA_METADATA, aghVar);
            }
            arrayList.add(wskVar);
        }
        return (wsk[]) arrayList.toArray(new wsk[arrayList.size()]);
    }

    public static int c(atk[] atkVarArr) {
        return Math.max(Math.max(d(atkVarArr[0], atkVarArr[4]), (d(atkVarArr[6], atkVarArr[2]) * 17) / 18), Math.max(d(atkVarArr[1], atkVarArr[5]), (d(atkVarArr[7], atkVarArr[3]) * 17) / 18));
    }

    public static int d(atk atkVar, atk atkVar2) {
        if (atkVar == null || atkVar2 == null) {
            return 0;
        }
        return (int) Math.abs(atkVar.c() - atkVar2.c());
    }

    public static int e(atk[] atkVarArr) {
        return Math.min(Math.min(f(atkVarArr[0], atkVarArr[4]), (f(atkVarArr[6], atkVarArr[2]) * 17) / 18), Math.min(f(atkVarArr[1], atkVarArr[5]), (f(atkVarArr[7], atkVarArr[3]) * 17) / 18));
    }

    public static int f(atk atkVar, atk atkVar2) {
        if (atkVar == null || atkVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(atkVar.c() - atkVar2.c());
    }

    @Override // defpackage.sgj
    public wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        wsk wskVar;
        wsk[] wskVarArrB = b(cj2Var, map, false);
        if (wskVarArrB == null || wskVarArrB.length == 0 || (wskVar = wskVarArrB[0]) == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return wskVar;
    }

    @Override // defpackage.sgj
    public void reset() {
    }
}
