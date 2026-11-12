package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.b;
import defpackage.aj4;
import defpackage.bqk;
import defpackage.esd;
import defpackage.h04;
import defpackage.ldi;
import defpackage.q4q;
import defpackage.qdi;
import defpackage.vzd;
import defpackage.z1h;
import java.io.IOException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes4.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements aj4, bqk {
    private static final long serialVersionUID = 1;
    protected esd<Object> _delegateDeserializer;
    protected final Class<?> _enumClass;
    protected vzd _keyDeserializer;
    protected ldi _propertyBasedCreator;
    protected esd<Object> _valueDeserializer;
    protected final b _valueInstantiator;
    protected final q4q _valueTypeDeserializer;

    @Deprecated
    public EnumMapDeserializer(JavaType javaType, vzd vzdVar, esd<?> esdVar, q4q q4qVar) {
        this(javaType, null, vzdVar, esdVar, q4qVar, null);
    }

    public EnumMap<?, ?> _deserializeUsingProperties(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strJ;
        Object objDeserialize;
        ldi ldiVar = this._propertyBasedCreator;
        qdi qdiVarG = ldiVar.g(jsonParser, deserializationContext, null);
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
        } else {
            strJ = jsonParser.y0(JsonToken.FIELD_NAME) ? jsonParser.J() : null;
        }
        while (strJ != null) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            SettableBeanProperty settableBeanPropertyE = ldiVar.e(strJ);
            if (settableBeanPropertyE == null) {
                Enum r5 = (Enum) this._keyDeserializer.deserializeKey(strJ, deserializationContext);
                if (r5 != null) {
                    try {
                        if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                            q4q q4qVar = this._valueTypeDeserializer;
                            objDeserialize = q4qVar == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                        } else if (!this._skipNullValues) {
                            objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                        }
                        qdiVarG.d(r5, objDeserialize);
                    } catch (Exception e) {
                        wrapAndThrow(e, this._containerType.getRawClass(), strJ);
                        return null;
                    }
                } else {
                    if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, strJ, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                    }
                    jsonParser.G0();
                    jsonParser.O0();
                }
            } else if (qdiVarG.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                jsonParser.G0();
                try {
                    return deserialize(jsonParser, deserializationContext, (EnumMap) ldiVar.a(deserializationContext, qdiVarG));
                } catch (Exception e2) {
                    return (EnumMap) wrapAndThrow(e2, this._containerType.getRawClass(), strJ);
                }
            }
            strJ = jsonParser.E0();
        }
        try {
            return (EnumMap) ldiVar.a(deserializationContext, qdiVarG);
        } catch (Exception e3) {
            wrapAndThrow(e3, this._containerType.getRawClass(), strJ);
            return null;
        }
    }

    public EnumMap<?, ?> constructMap(DeserializationContext deserializationContext) throws JsonMappingException {
        b bVar = this._valueInstantiator;
        if (bVar == null) {
            return new EnumMap<>(this._enumClass);
        }
        try {
            return !bVar.canCreateUsingDefault() ? (EnumMap) deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), null, "no default constructor found", new Object[0]) : (EnumMap) this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return (EnumMap) h04.c0(deserializationContext, e);
        }
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        vzd vzdVarFindKeyDeserializer = this._keyDeserializer;
        if (vzdVarFindKeyDeserializer == null) {
            vzdVarFindKeyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        }
        esd<?> esdVar = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        esd<?> esdVarFindContextualValueDeserializer = esdVar == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(esdVar, beanProperty, contentType);
        q4q q4qVarForProperty = this._valueTypeDeserializer;
        if (q4qVarForProperty != null) {
            q4qVarForProperty = q4qVarForProperty.forProperty(beanProperty);
        }
        return withResolved(vzdVarFindKeyDeserializer, esdVarFindContextualValueDeserializer, q4qVarForProperty, findContentNullProvider(deserializationContext, beanProperty, esdVarFindContextualValueDeserializer));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public esd<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return constructMap(deserializationContext);
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null;
    }

    @Override // defpackage.bqk
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        b bVar = this._valueInstantiator;
        if (bVar != null) {
            if (bVar.canCreateUsingDelegate()) {
                JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
                if (delegateType == null) {
                    JavaType javaType = this._containerType;
                    deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
                return;
            }
            if (!this._valueInstantiator.canCreateUsingArrayDelegate()) {
                if (this._valueInstantiator.canCreateFromObjectWith()) {
                    this._propertyBasedCreator = ldi.c(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                    return;
                }
                return;
            }
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
    }

    public EnumMapDeserializer withResolved(vzd vzdVar, esd<?> esdVar, q4q q4qVar, z1h z1hVar) {
        return (vzdVar == this._keyDeserializer && z1hVar == this._nullProvider && esdVar == this._valueDeserializer && q4qVar == this._valueTypeDeserializer) ? this : new EnumMapDeserializer(this, vzdVar, esdVar, q4qVar, z1hVar);
    }

    public EnumMapDeserializer(JavaType javaType, b bVar, vzd vzdVar, esd<?> esdVar, q4q q4qVar, z1h z1hVar) {
        super(javaType, z1hVar, (Boolean) null);
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = vzdVar;
        this._valueDeserializer = esdVar;
        this._valueTypeDeserializer = q4qVar;
        this._valueInstantiator = bVar;
    }

    @Override // defpackage.esd
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingProperties(jsonParser, deserializationContext);
        }
        esd<Object> esdVar = this._delegateDeserializer;
        if (esdVar != null) {
            return (EnumMap) this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar.deserialize(jsonParser, deserializationContext));
        }
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK != JsonToken.START_OBJECT && jsonTokenK != JsonToken.FIELD_NAME && jsonTokenK != JsonToken.END_OBJECT) {
            if (jsonTokenK == JsonToken.VALUE_STRING) {
                return (EnumMap) this._valueInstantiator.createFromString(deserializationContext, jsonParser.d0());
            }
            return _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        return deserialize(jsonParser, deserializationContext, (EnumMap) constructMap(deserializationContext));
    }

    public EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, vzd vzdVar, esd<?> esdVar, q4q q4qVar, z1h z1hVar) {
        super(enumMapDeserializer, z1hVar, enumMapDeserializer._unwrapSingle);
        this._enumClass = enumMapDeserializer._enumClass;
        this._keyDeserializer = vzdVar;
        this._valueDeserializer = esdVar;
        this._valueTypeDeserializer = q4qVar;
        this._valueInstantiator = enumMapDeserializer._valueInstantiator;
        this._delegateDeserializer = enumMapDeserializer._delegateDeserializer;
        this._propertyBasedCreator = enumMapDeserializer._propertyBasedCreator;
    }

    @Override // defpackage.esd
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) throws IOException {
        String strJ;
        Object objDeserializeWithType;
        jsonParser.M0(enumMap);
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
        } else {
            JsonToken jsonTokenK = jsonParser.K();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenK != jsonToken) {
                if (jsonTokenK == JsonToken.END_OBJECT) {
                    return enumMap;
                }
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strJ = jsonParser.J();
        }
        while (strJ != null) {
            Enum r3 = (Enum) this._keyDeserializer.deserializeKey(strJ, deserializationContext);
            JsonToken jsonTokenG0 = jsonParser.G0();
            if (r3 == null) {
                if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, strJ, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                }
                jsonParser.O0();
            } else {
                try {
                    if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (q4qVar == null) {
                        objDeserializeWithType = esdVar.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                    }
                    enumMap.put(r3, objDeserializeWithType);
                } catch (Exception e) {
                    return (EnumMap) wrapAndThrow(e, enumMap, strJ);
                }
            }
            strJ = jsonParser.E0();
        }
        return enumMap;
    }
}
