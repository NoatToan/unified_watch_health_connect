package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ift {
    public static int b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    public static long a(long j) {
        return e(j, 0);
    }

    public static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 23);
        calendar.set(13, 59);
        calendar.set(12, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static long c(long j) {
        return e(j, 1) - 1;
    }

    public static long b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(5, calendar.getActualMinimum(5));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return e(calendar.getTimeInMillis(), 1) - 1;
    }

    private static long e(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(5, i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static int j(long j) {
        return (int) ((j + ((long) TimeZone.getDefault().getOffset(j))) / 86400000);
    }

    public static int c(String str) {
        Date dateB = ieg.b(str, "yyyy-MM-dd");
        if (dateB != null) {
            return j(dateB.getTime());
        }
        return -1;
    }

    public static long h(long j) {
        long j2 = j * 1000;
        return j2 - ((long) TimeZone.getDefault().getOffset(j2));
    }

    public static long g(long j) {
        return (j + ((long) TimeZone.getDefault().getOffset(j))) / 1000;
    }

    public static String e(String str, String str2, Locale locale) {
        if (str == null || str2 == null || locale == null) {
            LogUtil.e("Suggestion_TimeUtil", "convertToFormat error, input data: ", StringUtils.c((Object) str), " format string: ", StringUtils.c((Object) str2), " locale: ", StringUtils.c(locale));
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            return new SimpleDateFormat(str2, locale).format(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            LogUtil.e("Suggestion_TimeUtil", "convertToFormat error, input data: ", str, " exception message: ", LogAnonymous.b(e));
            return null;
        }
    }

    public static long c(long j, int i) {
        return a(j, (TimeZone) null, i);
    }

    public static long a(long j, TimeZone timeZone, int i) {
        Calendar calendarA = a(j, timeZone);
        calendarA.setFirstDayOfWeek(2);
        int i2 = calendarA.get(7);
        if (i2 == 1) {
            i2 = 8;
        }
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.add(5, (calendarA.getFirstDayOfWeek() - i2) + (i * 7));
        return calendarA.getTimeInMillis();
    }

    public static long a(long j, int i) {
        return c(j, null, i);
    }

    public static long c(long j, TimeZone timeZone, int i) {
        Calendar calendarA = a(a(j, timeZone, i), timeZone);
        calendarA.setFirstDayOfWeek(2);
        calendarA.set(11, 23);
        calendarA.set(12, 59);
        calendarA.set(13, 59);
        calendarA.set(14, 999);
        LogUtil.a("Suggestion_TimeUtil", "getWeekSunday calendar.getTimeInMillis1 = ", Long.valueOf(calendarA.getTimeInMillis()));
        calendarA.set(7, 1);
        return calendarA.getTimeInMillis();
    }

    public static int a(long j, TimeZone timeZone, long j2, TimeZone timeZone2) {
        Calendar calendarA = a(j, timeZone);
        Calendar calendarA2 = a(j2, timeZone2);
        calendarA.setMinimalDaysInFirstWeek(1);
        calendarA.setFirstDayOfWeek(2);
        calendarA2.setMinimalDaysInFirstWeek(1);
        calendarA2.setFirstDayOfWeek(2);
        int i = calendarA.get(1);
        int i2 = calendarA.get(3);
        int i3 = calendarA2.get(1);
        int i4 = calendarA2.get(3);
        if (i2 == 1 && calendarA.get(2) == 11) {
            i++;
        }
        if (i4 == 1 && calendarA2.get(2) == 11) {
            i3++;
        }
        int iMin = Math.min(i, i3);
        return (i4 + e(iMin, i3)) - (i2 + e(iMin, i));
    }

    private static int e(int i, int i2) {
        if (i >= i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2 - i; i4++) {
            Calendar calendar = Calendar.getInstance();
            calendar.setMinimalDaysInFirstWeek(1);
            calendar.setFirstDayOfWeek(2);
            calendar.set(i + i4, 11, 25);
            i3 += calendar.get(3);
        }
        return i3;
    }

    public static Calendar a(long j, TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        calendar.setTimeInMillis(j);
        return calendar;
    }

    public static int c(long j, long j2) {
        return a(j, null, j2, null);
    }

    public static long a(long j, int i, int i2) {
        return b(j, i, i2, null);
    }

    public static long b(long j, int i, int i2, TimeZone timeZone) {
        Calendar calendarA = a(j, timeZone);
        calendarA.setFirstDayOfWeek(2);
        int iB = b(calendarA.get(7));
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.add(5, (i2 - iB) + (i * 7));
        return calendarA.getTimeInMillis();
    }

    public static long b(long j, int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i3 = calendar.get(7) - 1;
        if (i3 == 0) {
            i3 = 7;
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.add(5, (i2 - i3) + ((i - 1) * 7));
        return calendar.getTimeInMillis();
    }

    public static String i(long j) {
        return e(j, (TimeZone) null);
    }

    public static String e(long j, TimeZone timeZone) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    public static long d(String str) {
        String strReplaceAll = str.replaceAll("/", Constants.LINK);
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(strReplaceAll);
            if (date == null) {
                LogUtil.e("getTimeMillisByFormatDate failed, cause formatDate: ", strReplaceAll, " produce nul date");
                return 0L;
            }
            return date.getTime();
        } catch (ParseException unused) {
            LogUtil.e("getTimeMillisByFormatDate failed, cause formatDate: ", strReplaceAll, ", is not yyyy-MM-dd format");
            return 0L;
        }
    }

    public static int c() {
        int i = Calendar.getInstance().get(7);
        if (i == 1) {
            return 7;
        }
        return i - 1;
    }

    public static long b(long j, TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        calendar.setTimeInMillis(j);
        for (int i = calendar.get(7); i != 2; i = calendar.get(7)) {
            calendar.add(5, -1);
        }
        return b(calendar);
    }

    public static final long f(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(7);
        if (i == 2) {
            calendar.add(5, 1);
            i = calendar.get(7);
        }
        while (i != 2) {
            calendar.add(5, 1);
            i = calendar.get(7);
        }
        return b(calendar);
    }

    public static long d(long j, String str, int i) {
        TimeZone timeZoneB = b(str);
        Calendar calendar = Calendar.getInstance(timeZoneB);
        calendar.setTimeInMillis(b(j, timeZoneB));
        calendar.add(5, i - 1);
        return b(calendar);
    }

    public static TimeZone b(String str) {
        TimeZone timeZone = TimeZone.getDefault();
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Suggestion_TimeUtil", "getTimeZone failed with error zone id:", str, " return the default TimeZone id:", timeZone.getID());
            return timeZone;
        }
        return TimeZone.getTimeZone("GMT" + str);
    }

    public static long e(String str, long j) {
        return b(str).getOffset(j);
    }

    private static long b(Calendar calendar) {
        a(calendar);
        return calendar.getTimeInMillis();
    }

    private static void a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
}
