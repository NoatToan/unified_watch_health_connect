package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class afs extends JsonSerializer<Object> implements ContextualSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final TypeSerializer f371b;
    protected final JsonSerializer<Object> e;

    public afs(TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer) {
        this.f371b = typeSerializer;
        this.e = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        this.e.serializeWithType(obj, jsonGenerator, serializerProvider, this.f371b);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        this.e.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public Class<Object> handledType() {
        return Object.class;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<?> jsonSerializerHandleSecondaryContextualization = this.e;
        if (jsonSerializerHandleSecondaryContextualization instanceof ContextualSerializer) {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.handleSecondaryContextualization(jsonSerializerHandleSecondaryContextualization, beanProperty);
        }
        return jsonSerializerHandleSecondaryContextualization == this.e ? this : new afs(this.f371b, jsonSerializerHandleSecondaryContextualization);
    }
}
