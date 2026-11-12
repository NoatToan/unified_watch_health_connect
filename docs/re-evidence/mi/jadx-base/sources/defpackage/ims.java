package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;

/* JADX INFO: loaded from: classes11.dex */
public class ims {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21308a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f21309b = true;

    public static int a(Context context) {
        if (f21308a <= 0) {
            f21308a = y0t.l(context);
        }
        return f21308a;
    }

    public static int b(boolean z) {
        return z ? 1 : 0;
    }

    public static SharedPreferences c(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }

    public static bms d(Context context) {
        SharedPreferences sharedPreferencesC = c(context);
        bms bmsVar = new bms();
        bmsVar.c(sharedPreferencesC.getInt("off_up_count", 0));
        bmsVar.g(sharedPreferencesC.getInt("off_down_count", 0));
        bmsVar.k(sharedPreferencesC.getInt("off_ping_count", 0));
        bmsVar.o(sharedPreferencesC.getInt("off_pong_count", 0));
        bmsVar.d(sharedPreferencesC.getLong("off_duration", 0L));
        bmsVar.r(sharedPreferencesC.getInt("on_up_count", 0));
        bmsVar.t(sharedPreferencesC.getInt("on_down_count", 0));
        bmsVar.v(sharedPreferencesC.getInt("on_ping_count", 0));
        bmsVar.x(sharedPreferencesC.getInt("on_pong_count", 0));
        bmsVar.h(sharedPreferencesC.getLong("on_duration", 0L));
        bmsVar.l(sharedPreferencesC.getLong(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, 0L));
        bmsVar.p(sharedPreferencesC.getLong(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, 0L));
        bmsVar.z(sharedPreferencesC.getInt("xmsf_vc", 0));
        bmsVar.B(sharedPreferencesC.getInt("android_vc", 0));
        return bmsVar;
    }

    public static void e(Context context, long j, int i) {
        yls.c("upload");
        new ems().a(context, d(context));
        j(context, j, i);
    }

    public static void f(Context context, long j, long j2, int i, int i2) {
        if (j > 0) {
            if (i(context) || i >= 1073741823 || j2 - j >= 86400000) {
                c(context).edit().putLong(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, j2).apply();
                e(context, j2, i2);
            }
        }
    }

    public static void g(Context context, long j, boolean z) {
        k5s.a(context).g(new lms(context, j, z));
    }

    public static void h(Context context, SharedPreferences sharedPreferences, long j, int i) {
        yls.c("recordInit");
        sharedPreferences.edit().putLong(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    public static boolean i(Context context) {
        boolean z = false;
        if (f21309b) {
            f21309b = false;
            SharedPreferences sharedPreferencesC = c(context);
            int i = sharedPreferencesC.getInt("xmsf_vc", 0);
            int i2 = sharedPreferencesC.getInt("android_vc", 0);
            if (i != 0 && i2 != 0 && (i != a(context) || i2 != Build.VERSION.SDK_INT)) {
                z = true;
            }
        }
        yls.c("isVcChanged = " + z);
        return z;
    }

    public static void j(Context context, long j, int i) {
        yls.c("reset");
        c(context).edit().clear().putLong(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    public static void k(Context context, long j, boolean z) {
        k5s.a(context).g(new oms(context, j, z));
    }

    public static void l(Context context, long j, boolean z) {
        k5s.a(context).g(new yns(context, j, z));
    }

    public static void m(Context context, long j, boolean z) {
        k5s.a(context).g(new bos(context, j, z));
    }

    public static synchronized void r(Context context, long j, boolean z) {
        int i;
        try {
            yls.c("recordSendMsg start");
            int iB = b(z);
            SharedPreferences sharedPreferencesC = c(context);
            long j2 = sharedPreferencesC.getLong(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, 0L);
            if (j2 <= 0) {
                h(context, sharedPreferencesC, j, iB);
            }
            if (iB == 1) {
                i = sharedPreferencesC.getInt("on_up_count", 0) + 1;
                sharedPreferencesC.edit().putInt("on_up_count", i).apply();
            } else {
                i = sharedPreferencesC.getInt("off_up_count", 0) + 1;
                sharedPreferencesC.edit().putInt("off_up_count", i).apply();
            }
            f(context, j2, j, i, iB);
            yls.c("recordSendMsg complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void s(Context context, long j, boolean z) {
        int i;
        try {
            yls.c("recordReceiveMsg start");
            int iB = b(z);
            SharedPreferences sharedPreferencesC = c(context);
            long j2 = sharedPreferencesC.getLong(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, 0L);
            if (j2 <= 0) {
                h(context, sharedPreferencesC, j, iB);
            }
            if (iB == 1) {
                i = sharedPreferencesC.getInt("on_down_count", 0) + 1;
                sharedPreferencesC.edit().putInt("on_down_count", i).apply();
            } else {
                i = sharedPreferencesC.getInt("off_down_count", 0) + 1;
                sharedPreferencesC.edit().putInt("off_down_count", i).apply();
            }
            f(context, j2, j, i, iB);
            yls.c("recordReceiveMsg complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void t(Context context, long j, boolean z) {
        int i;
        try {
            yls.c("recordPing start");
            int iB = b(z);
            SharedPreferences sharedPreferencesC = c(context);
            long j2 = sharedPreferencesC.getLong(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, 0L);
            if (j2 <= 0) {
                h(context, sharedPreferencesC, j, iB);
            }
            if (iB == 1) {
                i = sharedPreferencesC.getInt("on_ping_count", 0) + 1;
                sharedPreferencesC.edit().putInt("on_ping_count", i).apply();
            } else {
                i = sharedPreferencesC.getInt("off_ping_count", 0) + 1;
                sharedPreferencesC.edit().putInt("off_ping_count", i).apply();
            }
            f(context, j2, j, i, iB);
            yls.c("recordPing complete");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void u(Context context, long j, boolean z) {
        int i;
        try {
            yls.c("recordPong start");
            int iB = b(z);
            SharedPreferences sharedPreferencesC = c(context);
            long j2 = sharedPreferencesC.getLong(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, 0L);
            if (j2 <= 0) {
                h(context, sharedPreferencesC, j, iB);
            }
            if (iB == 1) {
                i = sharedPreferencesC.getInt("on_pong_count", 0) + 1;
                sharedPreferencesC.edit().putInt("on_pong_count", i).apply();
            } else {
                i = sharedPreferencesC.getInt("off_pong_count", 0) + 1;
                sharedPreferencesC.edit().putInt("off_pong_count", i).apply();
            }
            f(context, j2, j, i, iB);
            yls.c("recordPong complete");
        } catch (Throwable th) {
            throw th;
        }
    }
}
