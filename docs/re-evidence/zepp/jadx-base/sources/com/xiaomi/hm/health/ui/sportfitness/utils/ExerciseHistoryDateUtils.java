package com.xiaomi.hm.health.ui.sportfitness.utils;

import android.util.Pair;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.ui.sportfitness.enums.ExerciseTimeFilterType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseHistoryDateUtils {
    private static String[] a(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        if (1 == calendar.get(7)) {
            calendar.add(5, -1);
        }
        calendar.setFirstDayOfWeek(2);
        calendar.add(5, calendar.getFirstDayOfWeek() - calendar.get(7));
        String date2 = TimeUtils.formatDate("yyyy-MM-dd", calendar.getTime());
        calendar.add(5, 6);
        return new String[]{date2, TimeUtils.formatDate("yyyy-MM-dd", calendar.getTime())};
    }

    private static void b(Calendar calendar) {
        calendar.set(11, calendar.getActualMaximum(11));
        calendar.set(12, calendar.getActualMaximum(12));
        calendar.set(13, calendar.getActualMaximum(13));
        calendar.set(14, calendar.getActualMaximum(14));
    }

    public static String formatDate(long timeInMillis) {
        return TimeUtils.formatDate("yyyy-MM-dd", new Date(timeInMillis));
    }

    public static String formatTime(Long timeInMillis) {
        return (timeInMillis == null || timeInMillis.longValue() <= 0) ? "" : TimeUtils.formatDate("yyyy/MM/dd-HH:mm:ss", new Date(timeInMillis.longValue()));
    }

    public static int getDateYearDiff(Date startDate) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar2.setTime(new Date());
        return calendar2.get(1) - calendar.get(1);
    }

    public static Pair<Long, Long> getDayStartEndTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return new Pair<>(Long.valueOf(getStartTime(calendar)), Long.valueOf(getEndTime(calendar)));
    }

    public static long getEndTime(Calendar origin) {
        b(origin);
        return origin.getTimeInMillis();
    }

    public static Pair<Long, Long> getMonthStartEndTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.getActualMinimum(5));
        resetCalendarTimeToEarliest(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(5, calendar.getActualMaximum(5));
        b(calendar);
        return new Pair<>(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
    }

    public static Pair<String, String> getMonthStartEndTimeStr(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.getActualMinimum(5));
        resetCalendarTimeToEarliest(calendar);
        calendar.setTime(HealthDataTimeUtils.INSTANCE.getTimeAfterRegister(calendar.getTime()));
        String date2 = formatDate(calendar.getTimeInMillis());
        calendar.set(5, calendar.getActualMaximum(5));
        b(calendar);
        Calendar calendar2 = Calendar.getInstance();
        if (calendar.after(calendar2)) {
            calendar = calendar2;
        }
        return new Pair<>(date2, formatDate(calendar.getTimeInMillis()));
    }

    public static ExerciseTimeFilterType getProperTimeFilterTypeByLatestSportTime(long latestRecordTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(latestRecordTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String str = simpleDateFormat.format(calendar.getTime());
        Calendar calendar2 = Calendar.getInstance();
        int i = calendar2.get(7);
        if (i != 1) {
            calendar2.add(5, 2 - i);
        } else {
            calendar2.add(5, i - 7);
        }
        if (str.compareTo(simpleDateFormat.format(calendar2.getTime())) >= 0) {
            return ExerciseTimeFilterType.WEEK;
        }
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(5, 1);
        if (str.compareTo(simpleDateFormat.format(calendar3.getTime())) >= 0) {
            return ExerciseTimeFilterType.MONTH;
        }
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(6, 1);
        return str.compareTo(simpleDateFormat.format(calendar4.getTime())) >= 0 ? ExerciseTimeFilterType.YEAR : ExerciseTimeFilterType.ALL;
    }

    public static long getStartTime(Calendar origin) {
        resetCalendarTimeToEarliest(origin);
        return origin.getTimeInMillis();
    }

    public static Pair<Long, Long> getWeekStartEndTime(Date date) {
        String[] strArrA = a(date);
        long stringToLong = TimeUtils.parseStringToLong("yyyy-MM-dd", strArrA[0]);
        long stringToLong2 = TimeUtils.parseStringToLong("yyyy-MM-dd", strArrA[1]);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(stringToLong);
        resetCalendarTimeToEarliest(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(stringToLong2);
        b(calendar);
        return new Pair<>(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
    }

    public static Pair<Long, Long> getYearStartEndTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(6, calendar.getActualMinimum(6));
        resetCalendarTimeToEarliest(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(6, calendar.getActualMaximum(6));
        b(calendar);
        return new Pair<>(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
    }

    public static void resetCalendarTimeToEarliest(Calendar calendar) {
        calendar.set(11, calendar.getActualMinimum(11));
        calendar.set(12, calendar.getActualMinimum(12));
        calendar.set(13, calendar.getActualMinimum(13));
        calendar.set(14, calendar.getActualMinimum(14));
    }
}
