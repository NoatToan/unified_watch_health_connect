package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import defpackage.aeu;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface PropertyFilter {
    @Deprecated
    void depositSchemaProperty(PropertyWriter propertyWriter, aeu aeuVar, SerializerProvider serializerProvider) throws ym;

    void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym;

    void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception;

    void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception;
}
