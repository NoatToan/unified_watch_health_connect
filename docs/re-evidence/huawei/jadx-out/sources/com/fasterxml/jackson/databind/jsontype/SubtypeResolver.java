package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import defpackage.ack;
import defpackage.adg;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SubtypeResolver {
    public SubtypeResolver copy() {
        return this;
    }

    public abstract void registerSubtypes(Collection<Class<?>> collection);

    public abstract void registerSubtypes(adg... adgVarArr);

    public abstract void registerSubtypes(Class<?>... clsArr);

    public Collection<adg> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public Collection<adg> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, ack ackVar) {
        return collectAndResolveSubtypes(ackVar, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    public Collection<adg> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public Collection<adg> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, ack ackVar) {
        return collectAndResolveSubtypes(ackVar, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    @Deprecated
    public Collection<adg> collectAndResolveSubtypes(AnnotatedMember annotatedMember, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, JavaType javaType) {
        return collectAndResolveSubtypesByClass(mapperConfig, annotatedMember, javaType);
    }

    @Deprecated
    public Collection<adg> collectAndResolveSubtypes(ack ackVar, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector) {
        return collectAndResolveSubtypesByClass(mapperConfig, ackVar);
    }
}
