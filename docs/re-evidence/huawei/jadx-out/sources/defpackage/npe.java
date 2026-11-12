package defpackage;

import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class npe {
    public static void d(Window window) {
        d(window, "addHwFlags");
    }

    public static void c(Window window) {
        d(window, "clearHwFlags");
    }

    private static void d(Window window, String str) {
        try {
            nox.b("ScreenShotUtils", "invokeScreenShot flags==" + str, true);
            WindowManager.LayoutParams attributes = window.getAttributes();
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            Object objNewInstance = cls.getDeclaredConstructor(WindowManager.LayoutParams.class).newInstance(attributes);
            Method method = cls.getMethod(str, Integer.TYPE);
            method.invoke(objNewInstance, 4096);
            method.invoke(objNewInstance, 8192);
            window.clearFlags(0);
        } catch (ClassNotFoundException e) {
            nox.a("ScreenShotUtils", "ClassNotFoundException--" + e.getClass().getSimpleName(), true);
        } catch (IllegalAccessException e2) {
            nox.a("ScreenShotUtils", "IllegalAccessException--" + e2.getClass().getSimpleName(), true);
        } catch (InstantiationException e3) {
            nox.a("ScreenShotUtils", "InstantiationException--" + e3.getClass().getSimpleName(), true);
        } catch (NoClassDefFoundError e4) {
            nox.a("ScreenShotUtils", "NoClassDefFoundError--" + e4.getClass().getSimpleName(), true);
        } catch (NoSuchMethodException e5) {
            nox.a("ScreenShotUtils", "NoSuchMethodException--" + e5.getClass().getSimpleName(), true);
        } catch (InvocationTargetException e6) {
            nox.a("ScreenShotUtils", "InvocationTargetException--" + e6.getClass().getSimpleName(), true);
        } catch (Exception e7) {
            nox.a("ScreenShotUtils", "Exception--" + e7.getClass().getSimpleName(), true);
        }
    }
}
