package org.apache.commons.lang3.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.ClassUtils;

/* JADX INFO: loaded from: classes23.dex */
abstract class a {
    private static final int a = 7;
    private static final Class<?>[] b = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    public static int a(Constructor<?> constructor, Constructor<?> constructor2, Class<?>[] clsArr) {
        return c(C1198a.e(constructor), C1198a.e(constructor2), clsArr);
    }

    public static int b(Method method, Method method2, Class<?>[] clsArr) {
        return c(C1198a.f(method), C1198a.f(method2), clsArr);
    }

    private static int c(C1198a c1198a, C1198a c1198a2, Class<?>[] clsArr) {
        float f = f(clsArr, c1198a);
        float f2 = f(clsArr, c1198a2);
        if (f < f2) {
            return -1;
        }
        return f2 < f ? 1 : 0;
    }

    private static float d(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return e(cls, cls2);
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

    private static float e(Class<?> cls, Class<?> cls2) {
        float f;
        if (cls.isPrimitive()) {
            f = 0.0f;
        } else {
            cls = ClassUtils.wrapperToPrimitive(cls);
            f = 0.1f;
        }
        int i = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = b;
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

    private static float f(Class<?>[] clsArr, C1198a c1198a) {
        float fD;
        Class<?>[] clsArrC = c1198a.c();
        boolean zD = c1198a.d();
        int length = clsArrC.length;
        if (zD) {
            length--;
        }
        long j = length;
        if (clsArr.length < j) {
            return Float.MAX_VALUE;
        }
        boolean z = false;
        float fD2 = 0.0f;
        for (int i = 0; i < j; i++) {
            fD2 += d(clsArr[i], clsArrC[i]);
        }
        if (!zD) {
            return fD2;
        }
        boolean z2 = clsArr.length < clsArrC.length;
        if (clsArr.length == clsArrC.length && clsArr[clsArr.length - 1].isArray()) {
            z = true;
        }
        Class<?> componentType = clsArrC[clsArrC.length - 1].getComponentType();
        if (z2) {
            fD = d(componentType, Object.class);
        } else {
            if (!z) {
                for (int length2 = clsArrC.length - 1; length2 < clsArr.length; length2++) {
                    fD2 += d(clsArr[length2], componentType) + 0.001f;
                }
                return fD2;
            }
            fD = d(clsArr[clsArr.length - 1].getComponentType(), componentType);
        }
        return fD2 + fD + 0.001f;
    }

    public static boolean g(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) ? false : true;
    }

    public static boolean h(Constructor<?> constructor, Class<?>[] clsArr) {
        return i(C1198a.e(constructor), clsArr);
    }

    private static boolean i(C1198a c1198a, Class<?>[] clsArr) {
        Class<?>[] clsArrC = c1198a.c();
        if (!c1198a.d()) {
            return ClassUtils.isAssignable(clsArr, clsArrC, true);
        }
        int i = 0;
        while (i < clsArrC.length - 1 && i < clsArr.length) {
            if (!ClassUtils.isAssignable(clsArr[i], clsArrC[i], true)) {
                return false;
            }
            i++;
        }
        Class<?> componentType = clsArrC[clsArrC.length - 1].getComponentType();
        while (i < clsArr.length) {
            if (!ClassUtils.isAssignable(clsArr[i], componentType, true)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean j(Method method, Class<?>[] clsArr) {
        return i(C1198a.f(method), clsArr);
    }

    public static boolean k(int i) {
        return (i & 7) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean l(AccessibleObject accessibleObject) {
        if (accessibleObject != 0 && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && k(member.getDeclaringClass().getModifiers())) {
                try {
                    accessibleObject.setAccessible(true);
                    return true;
                } catch (SecurityException unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: org.apache.commons.lang3.reflect.a$a, reason: collision with other inner class name */
    public static final class C1198a {
        private final Class<?>[] a;
        private final boolean b;

        private C1198a(Method method) {
            this.a = method.getParameterTypes();
            this.b = method.isVarArgs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C1198a e(Constructor<?> constructor) {
            return new C1198a(constructor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C1198a f(Method method) {
            return new C1198a(method);
        }

        public Class<?>[] c() {
            return this.a;
        }

        public boolean d() {
            return this.b;
        }

        private C1198a(Constructor<?> constructor) {
            this.a = constructor.getParameterTypes();
            this.b = constructor.isVarArgs();
        }
    }
}
