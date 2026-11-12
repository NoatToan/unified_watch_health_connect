package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import defpackage.ym;
import defpackage.yt;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SerializerFactory {
    @Deprecated
    public abstract JsonSerializer<Object> createKeySerializer(yt ytVar, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws ym;

    public abstract JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws ym;

    public abstract TypeSerializer createTypeSerializer(yt ytVar, JavaType javaType) throws ym;

    public abstract SerializerFactory withAdditionalKeySerializers(Serializers serializers);

    public abstract SerializerFactory withAdditionalSerializers(Serializers serializers);

    public abstract SerializerFactory withSerializerModifier(BeanSerializerModifier beanSerializerModifier);

    public JsonSerializer<Object> createKeySerializer(SerializerProvider serializerProvider, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws ym {
        return createKeySerializer(serializerProvider.getConfig(), javaType, jsonSerializer);
    }
}
