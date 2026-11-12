package defpackage;

import cn.hutool.core.convert.BasicType;
import cn.hutool.core.io.IORuntimeException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class i04 {
    public static <T> Class<T> a(T t) {
        if (t == null) {
            return null;
        }
        return (Class<T>) t.getClass();
    }

    public static ClassLoader b() {
        return yz3.b();
    }

    public static String c(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        return z ? cls.getSimpleName() : cls.getName();
    }

    public static String d(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        return c(obj.getClass(), z);
    }

    public static String e() {
        return f(false);
    }

    public static String f(boolean z) {
        URL urlG = g();
        return jm9.E(z ? urlG.getPath() : d8q.g(urlG));
    }

    public static URL g() {
        return m("");
    }

    public static Class<?>[] h(Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof c2h) {
                clsArr[i] = ((c2h) obj).a();
            } else if (obj == null) {
                clsArr[i] = Object.class;
            } else {
                clsArr[i] = obj.getClass();
            }
        }
        return clsArr;
    }

    public static Field i(Class<?> cls, String str) throws SecurityException {
        if (cls != null && !tt3.F(str)) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    public static Object j(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        if (Long.TYPE == cls) {
            return 0L;
        }
        if (Integer.TYPE == cls) {
            return 0;
        }
        if (Short.TYPE == cls) {
            return (short) 0;
        }
        if (Character.TYPE == cls) {
            return (char) 0;
        }
        if (Byte.TYPE == cls) {
            return (byte) 0;
        }
        if (Double.TYPE == cls) {
            return Double.valueOf(0.0d);
        }
        if (Float.TYPE == cls) {
            return Float.valueOf(0.0f);
        }
        if (Boolean.TYPE == cls) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Object[] k(Class<?>... clsArr) {
        Object[] objArr = new Object[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            objArr[i] = j(clsArr[i]);
        }
        return objArr;
    }

    public static String[] l() {
        return System.getProperty("java.class.path").split(System.getProperty("path.separator"));
    }

    public static URL m(String str) throws IORuntimeException {
        return irk.a(str);
    }

    public static Class<?> n(Class<?> cls) {
        return o(cls, 0);
    }

    public static Class<?> o(Class<?> cls, int i) {
        return i5q.e(i5q.o(cls, i));
    }

    public static boolean p(Class<?> cls) {
        return Modifier.isAbstract(cls.getModifiers());
    }

    public static boolean q(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (qj1.D(clsArr) && qj1.D(clsArr2)) {
            return true;
        }
        if (clsArr == null || clsArr2 == null || clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr[i];
            Class<?> cls2 = clsArr2[i];
            if (s(cls) && s(cls2)) {
                if (BasicType.unWrap(cls) != BasicType.unWrap(cls2)) {
                    return false;
                }
            } else if (!cls.isAssignableFrom(cls2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(Class<?> cls, Class<?> cls2) {
        if (cls == null || cls2 == null) {
            return false;
        }
        if (cls.isAssignableFrom(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            return cls.equals(BasicType.WRAPPER_PRIMITIVE_MAP.get(cls2));
        }
        Class<?> cls3 = BasicType.PRIMITIVE_WRAPPER_MAP.get(cls2);
        return cls3 != null && cls.isAssignableFrom(cls3);
    }

    public static boolean s(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || u(cls);
    }

    public static boolean t(Class<?> cls) {
        return (cls == null || cls.isInterface() || p(cls) || cls.isEnum() || cls.isArray() || cls.isAnnotation() || cls.isSynthetic() || cls.isPrimitive()) ? false : true;
    }

    public static boolean u(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return BasicType.WRAPPER_PRIMITIVE_MAP.containsKey(cls);
    }

    public static boolean v(Method method) {
        qk1.u(method, "Method to provided is null.", new Object[0]);
        return Modifier.isStatic(method.getModifiers());
    }

    public static Method w(Method method) {
        if (method != null && !method.isAccessible()) {
            method.setAccessible(true);
        }
        return method;
    }
}
