package com.huami.watch.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.view.basetitle.SystemBarTintManager;
import com.huami.watch.companionlib.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public final class DeviceCompatibility {
    private static final String a = "DeviceCompatibility";

    public static final class MIUI {
        private static final String a = "\\d+.\\d+.\\d+(-internal)?";
        private static final boolean b;
        private static final boolean c;

        static {
            boolean z = !TextUtils.isEmpty(Build.VERSION.INCREMENTAL) && Build.VERSION.INCREMENTAL.matches(a);
            b = z;
            c = "user".equals(Build.TYPE) && !z;
        }

        private MIUI() {
        }

        public static boolean a(@NonNull Activity activity, boolean z) {
            if (isNotMIUI(activity)) {
                return false;
            }
            Window window = activity.getWindow();
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(z ? i : 0);
                objArr[1] = Integer.valueOf(i);
                method.invoke(window, objArr);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public static String getMIUIVersionCode(Context context) {
            return DeviceCompatibility.a(context, "ro.miui.ui.version.code");
        }

        public static String getMIUIVersionName(Context context) {
            return DeviceCompatibility.a(context, "ro.miui.ui.version.name");
        }

        public static boolean isMIUI(Context context) {
            return !TextUtils.isEmpty(getMIUIVersionName(context));
        }

        public static boolean isMiuiAlphaVersion(Context context) {
            return DeviceCompatibility.a(context, "ro.product.mod_device").endsWith("_alpha");
        }

        public static boolean isMiuiDevelopmentVersion() {
            return b;
        }

        public static boolean isMiuiStableVersion() {
            return c;
        }

        public static boolean isNotMIUI(Context context) {
            return !isMIUI(context);
        }
    }

    public static final class a {
        public static void a(Activity activity, boolean z) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    View decorView = activity.getWindow().getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static final class b {
        public static boolean a(@NonNull Activity activity, boolean z) {
            try {
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i = declaredField.getInt(null);
                int i2 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
                activity.getWindow().setAttributes(attributes);
                return true;
            } catch (Exception unused) {
                Log.e(DeviceCompatibility.a, "setStatusBarDarkMode: failed", new Object[0]);
                return false;
            }
        }
    }

    public static final class c {
        public static void a(Activity activity) {
            Window window;
            if (DeviceCompatibility.isSamsungPhone() && DeviceCompatibility.isLollipop() && (window = activity.getWindow()) != null) {
                window.clearFlags(67108864);
                window.setStatusBarColor(Color.parseColor("#929394"));
            }
        }
    }

    private DeviceCompatibility() {
    }

    public static String a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static boolean b() {
        String phoneBrand = AppUtil.getPhoneBrand();
        if (phoneBrand != null) {
            return phoneBrand.equalsIgnoreCase("oppo") || phoneBrand.equalsIgnoreCase("vivo");
        }
        return false;
    }

    public static boolean isHuaWeiPhone() {
        String phoneBrand = AppUtil.getPhoneBrand();
        boolean z = !TextUtils.isEmpty(phoneBrand) && (phoneBrand.equalsIgnoreCase("Huawei") || phoneBrand.equalsIgnoreCase("Honor"));
        Log.d(a, "PhoneBrand : " + phoneBrand + ", IsHuawei : " + z, new Object[0]);
        return z;
    }

    public static boolean isKitkat() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean isLollipop() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean isM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isOppoPhone() {
        String phoneBrand = AppUtil.getPhoneBrand();
        boolean zEqualsIgnoreCase = "oppo".equalsIgnoreCase(phoneBrand);
        Log.d(a, "PhoneBrand : " + phoneBrand + ", IsOppo : " + zEqualsIgnoreCase, new Object[0]);
        return zEqualsIgnoreCase;
    }

    public static boolean isQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isSamsungPhone() {
        return "samsung".equalsIgnoreCase(AppUtil.getPhoneBrand());
    }

    public static boolean isSupportSystemWindow(Context context) {
        return (b() || isHuaWeiPhone() || MIUI.isMIUI(context) || isM()) ? false : true;
    }

    public static boolean isSupportUnlockScreen(Context context) {
        return MIUI.isMIUI(context);
    }

    public static boolean isSupportWatch() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static void setLightStatusBar(Activity activity, boolean z) {
        if (MIUI.isMIUI(activity)) {
            a.a(activity, z);
        }
        MIUI.a(activity, z);
        b.a(activity, z);
        if (z) {
            c.a(activity);
        }
    }

    public static void setStatusBarDarkMode(Activity activity, boolean z) {
        setStatusBarDarkMode(activity, z, R.color.white100);
    }

    public static void setStatusBarDarkMode(Activity activity, boolean z, @ColorRes int i) {
        SystemBarTintManager systemBarTintManager = new SystemBarTintManager(activity);
        int color = ContextCompat.getColor(activity, i);
        StatusBarUtil.setStatusColor(activity, false, z, color);
        systemBarTintManager.setStatusBarTintEnabled(true);
        systemBarTintManager.setStatusBarTintColor(color);
    }
}
