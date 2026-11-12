package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes21.dex */
public class aax extends ContainerDeserializerBase<EnumMap<?, ?>> implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected aag f190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected KeyDeserializer f191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Class<?> f192c;
    protected JsonDeserializer<Object> d;
    protected JsonDeserializer<Object> e;
    protected final ValueInstantiator g;
    protected final TypeDeserializer h;

    public aax(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        super(javaType, nullValueProvider, (Boolean) null);
        this.f192c = javaType.getKeyType().getRawClass();
        this.f191b = keyDeserializer;
        this.e = jsonDeserializer;
        this.h = typeDeserializer;
        this.g = valueInstantiator;
    }

    protected aax(aax aaxVar, KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        super(aaxVar, nullValueProvider, aaxVar._unwrapSingle);
        this.f192c = aaxVar.f192c;
        this.f191b = keyDeserializer;
        this.e = jsonDeserializer;
        this.h = typeDeserializer;
        this.g = aaxVar.g;
        this.d = aaxVar.d;
        this.f190a = aaxVar.f190a;
    }

    public aax d(KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        return (keyDeserializer == this.f191b && nullValueProvider == this._nullProvider && jsonDeserializer == this.e && typeDeserializer == this.h) ? this : new aax(this, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws ym {
        ValueInstantiator valueInstantiator = this.g;
        if (valueInstantiator != null) {
            if (valueInstantiator.canCreateUsingDelegate()) {
                JavaType delegateType = this.g.getDelegateType(deserializationContext.getConfig());
                if (delegateType == null) {
                    deserializationContext.reportBadDefinition(this._containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", this._containerType, this.g.getClass().getName()));
                }
                this.d = findDeserializer(deserializationContext, delegateType, null);
                return;
            }
            if (this.g.canCreateUsingArrayDelegate()) {
                JavaType arrayDelegateType = this.g.getArrayDelegateType(deserializationContext.getConfig());
                if (arrayDelegateType == null) {
                    deserializationContext.reportBadDefinition(this._containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", this._containerType, this.g.getClass().getName()));
                }
                this.d = findDeserializer(deserializationContext, arrayDelegateType, null);
                return;
            }
            if (this.g.canCreateFromObjectWith()) {
                this.f190a = aag.c(deserializationContext, this.g, this.g.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        KeyDeserializer keyDeserializerFindKeyDeserializer = this.f191b;
        if (keyDeserializerFindKeyDeserializer == null) {
            keyDeserializerFindKeyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        }
        JsonDeserializer<?> jsonDeserializer = this.e;
        JavaType contentType = this._containerType.getContentType();
        if (jsonDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, contentType);
        }
        TypeDeserializer typeDeserializerForProperty = this.h;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        return d(keyDeserializerFindKeyDeserializer, jsonDeserializerHandleSecondaryContextualization, typeDeserializerForProperty, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerHandleSecondaryContextualization));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this.e == null && this.f191b == null && this.h == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return d(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this.f190a != null) {
            return b(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this.d;
        if (jsonDeserializer != null) {
            return (EnumMap) this.g.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId != 1 && iCurrentTokenId != 2) {
            if (iCurrentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iCurrentTokenId != 5) {
                if (iCurrentTokenId == 6) {
                    return _deserializeFromString(jsonParser, deserializationContext);
                }
                return (EnumMap) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            }
        }
        return deserialize(jsonParser, deserializationContext, d(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) throws IOException {
        String strCurrentName;
        Object objDeserializeWithType;
        jsonParser.setCurrentValue(enumMap);
        JsonDeserializer<Object> jsonDeserializer = this.e;
        TypeDeserializer typeDeserializer = this.h;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
                if (jsonTokenCurrentToken != JsonToken.END_OBJECT) {
                    deserializationContext.reportWrongTokenException(this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
                }
                return enumMap;
            }
            strCurrentName = jsonParser.currentName();
        }
        while (strCurrentName != null) {
            Enum r3 = (Enum) this.f191b.deserializeKey(strCurrentName, deserializationContext);
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (r3 == null) {
                if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) deserializationContext.handleWeirdStringValue(this.f192c, strCurrentName, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                }
                jsonParser.skipChildren();
            } else {
                try {
                    if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (typeDeserializer == null) {
                        objDeserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    enumMap.put(r3, objDeserializeWithType);
                } catch (Exception e) {
                    return (EnumMap) wrapAndThrow(deserializationContext, e, enumMap, strCurrentName);
                }
            }
            strCurrentName = jsonParser.nextFieldName();
        }
        return enumMap;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    protected EnumMap<?, ?> d(DeserializationContext deserializationContext) throws ym {
        ValueInstantiator valueInstantiator = this.g;
        if (valueInstantiator == null) {
            return new EnumMap<>(this.f192c);
        }
        try {
            if (!valueInstantiator.canCreateUsingDefault()) {
                return (EnumMap) deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), null, "no default constructor found", new Object[0]);
            }
            return (EnumMap) this.g.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return (EnumMap) ahw.b(deserializationContext, e);
        }
    }

    public EnumMap<?, ?> b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strCurrentName;
        Object objDeserializeWithType;
        aag aagVar = this.f190a;
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, null);
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            strCurrentName = jsonParser.hasToken(JsonToken.FIELD_NAME) ? jsonParser.currentName() : null;
        }
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyE = aagVar.e(strCurrentName);
            if (settableBeanPropertyE != null) {
                if (aaiVarE.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.nextToken();
                    try {
                        return deserialize(jsonParser, deserializationContext, (EnumMap) aagVar.a(deserializationContext, aaiVarE));
                    } catch (Exception e) {
                        return (EnumMap) wrapAndThrow(deserializationContext, e, this._containerType.getRawClass(), strCurrentName);
                    }
                }
            } else {
                Enum r5 = (Enum) this.f191b.deserializeKey(strCurrentName, deserializationContext);
                if (r5 == null) {
                    if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) deserializationContext.handleWeirdStringValue(this.f192c, strCurrentName, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                    }
                    jsonParser.nextToken();
                    jsonParser.skipChildren();
                } else {
                    try {
                        if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                            if (!this._skipNullValues) {
                                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                            }
                        } else {
                            TypeDeserializer typeDeserializer = this.h;
                            if (typeDeserializer == null) {
                                objDeserializeWithType = this.e.deserialize(jsonParser, deserializationContext);
                            } else {
                                objDeserializeWithType = this.e.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                            }
                        }
                        aaiVarE.b(r5, objDeserializeWithType);
                    } catch (Exception e2) {
                        wrapAndThrow(deserializationContext, e2, this._containerType.getRawClass(), strCurrentName);
                        return null;
                    }
                }
            }
            strCurrentName = jsonParser.nextFieldName();
        }
        try {
            return (EnumMap) aagVar.a(deserializationContext, aaiVarE);
        } catch (Exception e3) {
            wrapAndThrow(deserializationContext, e3, this._containerType.getRawClass(), strCurrentName);
            return null;
        }
    }
}
