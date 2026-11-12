package com.huami.femalehealth.logiclib.helper;

import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.Milli;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000\u001a\u0012\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0012\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000\u001a\u0012\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¨\u0006\u0011"}, d2 = {"Ljava/util/Date;", "", "isZeroHour", "", "", "num", "offset", "other", "min", "max", "diff", "getMonthDate", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "toTriple", "Ljava/util/Calendar;", "", "setStartOfDay", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class DateHelperKt {
    public static final int diff(@NotNull Date date, @NotNull Date date2) {
        return (int) ((date.getTime() - date2.getTime()) / 86400000);
    }

    @NotNull
    public static final Date getMonthDate(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTime());
        calendar.add(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new Date(calendar.getTimeInMillis());
    }

    public static final boolean isZeroHour(@NotNull Date date) {
        return isZeroHour(date.getTime());
    }

    @NotNull
    public static final Date max(@NotNull Date date, @NotNull Date date2) {
        return date.after(date2) ? date : date2;
    }

    @NotNull
    public static final Date min(@NotNull Date date, @NotNull Date date2) {
        return date.after(date2) ? date2 : date;
    }

    @NotNull
    public static final Date offset(@NotNull Date date, int i) {
        return new Date(date.getTime() + (((long) i) * 86400000));
    }

    public static final void setStartOfDay(@NotNull Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    @NotNull
    public static final DateTriple toTriple(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTime());
        return new DateTriple(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }

    public static final boolean isZeroHour(long j) {
        return j == AidKt.toDate(AidKt.toDateTriple(new Milli(j))).getTime();
    }

    @NotNull
    public static final Date max(@NotNull Date date, long j) {
        Date date2 = new Date(j);
        return date.after(date2) ? date : date2;
    }

    @NotNull
    public static final Date min(@NotNull Date date, long j) {
        Date date2 = new Date(j);
        return date.after(date2) ? date2 : date;
    }
}
