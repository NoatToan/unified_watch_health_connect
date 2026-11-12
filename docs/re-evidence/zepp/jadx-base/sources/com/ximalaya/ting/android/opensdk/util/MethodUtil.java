package com.ximalaya.ting.android.opensdk.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes22.dex */
public class MethodUtil {
    public static Object invokeMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?>[] clsArrNullToEmpty = BaseUtil.nullToEmpty(clsArr);
        Object[] objArrNullToEmpty = BaseUtil.nullToEmpty(objArr);
        Method method = obj.getClass().getMethod(str, clsArrNullToEmpty);
        if (method != null) {
            return method.invoke(obj, objArrNullToEmpty);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    public static Object invokeStaticMethod(Class cls, String str, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (cls == null) {
            return null;
        }
        Class<?>[] clsArrNullToEmpty = BaseUtil.nullToEmpty(clsArr);
        Object[] objArrNullToEmpty = BaseUtil.nullToEmpty(objArr);
        Method method = cls.getMethod(str, clsArrNullToEmpty);
        if (method != null) {
            return method.invoke(null, objArrNullToEmpty);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + cls.getName());
    }
}
