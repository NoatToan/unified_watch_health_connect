package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.esd;
import defpackage.z1h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class NullsAsEmptyProvider implements z1h, Serializable {
    private static final long serialVersionUID = 1;
    protected final esd<?> _deserializer;

    public NullsAsEmptyProvider(esd<?> esdVar) {
        this._deserializer = esdVar;
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // defpackage.z1h
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }
}
