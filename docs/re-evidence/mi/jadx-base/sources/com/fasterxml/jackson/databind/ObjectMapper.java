package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.f;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import defpackage.b5f;
import defpackage.bip;
import defpackage.bpo;
import defpackage.c1a;
import defpackage.c4h;
import defpackage.c5q;
import defpackage.e5q;
import defpackage.esd;
import defpackage.h04;
import defpackage.hh2;
import defpackage.ihh;
import defpackage.irl;
import defpackage.jqk;
import defpackage.kgh;
import defpackage.ksd;
import defpackage.lh2;
import defpackage.mdo;
import defpackage.mj1;
import defpackage.nkb;
import defpackage.nz5;
import defpackage.oz5;
import defpackage.pnq;
import defpackage.q4q;
import defpackage.r4q;
import defpackage.r7i;
import defpackage.t1q;
import defpackage.t63;
import defpackage.tm9;
import defpackage.u4q;
import defpackage.v3h;
import defpackage.vwl;
import defpackage.wwl;
import defpackage.wzd;
import defpackage.x10;
import defpackage.xwl;
import defpackage.y1h;
import defpackage.z4q;
import defpackage.zsd;
import defpackage.ztd;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectMapper extends v3h implements Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(zsd.class);
    private static final long serialVersionUID = 2;
    protected final ConfigOverrides _configOverrides;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, esd<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected vwl _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected bpo _subtypeResolver;
    protected TypeFactory _typeFactory;

    public static class DefaultTypeResolverBuilder extends mdo implements Serializable {
        private static final long serialVersionUID = 1;
        protected final DefaultTyping _appliesFor;

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
            this._appliesFor = defaultTyping;
        }

        @Override // defpackage.mdo, defpackage.c5q
        public q4q buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeDeserializer(deserializationConfig, javaType, collection);
            }
            return null;
        }

        @Override // defpackage.mdo, defpackage.c5q
        public e5q buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeSerializer(serializationConfig, javaType, collection);
            }
            return null;
        }

        public boolean useForType(JavaType javaType) {
            if (javaType.isPrimitive()) {
                return false;
            }
            int i = c.f7632a[this._appliesFor.ordinal()];
            if (i == 1) {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            } else if (i != 2) {
                if (i != 3) {
                    return javaType.isJavaLangObject();
                }
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
                while (javaType.isReferenceType()) {
                    javaType = javaType.getReferencedType();
                }
                return (javaType.isFinal() || com.fasterxml.jackson.core.b.class.isAssignableFrom(javaType.getRawClass())) ? false : true;
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            return javaType.isJavaLangObject() || !(javaType.isConcrete() || com.fasterxml.jackson.core.b.class.isAssignableFrom(javaType.getRawClass()));
        }
    }

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL
    }

    public class a implements com.fasterxml.jackson.databind.a.InterfaceC0177a {
        public a() {
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void a(wzd wzdVar) {
            com.fasterxml.jackson.databind.deser.a aVarWithAdditionalKeyDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalKeyDeserializers(wzdVar);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(aVarWithAdditionalKeyDeserializers);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void b(xwl xwlVar) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(xwlVar);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void c(u4q u4qVar) {
            ObjectMapper.this.setTypeFactory(ObjectMapper.this._typeFactory.withModifier(u4qVar));
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void d(hh2 hh2Var) {
            com.fasterxml.jackson.databind.deser.a aVarWithDeserializerModifier = ObjectMapper.this._deserializationContext._factory.withDeserializerModifier(hh2Var);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(aVarWithDeserializerModifier);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void e(lh2 lh2Var) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(lh2Var);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void f(pnq pnqVar) {
            com.fasterxml.jackson.databind.deser.a aVarWithValueInstantiators = ObjectMapper.this._deserializationContext._factory.withValueInstantiators(pnqVar);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(aVarWithValueInstantiators);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void g(NamedType... namedTypeArr) {
            ObjectMapper.this.registerSubtypes(namedTypeArr);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void h(oz5 oz5Var) {
            com.fasterxml.jackson.databind.deser.a aVarWithAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(oz5Var);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(aVarWithAdditionalDeserializers);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void i(Class<?> cls, Class<?> cls2) {
            ObjectMapper.this.addMixIn(cls, cls2);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void j(x10 x10Var) {
            com.fasterxml.jackson.databind.deser.a aVarWithAbstractTypeResolver = ObjectMapper.this._deserializationContext._factory.withAbstractTypeResolver(x10Var);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(aVarWithAbstractTypeResolver);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void k(xwl xwlVar) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(xwlVar);
        }

        @Override // com.fasterxml.jackson.databind.a.InterfaceC0177a
        public void l(PropertyNamingStrategy propertyNamingStrategy) {
            ObjectMapper.this.setPropertyNamingStrategy(propertyNamingStrategy);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class b<T> implements PrivilegedAction<ServiceLoader<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f7630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f7631b;

        public b(ClassLoader classLoader, Class cls) {
            this.f7630a = classLoader;
            this.f7631b = cls;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServiceLoader<T> run() {
            ClassLoader classLoader = this.f7630a;
            return classLoader == null ? ServiceLoader.load(this.f7631b) : ServiceLoader.load(this.f7631b, classLoader);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7632a;

        static {
            int[] iArr = new int[DefaultTyping.values().length];
            f7632a = iArr;
            try {
                iArr[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7632a[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7632a[DefaultTyping.NON_FINAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings(null, jacksonAnnotationIntrospector, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), null, com.fasterxml.jackson.core.a.a());
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    private final void _configAndWriteCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                h04.i(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            h04.i(null, closeable, e);
        }
    }

    public static List<com.fasterxml.jackson.databind.a> findModules() {
        return findModules(null);
    }

    private static <T> ServiceLoader<T> secureGetServiceLoader(Class<T> cls, ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(new b(classLoader, cls));
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        serializationConfig.initialize(jsonGenerator);
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _configAndWriteCloseable(jsonGenerator, obj, serializationConfig);
            return;
        }
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            jsonGenerator.close();
        } catch (Exception e) {
            h04.j(jsonGenerator, e);
        }
    }

    public Object _convert(Object obj, JavaType javaType) throws IllegalArgumentException {
        Object objDeserialize;
        Class<?> rawClass;
        if (obj != null && (rawClass = javaType.getRawClass()) != Object.class && !javaType.hasGenericTypes() && rawClass.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        bip bipVar = new bip((v3h) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            bipVar = bipVar.n1(true);
        }
        try {
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(bipVar, obj);
            JsonParser jsonParserF1 = bipVar.f1();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken jsonToken_initForReading = _initForReading(jsonParserF1, javaType);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParserF1, deserializationConfig);
                objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                objDeserialize = null;
            } else {
                DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext2 = createDeserializationContext(jsonParserF1, deserializationConfig);
                objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext2, javaType).deserialize(jsonParserF1, defaultDeserializationContextCreateDeserializationContext2);
            }
            jsonParserF1.close();
            return objDeserialize;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public esd<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        esd<Object> esdVar = this._rootDeserializers.get(javaType);
        if (esdVar != null) {
            return esdVar;
        }
        esd<Object> esdVarFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (esdVarFindRootValueDeserializer != null) {
            this._rootDeserializers.put(javaType, esdVarFindRootValueDeserializer);
            return esdVarFindRootValueDeserializer;
        }
        return (esd) deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
    }

    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) throws IOException {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == null && (jsonTokenK = jsonParser.G0()) == null) {
            throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
        }
        return jsonTokenK;
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    public Object _readMapAndClose(JsonParser jsonParser, JavaType javaType) throws IOException {
        Object obj_unwrapAndDeserialize;
        try {
            JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                obj_unwrapAndDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                obj_unwrapAndDeserialize = null;
            } else {
                esd<Object> esdVar_findRootDeserializer = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType);
                obj_unwrapAndDeserialize = deserializationConfig.useRootWrapping() ? _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, deserializationConfig, javaType, esdVar_findRootDeserializer) : esdVar_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
                defaultDeserializationContextCreateDeserializationContext.checkUnresolvedObjectId();
            }
            if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return obj_unwrapAndDeserialize;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public zsd _readTreeAndClose(JsonParser jsonParser) throws IOException {
        Object objDeserialize;
        try {
            JavaType javaType = JSON_NODE_TYPE;
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            deserializationConfig.initialize(jsonParser);
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == null && (jsonTokenK = jsonParser.G0()) == null) {
                jsonParser.close();
                return null;
            }
            if (jsonTokenK == JsonToken.VALUE_NULL) {
                y1h y1hVarM128nullNode = deserializationConfig.getNodeFactory().nullNode();
                jsonParser.close();
                return y1hVarM128nullNode;
            }
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            esd<Object> esdVar_findRootDeserializer = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType);
            if (deserializationConfig.useRootWrapping()) {
                objDeserialize = _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, deserializationConfig, javaType, esdVar_findRootDeserializer);
            } else {
                objDeserialize = esdVar_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
                if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                    _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
                }
            }
            zsd zsdVar = (zsd) objDeserialize;
            jsonParser.close();
            return zsdVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws IOException {
        Object obj_unwrapAndDeserialize;
        JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            obj_unwrapAndDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
        } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
            obj_unwrapAndDeserialize = null;
        } else {
            esd<Object> esdVar_findRootDeserializer = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType);
            obj_unwrapAndDeserialize = deserializationConfig.useRootWrapping() ? _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, deserializationConfig, javaType, esdVar_findRootDeserializer) : esdVar_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
        }
        jsonParser.l();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
        }
        return obj_unwrapAndDeserialize;
    }

    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JavaType javaType, esd<Object> esdVar) throws IOException {
        String simpleName = deserializationConfig.findRootName(javaType).getSimpleName();
        JsonToken jsonTokenK = jsonParser.K();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (jsonTokenK != jsonToken) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.K());
        }
        JsonToken jsonTokenG0 = jsonParser.G0();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonTokenG0 != jsonToken2) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", simpleName, jsonParser.K());
        }
        String strJ = jsonParser.J();
        if (!simpleName.equals(strJ)) {
            deserializationContext.reportInputMismatch(javaType, "Root name '%s' does not match expected ('%s') for type %s", strJ, simpleName, javaType);
        }
        jsonParser.G0();
        Object objDeserialize = esdVar.deserialize(jsonParser, deserializationContext);
        JsonToken jsonTokenG1 = jsonParser.G0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenG1 != jsonToken3) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.K());
        }
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, javaType);
        }
        return objDeserialize;
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken jsonTokenG0 = jsonParser.G0();
        if (jsonTokenG0 != null) {
            deserializationContext.reportTrailingTokens(h04.Z(javaType), jsonParser, jsonTokenG0);
        }
    }

    public void _verifySchemaType(c1a c1aVar) {
        if (c1aVar == null || this._jsonFactory.canUseSchema(c1aVar)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + c1aVar.getClass().getName() + " for format " + this._jsonFactory.getFormatName());
    }

    public void acceptJsonFormatVisitor(JavaType javaType, ksd ksdVar) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("type must be provided");
        }
        _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, ksdVar);
    }

    public ObjectMapper addHandler(nz5 nz5Var) {
        this._deserializationConfig = this._deserializationConfig.withHandler(nz5Var);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, null);
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, null);
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._configOverrides.findOrCreateOverride(cls);
    }

    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(mapperFeature) : this._serializationConfig.without(mapperFeature);
        this._deserializationConfig = z ? this._deserializationConfig.with(mapperFeature) : this._deserializationConfig.without(mapperFeature);
        return this;
    }

    public JavaType constructType(Type type) {
        return this._typeFactory.constructType(type);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        return (T) _convert(obj, this._typeFactory.constructType(cls));
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    public f defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping(null);
    }

    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    public ObjectMapper enableDefaultTyping() {
        return enableDefaultTyping(DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(new DefaultTypeResolverBuilder(defaultTyping).init(JsonTypeInfo.Id.CLASS, (r4q) null).inclusion(JsonTypeInfo.As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules(findModules());
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    @Deprecated
    public ztd generateJsonSchema(Class<?> cls) throws JsonMappingException {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.getDateFormat();
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    @Override // defpackage.v3h
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    @Override // defpackage.v3h
    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.getPropertyNamingStrategy();
    }

    public Set<Object> getRegisteredModuleIds() {
        return Collections.unmodifiableSet(this._registeredModuleTypes);
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public vwl getSerializerFactory() {
        return this._serializerFactory;
    }

    public wwl getSerializerProvider() {
        return this._serializerProvider;
    }

    public wwl getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public bpo getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    public int mixInCount() {
        return this._mixIns.localSize();
    }

    @Override // defpackage.v3h, defpackage.r1q
    public <T extends com.fasterxml.jackson.core.b> T readTree(JsonParser jsonParser) throws IOException {
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.K() == null && jsonParser.G0() == null) {
            return null;
        }
        zsd zsdVar = (zsd) _readValue(deserializationConfig, jsonParser, JSON_NODE_TYPE);
        return zsdVar == null ? getNodeFactory().nullNode() : zsdVar;
    }

    @Override // defpackage.v3h
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType(cls));
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with(this._injectableValues);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(obj.getClass()), obj, null, this._injectableValues);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().withView(cls));
    }

    public ObjectMapper registerModule(com.fasterxml.jackson.databind.a aVar) {
        Object typeId;
        if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = aVar.getTypeId()) != null) {
            if (this._registeredModuleTypes == null) {
                this._registeredModuleTypes = new LinkedHashSet();
            }
            if (!this._registeredModuleTypes.add(typeId)) {
                return this;
            }
        }
        if (aVar.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (aVar.version() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        aVar.setupModule(new a());
        return this;
    }

    public ObjectMapper registerModules(com.fasterxml.jackson.databind.a... aVarArr) {
        for (com.fasterxml.jackson.databind.a aVar : aVarArr) {
            registerModule(aVar);
        }
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = this._serializationConfig.with(base64Variant);
        this._deserializationConfig = this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public ObjectMapper setDefaultMergeable(Boolean bool) {
        this._configOverrides.setDefaultMergeable(bool);
        return this;
    }

    public ObjectMapper setDefaultPrettyPrinter(r7i r7iVar) {
        this._serializationConfig = this._serializationConfig.withDefaultPrettyPrinter(r7iVar);
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public ObjectMapper setDefaultSetterInfo(JsonSetter.Value value) {
        this._configOverrides.setDefaultSetterInfo(value);
        return this;
    }

    public ObjectMapper setDefaultTyping(c5q<?> c5qVar) {
        this._deserializationConfig = this._deserializationConfig.with(c5qVar);
        this._serializationConfig = this._serializationConfig.with(c5qVar);
        return this;
    }

    public ObjectMapper setDefaultVisibility(JsonAutoDetect.Value value) {
        this._configOverrides.setDefaultVisibility(VisibilityChecker.Std.construct(value));
        return this;
    }

    public ObjectMapper setFilterProvider(tm9 tm9Var) {
        this._serializationConfig = this._serializationConfig.withFilters(tm9Var);
        return this;
    }

    @Deprecated
    public void setFilters(tm9 tm9Var) {
        this._serializationConfig = this._serializationConfig.withFilters(tm9Var);
    }

    public Object setHandlerInstantiator(nkb nkbVar) {
        this._deserializationConfig = this._deserializationConfig.with(nkbVar);
        this._serializationConfig = this._serializationConfig.with(nkbVar);
        return this;
    }

    public ObjectMapper setInjectableValues(InjectableValues injectableValues) {
        this._injectableValues = injectableValues;
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = this._deserializationConfig.with(locale);
        this._serializationConfig = this._serializationConfig.with(locale);
        return this;
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    public ObjectMapper setMixInResolver(f.a aVar) {
        SimpleMixInResolver simpleMixInResolverWithOverrides = this._mixIns.withOverrides(aVar);
        if (simpleMixInResolverWithOverrides != this._mixIns) {
            this._mixIns = simpleMixInResolverWithOverrides;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, simpleMixInResolverWithOverrides);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, simpleMixInResolverWithOverrides);
        }
        return this;
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.setLocalDefinitions(map);
        return this;
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(JsonInclude.Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        setPropertyInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setSerializerFactory(vwl vwlVar) {
        this._serializerFactory = vwlVar;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public ObjectMapper setSubtypeResolver(bpo bpoVar) {
        this._subtypeResolver = bpoVar;
        this._deserializationConfig = this._deserializationConfig.with(bpoVar);
        this._serializationConfig = this._serializationConfig.with(bpoVar);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = this._deserializationConfig.with(timeZone);
        this._serializationConfig = this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = this._deserializationConfig.with(typeFactory);
        this._serializationConfig = this._serializationConfig.with(typeFactory);
        return this;
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._configOverrides.setDefaultVisibility(visibilityChecker);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    @Override // defpackage.v3h, defpackage.r1q
    public JsonParser treeAsTokens(com.fasterxml.jackson.core.b bVar) {
        return new t1q((zsd) bVar, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v3h
    public <T> T treeToValue(com.fasterxml.jackson.core.b bVar, Class<T> cls) throws JsonProcessingException {
        T t;
        if (cls != Object.class) {
            try {
                if (cls.isAssignableFrom(bVar.getClass())) {
                    return bVar;
                }
            } catch (JsonProcessingException e) {
                throw e;
            } catch (IOException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        return (bVar.f() == JsonToken.VALUE_EMBEDDED_OBJECT && (bVar instanceof kgh) && ((t = (T) ((kgh) bVar).W()) == null || cls.isInstance(t))) ? t : (T) readValue(treeAsTokens(bVar), cls);
    }

    public <T> T updateValue(T t, Object obj) throws JsonMappingException {
        if (t == null || obj == null) {
            return t;
        }
        bip bipVar = new bip((v3h) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            bipVar = bipVar.n1(true);
        }
        try {
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(bipVar, obj);
            JsonParser jsonParserF1 = bipVar.f1();
            T t2 = (T) readerForUpdating(t).readValue(jsonParserF1);
            jsonParserF1.close();
            return t2;
        } catch (IOException e) {
            if (e instanceof JsonMappingException) {
                throw ((JsonMappingException) e);
            }
            throw JsonMappingException.fromUnexpectedIOE(e);
        }
    }

    public <T extends zsd> T valueToTree(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return null;
        }
        bip bipVar = new bip((v3h) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            bipVar = bipVar.n1(true);
        }
        try {
            writeValue(bipVar, obj);
            JsonParser jsonParserF1 = bipVar.f1();
            T t = (T) readTree(jsonParserF1);
            jsonParserF1.close();
            return t;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // defpackage.v3h
    public Version version() {
        return ihh.f21147a;
    }

    @Override // defpackage.v3h, defpackage.r1q
    public void writeTree(JsonGenerator jsonGenerator, com.fasterxml.jackson.core.b bVar) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, bVar);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // defpackage.v3h
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.D() == null) {
            jsonGenerator.P(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseableValue(jsonGenerator, obj, serializationConfig);
            return;
        }
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        t63 t63Var = new t63(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(t63Var, JsonEncoding.UTF8), obj);
            byte[] bArrD = t63Var.D();
            t63Var.p();
            return bArrD;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        irl irlVar = new irl(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(irlVar), obj);
            return irlVar.a();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer(r7i r7iVar) {
        if (r7iVar == null) {
            r7iVar = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return _newWriter(getSerializationConfig(), null, r7iVar);
    }

    public ObjectWriter writerFor(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null);
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, null, serializationConfig.getDefaultPrettyPrinter());
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null);
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().withView(cls));
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public static List<com.fasterxml.jackson.databind.a> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = secureGetServiceLoader(com.fasterxml.jackson.databind.a.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add((com.fasterxml.jackson.databind.a) it.next());
        }
        return arrayList;
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, c1a c1aVar, InjectableValues injectableValues) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, c1aVar, injectableValues);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, c1a c1aVar) {
        return new ObjectWriter(this, serializationConfig, c1aVar);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public <T> T convertValue(Object obj, z4q<?> z4qVar) throws IllegalArgumentException {
        return (T) _convert(obj, this._typeFactory.constructType(z4qVar));
    }

    @Override // defpackage.v3h, defpackage.r1q
    public mj1 createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    @Override // defpackage.v3h, defpackage.r1q
    public c4h createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    @Override // defpackage.v3h
    public <T> T readValue(JsonParser jsonParser, z4q<?> z4qVar) throws IOException {
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType(z4qVar));
    }

    @Override // defpackage.v3h
    public /* bridge */ /* synthetic */ Iterator readValues(JsonParser jsonParser, z4q z4qVar) throws IOException {
        return readValues(jsonParser, (z4q<?>) z4qVar);
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(cls), null, null, this._injectableValues);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        this._serializationConfig = serializationConfig;
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Include include) {
        this._configOverrides.setDefaultInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._configOverrides.setDefaultVisibility(this._configOverrides.getDefaultVisibility().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public ObjectMapper(ObjectMapper objectMapper) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        JsonFactory jsonFactoryCopy = objectMapper._jsonFactory.copy();
        this._jsonFactory = jsonFactoryCopy;
        jsonFactoryCopy.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver;
        this._typeFactory = objectMapper._typeFactory;
        this._injectableValues = objectMapper._injectableValues;
        ConfigOverrides configOverridesCopy = objectMapper._configOverrides.copy();
        this._configOverrides = configOverridesCopy;
        this._mixIns = objectMapper._mixIns.copy();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._mixIns, rootNameLookup, configOverridesCopy);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._mixIns, rootNameLookup, configOverridesCopy);
        this._serializerProvider = objectMapper._serializerProvider.copy();
        this._deserializationContext = objectMapper._deserializationContext.copy();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, r7i r7iVar) {
        return new ObjectWriter(this, serializationConfig, javaType, r7iVar);
    }

    public <T> T convertValue(Object obj, JavaType javaType) throws IllegalArgumentException {
        return (T) _convert(obj, javaType);
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        if (as != JsonTypeInfo.As.EXTERNAL_PROPERTY) {
            return setDefaultTyping(new DefaultTypeResolverBuilder(defaultTyping).init(JsonTypeInfo.Id.CLASS, (r4q) null).inclusion(as));
        }
        throw new IllegalArgumentException("Cannot use includeAs of " + as);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    @Override // defpackage.v3h
    public final <T> T readValue(JsonParser jsonParser, jqk jqkVar) throws IOException {
        return (T) _readValue(getDeserializationConfig(), jsonParser, (JavaType) jqkVar);
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerFor(z4q<?> z4qVar) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(z4qVar), null, null, this._injectableValues);
    }

    public ObjectMapper registerModules(Iterable<? extends com.fasterxml.jackson.databind.a> iterable) {
        Iterator<? extends com.fasterxml.jackson.databind.a> it = iterable.iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        return this;
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().registerSubtypes(collection);
    }

    public void acceptJsonFormatVisitor(Class<?> cls, ksd ksdVar) throws JsonMappingException {
        acceptJsonFormatVisitor(this._typeFactory.constructType(cls), ksdVar);
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, atomicReference);
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        return (T) _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    @Override // defpackage.v3h
    public <T> b5f<T> readValues(JsonParser jsonParser, jqk jqkVar) throws IOException {
        return readValues(jsonParser, (JavaType) jqkVar);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        return _newReader(getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writerFor(z4q<?> z4qVar) {
        return _newWriter(getSerializationConfig(), null, null);
    }

    @Deprecated
    public ObjectWriter writerWithType(z4q<?> z4qVar) {
        return _newWriter(getSerializationConfig(), null, null);
    }

    @Deprecated
    public JsonToken _initForReading(JsonParser jsonParser) throws IOException {
        return _initForReading(jsonParser, null);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(cls));
    }

    public <T> b5f<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new b5f<>(javaType, jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), false, null);
    }

    public ObjectReader reader(c1a c1aVar) {
        _verifySchemaType(c1aVar);
        return _newReader(getDeserializationConfig(), null, null, c1aVar, this._injectableValues);
    }

    public void writeTree(JsonGenerator jsonGenerator, zsd zsdVar) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, zsdVar);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().with(serializationFeature));
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public zsd readTree(InputStream inputStream) throws IOException {
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public <T> T readValue(File file, z4q z4qVar) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((z4q<?>) z4qVar));
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public zsd readTree(Reader reader) throws IOException {
        return _readTreeAndClose(this._jsonFactory.createParser(reader));
    }

    public <T> T readValue(File file, JavaType javaType) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public ObjectReader reader(InjectableValues injectableValues) {
        return _newReader(getDeserializationConfig(), null, null, null, injectableValues);
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().with(dateFormat));
    }

    public zsd readTree(String str) throws IOException {
        return _readTreeAndClose(this._jsonFactory.createParser(str));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType(cls));
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader(getDeserializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(tm9 tm9Var) {
        return _newWriter(getSerializationConfig().withFilters(tm9Var));
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public zsd readTree(byte[] bArr) throws IOException {
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public <T> T readValue(URL url, z4q z4qVar) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((z4q<?>) z4qVar));
    }

    @Override // defpackage.v3h
    public <T> b5f<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType(cls));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().with(contextAttributes));
    }

    public ObjectWriter writer(c1a c1aVar) {
        _verifySchemaType(c1aVar);
        return _newWriter(getSerializationConfig(), c1aVar);
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public zsd readTree(File file) throws IOException {
        return _readTreeAndClose(this._jsonFactory.createParser(file));
    }

    public <T> T readValue(URL url, JavaType javaType) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    @Override // defpackage.v3h
    public <T> b5f<T> readValues(JsonParser jsonParser, z4q<?> z4qVar) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType(z4qVar));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public void writeValue(File file, Object obj) throws IOException {
        _configAndWriteValue(this._jsonFactory.createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public zsd readTree(URL url) throws IOException {
        return _readTreeAndClose(this._jsonFactory.createParser(url));
    }

    public <T> T readValue(String str, Class<T> cls) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType(cls));
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(cls), null, null, this._injectableValues);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        _configAndWriteValue(this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter(getSerializationConfig().with(base64Variant));
    }

    public <T> T readValue(String str, z4q z4qVar) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType((z4q<?>) z4qVar));
    }

    @Deprecated
    public ObjectReader reader(z4q<?> z4qVar) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(z4qVar), null, null, this._injectableValues);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _configAndWriteValue(this._jsonFactory.createGenerator(dataOutput, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).with(characterEscapes);
    }

    public <T> T readValue(String str, JavaType javaType) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(str), javaType);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        _configAndWriteValue(this._jsonFactory.createGenerator(writer), obj);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().with(contextAttributes));
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(Reader reader, z4q z4qVar) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((z4q<?>) z4qVar));
    }

    public <T> T readValue(Reader reader, JavaType javaType) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(InputStream inputStream, z4q z4qVar) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((z4q<?>) z4qVar));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType(cls));
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings baseSettingsWithClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        this._serializationConfig = new SerializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserializationConfig = new DeserializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        boolean zRequiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.isEnabled(mapperFeature) ^ zRequiresPropertyOrdering) {
            configure(mapperFeature, zRequiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(byte[] bArr, z4q z4qVar) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((z4q<?>) z4qVar));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, z4q z4qVar) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((z4q<?>) z4qVar));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i, int i2, JavaType javaType) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) throws IOException {
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }
}
