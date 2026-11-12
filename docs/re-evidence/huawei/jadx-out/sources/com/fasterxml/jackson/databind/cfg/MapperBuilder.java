package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import defpackage.adg;
import defpackage.aes;
import defpackage.ahp;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public abstract class MapperBuilder<M extends ObjectMapper, B extends MapperBuilder<M, B>> {
    protected final M _mapper;

    protected final B _this() {
        return this;
    }

    protected MapperBuilder(M m) {
        this._mapper = m;
    }

    public M build() {
        return this._mapper;
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._mapper.d(mapperFeature);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._mapper.e(deserializationFeature);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._mapper.d(serializationFeature);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._mapper.e(feature);
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._mapper.e(feature);
    }

    public TokenStreamFactory streamFactory() {
        return this._mapper.o();
    }

    public B enable(MapperFeature... mapperFeatureArr) {
        this._mapper.b(mapperFeatureArr);
        return (B) _this();
    }

    public B disable(MapperFeature... mapperFeatureArr) {
        this._mapper.c(mapperFeatureArr);
        return (B) _this();
    }

    public B configure(MapperFeature mapperFeature, boolean z) {
        this._mapper.b(mapperFeature, z);
        return (B) _this();
    }

    public B enable(SerializationFeature... serializationFeatureArr) {
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            this._mapper.b(serializationFeature);
        }
        return (B) _this();
    }

    public B disable(SerializationFeature... serializationFeatureArr) {
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            this._mapper.a(serializationFeature);
        }
        return (B) _this();
    }

    public B configure(SerializationFeature serializationFeature, boolean z) {
        this._mapper.d(serializationFeature, z);
        return (B) _this();
    }

    public B enable(DeserializationFeature... deserializationFeatureArr) {
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            this._mapper.b(deserializationFeature);
        }
        return (B) _this();
    }

    public B disable(DeserializationFeature... deserializationFeatureArr) {
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            this._mapper.d(deserializationFeature);
        }
        return (B) _this();
    }

    public B configure(DeserializationFeature deserializationFeature, boolean z) {
        this._mapper.c(deserializationFeature, z);
        return (B) _this();
    }

    public B enable(JsonParser.Feature... featureArr) {
        this._mapper.e(featureArr);
        return (B) _this();
    }

    public B disable(JsonParser.Feature... featureArr) {
        this._mapper.d(featureArr);
        return (B) _this();
    }

    public B configure(JsonParser.Feature feature, boolean z) {
        this._mapper.e(feature, z);
        return (B) _this();
    }

    public B enable(JsonGenerator.Feature... featureArr) {
        this._mapper.c(featureArr);
        return (B) _this();
    }

    public B disable(JsonGenerator.Feature... featureArr) {
        this._mapper.e(featureArr);
        return (B) _this();
    }

    public B configure(JsonGenerator.Feature feature, boolean z) {
        this._mapper.b(feature, z);
        return (B) _this();
    }

    public B enable(StreamReadFeature... streamReadFeatureArr) {
        for (StreamReadFeature streamReadFeature : streamReadFeatureArr) {
            this._mapper.e(streamReadFeature.mappedFeature());
        }
        return (B) _this();
    }

    public B disable(StreamReadFeature... streamReadFeatureArr) {
        for (StreamReadFeature streamReadFeature : streamReadFeatureArr) {
            this._mapper.d(streamReadFeature.mappedFeature());
        }
        return (B) _this();
    }

    public B configure(StreamReadFeature streamReadFeature, boolean z) {
        this._mapper.e(streamReadFeature.mappedFeature(), z);
        return (B) _this();
    }

    public B enable(StreamWriteFeature... streamWriteFeatureArr) {
        for (StreamWriteFeature streamWriteFeature : streamWriteFeatureArr) {
            this._mapper.c(streamWriteFeature.mappedFeature());
        }
        return (B) _this();
    }

    public B disable(StreamWriteFeature... streamWriteFeatureArr) {
        for (StreamWriteFeature streamWriteFeature : streamWriteFeatureArr) {
            this._mapper.e(streamWriteFeature.mappedFeature());
        }
        return (B) _this();
    }

    public B configure(StreamWriteFeature streamWriteFeature, boolean z) {
        this._mapper.b(streamWriteFeature.mappedFeature(), z);
        return (B) _this();
    }

    public B addModule(Module module) {
        this._mapper.a(module);
        return (B) _this();
    }

    public B addModules(Module... moduleArr) {
        for (Module module : moduleArr) {
            addModule(module);
        }
        return (B) _this();
    }

    public B addModules(Iterable<? extends Module> iterable) {
        Iterator<? extends Module> it = iterable.iterator();
        while (it.hasNext()) {
            addModule(it.next());
        }
        return (B) _this();
    }

    public static List<Module> findModules() {
        return findModules(null);
    }

    public static List<Module> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = secureGetServiceLoader(Module.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add((Module) it.next());
        }
        return arrayList;
    }

    private static <T> ServiceLoader<T> secureGetServiceLoader(final Class<T> cls, final ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction<ServiceLoader<T>>() { // from class: com.fasterxml.jackson.databind.cfg.MapperBuilder.2
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ServiceLoader<T> run() {
                ClassLoader classLoader2 = classLoader;
                return classLoader2 == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader2);
            }
        });
    }

    public B findAndAddModules() {
        return (B) addModules(findModules());
    }

    public B annotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._mapper.d(annotationIntrospector);
        return (B) _this();
    }

    public B typeFactory(ahp ahpVar) {
        this._mapper.c(ahpVar);
        return (B) _this();
    }

    public B subtypeResolver(SubtypeResolver subtypeResolver) {
        this._mapper.a(subtypeResolver);
        return (B) _this();
    }

    public B visibility(VisibilityChecker<?> visibilityChecker) {
        this._mapper.c(visibilityChecker);
        return (B) _this();
    }

    public B visibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._mapper.b(propertyAccessor, visibility);
        return (B) _this();
    }

    public B handlerInstantiator(HandlerInstantiator handlerInstantiator) {
        this._mapper.b(handlerInstantiator);
        return (B) _this();
    }

    public B propertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._mapper.e(propertyNamingStrategy);
        return (B) _this();
    }

    public B accessorNaming(AccessorNamingStrategy.Provider provider) {
        if (provider == null) {
            provider = new DefaultAccessorNamingStrategy.c();
        }
        this._mapper.e(provider);
        return (B) _this();
    }

    public B serializerFactory(SerializerFactory serializerFactory) {
        this._mapper.e(serializerFactory);
        return (B) _this();
    }

    public B filterProvider(FilterProvider filterProvider) {
        this._mapper.c(filterProvider);
        return (B) _this();
    }

    public B defaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._mapper.a(prettyPrinter);
        return (B) _this();
    }

    public B injectableValues(InjectableValues injectableValues) {
        this._mapper.c(injectableValues);
        return (B) _this();
    }

    public B nodeFactory(aes aesVar) {
        this._mapper.a(aesVar);
        return (B) _this();
    }

    public B constructorDetector(ConstructorDetector constructorDetector) {
        this._mapper.c(constructorDetector);
        return (B) _this();
    }

    public B addHandler(DeserializationProblemHandler deserializationProblemHandler) {
        this._mapper.e(deserializationProblemHandler);
        return (B) _this();
    }

    public B clearProblemHandlers() {
        this._mapper.b();
        return (B) _this();
    }

    public B defaultSetterInfo(JsonSetter.e eVar) {
        this._mapper.c(eVar);
        return (B) _this();
    }

    public B defaultMergeable(Boolean bool) {
        this._mapper.a(bool);
        return (B) _this();
    }

    public B defaultLeniency(Boolean bool) {
        this._mapper.c(bool);
        return (B) _this();
    }

    public B defaultDateFormat(DateFormat dateFormat) {
        this._mapper.d(dateFormat);
        return (B) _this();
    }

    public B defaultTimeZone(TimeZone timeZone) {
        this._mapper.a(timeZone);
        return (B) _this();
    }

    public B defaultLocale(Locale locale) {
        this._mapper.a(locale);
        return (B) _this();
    }

    public B defaultBase64Variant(Base64Variant base64Variant) {
        this._mapper.c(base64Variant);
        return (B) _this();
    }

    public B serializationInclusion(JsonInclude.Include include) {
        this._mapper.d(include);
        return (B) _this();
    }

    public B defaultPropertyInclusion(JsonInclude.b bVar) {
        this._mapper.b(bVar);
        return (B) _this();
    }

    public B addMixIn(Class<?> cls, Class<?> cls2) {
        this._mapper.d(cls, cls2);
        return (B) _this();
    }

    public B registerSubtypes(Class<?>... clsArr) {
        this._mapper.d(clsArr);
        return (B) _this();
    }

    public B registerSubtypes(adg... adgVarArr) {
        this._mapper.d(adgVarArr);
        return (B) _this();
    }

    public B registerSubtypes(Collection<Class<?>> collection) {
        this._mapper.e(collection);
        return (B) _this();
    }

    public B polymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._mapper.b(polymorphicTypeValidator);
        return (B) _this();
    }

    public B activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._mapper.c(polymorphicTypeValidator);
        return (B) _this();
    }

    public B activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, ObjectMapper.DefaultTyping defaultTyping) {
        this._mapper.e(polymorphicTypeValidator, defaultTyping);
        return (B) _this();
    }

    public B activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, ObjectMapper.DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        this._mapper.b(polymorphicTypeValidator, defaultTyping, as);
        return (B) _this();
    }

    public B activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, ObjectMapper.DefaultTyping defaultTyping, String str) {
        this._mapper.d(polymorphicTypeValidator, defaultTyping, str);
        return (B) _this();
    }

    public B deactivateDefaultTyping() {
        this._mapper.d();
        return (B) _this();
    }

    public B setDefaultTyping(TypeResolverBuilder<?> typeResolverBuilder) {
        this._mapper.a(typeResolverBuilder);
        return (B) _this();
    }
}
