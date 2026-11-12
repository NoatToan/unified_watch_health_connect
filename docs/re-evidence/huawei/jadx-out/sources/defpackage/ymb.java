package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class ymb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f53629a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f53630c = null;
    private static final String d = "ReleaseLogUtil";

    private static void d() {
        if (f53630c != null) {
            return;
        }
        try {
            f53630c = Class.forName("com.huawei.wearengine.utills.WearEngineReflectUtil");
            c();
        } catch (ClassNotFoundException unused) {
            Log.e(d, "class ClassNotFoundException");
        }
    }

    private static void c() {
        Class<?> cls;
        if (f53629a == null && (cls = f53630c) != null) {
            try {
                f53629a = cls.getDeclaredMethod("log", Integer.TYPE, String.class, Object[].class);
            } catch (NoSuchMethodException unused) {
                Log.e(d, "log NoSuchMethodException");
            }
        }
    }

    public static void d(int i, String str, Object... objArr) {
        Method method;
        d();
        Class<?> cls = f53630c;
        if (cls == null || (method = f53629a) == null) {
            Log.w(d, "log clazz or logMethod is null");
            return;
        }
        try {
            method.invoke(cls, Integer.valueOf(i), "WearEngine_" + str, a(objArr));
        } catch (IllegalAccessException unused) {
            Log.e(d, "log IllegalAccessException");
        } catch (InvocationTargetException unused2) {
            Log.e(d, "log InvocationTargetException");
        }
    }

    private static Object[] a(Object... objArr) {
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }
}
