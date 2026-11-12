package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import defpackage.esd;
import defpackage.fh2;
import defpackage.oz5;
import defpackage.q4q;
import defpackage.vzd;
import defpackage.zsd;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleDeserializers implements oz5, Serializable {
    private static final long serialVersionUID = 1;
    protected HashMap<ClassKey, esd<?>> _classMappings = null;
    protected boolean _hasEnumDeserializer = false;

    public SimpleDeserializers() {
    }

    private final esd<?> _find(JavaType javaType) {
        HashMap<ClassKey, esd<?>> map = this._classMappings;
        if (map == null) {
            return null;
        }
        return map.get(new ClassKey(javaType.getRawClass()));
    }

    public <T> void addDeserializer(Class<T> cls, esd<? extends T> esdVar) {
        ClassKey classKey = new ClassKey(cls);
        if (this._classMappings == null) {
            this._classMappings = new HashMap<>();
        }
        this._classMappings.put(classKey, esdVar);
        if (cls == Enum.class) {
            this._hasEnumDeserializer = true;
        }
    }

    public void addDeserializers(Map<Class<?>, esd<?>> map) {
        for (Map.Entry<Class<?>, esd<?>> entry : map.entrySet()) {
            addDeserializer(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.oz5
    public esd<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        return _find(arrayType);
    }

    @Override // defpackage.oz5
    public esd<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
        return _find(javaType);
    }

    @Override // defpackage.oz5
    public esd<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        return _find(collectionType);
    }

    @Override // defpackage.oz5
    public esd<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        return _find(collectionLikeType);
    }

    @Override // defpackage.oz5
    public esd<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
        HashMap<ClassKey, esd<?>> map = this._classMappings;
        if (map == null) {
            return null;
        }
        esd<?> esdVar = map.get(new ClassKey(cls));
        return (esdVar == null && this._hasEnumDeserializer && cls.isEnum()) ? this._classMappings.get(new ClassKey(Enum.class)) : esdVar;
    }

    @Override // defpackage.oz5
    public esd<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, fh2 fh2Var, vzd vzdVar, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        return _find(mapType);
    }

    @Override // defpackage.oz5
    public esd<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, fh2 fh2Var, vzd vzdVar, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        return _find(mapLikeType);
    }

    @Override // defpackage.oz5
    public esd<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        return _find(referenceType);
    }

    @Override // defpackage.oz5
    public esd<?> findTreeNodeDeserializer(Class<? extends zsd> cls, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
        HashMap<ClassKey, esd<?>> map = this._classMappings;
        if (map == null) {
            return null;
        }
        return map.get(new ClassKey(cls));
    }

    public SimpleDeserializers(Map<Class<?>, esd<?>> map) {
        addDeserializers(map);
    }
}
