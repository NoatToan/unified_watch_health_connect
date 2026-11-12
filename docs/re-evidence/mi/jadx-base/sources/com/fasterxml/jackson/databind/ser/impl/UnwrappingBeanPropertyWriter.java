package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.c4h;
import defpackage.e5q;
import defpackage.eud;
import defpackage.itd;
import defpackage.ksd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer _nameTransformer;

    public class a extends ksd.a {
        public a(wwl wwlVar, itd itdVar) {
            super(wwlVar);
        }

        @Override // defpackage.ksd
        public itd d(JavaType javaType) throws JsonMappingException {
            return null;
        }
    }

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter);
        this._nameTransformer = nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void _depositSchemaProperty(c4h c4hVar, zsd zsdVar) {
        zsd zsdVarW = zsdVar.w("properties");
        if (zsdVarW != null) {
            Iterator<Map.Entry<String, zsd>> itV = zsdVarW.v();
            while (itV.hasNext()) {
                Map.Entry<String, zsd> next = itV.next();
                String key = next.getKey();
                NameTransformer nameTransformer = this._nameTransformer;
                if (nameTransformer != null) {
                    key = nameTransformer.transform(key);
                }
                c4hVar.q0(key, next.getValue());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public eud<Object> _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.a aVar, Class<?> cls, wwl wwlVar) throws JsonMappingException {
        JavaType javaType = this._nonTrivialBaseType;
        eud<Object> eudVarFindValueSerializer = javaType != null ? wwlVar.findValueSerializer(wwlVar.constructSpecializedType(javaType, cls), this) : wwlVar.findValueSerializer(cls, this);
        NameTransformer nameTransformerChainedTransformer = this._nameTransformer;
        if (eudVarFindValueSerializer.isUnwrappingSerializer() && (eudVarFindValueSerializer instanceof UnwrappingBeanSerializer)) {
            nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((UnwrappingBeanSerializer) eudVarFindValueSerializer)._nameTransformer);
        }
        eud<Object> eudVarUnwrappingSerializer = eudVarFindValueSerializer.unwrappingSerializer(nameTransformerChainedTransformer);
        this._dynamicSerializers = this._dynamicSerializers.h(cls, eudVarUnwrappingSerializer);
        return eudVarUnwrappingSerializer;
    }

    public UnwrappingBeanPropertyWriter _new(NameTransformer nameTransformer, SerializedString serializedString) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer, serializedString);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void assignSerializer(eud<Object> eudVar) {
        if (eudVar != null) {
            NameTransformer nameTransformerChainedTransformer = this._nameTransformer;
            if (eudVar.isUnwrappingSerializer() && (eudVar instanceof UnwrappingBeanSerializer)) {
                nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((UnwrappingBeanSerializer) eudVar)._nameTransformer);
            }
            eudVar = eudVar.unwrappingSerializer(nameTransformerChainedTransformer);
        }
        super.assignSerializer(eudVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(itd itdVar, wwl wwlVar) throws JsonMappingException {
        eud<Object> eudVarUnwrappingSerializer = wwlVar.findValueSerializer(getType(), this).unwrappingSerializer(this._nameTransformer);
        if (eudVarUnwrappingSerializer.isUnwrappingSerializer()) {
            eudVarUnwrappingSerializer.acceptJsonFormatVisitor(new a(wwlVar, itdVar), getType());
        } else {
            super.depositSchemaProperty(itdVar, wwlVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public boolean isUnwrapping() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        Object obj2 = get(obj);
        if (obj2 == null) {
            return;
        }
        eud<?> eudVar_findAndAddDynamic = this._serializer;
        if (eudVar_findAndAddDynamic == null) {
            Class<?> cls = obj2.getClass();
            com.fasterxml.jackson.databind.ser.impl.a aVar = this._dynamicSerializers;
            eud<?> eudVarI = aVar.i(cls);
            eudVar_findAndAddDynamic = eudVarI == null ? _findAndAddDynamic(aVar, cls, wwlVar) : eudVarI;
        }
        Object obj3 = this._suppressableValue;
        if (obj3 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj3) {
                if (eudVar_findAndAddDynamic.isEmpty(wwlVar, obj2)) {
                    return;
                }
            } else if (obj3.equals(obj2)) {
                return;
            }
        }
        if (obj2 == obj && _handleSelfReference(obj, jsonGenerator, wwlVar, eudVar_findAndAddDynamic)) {
            return;
        }
        if (!eudVar_findAndAddDynamic.isUnwrappingSerializer()) {
            jsonGenerator.o0(this._name);
        }
        e5q e5qVar = this._typeSerializer;
        if (e5qVar == null) {
            eudVar_findAndAddDynamic.serialize(obj2, jsonGenerator, wwlVar);
        } else {
            eudVar_findAndAddDynamic.serializeWithType(obj2, jsonGenerator, wwlVar, e5qVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public UnwrappingBeanPropertyWriter rename(NameTransformer nameTransformer) {
        return _new(NameTransformer.chainedTransformer(nameTransformer, this._nameTransformer), new SerializedString(nameTransformer.transform(this._name.getValue())));
    }

    public UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer nameTransformer, SerializedString serializedString) {
        super(unwrappingBeanPropertyWriter, serializedString);
        this._nameTransformer = nameTransformer;
    }
}
