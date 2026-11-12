package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;
import defpackage.ahw;
import defpackage.yi;
import defpackage.ym;
import defpackage.zl;
import defpackage.zm;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    private static final long serialVersionUID = 1;
    private List<ObjectIdResolver> _objectIdResolvers;
    protected transient LinkedHashMap<ObjectIdGenerator.c, ReadableObjectId> _objectIds;

    public abstract DefaultDeserializationContext createDummyInstance(yi yiVar);

    public abstract DefaultDeserializationContext createInstance(yi yiVar, JsonParser jsonParser, InjectableValues injectableValues);

    public abstract DefaultDeserializationContext with(DeserializerFactory deserializerFactory);

    protected DefaultDeserializationContext(DeserializerFactory deserializerFactory, zl zlVar) {
        super(deserializerFactory, zlVar);
    }

    protected DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, yi yiVar, JsonParser jsonParser, InjectableValues injectableValues) {
        super(defaultDeserializationContext, yiVar, jsonParser, injectableValues);
    }

    protected DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, yi yiVar) {
        super(defaultDeserializationContext, yiVar);
    }

    protected DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializerFactory deserializerFactory) {
        super(defaultDeserializationContext, deserializerFactory);
    }

    protected DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext) {
        super(defaultDeserializationContext);
    }

    public DefaultDeserializationContext copy() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver) {
        ObjectIdResolver objectIdResolverNewForDeserialization = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.c cVarKey = objectIdGenerator.key(obj);
        LinkedHashMap<ObjectIdGenerator.c, ReadableObjectId> linkedHashMap = this._objectIds;
        if (linkedHashMap == null) {
            this._objectIds = new LinkedHashMap<>();
        } else {
            ReadableObjectId readableObjectId = linkedHashMap.get(cVarKey);
            if (readableObjectId != null) {
                return readableObjectId;
            }
        }
        List<ObjectIdResolver> list = this._objectIdResolvers;
        if (list == null) {
            this._objectIdResolvers = new ArrayList(8);
        } else {
            for (ObjectIdResolver objectIdResolver2 : list) {
                if (objectIdResolver2.canUseFor(objectIdResolver)) {
                    objectIdResolverNewForDeserialization = objectIdResolver2;
                    break;
                }
            }
        }
        if (objectIdResolverNewForDeserialization == null) {
            objectIdResolverNewForDeserialization = objectIdResolver.newForDeserialization(this);
            this._objectIdResolvers.add(objectIdResolverNewForDeserialization);
        }
        ReadableObjectId readableObjectIdCreateReadableObjectId = createReadableObjectId(cVarKey);
        readableObjectIdCreateReadableObjectId.e(objectIdResolverNewForDeserialization);
        this._objectIds.put(cVarKey, readableObjectIdCreateReadableObjectId);
        return readableObjectIdCreateReadableObjectId;
    }

    protected ReadableObjectId createReadableObjectId(ObjectIdGenerator.c cVar) {
        return new ReadableObjectId(cVar);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public void checkUnresolvedObjectId() throws zm {
        if (this._objectIds != null && isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            Iterator<Map.Entry<ObjectIdGenerator.c, ReadableObjectId>> it = this._objectIds.entrySet().iterator();
            zm zmVar = null;
            while (it.hasNext()) {
                ReadableObjectId value = it.next().getValue();
                if (value.b() && !tryToResolveUnresolvedObjectId(value)) {
                    if (zmVar == null) {
                        zmVar = new zm(getParser(), "Unresolved forward references for: ");
                    }
                    Object obj = value.c().f4068a;
                    Iterator<ReadableObjectId.Referring> itD = value.d();
                    while (itD.hasNext()) {
                        ReadableObjectId.Referring next = itD.next();
                        zmVar.d(obj, next.getBeanType(), next.getLocation());
                    }
                }
            }
            if (zmVar != null) {
                throw zmVar;
            }
        }
    }

    protected boolean tryToResolveUnresolvedObjectId(ReadableObjectId readableObjectId) {
        return readableObjectId.b(this);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object obj) throws ym {
        JsonDeserializer<?> jsonDeserializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonDeserializer) {
            jsonDeserializer = (JsonDeserializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == JsonDeserializer.None.class || ahw.l(cls)) {
                return null;
            }
            if (!JsonDeserializer.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
            JsonDeserializer<?> jsonDeserializerDeserializerInstance = handlerInstantiator != null ? handlerInstantiator.deserializerInstance(this._config, annotated, cls) : null;
            jsonDeserializer = jsonDeserializerDeserializerInstance == null ? (JsonDeserializer) ahw.b(cls, this._config.canOverrideAccessModifiers()) : jsonDeserializerDeserializerInstance;
        }
        if (jsonDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) jsonDeserializer).resolve(this);
        }
        return jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj) throws ym {
        KeyDeserializer keyDeserializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof KeyDeserializer) {
            keyDeserializer = (KeyDeserializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == KeyDeserializer.None.class || ahw.l(cls)) {
                return null;
            }
            if (!KeyDeserializer.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
            }
            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
            KeyDeserializer keyDeserializerKeyDeserializerInstance = handlerInstantiator != null ? handlerInstantiator.keyDeserializerInstance(this._config, annotated, cls) : null;
            keyDeserializer = keyDeserializerKeyDeserializerInstance == null ? (KeyDeserializer) ahw.b(cls, this._config.canOverrideAccessModifiers()) : keyDeserializerKeyDeserializerInstance;
        }
        if (keyDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) keyDeserializer).resolve(this);
        }
        return keyDeserializer;
    }

    public Object readRootValue(JsonParser jsonParser, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj) throws IOException {
        if (this._config.useRootWrapping()) {
            return _unwrapAndDeserialize(jsonParser, javaType, jsonDeserializer, obj);
        }
        if (obj == null) {
            return jsonDeserializer.deserialize(jsonParser, this);
        }
        return jsonDeserializer.deserialize(jsonParser, this, obj);
    }

    protected Object _unwrapAndDeserialize(JsonParser jsonParser, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj) throws IOException {
        Object objDeserialize;
        String strB = this._config.findRootName(javaType).b();
        if (jsonParser.currentToken() != JsonToken.START_OBJECT) {
            reportWrongTokenException(javaType, JsonToken.START_OBJECT, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", ahw.e(strB), jsonParser.currentToken());
        }
        if (jsonParser.nextToken() != JsonToken.FIELD_NAME) {
            reportWrongTokenException(javaType, JsonToken.FIELD_NAME, "Current token not FIELD_NAME (to contain expected root name %s), but %s", ahw.e(strB), jsonParser.currentToken());
        }
        String strCurrentName = jsonParser.currentName();
        if (!strB.equals(strCurrentName)) {
            reportPropertyInputMismatch(javaType, strCurrentName, "Root name (%s) does not match expected (%s) for type %s", ahw.e(strCurrentName), ahw.e(strB), ahw.a(javaType));
        }
        jsonParser.nextToken();
        if (obj == null) {
            objDeserialize = jsonDeserializer.deserialize(jsonParser, this);
        } else {
            objDeserialize = jsonDeserializer.deserialize(jsonParser, this, obj);
        }
        if (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            reportWrongTokenException(javaType, JsonToken.END_OBJECT, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", ahw.e(strB), jsonParser.currentToken());
        }
        return objDeserialize;
    }

    public static final class c extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public c(DeserializerFactory deserializerFactory) {
            super(deserializerFactory, (zl) null);
        }

        private c(c cVar, yi yiVar, JsonParser jsonParser, InjectableValues injectableValues) {
            super(cVar, yiVar, jsonParser, injectableValues);
        }

        private c(c cVar) {
            super(cVar);
        }

        private c(c cVar, DeserializerFactory deserializerFactory) {
            super(cVar, deserializerFactory);
        }

        private c(c cVar, yi yiVar) {
            super(cVar, yiVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext copy() {
            ahw.c((Class<?>) c.class, this, "copy");
            return new c(this);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext createInstance(yi yiVar, JsonParser jsonParser, InjectableValues injectableValues) {
            return new c(this, yiVar, jsonParser, injectableValues);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext createDummyInstance(yi yiVar) {
            return new c(this, yiVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext with(DeserializerFactory deserializerFactory) {
            return new c(this, deserializerFactory);
        }
    }
}
