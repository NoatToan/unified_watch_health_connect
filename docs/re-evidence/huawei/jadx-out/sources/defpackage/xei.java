package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f52773a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f52774b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Object f52775c = null;
    private static Method d = null;
    private static Method e = null;
    private static Class<?> g = null;
    private static Class<?> h = null;
    private static Class<?> i = null;
    private static boolean j = false;
    private static Map<Integer, String> f = new HashMap();
    private static Map<Integer, String> o = new HashMap();
    private static List<Integer> l = new ArrayList(10);

    static {
        try {
            f.put(0, "haptic.common.long_press");
            f.put(1, "haptic.common.threshold");
            f.put(2, "haptic.slide.type1");
            f.put(3, "haptic.slide.type2");
            f.put(4, "haptic.slide.type3");
            f.put(5, "haptic.slide.type4");
            f.put(6, "haptic.slide.type5");
            f.put(7, "haptic.slide.type6");
            f.put(8, "haptic.common.long_press1");
            f.put(9, "haptic.common.long_press2");
            f.put(10, "watchhaptic.crown.strength1");
            f.put(11, "watchhaptic.crown.strength2");
            f.put(12, "watchhaptic.crown.strength3");
            o.put(0, "haptic.common.long_press");
            o.put(1, "haptic.common.threshold");
            o.put(2, "haptic.control.time_scroll");
            o.put(3, "haptic.control.time_scroll");
            o.put(4, "haptic.control.time_scroll");
            o.put(5, "haptic.control.time_scroll");
            o.put(6, "haptic.control.time_scroll");
            o.put(7, "haptic.slide.type6");
            o.put(8, "haptic.common.long_press1");
            o.put(9, "haptic.common.long_press2");
            o.put(10, "watchhaptic.crown.strength1");
            o.put(11, "watchhaptic.crown.strength2");
            o.put(12, "watchhaptic.crown.strength3");
            Class<?> cls = Class.forName("com.huawei.android.os.VibratorEx");
            i = cls;
            if (!"class com.huawei.android.os.VibratorEx".equals(cls.toString())) {
                j = true;
                Log.e("HwVibrateUtil", "fail to reflect, class is proguard.");
                return;
            }
            f52775c = i.newInstance();
            f52773a = i.getMethod("isSupportHwVibrator", String.class);
            d = i.getMethod("setHwVibrator", String.class);
            e = i.getMethod("stopHwVibrator", String.class);
            h = Class.forName("com.huawei.android.view.ViewEx");
            g = Class.forName("com.huawei.android.view.HapticFeedbackConstantsEx");
            Class<?> cls2 = h;
            Class<?> cls3 = Integer.TYPE;
            f52774b = cls2.getMethod("performHwHapticFeedback", View.class, cls3, cls3);
            l.add(0, Integer.valueOf(d("HW_LONG_PRESS")));
            l.add(1, Integer.valueOf(d("HW_THRESHOLD")));
            l.add(2, Integer.valueOf(d("HW_SLIDE_1")));
            l.add(3, Integer.valueOf(d("HW_SLIDE_2")));
            l.add(4, Integer.valueOf(d("HW_SLIDE_3")));
            l.add(5, Integer.valueOf(d("HW_SLIDE_4")));
            l.add(6, Integer.valueOf(d("HW_SLIDE_5")));
            l.add(7, Integer.valueOf(d("HW_SLIDE_6")));
            l.add(8, Integer.valueOf(d("HW_LONG_PRESS1")));
            l.add(9, Integer.valueOf(d("HW_LONG_PRESS2")));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            Log.e("HwVibrateUtil", "class init failed.");
        } catch (Exception unused2) {
            Log.e("HwVibrateUtil", "Another exception failed.");
        }
    }

    private static int a(String str) {
        try {
            Object obj = g.getField(str).get(null);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return 0;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.e("HwVibrateUtil", "get field failed.");
            return 0;
        }
    }

    public static boolean b(String str) {
        if (j || str == null || f52775c == null || d == null || !c(str)) {
            return false;
        }
        try {
            d.invoke(f52775c, str);
            return true;
        } catch (IllegalAccessException unused) {
            Log.e("HwVibrateUtil", "Call doVibrateEx IllegalAccessException Exception.");
            return false;
        } catch (InvocationTargetException unused2) {
            Log.e("HwVibrateUtil", "Call doVibrateEx InvocationTargetException Exception.");
            return false;
        }
    }

    private static boolean c(String str) {
        Object obj;
        Method method = f52773a;
        if (method == null || (obj = f52775c) == null) {
            return false;
        }
        try {
            Object objInvoke = method.invoke(obj, str);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
            Log.e("HwVibrateUtil", "Call isSupportHwVibrator exception.");
        }
        return false;
    }

    private static int d(String str) {
        if (j || g == null) {
            return 0;
        }
        return a(str);
    }

    private static boolean b(View view, int i2, int i3) {
        if (f52774b != null && i2 < l.size() && i2 >= 0 && c(f.get(Integer.valueOf(i2)))) {
            try {
                f52774b.invoke(null, view, l.get(i2), Integer.valueOf(i3));
                return true;
            } catch (IllegalAccessException unused) {
                Log.e("HwVibrateUtil", "Call doViewEx IllegalAccessException Exception.");
            } catch (InvocationTargetException unused2) {
                Log.e("HwVibrateUtil", "Call doViewEx InvocationTargetException Exception.");
            }
        }
        return false;
    }

    public static boolean c(View view, int i2, int i3) {
        if (l.size() == 0 || !b(view, i2, i3)) {
            return b(o.get(Integer.valueOf(i2)));
        }
        return true;
    }

    public static void c(String str, long j2) {
        String strD = d(str, j2);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        Log.i("HwVibrateUtil", "The timeSpan when play haptic : " + SystemClock.uptimeMillis());
        pa.e().b(strD, 0);
    }

    private static String d(String str, long j2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONArray("PatternList").getJSONObject(0).getJSONArray("Pattern").getJSONObject(0).getJSONObject("Event").getJSONObject("Parameters");
            jSONObject2.put("Intensity", j2);
            jSONObject2.put("Frequency", 80);
            return jSONObject.toString();
        } catch (JSONException unused) {
            Log.w("HwVibrateUtil", "Json parse error or file not exist.");
            return "";
        }
    }
}
