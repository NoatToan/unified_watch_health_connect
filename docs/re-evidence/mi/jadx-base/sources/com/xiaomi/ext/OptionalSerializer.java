package com.xiaomi.ext;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.xiaomi.common.Optional;
import defpackage.e5q;
import defpackage.eud;

/* JADX INFO: loaded from: classes7.dex */
public class OptionalSerializer extends ReferenceTypeSerializer<Optional<?>> {
    private static final long serialVersionUID = 1;

    public OptionalSerializer(ReferenceType referenceType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        super(referenceType, z, e5qVar, eudVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<Optional<?>> withContentInclusion(Object obj, boolean z) {
        return new OptionalSerializer(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<Optional<?>> withResolved(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, NameTransformer nameTransformer) {
        return new OptionalSerializer(this, beanProperty, e5qVar, eudVar, nameTransformer, this._suppressableValue, this._suppressNulls);
    }

    public OptionalSerializer(OptionalSerializer optionalSerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, NameTransformer nameTransformer, Object obj, boolean z) {
        super(optionalSerializer, beanProperty, e5qVar, eudVar, nameTransformer, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object _getReferenced(Optional<?> optional) {
        return optional.b();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object _getReferencedIfPresent(Optional<?> optional) {
        if (optional.c()) {
            return optional.b();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public boolean _isValuePresent(Optional<?> optional) {
        return optional.c();
    }
}
