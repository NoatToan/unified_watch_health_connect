package health.compact.a;

import com.huawei.haf.common.exception.ExceptionUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class LogAnonymous {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f36599a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f36600b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static double f36601c;
    private static double e;

    private LogAnonymous() {
    }

    public static void c() {
        f36599a = true;
        f36600b = true;
        f36601c = 0.0d;
        e = 0.0d;
    }

    public static void e() {
        f36599a = false;
    }

    public static double[] a(double d, double d2) {
        if (!f36599a) {
            com.huawei.hwlogsmodel.LogUtil.j("LogAnonymous", "please call startSport");
            return new double[2];
        }
        if (f36600b) {
            e = d;
            f36601c = d2;
            f36600b = false;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_LogAnonymous", "firstLon ", Double.valueOf(d), " firstLat ", Double.valueOf(d2));
        }
        return new double[]{d - e, d2 - f36601c};
    }

    public static String a(long j) {
        String strValueOf;
        if (j < 100000000) {
            strValueOf = String.format(Locale.ROOT, "%09d", Long.valueOf(j));
        } else {
            strValueOf = String.valueOf(j);
        }
        StringBuilder sb = new StringBuilder(9);
        sb.append("***");
        sb.append(strValueOf.substring(strValueOf.length() - 6, strValueOf.length() - 3));
        sb.append("***");
        return sb.toString();
    }

    public static String d(int i) {
        String strValueOf;
        if (i < 1000000) {
            strValueOf = String.format(Locale.ROOT, "%06d", Integer.valueOf(i));
        } else {
            strValueOf = String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder(6);
        sb.append("***");
        sb.append(strValueOf.substring(strValueOf.length() - 3, strValueOf.length()));
        return sb.toString();
    }

    public static String c(String str) {
        if (str == null || str.length() < 4) {
            return str;
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("***");
        sb.append(str.substring(4, str.length()));
        return sb.toString();
    }

    public static String c(Object obj) {
        return "***";
    }

    public static String b(Throwable th) {
        return ExceptionUtils.c(th);
    }
}
