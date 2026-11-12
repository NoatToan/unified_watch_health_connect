package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.aj4;
import defpackage.bj4;
import defpackage.esd;
import defpackage.fd1;
import defpackage.fh2;
import defpackage.h04;
import defpackage.ih2;
import defpackage.ij1;
import defpackage.nz5;
import defpackage.pp5;
import defpackage.q4q;
import defpackage.r4q;
import defpackage.sge;
import defpackage.u3h;
import defpackage.vzd;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DeserializationContext extends pp5 implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient ij1 _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected sge<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final com.fasterxml.jackson.databind.deser.a _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected transient u3h _objectBuffer;
    protected transient JsonParser _parser;
    protected final Class<?> _view;

    public DeserializationContext(com.fasterxml.jackson.databind.deser.a aVar) {
        this(aVar, (DeserializerCache) null);
    }

    public boolean _isCompatible(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        return cls.isPrimitive() && h04.k0(cls).isInstance(obj);
    }

    @Override // defpackage.pp5
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public abstract void checkUnresolvedObjectId() throws UnresolvedForwardReference;

    public Calendar constructCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public abstract esd<Object> deserializerInstance(fd1 fd1Var, Object obj) throws JsonMappingException;

    @Deprecated
    public JsonMappingException endOfInputException(Class<?> cls) {
        return MismatchedInputException.from(this._parser, cls, "Unexpected end-of-input when trying to deserialize a " + cls.getName());
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public final esd<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        esd<Object> esdVarFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return esdVarFindValueDeserializer != null ? handleSecondaryContextualization(esdVarFindValueDeserializer, beanProperty, javaType) : esdVarFindValueDeserializer;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        if (this._injectableValues == null) {
            reportBadDefinition(h04.h(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
        }
        return this._injectableValues.findInjectableValue(obj, this, beanProperty, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vzd findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        vzd vzdVarFindKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        return vzdVarFindKeyDeserializer instanceof bj4 ? ((bj4) vzdVarFindKeyDeserializer).createContextual(this, beanProperty) : vzdVarFindKeyDeserializer;
    }

    public final esd<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public abstract com.fasterxml.jackson.databind.deser.impl.a findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, com.fasterxml.jackson.annotation.a aVar);

    public final esd<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        esd<Object> esdVarFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (esdVarFindValueDeserializer == null) {
            return null;
        }
        esd<?> esdVarHandleSecondaryContextualization = handleSecondaryContextualization(esdVarFindValueDeserializer, null, javaType);
        q4q q4qVarFindTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return q4qVarFindTypeDeserializer != null ? new TypeWrappedDeserializer(q4qVarFindTypeDeserializer.forProperty(null), esdVarHandleSecondaryContextualization) : esdVarHandleSecondaryContextualization;
    }

    @Override // defpackage.pp5
    public final Class<?> getActiveView() {
        return this._view;
    }

    @Override // defpackage.pp5
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final ij1 getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new ij1();
        }
        return this._arrayBuilders;
    }

    @Override // defpackage.pp5
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    public JavaType getContextualType() {
        sge<JavaType> sgeVar = this._currentType;
        if (sgeVar == null) {
            return null;
        }
        return sgeVar.d();
    }

    public DateFormat getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    @Override // defpackage.pp5
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public com.fasterxml.jackson.databind.deser.a getFactory() {
        return this._factory;
    }

    @Override // defpackage.pp5
    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    @Override // defpackage.pp5
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // defpackage.pp5
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objA = problemHandlers.d().a(this, cls, obj, th);
            if (objA != nz5.f28583a) {
                if (_isCompatible(cls, objA)) {
                    return objA;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", cls, h04.g(objA)));
            }
        }
        h04.e0(th);
        throw instantiationException(cls, th);
    }

    public Object handleMissingInstantiator(Class<?> cls, com.fasterxml.jackson.databind.deser.b bVar, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            jsonParser = getParser();
        }
        String str_format = _format(str, objArr);
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objC = problemHandlers.d().c(this, cls, bVar, jsonParser, str_format);
            if (objC != nz5.f28583a) {
                if (_isCompatible(cls, objC)) {
                    return objC;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", cls, h04.g(objC)));
            }
        }
        if (bVar == null || bVar.canInstantiate()) {
            return reportInputMismatch(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", h04.T(cls), str_format), new Object[0]);
        }
        return reportBadDefinition(constructType(cls), String.format("Cannot construct instance of %s (no Creators, like default construct, exist): %s", h04.T(cls), str_format));
    }

    public JavaType handleMissingTypeId(JavaType javaType, r4q r4qVar, String str) throws IOException {
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            JavaType javaTypeD = problemHandlers.d().d(this, javaType, r4qVar, str);
            if (javaTypeD != null) {
                if (javaTypeD.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeD.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeD;
                }
                throw invalidTypeIdException(javaType, null, "problem handler tried to resolve into non-subtype: " + javaTypeD);
            }
        }
        throw missingTypeIdException(javaType, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public esd<?> handlePrimaryContextualization(esd<?> esdVar, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        boolean z = esdVar instanceof aj4;
        esd<?> esdVar2 = esdVar;
        if (z) {
            this._currentType = new sge<>(javaType, this._currentType);
            try {
                esd<?> esdVarCreateContextual = ((aj4) esdVar).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.c();
            }
        }
        return esdVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public esd<?> handleSecondaryContextualization(esd<?> esdVar, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        boolean z = esdVar instanceof aj4;
        esd<?> esdVar2 = esdVar;
        if (z) {
            this._currentType = new sge<>(javaType, this._currentType);
            try {
                esd<?> esdVarCreateContextual = ((aj4) esdVar).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.c();
            }
        }
        return esdVar2;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(cls, jsonParser.K(), jsonParser, null, new Object[0]);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, esd<?> esdVar, Object obj, String str) throws IOException {
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            if (problemHandlers.d().f(this, jsonParser, esdVar, obj, str)) {
                return true;
            }
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj, str, esdVar == null ? null : esdVar.getKnownPropertyNames());
        }
        jsonParser.O0();
        return true;
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, r4q r4qVar, String str2) throws IOException {
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            JavaType javaTypeG = problemHandlers.d().g(this, javaType, str, r4qVar, str2);
            if (javaTypeG != null) {
                if (javaTypeG.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeG.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeG;
                }
                throw invalidTypeIdException(javaType, str, "problem handler tried to resolve into non-subtype: " + javaTypeG);
            }
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw invalidTypeIdException(javaType, str, str2);
        }
        return null;
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objH = problemHandlers.d().h(this, cls, str, str_format);
            if (objH != nz5.f28583a) {
                if (objH == null || cls.isInstance(objH)) {
                    return objH;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", cls, objH.getClass()));
            }
        }
        throw weirdKeyException(cls, str, str_format);
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        Class<?> rawClass = javaType.getRawClass();
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objI = problemHandlers.d().i(this, javaType, obj, jsonParser);
            if (objI != nz5.f28583a) {
                if (objI == null || rawClass.isInstance(objI)) {
                    return objI;
                }
                throw JsonMappingException.from(jsonParser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", javaType, objI.getClass()));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objJ = problemHandlers.d().j(this, cls, number, str_format);
            if (objJ != nz5.f28583a) {
                if (_isCompatible(cls, objJ)) {
                    return objJ;
                }
                throw weirdNumberException(number, cls, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", cls, objJ.getClass()));
            }
        }
        throw weirdNumberException(number, cls, str_format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objK = problemHandlers.d().k(this, cls, str, str_format);
            if (objK != nz5.f28583a) {
                if (_isCompatible(cls, objK)) {
                    return objK;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", cls, objK.getClass()));
            }
        }
        throw weirdStringException(str, cls, str_format);
    }

    public final boolean hasDeserializationFeatures(int i) {
        return (this._featureFlags & i) == i;
    }

    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._featureFlags) != 0;
    }

    public boolean hasValueDeserializerFor(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        try {
            return this._cache.hasValueDeserializerFor(this, this._factory, javaType);
        } catch (JsonMappingException e) {
            if (atomicReference == null) {
                return false;
            }
            atomicReference.set(e);
            return false;
        } catch (RuntimeException e2) {
            if (atomicReference == null) {
                throw e2;
            }
            atomicReference.set(e2);
            return false;
        }
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        String strN;
        JavaType javaTypeConstructType = constructType(cls);
        if (th == null) {
            strN = "N/A";
        } else {
            strN = h04.n(th);
            if (strN == null) {
                strN = h04.T(th.getClass());
            }
        }
        InvalidDefinitionException invalidDefinitionExceptionFrom = InvalidDefinitionException.from(this._parser, String.format("Cannot construct instance of %s, problem: %s", h04.T(cls), strN), javaTypeConstructType);
        invalidDefinitionExceptionFrom.initCause(th);
        return invalidDefinitionExceptionFrom;
    }

    @Override // defpackage.pp5
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, javaType), str2), javaType, str);
    }

    @Override // defpackage.pp5
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract vzd keyDeserializerInstance(fd1 fd1Var, Object obj) throws JsonMappingException;

    public final u3h leaseObjectBuffer() {
        u3h u3hVar = this._objectBuffer;
        if (u3hVar == null) {
            return new u3h();
        }
        this._objectBuffer = null;
        return u3hVar;
    }

    @Deprecated
    public JsonMappingException mappingException(String str) {
        return JsonMappingException.from(getParser(), str);
    }

    public JsonMappingException missingTypeIdException(JavaType javaType, String str) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Missing type id when trying to resolve subtype of %s", javaType), str), javaType, null);
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return getDateFormat().parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, h04.n(e)));
        }
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, Class<T> cls) throws IOException {
        return (T) readPropertyValue(jsonParser, beanProperty, getTypeFactory().constructType(cls));
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return (T) readValue(jsonParser, getTypeFactory().constructType(cls));
    }

    @Override // defpackage.pp5
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    public <T> T reportBadMerge(esd<?> esdVar) throws JsonMappingException {
        if (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return null;
        }
        JavaType javaTypeConstructType = constructType(esdVar.handledType());
        throw InvalidDefinitionException.from(getParser(), String.format("Invalid configuration: values of type %s cannot be merged", javaTypeConstructType), javaTypeConstructType);
    }

    public <T> T reportBadPropertyDefinition(fh2 fh2Var, ih2 ih2Var, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid definition for property %s (of type %s): %s", h04.S(ih2Var), h04.T(fh2Var.s()), _format(str, objArr)), fh2Var, ih2Var);
    }

    public <T> T reportBadTypeDefinition(fh2 fh2Var, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid type definition for type %s: %s", h04.T(fh2Var.s()), _format(str, objArr)), fh2Var, (ih2) null);
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), beanProperty == null ? null : beanProperty.getType(), _format(str, objArr));
    }

    @Deprecated
    public void reportMappingException(String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public void reportMissingContent(String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), (JavaType) null, "No content to map due to end-of-input");
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws JsonMappingException {
        throw MismatchedInputException.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", jsonToken, h04.T(cls)));
    }

    @Deprecated
    public void reportUnknownProperty(Object obj, String str, esd<?> esdVar) throws JsonMappingException {
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj, str, esdVar == null ? null : esdVar.getKnownPropertyNames());
        }
    }

    public <T> T reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        return (T) reportInputMismatch(objectIdReader.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", h04.g(obj), objectIdReader.propertyName), new Object[0]);
    }

    public void reportWrongTokenException(esd<?> esdVar, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), esdVar.handledType(), jsonToken, _format(str, objArr));
    }

    public final void returnObjectBuffer(u3h u3hVar) {
        if (this._objectBuffer == null || u3hVar.h() >= this._objectBuffer.h()) {
            this._objectBuffer = u3hVar;
        }
    }

    @Deprecated
    public JsonMappingException unknownTypeException(JavaType javaType, String str, String str2) {
        return MismatchedInputException.from(this._parser, javaType, _colonConcat(String.format("Could not resolve type id '%s' into a subtype of %s", str, javaType), str2));
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", h04.T(cls), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException weirdNativeValueException(Object obj, Class<?> cls) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", h04.T(cls), h04.g(obj)), obj, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", h04.T(cls), String.valueOf(number), str), number, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", h04.T(cls), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.K(), jsonToken), str));
    }

    public DeserializationContext(com.fasterxml.jackson.databind.deser.a aVar, DeserializerCache deserializerCache) {
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null DeserializerFactory");
        }
        this._factory = aVar;
        this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this._featureFlags = 0;
        this._config = null;
        this._injectableValues = null;
        this._view = null;
        this._attributes = null;
    }

    @Override // defpackage.pp5
    public DeserializationConfig getConfig() {
        return this._config;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (sge<nz5> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objE = problemHandlers.d().e(this, cls, jsonToken, jsonParser, str_format);
            if (objE != nz5.f28583a) {
                if (_isCompatible(cls, objE)) {
                    return objE;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", h04.T(cls), h04.g(objE)));
            }
        }
        if (str_format == null) {
            str_format = jsonToken == null ? String.format("Unexpected end-of-input when binding data into %s", h04.T(cls)) : String.format("Cannot deserialize instance of %s out of %s token", h04.T(cls), jsonToken);
        }
        reportInputMismatch(cls, str_format, new Object[0]);
        return null;
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getParser(), _format(str, objArr));
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, JavaType javaType) throws IOException {
        esd<Object> esdVarFindContextualValueDeserializer = findContextualValueDeserializer(javaType, beanProperty);
        return esdVarFindContextualValueDeserializer == null ? (T) reportBadDefinition(javaType, String.format("Could not find JsonDeserializer for type %s (via property %s)", javaType, h04.S(beanProperty))) : (T) esdVarFindContextualValueDeserializer.deserialize(jsonParser, this);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        esd<Object> esdVarFindRootValueDeserializer = findRootValueDeserializer(javaType);
        if (esdVarFindRootValueDeserializer == null) {
            reportBadDefinition(javaType, "Could not find JsonDeserializer for type " + javaType);
        }
        return (T) esdVarFindRootValueDeserializer.deserialize(jsonParser, this);
    }

    @Override // defpackage.pp5
    public DeserializationContext setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls) {
        return mappingException(cls, this._parser.K());
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls, JsonToken jsonToken) {
        return JsonMappingException.from(this._parser, String.format("Cannot deserialize instance of %s out of %s token", h04.T(cls), jsonToken));
    }

    public <T> T reportInputMismatch(esd<?> esdVar, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), esdVar.handledType(), _format(str, objArr));
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.K(), jsonToken), str));
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), cls, _format(str, objArr));
    }

    @Deprecated
    public void reportWrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(jsonParser, jsonToken, _format(str, objArr));
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), javaType, _format(str, objArr));
    }

    public JsonMappingException instantiationException(Class<?> cls, String str) {
        JavaType javaTypeConstructType = constructType(cls);
        return InvalidDefinitionException.from(this._parser, String.format("Cannot construct instance of %s: %s", h04.T(cls), str), javaTypeConstructType);
    }

    @Deprecated
    public JsonMappingException wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        return wrongTokenException(jsonParser, (JavaType) null, jsonToken, str);
    }

    public DeserializationContext(DeserializationContext deserializationContext, com.fasterxml.jackson.databind.deser.a aVar) {
        this._cache = deserializationContext._cache;
        this._factory = aVar;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._injectableValues = deserializationContext._injectableValues;
        this._attributes = deserializationContext._attributes;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._injectableValues = injectableValues;
        this._attributes = deserializationConfig.getAttributes();
    }

    public DeserializationContext(DeserializationContext deserializationContext) {
        this._cache = new DeserializerCache();
        this._factory = deserializationContext._factory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._view = deserializationContext._view;
        this._injectableValues = null;
    }
}
