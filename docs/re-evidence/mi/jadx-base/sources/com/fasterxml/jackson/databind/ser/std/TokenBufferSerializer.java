package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.bip;
import defpackage.e5q;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class TokenBufferSerializer extends StdSerializer<bip> {
    public TokenBufferSerializer() {
        super(bip.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.k(javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        return createSchemaNode("any", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(bip bipVar, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        bipVar.p1(jsonGenerator);
    }

    @Override // defpackage.eud
    public final void serializeWithType(bip bipVar, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(bipVar, JsonToken.VALUE_EMBEDDED_OBJECT));
        serialize(bipVar, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }
}
