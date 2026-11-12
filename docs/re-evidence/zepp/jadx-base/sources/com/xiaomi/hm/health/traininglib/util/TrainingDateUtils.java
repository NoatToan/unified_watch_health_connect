package com.xiaomi.hm.health.traininglib.util;

import android.content.Context;
import android.util.Log;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingDateUtils {
    public static final String PATTERN_YMD = "yyyy-M-d";
    public static final String PATTERN_YMDE = "yyyy-MM-dd EEEE";
    public static final String PATTERN_YMD_HMSS = "yyyy-MM-dd HH:mm:ss.SSS";

    public static long dayAmount(Date date, Date date2) {
        if (date == null || date2 == null) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        Log.d("DateUtils", "dayAmount time:" + calendar.getTime() + "  time1:" + calendar2.getTime());
        return (calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000;
    }

    public static Date daysAfter(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i);
        return calendar.getTime();
    }

    public static String formatDate(Date date, String str) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getDateInstance();
        simpleDateFormat.applyPattern(str);
        return simpleDateFormat.format(date);
    }

    public static Date getByYearMonthDay(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, i3);
        return calendar.getTime();
    }

    public static Date getNow() {
        return Calendar.getInstance().getTime();
    }

    public static String getTimeStrByIdx(Context context, int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(11, i);
        calendar.set(12, i2);
        return TimeUtils.formatTime(context, calendar.getTime());
    }

    public static boolean isAfterDay(Date date, Date date2) {
        if (date == null || date2 == null || isSameDay(date, date2)) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar.clear(11);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar2.clear(11);
        calendar2.clear(12);
        calendar2.clear(13);
        calendar2.clear(14);
        return calendar.after(calendar2);
    }

    public static boolean isAfterNow(Date date, int i, int i2) {
        if (date == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 59);
        return calendar.after(Calendar.getInstance());
    }

    public static boolean isBeforeDay(Date date, Date date2) {
        if (date == null || date2 == null || isSameDay(date, date2)) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar.clear(11);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar2.clear(11);
        calendar2.clear(12);
        calendar2.clear(13);
        calendar2.clear(14);
        return calendar.before(calendar2);
    }

    public static boolean isSameDay(Date date, Date date2) {
        if (date == null || date2 == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static Date nextWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(4, 1);
        return calendar.getTime();
    }

    public static Date outDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, 6);
        return calendar.getTime();
    }

    public static Date preWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(4, -1);
        return calendar.getTime();
    }

    public static Date formatDate(String str, String str2) {
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getDateInstance();
        simpleDateFormat.applyPattern(str2);
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
