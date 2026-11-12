package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.e5q;
import defpackage.eud;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class AtomicReferenceSerializer extends ReferenceTypeSerializer<AtomicReference<?>> {
    private static final long serialVersionUID = 1;

    public AtomicReferenceSerializer(ReferenceType referenceType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        super(referenceType, z, e5qVar, eudVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> withContentInclusion(Object obj, boolean z) {
        return new AtomicReferenceSerializer(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> withResolved(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, NameTransformer nameTransformer) {
        return new AtomicReferenceSerializer(this, beanProperty, e5qVar, eudVar, nameTransformer, this._suppressableValue, this._suppressNulls);
    }

    public AtomicReferenceSerializer(AtomicReferenceSerializer atomicReferenceSerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, NameTransformer nameTransformer, Object obj, boolean z) {
        super(atomicReferenceSerializer, beanProperty, e5qVar, eudVar, nameTransformer, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object _getReferenced(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object _getReferencedIfPresent(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public boolean _isValuePresent(AtomicReference<?> atomicReference) {
        return atomicReference.get() != null;
    }
}
