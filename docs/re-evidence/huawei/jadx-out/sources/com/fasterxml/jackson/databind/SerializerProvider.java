package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import defpackage.abv;
import defpackage.abw;
import defpackage.aff;
import defpackage.afh;
import defpackage.afp;
import defpackage.afs;
import defpackage.afu;
import defpackage.afy;
import defpackage.ago;
import defpackage.ahp;
import defpackage.ahw;
import defpackage.ym;
import defpackage.yt;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SerializerProvider extends DatabindContext {
    protected static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final JsonSerializer<Object> DEFAULT_NULL_KEY_SERIALIZER = new aff("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final JsonSerializer<Object> DEFAULT_UNKNOWN_SERIALIZER = new afu();
    protected transient ContextAttributes _attributes;
    protected final yt _config;
    protected DateFormat _dateFormat;
    protected JsonSerializer<Object> _keySerializer;
    protected final afp _knownSerializers;
    protected JsonSerializer<Object> _nullKeySerializer;
    protected JsonSerializer<Object> _nullValueSerializer;
    protected final Class<?> _serializationView;
    protected final afh _serializerCache;
    protected final SerializerFactory _serializerFactory;
    protected final boolean _stdNullValueSerializer;
    protected JsonSerializer<Object> _unknownTypeSerializer;

    public abstract afy findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public JsonGenerator getGenerator() {
        return null;
    }

    public abstract Object includeFilterInstance(BeanPropertyDefinition beanPropertyDefinition, Class<?> cls) throws ym;

    public abstract boolean includeFilterSuppressNulls(Object obj) throws ym;

    public abstract JsonSerializer<Object> serializerInstance(Annotated annotated, Object obj) throws ym;

    public SerializerProvider() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = ago.f387a;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new afh();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    public SerializerProvider(SerializerProvider serializerProvider, yt ytVar, SerializerFactory serializerFactory) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = ago.f387a;
        JsonSerializer<Object> jsonSerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = jsonSerializer;
        this._serializerFactory = serializerFactory;
        this._config = ytVar;
        afh afhVar = serializerProvider._serializerCache;
        this._serializerCache = afhVar;
        this._unknownTypeSerializer = serializerProvider._unknownTypeSerializer;
        this._keySerializer = serializerProvider._keySerializer;
        JsonSerializer<Object> jsonSerializer2 = serializerProvider._nullValueSerializer;
        this._nullValueSerializer = jsonSerializer2;
        this._nullKeySerializer = serializerProvider._nullKeySerializer;
        this._stdNullValueSerializer = jsonSerializer2 == jsonSerializer;
        this._serializationView = ytVar.getActiveView();
        this._attributes = ytVar.getAttributes();
        this._knownSerializers = afhVar.a();
    }

    public SerializerProvider(SerializerProvider serializerProvider) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = ago.f387a;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializationView = null;
        this._serializerFactory = null;
        this._knownSerializers = null;
        this._serializerCache = new afh();
        this._unknownTypeSerializer = serializerProvider._unknownTypeSerializer;
        this._keySerializer = serializerProvider._keySerializer;
        this._nullValueSerializer = serializerProvider._nullValueSerializer;
        this._nullKeySerializer = serializerProvider._nullKeySerializer;
        this._stdNullValueSerializer = serializerProvider._stdNullValueSerializer;
    }

    public void setDefaultKeySerializer(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._keySerializer = jsonSerializer;
    }

    public void setNullValueSerializer(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullValueSerializer = jsonSerializer;
    }

    public void setNullKeySerializer(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullKeySerializer = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final yt getConfig() {
        return this._config;
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
        return javaType.hasRawClass(cls) ? javaType : getConfig().getTypeFactory().b(javaType, cls, true);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final Class<?> getActiveView() {
        return this._serializationView;
    }

    @Deprecated
    public final Class<?> getSerializationView() {
        return this._serializationView;
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

    public final JsonInclude.b getDefaultPropertyInclusion(Class<?> cls) {
        return this._config.getDefaultPropertyInclusion(cls);
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
    public SerializerProvider setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.a(serializationFeature);
    }

    public final boolean hasSerializationFeatures(int i) {
        return this._config.c(i);
    }

    public final FilterProvider getFilterProvider() {
        return this._config.a();
    }

    public JsonSerializer<Object> findValueSerializer(Class<?> cls, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerE = this._knownSerializers.e(cls);
        if (jsonSerializerE == null && (jsonSerializerE = this._serializerCache.a(cls)) == null && (jsonSerializerE = this._serializerCache.b(this._config.constructType(cls))) == null && (jsonSerializerE = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(jsonSerializerE, beanProperty);
    }

    public JsonSerializer<Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) throws ym {
        if (javaType == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        JsonSerializer<Object> jsonSerializerB = this._knownSerializers.b(javaType);
        if (jsonSerializerB == null && (jsonSerializerB = this._serializerCache.b(javaType)) == null && (jsonSerializerB = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(jsonSerializerB, beanProperty);
    }

    public JsonSerializer<Object> findValueSerializer(Class<?> cls) throws ym {
        JsonSerializer<Object> jsonSerializerE = this._knownSerializers.e(cls);
        return (jsonSerializerE == null && (jsonSerializerE = this._serializerCache.a(cls)) == null && (jsonSerializerE = this._serializerCache.b(this._config.constructType(cls))) == null && (jsonSerializerE = _createAndCacheUntypedSerializer(cls)) == null) ? getUnknownTypeSerializer(cls) : jsonSerializerE;
    }

    public JsonSerializer<Object> findValueSerializer(JavaType javaType) throws ym {
        JsonSerializer<Object> jsonSerializerB = this._knownSerializers.b(javaType);
        return (jsonSerializerB == null && (jsonSerializerB = this._serializerCache.b(javaType)) == null && (jsonSerializerB = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : jsonSerializerB;
    }

    public JsonSerializer<Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerB = this._knownSerializers.b(javaType);
        if (jsonSerializerB == null && (jsonSerializerB = this._serializerCache.b(javaType)) == null && (jsonSerializerB = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handlePrimaryContextualization(jsonSerializerB, beanProperty);
    }

    public JsonSerializer<Object> findPrimaryPropertySerializer(Class<?> cls, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerE = this._knownSerializers.e(cls);
        if (jsonSerializerE == null && (jsonSerializerE = this._serializerCache.a(cls)) == null && (jsonSerializerE = this._serializerCache.b(this._config.constructType(cls))) == null && (jsonSerializerE = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handlePrimaryContextualization(jsonSerializerE, beanProperty);
    }

    public JsonSerializer<Object> findContentValueSerializer(JavaType javaType, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerB = this._knownSerializers.b(javaType);
        if (jsonSerializerB == null && (jsonSerializerB = this._serializerCache.b(javaType)) == null && (jsonSerializerB = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(jsonSerializerB, beanProperty);
    }

    public JsonSerializer<Object> findContentValueSerializer(Class<?> cls, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerE = this._knownSerializers.e(cls);
        if (jsonSerializerE == null && (jsonSerializerE = this._serializerCache.a(cls)) == null && (jsonSerializerE = this._serializerCache.b(this._config.constructType(cls))) == null && (jsonSerializerE = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(jsonSerializerE, beanProperty);
    }

    public JsonSerializer<Object> findTypedValueSerializer(Class<?> cls, boolean z, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerB = this._knownSerializers.b(cls);
        if (jsonSerializerB != null) {
            return jsonSerializerB;
        }
        JsonSerializer<Object> jsonSerializerE = this._serializerCache.e(cls);
        if (jsonSerializerE != null) {
            return jsonSerializerE;
        }
        JsonSerializer<Object> jsonSerializerFindValueSerializer = findValueSerializer(cls, beanProperty);
        SerializerFactory serializerFactory = this._serializerFactory;
        yt ytVar = this._config;
        TypeSerializer typeSerializerCreateTypeSerializer = serializerFactory.createTypeSerializer(ytVar, ytVar.constructType(cls));
        if (typeSerializerCreateTypeSerializer != null) {
            jsonSerializerFindValueSerializer = new afs(typeSerializerCreateTypeSerializer.forProperty(beanProperty), jsonSerializerFindValueSerializer);
        }
        if (z) {
            this._serializerCache.e(cls, jsonSerializerFindValueSerializer);
        }
        return jsonSerializerFindValueSerializer;
    }

    public JsonSerializer<Object> findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerC = this._knownSerializers.c(javaType);
        if (jsonSerializerC != null) {
            return jsonSerializerC;
        }
        JsonSerializer<Object> jsonSerializerC2 = this._serializerCache.c(javaType);
        if (jsonSerializerC2 != null) {
            return jsonSerializerC2;
        }
        JsonSerializer<Object> jsonSerializerFindValueSerializer = findValueSerializer(javaType, beanProperty);
        TypeSerializer typeSerializerCreateTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (typeSerializerCreateTypeSerializer != null) {
            jsonSerializerFindValueSerializer = new afs(typeSerializerCreateTypeSerializer.forProperty(beanProperty), jsonSerializerFindValueSerializer);
        }
        if (z) {
            this._serializerCache.c(javaType, jsonSerializerFindValueSerializer);
        }
        return jsonSerializerFindValueSerializer;
    }

    public TypeSerializer findTypeSerializer(JavaType javaType) throws ym {
        return this._serializerFactory.createTypeSerializer(this._config, javaType);
    }

    public JsonSerializer<Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) throws ym {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this, javaType, this._keySerializer), beanProperty);
    }

    public JsonSerializer<Object> findKeySerializer(Class<?> cls, BeanProperty beanProperty) throws ym {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    public JsonSerializer<Object> getDefaultNullKeySerializer() {
        return this._nullKeySerializer;
    }

    public JsonSerializer<Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    public JsonSerializer<Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) throws ym {
        return this._nullKeySerializer;
    }

    public JsonSerializer<Object> findNullValueSerializer(BeanProperty beanProperty) throws ym {
        return this._nullValueSerializer;
    }

    public JsonSerializer<Object> getUnknownTypeSerializer(Class<?> cls) {
        if (cls == Object.class) {
            return this._unknownTypeSerializer;
        }
        return new afu(cls);
    }

    public boolean isUnknownTypeSerializer(JsonSerializer<?> jsonSerializer) {
        if (jsonSerializer == this._unknownTypeSerializer || jsonSerializer == null) {
            return true;
        }
        return isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) && jsonSerializer.getClass() == afu.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<?> handlePrimaryContextualization(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws ym {
        return (jsonSerializer == 0 || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<?> handleSecondaryContextualization(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws ym {
        return (jsonSerializer == 0 || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty);
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsonGenerator) throws IOException {
        if (obj == null) {
            if (this._stdNullValueSerializer) {
                jsonGenerator.writeNull();
                return;
            } else {
                this._nullValueSerializer.serialize(null, jsonGenerator, this);
                return;
            }
        }
        findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
    }

    public final void defaultSerializeField(String str, Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeFieldName(str);
        if (obj == null) {
            if (this._stdNullValueSerializer) {
                jsonGenerator.writeNull();
                return;
            } else {
                this._nullValueSerializer.serialize(null, jsonGenerator, this);
                return;
            }
        }
        findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
    }

    public final void defaultSerializeDateValue(long j, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.writeNumber(j);
        } else {
            jsonGenerator.writeString(_dateFormat().format(new Date(j)));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.writeNumber(date.getTime());
        } else {
            jsonGenerator.writeString(_dateFormat().format(date));
        }
    }

    public void defaultSerializeDateKey(long j, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(j));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(new Date(j)));
        }
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) throws IOException {
        if (this._stdNullValueSerializer) {
            jsonGenerator.writeNull();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public void reportMappingProblem(String str, Object... objArr) throws ym {
        throw mappingException(str, objArr);
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) throws ym {
        String strU;
        if (beanDescription == null) {
            strU = "N/A";
        } else {
            strU = ahw.u(beanDescription.getBeanClass());
        }
        throw abv.c(getGenerator(), String.format("Invalid type definition for type %s: %s", strU, _format(str, objArr)), beanDescription, null);
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws ym {
        String str_quotedString;
        String str_format = _format(str, objArr);
        String strU = "N/A";
        if (beanPropertyDefinition == null) {
            str_quotedString = "N/A";
        } else {
            str_quotedString = _quotedString(beanPropertyDefinition.getName());
        }
        if (beanDescription != null) {
            strU = ahw.u(beanDescription.getBeanClass());
        }
        throw abv.c(getGenerator(), String.format("Invalid definition for property %s (of type %s): %s", str_quotedString, strU, str_format), beanDescription, beanPropertyDefinition);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public <T> T reportBadDefinition(JavaType javaType, String str) throws ym {
        throw abv.b(getGenerator(), str, javaType);
    }

    public <T> T reportBadDefinition(JavaType javaType, String str, Throwable th) throws ym {
        abv abvVarB = abv.b(getGenerator(), str, javaType);
        abvVarB.initCause(th);
        throw abvVarB;
    }

    public <T> T reportBadDefinition(Class<?> cls, String str, Throwable th) throws ym {
        abv abvVarB = abv.b(getGenerator(), str, constructType(cls));
        abvVarB.initCause(th);
        throw abvVarB;
    }

    public void reportMappingProblem(Throwable th, String str, Object... objArr) throws ym {
        throw ym.from(getGenerator(), _format(str, objArr), th);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public ym invalidTypeIdException(JavaType javaType, String str, String str2) {
        return abw.d(null, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, ahw.a(javaType)), str2), javaType, str);
    }

    @Deprecated
    public ym mappingException(String str, Object... objArr) {
        return ym.from(getGenerator(), _format(str, objArr));
    }

    @Deprecated
    protected ym mappingException(Throwable th, String str, Object... objArr) {
        return ym.from(getGenerator(), _format(str, objArr), th);
    }

    protected void _reportIncompatibleRootType(Object obj, JavaType javaType) throws IOException {
        if (javaType.isPrimitive() && ahw.w(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            return;
        }
        reportBadDefinition(javaType, String.format("Incompatible types: declared root type (%s) vs %s", javaType, ahw.b(obj)));
    }

    protected JsonSerializer<Object> _findExplicitUntypedSerializer(Class<?> cls) throws ym {
        JsonSerializer<Object> jsonSerializerE = this._knownSerializers.e(cls);
        if (jsonSerializerE == null && (jsonSerializerE = this._serializerCache.a(cls)) == null) {
            jsonSerializerE = _createAndCacheUntypedSerializer(cls);
        }
        if (isUnknownTypeSerializer(jsonSerializerE)) {
            return null;
        }
        return jsonSerializerE;
    }

    protected JsonSerializer<Object> _createAndCacheUntypedSerializer(Class<?> cls) throws ym {
        JsonSerializer<Object> jsonSerializer_createUntypedSerializer;
        JavaType javaTypeConstructType = this._config.constructType(cls);
        try {
            jsonSerializer_createUntypedSerializer = _createUntypedSerializer(javaTypeConstructType);
        } catch (IllegalArgumentException e) {
            reportMappingProblem(e, ahw.a((Throwable) e), new Object[0]);
            jsonSerializer_createUntypedSerializer = null;
        }
        if (jsonSerializer_createUntypedSerializer != null) {
            this._serializerCache.a(cls, javaTypeConstructType, jsonSerializer_createUntypedSerializer, this);
        }
        return jsonSerializer_createUntypedSerializer;
    }

    protected JsonSerializer<Object> _createAndCacheUntypedSerializer(JavaType javaType) throws ym {
        JsonSerializer<Object> jsonSerializer_createUntypedSerializer;
        try {
            jsonSerializer_createUntypedSerializer = _createUntypedSerializer(javaType);
        } catch (IllegalArgumentException e) {
            reportMappingProblem(e, ahw.a((Throwable) e), new Object[0]);
            jsonSerializer_createUntypedSerializer = null;
        }
        if (jsonSerializer_createUntypedSerializer != null) {
            this._serializerCache.b(javaType, jsonSerializer_createUntypedSerializer, this);
        }
        return jsonSerializer_createUntypedSerializer;
    }

    protected JsonSerializer<Object> _createUntypedSerializer(JavaType javaType) throws ym {
        return this._serializerFactory.createSerializer(this, javaType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected JsonSerializer<Object> _handleContextualResolvable(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws ym {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return handleSecondaryContextualization(jsonSerializer, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected JsonSerializer<Object> _handleResolvable(JsonSerializer<?> jsonSerializer) throws ym {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return jsonSerializer;
    }

    protected final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }
}
