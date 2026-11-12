package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.xiaomi.fitness.common.utils.RomUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
public class tvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f35115a = false;

    public static void a(Window window) {
        if (window == null) {
            return;
        }
        try {
            f35115a = d(window, true);
        } catch (Exception unused) {
        }
    }

    public static boolean b(Window window, boolean z) {
        if (window == null) {
            return false;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt(null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
            window.setAttributes(attributes);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(Window window, boolean z) {
        if (window == null) {
            return false;
        }
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_TRANSPARENT").getInt(cls2);
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            if (z) {
                int i3 = i2 | i;
                method.invoke(window, Integer.valueOf(i3), Integer.valueOf(i3));
            } else {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i2 | i));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(Window window, boolean z) {
        String str = Build.BRAND;
        if (str.equalsIgnoreCase("htc") && Build.MODEL.contains("M8w")) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            window.clearFlags(67108864);
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setSystemUiVisibility(1280);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            return true;
        }
        if (c(window, z)) {
            if (!z) {
                window.setFlags(67108864, 67108864);
                View decorView2 = window.getDecorView();
                if (decorView2 == null) {
                    return true;
                }
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
                return true;
            }
            window.setFlags(67108864, 67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView3 = window.getDecorView();
            if (decorView3 == null) {
                return true;
            }
            decorView3.setSystemUiVisibility(8192);
            return true;
        }
        if (b(window, z)) {
            window.setFlags(67108864, 67108864);
            return true;
        }
        window.clearFlags(67108864);
        View decorView4 = window.getDecorView();
        if (decorView4 != null) {
            if (z) {
                decorView4.setSystemUiVisibility(9472);
            } else {
                decorView4.setSystemUiVisibility(1280);
            }
        }
        window.addFlags(Integer.MIN_VALUE);
        if (z && (str.equalsIgnoreCase(RomUtils.OPPO) || str.equalsIgnoreCase(RomUtils.VIVO))) {
            window.setStatusBarColor(33554431);
            return true;
        }
        window.setStatusBarColor(0);
        return true;
    }
}
