package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class iz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f22245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static DisplayMetrics f22246b;

    public static Map<String, Map<String, Object>> a(double d) {
        sk1.d(Boolean.valueOf((f22245a == null && f22246b == null) ? false : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        HashMap map = new HashMap();
        map.put("windowPhysicalPixels", c(f22245a, d));
        map.put("screenPhysicalPixels", c(f22246b, d));
        return map;
    }

    public static WritableNativeMap b(double d) {
        sk1.d(Boolean.valueOf((f22245a == null && f22246b == null) ? false : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("windowPhysicalPixels", d(f22245a, d));
        writableNativeMap.putMap("screenPhysicalPixels", d(f22246b, d));
        return writableNativeMap;
    }

    public static Map<String, Object> c(DisplayMetrics displayMetrics, double d) {
        HashMap map = new HashMap();
        map.put("width", Integer.valueOf(displayMetrics.widthPixels));
        map.put("height", Integer.valueOf(displayMetrics.heightPixels));
        map.put("scale", Float.valueOf(displayMetrics.density));
        map.put("fontScale", Double.valueOf(d));
        map.put("densityDpi", Integer.valueOf(displayMetrics.densityDpi));
        return map;
    }

    public static WritableNativeMap d(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static DisplayMetrics e() {
        return f22246b;
    }

    @Deprecated
    public static DisplayMetrics f() {
        return f22245a;
    }

    public static void g(Context context) {
        if (rhh.a().g() && rhh.a().f()) {
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        j(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        sk1.d(windowManager, "WindowManager is null!");
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
        i(displayMetrics2);
    }

    public static void h(Context context) {
        if (e() != null) {
            return;
        }
        g(context);
    }

    public static void i(DisplayMetrics displayMetrics) {
        f22246b = displayMetrics;
    }

    public static void j(DisplayMetrics displayMetrics) {
        f22245a = displayMetrics;
    }
}
