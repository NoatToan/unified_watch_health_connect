package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public class zlr {
    public static Display a(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
            }
        }
        return h(context).getDefaultDisplay();
    }

    public static Point b(Context context) {
        Point point = new Point();
        c(context, point);
        return point;
    }

    public static void c(Context context, Point point) {
        d(h(context), context, point);
    }

    public static void d(WindowManager windowManager, Context context, Point point) {
        if (Build.VERSION.SDK_INT < 30) {
            a(context).getRealSize(point);
            return;
        }
        Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
        point.x = bounds.width();
        point.y = bounds.height();
    }

    public static int e(Configuration configuration) {
        String string = configuration.toString();
        if (string.contains("screenType=0")) {
            return 0;
        }
        if (string.contains("screenType=1")) {
            return 1;
        }
        if (string.contains("screenType=2")) {
            return 2;
        }
        if (string.contains("screenType=3")) {
            return 3;
        }
        if (string.contains("screenType=4")) {
            return 4;
        }
        return string.contains("screenType=5") ? 5 : 0;
    }

    public static void f(WindowManager windowManager, Context context, Rect rect) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            rect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        } else {
            if (i != 30) {
                a(context).getRectSize(rect);
                return;
            }
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            Rect bounds2 = context instanceof Activity ? windowManager.getCurrentWindowMetrics().getBounds() : windowManager.getMaximumWindowMetrics().getBounds();
            rect.set(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom);
        }
    }

    @Deprecated
    public static int g(Context context) {
        return i(context).y;
    }

    public static WindowManager h(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public static Point i(Context context) {
        Point point = new Point();
        j(context, point);
        return point;
    }

    public static void j(Context context, Point point) {
        k(h(context), context, point);
    }

    public static void k(WindowManager windowManager, Context context, Point point) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            point.x = bounds.width();
            point.y = bounds.height();
        } else {
            if (i != 30) {
                if (s6g.o(context)) {
                    a(context).getSize(point);
                    return;
                } else {
                    a(context).getRealSize(point);
                    return;
                }
            }
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            Rect bounds2 = context instanceof Activity ? windowManager.getCurrentWindowMetrics().getBounds() : windowManager.getMaximumWindowMetrics().getBounds();
            point.x = bounds2.width();
            point.y = bounds2.height();
        }
    }

    public static boolean l(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return true;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return false;
    }

    public static boolean m(Configuration configuration, Point point, Point point2) {
        return configuration.toString().contains("mWindowingMode=freeform") && ((((float) point2.x) + 0.0f) / ((float) point.x) <= 0.9f || (((float) point2.y) + 0.0f) / ((float) point.y) <= 0.9f);
    }

    public static boolean n(Context context) {
        if (Build.VERSION.SDK_INT >= 31 || l(context)) {
            return context.getResources().getConfiguration().orientation == 1;
        }
        return context.getApplicationContext().getResources().getConfiguration().orientation == 1;
    }
}
