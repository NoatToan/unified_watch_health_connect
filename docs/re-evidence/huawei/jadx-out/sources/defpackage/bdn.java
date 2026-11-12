package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes23.dex */
public class bdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f1045a = "";
    private static String d = null;
    private static String f;
    private static String g;
    private static String h;
    private static List<String> i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f1047c = false;
    private static int l = 466;
    private static int m = 466;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f1046b = -1.0f;
    private static String j = WatchFaceConstant.TEMPLATES_CIRCLE_NAME;
    private static boolean e = true;

    public static void d(String str) {
        g = str;
        Log.i("GeneratorConfig", "set model path: " + g);
    }

    public static String a() throws bdo {
        String str = g;
        if (str != null) {
            return str;
        }
        throw new bdo("not configured");
    }

    public static void e(String str) {
        h = str;
        Log.i("GeneratorConfig", "set template path: " + h);
    }

    public static String b() throws bdo {
        String str = h;
        if (str != null) {
            return str;
        }
        throw new bdo("not configured");
    }

    public static void c(String str) {
        j = str;
        Log.i("GeneratorConfig", "set template name: " + j);
    }

    public static String c() {
        return j;
    }

    public static void b(int i2, int i3) {
        l = i2;
        m = i3;
        Log.i("GeneratorConfig", "set watch size: " + l + "*" + m);
    }

    public static int g() {
        return l;
    }

    public static int f() {
        return m;
    }

    public static float e() {
        return f1046b;
    }

    public static String d() {
        return f1045a;
    }

    public static void d(boolean z) {
        e = z;
        Log.i("GeneratorConfig", "set supported clock coloring: " + e);
    }

    public static boolean h() {
        return e;
    }

    public static void c(List<Integer> list) {
        i = (List) list.stream().map(new Function() { // from class: bdm
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.toString(((Integer) obj).intValue());
            }
        }).collect(Collectors.toList());
        Log.i("GeneratorConfig", "set supported clocks: " + i);
    }

    public static boolean b(String str) {
        if (i.isEmpty()) {
            return true;
        }
        return i.contains(str);
    }

    public static boolean i() {
        return f1047c;
    }

    public static boolean j() {
        boolean zEquals = TextUtils.equals(h, f);
        if (!zEquals) {
            f = h;
        }
        boolean zEquals2 = TextUtils.equals(j, d);
        if (!zEquals2) {
            d = j;
        }
        return (zEquals && zEquals2) ? false : true;
    }
}
