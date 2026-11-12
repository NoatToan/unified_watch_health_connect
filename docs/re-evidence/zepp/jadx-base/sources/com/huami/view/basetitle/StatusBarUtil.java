package com.huami.view.basetitle;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
public class StatusBarUtil {
    private static final String a = "ro.build.version.opporom";
    private static final String b = "ro.miui.ui.version.name";
    private static final String c = "ro.build.version.emui";
    private static final String d = "ro.smartisan.version";
    private static final String e = "ro.vivo.os.version";

    private static void a(Activity activity, boolean z) {
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
        } catch (Exception unused) {
            Log.e("StatusBar", "darkIcon: failed");
        }
    }

    private static boolean b() {
        try {
            return Integer.parseInt(((String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, a)).replaceAll("[vV]", "").substring(0, 1)) >= 3;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean c() {
        if ("MEIZU".equals(Build.BRAND.trim().toUpperCase())) {
            return Build.FINGERPRINT.contains("Flyme_OS_4") || Build.VERSION.INCREMENTAL.contains("Flyme_OS_4") || Pattern.compile("Flyme_OS_[4|5]", 2).matcher(Build.DISPLAY).find();
        }
        return false;
    }

    private static boolean d() {
        try {
            return Integer.parseInt(((String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, b)).replaceAll("[vV]", "")) >= 6;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static void e(Activity activity, boolean z) {
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z ? i : 0);
            objArr[1] = Integer.valueOf(i);
            method.invoke(window, objArr);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void f(Activity activity, boolean z) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= 67108864;
        } else {
            attributes.flags &= -67108865;
        }
        window.setAttributes(attributes);
    }

    public static void setStatusBarColor(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
        }
    }

    public static void setStatusColor(Activity activity, boolean z, boolean z2, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            Window window = activity.getWindow();
            View decorView = window.getDecorView();
            if (i != 0) {
                window.clearFlags(67108864);
            }
            window.addFlags(Integer.MIN_VALUE);
            decorView.setSystemUiVisibility((z2 ? 8192 : 0) | (z ? 1024 : 0));
            if (!z) {
                window.setStatusBarColor(i);
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(0);
            return;
        }
        if (b()) {
            int i3 = z2 ? 16 : 1638400;
            Window window2 = activity.getWindow();
            window2.getDecorView().setSystemUiVisibility(i3 | (z ? 1024 : 0));
            window2.addFlags(Integer.MIN_VALUE);
            if (i2 >= 21) {
                if (z) {
                    i = 0;
                }
                window2.setStatusBarColor(i);
                return;
            }
            return;
        }
        if (d()) {
            f(activity, z);
            e(activity, z2);
            return;
        }
        if (c()) {
            a(activity, z2);
            if (z) {
                setStatusTranslate(activity);
                return;
            }
            return;
        }
        if (z) {
            setStatusTranslate(activity);
        }
        if (z) {
            i = 0;
        }
        setStatusBarColor(activity, i);
    }

    public static void setStatusTranslate(Activity activity) {
        if (Build.VERSION.SDK_INT < 21) {
            activity.getWindow().addFlags(67108864);
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
            activity.getWindow().setStatusBarColor(0);
        }
    }
}
