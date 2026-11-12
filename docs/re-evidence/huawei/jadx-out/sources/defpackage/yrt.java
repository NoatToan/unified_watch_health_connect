package defpackage;

import com.iabtcf.decoder.DecoderOption;
import com.iabtcf.decoder.TCString;
import com.iabtcf.utils.FieldDefs;
import java.util.Base64;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes20.dex */
public class yrt {
    yrt() {
    }

    static ysh a(String str) {
        return new ysh(Base64.getUrlDecoder().decode(str));
    }

    public static TCString d(String str, DecoderOption... decoderOptionArr) throws ysa, IllegalArgumentException, ysf {
        ysc yscVarE;
        EnumSet enumSetNoneOf = EnumSet.noneOf(DecoderOption.class);
        for (DecoderOption decoderOption : decoderOptionArr) {
            enumSetNoneOf.add(decoderOption);
        }
        String[] strArrSplit = str.split("\\.");
        ysh yshVarA = a(strArrSplit[0]);
        byte bG = yshVarA.g(FieldDefs.CORE_VERSION);
        if (bG == 1) {
            return ysb.c(yshVarA);
        }
        if (bG == 2) {
            if (strArrSplit.length > 1) {
                ysh[] yshVarArr = new ysh[strArrSplit.length - 1];
                for (int i = 1; i < strArrSplit.length; i++) {
                    yshVarArr[i - 1] = a(strArrSplit[i]);
                }
                yscVarE = ysc.e(yshVarA, yshVarArr);
            } else {
                yscVarE = ysc.e(yshVarA, new ysh[0]);
            }
            if (!enumSetNoneOf.contains(DecoderOption.LAZY)) {
                yscVarE.hashCode();
            }
            return yscVarE;
        }
        throw new ysf("Version " + ((int) bG) + "is unsupported yet");
    }
}
