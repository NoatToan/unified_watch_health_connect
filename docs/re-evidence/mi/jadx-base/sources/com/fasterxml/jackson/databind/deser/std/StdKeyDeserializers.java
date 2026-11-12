package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import defpackage.esd;
import defpackage.fh2;
import defpackage.h04;
import defpackage.vzd;
import defpackage.wzd;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class StdKeyDeserializers implements wzd, Serializable {
    private static final long serialVersionUID = 1;

    public static vzd constructDelegatingKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, esd<?> esdVar) {
        return new StdKeyDeserializer.a(javaType.getRawClass(), esdVar);
    }

    public static vzd constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new StdKeyDeserializer.b(enumResolver, null);
    }

    public static vzd findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) {
        fh2 fh2VarIntrospect = deserializationConfig.introspect(javaType);
        Constructor<?> constructorR = fh2VarIntrospect.r(String.class);
        if (constructorR != null) {
            if (deserializationConfig.canOverrideAccessModifiers()) {
                h04.f(constructorR, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.c(constructorR);
        }
        Method methodH = fh2VarIntrospect.h(String.class);
        if (methodH == null) {
            return null;
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            h04.f(methodH, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.d(methodH);
    }

    @Override // defpackage.wzd
    public vzd findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = h04.k0(rawClass);
        }
        return StdKeyDeserializer.forType(rawClass);
    }

    public static vzd constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.b(enumResolver, annotatedMethod);
    }
}
