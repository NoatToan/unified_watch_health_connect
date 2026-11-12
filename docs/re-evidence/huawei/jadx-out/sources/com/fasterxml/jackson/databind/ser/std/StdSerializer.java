package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.Converter;
import defpackage.aes;
import defpackage.aeu;
import defpackage.agu;
import defpackage.ahw;
import defpackage.ym;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StdSerializer<T> extends JsonSerializer<T> implements JsonFormatVisitable, SchemaAware, Serializable {
    private static final Object KEY_CONTENT_CONVERTER_LOCK = new Object();
    private static final long serialVersionUID = 1;
    protected final Class<T> _handledType;

    protected static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public abstract void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    public StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    public StdSerializer(JavaType javaType) {
        this._handledType = (Class<T>) javaType.getRawClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StdSerializer(Class<?> cls, boolean z) {
        this._handledType = cls;
    }

    protected StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = (Class<T>) stdSerializer._handledType;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public Class<T> handledType() {
        return this._handledType;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws ym {
        return createSchemaNode("string");
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z) throws ym {
        aeu aeuVar = (aeu) getSchema(serializerProvider, type);
        if (!z) {
            aeuVar.c("required", !z);
        }
        return aeuVar;
    }

    protected aeu createSchemaNode(String str) {
        aeu aeuVarObjectNode = aes.e.objectNode();
        aeuVarObjectNode.c("type", str);
        return aeuVarObjectNode;
    }

    protected aeu createSchemaNode(String str, boolean z) {
        aeu aeuVarCreateSchemaNode = createSchemaNode(str);
        if (!z) {
            aeuVarCreateSchemaNode.c("required", !z);
        }
        return aeuVarCreateSchemaNode;
    }

    protected void visitStringFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        jsonFormatVisitorWrapper.expectStringFormat(javaType);
    }

    protected void visitStringFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonValueFormat jsonValueFormat) throws ym {
        JsonStringFormatVisitor jsonStringFormatVisitorExpectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (jsonStringFormatVisitorExpectStringFormat != null) {
            jsonStringFormatVisitorExpectStringFormat.format(jsonValueFormat);
        }
    }

    protected void visitIntFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType) throws ym {
        JsonIntegerFormatVisitor jsonIntegerFormatVisitorExpectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (_neitherNull(jsonIntegerFormatVisitorExpectIntegerFormat, numberType)) {
            jsonIntegerFormatVisitorExpectIntegerFormat.numberType(numberType);
        }
    }

    protected void visitIntFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) throws ym {
        JsonIntegerFormatVisitor jsonIntegerFormatVisitorExpectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (jsonIntegerFormatVisitorExpectIntegerFormat != null) {
            if (numberType != null) {
                jsonIntegerFormatVisitorExpectIntegerFormat.numberType(numberType);
            }
            if (jsonValueFormat != null) {
                jsonIntegerFormatVisitorExpectIntegerFormat.format(jsonValueFormat);
            }
        }
    }

    protected void visitFloatFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType) throws ym {
        JsonNumberFormatVisitor jsonNumberFormatVisitorExpectNumberFormat = jsonFormatVisitorWrapper.expectNumberFormat(javaType);
        if (jsonNumberFormatVisitorExpectNumberFormat != null) {
            jsonNumberFormatVisitorExpectNumberFormat.numberType(numberType);
        }
    }

    protected void visitArrayFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonSerializer<?> jsonSerializer, JavaType javaType2) throws ym {
        JsonArrayFormatVisitor jsonArrayFormatVisitorExpectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (_neitherNull(jsonArrayFormatVisitorExpectArrayFormat, jsonSerializer)) {
            jsonArrayFormatVisitorExpectArrayFormat.itemsFormat(jsonSerializer, javaType2);
        }
    }

    protected void visitArrayFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonFormatTypes jsonFormatTypes) throws ym {
        JsonArrayFormatVisitor jsonArrayFormatVisitorExpectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (jsonArrayFormatVisitorExpectArrayFormat != null) {
            jsonArrayFormatVisitorExpectArrayFormat.itemsFormat(jsonFormatTypes);
        }
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ahw.e(th);
        boolean z = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof ym)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            ahw.i(th);
        }
        throw ym.wrapWithPath(th, obj, str);
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, int i) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ahw.e(th);
        boolean z = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof ym)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            ahw.i(th);
        }
        throw ym.wrapWithPath(th, obj, i);
    }

    protected JsonSerializer<?> findContextualConvertingSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) throws ym {
        Object obj = KEY_CONTENT_CONVERTER_LOCK;
        Map identityHashMap = (Map) serializerProvider.getAttribute(obj);
        if (identityHashMap != null) {
            if (identityHashMap.get(beanProperty) != null) {
                return jsonSerializer;
            }
        } else {
            identityHashMap = new IdentityHashMap();
            serializerProvider.setAttribute(obj, (Object) identityHashMap);
        }
        identityHashMap.put(beanProperty, Boolean.TRUE);
        try {
            JsonSerializer<?> jsonSerializerFindConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer);
            return jsonSerializerFindConvertingContentSerializer != null ? serializerProvider.handleSecondaryContextualization(jsonSerializerFindConvertingContentSerializer, beanProperty) : jsonSerializer;
        } finally {
            identityHashMap.remove(beanProperty);
        }
    }

    @Deprecated
    protected JsonSerializer<?> findConvertingContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) throws ym {
        AnnotatedMember member;
        Object objFindSerializationContentConverter;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (objFindSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) == null) {
            return jsonSerializer;
        }
        Converter<Object, Object> converterConverterInstance = serializerProvider.converterInstance(beanProperty.getMember(), objFindSerializationContentConverter);
        JavaType outputType = converterConverterInstance.getOutputType(serializerProvider.getTypeFactory());
        if (jsonSerializer == null && !outputType.isJavaLangObject()) {
            jsonSerializer = serializerProvider.findValueSerializer(outputType);
        }
        return new agu(converterConverterInstance, outputType, jsonSerializer);
    }

    protected PropertyFilter findPropertyFilter(SerializerProvider serializerProvider, Object obj, Object obj2) throws ym {
        FilterProvider filterProvider = serializerProvider.getFilterProvider();
        if (filterProvider == null) {
            serializerProvider.reportBadDefinition((Class<?>) handledType(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        return filterProvider.findPropertyFilter(obj, obj2);
    }

    protected JsonFormat.c findFormatOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyFormat(serializerProvider.getConfig(), cls);
        }
        return serializerProvider.getDefaultPropertyFormat(cls);
    }

    protected Boolean findFormatFeature(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, cls);
        if (cVarFindFormatOverrides != null) {
            return cVarFindFormatOverrides.a(feature);
        }
        return null;
    }

    protected JsonInclude.b findIncludeOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyInclusion(serializerProvider.getConfig(), cls);
        }
        return serializerProvider.getDefaultPropertyInclusion(cls);
    }

    protected JsonSerializer<?> findAnnotatedContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        Object objFindContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return serializerProvider.serializerInstance(member, objFindContentSerializer);
    }

    protected boolean isDefaultSerializer(JsonSerializer<?> jsonSerializer) {
        return ahw.c(jsonSerializer);
    }

    protected static final boolean _nonEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }
}
