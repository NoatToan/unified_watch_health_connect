package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import defpackage.e5q;
import defpackage.eud;
import defpackage.wwl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    public ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    public abstract ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar);

    public abstract eud<?> getContentSerializer();

    public abstract JavaType getContentType();

    @Deprecated
    public boolean hasContentTypeAnnotation(wwl wwlVar, BeanProperty beanProperty) {
        return false;
    }

    public abstract boolean hasSingleElement(T t);

    /* JADX WARN: Multi-variable type inference failed */
    public ContainerSerializer<?> withValueTypeSerializer(e5q e5qVar) {
        return e5qVar == null ? this : _withValueTypeSerializer(e5qVar);
    }

    public ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    public ContainerSerializer(Class<?> cls, boolean z) {
        super(cls, z);
    }

    public ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer._handledType, false);
    }
}
