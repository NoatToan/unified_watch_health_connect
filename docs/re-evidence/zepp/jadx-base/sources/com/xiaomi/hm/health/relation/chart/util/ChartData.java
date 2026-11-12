package com.xiaomi.hm.health.relation.chart.util;

import android.content.Context;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.relation.R;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes21.dex */
public final class ChartData {
    public static final int MODE_SLEEP = 16;
    public static final int MODE_STEP = 1;
    public static final int MODE_WEIGHT = 256;

    private static String a(double d, int i) {
        return new BigDecimal(d).setScale(i, 1).toString();
    }

    public static String formatBigDecimal(long j) {
        return new DecimalFormat("#,###,###").format(j);
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

    public static String[] formatDistance(Context context, int i, int i2) {
        String[] strArr = new String[2];
        float f = i;
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (hMPersonInfo.getMiliConfig().getUnit() == 1) {
            return LengthUtil.convertToDefString(context, Float.valueOf(f * 1.0f), i2);
        }
        if (hMPersonInfo.getMiliConfig().getUnit() != 0) {
            return strArr;
        }
        if (i >= 1000) {
            strArr[0] = a(f / 1000.0f, i2);
            strArr[1] = context.getString(R.string.relatives_unit_kilometer);
            return strArr;
        }
        strArr[0] = String.valueOf(i);
        strArr[1] = context.getString(R.string.relatives_unit_meter);
        return strArr;
    }

    public static String[] formatDistance(Context context, int i) {
        return formatDistance(context, i, 2);
    }
}
