package com.huawei.hwcommonmodel.utils;

import android.text.format.DateFormat;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class DateFormatUtil {
    public static int a(long j) {
        return a(j, TimeZone.getDefault());
    }

    public static int a(long j, TimeZone timeZone) {
        Calendar calendar = timeZone != null ? Calendar.getInstance(timeZone) : Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
    }

    public static String a(long j, DateFormatType dateFormatType) {
        if (dateFormatType == null) {
            return "";
        }
        return a(j, TimeZone.getDefault(), DateFormat.getBestDateTimePattern(Locale.getDefault(), dateFormatType.getValue()));
    }

    public static String e(long j, TimeZone timeZone, DateFormatType dateFormatType) {
        if (dateFormatType == null) {
            return "";
        }
        return a(j, timeZone, DateFormat.getBestDateTimePattern(Locale.getDefault(), dateFormatType.getValue()));
    }

    public static String d(long j, DateFormatType dateFormatType) {
        if (dateFormatType == null) {
            return "";
        }
        return a(j, TimeZone.getDefault(), dateFormatType.mValue);
    }

    public static String c(long j, String str) {
        if (str == null) {
            return "";
        }
        return a(j, TimeZone.getDefault(), str);
    }

    public static String e(long j, DateFormatType dateFormatType) {
        if (dateFormatType == null) {
            return "";
        }
        return a(j, TimeZone.getDefault(), dateFormatType.mValue, Locale.ENGLISH);
    }

    public static String b(long j, TimeZone timeZone, DateFormatType dateFormatType) {
        if (dateFormatType == null) {
            return "";
        }
        return a(j, timeZone, dateFormatType.mValue);
    }

    private static String a(long j, TimeZone timeZone, String str) {
        return a(j, timeZone, str, Locale.getDefault());
    }

    public static String a(long j, TimeZone timeZone, String str, Locale locale) {
        if (str == null) {
            return "";
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    public static long d(int i) {
        return c(i, TimeZone.getDefault());
    }

    public static long c(int i, TimeZone timeZone) {
        if (i < 10000000 || i > 100000000) {
            return 0L;
        }
        try {
            return b(Integer.toString(i), DateFormatType.DATE_FORMAT_8, timeZone).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static Date d(String str, DateFormatType dateFormatType) throws ParseException {
        return b(str, dateFormatType, TimeZone.getDefault());
    }

    public static Date b(String str, DateFormatType dateFormatType, TimeZone timeZone) throws ParseException {
        if (dateFormatType == null) {
            return new Date();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormatType.mValue, Locale.getDefault());
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        simpleDateFormat.setLenient(false);
        return simpleDateFormat.parse(str);
    }

    public enum DateFormatType {
        DEFAULT_DATE_FORMAT("yyyy-MM-dd HH:mm:ss"),
        DATE_FORMAT_YEAR("yyyy"),
        DATE_FORMAT_6("yyyyMM"),
        DATE_FORMAT_8("yyyyMMdd"),
        DATE_FORMAT_12("yyyyMMddHHmm"),
        DATE_FORMAT_14(HwDrmConstant.TIME_FORMAT),
        DATE_FORMAT_17("yyyyMMddHHmmssSSS"),
        DATE_FORMAT_MILS("yyyy-MM-dd HH:mm:ss:SSS"),
        DATE_FORMAT_MINUTE("yyyy-MM-dd HH:mm"),
        DATE_FORMAT_YYYYMD("yyyy/M/d"),
        DATE_FORMAT_MD("M/d"),
        DATE_FORMAT_YYYY_MM_DD("yyyy-MM-dd"),
        DATE_FORMAT_RFC_TIME_ZONE("Z"),
        DATE_FORMAT_MONTH_DAY_S("M-d"),
        DATE_FORMAT_MONTH_DAY("MM-dd"),
        DATE_FORMAT_YEAR_MONTH_S("yyyy-M"),
        DATE_FORMAT_YEAR_MONTH("yyyy-MM"),
        DATE_FORMAT_MONTH_DAY_MD("M/d"),
        DATE_FORMAT_MONTH_DAY_HH_MM("M/d HH:mm"),
        DATE_FORMAT_YYYYMMDD("yyyy/MM/dd"),
        DATE_FORMAT_YYYYMMDD_POINT("yyyy.MM.dd"),
        DATE_FORMAT_HOUR_MINUTE("HH:mm"),
        DATE_FORMAT_HOUR_MINUTE_SEC(Constants.TIME_FORMAT_WITHOUT_MILLS),
        DATE_FORMAT_WEEK("EE"),
        DATE_FORMAT_YMD_HM("yyyy/MM/dd HH:mm"),
        DATE_FORMAT_YMD_HM2("yyyy/M/dd HH:mm"),
        DATE_FORMAT_DMY("dd/MM/yyyy"),
        DATE_FORMAT_MDY("MM/dd/yyyy");

        String mValue;

        DateFormatType(String str) {
            this.mValue = str;
        }

        public String getValue() {
            return this.mValue;
        }
    }
}
