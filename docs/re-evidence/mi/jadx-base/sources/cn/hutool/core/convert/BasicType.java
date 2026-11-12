package cn.hutool.core.convert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public enum BasicType {
    BYTE,
    SHORT,
    INT,
    INTEGER,
    LONG,
    DOUBLE,
    FLOAT,
    BOOLEAN,
    CHAR,
    CHARACTER,
    STRING;

    public static final Map<Class<?>, Class<?>> PRIMITIVE_WRAPPER_MAP;
    public static final Map<Class<?>, Class<?>> WRAPPER_PRIMITIVE_MAP;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        WRAPPER_PRIMITIVE_MAP = concurrentHashMap;
        PRIMITIVE_WRAPPER_MAP = new ConcurrentHashMap(8);
        concurrentHashMap.put(Boolean.class, Boolean.TYPE);
        concurrentHashMap.put(Byte.class, Byte.TYPE);
        concurrentHashMap.put(Character.class, Character.TYPE);
        concurrentHashMap.put(Double.class, Double.TYPE);
        concurrentHashMap.put(Float.class, Float.TYPE);
        concurrentHashMap.put(Integer.class, Integer.TYPE);
        concurrentHashMap.put(Long.class, Long.TYPE);
        concurrentHashMap.put(Short.class, Short.TYPE);
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            PRIMITIVE_WRAPPER_MAP.put((Class<?>) entry.getValue(), (Class<?>) entry.getKey());
        }
    }

    public static Class<?> unWrap(Class<?> cls) {
        Class<?> cls2;
        return (cls == null || cls.isPrimitive() || (cls2 = WRAPPER_PRIMITIVE_MAP.get(cls)) == null) ? cls : cls2;
    }

    public static Class<?> wrap(Class<?> cls) {
        Class<?> cls2;
        return (cls == null || !cls.isPrimitive() || (cls2 = PRIMITIVE_WRAPPER_MAP.get(cls)) == null) ? cls : cls2;
    }
}
