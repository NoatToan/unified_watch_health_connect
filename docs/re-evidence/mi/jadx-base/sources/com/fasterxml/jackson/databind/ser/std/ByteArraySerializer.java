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
public class ByteArraySerializer extends StdSerializer<byte[]> {
    private static final long serialVersionUID = 1;

    public ByteArraySerializer() {
        super(byte[].class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.m(javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        return createSchemaNode("array", true).q0("items", createSchemaNode("byte"));
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(byte[] bArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.b0(wwlVar.getConfig().getBase64Variant(), bArr, 0, bArr.length);
    }

    @Override // defpackage.eud
    public void serializeWithType(byte[] bArr, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(bArr, JsonToken.VALUE_EMBEDDED_OBJECT));
        jsonGenerator.b0(wwlVar.getConfig().getBase64Variant(), bArr, 0, bArr.length);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }
}
