package org.hamcrest.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes23.dex */
public class ReflectiveTypeFinder {
    private final String a;
    private final int b;
    private final int c;

    public ReflectiveTypeFinder(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean canObtainExpectedTypeFrom(Method method) {
        return method.getName().equals(this.a) && method.getParameterTypes().length == this.b && !method.isSynthetic();
    }

    public Class<?> expectedTypeFrom(Method method) {
        return method.getParameterTypes()[this.c];
    }

    public Class<?> findExpectedType(Class<?> cls) {
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (canObtainExpectedTypeFrom(method)) {
                    return expectedTypeFrom(method);
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for " + this.a + "() method.");
    }
}
