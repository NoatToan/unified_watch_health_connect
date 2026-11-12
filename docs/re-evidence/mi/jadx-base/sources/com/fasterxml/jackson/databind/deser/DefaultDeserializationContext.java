package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.bqk;
import defpackage.esd;
import defpackage.fd1;
import defpackage.h04;
import defpackage.vzd;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    private static final long serialVersionUID = 1;
    private List<com.fasterxml.jackson.annotation.a> _objectIdResolvers;
    protected transient LinkedHashMap<ObjectIdGenerator.IdKey, com.fasterxml.jackson.databind.deser.impl.a> _objectIds;

    public static final class Impl extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public Impl(a aVar) {
            super(aVar, (DeserializerCache) null);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext copy() {
            h04.j0(Impl.class, this, "copy");
            return new Impl(this);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            return new Impl(this, deserializationConfig, jsonParser, injectableValues);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext with(a aVar) {
            return new Impl(this, aVar);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            super(impl, deserializationConfig, jsonParser, injectableValues);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        public Impl(Impl impl, a aVar) {
            super(impl, aVar);
        }
    }

    public DefaultDeserializationContext(a aVar, DeserializerCache deserializerCache) {
        super(aVar, deserializerCache);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public void checkUnresolvedObjectId() throws UnresolvedForwardReference {
        if (this._objectIds != null && isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            Iterator<Map.Entry<ObjectIdGenerator.IdKey, com.fasterxml.jackson.databind.deser.impl.a>> it = this._objectIds.entrySet().iterator();
            UnresolvedForwardReference unresolvedForwardReference = null;
            while (it.hasNext()) {
                com.fasterxml.jackson.databind.deser.impl.a value = it.next().getValue();
                if (value.d() && !tryToResolveUnresolvedObjectId(value)) {
                    if (unresolvedForwardReference == null) {
                        unresolvedForwardReference = new UnresolvedForwardReference(getParser(), "Unresolved forward references for: ");
                    }
                    Object obj = value.c().key;
                    Iterator<com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a> itE = value.e();
                    while (itE.hasNext()) {
                        com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a next = itE.next();
                        unresolvedForwardReference.addUnresolvedId(obj, next.a(), next.b());
                    }
                }
            }
            if (unresolvedForwardReference != null) {
                throw unresolvedForwardReference;
            }
        }
    }

    public DefaultDeserializationContext copy() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues);

    public com.fasterxml.jackson.databind.deser.impl.a createReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        return new com.fasterxml.jackson.databind.deser.impl.a(idKey);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public esd<Object> deserializerInstance(fd1 fd1Var, Object obj) throws JsonMappingException {
        esd<Object> esdVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof esd) {
            esdVar = (esd) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == esd.a.class || h04.K(cls)) {
                return null;
            }
            if (!esd.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            this._config.getHandlerInstantiator();
            esdVar = (esd) h04.k(cls, this._config.canOverrideAccessModifiers());
        }
        if (esdVar instanceof bqk) {
            ((bqk) esdVar).resolve(this);
        }
        return esdVar;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public com.fasterxml.jackson.databind.deser.impl.a findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, com.fasterxml.jackson.annotation.a aVar) {
        com.fasterxml.jackson.annotation.a aVarC = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey idKeyKey = objectIdGenerator.key(obj);
        LinkedHashMap<ObjectIdGenerator.IdKey, com.fasterxml.jackson.databind.deser.impl.a> linkedHashMap = this._objectIds;
        if (linkedHashMap == null) {
            this._objectIds = new LinkedHashMap<>();
        } else {
            com.fasterxml.jackson.databind.deser.impl.a aVar2 = linkedHashMap.get(idKeyKey);
            if (aVar2 != null) {
                return aVar2;
            }
        }
        List<com.fasterxml.jackson.annotation.a> list = this._objectIdResolvers;
        if (list != null) {
            for (com.fasterxml.jackson.annotation.a aVar3 : list) {
                if (aVar3.d(aVar)) {
                    aVarC = aVar3;
                    break;
                }
            }
        } else {
            this._objectIdResolvers = new ArrayList(8);
        }
        if (aVarC == null) {
            aVarC = aVar.c(this);
            this._objectIdResolvers.add(aVarC);
        }
        com.fasterxml.jackson.databind.deser.impl.a aVarCreateReadableObjectId = createReadableObjectId(idKeyKey);
        aVarCreateReadableObjectId.g(aVarC);
        this._objectIds.put(idKeyKey, aVarCreateReadableObjectId);
        return aVarCreateReadableObjectId;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final vzd keyDeserializerInstance(fd1 fd1Var, Object obj) throws JsonMappingException {
        vzd vzdVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof vzd) {
            vzdVar = (vzd) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == vzd.a.class || h04.K(cls)) {
                return null;
            }
            if (!vzd.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
            }
            this._config.getHandlerInstantiator();
            vzdVar = (vzd) h04.k(cls, this._config.canOverrideAccessModifiers());
        }
        if (vzdVar instanceof bqk) {
            ((bqk) vzdVar).resolve(this);
        }
        return vzdVar;
    }

    public boolean tryToResolveUnresolvedObjectId(com.fasterxml.jackson.databind.deser.impl.a aVar) {
        return aVar.h(this);
    }

    public abstract DefaultDeserializationContext with(a aVar);

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser, injectableValues);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, a aVar) {
        super(defaultDeserializationContext, aVar);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext) {
        super(defaultDeserializationContext);
    }
}
