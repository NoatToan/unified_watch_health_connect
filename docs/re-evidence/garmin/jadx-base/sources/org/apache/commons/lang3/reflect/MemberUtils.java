package org.apache.commons.lang3.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.ClassUtils;

/* JADX INFO: loaded from: classes3.dex */
abstract class MemberUtils {
    private static final int ACCESS_TEST = 7;
    private static final Class<?>[] ORDERED_PRIMITIVE_TYPES = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    public static int compareConstructorFit(Constructor<?> constructor, Constructor<?> constructor2, Class<?>[] clsArr) {
        return compareParameterTypes(Executable.of(constructor), Executable.of(constructor2), clsArr);
    }

    public static int compareMethodFit(Method method, Method method2, Class<?>[] clsArr) {
        return compareParameterTypes(Executable.of(method), Executable.of(method2), clsArr);
    }

    private static int compareParameterTypes(Executable executable, Executable executable2, Class<?>[] clsArr) {
        return Float.compare(getTotalTransformationCost(clsArr, executable), getTotalTransformationCost(clsArr, executable2));
    }

    private static float getObjectTransformationCost(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return getPrimitivePromotionCost(cls, cls2);
        }
        float f14 = 0.0f;
        while (cls != null && !cls2.equals(cls)) {
            if (cls2.isInterface() && ClassUtils.isAssignable(cls, cls2)) {
                f14 += 0.25f;
                break;
            }
            f14 += 1.0f;
            cls = cls.getSuperclass();
        }
        return cls == null ? f14 + 1.5f : f14;
    }

    private static float getPrimitivePromotionCost(Class<?> cls, Class<?> cls2) {
        float f14;
        if (cls == null) {
            return 1.5f;
        }
        if (cls.isPrimitive()) {
            f14 = 0.0f;
        } else {
            cls = ClassUtils.wrapperToPrimitive(cls);
            f14 = 0.1f;
        }
        int i14 = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = ORDERED_PRIMITIVE_TYPES;
            if (i14 >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i14]) {
                f14 += 0.1f;
                if (i14 < clsArr.length - 1) {
                    cls = clsArr[i14 + 1];
                }
            }
            i14++;
        }
        return f14;
    }

    private static float getTotalTransformationCost(Class<?>[] clsArr, Executable executable) {
        float objectTransformationCost;
        Class<?>[] parameterTypes = executable.getParameterTypes();
        boolean zIsVarArgs = executable.isVarArgs();
        int length = parameterTypes.length;
        if (zIsVarArgs) {
            length--;
        }
        long j8 = length;
        if (clsArr.length < j8) {
            return Float.MAX_VALUE;
        }
        boolean z14 = false;
        float objectTransformationCost2 = 0.0f;
        for (int i14 = 0; i14 < j8; i14++) {
            objectTransformationCost2 += getObjectTransformationCost(clsArr[i14], parameterTypes[i14]);
        }
        if (zIsVarArgs) {
            boolean z15 = clsArr.length < parameterTypes.length;
            if (clsArr.length == parameterTypes.length && clsArr[clsArr.length - 1] != null && clsArr[clsArr.length - 1].isArray()) {
                z14 = true;
            }
            Class<?> componentType = parameterTypes[parameterTypes.length - 1].getComponentType();
            if (z15) {
                objectTransformationCost = getObjectTransformationCost(componentType, Object.class);
            } else if (z14) {
                objectTransformationCost = getObjectTransformationCost(clsArr[clsArr.length - 1].getComponentType(), componentType);
            } else {
                for (int length2 = parameterTypes.length - 1; length2 < clsArr.length; length2++) {
                    objectTransformationCost2 += getObjectTransformationCost(clsArr[length2], componentType) + 0.001f;
                }
            }
            return objectTransformationCost + 0.001f + objectTransformationCost2;
        }
        return objectTransformationCost2;
    }

    public static boolean isAccessible(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) ? false : true;
    }

    public static boolean isMatchingConstructor(Constructor<?> constructor, Class<?>[] clsArr) {
        return isMatchingExecutable(Executable.of(constructor), clsArr);
    }

    private static boolean isMatchingExecutable(Executable executable, Class<?>[] clsArr) {
        Class<?>[] parameterTypes = executable.getParameterTypes();
        if (ClassUtils.isAssignable(clsArr, parameterTypes, true)) {
            return true;
        }
        if (!executable.isVarArgs()) {
            return false;
        }
        int i14 = 0;
        while (i14 < parameterTypes.length - 1 && i14 < clsArr.length) {
            if (!ClassUtils.isAssignable(clsArr[i14], parameterTypes[i14], true)) {
                return false;
            }
            i14++;
        }
        Class<?> componentType = parameterTypes[parameterTypes.length - 1].getComponentType();
        while (i14 < clsArr.length) {
            if (!ClassUtils.isAssignable(clsArr[i14], componentType, true)) {
                return false;
            }
            i14++;
        }
        return true;
    }

    public static boolean isMatchingMethod(Method method, Class<?>[] clsArr) {
        return isMatchingExecutable(Executable.of(method), clsArr);
    }

    public static boolean isPackageAccess(int i14) {
        return (i14 & 7) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean setAccessibleWorkaround(AccessibleObject accessibleObject) {
        if (accessibleObject != 0 && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && isPackageAccess(member.getDeclaringClass().getModifiers())) {
                try {
                    accessibleObject.setAccessible(true);
                    return true;
                } catch (SecurityException unused) {
                }
            }
        }
        return false;
    }

    public static final class Executable {
        private final boolean isVarArgs;
        private final Class<?>[] parameterTypes;

        private Executable(Method method) {
            this.parameterTypes = method.getParameterTypes();
            this.isVarArgs = method.isVarArgs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Executable of(Method method) {
            return new Executable(method);
        }

        public Class<?>[] getParameterTypes() {
            return this.parameterTypes;
        }

        public boolean isVarArgs() {
            return this.isVarArgs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Executable of(Constructor<?> constructor) {
            return new Executable(constructor);
        }

        private Executable(Constructor<?> constructor) {
            this.parameterTypes = constructor.getParameterTypes();
            this.isVarArgs = constructor.isVarArgs();
        }
    }
}
