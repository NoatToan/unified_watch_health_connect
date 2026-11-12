package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.a4h;
import defpackage.e5q;
import defpackage.eud;
import defpackage.wwl;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class BeanAsArraySerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanSerializerBase _defaultSerializer;

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (a4h) null);
        this._defaultSerializer = beanSerializerBase;
    }

    private boolean hasSingleElement(wwl wwlVar) {
        return ((this._filteredProps == null || wwlVar.getActiveView() == null) ? this._props : this._filteredProps).length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    @Override // defpackage.eud
    public boolean isUnwrappingSerializer() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(wwlVar)) {
            serializeAsArray(obj, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.L0();
        jsonGenerator.M(obj);
        serializeAsArray(obj, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    public final void serializeAsArray(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || wwlVar.getActiveView() == null) ? this._props : this._filteredProps;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter == null) {
                    jsonGenerator.s0();
                } else {
                    beanPropertyWriter.serializeAsElement(obj, jsonGenerator, wwlVar);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]");
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingExceptionFrom = JsonMappingException.from(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingExceptionFrom.prependPath(new JsonMappingException.Reference(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]"));
            throw jsonMappingExceptionFrom;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, defpackage.eud
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, wwlVar, e5qVar);
            return;
        }
        jsonGenerator.M(obj);
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(e5qVar, obj, JsonToken.START_ARRAY);
        e5qVar.g(jsonGenerator, writableTypeId_typeIdDef);
        serializeAsArray(obj, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeId_typeIdDef);
    }

    public String toString() {
        return "BeanAsArraySerializer for " + handledType().getName();
    }

    @Override // defpackage.eud
    public eud<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return this._defaultSerializer.unwrappingSerializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public /* bridge */ /* synthetic */ BeanSerializerBase withIgnorals(Set set) {
        return withIgnorals((Set<String>) set);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(a4h a4hVar) {
        return this._defaultSerializer.withObjectIdWriter(a4hVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, defpackage.eud
    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanAsArraySerializer(this, this._objectIdWriter, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanAsArraySerializer withIgnorals(Set<String> set) {
        return new BeanAsArraySerializer(this, set);
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        super(beanSerializerBase, set);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, a4h a4hVar, Object obj) {
        super(beanSerializerBase, a4hVar, obj);
        this._defaultSerializer = beanSerializerBase;
    }
}
