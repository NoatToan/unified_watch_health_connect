package com.xiaomi.hm.health.baseutil;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.btdata.R;
import defpackage.ru;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class TimeUtils {
    private static final int TIME_LEVEL_0 = 300;
    private static final int TIME_LEVEL_1 = 480;
    private static final int TIME_LEVEL_2 = 660;
    private static final int TIME_LEVEL_3 = 780;
    private static final int TIME_LEVEL_4 = 1080;
    private static final int TIME_LEVEL_5 = 1440;

    public static String adformatDate_y(Context context, Date date, boolean z) {
        Calendar.getInstance().setTime(date);
        return new SimpleDateFormat(z ? context.getString(R.string.date_ad_race_type) : context.getString(R.string.date_ad_race_type_y), Locale.getDefault()).format(date);
    }

    private static Calendar dayBegin(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    private static Calendar dayEnd(Calendar calendar) {
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar;
    }

    public static String debugTime(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(j));
    }

    public static String formatDate(String str, Date date) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(date);
    }

    public static String formatDate12Hour(Context context, Date date) {
        return new SimpleDateFormat(context.getString(R.string.time_hhmm_pattern), Locale.getDefault()).format(date);
    }

    public static String formatDateTime(Context context, Date date, boolean z) {
        return context.getString(R.string.date_time_format_one, formatDate(context, date, z), formatTime(context, date));
    }

    public static String formatDateTimeX(Context context, Date date) {
        return formatDate(context, date, ru.f32899a.a());
    }

    public static String formatDateTime_no_y(Context context, Date date, boolean z) {
        return context.getString(R.string.date_time_format_one, formatDate_no_y(context, date, z), formatTime(context, date));
    }

    public static String formatDateTime_y(Context context, Date date) {
        return context.getString(R.string.date_time_format_one, formatDate_y(context, date), formatTime(context, date));
    }

    public static String formatDateTime_y_12(Context context, Date date) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.setTime(date);
        return new SimpleDateFormat(i - calendar.get(1) == 0 ? context.getString(R.string.date_Mdahhmm_unit_pattern) : context.getString(R.string.date_yMdahhmm_unit_pattern), Locale.getDefault()).format(date);
    }

    public static String formatDateTime_y_12_order(Context context, Date date) {
        Calendar.getInstance().setTime(date);
        return new SimpleDateFormat(context.getString(R.string.date_yMdahhmm_unit_pattern_order), Locale.getDefault()).format(date);
    }

    public static String formatDateWithWeek(Context context, Date date) {
        return new SimpleDateFormat(context.getString(R.string.date_yMdw_pattern), Locale.getDefault()).format(date);
    }

    public static String formatDateWithoutYear(Context context, Date date) {
        return context.getString(R.string.date_time_format_one, new SimpleDateFormat(context.getString(R.string.date_MMMMd_pattern), Locale.getDefault()).format(date), formatTime(context, date));
    }

    public static String formatDateYmd(Context context, Date date) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.setTime(date);
        return new SimpleDateFormat(i - calendar.get(1) == 0 ? context.getString(R.string.date_Md_pattern) : context.getString(R.string.date_yMd_pattern), Locale.getDefault()).format(date);
    }

    public static String formatDate_E(Context context, Date date, boolean z, boolean z2) {
        String[] strArr = new String[2];
        if (isToday(date) && z2) {
            strArr[0] = context.getString(R.string.unit_today);
            strArr[1] = formatDate_no_y(context, date, z);
        } else {
            strArr[0] = "";
            strArr[1] = new SimpleDateFormat(context.getString(R.string.date_EMd_unit_pattern), Locale.getDefault()).format(date);
        }
        return TextUtils.isEmpty(strArr[0]) ? strArr[1] : context.getString(R.string.today_date_format, strArr[0], strArr[1]);
    }

    public static String formatDate_no_d(Context context, Date date) {
        return new SimpleDateFormat(context.getString(R.string.date_yM_unit_pattern), Locale.getDefault()).format(date);
    }

    public static String formatDate_no_y(Context context, Date date, boolean z) {
        return new SimpleDateFormat(z ? context.getString(R.string.date_Md_pattern) : context.getString(R.string.date_Md_unit_pattern), Locale.getDefault()).format(date);
    }

    public static String formatDate_y(Context context, Date date) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.setTime(date);
        return new SimpleDateFormat(i - calendar.get(1) == 0 ? context.getString(R.string.date_Md_unit_pattern) : context.getString(R.string.date_yMd_unit_pattern), Locale.getDefault()).format(date);
    }

    public static String formatMilliSecondTime(Context context, Long l) {
        return formatMinTime(context, getMilliSecondDate(l));
    }

    public static String formatMilliSecondTimePart(Context context, Long l) {
        return formatMinTimePart(context, getMilliSecondDate(l));
    }

    public static String formatMinTime(Context context, int i) {
        return formatMinTime(context, getDate(i));
    }

    public static String formatMinTimePart(Context context, int i) {
        return formatMinTimePart(context, getDate(i));
    }

    public static String formatSecondTime(Context context, Long l) {
        return formatMinTime(context, getSecondDate(l));
    }

    public static String formatSecondTimePart(Context context, Long l) {
        return formatMinTimePart(context, getSecondDate(l));
    }

    public static String formatShortDateWithShortTime(Context context, Date date) {
        return new SimpleDateFormat(context.getString(R.string.date_Mdhm_pattern), Locale.getDefault()).format(date);
    }

    public static String formatTime(Context context, Date date) {
        String[] strArr = new String[2];
        String string = "";
        if (DateFormat.is24HourFormat(context.getApplicationContext())) {
            strArr[0] = "";
            string = context.getString(R.string.time_HHmm_pattern);
        } else if (Language.isChinese()) {
            strArr[0] = getPrefix_zh(context, date);
            strArr[1] = formatTime_zh(date);
        } else {
            strArr[0] = "";
            string = context.getString(R.string.time_hhmma_pattern);
        }
        if (TextUtils.isEmpty(strArr[1])) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string, Locale.getDefault());
            if (Language.isThai()) {
                simpleDateFormat = new SimpleDateFormat(string, Locale.US);
            }
            strArr[1] = simpleDateFormat.format(date);
        }
        return TextUtils.isEmpty(strArr[0]) ? strArr[1] : String.format("%s %s", strArr[0], strArr[1]);
    }

    public static String formatTime_s(Context context, Date date) {
        String[] strArr = new String[2];
        String string = "";
        if (DateFormat.is24HourFormat(context.getApplicationContext())) {
            strArr[0] = "";
            string = context.getString(R.string.time_HHmmss_pattern);
        } else if (Language.isChinese()) {
            strArr[0] = getPrefix_zh(context, date);
            strArr[1] = formatTime_zh_s(date);
        } else {
            strArr[0] = "";
            string = context.getString(R.string.time_hhmmssa_pattern);
        }
        if (TextUtils.isEmpty(strArr[1])) {
            strArr[1] = new SimpleDateFormat(string, Locale.getDefault()).format(date);
        }
        return TextUtils.isEmpty(strArr[0]) ? strArr[1] : String.format("%s %s", strArr[0], strArr[1]);
    }

    public static String formatTime_zh(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH", Locale.getDefault());
        if (Integer.parseInt(simpleDateFormat.format(date)) != 0) {
            simpleDateFormat.applyPattern("hh:mm");
            return simpleDateFormat.format(date);
        }
        simpleDateFormat.applyPattern("mm");
        return "00:" + simpleDateFormat.format(date);
    }

    public static String formatTime_zh_s(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH", Locale.getDefault());
        if (Integer.parseInt(simpleDateFormat.format(date)) != 0) {
            simpleDateFormat.applyPattern("hh:mm:ss");
            return simpleDateFormat.format(date);
        }
        simpleDateFormat.applyPattern("mm:ss");
        return "00:" + simpleDateFormat.format(date);
    }

    public static Date getDataForMonthAndDay(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, i2);
        calendar.set(2, i - 1);
        return calendar.getTime();
    }

    public static Date getDate(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i / 60);
        calendar.set(12, i % 60);
        return calendar.getTime();
    }

    public static int getDeltaDayCount(Calendar calendar, Calendar calendar2) {
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(calendar.getTimeInMillis());
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTimeInMillis(calendar2.getTimeInMillis());
        calendar4.set(11, 0);
        calendar4.set(12, 0);
        calendar4.set(13, 0);
        calendar4.set(14, 0);
        return (int) ((calendar4.getTimeInMillis() - calendar3.getTimeInMillis()) / 86400000);
    }

    public static int getDifferMonth(Calendar calendar, Calendar calendar2) {
        return Math.abs(((calendar2.get(1) - calendar.get(1)) * 12) + (calendar2.get(2) - calendar.get(2)));
    }

    public static int getDifferWeek(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(3);
        return ((calendar2.get(1) - calendar.get(1)) * 52) + (calendar2.get(3) - i);
    }

    public static Date getMilliSecondDate(Long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l.longValue());
        return calendar.getTime();
    }

    public static int getMin(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static String getPrefix(Date date) {
        return new SimpleDateFormat(PluginDeviceInfo.FMODEL, Locale.getDefault()).format(date);
    }

    public static String getPrefix_zh(Context context, Date date) {
        int min = getMin(date);
        if (min >= 0 && min < 300) {
            return context.getString(R.string.unit_week_hour);
        }
        if (300 <= min && min < 480) {
            return context.getString(R.string.unit_morning);
        }
        if (480 <= min && min < TIME_LEVEL_2) {
            return context.getString(R.string.unit_forenoon);
        }
        if (TIME_LEVEL_2 <= min && min < TIME_LEVEL_3) {
            return context.getString(R.string.unit_moon);
        }
        if (TIME_LEVEL_3 > min || min >= 1080) {
            return (1080 > min || min >= TIME_LEVEL_5) ? "" : context.getString(R.string.unit_evening);
        }
        return context.getString(R.string.unit_afternoon);
    }

    public static Date getSecondDate(Long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l.longValue() * 1000);
        return calendar.getTime();
    }

    public static boolean isNatureDay(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);
        calendar2.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        return j >= calendar.getTime().getTime() && j <= calendar2.getTime().getTime();
    }

    private static boolean isTheDay(Calendar calendar, Calendar calendar2) {
        return calendar2.getTimeInMillis() >= dayBegin(calendar).getTimeInMillis() && calendar2.getTimeInMillis() <= dayEnd(calendar).getTimeInMillis();
    }

    public static boolean isTheSameDay(long j, long j2) {
        return (j + ((long) TimeZone.getDefault().getOffset(j))) / 86400000 == (j2 + ((long) TimeZone.getDefault().getOffset(j2))) / 86400000;
    }

    public static boolean isToday(Calendar calendar) {
        return isTheDay(Calendar.getInstance(), calendar);
    }

    public static Date parseStringToDate(String str, String str2) {
        try {
            return new SimpleDateFormat(str, Locale.getDefault()).parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long parseStringToLong(String str, String str2) {
        Date stringToDate = parseStringToDate(str, str2);
        if (stringToDate != null) {
            return stringToDate.getTime();
        }
        return 0L;
    }

    public static Date transformTime(Date date, TimeZone timeZone, TimeZone timeZone2) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime() - ((long) (timeZone.getRawOffset() - timeZone2.getRawOffset())));
    }

    public static boolean isToday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isTheDay(Calendar.getInstance(), calendar);
    }

    public static String formatDate(String str, long j) {
        return formatDate(str, new Date(j));
    }

    public static String formatMinTime(Context context, Date date) {
        String string;
        String time_zh = "";
        if (Language.isChinese()) {
            time_zh = formatTime_zh(date);
            string = "";
        } else {
            string = context.getString(R.string.time_hhmma_pattern);
        }
        return TextUtils.isEmpty(time_zh) ? new SimpleDateFormat(string, Locale.getDefault()).format(date) : time_zh;
    }

    public static String formatMinTimePart(Context context, Date date) {
        if (Language.isChinese()) {
            return getPrefix_zh(context, date);
        }
        return "";
    }

    public static String formatDateTime(Context context, Date date) {
        return context.getString(R.string.date_time_format_one, formatDate(context, date), formatTime(context, date));
    }

    public static String formatDateTime_no_y(Context context, long j, boolean z) {
        return formatDateTime_no_y(context, new Date(j), z);
    }

    public static String formatDateTime_y(Context context, long j) {
        Date date = new Date(j);
        return context.getString(R.string.date_time_format_one, formatDate_y(context, date), formatTime(context, date));
    }

    public static String formatDate_no_d(Context context, long j) {
        return formatDate_no_d(context, new Date(j));
    }

    public static int getDifferMonth(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        calendar2.setTime(date2);
        return getDifferMonth(calendar, calendar2);
    }

    public static int getDifferWeek(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        calendar2.setTime(date2);
        return getDifferWeek(calendar, calendar2);
    }

    public static String formatDate(Context context, Date date) {
        return formatDate(context, date, Locale.getDefault());
    }

    public static String formatDate_no_y(Context context, long j, boolean z) {
        return formatDate_no_y(context, new Date(j), z);
    }

    public static boolean isToday(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return isTheDay(Calendar.getInstance(), calendar);
    }

    public static String formatDate(Context context, long j) {
        return formatDate(context, new Date(j));
    }

    public static String formatDateTime(Context context, long j) {
        return formatDateTime(context, new Date(j));
    }

    public static String formatDate(Context context, Date date, Locale locale) {
        return new SimpleDateFormat(context.getString(R.string.date_yMd_unit_pattern), locale).format(date);
    }

    public static String formatDate_E(Context context, long j, boolean z, boolean z2) {
        return formatDate_E(context, new Date(j), z, z2);
    }

    public static String formatDate(Context context, Date date, boolean z) {
        return new SimpleDateFormat(context.getString(z ? R.string.date_yMd_pattern : R.string.date_yMd_unit_pattern), Locale.getDefault()).format(date);
    }

    public static String formatTime_s(Context context, long j) {
        return formatTime_s(context, new Date(j));
    }

    public static int getDeltaDayCount(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return getDeltaDayCount(calendar, calendar2);
    }

    public static String formatTime(Context context, long j) {
        return formatTime(context, new Date(j));
    }

    public static String formatTime_s(Context context, int i) {
        return formatTime_s(context, getDate(i));
    }

    public static String formatTime(Context context, int i) {
        return formatTime(context, getDate(i));
    }

    public static String formatTime(Context context, Date date, boolean z) {
        String[] strArr = new String[2];
        String string = "";
        if (z) {
            strArr[0] = "";
            string = context.getString(R.string.time_HHmm_pattern);
        } else if (Language.isChinese()) {
            strArr[0] = getPrefix_zh(context, date);
            strArr[1] = formatTime_zh(date);
        } else {
            strArr[0] = "";
            string = context.getString(R.string.time_hhmma_pattern);
        }
        if (TextUtils.isEmpty(strArr[1])) {
            strArr[1] = new SimpleDateFormat(string, Locale.getDefault()).format(date);
        }
        return TextUtils.isEmpty(strArr[0]) ? strArr[1] : String.format("%s %s", strArr[0], strArr[1]);
    }

    public static String formatTime(Context context, long j, boolean z) {
        return formatTime(context, new Date(j), z);
    }
}
