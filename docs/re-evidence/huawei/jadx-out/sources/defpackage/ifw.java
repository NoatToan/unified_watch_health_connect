package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class ifw {
    public static long e(long j) {
        return j * 1000;
    }

    public static long e(String str, String str2) {
        Calendar calendar = Calendar.getInstance();
        Date dateB = ieg.b(str, str2);
        if (dateB != null) {
            calendar.setTime(dateB);
        }
        return calendar.getTimeInMillis() / 1000;
    }

    public static String d(long j, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return ieg.d(calendar.getTime(), str);
    }

    public static String a(long j, TimeZone timeZone, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return ieg.c(calendar.getTime(), timeZone, str);
    }

    public static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.getTimeInMillis();
    }

    public static long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.getTimeInMillis();
    }
}
