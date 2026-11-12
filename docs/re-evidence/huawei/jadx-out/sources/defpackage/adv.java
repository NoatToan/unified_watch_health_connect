package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public class adv implements TypeResolverBuilder<adv> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected TypeIdResolver f306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Class<?> f307b;
    protected JsonTypeInfo.Id d;
    protected String f;
    protected JsonTypeInfo.As g;
    protected boolean i = false;

    protected boolean c(MapperConfig<?> mapperConfig, JavaType javaType) {
        return false;
    }

    public static adv e() {
        return new adv().init(JsonTypeInfo.Id.NONE, null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public adv init(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver) {
        if (id == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this.d = id;
        this.f306a = typeIdResolver;
        this.f = id.getDefaultPropertyName();
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeSerializer buildTypeSerializer(yt ytVar, JavaType javaType, Collection<adg> collection) {
        if (this.d == JsonTypeInfo.Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !c(ytVar, javaType)) {
            return null;
        }
        TypeIdResolver typeIdResolverE = e(ytVar, javaType, c(ytVar), collection, true, false);
        if (this.d == JsonTypeInfo.Id.DEDUCTION) {
            return new adn(typeIdResolverE, null, this.f);
        }
        int i = AnonymousClass3.f308a[this.g.ordinal()];
        if (i == 1) {
            return new adi(typeIdResolverE, null);
        }
        if (i == 2) {
            return new adm(typeIdResolverE, null, this.f);
        }
        if (i == 3) {
            return new adr(typeIdResolverE, null);
        }
        if (i == 4) {
            return new ado(typeIdResolverE, null, this.f);
        }
        if (i == 5) {
            return new adn(typeIdResolverE, null, this.f);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.g);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeDeserializer buildTypeDeserializer(yi yiVar, JavaType javaType, Collection<adg> collection) {
        if (this.d == JsonTypeInfo.Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !c(yiVar, javaType)) {
            return null;
        }
        TypeIdResolver typeIdResolverE = e(yiVar, javaType, e(yiVar, javaType), collection, false, true);
        JavaType javaTypeD = d(yiVar, javaType);
        if (this.d == JsonTypeInfo.Id.DEDUCTION) {
            return new adh(javaType, typeIdResolverE, javaTypeD, yiVar, collection);
        }
        int i = AnonymousClass3.f308a[this.g.ordinal()];
        if (i == 1) {
            return new adf(javaType, typeIdResolverE, this.f, this.i, javaTypeD);
        }
        if (i != 2) {
            if (i == 3) {
                return new adq(javaType, typeIdResolverE, this.f, this.i, javaTypeD);
            }
            if (i == 4) {
                return new adk(javaType, typeIdResolverE, this.f, this.i, javaTypeD);
            }
            if (i != 5) {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.g);
            }
        }
        return new adl(javaType, typeIdResolverE, this.f, this.i, javaTypeD, this.g);
    }

    protected JavaType d(yi yiVar, JavaType javaType) {
        Class<?> cls = this.f307b;
        if (cls == null) {
            if (!yiVar.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) || javaType.isAbstract()) {
                return null;
            }
        } else {
            if (cls == Void.class || cls == yp.class) {
                return yiVar.getTypeFactory().b(this.f307b);
            }
            if (!javaType.hasRawClass(cls)) {
                if (javaType.isTypeOrSuperTypeOf(this.f307b)) {
                    return yiVar.getTypeFactory().c(javaType, this.f307b);
                }
                return null;
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public adv inclusion(JsonTypeInfo.As as) {
        if (as == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this.g = as;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public adv typeProperty(String str) {
        if (str == null || str.isEmpty()) {
            str = this.d.getDefaultPropertyName();
        }
        this.f = str;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public adv defaultImpl(Class<?> cls) {
        this.f307b = cls;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public adv typeIdVisibility(boolean z) {
        this.i = z;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public Class<?> getDefaultImpl() {
        return this.f307b;
    }

    protected TypeIdResolver e(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection<adg> collection, boolean z, boolean z2) {
        TypeIdResolver typeIdResolver = this.f306a;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        if (this.d == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i = AnonymousClass3.e[this.d.ordinal()];
        if (i == 1 || i == 2) {
            return adp.a(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i == 3) {
            return ads.b(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i == 4) {
            return adu.b(mapperConfig, javaType, collection, z, z2);
        }
        if (i == 5) {
            return null;
        }
        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.d);
    }

    /* JADX INFO: renamed from: adv$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f308a;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonTypeInfo.Id.values().length];
            e = iArr;
            try {
                iArr[JsonTypeInfo.Id.DEDUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[JsonTypeInfo.Id.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[JsonTypeInfo.Id.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[JsonTypeInfo.Id.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[JsonTypeInfo.Id.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonTypeInfo.As.values().length];
            f308a = iArr2;
            try {
                iArr2[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f308a[JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f308a[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f308a[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f308a[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public PolymorphicTypeValidator c(MapperConfig<?> mapperConfig) {
        return mapperConfig.getPolymorphicTypeValidator();
    }

    protected PolymorphicTypeValidator e(MapperConfig<?> mapperConfig, JavaType javaType) {
        PolymorphicTypeValidator polymorphicTypeValidatorC = c(mapperConfig);
        if (this.d == JsonTypeInfo.Id.CLASS || this.d == JsonTypeInfo.Id.MINIMAL_CLASS) {
            PolymorphicTypeValidator.Validity validityValidateBaseType = polymorphicTypeValidatorC.validateBaseType(mapperConfig, javaType);
            if (validityValidateBaseType == PolymorphicTypeValidator.Validity.DENIED) {
                return d(mapperConfig, javaType, polymorphicTypeValidatorC);
            }
            if (validityValidateBaseType == PolymorphicTypeValidator.Validity.ALLOWED) {
                return adt.f303b;
            }
        }
        return polymorphicTypeValidatorC;
    }

    protected PolymorphicTypeValidator d(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", ahw.b(polymorphicTypeValidator), ahw.b((Object) javaType.getRawClass())));
    }
}
