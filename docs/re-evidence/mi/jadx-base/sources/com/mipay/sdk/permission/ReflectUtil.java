package com.mipay.sdk.permission;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class ReflectUtil {
    private static final String LOG_TAG = "ReflectUtil";

    public static Object evaluateField(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Field findField(Class<?> cls, String str) {
        Field declaredField = null;
        while (cls != null) {
            try {
                try {
                    declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("no such field: ");
                sb.append(str);
                e.printStackTrace();
            }
        }
        return declaredField;
    }

    public static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method declaredMethod = null;
        while (cls != null) {
            try {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    declaredMethod.setAccessible(true);
                    break;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("no such method: ");
                sb.append(str);
                e.printStackTrace();
            }
        }
        return declaredMethod;
    }

    public static Object invokeMethod(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
