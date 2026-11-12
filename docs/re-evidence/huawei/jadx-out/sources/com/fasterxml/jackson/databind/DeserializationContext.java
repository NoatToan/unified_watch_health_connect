package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.Named;
import defpackage.aah;
import defpackage.aaj;
import defpackage.abs;
import defpackage.abv;
import defpackage.abw;
import defpackage.abx;
import defpackage.aby;
import defpackage.aca;
import defpackage.aes;
import defpackage.ahp;
import defpackage.aht;
import defpackage.ahw;
import defpackage.aib;
import defpackage.aic;
import defpackage.yb;
import defpackage.yi;
import defpackage.ym;
import defpackage.zl;
import defpackage.zm;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DeserializationContext extends DatabindContext implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient aht _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final zl _cache;
    protected final yi _config;
    protected aic<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final DeserializerFactory _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected transient aib _objectBuffer;
    protected transient JsonParser _parser;
    protected final yb<StreamReadCapability> _readCapabilities;
    protected final Class<?> _view;

    public abstract void checkUnresolvedObjectId() throws zm;

    public abstract JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object obj) throws ym;

    public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver);

    public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj) throws ym;

    protected DeserializationContext(DeserializerFactory deserializerFactory) {
        this(deserializerFactory, (zl) null);
    }

    public DeserializationContext(DeserializerFactory deserializerFactory, zl zlVar) {
        if (deserializerFactory == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this._factory = deserializerFactory;
        this._cache = zlVar == null ? new zl() : zlVar;
        this._featureFlags = 0;
        this._readCapabilities = null;
        this._config = null;
        this._injectableValues = null;
        this._view = null;
        this._attributes = null;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory) {
        this._cache = deserializationContext._cache;
        this._factory = deserializerFactory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._injectableValues = deserializationContext._injectableValues;
        this._attributes = deserializationContext._attributes;
    }

    public DeserializationContext(DeserializationContext deserializationContext, yi yiVar, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = jsonParser == null ? null : jsonParser.getReadCapabilities();
        this._config = yiVar;
        this._featureFlags = yiVar.a();
        this._view = yiVar.getActiveView();
        this._parser = jsonParser;
        this._injectableValues = injectableValues;
        this._attributes = yiVar.getAttributes();
    }

    public DeserializationContext(DeserializationContext deserializationContext, yi yiVar) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = null;
        this._config = yiVar;
        this._featureFlags = yiVar.a();
        this._view = null;
        this._parser = null;
        this._injectableValues = null;
        this._attributes = null;
    }

    public DeserializationContext(DeserializationContext deserializationContext) {
        this._cache = new zl();
        this._factory = deserializationContext._factory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
        this._injectableValues = null;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public yi getConfig() {
        return this._config;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final Class<?> getActiveView() {
        return this._view;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final JsonFormat.c getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final ahp getTypeFactory() {
        return this._config.getTypeFactory();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return javaType.hasRawClass(cls) ? javaType : getConfig().getTypeFactory().b(javaType, cls, false);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public Locale getLocale() {
        return this._config.getLocale();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public DeserializationContext setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public JavaType getContextualType() {
        aic<JavaType> aicVar = this._currentType;
        if (aicVar == null) {
            return null;
        }
        return aicVar.c();
    }

    public DeserializerFactory getFactory() {
        return this._factory;
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    public final boolean isEnabled(StreamReadCapability streamReadCapability) {
        return this._readCapabilities.a(streamReadCapability);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public final boolean hasDeserializationFeatures(int i) {
        return (this._featureFlags & i) == i;
    }

    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._featureFlags) != 0;
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws ym {
        if (this._injectableValues == null) {
            reportBadDefinition(ahw.d(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
        }
        return this._injectableValues.findInjectableValue(obj, this, beanProperty, obj2);
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    public final aes getNodeFactory() {
        return this._config.c();
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._config.b(logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._config.e(logicalType, cls, coercionAction);
    }

    public boolean hasValueDeserializerFor(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        try {
            return this._cache.h(this, this._factory, javaType);
        } catch (RuntimeException e) {
            if (atomicReference == null) {
                throw e;
            }
            atomicReference.set(e);
            return false;
        } catch (ym e2) {
            if (atomicReference == null) {
                return false;
            }
            atomicReference.set(e2);
            return false;
        }
    }

    public final JsonDeserializer<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws ym {
        JsonDeserializer<Object> jsonDeserializerB = this._cache.b(this, this._factory, javaType);
        return jsonDeserializerB != null ? handleSecondaryContextualization(jsonDeserializerB, beanProperty, javaType) : jsonDeserializerB;
    }

    public final JsonDeserializer<Object> findNonContextualValueDeserializer(JavaType javaType) throws ym {
        return this._cache.b(this, this._factory, javaType);
    }

    public final JsonDeserializer<Object> findRootValueDeserializer(JavaType javaType) throws ym {
        JsonDeserializer<Object> jsonDeserializerB = this._cache.b(this, this._factory, javaType);
        if (jsonDeserializerB == null) {
            return null;
        }
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization = handleSecondaryContextualization(jsonDeserializerB, null, javaType);
        TypeDeserializer typeDeserializerFindTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return typeDeserializerFindTypeDeserializer != null ? new aaj(typeDeserializerFindTypeDeserializer.forProperty(null), jsonDeserializerHandleSecondaryContextualization) : jsonDeserializerHandleSecondaryContextualization;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KeyDeserializer findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws ym {
        KeyDeserializer keyDeserializerD = this._cache.d(this, this._factory, javaType);
        return keyDeserializerD instanceof ContextualKeyDeserializer ? ((ContextualKeyDeserializer) keyDeserializerD).createContextual(this, beanProperty) : keyDeserializerD;
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().e(str);
    }

    public final aib leaseObjectBuffer() {
        aib aibVar = this._objectBuffer;
        if (aibVar == null) {
            return new aib();
        }
        this._objectBuffer = null;
        return aibVar;
    }

    public final void returnObjectBuffer(aib aibVar) {
        if (this._objectBuffer == null || aibVar.a() >= this._objectBuffer.a()) {
            this._objectBuffer = aibVar;
        }
    }

    public final aht getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new aht();
        }
        return this._arrayBuilders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonDeserializer<?> handlePrimaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws ym {
        if (!(jsonDeserializer instanceof ContextualDeserializer)) {
            return jsonDeserializer;
        }
        this._currentType = new aic<>(javaType, this._currentType);
        try {
            return ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
        } finally {
            this._currentType = this._currentType.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws ym {
        if (!(jsonDeserializer instanceof ContextualDeserializer)) {
            return jsonDeserializer;
        }
        this._currentType = new aic<>(javaType, this._currentType);
        try {
            return ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
        } finally {
            this._currentType = this._currentType.e();
        }
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return _getDateFormat().parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, ahw.a((Throwable) e)));
        }
    }

    public Calendar constructCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    public String extractScalarFromObject(JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Class<?> cls) throws IOException {
        return (String) handleUnexpectedToken(cls, jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return (T) readValue(jsonParser, getTypeFactory().b(cls));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            reportBadDefinition(javaType, "Could not find JsonDeserializer for type " + ahw.a(javaType));
        }
        return (T) jsonDeserializerFindRootValueDeserializer.deserialize(jsonParser, this);
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, Class<T> cls) throws IOException {
        return (T) readPropertyValue(jsonParser, beanProperty, getTypeFactory().b(cls));
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, JavaType javaType) throws IOException {
        JsonDeserializer<Object> jsonDeserializerFindContextualValueDeserializer = findContextualValueDeserializer(javaType, beanProperty);
        if (jsonDeserializerFindContextualValueDeserializer == null) {
            return (T) reportBadDefinition(javaType, String.format("Could not find JsonDeserializer for type %s (via property %s)", ahw.a(javaType), ahw.e((Named) beanProperty)));
        }
        return (T) jsonDeserializerFindContextualValueDeserializer.deserialize(jsonParser, this);
    }

    public JsonNode readTree(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null && (jsonTokenCurrentToken = jsonParser.nextToken()) == null) {
            return getNodeFactory().a();
        }
        if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
            return getNodeFactory().nullNode();
        }
        return (JsonNode) findRootValueDeserializer(this._config.constructType(JsonNode.class)).deserialize(jsonParser, this);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Object obj, String str) throws IOException {
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            if (aicVarD.c().handleUnknownProperty(this, jsonParser, jsonDeserializer, obj, str)) {
                return true;
            }
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.skipChildren();
            return true;
        }
        throw abx.b(this._parser, obj, str, jsonDeserializer == null ? null : jsonDeserializer.getKnownPropertyNames());
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            Object objHandleWeirdKey = aicVarD.c().handleWeirdKey(this, cls, str, str_format);
            if (objHandleWeirdKey != DeserializationProblemHandler.NOT_HANDLED) {
                if (objHandleWeirdKey == null || cls.isInstance(objHandleWeirdKey)) {
                    return objHandleWeirdKey;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", ahw.a((Object) cls), ahw.a(objHandleWeirdKey)));
            }
        }
        throw weirdKeyException(cls, str, str_format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            Object objHandleWeirdStringValue = aicVarD.c().handleWeirdStringValue(this, cls, str, str_format);
            if (objHandleWeirdStringValue != DeserializationProblemHandler.NOT_HANDLED) {
                if (_isCompatible(cls, objHandleWeirdStringValue)) {
                    return objHandleWeirdStringValue;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", ahw.a((Object) cls), ahw.a(objHandleWeirdStringValue)));
            }
        }
        throw weirdStringException(str, cls, str_format);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            Object objHandleWeirdNumberValue = aicVarD.c().handleWeirdNumberValue(this, cls, number, str_format);
            if (objHandleWeirdNumberValue != DeserializationProblemHandler.NOT_HANDLED) {
                if (_isCompatible(cls, objHandleWeirdNumberValue)) {
                    return objHandleWeirdNumberValue;
                }
                throw weirdNumberException(number, cls, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", ahw.a((Object) cls), ahw.a(objHandleWeirdNumberValue)));
            }
        }
        throw weirdNumberException(number, cls, str_format);
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        Class<?> rawClass = javaType.getRawClass();
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            Object objHandleWeirdNativeValue = aicVarD.c().handleWeirdNativeValue(this, javaType, obj, jsonParser);
            if (objHandleWeirdNativeValue != DeserializationProblemHandler.NOT_HANDLED) {
                if (objHandleWeirdNativeValue == null || rawClass.isInstance(objHandleWeirdNativeValue)) {
                    return objHandleWeirdNativeValue;
                }
                throw ym.from(jsonParser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", ahw.a((Object) javaType), ahw.a(objHandleWeirdNativeValue)));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            jsonParser = getParser();
        }
        String str_format = _format(str, objArr);
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            Object objHandleMissingInstantiator = aicVarD.c().handleMissingInstantiator(this, cls, valueInstantiator, jsonParser, str_format);
            if (objHandleMissingInstantiator != DeserializationProblemHandler.NOT_HANDLED) {
                if (_isCompatible(cls, objHandleMissingInstantiator)) {
                    return objHandleMissingInstantiator;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", ahw.a((Object) cls), ahw.a(objHandleMissingInstantiator)));
            }
        }
        if (valueInstantiator == null) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s: %s", ahw.u(cls), str_format));
        }
        if (!valueInstantiator.canInstantiate()) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", ahw.u(cls), str_format));
        }
        return reportInputMismatch(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", ahw.u(cls), str_format), new Object[0]);
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            Object objHandleInstantiationProblem = aicVarD.c().handleInstantiationProblem(this, cls, obj, th);
            if (objHandleInstantiationProblem != DeserializationProblemHandler.NOT_HANDLED) {
                if (_isCompatible(cls, objHandleInstantiationProblem)) {
                    return objHandleInstantiationProblem;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", ahw.a((Object) cls), ahw.b(objHandleInstantiationProblem)));
            }
        }
        ahw.c(th);
        if (!isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ahw.i(th);
        }
        throw instantiationException(cls, th);
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonParser.currentToken(), jsonParser, (String) null, new Object[0]);
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonToken, jsonParser, str, objArr);
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(javaType, jsonParser.currentToken(), jsonParser, (String) null, new Object[0]);
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            Object objHandleUnexpectedToken = aicVarD.c().handleUnexpectedToken(this, javaType, jsonToken, jsonParser, str_format);
            if (objHandleUnexpectedToken != DeserializationProblemHandler.NOT_HANDLED) {
                if (_isCompatible(javaType.getRawClass(), objHandleUnexpectedToken)) {
                    return objHandleUnexpectedToken;
                }
                reportBadDefinition(javaType, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", ahw.a(javaType), ahw.b(objHandleUnexpectedToken)));
            }
        }
        if (str_format == null) {
            String strA = ahw.a(javaType);
            if (jsonToken == null) {
                str_format = String.format("Unexpected end-of-input when trying read value of type %s", strA);
            } else {
                str_format = String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", strA, _shapeForToken(jsonToken), jsonToken);
            }
        }
        if (jsonToken != null && jsonToken.isScalarValue()) {
            jsonParser.getText();
        }
        reportInputMismatch(javaType, str_format, new Object[0]);
        return null;
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, TypeIdResolver typeIdResolver, String str2) throws IOException {
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            JavaType javaTypeHandleUnknownTypeId = aicVarD.c().handleUnknownTypeId(this, javaType, str, typeIdResolver, str2);
            if (javaTypeHandleUnknownTypeId != null) {
                if (javaTypeHandleUnknownTypeId.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeHandleUnknownTypeId.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeHandleUnknownTypeId;
                }
                throw invalidTypeIdException(javaType, str, "problem handler tried to resolve into non-subtype: " + ahw.a(javaTypeHandleUnknownTypeId));
            }
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw invalidTypeIdException(javaType, str, str2);
        }
        return null;
    }

    public JavaType handleMissingTypeId(JavaType javaType, TypeIdResolver typeIdResolver, String str) throws IOException {
        for (aic<DeserializationProblemHandler> aicVarD = this._config.d(); aicVarD != null; aicVarD = aicVarD.e()) {
            JavaType javaTypeHandleMissingTypeId = aicVarD.c().handleMissingTypeId(this, javaType, typeIdResolver, str);
            if (javaTypeHandleMissingTypeId != null) {
                if (javaTypeHandleMissingTypeId.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeHandleMissingTypeId.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeHandleMissingTypeId;
                }
                throw invalidTypeIdException(javaType, null, "problem handler tried to resolve into non-subtype: " + ahw.a(javaTypeHandleMissingTypeId));
            }
        }
        throw missingTypeIdException(javaType, str);
    }

    public void handleBadMerge(JsonDeserializer<?> jsonDeserializer) throws ym {
        if (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        JavaType javaTypeConstructType = constructType(jsonDeserializer.handledType());
        throw abv.d(getParser(), String.format("Invalid configuration: values of type %s cannot be merged", ahw.a(javaTypeConstructType)), javaTypeConstructType);
    }

    protected boolean _isCompatible(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        return cls.isPrimitive() && ahw.w(cls).isInstance(obj);
    }

    public void reportWrongTokenException(JsonDeserializer<?> jsonDeserializer, JsonToken jsonToken, String str, Object... objArr) throws ym {
        throw wrongTokenException(getParser(), jsonDeserializer.handledType(), jsonToken, _format(str, objArr));
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws ym {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws ym {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public <T> T reportUnresolvedObjectId(aah aahVar, Object obj) throws ym {
        return (T) reportInputMismatch(aahVar.f173b, String.format("No Object Id found for an instance of %s, to assign to property '%s'", ahw.b(obj), aahVar.f172a), new Object[0]);
    }

    public <T> T reportInputMismatch(JsonDeserializer<?> jsonDeserializer, String str, Object... objArr) throws ym {
        throw aca.from(getParser(), jsonDeserializer.handledType(), _format(str, objArr));
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws ym {
        throw aca.from(getParser(), cls, _format(str, objArr));
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws ym {
        throw aca.from(getParser(), javaType, _format(str, objArr));
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws ym {
        AnnotatedMember member;
        aca acaVarFrom = aca.from(getParser(), beanProperty == null ? null : beanProperty.getType(), _format(str, objArr));
        if (beanProperty != null && (member = beanProperty.getMember()) != null) {
            acaVarFrom.prependPath(member.getDeclaringClass(), beanProperty.getName());
            throw acaVarFrom;
        }
        throw acaVarFrom;
    }

    public <T> T reportPropertyInputMismatch(Class<?> cls, String str, String str2, Object... objArr) throws ym {
        aca acaVarFrom = aca.from(getParser(), cls, _format(str2, objArr));
        if (str != null) {
            acaVarFrom.prependPath(cls, str);
            throw acaVarFrom;
        }
        throw acaVarFrom;
    }

    public <T> T reportPropertyInputMismatch(JavaType javaType, String str, String str2, Object... objArr) throws ym {
        return (T) reportPropertyInputMismatch(javaType.getRawClass(), str, str2, objArr);
    }

    public <T> T reportBadCoercion(JsonDeserializer<?> jsonDeserializer, Class<?> cls, Object obj, String str, Object... objArr) throws ym {
        throw abs.b(getParser(), _format(str, objArr), obj, cls);
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws ym {
        throw aca.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", jsonToken, ahw.u(cls)));
    }

    @Deprecated
    public void reportWrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str, Object... objArr) throws ym {
        throw wrongTokenException(jsonParser, jsonToken, _format(str, objArr));
    }

    @Deprecated
    public void reportUnknownProperty(Object obj, String str, JsonDeserializer<?> jsonDeserializer) throws ym {
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw abx.b(this._parser, obj, str, jsonDeserializer == null ? null : jsonDeserializer.getKnownPropertyNames());
        }
    }

    @Deprecated
    public void reportMissingContent(String str, Object... objArr) throws ym {
        throw aca.from(getParser(), (JavaType) null, "No content to map due to end-of-input");
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) throws ym {
        throw abv.d(this._parser, String.format("Invalid type definition for type %s: %s", ahw.u(beanDescription.getBeanClass()), _format(str, objArr)), beanDescription, null);
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws ym {
        throw abv.d(this._parser, String.format("Invalid definition for property %s (of type %s): %s", ahw.e((Named) beanPropertyDefinition), ahw.u(beanDescription.getBeanClass()), _format(str, objArr)), beanDescription, beanPropertyDefinition);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public <T> T reportBadDefinition(JavaType javaType, String str) throws ym {
        throw abv.d(this._parser, str, javaType);
    }

    @Deprecated
    public <T> T reportBadMerge(JsonDeserializer<?> jsonDeserializer) throws ym {
        handleBadMerge(jsonDeserializer);
        return null;
    }

    public ym wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return aca.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.currentToken(), jsonToken), str));
    }

    public ym wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return aca.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.currentToken(), jsonToken), str));
    }

    @Deprecated
    public ym wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        return wrongTokenException(jsonParser, (JavaType) null, jsonToken, str);
    }

    public ym weirdKeyException(Class<?> cls, String str, String str2) {
        return abs.b(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", ahw.u(cls), _quotedString(str), str2), str, cls);
    }

    public ym weirdStringException(String str, Class<?> cls, String str2) {
        return abs.b(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", ahw.u(cls), _quotedString(str), str2), str, cls);
    }

    public ym weirdNumberException(Number number, Class<?> cls, String str) {
        return abs.b(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", ahw.u(cls), String.valueOf(number), str), number, cls);
    }

    public ym weirdNativeValueException(Object obj, Class<?> cls) {
        return abs.b(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", ahw.u(cls), ahw.b(obj)), obj, cls);
    }

    public ym instantiationException(Class<?> cls, Throwable th) {
        String strA;
        if (th == null) {
            strA = "N/A";
        } else {
            strA = ahw.a(th);
            if (strA == null) {
                strA = ahw.u(th.getClass());
            }
        }
        return aby.c(this._parser, String.format("Cannot construct instance of %s, problem: %s", ahw.u(cls), strA), constructType(cls), th);
    }

    public ym instantiationException(Class<?> cls, String str) {
        return aby.e(this._parser, String.format("Cannot construct instance of %s: %s", ahw.u(cls), str), constructType(cls));
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public ym invalidTypeIdException(JavaType javaType, String str, String str2) {
        return abw.d(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, ahw.a(javaType)), str2), javaType, str);
    }

    public ym missingTypeIdException(JavaType javaType, String str) {
        return abw.d(this._parser, _colonConcat(String.format("Could not resolve subtype of %s", javaType), str), javaType, null);
    }

    @Deprecated
    public ym unknownTypeException(JavaType javaType, String str, String str2) {
        return aca.from(this._parser, javaType, _colonConcat(String.format("Could not resolve type id '%s' into a subtype of %s", str, ahw.a(javaType)), str2));
    }

    @Deprecated
    public ym endOfInputException(Class<?> cls) {
        return aca.from(this._parser, cls, "Unexpected end-of-input when trying to deserialize a " + cls.getName());
    }

    @Deprecated
    public void reportMappingException(String str, Object... objArr) throws ym {
        throw ym.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public ym mappingException(String str) {
        return ym.from(getParser(), str);
    }

    @Deprecated
    public ym mappingException(String str, Object... objArr) {
        return ym.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public ym mappingException(Class<?> cls) {
        return mappingException(cls, this._parser.currentToken());
    }

    @Deprecated
    public ym mappingException(Class<?> cls, JsonToken jsonToken) {
        return ym.from(this._parser, String.format("Cannot deserialize instance of %s out of %s token", ahw.u(cls), jsonToken));
    }

    @Deprecated
    protected DateFormat getDateFormat() {
        return _getDateFormat();
    }

    protected DateFormat _getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.DeserializationContext$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonToken.values().length];
            e = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[JsonToken.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[JsonToken.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[JsonToken.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[JsonToken.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                e[JsonToken.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                e[JsonToken.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                e[JsonToken.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                e[JsonToken.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    protected String _shapeForToken(JsonToken jsonToken) {
        if (jsonToken != null) {
            switch (AnonymousClass5.e[jsonToken.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return "Object value";
                case 4:
                case 5:
                    return "Array value";
                case 6:
                case 7:
                    return "Boolean value";
                case 8:
                    return "Embedded Object";
                case 9:
                    return "Floating-point value";
                case 10:
                    return "Integer value";
                case 11:
                    return "String value";
                case 12:
                    return "Null value";
                default:
                    return "[Unavailable value]";
            }
        }
        return "<end of input>";
    }
}
