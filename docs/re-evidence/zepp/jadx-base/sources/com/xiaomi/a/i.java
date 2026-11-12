package com.xiaomi.a;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public class i extends ReferenceTypeSerializer<Optional<?>> {
    public i(ReferenceType referenceType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(referenceType, z, typeSerializer, jsonSerializer);
    }

    public i(i iVar, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z) {
        super(iVar, beanProperty, typeSerializer, jsonSerializer, nameTransformer, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean _isValuePresent(Optional<?> optional) {
        return optional.isPresent();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object _getReferenced(Optional<?> optional) {
        return optional.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object _getReferencedIfPresent(Optional<?> optional) {
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<Optional<?>> withContentInclusion(Object obj, boolean z) {
        return new i(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<Optional<?>> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer) {
        return new i(this, beanProperty, typeSerializer, jsonSerializer, nameTransformer, this._suppressableValue, this._suppressNulls);
    }
}
