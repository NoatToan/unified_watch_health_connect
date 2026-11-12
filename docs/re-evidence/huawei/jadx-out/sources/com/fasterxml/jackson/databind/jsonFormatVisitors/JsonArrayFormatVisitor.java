package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface JsonArrayFormatVisitor extends JsonFormatVisitorWithSerializerProvider {
    void itemsFormat(JsonFormatTypes jsonFormatTypes) throws ym;

    void itemsFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) throws ym;
}
