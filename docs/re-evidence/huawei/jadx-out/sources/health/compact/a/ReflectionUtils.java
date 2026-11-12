package health.compact.a;

import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectionUtils {
    private ReflectionUtils() {
    }

    public static Class<?> b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            LogUtil.e("HAF_ReflectionUtils", "getClass ex=", LogUtil.c(e));
            return null;
        }
    }

    public static Class<?> c(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, true, classLoader);
        } catch (ClassNotFoundException e) {
            LogUtil.e("HAF_ReflectionUtils", "getClass ex=", LogUtil.c(e));
            return null;
        }
    }

    public static Object c(Object obj, String str) {
        try {
            return e(obj, str).get(obj);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            LogUtil.e("HAF_ReflectionUtils", "getFieldValue ex=", LogUtil.c(e));
            return null;
        }
    }

    public static boolean c(Object obj, String str, Object obj2) {
        try {
            e(obj, str).set(obj, obj2);
            return true;
        } catch (IllegalAccessException | NoSuchFieldException e) {
            LogUtil.e("HAF_ReflectionUtils", "setFieldValue ex=", LogUtil.c(e));
            return false;
        }
    }

    public static Object b(Class<?> cls, String str) {
        try {
            return c(cls, str).get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            LogUtil.e("HAF_ReflectionUtils", "getStaticFieldValue ex=", LogUtil.c(e));
            return null;
        }
    }

    public static boolean a(Class<?> cls, String str, Object obj) {
        try {
            c(cls, str).set(null, obj);
            return true;
        } catch (IllegalAccessException | NoSuchFieldException e) {
            LogUtil.e("HAF_ReflectionUtils", "setStaticFieldValue ex=", LogUtil.c(e));
            return false;
        }
    }

    public static Object e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException e) {
            LogUtil.e("HAF_ReflectionUtils", "invokeMethod ex=", LogUtil.c(e));
            return null;
        }
    }

    public static Object d(Object obj, String str) {
        try {
            return e(d(obj, str, null), obj, (Object[]) null);
        } catch (NoSuchMethodException e) {
            LogUtil.e("HAF_ReflectionUtils", "invokeMethod ex=", LogUtil.c(e));
            return null;
        }
    }

    public static Object e(Class<?> cls, String str) {
        try {
            Method methodE = e(cls, str, (Class<?>[]) null);
            return e(methodE, (Object) null, (Object[]) null);
        } catch (NoSuchMethodException e) {
            LogUtil.e("HAF_ReflectionUtils", "invokeStaticMethod ex=", LogUtil.c(e));
            return null;
        }
    }

    public static Object b(Constructor<?> constructor, Object... objArr) {
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            LogUtil.e("HAF_ReflectionUtils", "newInstance ex=", LogUtil.c(e));
            return null;
        }
    }

    public static Object a(String str) {
        Class<?> clsB = b(str);
        if (clsB != null) {
            return b(clsB);
        }
        return null;
    }

    public static Object d(String str, ClassLoader classLoader) {
        Class<?> clsC = c(str, classLoader);
        if (clsC != null) {
            return b(clsC);
        }
        return null;
    }

    public static Object b(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            LogUtil.e("HAF_ReflectionUtils", "newInstance ex=", LogUtil.c(e));
            return null;
        }
    }

    public static Class<?> e(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public static Class<?> e(String str, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public static Field e(Object obj, String str) throws NoSuchFieldException {
        return c(obj.getClass(), str);
    }

    public static Field c(Class<?> cls, String str) throws NoSuchFieldException {
        Field fieldD = d(cls, str);
        if (!fieldD.isAccessible()) {
            fieldD.setAccessible(true);
        }
        return fieldD;
    }

    public static Field a(Class<?> cls, String str) {
        Field fieldD;
        try {
            fieldD = d(cls, str);
            try {
                if (!fieldD.isAccessible()) {
                    fieldD.setAccessible(true);
                }
                return fieldD;
            } catch (NoSuchFieldException e) {
                e = e;
                LogUtil.d("HAF_ReflectionUtils", "findField ex=", LogUtil.c(e));
                return fieldD;
            }
        } catch (NoSuchFieldException e2) {
            e = e2;
            fieldD = null;
        }
    }

    private static Field d(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            return cls.getField(str);
        } catch (NoSuchFieldException unused) {
            for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredField(str);
                } catch (NoSuchFieldException unused2) {
                }
            }
            throw new NoSuchFieldException(b("Field", str, cls, null));
        }
    }

    public static Method d(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        return e(obj.getClass(), str, clsArr);
    }

    public static Method e(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodC = c(cls, str, clsArr);
        if (!methodC.isAccessible()) {
            methodC.setAccessible(true);
        }
        return methodC;
    }

    public static Method b(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return e(cls, str, clsArr);
        } catch (NoSuchMethodException e) {
            LogUtil.d("HAF_ReflectionUtils", "findMethod ex=", LogUtil.c(e));
            return null;
        }
    }

    private static Method c(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                }
            }
            throw new NoSuchMethodException(b("Method", str, cls, clsArr));
        }
    }

    public static Constructor<?> e(Class<?> cls, Class<?>... clsArr) throws NoSuchMethodException {
        Constructor<?> constructorC = c(cls, clsArr);
        if (!constructorC.isAccessible()) {
            constructorC.setAccessible(true);
        }
        return constructorC;
    }

    private static Constructor<?> c(Class<?> cls, Class<?>... clsArr) throws NoSuchMethodException {
        try {
            return cls.getConstructor(clsArr);
        } catch (NoSuchMethodException unused) {
            for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredConstructor(clsArr);
                } catch (NoSuchMethodException unused2) {
                }
            }
            throw new NoSuchMethodException(b("Constructor", "", cls, clsArr));
        }
    }

    private static String b(String str, String str2, Class<?> cls, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(' ');
            sb.append(str2);
        }
        if (clsArr != null) {
            sb.append(" with parameters ");
            sb.append(Arrays.asList(clsArr));
        }
        sb.append(" not found in ");
        sb.append(cls);
        return sb.toString();
    }

    public static void c(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (CollectionUtils.d(objArr)) {
            return;
        }
        Field fieldE = e(obj, str);
        Object obj2 = fieldE.get(obj);
        if (!(obj2 instanceof Object[])) {
            LogUtil.e("HAF_ReflectionUtils", "expandFieldArray object is not array: ", obj2);
            return;
        }
        Object[] objArr2 = (Object[]) obj2;
        Object objNewInstance = Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        if (objNewInstance instanceof Object[]) {
            Object[] objArr3 = (Object[]) objNewInstance;
            System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
            System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
            fieldE.set(obj, objArr3);
        }
    }

    public static void b(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (CollectionUtils.d(objArr)) {
            return;
        }
        Field fieldE = e(obj, str);
        Object obj2 = fieldE.get(obj);
        if (!(obj2 instanceof Object[])) {
            LogUtil.e("HAF_ReflectionUtils", "reduceFieldArray object is not array: ", obj2);
            return;
        }
        Object[] objArr2 = (Object[]) obj2;
        int length = objArr2.length - objArr.length;
        if (length < 0) {
            LogUtil.e("HAF_ReflectionUtils", "reduceFieldArray target length error: ", Integer.valueOf(length));
            return;
        }
        Object objNewInstance = Array.newInstance(objArr2.getClass().getComponentType(), length);
        if (objNewInstance instanceof Object[]) {
            Object[] objArr3 = (Object[]) objNewInstance;
            List listAsList = Arrays.asList(objArr);
            int i = 0;
            for (Object obj3 : objArr2) {
                if (!listAsList.contains(obj3)) {
                    if (i == objArr3.length) {
                        throw new IllegalArgumentException("extraElements exist data error.");
                    }
                    objArr3[i] = obj3;
                    i++;
                }
            }
            if (i != objArr3.length) {
                throw new IllegalArgumentException("extraElements exist data duplicate.");
            }
            fieldE.set(obj, objArr3);
        }
    }
}
