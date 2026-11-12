package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public class aat extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    private static final long serialVersionUID = 1;

    public aat(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(javaType, valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aat withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new aat(this._fullType, this._valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicReference<Object> getNullValue(DeserializationContext deserializationContext) throws ym {
        return new AtomicReference<>(this._valueDeserializer.getNullValue(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return getNullValue(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicReference<Object> referenceValue(Object obj) {
        return new AtomicReference<>(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object getReferenced(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AtomicReference<Object> updateReference(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return Boolean.TRUE;
    }
}
