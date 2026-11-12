package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class aav extends StdScalarDeserializer<ByteBuffer> {
    private static final long serialVersionUID = 1;

    protected aav() {
        super((Class<?>) ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Binary;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return ByteBuffer.wrap(jsonParser.getBinaryValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ByteBuffer byteBuffer) throws IOException {
        ahq ahqVar = new ahq(byteBuffer);
        jsonParser.readBinaryValue(deserializationContext.getBase64Variant(), ahqVar);
        ahqVar.close();
        return byteBuffer;
    }
}
