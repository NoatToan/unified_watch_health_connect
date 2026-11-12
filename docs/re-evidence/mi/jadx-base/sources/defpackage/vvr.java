package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import com.mipay.sdk.util.NavBarUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class vvr {

    public static class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f37279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f37280b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;

        public a(boolean z, Activity activity, View view, int i) {
            this.f37279a = z;
            this.f37280b = activity;
            this.c = view;
            this.d = i;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f37279a) {
                this.f37280b.getWindow().clearFlags(134217728);
            } else {
                this.f37280b.getWindow().addFlags(134217728);
            }
            View view2 = this.c;
            view2.setPadding(view2.getPaddingLeft(), this.c.getPaddingTop(), this.c.getPaddingRight(), -1);
            if (this.f37279a) {
                this.f37280b.getWindow().setNavigationBarColor(this.d);
            } else {
                this.f37280b.getWindow().setNavigationBarColor(0);
            }
            windowInsets.consumeSystemWindowInsets();
            this.c.setOnApplyWindowInsetsListener(null);
            return windowInsets;
        }
    }

    public static boolean a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", PluginPackageConstant.RN_DIR_A);
        boolean z = false;
        boolean z2 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if (!"1".equals(str)) {
                z = "0".equals(str) ? true : z2;
            }
            return z;
        } catch (Exception unused) {
            return z2;
        }
    }

    public static void b(Activity activity) {
        if (activity == null) {
            return;
        }
        boolean z = Build.BRAND.equalsIgnoreCase("htc") && Build.MODEL.contains("M8w");
        if (!z) {
            try {
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                declaredField2.setInt(attributes, declaredField.getInt(null) | declaredField2.getInt(attributes));
                activity.getWindow().setAttributes(attributes);
                activity.getWindow().setFlags(67108864, 67108864);
                return;
            } catch (Exception unused) {
            }
        } else if (z) {
            return;
        }
        try {
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(33554431);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(Activity activity) {
        if (activity == null) {
            return;
        }
        d(activity.getWindow());
    }

    public static void d(Window window) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            return;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return;
        }
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }

    public static void e(Activity activity, View view, boolean z, String str) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || view == null) {
            return;
        }
        boolean z2 = Settings.Global.getInt(activity.getContentResolver(), NavBarUtils.FORCE_FSG_NAV_BAR, 0) == 0;
        int color = z2 ? -1 : 0;
        try {
            color = Color.parseColor(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z2) {
            view.setFitsSystemWindows(true);
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            activity.getWindow().clearFlags(134217728);
            if (z) {
                activity.getWindow().setNavigationBarColor(color);
            } else {
                activity.getWindow().setNavigationBarColor(-1);
            }
        } else {
            view.setFitsSystemWindows(false);
            view.setOnApplyWindowInsetsListener(new a(z, activity, view, color));
            view.requestApplyInsets();
        }
        d(activity.getWindow());
    }

    public static void f(boolean z, Activity activity) {
        try {
            Class<?> cls = activity.getWindow().getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z ? i : 0);
            objArr[1] = Integer.valueOf(i);
            method.invoke(window, objArr);
        } catch (Exception unused) {
        }
    }

    public static void g(boolean z, Activity activity) {
        try {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (z) {
                attributes.flags |= 67108864;
            } else {
                attributes.flags &= -67108865;
            }
            window.setAttributes(attributes);
            f(z, activity);
        } catch (Exception unused) {
        }
    }
}
