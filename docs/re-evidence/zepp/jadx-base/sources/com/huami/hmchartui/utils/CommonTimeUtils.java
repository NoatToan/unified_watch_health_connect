package com.huami.hmchartui.utils;

import android.content.Context;
import com.huami.hmchartui.R;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b9\u0010:J)\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002J&\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u001e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006J\u0016\u0010$\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010$\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010%\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010&\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010'\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010(\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010/\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u00100\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006J\u0016\u00101\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006J\u000e\u00103\u001a\u00020\"2\u0006\u00102\u001a\u00020\u0006R\u001c\u00108\u001a\u00020\"8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/huami/hmchartui/utils/CommonTimeUtils;", "", "", "time", "Ljava/util/Date;", "registerDateTime", "", SleepAnalysisFragment.TIME_MODE, "getDifferFromRegisterDay", "(JLjava/util/Date;Ljava/lang/Integer;)I", "offset", "getTimeFromRegisterDay", "startTime", "", "next", "getTimeFromStartTime", "timeStart", "timeEnd", "differDays", "differWeeks", "differMonths", "differYear", "days", "offsetDay", "weeks", "offsetWeek", "months", "offsetMonth", "years", "offsetYear", "getDayStartTime", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "timeType", "", "getTimeToUi", "formatTimeYMDHour", "formatTimeYMD", "formatTimeYM", "getMonth", "getYear", "getFirstDayOfWeekTime", "getDayEndTime", "getLastDayOfWeekTime", "getLastDayOfMonthTime", "getLastDayOfYearTime", "getFirstDayOfMonthTime", "getFirstDayOfYearTime", "getEndTime", "getStartTime", "minutes", "formatTimeHM", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final class CommonTimeUtils {

    @NotNull
    public static final CommonTimeUtils INSTANCE = new CommonTimeUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "CalorieTimeUtils";

    private CommonTimeUtils() {
    }

    public static /* synthetic */ int getDifferFromRegisterDay$default(CommonTimeUtils commonTimeUtils, long j, Date date, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return commonTimeUtils.getDifferFromRegisterDay(j, date, num);
    }

    public final int differDays(@NotNull Date timeStart, @NotNull Date timeEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeStart);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(timeEnd);
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(1);
        int i5 = 0;
        if (i3 < i4) {
            if (i3 < i4) {
                while (true) {
                    int i6 = i3 + 1;
                    i5 += ((i3 % 4 != 0 || i3 % 100 == 0) && i3 % 400 != 0) ? 365 : 366;
                    if (i6 >= i4) {
                        break;
                    }
                    i3 = i6;
                }
            }
        } else if (i3 > i4 && i4 < i3) {
            while (true) {
                int i7 = i4 + 1;
                i5 += ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) ? -365 : -366;
                if (i7 >= i3) {
                    break;
                }
                i4 = i7;
            }
        }
        return i5 + (i2 - i);
    }

    public final int differMonths(@NotNull Date timeStart, @NotNull Date timeEnd) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeStart);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(timeEnd);
        if (calendar.get(1) == calendar2.get(1)) {
            i = calendar2.get(2) - calendar.get(2);
        } else {
            i = (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
        }
        HMLog.d(TAG, "differMonths:" + i, new Object[0]);
        return i;
    }

    public final int differWeeks(@NotNull Date timeStart, @NotNull Date timeEnd) {
        long firstDayOfWeekTime = getFirstDayOfWeekTime(timeStart.getTime());
        long firstDayOfWeekTime2 = getFirstDayOfWeekTime(timeEnd.getTime());
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.setTimeInMillis(firstDayOfWeekTime);
        Unit unit = Unit.INSTANCE;
        Date time = calendar.getTime();
        calendar.setTimeInMillis(firstDayOfWeekTime2);
        return differDays(time, calendar.getTime()) / 7;
    }

    public final int differYear(@NotNull Date timeStart, @NotNull Date timeEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeStart);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(timeEnd);
        int i = calendar2.get(1) - calendar.get(1);
        HMLog.d(TAG, "differYear:" + i, new Object[0]);
        return i;
    }

    @NotNull
    public final String formatTimeHM(int minutes) {
        String strValueOf = String.valueOf(minutes / 60);
        String strValueOf2 = String.valueOf(minutes % 60);
        if (strValueOf.length() == 1 && strValueOf2.length() == 1) {
            return "0" + strValueOf + ":0" + strValueOf2 + ":00";
        }
        if (strValueOf.length() == 1 && strValueOf2.length() > 1) {
            return "0" + strValueOf + ":" + strValueOf2 + ":00";
        }
        if (strValueOf.length() <= 1 || strValueOf2.length() != 1) {
            return strValueOf + ":" + strValueOf2 + ":00";
        }
        return strValueOf + ":0" + strValueOf2 + ":00";
    }

    @NotNull
    public final String formatTimeYM(@NotNull Context context, long time) {
        return new SimpleDateFormat(context.getString(R.string.date_yM_unit_pattern_escape), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYMD(@NotNull Context context, long time) {
        return TimeUtils.formatDate(context.getString(R.string.date_yMd_pattern_escape), time);
    }

    @NotNull
    public final String formatTimeYMDHour(@NotNull Context context, long time) {
        String formatTime$default = HMDataFormatKt.getFormatTime$default(time, HMDataFormatKt.adaptHMPattern(HMPattern.YEAR_ABBR_MONTH_DAY, time), (Locale) null, 2, (Object) null);
        HMPattern hMPattern = HMPattern.HOUR_MINUTE;
        return formatTime$default + " " + HMDataFormatKt.getFormatTime$default(time, hMPattern, (Locale) null, 2, (Object) null) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + HMDataFormatKt.getFormatTime$default(((long) 3600000) + time, hMPattern, (Locale) null, 2, (Object) null);
    }

    public final long getDayEndTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public final long getDayStartTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final int getDifferFromRegisterDay(long time, @NotNull Date registerDateTime, @Nullable Integer timeMode) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        Date time2 = calendar.getTime();
        if (timeMode != null && timeMode.intValue() == 17) {
            return differWeeks(registerDateTime, time2);
        }
        if (timeMode != null && timeMode.intValue() == 18) {
            return differMonths(registerDateTime, time2);
        }
        return (timeMode != null && timeMode.intValue() == 19) ? differYear(registerDateTime, time2) : differDays(registerDateTime, time2);
    }

    public final long getEndTime(long startTime, int timeType) {
        switch (timeType) {
            case 17:
                return getLastDayOfWeekTime(startTime);
            case 18:
                return getLastDayOfMonthTime(startTime);
            case 19:
                return getLastDayOfYearTime(startTime);
            default:
                return startTime;
        }
    }

    public final long getFirstDayOfMonthTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getFirstDayOfWeekTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null) ? 1 : 2);
        calendar.setTimeInMillis(time);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getFirstDayOfYearTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.add(5, 0);
        calendar.set(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getLastDayOfMonthTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public final long getLastDayOfWeekTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null) ? 1 : 2);
        calendar.setTimeInMillis(time);
        calendar.set(7, calendar.getFirstDayOfWeek() + 6);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public final long getLastDayOfYearTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(1);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        calendar.roll(6, -1);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final String getMonth(@NotNull Context context, long time) {
        return formatTimeYM(context, time);
    }

    public final long getStartTime(long startTime, int timeType) {
        switch (timeType) {
            case 17:
                return getFirstDayOfWeekTime(startTime);
            case 18:
                return getFirstDayOfMonthTime(startTime);
            case 19:
                return getFirstDayOfYearTime(startTime);
            default:
                return getDayStartTime(startTime);
        }
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    public final long getTimeFromRegisterDay(int offset, int timeMode, long registerDateTime) {
        return getTimeFromStartTime(offset, timeMode, registerDateTime, true);
    }

    public final long getTimeFromStartTime(int offset, int timeMode, long startTime, boolean next) {
        switch (timeMode) {
            case 17:
                return offsetWeek(startTime, offset, next);
            case 18:
                return offsetMonth(startTime, offset, next);
            case 19:
                return offsetYear(startTime, offset, next);
            default:
                return offsetDay(startTime, offset, next);
        }
    }

    @NotNull
    public final String getTimeToUi(@NotNull Context context, long time, int timeType) {
        StringBuilder sb = new StringBuilder();
        switch (timeType) {
            case 16:
                sb.append(HMDataFormatKt.getFormatTime$default(time, HMDataFormatKt.adaptHMPattern(HMPattern.YEAR_ABBR_MONTH_DAY, time), (Locale) null, 2, (Object) null));
                break;
            case 17:
                long firstDayOfWeekTime = getFirstDayOfWeekTime(time);
                long lastDayOfWeekTime = getLastDayOfWeekTime(time);
                HMPattern hMPattern = HMPattern.YEAR_ABBR_MONTH_DAY;
                sb.append(HMDataFormatKt.getFormatTime$default(firstDayOfWeekTime, HMDataFormatKt.adaptHMPattern(hMPattern, firstDayOfWeekTime), (Locale) null, 2, (Object) null));
                sb.append(" - ");
                sb.append(HMDataFormatKt.getFormatTime$default(lastDayOfWeekTime, HMDataFormatKt.adaptHMPattern(hMPattern, lastDayOfWeekTime), (Locale) null, 2, (Object) null));
                break;
            case 18:
                sb.append(HMDataFormatKt.getFormatTime$default(time, HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null));
                break;
            case 19:
                sb.append(HMDataFormatKt.getFormatTime$default(time, HMPattern.YEAR, (Locale) null, 2, (Object) null));
                break;
            case 20:
                sb.append(formatTimeYMDHour(context, time));
                break;
        }
        return sb.toString();
    }

    @NotNull
    public final String getYear(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return String.valueOf(calendar.get(1));
    }

    public final long offsetDay(long time, int days, boolean next) {
        if (!next) {
            days = -days;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(6, days);
        return calendar.getTimeInMillis();
    }

    public final long offsetMonth(long time, int months, boolean next) {
        if (!next) {
            months = -months;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(2, months);
        return calendar.getTimeInMillis();
    }

    public final long offsetWeek(long time, int weeks, boolean next) {
        if (!next) {
            weeks = -weeks;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(3, weeks);
        return calendar.getTimeInMillis();
    }

    public final long offsetYear(long time, int years, boolean next) {
        if (!next) {
            years = -years;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, years);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final String formatTimeYMDHour(@NotNull Context context, long time, long offset) {
        return TimeUtils.formatDate(context.getString(R.string.date_yMdahhmm_unit_pattern_order_other), time) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + TimeUtils.formatDate(context.getString(R.string.time_HHmm_pattern), time + offset);
    }
}
