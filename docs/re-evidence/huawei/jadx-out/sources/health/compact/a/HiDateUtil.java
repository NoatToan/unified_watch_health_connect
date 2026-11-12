package health.compact.a;

import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.material.timepicker.TimeModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class HiDateUtil {
    public static String c(Date date, String str) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(str, Locale.ENGLISH).format(date);
    }

    public static String d(String str) {
        return c(new Date(), str);
    }

    public static String e(String str, String str2, int i) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(c(str, str2));
        calendar.add(6, -i);
        return c(calendar.getTime(), str2);
    }

    private static Date c(String str, String str2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.ENGLISH);
        simpleDateFormat.setLenient(false);
        return simpleDateFormat.parse(str);
    }

    public static int d(long j) {
        return e(j, (TimeZone) null);
    }

    public static int e(long j, TimeZone timeZone) {
        Calendar calendar = timeZone != null ? Calendar.getInstance(timeZone) : Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
    }

    public static long a(int i) {
        if (i < 10000000 || i > 100000000) {
            return 0L;
        }
        try {
            return c(Integer.toString(i), "yyyyMMdd").getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static TimeZone b(String str) {
        TimeZone timeZone = TimeZone.getDefault();
        if (str != null && str.length() == 5) {
            TimeZone timeZone2 = TimeZone.getTimeZone("GMT" + str.substring(0, 3) + ":" + str.substring(3));
            if (timeZone.getRawOffset() != timeZone2.getRawOffset()) {
                return timeZone2;
            }
        }
        return timeZone;
    }

    public static long b(int i, String str) {
        String strValueOf = String.valueOf(i);
        if (strValueOf == null || strValueOf.length() != 8) {
            health.compact.a.util.LogUtil.c("HiDateUtil", "Invalid date");
            return 0L;
        }
        try {
            return LocalDate.of(Integer.parseInt(strValueOf.substring(0, 4)), Integer.parseInt(strValueOf.substring(4, 6)), Integer.parseInt(strValueOf.substring(6, 8))).atStartOfDay(b(str).toZoneId()).toInstant().toEpochMilli();
        } catch (NumberFormatException unused) {
            health.compact.a.util.LogUtil.c("HiDateUtil", "NumberFormatException dateStr:", strValueOf);
            return 0L;
        } catch (DateTimeException unused2) {
            health.compact.a.util.LogUtil.c("HiDateUtil", "DateTimeException dateStr:", strValueOf);
            return 0L;
        }
    }

    public static String c(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return new SimpleDateFormat("Z").format(Calendar.getInstance().getTime());
    }

    public static int e(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(6, -i);
        return d(calendar.getTimeInMillis());
    }

    public static int d(int i, int i2, String str) throws ParseException {
        return d(Integer.toString(i), Integer.toString(i2), str);
    }

    public static int d(String str, String str2, String str3) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, Locale.ENGLISH);
        return ((int) ((simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime()) / 8.64E7d)) + 1;
    }

    public static long p(long j) {
        return b(j, 0, 0, 0, 0).getTime().getTime();
    }

    public static long h(long j) {
        Calendar calendarB = b(j, 0, 0, 0, 0);
        calendarB.add(5, 1);
        return calendarB.getTime().getTime();
    }

    public static long k(long j) {
        Calendar calendarB = b(j, 0, 0, 0, 0);
        calendarB.add(5, -1);
        return calendarB.getTime().getTime();
    }

    public static long g(long j) {
        return b(j, 23, 59, 59, 999).getTime().getTime();
    }

    public static long e(long j) {
        return j - (j % 60000);
    }

    public static long c(long j) {
        Calendar calendarB = b(j, 20, 0, 0, 0);
        calendarB.add(5, -1);
        return calendarB.getTime().getTime();
    }

    public static long b(long j) {
        Calendar calendarB = b(j, 20, 0, 0, 0);
        calendarB.add(5, 1);
        return calendarB.getTime().getTime();
    }

    public static long t(long j) {
        return b(j, 20, 0, 0, 0).getTime().getTime();
    }

    public static long r(long j) {
        if (j < t(j)) {
            return p(j);
        }
        return h(j);
    }

    public static long o(long j) {
        long jT = t(j);
        return j >= jT ? jT : c(j);
    }

    public static long m(long j) {
        long jT = t(j);
        return j < jT ? jT - 1 : b(j) - 1;
    }

    public static String l(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j));
    }

    public static String e(long j, String str) {
        return new SimpleDateFormat(str).format(Long.valueOf(j));
    }

    public static long q(long j) {
        return (j / 1000) * 1000;
    }

    public static long f(long j) {
        return ((j / 1000) * 1000) + 999;
    }

    public static long e(long j, int i, int i2) {
        return b(j, i, i2, 0, 0).getTime().getTime();
    }

    private static Calendar b(long j, int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        calendar.set(14, i4);
        return calendar;
    }

    private static Calendar b(long j, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance();
        if (timeZone != null) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setTimeInMillis(j);
        return calendar;
    }

    public static long[] s(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (calendar.get(7) == 1) {
            calendar.add(5, -1);
        }
        calendar.setFirstDayOfWeek(2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calendar.add(5, calendar.getFirstDayOfWeek() - calendar.get(7));
        health.compact.a.util.LogUtil.a("HiDateUtil", "current monday date= ", simpleDateFormat.format(calendar.getTime()));
        long jP = p(calendar.getTimeInMillis());
        calendar.add(5, 6);
        long[] jArr = {jP, g(calendar.getTimeInMillis())};
        health.compact.a.util.LogUtil.a("HiDateUtil", "current monday date =- ", simpleDateFormat.format(calendar.getTime()));
        return jArr;
    }

    public static String i(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "Md")).format(date);
    }

    public static String v(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return String.valueOf(calendar.get(1));
    }

    public static String j(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(2) + 1));
    }

    public static String a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(5)));
    }

    public static String y(long j) {
        Calendar.getInstance().setTimeInMillis(j);
        StringBuilder sb = new StringBuilder(16);
        sb.append(v(j));
        sb.append(j(j));
        sb.append(a(j));
        return sb.toString();
    }

    public static long a(String str) {
        SimpleDateFormat simpleDateFormat;
        health.compact.a.util.LogUtil.a("HiDateUtil", "enter getMilliTime", str);
        long time = -1;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } catch (IllegalArgumentException e) {
            health.compact.a.util.LogUtil.c("HiDateUtil", "new IllegalArgumentException ", e.getMessage());
            simpleDateFormat = null;
        }
        if (simpleDateFormat == null) {
            health.compact.a.util.LogUtil.a("HiDateUtil", "format null");
            return -1L;
        }
        try {
            Date date = simpleDateFormat.parse(str);
            health.compact.a.util.LogUtil.a("HiDateUtil", date);
            time = date.getTime();
            health.compact.a.util.LogUtil.a("HiDateUtil", "time is ", Long.valueOf(time));
            return time;
        } catch (ParseException e2) {
            health.compact.a.util.LogUtil.c("HiDateUtil", "getMilliTime error ", e2.getMessage());
            return time;
        }
    }

    public static Date d(String str, String str2, TimeZone timeZone) throws ParseException {
        if (str2 == null) {
            return new Date();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.ENGLISH);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        simpleDateFormat.setLenient(false);
        return simpleDateFormat.parse(str);
    }

    public static String n(long j) {
        return d(j, null);
    }

    public static String d(long j, TimeZone timeZone) {
        return a(j, timeZone, "Z");
    }

    private static String a(long j, TimeZone timeZone, String str) {
        if (str == null) {
            return "";
        }
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    public static long a(long j, TimeZone timeZone, int i) {
        Calendar calendarB = b(j, timeZone);
        calendarB.add(1, i);
        return calendarB.getTimeInMillis();
    }

    public static long c(long j, int i) {
        return a(j, TimeZone.getDefault(), i);
    }

    public static long a(long j, TimeZone timeZone) {
        return d(j, timeZone, 0);
    }

    public static long c(long j, TimeZone timeZone) {
        return c(j, timeZone, 0);
    }

    public static long c(long j, TimeZone timeZone, int i) {
        return d(j, timeZone, i + 1) - 1;
    }

    public static long d(long j, TimeZone timeZone, int i) {
        ZoneId zoneId = timeZone.toZoneId();
        return Instant.ofEpochMilli(j).atZone(zoneId).toLocalDate().plusDays(i).atStartOfDay(zoneId).toInstant().toEpochMilli();
    }
}
