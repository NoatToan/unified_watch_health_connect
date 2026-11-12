package defpackage;

import android.text.TextUtils;
import health.compact.a.util.LogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class ieg {
    public static long f(long j) {
        return j * 1000;
    }

    public static Date b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return new Date();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "yyyy-MM-dd HH:mm:ss";
        }
        try {
            return new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e) {
            LogUtil.c("Suggestion_DateUtil", e.getMessage());
            return new Date();
        }
    }

    public static int b(long j) {
        return ifp.e((Object) new SimpleDateFormat("yyyyMMdd").format(new Date(j)));
    }

    public static int b(Date date) {
        return ifp.e((Object) new SimpleDateFormat("yyyyMMdd").format(date));
    }

    public static int e() {
        return ifp.e((Object) new SimpleDateFormat("MMddHHmm", Locale.CHINESE).format(new Date()));
    }

    public static String d(Date date, String str) {
        return new SimpleDateFormat(str).format(date);
    }

    public static String c(Date date, TimeZone timeZone, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    public static long e(int i) {
        try {
            Date date = new SimpleDateFormat("yyyyMMdd").parse(Integer.toString(i));
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static int e(Date date, Date date2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LogUtil.e("Suggestion_DateUtil", simpleDateFormat.format(date), "--to---", simpleDateFormat.format(date2));
        try {
            return (int) ((simpleDateFormat.parse(simpleDateFormat.format(date2)).getTime() - simpleDateFormat.parse(simpleDateFormat.format(date)).getTime()) / 86400000);
        } catch (ParseException unused) {
            return -1;
        }
    }

    public static int a(Calendar calendar) {
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        int i = calendar.get(7);
        if (i == 1) {
            return 7;
        }
        return i - 1;
    }

    public static int j(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return a(calendar);
    }

    public static long c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return System.currentTimeMillis() / 1000;
        }
        Date dateB = b(str, str2);
        if (dateB == null) {
            return System.currentTimeMillis() / 1000;
        }
        return dateB.getTime() / 1000;
    }

    public static String d() {
        return new SimpleDateFormat("ZZZ").format(new Date());
    }

    public static long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        return calendar.getTimeInMillis();
    }

    public static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.add(11, 1);
        return calendar.getTimeInMillis() - 1;
    }

    public static long c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        return calendar.getTimeInMillis();
    }

    public static long e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 999);
        calendar.set(13, 59);
        calendar.set(12, 59);
        calendar.set(11, 23);
        return calendar.getTimeInMillis();
    }
}
