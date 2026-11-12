package com.huami.watch.companion.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.watch.companionlib.R;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.I18nUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes16.dex */
public class ChartTimeUtil {
    public static String format(DateDay dateDay) {
        return format(null, dateDay);
    }

    public static String formatDateForDayMode(Context context, DateDay dateDay) {
        if (context == null) {
            return format(dateDay);
        }
        DateDay dateDay2 = DateDay.today();
        Resources resources = context.getResources();
        if (dateDay2.equals(dateDay)) {
            return resources.getString(R.string.current_day);
        }
        if (dateDay.tomorrow().equals(dateDay2)) {
            return resources.getString(R.string.yesterday);
        }
        if (I18nUtil.isCN(context) && dateDay.isWeekStartDay()) {
            return resources.getString(DateDay.sundayIsWeekStart() ? R.string.week_start_sunday : R.string.week_start_monday);
        }
        return format(context, dateDay);
    }

    public static String formatDateForMonthMode(Context context, DateDay dateDay, DateDay dateDay2) {
        if (context == null) {
            return format(dateDay);
        }
        Resources resources = context.getResources();
        DateDay dateDay3 = DateDay.today();
        if (!dateDay3.before(dateDay) && !dateDay3.after(dateDay2)) {
            return resources.getString(R.string.current_month);
        }
        int iYear = dateDay.year();
        if (dateDay.month() == 1) {
            return String.valueOf(iYear);
        }
        return null;
    }

    public static String formatDateForWeekMode(Context context, DateDay dateDay) {
        if (context == null) {
            return format(dateDay);
        }
        DateDay dateDay2 = DateDay.today();
        DateDay dateDayAdd = dateDay.add(6);
        if (!dateDay2.before(dateDay) && !dateDay2.after(dateDayAdd)) {
            return context.getResources().getString(R.string.current_week);
        }
        return format(context, dateDay) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + format(context, dateDayAdd);
    }

    public static String formatForDayTitle(Context context, DateDay dateDay) {
        return context == null ? format(dateDay) : new SimpleDateFormat(context.getString(R.string.date_month_day), Locale.getDefault()).format(dateDay.calendar().getTime());
    }

    public static String formatForMonthTitle(Context context, DateDay dateDay) {
        return context == null ? format(dateDay) : new SimpleDateFormat(context.getString(R.string.date_year_month), Locale.getDefault()).format(dateDay.calendar().getTime());
    }

    public static String formatForWeekTitle(Context context, DateDay dateDay) {
        if (context == null) {
            return format(dateDay);
        }
        return formatForDayTitle(context, dateDay) + " - " + formatForDayTitle(context, dateDay.add(6));
    }

    public static String formatTime(Context context, int i, boolean z) {
        if (i < 0) {
            i += 1440;
        }
        int i2 = i / 60;
        int i3 = i % 60;
        StringBuilder sb = new StringBuilder();
        int i4 = (DateFormat.is24HourFormat(context) || i2 <= 12) ? i2 : i2 - 12;
        if (i4 < 10) {
            sb.append(0);
        }
        sb.append(i4);
        sb.append(":");
        if (i3 < 10) {
            sb.append(0);
        }
        sb.append(i3);
        if (z) {
            String timeUnit = getTimeUnit(context, i2);
            if (!TextUtils.isEmpty(timeUnit)) {
                if (I18nUtil.isZh(context)) {
                    sb.insert(0, timeUnit + " ");
                } else {
                    sb.append(" ");
                    sb.append(timeUnit);
                }
            }
        }
        return sb.toString();
    }

    public static String formatTime24Hour(int i) {
        if (i < 0) {
            i += 1440;
        }
        int i2 = i / 60;
        int i3 = i % 60;
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 < 10) {
            stringBuffer.append("0");
        }
        stringBuffer.append(i2);
        stringBuffer.append(":");
        if (i3 < 10) {
            stringBuffer.append("0");
        }
        stringBuffer.append(i3);
        return stringBuffer.toString();
    }

    public static String getConsumeTime(long j) {
        if (j < 0) {
            return "00:00:00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar calendar = simpleDateFormat.getCalendar();
        calendar.setTimeInMillis(1000 * j);
        return String.format("%1$02d:%2$02d:%3$02d", Integer.valueOf(calendar.get(11) + (((((int) j) / 86400000) / 1000) * 24)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)));
    }

    public static String getFormatDurationTime(long j) {
        if (j < 0) {
            return "00:00:00";
        }
        int i = (int) (j / TimeUtils.TIME_1_HOURS);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return String.format("%1$02d:%2$02d:%3$02d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) (j2 - ((long) (i2 * 60)))));
    }

    public static String getShortConsumeTime(long j) {
        if (j < 0) {
            return "00:00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar calendar = simpleDateFormat.getCalendar();
        calendar.setTimeInMillis(1000 * j);
        int i = calendar.get(11) + (((((int) j) / 86400000) / 1000) * 24);
        int i2 = calendar.get(12);
        int i3 = calendar.get(13);
        if (i > 0) {
            i2 += i * 60;
        }
        return String.format("%1$02d:%2$02d", Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String getTimeUnit(Context context, int i) {
        if (DateFormat.is24HourFormat(context)) {
            return null;
        }
        if (i >= 0 && i <= 4) {
            return context.getString(R.string.unit_week_hour);
        }
        if (i >= 5 && i <= 7) {
            return context.getString(R.string.unit_morning);
        }
        if (i >= 8 && i < 12) {
            return context.getString(R.string.unit_forenoon);
        }
        if (i == 12) {
            return context.getString(R.string.unit_moon);
        }
        if (i >= 13 && i <= 17) {
            return context.getString(R.string.unit_afternoon);
        }
        if (i < 18 || i > 23) {
            return null;
        }
        return context.getString(R.string.unit_evening);
    }

    public static String format(Context context, DateDay dateDay) {
        int iYear = dateDay.year();
        int iMonth = dateDay.month();
        int iDay = dateDay.day();
        if (iMonth != 1 || iDay != 1) {
            return (context == null || !I18nUtil.isSupportDDMM(context)) ? String.format("%1$d/%2$d", Integer.valueOf(iMonth), Integer.valueOf(iDay)) : String.format("%1$d/%2$d", Integer.valueOf(iDay), Integer.valueOf(iMonth));
        }
        return iYear + "";
    }

    public static String formatDateForDayMode(Context context, long j) {
        return formatDateForDayMode(context, DateDay.from(j));
    }

    public static String formatTime(Context context, long j, String str, boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        Date date = new Date(j);
        String str2 = simpleDateFormat.format(date);
        if (!I18nUtil.isZh(context) || z) {
            return str2;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return str2.replace(" ", " " + getTimeUnit(context, calendar.get(11)) + " ");
    }
}
