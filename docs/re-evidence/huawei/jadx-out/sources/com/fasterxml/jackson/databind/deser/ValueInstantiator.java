package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.LogicalType;
import defpackage.aai;
import defpackage.yi;
import defpackage.ym;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ValueInstantiator {

    public interface Gettable {
        ValueInstantiator getValueInstantiator();
    }

    public boolean canCreateFromBigDecimal() {
        return false;
    }

    public boolean canCreateFromBigInteger() {
        return false;
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

    public boolean canCreateUsingDelegate() {
        return false;
    }

    public ValueInstantiator createContextual(DeserializationContext deserializationContext, BeanDescription beanDescription) throws ym {
        return this;
    }

    public AnnotatedWithParams getArrayDelegateCreator() {
        return null;
    }

    public JavaType getArrayDelegateType(yi yiVar) {
        return null;
    }

    public AnnotatedWithParams getDefaultCreator() {
        return null;
    }

    public AnnotatedWithParams getDelegateCreator() {
        return null;
    }

    public JavaType getDelegateType(yi yiVar) {
        return null;
    }

    public SettableBeanProperty[] getFromObjectArguments(yi yiVar) {
        return null;
    }

    public AnnotatedWithParams getWithArgsCreator() {
        return null;
    }

    public Class<?> getValueClass() {
        return Object.class;
    }

    public String getValueTypeDesc() {
        Class<?> valueClass = getValueClass();
        if (valueClass == null) {
            return "UNKNOWN";
        }
        return valueClass.getName();
    }

    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public boolean canCreateUsingDefault() {
        return getDefaultCreator() != null;
    }

    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no default no-arguments constructor found", new Object[0]);
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no creator with arguments specified", new Object[0]);
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, SettableBeanProperty[] settableBeanPropertyArr, aai aaiVar) throws IOException {
        return createFromObjectWith(deserializationContext, aaiVar.e(settableBeanPropertyArr));
    }

    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no delegate creator specified", new Object[0]);
    }

    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no array delegate creator specified", new Object[0]);
    }

    public Object createFromString(DeserializationContext deserializationContext, String str) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, deserializationContext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
    }

    public Object createFromInt(DeserializationContext deserializationContext, int i) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i));
    }

    public Object createFromLong(DeserializationContext deserializationContext, long j) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j));
    }

    public Object createFromBigInteger(DeserializationContext deserializationContext, BigInteger bigInteger) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
    }

    public Object createFromDouble(DeserializationContext deserializationContext, double d) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
    }

    public Object createFromBigDecimal(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
    }

    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z));
    }

    @Deprecated
    protected Object _createFromStringFallbacks(DeserializationContext deserializationContext, String str) throws IOException {
        if (str.isEmpty() && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return null;
        }
        if (canCreateFromBoolean() && deserializationContext.findCoercionAction(LogicalType.Boolean, Boolean.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
            String strTrim = str.trim();
            if ("true".equals(strTrim)) {
                return createFromBoolean(deserializationContext, true);
            }
            if ("false".equals(strTrim)) {
                return createFromBoolean(deserializationContext, false);
            }
        }
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, deserializationContext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
    }

    public static class b extends ValueInstantiator implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Class<?> f4114a;

        public b(Class<?> cls) {
            this.f4114a = cls;
        }

        public b(JavaType javaType) {
            this.f4114a = javaType.getRawClass();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public String getValueTypeDesc() {
            return this.f4114a.getName();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Class<?> getValueClass() {
            return this.f4114a;
        }
    }
}
