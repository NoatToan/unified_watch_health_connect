package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class agt extends StdSerializer<JsonSerializable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final agt f395a = new agt();

    protected agt() {
        super(JsonSerializable.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isEmpty(SerializerProvider serializerProvider, JsonSerializable jsonSerializable) {
        if (jsonSerializable instanceof JsonSerializable.Base) {
            return ((JsonSerializable.Base) jsonSerializable).isEmpty(serializerProvider);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(JsonSerializable jsonSerializable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonSerializable.serialize(jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void serializeWithType(JsonSerializable jsonSerializable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonSerializable.serializeWithType(jsonGenerator, serializerProvider, typeSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }
}
