package com.huami.message.util;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0013\u0010\f\u001a\u00020\u0001*\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljava/util/Date;", "", "daysAfter", "date", "", "isSameDay", "isBeforeDay", "isAfterDay", "diffDays", "diffHours", "diffMinutes", "", "parseMillsToMins", "(Ljava/lang/Long;)I", "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class DateUtilsKt {
    @NotNull
    public static final Date daysAfter(@NotNull Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i);
        return calendar.getTime();
    }

    public static final int diffDays(@NotNull Date date, @Nullable Date date2) {
        if (date2 == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 86400000));
    }

    public static final int diffHours(@NotNull Date date, @Nullable Date date2) {
        if (date2 == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 3600000));
    }

    public static final int diffMinutes(@NotNull Date date, @Nullable Date date2) {
        if (date2 == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 60000));
    }

    public static final boolean isAfterDay(@NotNull Date date, @Nullable Date date2) {
        if (isSameDay(date, date2) || date2 == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar.clear(11);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar2.clear(11);
        calendar2.clear(12);
        calendar2.clear(13);
        calendar2.clear(14);
        return calendar.after(calendar2);
    }

    public static final boolean isBeforeDay(@NotNull Date date, @Nullable Date date2) {
        if (isSameDay(date, date2) || date2 == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar.clear(11);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar2.clear(11);
        calendar2.clear(12);
        calendar2.clear(13);
        calendar2.clear(14);
        return calendar.before(calendar2);
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

    public static final int parseMillsToMins(@Nullable Long l) {
        if (l == null) {
            return 0;
        }
        long jLongValue = l.longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(jLongValue);
        if (timeUnit.toSeconds(jLongValue) - (jLongValue * ((long) 60)) > 30) {
            minutes++;
        }
        return (int) minutes;
    }
}
