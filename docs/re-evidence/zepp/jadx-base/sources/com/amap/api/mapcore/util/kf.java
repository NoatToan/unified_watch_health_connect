package com.amap.api.mapcore.util;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class kf {
    private static long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long a(long j, long j2) {
        try {
            if (Math.abs(j - j2) > 31536000000L) {
                long jA = a(j2) + (j - a(j));
                long jAbs = Math.abs(jA - j2);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(jA));
                int i = calendar.get(11);
                if (i == 23 && jAbs >= 82800000) {
                    jA -= 86400000;
                }
                return (i != 0 || jAbs < 82800000) ? jA : jA + 86400000;
            }
        } catch (Throwable unused) {
        }
        return j;
    }
}
