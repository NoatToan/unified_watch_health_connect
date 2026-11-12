package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface JsonMapFormatVisitor extends JsonFormatVisitorWithSerializerProvider {
    void keyFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) throws ym;

    void valueFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) throws ym;
}
