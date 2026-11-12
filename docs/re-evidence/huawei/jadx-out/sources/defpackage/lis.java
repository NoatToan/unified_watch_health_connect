package defpackage;

import android.content.Context;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static double f40313a = 1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f40314b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f40315c = false;
    private static double d = 1.0d;
    private static double e = 1.0d;

    public static void b(Context context, double d2, double d3, double d4) {
        if (f40314b) {
            c(d2 * d3 * d4);
            double d5 = e;
            if (d5 - f40313a < 1.0d || context == null) {
                return;
            }
            f40313a = d5;
            e(context, d5);
        }
    }

    private static void c(double d2) {
        if (d2 <= 0.0d) {
            return;
        }
        e = Math.min(e + d2, d);
    }

    public static void b(double d2, String str) {
        if (d2 <= 0.0d) {
            return;
        }
        LogUtil.a("Debug_HiSyncProcess", "setCurrentMaxProcess tag is ", str);
        double dMin = Math.min(d + d2, 99.0d);
        d = dMin;
        LogUtil.a("Debug_HiSyncProcess", "setCurrentMaxProcess currentMaxProcess is ", Double.valueOf(dMin));
    }

    public static void c(Context context) {
        if (context == null || !f40314b) {
            return;
        }
        e(context, d);
        e = d;
    }

    public static void b(Context context) {
        if (context == null || !f40314b) {
            return;
        }
        e(context, e);
    }

    public static void c(Context context, int i) {
        if (context == null) {
            return;
        }
        b(i == 0, true);
        d(context);
        e(context, 1.0d);
    }

    public static void e(Context context) {
        if (context == null) {
            return;
        }
        e(context, 99.0d);
        a(context);
        b(false, false);
        lgp.e(false);
    }

    public static void d(Context context, int i) {
        if (context == null) {
            return;
        }
        g(context);
        if (i == 20000) {
            lgp.e(false);
            lgp.a(false);
            b(false, false);
        }
    }

    private static void b(boolean z, boolean z2) {
        e = 1.0d;
        d = 1.0d;
        f40313a = 1.0d;
        f40315c = z;
        f40314b = z2;
    }

    private static void e(Context context, double d2) {
        if (f40315c) {
            HiBroadcastUtil.c(context, d2);
        }
    }

    private static void d(Context context) {
        if (f40315c) {
            HiBroadcastUtil.b(context);
        }
    }

    private static void a(Context context) {
        if (f40315c) {
            HiBroadcastUtil.i(context);
        }
    }

    private static void g(Context context) {
        if (f40315c) {
            HiBroadcastUtil.f(context);
        }
    }

    public static void c(int i) {
        if (i == 0) {
            f40315c = true;
        }
    }
}
