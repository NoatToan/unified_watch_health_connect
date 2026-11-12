package com.huami.heartrate.utils;

import android.content.Context;
import com.huami.heartrate.R;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J)\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u001e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\"\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\tJ\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010-\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010/\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u00100\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u00102\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\tJ\u0016\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\tJ\u000e\u00108\u001a\u00020\u00022\u0006\u00107\u001a\u00020\tJ\u0016\u0010:\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u00109\u001a\u00020\tJ\u0016\u0010<\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\tJ\u000e\u0010=\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010?\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005J\u0010\u0010@\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u000fJ\u001e\u0010F\u001a\u00020\u00172\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005R\u001c\u0010J\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/huami/heartrate/utils/HeartRateTimeUtils;", "", "", "date", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "a", "time", "registerDateTime", "", SleepAnalysisFragment.TIME_MODE, "getDifferFromRegisterDay", "(JJLjava/lang/Integer;)I", "offset", "getTimeFromRegisterDay", "Ljava/util/Date;", "timeStart", "timeEnd", "differDays", "differWeeks", "differMonths", "differYear", "days", "", "next", "offsetDay", "weeks", "offsetWeek", "months", "offsetMonth", "years", "offsetYear", "getDayStartTime", "timeType", "getTimeToUi", "formatTimeYMDHour", "formatTimeYMDMin", "formatDate", "parseDate", "formatTimeYMDm", "formatTimeYMD", "formatTimeYM", "formatTimeMD", "getMonth", "getYear", "getFirstDayOfWeekTime", "getDayEndTime", "getLastDayOfWeekTime", "getLastDayOfMonthTime", "getLastDayOfYearTime", "getFirstDayOfMonthTime", "getFirstDayOfYearTime", "startTime", "getEndTime", "getStartTime", "minutes", "formatTimeHM", "index", "getTimeByIndex", "position", "getTimeByPosition", "yMToTimestamp", "yMDToTimestamp", "getChinaDateString", "getChinaDateDate", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "formatYear", "timeA", "timeB", "isSameYear", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateTimeUtils {

    @NotNull
    public static final HeartRateTimeUtils INSTANCE = new HeartRateTimeUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "StepTimeUtils";

    private HeartRateTimeUtils() {
    }

    private final long a(String date, String format) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Date date2 = new SimpleDateFormat(format, Locale.getDefault()).parse(date);
            objM3845constructorimpl = Result.m3845constructorimpl(Long.valueOf(date2 == null ? 0L : date2.getTime()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.i(INSTANCE.getTAG(), "dateToMillisecond error " + thM3848exceptionOrNullimpl.getMessage(), new Object[0]);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = 0L;
        }
        return ((Number) objM3845constructorimpl).longValue();
    }

    public static /* synthetic */ int getDifferFromRegisterDay$default(HeartRateTimeUtils heartRateTimeUtils, long j, long j2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return heartRateTimeUtils.getDifferFromRegisterDay(j, j2, num);
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
        if (i3 == i4) {
            return i2 - i;
        }
        int i5 = 0;
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
    public final String formatDate(long time) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(time));
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
    public final String formatTimeMD(long time) {
        return new SimpleDateFormat(KoinExtKt.getAppContext().getString(R.string.date_Md_pattern), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYM(long time) {
        return new SimpleDateFormat(KoinExtKt.getAppContext().getString(R.string.date_yM_unit_pattern_escape), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYMD(long time) {
        return TimeUtils.formatDate(KoinExtKt.getAppContext().getString(R.string.date_yMd_pattern_escape), time);
    }

    @NotNull
    public final String formatTimeYMDHour(long time) {
        Context appContext = KoinExtKt.getAppContext();
        return TimeUtils.formatDate(appContext.getString(R.string.date_yMdahhmm_unit_pattern_order_other), time) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + TimeUtils.formatDate(appContext.getString(R.string.time_HHmm_pattern), time + ((long) 3600000));
    }

    @NotNull
    public final String formatTimeYMDMin(long time) {
        return TimeUtils.formatDate(KoinExtKt.getAppContext().getString(R.string.date_yMdahhmm_unit_pattern_order_other), time);
    }

    @NotNull
    public final String formatTimeYMDm(long time) {
        return TimeUtils.formatDate(KoinExtKt.getAppContext().getString(R.string.date_yMd_pattern_escape), time);
    }

    @NotNull
    public final String formatYear(@NotNull Context context, @NotNull Date date) {
        return new SimpleDateFormat("yyyy", Locale.getDefault()).format(date);
    }

    @Nullable
    public final Date getChinaDateDate(@NotNull String date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).parse(date);
    }

    @NotNull
    public final String getChinaDateString(long date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(Long.valueOf(date));
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

    public final int getDifferFromRegisterDay(long time, long registerDateTime, @Nullable Integer timeMode) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        Date time2 = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(ExtensionUtilsKt.secondToMills(registerDateTime));
        Date time3 = calendar2.getTime();
        if (timeMode != null && timeMode.intValue() == 17) {
            return differWeeks(time3, time2);
        }
        if (timeMode != null && timeMode.intValue() == 18) {
            return differMonths(time3, time2);
        }
        return (timeMode != null && timeMode.intValue() == 19) ? differYear(time3, time2) : differDays(time3, time2);
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
    public final String getMonth(long time) {
        return formatTimeYM(time);
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

    public final long getTimeByIndex(long startTime, int index) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.add(12, index * 5);
        return calendar.getTime().getTime();
    }

    public final long getTimeByPosition(long startTime, int position) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.add(12, position);
        return calendar.getTime().getTime();
    }

    public final long getTimeFromRegisterDay(int offset, int timeMode, long registerDateTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ExtensionUtilsKt.secondToMills(registerDateTime));
        Date time = calendar.getTime();
        switch (timeMode) {
            case 17:
                return offsetWeek(time.getTime(), offset, true);
            case 18:
                return offsetMonth(time.getTime(), offset, true);
            case 19:
                return offsetYear(time.getTime(), offset, true);
            default:
                return offsetDay(time.getTime(), offset, true);
        }
    }

    @NotNull
    public final String getTimeToUi(long time, int timeType) {
        StringBuilder sb = new StringBuilder();
        switch (timeType) {
            case 16:
                sb.append(formatTimeYMD(time));
                break;
            case 17:
                sb.append(formatTimeYMD(getFirstDayOfWeekTime(time)));
                sb.append(" - ");
                sb.append(formatTimeYMD(getLastDayOfWeekTime(time)));
                break;
            case 18:
                sb.append(getMonth(time));
                break;
            case 19:
                sb.append(getYear(time));
                break;
            case 20:
                sb.append(formatTimeYMDHour(time));
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

    public final boolean isSameYear(@NotNull Context context, long timeA, long timeB) {
        return Intrinsics.areEqual(formatYear(context, new Date(timeA)), formatYear(context, new Date(timeB)));
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

    @Nullable
    public final Date parseDate(@NotNull String date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(date);
    }

    public final long yMDToTimestamp(@NotNull String date) {
        return a(date, "yyyy-MM-dd");
    }

    public final long yMToTimestamp(@NotNull String date) {
        return a(date, "yyyy-MM");
    }
}
