package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.a;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements cj4 {
    protected a _dynamicSerializers;
    protected eud<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final boolean _staticTyping;
    protected final e5q _valueTypeSerializer;

    public ObjectArraySerializer(JavaType javaType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        super(Object[].class);
        this._elementType = javaType;
        this._staticTyping = z;
        this._valueTypeSerializer = e5qVar;
        this._dynamicSerializers = a.a();
        this._elementSerializer = eudVar;
    }

    public final eud<Object> _findAndAddDynamic(a aVar, Class<?> cls, wwl wwlVar) throws JsonMappingException {
        a.d dVarG = aVar.g(cls, wwlVar, this._property);
        a aVar2 = dVarG.f7701b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return dVarG.f7700a;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this._valueTypeSerializer, this._elementSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
        return new ObjectArraySerializer(this._elementType, this._staticTyping, e5qVar, this._elementSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.m(javaType);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarSerializerInstance;
        JavaType javaType;
        Object objFindContentSerializer;
        e5q e5qVarA = this._valueTypeSerializer;
        if (e5qVarA != null) {
            e5qVarA = e5qVarA.a(beanProperty);
        }
        if (beanProperty != null) {
            AnnotatedMember member = beanProperty.getMember();
            AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
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
        return withResolved(beanProperty, e5qVarA, eudVarFindContextualConvertingSerializer, feature);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public eud<?> getContentSerializer() {
        return this._elementSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._elementType;
    }

    public void serializeContentsUsing(Object[] objArr, JsonGenerator jsonGenerator, wwl wwlVar, eud<Object> eudVar) throws IOException {
        int length = objArr.length;
        e5q e5qVar = this._valueTypeSerializer;
        Object obj = null;
        for (int i = 0; i < length; i++) {
            try {
                obj = objArr[i];
                if (obj == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else if (e5qVar == null) {
                    eudVar.serialize(obj, jsonGenerator, wwlVar);
                } else {
                    eudVar.serializeWithType(obj, jsonGenerator, wwlVar, e5qVar);
                }
            } catch (Exception e) {
                wrapAndThrow(wwlVar, e, obj, i);
                return;
            }
        }
    }

    public void serializeTypedContents(Object[] objArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int length = objArr.length;
        e5q e5qVar = this._valueTypeSerializer;
        int i = 0;
        Object obj = null;
        try {
            a aVar = this._dynamicSerializers;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    eud<Object> eudVarI = aVar.i(cls);
                    if (eudVarI == null) {
                        eudVarI = _findAndAddDynamic(aVar, cls, wwlVar);
                    }
                    eudVarI.serializeWithType(obj, jsonGenerator, wwlVar, e5qVar);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, obj, i);
        }
    }

    public ObjectArraySerializer withResolved(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        return (this._property == beanProperty && eudVar == this._elementSerializer && this._valueTypeSerializer == e5qVar && this._unwrapSingle == bool) ? this : new ObjectArraySerializer(this, beanProperty, e5qVar, eudVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Object[] objArr) {
        return objArr.length == 1;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Object[] objArr) {
        return objArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(Object[] objArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int length = objArr.length;
        if (length == 1 && ((this._unwrapSingle == null && wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(objArr, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.M0(length);
        serializeContents(objArr, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public void serializeContents(Object[] objArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        eud<Object> eudVar = this._elementSerializer;
        if (eudVar != null) {
            serializeContentsUsing(objArr, jsonGenerator, wwlVar, eudVar);
            return;
        }
        if (this._valueTypeSerializer != null) {
            serializeTypedContents(objArr, jsonGenerator, wwlVar);
            return;
        }
        int i = 0;
        Object obj = null;
        try {
            a aVar = this._dynamicSerializers;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    eud<Object> eudVarI = aVar.i(cls);
                    if (eudVarI == null) {
                        eudVarI = this._elementType.hasGenericTypes() ? _findAndAddDynamic(aVar, wwlVar.constructSpecializedType(this._elementType, cls), wwlVar) : _findAndAddDynamic(aVar, cls, wwlVar);
                    }
                    eudVarI.serialize(obj, jsonGenerator, wwlVar);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, obj, i);
        }
    }

    public final eud<Object> _findAndAddDynamic(a aVar, JavaType javaType, wwl wwlVar) throws JsonMappingException {
        a.d dVarF = aVar.f(javaType, wwlVar, this._property);
        a aVar2 = dVarF.f7701b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return dVarF.f7700a;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, e5q e5qVar) {
        super(objectArraySerializer);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = e5qVar;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = objectArraySerializer._dynamicSerializers;
        this._elementSerializer = objectArraySerializer._elementSerializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = e5qVar;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = a.a();
        this._elementSerializer = eudVar;
    }
}
