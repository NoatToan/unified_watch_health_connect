package com.huami.pai.ext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0000*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\n\u0010\u000b\u001a\u00020\u0004*\u00020\u0000\"\u0017\u0010\u000e\u001a\u00020\u0004*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ljava/util/Date;", "date", "", "dayDiffs", "", "", "isToday", "nextDay", "", "pattern", "toDate", "getDateTimestamp", "getBeginningTime", "(Ljava/util/Date;)J", "beginningTime", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class DateExKt {
    public static final int dayDiffs(@NotNull Date date, @NotNull Date date2) {
        return (int) (Math.abs(getBeginningTime(date) - getBeginningTime(date2)) / TimeUnit.DAYS.toMillis(1L));
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

    public static final long getDateTimestamp(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeInMillis(date.getTime());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static final boolean isToday(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
    }

    @NotNull
    public static final Date nextDay(@NotNull Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i);
        return calendar.getTime();
    }

    @Nullable
    public static final Date toDate(@NotNull String str, @Nullable String str2) {
        try {
            return new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
