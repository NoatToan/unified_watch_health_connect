package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.util.Converter;
import defpackage.acd;
import defpackage.ack;
import defpackage.acq;
import defpackage.adg;
import defpackage.afi;
import defpackage.afk;
import defpackage.afl;
import defpackage.afm;
import defpackage.afq;
import defpackage.afr;
import defpackage.afx;
import defpackage.afz;
import defpackage.agb;
import defpackage.agd;
import defpackage.age;
import defpackage.agf;
import defpackage.agg;
import defpackage.agh;
import defpackage.agi;
import defpackage.agk;
import defpackage.agl;
import defpackage.agm;
import defpackage.agn;
import defpackage.agq;
import defpackage.ags;
import defpackage.agt;
import defpackage.agu;
import defpackage.agv;
import defpackage.agw;
import defpackage.agx;
import defpackage.agy;
import defpackage.aha;
import defpackage.ahb;
import defpackage.ahe;
import defpackage.ahg;
import defpackage.ahh;
import defpackage.ahi;
import defpackage.ahk;
import defpackage.ahp;
import defpackage.ahr;
import defpackage.aht;
import defpackage.ahw;
import defpackage.aii;
import defpackage.ym;
import defpackage.yt;
import defpackage.yz;
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
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    protected static final HashMap<String, JsonSerializer<?>> _concrete;
    protected static final HashMap<String, Class<? extends JsonSerializer<?>>> _concreteLazy;
    protected final yz _factoryConfig;

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public abstract JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws ym;

    protected abstract Iterable<Serializers> customSerializers();

    public abstract SerializerFactory withConfig(yz yzVar);

    static {
        HashMap<String, Class<? extends JsonSerializer<?>>> map = new HashMap<>();
        HashMap<String, JsonSerializer<?>> map2 = new HashMap<>();
        map2.put(String.class.getName(), new agx());
        aha ahaVar = aha.f401b;
        map2.put(StringBuffer.class.getName(), ahaVar);
        map2.put(StringBuilder.class.getName(), ahaVar);
        map2.put(Character.class.getName(), ahaVar);
        map2.put(Character.TYPE.getName(), ahaVar);
        NumberSerializers.a(map2);
        map2.put(Boolean.TYPE.getName(), new afx(true));
        map2.put(Boolean.class.getName(), new afx(false));
        map2.put(BigInteger.class.getName(), new agn(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new agn(BigDecimal.class));
        map2.put(Calendar.class.getName(), agg.d);
        map2.put(Date.class.getName(), agf.f380b);
        for (Map.Entry<Class<?>, Object> entry : ags.d()) {
            Object value = entry.getValue();
            if (value instanceof JsonSerializer) {
                map2.put(entry.getKey().getName(), (JsonSerializer) value);
            } else {
                map.put(entry.getKey().getName(), (Class) value);
            }
        }
        map.put(aii.class.getName(), agw.class);
        _concrete = map2;
        _concreteLazy = map;
    }

    public BasicSerializerFactory(yz yzVar) {
        this._factoryConfig = yzVar == null ? new yz() : yzVar;
    }

    public yz getFactoryConfig() {
        return this._factoryConfig;
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final SerializerFactory withAdditionalSerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.b(serializers));
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final SerializerFactory withAdditionalKeySerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.a(serializers));
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        return withConfig(this._factoryConfig.d(beanSerializerModifier));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f A[PHI: r2
      0x007f: PHI (r2v7 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) = 
      (r2v6 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
      (r2v9 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
     binds: [B:13:0x003a, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createKeySerializer(SerializerProvider serializerProvider, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws ym {
        JsonSerializer<?> jsonSerializerFindSerializer;
        yt config = serializerProvider.getConfig();
        BeanDescription beanDescriptionD = config.d(javaType);
        if (this._factoryConfig.d()) {
            Iterator<Serializers> it = this._factoryConfig.b().iterator();
            jsonSerializerFindSerializer = null;
            while (it.hasNext() && (jsonSerializerFindSerializer = it.next().findSerializer(config, javaType, beanDescriptionD)) == null) {
            }
        } else {
            jsonSerializerFindSerializer = null;
        }
        if (jsonSerializerFindSerializer == null) {
            JsonSerializer<Object> jsonSerializer_findKeySerializer = _findKeySerializer(serializerProvider, beanDescriptionD.getClassInfo());
            if (jsonSerializer_findKeySerializer != null) {
                jsonSerializer = jsonSerializer_findKeySerializer;
            } else if (jsonSerializer == null) {
                jsonSerializer_findKeySerializer = StdKeySerializers.getStdKeySerializer(config, javaType.getRawClass(), false);
                if (jsonSerializer_findKeySerializer == null) {
                    AnnotatedMember annotatedMemberFindJsonKeyAccessor = beanDescriptionD.findJsonKeyAccessor();
                    if (annotatedMemberFindJsonKeyAccessor == null) {
                        annotatedMemberFindJsonKeyAccessor = beanDescriptionD.findJsonValueAccessor();
                    }
                    if (annotatedMemberFindJsonKeyAccessor != null) {
                        JsonSerializer<Object> jsonSerializerCreateKeySerializer = createKeySerializer(serializerProvider, annotatedMemberFindJsonKeyAccessor.getType(), jsonSerializer);
                        if (config.canOverrideAccessModifiers()) {
                            ahw.a(annotatedMemberFindJsonKeyAccessor.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        jsonSerializer = new agm(annotatedMemberFindJsonKeyAccessor, null, jsonSerializerCreateKeySerializer);
                    } else {
                        jsonSerializer = StdKeySerializers.getFallbackKeySerializer(config, javaType.getRawClass());
                    }
                } else {
                    jsonSerializer = jsonSerializer_findKeySerializer;
                }
            }
        } else {
            jsonSerializer = jsonSerializerFindSerializer;
        }
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.c().iterator();
            while (it2.hasNext()) {
                jsonSerializer = it2.next().modifyKeySerializer(config, javaType, beanDescriptionD, jsonSerializer);
            }
        }
        return jsonSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    @Deprecated
    public JsonSerializer<Object> createKeySerializer(yt ytVar, JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        BeanDescription beanDescriptionD = ytVar.d(javaType);
        JsonSerializer<?> jsonSerializerFindSerializer = null;
        if (this._factoryConfig.d()) {
            Iterator<Serializers> it = this._factoryConfig.b().iterator();
            while (it.hasNext() && (jsonSerializerFindSerializer = it.next().findSerializer(ytVar, javaType, beanDescriptionD)) == null) {
            }
        }
        if (jsonSerializerFindSerializer != null) {
            jsonSerializer = jsonSerializerFindSerializer;
        } else if (jsonSerializer == null && (jsonSerializer = StdKeySerializers.getStdKeySerializer(ytVar, javaType.getRawClass(), false)) == null) {
            jsonSerializer = StdKeySerializers.getFallbackKeySerializer(ytVar, javaType.getRawClass());
        }
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.c().iterator();
            while (it2.hasNext()) {
                jsonSerializer = it2.next().modifyKeySerializer(ytVar, javaType, beanDescriptionD, jsonSerializer);
            }
        }
        return jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public TypeSerializer createTypeSerializer(yt ytVar, JavaType javaType) {
        Collection<adg> collectionCollectAndResolveSubtypesByClass;
        ack classInfo = ytVar.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = ytVar.getAnnotationIntrospector().findTypeResolver(ytVar, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null) {
            typeResolverBuilderFindTypeResolver = ytVar.getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByClass = null;
        } else {
            collectionCollectAndResolveSubtypesByClass = ytVar.getSubtypeResolver().collectAndResolveSubtypesByClass(ytVar, classInfo);
        }
        if (typeResolverBuilderFindTypeResolver == null) {
            return null;
        }
        return typeResolverBuilderFindTypeResolver.buildTypeSerializer(ytVar, javaType, collectionCollectAndResolveSubtypesByClass);
    }

    protected final JsonSerializer<?> findSerializerByLookup(JavaType javaType, yt ytVar, BeanDescription beanDescription, boolean z) {
        Class<? extends JsonSerializer<?>> cls;
        String name = javaType.getRawClass().getName();
        JsonSerializer<?> jsonSerializer = _concrete.get(name);
        return (jsonSerializer != null || (cls = _concreteLazy.get(name)) == null) ? jsonSerializer : (JsonSerializer) ahw.b((Class) cls, false);
    }

    protected final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws ym {
        if (JsonSerializable.class.isAssignableFrom(javaType.getRawClass())) {
            return agt.f395a;
        }
        AnnotatedMember annotatedMemberFindJsonValueAccessor = beanDescription.findJsonValueAccessor();
        if (annotatedMemberFindJsonValueAccessor == null) {
            return null;
        }
        if (serializerProvider.canOverrideAccessModifiers()) {
            ahw.a(annotatedMemberFindJsonValueAccessor.getMember(), serializerProvider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        JavaType type = annotatedMemberFindJsonValueAccessor.getType();
        JsonSerializer<Object> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMemberFindJsonValueAccessor);
        if (jsonSerializerFindSerializerFromAnnotation == null) {
            jsonSerializerFindSerializerFromAnnotation = (JsonSerializer) type.getValueHandler();
        }
        TypeSerializer typeSerializerCreateTypeSerializer = (TypeSerializer) type.getTypeHandler();
        if (typeSerializerCreateTypeSerializer == null) {
            typeSerializerCreateTypeSerializer = createTypeSerializer(serializerProvider.getConfig(), type);
        }
        return new agm(annotatedMemberFindJsonValueAccessor, typeSerializerCreateTypeSerializer, jsonSerializerFindSerializerFromAnnotation);
    }

    protected final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws ym {
        if (javaType.isEnumType()) {
            return buildEnumSerializer(serializerProvider.getConfig(), javaType, beanDescription);
        }
        Class<?> rawClass = javaType.getRawClass();
        JsonSerializer<?> jsonSerializerFindOptionalStdSerializer = findOptionalStdSerializer(serializerProvider, javaType, beanDescription, z);
        if (jsonSerializerFindOptionalStdSerializer != null) {
            return jsonSerializerFindOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return agg.d;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return agf.f380b;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType javaTypeFindSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(serializerProvider, javaType, beanDescription, z, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1));
        }
        if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new agb();
        }
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return new agl();
        }
        if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
            return new agk();
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return new agy();
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return aha.f401b;
        }
        if (!Number.class.isAssignableFrom(rawClass)) {
            return null;
        }
        int i = AnonymousClass3.e[beanDescription.findExpectedFormat(null).b().ordinal()];
        if (i == 1) {
            return aha.f401b;
        }
        if (i == 2 || i == 3) {
            return null;
        }
        return agn.f385a;
    }

    protected JsonSerializer<?> findOptionalStdSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws ym {
        return acd.f240c.a(serializerProvider.getConfig(), javaType, beanDescription);
    }

    protected final JsonSerializer<?> findSerializerByAddonType(yt ytVar, JavaType javaType, BeanDescription beanDescription, boolean z) throws ym {
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrA = ytVar.getTypeFactory().a(javaType, Iterator.class);
            return buildIteratorSerializer(ytVar, javaType, beanDescription, z, (javaTypeArrA == null || javaTypeArrA.length != 1) ? ahp.c() : javaTypeArrA[0]);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrA2 = ytVar.getTypeFactory().a(javaType, Iterable.class);
            return buildIterableSerializer(ytVar, javaType, beanDescription, z, (javaTypeArrA2 == null || javaTypeArrA2.length != 1) ? ahp.c() : javaTypeArrA2[0]);
        }
        if (CharSequence.class.isAssignableFrom(rawClass)) {
            return aha.f401b;
        }
        return null;
    }

    protected JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider serializerProvider, Annotated annotated) throws ym {
        Object objFindSerializer = serializerProvider.getAnnotationIntrospector().findSerializer(annotated);
        if (objFindSerializer == null) {
            return null;
        }
        return findConvertingSerializer(serializerProvider, annotated, serializerProvider.serializerInstance(annotated, objFindSerializer));
    }

    protected JsonSerializer<?> findConvertingSerializer(SerializerProvider serializerProvider, Annotated annotated, JsonSerializer<?> jsonSerializer) throws ym {
        Converter<Object, Object> converterFindConverter = findConverter(serializerProvider, annotated);
        return converterFindConverter == null ? jsonSerializer : new agu(converterFindConverter, converterFindConverter.getOutputType(serializerProvider.getTypeFactory()), jsonSerializer);
    }

    protected Converter<Object, Object> findConverter(SerializerProvider serializerProvider, Annotated annotated) throws ym {
        Object objFindSerializationConverter = serializerProvider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (objFindSerializationConverter == null) {
            return null;
        }
        return serializerProvider.converterInstance(annotated, objFindSerializationConverter);
    }

    protected JsonSerializer<?> buildContainerSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws ym {
        BeanDescription beanDescription2;
        BeanDescription beanDescription3 = beanDescription;
        yt config = serializerProvider.getConfig();
        boolean z2 = (z || !javaType.useStaticType() || (javaType.isContainerType() && javaType.getContentType().isJavaLangObject())) ? z : true;
        TypeSerializer typeSerializerCreateTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        if (typeSerializerCreateTypeSerializer != null) {
            z2 = false;
        }
        boolean z3 = z2;
        JsonSerializer<Object> jsonSerializer_findContentSerializer = _findContentSerializer(serializerProvider, beanDescription.getClassInfo());
        JsonSerializer<?> jsonSerializerModifyCollectionLikeSerializer = null;
        if (javaType.isMapLikeType()) {
            ahk ahkVar = (ahk) javaType;
            JsonSerializer<Object> jsonSerializer_findKeySerializer = _findKeySerializer(serializerProvider, beanDescription.getClassInfo());
            if (ahkVar instanceof ahh) {
                return buildMapSerializer(serializerProvider, (ahh) ahkVar, beanDescription, z3, jsonSerializer_findKeySerializer, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
            }
            Iterator<Serializers> it = customSerializers().iterator();
            while (it.hasNext() && (jsonSerializerModifyCollectionLikeSerializer = it.next().findMapLikeSerializer(config, ahkVar, beanDescription, jsonSerializer_findKeySerializer, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer)) == null) {
            }
            if (jsonSerializerModifyCollectionLikeSerializer == null) {
                jsonSerializerModifyCollectionLikeSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
            if (jsonSerializerModifyCollectionLikeSerializer != null && this._factoryConfig.e()) {
                Iterator<BeanSerializerModifier> it2 = this._factoryConfig.c().iterator();
                while (it2.hasNext()) {
                    jsonSerializerModifyCollectionLikeSerializer = it2.next().modifyMapLikeSerializer(config, ahkVar, beanDescription3, jsonSerializerModifyCollectionLikeSerializer);
                }
            }
            return jsonSerializerModifyCollectionLikeSerializer;
        }
        if (javaType.isCollectionLikeType()) {
            ahb ahbVar = (ahb) javaType;
            if (ahbVar instanceof ahg) {
                return buildCollectionSerializer(serializerProvider, (ahg) ahbVar, beanDescription, z3, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
            }
            Iterator<Serializers> it3 = customSerializers().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    beanDescription2 = beanDescription3;
                    break;
                }
                beanDescription2 = beanDescription3;
                jsonSerializerModifyCollectionLikeSerializer = it3.next().findCollectionLikeSerializer(config, ahbVar, beanDescription, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
                if (jsonSerializerModifyCollectionLikeSerializer != null) {
                    break;
                }
                beanDescription3 = beanDescription2;
            }
            if (jsonSerializerModifyCollectionLikeSerializer == null) {
                jsonSerializerModifyCollectionLikeSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
            if (jsonSerializerModifyCollectionLikeSerializer != null && this._factoryConfig.e()) {
                Iterator<BeanSerializerModifier> it4 = this._factoryConfig.c().iterator();
                while (it4.hasNext()) {
                    jsonSerializerModifyCollectionLikeSerializer = it4.next().modifyCollectionLikeSerializer(config, ahbVar, beanDescription2, jsonSerializerModifyCollectionLikeSerializer);
                }
            }
            return jsonSerializerModifyCollectionLikeSerializer;
        }
        if (javaType.isArrayType()) {
            return buildArraySerializer(serializerProvider, (ahe) javaType, beanDescription, z3, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected JsonSerializer<?> buildCollectionSerializer(SerializerProvider serializerProvider, ahg ahgVar, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws ym {
        JsonSerializer<?> jsonSerializerBuildIndexedListSerializer;
        yt config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializerModifyCollectionSerializer = null;
        while (it.hasNext() && (jsonSerializerModifyCollectionSerializer = it.next().findCollectionSerializer(config, ahgVar, beanDescription, typeSerializer, jsonSerializer)) == null) {
        }
        if (jsonSerializerModifyCollectionSerializer == null && (jsonSerializerModifyCollectionSerializer = findSerializerByAnnotations(serializerProvider, ahgVar, beanDescription)) == null) {
            if (beanDescription.findExpectedFormat(null).b() == JsonFormat.Shape.OBJECT) {
                return null;
            }
            Class<?> rawClass = ahgVar.getRawClass();
            if (EnumSet.class.isAssignableFrom(rawClass)) {
                JavaType contentType = ahgVar.getContentType();
                jsonSerializerModifyCollectionSerializer = buildEnumSetSerializer(contentType.isEnumImplType() ? contentType : null);
            } else {
                Class<?> rawClass2 = ahgVar.getContentType().getRawClass();
                if (isIndexedList(rawClass)) {
                    if (rawClass2 == String.class) {
                        if (ahw.c(jsonSerializer)) {
                            jsonSerializerBuildIndexedListSerializer = afi.f358b;
                        }
                    } else {
                        jsonSerializerBuildIndexedListSerializer = buildIndexedListSerializer(ahgVar.getContentType(), z, typeSerializer, jsonSerializer);
                    }
                    jsonSerializerModifyCollectionSerializer = jsonSerializerBuildIndexedListSerializer;
                } else if (rawClass2 == String.class && ahw.c(jsonSerializer)) {
                    jsonSerializerBuildIndexedListSerializer = afr.e;
                    jsonSerializerModifyCollectionSerializer = jsonSerializerBuildIndexedListSerializer;
                }
                if (jsonSerializerModifyCollectionSerializer == null) {
                    jsonSerializerModifyCollectionSerializer = buildCollectionSerializer(ahgVar.getContentType(), z, typeSerializer, jsonSerializer);
                }
            }
        }
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.c().iterator();
            while (it2.hasNext()) {
                jsonSerializerModifyCollectionSerializer = it2.next().modifyCollectionSerializer(config, ahgVar, beanDescription, jsonSerializerModifyCollectionSerializer);
            }
        }
        return jsonSerializerModifyCollectionSerializer;
    }

    protected boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new afm(javaType, z, typeSerializer, jsonSerializer);
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new agd(javaType, z, typeSerializer, jsonSerializer);
    }

    public JsonSerializer<?> buildEnumSetSerializer(JavaType javaType) {
        return new agi(javaType);
    }

    protected JsonSerializer<?> buildMapSerializer(SerializerProvider serializerProvider, ahh ahhVar, BeanDescription beanDescription, boolean z, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) throws ym {
        if (beanDescription.findExpectedFormat(null).b() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        yt config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializerModifyMapSerializer = null;
        while (it.hasNext() && (jsonSerializerModifyMapSerializer = it.next().findMapSerializer(config, ahhVar, beanDescription, jsonSerializer, typeSerializer, jsonSerializer2)) == null) {
        }
        if (jsonSerializerModifyMapSerializer == null && (jsonSerializerModifyMapSerializer = findSerializerByAnnotations(serializerProvider, ahhVar, beanDescription)) == null) {
            Object objFindFilterId = findFilterId(config, beanDescription);
            JsonIgnoreProperties.b defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescription.getClassInfo());
            Set<String> setE = defaultPropertyIgnorals == null ? null : defaultPropertyIgnorals.e();
            JsonIncludeProperties.b defaultPropertyInclusions = config.getDefaultPropertyInclusions(Map.class, beanDescription.getClassInfo());
            jsonSerializerModifyMapSerializer = _checkMapContentInclusion(serializerProvider, beanDescription, agq.c(setE, defaultPropertyInclusions != null ? defaultPropertyInclusions.b() : null, ahhVar, z, typeSerializer, jsonSerializer, jsonSerializer2, objFindFilterId));
        }
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.c().iterator();
            while (it2.hasNext()) {
                jsonSerializerModifyMapSerializer = it2.next().modifyMapSerializer(config, ahhVar, beanDescription, jsonSerializerModifyMapSerializer);
            }
        }
        return jsonSerializerModifyMapSerializer;
    }

    protected agq _checkMapContentInclusion(SerializerProvider serializerProvider, BeanDescription beanDescription, agq agqVar) throws ym {
        JavaType contentType = agqVar.getContentType();
        JsonInclude.b bVar_findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.class);
        JsonInclude.Include includeD = bVar_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : bVar_findInclusionWithContent.d();
        Object objD = null;
        boolean zIncludeFilterSuppressNulls = true;
        if (includeD == JsonInclude.Include.USE_DEFAULTS || includeD == JsonInclude.Include.ALWAYS) {
            return !serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ? agqVar.a(null, true) : agqVar;
        }
        int i = AnonymousClass3.f4182a[includeD.ordinal()];
        if (i == 1) {
            objD = ahr.d(contentType);
            if (objD != null && objD.getClass().isArray()) {
                objD = aht.b(objD);
            }
        } else if (i != 2) {
            if (i == 3) {
                objD = agq.f391a;
            } else if (i == 4 && (objD = serializerProvider.includeFilterInstance(null, bVar_findInclusionWithContent.a())) != null) {
                zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(objD);
            }
        } else if (contentType.isReferenceType()) {
            objD = agq.f391a;
        }
        return agqVar.a(objD, zIncludeFilterSuppressNulls);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4182a;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f4182a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4182a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4182a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4182a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4182a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4182a[JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            e = iArr2;
            try {
                iArr2[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[JsonFormat.Shape.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[JsonFormat.Shape.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    protected JsonSerializer<?> buildMapEntrySerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2, JavaType javaType3) throws ym {
        Object objD = null;
        if (JsonFormat.c.d(beanDescription.findExpectedFormat(null), serializerProvider.getDefaultPropertyFormat(Map.Entry.class)).b() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        afk afkVar = new afk(javaType3, javaType2, javaType3, z, createTypeSerializer(serializerProvider.getConfig(), javaType3), null);
        JavaType contentType = afkVar.getContentType();
        JsonInclude.b bVar_findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.Entry.class);
        JsonInclude.Include includeD = bVar_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : bVar_findInclusionWithContent.d();
        if (includeD == JsonInclude.Include.USE_DEFAULTS || includeD == JsonInclude.Include.ALWAYS) {
            return afkVar;
        }
        int i = AnonymousClass3.f4182a[includeD.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i == 1) {
            objD = ahr.d(contentType);
            if (objD != null && objD.getClass().isArray()) {
                objD = aht.b(objD);
            }
        } else if (i != 2) {
            if (i == 3) {
                objD = agq.f391a;
            } else if (i == 4 && (objD = serializerProvider.includeFilterInstance(null, bVar_findInclusionWithContent.a())) != null) {
                zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(objD);
            }
        } else if (contentType.isReferenceType()) {
            objD = agq.f391a;
        }
        return afkVar.d(objD, zIncludeFilterSuppressNulls);
    }

    protected JsonInclude.b _findInclusionWithContent(SerializerProvider serializerProvider, BeanDescription beanDescription, JavaType javaType, Class<?> cls) throws ym {
        yt config = serializerProvider.getConfig();
        JsonInclude.b defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, beanDescription.findPropertyInclusion(config.getDefaultPropertyInclusion()));
        JsonInclude.b defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), null);
        if (defaultPropertyInclusion2 != null) {
            int i = AnonymousClass3.f4182a[defaultPropertyInclusion2.b().ordinal()];
            if (i == 4) {
                return defaultPropertyInclusion.c(defaultPropertyInclusion2.a());
            }
            if (i != 6) {
                return defaultPropertyInclusion.d(defaultPropertyInclusion2.b());
            }
        }
        return defaultPropertyInclusion;
    }

    protected JsonSerializer<?> buildArraySerializer(SerializerProvider serializerProvider, ahe aheVar, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws ym {
        yt config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializerModifyArraySerializer = null;
        while (it.hasNext() && (jsonSerializerModifyArraySerializer = it.next().findArraySerializer(config, aheVar, beanDescription, typeSerializer, jsonSerializer)) == null) {
        }
        if (jsonSerializerModifyArraySerializer == null) {
            Class<?> rawClass = aheVar.getRawClass();
            if (jsonSerializer == null || ahw.c(jsonSerializer)) {
                if (String[].class == rawClass) {
                    jsonSerializerModifyArraySerializer = afq.d;
                } else {
                    jsonSerializerModifyArraySerializer = StdArraySerializers.c(rawClass);
                }
            }
            if (jsonSerializerModifyArraySerializer == null) {
                jsonSerializerModifyArraySerializer = new agv(aheVar.getContentType(), z, typeSerializer, jsonSerializer);
            }
        }
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.c().iterator();
            while (it2.hasNext()) {
                jsonSerializerModifyArraySerializer = it2.next().modifyArraySerializer(config, aheVar, beanDescription, jsonSerializerModifyArraySerializer);
            }
        }
        return jsonSerializerModifyArraySerializer;
    }

    public JsonSerializer<?> findReferenceSerializer(SerializerProvider serializerProvider, ahi ahiVar, BeanDescription beanDescription, boolean z) throws ym {
        JavaType contentType = ahiVar.getContentType();
        TypeSerializer typeSerializerCreateTypeSerializer = (TypeSerializer) contentType.getTypeHandler();
        yt config = serializerProvider.getConfig();
        if (typeSerializerCreateTypeSerializer == null) {
            typeSerializerCreateTypeSerializer = createTypeSerializer(config, contentType);
        }
        TypeSerializer typeSerializer = typeSerializerCreateTypeSerializer;
        JsonSerializer<Object> jsonSerializer = (JsonSerializer) contentType.getValueHandler();
        Iterator<Serializers> it = customSerializers().iterator();
        while (it.hasNext()) {
            JsonSerializer<?> jsonSerializerFindReferenceSerializer = it.next().findReferenceSerializer(config, ahiVar, beanDescription, typeSerializer, jsonSerializer);
            if (jsonSerializerFindReferenceSerializer != null) {
                return jsonSerializerFindReferenceSerializer;
            }
        }
        if (ahiVar.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(serializerProvider, ahiVar, beanDescription, z, typeSerializer, jsonSerializer);
        }
        return null;
    }

    protected JsonSerializer<?> buildAtomicReferenceSerializer(SerializerProvider serializerProvider, ahi ahiVar, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws ym {
        boolean zIncludeFilterSuppressNulls;
        JavaType referencedType = ahiVar.getReferencedType();
        JsonInclude.b bVar_findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, referencedType, AtomicReference.class);
        JsonInclude.Include includeD = bVar_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : bVar_findInclusionWithContent.d();
        Object objD = null;
        if (includeD == JsonInclude.Include.USE_DEFAULTS || includeD == JsonInclude.Include.ALWAYS) {
            zIncludeFilterSuppressNulls = false;
        } else {
            int i = AnonymousClass3.f4182a[includeD.ordinal()];
            zIncludeFilterSuppressNulls = true;
            if (i == 1) {
                objD = ahr.d(referencedType);
                if (objD != null && objD.getClass().isArray()) {
                    objD = aht.b(objD);
                }
            } else if (i != 2) {
                if (i == 3) {
                    objD = agq.f391a;
                } else if (i == 4 && (objD = serializerProvider.includeFilterInstance(null, bVar_findInclusionWithContent.a())) != null) {
                    zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(objD);
                }
            } else if (referencedType.isReferenceType()) {
                objD = agq.f391a;
            }
        }
        return new afz(ahiVar, z, typeSerializer, jsonSerializer).withContentInclusion(objD, zIncludeFilterSuppressNulls);
    }

    protected JsonSerializer<?> buildIteratorSerializer(yt ytVar, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws ym {
        return new afl(javaType2, z, createTypeSerializer(ytVar, javaType2));
    }

    protected JsonSerializer<?> buildIterableSerializer(yt ytVar, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws ym {
        return new agh(javaType2, z, createTypeSerializer(ytVar, javaType2));
    }

    protected JsonSerializer<?> buildEnumSerializer(yt ytVar, JavaType javaType, BeanDescription beanDescription) throws ym {
        JsonFormat.c cVarFindExpectedFormat = beanDescription.findExpectedFormat(null);
        if (cVarFindExpectedFormat.b() == JsonFormat.Shape.OBJECT) {
            ((acq) beanDescription).c("declaringClass");
            return null;
        }
        JsonSerializer<?> jsonSerializerB = age.b(javaType.getRawClass(), ytVar, beanDescription, cVarFindExpectedFormat);
        if (this._factoryConfig.e()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.c().iterator();
            while (it.hasNext()) {
                jsonSerializerB = it.next().modifyEnumSerializer(ytVar, javaType, beanDescription, jsonSerializerB);
            }
        }
        return jsonSerializerB;
    }

    protected JsonSerializer<Object> _findKeySerializer(SerializerProvider serializerProvider, Annotated annotated) throws ym {
        Object objFindKeySerializer = serializerProvider.getAnnotationIntrospector().findKeySerializer(annotated);
        if (objFindKeySerializer != null) {
            return serializerProvider.serializerInstance(annotated, objFindKeySerializer);
        }
        return null;
    }

    protected JsonSerializer<Object> _findContentSerializer(SerializerProvider serializerProvider, Annotated annotated) throws ym {
        Object objFindContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(annotated);
        if (objFindContentSerializer != null) {
            return serializerProvider.serializerInstance(annotated, objFindContentSerializer);
        }
        return null;
    }

    protected Object findFilterId(yt ytVar, BeanDescription beanDescription) {
        return ytVar.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
    }

    protected boolean usesStaticTyping(yt ytVar, BeanDescription beanDescription, TypeSerializer typeSerializer) {
        if (typeSerializer != null) {
            return false;
        }
        JsonSerialize.Typing typingFindSerializationTyping = ytVar.getAnnotationIntrospector().findSerializationTyping(beanDescription.getClassInfo());
        if (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            return ytVar.isEnabled(MapperFeature.USE_STATIC_TYPING);
        }
        return typingFindSerializationTyping == JsonSerialize.Typing.STATIC;
    }
}
