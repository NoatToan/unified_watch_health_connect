package org.apache.commons.lang.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.SystemUtils;

/* JADX INFO: loaded from: classes23.dex */
abstract class a {
    private static final int a = 7;
    private static final Method b;
    private static final Class[] c;
    public static /* synthetic */ Class d;

    static {
        Method method;
        if (SystemUtils.isJavaVersionAtLeast(1.5f)) {
            try {
                Class clsA = d;
                if (clsA == null) {
                    clsA = a("java.lang.reflect.Member");
                    d = clsA;
                }
                method = clsA.getMethod("isSynthetic", ArrayUtils.EMPTY_CLASS_ARRAY);
            } catch (Exception unused) {
                method = null;
            }
        } else {
            method = null;
        }
        b = method;
        c = new Class[]{Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static int b(Class[] clsArr, Class[] clsArr2, Class[] clsArr3) {
        float fE = e(clsArr3, clsArr);
        float fE2 = e(clsArr3, clsArr2);
        if (fE < fE2) {
            return -1;
        }
        return fE2 < fE ? 1 : 0;
    }

    private static float c(Class cls, Class cls2) {
        if (cls2.isPrimitive()) {
            return d(cls, cls2);
        }
        float f = 0.0f;
        while (cls != null && !cls2.equals(cls)) {
            if (cls2.isInterface() && ClassUtils.isAssignable(cls, cls2)) {
                f += 0.25f;
                break;
            }
            f += 1.0f;
            cls = cls.getSuperclass();
        }
        return cls == null ? f + 1.5f : f;
    }

    private static float d(Class cls, Class cls2) {
        float f;
        if (cls.isPrimitive()) {
            f = 0.0f;
        } else {
            cls = ClassUtils.wrapperToPrimitive(cls);
            f = 0.1f;
        }
        int i = 0;
        while (cls != cls2) {
            Class[] clsArr = c;
            if (i >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i]) {
                f += 0.1f;
                if (i < clsArr.length - 1) {
                    cls = clsArr[i + 1];
                }
            }
            i++;
        }
        return f;
    }

    private static float e(Class[] clsArr, Class[] clsArr2) {
        float fC = 0.0f;
        for (int i = 0; i < clsArr.length; i++) {
            fC += c(clsArr[i], clsArr2[i]);
        }
        return fC;
    }

    public static boolean f(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || h(member)) ? false : true;
    }

    public static boolean g(int i) {
        return (i & 7) == 0;
    }

    public static boolean h(Member member) {
        Method method = b;
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(member, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(AccessibleObject accessibleObject) {
        if (accessibleObject == 0 || accessibleObject.isAccessible()) {
            return;
        }
        Member member = (Member) accessibleObject;
        if (Modifier.isPublic(member.getModifiers()) && g(member.getDeclaringClass().getModifiers())) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException unused) {
            }
        }
    }
}
