package defpackage;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public class afz extends ReferenceTypeSerializer<AtomicReference<?>> {
    private static final long serialVersionUID = 1;

    public afz(ahi ahiVar, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(ahiVar, z, typeSerializer, jsonSerializer);
    }

    protected afz(afz afzVar, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z) {
        super(afzVar, beanProperty, typeSerializer, jsonSerializer, nameTransformer, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer) {
        return new afz(this, beanProperty, typeSerializer, jsonSerializer, nameTransformer, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> withContentInclusion(Object obj, boolean z) {
        return new afz(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, obj, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean _isValuePresent(AtomicReference<?> atomicReference) {
        return atomicReference.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object _getReferenced(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object _getReferencedIfPresent(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }
}
