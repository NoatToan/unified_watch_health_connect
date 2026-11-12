package defpackage;

import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.wearengine.sensor.DataResult;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class lsl {
    public static List<Integer> a(int i, int i2) {
        return b(DateFormatUtil.d(i), (TimeZone) null, DateFormatUtil.d(i2), (TimeZone) null);
    }

    public static List<Integer> b(long j, TimeZone timeZone, long j2, TimeZone timeZone2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        calendar.setTimeZone(timeZone);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (timeZone2 == null) {
            timeZone2 = TimeZone.getDefault();
        }
        calendar2.setTimeZone(timeZone2);
        ArrayList arrayList = new ArrayList();
        while (!calendar.after(calendar2)) {
            arrayList.add(Integer.valueOf(DateFormatUtil.a(calendar.getTimeInMillis())));
            calendar.add(5, 1);
        }
        return arrayList;
    }

    public static int b(long j, long j2) {
        if (j > j2) {
            return -b(j2, j);
        }
        return ((int) Math.round(((j2 - j) * 1.0d) / 8.64E7d)) + 1;
    }

    public static int b(int i, int i2) {
        return d(String.valueOf(i), String.valueOf(i2), DateFormatUtil.DateFormatType.DATE_FORMAT_8);
    }

    public static int d(String str, String str2, DateFormatUtil.DateFormatType dateFormatType) {
        try {
            return a(DateFormatUtil.b(str, dateFormatType, TimeZone.getDefault()).getTime(), DateFormatUtil.b(str2, dateFormatType, TimeZone.getDefault()).getTime());
        } catch (ParseException unused) {
            return 0;
        }
    }

    public static int c(long j, TimeZone timeZone, long j2, TimeZone timeZone2) {
        return c(b(j, timeZone), b(j2, timeZone2));
    }

    private static int c(int i, int i2) {
        return i > i2 ? -c(i2, i) : (i2 - i) + 1;
    }

    public static int a(long j, long j2) {
        return c(j, TimeZone.getDefault(), j2, TimeZone.getDefault());
    }

    public static int e(long j, long j2) {
        return d(j, j2, 2);
    }

    public static int d(long j, long j2, int i) {
        return b(j, null, j2, null, i);
    }

    public static int b(long j, TimeZone timeZone, long j2, TimeZone timeZone2, int i) {
        Calendar calendarAd = ad(j, timeZone);
        Calendar calendarAd2 = ad(j2, timeZone2);
        calendarAd.setMinimalDaysInFirstWeek(1);
        calendarAd.setFirstDayOfWeek(i);
        calendarAd2.setMinimalDaysInFirstWeek(1);
        calendarAd2.setFirstDayOfWeek(i);
        int i2 = calendarAd.get(1);
        int iE = calendarAd.get(3);
        int i3 = calendarAd2.get(1);
        int iE2 = calendarAd2.get(3);
        if (iE == 1 && calendarAd.get(2) == 11) {
            i2++;
        }
        if (iE2 == 1 && calendarAd2.get(2) == 11) {
            i3++;
        }
        if (i2 > i3) {
            iE += e(i3, i2 - 1, i);
        } else if (i2 < i3) {
            iE2 += e(i2, i3 - 1, i);
        }
        return iE > iE2 ? (iE2 - iE) - 1 : (iE2 - iE) + 1;
    }

    public static int d(int i, int i2) {
        if (i < 1970 || i2 < 1 || i2 > 7) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setMinimalDaysInFirstWeek(1);
        calendar.setFirstDayOfWeek(i2);
        calendar.set(i, 11, 25);
        return calendar.get(3);
    }

    public static int e(int i, int i2, int i3) {
        if (i > i2) {
            return -e(i2, i, i3);
        }
        int iD = 0;
        while (i <= i2) {
            iD += d(i, i3);
            i++;
        }
        return iD;
    }

    public static boolean aa(long j) {
        return c(j, System.currentTimeMillis());
    }

    public static boolean ai(long j) {
        return c(j, d(System.currentTimeMillis(), -1));
    }

    public static boolean ag(long j) {
        return c(j, d(System.currentTimeMillis(), 1));
    }

    public static boolean z(long j) {
        return aa(j, TimeZone.getDefault());
    }

    public static boolean aa(long j, TimeZone timeZone) {
        return e(j, System.currentTimeMillis(), timeZone);
    }

    public static boolean e(long j, long j2, TimeZone timeZone) {
        return c(j, timeZone, j2, timeZone) > 1;
    }

    public static boolean ab(long j) {
        return z(j, TimeZone.getDefault());
    }

    public static boolean z(long j, TimeZone timeZone) {
        return a(j, System.currentTimeMillis(), timeZone);
    }

    public static boolean a(long j, long j2, TimeZone timeZone) {
        return c(j2, timeZone, j, timeZone) > 1;
    }

    public static boolean h(long j, long j2) {
        return TimeUnit.MILLISECONDS.toMinutes(j) == TimeUnit.MILLISECONDS.toMinutes(j2);
    }

    public static boolean d(long j, long j2) {
        return c(j, j2) && ad(j, TimeZone.getDefault()).get(10) == ad(j2, TimeZone.getDefault()).get(10);
    }

    public static boolean c(long j, long j2) {
        return a(j, j2) == 1;
    }

    public static boolean g(long j, long j2) {
        return a(j, j2, 2);
    }

    public static boolean a(long j, long j2, int i) {
        return d(j, j2, i) == 1;
    }

    public static boolean f(long j, long j2) {
        Calendar calendarAd = ad(j, TimeZone.getDefault());
        Calendar calendarAd2 = ad(j2, TimeZone.getDefault());
        return calendarAd.get(1) == calendarAd2.get(1) && calendarAd.get(2) == calendarAd2.get(2);
    }

    public static boolean i(long j, long j2) {
        return d(j, j2, TimeZone.getDefault());
    }

    public static boolean d(long j, long j2, TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        return ad(j, timeZone).get(1) == ad(j2, timeZone).get(1);
    }

    public static int a(long j) {
        return b(j, (TimeZone) null);
    }

    public static int b(long j, TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        return ((int) ((j + ((long) timeZone.getOffset(j))) / 86400000)) + 1;
    }

    public static int k(long j) {
        return n(j, null);
    }

    public static int n(long j, TimeZone timeZone) {
        return ad(j, timeZone).getActualMaximum(5);
    }

    public static long d(long j, int i) {
        return j(j, TimeZone.getDefault(), i);
    }

    public static long j(long j, TimeZone timeZone, int i) {
        Calendar calendarAd = ad(j, timeZone);
        calendarAd.add(5, i);
        return calendarAd.getTimeInMillis();
    }

    public static long a(long j, int i, int i2, boolean z) {
        return d(j, TimeZone.getDefault(), i, i2, z);
    }

    public static long d(long j, TimeZone timeZone, int i, int i2, boolean z) {
        Calendar calendarAd = ad(j, timeZone);
        c(calendarAd, i, i2, z);
        return calendarAd.getTimeInMillis();
    }

    public static long a(long j, int i, int i2) {
        return a(j, TimeZone.getDefault(), i, i2);
    }

    public static long a(long j, TimeZone timeZone, int i, int i2) {
        Calendar calendarAd = ad(j, timeZone);
        c(calendarAd, i, i2, false);
        return calendarAd.getTimeInMillis();
    }

    public static long c(long j, int i) {
        return d(j, TimeZone.getDefault(), i);
    }

    public static long d(long j, TimeZone timeZone, int i) {
        ZoneId zoneId = timeZone.toZoneId();
        return Instant.ofEpochMilli(j).atZone(zoneId).toLocalDate().plusDays(i).atStartOfDay(zoneId).toInstant().toEpochMilli();
    }

    public static long a(long j, int i) {
        return e(j, TimeZone.getDefault(), i);
    }

    public static long e(long j, TimeZone timeZone, int i) {
        return d(j, timeZone, i + 1) - 1;
    }

    public static long r(long j) {
        return r(j, TimeZone.getDefault());
    }

    public static long r(long j, TimeZone timeZone) {
        return d(j, timeZone, 0);
    }

    public static long c(long j) {
        return a(j, TimeZone.getDefault());
    }

    public static long a(long j, TimeZone timeZone) {
        return e(j, timeZone, 0);
    }

    public static long u(long j) {
        return u(j, TimeZone.getDefault());
    }

    public static long u(long j, TimeZone timeZone) {
        return d(j, timeZone, -1);
    }

    public static long f(long j) {
        return h(j, TimeZone.getDefault());
    }

    public static long h(long j, TimeZone timeZone) {
        return e(j, timeZone, -1);
    }

    public static long w(long j) {
        return t(j, TimeZone.getDefault());
    }

    public static long t(long j, TimeZone timeZone) {
        return d(j, timeZone, 1);
    }

    public static long g(long j) {
        return f(j, TimeZone.getDefault());
    }

    public static long f(long j, TimeZone timeZone) {
        return e(j, timeZone, 1);
    }

    public static long e(long j, int i, int i2) {
        return c(j, TimeZone.getDefault(), i, i2);
    }

    public static long c(long j, TimeZone timeZone, int i, int i2) {
        Calendar calendarAd = ad(j, timeZone);
        calendarAd.add(3, i2);
        while (calendarAd.get(7) != i) {
            calendarAd.add(5, -1);
        }
        d(calendarAd);
        return calendarAd.getTimeInMillis();
    }

    public static long b(long j, int i, int i2) {
        return d(j, TimeZone.getDefault(), i, i2);
    }

    public static long d(long j, TimeZone timeZone, int i, int i2) {
        return c(j, timeZone, i, i2 + 1) - 1;
    }

    public static long[] b(long j, TimeZone timeZone, int i, int i2) {
        return new long[]{c(j, timeZone, i, i2), d(j, timeZone, i, i2)};
    }

    public static int o(long j) {
        return o(j, TimeZone.getDefault());
    }

    public static int e(long j) {
        return ad(j, TimeZone.getDefault()).get(7);
    }

    public static int o(long j, TimeZone timeZone) {
        int i = ad(j, timeZone).get(7);
        if (i == 1) {
            return 7;
        }
        return i - 1;
    }

    public static long e(long j, int i) {
        return g(j, TimeZone.getDefault(), i);
    }

    public static long g(long j, TimeZone timeZone, int i) {
        Calendar calendarAd = ad(j, timeZone);
        calendarAd.set(5, 1);
        calendarAd.add(2, i);
        d(calendarAd);
        return calendarAd.getTimeInMillis();
    }

    public static long a(long j, TimeZone timeZone, int i) {
        return g(j, timeZone, i + 1) - 1;
    }

    public static long x(long j) {
        return v(j, TimeZone.getDefault());
    }

    public static long v(long j, TimeZone timeZone) {
        return g(j, timeZone, -1);
    }

    public static long i(long j) {
        return j(j, TimeZone.getDefault());
    }

    public static long j(long j, TimeZone timeZone) {
        return a(j, timeZone, -1);
    }

    public static long p(long j) {
        return q(j, TimeZone.getDefault());
    }

    public static long q(long j, TimeZone timeZone) {
        return g(j, timeZone, 0);
    }

    public static long b(long j) {
        return e(j, TimeZone.getDefault());
    }

    public static long e(long j, TimeZone timeZone) {
        return a(j, timeZone, 0);
    }

    public static long v(long j) {
        return y(j, TimeZone.getDefault());
    }

    public static long y(long j, TimeZone timeZone) {
        return g(j, timeZone, 1);
    }

    public static long j(long j) {
        return i(j, TimeZone.getDefault());
    }

    public static long i(long j, TimeZone timeZone) {
        return a(j, timeZone, 1);
    }

    public static long b(long j, int i) {
        return h(j, TimeZone.getDefault(), i);
    }

    public static long h(long j, TimeZone timeZone, int i) {
        Calendar calendarAd = ad(j, timeZone);
        calendarAd.set(5, 1);
        calendarAd.set(2, 0);
        calendarAd.add(1, i);
        d(calendarAd);
        return calendarAd.getTimeInMillis();
    }

    public static long b(long j, TimeZone timeZone, int i) {
        return h(j, timeZone, i + 1) - 1;
    }

    public static long t(long j) {
        return p(j, TimeZone.getDefault());
    }

    public static long p(long j, TimeZone timeZone) {
        return h(j, timeZone, 0);
    }

    public static long d(long j) {
        return c(j, TimeZone.getDefault());
    }

    public static long c(long j, TimeZone timeZone) {
        return b(j, timeZone, 0);
    }

    public static long ac(long j) {
        return w(j, TimeZone.getDefault());
    }

    public static long w(long j, TimeZone timeZone) {
        return h(j, timeZone, -1);
    }

    public static long h(long j) {
        return g(j, TimeZone.getDefault());
    }

    public static long g(long j, TimeZone timeZone) {
        return b(j, timeZone, -1);
    }

    public static long y(long j) {
        return x(j, TimeZone.getDefault());
    }

    public static long x(long j, TimeZone timeZone) {
        return h(j, timeZone, 1);
    }

    public static String q(long j) {
        return s(j, null);
    }

    public static String s(long j, TimeZone timeZone) {
        return DateFormatUtil.b(j, timeZone, DateFormatUtil.DateFormatType.DATE_FORMAT_RFC_TIME_ZONE);
    }

    public static TimeZone a(String str) {
        if (str == null || str.isEmpty()) {
            return TimeZone.getDefault();
        }
        return TimeZone.getTimeZone("GMT" + str);
    }

    public static long d(long j, TimeZone timeZone, TimeZone timeZone2) {
        if (timeZone != null && timeZone2 != null) {
            if (timeZone2.useDaylightTime()) {
                try {
                    return DateFormatUtil.b(DateFormatUtil.b(j, timeZone, DateFormatUtil.DateFormatType.DATE_FORMAT_17), DateFormatUtil.DateFormatType.DATE_FORMAT_17, timeZone2).getTime();
                } catch (ParseException unused) {
                }
            } else {
                return (((long) timeZone.getOffset(j)) + j) - ((long) timeZone2.getOffset(j));
            }
        }
        return j;
    }

    public static long d(long j, TimeZone timeZone) {
        return d(j, timeZone, d());
    }

    public static TimeZone d() {
        return TimeZone.getTimeZone(DataResult.UTC);
    }

    public static int a() {
        return ad(System.currentTimeMillis());
    }

    public static int ad(long j) {
        return ab(j, TimeZone.getDefault());
    }

    public static int ab(long j, TimeZone timeZone) {
        return ad(j, timeZone).get(1);
    }

    public static int l(long j) {
        return k(j, TimeZone.getDefault());
    }

    public static int k(long j, TimeZone timeZone) {
        return ad(j, timeZone).get(2);
    }

    public static int m(long j) {
        return m(j, TimeZone.getDefault());
    }

    public static int m(long j, TimeZone timeZone) {
        return ad(j, timeZone).get(11);
    }

    public static int n(long j) {
        return l(j, TimeZone.getDefault());
    }

    public static long i(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(a(q(j)));
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, i);
        return calendar.getTimeInMillis();
    }

    public static int l(long j, TimeZone timeZone) {
        return ad(j, timeZone).get(12);
    }

    public static long s(long j) {
        return c(j, TimeZone.getDefault(), 0);
    }

    public static long c(long j, TimeZone timeZone, int i) {
        Calendar calendarAd = ad(j, timeZone);
        calendarAd.set(14, 0);
        calendarAd.set(13, 0);
        calendarAd.set(12, 0);
        calendarAd.add(11, i);
        return calendarAd.getTimeInMillis();
    }

    private static Calendar ad(long j, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance();
        if (timeZone != null) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setTimeInMillis(j);
        return calendar;
    }

    private static void d(Calendar calendar) {
        c(calendar, 0, 0, false);
    }

    private static void c(Calendar calendar, int i, int i2, boolean z) {
        if (z) {
            calendar.set(11, i);
            calendar.set(12, i2);
        } else {
            if (i < 0) {
                calendar.set(11, 0);
            } else {
                calendar.set(11, Math.min(i, 23));
            }
            if (i2 < 0) {
                calendar.set(12, 0);
            } else {
                calendar.set(12, Math.min(i2, 59));
            }
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
}
