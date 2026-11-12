package com.huami.bloodpressure_ui.ext;

import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.bloodpressure_ui.tab.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b9\u0010:J \u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016J\u001e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016J\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016J\u001e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016J\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010$\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002J\u0017\u0010-\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0016\u00104\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0007J\u0016\u00106\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0007J\u0016\u00108\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0007¨\u0006;"}, d2 = {"Lcom/huami/bloodpressure_ui/ext/TimeEx;", "", "", "time", ParamKey.createTime, "Lcom/huami/bloodpressure_ui/tab/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "getDifferFromRegisterDay", "Ljava/util/Date;", "timeStart", "timeEnd", "differDays", "differWeeks", "differWeeksMillis", "getFirstDayOfWeekTime", "getLastDayOfWeekTime", "differMonths", "differYear", "offset", "getTimeFromRegisterDay", "days", "", "next", "offsetDay", "weeks", "offsetWeek", "months", "offsetMonth", "years", "offsetYear", "date", "Lkotlin/Pair;", "getTimeRangeByTimeMode", "getDateRangeByTimeMode", "getDayStartTime", "getDayEndTime", "getFirstDayOfMonthTime", "getLastDayOfMonthTime", "getFirstDayOfYearTime", "getLastDayOfYearTime", "time1", "time2", "isTheSameDay", BloodPressureConst.ParamKey.MEASURETIME, "getHour", "(Ljava/lang/Long;)I", "timeStamp", "minute", "getMinuteOfDay", "(Ljava/lang/Long;I)I", "day", "nextDay", "month", "nextMonth", "hour", "nextHour", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class TimeEx {

    @NotNull
    public static final TimeEx INSTANCE = new TimeEx();

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

    private TimeEx() {
    }

    public static /* synthetic */ int getDifferFromRegisterDay$default(TimeEx timeEx, long j, long j2, TimeMode timeMode, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return timeEx.getDifferFromRegisterDay(j, j2, timeMode);
    }

    public static /* synthetic */ int getMinuteOfDay$default(TimeEx timeEx, Long l, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return timeEx.getMinuteOfDay(l, i);
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
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeStart);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(timeEnd);
        if (calendar.get(1) == calendar2.get(1)) {
            return calendar2.get(2) - calendar.get(2);
        }
        return (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public final int differWeeks(@NotNull Date timeStart, @NotNull Date timeEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeStart);
        int i = -1;
        int i2 = calendar.get(7) - 1;
        if (i2 == 0) {
            i2 = 7;
        }
        int iDifferDays = differDays(timeStart, timeEnd) + 1;
        int i3 = iDifferDays / 7;
        if (iDifferDays > 0) {
            if ((iDifferDays % 7) + i2 > 7) {
                i = 1;
            } else {
                i = 0;
            }
        } else if (i2 + (iDifferDays % 7) >= 1) {
            i = 0;
        }
        return i3 + i;
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
        return calendar2.get(1) - calendar.get(1);
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

    public final int getDifferFromRegisterDay(long time, long createTime, @NotNull TimeMode timeMode) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        Date time2 = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(createTime);
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

    public final int getHour(@Nullable Long measureTime) {
        if (measureTime == null) {
            return 0;
        }
        long jLongValue = measureTime.longValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        return calendar.get(11);
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

    public final int getMinuteOfDay(@Nullable Long timeStamp, int minute) {
        if (timeStamp == null) {
            return 0;
        }
        long jLongValue = timeStamp.longValue();
        return (int) ((jLongValue - INSTANCE.getDayStartTime(jLongValue)) / TimeUnit.MINUTES.toMillis(minute));
    }

    public final long getTimeFromRegisterDay(int offset, @NotNull TimeMode timeMode, long createTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(createTime);
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

    public final boolean isTheSameDay(long time1, long time2) {
        return (time1 + ((long) TimeZone.getDefault().getOffset(time1))) / 86400000 == (time2 + ((long) TimeZone.getDefault().getOffset(time2))) / 86400000;
    }

    public final long nextDay(long timeStamp, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        calendar.add(6, day);
        return calendar.getTimeInMillis();
    }

    public final long nextHour(long timeStamp, int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        calendar.add(10, hour);
        return calendar.getTimeInMillis();
    }

    public final long nextMonth(long timeStamp, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        calendar.add(2, month);
        return calendar.getTimeInMillis();
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
}
