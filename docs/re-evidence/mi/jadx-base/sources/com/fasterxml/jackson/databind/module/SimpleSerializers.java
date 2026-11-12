package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import defpackage.e5q;
import defpackage.eud;
import defpackage.fh2;
import defpackage.xwl;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleSerializers extends xwl.a implements Serializable {
    private static final long serialVersionUID = 8531646511998456779L;
    protected HashMap<ClassKey, eud<?>> _classMappings = null;
    protected HashMap<ClassKey, eud<?>> _interfaceMappings = null;
    protected boolean _hasEnumSerializer = false;

    public SimpleSerializers() {
    }

    public void _addSerializer(Class<?> cls, eud<?> eudVar) {
        ClassKey classKey = new ClassKey(cls);
        if (cls.isInterface()) {
            if (this._interfaceMappings == null) {
                this._interfaceMappings = new HashMap<>();
            }
            this._interfaceMappings.put(classKey, eudVar);
        } else {
            if (this._classMappings == null) {
                this._classMappings = new HashMap<>();
            }
            this._classMappings.put(classKey, eudVar);
            if (cls == Enum.class) {
                this._hasEnumSerializer = true;
            }
        }
    }

    public eud<?> _findInterfaceMapping(Class<?> cls, ClassKey classKey) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            classKey.reset(cls2);
            eud<?> eudVar = this._interfaceMappings.get(classKey);
            if (eudVar != null) {
                return eudVar;
            }
            eud<?> eudVar_findInterfaceMapping = _findInterfaceMapping(cls2, classKey);
            if (eudVar_findInterfaceMapping != null) {
                return eudVar_findInterfaceMapping;
            }
        }
        return null;
    }

    public void addSerializer(eud<?> eudVar) {
        Class<?> clsHandledType = eudVar.handledType();
        if (clsHandledType != null && clsHandledType != Object.class) {
            _addSerializer(clsHandledType, eudVar);
            return;
        }
        throw new IllegalArgumentException("JsonSerializer of type " + eudVar.getClass().getName() + " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'");
    }

    public void addSerializers(List<eud<?>> list) {
        Iterator<eud<?>> it = list.iterator();
        while (it.hasNext()) {
            addSerializer(it.next());
        }
    }

    @Override // xwl.a, defpackage.xwl
    public eud<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar) {
        return findSerializer(serializationConfig, arrayType, fh2Var);
    }

    @Override // xwl.a, defpackage.xwl
    public eud<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar) {
        return findSerializer(serializationConfig, collectionLikeType, fh2Var);
    }

    @Override // xwl.a, defpackage.xwl
    public eud<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, fh2 fh2Var, e5q e5qVar, eud<Object> eudVar) {
        return findSerializer(serializationConfig, collectionType, fh2Var);
    }

    @Override // xwl.a, defpackage.xwl
    public eud<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, fh2 fh2Var, eud<Object> eudVar, e5q e5qVar, eud<Object> eudVar2) {
        return findSerializer(serializationConfig, mapLikeType, fh2Var);
    }

    @Override // xwl.a, defpackage.xwl
    public eud<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, fh2 fh2Var, eud<Object> eudVar, e5q e5qVar, eud<Object> eudVar2) {
        return findSerializer(serializationConfig, mapType, fh2Var);
    }

    @Override // xwl.a, defpackage.xwl
    public eud<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, fh2 fh2Var) {
        eud<?> eudVar_findInterfaceMapping;
        eud<?> eudVar;
        Class<?> rawClass = javaType.getRawClass();
        ClassKey classKey = new ClassKey(rawClass);
        if (rawClass.isInterface()) {
            HashMap<ClassKey, eud<?>> map = this._interfaceMappings;
            if (map != null && (eudVar = map.get(classKey)) != null) {
                return eudVar;
            }
        } else {
            HashMap<ClassKey, eud<?>> map2 = this._classMappings;
            if (map2 != null) {
                eud<?> eudVar2 = map2.get(classKey);
                if (eudVar2 != null) {
                    return eudVar2;
                }
                if (this._hasEnumSerializer && javaType.isEnumType()) {
                    classKey.reset(Enum.class);
                    eud<?> eudVar3 = this._classMappings.get(classKey);
                    if (eudVar3 != null) {
                        return eudVar3;
                    }
                }
                for (Class<?> superclass = rawClass; superclass != null; superclass = superclass.getSuperclass()) {
                    classKey.reset(superclass);
                    eud<?> eudVar4 = this._classMappings.get(classKey);
                    if (eudVar4 != null) {
                        return eudVar4;
                    }
                }
            }
        }
        if (this._interfaceMappings == null) {
            return null;
        }
        eud<?> eudVar_findInterfaceMapping2 = _findInterfaceMapping(rawClass, classKey);
        if (eudVar_findInterfaceMapping2 != null) {
            return eudVar_findInterfaceMapping2;
        }
        if (rawClass.isInterface()) {
            return null;
        }
        do {
            rawClass = rawClass.getSuperclass();
            if (rawClass == null) {
                return null;
            }
            eudVar_findInterfaceMapping = _findInterfaceMapping(rawClass, classKey);
        } while (eudVar_findInterfaceMapping == null);
        return eudVar_findInterfaceMapping;
    }

    public SimpleSerializers(List<eud<?>> list) {
        addSerializers(list);
    }

    public <T> void addSerializer(Class<? extends T> cls, eud<T> eudVar) {
        _addSerializer(cls, eudVar);
    }
}
