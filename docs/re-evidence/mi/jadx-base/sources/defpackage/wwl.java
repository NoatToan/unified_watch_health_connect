package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wwl extends pp5 {
    protected static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final eud<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final eud<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected transient ContextAttributes _attributes;
    protected final SerializationConfig _config;
    protected DateFormat _dateFormat;
    protected eud<Object> _keySerializer;
    protected final bgj _knownSerializers;
    protected eud<Object> _nullKeySerializer;
    protected eud<Object> _nullValueSerializer;
    protected final Class<?> _serializationView;
    protected final uwl _serializerCache;
    protected final vwl _serializerFactory;
    protected final boolean _stdNullValueSerializer;
    protected eud<Object> _unknownTypeSerializer;

    public wwl() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new uwl();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    public eud<Object> _createAndCacheUntypedSerializer(Class<?> cls) throws JsonMappingException {
        eud<Object> eudVar_createUntypedSerializer;
        JavaType javaTypeConstructType = this._config.constructType(cls);
        try {
            eudVar_createUntypedSerializer = _createUntypedSerializer(javaTypeConstructType);
        } catch (IllegalArgumentException e) {
            reportMappingProblem(e, h04.n(e), new Object[0]);
            eudVar_createUntypedSerializer = null;
        }
        if (eudVar_createUntypedSerializer != null) {
            this._serializerCache.c(cls, javaTypeConstructType, eudVar_createUntypedSerializer, this);
        }
        return eudVar_createUntypedSerializer;
    }

    public eud<Object> _createUntypedSerializer(JavaType javaType) throws JsonMappingException {
        eud<Object> eudVarCreateSerializer;
        synchronized (this._serializerCache) {
            eudVarCreateSerializer = this._serializerFactory.createSerializer(this, javaType);
        }
        return eudVarCreateSerializer;
    }

    public final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public eud<Object> _findExplicitUntypedSerializer(Class<?> cls) throws JsonMappingException {
        eud<Object> eudVarF = this._knownSerializers.f(cls);
        if (eudVarF == null && (eudVarF = this._serializerCache.l(cls)) == null) {
            eudVarF = _createAndCacheUntypedSerializer(cls);
        }
        if (isUnknownTypeSerializer(eudVarF)) {
            return null;
        }
        return eudVarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eud<Object> _handleContextualResolvable(eud<?> eudVar, BeanProperty beanProperty) throws JsonMappingException {
        if (eudVar instanceof dqk) {
            ((dqk) eudVar).resolve(this);
        }
        return handleSecondaryContextualization(eudVar, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eud<Object> _handleResolvable(eud<?> eudVar) throws JsonMappingException {
        if (eudVar instanceof dqk) {
            ((dqk) eudVar).resolve(this);
        }
        return eudVar;
    }

    public void _reportIncompatibleRootType(Object obj, JavaType javaType) throws IOException {
        if (javaType.isPrimitive() && h04.k0(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            return;
        }
        reportBadDefinition(javaType, String.format("Incompatible types: declared root type (%s) vs %s", javaType, h04.g(obj)));
    }

    @Override // defpackage.pp5
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public void defaultSerializeDateKey(long j, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.r0(String.valueOf(j));
        } else {
            jsonGenerator.r0(_dateFormat().format(new Date(j)));
        }
    }

    public final void defaultSerializeDateValue(long j, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.w0(j);
        } else {
            jsonGenerator.Q0(_dateFormat().format(new Date(j)));
        }
    }

    public final void defaultSerializeField(String str, Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.r0(str);
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.s0();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) throws IOException {
        if (this._stdNullValueSerializer) {
            jsonGenerator.s0();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsonGenerator) throws IOException {
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.s0();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public eud<Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this._config, javaType, this._keySerializer), beanProperty);
    }

    public eud<Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return this._nullKeySerializer;
    }

    public eud<Object> findNullValueSerializer(BeanProperty beanProperty) throws JsonMappingException {
        return this._nullValueSerializer;
    }

    public abstract bpr findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public eud<Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarE = this._knownSerializers.e(javaType);
        return (eudVarE == null && (eudVarE = this._serializerCache.k(javaType)) == null && (eudVarE = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : handlePrimaryContextualization(eudVarE, beanProperty);
    }

    public e5q findTypeSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createTypeSerializer(this._config, javaType);
    }

    public eud<Object> findTypedValueSerializer(Class<?> cls, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarD = this._knownSerializers.d(cls);
        if (eudVarD != null) {
            return eudVarD;
        }
        eud<Object> eudVarJ = this._serializerCache.j(cls);
        if (eudVarJ != null) {
            return eudVarJ;
        }
        eud<Object> eudVarFindValueSerializer = findValueSerializer(cls, beanProperty);
        vwl vwlVar = this._serializerFactory;
        SerializationConfig serializationConfig = this._config;
        e5q e5qVarCreateTypeSerializer = vwlVar.createTypeSerializer(serializationConfig, serializationConfig.constructType(cls));
        if (e5qVarCreateTypeSerializer != null) {
            eudVarFindValueSerializer = new m5q(e5qVarCreateTypeSerializer.a(beanProperty), eudVarFindValueSerializer);
        }
        if (z) {
            this._serializerCache.e(cls, eudVarFindValueSerializer);
        }
        return eudVarFindValueSerializer;
    }

    public eud<Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        if (javaType == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        eud<Object> eudVarE = this._knownSerializers.e(javaType);
        return (eudVarE == null && (eudVarE = this._serializerCache.k(javaType)) == null && (eudVarE = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : handleSecondaryContextualization(eudVarE, beanProperty);
    }

    @Override // defpackage.pp5
    public final Class<?> getActiveView() {
        return this._serializationView;
    }

    @Override // defpackage.pp5
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    @Override // defpackage.pp5
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public eud<Object> getDefaultNullKeySerializer() {
        return this._nullKeySerializer;
    }

    public eud<Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    @Override // defpackage.pp5
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        return this._config.getDefaultPropertyInclusion();
    }

    public final tm9 getFilterProvider() {
        return this._config.getFilterProvider();
    }

    public JsonGenerator getGenerator() {
        return null;
    }

    @Override // defpackage.pp5
    public Locale getLocale() {
        return this._config.getLocale();
    }

    @Deprecated
    public final Class<?> getSerializationView() {
        return this._serializationView;
    }

    @Override // defpackage.pp5
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // defpackage.pp5
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public eud<Object> getUnknownTypeSerializer(Class<?> cls) {
        return cls == Object.class ? this._unknownTypeSerializer : new UnknownSerializer(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eud<?> handlePrimaryContextualization(eud<?> eudVar, BeanProperty beanProperty) throws JsonMappingException {
        return (eudVar == 0 || !(eudVar instanceof cj4)) ? eudVar : ((cj4) eudVar).createContextual(this, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eud<?> handleSecondaryContextualization(eud<?> eudVar, BeanProperty beanProperty) throws JsonMappingException {
        return (eudVar == 0 || !(eudVar instanceof cj4)) ? eudVar : ((cj4) eudVar).createContextual(this, beanProperty);
    }

    public final boolean hasSerializationFeatures(int i) {
        return this._config.hasSerializationFeatures(i);
    }

    public abstract Object includeFilterInstance(ih2 ih2Var, Class<?> cls) throws JsonMappingException;

    public abstract boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException;

    @Override // defpackage.pp5
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(null, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, javaType), str2), javaType, str);
    }

    @Override // defpackage.pp5
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public boolean isUnknownTypeSerializer(eud<?> eudVar) {
        if (eudVar == this._unknownTypeSerializer || eudVar == null) {
            return true;
        }
        return isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) && eudVar.getClass() == UnknownSerializer.class;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr));
    }

    @Override // defpackage.pp5
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType);
    }

    public <T> T reportBadPropertyDefinition(fh2 fh2Var, ih2 ih2Var, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid definition for property %s (of type %s): %s", ih2Var != null ? _quotedString(ih2Var.getName()) : "N/A", fh2Var != null ? h04.T(fh2Var.s()) : "N/A", _format(str, objArr)), fh2Var, ih2Var);
    }

    public <T> T reportBadTypeDefinition(fh2 fh2Var, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid type definition for type %s: %s", fh2Var != null ? h04.T(fh2Var.s()) : "N/A", _format(str, objArr)), fh2Var, (ih2) null);
    }

    public void reportMappingProblem(String str, Object... objArr) throws JsonMappingException {
        throw mappingException(str, objArr);
    }

    public abstract eud<Object> serializerInstance(fd1 fd1Var, Object obj) throws JsonMappingException;

    public void setDefaultKeySerializer(eud<Object> eudVar) {
        if (eudVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._keySerializer = eudVar;
    }

    public void setNullKeySerializer(eud<Object> eudVar) {
        if (eudVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullKeySerializer = eudVar;
    }

    public void setNullValueSerializer(eud<Object> eudVar) {
        if (eudVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullValueSerializer = eudVar;
    }

    @Override // defpackage.pp5
    public final SerializationConfig getConfig() {
        return this._config;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    @Deprecated
    public JsonMappingException mappingException(Throwable th, String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    public <T> T reportBadDefinition(JavaType javaType, String str, Throwable th) throws JsonMappingException {
        InvalidDefinitionException invalidDefinitionExceptionFrom = InvalidDefinitionException.from(getGenerator(), str, javaType);
        invalidDefinitionExceptionFrom.initCause(th);
        throw invalidDefinitionExceptionFrom;
    }

    public void reportMappingProblem(Throwable th, String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    @Override // defpackage.pp5
    public wwl setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public eud<Object> findKeySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.r0(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.r0(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.w0(date.getTime());
        } else {
            jsonGenerator.Q0(_dateFormat().format(date));
        }
    }

    public eud<Object> _createAndCacheUntypedSerializer(JavaType javaType) throws JsonMappingException {
        eud<Object> eudVar_createUntypedSerializer;
        try {
            eudVar_createUntypedSerializer = _createUntypedSerializer(javaType);
        } catch (IllegalArgumentException e) {
            reportMappingProblem(e, h04.n(e), new Object[0]);
            eudVar_createUntypedSerializer = null;
        }
        if (eudVar_createUntypedSerializer != null) {
            this._serializerCache.b(javaType, eudVar_createUntypedSerializer, this);
        }
        return eudVar_createUntypedSerializer;
    }

    public <T> T reportBadDefinition(Class<?> cls, String str, Throwable th) throws JsonMappingException {
        InvalidDefinitionException invalidDefinitionExceptionFrom = InvalidDefinitionException.from(getGenerator(), str, constructType(cls));
        invalidDefinitionExceptionFrom.initCause(th);
        throw invalidDefinitionExceptionFrom;
    }

    public eud<Object> findPrimaryPropertySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarF = this._knownSerializers.f(cls);
        if (eudVarF == null && (eudVarF = this._serializerCache.l(cls)) == null && (eudVarF = this._serializerCache.k(this._config.constructType(cls))) == null && (eudVarF = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handlePrimaryContextualization(eudVarF, beanProperty);
    }

    public eud<Object> findValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarF = this._knownSerializers.f(cls);
        if (eudVarF == null && (eudVarF = this._serializerCache.l(cls)) == null && (eudVarF = this._serializerCache.k(this._config.constructType(cls))) == null && (eudVarF = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(eudVarF, beanProperty);
    }

    public eud<Object> findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarC = this._knownSerializers.c(javaType);
        if (eudVarC != null) {
            return eudVarC;
        }
        eud<Object> eudVarI = this._serializerCache.i(javaType);
        if (eudVarI != null) {
            return eudVarI;
        }
        eud<Object> eudVarFindValueSerializer = findValueSerializer(javaType, beanProperty);
        e5q e5qVarCreateTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (e5qVarCreateTypeSerializer != null) {
            eudVarFindValueSerializer = new m5q(e5qVarCreateTypeSerializer.a(beanProperty), eudVarFindValueSerializer);
        }
        if (z) {
            this._serializerCache.d(javaType, eudVarFindValueSerializer);
        }
        return eudVarFindValueSerializer;
    }

    public wwl(wwl wwlVar, SerializationConfig serializationConfig, vwl vwlVar) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        eud<Object> eudVar = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = eudVar;
        this._serializerFactory = vwlVar;
        this._config = serializationConfig;
        uwl uwlVar = wwlVar._serializerCache;
        this._serializerCache = uwlVar;
        this._unknownTypeSerializer = wwlVar._unknownTypeSerializer;
        this._keySerializer = wwlVar._keySerializer;
        eud<Object> eudVar2 = wwlVar._nullValueSerializer;
        this._nullValueSerializer = eudVar2;
        this._nullKeySerializer = wwlVar._nullKeySerializer;
        this._stdNullValueSerializer = eudVar2 == eudVar;
        this._serializationView = serializationConfig.getActiveView();
        this._attributes = serializationConfig.getAttributes();
        this._knownSerializers = uwlVar.g();
    }

    public eud<Object> findValueSerializer(Class<?> cls) throws JsonMappingException {
        eud<Object> eudVarF = this._knownSerializers.f(cls);
        if (eudVarF != null) {
            return eudVarF;
        }
        eud<Object> eudVarL = this._serializerCache.l(cls);
        if (eudVarL != null) {
            return eudVarL;
        }
        eud<Object> eudVarK = this._serializerCache.k(this._config.constructType(cls));
        if (eudVarK != null) {
            return eudVarK;
        }
        eud<Object> eudVar_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(cls);
        return eudVar_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(cls) : eudVar_createAndCacheUntypedSerializer;
    }

    public eud<Object> findValueSerializer(JavaType javaType) throws JsonMappingException {
        eud<Object> eudVarE = this._knownSerializers.e(javaType);
        if (eudVarE != null) {
            return eudVarE;
        }
        eud<Object> eudVarK = this._serializerCache.k(javaType);
        if (eudVarK != null) {
            return eudVarK;
        }
        eud<Object> eudVar_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(javaType);
        return eudVar_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(javaType.getRawClass()) : eudVar_createAndCacheUntypedSerializer;
    }

    public wwl(wwl wwlVar) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializationView = null;
        this._serializerFactory = null;
        this._knownSerializers = null;
        this._serializerCache = new uwl();
        this._unknownTypeSerializer = wwlVar._unknownTypeSerializer;
        this._keySerializer = wwlVar._keySerializer;
        this._nullValueSerializer = wwlVar._nullValueSerializer;
        this._nullKeySerializer = wwlVar._nullKeySerializer;
        this._stdNullValueSerializer = wwlVar._stdNullValueSerializer;
    }
}
