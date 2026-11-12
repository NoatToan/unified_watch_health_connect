package com.miui.tsmclient.util;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class ReflectUtil {
    private ReflectUtil() {
    }

    public static Object callMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        try {
            Class<?> classFromName = getClassFromName(str);
            if (classFromName == null) {
                return null;
            }
            Constructor<?>[] declaredConstructors = classFromName.getDeclaredConstructors();
            AccessibleObject.setAccessible(declaredConstructors, true);
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor.isAccessible()) {
                    return classFromName.getMethod(str2, clsArr).invoke(constructor.newInstance(new Object[0]), objArr);
                }
            }
            return null;
        } catch (Exception e) {
            LogUtils.e("callMethod failed", e);
            return null;
        }
    }

    public static Object callObjectMethod(Object obj, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, objArr);
    }

    public static Class<?> getClassFromName(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            LogUtils.w("ClassNotFoundException className:" + str);
            return null;
        }
    }

    public static Field getDeclaredField(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
        }
        LogUtils.e(String.format("getDeclaredField(target: %s, fieldName: %s) failed", obj, str));
        return null;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        try {
            method = cls.getMethod(str, clsArr);
            try {
                method.setAccessible(true);
            } catch (Exception e) {
                e = e;
                LogUtils.e("getMethod: " + str, e);
            }
        } catch (Exception e2) {
            e = e2;
            method = null;
        }
        return method;
    }

    public static Object invoke(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            LogUtils.e("invoke error", e);
            return null;
        }
    }

    public static Object newInstance(String str, Class<?>[] clsArr, Object... objArr) {
        Class<?> classFromName = getClassFromName(str);
        if (classFromName != null) {
            return newInstance(classFromName, clsArr, objArr);
        }
        return null;
    }

    public static boolean setField(Object obj, String str, Object obj2) {
        try {
            Field declaredField = getDeclaredField(obj, str);
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
            return true;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            LogUtils.e("setField failed", e);
            return false;
        }
    }

    public static Object newInstance(Class<?> cls, Class<?>[] clsArr, Object... objArr) {
        try {
            return cls.getConstructor(clsArr).newInstance(objArr);
        } catch (Exception e) {
            LogUtils.e("newInstance failed", e);
            return null;
        }
    }

    public static Object newInstance(String str) {
        try {
            return getClassFromName(str).newInstance();
        } catch (Exception e) {
            LogUtils.e("newInstance failed", e);
            return null;
        }
    }
}
