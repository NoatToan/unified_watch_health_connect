package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.esd;
import defpackage.q4q;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeWrappedDeserializer extends esd<Object> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final esd<Object> _deserializer;
    protected final q4q _typeDeserializer;

    public TypeWrappedDeserializer(q4q q4qVar, esd<?> esdVar) {
        this._typeDeserializer = q4qVar;
        this._deserializer = esdVar;
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserializeWithType(jsonParser, deserializationContext, this._typeDeserializer);
    }

    @Override // defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // defpackage.esd
    public esd<?> getDelegatee() {
        return this._deserializer.getDelegatee();
    }

    @Override // defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }

    @Override // defpackage.esd
    public Collection<Object> getKnownPropertyNames() {
        return this._deserializer.getKnownPropertyNames();
    }

    @Override // defpackage.esd, defpackage.z1h
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getNullValue(deserializationContext);
    }

    @Override // defpackage.esd
    public Class<?> handledType() {
        return this._deserializer.handledType();
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._deserializer.supportsUpdate(deserializationConfig);
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext, obj);
    }
}
