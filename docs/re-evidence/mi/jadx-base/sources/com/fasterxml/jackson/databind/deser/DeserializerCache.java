package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import defpackage.ak4;
import defpackage.bqk;
import defpackage.esd;
import defpackage.fd1;
import defpackage.fh2;
import defpackage.h04;
import defpackage.vzd;
import defpackage.zsd;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class DeserializerCache implements Serializable {
    private static final long serialVersionUID = 1;
    protected final ConcurrentHashMap<JavaType, esd<Object>> _cachedDeserializers = new ConcurrentHashMap<>(64, 0.75f, 4);
    protected final HashMap<JavaType, esd<Object>> _incompleteDeserializers = new HashMap<>(8);

    private boolean _hasCustomHandlers(JavaType javaType) {
        if (!javaType.isContainerType()) {
            return false;
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null || (contentType.getValueHandler() == null && contentType.getTypeHandler() == null)) {
            return javaType.isMapLikeType() && javaType.getKeyType().getValueHandler() != null;
        }
        return true;
    }

    private Class<?> _verifyAsClass(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class<?> cls2 = (Class) obj;
            if (cls2 == cls || h04.K(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    private JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, fd1 fd1Var, JavaType javaType) throws JsonMappingException {
        Object objFindContentDeserializer;
        esd<Object> esdVarDeserializerInstance;
        JavaType keyType;
        Object objFindKeyDeserializer;
        vzd vzdVarKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && (keyType = javaType.getKeyType()) != null && keyType.getValueHandler() == null && (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(fd1Var)) != null && (vzdVarKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(fd1Var, objFindKeyDeserializer)) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(vzdVarKeyDeserializerInstance);
            javaType.getKeyType();
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null && contentType.getValueHandler() == null && (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(fd1Var)) != null) {
            if (objFindContentDeserializer instanceof esd) {
            } else {
                Class<?> cls_verifyAsClass = _verifyAsClass(objFindContentDeserializer, "findContentDeserializer", esd.a.class);
                esdVarDeserializerInstance = cls_verifyAsClass != null ? deserializationContext.deserializerInstance(fd1Var, cls_verifyAsClass) : null;
                if (esdVarDeserializerInstance != null) {
                    javaType = javaType.withContentValueHandler(esdVarDeserializerInstance);
                }
            }
            if (esdVarDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(esdVarDeserializerInstance);
            }
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), fd1Var, javaType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public esd<Object> _createAndCache2(DeserializationContext deserializationContext, a aVar, JavaType javaType) throws JsonMappingException {
        try {
            esd<Object> esdVar_createDeserializer = _createDeserializer(deserializationContext, aVar, javaType);
            if (esdVar_createDeserializer == 0) {
                return null;
            }
            boolean z = !_hasCustomHandlers(javaType) && esdVar_createDeserializer.isCachable();
            if (esdVar_createDeserializer instanceof bqk) {
                this._incompleteDeserializers.put(javaType, esdVar_createDeserializer);
                ((bqk) esdVar_createDeserializer).resolve(deserializationContext);
                this._incompleteDeserializers.remove(javaType);
            }
            if (z) {
                this._cachedDeserializers.put(javaType, esdVar_createDeserializer);
            }
            return esdVar_createDeserializer;
        } catch (IllegalArgumentException e) {
            throw JsonMappingException.from(deserializationContext, h04.n(e), e);
        }
    }

    public esd<Object> _createAndCacheValueDeserializer(DeserializationContext deserializationContext, a aVar, JavaType javaType) throws JsonMappingException {
        esd<Object> esdVar;
        synchronized (this._incompleteDeserializers) {
            try {
                esd<Object> esdVar_findCachedDeserializer = _findCachedDeserializer(javaType);
                if (esdVar_findCachedDeserializer != null) {
                    return esdVar_findCachedDeserializer;
                }
                int size = this._incompleteDeserializers.size();
                if (size > 0 && (esdVar = this._incompleteDeserializers.get(javaType)) != null) {
                    return esdVar;
                }
                try {
                    esd<Object> esdVar_createAndCache2 = _createAndCache2(deserializationContext, aVar, javaType);
                    if (size == 0 && this._incompleteDeserializers.size() > 0) {
                        this._incompleteDeserializers.clear();
                    }
                    return esdVar_createAndCache2;
                } catch (Throwable th) {
                    if (size == 0 && this._incompleteDeserializers.size() > 0) {
                        this._incompleteDeserializers.clear();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public esd<Object> _createDeserializer(DeserializationContext deserializationContext, a aVar, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = aVar.mapAbstractType(config, javaType);
        }
        fh2 fh2VarIntrospect = config.introspect(javaType);
        esd<Object> esdVarFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, fh2VarIntrospect.u());
        if (esdVarFindDeserializerFromAnnotation != null) {
            return esdVarFindDeserializerFromAnnotation;
        }
        JavaType javaTypeModifyTypeByAnnotation = modifyTypeByAnnotation(deserializationContext, fh2VarIntrospect.u(), javaType);
        if (javaTypeModifyTypeByAnnotation != javaType) {
            fh2VarIntrospect = config.introspect(javaTypeModifyTypeByAnnotation);
            javaType = javaTypeModifyTypeByAnnotation;
        }
        Class<?> clsM = fh2VarIntrospect.m();
        if (clsM != null) {
            return aVar.createBuilderBasedDeserializer(deserializationContext, javaType, fh2VarIntrospect, clsM);
        }
        ak4<Object, Object> ak4VarF = fh2VarIntrospect.f();
        if (ak4VarF == null) {
            return _createDeserializer2(deserializationContext, aVar, javaType, fh2VarIntrospect);
        }
        JavaType javaTypeA = ak4VarF.a(deserializationContext.getTypeFactory());
        if (!javaTypeA.hasRawClass(javaType.getRawClass())) {
            fh2VarIntrospect = config.introspect(javaTypeA);
        }
        return new StdDelegatingDeserializer(ak4VarF, javaTypeA, _createDeserializer2(deserializationContext, aVar, javaTypeA, fh2VarIntrospect));
    }

    public esd<?> _createDeserializer2(DeserializationContext deserializationContext, a aVar, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        JsonFormat.Value valueG;
        JsonFormat.Value valueG2;
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return aVar.createEnumDeserializer(deserializationContext, javaType, fh2Var);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return aVar.createArrayDeserializer(deserializationContext, (ArrayType) javaType, fh2Var);
            }
            if (javaType.isMapLikeType() && ((valueG2 = fh2Var.g(null)) == null || valueG2.getShape() != JsonFormat.Shape.OBJECT)) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                return mapLikeType.isTrueMapType() ? aVar.createMapDeserializer(deserializationContext, (MapType) mapLikeType, fh2Var) : aVar.createMapLikeDeserializer(deserializationContext, mapLikeType, fh2Var);
            }
            if (javaType.isCollectionLikeType() && ((valueG = fh2Var.g(null)) == null || valueG.getShape() != JsonFormat.Shape.OBJECT)) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                return collectionLikeType.isTrueCollectionType() ? aVar.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, fh2Var) : aVar.createCollectionLikeDeserializer(deserializationContext, collectionLikeType, fh2Var);
            }
        }
        if (javaType.isReferenceType()) {
            return aVar.createReferenceDeserializer(deserializationContext, (ReferenceType) javaType, fh2Var);
        }
        return zsd.class.isAssignableFrom(javaType.getRawClass()) ? aVar.createTreeDeserializer(config, javaType, fh2Var) : aVar.createBeanDeserializer(deserializationContext, javaType, fh2Var);
    }

    public esd<Object> _findCachedDeserializer(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        if (_hasCustomHandlers(javaType)) {
            return null;
        }
        return this._cachedDeserializers.get(javaType);
    }

    public vzd _handleUnknownKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return (vzd) deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }

    public esd<Object> _handleUnknownValueDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        if (h04.L(javaType.getRawClass())) {
            return (esd) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type " + javaType);
        }
        return (esd) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
    }

    public int cachedDeserializersCount() {
        return this._cachedDeserializers.size();
    }

    public ak4<Object, Object> findConverter(DeserializationContext deserializationContext, fd1 fd1Var) throws JsonMappingException {
        Object objFindDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(fd1Var);
        if (objFindDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(fd1Var, objFindDeserializationConverter);
    }

    public esd<Object> findConvertingDeserializer(DeserializationContext deserializationContext, fd1 fd1Var, esd<Object> esdVar) throws JsonMappingException {
        ak4<Object, Object> ak4VarFindConverter = findConverter(deserializationContext, fd1Var);
        return ak4VarFindConverter == null ? esdVar : new StdDelegatingDeserializer(ak4VarFindConverter, ak4VarFindConverter.a(deserializationContext.getTypeFactory()), esdVar);
    }

    public esd<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, fd1 fd1Var) throws JsonMappingException {
        Object objFindDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(fd1Var);
        if (objFindDeserializer == null) {
            return null;
        }
        return findConvertingDeserializer(deserializationContext, fd1Var, deserializationContext.deserializerInstance(fd1Var, objFindDeserializer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vzd findKeyDeserializer(DeserializationContext deserializationContext, a aVar, JavaType javaType) throws JsonMappingException {
        vzd vzdVarCreateKeyDeserializer = aVar.createKeyDeserializer(deserializationContext, javaType);
        if (vzdVarCreateKeyDeserializer == 0) {
            return _handleUnknownKeyDeserializer(deserializationContext, javaType);
        }
        if (vzdVarCreateKeyDeserializer instanceof bqk) {
            ((bqk) vzdVarCreateKeyDeserializer).resolve(deserializationContext);
        }
        return vzdVarCreateKeyDeserializer;
    }

    public esd<Object> findValueDeserializer(DeserializationContext deserializationContext, a aVar, JavaType javaType) throws JsonMappingException {
        esd<Object> esdVar_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (esdVar_findCachedDeserializer != null) {
            return esdVar_findCachedDeserializer;
        }
        esd<Object> esdVar_createAndCacheValueDeserializer = _createAndCacheValueDeserializer(deserializationContext, aVar, javaType);
        return esdVar_createAndCacheValueDeserializer == null ? _handleUnknownValueDeserializer(deserializationContext, javaType) : esdVar_createAndCacheValueDeserializer;
    }

    public void flushCachedDeserializers() {
        this._cachedDeserializers.clear();
    }

    public boolean hasValueDeserializerFor(DeserializationContext deserializationContext, a aVar, JavaType javaType) throws JsonMappingException {
        esd<Object> esdVar_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (esdVar_findCachedDeserializer == null) {
            esdVar_findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, aVar, javaType);
        }
        return esdVar_findCachedDeserializer != null;
    }

    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }
}
