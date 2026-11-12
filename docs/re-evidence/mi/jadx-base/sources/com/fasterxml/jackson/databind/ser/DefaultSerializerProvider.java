package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import defpackage.bpr;
import defpackage.c4h;
import defpackage.e5q;
import defpackage.eud;
import defpackage.fd1;
import defpackage.h04;
import defpackage.ih2;
import defpackage.ksd;
import defpackage.rfl;
import defpackage.vwl;
import defpackage.wwl;
import defpackage.zsd;
import defpackage.ztd;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DefaultSerializerProvider extends wwl implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient JsonGenerator _generator;
    protected transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
    protected transient Map<Object, bpr> _seenObjectIds;

    public static final class Impl extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1;

        public Impl() {
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public DefaultSerializerProvider copy() {
            return new Impl(this);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public Impl createInstance(SerializationConfig serializationConfig, vwl vwlVar) {
            return new Impl(this, serializationConfig, vwlVar);
        }

        public Impl(wwl wwlVar, SerializationConfig serializationConfig, vwl vwlVar) {
            super(wwlVar, serializationConfig, vwlVar);
        }
    }

    public DefaultSerializerProvider() {
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, eud<Object> eudVar, PropertyName propertyName) throws IOException {
        try {
            jsonGenerator.N0();
            jsonGenerator.o0(propertyName.simpleAsEncoded(this._config));
            eudVar.serialize(obj, jsonGenerator, this);
            jsonGenerator.m0();
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    private IOException _wrapAsIOE(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strN = h04.n(exc);
        if (strN == null) {
            strN = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(jsonGenerator, strN, exc);
    }

    public Map<Object, bpr> _createObjectIdMap() {
        return isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
    }

    public void _serializeNull(JsonGenerator jsonGenerator) throws IOException {
        try {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    public void acceptJsonFormatVisitor(JavaType javaType, ksd ksdVar) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        ksdVar.j(this);
        findValueSerializer(javaType, (BeanProperty) null).acceptJsonFormatVisitor(ksdVar, javaType);
    }

    public int cachedSerializersCount() {
        return this._serializerCache.h();
    }

    public DefaultSerializerProvider copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationConfig, vwl vwlVar);

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // defpackage.wwl
    public bpr findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        ObjectIdGenerator<?> objectIdGeneratorNewForSerialization;
        Map<Object, bpr> map = this._seenObjectIds;
        if (map == null) {
            this._seenObjectIds = _createObjectIdMap();
        } else {
            bpr bprVar = map.get(obj);
            if (bprVar != null) {
                return bprVar;
            }
        }
        ArrayList<ObjectIdGenerator<?>> arrayList = this._objectIdGenerators;
        if (arrayList != null) {
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
            bpr bprVar2 = new bpr(objectIdGeneratorNewForSerialization);
            this._seenObjectIds.put(obj, bprVar2);
            return bprVar2;
        }
        this._objectIdGenerators = new ArrayList<>(8);
        objectIdGeneratorNewForSerialization = null;
        if (objectIdGeneratorNewForSerialization == null) {
            objectIdGeneratorNewForSerialization = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGeneratorNewForSerialization);
        }
        bpr bprVar3 = new bpr(objectIdGeneratorNewForSerialization);
        this._seenObjectIds.put(obj, bprVar3);
        return bprVar3;
    }

    public void flushCachedSerializers() {
        this._serializerCache.f();
    }

    @Deprecated
    public ztd generateJsonSchema(Class<?> cls) throws JsonMappingException {
        Object objFindValueSerializer = findValueSerializer(cls, (BeanProperty) null);
        zsd schema = objFindValueSerializer instanceof rfl ? ((rfl) objFindValueSerializer).getSchema(this, null) : ztd.a();
        if (schema instanceof c4h) {
            return new ztd((c4h) schema);
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " would not be serialized as a JSON object and therefore has no schema");
    }

    @Override // defpackage.wwl
    public JsonGenerator getGenerator() {
        return this._generator;
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this._config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            return _findExplicitUntypedSerializer(cls) != null;
        } catch (JsonMappingException e) {
            if (atomicReference != null) {
                atomicReference.set(e);
            }
            return false;
        } catch (RuntimeException e2) {
            if (atomicReference == null) {
                throw e2;
            }
            atomicReference.set(e2);
            return false;
        }
    }

    @Override // defpackage.wwl
    public Object includeFilterInstance(ih2 ih2Var, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        this._config.getHandlerInstantiator();
        return h04.k(cls, this._config.canOverrideAccessModifiers());
    }

    @Override // defpackage.wwl
    public boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Throwable th) {
            reportBadDefinition(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), th.getClass().getName(), h04.n(th)), th);
            return false;
        }
    }

    public void serializePolymorphic(JsonGenerator jsonGenerator, Object obj, JavaType javaType, eud<Object> eudVar, e5q e5qVar) throws IOException {
        boolean zIsEnabled;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (eudVar == null) {
            eudVar = (javaType == null || !javaType.isContainerType()) ? findValueSerializer(obj.getClass(), (BeanProperty) null) : findValueSerializer(javaType, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            zIsEnabled = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (zIsEnabled) {
                jsonGenerator.N0();
                jsonGenerator.o0(this._config.findRootName(obj.getClass()).simpleAsEncoded(this._config));
            }
        } else if (fullRootName.isEmpty()) {
            zIsEnabled = false;
        } else {
            jsonGenerator.N0();
            jsonGenerator.r0(fullRootName.getSimpleName());
            zIsEnabled = true;
        }
        try {
            eudVar.serializeWithType(obj, jsonGenerator, this, e5qVar);
            if (zIsEnabled) {
                jsonGenerator.m0();
            }
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        eud<Object> eudVarFindTypedValueSerializer = findTypedValueSerializer(cls, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, eudVarFindTypedValueSerializer, this._config.findRootName(cls));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, eudVarFindTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, eudVarFindTypedValueSerializer);
    }

    @Override // defpackage.wwl
    public eud<Object> serializerInstance(fd1 fd1Var, Object obj) throws JsonMappingException {
        eud<?> eudVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof eud) {
            eudVar = (eud) obj;
        } else {
            if (!(obj instanceof Class)) {
                reportBadDefinition(fd1Var.getType(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == eud.a.class || h04.K(cls)) {
                return null;
            }
            if (!eud.class.isAssignableFrom(cls)) {
                reportBadDefinition(fd1Var.getType(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            this._config.getHandlerInstantiator();
            eudVar = (eud) h04.k(cls, this._config.canOverrideAccessModifiers());
        }
        return _handleResolvable(eudVar);
    }

    public DefaultSerializerProvider(wwl wwlVar, SerializationConfig serializationConfig, vwl vwlVar) {
        super(wwlVar, serializationConfig, vwlVar);
    }

    public DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, eud<Object> eudVar) throws IOException {
        try {
            eudVar.serialize(obj, jsonGenerator, this);
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
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
        eud<Object> eudVarFindTypedValueSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, eudVarFindTypedValueSerializer, this._config.findRootName(javaType));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, eudVarFindTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, eudVarFindTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, eud<Object> eudVar) throws IOException {
        PropertyName propertyNameFindRootName;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (eudVar == null) {
            eudVar = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    propertyNameFindRootName = this._config.findRootName(obj.getClass());
                } else {
                    propertyNameFindRootName = this._config.findRootName(javaType);
                }
                _serialize(jsonGenerator, obj, eudVar, propertyNameFindRootName);
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, eudVar, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, eudVar);
    }
}
