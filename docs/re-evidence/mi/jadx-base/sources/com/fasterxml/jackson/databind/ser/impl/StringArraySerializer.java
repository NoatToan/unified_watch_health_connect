package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class StringArraySerializer extends ArraySerializerBase<String[]> implements cj4 {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
    public static final StringArraySerializer instance = new StringArraySerializer();
    protected final eud<Object> _elementSerializer;

    public StringArraySerializer() {
        super(String[].class);
        this._elementSerializer = null;
    }

    private void serializeContentsSlow(String[] strArr, JsonGenerator jsonGenerator, wwl wwlVar, eud<Object> eudVar) throws IOException {
        for (String str : strArr) {
            if (str == null) {
                wwlVar.defaultSerializeNull(jsonGenerator);
            } else {
                eudVar.serialize(str, jsonGenerator, wwlVar);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringArraySerializer(this, beanProperty, this._elementSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        visitArrayFormat(ksdVar, javaType, JsonFormatTypes.STRING);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarSerializerInstance;
        Object objFindContentSerializer;
        if (beanProperty != null) {
            AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
            AnnotatedMember member = beanProperty.getMember();
            if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
                eudVarSerializerInstance = null;
            } else {
                eudVarSerializerInstance = wwlVar.serializerInstance(member, objFindContentSerializer);
            }
        } else {
            eudVarSerializerInstance = null;
        }
        Boolean boolFindFormatFeature = findFormatFeature(wwlVar, beanProperty, String[].class, JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        if (eudVarSerializerInstance == null) {
            eudVarSerializerInstance = this._elementSerializer;
        }
        eud<?> eudVarFindContextualConvertingSerializer = findContextualConvertingSerializer(wwlVar, beanProperty, eudVarSerializerInstance);
        if (eudVarFindContextualConvertingSerializer == null) {
            eudVarFindContextualConvertingSerializer = wwlVar.findValueSerializer(String.class, beanProperty);
        }
        eud<?> eudVar = isDefaultSerializer(eudVarFindContextualConvertingSerializer) ? null : eudVarFindContextualConvertingSerializer;
        return (eudVar == this._elementSerializer && boolFindFormatFeature == this._unwrapSingle) ? this : new StringArraySerializer(this, beanProperty, eudVar, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public eud<?> getContentSerializer() {
        return this._elementSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return VALUE_TYPE;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        return createSchemaNode("array", true).q0("items", createSchemaNode("string"));
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(String[] strArr) {
        return strArr.length == 1;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, String[] strArr) {
        return strArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(String[] strArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int length = strArr.length;
        if (length == 1 && ((this._unwrapSingle == null && wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(strArr, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.M0(length);
        serializeContents(strArr, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public void serializeContents(String[] strArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (strArr.length == 0) {
            return;
        }
        eud<Object> eudVar = this._elementSerializer;
        if (eudVar != null) {
            serializeContentsSlow(strArr, jsonGenerator, wwlVar, eudVar);
            return;
        }
        for (String str : strArr) {
            if (str == null) {
                jsonGenerator.s0();
            } else {
                jsonGenerator.Q0(str);
            }
        }
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, BeanProperty beanProperty, eud<?> eudVar, Boolean bool) {
        super(stringArraySerializer, beanProperty, bool);
        this._elementSerializer = eudVar;
    }
}
