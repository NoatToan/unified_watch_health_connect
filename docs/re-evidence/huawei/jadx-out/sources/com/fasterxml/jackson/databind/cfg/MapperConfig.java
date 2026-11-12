package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import defpackage.ack;
import defpackage.adj;
import defpackage.adt;
import defpackage.ahp;
import defpackage.ahw;
import defpackage.xb;
import defpackage.ys;
import defpackage.yy;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements ClassIntrospector.MixInResolver, Serializable {
    private static final long serialVersionUID = 2;
    protected final yy _base;
    protected final int _mapperFeatures;
    protected static final JsonInclude.b EMPTY_INCLUDE = JsonInclude.b.e();
    protected static final JsonFormat.c EMPTY_FORMAT = JsonFormat.c.e();

    public abstract ConfigOverride findConfigOverride(Class<?> cls);

    public abstract ys findRootName(JavaType javaType);

    public abstract ys findRootName(Class<?> cls);

    public abstract Class<?> getActiveView();

    public abstract ContextAttributes getAttributes();

    public abstract ConfigOverride getConfigOverride(Class<?> cls);

    public abstract JsonInclude.b getDefaultInclusion(Class<?> cls, Class<?> cls2);

    public abstract Boolean getDefaultMergeable();

    public abstract Boolean getDefaultMergeable(Class<?> cls);

    public abstract JsonFormat.c getDefaultPropertyFormat(Class<?> cls);

    public abstract JsonIgnoreProperties.b getDefaultPropertyIgnorals(Class<?> cls);

    public abstract JsonIgnoreProperties.b getDefaultPropertyIgnorals(Class<?> cls, ack ackVar);

    public abstract JsonInclude.b getDefaultPropertyInclusion();

    public abstract JsonInclude.b getDefaultPropertyInclusion(Class<?> cls);

    public abstract JsonIncludeProperties.b getDefaultPropertyInclusions(Class<?> cls, ack ackVar);

    public abstract JsonSetter.e getDefaultSetterInfo();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, ack ackVar);

    public abstract SubtypeResolver getSubtypeResolver();

    public abstract boolean useRootWrapping();

    public abstract T with(MapperFeature mapperFeature, boolean z);

    public abstract T with(MapperFeature... mapperFeatureArr);

    public abstract T without(MapperFeature... mapperFeatureArr);

    protected MapperConfig(yy yyVar, int i) {
        this._base = yyVar;
        this._mapperFeatures = i;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig, int i) {
        this._base = mapperConfig._base;
        this._mapperFeatures = i;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig, yy yyVar) {
        this._base = yyVar;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public static <F extends Enum<F> & ConfigFeature> int collectFeatureDefaults(Class<F> cls) {
        int mask = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            ConfigFeature configFeature = (ConfigFeature) obj;
            if (configFeature.enabledByDefault()) {
                mask |= configFeature.getMask();
            }
        }
        return mask;
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this._mapperFeatures);
    }

    public final boolean hasMapperFeatures(int i) {
        return (this._mapperFeatures & i) == i;
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public SerializableString compileString(String str) {
        return new xb(str);
    }

    public ClassIntrospector getClassIntrospector() {
        return this._base.d();
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS)) {
            return this._base.a();
        }
        return NopAnnotationIntrospector.instance;
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.j();
    }

    public final AccessorNamingStrategy.Provider getAccessorNaming() {
        return this._base.c();
    }

    public final HandlerInstantiator getHandlerInstantiator() {
        return this._base.g();
    }

    public final TypeResolverBuilder<?> getDefaultTyper(JavaType javaType) {
        return this._base.o();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        PolymorphicTypeValidator polymorphicTypeValidatorI = this._base.i();
        return (polymorphicTypeValidatorI == adt.f303b && isEnabled(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? new adj() : polymorphicTypeValidatorI;
    }

    public final ahp getTypeFactory() {
        return this._base.m();
    }

    public final JavaType constructType(Class<?> cls) {
        return getTypeFactory().b(cls);
    }

    public final JavaType constructType(TypeReference<?> typeReference) {
        return getTypeFactory().b(typeReference.getType());
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return getTypeFactory().b(javaType, cls, true);
    }

    public BeanDescription introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public BeanDescription introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public BeanDescription introspectDirectClassAnnotations(Class<?> cls) {
        return introspectDirectClassAnnotations(constructType(cls));
    }

    public final BeanDescription introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public JsonInclude.b getDefaultPropertyInclusion(Class<?> cls, JsonInclude.b bVar) {
        JsonInclude.b include = getConfigOverride(cls).getInclude();
        return include != null ? include : bVar;
    }

    public JsonInclude.b getDefaultInclusion(Class<?> cls, Class<?> cls2, JsonInclude.b bVar) {
        return JsonInclude.b.a(bVar, getConfigOverride(cls).getInclude(), getConfigOverride(cls2).getIncludeAsProperty());
    }

    public final DateFormat getDateFormat() {
        return this._base.h();
    }

    public final Locale getLocale() {
        return this._base.f();
    }

    public final TimeZone getTimeZone() {
        return this._base.k();
    }

    public boolean hasExplicitTimeZone() {
        return this._base.l();
    }

    public Base64Variant getBase64Variant() {
        return this._base.b();
    }

    public TypeResolverBuilder<?> typeResolverBuilderInstance(Annotated annotated, Class<? extends TypeResolverBuilder<?>> cls) {
        TypeResolverBuilder<?> typeResolverBuilderTypeResolverBuilderInstance;
        HandlerInstantiator handlerInstantiator = getHandlerInstantiator();
        return (handlerInstantiator == null || (typeResolverBuilderTypeResolverBuilderInstance = handlerInstantiator.typeResolverBuilderInstance(this, annotated, cls)) == null) ? (TypeResolverBuilder) ahw.b(cls, canOverrideAccessModifiers()) : typeResolverBuilderTypeResolverBuilderInstance;
    }

    public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class<? extends TypeIdResolver> cls) {
        TypeIdResolver typeIdResolverTypeIdResolverInstance;
        HandlerInstantiator handlerInstantiator = getHandlerInstantiator();
        return (handlerInstantiator == null || (typeIdResolverTypeIdResolverInstance = handlerInstantiator.typeIdResolverInstance(this, annotated, cls)) == null) ? (TypeIdResolver) ahw.b(cls, canOverrideAccessModifiers()) : typeIdResolverTypeIdResolverInstance;
    }
}
