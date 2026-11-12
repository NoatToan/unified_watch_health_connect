package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.a4h;
import defpackage.e5q;
import defpackage.eud;
import defpackage.wwl;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer _nameTransformer;

    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        super(beanSerializerBase, nameTransformer);
        this._nameTransformer = nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    @Override // defpackage.eud
    public boolean isUnwrappingSerializer() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.M(obj);
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, wwlVar, false);
        } else if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, wwlVar);
        } else {
            serializeFields(obj, jsonGenerator, wwlVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, defpackage.eud
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        if (wwlVar.isEnabled(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            wwlVar.reportBadDefinition(handledType(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        jsonGenerator.M(obj);
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, wwlVar, e5qVar);
        } else if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, wwlVar);
        } else {
            serializeFields(obj, jsonGenerator, wwlVar);
        }
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + handledType().getName();
    }

    @Override // defpackage.eud
    public eud<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withIgnorals(Set<String> set) {
        return new UnwrappingBeanSerializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(a4h a4hVar) {
        return new UnwrappingBeanSerializer(this, a4hVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, defpackage.eud
    public BeanSerializerBase withFilterId(Object obj) {
        return new UnwrappingBeanSerializer(this, this._objectIdWriter, obj);
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, a4h a4hVar) {
        super(unwrappingBeanSerializer, a4hVar);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, a4h a4hVar, Object obj) {
        super(unwrappingBeanSerializer, a4hVar, obj);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set<String> set) {
        super(unwrappingBeanSerializer, set);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }
}
