package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.b;
import defpackage.aj4;
import defpackage.esd;
import defpackage.q4q;
import defpackage.qqd;
import defpackage.z1h;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements aj4 {
    private static final long serialVersionUID = 1;
    protected final esd<Object> _delegateDeserializer;
    protected final esd<String> _valueDeserializer;
    protected final b _valueInstantiator;

    public StringCollectionDeserializer(JavaType javaType, esd<?> esdVar, b bVar) {
        this(javaType, bVar, null, esdVar, esdVar, null);
    }

    private Collection<String> deserializeUsingCustom(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, esd<String> esdVar) throws IOException {
        Object objDeserialize;
        while (true) {
            if (jsonParser.F0() == null) {
                JsonToken jsonTokenK = jsonParser.K();
                if (jsonTokenK == JsonToken.END_ARRAY) {
                    return collection;
                }
                if (jsonTokenK != JsonToken.VALUE_NULL) {
                    objDeserialize = esdVar.deserialize(jsonParser, deserializationContext);
                } else if (!this._skipNullValues) {
                    objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserialize = esdVar.deserialize(jsonParser, deserializationContext);
            }
            collection.add((String) objDeserialize);
        }
    }

    private final Collection<String> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str_parseString;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType.getRawClass(), jsonParser);
        }
        esd<String> esdVar = this._valueDeserializer;
        if (jsonParser.K() != JsonToken.VALUE_NULL) {
            str_parseString = esdVar == null ? _parseString(jsonParser, deserializationContext) : esdVar.deserialize(jsonParser, deserializationContext);
        } else {
            if (this._skipNullValues) {
                return collection;
            }
            str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
        }
        collection.add(str_parseString);
        return collection;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        esd<?> esdVarFindDeserializer;
        esd<?> esdVarHandleSecondaryContextualization;
        b bVar = this._valueInstantiator;
        if (bVar == null) {
            esdVarFindDeserializer = null;
        } else if (bVar.getArrayDelegateCreator() != null) {
            esdVarFindDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig()), beanProperty);
        } else if (this._valueInstantiator.getDelegateCreator() != null) {
            esdVarFindDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getDelegateType(deserializationContext.getConfig()), beanProperty);
        } else {
            esdVarFindDeserializer = null;
        }
        esd<String> esdVar = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        if (esdVar == null) {
            esdVarHandleSecondaryContextualization = findConvertingContentDeserializer(deserializationContext, beanProperty, esdVar);
            if (esdVarHandleSecondaryContextualization == null) {
                esdVarHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
            }
        } else {
            esdVarHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(esdVar, beanProperty, contentType);
        }
        return withResolved(esdVarFindDeserializer, isDefaultDeserializer(esdVarHandleSecondaryContextualization) ? null : esdVarHandleSecondaryContextualization, findContentNullProvider(deserializationContext, beanProperty, esdVarHandleSecondaryContextualization), findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public esd<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public b getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return this._valueDeserializer == null && this._delegateDeserializer == null;
    }

    public StringCollectionDeserializer withResolved(esd<?> esdVar, esd<?> esdVar2, z1h z1hVar, Boolean bool) {
        return (this._unwrapSingle == bool && this._nullProvider == z1hVar && this._valueDeserializer == esdVar2 && this._delegateDeserializer == esdVar) ? this : new StringCollectionDeserializer(this._containerType, this._valueInstantiator, esdVar, esdVar2, z1hVar, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringCollectionDeserializer(JavaType javaType, b bVar, esd<?> esdVar, esd<?> esdVar2, z1h z1hVar, Boolean bool) {
        super(javaType, z1hVar, bool);
        this._valueDeserializer = esdVar2;
        this._valueInstantiator = bVar;
        this._delegateDeserializer = esdVar;
    }

    @Override // defpackage.esd
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        esd<Object> esdVar = this._delegateDeserializer;
        if (esdVar != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection<String>) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    @Override // defpackage.esd
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str_parseString;
        if (!jsonParser.B0()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        esd<String> esdVar = this._valueDeserializer;
        if (esdVar != null) {
            return deserializeUsingCustom(jsonParser, deserializationContext, collection, esdVar);
        }
        while (true) {
            try {
                String strF0 = jsonParser.F0();
                if (strF0 != null) {
                    collection.add(strF0);
                } else {
                    JsonToken jsonTokenK = jsonParser.K();
                    if (jsonTokenK == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (jsonTokenK == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        str_parseString = _parseString(jsonParser, deserializationContext);
                    }
                    collection.add(str_parseString);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath(e, collection, collection.size());
            }
        }
    }
}
