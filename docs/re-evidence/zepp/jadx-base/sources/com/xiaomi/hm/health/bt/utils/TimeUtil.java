package com.xiaomi.hm.health.bt.utils;

import android.text.format.Time;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.util.Log;
import io.netty.util.internal.StringUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes20.dex */
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

    private static long a(long time1, long time2, String time1Tag, String time2Tag, int offsetUnit) {
        StringBuilder sb = new StringBuilder();
        sb.append(time1Tag);
        sb.append(" : ");
        sb.append(formatDateTime(time1));
        sb.append(", ");
        sb.append(time2Tag);
        sb.append(" : ");
        sb.append(formatDateTime(time2));
        sb.append('\n');
        long j2 = time1 - time2;
        sb.append("Offset Millis : ");
        sb.append(j2);
        sb.append("ms");
        sb.append(", ");
        if (offsetUnit == 2) {
            j2 = (j2 / 1000) / 60;
            sb.append("Offset Minus : ");
            sb.append(j2);
            sb.append("min");
        } else if (offsetUnit == 3) {
            j2 = ((j2 / 1000) / 60) / 60;
            sb.append("Offset Hours : ");
            sb.append(j2);
            sb.append("hour");
        }
        Log.d(a, sb.toString(), new Object[0]);
        return j2;
    }

    public static String formatDate(long timeMillis) {
        return formatDateTime(timeMillis, "yyyy-MM-dd");
    }

    public static synchronized String formatDateTime(long time, String formatPattern) {
        f.applyPattern(formatPattern);
        return f.format(new Date(time));
    }

    public static String formatDateTimeByDefaultLocal(long time, String formatPattern) {
        return new SimpleDateFormat(formatPattern, Locale.getDefault()).format(new Date(time));
    }

    public static String formatDuration(long duration) {
        StringBuilder sb = new StringBuilder();
        if (duration < 1000) {
            sb.append(duration);
            sb.append("ms");
        } else if (duration < 60000) {
            sb.append(duration / 1000);
            sb.append(SOAP.XMLNS);
            sb.append(StringUtil.SPACE);
            sb.append(duration % 1000);
            sb.append("ms");
        } else if (duration < 3600000) {
            sb.append(duration / 60000);
            sb.append("m");
            sb.append(StringUtil.SPACE);
            sb.append((duration % 60000) / 1000);
            sb.append(SOAP.XMLNS);
        } else if (duration < 86400000) {
            sb.append(duration / 3600000);
            sb.append("h");
            sb.append(StringUtil.SPACE);
            sb.append((duration % 3600000) / 60000);
            sb.append("m");
            sb.append(StringUtil.SPACE);
            sb.append((duration % 60000) / 1000);
            sb.append(SOAP.XMLNS);
        } else {
            sb.append(duration / 86400000);
            sb.append(GoogleApiAvailabilityLight.a);
            sb.append(StringUtil.SPACE);
            sb.append((duration % 86400000) / 3600000);
            sb.append("h");
            sb.append(StringUtil.SPACE);
            sb.append((duration % 3600000) / 60000);
            sb.append("m");
        }
        return sb.toString();
    }

    public static int getJulianDay(long timeMills) {
        Time time = new Time();
        time.set(timeMills);
        return Time.getJulianDay(timeMills, time.gmtoff);
    }

    public static long offsetHoursCurrentToMillis(long time, String timeTag) {
        return a(System.currentTimeMillis(), time, "Current", timeTag, 3);
    }

    public static long offsetHoursMillisToCurrent(long time, String timeTag) {
        return a(time, System.currentTimeMillis(), timeTag, "Current", 3);
    }

    public static long offsetHoursMillisToMillis(long time1, long time2, String time1Tag, String time2Tag) {
        return a(time1, time2, time1Tag, time2Tag, 3);
    }

    public static int offsetMinusCurrentToMillis(long time, String timeTag) {
        return (int) a(System.currentTimeMillis(), time, "Current", timeTag, 2);
    }

    public static void resetFormatTimeZone() {
        f.setTimeZone(TimeZone.getDefault());
    }

    public static String formatDate(Calendar calendar) {
        return formatDateTime(calendar, "yyyy-MM-dd");
    }

    public static String formatDateTime(long timeMills) {
        return formatDateTime(timeMills, "yyyy-MM-dd HH:mm:ss.SSS");
    }

    public static String formatDateTime(int timeSecs) {
        return formatDateTime(((long) timeSecs) * 1000, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDateTime(Calendar calendar, String formatPattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatPattern, Locale.US);
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        return simpleDateFormat.format(new Date(calendar.getTimeInMillis()));
    }

    public static String formatDateTime(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return formatDateTime(calendar, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDuration(int durationSecs) {
        return formatDuration(((long) durationSecs) * 1000);
    }
}
