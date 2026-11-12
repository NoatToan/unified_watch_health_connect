package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.b5f;
import defpackage.c1a;
import defpackage.cn9;
import defpackage.dip;
import defpackage.esd;
import defpackage.h04;
import defpackage.ihh;
import defpackage.jqk;
import defpackage.ll5;
import defpackage.nz5;
import defpackage.ptd;
import defpackage.qtd;
import defpackage.t1q;
import defpackage.v3h;
import defpackage.z0a;
import defpackage.z4q;
import defpackage.zsd;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectReader extends v3h implements Serializable {
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(zsd.class);
    private static final long serialVersionUID = 2;
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final ll5 _dataFormatReaders;
    private final dip _filter;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _parserFactory;
    protected final esd<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, esd<Object>> _rootDeserializers;
    protected final c1a _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, null, null, null, null);
    }

    public Object _bind(JsonParser jsonParser, Object obj) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            }
        } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
            esd<Object> esdVar_findRootDeserializer = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext);
            if (this._unwrapRoot) {
                obj = _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType, esdVar_findRootDeserializer);
            } else {
                obj = obj == null ? esdVar_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext) : esdVar_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, obj);
            }
        }
        jsonParser.l();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
        }
        return obj;
    }

    public Object _bindAndClose(JsonParser jsonParser) throws IOException {
        Object objDeserialize;
        try {
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                objDeserialize = this._valueToUpdate;
                if (objDeserialize == null) {
                    objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
                }
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                objDeserialize = this._valueToUpdate;
            } else {
                esd<Object> esdVar_findRootDeserializer = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext);
                if (this._unwrapRoot) {
                    objDeserialize = _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType, esdVar_findRootDeserializer);
                } else {
                    Object obj = this._valueToUpdate;
                    if (obj == null) {
                        objDeserialize = esdVar_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
                    } else {
                        esdVar_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, obj);
                        objDeserialize = this._valueToUpdate;
                    }
                }
            }
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return objDeserialize;
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

    public final zsd _bindAndCloseAsTree(JsonParser jsonParser) throws IOException {
        try {
            zsd zsdVar_bindAsTree = _bindAsTree(jsonParser);
            if (jsonParser != null) {
                jsonParser.close();
            }
            return zsdVar_bindAsTree;
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

    public <T> b5f<T> _bindAndReadValues(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        jsonParser.G0();
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public final zsd _bindAsTree(JsonParser jsonParser) throws IOException {
        Object obj_unwrapAndDeserialize;
        this._config.initialize(jsonParser);
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == null && (jsonTokenK = jsonParser.G0()) == null) {
            return null;
        }
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        if (jsonTokenK == JsonToken.VALUE_NULL) {
            return defaultDeserializationContextCreateDeserializationContext.getNodeFactory().nullNode();
        }
        esd<Object> esdVar_findTreeDeserializer = _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext);
        if (this._unwrapRoot) {
            obj_unwrapAndDeserialize = _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, JSON_NODE_TYPE, esdVar_findTreeDeserializer);
        } else {
            Object objDeserialize = esdVar_findTreeDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, JSON_NODE_TYPE);
            }
            obj_unwrapAndDeserialize = objDeserialize;
        }
        return (zsd) obj_unwrapAndDeserialize;
    }

    public JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        return (this._filter == null || cn9.class.isInstance(jsonParser)) ? jsonParser : new cn9(jsonParser, this._filter, false, z);
    }

    public Object _detectBindAndClose(byte[] bArr, int i, int i2) throws IOException {
        ll5.b bVarC = this._dataFormatReaders.c(bArr, i, i2);
        if (!bVarC.d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVarC);
        }
        return bVarC.c()._bindAndClose(bVarC.a());
    }

    public zsd _detectBindAndCloseAsTree(InputStream inputStream) throws IOException {
        ll5.b bVarB = this._dataFormatReaders.b(inputStream);
        if (!bVarB.d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVarB);
        }
        JsonParser jsonParserA = bVarB.a();
        jsonParserA.n(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        return bVarB.c()._bindAndCloseAsTree(jsonParserA);
    }

    public <T> b5f<T> _detectBindAndReadValues(ll5.b bVar, boolean z) throws IOException {
        if (!bVar.d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVar);
        }
        JsonParser jsonParserA = bVar.a();
        if (z) {
            jsonParserA.n(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return bVar.c()._bindAndReadValues(jsonParserA);
    }

    public esd<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws JsonMappingException {
        esd<Object> esdVar = this._rootDeserializer;
        if (esdVar != null) {
            return esdVar;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        esd<Object> esdVar2 = this._rootDeserializers.get(javaType);
        if (esdVar2 != null) {
            return esdVar2;
        }
        esd<Object> esdVarFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (esdVarFindRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, esdVarFindRootValueDeserializer);
        return esdVarFindRootValueDeserializer;
    }

    public esd<Object> _findTreeDeserializer(DeserializationContext deserializationContext) throws JsonMappingException {
        ConcurrentHashMap<JavaType, esd<Object>> concurrentHashMap = this._rootDeserializers;
        JavaType javaType = JSON_NODE_TYPE;
        esd<Object> esdVarFindRootValueDeserializer = concurrentHashMap.get(javaType);
        if (esdVarFindRootValueDeserializer == null) {
            esdVarFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
            if (esdVarFindRootValueDeserializer == null) {
                deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
            }
            this._rootDeserializers.put(javaType, esdVarFindRootValueDeserializer);
        }
        return esdVarFindRootValueDeserializer;
    }

    public void _initForMultiRead(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser);
    }

    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser);
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == null && (jsonTokenK = jsonParser.G0()) == null) {
            deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        }
        return jsonTokenK;
    }

    public InputStream _inputStream(URL url) throws IOException {
        return url.openStream();
    }

    public ObjectReader _new(ObjectReader objectReader, JsonFactory jsonFactory) {
        return new ObjectReader(objectReader, jsonFactory);
    }

    public <T> b5f<T> _newIterator(JsonParser jsonParser, DeserializationContext deserializationContext, esd<?> esdVar, boolean z) {
        return new b5f<>(this._valueType, jsonParser, deserializationContext, esdVar, z, this._valueToUpdate);
    }

    public esd<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        esd<Object> esdVarFindRootValueDeserializer = this._rootDeserializers.get(javaType);
        if (esdVarFindRootValueDeserializer == null) {
            try {
                esdVarFindRootValueDeserializer = createDeserializationContext(null).findRootValueDeserializer(javaType);
                if (esdVarFindRootValueDeserializer != null) {
                    this._rootDeserializers.put(javaType, esdVarFindRootValueDeserializer);
                }
            } catch (JsonProcessingException unused) {
            }
        }
        return esdVarFindRootValueDeserializer;
    }

    public void _reportUndetectableSource(Object obj) throws JsonProcessingException {
        throw new JsonParseException((JsonParser) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public void _reportUnkownFormat(ll5 ll5Var, ll5.b bVar) throws JsonProcessingException {
        throw new JsonParseException((JsonParser) null, "Cannot detect format from input, does not look like any of detectable formats " + ll5Var.toString());
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, esd<Object> esdVar) throws IOException {
        Object objDeserialize;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
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
        Object obj = this._valueToUpdate;
        if (obj == null) {
            objDeserialize = esdVar.deserialize(jsonParser, deserializationContext);
        } else {
            esdVar.deserialize(jsonParser, deserializationContext, obj);
            objDeserialize = this._valueToUpdate;
        }
        JsonToken jsonTokenG1 = jsonParser.G0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenG1 != jsonToken3) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.K());
        }
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, this._valueType);
        }
        return objDeserialize;
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken jsonTokenG0 = jsonParser.G0();
        if (jsonTokenG0 != null) {
            Class<?> clsZ = h04.Z(javaType);
            if (clsZ == null && (obj = this._valueToUpdate) != null) {
                clsZ = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(clsZ, jsonParser, jsonTokenG0);
        }
    }

    public void _verifySchemaType(c1a c1aVar) {
        if (c1aVar == null || this._parserFactory.canUseSchema(c1aVar)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + c1aVar.getClass().getName() + " for format " + this._parserFactory.getFormatName());
    }

    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, deserializationConfig);
        ll5 ll5Var = this._dataFormatReaders;
        return ll5Var != null ? objectReader_new.withFormatDetection(ll5Var.d(deserializationConfig)) : objectReader_new;
    }

    public ObjectReader at(String str) {
        return new ObjectReader(this, new qtd(str));
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        esd<Object> esdVar_prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        ll5 ll5VarE = this._dataFormatReaders;
        if (ll5VarE != null) {
            ll5VarE = ll5VarE.e(javaType);
        }
        return _new(this, this._config, javaType, esdVar_prefetchRootDeserializer, this._valueToUpdate, null, this._injectableValues, ll5VarE);
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    @Override // defpackage.v3h
    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._config.isEnabled(deserializationFeature);
    }

    @Override // defpackage.v3h, defpackage.r1q
    public <T extends com.fasterxml.jackson.core.b> T readTree(JsonParser jsonParser) throws IOException {
        return _bindAsTree(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser) throws IOException {
        return (T) _bind(jsonParser, this._valueToUpdate);
    }

    @Override // defpackage.v3h
    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        return forType((Class<?>) cls).readValues(jsonParser);
    }

    @Override // defpackage.v3h, defpackage.r1q
    public JsonParser treeAsTokens(com.fasterxml.jackson.core.b bVar) {
        return new t1q((zsd) bVar, withValueToUpdate(null));
    }

    @Override // defpackage.v3h
    public <T> T treeToValue(com.fasterxml.jackson.core.b bVar, Class<T> cls) throws JsonProcessingException {
        try {
            return (T) readValue(treeAsTokens(bVar), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    @Override // defpackage.v3h
    public Version version() {
        return ihh.f21147a;
    }

    public ObjectReader with(c1a c1aVar) {
        if (c1aVar == null) {
            return this;
        }
        _verifySchemaType(c1aVar);
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, c1aVar, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader withAttribute(Object obj, Object obj2) {
        return _with(this._config.withAttribute(obj, obj2));
    }

    public ObjectReader withAttributes(Map<?, ?> map) {
        return _with(this._config.withAttributes(map));
    }

    public ObjectReader withFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withFeatures(deserializationFeatureArr));
    }

    public ObjectReader withFormatDetection(ObjectReader... objectReaderArr) {
        return withFormatDetection(new ll5(objectReaderArr));
    }

    public ObjectReader withHandler(nz5 nz5Var) {
        return _with(this._config.withHandler(nz5Var));
    }

    public ObjectReader withRootName(String str) {
        return _with(this._config.withRootName(str));
    }

    @Deprecated
    public ObjectReader withType(JavaType javaType) {
        return forType(javaType);
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, null, null, this._injectableValues, this._dataFormatReaders);
        }
        JavaType javaTypeConstructType = this._valueType;
        if (javaTypeConstructType == null) {
            javaTypeConstructType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaTypeConstructType, this._rootDeserializer, obj, null, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader withView(Class<?> cls) {
        return _with(this._config.withView(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature) {
        return _with(this._config.without(deserializationFeature));
    }

    public ObjectReader withoutAttribute(Object obj) {
        return _with(this._config.withoutAttribute(obj));
    }

    public ObjectReader withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withoutFeatures(deserializationFeatureArr));
    }

    public ObjectReader withoutRootName() {
        return _with(this._config.withRootName(PropertyName.NO_NAME));
    }

    @Override // defpackage.v3h, defpackage.r1q
    public void writeTree(JsonGenerator jsonGenerator, com.fasterxml.jackson.core.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v3h
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, c1a c1aVar, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    public InputStream _inputStream(File file) throws IOException {
        return new FileInputStream(file);
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    public ObjectReader at(ptd ptdVar) {
        return new ObjectReader(this, new qtd(ptdVar));
    }

    @Override // defpackage.v3h, defpackage.r1q
    public zsd createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    @Override // defpackage.v3h, defpackage.r1q
    public zsd createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public zsd readTree(InputStream inputStream) throws IOException {
        return this._dataFormatReaders != null ? _detectBindAndCloseAsTree(inputStream) : _bindAndCloseAsTree(_considerFilter(this._parserFactory.createParser(inputStream), false));
    }

    @Override // defpackage.v3h
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(jsonParser);
    }

    @Override // defpackage.v3h
    public <T> Iterator<T> readValues(JsonParser jsonParser, z4q<?> z4qVar) throws IOException {
        return forType(z4qVar).readValues(jsonParser);
    }

    public ObjectReader withFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withFeatures(featureArr));
    }

    public ObjectReader withFormatDetection(ll5 ll5Var) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, null, this._injectableValues, ll5Var);
    }

    public ObjectReader withRootName(PropertyName propertyName) {
        return _with(this._config.withRootName(propertyName));
    }

    @Deprecated
    public ObjectReader withType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.without(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withoutFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withoutFeatures(featureArr));
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, esd<Object> esdVar, Object obj, c1a c1aVar, InjectableValues injectableValues, ll5 ll5Var) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, esdVar, obj, c1aVar, injectableValues, ll5Var);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._parserFactory.isEnabled(feature);
    }

    @Override // defpackage.v3h
    public <T> T readValue(JsonParser jsonParser, z4q<?> z4qVar) throws IOException {
        return (T) forType(z4qVar).readValue(jsonParser);
    }

    @Override // defpackage.v3h
    public <T> Iterator<T> readValues(JsonParser jsonParser, jqk jqkVar) throws IOException {
        return readValues(jsonParser, (JavaType) jqkVar);
    }

    public ObjectReader withFeatures(z0a... z0aVarArr) {
        return _with(this._config.withFeatures(z0aVarArr));
    }

    @Deprecated
    public ObjectReader withType(Type type) {
        return forType(this._config.getTypeFactory().constructType(type));
    }

    public ObjectReader without(JsonParser.Feature feature) {
        return _with(this._config.without(feature));
    }

    public ObjectReader withoutFeatures(z0a... z0aVarArr) {
        return _with(this._config.withoutFeatures(z0aVarArr));
    }

    @Override // defpackage.v3h
    public <T> T readValue(JsonParser jsonParser, jqk jqkVar) throws IOException {
        return (T) forType((JavaType) jqkVar).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        return forType(javaType).readValues(jsonParser);
    }

    public ObjectReader with(DeserializationFeature deserializationFeature) {
        return _with(this._config.with(deserializationFeature));
    }

    @Deprecated
    public ObjectReader withType(z4q<?> z4qVar) {
        this._config.getTypeFactory();
        throw null;
    }

    public ObjectReader without(z0a z0aVar) {
        return _with(this._config.without(z0aVar));
    }

    public zsd readTree(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndCloseAsTree(_considerFilter(this._parserFactory.createParser(reader), false));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        return (T) forType(javaType).readValue(jsonParser);
    }

    public <T> b5f<T> readValues(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), false);
    }

    public ObjectReader with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.with(deserializationFeature, deserializationFeatureArr));
    }

    public Object _detectBindAndClose(ll5.b bVar, boolean z) throws IOException {
        if (!bVar.d()) {
            _reportUnkownFormat(this._dataFormatReaders, bVar);
        }
        JsonParser jsonParserA = bVar.a();
        if (z) {
            jsonParserA.n(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return bVar.c()._bindAndClose(jsonParserA);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public <T> T readValue(InputStream inputStream) throws IOException {
        ll5 ll5Var = this._dataFormatReaders;
        if (ll5Var != null) {
            return (T) _detectBindAndClose(ll5Var.b(inputStream), false);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(inputStream), false));
    }

    public ObjectReader with(JsonParser.Feature feature) {
        return _with(this._config.with(feature));
    }

    public ObjectReader forType(z4q<?> z4qVar) {
        this._config.getTypeFactory();
        throw null;
    }

    public <T> b5f<T> readValues(InputStream inputStream) throws IOException {
        ll5 ll5Var = this._dataFormatReaders;
        if (ll5Var != null) {
            return _detectBindAndReadValues(ll5Var.b(inputStream), false);
        }
        return _bindAndReadValues(_considerFilter(this._parserFactory.createParser(inputStream), true));
    }

    public ObjectReader with(z0a z0aVar) {
        return _with(this._config.with(z0aVar));
    }

    public zsd readTree(String str) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        return _bindAndCloseAsTree(_considerFilter(this._parserFactory.createParser(str), false));
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(reader), false));
    }

    public ObjectReader with(InjectableValues injectableValues) {
        return this._injectableValues == injectableValues ? this : _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, null, injectableValues, this._dataFormatReaders);
    }

    public <T> b5f<T> readValues(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(this._parserFactory.createParser(reader), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.G0();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public zsd readTree(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndCloseAsTree(_considerFilter(this._parserFactory.createParser(dataInput), false));
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public <T> T readValue(String str) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(str), false));
    }

    public ObjectReader with(JsonFactory jsonFactory) {
        if (jsonFactory == this._parserFactory) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, jsonFactory);
        if (jsonFactory.getCodec() == null) {
            jsonFactory.setCodec(objectReader_new);
        }
        return objectReader_new;
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, esd<Object> esdVar, Object obj, c1a c1aVar, InjectableValues injectableValues, ll5 ll5Var) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = esdVar;
        this._valueToUpdate = obj;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = ll5Var;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(byte[] bArr) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, 0, bArr.length);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(bArr), false));
    }

    public ObjectReader with(Locale locale) {
        return _with(this._config.with(locale));
    }

    public <T> b5f<T> readValues(String str) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(this._parserFactory.createParser(str), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.G0();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public ObjectReader with(TimeZone timeZone) {
        return _with(this._config.with(timeZone));
    }

    public <T> T readValue(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, i, i2);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(bArr, i, i2), false));
    }

    public ObjectReader with(Base64Variant base64Variant) {
        return _with(this._config.with(base64Variant));
    }

    public ObjectReader with(ContextAttributes contextAttributes) {
        return _with(this._config.with(contextAttributes));
    }

    public <T> T readValue(File file) throws IOException {
        ll5 ll5Var = this._dataFormatReaders;
        if (ll5Var != null) {
            return (T) _detectBindAndClose(ll5Var.b(_inputStream(file)), true);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(file), false));
    }

    public <T> T readValue(URL url) throws IOException {
        ll5 ll5Var = this._dataFormatReaders;
        if (ll5Var != null) {
            return (T) _detectBindAndClose(ll5Var.b(_inputStream(url)), true);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(url), false));
    }

    public <T> b5f<T> readValues(byte[] bArr, int i, int i2) throws IOException {
        ll5 ll5Var = this._dataFormatReaders;
        if (ll5Var != null) {
            return _detectBindAndReadValues(ll5Var.c(bArr, i, i2), false);
        }
        return _bindAndReadValues(_considerFilter(this._parserFactory.createParser(bArr, i, i2), true));
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(zsd zsdVar) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(zsdVar);
        }
        return (T) _bindAndClose(_considerFilter(treeAsTokens(zsdVar), false));
    }

    public final <T> b5f<T> readValues(byte[] bArr) throws IOException {
        return readValues(bArr, 0, bArr.length);
    }

    public <T> b5f<T> readValues(File file) throws IOException {
        ll5 ll5Var = this._dataFormatReaders;
        if (ll5Var != null) {
            return _detectBindAndReadValues(ll5Var.b(_inputStream(file)), false);
        }
        return _bindAndReadValues(_considerFilter(this._parserFactory.createParser(file), true));
    }

    public <T> T readValue(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(dataInput), false));
    }

    public <T> b5f<T> readValues(URL url) throws IOException {
        ll5 ll5Var = this._dataFormatReaders;
        if (ll5Var != null) {
            return _detectBindAndReadValues(ll5Var.b(_inputStream(url)), true);
        }
        return _bindAndReadValues(_considerFilter(this._parserFactory.createParser(url), true));
    }

    public <T> b5f<T> readValues(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndReadValues(_considerFilter(this._parserFactory.createParser(dataInput), true));
    }

    public ObjectReader(ObjectReader objectReader, JsonFactory jsonFactory) {
        this._config = objectReader._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = jsonFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public ObjectReader(ObjectReader objectReader, dip dipVar) {
        this._config = objectReader._config;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = dipVar;
    }
}
