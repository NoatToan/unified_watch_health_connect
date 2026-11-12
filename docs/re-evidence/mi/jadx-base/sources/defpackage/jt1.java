package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class jt1 implements sgj {
    @Override // defpackage.sgj
    public wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        atk[] atkVarArrB;
        atk[] atkVarArrB2;
        FormatException formatException;
        btk btkVar;
        b06 b06Var = new b06(cj2Var.a());
        ts5 ts5VarC = null;
        try {
            it1 it1VarA = b06Var.a(false);
            atkVarArrB = it1VarA.b();
            try {
                atkVarArrB2 = atkVarArrB;
                formatException = null;
                ts5VarC = new ns5().c(it1VarA);
                e = null;
            } catch (FormatException e) {
                e = e;
                atkVarArrB2 = atkVarArrB;
                formatException = e;
                e = null;
            } catch (NotFoundException e2) {
                e = e2;
                atkVarArrB2 = atkVarArrB;
                formatException = null;
            }
        } catch (FormatException e3) {
            e = e3;
            atkVarArrB = null;
        } catch (NotFoundException e4) {
            e = e4;
            atkVarArrB = null;
        }
        if (ts5VarC == null) {
            try {
                it1 it1VarA2 = b06Var.a(true);
                atkVarArrB2 = it1VarA2.b();
                ts5VarC = new ns5().c(it1VarA2);
            } catch (FormatException | NotFoundException e5) {
                if (e != null) {
                    throw e;
                }
                if (formatException != null) {
                    throw formatException;
                }
                throw e5;
            }
        }
        atk[] atkVarArr = atkVarArrB2;
        if (map != null && (btkVar = (btk) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (atk atkVar : atkVarArr) {
                btkVar.a(atkVar);
            }
        }
        wsk wskVar = new wsk(ts5VarC.h(), ts5VarC.e(), ts5VarC.c(), atkVarArr, BarcodeFormat.AZTEC, System.currentTimeMillis());
        List<byte[]> listA = ts5VarC.a();
        if (listA != null) {
            wskVar.h(ResultMetadataType.BYTE_SEGMENTS, listA);
        }
        String strB = ts5VarC.b();
        if (strB != null) {
            wskVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        return wskVar;
    }

    @Override // defpackage.sgj
    public void reset() {
    }
}
