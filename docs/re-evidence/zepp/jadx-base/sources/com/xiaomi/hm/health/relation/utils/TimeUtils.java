package com.xiaomi.hm.health.relation.utils;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.relation.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public class TimeUtils {
    private static final int a = 300;
    private static final int b = 480;
    private static final int c = 660;
    private static final int d = 780;
    private static final int e = 1080;
    private static final int f = 1440;

    public static String formatDate(Context context, Date date) {
        return HMDataFormatKt.getFormatTime(date, HMPattern.YEAR_ABBR_MONTH_DAY, Locale.getDefault());
    }

    public static String formatDateTime(Context context, long j) {
        return formatDateTime(context, new Date(j));
    }

    public static String formatDateTime_y(Context context, long j) {
        Date date = new Date(j);
        return context.getString(R.string.relatives_date_time_format_one, formatDate_y(context, date), formatTime(context, date));
    }

    public static String formatDate_no_y(Context context, long j, boolean z) {
        return formatDate_no_y(context, new Date(j), z);
    }

    public static String formatDate_y(Context context, Date date) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.setTime(date);
        return i - calendar.get(1) == 0 ? HMDataFormatKt.getFormatTime(date, HMPattern.ABBR_MONTH_DAY, Locale.getDefault()) : HMDataFormatKt.getFormatTime(date, HMPattern.YEAR_ABBR_MONTH_DAY, Locale.getDefault());
    }

    public static String formatTime(Context context, Date date) {
        String[] strArr = new String[2];
        String string = "";
        if (DateFormat.is24HourFormat(context.getApplicationContext())) {
            strArr[0] = "";
            string = context.getString(R.string.relatives_time_HHmm_pattern);
        } else if (Language.isChinese()) {
            strArr[0] = getPrefix_zh(context, date);
            strArr[1] = formatTime_zh(date);
        } else {
            strArr[0] = "";
            string = context.getString(R.string.relatives_time_hhmma_pattern);
        }
        if (TextUtils.isEmpty(strArr[1])) {
            strArr[1] = new SimpleDateFormat(string, Locale.getDefault()).format(date);
        }
        return TextUtils.isEmpty(strArr[0]) ? strArr[1] : String.format("%s %s", strArr[0], strArr[1]);
    }

    public static String formatTime_zh(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH", Locale.getDefault());
        if (Integer.valueOf(simpleDateFormat.format(date)).intValue() != 0) {
            simpleDateFormat.applyPattern("hh:mm");
            return simpleDateFormat.format(date);
        }
        simpleDateFormat.applyPattern(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
        return "00:" + simpleDateFormat.format(date);
    }

    public static int getMin(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static String getPrefix_zh(Context context, Date date) {
        int min = getMin(date);
        if (min >= 0 && min < 300) {
            return context.getString(R.string.relatives_unit_week_hour);
        }
        if (300 <= min && min < 480) {
            return context.getString(R.string.relatives_unit_morning);
        }
        if (480 <= min && min < c) {
            return context.getString(R.string.relatives_unit_forenoon);
        }
        if (c <= min && min < d) {
            return context.getString(R.string.relatives_unit_moon);
        }
        if (d > min || min >= e) {
            return (e > min || min >= 1440) ? "" : context.getString(R.string.relatives_unit_evening);
        }
        return context.getString(R.string.relatives_unit_afternoon);
    }

    public static Date transformTime(Date date, TimeZone timeZone, TimeZone timeZone2) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime() - ((long) (timeZone.getRawOffset() - timeZone2.getRawOffset())));
    }

    public static String formatDateTime(Context context, Date date) {
        return context.getString(R.string.relatives_date_time_format_one, formatDate(context, date), formatTime(context, date));
    }

    public static String formatDate_no_y(Context context, Date date, boolean z) {
        String string;
        if (z) {
            string = context.getString(R.string.relatives_date_Md_pattern);
        } else {
            string = context.getString(R.string.relatives_date_Md_unit_pattern);
        }
        return new SimpleDateFormat(string, Locale.getDefault()).format(date);
    }

    public static String formatDateTime_y(Context context, Date date) {
        return context.getString(R.string.relatives_date_time_format_one, formatDate_y(context, date), formatTime(context, date));
    }
}
