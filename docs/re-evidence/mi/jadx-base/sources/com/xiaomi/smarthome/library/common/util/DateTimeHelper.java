package com.xiaomi.smarthome.library.common.util;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
public class DateTimeHelper {
    private static final String LOG_TAG = "common/DateTimeHelper";
    public static final TimeZone sBeijingTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
    public static final long sDayInMilliseconds = 86400000;
    public static final long sDayInMinutes = 1440;
    public static final long sHourInMilliseconds = 3600000;
    public static final long sHourInMinutes = 60;
    public static final long sMinuteInMilliseconds = 60000;

    public static String getCurrentString(String str) {
        return new SimpleDateFormat(str).format(new Date(System.currentTimeMillis()));
    }

    public static long getCurrentTiemstamp() {
        return Calendar.getInstance(sBeijingTimeZone).getTimeInMillis();
    }

    public static long getElapsedMinutesFromHour() {
        return getElapsedMinutesFromHour(getCurrentTiemstamp());
    }

    public static long getElapsedMinutesFromToday() {
        return getElapsedMinutesFromToday(getCurrentTiemstamp());
    }

    public static long getTodayStartTimestamp() {
        return getTodayStartTimestamp(getCurrentTiemstamp());
    }

    public static long getTomorrowStartTimestamp(long j) {
        return (j - (j % 86400000)) + 86400000;
    }

    public static String getWeekday(Date date) {
        int day = date.getDay();
        if (day == 0) {
            return "周日";
        }
        if (day == 1) {
            return "周一";
        }
        if (day == 2) {
            return "周二";
        }
        if (day == 3) {
            return "周三";
        }
        if (day != 4) {
            return day != 5 ? "周六" : "周五";
        }
        return "周四";
    }

    public static long parseDate(String str) throws SAXException {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str));
            gregorianCalendar.setTimeZone(sBeijingTimeZone);
            return gregorianCalendar.getTimeInMillis();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public static long getElapsedMinutesFromHour(long j) {
        return getElapsedMinutesFromToday(j) % 60;
    }

    public static long getElapsedMinutesFromToday(long j) {
        return (j - getTodayStartTimestamp(j)) / 60000;
    }

    public static long getTodayStartTimestamp(long j) {
        return j - (j % 86400000);
    }
}
