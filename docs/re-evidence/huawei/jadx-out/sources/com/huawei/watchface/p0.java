package com.huawei.watchface;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.watchface.utils.HwLog;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes20.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f30537a = "HONOR".equalsIgnoreCase(a(SystemUtils.PRODUCT_BRAND, ""));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f30538b = "HUAWEI".equalsIgnoreCase(a(SystemUtils.PRODUCT_BRAND, ""));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f30539c = a("ro.config.hw_novaThemeSupport", false);
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final int g;
    public static final String h;
    public static final Pattern i;

    static {
        d = (a("ro.config.hw_fold_disp", "").isEmpty() && a("persist.sys.fold.disp.size", "").isEmpty()) ? false : true;
        i = Pattern.compile("EmotionUI[ _]([0-9][0-9.]*)");
        e = b("com.huawei.android.os.BuildEx");
        f = a();
        g = g();
        h = f();
    }

    public static String a(String str) {
        return a(str, "");
    }

    public static String b() {
        return h;
    }

    public static int c() {
        return g;
    }

    public static int d() {
        if (!h()) {
            return 0;
        }
        String strA = a("ro.build.hw_emui_api_level");
        if (TextUtils.isEmpty(strA)) {
            return 0;
        }
        try {
            return Integer.parseInt(strA);
        } catch (NumberFormatException e2) {
            HwLog.e("EnvironmentInfo", HwLog.printException((Exception) e2));
            return 0;
        }
    }

    public static String f() {
        String strE = e();
        HwLog.i("EnvironmentInfo", "initEmuiVersion, isEmuiBuildEx=" + h() + ", emuiVersion=" + strE);
        return strE;
    }

    public static int g() {
        int iD = d();
        HwLog.i("EnvironmentInfo", "initEmuiVersionCodeEx, isEmuiBuildEx=" + h() + ", emuiVersionCode=" + iD);
        return iD;
    }

    public static boolean h() {
        return e;
    }

    public static boolean i() {
        return f;
    }

    public static boolean j() {
        if (!h()) {
            return false;
        }
        String strA = a("ro.build.version.emui");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return strA.contains("EmotionUI");
    }

    public static boolean k() {
        return d;
    }

    public static boolean l() {
        return "HONOR".equals(Build.MANUFACTURER);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, str, str2);
            if (objInvoke instanceof String) {
                str2 = (String) objInvoke;
            }
        } catch (ClassNotFoundException unused) {
            HwLog.e("EnvironmentInfo", "getSystemProperties ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            HwLog.e("EnvironmentInfo", "getSystemProperties IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            HwLog.e("EnvironmentInfo", "getSystemProperties NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            HwLog.e("EnvironmentInfo", "getSystemProperties InvocationTargetException");
        }
        HwLog.d("EnvironmentInfo", "emui get system properties value = " + str2);
        return str2;
    }

    public static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            HwLog.e("EnvironmentInfo", "isSupportEmuiBuildEx ClassNotFoundException");
            return false;
        }
    }

    public static String e() {
        if (!h()) {
            return "";
        }
        String strA = a("ro.build.version.emui");
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        try {
            Matcher matcher = i.matcher(strA);
            return matcher.find() ? matcher.group(1) : "";
        } catch (PatternSyntaxException e2) {
            HwLog.e("EnvironmentInfo", HwLog.printException((Exception) e2));
            return "";
        }
    }

    public static boolean a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z));
            if (objInvoke instanceof Boolean) {
                z = ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException unused) {
            HwLog.e("EnvironmentInfo", "isGetSystemProperties ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            HwLog.e("EnvironmentInfo", "isGetSystemProperties IllegalAccessException");
        } catch (IllegalArgumentException unused3) {
            HwLog.e("EnvironmentInfo", "isGetSystemProperties IllegalArgumentException");
        } catch (NoSuchMethodException unused4) {
            HwLog.e("EnvironmentInfo", "isGetSystemProperties NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            HwLog.e("EnvironmentInfo", "isGetSystemProperties InvocationTargetException");
        }
        HwLog.i("EnvironmentInfo", "isGetSystemPropertiesBoolean isFind = " + z);
        return z;
    }

    public static boolean a() {
        boolean zJ = j();
        HwLog.i("EnvironmentInfo", "checkEmuiSystem, isEmuiBuildEx=" + h() + ", isEmui=" + zJ);
        return zJ;
    }
}
