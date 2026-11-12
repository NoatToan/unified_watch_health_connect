package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.ak4;
import defpackage.bip;
import defpackage.bud;
import defpackage.c5q;
import defpackage.e5q;
import defpackage.eud;
import defpackage.fd1;
import defpackage.fh2;
import defpackage.h04;
import defpackage.ij1;
import defpackage.lh2;
import defpackage.qh2;
import defpackage.uf2;
import defpackage.vwl;
import defpackage.wwl;
import defpackage.xwl;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasicSerializerFactory extends vwl implements Serializable {
    protected static final HashMap<String, eud<?>> _concrete;
    protected static final HashMap<String, Class<? extends eud<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7692b;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f7692b = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7692b[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7692b[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7692b[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7692b[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7692b[JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            f7691a = iArr2;
            try {
                iArr2[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7691a[JsonFormat.Shape.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7691a[JsonFormat.Shape.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends eud<?>>> map = new HashMap<>();
        HashMap<String, eud<?>> map2 = new HashMap<>();
        map2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        map2.put(StringBuffer.class.getName(), toStringSerializer);
        map2.put(StringBuilder.class.getName(), toStringSerializer);
        map2.put(Character.class.getName(), toStringSerializer);
        map2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.a(map2);
        map2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        map2.put(Boolean.class.getName(), new BooleanSerializer(false));
        map2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        map2.put(Calendar.class.getName(), CalendarSerializer.instance);
        map2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry<Class<?>, Object> entry : StdJdkSerializers.a()) {
            Object value = entry.getValue();
            if (value instanceof eud) {
                map2.put(entry.getKey().getName(), (eud) value);
            } else {
                map.put(entry.getKey().getName(), (Class) value);
            }
        }
        map.put(bip.class.getName(), TokenBufferSerializer.class);
        _concrete = map2;
        _concreteLazy = map;
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    public MapSerializer _checkMapContentInclusion(wwl wwlVar, fh2 fh2Var, MapSerializer mapSerializer) throws JsonMappingException {
        JavaType contentType = mapSerializer.getContentType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(wwlVar, fh2Var, contentType, Map.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        Object objA = null;
        boolean zIncludeFilterSuppressNulls = true;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return !wwlVar.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ? mapSerializer.withContentInclusion(null, true) : mapSerializer;
        }
        int i = a.f7692b[contentInclusion.ordinal()];
        if (i == 1) {
            objA = qh2.a(contentType);
            if (objA != null && objA.getClass().isArray()) {
                objA = ij1.b(objA);
            }
        } else if (i != 2) {
            if (i == 3) {
                objA = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4 && (objA = wwlVar.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                zIncludeFilterSuppressNulls = wwlVar.includeFilterSuppressNulls(objA);
            }
        } else if (contentType.isReferenceType()) {
            objA = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapSerializer.withContentInclusion(objA, zIncludeFilterSuppressNulls);
    }

    public eud<Object> _findContentSerializer(wwl wwlVar, fd1 fd1Var) throws JsonMappingException {
        Object objFindContentSerializer = wwlVar.getAnnotationIntrospector().findContentSerializer(fd1Var);
        if (objFindContentSerializer != null) {
            return wwlVar.serializerInstance(fd1Var, objFindContentSerializer);
        }
        return null;
    }

    public JsonInclude.Value _findInclusionWithContent(wwl wwlVar, fh2 fh2Var, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig config = wwlVar.getConfig();
        JsonInclude.Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, fh2Var.p(config.getDefaultPropertyInclusion()));
        JsonInclude.Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), null);
        if (defaultPropertyInclusion2 == null) {
            return defaultPropertyInclusion;
        }
        int i = a.f7692b[defaultPropertyInclusion2.getValueInclusion().ordinal()];
        if (i != 4) {
            return i != 6 ? defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion()) : defaultPropertyInclusion;
        }
        return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
    }

    public eud<Object> _findKeySerializer(wwl wwlVar, fd1 fd1Var) throws JsonMappingException {
        Object objFindKeySerializer = wwlVar.getAnnotationIntrospector().findKeySerializer(fd1Var);
        if (objFindKeySerializer != null) {
            return wwlVar.serializerInstance(fd1Var, objFindKeySerializer);
        }
        return null;
    }

    public eud<?> buildArraySerializer(wwl wwlVar, ArrayType arrayType, fh2 fh2Var, boolean z, e5q e5qVar, eud<Object> eudVar) throws JsonMappingException {
        SerializationConfig config = wwlVar.getConfig();
        Iterator<xwl> it = customSerializers().iterator();
        eud<?> eudVarB = null;
        while (it.hasNext() && (eudVarB = it.next().findArraySerializer(config, arrayType, fh2Var, e5qVar, eudVar)) == null) {
        }
        if (eudVarB == null) {
            Class<?> rawClass = arrayType.getRawClass();
            if (eudVar == null || h04.N(eudVar)) {
                eudVarB = String[].class == rawClass ? StringArraySerializer.instance : StdArraySerializers.a(rawClass);
            }
            if (eudVarB == null) {
                eudVarB = new ObjectArraySerializer(arrayType.getContentType(), z, e5qVar, eudVar);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                eudVarB = it2.next().b(config, arrayType, fh2Var, eudVarB);
            }
        }
        return eudVarB;
    }

    public eud<?> buildAtomicReferenceSerializer(wwl wwlVar, ReferenceType referenceType, fh2 fh2Var, boolean z, e5q e5qVar, eud<Object> eudVar) throws JsonMappingException {
        boolean zIncludeFilterSuppressNulls;
        JavaType referencedType = referenceType.getReferencedType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(wwlVar, fh2Var, referencedType, AtomicReference.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        Object objA = null;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            zIncludeFilterSuppressNulls = false;
        } else {
            int i = a.f7692b[contentInclusion.ordinal()];
            zIncludeFilterSuppressNulls = true;
            if (i == 1) {
                objA = qh2.a(referencedType);
                if (objA != null && objA.getClass().isArray()) {
                    objA = ij1.b(objA);
                }
            } else if (i != 2) {
                if (i == 3) {
                    objA = MapSerializer.MARKER_FOR_EMPTY;
                } else if (i == 4 && (objA = wwlVar.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                    zIncludeFilterSuppressNulls = wwlVar.includeFilterSuppressNulls(objA);
                }
            } else if (referencedType.isReferenceType()) {
                objA = MapSerializer.MARKER_FOR_EMPTY;
            }
        }
        return new AtomicReferenceSerializer(referenceType, z, e5qVar, eudVar).withContentInclusion(objA, zIncludeFilterSuppressNulls);
    }

    public eud<?> buildCollectionSerializer(wwl wwlVar, CollectionType collectionType, fh2 fh2Var, boolean z, e5q e5qVar, eud<Object> eudVar) throws JsonMappingException {
        eud<?> eudVarBuildIndexedListSerializer;
        SerializationConfig config = wwlVar.getConfig();
        Iterator<xwl> it = customSerializers().iterator();
        eud<?> eudVarD = null;
        while (it.hasNext() && (eudVarD = it.next().findCollectionSerializer(config, collectionType, fh2Var, e5qVar, eudVar)) == null) {
        }
        if (eudVarD == null && (eudVarD = findSerializerByAnnotations(wwlVar, collectionType, fh2Var)) == null) {
            JsonFormat.Value valueG = fh2Var.g(null);
            if (valueG != null && valueG.getShape() == JsonFormat.Shape.OBJECT) {
                return null;
            }
            Class<?> rawClass = collectionType.getRawClass();
            if (EnumSet.class.isAssignableFrom(rawClass)) {
                JavaType contentType = collectionType.getContentType();
                eudVarD = buildEnumSetSerializer(contentType.isEnumType() ? contentType : null);
            } else {
                Class<?> rawClass2 = collectionType.getContentType().getRawClass();
                if (isIndexedList(rawClass)) {
                    if (rawClass2 != String.class) {
                        eudVarBuildIndexedListSerializer = buildIndexedListSerializer(collectionType.getContentType(), z, e5qVar, eudVar);
                    } else if (h04.N(eudVar)) {
                        eudVarBuildIndexedListSerializer = IndexedStringListSerializer.instance;
                    }
                    eudVarD = eudVarBuildIndexedListSerializer;
                } else if (rawClass2 == String.class && h04.N(eudVar)) {
                    eudVarBuildIndexedListSerializer = StringCollectionSerializer.instance;
                    eudVarD = eudVarBuildIndexedListSerializer;
                }
                if (eudVarD == null) {
                    eudVarD = buildCollectionSerializer(collectionType.getContentType(), z, e5qVar, eudVar);
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                eudVarD = it2.next().d(config, collectionType, fh2Var, eudVarD);
            }
        }
        return eudVarD;
    }

    public eud<?> buildContainerSerializer(wwl wwlVar, JavaType javaType, fh2 fh2Var, boolean z) throws JsonMappingException {
        fh2 fh2Var2;
        fh2 fh2Var3 = fh2Var;
        SerializationConfig config = wwlVar.getConfig();
        boolean z2 = (z || !javaType.useStaticType() || (javaType.isContainerType() && javaType.getContentType().isJavaLangObject())) ? z : true;
        e5q e5qVarCreateTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        if (e5qVarCreateTypeSerializer != null) {
            z2 = false;
        }
        boolean z3 = z2;
        eud<Object> eudVar_findContentSerializer = _findContentSerializer(wwlVar, fh2Var.u());
        eud<?> eudVarC = null;
        if (javaType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            eud<Object> eudVar_findKeySerializer = _findKeySerializer(wwlVar, fh2Var.u());
            if (mapLikeType.isTrueMapType()) {
                return buildMapSerializer(wwlVar, (MapType) mapLikeType, fh2Var, z3, eudVar_findKeySerializer, e5qVarCreateTypeSerializer, eudVar_findContentSerializer);
            }
            Iterator<xwl> it = customSerializers().iterator();
            while (it.hasNext() && (eudVarC = it.next().findMapLikeSerializer(config, mapLikeType, fh2Var, eudVar_findKeySerializer, e5qVarCreateTypeSerializer, eudVar_findContentSerializer)) == null) {
            }
            if (eudVarC == null) {
                eudVarC = findSerializerByAnnotations(wwlVar, javaType, fh2Var);
            }
            if (eudVarC != null && this._factoryConfig.hasSerializerModifiers()) {
                Iterator<lh2> it2 = this._factoryConfig.serializerModifiers().iterator();
                while (it2.hasNext()) {
                    eudVarC = it2.next().g(config, mapLikeType, fh2Var3, eudVarC);
                }
            }
            return eudVarC;
        }
        if (!javaType.isCollectionLikeType()) {
            if (javaType.isArrayType()) {
                return buildArraySerializer(wwlVar, (ArrayType) javaType, fh2Var, z3, e5qVarCreateTypeSerializer, eudVar_findContentSerializer);
            }
            return null;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
        if (collectionLikeType.isTrueCollectionType()) {
            return buildCollectionSerializer(wwlVar, (CollectionType) collectionLikeType, fh2Var, z3, e5qVarCreateTypeSerializer, eudVar_findContentSerializer);
        }
        Iterator<xwl> it3 = customSerializers().iterator();
        while (true) {
            if (!it3.hasNext()) {
                fh2Var2 = fh2Var3;
                break;
            }
            fh2Var2 = fh2Var3;
            eudVarC = it3.next().findCollectionLikeSerializer(config, collectionLikeType, fh2Var, e5qVarCreateTypeSerializer, eudVar_findContentSerializer);
            if (eudVarC != null) {
                break;
            }
            fh2Var3 = fh2Var2;
        }
        if (eudVarC == null) {
            eudVarC = findSerializerByAnnotations(wwlVar, javaType, fh2Var);
        }
        if (eudVarC != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it4 = this._factoryConfig.serializerModifiers().iterator();
            while (it4.hasNext()) {
                eudVarC = it4.next().c(config, collectionLikeType, fh2Var2, eudVarC);
            }
        }
        return eudVarC;
    }

    public eud<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        JsonFormat.Value valueG = fh2Var.g(null);
        if (valueG != null && valueG.getShape() == JsonFormat.Shape.OBJECT) {
            ((uf2) fh2Var).M("declaringClass");
            return null;
        }
        eud<?> eudVarConstruct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, fh2Var, valueG);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                eudVarConstruct = it.next().e(serializationConfig, javaType, fh2Var, eudVarConstruct);
            }
        }
        return eudVarConstruct;
    }

    public eud<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        return new IndexedListSerializer(javaType, z, e5qVar, eudVar);
    }

    public eud<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, fh2 fh2Var, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    public eud<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, fh2 fh2Var, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    public eud<?> buildMapEntrySerializer(wwl wwlVar, JavaType javaType, fh2 fh2Var, boolean z, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        Object objA = null;
        if (JsonFormat.Value.merge(fh2Var.g(null), wwlVar.getDefaultPropertyFormat(Map.Entry.class)).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z, createTypeSerializer(wwlVar.getConfig(), javaType3), null);
        JavaType contentType = mapEntrySerializer.getContentType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(wwlVar, fh2Var, contentType, Map.Entry.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i = a.f7692b[contentInclusion.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i == 1) {
            objA = qh2.a(contentType);
            if (objA != null && objA.getClass().isArray()) {
                objA = ij1.b(objA);
            }
        } else if (i != 2) {
            if (i == 3) {
                objA = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4 && (objA = wwlVar.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                zIncludeFilterSuppressNulls = wwlVar.includeFilterSuppressNulls(objA);
            }
        } else if (contentType.isReferenceType()) {
            objA = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapEntrySerializer.withContentInclusion(objA, zIncludeFilterSuppressNulls);
    }

    public eud<?> buildMapSerializer(wwl wwlVar, MapType mapType, fh2 fh2Var, boolean z, eud<Object> eudVar, e5q e5qVar, eud<Object> eudVar2) throws JsonMappingException {
        JsonFormat.Value valueG = fh2Var.g(null);
        if (valueG != null && valueG.getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        SerializationConfig config = wwlVar.getConfig();
        Iterator<xwl> it = customSerializers().iterator();
        eud<?> eudVarH = null;
        while (it.hasNext() && (eudVarH = it.next().findMapSerializer(config, mapType, fh2Var, eudVar, e5qVar, eudVar2)) == null) {
        }
        if (eudVarH == null && (eudVarH = findSerializerByAnnotations(wwlVar, mapType, fh2Var)) == null) {
            Object objFindFilterId = findFilterId(config, fh2Var);
            JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, fh2Var.u());
            eudVarH = _checkMapContentInclusion(wwlVar, fh2Var, MapSerializer.construct(defaultPropertyIgnorals != null ? defaultPropertyIgnorals.findIgnoredForSerialization() : null, mapType, z, e5qVar, eudVar, eudVar2, objFindFilterId));
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                eudVarH = it2.next().h(config, mapType, fh2Var, eudVarH);
            }
        }
        return eudVarH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vwl
    public eud<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, eud<Object> eudVar) {
        fh2 fh2VarIntrospectClassAnnotations = serializationConfig.introspectClassAnnotations(javaType.getRawClass());
        eud<?> jsonValueSerializer = null;
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<xwl> it = this._factoryConfig.keySerializers().iterator();
            while (it.hasNext() && (jsonValueSerializer = it.next().findSerializer(serializationConfig, javaType, fh2VarIntrospectClassAnnotations)) == null) {
            }
        }
        if (jsonValueSerializer != null) {
            eudVar = jsonValueSerializer;
        } else if (eudVar == null && (eudVar = StdKeySerializers.b(serializationConfig, javaType.getRawClass(), false)) == null) {
            fh2VarIntrospectClassAnnotations = serializationConfig.introspect(javaType);
            AnnotatedMember annotatedMemberJ = fh2VarIntrospectClassAnnotations.j();
            if (annotatedMemberJ != null) {
                eud<Object> eudVarB = StdKeySerializers.b(serializationConfig, annotatedMemberJ.getRawType(), true);
                if (serializationConfig.canOverrideAccessModifiers()) {
                    h04.f(annotatedMemberJ.getMember(), serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
                jsonValueSerializer = new JsonValueSerializer(annotatedMemberJ, eudVarB);
                eudVar = jsonValueSerializer;
            } else {
                eudVar = StdKeySerializers.a(serializationConfig, javaType.getRawClass());
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<lh2> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                eudVar = it2.next().f(serializationConfig, javaType, fh2VarIntrospectClassAnnotations, eudVar);
            }
        }
        return eudVar;
    }

    @Override // defpackage.vwl
    public abstract eud<Object> createSerializer(wwl wwlVar, JavaType javaType) throws JsonMappingException;

    @Override // defpackage.vwl
    public e5q createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> collectionCollectAndResolveSubtypesByClass;
        com.fasterxml.jackson.databind.introspect.a aVarU = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).u();
        c5q<?> c5qVarFindTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, aVarU, javaType);
        if (c5qVarFindTypeResolver == null) {
            c5qVarFindTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByClass = null;
        } else {
            collectionCollectAndResolveSubtypesByClass = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, aVarU);
        }
        if (c5qVarFindTypeResolver == null) {
            return null;
        }
        return c5qVarFindTypeResolver.buildTypeSerializer(serializationConfig, javaType, collectionCollectAndResolveSubtypesByClass);
    }

    public abstract Iterable<xwl> customSerializers();

    public ak4<Object, Object> findConverter(wwl wwlVar, fd1 fd1Var) throws JsonMappingException {
        Object objFindSerializationConverter = wwlVar.getAnnotationIntrospector().findSerializationConverter(fd1Var);
        if (objFindSerializationConverter == null) {
            return null;
        }
        return wwlVar.converterInstance(fd1Var, objFindSerializationConverter);
    }

    public eud<?> findConvertingSerializer(wwl wwlVar, fd1 fd1Var, eud<?> eudVar) throws JsonMappingException {
        ak4<Object, Object> ak4VarFindConverter = findConverter(wwlVar, fd1Var);
        return ak4VarFindConverter == null ? eudVar : new StdDelegatingSerializer(ak4VarFindConverter, ak4VarFindConverter.b(wwlVar.getTypeFactory()), eudVar);
    }

    public Object findFilterId(SerializationConfig serializationConfig, fh2 fh2Var) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(fh2Var.u());
    }

    public eud<?> findOptionalStdSerializer(wwl wwlVar, JavaType javaType, fh2 fh2Var, boolean z) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(wwlVar.getConfig(), javaType, fh2Var);
    }

    public eud<?> findReferenceSerializer(wwl wwlVar, ReferenceType referenceType, fh2 fh2Var, boolean z) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        e5q e5qVarCreateTypeSerializer = (e5q) contentType.getTypeHandler();
        SerializationConfig config = wwlVar.getConfig();
        if (e5qVarCreateTypeSerializer == null) {
            e5qVarCreateTypeSerializer = createTypeSerializer(config, contentType);
        }
        e5q e5qVar = e5qVarCreateTypeSerializer;
        eud<Object> eudVar = (eud) contentType.getValueHandler();
        Iterator<xwl> it = customSerializers().iterator();
        while (it.hasNext()) {
            eud<?> eudVarFindReferenceSerializer = it.next().findReferenceSerializer(config, referenceType, fh2Var, e5qVar, eudVar);
            if (eudVarFindReferenceSerializer != null) {
                return eudVarFindReferenceSerializer;
            }
        }
        if (referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(wwlVar, referenceType, fh2Var, z, e5qVar, eudVar);
        }
        return null;
    }

    public final eud<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, fh2 fh2Var, boolean z) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            return buildIteratorSerializer(serializationConfig, javaType, fh2Var, z, (javaTypeArrFindTypeParameters == null || javaTypeArrFindTypeParameters.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters[0]);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            return buildIterableSerializer(serializationConfig, javaType, fh2Var, z, (javaTypeArrFindTypeParameters2 == null || javaTypeArrFindTypeParameters2.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters2[0]);
        }
        if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        return null;
    }

    public final eud<?> findSerializerByAnnotations(wwl wwlVar, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        if (bud.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember annotatedMemberJ = fh2Var.j();
        if (annotatedMemberJ == null) {
            return null;
        }
        if (wwlVar.canOverrideAccessModifiers()) {
            h04.f(annotatedMemberJ.getMember(), wwlVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new JsonValueSerializer(annotatedMemberJ, findSerializerFromAnnotation(wwlVar, annotatedMemberJ));
    }

    public final eud<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, fh2 fh2Var, boolean z) {
        Class<? extends eud<?>> cls;
        String name = javaType.getRawClass().getName();
        eud<?> eudVar = _concrete.get(name);
        return (eudVar != null || (cls = _concreteLazy.get(name)) == null) ? eudVar : (eud) h04.k(cls, false);
    }

    public final eud<?> findSerializerByPrimaryType(wwl wwlVar, JavaType javaType, fh2 fh2Var, boolean z) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        eud<?> eudVarFindOptionalStdSerializer = findOptionalStdSerializer(wwlVar, javaType, fh2Var, z);
        if (eudVarFindOptionalStdSerializer != null) {
            return eudVarFindOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType javaTypeFindSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(wwlVar, javaType, fh2Var, z, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1));
        }
        if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        }
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return new InetAddressSerializer();
        }
        if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
            return new InetSocketAddressSerializer();
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return new TimeZoneSerializer();
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (!Number.class.isAssignableFrom(rawClass)) {
            if (Enum.class.isAssignableFrom(rawClass)) {
                return buildEnumSerializer(wwlVar.getConfig(), javaType, fh2Var);
            }
            return null;
        }
        JsonFormat.Value valueG = fh2Var.g(null);
        if (valueG != null) {
            int i = a.f7691a[valueG.getShape().ordinal()];
            if (i == 1) {
                return ToStringSerializer.instance;
            }
            if (i == 2 || i == 3) {
                return null;
            }
        }
        return NumberSerializer.instance;
    }

    public eud<Object> findSerializerFromAnnotation(wwl wwlVar, fd1 fd1Var) throws JsonMappingException {
        Object objFindSerializer = wwlVar.getAnnotationIntrospector().findSerializer(fd1Var);
        if (objFindSerializer == null) {
            return null;
        }
        return findConvertingSerializer(wwlVar, fd1Var, wwlVar.serializerInstance(fd1Var, objFindSerializer));
    }

    public SerializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public boolean usesStaticTyping(SerializationConfig serializationConfig, fh2 fh2Var, e5q e5qVar) {
        if (e5qVar != null) {
            return false;
        }
        JsonSerialize.Typing typingFindSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(fh2Var.u());
        if (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            return serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
        }
        return typingFindSerializationTyping == JsonSerialize.Typing.STATIC;
    }

    @Override // defpackage.vwl
    public final vwl withAdditionalKeySerializers(xwl xwlVar) {
        return withConfig(this._factoryConfig.withAdditionalKeySerializers(xwlVar));
    }

    @Override // defpackage.vwl
    public final vwl withAdditionalSerializers(xwl xwlVar) {
        return withConfig(this._factoryConfig.withAdditionalSerializers(xwlVar));
    }

    public abstract vwl withConfig(SerializerFactoryConfig serializerFactoryConfig);

    @Override // defpackage.vwl
    public final vwl withSerializerModifier(lh2 lh2Var) {
        return withConfig(this._factoryConfig.withSerializerModifier(lh2Var));
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        return new CollectionSerializer(javaType, z, e5qVar, eudVar);
    }
}
