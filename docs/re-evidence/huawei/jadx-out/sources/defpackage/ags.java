package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
public class ags {
    public static Collection<Map.Entry<Class<?>, Object>> d() {
        HashMap map = new HashMap();
        map.put(URL.class, new aha(URL.class));
        map.put(URI.class, new aha(URI.class));
        map.put(Currency.class, new aha(Currency.class));
        map.put(UUID.class, new ahc());
        map.put(Pattern.class, new aha(Pattern.class));
        map.put(Locale.class, new aha(Locale.class));
        map.put(AtomicBoolean.class, c.class);
        map.put(AtomicInteger.class, a.class);
        map.put(AtomicLong.class, d.class);
        map.put(File.class, agj.class);
        map.put(Class.class, agc.class);
        map.put(Void.class, ago.f387a);
        map.put(Void.TYPE, ago.f387a);
        return map.entrySet();
    }

    public static class c extends StdScalarSerializer<AtomicBoolean> {
        public c() {
            super(AtomicBoolean.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void serialize(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeBoolean(atomicBoolean.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode(TypedValues.Custom.S_BOOLEAN, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
            jsonFormatVisitorWrapper.expectBooleanFormat(javaType);
        }
    }

    public static class a extends StdScalarSerializer<AtomicInteger> {
        public a() {
            super(AtomicInteger.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(AtomicInteger atomicInteger, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(atomicInteger.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.INT);
        }
    }

    public static class d extends StdScalarSerializer<AtomicLong> {
        public d() {
            super(AtomicLong.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(AtomicLong atomicLong, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(atomicLong.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.LONG);
        }
    }
}
