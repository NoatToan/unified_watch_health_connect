package com.huami.training.util;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¨\u0006\t"}, d2 = {"Ljava/util/Date;", "", "daysAfter", "date", "", "isSameDay", "isBeforeDay", "isAfterDay", "diffDays", "lib_release"}, k = 2, mv = {1, 5, 1})
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
}
