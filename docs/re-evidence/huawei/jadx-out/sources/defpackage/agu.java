package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public class agu extends StdSerializer<Object> implements ContextualSerializer, ResolvableSerializer, JsonFormatVisitable, SchemaAware {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JsonSerializer<Object> f396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f397c;
    protected final Converter<Object, ?> d;

    public agu(Converter<Object, ?> converter, JavaType javaType, JsonSerializer<?> jsonSerializer) {
        super(javaType);
        this.d = converter;
        this.f397c = javaType;
        this.f396b = jsonSerializer;
    }

    protected agu a(Converter<Object, ?> converter, JavaType javaType, JsonSerializer<?> jsonSerializer) {
        ahw.c((Class<?>) agu.class, this, "withDelegate");
        return new agu(converter, javaType, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.ResolvableSerializer
    public void resolve(SerializerProvider serializerProvider) throws ym {
        JsonFormatVisitable jsonFormatVisitable = this.f396b;
        if (jsonFormatVisitable == null || !(jsonFormatVisitable instanceof ResolvableSerializer)) {
            return;
        }
        ((ResolvableSerializer) jsonFormatVisitable).resolve(serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<?> jsonSerializerHandleSecondaryContextualization = this.f396b;
        JavaType outputType = this.f397c;
        if (jsonSerializerHandleSecondaryContextualization == null) {
            if (outputType == null) {
                outputType = this.d.getOutputType(serializerProvider.getTypeFactory());
            }
            if (!outputType.isJavaLangObject()) {
                jsonSerializerHandleSecondaryContextualization = serializerProvider.findValueSerializer(outputType);
            }
        }
        if (jsonSerializerHandleSecondaryContextualization instanceof ContextualSerializer) {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.handleSecondaryContextualization(jsonSerializerHandleSecondaryContextualization, beanProperty);
        }
        return (jsonSerializerHandleSecondaryContextualization == this.f396b && outputType == this.f397c) ? this : a(this.d, outputType, jsonSerializerHandleSecondaryContextualization);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<?> getDelegatee() {
        return this.f396b;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object objE = e(obj);
        if (objE == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializerD = this.f396b;
        if (jsonSerializerD == null) {
            jsonSerializerD = d(objE, serializerProvider);
        }
        jsonSerializerD.serialize(objE, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object objE = e(obj);
        JsonSerializer<Object> jsonSerializerD = this.f396b;
        if (jsonSerializerD == null) {
            jsonSerializerD = d(obj, serializerProvider);
        }
        jsonSerializerD.serializeWithType(objE, jsonGenerator, serializerProvider, typeSerializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        Object objE = e(obj);
        if (objE == null) {
            return true;
        }
        JsonSerializer<Object> jsonSerializer = this.f396b;
        if (jsonSerializer == null) {
            return obj == null;
        }
        return jsonSerializer.isEmpty(serializerProvider, objE);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws ym {
        JsonFormatVisitable jsonFormatVisitable = this.f396b;
        if (jsonFormatVisitable instanceof SchemaAware) {
            return ((SchemaAware) jsonFormatVisitable).getSchema(serializerProvider, type);
        }
        return super.getSchema(serializerProvider, type);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z) throws ym {
        JsonFormatVisitable jsonFormatVisitable = this.f396b;
        if (jsonFormatVisitable instanceof SchemaAware) {
            return ((SchemaAware) jsonFormatVisitable).getSchema(serializerProvider, type, z);
        }
        return super.getSchema(serializerProvider, type);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        JsonSerializer<Object> jsonSerializer = this.f396b;
        if (jsonSerializer != null) {
            jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
        }
    }

    protected Object e(Object obj) {
        return this.d.convert(obj);
    }

    protected JsonSerializer<Object> d(Object obj, SerializerProvider serializerProvider) throws ym {
        return serializerProvider.findValueSerializer(obj.getClass());
    }
}
