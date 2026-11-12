package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public final class ach extends ReferenceTypeDeserializer<Optional<?>> {
    private static final long serialVersionUID = 1;

    public ach(JavaType javaType, b bVar, q4q q4qVar, esd<?> esdVar) {
        super(javaType, bVar, q4qVar, esdVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, defpackage.esd, defpackage.z1h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Optional<?> getNullValue(DeserializationContext deserializationContext) {
        return Optional.a();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object getReferenced(Optional<?> optional) {
        return optional.b();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Optional<?> referenceValue(Object obj) {
        return Optional.e(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Optional<?> updateReference(Optional<?> optional, Object obj) {
        return Optional.e(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ach withResolved(q4q q4qVar, esd<?> esdVar) {
        return new ach(this._fullType, this._valueInstantiator, q4qVar, esdVar);
    }
}
