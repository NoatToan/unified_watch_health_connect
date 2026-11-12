package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.a;
import defpackage.c4h;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.rfl;
import defpackage.wwl;
import defpackage.zsd;
import defpackage.ztd;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements cj4 {
    protected a _dynamicSerializers;
    protected final eud<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final BeanProperty _property;
    protected final boolean _staticTyping;
    protected final Boolean _unwrapSingle;
    protected final e5q _valueTypeSerializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        super(cls, false);
        boolean z2 = false;
        this._elementType = javaType;
        if (z || (javaType != null && javaType.isFinal())) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueTypeSerializer = e5qVar;
        this._property = null;
        this._elementSerializer = eudVar;
        this._dynamicSerializers = a.a();
        this._unwrapSingle = null;
    }

    public final eud<Object> _findAndAddDynamic(a aVar, Class<?> cls, wwl wwlVar) throws JsonMappingException {
        a.d dVarG = aVar.g(cls, wwlVar, this._property);
        a aVar2 = dVarG.f7701b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return dVarG.f7700a;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        eud<Object> eudVarFindValueSerializer = this._elementSerializer;
        if (eudVarFindValueSerializer == null && this._elementType != null) {
            eudVarFindValueSerializer = ksdVar.a().findValueSerializer(this._elementType, this._property);
        }
        visitArrayFormat(ksdVar, javaType, eudVarFindValueSerializer, this._elementType);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarSerializerInstance;
        JavaType javaType;
        Object objFindContentSerializer;
        e5q e5qVarA = this._valueTypeSerializer;
        if (e5qVarA != null) {
            e5qVarA = e5qVarA.a(beanProperty);
        }
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
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType());
        Boolean feature = valueFindFormatOverrides != null ? valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
        if (eudVarSerializerInstance == null) {
            eudVarSerializerInstance = this._elementSerializer;
        }
        eud<?> eudVarFindContextualConvertingSerializer = findContextualConvertingSerializer(wwlVar, beanProperty, eudVarSerializerInstance);
        if (eudVarFindContextualConvertingSerializer == null && (javaType = this._elementType) != null && this._staticTyping && !javaType.isJavaLangObject()) {
            eudVarFindContextualConvertingSerializer = wwlVar.findValueSerializer(this._elementType, beanProperty);
        }
        return (eudVarFindContextualConvertingSerializer == this._elementSerializer && beanProperty == this._property && this._valueTypeSerializer == e5qVarA && this._unwrapSingle == feature) ? this : withResolved(beanProperty, e5qVarA, eudVarFindContextualConvertingSerializer, feature);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public eud<?> getContentSerializer() {
        return this._elementSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._elementType;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) throws JsonMappingException {
        c4h c4hVarCreateSchemaNode = createSchemaNode("array", true);
        Object obj = this._elementSerializer;
        if (obj != null) {
            zsd schema = obj instanceof rfl ? ((rfl) obj).getSchema(wwlVar, null) : null;
            if (schema == null) {
                schema = ztd.a();
            }
            c4hVarCreateSchemaNode.q0("items", schema);
        }
        return c4hVarCreateSchemaNode;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(T t, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(t)) {
            serializeContents(t, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.L0();
        jsonGenerator.M(t);
        serializeContents(t, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    public abstract void serializeContents(T t, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException;

    @Override // defpackage.eud
    public void serializeWithType(T t, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        jsonGenerator.M(t);
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(t, JsonToken.START_ARRAY));
        serializeContents(t, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }

    @Deprecated
    public final AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar) {
        return withResolved(beanProperty, e5qVar, eudVar, this._unwrapSingle);
    }

    public abstract AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool);

    public final eud<Object> _findAndAddDynamic(a aVar, JavaType javaType, wwl wwlVar) throws JsonMappingException {
        a.d dVarF = aVar.f(javaType, wwlVar, this._property);
        a aVar2 = dVarF.f7701b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return dVarF.f7700a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, e5q e5qVar, BeanProperty beanProperty, eud<Object> eudVar) {
        super(cls, false);
        boolean z2 = false;
        this._elementType = javaType;
        if (z || (javaType != null && javaType.isFinal())) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueTypeSerializer = e5qVar;
        this._property = beanProperty;
        this._elementSerializer = eudVar;
        this._dynamicSerializers = a.a();
        this._unwrapSingle = null;
    }

    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        super(asArraySerializerBase);
        this._elementType = asArraySerializerBase._elementType;
        this._staticTyping = asArraySerializerBase._staticTyping;
        this._valueTypeSerializer = e5qVar;
        this._property = beanProperty;
        this._elementSerializer = eudVar;
        this._dynamicSerializers = a.a();
        this._unwrapSingle = bool;
    }

    @Deprecated
    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar) {
        this(asArraySerializerBase, beanProperty, e5qVar, eudVar, asArraySerializerBase._unwrapSingle);
    }
}
