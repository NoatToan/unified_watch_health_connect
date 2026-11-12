package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.huawei.android.text.format.DateUtilsEx;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import health.compact.a.EmuiBuild;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class qrk {
    private static Date k(long j) {
        Date date = new Date();
        date.setTime(j);
        return date;
    }

    private static Calendar j(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        return calendar;
    }

    public static boolean i(long j) {
        return j(j).get(1) == j(System.currentTimeMillis()).get(1);
    }

    public static String b(Context context, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(xde.b(j(j).get(1)));
        if (LanguageUtil.f(context)) {
            sb.append(context.getResources().getString(R.string.year_view));
        }
        return sb.toString();
    }

    public static String a(Context context, long j, long j2) {
        String dateRange = DateUtils.formatDateRange(context, j, j2, ARImageMetadata.CONTROL_AF_STATE);
        return LanguageUtil.f(context) ? dateRange.replace("至", " - ") : dateRange;
    }

    public static String c(Context context, long j, long j2) {
        return b(context, j, j2, true);
    }

    public static String b(Context context, long j, long j2, boolean z) {
        int i = (!z || a(j, j2)) ? ARImageMetadata.CONTROL_SCENE_MODE : 65556;
        if (LanguageUtil.f(context)) {
            String dateTime = DateUtils.formatDateTime(context, j, i);
            String dateTime2 = DateUtils.formatDateTime(context, j2 - 1, i);
            if (!a(System.currentTimeMillis(), j)) {
                if (dateTime.length() > 2) {
                    dateTime = dateTime.substring(2);
                }
                if (dateTime2.length() > 2) {
                    dateTime2 = dateTime2.substring(2);
                }
            }
            return dateTime + Constants.LINK + dateTime2;
        }
        if (LanguageUtil.br(context)) {
            return DateUtils.formatDateRange(context, j2 - 1, j + 1, i);
        }
        return DateUtils.formatDateRange(context, j, j2, i);
    }

    public static boolean b(long j, long j2) {
        Calendar calendarJ = j(j);
        Calendar calendarJ2 = j(j2);
        return calendarJ.get(1) == calendarJ2.get(1) && calendarJ.get(2) == calendarJ2.get(2) && Math.abs(calendarJ.get(5) - calendarJ2.get(5)) <= 1;
    }

    public static boolean a(long j, long j2) {
        return j(j).get(1) == j(j2).get(1);
    }

    public static String e(Context context, long j) {
        String dateTime = DateUtils.formatDateTime(context, j, 524306);
        if (!LanguageUtil.f(context)) {
            return dateTime;
        }
        if (LanguageUtil.l(context)) {
            return dateTime.replace("周", " 周");
        }
        return dateTime.replace("週", " 週");
    }

    public static String c(long j) {
        return SimpleDateFormat.getDateInstance().format(k(j));
    }

    public static String b() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.ENGLISH).format(new Date());
    }

    public static String g(long j) {
        return SimpleDateFormat.getTimeInstance(3).format(k(j));
    }

    public static String f(long j) {
        if (i(j)) {
            return e(j);
        }
        return d(j);
    }

    public static String b(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyy/M/d HH:mm:ss")).format(date);
    }

    public static String d(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyy/M/d HH:mm")).format(date);
    }

    public static String e(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat("M/d HH:mm", Locale.getDefault()).format(date);
    }

    public static String h(long j) {
        Date date = new Date();
        date.setTime(j);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd")).format(date);
    }

    public static String a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    public static String a(Context context, long j, int i) {
        Date date;
        if (context == null) {
            LogUtil.j("TimeUtils", "format12Hour context is null");
            return "";
        }
        if (e(context)) {
            return DateUtilsEx.formatChinaDateTime(context, j, i);
        }
        if (j != 0) {
            date = new Date(j);
        } else {
            date = new Date(System.currentTimeMillis());
        }
        return UnitUtil.a(date, i);
    }

    public static String e(Context context, long j, long j2, int i) {
        if (context == null) {
            LogUtil.j("TimeUtils", "format12HourDataRange context is null");
            return "";
        }
        if (e(context)) {
            return DateUtilsEx.formatChinaDateRange(context, new Formatter(new StringBuilder(50), Locale.getDefault()), j, j2, i, (String) null);
        }
        return DateUtils.formatDateRange(context, j, j2, i);
    }

    public static boolean e(Context context) {
        if (context != null) {
            return CommonUtil.bg() && CommonUtil.w(context) && EmuiBuild.e > 12 && !DateFormat.is24HourFormat(context);
        }
        LogUtil.j("TimeUtils", "isEmuiFor12Hour context is null");
        return false;
    }

    public static long c(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(5, i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
