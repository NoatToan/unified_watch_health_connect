package defpackage;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public final class yi extends MapperConfigBase<DeserializationFeature, yi> implements Serializable {
    private static final int f = collectFeatureDefaults(DeserializationFeature.class);
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final yv f53361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f53362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ConstructorDetector f53363c;
    protected final int d;
    protected final int e;
    protected final int g;
    protected final aes h;
    protected final int i;
    protected final aic<DeserializationProblemHandler> j;

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* synthetic */ MapperConfigBase withView(Class cls) {
        return b((Class<?>) cls);
    }

    public yi(yy yyVar, SubtypeResolver subtypeResolver, ada adaVar, aie aieVar, yw ywVar, yv yvVar) {
        super(yyVar, subtypeResolver, adaVar, aieVar, ywVar);
        this.e = f;
        this.j = null;
        this.h = aes.e;
        this.f53363c = null;
        this.f53361a = yvVar;
        this.i = 0;
        this.g = 0;
        this.d = 0;
        this.f53362b = 0;
    }

    private yi(yi yiVar, int i, int i2, int i3, int i4, int i5, int i6) {
        super(yiVar, i);
        this.e = i2;
        this.j = yiVar.j;
        this.h = yiVar.h;
        this.f53361a = yiVar.f53361a;
        this.f53363c = yiVar.f53363c;
        this.i = i3;
        this.g = i4;
        this.d = i5;
        this.f53362b = i6;
    }

    private yi(yi yiVar, SubtypeResolver subtypeResolver) {
        super(yiVar, subtypeResolver);
        this.e = yiVar.e;
        this.j = yiVar.j;
        this.h = yiVar.h;
        this.f53361a = yiVar.f53361a;
        this.f53363c = yiVar.f53363c;
        this.i = yiVar.i;
        this.g = yiVar.g;
        this.d = yiVar.d;
        this.f53362b = yiVar.f53362b;
    }

    private yi(yi yiVar, yy yyVar) {
        super(yiVar, yyVar);
        this.e = yiVar.e;
        this.j = yiVar.j;
        this.h = yiVar.h;
        this.f53361a = yiVar.f53361a;
        this.f53363c = yiVar.f53363c;
        this.i = yiVar.i;
        this.g = yiVar.g;
        this.d = yiVar.d;
        this.f53362b = yiVar.f53362b;
    }

    private yi(yi yiVar, aes aesVar) {
        super(yiVar);
        this.e = yiVar.e;
        this.j = yiVar.j;
        this.h = aesVar;
        this.f53361a = yiVar.f53361a;
        this.f53363c = yiVar.f53363c;
        this.i = yiVar.i;
        this.g = yiVar.g;
        this.d = yiVar.d;
        this.f53362b = yiVar.f53362b;
    }

    private yi(yi yiVar, ConstructorDetector constructorDetector) {
        super(yiVar);
        this.e = yiVar.e;
        this.j = yiVar.j;
        this.h = yiVar.h;
        this.f53361a = yiVar.f53361a;
        this.f53363c = constructorDetector;
        this.i = yiVar.i;
        this.g = yiVar.g;
        this.d = yiVar.d;
        this.f53362b = yiVar.f53362b;
    }

    private yi(yi yiVar, aic<DeserializationProblemHandler> aicVar) {
        super(yiVar);
        this.e = yiVar.e;
        this.j = aicVar;
        this.h = yiVar.h;
        this.f53361a = yiVar.f53361a;
        this.f53363c = yiVar.f53363c;
        this.i = yiVar.i;
        this.g = yiVar.g;
        this.d = yiVar.d;
        this.f53362b = yiVar.f53362b;
    }

    private yi(yi yiVar, ys ysVar) {
        super(yiVar, ysVar);
        this.e = yiVar.e;
        this.j = yiVar.j;
        this.h = yiVar.h;
        this.f53361a = yiVar.f53361a;
        this.f53363c = yiVar.f53363c;
        this.i = yiVar.i;
        this.g = yiVar.g;
        this.d = yiVar.d;
        this.f53362b = yiVar.f53362b;
    }

    private yi(yi yiVar, Class<?> cls) {
        super(yiVar, cls);
        this.e = yiVar.e;
        this.j = yiVar.j;
        this.h = yiVar.h;
        this.f53361a = yiVar.f53361a;
        this.f53363c = yiVar.f53363c;
        this.i = yiVar.i;
        this.g = yiVar.g;
        this.d = yiVar.d;
        this.f53362b = yiVar.f53362b;
    }

    protected yi(yi yiVar, ContextAttributes contextAttributes) {
        super(yiVar, contextAttributes);
        this.e = yiVar.e;
        this.j = yiVar.j;
        this.h = yiVar.h;
        this.f53361a = yiVar.f53361a;
        this.f53363c = yiVar.f53363c;
        this.i = yiVar.i;
        this.g = yiVar.g;
        this.d = yiVar.d;
        this.f53362b = yiVar.f53362b;
    }

    public yy e() {
        return this._base;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final yi _withBase(yy yyVar) {
        return this._base == yyVar ? this : new yi(this, yyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final yi _withMapperFeatures(int i) {
        return new yi(this, i, this.e, this.i, this.g, this.d, this.f53362b);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public yi with(SubtypeResolver subtypeResolver) {
        return this._subtypeResolver == subtypeResolver ? this : new yi(this, subtypeResolver);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public yi withRootName(ys ysVar) {
        return (ysVar != null ? !ysVar.equals(this._rootName) : this._rootName != null) ? new yi(this, ysVar) : this;
    }

    public yi b(Class<?> cls) {
        return this._view == cls ? this : new yi(this, cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yi with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new yi(this, contextAttributes);
    }

    public yi c(DeserializationFeature deserializationFeature) {
        int mask = this.e | deserializationFeature.getMask();
        return mask == this.e ? this : new yi(this, this._mapperFeatures, mask, this.i, this.g, this.d, this.f53362b);
    }

    public yi a(DeserializationFeature deserializationFeature) {
        int i = this.e & (~deserializationFeature.getMask());
        return i == this.e ? this : new yi(this, this._mapperFeatures, i, this.i, this.g, this.d, this.f53362b);
    }

    public yi a(aes aesVar) {
        return this.h == aesVar ? this : new yi(this, aesVar);
    }

    public yi c(ConstructorDetector constructorDetector) {
        return this.f53363c == constructorDetector ? this : new yi(this, constructorDetector);
    }

    public yi a(DeserializationProblemHandler deserializationProblemHandler) {
        return aic.b(this.j, deserializationProblemHandler) ? this : new yi(this, (aic<DeserializationProblemHandler>) new aic(deserializationProblemHandler, this.j));
    }

    public yi g() {
        if (this.j == null) {
            return this;
        }
        return new yi(this, (aic<DeserializationProblemHandler>) null);
    }

    public JsonParser b(JsonParser jsonParser) {
        int i = this.g;
        if (i != 0) {
            jsonParser.overrideStdFeatures(this.i, i);
        }
        int i2 = this.f53362b;
        if (i2 != 0) {
            jsonParser.overrideFormatFeatures(this.d, i2);
        }
        return jsonParser;
    }

    public JsonParser d(JsonParser jsonParser, FormatSchema formatSchema) {
        int i = this.g;
        if (i != 0) {
            jsonParser.overrideStdFeatures(this.i, i);
        }
        int i2 = this.f53362b;
        if (i2 != 0) {
            jsonParser.overrideFormatFeatures(this.d, i2);
        }
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        return jsonParser;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        if (this._rootName != null) {
            return !this._rootName.a();
        }
        return d(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public final boolean d(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this.e) != 0;
    }

    public final boolean a(JsonParser.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this.g) != 0) {
            return (feature.getMask() & this.i) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    public final int a() {
        return this.e;
    }

    public aic<DeserializationProblemHandler> d() {
        return this.j;
    }

    public final aes c() {
        return this.h;
    }

    public ConstructorDetector b() {
        ConstructorDetector constructorDetector = this.f53363c;
        return constructorDetector == null ? ConstructorDetector.e : constructorDetector;
    }

    public BeanDescription e(JavaType javaType) {
        return getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public BeanDescription d(JavaType javaType) {
        return getClassIntrospector().forCreation(this, javaType, this);
    }

    public BeanDescription c(JavaType javaType, BeanDescription beanDescription) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this, beanDescription);
    }

    public TypeDeserializer a(JavaType javaType) throws ym {
        Collection<adg> collectionCollectAndResolveSubtypesByTypeId;
        ack classInfo = introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = getAnnotationIntrospector().findTypeResolver(this, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null) {
            typeResolverBuilderFindTypeResolver = getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByTypeId = null;
            if (typeResolverBuilderFindTypeResolver == null) {
                return null;
            }
        } else {
            collectionCollectAndResolveSubtypesByTypeId = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, classInfo);
        }
        return typeResolverBuilderFindTypeResolver.buildTypeDeserializer(this, javaType, collectionCollectAndResolveSubtypesByTypeId);
    }

    public CoercionAction b(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this.f53361a.e(this, logicalType, cls, coercionInputShape);
    }

    public CoercionAction e(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this.f53361a.b(this, logicalType, cls, coercionAction);
    }
}
