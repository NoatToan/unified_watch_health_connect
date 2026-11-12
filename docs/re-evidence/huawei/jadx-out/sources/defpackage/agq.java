package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class agq extends ContainerSerializer<Map<?, ?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f393b;
    protected final Set<String> d;
    protected PropertySerializerMap e;
    protected final BeanProperty f;
    protected final Set<String> g;
    protected JsonSerializer<Object> h;
    protected final JavaType i;
    protected final ahy.d j;
    protected JsonSerializer<Object> k;
    protected final boolean l;
    protected final JavaType m;
    protected final boolean n;
    protected final Object o;
    protected final boolean r;
    protected final TypeSerializer t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final JavaType f392c = ahp.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f391a = JsonInclude.Include.NON_EMPTY;

    protected agq(Set<String> set, Set<String> set2, JavaType javaType, JavaType javaType2, boolean z, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.d = set;
        this.g = set2;
        this.i = javaType;
        this.m = javaType2;
        this.r = z;
        this.t = typeSerializer;
        this.h = jsonSerializer;
        this.k = jsonSerializer2;
        this.e = PropertySerializerMap.emptyForProperties();
        this.f = null;
        this.f393b = null;
        this.n = false;
        this.o = null;
        this.l = false;
        this.j = ahy.a(set, set2);
    }

    protected agq(agq agqVar, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, Set<String> set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.d = set;
        this.g = set2;
        this.i = agqVar.i;
        this.m = agqVar.m;
        this.r = agqVar.r;
        this.t = agqVar.t;
        this.h = jsonSerializer;
        this.k = jsonSerializer2;
        this.e = PropertySerializerMap.emptyForProperties();
        this.f = beanProperty;
        this.f393b = agqVar.f393b;
        this.n = agqVar.n;
        this.o = agqVar.o;
        this.l = agqVar.l;
        this.j = ahy.a(set, set2);
    }

    protected agq(agq agqVar, TypeSerializer typeSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.d = agqVar.d;
        this.g = agqVar.g;
        this.i = agqVar.i;
        this.m = agqVar.m;
        this.r = agqVar.r;
        this.t = typeSerializer;
        this.h = agqVar.h;
        this.k = agqVar.k;
        this.e = agqVar.e;
        this.f = agqVar.f;
        this.f393b = agqVar.f393b;
        this.n = agqVar.n;
        this.o = obj;
        this.l = z;
        this.j = agqVar.j;
    }

    protected agq(agq agqVar, Object obj, boolean z) {
        super(Map.class, false);
        this.d = agqVar.d;
        this.g = agqVar.g;
        this.i = agqVar.i;
        this.m = agqVar.m;
        this.r = agqVar.r;
        this.t = agqVar.t;
        this.h = agqVar.h;
        this.k = agqVar.k;
        this.e = PropertySerializerMap.emptyForProperties();
        this.f = agqVar.f;
        this.f393b = obj;
        this.n = z;
        this.o = agqVar.o;
        this.l = agqVar.l;
        this.j = agqVar.j;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public agq _withValueTypeSerializer(TypeSerializer typeSerializer) {
        if (this.t == typeSerializer) {
            return this;
        }
        c("_withValueTypeSerializer");
        return new agq(this, typeSerializer, this.o, this.l);
    }

    public agq a(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, Set<String> set2, boolean z) {
        c("withResolved");
        agq agqVar = new agq(this, beanProperty, jsonSerializer, jsonSerializer2, set, set2);
        return z != agqVar.n ? new agq(agqVar, this.f393b, z) : agqVar;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public agq withFilterId(Object obj) {
        if (this.f393b == obj) {
            return this;
        }
        c("withFilterId");
        return new agq(this, obj, this.n);
    }

    public agq a(Object obj, boolean z) {
        if (obj == this.o && z == this.l) {
            return this;
        }
        c("withContentInclusion");
        return new agq(this, this.t, obj, z);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public static agq c(Set<String> set, Set<String> set2, JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2, Object obj) {
        JavaType contentType;
        JavaType javaType2;
        JavaType javaType3;
        boolean z2;
        agq agqVar;
        if (javaType == null) {
            javaType3 = f392c;
            javaType2 = javaType3;
        } else {
            JavaType keyType = javaType.getKeyType();
            if (javaType.hasRawClass(Properties.class)) {
                contentType = ahp.c();
            } else {
                contentType = javaType.getContentType();
            }
            javaType2 = contentType;
            javaType3 = keyType;
        }
        boolean z3 = false;
        if (!z) {
            if (javaType2 != null && javaType2.isFinal()) {
                z3 = true;
            }
        } else {
            if (javaType2.getRawClass() != Object.class) {
                z2 = z;
            }
            agqVar = new agq(set, set2, javaType3, javaType2, z2, typeSerializer, jsonSerializer, jsonSerializer2);
            if (obj != null) {
                return agqVar.withFilterId(obj);
            }
            return agqVar;
        }
        z2 = z3;
        agqVar = new agq(set, set2, javaType3, javaType2, z2, typeSerializer, jsonSerializer, jsonSerializer2);
        if (obj != null) {
            return agqVar.withFilterId(obj);
        }
        return agqVar;
    }

    public static agq a(Set<String> set, JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2, Object obj) {
        return c(set, null, javaType, z, typeSerializer, jsonSerializer, jsonSerializer2, obj);
    }

    protected void c(String str) {
        ahw.c((Class<?>) agq.class, this, str);
    }

    /* JADX WARN: Code duplicated, block: B:94:0x015e A[PHI: r1
      0x015e: PHI (r1v3 java.lang.Object) = (r1v1 java.lang.Object), (r1v0 java.lang.Object), (r1v4 java.lang.Object), (r1v0 java.lang.Object) binds: [B:93:0x015d, B:86:0x0142, B:81:0x0131, B:78:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<?> jsonSerializerSerializerInstance;
        JsonSerializer<Object> jsonSerializerSerializerInstance2;
        JsonSerializer<?> jsonSerializerHandleSecondaryContextualization;
        Set<String> set;
        Set<String> set2;
        boolean zEquals;
        JsonInclude.Include includeD;
        Object objD;
        Object objFindFilterId;
        Boolean boolA;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        Object objIncludeFilterInstance = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        if (_neitherNull(member, annotationIntrospector)) {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            jsonSerializerSerializerInstance = objFindKeySerializer != null ? serializerProvider.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            jsonSerializerSerializerInstance2 = objFindContentSerializer != null ? serializerProvider.serializerInstance(member, objFindContentSerializer) : null;
        } else {
            jsonSerializerSerializerInstance = null;
            jsonSerializerSerializerInstance2 = null;
        }
        if (jsonSerializerSerializerInstance2 == null) {
            jsonSerializerSerializerInstance2 = this.k;
        }
        JsonSerializer<?> jsonSerializerFindContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializerSerializerInstance2);
        if (jsonSerializerFindContextualConvertingSerializer == null && this.r && !this.m.isJavaLangObject()) {
            jsonSerializerFindContextualConvertingSerializer = serializerProvider.findContentValueSerializer(this.m, beanProperty);
        }
        JsonSerializer<?> jsonSerializer = jsonSerializerFindContextualConvertingSerializer;
        if (jsonSerializerSerializerInstance == null) {
            jsonSerializerSerializerInstance = this.h;
        }
        if (jsonSerializerSerializerInstance == null) {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.findKeySerializer(this.i, beanProperty);
        } else {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.handleSecondaryContextualization(jsonSerializerSerializerInstance, beanProperty);
        }
        JsonSerializer<?> jsonSerializer2 = jsonSerializerHandleSecondaryContextualization;
        Set<String> hashSet = this.d;
        Set<String> hashSet2 = this.g;
        boolean zIncludeFilterSuppressNulls = false;
        if (_neitherNull(member, annotationIntrospector)) {
            yt config = serializerProvider.getConfig();
            Set<String> setE = annotationIntrospector.findPropertyIgnoralByName(config, member).e();
            if (_nonEmpty(setE)) {
                hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                Iterator<String> it = setE.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            Set<String> setB = annotationIntrospector.findPropertyInclusionByName(config, member).b();
            if (setB != null) {
                hashSet2 = hashSet2 == null ? new HashSet<>() : new HashSet(hashSet2);
                Iterator<String> it2 = setB.iterator();
                while (it2.hasNext()) {
                    hashSet2.add(it2.next());
                }
            }
            zEquals = Boolean.TRUE.equals(annotationIntrospector.findSerializationSortAlphabetically(member));
            set = hashSet;
            set2 = hashSet2;
        } else {
            set = hashSet;
            set2 = hashSet2;
            zEquals = false;
        }
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Map.class);
        agq agqVarA = a(beanProperty, jsonSerializer2, jsonSerializer, set, set2, (cVarFindFormatOverrides == null || (boolA = cVarFindFormatOverrides.a(JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)) == null) ? zEquals : boolA.booleanValue());
        if (member != null && (objFindFilterId = annotationIntrospector.findFilterId(member)) != null) {
            agqVarA = agqVarA.withFilterId(objFindFilterId);
        }
        JsonInclude.b bVarFindIncludeOverrides = findIncludeOverrides(serializerProvider, beanProperty, Map.class);
        if (bVarFindIncludeOverrides == null || (includeD = bVarFindIncludeOverrides.d()) == JsonInclude.Include.USE_DEFAULTS) {
            return agqVarA;
        }
        int i = AnonymousClass3.f394b[includeD.ordinal()];
        if (i == 1) {
            objD = ahr.d(this.m);
            if (objD != null && objD.getClass().isArray()) {
                objD = aht.b(objD);
            }
        } else {
            if (i == 2) {
                if (this.m.isReferenceType()) {
                    objD = f391a;
                }
                zIncludeFilterSuppressNulls = true;
            } else if (i == 3) {
                objD = f391a;
            } else if (i == 4) {
                objIncludeFilterInstance = serializerProvider.includeFilterInstance(null, bVarFindIncludeOverrides.a());
                if (objIncludeFilterInstance == null) {
                    zIncludeFilterSuppressNulls = true;
                } else {
                    zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(objIncludeFilterInstance);
                }
            } else if (i == 5) {
                zIncludeFilterSuppressNulls = true;
            }
            return agqVarA.a(objIncludeFilterInstance, zIncludeFilterSuppressNulls);
        }
        objIncludeFilterInstance = objD;
        zIncludeFilterSuppressNulls = true;
        return agqVarA.a(objIncludeFilterInstance, zIncludeFilterSuppressNulls);
    }

    /* JADX INFO: renamed from: agq$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f394b;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f394b = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f394b[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f394b[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f394b[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f394b[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f394b[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JsonSerializer<?> getContentSerializer() {
        return this.k;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean isEmpty(SerializerProvider serializerProvider, Map<?, ?> map) {
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this.o;
        if (obj == null && !this.l) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this.k;
        boolean z = f391a == obj;
        if (jsonSerializer != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this.l) {
                        return false;
                    }
                } else if (z) {
                    if (!jsonSerializer.isEmpty(serializerProvider, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 == null) {
                if (!this.l) {
                    return false;
                }
            } else {
                try {
                    JsonSerializer<Object> jsonSerializerB = b(serializerProvider, obj3);
                    if (z) {
                        if (!jsonSerializerB.isEmpty(serializerProvider, obj3)) {
                            return false;
                        }
                    } else if (obj == null || !obj.equals(map)) {
                        return false;
                    }
                } catch (ym unused) {
                }
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean hasSingleElement(Map<?, ?> map) {
        return map.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject(map);
        c(map, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.setCurrentValue(map);
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(map, JsonToken.START_OBJECT));
        c(map, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    public void c(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        PropertyFilter propertyFilterFindPropertyFilter;
        if (map.isEmpty()) {
            return;
        }
        if (this.n || serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
            map = a(map, jsonGenerator, serializerProvider);
        }
        Map<?, ?> map2 = map;
        Object obj = this.f393b;
        if (obj != null && (propertyFilterFindPropertyFilter = findPropertyFilter(serializerProvider, obj, map2)) != null) {
            a(map2, jsonGenerator, serializerProvider, propertyFilterFindPropertyFilter, this.o);
            return;
        }
        Object obj2 = this.o;
        if (obj2 != null || this.l) {
            a(map2, jsonGenerator, serializerProvider, obj2);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this.k;
        if (jsonSerializer != null) {
            c(map2, jsonGenerator, serializerProvider, jsonSerializer);
        } else {
            e(map2, jsonGenerator, serializerProvider);
        }
    }

    public void e(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj = null;
        if (this.t != null) {
            e(map, jsonGenerator, serializerProvider, null);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this.h;
        try {
            Object key = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    key = entry.getKey();
                    if (key == null) {
                        serializerProvider.findNullKeySerializer(this.i, this.f).serialize(null, jsonGenerator, serializerProvider);
                    } else {
                        ahy.d dVar = this.j;
                        if (dVar == null || !dVar.d(key)) {
                            jsonSerializer.serialize(key, jsonGenerator, serializerProvider);
                        }
                    }
                    if (value == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        JsonSerializer<Object> jsonSerializerB = this.k;
                        if (jsonSerializerB == null) {
                            jsonSerializerB = b(serializerProvider, value);
                        }
                        jsonSerializerB.serialize(value, jsonGenerator, serializerProvider);
                    }
                } catch (Exception e) {
                    e = e;
                    obj = key;
                    wrapAndThrow(serializerProvider, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0069 A[EXC_TOP_SPLITTER, PHI: r5
      0x0069: PHI (r5v3 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) = 
      (r5v2 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
      (r5v5 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
      (r5v5 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
      (r5v5 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
     binds: [B:27:0x004a, B:33:0x005d, B:35:0x0060, B:37:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public void a(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer;
        JsonSerializer<Object> defaultNullValueSerializer;
        if (this.t != null) {
            e(map, jsonGenerator, serializerProvider, obj);
            return;
        }
        boolean z = f391a == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this.i, this.f);
            } else {
                ahy.d dVar = this.j;
                if (dVar == null || !dVar.d(key)) {
                    jsonSerializerFindNullKeySerializer = this.h;
                }
            }
            Object value = entry.getValue();
            if (value == null) {
                if (!this.l) {
                    defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                    try {
                        jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                        defaultNullValueSerializer.serialize(value, jsonGenerator, serializerProvider);
                    } catch (Exception e) {
                        wrapAndThrow(serializerProvider, e, map, String.valueOf(key));
                    }
                }
            } else {
                defaultNullValueSerializer = this.k;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = b(serializerProvider, value);
                }
                if (z) {
                    if (!defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                        jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                        defaultNullValueSerializer.serialize(value, jsonGenerator, serializerProvider);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                    defaultNullValueSerializer.serialize(value, jsonGenerator, serializerProvider);
                }
            }
        }
    }

    public void c(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        JsonSerializer<Object> jsonSerializer2 = this.h;
        TypeSerializer typeSerializer = this.t;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            ahy.d dVar = this.j;
            if (dVar == null || !dVar.d(key)) {
                if (key == null) {
                    serializerProvider.findNullKeySerializer(this.i, this.f).serialize(null, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer2.serialize(key, jsonGenerator, serializerProvider);
                }
                Object value = entry.getValue();
                if (value == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    try {
                        jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                    } catch (Exception e) {
                        wrapAndThrow(serializerProvider, e, map, String.valueOf(key));
                    }
                } else {
                    jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    public void a(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyFilter propertyFilter, Object obj) throws IOException {
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer;
        JsonSerializer<Object> defaultNullValueSerializer;
        agp agpVar = new agp(this.t, this.f);
        boolean z = f391a == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            ahy.d dVar = this.j;
            if (dVar == null || !dVar.d(key)) {
                if (key == null) {
                    jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this.i, this.f);
                } else {
                    jsonSerializerFindNullKeySerializer = this.h;
                }
                Object value = entry.getValue();
                if (value == null) {
                    if (!this.l) {
                        defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                        agpVar.c(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                        try {
                            propertyFilter.serializeAsField(map, jsonGenerator, serializerProvider, agpVar);
                        } catch (Exception e) {
                            wrapAndThrow(serializerProvider, e, map, String.valueOf(key));
                        }
                    }
                } else {
                    defaultNullValueSerializer = this.k;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = b(serializerProvider, value);
                    }
                    if (z) {
                        if (!defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                            agpVar.c(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                            propertyFilter.serializeAsField(map, jsonGenerator, serializerProvider, agpVar);
                        }
                    } else if (obj == null || !obj.equals(value)) {
                        agpVar.c(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                        propertyFilter.serializeAsField(map, jsonGenerator, serializerProvider, agpVar);
                    }
                }
            }
        }
    }

    public void e(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer;
        JsonSerializer<Object> defaultNullValueSerializer;
        boolean z = f391a == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this.i, this.f);
            } else {
                ahy.d dVar = this.j;
                if (dVar == null || !dVar.d(key)) {
                    jsonSerializerFindNullKeySerializer = this.h;
                }
            }
            Object value = entry.getValue();
            if (value == null) {
                if (!this.l) {
                    defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                    jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                    try {
                        defaultNullValueSerializer.serializeWithType(value, jsonGenerator, serializerProvider, this.t);
                    } catch (Exception e) {
                        wrapAndThrow(serializerProvider, e, map, String.valueOf(key));
                    }
                }
            } else {
                defaultNullValueSerializer = this.k;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = b(serializerProvider, value);
                }
                if (z) {
                    if (!defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                        jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                        defaultNullValueSerializer.serializeWithType(value, jsonGenerator, serializerProvider, this.t);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, serializerProvider, this.t);
                }
            }
        }
    }

    public void d(SerializerProvider serializerProvider, JsonGenerator jsonGenerator, Object obj, Map<?, ?> map, PropertyFilter propertyFilter, Object obj2) throws IOException {
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer;
        JsonSerializer<Object> defaultNullValueSerializer;
        agp agpVar = new agp(this.t, this.f);
        boolean z = f391a == obj2;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            ahy.d dVar = this.j;
            if (dVar == null || !dVar.d(key)) {
                if (key == null) {
                    jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this.i, this.f);
                } else {
                    jsonSerializerFindNullKeySerializer = this.h;
                }
                Object value = entry.getValue();
                if (value == null) {
                    if (!this.l) {
                        defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                        agpVar.c(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                        try {
                            propertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, agpVar);
                        } catch (Exception e) {
                            wrapAndThrow(serializerProvider, e, map, String.valueOf(key));
                        }
                    }
                } else {
                    defaultNullValueSerializer = this.k;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = b(serializerProvider, value);
                    }
                    if (z) {
                        if (!defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                            agpVar.c(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                            propertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, agpVar);
                        }
                    } else if (obj2 == null || !obj2.equals(value)) {
                        agpVar.c(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                        propertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, agpVar);
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("object", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        JsonMapFormatVisitor jsonMapFormatVisitorExpectMapFormat = jsonFormatVisitorWrapper.expectMapFormat(javaType);
        if (jsonMapFormatVisitorExpectMapFormat != null) {
            jsonMapFormatVisitorExpectMapFormat.keyFormat(this.h, this.i);
            JsonSerializer<Object> jsonSerializerC = this.k;
            if (jsonSerializerC == null) {
                jsonSerializerC = c(this.e, this.m, jsonFormatVisitorWrapper.getProvider());
            }
            jsonMapFormatVisitorExpectMapFormat.valueFormat(jsonSerializerC, this.m);
        }
    }

    protected final JsonSerializer<Object> d(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws ym {
        PropertySerializerMap.d dVarFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this.f);
        if (propertySerializerMap != dVarFindAndAddSecondarySerializer.f4190a) {
            this.e = dVarFindAndAddSecondarySerializer.f4190a;
        }
        return dVarFindAndAddSecondarySerializer.f4191b;
    }

    protected final JsonSerializer<Object> c(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws ym {
        PropertySerializerMap.d dVarFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this.f);
        if (propertySerializerMap != dVarFindAndAddSecondarySerializer.f4190a) {
            this.e = dVarFindAndAddSecondarySerializer.f4190a;
        }
        return dVarFindAndAddSecondarySerializer.f4191b;
    }

    protected Map<?, ?> a(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (d(map)) {
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key == null) {
                    b(jsonGenerator, serializerProvider, entry.getValue());
                } else {
                    treeMap.put(key, entry.getValue());
                }
            }
            return treeMap;
        }
        return new TreeMap(map);
    }

    protected boolean d(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    protected void b(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        JsonSerializer<Object> jsonSerializerB;
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this.i, this.f);
        if (obj == null) {
            if (this.l) {
                return;
            } else {
                jsonSerializerB = serializerProvider.getDefaultNullValueSerializer();
            }
        } else {
            jsonSerializerB = this.k;
            if (jsonSerializerB == null) {
                jsonSerializerB = b(serializerProvider, obj);
            }
            Object obj2 = this.o;
            if (obj2 == f391a) {
                if (jsonSerializerB.isEmpty(serializerProvider, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        }
        try {
            jsonSerializerFindNullKeySerializer.serialize(null, jsonGenerator, serializerProvider);
            jsonSerializerB.serialize(obj, jsonGenerator, serializerProvider);
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, obj, "");
        }
    }

    private final JsonSerializer<Object> b(SerializerProvider serializerProvider, Object obj) throws ym {
        Class<?> cls = obj.getClass();
        JsonSerializer<Object> jsonSerializerSerializerFor = this.e.serializerFor(cls);
        if (jsonSerializerSerializerFor != null) {
            return jsonSerializerSerializerFor;
        }
        if (this.m.hasGenericTypes()) {
            return c(this.e, serializerProvider.constructSpecializedType(this.m, cls), serializerProvider);
        }
        return d(this.e, cls, serializerProvider);
    }
}
