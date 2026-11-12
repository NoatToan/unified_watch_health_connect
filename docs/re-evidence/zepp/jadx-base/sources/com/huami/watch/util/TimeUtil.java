package com.huami.watch.util;

import android.text.format.Time;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes11.dex */
public class TimeUtil {
    public static final int DAY = 86400000;
    public static final int HOURS = 24;
    public static final int HOUR_MINUTES = 60;
    public static final String PATTERN_HM = "HH:mm";
    public static final String PATTERN_MD = "MM-dd";
    public static final String PATTERN_YM = "yyyy-MM";
    public static final String PATTERN_YMD = "yyyy-MM-dd";
    public static final String PATTERN_YMDHM = "yyyy-MM-dd HH:mm";
    public static final String PATTERN_YMDHMS = "yyyy-MM-dd HH:mm:ss";
    private static final String a = "Util-Time";
    private static final String b = "yyyy-MM-dd HH:mm:ss.SSS";
    private static final int c = 1000;
    private static final int d = 60000;
    private static final int e = 3600000;
    private static SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;

    private static long a(long j2, long j3, String str, String str2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(formatDateTime(j2));
        sb.append(", ");
        sb.append(str2);
        sb.append(" : ");
        sb.append(formatDateTime(j3));
        sb.append('\n');
        long j4 = j2 - j3;
        sb.append("Offset Millis : ");
        sb.append(j4);
        sb.append("ms");
        sb.append(", ");
        if (i2 == 2) {
            j4 = (j4 / 1000) / 60;
            sb.append("Offset Minus : ");
            sb.append(j4);
            sb.append("min");
        } else if (i2 == 3) {
            j4 = ((j4 / 1000) / 60) / 60;
            sb.append("Offset Hours : ");
            sb.append(j4);
            sb.append("hour");
        }
        Log.d(a, sb.toString(), new Object[0]);
        return j4;
    }

    public static String formatDate(long j2) {
        return formatDateTime(j2, "yyyy-MM-dd");
    }

    public static synchronized String formatDateTime(long j2, String str) {
        f.applyPattern(str);
        return f.format(new Date(j2));
    }

    public static String formatDateTimeByDefaultLocal(long j2, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j2));
    }

    public static String formatDuration(long j2) {
        StringBuilder sb = new StringBuilder();
        if (j2 < 1000) {
            sb.append(j2);
            sb.append("ms");
        } else if (j2 < 60000) {
            sb.append(j2 / 1000);
            sb.append(SOAP.XMLNS);
            sb.append(io.netty.util.internal.StringUtil.SPACE);
            sb.append(j2 % 1000);
            sb.append("ms");
        } else if (j2 < 3600000) {
            sb.append(j2 / 60000);
            sb.append("m");
            sb.append(io.netty.util.internal.StringUtil.SPACE);
            sb.append((j2 % 60000) / 1000);
            sb.append(SOAP.XMLNS);
        } else if (j2 < 86400000) {
            sb.append(j2 / 3600000);
            sb.append("h");
            sb.append(io.netty.util.internal.StringUtil.SPACE);
            sb.append((j2 % 3600000) / 60000);
            sb.append("m");
            sb.append(io.netty.util.internal.StringUtil.SPACE);
            sb.append((j2 % 60000) / 1000);
            sb.append(SOAP.XMLNS);
        } else {
            sb.append(j2 / 86400000);
            sb.append(GoogleApiAvailabilityLight.a);
            sb.append(io.netty.util.internal.StringUtil.SPACE);
            sb.append((j2 % 86400000) / 3600000);
            sb.append("h");
            sb.append(io.netty.util.internal.StringUtil.SPACE);
            sb.append((j2 % 3600000) / 60000);
            sb.append("m");
        }
        return sb.toString();
    }

    public static int getJulianDay(long j2) {
        Time time = new Time();
        time.set(j2);
        return Time.getJulianDay(j2, time.gmtoff);
    }

    public static long offsetHoursCurrentToMillis(long j2, String str) {
        return a(System.currentTimeMillis(), j2, "Current", str, 3);
    }

    public static long offsetHoursMillisToCurrent(long j2, String str) {
        return a(j2, System.currentTimeMillis(), str, "Current", 3);
    }

    public static long offsetHoursMillisToMillis(long j2, long j3, String str, String str2) {
        return a(j2, j3, str, str2, 3);
    }

    public static int offsetMinusCurrentToMillis(long j2, String str) {
        return (int) a(System.currentTimeMillis(), j2, "Current", str, 2);
    }

    public static void resetFormatTimeZone() {
        f.setTimeZone(TimeZone.getDefault());
    }

    public static String formatDate(Calendar calendar) {
        return formatDateTime(calendar, "yyyy-MM-dd");
    }

    public static String formatDateTime(long j2) {
        return formatDateTime(j2, "yyyy-MM-dd HH:mm:ss.SSS");
    }

    public static String formatDateTime(int i2) {
        return formatDateTime(((long) i2) * 1000, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDateTime(Calendar calendar, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        return simpleDateFormat.format(new Date(calendar.getTimeInMillis()));
    }

    public static String formatDateTime(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return formatDateTime(calendar, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDuration(int i2) {
        return formatDuration(((long) i2) * 1000);
    }
}
