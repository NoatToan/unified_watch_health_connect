package com.xiaomi.mi_connect_service.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class ReflectUtil {
    private static final String TAG = "ReflectUtil";

    public static class ReflAgent {
        private Class mClass;
        private Object mObject;
        private Object mResult;

        private ReflAgent() {
        }

        public static ReflAgent getClass(String str) {
            ReflAgent reflAgent = new ReflAgent();
            try {
                reflAgent.mClass = Class.forName(str);
            } catch (ClassNotFoundException unused) {
            }
            return reflAgent;
        }

        public static ReflAgent getObject(Object obj) {
            ReflAgent reflAgent = new ReflAgent();
            if (obj != null) {
                reflAgent.mObject = obj;
                reflAgent.mClass = obj.getClass();
            }
            return reflAgent;
        }

        public boolean booleanResult() {
            Object obj = this.mResult;
            if (obj == null) {
                return false;
            }
            return Boolean.parseBoolean(obj.toString());
        }

        public ReflAgent callMethod(String str, Class<?>[] clsArr, Object... objArr) {
            Object obj = this.mObject;
            if (obj != null) {
                try {
                    this.mResult = ReflectUtil.callObjectMethod(obj, str, clsArr, objArr);
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public ReflAgent callStaticMethod(String str, Class<?>[] clsArr, Object... objArr) {
            Class cls = this.mClass;
            if (cls != null) {
                try {
                    this.mResult = ReflectUtil.callStaticObjectMethod(cls, str, clsArr, objArr);
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public ReflAgent getObjectFiled(String str) {
            Object obj = this.mObject;
            if (obj != null) {
                try {
                    this.mResult = ReflectUtil.getObjectField(obj, str);
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public ReflAgent getStaticFiled(String str) {
            Class cls = this.mClass;
            if (cls != null) {
                try {
                    this.mResult = ReflectUtil.getStaticObjectField(cls, str);
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public int intResult() {
            Object obj = this.mResult;
            if (obj == null) {
                return 0;
            }
            try {
                return Integer.parseInt(obj.toString());
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        public long longResult() {
            Object obj = this.mResult;
            if (obj == null) {
                return 0L;
            }
            try {
                return Long.parseLong(obj.toString());
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }

        public Object resultObject() {
            Object obj = this.mResult;
            if (obj == null) {
                return null;
            }
            return obj;
        }

        public ReflAgent setResultToSelf() {
            this.mObject = this.mResult;
            this.mResult = null;
            return this;
        }

        public String stringResult() {
            Object obj = this.mResult;
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }
    }

    private ReflectUtil() {
    }

    public static Object callObjectMethod(Object obj, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = obj.getClass();
        if (clsArr == null) {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, new Object[0]);
        }
        Method declaredMethod2 = cls.getDeclaredMethod(str, clsArr);
        declaredMethod2.setAccessible(true);
        return declaredMethod2.invoke(obj, objArr);
    }

    public static Object callStaticObjectMethod(Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(null, objArr);
    }

    public static Object getObjectField(Object obj, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object getObjectFieldWithGivenClassName(String str, String str2, Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        Field declaredField = Class.forName(str).getDeclaredField(str2);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object getStaticObjectField(Class<?> cls, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(str);
    }

    public static Object callObjectMethod(Class cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, objArr);
    }

    public static Object callObjectMethod(Object obj, String str, Class<?> cls, Class<?>[] clsArr, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, objArr);
    }

    public static Object callObjectMethod(Object obj, String str) {
        try {
            return callObjectMethod(obj, str, null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
