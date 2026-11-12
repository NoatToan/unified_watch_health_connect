package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public final class abo extends ContainerDeserializerBase<Collection<String>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JsonDeserializer<String> f228c;
    protected final JsonDeserializer<Object> d;
    protected final ValueInstantiator e;

    public abo(JavaType javaType, JsonDeserializer<?> jsonDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, null, jsonDeserializer, jsonDeserializer, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected abo(JavaType javaType, ValueInstantiator valueInstantiator, JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this.f228c = jsonDeserializer2;
        this.e = valueInstantiator;
        this.d = jsonDeserializer;
    }

    protected abo a(JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        return (Objects.equals(this._unwrapSingle, bool) && this._nullProvider == nullValueProvider && this.f228c == jsonDeserializer2 && this.d == jsonDeserializer) ? this : new abo(this._containerType, this.e, jsonDeserializer, jsonDeserializer2, nullValueProvider, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this.f228c == null && this.d == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JsonDeserializer<?> jsonDeserializerFindDeserializer;
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        ValueInstantiator valueInstantiator = this.e;
        if (valueInstantiator == null) {
            jsonDeserializerFindDeserializer = null;
        } else if (valueInstantiator.getArrayDelegateCreator() != null) {
            jsonDeserializerFindDeserializer = findDeserializer(deserializationContext, this.e.getArrayDelegateType(deserializationContext.getConfig()), beanProperty);
        } else if (this.e.getDelegateCreator() != null) {
            jsonDeserializerFindDeserializer = findDeserializer(deserializationContext, this.e.getDelegateType(deserializationContext.getConfig()), beanProperty);
        } else {
            jsonDeserializerFindDeserializer = null;
        }
        JsonDeserializer<String> jsonDeserializer = this.f228c;
        JavaType contentType = this._containerType.getContentType();
        if (jsonDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer);
            if (jsonDeserializerHandleSecondaryContextualization == null) {
                jsonDeserializerHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
            }
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, contentType);
        }
        return a(jsonDeserializerFindDeserializer, isDefaultDeserializer(jsonDeserializerHandleSecondaryContextualization) ? null : jsonDeserializerHandleSecondaryContextualization, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerHandleSecondaryContextualization), findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this.f228c;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this.d;
        if (jsonDeserializer != null) {
            return (Collection) this.e.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection) this.e.createUsingDefault(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str_parseString;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return a(jsonParser, deserializationContext, collection);
        }
        JsonDeserializer<String> jsonDeserializer = this.f228c;
        if (jsonDeserializer != null) {
            return d(jsonParser, deserializationContext, collection, jsonDeserializer);
        }
        while (true) {
            try {
                String strNextTextValue = jsonParser.nextTextValue();
                if (strNextTextValue != null) {
                    collection.add(strNextTextValue);
                } else {
                    JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
                    if (jsonTokenCurrentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        str_parseString = _parseString(jsonParser, deserializationContext);
                    }
                    collection.add(str_parseString);
                }
            } catch (Exception e) {
                throw ym.wrapWithPath(e, collection, collection.size());
            }
        }
    }

    private Collection<String> d(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, JsonDeserializer<String> jsonDeserializer) throws IOException {
        String strDeserialize;
        while (true) {
            try {
                if (jsonParser.nextTextValue() == null) {
                    JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
                    if (jsonTokenCurrentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            strDeserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        strDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    }
                } else {
                    strDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                collection.add(strDeserialize);
            } catch (Exception e) {
                throw ym.wrapWithPath(e, collection, collection.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    private final Collection<String> a(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str_parseString;
        if (this._unwrapSingle != Boolean.TRUE && (this._unwrapSingle != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                return _deserializeFromString(jsonParser, deserializationContext);
            }
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        JsonDeserializer<String> jsonDeserializer = this.f228c;
        if (jsonParser.currentToken() == JsonToken.VALUE_NULL) {
            if (this._skipNullValues) {
                return collection;
            }
            str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
        } else {
            try {
                str_parseString = jsonDeserializer == null ? _parseString(jsonParser, deserializationContext) : jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } catch (Exception e) {
                throw ym.wrapWithPath(e, collection, collection.size());
            }
        }
        collection.add(str_parseString);
        return collection;
    }
}
