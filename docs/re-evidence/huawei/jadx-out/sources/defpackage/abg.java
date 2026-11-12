package defpackage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class abg extends ContainerDeserializerBase<Map<Object, Object>> implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ahy.d f207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Set<String> f208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f209c;
    protected Set<String> d;
    protected JsonDeserializer<Object> e;
    protected final KeyDeserializer f;
    protected final ValueInstantiator g;
    protected final JsonDeserializer<Object> h;
    protected aag i;
    protected boolean j;
    protected final TypeDeserializer m;

    public abg(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        this.f = keyDeserializer;
        this.h = jsonDeserializer;
        this.m = typeDeserializer;
        this.g = valueInstantiator;
        this.f209c = valueInstantiator.canCreateUsingDefault();
        this.e = null;
        this.i = null;
        this.j = c(javaType, keyDeserializer);
        this.f207a = null;
    }

    protected abg(abg abgVar, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Set<String> set, Set<String> set2) {
        super(abgVar, nullValueProvider, abgVar._unwrapSingle);
        this.f = keyDeserializer;
        this.h = jsonDeserializer;
        this.m = typeDeserializer;
        this.g = abgVar.g;
        this.i = abgVar.i;
        this.e = abgVar.e;
        this.f209c = abgVar.f209c;
        this.d = set;
        this.f208b = set2;
        this.f207a = ahy.a(set, set2);
        this.j = c(this._containerType, keyDeserializer);
    }

    protected abg b(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Set<String> set, Set<String> set2) {
        return (this.f == keyDeserializer && this.h == jsonDeserializer && this.m == typeDeserializer && this._nullProvider == nullValueProvider && this.d == set && this.f208b == set2) ? this : new abg(this, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider, set, set2);
    }

    protected final boolean c(JavaType javaType, KeyDeserializer keyDeserializer) {
        JavaType keyType;
        if (keyDeserializer == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(keyDeserializer);
    }

    public void d(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this.d = set;
        this.f207a = ahy.a(set, this.f208b);
    }

    public void c(Set<String> set) {
        this.f208b = set;
        this.f207a = ahy.a(this.d, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws ym {
        if (this.g.canCreateUsingDelegate()) {
            JavaType delegateType = this.g.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                deserializationContext.reportBadDefinition(this._containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", this._containerType, this.g.getClass().getName()));
            }
            this.e = findDeserializer(deserializationContext, delegateType, null);
        } else if (this.g.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this.g.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                deserializationContext.reportBadDefinition(this._containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", this._containerType, this.g.getClass().getName()));
            }
            this.e = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
        if (this.g.canCreateFromObjectWith()) {
            this.i = aag.c(deserializationContext, this.g, this.g.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this.j = c(this._containerType, this.f);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bd A[PHI: r0 r1
      0x00bd: PHI (r0v11 java.util.Set<java.lang.String>) = 
      (r0v10 java.util.Set<java.lang.String>)
      (r0v10 java.util.Set<java.lang.String>)
      (r0v12 java.util.Set<java.lang.String>)
      (r0v12 java.util.Set<java.lang.String>)
      (r0v12 java.util.Set<java.lang.String>)
     binds: [B:19:0x0049, B:21:0x004f, B:34:0x008b, B:36:0x0091, B:39:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r1v4 java.util.Set) = (r1v3 java.util.Set), (r1v3 java.util.Set), (r1v3 java.util.Set), (r1v3 java.util.Set), (r1v6 java.util.Set) binds: [B:19:0x0049, B:21:0x004f, B:34:0x008b, B:36:0x0091, B:39:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [abg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.fasterxml.jackson.databind.KeyDeserializer] */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        Set<String> set;
        Set set2;
        AnnotatedMember member;
        Set<String> setB;
        Object objCreateContextual = this.f;
        if (objCreateContextual == null) {
            objCreateContextual = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (objCreateContextual instanceof ContextualKeyDeserializer) {
            objCreateContextual = ((ContextualKeyDeserializer) objCreateContextual).createContextual(deserializationContext, beanProperty);
        }
        ?? r2 = objCreateContextual;
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = this.h;
        if (beanProperty != null) {
            jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializerFindConvertingContentDeserializer);
        }
        JavaType contentType = this._containerType.getContentType();
        if (jsonDeserializerFindConvertingContentDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, contentType);
        }
        JsonDeserializer<?> jsonDeserializer = jsonDeserializerHandleSecondaryContextualization;
        TypeDeserializer typeDeserializerForProperty = this.m;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        TypeDeserializer typeDeserializer = typeDeserializerForProperty;
        Set<String> hashSet = this.d;
        Set hashSet2 = this.f208b;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null) {
            set = hashSet;
            set2 = hashSet2;
        } else {
            yi config = deserializationContext.getConfig();
            JsonIgnoreProperties.b bVarFindPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, member);
            if (bVarFindPropertyIgnoralByName != null) {
                Set<String> setB2 = bVarFindPropertyIgnoralByName.b();
                if (!setB2.isEmpty()) {
                    hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                    Iterator<String> it = setB2.iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next());
                    }
                }
            }
            JsonIncludeProperties.b bVarFindPropertyInclusionByName = annotationIntrospector.findPropertyInclusionByName(config, member);
            if (bVarFindPropertyInclusionByName == null || (setB = bVarFindPropertyInclusionByName.b()) == null) {
                set = hashSet;
                set2 = hashSet2;
            } else {
                HashSet hashSet3 = new HashSet();
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setB);
                    set = hashSet;
                    set2 = hashSet2;
                } else {
                    for (String str : setB) {
                        if (hashSet2.contains(str)) {
                            hashSet3.add(str);
                        }
                    }
                    set2 = hashSet3;
                    set = hashSet;
                }
            }
        }
        return b(r2, typeDeserializer, jsonDeserializer, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer), set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this.h == null && this.f == null && this.m == null && this.d == null && this.f208b == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this.i != null) {
            return d(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this.e;
        if (jsonDeserializer != null) {
            return (Map) this.g.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (!this.f209c) {
            return (Map) deserializationContext.handleMissingInstantiator(c(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
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
                return (Map) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            }
        }
        Map<Object, Object> map = (Map) this.g.createUsingDefault(deserializationContext);
        if (this.j) {
            b(jsonParser, deserializationContext, map);
            return map;
        }
        d(jsonParser, deserializationContext, map);
        return map;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        jsonParser.setCurrentValue(map);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != JsonToken.START_OBJECT && jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(c(), jsonParser);
        }
        if (this.j) {
            a(jsonParser, deserializationContext, map);
            return map;
        }
        e(jsonParser, deserializationContext, map);
        return map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public final Class<?> c() {
        return this._containerType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    protected final void d(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        Object objDeserializeWithType;
        KeyDeserializer keyDeserializer = this.f;
        JsonDeserializer<Object> jsonDeserializer = this.h;
        TypeDeserializer typeDeserializer = this.m;
        boolean z = jsonDeserializer.getObjectIdReader() != null;
        a aVar = z ? new a(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
                if (jsonTokenCurrentToken == JsonToken.END_OBJECT) {
                    return;
                } else {
                    deserializationContext.reportWrongTokenException(this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
                }
            }
            strCurrentName = jsonParser.currentName();
        }
        while (strCurrentName != null) {
            Object objDeserializeKey = keyDeserializer.deserializeKey(strCurrentName, deserializationContext);
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            ahy.d dVar = this.f207a;
            if (dVar != null && dVar.d(strCurrentName)) {
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
                    if (z) {
                        aVar.b(objDeserializeKey, objDeserializeWithType);
                    } else {
                        map.put(objDeserializeKey, objDeserializeWithType);
                    }
                } catch (zm e2) {
                    d(deserializationContext, aVar, objDeserializeKey, e2);
                } catch (Exception e3) {
                    wrapAndThrow(deserializationContext, e3, map, strCurrentName);
                }
            }
            strCurrentName = jsonParser.nextFieldName();
        }
    }

    protected final void b(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        Object objDeserializeWithType;
        JsonDeserializer<Object> jsonDeserializer = this.h;
        TypeDeserializer typeDeserializer = this.m;
        boolean z = jsonDeserializer.getObjectIdReader() != null;
        a aVar = z ? new a(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.END_OBJECT) {
                return;
            }
            if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
                deserializationContext.reportWrongTokenException(this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
            }
            strCurrentName = jsonParser.currentName();
        }
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            ahy.d dVar = this.f207a;
            if (dVar != null && dVar.d(strCurrentName)) {
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
                    if (z) {
                        aVar.b(strCurrentName, objDeserializeWithType);
                    } else {
                        map.put(strCurrentName, objDeserializeWithType);
                    }
                } catch (zm e2) {
                    d(deserializationContext, aVar, strCurrentName, e2);
                } catch (Exception e3) {
                    wrapAndThrow(deserializationContext, e3, map, strCurrentName);
                }
            }
            strCurrentName = jsonParser.nextFieldName();
        }
    }

    public Map<Object, Object> d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strCurrentName;
        Object objDeserializeWithType;
        aag aagVar = this.i;
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, null);
        JsonDeserializer<Object> jsonDeserializer = this.h;
        TypeDeserializer typeDeserializer = this.m;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            strCurrentName = jsonParser.hasToken(JsonToken.FIELD_NAME) ? jsonParser.currentName() : null;
        }
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            ahy.d dVar = this.f207a;
            if (dVar != null && dVar.d(strCurrentName)) {
                jsonParser.skipChildren();
            } else {
                SettableBeanProperty settableBeanPropertyE = aagVar.e(strCurrentName);
                if (settableBeanPropertyE != null) {
                    if (aaiVarE.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                        jsonParser.nextToken();
                        try {
                            Map<Object, Object> map = (Map) aagVar.a(deserializationContext, aaiVarE);
                            d(jsonParser, deserializationContext, map);
                            return map;
                        } catch (Exception e2) {
                            return (Map) wrapAndThrow(deserializationContext, e2, this._containerType.getRawClass(), strCurrentName);
                        }
                    }
                } else {
                    Object objDeserializeKey = this.f.deserializeKey(strCurrentName, deserializationContext);
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
                        aaiVarE.b(objDeserializeKey, objDeserializeWithType);
                    } catch (Exception e3) {
                        wrapAndThrow(deserializationContext, e3, this._containerType.getRawClass(), strCurrentName);
                        return null;
                    }
                }
            }
            strCurrentName = jsonParser.nextFieldName();
        }
        try {
            return (Map) aagVar.a(deserializationContext, aaiVarE);
        } catch (Exception e4) {
            wrapAndThrow(deserializationContext, e4, this._containerType.getRawClass(), strCurrentName);
            return null;
        }
    }

    protected final void e(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        Object objDeserializeWithType;
        KeyDeserializer keyDeserializer = this.f;
        JsonDeserializer<Object> jsonDeserializer = this.h;
        TypeDeserializer typeDeserializer = this.m;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.END_OBJECT) {
                return;
            }
            if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
                deserializationContext.reportWrongTokenException(this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
            }
            strCurrentName = jsonParser.currentName();
        }
        while (strCurrentName != null) {
            Object objDeserializeKey = keyDeserializer.deserializeKey(strCurrentName, deserializationContext);
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            ahy.d dVar = this.f207a;
            if (dVar != null && dVar.d(strCurrentName)) {
                jsonParser.skipChildren();
            } else {
                try {
                    if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            map.put(objDeserializeKey, this._nullProvider.getNullValue(deserializationContext));
                        }
                    } else {
                        Object obj = map.get(objDeserializeKey);
                        if (obj != null) {
                            if (typeDeserializer == null) {
                                objDeserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
                            } else {
                                objDeserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer, obj);
                            }
                        } else if (typeDeserializer == null) {
                            objDeserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                        } else {
                            objDeserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        }
                        if (objDeserializeWithType != obj) {
                            map.put(objDeserializeKey, objDeserializeWithType);
                        }
                    }
                } catch (Exception e2) {
                    wrapAndThrow(deserializationContext, e2, map, strCurrentName);
                }
            }
            strCurrentName = jsonParser.nextFieldName();
        }
    }

    protected final void a(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        Object objDeserializeWithType;
        JsonDeserializer<Object> jsonDeserializer = this.h;
        TypeDeserializer typeDeserializer = this.m;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.END_OBJECT) {
                return;
            }
            if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
                deserializationContext.reportWrongTokenException(this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
            }
            strCurrentName = jsonParser.currentName();
        }
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            ahy.d dVar = this.f207a;
            if (dVar != null && dVar.d(strCurrentName)) {
                jsonParser.skipChildren();
            } else {
                try {
                    if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            map.put(strCurrentName, this._nullProvider.getNullValue(deserializationContext));
                        }
                    } else {
                        Object obj = map.get(strCurrentName);
                        if (obj != null) {
                            if (typeDeserializer == null) {
                                objDeserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
                            } else {
                                objDeserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer, obj);
                            }
                        } else if (typeDeserializer == null) {
                            objDeserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                        } else {
                            objDeserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        }
                        if (objDeserializeWithType != obj) {
                            map.put(strCurrentName, objDeserializeWithType);
                        }
                    }
                } catch (Exception e2) {
                    wrapAndThrow(deserializationContext, e2, map, strCurrentName);
                }
            }
            strCurrentName = jsonParser.nextFieldName();
        }
    }

    private void d(DeserializationContext deserializationContext, a aVar, Object obj, zm zmVar) throws ym {
        if (aVar == null) {
            deserializationContext.reportInputMismatch(this, "Unresolved forward reference but no identity info: " + zmVar, new Object[0]);
        }
        zmVar.e().a(aVar.d(zmVar, obj));
    }

    static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<?> f210b;
        private List<e> d = new ArrayList();
        private Map<Object, Object> e;

        public a(Class<?> cls, Map<Object, Object> map) {
            this.f210b = cls;
            this.e = map;
        }

        public void b(Object obj, Object obj2) {
            if (this.d.isEmpty()) {
                this.e.put(obj, obj2);
            } else {
                List<e> list = this.d;
                list.get(list.size() - 1).f211a.put(obj, obj2);
            }
        }

        public ReadableObjectId.Referring d(zm zmVar, Object obj) {
            e eVar = new e(this, zmVar, this.f210b, obj);
            this.d.add(eVar);
            return eVar;
        }

        public void c(Object obj, Object obj2) throws IOException {
            Iterator<e> it = this.d.iterator();
            Map<Object, Object> map = this.e;
            while (it.hasNext()) {
                e next = it.next();
                if (next.hasId(obj)) {
                    it.remove();
                    map.put(next.f212b, obj2);
                    map.putAll(next.f211a);
                    return;
                }
                map = next.f211a;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    static class e extends ReadableObjectId.Referring {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Object, Object> f211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f212b;
        private final a d;

        e(a aVar, zm zmVar, Class<?> cls, Object obj) {
            super(zmVar, cls);
            this.f211a = new LinkedHashMap();
            this.d = aVar;
            this.f212b = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            this.d.c(obj, obj2);
        }
    }
}
