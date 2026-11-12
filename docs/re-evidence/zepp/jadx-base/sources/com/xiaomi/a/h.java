package com.xiaomi.a;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
final class h extends ReferenceTypeDeserializer<Optional<?>> {
    public h(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(javaType, valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new h(this._fullType, this._valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Optional<?> getNullValue(DeserializationContext deserializationContext) {
        return Optional.empty();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Optional<?> updateReference(Optional<?> optional, Object obj) {
        return Optional.ofNullable(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Optional<?> referenceValue(Object obj) {
        return Optional.ofNullable(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object getReferenced(Optional<?> optional) {
        return optional.get();
    }
}
