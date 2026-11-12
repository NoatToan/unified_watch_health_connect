package com.xiaomi.hm.health.relation.chart.util;

import android.content.Context;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.hm.health.relation.R;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes21.dex */
public class LengthUtil {
    public static float convertTo(Float f, int i, int i2) {
        float fFloatValue = f.floatValue();
        if (i == 0) {
            if (i2 != 0) {
                return i2 != 1 ? fFloatValue : convertToBritish(f);
            }
            return f.floatValue();
        }
        if (i != 1) {
            return 0.0f;
        }
        if (i2 != 0) {
            return i2 != 1 ? fFloatValue : f.floatValue();
        }
        return convertToMetric(f);
    }

    public static float convertToBritish(Float f) {
        return Math.round(((double) f.floatValue()) * 3.2808d);
    }

    public static String[] convertToDefString(Context context, Float f, int i) {
        return convertToString(context, f, 0, 1, i);
    }

    public static float convertToMetric(Float f) {
        return Math.round(((double) f.floatValue()) * 0.3048d);
    }

    public static String[] convertToString(Context context, Float f, int i, int i2, int i3) {
        String[] strArr = new String[2];
        float fConvertTo = convertTo(f, i, i2);
        if (i == 0 && i2 == 1) {
            if (fConvertTo >= 5280.0f) {
                strArr[0] = formatDecimal(fConvertTo / 5280.0f, i3);
                strArr[1] = context.getString(R.string.relatives_unit_mile);
            } else {
                strArr[0] = String.valueOf(Math.round(fConvertTo));
                strArr[1] = context.getString(R.string.relatives_unit_foot);
            }
        }
        return strArr;
    }

    public static String formatDecimal(double d, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Accuracy must >= 0");
        }
        String str = "####";
        if (i > 0) {
            str = "####.";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + UpdateUtils.CMD_FILTER;
            }
        }
        return new DecimalFormat(str).format(d);
    }
}
