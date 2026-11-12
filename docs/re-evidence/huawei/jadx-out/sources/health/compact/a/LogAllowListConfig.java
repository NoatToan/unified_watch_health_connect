package health.compact.a;

import android.util.Log;
import com.huawei.haf.application.BaseApplication;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LogAllowListConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f36597b = !"CN".equals(BaseApplication.b().getResources().getConfiguration().locale.getCountry());
    private static boolean d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f36598c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<String> f36596a = new ArrayList(10);
    private static List<String> f = new ArrayList(10);
    private static List<String> e = new ArrayList(10);
    private static List<String> j = new ArrayList(10);

    public static void d() {
        d = true;
    }

    public static void a() {
        d = false;
    }

    public static boolean d(int i, String str) {
        if (!LogConfig.b(i)) {
            return false;
        }
        if (!d || LogConfig.d()) {
            return true;
        }
        return e(b(), str);
    }

    public static boolean c(String str, Object obj) {
        boolean z;
        synchronized (obj) {
            z = f36597b;
        }
        if (z) {
            return e(f(), str);
        }
        return true;
    }

    private static boolean e(List<String> list, String str) {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf(95)) > 0) {
            return list.contains(str.substring(0, iIndexOf));
        }
        return false;
    }

    public static void e() {
        f36598c = true;
    }

    public static void c() {
        f36598c = false;
    }

    public static boolean b(String str, Object obj) {
        if (str == null) {
            Log.w("LogAllowListConfig", "checkAllowLogcat null");
            return false;
        }
        if ("HWWEAR".equals(str)) {
            return false;
        }
        if (!f36598c || LogConfig.d()) {
            return true;
        }
        return c(str, obj);
    }

    public void b(List<String> list) {
        f36596a.addAll(list);
    }

    public void c(List<String> list) {
        e.addAll(list);
    }

    public static List<String> b() {
        return f36596a;
    }

    public static List<String> f() {
        return e;
    }

    public static boolean j() {
        return f36597b;
    }

    public static void d(boolean z) {
        f36597b = z;
    }
}
