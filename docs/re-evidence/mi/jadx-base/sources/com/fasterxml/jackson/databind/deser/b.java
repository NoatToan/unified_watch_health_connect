package com.fasterxml.jackson.databind.deser;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import defpackage.qdi;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public Object _createFromStringFallbacks(DeserializationContext deserializationContext, String str) throws IOException {
        if (canCreateFromBoolean()) {
            String strTrim = str.trim();
            if ("true".equals(strTrim)) {
                return createFromBoolean(deserializationContext, true);
            }
            if ("false".equals(strTrim)) {
                return createFromBoolean(deserializationContext, false);
            }
        }
        if (str.length() == 0 && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return null;
        }
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, deserializationContext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
    }

    public boolean canCreateFromBoolean() {
        return false;
    }

    public boolean canCreateFromDouble() {
        return false;
    }

    public boolean canCreateFromInt() {
        return false;
    }

    public boolean canCreateFromLong() {
        return false;
    }

    public boolean canCreateFromObjectWith() {
        return false;
    }

    public boolean canCreateFromString() {
        return false;
    }

    public boolean canCreateUsingArrayDelegate() {
        return false;
    }

    public boolean canCreateUsingDefault() {
        return getDefaultCreator() != null;
    }

    public boolean canCreateUsingDelegate() {
        return false;
    }

    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z));
    }

    public Object createFromDouble(DeserializationContext deserializationContext, double d) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
    }

    public Object createFromInt(DeserializationContext deserializationContext, int i) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i));
    }

    public Object createFromLong(DeserializationContext deserializationContext, long j) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j));
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no creator with arguments specified", new Object[0]);
    }

    public Object createFromString(DeserializationContext deserializationContext, String str) throws IOException {
        return _createFromStringFallbacks(deserializationContext, str);
    }

    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no array delegate creator specified", new Object[0]);
    }

    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no default no-arguments constructor found", new Object[0]);
    }

    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no delegate creator specified", new Object[0]);
    }

    public AnnotatedWithParams getArrayDelegateCreator() {
        return null;
    }

    public JavaType getArrayDelegateType(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AnnotatedWithParams getDefaultCreator() {
        return null;
    }

    public AnnotatedWithParams getDelegateCreator() {
        return null;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return null;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AnnotatedParameter getIncompleteParameter() {
        return null;
    }

    public Class<?> getValueClass() {
        return Object.class;
    }

    public String getValueTypeDesc() {
        Class<?> valueClass = getValueClass();
        return valueClass == null ? DeviceTypes.UNKNOWN : valueClass.getName();
    }

    public AnnotatedWithParams getWithArgsCreator() {
        return null;
    }

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f7640a;

        public a(Class<?> cls) {
            this.f7640a = cls;
        }

        @Override // com.fasterxml.jackson.databind.deser.b
        public Class<?> getValueClass() {
            return this.f7640a;
        }

        @Override // com.fasterxml.jackson.databind.deser.b
        public String getValueTypeDesc() {
            return this.f7640a.getName();
        }

        public a(JavaType javaType) {
            this.f7640a = javaType.getRawClass();
        }
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, SettableBeanProperty[] settableBeanPropertyArr, qdi qdiVar) throws IOException {
        return createFromObjectWith(deserializationContext, qdiVar.g(settableBeanPropertyArr));
    }
}
