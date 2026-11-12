package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.h04;
import defpackage.ij1;
import defpackage.ksd;
import defpackage.odi;
import defpackage.qh2;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements cj4 {
    private static final long serialVersionUID = 1;
    protected com.fasterxml.jackson.databind.ser.impl.a _dynamicValueSerializers;
    protected final Object _filterId;
    protected final Set<String> _ignoredEntries;
    protected eud<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _sortKeys;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected eud<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final e5q _valueTypeSerializer;
    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7709a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f7709a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7709a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7709a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7709a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7709a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7709a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, e5q e5qVar, Object obj) {
        this(mapSerializer, e5qVar, obj, false);
    }

    private final eud<Object> _findSerializer(wwl wwlVar, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        eud<Object> eudVarI = this._dynamicValueSerializers.i(cls);
        if (eudVarI != null) {
            return eudVarI;
        }
        return this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, wwlVar.constructSpecializedType(this._valueType, cls), wwlVar) : _findAndAddDynamic(this._dynamicValueSerializers, cls, wwlVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public static MapSerializer construct(Set<String> set, JavaType javaType, boolean z, e5q e5qVar, eud<Object> eudVar, eud<Object> eudVar2, Object obj) {
        JavaType contentType;
        JavaType javaType2;
        boolean z2;
        MapSerializer mapSerializer;
        if (javaType == null) {
            javaType2 = UNSPECIFIED_TYPE;
            contentType = javaType2;
        } else {
            JavaType keyType = javaType.getKeyType();
            contentType = javaType.getContentType();
            javaType2 = keyType;
        }
        boolean z3 = false;
        if (z) {
            if (contentType.getRawClass() == Object.class) {
                z2 = false;
            }
            mapSerializer = new MapSerializer(set, javaType2, contentType, z2, e5qVar, eudVar, eudVar2);
            if (obj != null) {
                return mapSerializer.withFilterId(obj);
            }
            return mapSerializer;
        }
        if (contentType != null && contentType.isFinal()) {
            z3 = true;
        }
        z = z3;
        z2 = z;
        mapSerializer = new MapSerializer(set, javaType2, contentType, z2, e5qVar, eudVar, eudVar2);
        if (obj != null) {
            return mapSerializer.withFilterId(obj);
        }
        return mapSerializer;
    }

    public void _ensureOverride(String str) {
        h04.j0(MapSerializer.class, this, str);
    }

    public final eud<Object> _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.a aVar, Class<?> cls, wwl wwlVar) throws JsonMappingException {
        com.fasterxml.jackson.databind.ser.impl.a.d dVarG = aVar.g(cls, wwlVar, this._property);
        com.fasterxml.jackson.databind.ser.impl.a aVar2 = dVarG.f7701b;
        if (aVar != aVar2) {
            this._dynamicValueSerializers = aVar2;
        }
        return dVarG.f7700a;
    }

    public boolean _hasNullKey(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    public Map<?, ?> _orderEntries(Map<?, ?> map, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!_hasNullKey(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                _writeNullKeyedEntry(jsonGenerator, wwlVar, entry.getValue());
            } else {
                treeMap.put(key, entry.getValue());
            }
        }
        return treeMap;
    }

    public void _writeNullKeyedEntry(JsonGenerator jsonGenerator, wwl wwlVar, Object obj) throws IOException {
        eud<Object> eudVar_findSerializer;
        eud<Object> eudVarFindNullKeySerializer = wwlVar.findNullKeySerializer(this._keyType, this._property);
        if (obj != null) {
            eudVar_findSerializer = this._valueSerializer;
            if (eudVar_findSerializer == null) {
                eudVar_findSerializer = _findSerializer(wwlVar, obj);
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == MARKER_FOR_EMPTY) {
                if (eudVar_findSerializer.isEmpty(wwlVar, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            eudVar_findSerializer = wwlVar.getDefaultNullValueSerializer();
        }
        try {
            eudVarFindNullKeySerializer.serialize(null, jsonGenerator, wwlVar);
            eudVar_findSerializer.serialize(obj, jsonGenerator, wwlVar);
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, obj, "");
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.e(javaType);
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<?> eudVarSerializerInstance;
        eud<Object> eudVarSerializerInstance2;
        Set<String> set;
        boolean zBooleanValue;
        JsonInclude.Include contentInclusion;
        Object objFindFilterId;
        Boolean feature;
        AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
        Object objA = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        if (StdSerializer._neitherNull(member, annotationIntrospector)) {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            eudVarSerializerInstance = objFindKeySerializer != null ? wwlVar.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            eudVarSerializerInstance2 = objFindContentSerializer != null ? wwlVar.serializerInstance(member, objFindContentSerializer) : null;
        } else {
            eudVarSerializerInstance = null;
            eudVarSerializerInstance2 = null;
        }
        if (eudVarSerializerInstance2 == null) {
            eudVarSerializerInstance2 = this._valueSerializer;
        }
        eud<?> eudVarFindContextualConvertingSerializer = findContextualConvertingSerializer(wwlVar, beanProperty, eudVarSerializerInstance2);
        if (eudVarFindContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            eudVarFindContextualConvertingSerializer = wwlVar.findValueSerializer(this._valueType, beanProperty);
        }
        eud<?> eudVar = eudVarFindContextualConvertingSerializer;
        if (eudVarSerializerInstance == null) {
            eudVarSerializerInstance = this._keySerializer;
        }
        eud<?> eudVarFindKeySerializer = eudVarSerializerInstance == null ? wwlVar.findKeySerializer(this._keyType, beanProperty) : wwlVar.handleSecondaryContextualization(eudVarSerializerInstance, beanProperty);
        Set<String> hashSet = this._ignoredEntries;
        boolean zIncludeFilterSuppressNulls = false;
        if (StdSerializer._neitherNull(member, annotationIntrospector)) {
            JsonIgnoreProperties.Value valueFindPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member);
            if (valueFindPropertyIgnorals != null) {
                Set<String> setFindIgnoredForSerialization = valueFindPropertyIgnorals.findIgnoredForSerialization();
                if (StdSerializer._nonEmpty(setFindIgnoredForSerialization)) {
                    hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                    Iterator<String> it = setFindIgnoredForSerialization.iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next());
                    }
                }
            }
            zBooleanValue = Boolean.TRUE.equals(annotationIntrospector.findSerializationSortAlphabetically(member));
            set = hashSet;
        } else {
            set = hashSet;
            zBooleanValue = false;
        }
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, Map.class);
        if (valueFindFormatOverrides != null && (feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)) != null) {
            zBooleanValue = feature.booleanValue();
        }
        MapSerializer mapSerializerWithResolved = withResolved(beanProperty, eudVarFindKeySerializer, eudVar, set, zBooleanValue);
        if (beanProperty == null) {
            return mapSerializerWithResolved;
        }
        AnnotatedMember member2 = beanProperty.getMember();
        if (member2 != null && (objFindFilterId = annotationIntrospector.findFilterId(member2)) != null) {
            mapSerializerWithResolved = mapSerializerWithResolved.withFilterId(objFindFilterId);
        }
        JsonInclude.Value valueFindPropertyInclusion = beanProperty.findPropertyInclusion(wwlVar.getConfig(), null);
        if (valueFindPropertyInclusion == null || (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return mapSerializerWithResolved;
        }
        int i = a.f7709a[contentInclusion.ordinal()];
        if (i == 1) {
            objA = qh2.a(this._valueType);
            if (objA != null && objA.getClass().isArray()) {
                objA = ij1.b(objA);
            }
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    objA = wwlVar.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                    if (objA != null) {
                        zIncludeFilterSuppressNulls = wwlVar.includeFilterSuppressNulls(objA);
                    }
                } else if (i == 5) {
                }
                return mapSerializerWithResolved.withContentInclusion(objA, zIncludeFilterSuppressNulls);
            }
            objA = MARKER_FOR_EMPTY;
        } else if (this._valueType.isReferenceType()) {
            objA = MARKER_FOR_EMPTY;
        }
        zIncludeFilterSuppressNulls = true;
        return mapSerializerWithResolved.withContentInclusion(objA, zIncludeFilterSuppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public eud<?> getContentSerializer() {
        return this._valueSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._valueType;
    }

    public eud<?> getKeySerializer() {
        return this._keySerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        return createSchemaNode("object", true);
    }

    public void serializeFields(Map<?, ?> map, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        Object obj = null;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, wwlVar, null);
            return;
        }
        eud<Object> eudVar = this._keySerializer;
        Set<String> set = this._ignoredEntries;
        try {
            Object key = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    key = entry.getKey();
                    if (key == null) {
                        wwlVar.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, wwlVar);
                    } else if (set == null || !set.contains(key)) {
                        eudVar.serialize(key, jsonGenerator, wwlVar);
                    }
                    if (value == null) {
                        wwlVar.defaultSerializeNull(jsonGenerator);
                    } else {
                        eud<Object> eudVar_findSerializer = this._valueSerializer;
                        if (eudVar_findSerializer == null) {
                            eudVar_findSerializer = _findSerializer(wwlVar, value);
                        }
                        eudVar_findSerializer.serialize(value, jsonGenerator, wwlVar);
                    }
                } catch (Exception e) {
                    e = e;
                    obj = key;
                    wrapAndThrow(wwlVar, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, JsonGenerator jsonGenerator, wwl wwlVar, eud<Object> eudVar) throws IOException {
        eud<Object> eudVar2 = this._keySerializer;
        Set<String> set = this._ignoredEntries;
        e5q e5qVar = this._valueTypeSerializer;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    wwlVar.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, wwlVar);
                } else {
                    eudVar2.serialize(key, jsonGenerator, wwlVar);
                }
                Object value = entry.getValue();
                if (value == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else if (e5qVar == null) {
                    try {
                        eudVar.serialize(value, jsonGenerator, wwlVar);
                    } catch (Exception e) {
                        wrapAndThrow(wwlVar, e, map, String.valueOf(key));
                    }
                } else {
                    eudVar.serializeWithType(value, jsonGenerator, wwlVar, e5qVar);
                }
            }
        }
    }

    public void serializeFilteredAnyProperties(wwl wwlVar, JsonGenerator jsonGenerator, Object obj, Map<?, ?> map, odi odiVar, Object obj2) throws IOException {
        eud<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z = MARKER_FOR_EMPTY == obj2;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                eud<Object> eudVarFindNullKeySerializer = key == null ? wwlVar.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = _findSerializer(wwlVar, value);
                    }
                    if (z) {
                        if (!defaultNullValueSerializer.isEmpty(wwlVar, value)) {
                            mapProperty.reset(key, value, eudVarFindNullKeySerializer, defaultNullValueSerializer);
                            odiVar.serializeAsField(obj, jsonGenerator, wwlVar, mapProperty);
                        }
                    } else if (obj2 == null || !obj2.equals(value)) {
                        mapProperty.reset(key, value, eudVarFindNullKeySerializer, defaultNullValueSerializer);
                        odiVar.serializeAsField(obj, jsonGenerator, wwlVar, mapProperty);
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = wwlVar.getDefaultNullValueSerializer();
                    mapProperty.reset(key, value, eudVarFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        odiVar.serializeAsField(obj, jsonGenerator, wwlVar, mapProperty);
                    } catch (Exception e) {
                        wrapAndThrow(wwlVar, e, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    public void serializeFilteredFields(Map<?, ?> map, JsonGenerator jsonGenerator, wwl wwlVar, odi odiVar, Object obj) throws IOException {
        eud<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                eud<Object> eudVarFindNullKeySerializer = key == null ? wwlVar.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = _findSerializer(wwlVar, value);
                    }
                    if (z) {
                        if (!defaultNullValueSerializer.isEmpty(wwlVar, value)) {
                            mapProperty.reset(key, value, eudVarFindNullKeySerializer, defaultNullValueSerializer);
                            odiVar.serializeAsField(map, jsonGenerator, wwlVar, mapProperty);
                        }
                    } else if (obj == null || !obj.equals(value)) {
                        mapProperty.reset(key, value, eudVarFindNullKeySerializer, defaultNullValueSerializer);
                        odiVar.serializeAsField(map, jsonGenerator, wwlVar, mapProperty);
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = wwlVar.getDefaultNullValueSerializer();
                    mapProperty.reset(key, value, eudVarFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        odiVar.serializeAsField(map, jsonGenerator, wwlVar, mapProperty);
                    } catch (Exception e) {
                        wrapAndThrow(wwlVar, e, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0069 A[EXC_TOP_SPLITTER, PHI: r6
      0x0069: PHI (r6v3 eud<java.lang.Object>) = (r6v2 eud<java.lang.Object>), (r6v5 eud<java.lang.Object>), (r6v5 eud<java.lang.Object>), (r6v5 eud<java.lang.Object>) binds: [B:26:0x004a, B:32:0x005d, B:34:0x0060, B:36:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public void serializeOptionalFields(Map<?, ?> map, JsonGenerator jsonGenerator, wwl wwlVar, Object obj) throws IOException {
        eud<Object> eudVarFindNullKeySerializer;
        eud<Object> defaultNullValueSerializer;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, wwlVar, obj);
            return;
        }
        Set<String> set = this._ignoredEntries;
        boolean z = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                eudVarFindNullKeySerializer = wwlVar.findNullKeySerializer(this._keyType, this._property);
            } else if (set == null || !set.contains(key)) {
                eudVarFindNullKeySerializer = this._keySerializer;
            }
            Object value = entry.getValue();
            if (value != null) {
                defaultNullValueSerializer = this._valueSerializer;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = _findSerializer(wwlVar, value);
                }
                if (z) {
                    if (!defaultNullValueSerializer.isEmpty(wwlVar, value)) {
                        eudVarFindNullKeySerializer.serialize(key, jsonGenerator, wwlVar);
                        defaultNullValueSerializer.serialize(value, jsonGenerator, wwlVar);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    eudVarFindNullKeySerializer.serialize(key, jsonGenerator, wwlVar);
                    defaultNullValueSerializer.serialize(value, jsonGenerator, wwlVar);
                }
            } else if (!this._suppressNulls) {
                defaultNullValueSerializer = wwlVar.getDefaultNullValueSerializer();
                try {
                    eudVarFindNullKeySerializer.serialize(key, jsonGenerator, wwlVar);
                    defaultNullValueSerializer.serialize(value, jsonGenerator, wwlVar);
                } catch (Exception e) {
                    wrapAndThrow(wwlVar, e, map, String.valueOf(key));
                }
            }
        }
    }

    public void serializeTypedFields(Map<?, ?> map, JsonGenerator jsonGenerator, wwl wwlVar, Object obj) throws IOException {
        eud<Object> eudVarFindNullKeySerializer;
        eud<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        boolean z = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                eudVarFindNullKeySerializer = wwlVar.findNullKeySerializer(this._keyType, this._property);
            } else if (set == null || !set.contains(key)) {
                eudVarFindNullKeySerializer = this._keySerializer;
            }
            Object value = entry.getValue();
            if (value != null) {
                defaultNullValueSerializer = this._valueSerializer;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = _findSerializer(wwlVar, value);
                }
                if (z) {
                    if (!defaultNullValueSerializer.isEmpty(wwlVar, value)) {
                        eudVarFindNullKeySerializer.serialize(key, jsonGenerator, wwlVar);
                        defaultNullValueSerializer.serializeWithType(value, jsonGenerator, wwlVar, this._valueTypeSerializer);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    eudVarFindNullKeySerializer.serialize(key, jsonGenerator, wwlVar);
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, wwlVar, this._valueTypeSerializer);
                }
            } else if (!this._suppressNulls) {
                defaultNullValueSerializer = wwlVar.getDefaultNullValueSerializer();
                eudVarFindNullKeySerializer.serialize(key, jsonGenerator, wwlVar);
                try {
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, wwlVar, this._valueTypeSerializer);
                } catch (Exception e) {
                    wrapAndThrow(wwlVar, e, map, String.valueOf(key));
                }
            }
        }
    }

    public MapSerializer withContentInclusion(Object obj, boolean z) {
        if (obj == this._suppressableValue && z == this._suppressNulls) {
            return this;
        }
        _ensureOverride("withContentInclusion");
        return new MapSerializer(this, this._valueTypeSerializer, obj, z);
    }

    public MapSerializer withResolved(BeanProperty beanProperty, eud<?> eudVar, eud<?> eudVar2, Set<String> set, boolean z) {
        _ensureOverride("withResolved");
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, eudVar, eudVar2, set);
        return z != mapSerializer._sortKeys ? new MapSerializer(mapSerializer, this._filterId, z) : mapSerializer;
    }

    @Deprecated
    public void _ensureOverride() {
        _ensureOverride("N/A");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public MapSerializer _withValueTypeSerializer(e5q e5qVar) {
        if (this._valueTypeSerializer == e5qVar) {
            return this;
        }
        _ensureOverride("_withValueTypeSerializer");
        return new MapSerializer(this, e5qVar, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map<?, ?> map) {
        return map.size() == 1;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Map<?, ?> map) {
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this._suppressableValue;
        if (obj == null && !this._suppressNulls) {
            return false;
        }
        eud<Object> eudVar = this._valueSerializer;
        boolean z = MARKER_FOR_EMPTY == obj;
        if (eudVar != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this._suppressNulls) {
                        return false;
                    }
                } else if (z) {
                    if (!eudVar.isEmpty(wwlVar, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                try {
                    eud<Object> eudVar_findSerializer = _findSerializer(wwlVar, obj3);
                    if (z) {
                        if (!eudVar_findSerializer.isEmpty(wwlVar, obj3)) {
                            return false;
                        }
                    } else if (obj == null || !obj.equals(map)) {
                        return false;
                    }
                } catch (JsonMappingException unused) {
                }
            } else if (!this._suppressNulls) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        odi odiVarFindPropertyFilter;
        jsonGenerator.O0(map);
        if (!map.isEmpty()) {
            if (this._sortKeys || wwlVar.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map, jsonGenerator, wwlVar);
            }
            Map<?, ?> map2 = map;
            Object obj = this._filterId;
            if (obj == null || (odiVarFindPropertyFilter = findPropertyFilter(wwlVar, obj, map2)) == null) {
                Object obj2 = this._suppressableValue;
                if (obj2 != null || this._suppressNulls) {
                    serializeOptionalFields(map2, jsonGenerator, wwlVar, obj2);
                } else {
                    eud<Object> eudVar = this._valueSerializer;
                    if (eudVar != null) {
                        serializeFieldsUsing(map2, jsonGenerator, wwlVar, eudVar);
                    } else {
                        serializeFields(map2, jsonGenerator, wwlVar);
                    }
                }
            } else {
                serializeFilteredFields(map2, jsonGenerator, wwlVar, odiVarFindPropertyFilter, this._suppressableValue);
            }
        }
        jsonGenerator.m0();
    }

    @Override // defpackage.eud
    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        odi odiVarFindPropertyFilter;
        jsonGenerator.M(map);
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(map, JsonToken.START_OBJECT));
        if (!map.isEmpty()) {
            if (this._sortKeys || wwlVar.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map, jsonGenerator, wwlVar);
            }
            Map<?, ?> map2 = map;
            Object obj = this._filterId;
            if (obj == null || (odiVarFindPropertyFilter = findPropertyFilter(wwlVar, obj, map2)) == null) {
                Object obj2 = this._suppressableValue;
                if (obj2 != null || this._suppressNulls) {
                    serializeOptionalFields(map2, jsonGenerator, wwlVar, obj2);
                } else {
                    eud<Object> eudVar = this._valueSerializer;
                    if (eudVar != null) {
                        serializeFieldsUsing(map2, jsonGenerator, wwlVar, eudVar);
                    } else {
                        serializeFields(map2, jsonGenerator, wwlVar);
                    }
                }
            } else {
                serializeFilteredFields(map2, jsonGenerator, wwlVar, odiVarFindPropertyFilter, this._suppressableValue);
            }
        }
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }

    @Override // defpackage.eud
    public MapSerializer withFilterId(Object obj) {
        if (this._filterId == obj) {
            return this;
        }
        _ensureOverride("withFilterId");
        return new MapSerializer(this, obj, this._sortKeys);
    }

    public MapSerializer(Set<String> set, JavaType javaType, JavaType javaType2, boolean z, e5q e5qVar, eud<?> eudVar, eud<?> eudVar2) {
        super(Map.class, false);
        this._ignoredEntries = (set == null || set.isEmpty()) ? null : set;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = e5qVar;
        this._keySerializer = eudVar;
        this._valueSerializer = eudVar2;
        this._dynamicValueSerializers = com.fasterxml.jackson.databind.ser.impl.a.a();
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    @Deprecated
    public MapSerializer withContentInclusion(Object obj) {
        return new MapSerializer(this, this._valueTypeSerializer, obj, this._suppressNulls);
    }

    public final eud<Object> _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.a aVar, JavaType javaType, wwl wwlVar) throws JsonMappingException {
        com.fasterxml.jackson.databind.ser.impl.a.d dVarF = aVar.f(javaType, wwlVar, this._property);
        com.fasterxml.jackson.databind.ser.impl.a aVar2 = dVarF.f7701b;
        if (aVar != aVar2) {
            this._dynamicValueSerializers = aVar2;
        }
        return dVarF.f7700a;
    }

    @Deprecated
    public static MapSerializer construct(String[] strArr, JavaType javaType, boolean z, e5q e5qVar, eud<Object> eudVar, eud<Object> eudVar2, Object obj) {
        return construct(ij1.a(strArr), javaType, z, e5qVar, eudVar, eudVar2, obj);
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, eud<?> eudVar, eud<?> eudVar2, Set<String> set) {
        super(Map.class, false);
        this._ignoredEntries = (set == null || set.isEmpty()) ? null : set;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = eudVar;
        this._valueSerializer = eudVar2;
        this._dynamicValueSerializers = com.fasterxml.jackson.databind.ser.impl.a.a();
        this._property = beanProperty;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
    }

    public MapSerializer(MapSerializer mapSerializer, e5q e5qVar, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = e5qVar;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = com.fasterxml.jackson.databind.ser.impl.a.a();
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
    }
}
