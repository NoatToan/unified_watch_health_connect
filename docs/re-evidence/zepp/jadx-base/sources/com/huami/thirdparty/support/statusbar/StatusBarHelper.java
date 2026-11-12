package com.huami.thirdparty.support.statusbar;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public class StatusBarHelper {
    private static final String a = "StatusBarHelper";

    private static boolean a(Window window, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        window.getDecorView().setSystemUiVisibility(z ? 9216 : 0);
        return true;
    }

    private static boolean b(Window window, boolean z) {
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i = declaredField.getInt(null);
                int i2 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, !z ? i2 | i : (~i) & i2);
                window.setAttributes(attributes);
                return true;
            } catch (Exception e) {
                Log.e(a, "非魅族手机：" + e.getMessage());
            }
        }
        return false;
    }

    private static boolean c(Window window, boolean z) {
        if (window != null && Build.VERSION.SDK_INT <= 23) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i));
                }
                return true;
            } catch (Exception e) {
                Log.e(a, "非小米手机：" + e.getMessage());
            }
        }
        return false;
    }

    private static int d(Activity activity, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            Window window = activity.getWindow();
            if (c(window, z)) {
                return 1;
            }
            if (b(window, z)) {
                return 2;
            }
            if (a(window, z)) {
                return 3;
            }
        }
        return 0;
    }

    private static void e(SystemBarTintManager systemBarTintManager, @ColorInt int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            systemBarTintManager.d(true);
            systemBarTintManager.b(i);
        }
    }

    private static void f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
        }
    }

    public static void g(@NonNull Activity activity, boolean z, @ColorInt int i) {
        f(activity);
        e(new SystemBarTintManager(activity), i);
        d(activity, z);
    }

    public static int getStatusBarHeight(Window window) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return window.findViewById(R.id.content).getTop() - rect.top;
    }

    public static void trySetStatusBar(Activity activity, boolean z) {
        g(activity, z, ContextCompat.getColor(activity, R.color.transparent));
    }

    public static void trySetStatusBarColorRes(@NonNull Activity activity, boolean z, @ColorRes int i) {
        f(activity);
        e(new SystemBarTintManager(activity), ContextCompat.getColor(activity, i));
        d(activity, z);
    }

    public static int getStatusBarHeight(Resources resources) {
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
