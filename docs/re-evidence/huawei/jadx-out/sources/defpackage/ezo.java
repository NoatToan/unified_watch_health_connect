package defpackage;

import android.text.format.DateFormat;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class ezo {
    public static String e(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyy/M/d")).format(date);
    }

    public static String f(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "Md")).format(date);
    }

    public static String c(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "HH:mm")).format(date);
    }

    public static int b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        return calendar.get(7);
    }

    public static int o(long j) {
        int iB = b(j);
        if (iB - 1 == 0) {
            return 14;
        }
        return iB + 6;
    }

    public static String m(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat("EE").format(date);
    }

    public static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    public static int a() {
        return Calendar.getInstance().get(1);
    }

    public static long h(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(d(j));
        calendar.set(7, Utils.o() ? 1 : 2);
        calendar.add(5, -7);
        return calendar.getTimeInMillis();
    }

    public static Long g(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(d(j));
        calendar.set(7, Utils.o() ? 1 : 2);
        return Long.valueOf(calendar.getTimeInMillis() - 1);
    }

    public static long j(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(d(j));
        calendar.add(2, -1);
        calendar.set(5, 1);
        return calendar.getTimeInMillis();
    }

    public static long i(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(d(j));
        calendar.set(5, 1);
        return calendar.getTimeInMillis() - 1;
    }

    public static long b(String str) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e) {
            LogUtil.e("TimeUtil", "getTimeMillisByFormatDay failed, exception = ", ExceptionUtils.c(e));
            return 0L;
        }
    }

    public static int[] a(long j) {
        int i = (int) (j / 86400000);
        long j2 = j - ((long) (86400000 * i));
        int i2 = (int) (j2 / 3600000);
        int iCeil = (int) Math.ceil((j2 - ((long) (3600000 * i2))) / 60000.0d);
        if (iCeil == 60) {
            i2++;
            if (i2 == 24) {
                i++;
                iCeil = 0;
                i2 = 0;
            } else {
                iCeil = 0;
            }
        }
        return new int[]{i, i2, iCeil};
    }
}
