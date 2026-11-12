package com.huami.view.basetitle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes15.dex */
public class SystemBarTintManager {
    public static final int DEFAULT_TINT_COLOR = -1728053248;
    private static String h;
    private final SystemBarConfig a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private View f;
    private View g;

    public static class SystemBarConfig {
        private static final String j = "status_bar_height";
        private static final String k = "navigation_bar_height";
        private static final String l = "navigation_bar_height_landscape";
        private static final String m = "navigation_bar_width";
        private static final String n = "config_showNavigationBar";
        private final boolean a;
        private final boolean b;
        private final int c;
        private final int d;
        private final boolean e;
        private final int f;
        private final int g;
        private final boolean h;
        private final float i;

        @TargetApi(14)
        private int a(Context context) {
            if (Build.VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        private int b(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @TargetApi(14)
        private int c(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !f(context)) {
                return 0;
            }
            return b(resources, this.h ? k : l);
        }

        @TargetApi(14)
        private int d(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !f(context)) {
                return 0;
            }
            return b(resources, m);
        }

        @SuppressLint({"NewApi"})
        private float e(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            float f = displayMetrics.widthPixels;
            float f2 = displayMetrics.density;
            return Math.min(f / f2, displayMetrics.heightPixels / f2);
        }

        @TargetApi(14)
        private boolean f(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier(n, "bool", "android");
            if (identifier == 0) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            boolean z = resources.getBoolean(identifier);
            if ("1".equals(SystemBarTintManager.h)) {
                return false;
            }
            if ("0".equals(SystemBarTintManager.h)) {
                return true;
            }
            return z;
        }

        public int getActionBarHeight() {
            return this.d;
        }

        public int getNavigationBarHeight() {
            return this.f;
        }

        public int getNavigationBarWidth() {
            return this.g;
        }

        public int getPixelInsetBottom() {
            if (this.b && isNavigationAtBottom()) {
                return this.f;
            }
            return 0;
        }

        public int getPixelInsetRight() {
            if (!this.b || isNavigationAtBottom()) {
                return 0;
            }
            return this.g;
        }

        public int getPixelInsetTop(boolean z) {
            return (this.a ? this.c : 0) + (z ? this.d : 0);
        }

        public int getStatusBarHeight() {
            return this.c;
        }

        public boolean hasNavigtionBar() {
            return this.e;
        }

        public boolean isNavigationAtBottom() {
            return this.i >= 600.0f || this.h;
        }

        private SystemBarConfig(Activity activity, boolean z, boolean z2) {
            Resources resources = activity.getResources();
            this.h = resources.getConfiguration().orientation == 1;
            this.i = e(activity);
            this.c = b(resources, j);
            this.d = a(activity);
            int iC = c(activity);
            this.f = iC;
            this.g = d(activity);
            this.e = iC > 0;
            this.a = z;
            this.b = z2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                declaredMethod.setAccessible(true);
                h = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
            } catch (Throwable unused) {
                h = null;
            }
        }
    }

    @TargetApi(19)
    public SystemBarTintManager(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{android.R.attr.windowTranslucentStatus, android.R.attr.windowTranslucentNavigation});
            try {
                this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
                this.c = typedArrayObtainStyledAttributes.getBoolean(1, false);
                typedArrayObtainStyledAttributes.recycle();
                int i = window.getAttributes().flags;
                if ((67108864 & i) != 0) {
                    this.b = true;
                }
                if ((i & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0) {
                    this.c = true;
                }
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        SystemBarConfig systemBarConfig = new SystemBarConfig(activity, this.b, this.c);
        this.a = systemBarConfig;
        if (!systemBarConfig.hasNavigtionBar()) {
            this.c = false;
        }
        if (this.b) {
            g(activity, viewGroup);
        }
        if (this.c) {
            f(activity, viewGroup);
        }
    }

    private boolean b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        window.getDecorView().setSystemUiVisibility(z ? 0 : 9216);
        return true;
    }

