package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class agm extends StdSerializer<Object> implements ContextualSerializer, JsonFormatVisitable, SchemaAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final JsonSerializer<Object> f381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final BeanProperty f382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected transient PropertySerializerMap f383c;
    protected final AnnotatedMember d;
    protected final boolean e;
    protected final JavaType g;
    protected final TypeSerializer i;

    public agm(AnnotatedMember annotatedMember, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer) {
        super(annotatedMember.getType());
        this.d = annotatedMember;
        this.g = annotatedMember.getType();
        this.i = typeSerializer;
        this.f381a = jsonSerializer;
        this.f382b = null;
        this.e = true;
        this.f383c = PropertySerializerMap.emptyForProperties();
    }

    public agm(agm agmVar, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, boolean z) {
        super(b(agmVar.handledType()));
        this.d = agmVar.d;
        this.g = agmVar.g;
        this.i = typeSerializer;
        this.f381a = jsonSerializer;
        this.f382b = beanProperty;
        this.e = z;
        this.f383c = PropertySerializerMap.emptyForProperties();
    }

    private static final Class<Object> b(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    protected agm e(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, boolean z) {
        return (this.f382b == beanProperty && this.i == typeSerializer && this.f381a == jsonSerializer && z == this.e) ? this : new agm(this, beanProperty, typeSerializer, jsonSerializer, z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        Object value = this.d.getValue(obj);
        if (value == null) {
            return true;
        }
        JsonSerializer<Object> jsonSerializerD = this.f381a;
        if (jsonSerializerD == null) {
            try {
                jsonSerializerD = d(serializerProvider, value.getClass());
            } catch (ym e) {
                throw new yr(e);
            }
        }
        return jsonSerializerD.isEmpty(serializerProvider, value);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        TypeSerializer typeSerializerForProperty = this.i;
        if (typeSerializerForProperty != null) {
            typeSerializerForProperty = typeSerializerForProperty.forProperty(beanProperty);
        }
        JsonSerializer<?> jsonSerializer = this.f381a;
        if (jsonSerializer == null) {
            if (!serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING) && !this.g.isFinal()) {
                return beanProperty != this.f382b ? e(beanProperty, typeSerializerForProperty, jsonSerializer, this.e) : this;
            }
            JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(this.g, beanProperty);
            return e(beanProperty, typeSerializerForProperty, jsonSerializerFindPrimaryPropertySerializer, a(this.g.getRawClass(), jsonSerializerFindPrimaryPropertySerializer));
        }
        return e(beanProperty, typeSerializerForProperty, serializerProvider.handlePrimaryContextualization(jsonSerializer, beanProperty), this.e);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object value;
        try {
            value = this.d.getValue(obj);
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, obj, this.d.getName() + "()");
            value = null;
        }
        if (value == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializerD = this.f381a;
        if (jsonSerializerD == null) {
            jsonSerializerD = d(serializerProvider, value.getClass());
        }
        TypeSerializer typeSerializer = this.i;
        if (typeSerializer != null) {
            jsonSerializerD.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
        } else {
            jsonSerializerD.serialize(value, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object value;
        try {
            value = this.d.getValue(obj);
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, obj, this.d.getName() + "()");
            value = null;
        }
        if (value == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializerD = this.f381a;
        if (jsonSerializerD == null) {
            jsonSerializerD = d(serializerProvider, value.getClass());
        } else if (this.e) {
            WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(obj, JsonToken.VALUE_STRING));
            jsonSerializerD.serialize(value, jsonGenerator, serializerProvider);
            typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
            return;
        }
        jsonSerializerD.serializeWithType(value, jsonGenerator, serializerProvider, new c(typeSerializer, obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws ym {
        JsonFormatVisitable jsonFormatVisitable = this.f381a;
        if (jsonFormatVisitable instanceof SchemaAware) {
            return ((SchemaAware) jsonFormatVisitable).getSchema(serializerProvider, null);
        }
        return adc.e();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        Class<?> declaringClass = this.d.getDeclaringClass();
        if (declaringClass != null && ahw.m(declaringClass) && a(jsonFormatVisitorWrapper, javaType, declaringClass)) {
            return;
        }
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = this.f381a;
        if (jsonSerializerFindTypedValueSerializer == null && (jsonSerializerFindTypedValueSerializer = jsonFormatVisitorWrapper.getProvider().findTypedValueSerializer(this.g, false, this.f382b)) == null) {
            jsonFormatVisitorWrapper.expectAnyFormat(javaType);
        } else {
            jsonSerializerFindTypedValueSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, this.g);
        }
    }

    protected boolean a(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, Class<?> cls) throws ym {
        JsonStringFormatVisitor jsonStringFormatVisitorExpectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (jsonStringFormatVisitorExpectStringFormat == null) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : cls.getEnumConstants()) {
            try {
                linkedHashSet.add(String.valueOf(this.d.getValue(obj)));
            } catch (Exception e) {
                e = e;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                ahw.e(e);
                throw ym.wrapWithPath(e, obj, this.d.getName() + "()");
            }
        }
        jsonStringFormatVisitorExpectStringFormat.enumTypes(linkedHashSet);
        return true;
    }

    protected boolean a(Class<?> cls, JsonSerializer<?> jsonSerializer) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return isDefaultSerializer(jsonSerializer);
    }

    protected JsonSerializer<Object> d(SerializerProvider serializerProvider, Class<?> cls) throws ym {
        JsonSerializer<Object> jsonSerializerSerializerFor = this.f383c.serializerFor(cls);
        if (jsonSerializerSerializerFor != null) {
            return jsonSerializerSerializerFor;
        }
        if (this.g.hasGenericTypes()) {
            JavaType javaTypeConstructSpecializedType = serializerProvider.constructSpecializedType(this.g, cls);
            JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(javaTypeConstructSpecializedType, this.f382b);
            this.f383c = this.f383c.addSerializer(javaTypeConstructSpecializedType, jsonSerializerFindPrimaryPropertySerializer).f4190a;
            return jsonSerializerFindPrimaryPropertySerializer;
        }
        JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer2 = serializerProvider.findPrimaryPropertySerializer(cls, this.f382b);
        this.f383c = this.f383c.addSerializer(cls, jsonSerializerFindPrimaryPropertySerializer2).f4190a;
        return jsonSerializerFindPrimaryPropertySerializer2;
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this.d.getDeclaringClass() + "#" + this.d.getName() + Constants.RIGHT_BRACKET_ONLY;
    }

    static class c extends TypeSerializer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Object f384c;
        protected final TypeSerializer d;

        public c(TypeSerializer typeSerializer, Object obj) {
            this.d = typeSerializer;
            this.f384c = obj;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public TypeSerializer forProperty(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public JsonTypeInfo.As getTypeInclusion() {
            return this.d.getTypeInclusion();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public String getPropertyName() {
            return this.d.getPropertyName();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public TypeIdResolver getTypeIdResolver() {
            return this.d.getTypeIdResolver();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.f4081a = this.f384c;
            return this.d.writeTypePrefix(jsonGenerator, writableTypeId);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this.d.writeTypeSuffix(jsonGenerator, writableTypeId);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.d.writeTypePrefixForScalar(this.f384c, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.d.writeTypePrefixForObject(this.f384c, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.d.writeTypePrefixForArray(this.f384c, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.d.writeTypeSuffixForScalar(this.f384c, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.d.writeTypeSuffixForObject(this.f384c, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.d.writeTypeSuffixForArray(this.f384c, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.d.writeTypePrefixForScalar(this.f384c, jsonGenerator, cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.d.writeTypePrefixForObject(this.f384c, jsonGenerator, cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.d.writeTypePrefixForArray(this.f384c, jsonGenerator, cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.d.writeCustomTypePrefixForScalar(this.f384c, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.d.writeCustomTypePrefixForObject(this.f384c, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.d.writeCustomTypePrefixForArray(this.f384c, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.d.writeCustomTypeSuffixForScalar(this.f384c, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.d.writeCustomTypeSuffixForObject(this.f384c, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.d.writeCustomTypeSuffixForArray(this.f384c, jsonGenerator, str);
        }
    }
}
