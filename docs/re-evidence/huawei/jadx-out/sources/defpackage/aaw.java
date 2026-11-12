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
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class aaw extends ContainerDeserializerBase<Collection<Object>> implements ContextualDeserializer {
    private static final long serialVersionUID = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final JsonDeserializer<Object> f184a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final TypeDeserializer f185c;
    protected final JsonDeserializer<Object> d;
    protected final ValueInstantiator e;

    public aaw(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, jsonDeserializer, typeDeserializer, valueInstantiator, null, null, null);
    }

    protected aaw(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator, JsonDeserializer<Object> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this.f184a = jsonDeserializer;
        this.f185c = typeDeserializer;
        this.e = valueInstantiator;
        this.d = jsonDeserializer2;
    }

    protected aaw a(JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return new aaw(this._containerType, jsonDeserializer2, typeDeserializer, this.e, jsonDeserializer, nullValueProvider, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this.f184a == null && this.f185c == null && this.d == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public aaw createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JsonDeserializer<Object> jsonDeserializerFindDeserializer;
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        ValueInstantiator valueInstantiator = this.e;
        if (valueInstantiator == null) {
            jsonDeserializerFindDeserializer = null;
        } else if (valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this.e.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                deserializationContext.reportBadDefinition(this._containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", this._containerType, this.e.getClass().getName()));
            }
            jsonDeserializerFindDeserializer = findDeserializer(deserializationContext, delegateType, beanProperty);
        } else if (this.e.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this.e.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                deserializationContext.reportBadDefinition(this._containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", this._containerType, this.e.getClass().getName()));
            }
            jsonDeserializerFindDeserializer = findDeserializer(deserializationContext, arrayDelegateType, beanProperty);
        } else {
            jsonDeserializerFindDeserializer = null;
        }
        JsonDeserializer<Object> jsonDeserializer = jsonDeserializerFindDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this.f184a);
        JavaType contentType = this._containerType.getContentType();
        if (jsonDeserializerFindConvertingContentDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, contentType);
        }
        JsonDeserializer<?> jsonDeserializer2 = jsonDeserializerHandleSecondaryContextualization;
        TypeDeserializer typeDeserializerForProperty = this.f185c;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        TypeDeserializer typeDeserializer = typeDeserializerForProperty;
        NullValueProvider nullValueProviderFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer2);
        return (Objects.equals(boolFindFormatFeature, this._unwrapSingle) && nullValueProviderFindContentNullProvider == this._nullProvider && jsonDeserializer == this.d && jsonDeserializer2 == this.f184a && typeDeserializer == this.f185c) ? this : a(jsonDeserializer, jsonDeserializer2, typeDeserializer, nullValueProviderFindContentNullProvider, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this.f184a;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this.d;
        if (jsonDeserializer != null) {
            return (Collection) this.e.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (jsonParser.isExpectedStartArrayToken()) {
            return c(jsonParser, deserializationContext, d(deserializationContext));
        }
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return b(jsonParser, deserializationContext, jsonParser.getText());
        }
        return d(jsonParser, deserializationContext, d(deserializationContext));
    }

    protected Collection<Object> d(DeserializationContext deserializationContext) throws IOException {
        return (Collection) this.e.createUsingDefault(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (jsonParser.isExpectedStartArrayToken()) {
            return c(jsonParser, deserializationContext, collection);
        }
        return d(jsonParser, deserializationContext, collection);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    protected Collection<Object> b(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        Class<?> clsHandledType = handledType();
        if (str.isEmpty()) {
            CoercionAction coercionAction_checkCoercionFail = _checkCoercionFail(deserializationContext, deserializationContext.findCoercionAction(logicalType(), clsHandledType, CoercionInputShape.EmptyString), clsHandledType, str, "empty String (\"\")");
            if (coercionAction_checkCoercionFail != null) {
                return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionAction_checkCoercionFail, clsHandledType, "empty String (\"\")");
            }
        } else if (_isBlank(str)) {
            return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType(), clsHandledType, CoercionAction.Fail), clsHandledType, "blank String (all whitespace)");
        }
        return d(jsonParser, deserializationContext, d(deserializationContext));
    }

    protected Collection<Object> c(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        jsonParser.setCurrentValue(collection);
        JsonDeserializer<Object> jsonDeserializer = this.f184a;
        if (jsonDeserializer.getObjectIdReader() != null) {
            return b(jsonParser, deserializationContext, collection);
        }
        TypeDeserializer typeDeserializer = this.f185c;
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                return collection;
            }
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
                collection.add(objDeserializeWithType);
            } catch (Exception e) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    ahw.i(e);
                }
                throw ym.wrapWithPath(e, collection, collection.size());
            }
        }
    }

    protected final Collection<Object> d(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        if (this._unwrapSingle != Boolean.TRUE && (this._unwrapSingle != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        JsonDeserializer<Object> jsonDeserializer = this.f184a;
        TypeDeserializer typeDeserializer = this.f185c;
        try {
            if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
                if (this._skipNullValues) {
                    return collection;
                }
                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            } else if (typeDeserializer == null) {
                objDeserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
            collection.add(objDeserializeWithType);
            return collection;
        } catch (Exception e) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                ahw.i(e);
            }
            throw ym.wrapWithPath(e, Object.class, collection.size());
        }
    }

    protected Collection<Object> b(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return d(jsonParser, deserializationContext, collection);
        }
        jsonParser.setCurrentValue(collection);
        JsonDeserializer<Object> jsonDeserializer = this.f184a;
        TypeDeserializer typeDeserializer = this.f185c;
        c cVar = new c(this._containerType.getContentType().getRawClass(), collection);
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                return collection;
            }
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
                cVar.b(objDeserializeWithType);
            } catch (zm e) {
                e.e().a(cVar.e(e));
            } catch (Exception e2) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    ahw.i(e2);
                }
                throw ym.wrapWithPath(e2, collection, collection.size());
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<b> f188b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<?> f189c;
        private final Collection<Object> e;

        public c(Class<?> cls, Collection<Object> collection) {
            this.f189c = cls;
            this.e = collection;
        }

        public void b(Object obj) {
            if (this.f188b.isEmpty()) {
                this.e.add(obj);
            } else {
                List<b> list = this.f188b;
                list.get(list.size() - 1).f187b.add(obj);
            }
        }

        public ReadableObjectId.Referring e(zm zmVar) {
            b bVar = new b(this, zmVar, this.f189c);
            this.f188b.add(bVar);
            return bVar;
        }

        public void a(Object obj, Object obj2) throws IOException {
            Iterator<b> it = this.f188b.iterator();
            Collection collection = this.e;
            while (it.hasNext()) {
                b next = it.next();
                if (next.hasId(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.f187b);
                    return;
                }
                collection = next.f187b;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    static final class b extends ReadableObjectId.Referring {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Object> f187b;

        b(c cVar, zm zmVar, Class<?> cls) {
            super(zmVar, cls);
            this.f187b = new ArrayList();
            this.f186a = cVar;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            this.f186a.a(obj, obj2);
        }
    }
}
