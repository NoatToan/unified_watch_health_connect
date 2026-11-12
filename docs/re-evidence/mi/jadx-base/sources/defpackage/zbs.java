package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class zbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f41107a;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f41108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f41109b;
    }

    static {
        HashMap map = new HashMap();
        f41107a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        map.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        map.put(Character.class, cls3);
        Class cls4 = Short.TYPE;
        map.put(Short.class, cls4);
        Class cls5 = Integer.TYPE;
        map.put(Integer.class, cls5);
        Class cls6 = Float.TYPE;
        map.put(Float.class, cls6);
        Class cls7 = Long.TYPE;
        map.put(Long.class, cls7);
        Class cls8 = Double.TYPE;
        map.put(Double.class, cls8);
        map.put(cls, cls);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        map.put(cls5, cls5);
        map.put(cls6, cls6);
        map.put(cls7, cls7);
        map.put(cls8, cls8);
    }

    public static <T> T a(Class<? extends Object> cls, Object obj, String str) throws NoSuchFieldException {
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }

    public static <T> T b(Class<? extends Object> cls, String str) {
        try {
            return (T) a(cls, null, str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call getStaticField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(cls != null ? cls.getSimpleName() : "");
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    public static <T> T c(Class<?> cls, String str, Object... objArr) {
        return (T) h(cls, str, l(objArr)).invoke(null, m(objArr));
    }

    public static <T> T d(Object obj, String str) {
        try {
            return (T) a(obj.getClass(), obj, str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call getField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, Object... objArr) {
        try {
            return (T) n(obj, str, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call Method '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    public static <T> T f(String str, String str2) {
        try {
            return (T) a(odt.c(null, str), null, str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call getStaticField '");
            sb.append(str2);
            sb.append("' in ");
            sb.append(str);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    public static <T> T g(String str, String str2, Object... objArr) {
        try {
            return (T) c(odt.c(null, str), str2, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call Method '");
            sb.append(str2);
            sb.append("' in ");
            sb.append(str);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    public static Method h(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodI = i(cls.getDeclaredMethods(), str, clsArr);
        if (methodI != null) {
            methodI.setAccessible(true);
            return methodI;
        }
        if (cls.getSuperclass() != null) {
            return h(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    public static Method i(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && k(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    public static void j(Object obj, String str, Object obj2) {
        try {
            o(obj, str, obj2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Meet exception when call setField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
        }
    }

    public static boolean k(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr2[i];
            if (cls != null && !clsArr[i].isAssignableFrom(cls)) {
                Map<Class<?>, Class<?>> map = f41107a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Class<?>[] l(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((a) obj).f41108a;
            }
        }
        return clsArr;
    }

    public static Object[] m(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((a) obj).f41109b;
            }
        }
        return objArr2;
    }

    public static <T> T n(Object obj, String str, Object... objArr) {
        return (T) h(obj.getClass(), str, l(objArr)).invoke(obj, m(objArr));
    }

    public static void o(Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Class<?> superclass = obj.getClass();
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = superclass.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
            if (superclass == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
