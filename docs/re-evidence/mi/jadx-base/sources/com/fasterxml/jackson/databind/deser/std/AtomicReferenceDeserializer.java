package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.b;
import defpackage.esd;
import defpackage.q4q;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    private static final long serialVersionUID = 1;

    public AtomicReferenceDeserializer(JavaType javaType, b bVar, q4q q4qVar, esd<?> esdVar) {
        super(javaType, bVar, q4qVar, esdVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return new AtomicReference();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ ReferenceTypeDeserializer<AtomicReference<Object>> withResolved2(q4q q4qVar, esd esdVar) {
        return withResolved(q4qVar, (esd<?>) esdVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, defpackage.esd, defpackage.z1h
    public AtomicReference<Object> getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicReference<>(this._valueDeserializer.getNullValue(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public Object getReferenced(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public AtomicReference<Object> referenceValue(Object obj) {
        return new AtomicReference<>(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public AtomicReference<Object> updateReference(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public ReferenceTypeDeserializer<AtomicReference<Object>> withResolved(q4q q4qVar, esd<?> esdVar) {
        return new AtomicReferenceDeserializer(this._fullType, this._valueInstantiator, q4qVar, esdVar);
    }
}
