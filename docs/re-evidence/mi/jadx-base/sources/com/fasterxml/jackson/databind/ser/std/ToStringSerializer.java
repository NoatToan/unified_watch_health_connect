package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.e5q;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class ToStringSerializer extends StdSerializer<Object> {
    public static final ToStringSerializer instance = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        visitStringFormat(ksdVar, javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) throws JsonMappingException {
        return createSchemaNode("string", true);
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Object obj) {
        return obj.toString().isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.Q0(obj.toString());
    }

    @Override // defpackage.eud
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(obj, JsonToken.VALUE_STRING));
        serialize(obj, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }

    public ToStringSerializer(Class<?> cls) {
        super(cls, false);
    }
}
