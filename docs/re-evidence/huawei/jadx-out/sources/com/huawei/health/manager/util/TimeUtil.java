package com.huawei.health.manager.util;

import com.huawei.hwlogsmodel.LogUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TimeUtil {
    private TimeUtil() {
    }

    public static long e(long j) {
        return j / 60000;
    }

    public static long d(long j) {
        return j / 1000;
    }

    public static long b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 23);
        calendar.set(13, 59);
        calendar.set(12, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static long c(long j) {
        return b(j) + 86400000;
    }

    public static boolean d(long j, long j2) {
        if (j2 == -1 || j == -1) {
            LogUtil.d("Step_TimeUtil", "isSameDay return false");
            return false;
        }
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }
}
