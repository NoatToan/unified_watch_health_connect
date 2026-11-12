package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.aj4;
import defpackage.esd;
import defpackage.q4q;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements aj4 {
    private static final long serialVersionUID = 2;
    protected final JavaType _fullType;
    protected final esd<Object> _valueDeserializer;
    protected final b _valueInstantiator;
    protected final q4q _valueTypeDeserializer;

    @Deprecated
    public ReferenceTypeDeserializer(JavaType javaType, q4q q4qVar, esd<?> esdVar) {
        this(javaType, null, q4qVar, esdVar);
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        esd<?> esdVar = this._valueDeserializer;
        esd<?> esdVarFindContextualValueDeserializer = esdVar == null ? deserializationContext.findContextualValueDeserializer(this._fullType.getReferencedType(), beanProperty) : deserializationContext.handleSecondaryContextualization(esdVar, beanProperty, this._fullType.getReferencedType());
        q4q q4qVarForProperty = this._valueTypeDeserializer;
        if (q4qVarForProperty != null) {
            q4qVarForProperty = q4qVarForProperty.forProperty(beanProperty);
        }
        return (esdVarFindContextualValueDeserializer == this._valueDeserializer && q4qVarForProperty == this._valueTypeDeserializer) ? this : withResolved(q4qVarForProperty, esdVarFindContextualValueDeserializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.esd
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        b bVar = this._valueInstantiator;
        if (bVar != null) {
            return (T) deserialize(jsonParser, deserializationContext, bVar.createUsingDefault(deserializationContext));
        }
        q4q q4qVar = this._valueTypeDeserializer;
        return (T) referenceValue(q4qVar == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        if (jsonParser.K() == JsonToken.VALUE_NULL) {
            return getNullValue(deserializationContext);
        }
        q4q q4qVar2 = this._valueTypeDeserializer;
        return q4qVar2 == null ? deserialize(jsonParser, deserializationContext) : referenceValue(q4qVar2.deserializeTypedFromAny(jsonParser, deserializationContext));
    }

    @Override // defpackage.esd
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    @Override // defpackage.esd
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // defpackage.esd, defpackage.z1h
    public abstract T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;

    public abstract Object getReferenced(T t);

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._fullType;
    }

    public abstract T referenceValue(Object obj);

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        esd<Object> esdVar = this._valueDeserializer;
        if (esdVar == null) {
            return null;
        }
        return esdVar.supportsUpdate(deserializationConfig);
    }

    public abstract T updateReference(T t, Object obj);

    public abstract ReferenceTypeDeserializer<T> withResolved(q4q q4qVar, esd<?> esdVar);

    public ReferenceTypeDeserializer(JavaType javaType, b bVar, q4q q4qVar, esd<?> esdVar) {
        super(javaType);
        this._valueInstantiator = bVar;
        this._fullType = javaType;
        this._valueDeserializer = esdVar;
        this._valueTypeDeserializer = q4qVar;
    }

    @Override // defpackage.esd
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        Object objDeserializeWithType;
        Object objDeserializeWithType2;
        if (!this._valueDeserializer.supportsUpdate(deserializationContext.getConfig()).equals(Boolean.FALSE) && this._valueTypeDeserializer == null) {
            Object referenced = getReferenced(t);
            if (referenced == null) {
                q4q q4qVar = this._valueTypeDeserializer;
                if (q4qVar == null) {
                    objDeserializeWithType2 = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    objDeserializeWithType2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                }
                return referenceValue(objDeserializeWithType2);
            }
            objDeserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext, referenced);
        } else {
            q4q q4qVar2 = this._valueTypeDeserializer;
            if (q4qVar2 == null) {
                objDeserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar2);
            }
        }
        return updateReference(t, objDeserializeWithType);
    }
}
