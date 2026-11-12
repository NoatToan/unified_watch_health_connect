package defpackage;

import com.careforeyou.library.enums.Weight_Digit;
import com.careforeyou.library.enums.Weight_Unit;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes4.dex */
public class wl {
    public static float c(float f) {
        return f * 0.4535924f;
    }

    public static float d(float f) {
        return f * 0.5f;
    }

    public static float e(String str) {
        String[] strArrSplit = str.split(":");
        return new BigDecimal(strArrSplit.length == 2 ? c((Integer.parseInt(strArrSplit[0]) * 14) + Float.parseFloat(strArrSplit[1])) : 0.0f).setScale(3, 4).floatValue();
    }

    public static vz e(byte b2, byte b3, byte b4, boolean z) {
        Weight_Digit weight_DigitH;
        if (z) {
            weight_DigitH = wg.a(b4);
        } else {
            weight_DigitH = wg.h(b4);
        }
        return e(b2, b3, b4, weight_DigitH, false);
    }

    public static vz e(byte b2, byte b3, byte b4, Weight_Digit weight_Digit, boolean z) {
        Weight_Unit weight_UnitF;
        float fA;
        if (z) {
            weight_UnitF = wg.i(b4);
        } else {
            weight_UnitF = wg.f(b4);
        }
        vz vzVar = new vz();
        int i = 0;
        byte[] bArr = {b2, b3};
        if (weight_Digit == Weight_Digit.ONE) {
            fA = wg.a(bArr) / 10.0f;
            i = 1;
        } else if (weight_Digit == Weight_Digit.TWO) {
            fA = wg.a(bArr) / 100.0f;
            i = 2;
        } else {
            fA = wg.a(bArr);
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
        float fFloatValue = new BigDecimal(fA).setScale(i, 4).floatValue();
        if (weight_UnitF == Weight_Unit.ST) {
            vzVar.d = (b2 & 255) + ":" + ((b3 & 255) / 10.0f);
        } else if (i == 0) {
            vzVar.d = "" + ((int) fFloatValue);
        } else if (i == 1) {
            vzVar.d = new DecimalFormat("#0.0", decimalFormatSymbols).format(fFloatValue);
        } else if (i == 2) {
            vzVar.d = new DecimalFormat("#0.00", decimalFormatSymbols).format(fFloatValue);
        }
        if (weight_UnitF == Weight_Unit.JIN) {
            vzVar.f51724a = d(fFloatValue);
        } else if (weight_UnitF == Weight_Unit.LB) {
            vzVar.f51724a = c(fFloatValue);
        } else if (weight_UnitF == Weight_Unit.ST) {
            vzVar.f51724a = e(vzVar.d);
        } else {
            vzVar.f51724a = fFloatValue;
        }
        vzVar.f51724a = new BigDecimal(vzVar.f51724a).setScale(i, 4).doubleValue();
        return vzVar;
    }
}
