package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import defpackage.abi;
import defpackage.ahp;
import defpackage.ym;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public abstract class JavaUtilCollectionsDeserializers {
    private static final Class<?> CLASS_AS_ARRAYS_LIST = Arrays.asList(null, null).getClass();
    private static final Class<?> CLASS_SINGLETON_LIST;
    private static final Class<?> CLASS_SINGLETON_MAP;
    private static final Class<?> CLASS_SINGLETON_SET;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST_ALIAS;
    private static final Class<?> CLASS_UNMODIFIABLE_MAP;
    private static final Class<?> CLASS_UNMODIFIABLE_SET;
    private static final String PREFIX_JAVA_UTIL_COLLECTIONS = "java.util.Collections$";
    public static final int TYPE_AS_LIST = 11;
    private static final int TYPE_SINGLETON_LIST = 2;
    private static final int TYPE_SINGLETON_MAP = 3;
    private static final int TYPE_SINGLETON_SET = 1;
    private static final int TYPE_SYNC_COLLECTION = 8;
    private static final int TYPE_SYNC_LIST = 9;
    private static final int TYPE_SYNC_MAP = 10;
    private static final int TYPE_SYNC_SET = 7;
    private static final int TYPE_UNMODIFIABLE_LIST = 5;
    private static final int TYPE_UNMODIFIABLE_MAP = 6;
    private static final int TYPE_UNMODIFIABLE_SET = 4;

    static {
        Set setSingleton = Collections.singleton(Boolean.TRUE);
        CLASS_SINGLETON_SET = setSingleton.getClass();
        CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(setSingleton).getClass();
        List listSingletonList = Collections.singletonList(Boolean.TRUE);
        CLASS_SINGLETON_LIST = listSingletonList.getClass();
        CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(listSingletonList).getClass();
        CLASS_UNMODIFIABLE_LIST_ALIAS = Collections.unmodifiableList(new LinkedList()).getClass();
        Map mapSingletonMap = Collections.singletonMap("a", "b");
        CLASS_SINGLETON_MAP = mapSingletonMap.getClass();
        CLASS_UNMODIFIABLE_MAP = Collections.unmodifiableMap(mapSingletonMap).getClass();
    }

    public static JsonDeserializer<?> findForCollection(DeserializationContext deserializationContext, JavaType javaType) throws ym {
        b bVarConverter;
        if (javaType.hasRawClass(CLASS_AS_ARRAYS_LIST)) {
            bVarConverter = converter(11, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_LIST)) {
            bVarConverter = converter(2, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_SET)) {
            bVarConverter = converter(1, javaType, Set.class);
        } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST) || javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST_ALIAS)) {
            bVarConverter = converter(5, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_SET)) {
            bVarConverter = converter(4, javaType, Set.class);
        } else {
            String str_findUtilSyncTypeName = _findUtilSyncTypeName(javaType.getRawClass());
            if (str_findUtilSyncTypeName.endsWith("Set")) {
                bVarConverter = converter(7, javaType, Set.class);
            } else if (str_findUtilSyncTypeName.endsWith("List")) {
                bVarConverter = converter(9, javaType, List.class);
            } else {
                if (!str_findUtilSyncTypeName.endsWith("Collection")) {
                    return null;
                }
                bVarConverter = converter(8, javaType, Collection.class);
            }
        }
        return new abi(bVarConverter);
    }

    public static JsonDeserializer<?> findForMap(DeserializationContext deserializationContext, JavaType javaType) throws ym {
        b bVarConverter;
        if (javaType.hasRawClass(CLASS_SINGLETON_MAP)) {
            bVarConverter = converter(3, javaType, Map.class);
        } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_MAP)) {
            bVarConverter = converter(6, javaType, Map.class);
        } else {
            if (!_findUtilSyncTypeName(javaType.getRawClass()).endsWith("Map")) {
                return null;
            }
            bVarConverter = converter(10, javaType, Map.class);
        }
        return new abi(bVarConverter);
    }

    static b converter(int i, JavaType javaType, Class<?> cls) {
        return new b(i, javaType.findSuperType(cls));
    }

    private static String _findUtilSyncTypeName(Class<?> cls) {
        String str_findUtilCollectionsTypeName = _findUtilCollectionsTypeName(cls);
        if (str_findUtilCollectionsTypeName != null && str_findUtilCollectionsTypeName.startsWith("Synchronized")) {
            return str_findUtilCollectionsTypeName.substring(12);
        }
        return "";
    }

    private static String _findUtilCollectionsTypeName(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith(PREFIX_JAVA_UTIL_COLLECTIONS)) {
            return name.substring(22);
        }
        return "";
    }

    static class b implements Converter<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f4117a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JavaType f4118c;

        b(int i, JavaType javaType) {
            this.f4118c = javaType;
            this.f4117a = i;
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f4117a) {
                case 1:
                    Set set = (Set) obj;
                    d(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    d(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    d(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public JavaType getInputType(ahp ahpVar) {
            return this.f4118c;
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public JavaType getOutputType(ahp ahpVar) {
            return this.f4118c;
        }

        private void d(int i) {
            if (i == 1) {
                return;
            }
            throw new IllegalArgumentException("Can not deserialize Singleton container from " + i + " entries");
        }
    }
}
