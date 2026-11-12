package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import defpackage.adg;
import defpackage.yi;
import defpackage.yt;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public interface TypeResolverBuilder<T extends TypeResolverBuilder<T>> {
    TypeDeserializer buildTypeDeserializer(yi yiVar, JavaType javaType, Collection<adg> collection);

    TypeSerializer buildTypeSerializer(yt ytVar, JavaType javaType, Collection<adg> collection);

    T defaultImpl(Class<?> cls);

    Class<?> getDefaultImpl();

    T inclusion(JsonTypeInfo.As as);

    T init(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver);

    T typeIdVisibility(boolean z);

    T typeProperty(String str);
}
