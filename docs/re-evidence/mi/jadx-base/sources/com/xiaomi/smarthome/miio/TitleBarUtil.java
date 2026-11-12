package com.xiaomi.smarthome.miio;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.smarthome.core.server.ReflectUtils;
import com.xiaomi.smarthome.library.DarkModeCompat;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.newui.utils.NumberUtils;
import com.xiaomi.smarthome.smarthome_utils.R;
import com.xiaomi.smarthome.utils.ViewUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
public class TitleBarUtil {
    public static final byte NAVIGATIONBAR_NORMAL = 0;
    public static final byte NAVIGATIONBAR_OVERLAY = 1;
    public static final byte NAVIGATIONBAR_PADDING = 3;
    private static final String TAG = "TitleBarUtil";

    public static void collapseStatusBar(Context context) {
        try {
            if (Build.VERSION.SDK_INT <= 30) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } else {
                context.sendBroadcast(new Intent("action_panels_operation").putExtra("operation", "reverse_quick_settings_panel"));
            }
        } catch (Exception unused) {
        }
    }

    public static void enableTranslucentStatus(Activity activity) {
        enableTranslucentStatus(activity.getWindow());
    }

    public static void enableWhiteTranslucentStatus(Window window) {
        if (window == null) {
            return;
        }
        translucent(window, false);
    }

    public static int getStatusHeight(Context context) {
        int dimensionPixelSize;
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            dimensionPixelSize = context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(ReflectUtils.getInstance(cls, new Object[0])).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            dimensionPixelSize = -1;
        }
        return dimensionPixelSize == -1 ? (int) TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()) : dimensionPixelSize;
    }

    public static int getTopPadding() {
        return ViewUtils.getStatusHeight(MiJiaEnvironment.getAppContext());
    }

    public static int getTopPaddingIfTransEnabled(Activity activity) {
        if (isTranslucentEnabled(activity)) {
            return getTopPadding();
        }
        return 0;
    }

    public static boolean isTranslucentEnabled(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.BRAND.equalsIgnoreCase("htc") && Build.MODEL.contains("M8w")) {
            return false;
        }
        try {
            return (activity.getWindow().getAttributes().flags & Integer.MIN_VALUE) == Integer.MIN_VALUE;
        } catch (Exception unused) {
        }
    }

    private static boolean setFlymeStatusBarLightMode(Window window, boolean z) {
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

    private static boolean setMIUIStatusBarLightMode(Window window, boolean z) {
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

    public static void setNavigationBar(Window window, byte b2) {
        setNavigationBar(window, b2, null);
    }

    public static void setSystemBar(Window window) {
        if (window == null) {
            return;
        }
        enableTranslucentStatus(window);
        setNavigationBar(window, (byte) 0);
    }

    public static void setTitleBar(Activity activity, View view) {
        setTitleBar(activity, view, getTopPaddingIfTransEnabled(activity));
    }

    public static void setTitleBarPadding(View view) {
        setTitleBarPadding(getTopPadding(), view);
    }

    public static void translucent(Window window, boolean z) {
        String str = Build.BRAND;
        if (str.equalsIgnoreCase("htc") && Build.MODEL.contains("M8w")) {
            return;
        }
        try {
            window.clearFlags(67108864);
            window.addFlags(2048);
            if (z) {
                window.getDecorView().setSystemUiVisibility(9472);
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
            }
            window.addFlags(Integer.MIN_VALUE);
            if (z && (str.equalsIgnoreCase(RomUtils.OPPO) || str.equalsIgnoreCase(RomUtils.VIVO))) {
                window.setStatusBarColor(33554431);
            } else {
                window.setStatusBarColor(0);
            }
        } catch (Exception unused) {
        }
    }

    public static void enableTranslucentStatus(Window window) {
        if (window == null) {
            return;
        }
        translucent(window, !DarkModeCompat.isDarkMode(window.getContext()));
    }

    public static void enableWhiteTranslucentStatus(Activity activity) {
        if (activity == null) {
            return;
        }
        translucent(activity.getWindow(), false);
    }

    public static void setNavigationBar(Window window, byte b2, Integer num) {
        setNavigationBar(window, b2, false, num);
    }

    public static void setTitleBar(Activity activity, View view, int i) {
        View viewFindViewById = view != null ? view.findViewById(R.id.title_bar) : null;
        if (viewFindViewById == null && activity != null) {
            viewFindViewById = activity.findViewById(R.id.title_bar);
        }
        if (viewFindViewById != null) {
            setTitleBarPadding(i, viewFindViewById);
        }
    }

    public static void setTitleBarPadding(int i, View view) {
        if (view == null) {
            return;
        }
        int iValueOf = NumberUtils.valueOf(view.getTag(R.id.title_bar_padding), 0);
        view.setTag(R.id.title_bar_padding, Integer.valueOf(i));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = layoutParams.height;
        if (i2 > 0) {
            layoutParams.height = (i2 - iValueOf) + i;
            view.setLayoutParams(layoutParams);
        }
        view.setPadding(0, (view.getPaddingTop() - iValueOf) + i, 0, 0);
    }

    public static void setNavigationBar(Window window, byte b2, boolean z, Integer num) {
        View viewFindViewById;
        if (window == null) {
            return;
        }
        View decorView = window.getDecorView();
        if ((b2 & 1) == 1) {
            window.addFlags(Integer.MIN_VALUE);
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 512);
            if (b2 == 3 && (viewFindViewById = window.findViewById(android.R.id.content)) != null) {
                viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getRight(), ViewUtils.getNavigationBarHeight(window.getContext()));
            }
            if (num == null) {
                num = 0;
            }
        }
        if (z) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        }
        if (num != null) {
            if (((decorView.getSystemUiVisibility() & 16) == 16 || !SystemApi.isMiui()) && Color.alpha(num.intValue()) == 0) {
                num = Integer.valueOf(Color.argb(1, Color.red(num.intValue()), Color.green(num.intValue()), Color.blue(num.intValue())));
            }
            window.setNavigationBarColor(num.intValue());
        }
    }

    public static void setTitleBar(Activity activity, int i) {
        setTitleBar(activity, null, i);
    }

    public static void setTitleBar(Activity activity) {
        setTitleBar(activity, getTopPaddingIfTransEnabled(activity));
    }
}
