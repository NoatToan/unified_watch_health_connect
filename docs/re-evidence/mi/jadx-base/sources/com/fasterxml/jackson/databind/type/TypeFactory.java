package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;
import defpackage.f04;
import defpackage.h04;
import defpackage.ij1;
import defpackage.u4q;
import defpackage.z4q;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeFactory implements Serializable {
    private static final Class<?> CLS_BOOL;
    private static final Class<?> CLS_INT;
    private static final Class<?> CLS_LONG;
    protected static final SimpleType CORE_TYPE_BOOL;
    protected static final SimpleType CORE_TYPE_CLASS;
    protected static final SimpleType CORE_TYPE_COMPARABLE;
    protected static final SimpleType CORE_TYPE_ENUM;
    protected static final SimpleType CORE_TYPE_INT;
    protected static final SimpleType CORE_TYPE_LONG;
    protected static final SimpleType CORE_TYPE_OBJECT;
    protected static final SimpleType CORE_TYPE_STRING;
    private static final long serialVersionUID = 1;
    protected final ClassLoader _classLoader;
    protected final u4q[] _modifiers;
    protected final TypeParser _parser;
    protected final LRUMap<Object, JavaType> _typeCache;
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected static final TypeFactory instance = new TypeFactory();
    protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();
    private static final Class<?> CLS_STRING = String.class;
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Class<?> CLS_COMPARABLE = Comparable.class;
    private static final Class<?> CLS_CLASS = Class.class;
    private static final Class<?> CLS_ENUM = Enum.class;

    static {
        Class<?> cls = Boolean.TYPE;
        CLS_BOOL = cls;
        Class<?> cls2 = Integer.TYPE;
        CLS_INT = cls2;
        Class<?> cls3 = Long.TYPE;
        CLS_LONG = cls3;
        CORE_TYPE_BOOL = new SimpleType(cls);
        CORE_TYPE_INT = new SimpleType(cls2);
        CORE_TYPE_LONG = new SimpleType(cls3);
        CORE_TYPE_STRING = new SimpleType((Class<?>) String.class);
        CORE_TYPE_OBJECT = new SimpleType((Class<?>) Object.class);
        CORE_TYPE_COMPARABLE = new SimpleType((Class<?>) Comparable.class);
        CORE_TYPE_ENUM = new SimpleType((Class<?>) Enum.class);
        CORE_TYPE_CLASS = new SimpleType((Class<?>) Class.class);
    }

    private TypeFactory() {
        this(null);
    }

    private TypeBindings _bindingsForSubtype(JavaType javaType, int i, Class<?> cls) {
        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[i];
        for (int i2 = 0; i2 < i; i2++) {
            placeholderForTypeArr[i2] = new PlaceholderForType(i2);
        }
        JavaType javaTypeFindSuperType = _fromClass(null, cls, TypeBindings.create(cls, placeholderForTypeArr)).findSuperType(javaType.getRawClass());
        if (javaTypeFindSuperType == null) {
            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", javaType.getRawClass().getName(), cls.getName()));
        }
        String str_resolveTypePlaceholders = _resolveTypePlaceholders(javaType, javaTypeFindSuperType);
        if (str_resolveTypePlaceholders == null) {
            JavaType[] javaTypeArr = new JavaType[i];
            for (int i3 = 0; i3 < i; i3++) {
                JavaType javaTypeActualType = placeholderForTypeArr[i3].actualType();
                if (javaTypeActualType == null) {
                    javaTypeActualType = unknownType();
                }
                javaTypeArr[i3] = javaTypeActualType;
            }
            return TypeBindings.create(cls, javaTypeArr);
        }
        throw new IllegalArgumentException("Failed to specialize base type " + javaType.toCanonical() + " as " + cls.getName() + ", problem: " + str_resolveTypePlaceholders);
    }

    private JavaType _collectionType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType_unknownType = _unknownType();
        } else {
            if (typeParameters.size() != 1) {
                throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
            }
            javaType_unknownType = typeParameters.get(0);
        }
        return CollectionType.construct(cls, typeBindings, javaType, javaTypeArr, javaType_unknownType);
    }

    private JavaType _mapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        JavaType javaType2;
        JavaType javaType3;
        if (cls != Properties.class) {
            List<JavaType> typeParameters = typeBindings.getTypeParameters();
            int size = typeParameters.size();
            if (size == 0) {
                javaType_unknownType = _unknownType();
            } else {
                if (size != 2) {
                    throw new IllegalArgumentException("Strange Map type " + cls.getName() + ": cannot determine type parameters");
                }
                JavaType javaType4 = typeParameters.get(0);
                javaType2 = typeParameters.get(1);
                javaType3 = javaType4;
            }
            return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
        }
        javaType_unknownType = CORE_TYPE_STRING;
        javaType3 = javaType_unknownType;
        javaType2 = javaType3;
        return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
    }

    private JavaType _referenceType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType_unknownType = _unknownType();
        } else {
            if (typeParameters.size() != 1) {
                throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
            }
            javaType_unknownType = typeParameters.get(0);
        }
        return ReferenceType.construct(cls, typeBindings, javaType, javaTypeArr, javaType_unknownType);
    }

    private String _resolveTypePlaceholders(JavaType javaType, JavaType javaType2) throws IllegalArgumentException {
        List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
        List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
        int size = typeParameters.size();
        for (int i = 0; i < size; i++) {
            JavaType javaType3 = typeParameters.get(i);
            JavaType javaType4 = typeParameters2.get(i);
            if (!_verifyAndResolvePlaceholders(javaType3, javaType4) && !javaType3.hasRawClass(Object.class) && ((i != 0 || !javaType.hasRawClass(Map.class) || !javaType4.hasRawClass(Object.class)) && (!javaType3.isInterface() || !javaType3.isTypeOrSuperTypeOf(javaType4.getRawClass())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i + 1), Integer.valueOf(size), javaType3.toCanonical(), javaType4.toCanonical());
            }
        }
        return null;
    }

    private boolean _verifyAndResolvePlaceholders(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).actualType(javaType);
            return true;
        }
        if (javaType.getRawClass() != javaType2.getRawClass()) {
            return false;
        }
        List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
        List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
        int size = typeParameters.size();
        for (int i = 0; i < size; i++) {
            if (!_verifyAndResolvePlaceholders(typeParameters.get(i), typeParameters2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public static Class<?> rawClass(Type type) {
        return type instanceof Class ? (Class) type : defaultInstance().constructType(type).getRawClass();
    }

    public static JavaType unknownType() {
        return defaultInstance()._unknownType();
    }

    public JavaType _constructSimple(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_findWellKnownSimple;
        return (!typeBindings.isEmpty() || (javaType_findWellKnownSimple = _findWellKnownSimple(cls)) == null) ? _newSimpleType(cls, typeBindings, javaType, javaTypeArr) : javaType_findWellKnownSimple;
    }

    public Class<?> _findPrimitive(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    public JavaType _findWellKnownSimple(Class<?> cls) {
        if (!cls.isPrimitive()) {
            if (cls == CLS_STRING) {
                return CORE_TYPE_STRING;
            }
            if (cls == CLS_OBJECT) {
                return CORE_TYPE_OBJECT;
            }
            return null;
        }
        if (cls == CLS_BOOL) {
            return CORE_TYPE_BOOL;
        }
        if (cls == CLS_INT) {
            return CORE_TYPE_INT;
        }
        if (cls == CLS_LONG) {
            return CORE_TYPE_LONG;
        }
        return null;
    }

    public JavaType _fromAny(f04 f04Var, Type type, TypeBindings typeBindings) {
        JavaType javaType_fromWildcard;
        if (type instanceof Class) {
            javaType_fromWildcard = _fromClass(f04Var, (Class) type, EMPTY_BINDINGS);
        } else if (type instanceof ParameterizedType) {
            javaType_fromWildcard = _fromParamType(f04Var, (ParameterizedType) type, typeBindings);
        } else {
            if (type instanceof JavaType) {
                return (JavaType) type;
            }
            if (type instanceof GenericArrayType) {
                javaType_fromWildcard = _fromArrayType(f04Var, (GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                javaType_fromWildcard = _fromVariable(f04Var, (TypeVariable) type, typeBindings);
            } else {
                if (!(type instanceof WildcardType)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unrecognized Type: ");
                    sb.append(type == null ? "[null]" : type.toString());
                    throw new IllegalArgumentException(sb.toString());
                }
                javaType_fromWildcard = _fromWildcard(f04Var, (WildcardType) type, typeBindings);
            }
        }
        if (this._modifiers != null) {
            TypeBindings bindings = javaType_fromWildcard.getBindings();
            if (bindings == null) {
                bindings = EMPTY_BINDINGS;
            }
            u4q[] u4qVarArr = this._modifiers;
            int length = u4qVarArr.length;
            int i = 0;
            while (i < length) {
                u4q u4qVar = u4qVarArr[i];
                JavaType javaTypeA = u4qVar.a(javaType_fromWildcard, type, bindings, this);
                if (javaTypeA == null) {
                    throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", u4qVar, u4qVar.getClass().getName(), javaType_fromWildcard));
                }
                i++;
                javaType_fromWildcard = javaTypeA;
            }
        }
        return javaType_fromWildcard;
    }

    public JavaType _fromArrayType(f04 f04Var, GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.construct(_fromAny(f04Var, genericArrayType.getGenericComponentType(), typeBindings), typeBindings);
    }

    public JavaType _fromClass(f04 f04Var, Class<?> cls, TypeBindings typeBindings) {
        f04 f04VarB;
        JavaType javaType_resolveSuperClass;
        JavaType[] javaTypeArr_resolveSuperInterfaces;
        JavaType javaType_newSimpleType;
        JavaType javaType_findWellKnownSimple = _findWellKnownSimple(cls);
        if (javaType_findWellKnownSimple != null) {
            return javaType_findWellKnownSimple;
        }
        Object objAsKey = (typeBindings == null || typeBindings.isEmpty()) ? cls : typeBindings.asKey(cls);
        JavaType javaTypeRefine = this._typeCache.get(objAsKey);
        if (javaTypeRefine != null) {
            return javaTypeRefine;
        }
        if (f04Var == null) {
            f04VarB = new f04(cls);
        } else {
            f04 f04VarC = f04Var.c(cls);
            if (f04VarC != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, EMPTY_BINDINGS);
                f04VarC.a(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            f04VarB = f04Var.b(cls);
        }
        if (cls.isArray()) {
            javaType_newSimpleType = ArrayType.construct(_fromAny(f04VarB, cls.getComponentType(), typeBindings), typeBindings);
        } else {
            if (cls.isInterface()) {
                javaTypeArr_resolveSuperInterfaces = _resolveSuperInterfaces(f04VarB, cls, typeBindings);
                javaType_resolveSuperClass = null;
            } else {
                javaType_resolveSuperClass = _resolveSuperClass(f04VarB, cls, typeBindings);
                javaTypeArr_resolveSuperInterfaces = _resolveSuperInterfaces(f04VarB, cls, typeBindings);
            }
            JavaType[] javaTypeArr = javaTypeArr_resolveSuperInterfaces;
            JavaType javaType = javaType_resolveSuperClass;
            if (cls == Properties.class) {
                SimpleType simpleType = CORE_TYPE_STRING;
                javaTypeRefine = MapType.construct(cls, typeBindings, javaType, javaTypeArr, simpleType, simpleType);
            } else if (javaType != null) {
                javaTypeRefine = javaType.refine(cls, typeBindings, javaType, javaTypeArr);
            }
            javaType_newSimpleType = (javaTypeRefine == null && (javaTypeRefine = _fromWellKnownClass(f04VarB, cls, typeBindings, javaType, javaTypeArr)) == null && (javaTypeRefine = _fromWellKnownInterface(f04VarB, cls, typeBindings, javaType, javaTypeArr)) == null) ? _newSimpleType(cls, typeBindings, javaType, javaTypeArr) : javaTypeRefine;
        }
        f04VarB.d(javaType_newSimpleType);
        if (!javaType_newSimpleType.hasHandlers()) {
            this._typeCache.putIfAbsent(objAsKey, javaType_newSimpleType);
        }
        return javaType_newSimpleType;
    }

    public JavaType _fromParamType(f04 f04Var, ParameterizedType parameterizedType, TypeBindings typeBindings) {
        TypeBindings typeBindingsCreate;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == CLS_ENUM) {
            return CORE_TYPE_ENUM;
        }
        if (cls == CLS_COMPARABLE) {
            return CORE_TYPE_COMPARABLE;
        }
        if (cls == CLS_CLASS) {
            return CORE_TYPE_CLASS;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            typeBindingsCreate = EMPTY_BINDINGS;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i = 0; i < length; i++) {
                javaTypeArr[i] = _fromAny(f04Var, actualTypeArguments[i], typeBindings);
            }
            typeBindingsCreate = TypeBindings.create(cls, javaTypeArr);
        }
        return _fromClass(f04Var, cls, typeBindingsCreate);
    }

    public JavaType _fromVariable(f04 f04Var, TypeVariable<?> typeVariable, TypeBindings typeBindings) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (typeBindings == null) {
            throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
        }
        JavaType javaTypeFindBoundType = typeBindings.findBoundType(name);
        if (javaTypeFindBoundType != null) {
            return javaTypeFindBoundType;
        }
        if (typeBindings.hasUnbound(name)) {
            return CORE_TYPE_OBJECT;
        }
        TypeBindings typeBindingsWithUnboundVariable = typeBindings.withUnboundVariable(name);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return _fromAny(f04Var, bounds[0], typeBindingsWithUnboundVariable);
    }

    public JavaType _fromWellKnownClass(f04 f04Var, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings == null) {
            typeBindings = EMPTY_BINDINGS;
        }
        if (cls == Map.class) {
            return _mapType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return _collectionType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return _referenceType(cls, typeBindings, javaType, javaTypeArr);
        }
        return null;
    }

    public JavaType _fromWellKnownInterface(f04 f04Var, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType javaTypeRefine = javaType2.refine(cls, typeBindings, javaType, javaTypeArr);
            if (javaTypeRefine != null) {
                return javaTypeRefine;
            }
        }
        return null;
    }

    public JavaType _fromWildcard(f04 f04Var, WildcardType wildcardType, TypeBindings typeBindings) {
        return _fromAny(f04Var, wildcardType.getUpperBounds()[0], typeBindings);
    }

    public JavaType _newSimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    public JavaType _resolveSuperClass(f04 f04Var, Class<?> cls, TypeBindings typeBindings) {
        Type typeE = h04.E(cls);
        if (typeE == null) {
            return null;
        }
        return _fromAny(f04Var, typeE, typeBindings);
    }

    public JavaType[] _resolveSuperInterfaces(f04 f04Var, Class<?> cls, TypeBindings typeBindings) {
        Type[] typeArrD = h04.D(cls);
        if (typeArrD == null || typeArrD.length == 0) {
            return NO_TYPES;
        }
        int length = typeArrD.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i = 0; i < length; i++) {
            javaTypeArr[i] = _fromAny(f04Var, typeArrD[i], typeBindings);
        }
        return javaTypeArr;
    }

    public JavaType _unknownType() {
        return CORE_TYPE_OBJECT;
    }

    public Class<?> classForName(String str, boolean z, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public void clearCache() {
        this._typeCache.clear();
    }

    public ArrayType constructArrayType(Class<?> cls) {
        return ArrayType.construct(_fromAny(null, cls, null), null);
    }

    public CollectionLikeType constructCollectionLikeType(Class<?> cls, Class<?> cls2) {
        return constructCollectionLikeType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public JavaType constructFromCanonical(String str) throws IllegalArgumentException {
        return this._parser.parse(str);
    }

    public JavaType constructGeneralizedType(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType javaTypeFindSuperType = javaType.findSuperType(cls);
        if (javaTypeFindSuperType != null) {
            return javaTypeFindSuperType;
        }
        if (cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
    }

    public MapLikeType constructMapLikeType(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        TypeBindings typeBindings = EMPTY_BINDINGS;
        return constructMapLikeType(cls, _fromClass(null, cls2, typeBindings), _fromClass(null, cls3, typeBindings));
    }

    public MapType constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType javaType_fromClass;
        JavaType javaType_fromClass2;
        if (cls == Properties.class) {
            javaType_fromClass = CORE_TYPE_STRING;
            javaType_fromClass2 = javaType_fromClass;
        } else {
            TypeBindings typeBindings = EMPTY_BINDINGS;
            javaType_fromClass = _fromClass(null, cls2, typeBindings);
            javaType_fromClass2 = _fromClass(null, cls3, typeBindings);
        }
        return constructMapType(cls, javaType_fromClass, javaType_fromClass2);
    }

    public JavaType constructParametricType(Class<?> cls, Class<?>... clsArr) {
        int length = clsArr.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i = 0; i < length; i++) {
            javaTypeArr[i] = _fromClass(null, clsArr[i], EMPTY_BINDINGS);
        }
        return constructParametricType(cls, javaTypeArr);
    }

    @Deprecated
    public JavaType constructParametrizedType(Class<?> cls, Class<?> cls2, JavaType... javaTypeArr) {
        return constructParametricType(cls, javaTypeArr);
    }

    public CollectionLikeType constructRawCollectionLikeType(Class<?> cls) {
        return constructCollectionLikeType(cls, unknownType());
    }

    public CollectionType constructRawCollectionType(Class<? extends Collection> cls) {
        return constructCollectionType(cls, unknownType());
    }

    public MapLikeType constructRawMapLikeType(Class<?> cls) {
        return constructMapLikeType(cls, unknownType(), unknownType());
    }

    public MapType constructRawMapType(Class<? extends Map> cls) {
        return constructMapType(cls, unknownType(), unknownType());
    }

    public JavaType constructReferenceType(Class<?> cls, JavaType javaType) {
        return ReferenceType.construct(cls, null, null, null, javaType);
    }

    public JavaType constructSimpleType(Class<?> cls, JavaType[] javaTypeArr) {
        return _fromClass(null, cls, TypeBindings.create(cls, javaTypeArr));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        int length;
        JavaType javaType_fromClass;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        if (rawClass == Object.class) {
            javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
        } else {
            if (!rawClass.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format("Class %s not subtype of %s", cls.getName(), javaType));
            }
            if (javaType.getBindings().isEmpty()) {
                javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
            } else if (!javaType.isContainerType()) {
                length = cls.getTypeParameters().length;
                if (length == 0) {
                    javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
                } else {
                    javaType_fromClass = _fromClass(null, cls, _bindingsForSubtype(javaType, length, cls));
                }
            } else if (javaType.isMapLikeType()) {
                if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                    javaType_fromClass = _fromClass(null, cls, TypeBindings.create(cls, javaType.getKeyType(), javaType.getContentType()));
                } else {
                    length = cls.getTypeParameters().length;
                    if (length == 0) {
                        javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
                    } else {
                        javaType_fromClass = _fromClass(null, cls, _bindingsForSubtype(javaType, length, cls));
                    }
                }
            } else if (!javaType.isCollectionLikeType()) {
                length = cls.getTypeParameters().length;
                if (length == 0) {
                    javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
                } else {
                    javaType_fromClass = _fromClass(null, cls, _bindingsForSubtype(javaType, length, cls));
                }
            } else if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                javaType_fromClass = _fromClass(null, cls, TypeBindings.create(cls, javaType.getContentType()));
            } else {
                if (rawClass == EnumSet.class) {
                    return javaType;
                }
                length = cls.getTypeParameters().length;
                if (length == 0) {
                    javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
                } else {
                    javaType_fromClass = _fromClass(null, cls, _bindingsForSubtype(javaType, length, cls));
                }
            }
        }
        return javaType_fromClass.withHandlersFrom(javaType);
    }

    public JavaType constructType(z4q<?> z4qVar) {
        throw null;
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        Throwable thH;
        Class<?> cls_findPrimitive;
        if (str.indexOf(46) < 0 && (cls_findPrimitive = _findPrimitive(str)) != null) {
            return cls_findPrimitive;
        }
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return classForName(str, true, classLoader);
            } catch (Exception e) {
                thH = h04.H(e);
            }
        } else {
            thH = null;
        }
        try {
            return classForName(str);
        } catch (Exception e2) {
            if (thH == null) {
                thH = h04.H(e2);
            }
            h04.f0(thH);
            throw new ClassNotFoundException(thH.getMessage(), thH);
        }
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class<?> cls) {
        JavaType javaTypeFindSuperType = javaType.findSuperType(cls);
        return javaTypeFindSuperType == null ? NO_TYPES : javaTypeFindSuperType.getBindings().typeParameterArray();
    }

    public ClassLoader getClassLoader() {
        return this._classLoader;
    }

    public JavaType moreSpecificType(JavaType javaType, JavaType javaType2) {
        Class<?> rawClass;
        Class<?> rawClass2;
        if (javaType == null) {
            return javaType2;
        }
        return (javaType2 == null || (rawClass = javaType.getRawClass()) == (rawClass2 = javaType2.getRawClass()) || !rawClass.isAssignableFrom(rawClass2)) ? javaType : javaType2;
    }

    @Deprecated
    public JavaType uncheckedSimpleType(Class<?> cls) {
        return _constructSimple(cls, EMPTY_BINDINGS, null, null);
    }

    public TypeFactory withCache(LRUMap<Object, JavaType> lRUMap) {
        return new TypeFactory(lRUMap, this._parser, this._modifiers, this._classLoader);
    }

    public TypeFactory withClassLoader(ClassLoader classLoader) {
        return new TypeFactory(this._typeCache, this._parser, this._modifiers, classLoader);
    }

    public TypeFactory withModifier(u4q u4qVar) {
        u4q[] u4qVarArr;
        LRUMap<Object, JavaType> lRUMap = this._typeCache;
        if (u4qVar == null) {
            lRUMap = null;
            u4qVarArr = null;
        } else {
            u4q[] u4qVarArr2 = this._modifiers;
            u4qVarArr = u4qVarArr2 == null ? new u4q[]{u4qVar} : (u4q[]) ij1.j(u4qVarArr2, u4qVar);
        }
        return new TypeFactory(lRUMap, this._parser, u4qVarArr, this._classLoader);
    }

    public TypeFactory(LRUMap<Object, JavaType> lRUMap) {
        this._typeCache = lRUMap == null ? new LRUMap<>(16, 200) : lRUMap;
        this._parser = new TypeParser(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    public Class<?> classForName(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public ArrayType constructArrayType(JavaType javaType) {
        return ArrayType.construct(javaType, null);
    }

    @Deprecated
    public JavaType constructParametrizedType(Class<?> cls, Class<?> cls2, Class<?>... clsArr) {
        return constructParametricType(cls, clsArr);
    }

    @Deprecated
    public JavaType constructSimpleType(Class<?> cls, Class<?> cls2, JavaType[] javaTypeArr) {
        return constructSimpleType(cls, javaTypeArr);
    }

    public JavaType constructType(Type type) {
        return _fromAny(null, type, EMPTY_BINDINGS);
    }

    public CollectionLikeType constructCollectionLikeType(Class<?> cls, JavaType javaType) {
        JavaType javaType_fromClass = _fromClass(null, cls, TypeBindings.createIfNeeded(cls, javaType));
        if (javaType_fromClass instanceof CollectionLikeType) {
            return (CollectionLikeType) javaType_fromClass;
        }
        return CollectionLikeType.upgradeFrom(javaType_fromClass, javaType);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, JavaType javaType) {
        TypeBindings typeBindingsCreateIfNeeded = TypeBindings.createIfNeeded(cls, javaType);
        CollectionType collectionType = (CollectionType) _fromClass(null, cls, typeBindingsCreateIfNeeded);
        if (typeBindingsCreateIfNeeded.isEmpty() && javaType != null) {
            JavaType contentType = collectionType.findSuperType(Collection.class).getContentType();
            if (!contentType.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", h04.T(cls), javaType, contentType));
            }
        }
        return collectionType;
    }

    public JavaType constructType(Type type, TypeBindings typeBindings) {
        return _fromAny(null, type, typeBindings);
    }

    @Deprecated
    public JavaType[] findTypeParameters(Class<?> cls, Class<?> cls2, TypeBindings typeBindings) {
        return findTypeParameters(constructType(cls, typeBindings), cls2);
    }

    public MapLikeType constructMapLikeType(Class<?> cls, JavaType javaType, JavaType javaType2) {
        JavaType javaType_fromClass = _fromClass(null, cls, TypeBindings.createIfNeeded(cls, new JavaType[]{javaType, javaType2}));
        if (javaType_fromClass instanceof MapLikeType) {
            return (MapLikeType) javaType_fromClass;
        }
        return MapLikeType.upgradeFrom(javaType_fromClass, javaType, javaType2);
    }

    public JavaType constructParametricType(Class<?> cls, JavaType... javaTypeArr) {
        return _fromClass(null, cls, TypeBindings.create(cls, javaTypeArr));
    }

    @Deprecated
    public JavaType constructType(Type type, Class<?> cls) {
        return constructType(type, cls == null ? null : constructType(cls));
    }

    @Deprecated
    public JavaType[] findTypeParameters(Class<?> cls, Class<?> cls2) {
        return findTypeParameters(constructType(cls), cls2);
    }

    public MapType constructMapType(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings typeBindingsCreateIfNeeded = TypeBindings.createIfNeeded(cls, new JavaType[]{javaType, javaType2});
        MapType mapType = (MapType) _fromClass(null, cls, typeBindingsCreateIfNeeded);
        if (typeBindingsCreateIfNeeded.isEmpty()) {
            JavaType javaTypeFindSuperType = mapType.findSuperType(Map.class);
            JavaType keyType = javaTypeFindSuperType.getKeyType();
            if (keyType.equals(javaType)) {
                JavaType contentType = javaTypeFindSuperType.getContentType();
                if (!contentType.equals(javaType2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", h04.T(cls), javaType2, contentType));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", h04.T(cls), javaType, keyType));
            }
        }
        return mapType;
    }

    @Deprecated
    public JavaType constructType(Type type, JavaType javaType) {
        TypeBindings bindings;
        if (javaType == null) {
            bindings = EMPTY_BINDINGS;
        } else {
            TypeBindings bindings2 = javaType.getBindings();
            if (type.getClass() != Class.class) {
                JavaType superClass = javaType;
                bindings = bindings2;
                while (bindings.isEmpty() && (superClass = superClass.getSuperClass()) != null) {
                    bindings = superClass.getBindings();
                }
            } else {
                bindings = bindings2;
            }
        }
        return _fromAny(null, type, bindings);
    }

    public TypeFactory(LRUMap<Object, JavaType> lRUMap, TypeParser typeParser, u4q[] u4qVarArr, ClassLoader classLoader) {
        this._typeCache = lRUMap == null ? new LRUMap<>(16, 200) : lRUMap;
        this._parser = typeParser.withFactory(this);
        this._modifiers = u4qVarArr;
        this._classLoader = classLoader;
    }
}
