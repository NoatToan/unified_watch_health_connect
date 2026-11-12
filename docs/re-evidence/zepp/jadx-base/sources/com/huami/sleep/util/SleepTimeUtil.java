package com.huami.sleep.util;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.hmdateformat.timeinterval.HMDataIntervalFormat;
import com.huami.module.ktx.TimeExtKt;
import com.huami.respiratoryrate.core.RespRateConstants;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bV\u0010WJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u0018\u0010\u0015\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rJ\u0018\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fJ\u001e\u0010'\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u0016\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u001e\u0010,\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u0016\u0010-\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u001e\u0010/\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u0016\u00100\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u001e\u00102\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u0016\u00103\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u000e\u00104\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u00105\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rJ\"\u00107\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n062\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u00108\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u00109\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010:\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010;\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010<\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010=\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rJ\u001a\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r062\u0006\u0010?\u001a\u00020>J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>J\u000e\u0010B\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010C\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010D\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rJ\u0012\u0010F\u001a\u00020\u0004*\u00020\r2\u0006\u0010E\u001a\u00020\u0004J\u0018\u0010G\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\rJ\u0018\u0010I\u001a\u00020\r2\u0006\u0010H\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0002J \u0010M\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020%J\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000206R\u0016\u0010O\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010R¨\u0006X"}, d2 = {"Lcom/huami/sleep/util/SleepTimeUtil;", "", "", "time", "", "minuteParseToHour", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "minute", "formatTime", "Ljava/util/Date;", "date", "timeStrToDate", "", "timeLongToStr", "Ljava/util/Calendar;", "calendar", "", "resetCalendarTimeToEarliest", "resetCalendarTimeToLast", "getHoursOnly", "getTimeMinNum", "getMinutesOnly", "formatTimeMMddWithUnit", "formatTimeYMD", "formatDateTimeForMD", "formatDateTimeForYM", "formatDateTimeForYMD", "firstTimestamp", "lastTimestamp", "formatDateTimeRangeForYMD", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "getDifferFromRegisterDay", "offset", "getTimeFromRegisterDay", "days", "", "next", "offsetDay", "timeStart", "timeEnd", "differDays", "weeks", "offsetWeek", "differWeeks", "months", "offsetMonth", "differMonths", "years", "offsetYear", "differYear", "getFirstDayOfWeekTime", "getLastDayOfWeekTime", "Lkotlin/Pair;", "getDateRangeByTimeModeAndRegister", "getDayStartTime", "getFirstDayOfMonthTime", "getFirstDayOfYearTime", "getDayEndTime", "getLastDayOfMonthTime", "getLastDayOfYearTime", "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "getTimeRange", "getTimeToUi", "getMonth", "getYear", "formatTimeYM", TrainingWebConst.QueryParam.VIDEO_FORMAT, "toDateString", "formatTimeMD", "dayString", "getOffsetTime", "targetDate", "baseDate", "isClosed", "calculateSleepIndex", "fetchZeroTimestampAndCurrentTimeZone", "TAG", "Ljava/lang/String;", "a", LogUtil.I, "SIX_WAN", "b", "ONE_DAY_MINUTE", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTimeUtil {

    @NotNull
    public static final SleepTimeUtil INSTANCE = new SleepTimeUtil();

    @NotNull
    public static final String TAG = "SleepTimeUtil";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int SIX_WAN = 60000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int ONE_DAY_MINUTE = 1440;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.DAY.ordinal()] = 1;
            iArr[TimeMode.WEEK.ordinal()] = 2;
            iArr[TimeMode.MONTH.ordinal()] = 3;
            iArr[TimeMode.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "differMonths:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "differYear:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetchZeroTimestampAndCurrentTimeZone zeroTimeZoneTimestamp = " + this.a + " - currentTimeZone = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sleep rawOffset:" + this.a;
        }
    }

    private SleepTimeUtil() {
    }

    public static /* synthetic */ String formatTimeMD$default(SleepTimeUtil sleepTimeUtil, Context context, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            context = KoinExtKt.getAppContext();
        }
        return sleepTimeUtil.formatTimeMD(context, j);
    }

    public static /* synthetic */ int getDifferFromRegisterDay$default(SleepTimeUtil sleepTimeUtil, long j, TimeMode timeMode, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return sleepTimeUtil.getDifferFromRegisterDay(j, timeMode);
    }

    public static /* synthetic */ long getOffsetTime$default(SleepTimeUtil sleepTimeUtil, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sleepTimeUtil.getOffsetTime(str, i);
    }

    public final int calculateSleepIndex(long targetDate, long baseDate, boolean isClosed) {
        long j = 60000;
        long j2 = (baseDate / j) - (targetDate / j);
        if (j2 <= 0) {
            return (int) ((((long) 1440) + Math.abs(j2)) - ((long) (!isClosed ? 1 : 0)));
        }
        int iAbs = (int) ((((long) 1440) - Math.abs(j2)) + ((long) (!isClosed ? 1 : 0)));
        if (iAbs < 0) {
            return 1440;
        }
        return iAbs;
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
        HMLog.debug(TAG, new a(i));
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
        HMLog.debug(TAG, new b(i));
        return i;
    }

    @NotNull
    public final Pair<Long, Integer> fetchZeroTimestampAndCurrentTimeZone() {
        Date date = new Date();
        int offset = TimeZone.getDefault().getOffset(date.getTime());
        long time = date.getTime() - ((long) offset);
        HMLog.info(TAG, new c(time, offset));
        return new Pair<>(Long.valueOf(time / ((long) 1000)), Integer.valueOf(offset / 1000));
    }

    @NotNull
    public final String formatDateTimeForMD(long time) {
        return HMDataFormatKt.getFormatTime$default(time, HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
    }

    @NotNull
    public final String formatDateTimeForYM(long time) {
        return HMDataFormatKt.getFormatTime$default(time, HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null);
    }

    @NotNull
    public final String formatDateTimeForYMD(long time) {
        return TimeExtKt.isInThisYear(time) ? HMDataFormatKt.getFormatTime$default(time, HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null) : HMDataFormatKt.getFormatTime$default(time, HMPattern.YEAR_ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
    }

    @NotNull
    public final String formatDateTimeRangeForYMD(long firstTimestamp, long lastTimestamp) {
        return HMDataIntervalFormat.INSTANCE.getTimeRange(KoinExtKt.getAppContext(), firstTimestamp, lastTimestamp, HMDataIntervalFormat.Pattern.FORMAT_SHOW_DATE);
    }

    @Nullable
    public final String formatTime(@NotNull Context context, int minute) {
        int i = minute / 60;
        int i2 = minute % 60;
        if (i <= 0) {
            return i2 + context.getResources().getString(R.string.unit_min_long);
        }
        String str = i + context.getResources().getString(R.string.unit_hour);
        if (i2 < 10) {
            str = str + "0";
        }
        return str + i2 + context.getResources().getString(R.string.unit_min);
    }

    @NotNull
    public final String formatTimeMD(@NotNull Context context, long time) {
        return new SimpleDateFormat(context.getString(R.string.date_Md_pattern), Locale.ENGLISH).format(new Date(time));
    }

    @NotNull
    public final String formatTimeMMddWithUnit(long time) {
        return new SimpleDateFormat(KoinExtKt.getAppContext().getString(R.string.date_Md_unit_pattern), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYM(long time) {
        return new SimpleDateFormat(KoinExtKt.getAppContext().getString(R.string.date_yM_unit_pattern_escape), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYMD(long time) {
        return new SimpleDateFormat(KoinExtKt.getAppContext().getString(R.string.date_yMd_pattern_escape), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final Pair<Date, Date> getDateRangeByTimeModeAndRegister(long time, @NotNull TimeMode timeMode) {
        long dayStartTime;
        long dayEndTime;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[timeMode.ordinal()];
        if (i == 1) {
            dayStartTime = getDayStartTime(time);
        } else if (i == 2) {
            dayStartTime = getFirstDayOfWeekTime(time);
        } else if (i == 3) {
            dayStartTime = getFirstDayOfMonthTime(time);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dayStartTime = getFirstDayOfYearTime(time);
        }
        int i2 = iArr[timeMode.ordinal()];
        if ((i2 == 3 || i2 == 4) && getDifferFromRegisterDay(dayStartTime, TimeMode.DAY) < 0) {
            dayStartTime = KoinExtKt.getAccountInfo().getCreatTime() * ((long) 1000);
        }
        int i3 = iArr[timeMode.ordinal()];
        if (i3 == 1) {
            dayEndTime = getDayEndTime(time);
        } else if (i3 == 2) {
            dayEndTime = getLastDayOfWeekTime(time);
        } else if (i3 == 3) {
            dayEndTime = getLastDayOfMonthTime(time);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dayEndTime = getLastDayOfYearTime(time);
        }
        int i4 = iArr[timeMode.ordinal()];
        if (i4 == 3 || i4 == 4) {
            long dayEndTime2 = getDayEndTime(Calendar.getInstance().getTimeInMillis());
            if (dayEndTime > dayEndTime2) {
                dayEndTime = dayEndTime2;
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dayStartTime);
        Unit unit = Unit.INSTANCE;
        Date time2 = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(dayEndTime);
        return new Pair<>(time2, calendar2.getTime());
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

    public final int getDifferFromRegisterDay(long time, @NotNull TimeMode timeMode) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        Date time2 = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(KoinExtKt.getAccountInfo().getCreatTime() * ((long) 1000));
        Date time3 = calendar2.getTime();
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            return differDays(time3, time2);
        }
        if (i == 2) {
            return differWeeks(time3, time2);
        }
        if (i == 3) {
            return differMonths(time3, time2);
        }
        if (i == 4) {
            return differYear(time3, time2);
        }
        throw new NoWhenBranchMatchedException();
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

    @NotNull
    public final String getHoursOnly(long time) {
        return new SimpleDateFormat("HH", Locale.getDefault()).format(Long.valueOf(time));
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
    public final String getMinutesOnly(long time) {
        return new SimpleDateFormat(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, Locale.getDefault()).format(Long.valueOf(time));
    }

    @NotNull
    public final String getMonth(long time) {
        return formatTimeYM(time);
    }

    public final long getOffsetTime(@NotNull String dayString, int offset) {
        HMLog.info(RespRateConstants.TAG, new d(offset));
        return (SportDay.fromString(dayString).getPreDay().getTimestamp() + ((long) TimeZone.getDefault().getRawOffset())) - ((long) offset);
    }

    public final long getTimeFromRegisterDay(int offset, @NotNull TimeMode timeMode) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(KoinExtKt.getAccountInfo().getCreatTime() * ((long) 1000));
        Date time = calendar.getTime();
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            return offsetDay(time.getTime(), offset, true);
        }
        if (i == 2) {
            return offsetWeek(time.getTime(), offset, true);
        }
        if (i == 3) {
            return offsetMonth(time.getTime(), offset, true);
        }
        if (i == 4) {
            return offsetYear(time.getTime(), offset, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getTimeMinNum(@Nullable String date, long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = Integer.parseInt(getHoursOnly(time));
        return (SportDay.fromString(date).offsetDay(new SportDay(calendar)) == 0 ? (i * 60) + 1440 : i * 60) + Integer.parseInt(getMinutesOnly(time));
    }

    @NotNull
    public final Pair<Long, Long> getTimeRange(@NotNull TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        long time = timeParam.getTime();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            return new Pair<>(Long.valueOf(getDayStartTime(time)), Long.valueOf(getDayEndTime(time)));
        }
        if (i == 2) {
            return new Pair<>(Long.valueOf(getFirstDayOfWeekTime(time)), Long.valueOf(getLastDayOfWeekTime(time)));
        }
        if (i == 3) {
            return new Pair<>(Long.valueOf(getFirstDayOfMonthTime(time)), Long.valueOf(getLastDayOfMonthTime(time)));
        }
        if (i == 4) {
            return new Pair<>(Long.valueOf(getFirstDayOfYearTime(time)), Long.valueOf(getLastDayOfYearTime(time)));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getTimeToUi(@NotNull TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        long time = timeParam.getTime();
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            sb.append(formatDateTimeForYMD(time));
        } else if (i == 2) {
            sb.append(formatDateTimeRangeForYMD(getFirstDayOfWeekTime(time), getLastDayOfWeekTime(time)));
        } else if (i == 3) {
            sb.append(formatDateTimeForYM(time));
        } else if (i == 4) {
            sb.append(getYear(time));
        }
        return sb.toString();
    }

    @NotNull
    public final String getYear(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return String.valueOf(calendar.get(1));
    }

    @Nullable
    public final String minuteParseToHour(int time) {
        StringBuilder sb;
        String string;
        int i = time / 60;
        if (i < 24) {
            sb = new StringBuilder();
        } else {
            i -= 24;
            sb = new StringBuilder();
            sb.append("0");
        }
        sb.append(i);
        String string2 = sb.toString();
        int i2 = time % 60;
        if (i2 > 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i2);
            string = sb2.toString();
        } else {
            string = "0" + i2;
        }
        return string2 + ":" + string;
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

    public final void resetCalendarTimeToEarliest(@NotNull Calendar calendar) {
        calendar.set(11, calendar.getActualMinimum(11));
        calendar.set(12, calendar.getActualMinimum(12));
        calendar.set(13, calendar.getActualMinimum(13));
        calendar.set(14, calendar.getActualMinimum(14));
    }

    public final void resetCalendarTimeToLast(@NotNull Calendar calendar) {
        calendar.set(11, calendar.getActualMaximum(11));
        calendar.set(12, calendar.getActualMaximum(12));
        calendar.set(13, calendar.getActualMaximum(13));
        calendar.set(14, calendar.getActualMaximum(14));
    }

    @NotNull
    public final String timeLongToStr(long time) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final Date timeStrToDate(@NotNull String date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(date);
    }

    @NotNull
    public final String toDateString(long j, @NotNull String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(Long.valueOf(j));
    }

    @Nullable
    public final String formatTime(@NotNull Date date) {
        return TimeUtils.formatTime(KoinExtKt.getAppContext(), date);
    }
}
