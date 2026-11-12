package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.a;
import com.fasterxml.jackson.databind.introspect.f;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.bpo;
import defpackage.c5q;
import defpackage.fd1;
import defpackage.fh2;
import defpackage.h04;
import defpackage.kc4;
import defpackage.nkb;
import defpackage.owl;
import defpackage.r4q;
import defpackage.tb4;
import defpackage.z4q;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements f.a, Serializable {
    private static final long serialVersionUID = 2;
    protected final BaseSettings _base;
    protected final int _mapperFeatures;
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();
    protected static final JsonFormat.Value EMPTY_FORMAT = JsonFormat.Value.empty();

    public MapperConfig(BaseSettings baseSettings, int i) {
        this._base = baseSettings;
        this._mapperFeatures = i;
    }

    public static <F extends Enum<F> & tb4> int collectFeatureDefaults(Class<F> cls) {
        int mask = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            tb4 tb4Var = (tb4) obj;
            if (tb4Var.enabledByDefault()) {
                mask |= tb4Var.getMask();
            }
        }
        return mask;
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public owl compileString(String str) {
        return new SerializedString(str);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return getTypeFactory().constructSpecializedType(javaType, cls);
    }

    public final JavaType constructType(Class<?> cls) {
        return getTypeFactory().constructType(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.f.a
    public abstract /* synthetic */ f.a copy();

    public abstract kc4 findConfigOverride(Class<?> cls);

    @Override // com.fasterxml.jackson.databind.introspect.f.a
    public abstract /* synthetic */ Class findMixInClassFor(Class cls);

    public abstract PropertyName findRootName(JavaType javaType);

    public abstract PropertyName findRootName(Class<?> cls);

    public abstract Class<?> getActiveView();

    public AnnotationIntrospector getAnnotationIntrospector() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS) ? this._base.getAnnotationIntrospector() : NopAnnotationIntrospector.instance;
    }

    public abstract ContextAttributes getAttributes();

    public Base64Variant getBase64Variant() {
        return this._base.getBase64Variant();
    }

    public f getClassIntrospector() {
        return this._base.getClassIntrospector();
    }

    public abstract kc4 getConfigOverride(Class<?> cls);

    public final DateFormat getDateFormat() {
        return this._base.getDateFormat();
    }

    public abstract JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2);

    public JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2, JsonInclude.Value value) {
        return JsonInclude.Value.mergeAll(value, getConfigOverride(cls).getInclude(), getConfigOverride(cls2).getIncludeAsProperty());
    }

    public abstract Boolean getDefaultMergeable();

    public abstract Boolean getDefaultMergeable(Class<?> cls);

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls, a aVar);

    public abstract JsonInclude.Value getDefaultPropertyInclusion();

    public abstract JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls);

    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls, JsonInclude.Value value) {
        JsonInclude.Value include = getConfigOverride(cls).getInclude();
        return include != null ? include : value;
    }

    public abstract JsonSetter.Value getDefaultSetterInfo();

    public final c5q<?> getDefaultTyper(JavaType javaType) {
        return this._base.getTypeResolverBuilder();
    }

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, a aVar);

    public final nkb getHandlerInstantiator() {
        this._base.getHandlerInstantiator();
        return null;
    }

    public final Locale getLocale() {
        return this._base.getLocale();
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.getPropertyNamingStrategy();
    }

    public abstract bpo getSubtypeResolver();

    public final TimeZone getTimeZone() {
        return this._base.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._base.getTypeFactory();
    }

    public final boolean hasMapperFeatures(int i) {
        return (this._mapperFeatures & i) == i;
    }

    public fh2 introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public fh2 introspectDirectClassAnnotations(Class<?> cls) {
        return introspectDirectClassAnnotations(constructType(cls));
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return (mapperFeature.getMask() & this._mapperFeatures) != 0;
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public r4q typeIdResolverInstance(fd1 fd1Var, Class<? extends r4q> cls) {
        getHandlerInstantiator();
        return (r4q) h04.k(cls, canOverrideAccessModifiers());
    }

    public c5q<?> typeResolverBuilderInstance(fd1 fd1Var, Class<? extends c5q<?>> cls) {
        getHandlerInstantiator();
        return (c5q) h04.k(cls, canOverrideAccessModifiers());
    }

    public abstract boolean useRootWrapping();

    public abstract T with(MapperFeature mapperFeature, boolean z);

    public abstract T with(MapperFeature... mapperFeatureArr);

    public abstract T without(MapperFeature... mapperFeatureArr);

    public final JavaType constructType(z4q<?> z4qVar) {
        getTypeFactory();
        throw null;
    }

    public fh2 introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public final fh2 introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public MapperConfig(MapperConfig<T> mapperConfig, int i) {
        this._base = mapperConfig._base;
        this._mapperFeatures = i;
    }

    public MapperConfig(MapperConfig<T> mapperConfig, BaseSettings baseSettings) {
        this._base = baseSettings;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public MapperConfig(MapperConfig<T> mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }
}
