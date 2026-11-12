package com.huami.snore.core.util;

import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u001a\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002\u001a\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¨\u0006\u0015"}, d2 = {"", "duration", "", "timeParseMS", "timeParseHMS", TrainingWebConst.QueryParam.VIDEO_FORMAT, "str", "Ljava/util/Date;", "timeStrToDate", "value", "timeStampToDate", "(Ljava/lang/Long;)Ljava/util/Date;", "Ljava/util/Calendar;", "currentDay", "", "isToday", "theDay", "c", "date", "a", "b", "snore_release"}, k = 2, mv = {1, 5, 1})
public final class DateParseUtilKt {
    private static final Calendar a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    private static final Calendar b(Calendar calendar) {
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar;
    }

    private static final boolean c(Calendar calendar, Calendar calendar2) {
        return calendar2.getTimeInMillis() >= a(calendar).getTimeInMillis() && calendar2.getTimeInMillis() <= b(calendar).getTimeInMillis();
    }

    public static final boolean isToday(@NotNull Calendar calendar) {
        return c(Calendar.getInstance(), calendar);
    }

    @NotNull
    public static final String timeParseHMS(long j) {
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        long j2 = 3600000;
        long j3 = j / j2;
        long j4 = j % j2;
        long j5 = 60000;
        long j6 = j4 / j5;
        long jRoundToLong = c.roundToLong((j4 % j5) / ((long) 1000));
        if (j3 < 10) {
            objValueOf = "0" + j3;
        } else {
            objValueOf = Long.valueOf(j3);
        }
        if (j6 < 10) {
            objValueOf2 = "0" + j6;
        } else {
            objValueOf2 = Long.valueOf(j6);
        }
        if (jRoundToLong < 10) {
            objValueOf3 = "0" + jRoundToLong;
        } else {
            objValueOf3 = Long.valueOf(jRoundToLong);
        }
        return objValueOf + ":" + objValueOf2 + "'" + objValueOf3 + "\"";
    }

    @NotNull
    public static final String timeParseMS(long j) {
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        long j2 = 60000;
        long j3 = j / j2;
        long jRoundToLong = c.roundToLong((j % j2) / ((long) 1000));
        if (0 == j3) {
            if (jRoundToLong < 10) {
                objValueOf3 = "0" + jRoundToLong;
            } else {
                objValueOf3 = Long.valueOf(jRoundToLong);
            }
            return objValueOf3 + "\"";
        }
        if (j3 < 10) {
            objValueOf = "0" + j3;
        } else {
            objValueOf = Long.valueOf(j3);
        }
        if (jRoundToLong < 10) {
            objValueOf2 = "0" + jRoundToLong;
        } else {
            objValueOf2 = Long.valueOf(jRoundToLong);
        }
        return objValueOf + "'" + objValueOf2 + "\"";
    }

    @Nullable
    public static final Date timeStampToDate(@Nullable Long l) {
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.setTimeInMillis(jLongValue);
        return calendar.getTime();
    }

    @Nullable
    public static final Date timeStrToDate(@NotNull String str, @Nullable String str2) {
        try {
            return new SimpleDateFormat(str).parse(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean isToday(@Nullable Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return c(Calendar.getInstance(), calendar);
    }
}
