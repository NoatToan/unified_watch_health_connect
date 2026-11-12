package defpackage;

import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.onetrack.api.c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ebk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<String, Class<?>> f16465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?>[] f16466b;
    public static String[] c;
    public static Map<String, Method> d;
    public static Map<String, Field> e;
    public static Map<String, Constructor> f;
    public static Method g;
    public static Method h;
    public static Method i;
    public static Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Method f16467k;
    public static Method l;
    public static Method m;
    public static Method n;
    public static Method o;

    static {
        HashMap<String, Class<?>> map = new HashMap<>();
        f16465a = map;
        Class<?> cls = Byte.TYPE;
        map.put("byte", cls);
        HashMap<String, Class<?>> map2 = f16465a;
        Class<?> cls2 = Short.TYPE;
        map2.put("short", cls2);
        HashMap<String, Class<?>> map3 = f16465a;
        Class<?> cls3 = Integer.TYPE;
        map3.put("int", cls3);
        HashMap<String, Class<?>> map4 = f16465a;
        Class<?> cls4 = Long.TYPE;
        map4.put("long", cls4);
        HashMap<String, Class<?>> map5 = f16465a;
        Class<?> cls5 = Character.TYPE;
        map5.put("char", cls5);
        HashMap<String, Class<?>> map6 = f16465a;
        Class<?> cls6 = Boolean.TYPE;
        map6.put("boolean", cls6);
        HashMap<String, Class<?>> map7 = f16465a;
        Class<?> cls7 = Float.TYPE;
        map7.put("float", cls7);
        HashMap<String, Class<?>> map8 = f16465a;
        Class<?> cls8 = Double.TYPE;
        map8.put("double", cls8);
        f16465a.put("byte[]", byte[].class);
        f16465a.put("short[]", short[].class);
        f16465a.put("int[]", int[].class);
        f16465a.put("long[]", long[].class);
        f16465a.put("char[]", char[].class);
        f16465a.put("boolean[]", boolean[].class);
        f16465a.put("float[]", float[].class);
        f16465a.put("double[]", double[].class);
        f16466b = new Class[]{cls6, cls, cls5, cls2, cls3, cls4, cls7, cls8, Void.TYPE};
        c = new String[]{"Z", c.f13755a, "C", "S", "I", "J", "F", "D", "V"};
        d = new HashMap();
        e = new HashMap();
        f = new HashMap();
        g = null;
        h = null;
        i = null;
        j = null;
        f16467k = null;
        l = null;
        m = null;
        n = null;
        o = null;
    }

    public static String a(Class<?> cls, Class<?>... clsArr) {
        return cls.toString() + "/" + Arrays.toString(clsArr);
    }

    public static String b(Class<?> cls, String str) {
        return cls.toString() + "/" + str;
    }

    public static String c(Class<?> cls, String str, Class<?>[] clsArr) {
        return cls.toString() + "/" + str + "/" + Arrays.toString(clsArr);
    }

    public static Constructor d(Class<?> cls, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strA = a(cls, clsArr);
        Constructor constructor = f.get(strA);
        if (constructor != null) {
            return constructor;
        }
        Constructor constructorF = f(cls, clsArr);
        q(constructorF, true);
        f.put(strA, constructorF);
        return constructorF;
    }

    public static <T> T e(Class<?> cls, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Constructor constructorD = d(cls, clsArr);
        if (constructorD == null) {
            return null;
        }
        return (T) p(constructorD, objArr);
    }

    public static Constructor f(Object obj, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (f16467k == null) {
            f16467k = Class.class.getMethod("getDeclaredConstructor", Class[].class);
        }
        return (Constructor) f16467k.invoke(obj, clsArr);
    }

    public static Field g(Object obj, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (h == null) {
            h = Class.class.getMethod("getDeclaredField", String.class);
        }
        return (Field) h.invoke(obj, str);
    }

    public static Method h(Object obj, String str, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (i == null) {
            i = Class.class.getMethod("getDeclaredMethod", String.class, Class[].class);
        }
        return (Method) i.invoke(obj, str, clsArr);
    }

    public static Field i(Class<?> cls, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strB = b(cls, str);
        Field field = e.get(strB);
        if (field != null) {
            return field;
        }
        Field fieldG = g(cls, str);
        q(fieldG, true);
        e.put(strB, fieldG);
        return fieldG;
    }

    public static <T> T j(Class<?> cls, Object obj, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field fieldI = i(cls, str);
        if (fieldI == null) {
            return null;
        }
        return (T) k(fieldI, obj);
    }

    public static Object k(Object obj, Object obj2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (o == null) {
            o = Field.class.getMethod("get", Object.class);
        }
        return o.invoke(obj, obj2);
    }

    public static Method l(Class<?> cls, String str, Class<?>... clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strC = c(cls, str, clsArr);
        Method method = d.get(strC);
        if (method != null) {
            return method;
        }
        Method methodH = h(cls, str, clsArr);
        q(methodH, true);
        d.put(strC, methodH);
        return methodH;
    }

    public static void m(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodL = l(cls, str, clsArr);
        if (methodL != null) {
            n(methodL, obj, objArr);
        }
    }

    public static Object n(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (g == null) {
            g = Method.class.getMethod("invoke", Object.class, Object[].class);
        }
        return g.invoke(obj, objArr);
    }

    public static <T> T o(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodL = l(cls, str, clsArr);
        if (methodL != null) {
            return (T) n(methodL, obj, objArr);
        }
        return null;
    }

    public static <T> T p(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (l == null) {
            l = Constructor.class.getMethod("newInstance", Object[].class);
        }
        return (T) l.invoke(obj, objArr);
    }

    public static void q(Object obj, boolean z) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (j == null) {
            j = AccessibleObject.class.getMethod("setAccessible", Boolean.TYPE);
        }
        j.invoke(obj, Boolean.valueOf(z));
    }

    public static void r(Class<?> cls, Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field fieldI = i(cls, str);
        if (fieldI != null) {
            s(fieldI, obj, obj2);
        }
    }

    public static void s(Object obj, Object obj2, Object obj3) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (n == null) {
            n = Field.class.getMethod(CourseConfigModel.DevCmd.CMD_ACTION_SET, Object.class, Object.class);
        }
        n.invoke(obj, obj2, obj3);
    }
}
