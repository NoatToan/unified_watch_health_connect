package org.junit.experimental.theories;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ParameterSignature {
    private static final Map<Class<?>, Class<?>> c = a();
    private final Class<?> a;
    private final Annotation[] b;

    private ParameterSignature(Class<?> cls, Annotation[] annotationArr) {
        this.a = cls;
        this.b = annotationArr;
    }

    private static Map<Class<?>, Class<?>> a() {
        HashMap map = new HashMap();
        d(map, Boolean.TYPE, Boolean.class);
        d(map, Byte.TYPE, Byte.class);
        d(map, Short.TYPE, Short.class);
        d(map, Character.TYPE, Character.class);
        d(map, Integer.TYPE, Integer.class);
        d(map, Long.TYPE, Long.class);
        d(map, Float.TYPE, Float.class);
        d(map, Double.TYPE, Double.class);
        return Collections.unmodifiableMap(map);
    }

    private <T extends Annotation> T b(Annotation[] annotationArr, Class<T> cls, int i) {
        if (i == 0) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
            Annotation annotationB = b(annotation.annotationType().getAnnotations(), cls, i - 1);
            if (annotationB != null) {
                return cls.cast(annotationB);
            }
        }
        return null;
    }

    private boolean c(Class<?> cls, Class<?> cls2) {
        Map<Class<?>, Class<?>> map = c;
        if (map.containsKey(cls2)) {
            return cls.isAssignableFrom(map.get(cls2));
        }
        return false;
    }

    private static <T> void d(Map<T, T> map, T t, T t2) {
        map.put(t, t2);
        map.put(t2, t);
    }

    private static ArrayList<ParameterSignature> e(Class<?>[] clsArr, Annotation[][] annotationArr) {
        ArrayList<ParameterSignature> arrayList = new ArrayList<>();
        for (int i = 0; i < clsArr.length; i++) {
            arrayList.add(new ParameterSignature(clsArr[i], annotationArr[i]));
        }
        return arrayList;
    }

    public static ArrayList<ParameterSignature> signatures(Method method) {
        return e(method.getParameterTypes(), method.getParameterAnnotations());
    }

    public boolean canAcceptType(Class<?> cls) {
        return this.a.isAssignableFrom(cls) || c(this.a, cls);
    }

    public boolean canAcceptValue(Object obj) {
        if (obj == null) {
            return !this.a.isPrimitive();
        }
        return canAcceptType(obj.getClass());
    }

    public boolean canPotentiallyAcceptType(Class<?> cls) {
        return cls.isAssignableFrom(this.a) || c(cls, this.a) || canAcceptType(cls);
    }

    public <T extends Annotation> T findDeepAnnotation(Class<T> cls) {
        return (T) b(this.b, cls, 3);
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        for (Annotation annotation : getAnnotations()) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public List<Annotation> getAnnotations() {
        return Arrays.asList(this.b);
    }

    public Class<?> getType() {
        return this.a;
    }

    public boolean hasAnnotation(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public static List<ParameterSignature> signatures(Constructor<?> constructor) {
        return e(constructor.getParameterTypes(), constructor.getParameterAnnotations());
    }
}
