package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import defpackage.fh2;
import defpackage.x10;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleAbstractTypeResolver extends x10 implements Serializable {
    private static final long serialVersionUID = 8635483102371490919L;
    protected final HashMap<ClassKey, Class<?>> _mappings = new HashMap<>();

    public <T> SimpleAbstractTypeResolver addMapping(Class<T> cls, Class<? extends T> cls2) {
        if (cls == cls2) {
            throw new IllegalArgumentException("Cannot add mapping from class to itself");
        }
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Cannot add mapping from class " + cls.getName() + " to " + cls2.getName() + ", as latter is not a subtype of former");
        }
        if (Modifier.isAbstract(cls.getModifiers())) {
            this._mappings.put(new ClassKey(cls), cls2);
            return this;
        }
        throw new IllegalArgumentException("Cannot add mapping from class " + cls.getName() + " since it is not abstract");
    }

    @Override // defpackage.x10
    public JavaType findTypeMapping(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._mappings.get(new ClassKey(javaType.getRawClass()));
        if (cls == null) {
            return null;
        }
        return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, cls);
    }

    @Override // defpackage.x10
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, fh2 fh2Var) {
        return null;
    }

    @Override // defpackage.x10
    @Deprecated
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        return null;
    }
}
