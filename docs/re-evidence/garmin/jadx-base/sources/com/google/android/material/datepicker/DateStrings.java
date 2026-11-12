package com.google.android.material.datepicker;

import android.content.Context;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import k7.d;

/* JADX INFO: loaded from: classes14.dex */
class DateStrings {
    private DateStrings() {
    }

    public static d<String, String> getDateRangeString(Long l14, Long l15, SimpleDateFormat simpleDateFormat) {
        if (l14 == null && l15 == null) {
            return new d<>(null, null);
        }
        if (l14 == null) {
            return new d<>(null, getDateString(l15.longValue(), simpleDateFormat));
        }
        if (l15 == null) {
            return new d<>(getDateString(l14.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l14.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l15.longValue());
        if (simpleDateFormat != null) {
            return new d<>(simpleDateFormat.format(new Date(l14.longValue())), simpleDateFormat.format(new Date(l15.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            return utcCalendar.get(1) == todayCalendar.get(1) ? new d<>(getMonthDay(l14.longValue(), Locale.getDefault()), getMonthDay(l15.longValue(), Locale.getDefault())) : new d<>(getMonthDay(l14.longValue(), Locale.getDefault()), getYearMonthDay(l15.longValue(), Locale.getDefault()));
        }
        return new d<>(getYearMonthDay(l14.longValue(), Locale.getDefault()), getYearMonthDay(l15.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j8, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j8));
        }
        return isDateWithinCurrentYear(j8) ? getMonthDay(j8) : getYearMonthDay(j8);
    }

    public static String getDayContentDescription(Context context, long j8, boolean z14, boolean z15, boolean z16) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j8);
        if (z14) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        if (z15) {
            return String.format(context.getString(R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay);
        }
        return z16 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    public static String getMonthDay(long j8, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j8));
    }

    public static String getMonthDayOfWeekDay(long j8, Locale locale) {
        return UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j8));
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j8) {
        return isDateWithinCurrentYear(j8) ? getMonthDayOfWeekDay(j8) : getYearMonthDayOfWeekDay(j8);
    }

    public static String getYearContentDescription(Context context, int i14) {
        return UtcDates.getTodayCalendar().get(1) == i14 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i14)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i14));
    }

    public static String getYearMonth(long j8) {
        return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j8));
    }

    public static String getYearMonthDay(long j8, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j8));
    }

    public static String getYearMonthDayOfWeekDay(long j8, Locale locale) {
        return UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j8));
    }

    private static boolean isDateWithinCurrentYear(long j8) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j8);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    public static String getMonthDay(long j8) {
        return getMonthDay(j8, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j8) {
        return getMonthDayOfWeekDay(j8, Locale.getDefault());
    }

    public static String getYearMonthDay(long j8) {
        return getYearMonthDay(j8, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j8) {
        return getYearMonthDayOfWeekDay(j8, Locale.getDefault());
    }

    public static String getDateString(long j8) {
        return getDateString(j8, null);
    }

    public static d<String, String> getDateRangeString(Long l14, Long l15) {
        return getDateRangeString(l14, l15, null);
    }
}
