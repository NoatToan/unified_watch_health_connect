package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import defpackage.y63;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    private static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super((Class<?>) ByteBuffer.class);
    }

    @Override // defpackage.esd
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return ByteBuffer.wrap(jsonParser.p());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ByteBuffer byteBuffer) throws IOException {
        y63 y63Var = new y63(byteBuffer);
        jsonParser.K0(deserializationContext.getBase64Variant(), y63Var);
        y63Var.close();
        return byteBuffer;
    }
}
