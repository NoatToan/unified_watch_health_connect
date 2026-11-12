package defpackage;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.SimpleCache;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class bbk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleCache<Class<?>, Constructor<?>[]> f4024a = new SimpleCache<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleCache<Class<?>, Field[]> f4025b = new SimpleCache<>();
    public static final SimpleCache<Class<?>, Method[]> c = new SimpleCache<>();

    public static <T> Constructor<T> b(Class<T> cls, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        for (Constructor<T> constructor : c(cls)) {
            if (i04.q(constructor.getParameterTypes(), clsArr)) {
                v(constructor);
                return constructor;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Constructor<T>[] c(Class<T> cls) throws SecurityException {
        qk1.t(cls);
        SimpleCache<Class<?>, Constructor<?>[]> simpleCache = f4024a;
        Constructor<?>[] constructorArr = simpleCache.get(cls);
        return constructorArr != null ? constructorArr : simpleCache.put(cls, d(cls));
    }

    public static Constructor<?>[] d(Class<?> cls) throws SecurityException {
        qk1.t(cls);
        return cls.getDeclaredConstructors();
    }

    public static Field e(Class<?> cls, final String str) throws SecurityException {
        return (Field) qj1.s(new b8f() { // from class: zak
            @Override // defpackage.b8f
            public final boolean a(Object obj) {
                return bbk.s(str, (Field) obj);
            }
        }, i(cls));
    }

    public static String f(Field field) {
        if (field == null) {
            return null;
        }
        y51 y51Var = (y51) field.getAnnotation(y51.class);
        return y51Var != null ? y51Var.value() : field.getName();
    }

    public static Object g(Object obj, String str) throws UtilException {
        if (obj == null || tt3.F(str)) {
            return null;
        }
        return h(obj, e(obj instanceof Class ? (Class) obj : obj.getClass(), str));
    }

    public static Object h(Object obj, Field field) throws UtilException {
        if (field == null) {
            return null;
        }
        if (obj instanceof Class) {
            obj = null;
        }
        v(field);
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new UtilException(e, "IllegalAccess for {}.{}", field.getDeclaringClass(), field.getName());
        }
    }

    public static Field[] i(Class<?> cls) throws SecurityException {
        SimpleCache<Class<?>, Field[]> simpleCache = f4025b;
        Field[] fieldArr = simpleCache.get(cls);
        return fieldArr != null ? fieldArr : simpleCache.put(cls, j(cls, true));
    }

    public static Field[] j(Class<?> cls, boolean z) throws SecurityException {
        qk1.t(cls);
        Field[] fieldArr = null;
        while (cls != null) {
            Field[] declaredFields = cls.getDeclaredFields();
            fieldArr = fieldArr == null ? declaredFields : (Field[]) qj1.m(fieldArr, declaredFields);
            cls = z ? cls.getSuperclass() : null;
        }
        return fieldArr;
    }

    public static Method k(Class<?> cls, String str, Class<?>... clsArr) throws SecurityException {
        return l(cls, false, str, clsArr);
    }

    public static Method l(Class<?> cls, boolean z, String str, Class<?>... clsArr) throws SecurityException {
        if (cls != null && !tt3.F(str)) {
            Method[] methodArrN = n(cls);
            if (qj1.E(methodArrN)) {
                for (Method method : methodArrN) {
                    if (tt3.v(str, method.getName(), z) && i04.q(method.getParameterTypes(), clsArr)) {
                        return method;
                    }
                }
            }
        }
        return null;
    }

    public static Method m(Object obj, String str, Object... objArr) throws SecurityException {
        if (obj == null || tt3.F(str)) {
            return null;
        }
        return k(obj.getClass(), str, i04.h(objArr));
    }

    public static Method[] n(Class<?> cls) throws SecurityException {
        SimpleCache<Class<?>, Method[]> simpleCache = c;
        Method[] methodArr = simpleCache.get(cls);
        return methodArr != null ? methodArr : simpleCache.put(cls, o(cls, true));
    }

    public static Method[] o(Class<?> cls, boolean z) throws SecurityException {
        qk1.t(cls);
        Method[] methodArr = null;
        while (cls != null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            methodArr = methodArr == null ? declaredMethods : (Method[]) qj1.m(methodArr, declaredMethods);
            cls = z ? cls.getSuperclass() : null;
        }
        return methodArr;
    }

    public static <T> T p(Object obj, String str, Object... objArr) throws UtilException {
        Method methodM = m(obj, str, objArr);
        if (methodM != null) {
            return (T) q(obj, methodM, objArr);
        }
        throw new UtilException(tt3.y("No such method: [{}]", str));
    }

    public static <T> T q(Object obj, Method method, Object... objArr) throws UtilException {
        Object obj2;
        v(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Object[] objArr2 = new Object[length];
        if (objArr != null) {
            for (int i = 0; i < length; i++) {
                if (i >= objArr.length || (obj2 = objArr[i]) == null) {
                    objArr2[i] = i04.j(parameterTypes[i]);
                } else if (obj2 instanceof c2h) {
                    objArr2[i] = null;
                } else if (parameterTypes[i].isAssignableFrom(obj2.getClass())) {
                    objArr2[i] = objArr[i];
                } else {
                    Object objA = yj4.a(parameterTypes[i], objArr[i]);
                    if (objA != null) {
                        objArr2[i] = objA;
                    }
                }
            }
        }
        try {
            if (i04.v(method)) {
                obj = null;
            }
            return (T) method.invoke(obj, objArr2);
        } catch (Exception e) {
            throw new UtilException(e);
        }
    }

    public static <T> T r(Method method, Object... objArr) throws UtilException {
        return (T) q(null, method, objArr);
    }

    public static /* synthetic */ boolean s(String str, Field field) {
        return str.equals(f(field));
    }

    public static <T> T t(Class<T> cls, Object... objArr) throws UtilException {
        if (qj1.D(objArr)) {
            try {
                return (T) b(cls, new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                throw new UtilException(e, "Instance class [{}] error!", cls);
            }
        }
        Class<?>[] clsArrH = i04.h(objArr);
        Constructor constructorB = b(cls, clsArrH);
        if (constructorB == null) {
            throw new UtilException("No Constructor matched for parameter types: [{}]", clsArrH);
        }
        try {
            return (T) constructorB.newInstance(objArr);
        } catch (Exception e2) {
            throw new UtilException(e2, "Instance class [{}] error!", cls);
        }
    }

    public static <T> T u(Class<T> cls) {
        qk1.t(cls);
        if (cls.isAssignableFrom(AbstractMap.class)) {
            cls = (Class<T>) HashMap.class;
        } else if (cls.isAssignableFrom(List.class)) {
            cls = (Class<T>) ArrayList.class;
        } else if (cls.isAssignableFrom(Set.class)) {
            cls = (Class<T>) HashSet.class;
        }
        try {
            return (T) t(cls, new Object[0]);
        } catch (Exception unused) {
            Constructor[] constructorArrC = c(cls);
            int length = constructorArrC.length;
            for (int i = 0; i < length; i++) {
                Constructor constructor = constructorArrC[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length != 0) {
                    v(constructor);
                    try {
                        return (T) constructor.newInstance(i04.k(parameterTypes));
                    } catch (Exception unused2) {
                        continue;
                    }
                }
            }
            return null;
        }
    }

    public static <T extends AccessibleObject> T v(T t) {
        if (t != null && !t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static void w(Object obj, String str, Object obj2) throws UtilException {
        qk1.t(obj);
        qk1.o(str);
        Field fieldE = e(obj instanceof Class ? (Class) obj : obj.getClass(), str);
        qk1.u(fieldE, "Field [{}] is not exist in [{}]", str, obj.getClass().getName());
        x(obj, fieldE, obj2);
    }

    public static void x(Object obj, Field field, Object obj2) throws UtilException {
        Object objA;
        qk1.u(field, "Field in [{}] not exist !", obj);
        Class<?> type = field.getType();
        if (obj2 == null) {
            obj2 = i04.j(type);
        } else if (!type.isAssignableFrom(obj2.getClass()) && (objA = yj4.a(type, obj2)) != null) {
            obj2 = objA;
        }
        v(field);
        try {
            field.set(obj instanceof Class ? null : obj, obj2);
        } catch (IllegalAccessException e) {
            throw new UtilException(e, "IllegalAccess for {}.{}", obj, field.getName());
        }
    }
}
