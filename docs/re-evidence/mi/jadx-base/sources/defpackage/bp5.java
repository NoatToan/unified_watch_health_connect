package defpackage;

import cn.hutool.core.io.unit.DataUnit;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class bp5 {
    public static String a(long j) {
        if (j <= 0) {
            return "0";
        }
        String[] strArr = DataUnit.UNIT_NAMES;
        double d = j;
        int iMin = Math.min(strArr.length - 1, (int) (Math.log10(d) / Math.log10(1024.0d)));
        return new DecimalFormat("#,##0.##").format(d / Math.pow(1024.0d, iMin)) + " " + strArr[iMin];
    }
}
