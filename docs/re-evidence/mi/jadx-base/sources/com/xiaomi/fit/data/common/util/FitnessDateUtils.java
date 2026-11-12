package com.xiaomi.fit.data.common.util;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.sport_eco.SportConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\bH\u0007J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0005J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0007J\u001e\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ\u0016\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fJ\b\u0010\u001f\u001a\u00020\bH\u0007J\u000e\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000fJ\u0018\u0010&\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u000fH\u0007J\u0010\u0010(\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u000fH\u0002J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u000fH\u0002J\u000e\u0010&\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bJ\u000e\u0010*\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u000fJ\u0016\u0010+\u001a\u00020,2\u0006\u0010$\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u000fJ\u0016\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"J\b\u00100\u001a\u00020\u000fH\u0007J\b\u00101\u001a\u00020\u000fH\u0007J\u0016\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007J\u000e\u00108\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bJ\u0010\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u000fH\u0007J\u000e\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000fJ\b\u0010=\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/xiaomi/fit/data/common/util/FitnessDateUtils;", "", "<init>", "()V", "TAG", "", "DATE_PATTERN", "SECONDS_ONE_DAY", "", "getSECONDS_ONE_DAY", "()J", "UNIT_TIME_ZONE", "getUNIT_TIME_ZONE", "timeZoneMap", "", "", "Ljava/util/TimeZone;", "convertDateStrToZeroTime", "dateStr", "datePattern", "convertDateStrToTimeInMilli", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "getDateStr", "tsInSec", "pattern", "changeToDestZeroTimeOneDay", "originTime", "originTzInSec", "destTzInSec", "changeToDestZeroTimeOneDay2", "changeToCurrentTzZeroTimeOneDay", "getTodayZeroTimeInSec", "changeToZeroTimeInSec", "calendar", "Ljava/util/Calendar;", "changeTo0TimeIn0TzOneDay", "timeInSec", "zoneOffsetInSec", "changeZeroOfTheDay", "tzOffsetInSec", "getCalendar", "getCalendarTimeZone", "getTimeZone", "isToday", "", "equalCalendarDay", "firstCalendar", "secondCalendar", "getCurrentTZOffsetIn15min", "getCurrentTZOffsetInSec", "getTZOffsetIn15min", SportConstants.KEY_TIMESTAMP, "timeUnit", "Ljava/util/concurrent/TimeUnit;", "getTZOffsetInMilli", "timeInMilli", "getTZOffsetInSec", "getTzOffsetInSecBy15min", "tzIn15min", "getTzOffsetIn15minBySec", "tzInSec", "getCurrentTimeZoneID", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDateUtils {

    @NotNull
    private static final String DATE_PATTERN = "yyyy-MM-dd-HH-mm-ss";

    @NotNull
    private static final String TAG = "FitnessDateUtils";

    @NotNull
    public static final FitnessDateUtils INSTANCE = new FitnessDateUtils();
    private static final long SECONDS_ONE_DAY = TimeUnit.DAYS.toSeconds(1);
    private static final long UNIT_TIME_ZONE = TimeUnit.MINUTES.toMillis(15);

    @NotNull
    private static final Map<Integer, TimeZone> timeZoneMap = new LinkedHashMap();

    private FitnessDateUtils() {
    }

    @JvmStatic
    public static final long changeToDestZeroTimeOneDay(long originTime, int originTzInSec, int destTzInSec) {
        FitnessDateUtils fitnessDateUtils = INSTANCE;
        Calendar calendar = fitnessDateUtils.getCalendar(originTzInSec);
        long j = 1000;
        calendar.setTimeInMillis(originTime * j);
        Calendar calendar2 = fitnessDateUtils.getCalendar(destTzInSec);
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar2.getTimeInMillis() / j;
    }

    @JvmStatic
    public static final long changeZeroOfTheDay(long timeInSec, int tzOffsetInSec) {
        Calendar calendar = INSTANCE.getCalendar(tzOffsetInSec);
        long j = 1000;
        calendar.setTimeInMillis(timeInSec * j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / j;
    }

    private final Calendar getCalendar(int tzOffsetInSec) {
        Calendar calendar = Calendar.getInstance(getCalendarTimeZone(tzOffsetInSec));
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return calendar;
    }

    private final TimeZone getCalendarTimeZone(int tzOffsetInSec) {
        Map<Integer, TimeZone> map = timeZoneMap;
        TimeZone timeZone = map.get(Integer.valueOf(tzOffsetInSec));
        if (timeZone != null) {
            return timeZone;
        }
        TimeZone timeZone2 = getTimeZone(tzOffsetInSec);
        map.put(Integer.valueOf(tzOffsetInSec), timeZone2);
        return timeZone2;
    }

    @JvmStatic
    public static final int getCurrentTZOffsetIn15min() {
        return INSTANCE.getTZOffsetIn15min(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @JvmStatic
    public static final int getCurrentTZOffsetInSec() {
        return (int) INSTANCE.getTZOffsetInSec(System.currentTimeMillis() / ((long) 1000));
    }

    @JvmStatic
    @NotNull
    public static final String getCurrentTimeZoneID() {
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
        return id;
    }

    @JvmStatic
    @NotNull
    public static final String getDateStr(long tsInSec) {
        return INSTANCE.getDateStr(tsInSec, DATE_PATTERN);
    }

    @JvmStatic
    public static final long getTZOffsetInMilli(long timeInMilli) {
        return TimeZone.getDefault().getOffset(timeInMilli);
    }

    @JvmStatic
    public static final long getTodayZeroTimeInSec() {
        FitnessDateUtils fitnessDateUtils = INSTANCE;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return fitnessDateUtils.changeToZeroTimeInSec(calendar);
    }

    @JvmStatic
    public static final int getTzOffsetInSecBy15min(int tzIn15min) {
        return (int) TimeUnit.MINUTES.toSeconds(tzIn15min * 15);
    }

    public final long changeTo0TimeIn0TzOneDay(long timeInSec, int zoneOffsetInSec) {
        Calendar calendar = getCalendar(0);
        calendar.setTimeInMillis((timeInSec + ((long) zoneOffsetInSec)) * ((long) 1000));
        return changeToZeroTimeInSec(calendar);
    }

    public final long changeToCurrentTzZeroTimeOneDay(long originTime, int originTzInSec) {
        Calendar calendar = getCalendar(originTzInSec);
        long j = 1000;
        calendar.setTimeInMillis(originTime * j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar2.getTimeInMillis() / j;
    }

    public final long changeToDestZeroTimeOneDay2(long originTime, int originTzInSec, int destTzInSec) {
        long j = (originTime + ((long) originTzInSec)) - ((long) destTzInSec);
        Calendar calendar = getCalendar(destTzInSec);
        calendar.setTimeInMillis(j * ((long) 1000));
        return changeToZeroTimeInSec(calendar);
    }

    public final long changeToZeroTimeInSec(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / ((long) 1000);
    }

    @Nullable
    public final Long convertDateStrToTimeInMilli(@NotNull String dateStr, @NotNull String datePattern) {
        Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        Intrinsics.checkNotNullParameter(datePattern, "datePattern");
        try {
            Date date = new SimpleDateFormat(datePattern).parse(dateStr);
            if (date != null) {
                return Long.valueOf(date.getTime());
            }
            return null;
        } catch (ParseException e) {
            FitnessLogUtils.e(TAG, "convertDateStrToTimeInMilli", e);
            return null;
        }
    }

    public final long convertDateStrToZeroTime(@NotNull String dateStr, @NotNull String datePattern) {
        Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        Intrinsics.checkNotNullParameter(datePattern, "datePattern");
        new SimpleDateFormat(datePattern);
        Long lConvertDateStrToTimeInMilli = convertDateStrToTimeInMilli(dateStr, datePattern);
        return TimeDateUtil.changZeroOfTheDay(TimeUnit.MILLISECONDS.toSeconds(lConvertDateStrToTimeInMilli != null ? lConvertDateStrToTimeInMilli.longValue() : System.currentTimeMillis()));
    }

    public final boolean equalCalendarDay(@NotNull Calendar firstCalendar, @NotNull Calendar secondCalendar) {
        Intrinsics.checkNotNullParameter(firstCalendar, "firstCalendar");
        Intrinsics.checkNotNullParameter(secondCalendar, "secondCalendar");
        return firstCalendar.get(1) == secondCalendar.get(1) && firstCalendar.get(2) == secondCalendar.get(2) && firstCalendar.get(5) == secondCalendar.get(5);
    }

    public final long getSECONDS_ONE_DAY() {
        return SECONDS_ONE_DAY;
    }

    public final int getTZOffsetIn15min(long timeStamp, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return ((int) TimeUnit.MILLISECONDS.toMinutes(getTZOffsetInMilli(timeUnit.toMillis(timeStamp)))) / 15;
    }

    public final long getTZOffsetInSec(long timeInSec) {
        return TimeUnit.MILLISECONDS.toSeconds(getTZOffsetInMilli(timeInSec * ((long) 1000)));
    }

    @NotNull
    public final TimeZone getTimeZone(int zoneOffsetInSec) {
        Object objValueOf;
        String str = zoneOffsetInSec >= 0 ? Marker.ANY_NON_NULL_MARKER : "-";
        int minutes = (int) TimeUnit.SECONDS.toMinutes(Math.abs(zoneOffsetInSec));
        int i = minutes / 60;
        int i2 = minutes % 60;
        if (i2 < 10) {
            objValueOf = "0" + i2;
        } else {
            objValueOf = Integer.valueOf(i2);
        }
        TimeZone timeZone = TimeZone.getTimeZone("GMT" + str + i + ":" + objValueOf);
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
        return timeZone;
    }

    public final int getTzOffsetIn15minBySec(int tzInSec) {
        return tzInSec / 900;
    }

    public final long getUNIT_TIME_ZONE() {
        return UNIT_TIME_ZONE;
    }

    public final boolean isToday(long timeInSec, int tzOffsetInSec) {
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        int currentTZOffsetInSec = getCurrentTZOffsetInSec();
        return changeZeroOfTheDay(jCurrentTimeMillis, currentTZOffsetInSec) == changeToDestZeroTimeOneDay(timeInSec, tzOffsetInSec, currentTZOffsetInSec);
    }

    @NotNull
    public final String getDateStr(long tsInSec, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        String str = new SimpleDateFormat(pattern, Locale.getDefault()).format(new Date(tsInSec * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final long changeZeroOfTheDay(long timeInSec) {
        Calendar calendar = Calendar.getInstance();
        long j = 1000;
        calendar.setTimeInMillis(timeInSec * j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / j;
    }
}
