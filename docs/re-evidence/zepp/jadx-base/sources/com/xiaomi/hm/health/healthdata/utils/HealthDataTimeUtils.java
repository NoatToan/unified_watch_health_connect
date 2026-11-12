package com.xiaomi.hm.health.healthdata.utils;

import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.vo.TimeParam;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.text.ParseException;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 J\u0016\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 J\u0016\u0010(\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J\u0016\u0010)\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006J\u001e\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 J\u0016\u0010,\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J\u001e\u0010.\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 J\u0016\u0010/\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006022\u0006\u0010\b\u001a\u00020\u00022\u0006\u00101\u001a\u000200J\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002022\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u00101\u001a\u000200J\u0018\u00105\u001a\u00020\u001e2\b\b\u0002\u0010\u0003\u001a\u00020\u00062\u0006\u00101\u001a\u000200J\u0016\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u001e2\u0006\u00101\u001a\u000200J\u000e\u00108\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209J\u0006\u0010<\u001a\u00020\u0004J\u0006\u0010=\u001a\u00020\u0006R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/HealthDataTimeUtils;", "", "Ljava/util/Date;", "time", "", "formatTime", "", "formatTimeYMD", "date", "parseStringToDate", "formatTimeHHmm", "formatTimeYMDHHmm", "pattern", "formatDate", "timeStamp", "formatTimeYM", "formatTimeMD", "getDayStartTime", "getDayEndTime", "getFirstDayOfWeekMD", "getFirstDayOfWeekTime", "getLastDayOfWeekMD", "getLastDayOfWeekTime", "getFirstDayOfMonthTime", "getLastDayOfMonthTime", "getFirstDayOfYearTime", "getLastDayOfYearTime", "getTimeToMinute", "getMonth", "getYear", "", "days", "", "next", "offsetDay", "timeStart", "timeEnd", "differDays", "weeks", "offsetWeek", "differWeeks", "differWeeksMillis", "months", "offsetMonth", "differMonths", "years", "offsetYear", "differYear", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lkotlin/Pair;", "getTimeRangeByTimeMode", "getDateRangeByTimeMode", "getDifferFromRegisterDay", "offset", "getTimeFromRegisterDay", "getTimeAfterRegister", "Lcom/xiaomi/hm/health/healthdata/ui/vo/TimeParam;", "timeParam", "getTimeToUi", "getLocalTimeZoneDisplayName", "getUserCreateTimeStamp", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataTimeUtils {

    @NotNull
    public static final HealthDataTimeUtils INSTANCE = new HealthDataTimeUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "HealthData---TimeUtils";

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
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "differWeeks:" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "differYear:" + this.a;
        }
    }

    private HealthDataTimeUtils() {
    }

    public static /* synthetic */ int getDifferFromRegisterDay$default(HealthDataTimeUtils healthDataTimeUtils, long j, TimeMode timeMode, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return healthDataTimeUtils.getDifferFromRegisterDay(j, timeMode);
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

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    public final int differWeeks(@NotNull Date timeStart, @NotNull Date timeEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeStart);
        int i = -1;
        int i2 = calendar.get(7) - 1;
        if (i2 == 0) {
            i2 = 7;
        }
        int iDifferDays = differDays(timeStart, timeEnd) + 1;
        Ref.IntRef intRef = new Ref.IntRef();
        int i3 = iDifferDays / 7;
        intRef.element = i3;
        if (iDifferDays > 0) {
            if ((iDifferDays % 7) + i2 > 7) {
                i = 1;
            } else {
                i = 0;
            }
        } else if (i2 + (iDifferDays % 7) >= 1) {
            i = 0;
        }
        intRef.element = i3 + i;
        HMLog.debug(TAG, new b(intRef));
        return intRef.element;
    }

    public final int differWeeksMillis(long timeStart, long timeEnd) {
        long firstDayOfWeekTime = getFirstDayOfWeekTime(timeStart);
        long firstDayOfWeekTime2 = getFirstDayOfWeekTime(timeEnd);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(firstDayOfWeekTime);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(firstDayOfWeekTime2);
        return differWeeks(time, calendar2.getTime());
    }

    public final int differYear(@NotNull Date timeStart, @NotNull Date timeEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeStart);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(timeEnd);
        int i = calendar2.get(1) - calendar.get(1);
        HMLog.debug(TAG, new c(i));
        return i;
    }

    @NotNull
    public final String formatDate(@Nullable Date date, @NotNull String pattern) {
        return date == null ? "" : new SimpleDateFormat(pattern, Locale.getDefault()).format(date);
    }

    @NotNull
    public final String formatTime(@Nullable Date time) {
        String str;
        return (time == null || (str = new SimpleDateFormat(DeviceXFunctionsKt.getContext().getString(R.string.date_yMdahhmm_unit_pattern_order_other), Locale.getDefault()).format(time)) == null) ? "" : str;
    }

    @NotNull
    public final String formatTimeHHmm(long time) {
        return new SimpleDateFormat(DeviceXFunctionsKt.getContext().getString(R.string.time_HHmm_pattern), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeMD(long time) {
        return new SimpleDateFormat(com.huami.femalehealth.uilib.helper.ChartHelper.FMT_MM_DD, Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYM(long time) {
        return new SimpleDateFormat(DeviceXFunctionsKt.getContext().getString(R.string.date_yM_unit_pattern_escape), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYMD(long time) {
        return new SimpleDateFormat(DeviceXFunctionsKt.getContext().getString(R.string.date_yMd_pattern_escape), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYMDHHmm(long time) {
        return new SimpleDateFormat(DeviceXFunctionsKt.getContext().getString(R.string.date_yMdahhmm_unit_pattern_order_other), Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final Pair<Date, Date> getDateRangeByTimeMode(long time, @NotNull TimeMode timeMode) {
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
        if (i2 == 1) {
            dayEndTime = getDayEndTime(time);
        } else if (i2 == 2) {
            dayEndTime = getLastDayOfWeekTime(time);
        } else if (i2 == 3) {
            dayEndTime = getLastDayOfMonthTime(time);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dayEndTime = getLastDayOfYearTime(time);
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
        calendar2.setTimeInMillis(HMPersonInfo.getInstance().getUserInfo().getCreatTime() * ((long) 1000));
        Date time3 = calendar2.getTime();
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            return differDays(time3, time2);
        }
        if (i == 2) {
            return differWeeksMillis(time3.getTime(), time2.getTime());
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

    @NotNull
    public final String getFirstDayOfWeekMD(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null) ? 1 : 2);
        calendar.setTimeInMillis(time);
        calendar.set(7, calendar.getFirstDayOfWeek());
        return formatTimeMD(calendar.getTimeInMillis());
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

    @NotNull
    public final String getLastDayOfWeekMD(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null) ? 1 : 2);
        calendar.setTimeInMillis(time);
        calendar.set(7, calendar.getFirstDayOfWeek() + 6);
        return formatTimeMD(calendar.getTimeInMillis());
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
    public final String getLocalTimeZoneDisplayName() {
        return TimeZone.getDefault().getID();
    }

    @NotNull
    public final String getMonth(long time) {
        return formatTimeYM(time);
    }

    @NotNull
    public final Date getTimeAfterRegister(@NotNull Date time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(HMPersonInfo.getInstance().getUserInfo().getCreatTime() * ((long) 1000));
        Date time2 = calendar.getTime();
        return time2.after(time) ? time2 : time;
    }

    public final long getTimeFromRegisterDay(int offset, @NotNull TimeMode timeMode) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(HMPersonInfo.getInstance().getUserInfo().getCreatTime() * ((long) 1000));
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

    @NotNull
    public final Pair<Long, Long> getTimeRangeByTimeMode(@NotNull Date date, @NotNull TimeMode timeMode) {
        long dayStartTime;
        long dayEndTime;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[timeMode.ordinal()];
        if (i == 1) {
            dayStartTime = getDayStartTime(date.getTime());
        } else if (i == 2) {
            dayStartTime = getFirstDayOfWeekTime(date.getTime());
        } else if (i == 3) {
            dayStartTime = getFirstDayOfMonthTime(date.getTime());
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dayStartTime = getFirstDayOfYearTime(date.getTime());
        }
        int i2 = iArr[timeMode.ordinal()];
        if (i2 == 1) {
            dayEndTime = getDayEndTime(date.getTime());
        } else if (i2 == 2) {
            dayEndTime = getLastDayOfWeekTime(date.getTime());
        } else if (i2 == 3) {
            dayEndTime = getLastDayOfMonthTime(date.getTime());
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dayEndTime = getLastDayOfYearTime(date.getTime());
        }
        return new Pair<>(Long.valueOf(dayStartTime), Long.valueOf(dayEndTime));
    }

    public final long getTimeToMinute(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final String getTimeToUi(@NotNull TimeParam timeParam) {
        TimeMode mode = timeParam.getMode();
        long time = timeParam.getTime();
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            sb.append(formatTimeYMD(time));
        } else if (i == 2) {
            sb.append(formatTimeYMD(getFirstDayOfWeekTime(time)));
            sb.append(" - ");
            sb.append(formatTimeYMD(getLastDayOfWeekTime(time)));
        } else if (i == 3) {
            sb.append(getMonth(time));
        } else if (i == 4) {
            sb.append(getYear(time));
        }
        return sb.toString();
    }

    public final long getUserCreateTimeStamp() {
        return HMPersonInfo.getInstance().getUserInfo().getCreatTime() * ((long) 1000);
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

    @Nullable
    public final Date parseStringToDate(@NotNull String date) {
        try {
            return new SimpleDateFormat(DeviceXFunctionsKt.getContext().getString(R.string.date_yMd_pattern_escape), Locale.getDefault()).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    public final String formatTime(long timeStamp, @NotNull String pattern) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        Unit unit = Unit.INSTANCE;
        return formatDate(calendar.getTime(), pattern);
    }
}
