package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import defpackage.aj4;
import defpackage.bj4;
import defpackage.bqk;
import defpackage.esd;
import defpackage.ij1;
import defpackage.ldi;
import defpackage.q4q;
import defpackage.qdi;
import defpackage.qqd;
import defpackage.vzd;
import defpackage.z1h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements aj4, bqk {
    private static final long serialVersionUID = 1;
    protected esd<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected final vzd _keyDeserializer;
    protected ldi _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final esd<Object> _valueDeserializer;
    protected final com.fasterxml.jackson.databind.deser.b _valueInstantiator;
    protected final q4q _valueTypeDeserializer;

    public static class a extends com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a {
        public final b c;
        public final Map<Object, Object> d;
        public final Object e;

        public a(b bVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.d = new LinkedHashMap();
            this.c = bVar;
            this.e = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a
        public void c(Object obj, Object obj2) throws IOException {
            this.c.c(obj, obj2);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f7652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<Object, Object> f7653b;
        public List<a> c = new ArrayList();

        public b(Class<?> cls, Map<Object, Object> map) {
            this.f7652a = cls;
            this.f7653b = map;
        }

        public com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a a(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            a aVar = new a(this, unresolvedForwardReference, this.f7652a, obj);
            this.c.add(aVar);
            return aVar;
        }

        public void b(Object obj, Object obj2) {
            if (this.c.isEmpty()) {
                this.f7653b.put(obj, obj2);
            } else {
                List<a> list = this.c;
                list.get(list.size() - 1).d.put(obj, obj2);
            }
        }

        public void c(Object obj, Object obj2) throws IOException {
            Iterator<a> it = this.c.iterator();
            Map<Object, Object> map = this.f7653b;
            while (it.hasNext()) {
                a next = it.next();
                if (next.d(obj)) {
                    it.remove();
                    map.put(next.e, obj2);
                    map.putAll(next.d);
                    return;
                }
                map = next.d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public MapDeserializer(JavaType javaType, com.fasterxml.jackson.databind.deser.b bVar, vzd vzdVar, esd<Object> esdVar, q4q q4qVar) {
        super(javaType, (z1h) null, (Boolean) null);
        this._keyDeserializer = vzdVar;
        this._valueDeserializer = esdVar;
        this._valueTypeDeserializer = q4qVar;
        this._valueInstantiator = bVar;
        this._hasDefaultCreator = bVar.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, vzdVar);
    }

    private void handleUnresolvedReference(DeserializationContext deserializationContext, b bVar, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        if (bVar == null) {
            deserializationContext.reportInputMismatch(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        }
        unresolvedForwardReference.getRoid().a(bVar.a(unresolvedForwardReference, obj));
    }

    public Map<Object, Object> _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strJ;
        Object objDeserialize;
        ldi ldiVar = this._propertyBasedCreator;
        qdi qdiVarG = ldiVar.g(jsonParser, deserializationContext, null);
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
        } else {
            strJ = jsonParser.y0(JsonToken.FIELD_NAME) ? jsonParser.J() : null;
        }
        while (strJ != null) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(strJ)) {
                SettableBeanProperty settableBeanPropertyE = ldiVar.e(strJ);
                if (settableBeanPropertyE == null) {
                    Object objDeserializeKey = this._keyDeserializer.deserializeKey(strJ, deserializationContext);
                    try {
                        if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                            objDeserialize = q4qVar == null ? esdVar.deserialize(jsonParser, deserializationContext) : esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                        } else if (!this._skipNullValues) {
                            objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                        }
                        qdiVarG.d(objDeserializeKey, objDeserialize);
                    } catch (Exception e) {
                        wrapAndThrow(e, this._containerType.getRawClass(), strJ);
                        return null;
                    }
                } else if (qdiVarG.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.G0();
                    try {
                        Map<Object, Object> map = (Map) ldiVar.a(deserializationContext, qdiVarG);
                        _readAndBind(jsonParser, deserializationContext, map);
                        return map;
                    } catch (Exception e2) {
                        return (Map) wrapAndThrow(e2, this._containerType.getRawClass(), strJ);
                    }
                }
            } else {
                jsonParser.O0();
            }
            strJ = jsonParser.E0();
        }
        try {
            return (Map) ldiVar.a(deserializationContext, qdiVarG);
        } catch (Exception e3) {
            wrapAndThrow(e3, this._containerType.getRawClass(), strJ);
            return null;
        }
    }

    public final boolean _isStdKeyDeser(JavaType javaType, vzd vzdVar) {
        JavaType keyType;
        if (vzdVar == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(vzdVar);
    }

    public final void _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strJ;
        Object objDeserialize;
        vzd vzdVar = this._keyDeserializer;
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        boolean z = esdVar.getObjectIdReader() != null;
        b bVar = z ? new b(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
        } else {
            JsonToken jsonTokenK = jsonParser.K();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenK != jsonToken) {
                if (jsonTokenK == JsonToken.END_OBJECT) {
                    return;
                } else {
                    deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                }
            }
            strJ = jsonParser.J();
        }
        while (strJ != null) {
            Object objDeserializeKey = vzdVar.deserializeKey(strJ, deserializationContext);
            JsonToken jsonTokenG0 = jsonParser.G0();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(strJ)) {
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        objDeserialize = q4qVar == null ? esdVar.deserialize(jsonParser, deserializationContext) : esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                    } else if (!this._skipNullValues) {
                        objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                    }
                    if (z) {
                        bVar.b(objDeserializeKey, objDeserialize);
                    } else {
                        map.put(objDeserializeKey, objDeserialize);
                    }
                } catch (UnresolvedForwardReference e) {
                    handleUnresolvedReference(deserializationContext, bVar, objDeserializeKey, e);
                } catch (Exception e2) {
                    wrapAndThrow(e2, map, strJ);
                }
            } else {
                jsonParser.O0();
            }
            strJ = jsonParser.E0();
        }
    }

    public final void _readAndBindStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strJ;
        Object objDeserialize;
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        boolean z = esdVar.getObjectIdReader() != null;
        b bVar = z ? new b(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
        } else {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenK != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strJ = jsonParser.J();
        }
        while (strJ != null) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(strJ)) {
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        objDeserialize = q4qVar == null ? esdVar.deserialize(jsonParser, deserializationContext) : esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                    } else if (!this._skipNullValues) {
                        objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                    }
                    if (z) {
                        bVar.b(strJ, objDeserialize);
                    } else {
                        map.put(strJ, objDeserialize);
                    }
                } catch (UnresolvedForwardReference e) {
                    handleUnresolvedReference(deserializationContext, bVar, strJ, e);
                } catch (Exception e2) {
                    wrapAndThrow(e2, map, strJ);
                }
            } else {
                jsonParser.O0();
            }
            strJ = jsonParser.E0();
        }
    }

    public final void _readAndUpdate(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strJ;
        Object objDeserialize;
        vzd vzdVar = this._keyDeserializer;
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
        } else {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenK != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strJ = jsonParser.J();
        }
        while (strJ != null) {
            Object objDeserializeKey = vzdVar.deserializeKey(strJ, deserializationContext);
            JsonToken jsonTokenG0 = jsonParser.G0();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(strJ)) {
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        Object obj = map.get(objDeserializeKey);
                        if (obj != null) {
                            objDeserialize = esdVar.deserialize(jsonParser, deserializationContext, obj);
                        } else {
                            objDeserialize = q4qVar == null ? esdVar.deserialize(jsonParser, deserializationContext) : esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                        }
                        if (objDeserialize != obj) {
                            map.put(objDeserializeKey, objDeserialize);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(objDeserializeKey, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e) {
                    wrapAndThrow(e, map, strJ);
                }
            } else {
                jsonParser.O0();
            }
            strJ = jsonParser.E0();
        }
    }

    public final void _readAndUpdateStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strJ;
        Object objDeserialize;
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
        } else {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenK != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strJ = jsonParser.J();
        }
        while (strJ != null) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(strJ)) {
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        Object obj = map.get(strJ);
                        if (obj != null) {
                            objDeserialize = esdVar.deserialize(jsonParser, deserializationContext, obj);
                        } else {
                            objDeserialize = q4qVar == null ? esdVar.deserialize(jsonParser, deserializationContext) : esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                        }
                        if (objDeserialize != obj) {
                            map.put(strJ, objDeserialize);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(strJ, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e) {
                    wrapAndThrow(e, map, strJ);
                }
            } else {
                jsonParser.O0();
            }
            strJ = jsonParser.E0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [vzd] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.MapDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer] */
    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        JsonIgnoreProperties.Value valueFindPropertyIgnorals;
        Object objCreateContextual = this._keyDeserializer;
        if (objCreateContextual == null) {
            objCreateContextual = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (objCreateContextual instanceof bj4) {
            objCreateContextual = ((bj4) objCreateContextual).createContextual(deserializationContext, beanProperty);
        }
        ?? r2 = objCreateContextual;
        esd<?> esdVarFindConvertingContentDeserializer = this._valueDeserializer;
        if (beanProperty != null) {
            esdVarFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, esdVarFindConvertingContentDeserializer);
        }
        JavaType contentType = this._containerType.getContentType();
        esd<?> esdVarFindContextualValueDeserializer = esdVarFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(esdVarFindConvertingContentDeserializer, beanProperty, contentType);
        q4q q4qVarForProperty = this._valueTypeDeserializer;
        if (q4qVarForProperty != null) {
            q4qVarForProperty = q4qVarForProperty.forProperty(beanProperty);
        }
        q4q q4qVar = q4qVarForProperty;
        Set<String> hashSet = this._ignorableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (StdDeserializer._neitherNull(annotationIntrospector, beanProperty) && (member = beanProperty.getMember()) != null && (valueFindPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member)) != null) {
            Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnorals.findIgnoredForDeserialization();
            if (!setFindIgnoredForDeserialization.isEmpty()) {
                hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                Iterator<String> it = setFindIgnoredForDeserialization.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
        }
        return withResolved(r2, q4qVar, esdVarFindContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, esdVarFindContextualValueDeserializer), hashSet);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public esd<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public final Class<?> getMapClass() {
        return this._containerType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public com.fasterxml.jackson.databind.deser.b getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null;
    }

    @Override // defpackage.bqk
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = ldi.c(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    public void setIgnorableProperties(String[] strArr) {
        this._ignorableProperties = (strArr == null || strArr.length == 0) ? null : ij1.a(strArr);
    }

    public MapDeserializer withResolved(vzd vzdVar, q4q q4qVar, esd<?> esdVar, z1h z1hVar, Set<String> set) {
        return (this._keyDeserializer == vzdVar && this._valueDeserializer == esdVar && this._valueTypeDeserializer == q4qVar && this._nullProvider == z1hVar && this._ignorableProperties == set) ? this : new MapDeserializer(this, vzdVar, esdVar, q4qVar, z1hVar, set);
    }

    @Override // defpackage.esd
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        esd<Object> esdVar = this._delegateDeserializer;
        if (esdVar != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar.deserialize(jsonParser, deserializationContext));
        }
        if (!this._hasDefaultCreator) {
            return (Map) deserializationContext.handleMissingInstantiator(getMapClass(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
        }
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK != JsonToken.START_OBJECT && jsonTokenK != JsonToken.FIELD_NAME && jsonTokenK != JsonToken.END_OBJECT) {
            if (jsonTokenK == JsonToken.VALUE_STRING) {
                return (Map) this._valueInstantiator.createFromString(deserializationContext, jsonParser.d0());
            }
            return _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._standardStringKey) {
            _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this._ignorableProperties = set;
    }

    public MapDeserializer(MapDeserializer mapDeserializer) {
        super(mapDeserializer);
        this._keyDeserializer = mapDeserializer._keyDeserializer;
        this._valueDeserializer = mapDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapDeserializer._valueTypeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = mapDeserializer._ignorableProperties;
        this._standardStringKey = mapDeserializer._standardStringKey;
    }

    public MapDeserializer(MapDeserializer mapDeserializer, vzd vzdVar, esd<Object> esdVar, q4q q4qVar, z1h z1hVar, Set<String> set) {
        super(mapDeserializer, z1hVar, mapDeserializer._unwrapSingle);
        this._keyDeserializer = vzdVar;
        this._valueDeserializer = esdVar;
        this._valueTypeDeserializer = q4qVar;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._standardStringKey = _isStdKeyDeser(this._containerType, vzdVar);
    }

    @Override // defpackage.esd
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        jsonParser.M0(map);
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK != JsonToken.START_OBJECT && jsonTokenK != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
        }
        if (this._standardStringKey) {
            _readAndUpdateStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndUpdate(jsonParser, deserializationContext, map);
        return map;
    }
}
