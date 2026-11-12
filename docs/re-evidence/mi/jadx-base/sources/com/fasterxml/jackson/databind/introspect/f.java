package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.fh2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    public interface a {
        a copy();

        Class<?> findMixInClassFor(Class<?> cls);
    }

    public abstract f copy();

    public abstract fh2 forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, a aVar);

    public abstract fh2 forCreation(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    public abstract fh2 forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    public abstract fh2 forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    public abstract fh2 forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, a aVar);

    public abstract fh2 forSerialization(SerializationConfig serializationConfig, JavaType javaType, a aVar);
}
