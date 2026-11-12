package defpackage;

import java.util.Calendar;

/* JADX INFO: loaded from: classes8.dex */
public class ffp {
    public static long a(int i, int i2, int i3, int i4) {
        int i5 = (i3 < i || (i3 == i && i4 < i2)) ? 1 : 0;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(5, calendar.get(5) + i5);
        calendar2.set(11, i3);
        calendar2.set(12, i4);
        calendar2.set(13, calendar.get(13));
        calendar2.set(14, calendar.get(14));
        return calendar2.getTimeInMillis() - timeInMillis;
    }
}
