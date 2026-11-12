package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import defpackage.aj4;
import defpackage.esd;
import defpackage.h04;
import defpackage.q4q;
import defpackage.qqd;
import defpackage.z1h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements aj4 {
    private static final long serialVersionUID = -1;
    protected final esd<Object> _delegateDeserializer;
    protected final esd<Object> _valueDeserializer;
    protected final com.fasterxml.jackson.databind.deser.b _valueInstantiator;
    protected final q4q _valueTypeDeserializer;

    public static final class a extends com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a {
        public final b c;
        public final List<Object> d;

        public a(b bVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            super(unresolvedForwardReference, cls);
            this.d = new ArrayList();
            this.c = bVar;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a
        public void c(Object obj, Object obj2) throws IOException {
            this.c.c(obj, obj2);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f7647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Collection<Object> f7648b;
        public List<a> c = new ArrayList();

        public b(Class<?> cls, Collection<Object> collection) {
            this.f7647a = cls;
            this.f7648b = collection;
        }

        public void a(Object obj) {
            if (this.c.isEmpty()) {
                this.f7648b.add(obj);
            } else {
                List<a> list = this.c;
                list.get(list.size() - 1).d.add(obj);
            }
        }

        public com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a b(UnresolvedForwardReference unresolvedForwardReference) {
            a aVar = new a(this, unresolvedForwardReference, this.f7647a);
            this.c.add(aVar);
            return aVar;
        }

        public void c(Object obj, Object obj2) throws IOException {
            Iterator<a> it = this.c.iterator();
            Collection collection = this.f7648b;
            while (it.hasNext()) {
                a next = it.next();
                if (next.d(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.d);
                    return;
                }
                collection = next.d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public CollectionDeserializer(JavaType javaType, esd<Object> esdVar, q4q q4qVar, com.fasterxml.jackson.databind.deser.b bVar) {
        this(javaType, esdVar, q4qVar, bVar, null, null, null);
    }

    public Collection<Object> _deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserialize;
        if (!jsonParser.B0()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        jsonParser.M0(collection);
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        b bVar = new b(this._containerType.getContentType().getRawClass(), collection);
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            if (jsonTokenG0 == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
                if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                    objDeserialize = q4qVar == null ? esdVar.deserialize(jsonParser, deserializationContext) : esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                } else if (!this._skipNullValues) {
                    objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                }
                bVar.a(objDeserialize);
            } catch (UnresolvedForwardReference e) {
                e.getRoid().a(bVar.b(e));
            } catch (Exception e2) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    h04.f0(e2);
                }
                throw JsonMappingException.wrapWithPath(e2, collection, collection.size());
            }
        }
    }

    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return (Collection) this._valueInstantiator.createUsingDefault(deserializationContext);
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
    public com.fasterxml.jackson.databind.deser.b getValueInstantiator() {
        return this._valueInstantiator;
    }

    public final Collection<Object> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserialize;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType.getRawClass(), jsonParser);
        }
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        try {
            if (jsonParser.K() != JsonToken.VALUE_NULL) {
                objDeserialize = q4qVar == null ? esdVar.deserialize(jsonParser, deserializationContext) : esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
            } else {
                if (this._skipNullValues) {
                    return collection;
                }
                objDeserialize = this._nullProvider.getNullValue(deserializationContext);
            }
            collection.add(objDeserialize);
            return collection;
        } catch (Exception e) {
            throw JsonMappingException.wrapWithPath(e, Object.class, collection.size());
        }
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return this._valueDeserializer == null && this._valueTypeDeserializer == null && this._delegateDeserializer == null;
    }

    public CollectionDeserializer withResolved(esd<?> esdVar, esd<?> esdVar2, q4q q4qVar, z1h z1hVar, Boolean bool) {
        return new CollectionDeserializer(this._containerType, esdVar2, q4qVar, this._valueInstantiator, esdVar, z1hVar, bool);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    @Override // defpackage.aj4
    public CollectionDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        esd<Object> esdVarFindDeserializer;
        com.fasterxml.jackson.databind.deser.b bVar = this._valueInstantiator;
        if (bVar == null) {
            esdVarFindDeserializer = null;
        } else if (bVar.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            esdVarFindDeserializer = findDeserializer(deserializationContext, delegateType, beanProperty);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            esdVarFindDeserializer = findDeserializer(deserializationContext, arrayDelegateType, beanProperty);
        } else {
            esdVarFindDeserializer = null;
        }
        esd<Object> esdVar = esdVarFindDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        esd<?> esdVarFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType contentType = this._containerType.getContentType();
        esd<?> esdVarFindContextualValueDeserializer = esdVarFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(esdVarFindConvertingContentDeserializer, beanProperty, contentType);
        q4q q4qVarForProperty = this._valueTypeDeserializer;
        if (q4qVarForProperty != null) {
            q4qVarForProperty = q4qVarForProperty.forProperty(beanProperty);
        }
        q4q q4qVar = q4qVarForProperty;
        z1h z1hVarFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, esdVarFindContextualValueDeserializer);
        return (boolFindFormatFeature == this._unwrapSingle && z1hVarFindContentNullProvider == this._nullProvider && esdVar == this._delegateDeserializer && esdVarFindContextualValueDeserializer == this._valueDeserializer && q4qVar == this._valueTypeDeserializer) ? this : withResolved(esdVar, esdVarFindContextualValueDeserializer, q4qVar, z1hVarFindContentNullProvider, boolFindFormatFeature);
    }

    public CollectionDeserializer(JavaType javaType, esd<Object> esdVar, q4q q4qVar, com.fasterxml.jackson.databind.deser.b bVar, esd<Object> esdVar2, z1h z1hVar, Boolean bool) {
        super(javaType, z1hVar, bool);
        this._valueDeserializer = esdVar;
        this._valueTypeDeserializer = q4qVar;
        this._valueInstantiator = bVar;
        this._delegateDeserializer = esdVar2;
    }

    @Override // defpackage.esd
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        esd<Object> esdVar = this._delegateDeserializer;
        if (esdVar != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar.deserialize(jsonParser, deserializationContext));
        }
        if (jsonParser.y0(JsonToken.VALUE_STRING)) {
            String strD0 = jsonParser.d0();
            if (strD0.length() == 0) {
                return (Collection) this._valueInstantiator.createFromString(deserializationContext, strD0);
            }
        }
        return deserialize(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
    }

    public CollectionDeserializer(CollectionDeserializer collectionDeserializer) {
        super(collectionDeserializer);
        this._valueDeserializer = collectionDeserializer._valueDeserializer;
        this._valueTypeDeserializer = collectionDeserializer._valueTypeDeserializer;
        this._valueInstantiator = collectionDeserializer._valueInstantiator;
        this._delegateDeserializer = collectionDeserializer._delegateDeserializer;
    }

    @Override // defpackage.esd
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.B0()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        jsonParser.M0(collection);
        esd<Object> esdVar = this._valueDeserializer;
        if (esdVar.getObjectIdReader() != null) {
            return _deserializeWithObjectId(jsonParser, deserializationContext, collection);
        }
        q4q q4qVar = this._valueTypeDeserializer;
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            if (jsonTokenG0 == JsonToken.END_ARRAY) {
                return collection;
            }
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
                collection.add(objDeserializeWithType);
            } catch (Exception e) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    h04.f0(e);
                }
                throw JsonMappingException.wrapWithPath(e, collection, collection.size());
            }
        }
    }
}
