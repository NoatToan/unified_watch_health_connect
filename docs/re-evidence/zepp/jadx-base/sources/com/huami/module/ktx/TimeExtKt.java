package com.huami.module.ktx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u001e\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e*\u00020\u00032\u0006\u0010\r\u001a\u00020\f\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u001a*\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u001a*\u0010\u0017\u001a\u0004\u0018\u00010\u0003*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u001a \u0010\u0018\u001a\u0004\u0018\u00010\n*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u001a'\u0010\u0019\u001a\u0004\u0018\u00010\u0000*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001b\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u001a \u0010\u001b\u001a\u0004\u0018\u00010\u0010*\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u001a \u0010\u001b\u001a\u0004\u0018\u00010\u0010*\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u001a\u0012\u0010\u001d\u001a\u00020\f*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000\u001a\u0012\u0010\u001d\u001a\u00020\f*\u00020\n2\u0006\u0010\u001e\u001a\u00020\n\u001a\u0012\u0010\u001d\u001a\u00020\f*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003\"\u0017\u0010\"\u001a\u00020\u0000*\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0017\u0010$\u001a\u00020\u0000*\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010!\"\u0017\u0010\"\u001a\u00020\n*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010%\"\u0017\u0010$\u001a\u00020\n*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"", "", "isInThisYear", "Ljava/util/Calendar;", "currentYearFirstDay", "currentYearLatestDay", "isToday", "timeMillis", "isSameDay", "(JLjava/lang/Long;)Z", "Ljava/util/Date;", "date", "", "dayAgo", "Lkotlin/Pair;", "timeRange", "", "pattern", "Ljava/util/Locale;", "locale", "Ljava/util/TimeZone;", "timeZone", "currentDayStart", "currentDayEnd", "toDate", "toMillisecond", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/Long;", "toTimeString", "formerlyTimeMillisecond", "timeIntervalDays", "formerlyDate", "formerlyCalendar", "getBeginningTime", "(Ljava/util/Date;)J", "beginningTime", "getEndingTime", "endingTime", "(Ljava/util/Calendar;)Ljava/util/Date;", "hm-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class TimeExtKt {
    @Nullable
    public static final Calendar currentDayEnd(@NotNull String str, @NotNull String str2, @NotNull Locale locale, @NotNull TimeZone timeZone) {
        Date date = toDate(str, str2, locale);
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.setTime(date);
        calendar.set(11, calendar.getMaximum(11));
        calendar.set(12, calendar.getMaximum(12));
        calendar.set(13, calendar.getMaximum(13));
        calendar.set(14, calendar.getMaximum(14));
        return calendar;
    }

    public static /* synthetic */ Calendar currentDayEnd$default(String str, String str2, Locale locale, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd";
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        if ((i & 4) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return currentDayEnd(str, str2, locale, timeZone);
    }

    @Nullable
    public static final Calendar currentDayStart(@NotNull String str, @NotNull String str2, @NotNull Locale locale, @NotNull TimeZone timeZone) {
        Date date = toDate(str, str2, locale);
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.setTime(date);
        calendar.set(11, calendar.getMinimum(11));
        calendar.set(12, calendar.getMinimum(12));
        calendar.set(13, calendar.getMinimum(13));
        calendar.set(14, calendar.getMinimum(14));
        return calendar;
    }

    public static /* synthetic */ Calendar currentDayStart$default(String str, String str2, Locale locale, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd";
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        if ((i & 4) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return currentDayStart(str, str2, locale, timeZone);
    }

    @NotNull
    public static final Calendar currentYearFirstDay(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(6, calendar.getMinimum(6));
        calendar.set(11, calendar.getMinimum(11));
        calendar.set(12, calendar.getMinimum(12));
        calendar.set(13, calendar.getMinimum(13));
        calendar.set(14, calendar.getMinimum(14));
        return calendar;
    }

    @NotNull
    public static final Calendar currentYearLatestDay(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(2, calendar.getActualMaximum(2));
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, calendar.getActualMaximum(11));
        calendar.set(12, calendar.getActualMaximum(12));
        calendar.set(13, calendar.getActualMaximum(13));
        calendar.set(14, calendar.getActualMaximum(14));
        return calendar;
    }

    public static final long getBeginningTime(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, calendar.getMinimum(11));
        calendar.set(12, calendar.getMinimum(12));
        calendar.set(13, calendar.getMinimum(13));
        calendar.set(14, calendar.getMinimum(14));
        return calendar.getTimeInMillis();
    }

    public static final long getEndingTime(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, calendar.getMaximum(11));
        calendar.set(12, calendar.getMaximum(12));
        calendar.set(13, calendar.getMaximum(13));
        calendar.set(14, calendar.getMaximum(14));
        return calendar.getTimeInMillis();
    }

    public static final boolean isInThisYear(long j) {
        int i = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(1) == i;
    }

    public static final boolean isSameDay(long j, @Nullable Long l) {
        if (l == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(l.longValue()));
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static final boolean isToday(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
    }

    public static /* synthetic */ boolean isToday$default(String str, String str2, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd";
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return isToday(str, str2, locale);
    }

    public static final int timeIntervalDays(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return timeIntervalDays(calendar, calendar2);
    }

    @NotNull
    public static final Pair<Date, Date> timeRange(@NotNull Calendar calendar, int i) {
        if (i >= 0) {
            Date endingTime = getEndingTime(calendar);
            calendar.add(6, -i);
            return TuplesKt.to(getBeginningTime(calendar), endingTime);
        }
        Date beginningTime = getBeginningTime(calendar);
        calendar.add(6, -i);
        return TuplesKt.to(beginningTime, getEndingTime(calendar));
    }

    @Nullable
    public static final Date toDate(@NotNull String str, @NotNull String str2, @NotNull Locale locale) {
        try {
            return new SimpleDateFormat(str2, locale).parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static /* synthetic */ Date toDate$default(String str, String str2, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd";
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return toDate(str, str2, locale);
    }

    @Nullable
    public static final Long toMillisecond(@NotNull String str, @NotNull String str2, @NotNull Locale locale) {
        Date date = toDate(str, str2, locale);
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }

    public static /* synthetic */ Long toMillisecond$default(String str, String str2, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd";
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return toMillisecond(str, str2, locale);
    }

    @Nullable
    public static final String toTimeString(long j, @NotNull String str, @NotNull Locale locale) {
        return new SimpleDateFormat(str, locale).format(Long.valueOf(j));
    }

    public static /* synthetic */ String toTimeString$default(long j, String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "yyyy-MM-dd";
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return toTimeString(j, str, locale);
    }

    @Nullable
    public static final String toTimeString(@NotNull Date date, @NotNull String str, @NotNull Locale locale) {
        return new SimpleDateFormat(str, locale).format(date);
    }

    public static /* synthetic */ String toTimeString$default(Date date, String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "yyyy-MM-dd";
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return toTimeString(date, str, locale);
    }

    @Nullable
    public static final String toTimeString(@NotNull Calendar calendar, @NotNull String str, @NotNull Locale locale) {
        return new SimpleDateFormat(str, locale).format(calendar.getTime());
    }

    public static /* synthetic */ String toTimeString$default(Calendar calendar, String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "yyyy-MM-dd";
        }
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return toTimeString(calendar, str, locale);
    }

    public static final int timeIntervalDays(@NotNull Date date, @NotNull Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return timeIntervalDays(calendar, calendar2);
    }

    public static final boolean isToday(@NotNull String str, @NotNull String str2, @NotNull Locale locale) {
        try {
            Date date = new SimpleDateFormat(str2, locale).parse(str);
            if (date == null) {
                return false;
            }
            return isSameDay(date, new Date());
        } catch (ParseException unused) {
            return false;
        }
    }

    @NotNull
    public static final Date getBeginningTime(@NotNull Calendar calendar) {
        calendar.set(11, calendar.getMinimum(11));
        calendar.set(12, calendar.getMinimum(12));
        calendar.set(13, calendar.getMinimum(13));
        calendar.set(14, calendar.getMinimum(14));
        return calendar.getTime();
    }

    @NotNull
    public static final Date getEndingTime(@NotNull Calendar calendar) {
        calendar.set(11, calendar.getMaximum(11));
        calendar.set(12, calendar.getMaximum(12));
        calendar.set(13, calendar.getMaximum(13));
        calendar.set(14, calendar.getMaximum(14));
        return calendar.getTime();
    }

    public static final boolean isSameDay(@NotNull Date date, @Nullable Date date2) {
        if (date2 == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static final int timeIntervalDays(@NotNull Calendar calendar, @NotNull Calendar calendar2) {
        Pair pair = TuplesKt.to(Integer.valueOf(calendar.get(6)), Integer.valueOf(calendar.get(1)));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        Pair pair2 = TuplesKt.to(Integer.valueOf(calendar2.get(6)), Integer.valueOf(calendar2.get(1)));
        int iIntValue3 = ((Number) pair2.component1()).intValue();
        int iIntValue4 = ((Number) pair2.component2()).intValue();
        if (iIntValue2 == iIntValue4) {
            return iIntValue - iIntValue3;
        }
        int i = 0;
        if (iIntValue2 < iIntValue4) {
            while (true) {
                int i2 = iIntValue2 + 1;
                i += ((iIntValue2 % 4 != 0 || iIntValue2 % 100 == 0) && iIntValue2 % 400 != 0) ? 365 : 366;
                if (i2 >= iIntValue4) {
                    break;
                }
                iIntValue2 = i2;
            }
        }
        return i + (iIntValue - iIntValue3);
    }
}
