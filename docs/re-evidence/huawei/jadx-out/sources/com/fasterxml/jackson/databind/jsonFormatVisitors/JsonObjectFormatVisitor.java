package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface JsonObjectFormatVisitor extends JsonFormatVisitorWithSerializerProvider {
    void optionalProperty(BeanProperty beanProperty) throws ym;

    void optionalProperty(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType) throws ym;

    void property(BeanProperty beanProperty) throws ym;

    void property(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType) throws ym;
}
