package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import defpackage.bpo;
import defpackage.c5q;
import defpackage.fh2;
import defpackage.nz5;
import defpackage.q4q;
import defpackage.sge;
import defpackage.z0a;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    private static final long serialVersionUID = 2;
    protected final int _deserFeatures;
    protected final int _formatReadFeatures;
    protected final int _formatReadFeaturesToChange;
    protected final JsonNodeFactory _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final sge<nz5> _problemHandlers;

    public DeserializationConfig(BaseSettings baseSettings, bpo bpoVar, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, bpoVar, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
        this._nodeFactory = JsonNodeFactory.instance;
        this._problemHandlers = null;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    public q4q findTypeDeserializer(JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId;
        com.fasterxml.jackson.databind.introspect.a aVarU = introspectClassAnnotations(javaType.getRawClass()).u();
        c5q<?> c5qVarFindTypeResolver = getAnnotationIntrospector().findTypeResolver(this, aVarU, javaType);
        if (c5qVarFindTypeResolver == null) {
            c5qVarFindTypeResolver = getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByTypeId = null;
            if (c5qVarFindTypeResolver == null) {
                return null;
            }
        } else {
            collectionCollectAndResolveSubtypesByTypeId = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, aVarU);
        }
        return c5qVarFindTypeResolver.buildTypeDeserializer(this, javaType, collectionCollectAndResolveSubtypesByTypeId);
    }

    public BaseSettings getBaseSettings() {
        return this._base;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public sge<nz5> getProblemHandlers() {
        return this._problemHandlers;
    }

    public final boolean hasDeserializationFeatures(int i) {
        return (this._deserFeatures & i) == i;
    }

    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._deserFeatures) != 0;
    }

    public void initialize(JsonParser jsonParser) {
        int i = this._parserFeaturesToChange;
        if (i != 0) {
            jsonParser.J0(this._parserFeatures, i);
        }
        int i2 = this._formatReadFeaturesToChange;
        if (i2 != 0) {
            jsonParser.I0(this._formatReadFeatures, i2);
        }
    }

    public <T extends fh2> T introspect(JavaType javaType) {
        return (T) getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public <T extends fh2> T introspectForBuilder(JavaType javaType) {
        return (T) getClassIntrospector().forDeserializationWithBuilder(this, javaType, this);
    }

    public <T extends fh2> T introspectForCreation(JavaType javaType) {
        return (T) getClassIntrospector().forCreation(this, javaType, this);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._deserFeatures) != 0;
    }

    public final boolean requiresFullValue() {
        return DeserializationFeature.FAIL_ON_TRAILING_TOKENS.enabledIn(this._deserFeatures);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        return propertyName != null ? !propertyName.isEmpty() : isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public DeserializationConfig withFeatures(DeserializationFeature... deserializationFeatureArr) {
        int mask = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            mask |= deserializationFeature.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withHandler(nz5 nz5Var) {
        return sge.a(this._problemHandlers, nz5Var) ? this : new DeserializationConfig(this, (sge<nz5>) new sge(nz5Var, this._problemHandlers));
    }

    public DeserializationConfig withNoProblemHandlers() {
        return this._problemHandlers == null ? this : new DeserializationConfig(this, (sge<nz5>) null);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ MapperConfigBase withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int i = this._deserFeatures & (~deserializationFeature.getMask());
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            i &= ~deserializationFeature.getMask();
        }
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withMapperFeatures(int i) {
        return new DeserializationConfig(this, i, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public final boolean isEnabled(JsonParser.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._parserFeaturesToChange) != 0) {
            return (feature.getMask() & this._parserFeatures) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withRootName(PropertyName propertyName) {
        if (propertyName == null) {
            if (this._rootName == null) {
                return this;
            }
        } else if (propertyName.equals(this._rootName)) {
            return this;
        }
        return new DeserializationConfig(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(bpo bpoVar) {
        return this._subtypeResolver == bpoVar ? this : new DeserializationConfig(this, bpoVar);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i = (~deserializationFeature.getMask()) & this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            i &= ~deserializationFeature2.getMask();
        }
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new DeserializationConfig(this, contextAttributes);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures | deserializationFeature.getMask();
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(JsonParser.Feature... featureArr) {
        int i = this._parserFeatures;
        int i2 = i;
        int i3 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i2 |= mask;
            i3 |= mask;
        }
        return (this._parserFeatures == i2 && this._parserFeaturesToChange == i3) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i2, i3, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(JsonParser.Feature... featureArr) {
        int i = this._parserFeatures;
        int i2 = i;
        int i3 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i2 &= ~mask;
            i3 |= mask;
        }
        return (this._parserFeatures == i2 && this._parserFeaturesToChange == i3) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i2, i3, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            mask |= deserializationFeature2.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(JsonParser.Feature feature) {
        int i = this._parserFeatures & (~feature.getMask());
        int mask = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == i && this._parserFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i, mask, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(deserializationConfig, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig withFeatures(z0a... z0aVarArr) {
        if (z0aVarArr.length <= 0) {
            return this;
        }
        z0a z0aVar = z0aVarArr[0];
        throw null;
    }

    public DeserializationConfig without(z0a z0aVar) {
        int i = this._formatReadFeatures & (~z0aVar.getMask());
        int mask = this._formatReadFeaturesToChange | z0aVar.getMask();
        return (this._formatReadFeatures == i && this._formatReadFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i, mask);
    }

    public DeserializationConfig withoutFeatures(z0a... z0aVarArr) {
        if (z0aVarArr.length <= 0) {
            return this;
        }
        z0a z0aVar = z0aVarArr[0];
        throw null;
    }

    public DeserializationConfig with(JsonParser.Feature feature) {
        int mask = this._parserFeatures | feature.getMask();
        int mask2 = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == mask && this._parserFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, mask, mask2, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(z0a z0aVar) {
        int mask = this._formatReadFeatures | z0aVar.getMask();
        int mask2 = this._formatReadFeaturesToChange | z0aVar.getMask();
        return (this._formatReadFeatures == mask && this._formatReadFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, mask, mask2);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, int i, int i2, int i3, int i4, int i5, int i6) {
        super(deserializationConfig, i);
        this._deserFeatures = i2;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = i3;
        this._parserFeaturesToChange = i4;
        this._formatReadFeatures = i5;
        this._formatReadFeaturesToChange = i6;
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        return this._nodeFactory == jsonNodeFactory ? this : new DeserializationConfig(this, jsonNodeFactory);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, bpo bpoVar) {
        super(deserializationConfig, bpoVar);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super(deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, sge<nz5> sgeVar) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = sgeVar;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, PropertyName propertyName) {
        super(deserializationConfig, propertyName);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super(deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super(deserializationConfig, contextAttributes);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(deserializationConfig, simpleMixInResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }
}
