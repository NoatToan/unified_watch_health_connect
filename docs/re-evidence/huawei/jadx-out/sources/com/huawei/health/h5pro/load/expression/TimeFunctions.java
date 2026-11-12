package com.huawei.health.h5pro.load.expression;

import com.huawei.health.h5pro.utils.LogUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class TimeFunctions {
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    private long d(long j, long j2, String str) {
        Calendar calendar = Calendar.getInstance();
        if (j > 0) {
            calendar.setTimeInMillis(j);
        }
        str.getClass();
        str.hashCode();
        switch (str) {
            case "D":
                calendar.add(6, (int) (-j2));
                break;
            case "H":
                calendar.setTimeInMillis(j - (j2 * 3600000));
                break;
            case "M":
                calendar.add(2, (int) (-j2));
                break;
            case "S":
                calendar.setTimeInMillis(j - (j2 * 1000));
                break;
            case "Y":
                calendar.add(1, (int) (-j2));
                break;
            case "MI":
                calendar.setTimeInMillis(j - (j2 * 60000));
                break;
            case "MS":
                calendar.setTimeInMillis(j - j2);
                break;
            default:
                LogUtil.e("H5PRO_TimeFunctions", "unknown intervalUnit: ".concat(str));
                break;
        }
        return calendar.getTimeInMillis();
    }

    @ExpressionFunction(alias = "getCurrentMilliSeconds")
    public long getCurrentMilliSeconds() {
        return new Date().getTime();
    }

    @ExpressionFunction(alias = "getCurrentSeconds")
    public long getCurrentSeconds() {
        return new Date().getTime() / 1000;
    }

    @ExpressionFunction(alias = "getCurrentTimeZone")
    public String getCurrentTimeZone() {
        return new SimpleDateFormat("Z").format(Calendar.getInstance().getTime());
    }

    @ExpressionFunction(alias = "getMilliSecondsBeforeTime")
    public long getMilliSecondsBeforeTime(long j, long j2, String str) {
        return d(j, j2, str);
    }

    @ExpressionFunction(alias = "getSecondsBeforeTime")
    public long getSecondsBeforeTime(long j, long j2, String str) {
        return d(j, j2, str) / 1000;
    }
}
