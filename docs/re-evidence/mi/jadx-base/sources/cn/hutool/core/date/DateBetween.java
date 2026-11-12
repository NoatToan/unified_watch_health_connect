package cn.hutool.core.date;

import defpackage.fa3;
import defpackage.qk1;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class DateBetween implements Serializable {
    private static final long serialVersionUID = 1;
    private final Date begin;
    private final Date end;

    public DateBetween(Date date, Date date2) {
        this(date, date2, true);
    }

    public static DateBetween create(Date date, Date date2) {
        return new DateBetween(date, date2);
    }

    public long between(DateUnit dateUnit) {
        return (this.end.getTime() - this.begin.getTime()) / dateUnit.getMillis();
    }

    public long betweenMonth(boolean z) {
        Calendar calendarC = fa3.c(this.begin);
        Calendar calendarC2 = fa3.c(this.end);
        int i = ((calendarC2.get(1) - calendarC.get(1)) * 12) + (calendarC2.get(2) - calendarC.get(2));
        if (!z) {
            calendarC2.set(1, calendarC.get(1));
            calendarC2.set(2, calendarC.get(2));
            if (calendarC2.getTimeInMillis() - calendarC.getTimeInMillis() < 0) {
                return i - 1;
            }
        }
        return i;
    }

    public long betweenYear(boolean z) {
        Calendar calendarC = fa3.c(this.begin);
        Calendar calendarC2 = fa3.c(this.end);
        int i = calendarC2.get(1) - calendarC.get(1);
        if (!z) {
            if (1 == calendarC.get(2) && 1 == calendarC2.get(2) && calendarC.get(5) == calendarC.getActualMaximum(5) && calendarC2.get(5) == calendarC2.getActualMaximum(5)) {
                calendarC.set(5, 1);
                calendarC2.set(5, 1);
            }
            calendarC2.set(1, calendarC.get(1));
            if (calendarC2.getTimeInMillis() - calendarC.getTimeInMillis() < 0) {
                return i - 1;
            }
        }
        return i;
    }

    public String toString(BetweenFormatter.Level level) {
        return a.l(between(DateUnit.MS), level);
    }

    public DateBetween(Date date, Date date2, boolean z) {
        qk1.u(date, "Begin date is null !", new Object[0]);
        qk1.u(date2, "End date is null !", new Object[0]);
        if (z && date.after(date2)) {
            this.begin = date2;
            this.end = date;
        } else {
            this.begin = date;
            this.end = date2;
        }
    }

    public static DateBetween create(Date date, Date date2, boolean z) {
        return new DateBetween(date, date2, z);
    }

    public String toString() {
        return toString(BetweenFormatter.Level.MILLISECOND);
    }
}
