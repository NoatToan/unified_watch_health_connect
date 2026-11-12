package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import defpackage.bpo;
import defpackage.ccd;
import defpackage.fh2;
import defpackage.r7i;
import defpackage.tm9;
import defpackage.z0a;
import java.io.Serializable;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final r7i DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
    private static final long serialVersionUID = 1;
    protected final r7i _defaultPrettyPrinter;
    protected final tm9 _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;

    public SerializationConfig(BaseSettings baseSettings, bpo bpoVar, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, bpoVar, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
        this._filterProvider = null;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    public r7i constructDefaultPrettyPrinter() {
        r7i r7iVar = this._defaultPrettyPrinter;
        return r7iVar instanceof ccd ? (r7i) ((ccd) r7iVar).createInstance() : r7iVar;
    }

    public r7i getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    public tm9 getFilterProvider() {
        return this._filterProvider;
    }

    public final int getSerializationFeatures() {
        return this._serFeatures;
    }

    @Deprecated
    public JsonInclude.Include getSerializationInclusion() {
        JsonInclude.Include valueInclusion = getDefaultPropertyInclusion().getValueInclusion();
        return valueInclusion == JsonInclude.Include.USE_DEFAULTS ? JsonInclude.Include.ALWAYS : valueInclusion;
    }

    public final boolean hasSerializationFeatures(int i) {
        return (this._serFeatures & i) == i;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        r7i r7iVarConstructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.D() == null && (r7iVarConstructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.P(r7iVarConstructDefaultPrettyPrinter);
        }
        boolean zEnabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i = this._generatorFeaturesToChange;
        if (i != 0 || zEnabledIn) {
            int i2 = this._generatorFeatures;
            if (zEnabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i2 |= mask;
                i |= mask;
            }
            jsonGenerator.J(i2, i);
        }
        int i3 = this._formatWriteFeaturesToChange;
        if (i3 != 0) {
            jsonGenerator.E(this._formatWriteFeatures, i3);
        }
    }

    public <T extends fh2> T introspect(JavaType javaType) {
        return (T) getClassIntrospector().forSerialization(this, javaType, this);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        return propertyName != null ? !propertyName.isEmpty() : isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
    }

    public SerializationConfig withDefaultPrettyPrinter(r7i r7iVar) {
        return this._defaultPrettyPrinter == r7iVar ? this : new SerializationConfig(this, r7iVar);
    }

    public SerializationConfig withFeatures(SerializationFeature... serializationFeatureArr) {
        int mask = this._serFeatures;
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            mask |= serializationFeature.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFilters(tm9 tm9Var) {
        return tm9Var == this._filterProvider ? this : new SerializationConfig(this, tm9Var);
    }

    @Deprecated
    public SerializationConfig withPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ MapperConfigBase withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int i = this._serFeatures & (~serializationFeature.getMask());
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            i &= ~serializationFeature.getMask();
        }
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withMapperFeatures(int i) {
        return new SerializationConfig(this, i, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public final boolean isEnabled(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._generatorFeaturesToChange) != 0) {
            return (feature.getMask() & this._generatorFeatures) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig withRootName(PropertyName propertyName) {
        if (propertyName == null) {
            if (this._rootName == null) {
                return this;
            }
        } else if (propertyName.equals(this._rootName)) {
            return this;
        }
        return new SerializationConfig(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i = (~serializationFeature.getMask()) & this._serFeatures;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            i &= ~serializationFeature2.getMask();
        }
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(bpo bpoVar) {
        return bpoVar == this._subtypeResolver ? this : new SerializationConfig(this, bpoVar);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new SerializationConfig(this, contextAttributes);
    }

    public SerializationConfig withFeatures(JsonGenerator.Feature... featureArr) {
        int i = this._generatorFeatures;
        int i2 = i;
        int i3 = this._generatorFeaturesToChange;
        for (JsonGenerator.Feature feature : featureArr) {
            int mask = feature.getMask();
            i2 |= mask;
            i3 |= mask;
        }
        return (this._generatorFeatures == i2 && this._generatorFeaturesToChange == i3) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i2, i3, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(JsonGenerator.Feature... featureArr) {
        int i = this._generatorFeatures;
        int i2 = i;
        int i3 = this._generatorFeaturesToChange;
        for (JsonGenerator.Feature feature : featureArr) {
            int mask = feature.getMask();
            i2 &= ~mask;
            i3 |= mask;
        }
        return (this._generatorFeatures == i2 && this._generatorFeaturesToChange == i3) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i2, i3, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = (SerializationConfig) super.with(dateFormat);
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig without(JsonGenerator.Feature feature) {
        int i = this._generatorFeatures & (~feature.getMask());
        int mask = this._generatorFeaturesToChange | feature.getMask();
        return (this._generatorFeatures == i && this._generatorFeaturesToChange == mask) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i, mask, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(serializationConfig, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFeatures(z0a... z0aVarArr) {
        if (z0aVarArr.length <= 0) {
            return this;
        }
        z0a z0aVar = z0aVarArr[0];
        throw null;
    }

    public SerializationConfig without(z0a z0aVar) {
        int i = this._formatWriteFeatures & (~z0aVar.getMask());
        int mask = this._formatWriteFeaturesToChange | z0aVar.getMask();
        return (this._formatWriteFeatures == i && this._formatWriteFeaturesToChange == mask) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i, mask);
    }

    public SerializationConfig withoutFeatures(z0a... z0aVarArr) {
        if (z0aVarArr.length <= 0) {
            return this;
        }
        z0a z0aVar = z0aVarArr[0];
        throw null;
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            mask |= serializationFeature2.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(JsonGenerator.Feature feature) {
        int mask = this._generatorFeatures | feature.getMask();
        int mask2 = this._generatorFeaturesToChange | feature.getMask();
        return (this._generatorFeatures == mask && this._generatorFeaturesToChange == mask2) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, mask, mask2, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    private SerializationConfig(SerializationConfig serializationConfig, bpo bpoVar) {
        super(serializationConfig, bpoVar);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(z0a z0aVar) {
        int mask = this._formatWriteFeatures | z0aVar.getMask();
        int mask2 = this._formatWriteFeaturesToChange | z0aVar.getMask();
        return (this._formatWriteFeatures == mask && this._formatWriteFeaturesToChange == mask2) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, mask, mask2);
    }

    private SerializationConfig(SerializationConfig serializationConfig, int i, int i2, int i3, int i4, int i5, int i6) {
        super(serializationConfig, i);
        this._serFeatures = i2;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i3;
        this._generatorFeaturesToChange = i4;
        this._formatWriteFeatures = i5;
        this._formatWriteFeaturesToChange = i6;
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, tm9 tm9Var) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = tm9Var;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super(serializationConfig, cls);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, PropertyName propertyName) {
        super(serializationConfig, propertyName);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super(serializationConfig, contextAttributes);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(serializationConfig, simpleMixInResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, r7i r7iVar) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = r7iVar;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }
}
