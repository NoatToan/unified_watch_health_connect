package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import defpackage.aeu;
import defpackage.aez;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
@Deprecated
public interface BeanPropertyFilter {
    @Deprecated
    void depositSchemaProperty(aez aezVar, aeu aeuVar, SerializerProvider serializerProvider) throws ym;

    void depositSchemaProperty(aez aezVar, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym;

    void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, aez aezVar) throws Exception;
}
