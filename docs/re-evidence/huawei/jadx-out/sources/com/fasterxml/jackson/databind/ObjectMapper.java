package com.fasterxml.jackson.databind;

import com.amap.api.col.p0003sl.jt;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import defpackage.aca;
import defpackage.acr;
import defpackage.acy;
import defpackage.ada;
import defpackage.adg;
import defpackage.adt;
import defpackage.adv;
import defpackage.adw;
import defpackage.aeg;
import defpackage.aes;
import defpackage.aet;
import defpackage.aeu;
import defpackage.aew;
import defpackage.aey;
import defpackage.ahp;
import defpackage.ahw;
import defpackage.aie;
import defpackage.aif;
import defpackage.wm;
import defpackage.wr;
import defpackage.wu;
import defpackage.xx;
import defpackage.yi;
import defpackage.yk;
import defpackage.yl;
import defpackage.ym;
import defpackage.yn;
import defpackage.yo;
import defpackage.yt;
import defpackage.yv;
import defpackage.yw;
import defpackage.yy;
import defpackage.za;
import defpackage.zb;
import defpackage.zg;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class ObjectMapper extends ObjectCodec implements Versioned, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final AnnotationIntrospector f4093b;
    protected static final yy d;
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected yi f4094a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final yw f4095c;
    protected final yv e;
    public DefaultDeserializationContext f;
    protected ada g;
    protected InjectableValues h;
    protected Set<Object> i;
    public final JsonFactory j;
    public final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> k;
    public DefaultSerializerProvider l;
    public SerializerFactory m;
    protected SubtypeResolver n;
    protected yt o;
    protected ahp r;

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    public static class b extends adv implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final DefaultTyping f4097c;
        protected final PolymorphicTypeValidator e;

        public b(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            this.f4097c = (DefaultTyping) d(defaultTyping, "Can not pass `null` DefaultTyping");
            this.e = (PolymorphicTypeValidator) d(polymorphicTypeValidator, "Can not pass `null` PolymorphicTypeValidator");
        }

        private static <T> T d(T t, String str) {
            if (t != null) {
                return t;
            }
            throw new NullPointerException(str);
        }

        public static b c(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            return new b(defaultTyping, polymorphicTypeValidator);
        }

        @Override // defpackage.adv
        public PolymorphicTypeValidator c(MapperConfig<?> mapperConfig) {
            return this.e;
        }

        @Override // defpackage.adv, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public TypeDeserializer buildTypeDeserializer(yi yiVar, JavaType javaType, Collection<adg> collection) {
            if (b(javaType)) {
                return super.buildTypeDeserializer(yiVar, javaType, collection);
            }
            return null;
        }

        @Override // defpackage.adv, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public TypeSerializer buildTypeSerializer(yt ytVar, JavaType javaType, Collection<adg> collection) {
            if (b(javaType)) {
                return super.buildTypeSerializer(ytVar, javaType, collection);
            }
            return null;
        }

        public boolean b(JavaType javaType) {
            if (javaType.isPrimitive()) {
                return false;
            }
            int i = AnonymousClass3.f4096b[this.f4097c.ordinal()];
            if (i == 1) {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return javaType.isJavaLangObject();
                    }
                    return true;
                }
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
                while (javaType.isReferenceType()) {
                    javaType = javaType.getReferencedType();
                }
                return (javaType.isFinal() || TreeNode.class.isAssignableFrom(javaType.getRawClass())) ? false : true;
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            return javaType.isJavaLangObject() || !(javaType.isConcrete() || TreeNode.class.isAssignableFrom(javaType.getRawClass()));
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ObjectMapper$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4096b;

        static {
            int[] iArr = new int[DefaultTyping.values().length];
            f4096b = iArr;
            try {
                iArr[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4096b[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4096b[DefaultTyping.NON_FINAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4096b[DefaultTyping.EVERYTHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4096b[DefaultTyping.JAVA_LANG_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        acy acyVar = new acy();
        f4093b = acyVar;
        d = new yy(null, acyVar, null, ahp.a(), null, aif.f, null, Locale.getDefault(), null, wm.d(), adt.f303b, new DefaultAccessorNamingStrategy.c());
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this.k = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this.j = new yk(this);
        } else {
            this.j = jsonFactory;
            if (jsonFactory.c() == null) {
                jsonFactory.d((ObjectCodec) this);
            }
        }
        this.n = new adw();
        aie aieVar = new aie();
        this.r = ahp.a();
        ada adaVar = new ada(null);
        this.g = adaVar;
        yy yyVarE = d.e(a());
        yw ywVar = new yw();
        this.f4095c = ywVar;
        yv yvVar = new yv();
        this.e = yvVar;
        this.o = new yt(yyVarE, this.n, adaVar, aieVar, ywVar);
        this.f4094a = new yi(yyVarE, this.n, adaVar, aieVar, ywVar, yvVar);
        boolean zRequiresPropertyOrdering = this.j.requiresPropertyOrdering();
        if (this.o.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY) ^ zRequiresPropertyOrdering) {
            b(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, zRequiresPropertyOrdering);
        }
        this.l = defaultSerializerProvider == null ? new DefaultSerializerProvider.b() : defaultSerializerProvider;
        this.f = defaultDeserializationContext == null ? new DefaultDeserializationContext.c(zg.d) : defaultDeserializationContext;
        this.m = aey.f347a;
    }

    protected ClassIntrospector a() {
        return new acr();
    }

    protected yo c(yi yiVar, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        return new yo(this, yiVar, javaType, obj, formatSchema, injectableValues);
    }

    protected yn b(yt ytVar) {
        return new yn(this, ytVar);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return za.e;
    }

    public ObjectMapper a(Module module) {
        Object typeId;
        a("module", module);
        if (module.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (module.version() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator<? extends Module> it = module.getDependencies().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        if (d(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = module.getTypeId()) != null) {
            if (this.i == null) {
                this.i = new LinkedHashSet();
            }
            if (!this.i.add(typeId)) {
                return this;
            }
        }
        module.setupModule(new Module.SetupContext() { // from class: com.fasterxml.jackson.databind.ObjectMapper.4
            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public wu getMapperVersion() {
                return ObjectMapper.this.version();
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public <C extends ObjectCodec> C getOwner() {
                return ObjectMapper.this;
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public ahp getTypeFactory() {
                return ObjectMapper.this.r;
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(MapperFeature mapperFeature) {
                return ObjectMapper.this.d(mapperFeature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(DeserializationFeature deserializationFeature) {
                return ObjectMapper.this.e(deserializationFeature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(SerializationFeature serializationFeature) {
                return ObjectMapper.this.d(serializationFeature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(JsonFactory.Feature feature) {
                return ObjectMapper.this.a(feature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(JsonParser.Feature feature) {
                return ObjectMapper.this.e(feature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(JsonGenerator.Feature feature) {
                return ObjectMapper.this.e(feature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public zb configOverride(Class<?> cls) {
                return ObjectMapper.this.e(cls);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addDeserializers(Deserializers deserializers) {
                DeserializerFactory deserializerFactoryWithAdditionalDeserializers = ObjectMapper.this.f._factory.withAdditionalDeserializers(deserializers);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.f = objectMapper.f.with(deserializerFactoryWithAdditionalDeserializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addKeyDeserializers(KeyDeserializers keyDeserializers) {
                DeserializerFactory deserializerFactoryWithAdditionalKeyDeserializers = ObjectMapper.this.f._factory.withAdditionalKeyDeserializers(keyDeserializers);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.f = objectMapper.f.with(deserializerFactoryWithAdditionalKeyDeserializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
                DeserializerFactory deserializerFactoryWithDeserializerModifier = ObjectMapper.this.f._factory.withDeserializerModifier(beanDeserializerModifier);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.f = objectMapper.f.with(deserializerFactoryWithDeserializerModifier);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addSerializers(Serializers serializers) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.m = objectMapper.m.withAdditionalSerializers(serializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addKeySerializers(Serializers serializers) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.m = objectMapper.m.withAdditionalKeySerializers(serializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.m = objectMapper.m.withSerializerModifier(beanSerializerModifier);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
                DeserializerFactory deserializerFactoryWithAbstractTypeResolver = ObjectMapper.this.f._factory.withAbstractTypeResolver(abstractTypeResolver);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.f = objectMapper.f.with(deserializerFactoryWithAbstractTypeResolver);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addTypeModifier(TypeModifier typeModifier) {
                ObjectMapper.this.c(ObjectMapper.this.r.a(typeModifier));
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addValueInstantiators(ValueInstantiators valueInstantiators) {
                DeserializerFactory deserializerFactoryWithValueInstantiators = ObjectMapper.this.f._factory.withValueInstantiators(valueInstantiators);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.f = objectMapper.f.with(deserializerFactoryWithValueInstantiators);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void setClassIntrospector(ClassIntrospector classIntrospector) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.f4094a = objectMapper.f4094a.with(classIntrospector);
                ObjectMapper objectMapper2 = ObjectMapper.this;
                objectMapper2.o = objectMapper2.o.with(classIntrospector);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.f4094a = objectMapper.f4094a.withInsertedAnnotationIntrospector(annotationIntrospector);
                ObjectMapper objectMapper2 = ObjectMapper.this;
                objectMapper2.o = objectMapper2.o.withInsertedAnnotationIntrospector(annotationIntrospector);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper.f4094a = objectMapper.f4094a.withAppendedAnnotationIntrospector(annotationIntrospector);
                ObjectMapper objectMapper2 = ObjectMapper.this;
                objectMapper2.o = objectMapper2.o.withAppendedAnnotationIntrospector(annotationIntrospector);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void registerSubtypes(Class<?>... clsArr) {
                ObjectMapper.this.d(clsArr);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void registerSubtypes(adg... adgVarArr) {
                ObjectMapper.this.d(adgVarArr);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void registerSubtypes(Collection<Class<?>> collection) {
                ObjectMapper.this.e(collection);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
                ObjectMapper.this.d(cls, cls2);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationProblemHandler) {
                ObjectMapper.this.e(deserializationProblemHandler);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
                ObjectMapper.this.e(propertyNamingStrategy);
            }
        });
        return this;
    }

    public JsonGenerator b(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        a("out", outputStream);
        JsonGenerator jsonGeneratorCreateGenerator = this.j.createGenerator(outputStream, jsonEncoding);
        this.o.b(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public yt i() {
        return this.o;
    }

    public yi j() {
        return this.f4094a;
    }

    public ObjectMapper e(SerializerFactory serializerFactory) {
        this.m = serializerFactory;
        return this;
    }

    public ObjectMapper d(Class<?> cls, Class<?> cls2) {
        this.g.b(cls, cls2);
        return this;
    }

    public ObjectMapper c(VisibilityChecker<?> visibilityChecker) {
        this.f4095c.e(visibilityChecker);
        return this;
    }

    public ObjectMapper b(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this.f4095c.e(this.f4095c.d().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public SubtypeResolver g() {
        return this.n;
    }

    public ObjectMapper a(SubtypeResolver subtypeResolver) {
        this.n = subtypeResolver;
        this.f4094a = this.f4094a.with(subtypeResolver);
        this.o = this.o.with(subtypeResolver);
        return this;
    }

    public ObjectMapper d(AnnotationIntrospector annotationIntrospector) {
        this.o = this.o.with(annotationIntrospector);
        this.f4094a = this.f4094a.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper e(PropertyNamingStrategy propertyNamingStrategy) {
        this.o = this.o.with(propertyNamingStrategy);
        this.f4094a = this.f4094a.with(propertyNamingStrategy);
        return this;
    }

    public ObjectMapper e(AccessorNamingStrategy.Provider provider) {
        this.o = this.o.with(provider);
        this.f4094a = this.f4094a.with(provider);
        return this;
    }

    public ObjectMapper a(PrettyPrinter prettyPrinter) {
        this.o = this.o.b(prettyPrinter);
        return this;
    }

    public ObjectMapper b(PolymorphicTypeValidator polymorphicTypeValidator) {
        this.f4094a = this.f4094a._withBase(this.f4094a.e().e(polymorphicTypeValidator));
        return this;
    }

    public ObjectMapper d(JsonInclude.Include include) {
        e(JsonInclude.b.a(include, include));
        return this;
    }

    @Deprecated
    public ObjectMapper e(JsonInclude.b bVar) {
        return b(bVar);
    }

    public ObjectMapper b(JsonInclude.b bVar) {
        this.f4095c.e(bVar);
        return this;
    }

    public ObjectMapper c(JsonSetter.e eVar) {
        this.f4095c.e(eVar);
        return this;
    }

    public ObjectMapper a(Boolean bool) {
        this.f4095c.d(bool);
        return this;
    }

    public ObjectMapper c(Boolean bool) {
        this.f4095c.c(bool);
        return this;
    }

    public void d(Class<?>... clsArr) {
        g().registerSubtypes(clsArr);
    }

    public void d(adg... adgVarArr) {
        g().registerSubtypes(adgVarArr);
    }

    public void e(Collection<Class<?>> collection) {
        g().registerSubtypes(collection);
    }

    public ObjectMapper c(PolymorphicTypeValidator polymorphicTypeValidator) {
        return e(polymorphicTypeValidator, DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper e(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping) {
        return b(polymorphicTypeValidator, defaultTyping, JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    public ObjectMapper b(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        if (as == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
            throw new IllegalArgumentException("Cannot use includeAs of " + as);
        }
        return a(d(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.Id.CLASS, null).inclusion(as));
    }

    public ObjectMapper d(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, String str) {
        return a(d(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.Id.CLASS, null).inclusion(JsonTypeInfo.As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper d() {
        return a((TypeResolverBuilder<?>) null);
    }

    public ObjectMapper a(TypeResolverBuilder<?> typeResolverBuilder) {
        this.f4094a = this.f4094a.with(typeResolverBuilder);
        this.o = this.o.with(typeResolverBuilder);
        return this;
    }

    public zb e(Class<?> cls) {
        return this.f4095c.c(cls);
    }

    public ObjectMapper c(ahp ahpVar) {
        this.r = ahpVar;
        this.f4094a = this.f4094a.with(ahpVar);
        this.o = this.o.with(ahpVar);
        return this;
    }

    public JavaType c(Type type) {
        a(FitRunPlayAudio.PLAY_TYPE_T, type);
        return this.r.b(type);
    }

    public aes h() {
        return this.f4094a.c();
    }

    public ObjectMapper a(aes aesVar) {
        this.f4094a = this.f4094a.a(aesVar);
        return this;
    }

    public ObjectMapper c(ConstructorDetector constructorDetector) {
        this.f4094a = this.f4094a.c(constructorDetector);
        return this;
    }

    public ObjectMapper e(DeserializationProblemHandler deserializationProblemHandler) {
        this.f4094a = this.f4094a.a(deserializationProblemHandler);
        return this;
    }

    public ObjectMapper b() {
        this.f4094a = this.f4094a.g();
        return this;
    }

    public ObjectMapper c(FilterProvider filterProvider) {
        this.o = this.o.b(filterProvider);
        return this;
    }

    public ObjectMapper c(Base64Variant base64Variant) {
        this.o = this.o.with(base64Variant);
        this.f4094a = this.f4094a.with(base64Variant);
        return this;
    }

    public JsonFactory o() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public ObjectMapper d(DateFormat dateFormat) {
        this.f4094a = this.f4094a.with(dateFormat);
        this.o = this.o.with(dateFormat);
        return this;
    }

    public Object b(HandlerInstantiator handlerInstantiator) {
        this.f4094a = this.f4094a.with(handlerInstantiator);
        this.o = this.o.with(handlerInstantiator);
        return this;
    }

    public ObjectMapper c(InjectableValues injectableValues) {
        this.h = injectableValues;
        return this;
    }

    public ObjectMapper a(Locale locale) {
        this.f4094a = this.f4094a.with(locale);
        this.o = this.o.with(locale);
        return this;
    }

    public ObjectMapper a(TimeZone timeZone) {
        this.f4094a = this.f4094a.with(timeZone);
        this.o = this.o.with(timeZone);
        return this;
    }

    public boolean d(MapperFeature mapperFeature) {
        return this.o.isEnabled(mapperFeature);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public ObjectMapper b(MapperFeature mapperFeature, boolean z) {
        this.o = (yt) (z ? this.o.with(new MapperFeature[]{mapperFeature}) : this.o.without(new MapperFeature[]{mapperFeature}));
        this.f4094a = (yi) (z ? this.f4094a.with(new MapperFeature[]{mapperFeature}) : this.f4094a.without(new MapperFeature[]{mapperFeature}));
        return this;
    }

    public ObjectMapper b(MapperFeature... mapperFeatureArr) {
        this.f4094a = (yi) this.f4094a.with(mapperFeatureArr);
        this.o = (yt) this.o.with(mapperFeatureArr);
        return this;
    }

    public ObjectMapper c(MapperFeature... mapperFeatureArr) {
        this.f4094a = (yi) this.f4094a.without(mapperFeatureArr);
        this.o = (yt) this.o.without(mapperFeatureArr);
        return this;
    }

    public boolean d(SerializationFeature serializationFeature) {
        return this.o.a(serializationFeature);
    }

    public ObjectMapper d(SerializationFeature serializationFeature, boolean z) {
        this.o = z ? this.o.c(serializationFeature) : this.o.b(serializationFeature);
        return this;
    }

    public ObjectMapper b(SerializationFeature serializationFeature) {
        this.o = this.o.c(serializationFeature);
        return this;
    }

    public ObjectMapper a(SerializationFeature serializationFeature) {
        this.o = this.o.b(serializationFeature);
        return this;
    }

    public boolean e(DeserializationFeature deserializationFeature) {
        return this.f4094a.d(deserializationFeature);
    }

    public ObjectMapper c(DeserializationFeature deserializationFeature, boolean z) {
        this.f4094a = z ? this.f4094a.c(deserializationFeature) : this.f4094a.a(deserializationFeature);
        return this;
    }

    public ObjectMapper b(DeserializationFeature deserializationFeature) {
        this.f4094a = this.f4094a.c(deserializationFeature);
        return this;
    }

    public ObjectMapper d(DeserializationFeature deserializationFeature) {
        this.f4094a = this.f4094a.a(deserializationFeature);
        return this;
    }

    public boolean e(JsonParser.Feature feature) {
        return this.f4094a.a(feature, this.j);
    }

    public ObjectMapper e(JsonParser.Feature feature, boolean z) {
        this.j.d(feature, z);
        return this;
    }

    public ObjectMapper e(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this.j.c(feature);
        }
        return this;
    }

    public ObjectMapper d(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this.j.b(feature);
        }
        return this;
    }

    public boolean e(JsonGenerator.Feature feature) {
        return this.o.e(feature, this.j);
    }

    public ObjectMapper b(JsonGenerator.Feature feature, boolean z) {
        this.j.c(feature, z);
        return this;
    }

    public ObjectMapper c(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this.j.e(feature);
        }
        return this;
    }

    public ObjectMapper e(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this.j.d(feature);
        }
        return this;
    }

    public boolean a(JsonFactory.Feature feature) {
        return this.j.e(feature);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        a("p", jsonParser);
        return (T) b(j(), jsonParser, this.r.b(cls));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        a("p", jsonParser);
        return (T) b(j(), jsonParser, this.r.a((TypeReference<?>) typeReference));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        a("p", jsonParser);
        return (T) b(j(), jsonParser, (JavaType) resolvedType);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException {
        a("p", jsonParser);
        yi yiVarJ = j();
        if (jsonParser.currentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        JsonNode jsonNode = (JsonNode) b(yiVarJ, jsonParser, c(JsonNode.class));
        return jsonNode == null ? h().nullNode() : jsonNode;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public <T> yl<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        return e(jsonParser, (JavaType) resolvedType);
    }

    public <T> yl<T> e(JsonParser jsonParser, JavaType javaType) throws IOException {
        a("p", jsonParser);
        DefaultDeserializationContext defaultDeserializationContextA = a(jsonParser, j());
        return new yl<>(javaType, jsonParser, defaultDeserializationContextA, a(defaultDeserializationContextA, javaType), false, null);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public <T> yl<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        return e(jsonParser, this.r.b(cls));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public <T> yl<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        return e(jsonParser, this.r.a((TypeReference<?>) typeReference));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        a(jt.f, jsonGenerator);
        yt ytVarI = i();
        if (ytVarI.a(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.getPrettyPrinter() == null) {
            jsonGenerator.setPrettyPrinter(ytVarI.e());
        }
        if (ytVarI.a(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            b(jsonGenerator, obj, ytVarI);
            return;
        }
        d(ytVarI).serializeValue(jsonGenerator, obj);
        if (ytVarI.a(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) throws IOException {
        a(jt.f, jsonGenerator);
        yt ytVarI = i();
        d(ytVarI).serializeValue(jsonGenerator, treeNode);
        if (ytVarI.a(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public aeu createObjectNode() {
        return this.f4094a.c().objectNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public aeg createArrayNode() {
        return this.f4094a.c().arrayNode();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public JsonNode missingNode() {
        return this.f4094a.c().a();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public JsonNode nullNode() {
        return this.f4094a.c().nullNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonParser treeAsTokens(TreeNode treeNode) {
        a("n", treeNode);
        return new aet((JsonNode) treeNode, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) throws wr, IllegalArgumentException {
        T t;
        if (treeNode == 0) {
            return null;
        }
        try {
            if (TreeNode.class.isAssignableFrom(cls) && cls.isAssignableFrom(treeNode.getClass())) {
                return treeNode;
            }
            return (treeNode.asToken() == JsonToken.VALUE_EMBEDDED_OBJECT && (treeNode instanceof aew) && ((t = (T) ((aew) treeNode).b()) == null || cls.isInstance(t))) ? t : (T) readValue(treeAsTokens(treeNode), cls);
        } catch (wr e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    public <T> T e(Reader reader, Class<T> cls) throws IOException {
        a("src", reader);
        return (T) d(this.j.createParser(reader), this.r.b(cls));
    }

    public byte[] b(Object obj) throws wr {
        xx xxVar = new xx(this.j.d());
        try {
            c(b(xxVar, JsonEncoding.UTF8), obj);
            byte[] bArrI = xxVar.i();
            xxVar.d();
            return bArrI;
        } catch (wr e) {
            throw e;
        } catch (IOException e2) {
            throw ym.fromUnexpectedIOE(e2);
        }
    }

    public yn n() {
        return b(i());
    }

    public yo c(Class<?> cls) {
        return c(j(), this.r.b(cls), null, null, this.h);
    }

    protected TypeResolverBuilder<?> d(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
        return b.c(defaultTyping, polymorphicTypeValidator);
    }

    protected DefaultSerializerProvider d(yt ytVar) {
        return this.l.createInstance(ytVar, this.m);
    }

    protected final void c(JsonGenerator jsonGenerator, Object obj) throws IOException {
        yt ytVarI = i();
        if (ytVarI.a(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            c(jsonGenerator, obj, ytVarI);
            return;
        }
        try {
            d(ytVarI).serializeValue(jsonGenerator, obj);
            jsonGenerator.close();
        } catch (Exception e) {
            ahw.b(jsonGenerator, e);
        }
    }

    private final void c(JsonGenerator jsonGenerator, Object obj, yt ytVar) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            d(ytVar).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                ahw.c(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final void b(JsonGenerator jsonGenerator, Object obj, yt ytVar) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            d(ytVar).serializeValue(jsonGenerator, obj);
            if (ytVar.a(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            ahw.c((JsonGenerator) null, closeable, e);
        }
    }

    protected Object b(yi yiVar, JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        JsonToken jsonTokenA = a(jsonParser, javaType);
        DefaultDeserializationContext defaultDeserializationContextA = a(jsonParser, yiVar);
        if (jsonTokenA == JsonToken.VALUE_NULL) {
            rootValue = a(defaultDeserializationContextA, javaType).getNullValue(defaultDeserializationContextA);
        } else {
            rootValue = (jsonTokenA == JsonToken.END_ARRAY || jsonTokenA == JsonToken.END_OBJECT) ? null : defaultDeserializationContextA.readRootValue(jsonParser, javaType, a(defaultDeserializationContextA, javaType), null);
        }
        jsonParser.clearCurrentToken();
        if (yiVar.d(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            e(jsonParser, defaultDeserializationContextA, javaType);
        }
        return rootValue;
    }

    protected Object d(JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        try {
            yi yiVarJ = j();
            DefaultDeserializationContext defaultDeserializationContextA = a(jsonParser, yiVarJ);
            JsonToken jsonTokenA = a(jsonParser, javaType);
            if (jsonTokenA == JsonToken.VALUE_NULL) {
                rootValue = a(defaultDeserializationContextA, javaType).getNullValue(defaultDeserializationContextA);
            } else if (jsonTokenA == JsonToken.END_ARRAY || jsonTokenA == JsonToken.END_OBJECT) {
                rootValue = null;
            } else {
                rootValue = defaultDeserializationContextA.readRootValue(jsonParser, javaType, a(defaultDeserializationContextA, javaType), null);
                defaultDeserializationContextA.checkUnresolvedObjectId();
            }
            if (yiVarJ.d(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                e(jsonParser, defaultDeserializationContextA, javaType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return rootValue;
        } catch (Throwable th) {
            if (jsonParser != null) {
                try {
                    jsonParser.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected DefaultDeserializationContext a(JsonParser jsonParser, yi yiVar) {
        return this.f.createInstance(yiVar, jsonParser, this.h);
    }

    protected JsonToken a(JsonParser jsonParser, JavaType javaType) throws IOException {
        this.f4094a.b(jsonParser);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != null) {
            return jsonTokenCurrentToken;
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            return jsonTokenNextToken;
        }
        throw aca.from(jsonParser, javaType, "No content to map due to end-of-input");
    }

    protected final void e(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            deserializationContext.reportTrailingTokens(ahw.b(javaType), jsonParser, jsonTokenNextToken);
        }
    }

    protected JsonDeserializer<Object> a(DeserializationContext deserializationContext, JavaType javaType) throws ym {
        JsonDeserializer<Object> jsonDeserializer = this.k.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this.k.put(javaType, jsonDeserializerFindRootValueDeserializer);
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected final void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
