package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.fh2;
import defpackage.h04;
import defpackage.lgh;
import defpackage.mtd;
import defpackage.uf2;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class BasicClassIntrospector extends f implements Serializable {
    protected static final uf2 BOOLEAN_DESC;
    protected static final uf2 INT_DESC;
    protected static final uf2 LONG_DESC;
    protected static final uf2 STRING_DESC = uf2.I(null, SimpleType.constructUnsafe(String.class), b.e(String.class));
    private static final long serialVersionUID = 1;
    protected final LRUMap<JavaType, uf2> _cachedFCA = new LRUMap<>(16, 64);

    static {
        Class cls = Boolean.TYPE;
        BOOLEAN_DESC = uf2.I(null, SimpleType.constructUnsafe(cls), b.e(cls));
        Class cls2 = Integer.TYPE;
        INT_DESC = uf2.I(null, SimpleType.constructUnsafe(cls2), b.e(cls2));
        Class cls3 = Long.TYPE;
        LONG_DESC = uf2.I(null, SimpleType.constructUnsafe(cls3), b.e(cls3));
    }

    public uf2 _findStdJdkCollectionDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (_isStdJDKCollection(javaType)) {
            return uf2.I(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, mapperConfig));
        }
        return null;
    }

    public uf2 _findStdTypeDesc(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (!rawClass.isPrimitive()) {
            if (rawClass == String.class) {
                return STRING_DESC;
            }
            return null;
        }
        if (rawClass == Boolean.TYPE) {
            return BOOLEAN_DESC;
        }
        if (rawClass == Integer.TYPE) {
            return INT_DESC;
        }
        if (rawClass == Long.TYPE) {
            return LONG_DESC;
        }
        return null;
    }

    public boolean _isStdJDKCollection(JavaType javaType) {
        Class<?> rawClass;
        String strG;
        return javaType.isContainerType() && !javaType.isArrayType() && (strG = h04.G((rawClass = javaType.getRawClass()))) != null && (strG.startsWith("java.lang") || strG.startsWith("java.util")) && (Collection.class.isAssignableFrom(rawClass) || Map.class.isAssignableFrom(rawClass));
    }

    public a _resolveAnnotatedClass(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar) {
        return b.f(mapperConfig, javaType, aVar);
    }

    public a _resolveAnnotatedWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar) {
        return b.j(mapperConfig, javaType, aVar);
    }

    public lgh collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar, boolean z, String str) {
        return constructPropertyCollector(mapperConfig, _resolveAnnotatedClass(mapperConfig, javaType, aVar), javaType, z, str);
    }

    public lgh collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar, boolean z) {
        a aVar_resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, aVar);
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        mtd.a aVarFindPOJOBuilderConfig = annotationIntrospector != null ? annotationIntrospector.findPOJOBuilderConfig(aVar_resolveAnnotatedClass) : null;
        return constructPropertyCollector(mapperConfig, aVar_resolveAnnotatedClass, javaType, z, aVarFindPOJOBuilderConfig == null ? "with" : aVarFindPOJOBuilderConfig.f27182b);
    }

    public lgh constructPropertyCollector(MapperConfig<?> mapperConfig, a aVar, JavaType javaType, boolean z, String str) {
        return new lgh(mapperConfig, z, javaType, aVar, str);
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public f copy() {
        return new BasicClassIntrospector();
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public /* bridge */ /* synthetic */ fh2 forClassAnnotations(MapperConfig mapperConfig, JavaType javaType, f.a aVar) {
        return forClassAnnotations((MapperConfig<?>) mapperConfig, javaType, aVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public uf2 forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, f.a aVar) {
        uf2 uf2VarH = uf2.H(collectPropertiesWithBuilder(deserializationConfig, javaType, aVar, false));
        this._cachedFCA.putIfAbsent(javaType, uf2VarH);
        return uf2VarH;
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public /* bridge */ /* synthetic */ fh2 forDirectClassAnnotations(MapperConfig mapperConfig, JavaType javaType, f.a aVar) {
        return forDirectClassAnnotations((MapperConfig<?>) mapperConfig, javaType, aVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public uf2 forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar) {
        uf2 uf2Var_findStdTypeDesc = _findStdTypeDesc(javaType);
        if (uf2Var_findStdTypeDesc != null) {
            return uf2Var_findStdTypeDesc;
        }
        uf2 uf2Var = this._cachedFCA.get(javaType);
        if (uf2Var != null) {
            return uf2Var;
        }
        uf2 uf2VarI = uf2.I(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, aVar));
        this._cachedFCA.put(javaType, uf2VarI);
        return uf2VarI;
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public uf2 forCreation(DeserializationConfig deserializationConfig, JavaType javaType, f.a aVar) {
        uf2 uf2Var_findStdTypeDesc = _findStdTypeDesc(javaType);
        if (uf2Var_findStdTypeDesc != null) {
            return uf2Var_findStdTypeDesc;
        }
        uf2 uf2Var_findStdJdkCollectionDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
        return uf2Var_findStdJdkCollectionDesc == null ? uf2.H(collectProperties(deserializationConfig, javaType, aVar, false, CourseConfigModel.DevCmd.CMD_ACTION_SET)) : uf2Var_findStdJdkCollectionDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public uf2 forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, f.a aVar) {
        uf2 uf2Var_findStdTypeDesc = _findStdTypeDesc(javaType);
        if (uf2Var_findStdTypeDesc == null) {
            uf2Var_findStdTypeDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
            if (uf2Var_findStdTypeDesc == null) {
                uf2Var_findStdTypeDesc = uf2.H(collectProperties(deserializationConfig, javaType, aVar, false, CourseConfigModel.DevCmd.CMD_ACTION_SET));
            }
            this._cachedFCA.putIfAbsent(javaType, uf2Var_findStdTypeDesc);
        }
        return uf2Var_findStdTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public uf2 forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar) {
        uf2 uf2Var_findStdTypeDesc = _findStdTypeDesc(javaType);
        return uf2Var_findStdTypeDesc == null ? uf2.I(mapperConfig, javaType, _resolveAnnotatedWithoutSuperTypes(mapperConfig, javaType, aVar)) : uf2Var_findStdTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.f
    public uf2 forSerialization(SerializationConfig serializationConfig, JavaType javaType, f.a aVar) {
        uf2 uf2Var_findStdTypeDesc = _findStdTypeDesc(javaType);
        if (uf2Var_findStdTypeDesc == null) {
            uf2Var_findStdTypeDesc = _findStdJdkCollectionDesc(serializationConfig, javaType);
            if (uf2Var_findStdTypeDesc == null) {
                uf2Var_findStdTypeDesc = uf2.J(collectProperties(serializationConfig, javaType, aVar, true, CourseConfigModel.DevCmd.CMD_ACTION_SET));
            }
            this._cachedFCA.putIfAbsent(javaType, uf2Var_findStdTypeDesc);
        }
        return uf2Var_findStdTypeDesc;
    }
}
