package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface JsonFormatVisitable {
    void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym;
}
