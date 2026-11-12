package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class hvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f20527a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f20528b = false;
    public static boolean c = true;
    public static boolean d = false;

    public static void a(Configuration configuration) {
        try {
            Matcher matcher = Pattern.compile("(?<=mMaxBounds=Rect\\().*?(?=\\))").matcher(configuration.toString());
            if (matcher.find()) {
                String[] strArrSplit = matcher.group().split(",")[1].split(" ");
                if (Integer.parseInt(strArrSplit[strArrSplit.length - 1]) >= b(600.0f)) {
                    p(false);
                } else {
                    p(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int b(float f) {
        if (lwr.b().getContext() != null) {
            return (int) ((f * lwr.b().getContext().getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static float c(Context context) {
        float f = context != null ? context.getResources().getDisplayMetrics().density : 0.0f;
        if (f == 0.0f && vwr.g().a() != null) {
            f = vwr.g().a().getResources().getDisplayMetrics().density;
        }
        if (f == 0.0f) {
            return 2.5f;
        }
        return f;
    }

    public static String d() {
        return Build.MODEL;
    }

    public static boolean e() {
        return c;
    }

    public static float f(Context context, String str) {
        return (!TextUtils.isEmpty(str) && j(context) && i(str)) ? 0.66f : 1.0f;
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            return point.y;
        }
        if (context.getResources() == null || context.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getResources().getDisplayMetrics().widthPixels;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            return point.x;
        }
        if (context.getResources() == null || context.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static boolean i(String str) {
        i1d infoProvider = lwr.b().getInfoProvider();
        String rNAppNameByUrl = lwr.b().getRNAppNameByUrl(str);
        String rNModuleByUrl = lwr.b().getRNModuleByUrl(str);
        String rNPathByUrl = lwr.b().getRNPathByUrl(str);
        if (TextUtils.isEmpty(str) || infoProvider == null || infoProvider.needGaussInLargeScreenPathList(rNAppNameByUrl, rNModuleByUrl, str) == null || infoProvider.needGaussInLargeScreenPathList(rNAppNameByUrl, rNModuleByUrl, str).size() <= 0) {
            return false;
        }
        return infoProvider.needGaussInLargeScreenPathList(rNAppNameByUrl, rNModuleByUrl, str).contains(rNPathByUrl);
    }

    public static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        int i = context.getResources().getConfiguration().screenWidthDp;
        float f = (context.getResources().getDisplayMetrics().heightPixels * 1.0f) / context.getResources().getDisplayMetrics().widthPixels;
        return i >= 530 && f <= 1.8f && f > 0.5f;
    }

    public static boolean k(Context context) {
        DisplayManager displayManager;
        return (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null || displayManager.getDisplays() == null || displayManager.getDisplays().length <= 1) ? false : true;
    }

    public static void l(Context context) {
        if (context != null) {
            if (svr.a(context, "ro.build.characteristics") != null) {
                f20527a = svr.a(context, "ro.build.characteristics").contains("tablet");
            }
            if (svr.a(context, "persist.sys.muiltdisplay_type") != null) {
                f20528b = svr.a(context, "persist.sys.muiltdisplay_type").contains("2");
            }
            if (context.getResources() != null) {
                a(context.getResources().getConfiguration());
            }
        }
    }

    public static boolean m() {
        return f20528b;
    }

    public static boolean n() {
        return f20527a;
    }

    public static void o(boolean z) {
        d = z;
    }

    public static void p(boolean z) {
        c = z;
    }
}
