package defpackage;

import cn.hutool.core.date.DateTime;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class fa3 {
    public static int a(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Birthday is after dateToCompare!");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        boolean z = i3 == calendar.getActualMaximum(5);
        calendar.setTimeInMillis(j);
        int i4 = i - calendar.get(1);
        int i5 = calendar.get(2);
        if (i2 == i5) {
            int i6 = calendar.get(5);
            boolean z2 = i6 == calendar.getActualMaximum(5);
            if ((z && z2) || i3 >= i6) {
                return i4;
            }
        } else if (i2 >= i5) {
            return i4;
        }
        return i4 - 1;
    }

    public static Calendar b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar;
    }

    public static Calendar c(Date date) {
        return date instanceof DateTime ? ((DateTime) date).toCalendar() : b(date.getTime());
    }
}
