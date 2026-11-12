package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.z1h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class NullsConstantProvider implements z1h, Serializable {
    private static final long serialVersionUID = 1;
    protected final AccessPattern _access;
    protected final Object _nullValue;
    private static final NullsConstantProvider SKIPPER = new NullsConstantProvider(null);
    private static final NullsConstantProvider NULLER = new NullsConstantProvider(null);

    public NullsConstantProvider(Object obj) {
        this._nullValue = obj;
        this._access = obj == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
    }

    public static NullsConstantProvider forValue(Object obj) {
        return obj == null ? NULLER : new NullsConstantProvider(obj);
    }

    public static boolean isNuller(z1h z1hVar) {
        return z1hVar == NULLER;
    }

    public static boolean isSkipper(z1h z1hVar) {
        return z1hVar == SKIPPER;
    }

    public static NullsConstantProvider nuller() {
        return NULLER;
    }

    public static NullsConstantProvider skipper() {
        return SKIPPER;
    }

    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    @Override // defpackage.z1h
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
