package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.aj4;
import defpackage.bqk;
import defpackage.esd;
import defpackage.q4q;
import defpackage.z1h;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DelegatingDeserializer extends StdDeserializer<Object> implements aj4, bqk {
    private static final long serialVersionUID = 1;
    protected final esd<?> _delegatee;

    public DelegatingDeserializer(esd<?> esdVar) {
        super(esdVar.handledType());
        this._delegatee = esdVar;
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        esd<?> esdVarHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(this._delegatee, beanProperty, deserializationContext.constructType(this._delegatee.handledType()));
        return esdVarHandleSecondaryContextualization == this._delegatee ? this : newDelegatingInstance(esdVarHandleSecondaryContextualization);
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._delegatee.deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return this._delegatee.deserializeWithType(jsonParser, deserializationContext, q4qVar);
    }

    @Override // defpackage.esd
    public SettableBeanProperty findBackReference(String str) {
        return this._delegatee.findBackReference(str);
    }

    @Override // defpackage.esd
    public esd<?> getDelegatee() {
        return this._delegatee;
    }

    @Override // defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._delegatee.getEmptyValue(deserializationContext);
    }

    @Override // defpackage.esd
    public Collection<Object> getKnownPropertyNames() {
        return this._delegatee.getKnownPropertyNames();
    }

    @Override // defpackage.esd
    public AccessPattern getNullAccessPattern() {
        return this._delegatee.getNullAccessPattern();
    }

    @Override // defpackage.esd, defpackage.z1h
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._delegatee.getNullValue(deserializationContext);
    }

    @Override // defpackage.esd
    public ObjectIdReader getObjectIdReader() {
        return this._delegatee.getObjectIdReader();
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return this._delegatee.isCachable();
    }

    public abstract esd<?> newDelegatingInstance(esd<?> esdVar);

    @Override // defpackage.esd
    public esd<?> replaceDelegatee(esd<?> esdVar) {
        return esdVar == this._delegatee ? this : newDelegatingInstance(esdVar);
    }

    @Override // defpackage.bqk
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        z1h z1hVar = this._delegatee;
        if (z1hVar instanceof bqk) {
            ((bqk) z1hVar).resolve(deserializationContext);
        }
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._delegatee.supportsUpdate(deserializationConfig);
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this._delegatee.deserialize(jsonParser, deserializationContext, obj);
    }
}
