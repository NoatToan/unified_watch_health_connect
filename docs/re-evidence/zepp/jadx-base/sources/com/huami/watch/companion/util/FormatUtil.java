package com.huami.watch.companion.util;

import com.huami.watch.util.Log;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class FormatUtil {
    private static final String a = "Util-Format";

    public static final class DecFormatter {
        private float a;
        private int b;

        private DecFormatter(float f) {
            this.b = 0;
            this.a = f;
        }

        public String out() {
            return FormatUtil.b(this.a, this.b);
        }

        public DecFormatter scale(int i) {
            this.b = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(float f, int i) {
        String strValueOf;
        if (i == 0) {
            strValueOf = String.valueOf((long) f);
        } else {
            String str = "#.";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "0";
            }
            DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance();
            decimalFormat.applyPattern(str);
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            strValueOf = decimalFormat.format(f);
        }
        Log.d(a, c(Float.valueOf(f), strValueOf), new Object[0]);
        return strValueOf;
    }

    private static String c(Object obj, Object obj2) {
        return SearchCriteria.LT + obj + " => " + obj2 + SearchCriteria.GT;
    }

    public static DecFormatter in(float f) {
        return new DecFormatter(f);
    }
}
