package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import com.huawei.wisesecurity.kfs.validation.core.ValidatorDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class yqc<A extends Annotation> implements ValidatorDescriptor<A> {
    private final Map<Type, Class<? extends KfsConstraintValidator<A, ?>>> e = new ConcurrentHashMap();
    private final Map<Type, Class<? extends KfsConstraintValidator<A, ?>>> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Class<?>> f53753b = new ConcurrentHashMap<Class<?>, Class<?>>() { // from class: yqc.2
        {
            put(Byte.TYPE, Byte.class);
            put(Short.TYPE, Short.class);
            put(Integer.TYPE, Integer.class);
            put(Long.TYPE, Long.class);
            put(Float.TYPE, Float.class);
            put(Double.TYPE, Double.class);
            put(Character.TYPE, Character.class);
            put(Boolean.TYPE, Boolean.class);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Class<?>> f53754c = new ConcurrentHashMap<Class<?>, Class<?>>() { // from class: yqc.4
        {
            put(Byte.TYPE, byte[].class);
            put(Short.TYPE, short[].class);
            put(Integer.TYPE, int[].class);
            put(Long.TYPE, long[].class);
            put(Float.TYPE, float[].class);
            put(Double.TYPE, double[].class);
            put(Character.TYPE, char[].class);
            put(Boolean.TYPE, boolean[].class);
        }
    };

    @SafeVarargs
    public yqc(Class<? extends KfsConstraintValidator<A, ?>>... clsArr) {
        for (Class<? extends KfsConstraintValidator<A, ?>> cls : clsArr) {
            c(cls);
        }
    }

    private void c(Class<? extends KfsConstraintValidator<A, ?>> cls) {
        Type typeC = ypy.c(cls);
        if (typeC instanceof Class) {
            Class cls2 = (Class) typeC;
            if (cls2.isArray()) {
                this.d.put(cls2.getComponentType(), cls);
            }
            this.e.put(typeC, cls);
            return;
        }
        if (typeC instanceof GenericArrayType) {
            Class cls3 = (Class) ((GenericArrayType) typeC).getGenericComponentType();
            if (this.f53754c.containsKey(cls3)) {
                this.e.put(this.f53754c.get(cls3), cls);
            }
        }
    }

    private Class<? extends KfsConstraintValidator<A, ?>> e(Map<Type, Class<? extends KfsConstraintValidator<A, ?>>> map, Class<?> cls) {
        if (map.containsKey(cls)) {
            return map.get(cls);
        }
        Class<? extends KfsConstraintValidator<A, ?>> clsE = e(map, cls.getGenericSuperclass());
        if (clsE != null) {
            return clsE;
        }
        for (Type type : cls.getGenericInterfaces()) {
            Class<? extends KfsConstraintValidator<A, ?>> clsE2 = e(map, type);
            if (clsE2 != null) {
                return clsE2;
            }
        }
        return null;
    }

    private Class<? extends KfsConstraintValidator<A, ?>> e(Map<Type, Class<? extends KfsConstraintValidator<A, ?>>> map, Type type) {
        Class<? extends KfsConstraintValidator<A, ?>> clsE;
        if (type == null) {
            return null;
        }
        if ((type instanceof Class) && (clsE = e((Map) map, (Class<?>) type)) != null) {
            return clsE;
        }
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getRawType() instanceof Class) {
            return e((Map) map, (Class<?>) parameterizedType.getRawType());
        }
        return null;
    }

    private Class<?> a(Class<?> cls) {
        return this.f53753b.containsKey(cls) ? this.f53753b.get(cls) : cls;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.core.ValidatorDescriptor
    public Class<? extends KfsConstraintValidator<A, ?>> getValidator(Class<?> cls) {
        Class<? extends KfsConstraintValidator<A, ?>> clsE;
        if (cls == null) {
            return null;
        }
        Class<?> clsA = a(cls);
        if (this.e.containsKey(Object.class)) {
            return this.e.get(Object.class);
        }
        if (this.e.containsKey(clsA)) {
            return this.e.get(clsA);
        }
        if (clsA.isArray()) {
            clsE = e((Map) this.d, (Type) clsA.getComponentType());
        } else {
            clsE = e((Map) this.e, (Type) clsA);
        }
        if (clsE != null) {
            this.e.put(clsA, clsE);
        }
        return clsE;
    }
}
