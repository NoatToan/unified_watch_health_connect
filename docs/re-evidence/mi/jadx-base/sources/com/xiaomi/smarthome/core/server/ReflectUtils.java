package com.xiaomi.smarthome.core.server;

import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class ReflectUtils {
    private static final String TAG = "ReflectUtils";

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
                e.printStackTrace();
            }
        }
        return declaredMethod;
    }

    public static Object getField(String str, Object obj, String str2) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("className 不能为空");
        }
        if (str2 == null || str2.equals("")) {
            throw new IllegalArgumentException("fieldName 不能为空");
        }
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T getInstance(Class<T> cls, Object... objArr) {
        if (cls == null) {
            throw new IllegalArgumentException("className 不能为空");
        }
        try {
            if (objArr == null) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            }
            int length = objArr.length;
            Class<?>[] clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(clsArr);
            declaredConstructor2.setAccessible(true);
            return declaredConstructor2.newInstance(objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method getMethod(String str, String str2, Class... clsArr) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("className 不能为空");
        }
        if (str2 == null || str2.equals("")) {
            throw new IllegalArgumentException("methodName不能为空");
        }
        try {
            return Class.forName(str).getDeclaredMethod(str2, clsArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object invoke(String str, Object obj, String str2, Object... objArr) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("className 不能为空");
        }
        if (str2 == null || str2.equals("")) {
            throw new IllegalArgumentException("methodName不能为空");
        }
        try {
            Class<?> cls = Class.forName(str);
            if (objArr == null) {
                Method declaredMethod = cls.getDeclaredMethod(str2, new Class[0]);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, new Object[0]);
            }
            int length = objArr.length;
            Class<?>[] clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            Method declaredMethod2 = cls.getDeclaredMethod(str2, clsArr);
            declaredMethod2.setAccessible(true);
            return declaredMethod2.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object invokeMethod(Object obj, Method method, Object... objArr) {
        if (method == null) {
            throw new IllegalArgumentException("method 不能为空");
        }
        method.setAccessible(true);
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isClassExit(String str) {
        try {
            Thread.currentThread().getContextClassLoader().loadClass(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isMethodExit(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            Method[] declaredMethods = Class.forName(str).getDeclaredMethods();
            if (declaredMethods == null || declaredMethods.length <= 0) {
                return false;
            }
            for (Method method : declaredMethods) {
                if (TextUtils.equals(method.getName(), str2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setField(String str, Object obj, String str2, Object obj2) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("className 不能为空");
        }
        if (str2 == null || str2.equals("")) {
            throw new IllegalArgumentException("fieldName 不能为空");
        }
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setField(Object obj, String str, Object obj2) {
        String name = obj.getClass().getName();
        if (str != null && !str.equals("")) {
            try {
                Field declaredField = Class.forName(name).getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        throw new IllegalArgumentException("fieldName 不能为空");
    }
}
