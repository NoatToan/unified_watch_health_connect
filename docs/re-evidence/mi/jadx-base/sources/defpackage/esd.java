package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class esd<T> implements z1h {

    public static abstract class a extends esd<Object> {
    }

    public abstract T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        if (deserializationContext.isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return deserialize(jsonParser, deserializationContext);
        }
        throw new UnsupportedOperationException("Cannot update object of type " + t.getClass().getName() + " (by deserializer of type " + getClass().getName() + ")");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        throw new IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    public esd<?> getDelegatee() {
        return null;
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Deprecated
    public T getNullValue() {
        return null;
    }

    public ObjectIdReader getObjectIdReader() {
        return null;
    }

    public Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public esd<?> replaceDelegatee(esd<?> esdVar) {
        throw new UnsupportedOperationException();
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public esd<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }

    @Deprecated
    public Object getEmptyValue() {
        return getNullValue();
    }

    @Override // defpackage.z1h
    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue();
    }
}
