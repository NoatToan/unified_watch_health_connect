package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class s6g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static TypedValue f33346a = new TypedValue();

    public static boolean a(Context context) {
        String str = SystemProperties.get("qemu.hw.mainkeys");
        if ("1".equals(str)) {
            return false;
        }
        if ("0".equals(str)) {
            return true;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", PluginPackageConstant.RN_DIR_A);
        if (identifier > 0) {
            return resources.getBoolean(identifier);
        }
        return false;
    }

    public static boolean b(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static int c(float f, float f2) {
        return (int) ((f2 * f) + 0.5f);
    }

    public static int d(Context context, float f) {
        return c(context.getResources().getConfiguration().densityDpi / 160.0f, f);
    }

    public static int e(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        return (int) TypedValue.complexToFloat(typedValue.data);
    }

    public static int f(Context context) {
        return context.getResources().getConfiguration().fontScale < 1.55f ? 1 : 2;
    }

    public static int g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_navBarInteractionMode", "integer", PluginPackageConstant.RN_DIR_A);
        if (identifier > 0) {
            return resources.getInteger(identifier);
        }
        return 0;
    }

    public static int h(Context context) {
        int iJ = (q(context) || !n(context)) ? j(context) : 0;
        if (iJ < 0) {
            return 0;
        }
        return iJ;
    }

    public static Point i(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        try {
            Object objB = gbk.b(defaultDisplay, gbk.c(defaultDisplay.getClass(), "mDisplayInfo"));
            point.x = ((Integer) gbk.b(objB, gbk.e(objB.getClass(), "logicalWidth"))).intValue();
            point.y = ((Integer) gbk.b(objB, gbk.e(objB.getClass(), "logicalHeight"))).intValue();
        } catch (Exception unused) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        return point;
    }

    public static int j(Context context) {
        Resources resources;
        int identifier;
        if (a(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", PluginPackageConstant.RN_DIR_A)) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int k(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean l(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "hide_gesture_line", 0) == 0;
    }

    @Deprecated
    public static boolean m(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        Point pointI = i(context);
        return context.getResources().getConfiguration().toString().contains("mWindowingMode=freeform") && ((((float) point.x) + 0.0f) / ((float) pointI.x) <= 0.9f || (((float) point.y) + 0.0f) / ((float) pointI.y) <= 0.9f);
    }

    public static boolean n(Context context) {
        return g(context) == 2;
    }

    public static boolean o(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return b((Activity) context);
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return false;
    }

    public static boolean p(View view) {
        return (view.getWindowSystemUiVisibility() & 512) != 0;
    }

    public static boolean q(Context context) {
        return l(context) && n(context) && r(context);
    }

    public static boolean r(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "use_gesture_version_three", 0) != 0;
    }

    public static boolean s(Context context) {
        if (context == null) {
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "bo".equals(language) || "ta".equals(language);
    }

    public static int t(float f, float f2) {
        return (int) ((f2 / f) + 0.5f);
    }

    public static int u(Context context, float f) {
        return t(context.getResources().getConfiguration().densityDpi / 160.0f, f);
    }
}
