package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.a4h;
import defpackage.eud;
import defpackage.kh2;
import defpackage.wwl;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class BeanSerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 29;

    public BeanSerializer(JavaType javaType, kh2 kh2Var, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType, kh2Var, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public static BeanSerializer createDummy(JavaType javaType) {
        return new BeanSerializer(javaType, null, BeanSerializerBase.NO_PROPS, null);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return (this._objectIdWriter == null && this._anyGetterWriter == null && this._propertyFilterId == null) ? new BeanAsArraySerializer(this) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (this._objectIdWriter != null) {
            jsonGenerator.M(obj);
            _serializeWithObjectId(obj, jsonGenerator, wwlVar, true);
            return;
        }
        jsonGenerator.O0(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, wwlVar);
        } else {
            serializeFields(obj, jsonGenerator, wwlVar);
        }
        jsonGenerator.m0();
    }

    public String toString() {
        return "BeanSerializer for " + handledType().getName();
    }

    @Override // defpackage.eud
    public eud<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withIgnorals(Set<String> set) {
        return new BeanSerializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(a4h a4hVar) {
        return new BeanSerializer(this, a4hVar, this._propertyFilterId);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, defpackage.eud
    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanSerializer(this, this._objectIdWriter, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, a4h a4hVar) {
        super(beanSerializerBase, a4hVar);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, a4h a4hVar, Object obj) {
        super(beanSerializerBase, a4hVar, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        super(beanSerializerBase, set);
    }
}
