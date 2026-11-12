package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ksd;
import defpackage.wwl;
import defpackage.x63;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ByteBufferSerializer extends StdScalarSerializer<ByteBuffer> {
    public ByteBufferSerializer() {
        super(ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.m(javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(ByteBuffer byteBuffer, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (byteBuffer.hasArray()) {
            jsonGenerator.d0(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
            return;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBufferAsReadOnlyBuffer.position() > 0) {
            byteBufferAsReadOnlyBuffer.rewind();
        }
        x63 x63Var = new x63(byteBufferAsReadOnlyBuffer);
        jsonGenerator.Z(x63Var, byteBufferAsReadOnlyBuffer.remaining());
        x63Var.close();
    }
}
