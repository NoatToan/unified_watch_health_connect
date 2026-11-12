package com.nimbusds.jwt.util;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class DateUtils {
    private DateUtils() {
    }

    public static Date fromSecondsSinceEpoch(long j8) {
        return new Date(j8 * 1000);
    }

    public static boolean isAfter(Date date, Date date2, long j8) {
        return new Date((j8 * 1000) + date.getTime()).after(date2);
    }

    public static boolean isBefore(Date date, Date date2, long j8) {
        return new Date(date.getTime() - (j8 * 1000)).before(date2);
    }

    public static boolean isWithin(Date date, Date date2, long j8) {
        long j14 = j8 * 1000;
        return date.getTime() > date2.getTime() - j14 && date.getTime() < date2.getTime() + j14;
    }

    public static Date nowWithSecondsPrecision() {
        return fromSecondsSinceEpoch(toSecondsSinceEpoch(new Date()));
    }

    public static long toSecondsSinceEpoch(Date date) {
        return date.getTime() / 1000;
    }
}
