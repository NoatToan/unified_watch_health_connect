package com.huawei.hms.network.embedded;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes34.dex */
public class la<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f15065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class[] f15067c;

    public Object d(T t, Object... objArr) {
        try {
            return a(t, objArr);
        } catch (NullPointerException e) {
            if ("ssl == null".equals(e.getMessage())) {
                return null;
            }
            throw e;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object c(T t, Object... objArr) {
        try {
            return b(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object b(T t, Object... objArr) throws InvocationTargetException {
        Method methodA = a(t.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public boolean a(T t) {
        return a(t.getClass()) != null;
    }

    public Object a(T t, Object... objArr) throws InvocationTargetException {
        Method methodA = a(t.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.f15066b + " not supported for object " + t);
        }
        try {
            return methodA.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public static Method a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f15066b;
        if (str == null) {
            return null;
        }
        Method methodA = a(cls, str, this.f15067c);
        if (methodA == null || (cls2 = this.f15065a) == null || cls2.isAssignableFrom(methodA.getReturnType())) {
            return methodA;
        }
        return null;
    }

    public la(Class<?> cls, String str, Class... clsArr) {
        this.f15065a = cls;
        this.f15066b = str;
        this.f15067c = clsArr;
    }
}
