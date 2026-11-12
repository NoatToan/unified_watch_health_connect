package defpackage;

import android.app.Application;
import android.content.Context;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class n86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f27644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f27645b;
    public static Method c;
    public static Method d;
    public static Class e;
    public static PathClassLoader f;
    public static Application g;
    public static Context h;
    public static Constructor<Class> i;
    public static Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f27646k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f27647r;
    public static int s;

    static {
        try {
            PathClassLoader pathClassLoader = new PathClassLoader("/system/framework/MiuiBooster.jar", ClassLoader.getSystemClassLoader());
            f = pathClassLoader;
            Class<?> clsLoadClass = pathClassLoader.loadClass("com.miui.performance.DeviceLevelUtils");
            e = clsLoadClass;
            i = clsLoadClass.getConstructor(Context.class);
            f27644a = e.getDeclaredMethod("initDeviceLevel", new Class[0]);
            Class<?> cls = Integer.TYPE;
            f27645b = e.getDeclaredMethod("getDeviceLevel", cls, cls);
            c = e.getDeclaredMethod("getDeviceLevel", cls);
            d = e.getDeclaredMethod("isSupportPrune", new Class[0]);
            f27646k = ((Integer) a(e, "DEVICE_LEVEL_FOR_RAM")).intValue();
            l = ((Integer) a(e, "DEVICE_LEVEL_FOR_CPU")).intValue();
            m = ((Integer) a(e, "DEVICE_LEVEL_FOR_GPU")).intValue();
            n = ((Integer) a(e, "LOW_DEVICE")).intValue();
            o = ((Integer) a(e, "MIDDLE_DEVICE")).intValue();
            p = ((Integer) a(e, "HIGH_DEVICE")).intValue();
            q = ((Integer) a(e, "DEVICE_LEVEL_UNKNOWN")).intValue();
            f27647r = ((Boolean) a(e, "IS_MIUI_LITE_VERSION")).booleanValue();
            s = ((Integer) a(e, "TOTAL_RAM")).intValue();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("MiDeviceLevelBridge(): Load Class Exception:");
            sb.append(e2);
        }
        if (h == null) {
            try {
                Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                g = application;
                if (application != null) {
                    h = application.getApplicationContext();
                }
            } catch (Exception e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("android.app.ActivityThread Exception:");
                sb2.append(e3);
            }
        }
        if (h == null) {
            try {
                Application application2 = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, null);
                g = application2;
                if (application2 != null) {
                    h = application2.getApplicationContext();
                }
            } catch (Exception e4) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("android.app.AppGlobals Exception:");
                sb3.append(e4);
            }
        }
        try {
            Constructor<Class> constructor = i;
            if (constructor != null) {
                j = constructor.newInstance(h);
            }
        } catch (Exception e5) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("DeviceLevelUtils(): newInstance Exception:");
            sb4.append(e5);
            e5.printStackTrace();
        }
    }

    public static <T> T a(Class<?> cls, String str) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return (T) declaredField.get(null);
    }
}
