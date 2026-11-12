package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class cbk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class, Field[]> f5166a = new LinkedHashMap();

    public static Method a(Object obj, String str, Class<?>[] clsArr) {
        if (obj instanceof Class) {
            try {
                return ((Class) obj).getMethod(str, clsArr);
            } catch (Exception e) {
                Logger logger = Logger.INSTANCE;
                Logger.e("findMethod failed, %s", e.getCause(), e);
                e.printStackTrace();
                return null;
            }
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredMethod(str, clsArr);
            } catch (Exception e2) {
                Logger logger2 = Logger.INSTANCE;
                Logger.e("Failed to get method %s with parameters %s on %s, error: %s", str, clsArr, obj, e2);
            }
        }
        return null;
    }

    public static Object b(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            Objects.requireNonNull(obj);
            Method methodA = a(obj, str, clsArr);
            if (methodA == null) {
                return null;
            }
            if (!methodA.isAccessible()) {
                methodA.setAccessible(true);
            }
            return methodA.invoke(obj, objArr);
        } catch (Exception e) {
            Logger.e("Failed to invoke %s on %s, with parameters %s - %s, error: %s", str, obj, objArr, objArr, e);
            return null;
        }
    }

    public static Object c(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        Class<?> cls;
        try {
            Objects.requireNonNull(str);
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
            Logger.e("Class %s not found, %s", str, e);
            cls = null;
        }
        if (cls != null) {
            return b(cls, str2, clsArr, objArr);
        }
        return null;
    }
}
