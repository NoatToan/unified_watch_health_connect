package defpackage;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ltb {
    public static String v(Date date) {
        if (date == null) {
            return "";
        }
        return DateFormat.getDateInstance().format(date);
    }

    public static long c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 23, 59, 59);
        return calendar.getTimeInMillis();
    }

    public static long h(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 12);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static Date b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5));
        return calendar.getTime();
    }

    public static Date d() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar.getTime();
    }

    public static long a() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return l(calendar.getTime());
    }

    public static long e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5) - 1, 20, 0, 0);
        return l(calendar.getTime());
    }

    public static int c() {
        return Calendar.getInstance().get(2) + 1;
    }

    public static int a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5);
    }

    public static int r(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(2) + 1;
    }

    public static int x(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1);
    }

    public static Date p(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, -1);
        return calendar.getTime();
    }

    public static Date q(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, 1);
        return calendar.getTime();
    }

    public static Date j(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    public static Date d(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        if (date == null) {
            LogUtil.j("TimeDateFormatUtil", "getOffsetDate date is null.");
        } else {
            calendar.setTime(date);
            calendar.add(5, i);
        }
        return calendar.getTime();
    }

    public static Date b(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, i);
        return calendar.getTime();
    }

    public static long a(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, i);
        return m(calendar.getTime());
    }

    public static long c(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, i);
        return m(calendar.getTime());
    }

    public static long l(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime() / 1000;
    }

    public static long m(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return l(calendar.getTime());
    }

    public static long o(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 23, 59, 59);
        return l(calendar.getTime());
    }

    public static Date a(long j) {
        return new Date((j * 1000) + ((long) TimeZone.getDefault().getRawOffset()));
    }

    public static String d(Date date) {
        return e(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String e(Date date, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar.setTime(date);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static boolean ac(Date date) {
        return c(date, b());
    }

    public static boolean c(Date date, Date date2) {
        boolean z;
        boolean z2;
        if (date == null || date2 == null) {
            z = false;
            z2 = false;
        } else {
            z2 = date.getTime() >= b(date2).getTime();
            z = date.getTime() <= c(date2).getTime();
        }
        return z2 && z;
    }

    public static Date b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date c(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTime();
    }

    public static String e(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        if (stringBuffer.length() == 1) {
            stringBuffer.insert(0, "0:0");
        } else if (stringBuffer.length() == 2) {
            stringBuffer.insert(0, "0:");
        } else if (stringBuffer.length() == 3) {
            stringBuffer.insert(1, ":");
        } else {
            stringBuffer.insert(2, ":");
        }
        return stringBuffer.toString();
    }

    public static String b(int i) {
        return e(String.valueOf(i));
    }

    public static int h(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(7);
    }

    public static String e(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
        } catch (RuntimeException e) {
            LogUtil.e("TimeDateFormatUtil", "Date Format exception = ", e.getMessage());
            return null;
        }
    }

    public static Date h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        } catch (ParseException e) {
            LogUtil.e("TimeDateFormatUtil", "ParseException = ", e.getMessage());
            return null;
        }
    }

    public static Date y(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date w(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(2, 11);
        calendar.set(5, 31);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTime();
    }

    public static int e() {
        return Calendar.getInstance().get(1);
    }

    public static Date u(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.add(7, 7);
        return calendar.getTime();
    }

    public static Date i(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.add(2, 1);
        return calendar.getTime();
    }

    public static Date g(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.add(2, -1);
        return calendar.getTime();
    }

    public static Date f(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTime();
    }

    public static Date k(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.add(2, 2);
        calendar.add(5, -1);
        return calendar.getTime();
    }

    public static Date t(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.add(2, 0);
        calendar.add(5, -1);
        return calendar.getTime();
    }

    public static Date n(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(5, 1);
        calendar.add(2, 1);
        calendar.add(5, -1);
        return calendar.getTime();
    }

    public static int s(Date date) {
        Date dateN = n(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateN);
        return calendar.get(5);
    }

    public static long f(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        for (int i = calendar.get(5); i != 1; i = calendar.get(5)) {
            calendar.add(5, -1);
        }
        calendar.set(9, 0);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static int d(long j) {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.setTimeInMillis(j);
        return calendar.get(11);
    }

    public static long h() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        return calendar.getTimeInMillis();
    }

    public static long f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(jCurrentTimeMillis));
        calendar.add(14, -(calendar.get(15) + calendar.get(16)));
        return calendar.getTimeInMillis();
    }

    public static String a(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        String strC = c(str, str2);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("TimeDateFormatUtil", "getLocalTimeFromUtc standardDateTime is empty.");
            return str;
        }
        try {
            Date date = simpleDateFormat.parse(strC);
            if (date == null) {
                LogUtil.j("TimeDateFormatUtil", "getLocalTimeFromUtc localDate is null.");
                return str;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return c(gregorianCalendar, ARImageMetadata.CONTROL_SCENE_MODE);
        } catch (ParseException e) {
            LogUtil.e("TimeDateFormatUtil", "getLocalTimeFromUtc parse standardDateTime exception =  ", e.getMessage());
            return str;
        }
    }

    private static String c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                LogUtil.j("TimeDateFormatUtil", "getStandardDateTimeFromUtc localDate is null.");
                return str;
            }
            if (!TextUtils.isEmpty(str2)) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT" + str2));
            }
            return simpleDateFormat.format(date);
        } catch (ParseException e) {
            LogUtil.e("TimeDateFormatUtil", "getStandardDateTimeFromUtc parse origin exception =  ", e.getMessage());
            return str;
        }
    }

    public static String c(Calendar calendar, int i) {
        String dateTime;
        if (calendar == null) {
            LogUtil.j("TimeDateFormatUtil", "formatDateAndTime error, calendar is null");
            dateTime = "";
        } else {
            dateTime = DateUtils.formatDateTime(BaseApplication.getContext(), calendar.getTimeInMillis(), i);
        }
        LogUtil.d("TimeDateFormatUtil", "formatDateAndTime myDateStr = ", dateTime);
        return dateTime;
    }

    public static long b(String str) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (!TextUtils.isEmpty(str)) {
            try {
                date = simpleDateFormat.parse(str);
            } catch (ParseException e) {
                LogUtil.e("TimeDateFormatUtil", "dateStringToLong ParseException :", e.getMessage());
            }
        }
        return date.getTime();
    }

    public static String g(String str) {
        if (!f(str)) {
            return str;
        }
        String[] strArrSplit = str.split("/");
        return strArrSplit[1] + "/" + strArrSplit[0] + "/" + strArrSplit[2];
    }

    public static String d(String str) {
        if (!f(str)) {
            return str;
        }
        String[] strArrSplit = str.split("/");
        String str2 = strArrSplit[0];
        return strArrSplit[1] + "/" + str2 + "/" + strArrSplit[2];
    }

    public static String c(String str) {
        if (!f(str)) {
            return str;
        }
        String[] strArrSplit = str.split("/");
        return strArrSplit[2] + "/" + strArrSplit[1] + "/" + strArrSplit[0];
    }

    public static String a(String str) {
        return !TextUtils.isEmpty(str) ? str.replaceAll(" ", "") : str;
    }

    private static boolean f(String str) {
        return !TextUtils.isEmpty(str) && str.split("/").length == 3;
    }
}
