package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import defpackage.ak4;
import defpackage.c4h;
import defpackage.eud;
import defpackage.h04;
import defpackage.ksd;
import defpackage.odi;
import defpackage.rfl;
import defpackage.tm9;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StdSerializer<T> extends eud<T> implements rfl, Serializable {
    private static final Object KEY_CONTENT_CONVERTER_LOCK = new Object();
    private static final long serialVersionUID = 1;
    protected final Class<T> _handledType;

    public StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final boolean _nonEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    @Override // defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.k(javaType);
    }

    public c4h createSchemaNode(String str) {
        c4h c4hVarObjectNode = JsonNodeFactory.instance.objectNode();
        c4hVarObjectNode.j0("type", str);
        return c4hVarObjectNode;
    }

    public eud<?> findAnnotatedContentSerializer(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        Object objFindContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
        if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return wwlVar.serializerInstance(member, objFindContentSerializer);
    }

    public eud<?> findContextualConvertingSerializer(wwl wwlVar, BeanProperty beanProperty, eud<?> eudVar) throws JsonMappingException {
        Object obj = KEY_CONTENT_CONVERTER_LOCK;
        Map identityHashMap = (Map) wwlVar.getAttribute(obj);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            wwlVar.setAttribute(obj, (Object) identityHashMap);
        } else if (identityHashMap.get(beanProperty) != null) {
            return eudVar;
        }
        identityHashMap.put(beanProperty, Boolean.TRUE);
        try {
            eud<?> eudVarFindConvertingContentSerializer = findConvertingContentSerializer(wwlVar, beanProperty, eudVar);
            return eudVarFindConvertingContentSerializer != null ? wwlVar.handleSecondaryContextualization(eudVarFindConvertingContentSerializer, beanProperty) : eudVar;
        } finally {
            identityHashMap.remove(beanProperty);
        }
    }

    @Deprecated
    public eud<?> findConvertingContentSerializer(wwl wwlVar, BeanProperty beanProperty, eud<?> eudVar) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindSerializationContentConverter;
        AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (objFindSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) == null) {
            return eudVar;
        }
        ak4<Object, Object> ak4VarConverterInstance = wwlVar.converterInstance(beanProperty.getMember(), objFindSerializationContentConverter);
        JavaType javaTypeB = ak4VarConverterInstance.b(wwlVar.getTypeFactory());
        if (eudVar == null && !javaTypeB.isJavaLangObject()) {
            eudVar = wwlVar.findValueSerializer(javaTypeB);
        }
        return new StdDelegatingSerializer(ak4VarConverterInstance, javaTypeB, eudVar);
    }

    public Boolean findFormatFeature(wwl wwlVar, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonFormat.Value findFormatOverrides(wwl wwlVar, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(wwlVar.getConfig(), cls) : wwlVar.getDefaultPropertyFormat(cls);
    }

    public JsonInclude.Value findIncludeOverrides(wwl wwlVar, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyInclusion(wwlVar.getConfig(), cls) : wwlVar.getDefaultPropertyInclusion(cls);
    }

    public odi findPropertyFilter(wwl wwlVar, Object obj, Object obj2) throws JsonMappingException {
        tm9 filterProvider = wwlVar.getFilterProvider();
        if (filterProvider == null) {
            wwlVar.reportBadDefinition((Class<?>) handledType(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        return filterProvider.findPropertyFilter(obj, obj2);
    }

    public zsd getSchema(wwl wwlVar, Type type) throws JsonMappingException {
        return createSchemaNode("string");
    }

    @Override // defpackage.eud
    public Class<T> handledType() {
        return this._handledType;
    }

    public boolean isDefaultSerializer(eud<?> eudVar) {
        return h04.N(eudVar);
    }

    @Override // defpackage.eud
    public abstract void serialize(T t, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException;

    public void visitArrayFormat(ksd ksdVar, JavaType javaType, eud<?> eudVar, JavaType javaType2) throws JsonMappingException {
        ksdVar.m(javaType);
        if (_neitherNull(null, eudVar)) {
            throw null;
        }
    }

    public void visitFloatFormat(ksd ksdVar, JavaType javaType, JsonParser.NumberType numberType) throws JsonMappingException {
        ksdVar.l(javaType);
    }

    public void visitIntFormat(ksd ksdVar, JavaType javaType, JsonParser.NumberType numberType) throws JsonMappingException {
        ksdVar.b(javaType);
        if (_neitherNull(null, numberType)) {
            throw null;
        }
    }

    public void visitStringFormat(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.f(javaType);
    }

    public void wrapAndThrow(wwl wwlVar, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        h04.d0(th);
        boolean z = wwlVar == null || wwlVar.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            h04.f0(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }

    public zsd getSchema(wwl wwlVar, Type type, boolean z) throws JsonMappingException {
        c4h c4hVar = (c4h) getSchema(wwlVar, type);
        if (!z) {
            c4hVar.k0("required", !z);
        }
        return c4hVar;
    }

    public void visitStringFormat(ksd ksdVar, JavaType javaType, JsonValueFormat jsonValueFormat) throws JsonMappingException {
        ksdVar.f(javaType);
    }

    public StdSerializer(JavaType javaType) {
        this._handledType = (Class<T>) javaType.getRawClass();
    }

    public c4h createSchemaNode(String str, boolean z) {
        c4h c4hVarCreateSchemaNode = createSchemaNode(str);
        if (!z) {
            c4hVarCreateSchemaNode.k0("required", !z);
        }
        return c4hVarCreateSchemaNode;
    }

    public void visitArrayFormat(ksd ksdVar, JavaType javaType, JsonFormatTypes jsonFormatTypes) throws JsonMappingException {
        ksdVar.m(javaType);
    }

    public void visitIntFormat(ksd ksdVar, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) throws JsonMappingException {
        ksdVar.b(javaType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StdSerializer(Class<?> cls, boolean z) {
        this._handledType = cls;
    }

    public StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = (Class<T>) stdSerializer._handledType;
    }

    public void wrapAndThrow(wwl wwlVar, Throwable th, Object obj, int i) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        h04.d0(th);
        boolean z = wwlVar == null || wwlVar.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            h04.f0(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, i);
    }
}
