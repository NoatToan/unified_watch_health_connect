package com.mipay.sdk.util;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class StatusBarUtils {
    public static final int FLAG_WINDOW_TRANSLUCENT_STATUS_DARK = 2;
    public static final int FLAG_WINDOW_TRANSLUCENT_STATUS_LIGHT = 1;
    private static final String KEY_VERSION_OPPO = "ro.build.version.opporom";
    private static final String TAG = "StatusBarUtils";
    private static final boolean sIsMiui6Later = isMIUI6Later();
    private static final boolean sIsColorOS_3 = isColorOS_3();
    private static final boolean sIsFlyme4Later = isFlyme4Later();

    public static int getSystemUiVisibility(Activity activity) {
        return activity.getWindow().getDecorView().getSystemUiVisibility();
    }

    private static boolean isColorOS_3() {
        try {
            return Integer.parseInt(((String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, KEY_VERSION_OPPO)).replaceAll("[vV]", "").substring(0, 1)) >= 3;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean isFlyme4Later() {
        if ("MEIZU".equalsIgnoreCase(Build.BRAND.trim())) {
            return Build.FINGERPRINT.contains("Flyme_OS_4") || Build.VERSION.INCREMENTAL.contains("Flyme_OS_4") || Pattern.compile("Flyme_OS_[4|5]", 2).matcher(Build.DISPLAY).find();
        }
        return false;
    }

    private static boolean isMIUI6Later() {
        return SystemProperties.getInt("ro.miui.ui.version.code", 0) >= 6;
    }

    private static void setMIUI6StatusBarDarkMode(Activity activity, boolean z) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setMIUI6StatusBarTranslucent(Activity activity, boolean z) {
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
        activity.getWindow().setStatusBarColor(i);
    }

    private static void setStatusBarDarkModeForFlyme4(Activity activity, boolean z) {
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
        }
    }

    public static void setStatusColor(Activity activity, boolean z, boolean z2, int i) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility((z2 ? 8192 : 0) | (z ? 1024 : 0));
        if (z) {
            i = 0;
        }
        window.setStatusBarColor(i);
    }

    public static void setSystemUiVisibility(Activity activity, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("setSystemUiVisibility : ");
        sb.append(i);
        activity.getWindow().getDecorView().setSystemUiVisibility(i);
    }

    public static void setTranslucentStatusBarBelowM(Activity activity) {
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
    }

    public static void setTranslucentStatusMode(Activity activity, int i) {
        setStatusColor(activity, true, i == 1, 0);
    }
}