    private boolean c(Window window, boolean z) {
        if (window != null) {
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private boolean d(Window window, boolean z) {
        if (window == null) {
            return false;
        }
        if (z) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(8192);
        } else {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
        }
        return true;
    }

    private boolean e(Window window, boolean z) {
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager&LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z ? i : 0);
            objArr[1] = Integer.valueOf(i);
            method.invoke(window, objArr);
            return true;
        } catch (Exception e) {
            Log.d("BaseTitleActivity", e.getMessage());
            return false;
        }
    }

    private void f(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.g = new View(context);
        if (this.a.isNavigationAtBottom()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.a.getNavigationBarHeight());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.a.getNavigationBarWidth(), -1);
            layoutParams.gravity = 5;
        }
        this.g.setLayoutParams(layoutParams);
        this.g.setBackgroundColor(-1728053248);
        this.g.setVisibility(8);
        viewGroup.addView(this.g);
    }

    private void g(Context context, ViewGroup viewGroup) {
        this.f = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.a.getStatusBarHeight());
        layoutParams.gravity = 48;
        if (this.c && !this.a.isNavigationAtBottom()) {
            layoutParams.rightMargin = this.a.getNavigationBarWidth();
        }
        this.f.setLayoutParams(layoutParams);
        this.f.setBackgroundColor(-1728053248);
        this.f.setVisibility(8);
        viewGroup.addView(this.f);
    }

    public int chagenStatusBarMode(Activity activity, boolean z) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 19) {
            Window window = activity.getWindow();
            e(window, z);
            if (d(window, z)) {
                i = 1;
            } else if (c(window, z)) {
                i = 2;
            } else if (b(window, z)) {
                i = 3;
            }
        }
        Log.d("BaseTitleActivity", "return " + i);
        return i;
    }

    public SystemBarConfig getConfig() {
        return this.a;
    }

    public View getStatusBarTintView() {
        return this.f;
    }

    public boolean isNavBarTintEnabled() {
        return this.e;
    }

    public boolean isStatusBarTintEnabled() {
        return this.d;
    }

    @TargetApi(11)
    public void setNavigationBarAlpha(float f) {
        if (!this.c || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.g.setAlpha(f);
    }

    public void setNavigationBarTintColor(int i) {
        if (this.c) {
            this.g.setBackgroundColor(i);
        }
    }

    public void setNavigationBarTintDrawable(Drawable drawable) {
        if (this.c) {
            this.g.setBackgroundDrawable(drawable);
        }
    }

    public void setNavigationBarTintEnabled(boolean z) {
        this.e = z;
        if (this.c) {
            this.g.setVisibility(z ? 0 : 8);
        }
    }

    public void setNavigationBarTintResource(int i) {
        if (this.c) {
            this.g.setBackgroundResource(i);
        }
    }

    @TargetApi(11)
    public void setStatusBarAlpha(float f) {
        if (!this.b || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.f.setAlpha(f);
    }

    public void setStatusBarTintColor(int i) {
        if (this.b) {
            this.f.setBackgroundColor(i);
        }
    }

    public void setStatusBarTintDrawable(Drawable drawable) {
        if (this.b) {
            this.f.setBackgroundDrawable(drawable);
        }
    }

    public void setStatusBarTintEnabled(boolean z) {
        this.d = z;
        if (this.b) {
            this.f.setVisibility(z ? 0 : 8);
        }
    }

    public void setStatusBarTintResource(int i) {
        if (this.b) {
            this.f.setBackgroundResource(i);
        }
    }

    public void setStatusBarVisibility(boolean z) {
        this.d = z;
        this.f.setVisibility(z ? 0 : 8);
    }

    public void setTintAlpha(float f) {
        setStatusBarAlpha(f);
        setNavigationBarAlpha(f);
    }

    public void setTintColor(int i) {
        setStatusBarTintColor(i);
        setNavigationBarTintColor(i);
    }

    public void setTintDrawable(Drawable drawable) {
        setStatusBarTintDrawable(drawable);
        setNavigationBarTintDrawable(drawable);
    }

    public void setTintResource(int i) {
        setStatusBarTintResource(i);
        setNavigationBarTintResource(i);
    }
}
