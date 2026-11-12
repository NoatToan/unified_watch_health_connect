package defpackage;

import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class cq5 {
    public static njh<String, String> a(Long l, Long l2) {
        return b(l, l2, null);
    }

    public static njh<String, String> b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return njh.a(null, null);
        }
        if (l == null) {
            return njh.a(null, d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return njh.a(d(l.longValue(), simpleDateFormat), null);
        }
        Calendar calendarJ = mlq.j();
        Calendar calendarL = mlq.l();
        calendarL.setTimeInMillis(l.longValue());
        Calendar calendarL2 = mlq.l();
        calendarL2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return njh.a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        }
        if (calendarL.get(1) == calendarL2.get(1)) {
            return calendarL.get(1) == calendarJ.get(1) ? njh.a(f(l.longValue(), Locale.getDefault()), f(l2.longValue(), Locale.getDefault())) : njh.a(f(l.longValue(), Locale.getDefault()), k(l2.longValue(), Locale.getDefault()));
        }
        return njh.a(k(l.longValue(), Locale.getDefault()), k(l2.longValue(), Locale.getDefault()));
    }

    public static String c(long j) {
        return d(j, null);
    }

    public static String d(long j, SimpleDateFormat simpleDateFormat) {
        Calendar calendarJ = mlq.j();
        Calendar calendarL = mlq.l();
        calendarL.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        return calendarJ.get(1) == calendarL.get(1) ? e(j) : j(j);
    }

    public static String e(long j) {
        return f(j, Locale.getDefault());
    }

    public static String f(long j, Locale locale) {
        return mlq.b(locale).format(new Date(j));
    }

    public static String g(long j) {
        return h(j, Locale.getDefault());
    }

    public static String h(long j, Locale locale) {
        return mlq.c(locale).format(new Date(j));
    }

    public static String i(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    public static String j(long j) {
        return k(j, Locale.getDefault());
    }

    public static String k(long j, Locale locale) {
        return mlq.n(locale).format(new Date(j));
    }

    public static String l(long j) {
        return m(j, Locale.getDefault());
    }

    public static String m(long j, Locale locale) {
        return mlq.o(locale).format(new Date(j));
    }
}
