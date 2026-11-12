package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class agv extends ArraySerializerBase<Object[]> implements ContextualSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected JsonSerializer<Object> f399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f400c;
    protected final TypeSerializer d;
    protected PropertySerializerMap e;

    public agv(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(Object[].class);
        this.f400c = javaType;
        this.f398a = z;
        this.d = typeSerializer;
        this.e = PropertySerializerMap.emptyForProperties();
        this.f399b = jsonSerializer;
    }

    public agv(agv agvVar, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(agvVar, beanProperty, bool);
        this.f400c = agvVar.f400c;
        this.d = typeSerializer;
        this.f398a = agvVar.f398a;
        this.e = PropertySerializerMap.emptyForProperties();
        this.f399b = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new agv(this, beanProperty, this.d, this.f399b, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new agv(this.f400c, this.f398a, typeSerializer, this.f399b);
    }

    public agv c(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return (this._property == beanProperty && jsonSerializer == this.f399b && this.d == typeSerializer && Objects.equals(this._unwrapSingle, bool)) ? this : new agv(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerSerializerInstance;
        JavaType javaType;
        Object objFindContentSerializer;
        TypeSerializer typeSerializerForProperty = this.d;
        if (typeSerializerForProperty != null) {
            typeSerializerForProperty = typeSerializerForProperty.forProperty(beanProperty);
        }
        if (beanProperty != null) {
            AnnotatedMember member = beanProperty.getMember();
            AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
            if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
                jsonSerializerSerializerInstance = null;
            } else {
                jsonSerializerSerializerInstance = serializerProvider.serializerInstance(member, objFindContentSerializer);
            }
        } else {
            jsonSerializerSerializerInstance = null;
        }
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        Boolean boolA = cVarFindFormatOverrides != null ? cVarFindFormatOverrides.a(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
        if (jsonSerializerSerializerInstance == null) {
            jsonSerializerSerializerInstance = this.f399b;
        }
        JsonSerializer<?> jsonSerializerFindContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializerSerializerInstance);
        if (jsonSerializerFindContextualConvertingSerializer == null && (javaType = this.f400c) != null && this.f398a && !javaType.isJavaLangObject()) {
            jsonSerializerFindContextualConvertingSerializer = serializerProvider.findContentValueSerializer(this.f400c, beanProperty);
        }
        return c(beanProperty, typeSerializerForProperty, jsonSerializerFindContextualConvertingSerializer, boolA);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this.f400c;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JsonSerializer<?> getContentSerializer() {
        return this.f399b;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean isEmpty(SerializerProvider serializerProvider, Object[] objArr) {
        return objArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean hasSingleElement(Object[] objArr) {
        return objArr.length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int length = objArr.length;
        if (length == 1 && ((this._unwrapSingle == null && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(objArr, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray(objArr, length);
        serializeContents(objArr, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serializeContents(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        JsonSerializer<Object> jsonSerializer = this.f399b;
        if (jsonSerializer != null) {
            a(objArr, jsonGenerator, serializerProvider, jsonSerializer);
            return;
        }
        if (this.d != null) {
            d(objArr, jsonGenerator, serializerProvider);
            return;
        }
        Object obj = null;
        int i = 0;
        try {
            PropertySerializerMap propertySerializerMap = this.e;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    JsonSerializer<Object> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
                    if (jsonSerializerSerializerFor == null) {
                        if (this.f400c.hasGenericTypes()) {
                            jsonSerializerSerializerFor = d(propertySerializerMap, serializerProvider.constructSpecializedType(this.f400c, cls), serializerProvider);
                        } else {
                            jsonSerializerSerializerFor = e(propertySerializerMap, cls, serializerProvider);
                        }
                    }
                    jsonSerializerSerializerFor.serialize(obj, jsonGenerator, serializerProvider);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, obj, i);
        }
    }

    public void a(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        int length = objArr.length;
        TypeSerializer typeSerializer = this.d;
        Object obj = null;
        for (int i = 0; i < length; i++) {
            try {
                obj = objArr[i];
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
            } catch (Exception e) {
                wrapAndThrow(serializerProvider, e, obj, i);
                return;
            }
        }
    }

    public void d(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int length = objArr.length;
        TypeSerializer typeSerializer = this.d;
        int i = 0;
        Object obj = null;
        try {
            PropertySerializerMap propertySerializerMap = this.e;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    JsonSerializer<Object> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
                    if (jsonSerializerSerializerFor == null) {
                        jsonSerializerSerializerFor = e(propertySerializerMap, cls, serializerProvider);
                    }
                    jsonSerializerSerializerFor.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, obj, i);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        JsonArrayFormatVisitor jsonArrayFormatVisitorExpectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (jsonArrayFormatVisitorExpectArrayFormat != null) {
            JavaType javaType2 = this.f400c;
            JsonSerializer<Object> jsonSerializerFindContentValueSerializer = this.f399b;
            if (jsonSerializerFindContentValueSerializer == null) {
                jsonSerializerFindContentValueSerializer = jsonFormatVisitorWrapper.getProvider().findContentValueSerializer(javaType2, this._property);
            }
            jsonArrayFormatVisitorExpectArrayFormat.itemsFormat(jsonSerializerFindContentValueSerializer, javaType2);
        }
    }

    protected final JsonSerializer<Object> e(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws ym {
        PropertySerializerMap.d dVarFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        if (propertySerializerMap != dVarFindAndAddSecondarySerializer.f4190a) {
            this.e = dVarFindAndAddSecondarySerializer.f4190a;
        }
        return dVarFindAndAddSecondarySerializer.f4191b;
    }

    protected final JsonSerializer<Object> d(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws ym {
        PropertySerializerMap.d dVarFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        if (propertySerializerMap != dVarFindAndAddSecondarySerializer.f4190a) {
            this.e = dVarFindAndAddSecondarySerializer.f4190a;
        }
        return dVarFindAndAddSecondarySerializer.f4191b;
    }
}
