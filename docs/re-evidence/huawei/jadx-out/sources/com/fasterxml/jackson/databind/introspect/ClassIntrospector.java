package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.yi;
import defpackage.yt;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ClassIntrospector {

    public interface MixInResolver {
        MixInResolver copy();

        Class<?> findMixInClassFor(Class<?> cls);
    }

    public abstract ClassIntrospector copy();

    public abstract BeanDescription forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forCreation(yi yiVar, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forDeserialization(yi yiVar, JavaType javaType, MixInResolver mixInResolver);

    @Deprecated
    public abstract BeanDescription forDeserializationWithBuilder(yi yiVar, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forDeserializationWithBuilder(yi yiVar, JavaType javaType, MixInResolver mixInResolver, BeanDescription beanDescription);

    public abstract BeanDescription forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forSerialization(yt ytVar, JavaType javaType, MixInResolver mixInResolver);
}
