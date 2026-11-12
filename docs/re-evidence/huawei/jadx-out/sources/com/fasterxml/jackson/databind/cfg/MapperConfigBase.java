package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.ConfigFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import defpackage.ack;
import defpackage.ada;
import defpackage.ahp;
import defpackage.aie;
import defpackage.ys;
import defpackage.yw;
import defpackage.yy;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public abstract class MapperConfigBase<CFG extends ConfigFeature, T extends MapperConfigBase<CFG, T>> extends MapperConfig<T> implements Serializable {
    private static final int AUTO_DETECT_MASK;
    protected final ContextAttributes _attributes;
    protected final yw _configOverrides;
    protected final ada _mixIns;
    protected final ys _rootName;
    protected final aie _rootNames;
    protected final SubtypeResolver _subtypeResolver;
    protected final Class<?> _view;
    protected static final ConfigOverride EMPTY_OVERRIDE = ConfigOverride.empty();
    private static final int DEFAULT_MAPPER_FEATURES = collectFeatureDefaults(MapperFeature.class);

    protected abstract T _withBase(yy yyVar);

    protected abstract T _withMapperFeatures(int i);

    public abstract T with(ContextAttributes contextAttributes);

    public abstract T with(SubtypeResolver subtypeResolver);

    public abstract T withRootName(ys ysVar);

    public abstract T withView(Class<?> cls);

    static {
        int mask = MapperFeature.AUTO_DETECT_FIELDS.getMask();
        int mask2 = MapperFeature.AUTO_DETECT_GETTERS.getMask();
        AUTO_DETECT_MASK = mask | mask2 | MapperFeature.AUTO_DETECT_IS_GETTERS.getMask() | MapperFeature.AUTO_DETECT_SETTERS.getMask() | MapperFeature.AUTO_DETECT_CREATORS.getMask();
    }

    public MapperConfigBase(yy yyVar, SubtypeResolver subtypeResolver, ada adaVar, aie aieVar, yw ywVar) {
        super(yyVar, DEFAULT_MAPPER_FEATURES);
        this._mixIns = adaVar;
        this._subtypeResolver = subtypeResolver;
        this._rootNames = aieVar;
        this._rootName = null;
        this._view = null;
        this._attributes = ContextAttributes.getEmpty();
        this._configOverrides = ywVar;
    }

    protected MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, SubtypeResolver subtypeResolver, ada adaVar, aie aieVar, yw ywVar) {
        super(mapperConfigBase, mapperConfigBase._base.e());
        this._mixIns = adaVar;
        this._subtypeResolver = subtypeResolver;
        this._rootNames = aieVar;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = ywVar;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, yy yyVar) {
        super(mapperConfigBase, yyVar);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, int i) {
        super(mapperConfigBase, i);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, SubtypeResolver subtypeResolver) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, ys ysVar) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = ysVar;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, Class<?> cls) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = cls;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    protected MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, ada adaVar) {
        super(mapperConfigBase);
        this._mixIns = adaVar;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, ContextAttributes contextAttributes) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = contextAttributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T with(MapperFeature... mapperFeatureArr) {
        int mask = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            mask |= mapperFeature.getMask();
        }
        return mask == this._mapperFeatures ? this : (T) _withMapperFeatures(mask);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T without(MapperFeature... mapperFeatureArr) {
        int i = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            i &= ~mapperFeature.getMask();
        }
        return i == this._mapperFeatures ? this : (T) _withMapperFeatures(i);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T with(MapperFeature mapperFeature, boolean z) {
        int mask;
        if (z) {
            mask = mapperFeature.getMask() | this._mapperFeatures;
        } else {
            mask = (~mapperFeature.getMask()) & this._mapperFeatures;
        }
        return mask == this._mapperFeatures ? this : (T) _withMapperFeatures(mask);
    }

    public final T with(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.e(annotationIntrospector));
    }

    public final T withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.d(annotationIntrospector));
    }

    public final T withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.c(annotationIntrospector));
    }

    public final T with(ClassIntrospector classIntrospector) {
        return (T) _withBase(this._base.e(classIntrospector));
    }

    public T withAttributes(Map<?, ?> map) {
        return (T) with(getAttributes().withSharedAttributes(map));
    }

    public T withAttribute(Object obj, Object obj2) {
        return (T) with(getAttributes().withSharedAttribute(obj, obj2));
    }

    public T withoutAttribute(Object obj) {
        return (T) with(getAttributes().withoutSharedAttribute(obj));
    }

    public final T with(ahp ahpVar) {
        return (T) _withBase(this._base.d(ahpVar));
    }

    public final T with(TypeResolverBuilder<?> typeResolverBuilder) {
        return (T) _withBase(this._base.a(typeResolverBuilder));
    }

    public final T with(PropertyNamingStrategy propertyNamingStrategy) {
        return (T) _withBase(this._base.c(propertyNamingStrategy));
    }

    public final T with(AccessorNamingStrategy.Provider provider) {
        return (T) _withBase(this._base.c(provider));
    }

    public final T with(HandlerInstantiator handlerInstantiator) {
        return (T) _withBase(this._base.d(handlerInstantiator));
    }

    public final T with(Base64Variant base64Variant) {
        return (T) _withBase(this._base.b(base64Variant));
    }

    public T with(DateFormat dateFormat) {
        return (T) _withBase(this._base.d(dateFormat));
    }

    public final T with(Locale locale) {
        return (T) _withBase(this._base.c(locale));
    }

    public final T with(TimeZone timeZone) {
        return (T) _withBase(this._base.c(timeZone));
    }

    public T withRootName(String str) {
        if (str == null) {
            return (T) withRootName((ys) null);
        }
        return (T) withRootName(ys.c(str));
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    @Deprecated
    public final String getRootName() {
        ys ysVar = this._rootName;
        if (ysVar == null) {
            return null;
        }
        return ysVar.b();
    }

    public final ys getFullRootName() {
        return this._rootName;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final Class<?> getActiveView() {
        return this._view;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final ContextAttributes getAttributes() {
        return this._attributes;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final ConfigOverride getConfigOverride(Class<?> cls) {
        ConfigOverride configOverrideD = this._configOverrides.d(cls);
        return configOverrideD == null ? EMPTY_OVERRIDE : configOverrideD;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final ConfigOverride findConfigOverride(Class<?> cls) {
        return this._configOverrides.d(cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.b getDefaultPropertyInclusion() {
        return this._configOverrides.c();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.b getDefaultPropertyInclusion(Class<?> cls) {
        JsonInclude.b include = getConfigOverride(cls).getInclude();
        JsonInclude.b defaultPropertyInclusion = getDefaultPropertyInclusion();
        return defaultPropertyInclusion == null ? include : defaultPropertyInclusion.b(include);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.b getDefaultInclusion(Class<?> cls, Class<?> cls2) {
        JsonInclude.b includeAsProperty = getConfigOverride(cls2).getIncludeAsProperty();
        JsonInclude.b defaultPropertyInclusion = getDefaultPropertyInclusion(cls);
        return defaultPropertyInclusion == null ? includeAsProperty : defaultPropertyInclusion.b(includeAsProperty);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonFormat.c getDefaultPropertyFormat(Class<?> cls) {
        return this._configOverrides.e(cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIgnoreProperties.b getDefaultPropertyIgnorals(Class<?> cls) {
        JsonIgnoreProperties.b ignorals;
        ConfigOverride configOverrideD = this._configOverrides.d(cls);
        if (configOverrideD == null || (ignorals = configOverrideD.getIgnorals()) == null) {
            return null;
        }
        return ignorals;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIgnoreProperties.b getDefaultPropertyIgnorals(Class<?> cls, ack ackVar) {
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        return JsonIgnoreProperties.b.c(annotationIntrospector == null ? null : annotationIntrospector.findPropertyIgnoralByName(this, ackVar), getDefaultPropertyIgnorals(cls));
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIncludeProperties.b getDefaultPropertyInclusions(Class<?> cls, ack ackVar) {
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPropertyInclusionByName(this, ackVar);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VisibilityChecker<?> getDefaultVisibilityChecker() {
        VisibilityChecker<?> visibilityCheckerD = this._configOverrides.d();
        int i = this._mapperFeatures;
        int i2 = AUTO_DETECT_MASK;
        if ((i & i2) == i2) {
            return visibilityCheckerD;
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_FIELDS)) {
            visibilityCheckerD = visibilityCheckerD.withFieldVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_GETTERS)) {
            visibilityCheckerD = visibilityCheckerD.withGetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS)) {
            visibilityCheckerD = visibilityCheckerD.withIsGetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_SETTERS)) {
            visibilityCheckerD = visibilityCheckerD.withSetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        return !isEnabled(MapperFeature.AUTO_DETECT_CREATORS) ? visibilityCheckerD.withCreatorVisibility(JsonAutoDetect.Visibility.NONE) : visibilityCheckerD;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, ack ackVar) {
        VisibilityChecker<?> defaultVisibilityChecker = getDefaultVisibilityChecker();
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            defaultVisibilityChecker = annotationIntrospector.findAutoDetectVisibility(ackVar, defaultVisibilityChecker);
        }
        ConfigOverride configOverrideD = this._configOverrides.d(cls);
        return configOverrideD != null ? defaultVisibilityChecker.withOverrides(configOverrideD.getVisibility()) : defaultVisibilityChecker;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonSetter.e getDefaultSetterInfo() {
        return this._configOverrides.a();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public Boolean getDefaultMergeable() {
        return this._configOverrides.b();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public Boolean getDefaultMergeable(Class<?> cls) {
        Boolean mergeable;
        ConfigOverride configOverrideD = this._configOverrides.d(cls);
        return (configOverrideD == null || (mergeable = configOverrideD.getMergeable()) == null) ? this._configOverrides.b() : mergeable;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public ys findRootName(JavaType javaType) {
        ys ysVar = this._rootName;
        return ysVar != null ? ysVar : this._rootNames.b(javaType, this);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public ys findRootName(Class<?> cls) {
        ys ysVar = this._rootName;
        return ysVar != null ? ysVar : this._rootNames.a(cls, this);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public final Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public ClassIntrospector.MixInResolver copy() {
        throw new UnsupportedOperationException();
    }

    public final int mixInCount() {
        return this._mixIns.c();
    }
}
