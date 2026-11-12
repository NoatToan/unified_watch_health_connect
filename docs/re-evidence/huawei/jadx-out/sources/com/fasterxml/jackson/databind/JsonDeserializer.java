package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.aah;
import defpackage.yi;
import defpackage.ym;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public abstract class JsonDeserializer<T> implements NullValueProvider {
    public abstract T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public JsonDeserializer<?> getDelegatee() {
        return null;
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    @Deprecated
    public T getNullValue() {
        return null;
    }

    public aah getObjectIdReader() {
        return null;
    }

    public Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public LogicalType logicalType() {
        return null;
    }

    public Boolean supportsUpdate(yi yiVar) {
        return null;
    }

    public JsonDeserializer<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        deserializationContext.handleBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, T t) throws IOException {
        deserializationContext.handleBadMerge(this);
        return deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    public JsonDeserializer<?> replaceDelegatee(JsonDeserializer<?> jsonDeserializer) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public T getNullValue(DeserializationContext deserializationContext) throws ym {
        return getNullValue();
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return getNullValue(deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        throw new IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    @Deprecated
    public Object getEmptyValue() {
        return getNullValue();
    }

    public static abstract class None extends JsonDeserializer<Object> {
        private None() {
        }
    }
}
