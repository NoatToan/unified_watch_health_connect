package com.huawei.phoneservice.faq.base.util;

import android.content.Context;
import android.text.format.DateUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class m {
    public static String b(String str, Context context) {
        String strE = !k.b(str) ? e(e(e(str)), context) : "";
        return k.b(strE) ? "" : strE;
    }

    public static long b(String str) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str).getTime();
    }

    private static Date d(String str, String str2) {
        if (str2 == null || str == null) {
            return null;
        }
        try {
            return new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
        } catch (ParseException unused) {
            g.c("TimeStringUtil", "convertStringToDate ParseException Exception ...");
            return null;
        }
    }

    public static Date e(String str) {
        Date dateD = d(str, "yyyy-M-d");
        return dateD == null ? d(str, "yyyy/M/d") : dateD;
    }

    private static Calendar e(Date date) {
        if (date == null) {
            g.e("TimeStringUtil", "convertDateToCalendar::date is null");
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    private static String b(Calendar calendar, Context context, int i) {
        if (context == null || calendar == null) {
            g.e("TimeStringUtil", "convertCalendarToString::context or calendar is null");
            return null;
        }
        try {
            return DateUtils.formatDateTime(context, calendar.getTimeInMillis(), i);
        } catch (IllegalArgumentException unused) {
            g.c("TimeStringUtil", "get formatTime error");
            return null;
        }
    }

    private static String e(Calendar calendar, Context context) {
        return b(calendar, context, 196628);
    }
}
