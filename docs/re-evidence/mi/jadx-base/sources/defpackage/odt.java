package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.yrn_config.YRNConstants;

/* JADX INFO: loaded from: classes11.dex */
public class odt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f29048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f29049b;

    public static int a() {
        try {
            Class<?> clsC = c(null, "miui.os.Build");
            if (clsC.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return clsC.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Context b() {
        return f29048a;
    }

    public static Class<?> c(Context context, String str) throws ClassNotFoundException {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z = context != null;
        if (z && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            x9s.o(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z), th.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }

    public static synchronized String d() {
        try {
            String str = f29049b;
            if (str != null) {
                return str;
            }
            String strValueOf = Build.VERSION.INCREMENTAL;
            if (a() <= 0) {
                String strH = h();
                if (TextUtils.isEmpty(strH)) {
                    strH = j();
                    if (TextUtils.isEmpty(strH)) {
                        strH = k();
                        if (TextUtils.isEmpty(strH)) {
                            strValueOf = String.valueOf(bdt.a("ro.product.brand", YRNConstants.PLATFORM) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + strValueOf);
                        }
                    }
                    strValueOf = strH;
                } else {
                    strValueOf = strH;
                }
            }
            f29049b = strValueOf;
            return strValueOf;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void e(Context context) {
        f29048a = context.getApplicationContext();
    }

    public static boolean f() {
        return TextUtils.equals((String) zbs.g("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    public static boolean g(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            x9s.s(e);
            return false;
        }
    }

    public static String h() {
        String strA = bdt.a("ro.build.version.emui", "");
        f29049b = strA;
        return strA;
    }

    public static boolean i() {
        try {
            return c(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            x9s.D("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            x9s.s(e);
            return false;
        }
    }

    public static String j() {
        String strA = bdt.a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(strA) && !strA.startsWith("ColorOS_")) {
            f29049b = "ColorOS_" + strA;
        }
        return f29049b;
    }

    public static String k() {
        String strA = bdt.a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(strA) && !strA.startsWith("FuntouchOS_")) {
            f29049b = "FuntouchOS_" + strA;
        }
        return f29049b;
    }
}
