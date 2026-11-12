package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class agb extends StdScalarSerializer<ByteBuffer> {
    public agb() {
        super(ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(ByteBuffer byteBuffer, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (byteBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            jsonGenerator.writeBinary(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, byteBuffer.limit() - iPosition);
            return;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBufferAsReadOnlyBuffer.position() > 0) {
        }
        ahu ahuVar = new ahu(byteBufferAsReadOnlyBuffer);
        jsonGenerator.writeBinary(ahuVar, byteBufferAsReadOnlyBuffer.remaining());
        ahuVar.close();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        JsonArrayFormatVisitor jsonArrayFormatVisitorExpectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (jsonArrayFormatVisitorExpectArrayFormat != null) {
            jsonArrayFormatVisitorExpectArrayFormat.itemsFormat(JsonFormatTypes.INTEGER);
        }
    }
}
