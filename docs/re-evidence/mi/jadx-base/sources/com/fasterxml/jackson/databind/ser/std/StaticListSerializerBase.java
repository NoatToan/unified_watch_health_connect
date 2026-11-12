package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.wwl;
import defpackage.yrd;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements cj4 {
    protected final Boolean _unwrapSingle;

    public StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }

    public abstract eud<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public abstract void acceptContentVisitor(yrd yrdVar) throws JsonMappingException;

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.m(javaType);
    }

    public abstract zsd contentSchema();

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // defpackage.cj4
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
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType());
        Boolean feature = valueFindFormatOverrides != null ? valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
        eud<?> eudVarFindContextualConvertingSerializer = findContextualConvertingSerializer(wwlVar, beanProperty, eudVarSerializerInstance);
        if (eudVarFindContextualConvertingSerializer == null) {
            eudVarFindContextualConvertingSerializer = wwlVar.findValueSerializer(String.class, beanProperty);
        }
        if (isDefaultSerializer(eudVarFindContextualConvertingSerializer)) {
            return feature == this._unwrapSingle ? this : _withResolved(beanProperty, feature);
        }
        return new CollectionSerializer(wwlVar.constructType(String.class), true, null, eudVarFindContextualConvertingSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        return createSchemaNode("array", true).q0("items", contentSchema());
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, T t) {
        return t == null || t.size() == 0;
    }

    @Override // defpackage.eud
    public abstract void serializeWithType(T t, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException;

    public StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super(staticListSerializerBase);
        this._unwrapSingle = bool;
    }
}
