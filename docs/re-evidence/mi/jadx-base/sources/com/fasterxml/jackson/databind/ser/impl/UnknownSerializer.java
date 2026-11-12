package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import defpackage.e5q;
import defpackage.ksd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public class UnknownSerializer extends StdSerializer<Object> {
    public UnknownSerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.k(javaType);
    }

    public void failForEmpty(wwl wwlVar, Object obj) throws JsonMappingException {
        wwlVar.reportBadDefinition(handledType(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", obj.getClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) throws JsonMappingException {
        return null;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Object obj) {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (wwlVar.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(wwlVar, obj);
        }
        jsonGenerator.N0();
        jsonGenerator.m0();
    }

    @Override // defpackage.eud
    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        if (wwlVar.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(wwlVar, obj);
        }
        e5qVar.h(jsonGenerator, e5qVar.g(jsonGenerator, e5qVar.d(obj, JsonToken.START_OBJECT)));
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls, false);
    }
}
