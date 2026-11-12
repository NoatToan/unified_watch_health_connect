package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import defpackage.c4h;
import defpackage.e5q;
import defpackage.eud;
import defpackage.itd;
import defpackage.wwl;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public class MapProperty extends PropertyWriter {
    private static final BeanProperty BOGUS_PROP = new BeanProperty.a();
    private static final long serialVersionUID = 1;
    protected Object _key;
    protected eud<Object> _keySerializer;
    protected final BeanProperty _property;
    protected final e5q _typeSerializer;
    protected Object _value;
    protected eud<Object> _valueSerializer;

    public MapProperty(e5q e5qVar, BeanProperty beanProperty) {
        super(beanProperty == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : beanProperty.getMetadata());
        this._typeSerializer = e5qVar;
        this._property = beanProperty == null ? BOGUS_PROP : beanProperty;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(c4h c4hVar, wwl wwlVar) throws JsonMappingException {
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._property.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this._property.getContextAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return new PropertyName(getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._property.getMember();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, defpackage.ogg
    public String getName() {
        Object obj = this._key;
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._property.getType();
    }

    public Object getValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._property.getWrapperName();
    }

    public void reset(Object obj, Object obj2, eud<Object> eudVar, eud<Object> eudVar2) {
        this._key = obj;
        this._value = obj2;
        this._keySerializer = eudVar;
        this._valueSerializer = eudVar2;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        e5q e5qVar = this._typeSerializer;
        if (e5qVar == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, wwlVar);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, wwlVar, e5qVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        this._keySerializer.serialize(this._key, jsonGenerator, wwlVar);
        e5q e5qVar = this._typeSerializer;
        if (e5qVar == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, wwlVar);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, wwlVar, e5qVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        if (jsonGenerator.l()) {
            return;
        }
        jsonGenerator.E0(getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        jsonGenerator.s0();
    }

    public void setValue(Object obj) {
        this._value = obj;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(itd itdVar, wwl wwlVar) throws JsonMappingException {
        this._property.depositSchemaProperty(itdVar, wwlVar);
    }

    @Deprecated
    public void reset(Object obj, eud<Object> eudVar, eud<Object> eudVar2) {
        reset(obj, this._value, eudVar, eudVar2);
    }
}
