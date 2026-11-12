package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import defpackage.adc;
import defpackage.aeu;
import defpackage.afy;
import defpackage.ahw;
import defpackage.ym;
import defpackage.ys;
import defpackage.yt;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DefaultSerializerProvider extends SerializerProvider implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient JsonGenerator _generator;
    protected transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
    protected transient Map<Object, afy> _seenObjectIds;

    public abstract DefaultSerializerProvider createInstance(yt ytVar, SerializerFactory serializerFactory);

    protected DefaultSerializerProvider() {
    }

    protected DefaultSerializerProvider(SerializerProvider serializerProvider, yt ytVar, SerializerFactory serializerFactory) {
        super(serializerProvider, ytVar, serializerFactory);
    }

    protected DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    public DefaultSerializerProvider copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public JsonSerializer<Object> serializerInstance(Annotated annotated, Object obj) throws ym {
        JsonSerializer<?> jsonSerializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonSerializer) {
            jsonSerializer = (JsonSerializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                reportBadDefinition(annotated.getType(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == JsonSerializer.None.class || ahw.l(cls)) {
                return null;
            }
            if (!JsonSerializer.class.isAssignableFrom(cls)) {
                reportBadDefinition(annotated.getType(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
            JsonSerializer<?> jsonSerializerSerializerInstance = handlerInstantiator != null ? handlerInstantiator.serializerInstance(this._config, annotated, cls) : null;
            jsonSerializer = jsonSerializerSerializerInstance == null ? (JsonSerializer) ahw.b(cls, this._config.canOverrideAccessModifiers()) : jsonSerializerSerializerInstance;
        }
        return _handleResolvable(jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public Object includeFilterInstance(BeanPropertyDefinition beanPropertyDefinition, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
        Object objIncludeFilterInstance = handlerInstantiator != null ? handlerInstantiator.includeFilterInstance(this._config, beanPropertyDefinition, cls) : null;
        return objIncludeFilterInstance == null ? ahw.b(cls, this._config.canOverrideAccessModifiers()) : objIncludeFilterInstance;
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public boolean includeFilterSuppressNulls(Object obj) throws ym {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Throwable th) {
            reportBadDefinition(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), th.getClass().getName(), ahw.a(th)), th);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public afy findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        ObjectIdGenerator<?> objectIdGeneratorNewForSerialization;
        Map<Object, afy> map = this._seenObjectIds;
        if (map == null) {
            this._seenObjectIds = _createObjectIdMap();
        } else {
            afy afyVar = map.get(obj);
            if (afyVar != null) {
                return afyVar;
            }
        }
        ArrayList<ObjectIdGenerator<?>> arrayList = this._objectIdGenerators;
        if (arrayList == null) {
            this._objectIdGenerators = new ArrayList<>(8);
        } else {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    objectIdGeneratorNewForSerialization = this._objectIdGenerators.get(i);
                    if (objectIdGeneratorNewForSerialization.canUseFor(objectIdGenerator)) {
                        break;
                    }
                    i++;
                }
            }
            if (objectIdGeneratorNewForSerialization == null) {
                objectIdGeneratorNewForSerialization = objectIdGenerator.newForSerialization(this);
                this._objectIdGenerators.add(objectIdGeneratorNewForSerialization);
            }
            afy afyVar2 = new afy(objectIdGeneratorNewForSerialization);
            this._seenObjectIds.put(obj, afyVar2);
            return afyVar2;
        }
        objectIdGeneratorNewForSerialization = null;
        if (objectIdGeneratorNewForSerialization == null) {
            objectIdGeneratorNewForSerialization = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGeneratorNewForSerialization);
        }
        afy afyVar3 = new afy(objectIdGeneratorNewForSerialization);
        this._seenObjectIds.put(obj, afyVar3);
        return afyVar3;
    }

    protected Map<Object, afy> _createObjectIdMap() {
        if (isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID)) {
            return new HashMap();
        }
        return new IdentityHashMap();
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this._config.a(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            return _findExplicitUntypedSerializer(cls) != null;
        } catch (RuntimeException e) {
            if (atomicReference == null) {
                throw e;
            }
            atomicReference.set(e);
            return false;
        } catch (ym e2) {
            if (atomicReference != null) {
                atomicReference.set(e2);
            }
            return false;
        }
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public JsonGenerator getGenerator() {
        return this._generator;
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = findTypedValueSerializer(cls, true, (BeanProperty) null);
        ys fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.a(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer, this._config.findRootName(cls));
                return;
            }
        } else if (!fullRootName.a()) {
            _serialize(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (!javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        ys fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.a(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer, this._config.findRootName(javaType));
                return;
            }
        } else if (!fullRootName.a()) {
            _serialize(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws IOException {
        ys ysVarFindRootName;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (jsonSerializer == null) {
            jsonSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        }
        ys fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.a(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    ysVarFindRootName = this._config.findRootName(obj.getClass());
                } else {
                    ysVarFindRootName = this._config.findRootName(javaType);
                }
                _serialize(jsonGenerator, obj, jsonSerializer, ysVarFindRootName);
                return;
            }
        } else if (!fullRootName.a()) {
            _serialize(jsonGenerator, obj, jsonSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, jsonSerializer);
    }

    public void serializePolymorphic(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer) throws IOException {
        boolean zA;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (jsonSerializer == null) {
            if (javaType != null && javaType.isContainerType()) {
                jsonSerializer = findValueSerializer(javaType, (BeanProperty) null);
            } else {
                jsonSerializer = findValueSerializer(obj.getClass(), (BeanProperty) null);
            }
        }
        ys fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            zA = this._config.a(SerializationFeature.WRAP_ROOT_VALUE);
            if (zA) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeFieldName(this._config.findRootName(obj.getClass()).b(this._config));
            }
        } else if (fullRootName.a()) {
            zA = false;
        } else {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(fullRootName.b());
            zA = true;
        }
        try {
            jsonSerializer.serializeWithType(obj, jsonGenerator, this, typeSerializer);
            if (zA) {
                jsonGenerator.writeEndObject();
            }
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, JsonSerializer<Object> jsonSerializer, ys ysVar) throws IOException {
        try {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(ysVar.b(this._config));
            jsonSerializer.serialize(obj, jsonGenerator, this);
            jsonGenerator.writeEndObject();
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, JsonSerializer<Object> jsonSerializer) throws IOException {
        try {
            jsonSerializer.serialize(obj, jsonGenerator, this);
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    protected void _serializeNull(JsonGenerator jsonGenerator) throws IOException {
        try {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    private IOException _wrapAsIOE(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strA = ahw.a((Throwable) exc);
        if (strA == null) {
            strA = "[no message for " + exc.getClass().getName() + "]";
        }
        return new ym(jsonGenerator, strA, exc);
    }

    public int cachedSerializersCount() {
        return this._serializerCache.b();
    }

    public void flushCachedSerializers() {
        this._serializerCache.c();
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws ym {
        if (javaType == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        jsonFormatVisitorWrapper.setProvider(this);
        findValueSerializer(javaType, (BeanProperty) null).acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
    }

    @Deprecated
    public adc generateJsonSchema(Class<?> cls) throws ym {
        JsonFormatVisitable jsonFormatVisitableFindValueSerializer = findValueSerializer(cls, (BeanProperty) null);
        JsonNode schema = jsonFormatVisitableFindValueSerializer instanceof SchemaAware ? ((SchemaAware) jsonFormatVisitableFindValueSerializer).getSchema(this, null) : adc.e();
        if (!(schema instanceof aeu)) {
            throw new IllegalArgumentException("Class " + cls.getName() + " would not be serialized as a JSON object and therefore has no schema");
        }
        return new adc((aeu) schema);
    }

    public static final class b extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1;

        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        protected b(SerializerProvider serializerProvider, yt ytVar, SerializerFactory serializerFactory) {
            super(serializerProvider, ytVar, serializerFactory);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public DefaultSerializerProvider copy() {
            if (getClass() != b.class) {
                return super.copy();
            }
            return new b(this);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createInstance(yt ytVar, SerializerFactory serializerFactory) {
            return new b(this, ytVar, serializerFactory);
        }
    }
}
