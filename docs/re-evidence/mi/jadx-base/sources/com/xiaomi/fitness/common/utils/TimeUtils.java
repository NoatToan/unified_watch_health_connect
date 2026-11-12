package com.xiaomi.fitness.common.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u0016\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020\u0015H\u0007J\b\u0010\"\u001a\u00020\u0015H\u0007J&\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J \u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0007J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015J\u0006\u0010,\u001a\u00020\u0015J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0007J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001dH\u0007J\u000e\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015J\u001e\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005J\u0010\u00100\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u0016\u00100\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0015J\u000e\u00100\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0015J\u0010\u00105\u001a\u0004\u0018\u00010\u001d2\u0006\u00106\u001a\u00020\u0005J$\u00105\u001a\u0004\u0018\u00010\u001d2\u0006\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u0001082\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u000e\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u0015J\u000e\u00109\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020\u001dJ,\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150<2\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u0005J\u001c\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u001d2\b\u0010D\u001a\u0004\u0018\u00010\u001dH\u0007J\u000e\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0015J\u0010\u0010E\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u0018\u0010G\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010H\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0015J\u000e\u0010I\u001a\u00020B2\u0006\u0010J\u001a\u00020\u0015J\u001e\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010\u00112\b\u0010N\u001a\u0004\u0018\u00010\u0011H\u0007J\u001c\u0010O\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u00112\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0011H\u0007J\u001c\u0010P\u001a\u00020\u00112\b\u0010N\u001a\u0004\u0018\u00010\u00112\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0007J\u001a\u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ0\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0005H\u0007J\u0016\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010[\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u0005J\u0016\u0010[\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020\u0015J\u000e\u0010]\u001a\u00020B2\u0006\u0010^\u001a\u00020\u0005J\u000e\u0010_\u001a\u00020B2\u0006\u0010^\u001a\u00020\u0005J\u000e\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\u0005J\u000e\u0010b\u001a\u00020B2\u0006\u0010X\u001a\u00020\u0015J\u000e\u0010c\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0015J\u001e\u0010d\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\u00052\u0006\u0010f\u001a\u00020\u0005J\u001e\u0010g\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00052\u0006\u0010h\u001a\u00020\u00052\u0006\u0010i\u001a\u00020\u0005J\u000e\u0010j\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0015J\u000e\u0010G\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0015J\u000e\u0010k\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0015J\u000e\u0010l\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u0015J\u000e\u0010m\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0015J\u000e\u0010n\u001a\u00020\u00052\u0006\u0010o\u001a\u00020\u0015J\u0010\u0010p\u001a\u00020\u00112\u0006\u0010q\u001a\u00020\u0015H\u0007J\u0016\u0010r\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005J\u000e\u0010s\u001a\u00020B2\u0006\u0010t\u001a\u00020\u0005J\u000e\u0010u\u001a\u00020\u00052\u0006\u0010t\u001a\u00020\u0005J\u0016\u0010v\u001a\u00020\u00052\u0006\u0010w\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u0015J\u0016\u0010v\u001a\u00020\u00052\u0006\u0010y\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u0005J\u0016\u0010{\u001a\u00020\u00052\u0006\u0010w\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u0015J\u0016\u0010{\u001a\u00020\u00052\u0006\u0010y\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u0005J\u0016\u0010|\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u0010}\u001a\u00020\u0005J\u0016\u0010~\u001a\u00020\u00052\u0006\u0010w\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u0015J\u0016\u0010~\u001a\u00020\u00052\u0006\u0010y\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u0005J\u001b\u0010~\u001a\u00020\u00052\b\u0010\u007f\u001a\u0004\u0018\u00010\u001d2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001dJ\u0019\u0010\u0081\u0001\u001a\u00020\u00052\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u0015J\u0019\u0010\u0084\u0001\u001a\u00020\u00152\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u0015J\u0019\u0010\u0085\u0001\u001a\u00020\u00152\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u0015J\u001a\u0010\u0086\u0001\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0007\u0010\u0087\u0001\u001a\u00020\u0015J#\u0010\u0084\u0001\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u0015J\u000f\u0010\u0088\u0001\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0005J\u0010\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0006\u00106\u001a\u00020\u0005J\u0011\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u0015J\u0011\u0010\u008d\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u0015J\u000f\u0010\u0095\u0001\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0015J-\u0010\u0096\u0001\u001a\b0\u0098\u0001j\u0003`\u0097\u00012\u0007\u0010\u0099\u0001\u001a\u00020\u00052\r\u0010\u009a\u0001\u001a\b0\u0098\u0001j\u0003`\u0097\u0001H\u0002¢\u0006\u0003\u0010\u009b\u0001J\u000f\u0010\u009c\u0001\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0015J\u000f\u0010\u009d\u0001\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u001f\u0010\u008e\u0001\u001a\u00030\u008a\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010\u0003\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0014\u0010\u0092\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/xiaomi/fitness/common/utils/TimeUtils;", "", "<init>", "()V", "BEGIN_YEAR", "", "BEGIN_MONTH", "BEGIN_DAY", "END_YEAR", "END_MONTH", "END_DAY", "SPLIT_BY_YEAR", "SPLIT_BY_MONTH", "SPLIT_BY_WEEK", "SPLIT_BY_DAY", "SPLIT_BY_HOUR", "FORMAT_Y_M_D_H_M_S", "", "FORMAT_YYYY_M_D", "FORMAT_H_M", "TIME_ONE_DAY_IN_MILLIS", "", "getTIME_ONE_DAY_IN_MILLIS", "()J", "DEFAULT_FORMAT", "FORMAT_YYYYMMDD", "NEW_FORMAT", "TAG", "getZeroOClockToday", "Ljava/util/Calendar;", "setToZeroOClock", "calendar", "getDayZero0ClockCalendar", "timeInMills", "getBeginOfToday", "getTodayOffsetMills", "offset", "hour", "minute", "seconds", "isSameDay", "", "d1", "d2", "getEndOfToday", "getBeginOfDate", "timeMills", "getEndOfDate", "getJulianDay", "year", "month", "day", "timeMillis", "getCalendarFromJulianDay", "julianDay", "timeZone", "Ljava/util/TimeZone;", "isToday", "timestamp", "splitTime", "", "beginTime", "endTime", "mode", "step", "calculateDiff", "", "from", "to", "getDayInMonth", "time", "getDayOfMonth", "getHourOfDay", "getHourMinuteAndSecond", "ms", "stringToDate", "Ljava/util/Date;", "timeStr", "pattern", "stringToDateLong", "formatDate", "setTimeZeroOClock", "dateTimeMillis", "formatTimeCalendar", StepsInfo.KEY_CALORIES, "hourOfDay", "min", "sec", "millis", "formatOffset", "field", "getCurrentFieldValue", SportConstants.KEY_TIMESTAMP, "getDiffCurrentWeekOfYear", "difference", "getDiffCurrentMonthOfYear", "getDiffCurrentDayOfYear", "differences", "getYearMonthDay", "getYearOfMonth", "getDateInWeek", "weekOfYear", "dayOfWeek", "getDateInMonth", "monthOfYear", "dayOfMonth", "getDayOfWeek", "getMinuteOfDay", "getMinute", "parseMillisToHHmm", "getMinuteOfHour", "mills", "parseMinutesToHHMM", "minutes", "getMins", "splitMins", "mins", "splitOnlyMins", "getDateDistance", "beginDate", "endDate", "startJulianDay", "endJulianDay", "getWeekDistance", "getFirstDayOfWeekFromJulianDay", "startDayOfWeek", "getMonthDistance", "startCalendar", "endCalendar", "getYearDistance", "startTimeMills", "endTimeMills", "getDayDistance", "getMinsDistance", "getTodayOffset", "endTimeMillis", "getMillsFromJulianDay", "getBeginEndTime", "", "getBeginEndOfDayMills", "dayTimeMills", "getBeginEndOfHourMills", "normalDateRange", "getNormalDateRange$annotations", "getNormalDateRange", "()[J", "normalBeginCalendar", "getNormalBeginCalendar", "()Ljava/util/Calendar;", "formatSeconds", "appendPre", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "num", "res", "(ILjava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "getDateString", "getNewDateString", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeUtils {
    public static final int BEGIN_DAY = 1;
    public static final int BEGIN_MONTH = 0;
    public static final int BEGIN_YEAR = 1900;

    @NotNull
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final int END_DAY = 31;
    public static final int END_MONTH = 11;
    public static final int END_YEAR = 2100;

    @NotNull
    public static final String FORMAT_H_M = "HH:mm";

    @NotNull
    public static final String FORMAT_YYYYMMDD = "yyyyMMdd";

    @NotNull
    public static final String FORMAT_YYYY_M_D = "yyyy-M-d";

    @NotNull
    public static final String FORMAT_Y_M_D_H_M_S = "yyyy-MM-dd HH:mm:ss";

    @NotNull
    public static final String NEW_FORMAT = "yyyy/MM/dd HH:mm:ss";
    public static final int SPLIT_BY_DAY = 4;
    public static final int SPLIT_BY_HOUR = 5;
    public static final int SPLIT_BY_MONTH = 2;
    public static final int SPLIT_BY_WEEK = 3;
    public static final int SPLIT_BY_YEAR = 1;

    @NotNull
    private static final String TAG = "TimeUtils";

    @NotNull
    public static final TimeUtils INSTANCE = new TimeUtils();
    private static final long TIME_ONE_DAY_IN_MILLIS = TimeUnit.DAYS.toMillis(1);

    private TimeUtils() {
    }

    private final StringBuilder appendPre(int num, StringBuilder res) {
        if (num < 10) {
            res.append("0");
        }
        res.append(num);
        return res;
    }

    @JvmStatic
    @NotNull
    public static final int[] calculateDiff(@Nullable Calendar from, @Nullable Calendar to) {
        if (from == null || to == null) {
            return new int[0];
        }
        setToZeroOClock(from);
        setToZeroOClock(to);
        if (to.after(from)) {
            Logger.d("calculateAge", "Birthday even after 'now'!");
            return new int[0];
        }
        int i = from.get(1);
        int i2 = from.get(2);
        int i3 = from.get(5);
        int i4 = to.get(1);
        int i5 = to.get(2);
        int i6 = to.get(5);
        int i7 = i - i4;
        int[] iArr = {i7, 0, 0};
        if (i2 < i5 || (i2 == i5 && i3 < i6)) {
            iArr[0] = i7 - 1;
        }
        to.add(1, iArr[0]);
        int i8 = to.get(1);
        int i9 = to.get(2);
        int i10 = to.get(5);
        if (i8 == i) {
            iArr[1] = i2 - i9;
        } else {
            iArr[1] = (12 - i9) + i2;
        }
        if (i3 < i10) {
            iArr[1] = iArr[1] - 1;
        }
        to.add(2, iArr[1]);
        int i11 = to.get(2);
        int i12 = to.get(5);
        if (i11 == i2) {
            iArr[2] = i3 - i12;
        } else {
            iArr[2] = i3 + (INSTANCE.getDayInMonth(to) - i12);
        }
        return iArr;
    }

    @JvmStatic
    @NotNull
    public static final String formatDate(@Nullable String pattern, @Nullable Object ms) {
        try {
            return new SimpleDateFormat(pattern, Locale.getDefault()).format(ms);
        } catch (Exception unused) {
            return "exception in format";
        }
    }

    @JvmStatic
    @NotNull
    public static final Calendar formatTimeCalendar(@NotNull Calendar cal, int hourOfDay, int min, int sec, int millis) {
        Intrinsics.checkNotNullParameter(cal, "cal");
        Objects.requireNonNull(cal);
        cal.set(11, hourOfDay);
        cal.set(12, min);
        cal.set(13, sec);
        cal.set(14, millis);
        Intrinsics.checkNotNull(cal);
        return cal;
    }

    @JvmStatic
    public static final long getBeginOfDate(long timeMills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeMills);
        setToZeroOClock(calendar);
        return calendar.getTimeInMillis();
    }

    @JvmStatic
    public static final long getBeginOfToday() {
        return getZeroOClockToday().getTimeInMillis();
    }

    @JvmStatic
    @Nullable
    public static final Calendar getDayZero0ClockCalendar(long timeInMills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMills);
        return setToZeroOClock(calendar);
    }

    @NotNull
    public static final long[] getNormalDateRange() {
        return new long[]{INSTANCE.getNormalBeginCalendar().getTimeInMillis(), getBeginOfToday()};
    }

    @JvmStatic
    public static /* synthetic */ void getNormalDateRange$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final Calendar getZeroOClockToday() {
        return setToZeroOClock(Calendar.getInstance());
    }

    @JvmStatic
    @NotNull
    public static final String parseMinutesToHHMM(long minutes) {
        Object objValueOf;
        Object objValueOf2;
        long j = 60;
        int i = (int) (minutes / j);
        if (i >= 24) {
            i = 24 - i;
        }
        int i2 = (int) (minutes % j);
        if (i < 10) {
            objValueOf = "0" + i;
        } else {
            objValueOf = Integer.valueOf(i);
        }
        if (i2 < 10) {
            objValueOf2 = "0" + i2;
        } else {
            objValueOf2 = Integer.valueOf(i2);
        }
        return objValueOf + ":" + objValueOf2;
    }

    public static /* synthetic */ long setTimeZeroOClock$default(TimeUtils timeUtils, long j, Calendar calendar, int i, Object obj) {
        if ((i & 2) != 0) {
            calendar = null;
        }
        return timeUtils.setTimeZeroOClock(j, calendar);
    }

    @JvmStatic
    @NotNull
    public static final Calendar setToZeroOClock(@Nullable Calendar calendar) {
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        Intrinsics.checkNotNull(calendar);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    @JvmStatic
    @Nullable
    public static final Date stringToDate(@Nullable String timeStr, @Nullable String pattern) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.getDefault());
            Intrinsics.checkNotNull(timeStr);
            return simpleDateFormat.parse(timeStr);
        } catch (Exception e) {
            Logger.e(TAG, "stringToDate: ", e);
            return null;
        }
    }

    public static /* synthetic */ long stringToDateLong$default(TimeUtils timeUtils, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "yyyy-MM-dd HH:mm:ss";
        }
        return timeUtils.stringToDateLong(str, str2);
    }

    public final long formatOffset(int field, int offset) {
        Calendar calendar = Calendar.getInstance();
        if (field == 1) {
            calendar.add(1, offset);
            calendar.set(6, 1);
        } else if (field == 2) {
            calendar.add(2, offset);
            calendar.set(5, 1);
        } else if (field == 3) {
            calendar.add(3, offset);
            calendar.set(7, calendar.getFirstDayOfWeek());
        } else {
            if (field != 5) {
                throw new IllegalArgumentException("formatOffset:field type not right !");
            }
            calendar.add(5, offset);
        }
        setToZeroOClock(calendar);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final String formatSeconds(long seconds) {
        long j = 3600;
        long j2 = 60;
        StringBuilder sb = new StringBuilder();
        appendPre((int) (seconds / j), sb).append(":");
        appendPre((int) ((seconds % j) / j2), sb).append(":");
        appendPre((int) (seconds % j2), sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final long[] getBeginEndOfDayMills(long dayTimeMills) {
        Calendar dayZero0ClockCalendar = getDayZero0ClockCalendar(dayTimeMills);
        Intrinsics.checkNotNull(dayZero0ClockCalendar);
        long timeInMillis = dayZero0ClockCalendar.getTimeInMillis();
        dayZero0ClockCalendar.add(5, 1);
        return new long[]{timeInMillis, dayZero0ClockCalendar.getTimeInMillis()};
    }

    @NotNull
    public final long[] getBeginEndOfHourMills(long dayTimeMills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dayTimeMills);
        calendar.set(12, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(11, 1);
        return new long[]{timeInMillis, calendar.getTimeInMillis()};
    }

    @NotNull
    public final long[] getBeginEndTime(int julianDay) {
        Calendar toZeroOClock = setToZeroOClock(getCalendarFromJulianDay(julianDay));
        Intrinsics.checkNotNull(toZeroOClock);
        long timeInMillis = toZeroOClock.getTimeInMillis();
        toZeroOClock.add(5, 1);
        return new long[]{timeInMillis, toZeroOClock.getTimeInMillis()};
    }

    @Nullable
    public final Calendar getCalendarFromJulianDay(int julianDay) {
        return getCalendarFromJulianDay(julianDay, null, null);
    }

    public final int getCurrentFieldValue(int field) {
        return getCurrentFieldValue(field, System.currentTimeMillis());
    }

    public final int getDateDistance(int startJulianDay, int endJulianDay) {
        return endJulianDay - startJulianDay;
    }

    public final long getDateInMonth(int year, int monthOfYear, int dayOfMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, monthOfYear - 1);
        calendar.set(5, dayOfMonth);
        setToZeroOClock(calendar);
        return calendar.getTimeInMillis();
    }

    public final long getDateInWeek(int year, int weekOfYear, int dayOfWeek) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(3, weekOfYear);
        calendar.setTimeInMillis(calendar.getTimeInMillis());
        calendar.set(7, dayOfWeek);
        setToZeroOClock(calendar);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final String getDateString(long time) {
        String str = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss", Locale.getDefault()).format(new Date(time));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final long getDayDistance(long startTimeMills, long endTimeMills) {
        Calendar dayZero0ClockCalendar = getDayZero0ClockCalendar(startTimeMills);
        Calendar dayZero0ClockCalendar2 = getDayZero0ClockCalendar(endTimeMills);
        Intrinsics.checkNotNull(dayZero0ClockCalendar2);
        long timeInMillis = dayZero0ClockCalendar2.getTimeInMillis();
        Intrinsics.checkNotNull(dayZero0ClockCalendar);
        return (timeInMillis - dayZero0ClockCalendar.getTimeInMillis()) / TimeUnit.DAYS.toMillis(1L);
    }

    public final int getDayInMonth(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return getDayInMonth(calendar);
    }

    public final int getDayOfMonth(int julianDay, @Nullable Calendar calendar) {
        Calendar calendarFromJulianDay = getCalendarFromJulianDay(julianDay, TimeZone.getDefault(), calendar);
        Intrinsics.checkNotNull(calendarFromJulianDay);
        return calendarFromJulianDay.get(5);
    }

    public final int getDayOfWeek(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.get(7);
    }

    @NotNull
    public final int[] getDiffCurrentDayOfYear(int differences) {
        int[] iArr = new int[3];
        if (differences == 0) {
            iArr[0] = getCurrentFieldValue(1);
            iArr[1] = getCurrentFieldValue(2);
            iArr[2] = getCurrentFieldValue(5);
            return iArr;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, differences);
        setToZeroOClock(calendar);
        iArr[0] = calendar.get(1);
        iArr[1] = calendar.get(2) + 1;
        iArr[2] = calendar.get(5);
        return iArr;
    }

    @NotNull
    public final int[] getDiffCurrentMonthOfYear(int difference) {
        int[] iArr = new int[2];
        if (difference == 0) {
            iArr[0] = getCurrentFieldValue(1);
            iArr[1] = getCurrentFieldValue(2);
            return iArr;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, difference);
        setToZeroOClock(calendar);
        iArr[0] = calendar.get(1);
        iArr[1] = calendar.get(2) + 1;
        return iArr;
    }

    @NotNull
    public final int[] getDiffCurrentWeekOfYear(int difference) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(3, difference + 1);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.add(5, -1);
        setToZeroOClock(calendar);
        return new int[]{calendar.get(1), calendar.get(3)};
    }

    public final long getEndOfDate(long timeMills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeMills);
        setToZeroOClock(calendar);
        calendar.add(5, 1);
        return calendar.getTimeInMillis();
    }

    public final long getEndOfToday() {
        Calendar zeroOClockToday = getZeroOClockToday();
        zeroOClockToday.add(5, 1);
        return zeroOClockToday.getTimeInMillis();
    }

    public final int getFirstDayOfWeekFromJulianDay(int julianDay, int startDayOfWeek) {
        Calendar calendarFromJulianDay = getCalendarFromJulianDay(julianDay);
        Intrinsics.checkNotNull(calendarFromJulianDay);
        calendarFromJulianDay.get(7);
        calendarFromJulianDay.set(7, startDayOfWeek);
        return getJulianDay(calendarFromJulianDay);
    }

    @NotNull
    public final int[] getHourMinuteAndSecond(long ms) {
        int[] iArr = new int[3];
        if (ms <= 0) {
            return iArr;
        }
        int i = (int) (ms / ((long) 1000));
        int i2 = i / 60;
        iArr[0] = i2 / 60;
        iArr[1] = i2 % 60;
        iArr[2] = i % 60;
        return iArr;
    }

    public final int getHourOfDay(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(11);
    }

    public final int getJulianDay(int year, int month, int day) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(String.format("%s %s %s", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day)}, 3)), "format(...)");
        int i = (14 - month) / 12;
        int i2 = (year + 4800) - i;
        return (((((day + (((((month + (i * 12)) - 3) * 153) + 2) / 5)) + (i2 * 365)) + (i2 / 4)) - (i2 / 100)) + (i2 / 400)) - 32045;
    }

    public final long getMillsFromJulianDay(int julianDay) {
        Calendar calendarFromJulianDay = getCalendarFromJulianDay(julianDay);
        Intrinsics.checkNotNull(calendarFromJulianDay);
        return calendarFromJulianDay.getTimeInMillis();
    }

    public final int getMins(int hour, int min) {
        return (hour * 60) + min;
    }

    public final long getMinsDistance(long startTimeMills, long endTimeMills) {
        return TimeUnit.MILLISECONDS.toMinutes(Math.abs(endTimeMills - startTimeMills));
    }

    public final int getMinute(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.get(12);
    }

    public final int getMinuteOfDay(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        int i = calendar.get(11);
        return (i * ((int) TimeUnit.HOURS.toMinutes(1L))) + calendar.get(12);
    }

    public final int getMinuteOfHour(long mills) {
        return (int) ((mills % TimeUnit.HOURS.toMillis(1L)) / TimeUnit.MINUTES.toMillis(1L));
    }

    public final int getMonthDistance(long beginDate, long endDate) {
        return getMonthDistance(getJulianDay(beginDate), getJulianDay(endDate));
    }

    @NotNull
    public final String getNewDateString(long time) {
        String str = new SimpleDateFormat(NEW_FORMAT, Locale.getDefault()).format(new Date(time));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final Calendar getNormalBeginCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        calendar.set(5, 1);
        setToZeroOClock(calendar);
        Intrinsics.checkNotNull(calendar);
        return calendar;
    }

    public final long getTIME_ONE_DAY_IN_MILLIS() {
        return TIME_ONE_DAY_IN_MILLIS;
    }

    public final int getTodayOffset(@Nullable Calendar calendar, long endTimeMillis) {
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        return getDayDistance(calendar, System.currentTimeMillis(), endTimeMillis);
    }

    public final long getTodayOffsetMills(int offset, int hour, int minute, int seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, hour);
        calendar.set(12, minute);
        calendar.set(13, seconds);
        calendar.add(5, offset);
        return calendar.getTimeInMillis();
    }

    public final int getWeekDistance(long beginDate, long endDate) {
        return getWeekDistance(getJulianDay(beginDate), getJulianDay(endDate));
    }

    public final int getYearDistance(long startTimeMills, long endTimeMills) {
        if (startTimeMills > endTimeMills) {
            Logger.e(TAG, "get year distance failed, start time should > end time");
        } else {
            startTimeMills = endTimeMills;
            endTimeMills = startTimeMills;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTimeMills);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTimeInMillis(endTimeMills);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        int i7 = i - i4;
        if (i2 < i5 || (i2 == i5 && i3 < i6)) {
            i7--;
        }
        return startTimeMills > endTimeMills ? -i7 : i7;
    }

    @NotNull
    public final int[] getYearMonthDay(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return new int[]{calendar.get(1), calendar.get(2) + 1, calendar.get(5)};
    }

    public final int getYearOfMonth(long millis) {
        if (millis == 0) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.get(1);
    }

    public final boolean isSameDay(long d1, long d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(d1);
        int i = calendar.get(1);
        int i2 = calendar.get(6);
        calendar.setTimeInMillis(d2);
        return i == calendar.get(1) && i2 == calendar.get(6);
    }

    public final boolean isToday(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        Intrinsics.checkNotNull(calendar);
        return isToday(calendar);
    }

    @NotNull
    public final String parseMillisToHHmm(long ms) {
        return parseMinutesToHHMM((ms / ((long) 1000)) / ((long) 60));
    }

    public final long setTimeZeroOClock(long dateTimeMillis, @Nullable Calendar calendar) {
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        calendar.setTimeInMillis(dateTimeMillis);
        setToZeroOClock(calendar);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final int[] splitMins(int mins) {
        return new int[]{mins / 60, mins % 60};
    }

    public final int splitOnlyMins(int mins) {
        if (mins < 60) {
            return 1;
        }
        return mins / 60;
    }

    @NotNull
    public final List<Long> splitTime(long beginTime, long endTime, int mode, int step) {
        if (beginTime < 0 || endTime < beginTime || step <= 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(beginTime);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i = 1;
        if (mode == 1) {
            calendar.set(11, 0);
            calendar.set(6, 1);
        } else if (mode != 2) {
            i = 3;
            if (mode == 3) {
                calendar.set(11, 0);
                calendar.set(7, 2);
            } else if (mode == 4) {
                calendar.set(11, 0);
                i = 5;
            } else {
                if (mode != 5) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                i = 11;
            }
        } else {
            calendar.set(11, 0);
            calendar.set(5, 1);
            i = 2;
        }
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(Long.valueOf(calendar.getTimeInMillis()));
            calendar.add(i, step);
        } while (calendar.getTimeInMillis() < endTime);
        arrayList.add(Long.valueOf(endTime));
        arrayList.set(0, Long.valueOf(beginTime));
        return arrayList;
    }

    @JvmOverloads
    public final long stringToDateLong(@NotNull String timeStr) {
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        return stringToDateLong$default(this, timeStr, null, 2, null);
    }

    @Nullable
    public final Calendar getCalendarFromJulianDay(int julianDay, @Nullable TimeZone timeZone, @Nullable Calendar calendar) {
        if (julianDay >= 588829) {
            int i = (int) ((((double) (julianDay - 1867216)) - 0.25d) / 36524.25d);
            julianDay = ((julianDay + 1) + i) - (i / 4);
        }
        int i2 = julianDay + 1524;
        int i3 = (int) (((((double) (julianDay - 2438346)) - 122.1d) / 365.25d) + 6680.0d);
        int i4 = i2 - ((i3 * 365) + (i3 / 4));
        int i5 = (int) (((double) i4) / 30.6001d);
        int i6 = i4 - ((int) (((double) i5) * 30.6001d));
        int i7 = i5 - 1;
        if (i7 > 12) {
            i7 = i5 - 13;
        }
        int i8 = i3 - 4715;
        if (i7 > 2) {
            i8 = i3 - 4716;
        }
        if (i8 <= 0) {
            i8--;
        }
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (calendar == null) {
            calendar = Calendar.getInstance(timeZone);
        } else {
            calendar.setTimeZone(timeZone);
        }
        Intrinsics.checkNotNull(calendar);
        calendar.set(i8, i7 - 1, i6);
        return calendar;
    }

    public final int getCurrentFieldValue(int field, long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        if (field == 1) {
            return calendar.get(1);
        }
        if (field == 2) {
            return calendar.get(2) + 1;
        }
        if (field == 3) {
            return calendar.get(3);
        }
        if (field == 5) {
            return calendar.get(5);
        }
        if (field == 6) {
            return calendar.get(6);
        }
        if (field == 7) {
            return calendar.get(7);
        }
        if (field == 8) {
            return calendar.get(8);
        }
        if (field == 11) {
            return calendar.get(11);
        }
        throw new IllegalArgumentException("getCurrentFieldValue:field type not right !");
    }

    public final int getDateDistance(long beginDate, long endDate) {
        return getDateDistance(getJulianDay(beginDate), getJulianDay(endDate));
    }

    public final int getMonthDistance(int startJulianDay, int endJulianDay) {
        return getMonthDistance(getCalendarFromJulianDay(startJulianDay), getCalendarFromJulianDay(endJulianDay));
    }

    public final int getWeekDistance(int startJulianDay, int endJulianDay) {
        int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
        return (getFirstDayOfWeekFromJulianDay(endJulianDay, firstDayOfWeek) - getFirstDayOfWeekFromJulianDay(startJulianDay, firstDayOfWeek)) / 7;
    }

    @JvmOverloads
    public final long stringToDateLong(@NotNull String timeStr, @Nullable String pattern) {
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        Date dateStringToDate = stringToDate(timeStr, pattern);
        if (dateStringToDate != null) {
            return dateStringToDate.getTime();
        }
        return 0L;
    }

    public final int getDayOfMonth(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.get(5);
    }

    public final int getDayInMonth(@Nullable Calendar calendar) {
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        Intrinsics.checkNotNull(calendar);
        calendar.set(5, 1);
        calendar.roll(5, -1);
        return calendar.get(5);
    }

    public final int getJulianDay(@Nullable Calendar calendar) {
        Intrinsics.checkNotNull(calendar);
        return getJulianDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }

    public final boolean isToday(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Calendar calendar2 = Calendar.getInstance();
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    @JvmStatic
    public static final long getBeginOfDate(long timeMills, @NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        calendar.setTimeInMillis(timeMills);
        setToZeroOClock(calendar);
        return calendar.getTimeInMillis();
    }

    public final int getDayDistance(@Nullable Calendar calendar, long startTimeMills, long endTimeMills) {
        Intrinsics.checkNotNull(calendar);
        calendar.setTimeInMillis(startTimeMills);
        setToZeroOClock(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(endTimeMills);
        setToZeroOClock(calendar);
        return (int) ((calendar.getTimeInMillis() - timeInMillis) / TIME_ONE_DAY_IN_MILLIS);
    }

    public final int getMonthDistance(@Nullable Calendar startCalendar, @Nullable Calendar endCalendar) {
        Intrinsics.checkNotNull(startCalendar);
        int i = startCalendar.get(1);
        Intrinsics.checkNotNull(endCalendar);
        return (((endCalendar.get(1) - i) * 12) + endCalendar.get(2)) - startCalendar.get(2);
    }

    @JvmStatic
    public static final long getTodayOffsetMills(int offset, int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, hour);
        calendar.set(12, minute);
        calendar.add(5, offset);
        return calendar.getTimeInMillis();
    }

    public final int getJulianDay(@NotNull Calendar calendar, long timeMillis) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Objects.requireNonNull(calendar);
        calendar.setTimeInMillis(timeMillis);
        return getJulianDay(calendar);
    }

    public final int getJulianDay(long timeMillis) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return getJulianDay(calendar, timeMillis);
    }
}
