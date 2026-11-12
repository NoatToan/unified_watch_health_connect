package org.apache.commons.lang3.reflect;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.internal.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n23.j;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.Builder;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class TypeUtils {
    public static final WildcardType WILDCARD_ALL = wildcardType().withUpperBounds(Object.class).build();

    public static final class GenericArrayTypeImpl implements GenericArrayType {
        private final Type componentType;

        private GenericArrayTypeImpl(Type type) {
            this.componentType = type;
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                return (obj instanceof GenericArrayType) && TypeUtils.equals((GenericArrayType) this, (Type) obj);
            }
            return true;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode() | 1072;
        }

        public String toString() {
            return TypeUtils.toString((Type) this);
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType {
        private final Class<?> raw;
        private final Type[] typeArguments;
        private final Type useOwner;

        private ParameterizedTypeImpl(Class<?> cls, Type type, Type[] typeArr) {
            this.raw = cls;
            this.useOwner = type;
            this.typeArguments = (Type[]) Arrays.copyOf(typeArr, typeArr.length, Type[].class);
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                return (obj instanceof ParameterizedType) && TypeUtils.equals((ParameterizedType) this, (Type) obj);
            }
            return true;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.useOwner;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.raw;
        }

        public int hashCode() {
            return ((((this.raw.hashCode() | 1136) << 4) | Objects.hashCode(this.useOwner)) << 8) | Arrays.hashCode(this.typeArguments);
        }

        public String toString() {
            return TypeUtils.toString((Type) this);
        }
    }

    public static final class WildcardTypeImpl implements WildcardType {
        private final Type[] lowerBounds;
        private final Type[] upperBounds;

        private WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Type[] typeArr3 = ArrayUtils.EMPTY_TYPE_ARRAY;
            this.upperBounds = (Type[]) ObjectUtils.defaultIfNull(typeArr, typeArr3);
            this.lowerBounds = (Type[]) ObjectUtils.defaultIfNull(typeArr2, typeArr3);
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                return (obj instanceof WildcardType) && TypeUtils.equals((WildcardType) this, (Type) obj);
            }
            return true;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return (Type[]) this.lowerBounds.clone();
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return (Type[]) this.upperBounds.clone();
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.upperBounds) | 18688) << 8) | Arrays.hashCode(this.lowerBounds);
        }

        public String toString() {
            return TypeUtils.toString((Type) this);
        }
    }

    private static <T> StringBuilder appendAllTo(StringBuilder sb3, String str, T... tArr) {
        Validate.notEmpty(Validate.noNullElements(tArr));
        if (tArr.length > 0) {
            sb3.append(toString(tArr[0]));
            for (int i14 = 1; i14 < tArr.length; i14++) {
                sb3.append(str);
                sb3.append(toString(tArr[i14]));
            }
        }
        return sb3;
    }

    private static void appendRecursiveTypes(StringBuilder sb3, int[] iArr, Type[] typeArr) {
        for (int i14 = 0; i14 < iArr.length; i14++) {
            sb3.append('<');
            appendAllTo(sb3, ", ", typeArr[i14].toString()).append('>');
        }
        Type[] typeArr2 = (Type[]) ArrayUtils.removeAll((Object[]) typeArr, iArr);
        if (typeArr2.length > 0) {
            sb3.append('<');
            appendAllTo(sb3, ", ", typeArr2).append('>');
        }
    }

    private static String classToString(Class<?> cls) {
        if (cls.isArray()) {
            return toString((Type) cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb3 = new StringBuilder();
        if (cls.getEnclosingClass() != null) {
            sb3.append(classToString(cls.getEnclosingClass()));
            sb3.append('.');
            sb3.append(cls.getSimpleName());
        } else {
            sb3.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            sb3.append('<');
            appendAllTo(sb3, ", ", cls.getTypeParameters());
            sb3.append('>');
        }
        return sb3.toString();
    }

    public static boolean containsTypeVariables(Type type) {
        if (type instanceof TypeVariable) {
            return true;
        }
        if (type instanceof Class) {
            return ((Class) type).getTypeParameters().length > 0;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return containsTypeVariables(getImplicitLowerBounds(wildcardType)[0]) || containsTypeVariables(getImplicitUpperBounds(wildcardType)[0]);
            }
            if (type instanceof GenericArrayType) {
                return containsTypeVariables(((GenericArrayType) type).getGenericComponentType());
            }
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (containsTypeVariables(type2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsVariableTypeSameParametrizedTypeBound(TypeVariable<?> typeVariable, ParameterizedType parameterizedType) {
        return ArrayUtils.contains(typeVariable.getBounds(), parameterizedType);
    }

    public static Map<TypeVariable<?>, Type> determineTypeArguments(Class<?> cls, ParameterizedType parameterizedType) {
        Validate.notNull(cls, "cls", new Object[0]);
        Validate.notNull(parameterizedType, "superParameterizedType", new Object[0]);
        Class<?> rawType = getRawType(parameterizedType);
        if (!isAssignable((Type) cls, rawType)) {
            return null;
        }
        if (cls.equals(rawType)) {
            return getTypeArguments(parameterizedType, rawType, (Map<TypeVariable<?>, Type>) null);
        }
        Type closestParentType = getClosestParentType(cls, rawType);
        if (closestParentType instanceof Class) {
            return determineTypeArguments((Class) closestParentType, parameterizedType);
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) closestParentType;
        Map<TypeVariable<?>, Type> mapDetermineTypeArguments = determineTypeArguments(getRawType(parameterizedType2), parameterizedType);
        mapTypeVariablesToArguments(cls, parameterizedType2, mapDetermineTypeArguments);
        return mapDetermineTypeArguments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equals(ParameterizedType parameterizedType, Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type;
        if (equals(parameterizedType.getRawType(), parameterizedType2.getRawType()) && equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType())) {
            return equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        return false;
    }

    private static Type[] extractTypeArgumentsFrom(Map<TypeVariable<?>, Type> map, TypeVariable<?>[] typeVariableArr) {
        Type[] typeArr = new Type[typeVariableArr.length];
        int length = typeVariableArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            TypeVariable<?> typeVariable = typeVariableArr[i14];
            Validate.isTrue(map.containsKey(typeVariable), "missing argument mapping for %s", toString((Type) typeVariable));
            typeArr[i15] = map.get(typeVariable);
            i14++;
            i15++;
        }
        return typeArr;
    }

    private static int[] findRecursiveTypes(ParameterizedType parameterizedType) {
        Type[] typeArr = (Type[]) Arrays.copyOf(parameterizedType.getActualTypeArguments(), parameterizedType.getActualTypeArguments().length);
        int[] iArrAdd = new int[0];
        for (int i14 = 0; i14 < typeArr.length; i14++) {
            Type type = typeArr[i14];
            if ((type instanceof TypeVariable) && containsVariableTypeSameParametrizedTypeBound((TypeVariable) type, parameterizedType)) {
                iArrAdd = ArrayUtils.add(iArrAdd, i14);
            }
        }
        return iArrAdd;
    }

    public static GenericArrayType genericArrayType(Type type) {
        return new GenericArrayTypeImpl((Type) Validate.notNull(type, "componentType", new Object[0]));
    }

    private static String genericArrayTypeToString(GenericArrayType genericArrayType) {
        return k.g(toString(genericArrayType.getGenericComponentType()), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }

    public static Type getArrayComponentType(Type type) {
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return ((GenericArrayType) type).getGenericComponentType();
            }
            return null;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return cls.getComponentType();
        }
        return null;
    }

    private static Type getClosestParentType(Class<?> cls, Class<?> cls2) {
        Class<?> rawType;
        if (cls2.isInterface()) {
            Type type = null;
            for (Type type2 : cls.getGenericInterfaces()) {
                if (type2 instanceof ParameterizedType) {
                    rawType = getRawType((ParameterizedType) type2);
                } else {
                    if (!(type2 instanceof Class)) {
                        h.z(j.h("Unexpected generic interface type found: ", type2));
                        return null;
                    }
                    rawType = (Class) type2;
                }
                if (isAssignable((Type) rawType, cls2) && isAssignable(type, (Type) rawType)) {
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
        }
        return cls.getGenericSuperclass();
    }

    public static Type[] getImplicitBounds(TypeVariable<?> typeVariable) {
        Validate.notNull(typeVariable, "typeVariable", new Object[0]);
        Type[] bounds = typeVariable.getBounds();
        return bounds.length == 0 ? new Type[]{Object.class} : normalizeUpperBounds(bounds);
    }

    public static Type[] getImplicitLowerBounds(WildcardType wildcardType) {
        Validate.notNull(wildcardType, "wildcardType", new Object[0]);
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length == 0 ? new Type[]{null} : lowerBounds;
    }

    public static Type[] getImplicitUpperBounds(WildcardType wildcardType) {
        Validate.notNull(wildcardType, "wildcardType", new Object[0]);
        Type[] upperBounds = wildcardType.getUpperBounds();
        return upperBounds.length == 0 ? new Type[]{Object.class} : normalizeUpperBounds(upperBounds);
    }

    public static Class<?> getRawType(Type type, Type type2) {
        Map<TypeVariable<?>, Type> typeArguments;
        Type type3;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getRawType((ParameterizedType) type);
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType(), type2), 0).getClass();
            }
            if (type instanceof WildcardType) {
                return null;
            }
            h.s(j.h("unknown type: ", type));
            return null;
        }
        if (type2 == null) {
            return null;
        }
        GenericDeclaration genericDeclaration = ((TypeVariable) type).getGenericDeclaration();
        if (!(genericDeclaration instanceof Class) || (typeArguments = getTypeArguments(type2, (Class) genericDeclaration)) == null || (type3 = typeArguments.get(type)) == null) {
            return null;
        }
        return getRawType(type3, type2);
    }

    private static Map<TypeVariable<?>, Type> getTypeArguments(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        if (type instanceof Class) {
            return getTypeArguments((Class<?>) type, cls, map);
        }
        if (type instanceof ParameterizedType) {
            return getTypeArguments((ParameterizedType) type, cls, map);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (cls.isArray()) {
                cls = cls.getComponentType();
            }
            return getTypeArguments(genericComponentType, cls, map);
        }
        int i14 = 0;
        if (type instanceof WildcardType) {
            Type[] implicitUpperBounds = getImplicitUpperBounds((WildcardType) type);
            int length = implicitUpperBounds.length;
            while (i14 < length) {
                Type type2 = implicitUpperBounds[i14];
                if (isAssignable(type2, cls)) {
                    return getTypeArguments(type2, cls, map);
                }
                i14++;
            }
            return null;
        }
        if (!(type instanceof TypeVariable)) {
            h.z(j.h("found an unhandled type: ", type));
            return null;
        }
        Type[] implicitBounds = getImplicitBounds((TypeVariable) type);
        int length2 = implicitBounds.length;
        while (i14 < length2) {
            Type type3 = implicitBounds[i14];
            if (isAssignable(type3, cls)) {
                return getTypeArguments(type3, cls, map);
            }
            i14++;
        }
        return null;
    }

    public static boolean isArrayType(Type type) {
        if (type instanceof GenericArrayType) {
            return true;
        }
        return (type instanceof Class) && ((Class) type).isArray();
    }

    private static boolean isAssignable(Type type, WildcardType wildcardType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (wildcardType == null) {
            return false;
        }
        if (wildcardType.equals(type)) {
            return true;
        }
        Type[] implicitUpperBounds = getImplicitUpperBounds(wildcardType);
        Type[] implicitLowerBounds = getImplicitLowerBounds(wildcardType);
        if (!(type instanceof WildcardType)) {
            for (Type type2 : implicitUpperBounds) {
                if (!isAssignable(type, substituteTypeVariables(type2, map), map)) {
                    return false;
                }
            }
            for (Type type3 : implicitLowerBounds) {
                if (!isAssignable(substituteTypeVariables(type3, map), type, map)) {
                    return false;
                }
            }
            return true;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        Type[] implicitUpperBounds2 = getImplicitUpperBounds(wildcardType2);
        Type[] implicitLowerBounds2 = getImplicitLowerBounds(wildcardType2);
        for (Type type4 : implicitUpperBounds) {
            Type typeSubstituteTypeVariables = substituteTypeVariables(type4, map);
            for (Type type5 : implicitUpperBounds2) {
                if (!isAssignable(type5, typeSubstituteTypeVariables, map)) {
                    return false;
                }
            }
        }
        for (Type type6 : implicitLowerBounds) {
            Type typeSubstituteTypeVariables2 = substituteTypeVariables(type6, map);
            for (Type type7 : implicitLowerBounds2) {
                if (!isAssignable(typeSubstituteTypeVariables2, type7, map)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isInstance(Object obj, Type type) {
        if (type == null) {
            return false;
        }
        if (obj == null) {
            return ((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true;
        }
        return isAssignable(obj.getClass(), type, (Map<TypeVariable<?>, Type>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Type lambda$wrap$0(Type type) {
        return type;
    }

    private static <T> void mapTypeVariablesToArguments(Class<T> cls, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            mapTypeVariablesToArguments(cls, (ParameterizedType) ownerType, map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = getRawType(parameterizedType).getTypeParameters();
        List listAsList = Arrays.asList(cls.getTypeParameters());
        for (int i14 = 0; i14 < actualTypeArguments.length; i14++) {
            TypeVariable<Class<?>> typeVariable = typeParameters[i14];
            Type type = actualTypeArguments[i14];
            if (listAsList.contains(type) && map.containsKey(typeVariable)) {
                map.put((TypeVariable) type, map.get(typeVariable));
            }
        }
    }

    public static Type[] normalizeUpperBounds(Type[] typeArr) {
        Validate.notNull(typeArr, "bounds", new Object[0]);
        if (typeArr.length < 2) {
            return typeArr;
        }
        HashSet hashSet = new HashSet(typeArr.length);
        for (Type type : typeArr) {
            int length = typeArr.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    hashSet.add(type);
                    break;
                }
                Type type2 = typeArr[i14];
                if (type != type2 && isAssignable(type2, type, (Map<TypeVariable<?>, Type>) null)) {
                    break;
                }
                i14++;
            }
        }
        return (Type[]) hashSet.toArray(ArrayUtils.EMPTY_TYPE_ARRAY);
    }

    public static final ParameterizedType parameterize(Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Validate.notNull(cls, "rawClass", new Object[0]);
        Validate.notNull(map, "typeVariableMap", new Object[0]);
        return parameterizeWithOwner((Type) null, cls, extractTypeArgumentsFrom(map, cls.getTypeParameters()));
    }

    public static final ParameterizedType parameterizeWithOwner(Type type, Class<?> cls, Type... typeArr) {
        Validate.notNull(cls, "rawClass", new Object[0]);
        if (cls.getEnclosingClass() == null) {
            Validate.isTrue(type == null, "no owner allowed for top-level %s", cls);
            type = null;
        } else if (type == null) {
            type = cls.getEnclosingClass();
        } else {
            Validate.isTrue(isAssignable(type, cls.getEnclosingClass()), "%s is invalid owner type for parameterized %s", type, cls);
        }
        Validate.noNullElements(typeArr, "null type argument at index %s", new Object[0]);
        Validate.isTrue(cls.getTypeParameters().length == typeArr.length, "invalid number of type parameters specified: expected %d, got %d", Integer.valueOf(cls.getTypeParameters().length), Integer.valueOf(typeArr.length));
        return new ParameterizedTypeImpl(cls, type, typeArr);
    }

    private static String parameterizedTypeToString(ParameterizedType parameterizedType) {
        StringBuilder sb3 = new StringBuilder();
        Type ownerType = parameterizedType.getOwnerType();
        Class cls = (Class) parameterizedType.getRawType();
        if (ownerType == null) {
            sb3.append(cls.getName());
        } else {
            if (ownerType instanceof Class) {
                sb3.append(((Class) ownerType).getName());
            } else {
                sb3.append(ownerType.toString());
            }
            sb3.append('.');
            sb3.append(cls.getSimpleName());
        }
        int[] iArrFindRecursiveTypes = findRecursiveTypes(parameterizedType);
        if (iArrFindRecursiveTypes.length > 0) {
            appendRecursiveTypes(sb3, iArrFindRecursiveTypes, parameterizedType.getActualTypeArguments());
        } else {
            sb3.append('<');
            appendAllTo(sb3, ", ", parameterizedType.getActualTypeArguments()).append('>');
        }
        return sb3.toString();
    }

    private static Type substituteTypeVariables(Type type, Map<TypeVariable<?>, Type> map) {
        if (!(type instanceof TypeVariable) || map == null) {
            return type;
        }
        Type type2 = map.get(type);
        if (type2 != null) {
            return type2;
        }
        h.s(j.h("missing assignment type for type variable ", type));
        return null;
    }

    public static String toLongString(TypeVariable<?> typeVariable) {
        Validate.notNull(typeVariable, "typeVariable", new Object[0]);
        StringBuilder sb3 = new StringBuilder();
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class<?> enclosingClass = (Class) genericDeclaration;
            while (enclosingClass.getEnclosingClass() != null) {
                sb3.insert(0, enclosingClass.getSimpleName()).insert(0, '.');
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            sb3.insert(0, enclosingClass.getName());
        } else if (genericDeclaration instanceof Type) {
            sb3.append(toString((Type) genericDeclaration));
        } else {
            sb3.append(genericDeclaration);
        }
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(typeVariableToString(typeVariable));
        return sb3.toString();
    }

    public static String toString(Type type) {
        Validate.notNull(type);
        if (type instanceof Class) {
            return classToString((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return parameterizedTypeToString((ParameterizedType) type);
        }
        if (type instanceof WildcardType) {
            return wildcardTypeToString((WildcardType) type);
        }
        if (type instanceof TypeVariable) {
            return typeVariableToString((TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return genericArrayTypeToString((GenericArrayType) type);
        }
        h.s(ObjectUtils.identityToString(type));
        return null;
    }

    private static String typeVariableToString(TypeVariable<?> typeVariable) {
        StringBuilder sb3 = new StringBuilder(typeVariable.getName());
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length > 0 && (bounds.length != 1 || !Object.class.equals(bounds[0]))) {
            sb3.append(" extends ");
            appendAllTo(sb3, " & ", typeVariable.getBounds());
        }
        return sb3.toString();
    }

    public static boolean typesSatisfyVariables(Map<TypeVariable<?>, Type> map) {
        Validate.notNull(map, "typeVariableMap", new Object[0]);
        for (Map.Entry<TypeVariable<?>, Type> entry : map.entrySet()) {
            TypeVariable<?> key = entry.getKey();
            Type value = entry.getValue();
            for (Type type : getImplicitBounds(key)) {
                if (!isAssignable(value, substituteTypeVariables(type, map), map)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Type[] unrollBounds(Map<TypeVariable<?>, Type> map, Type[] typeArr) {
        int i14 = 0;
        while (i14 < typeArr.length) {
            Type typeUnrollVariables = unrollVariables(map, typeArr[i14]);
            if (typeUnrollVariables == null) {
                typeArr = (Type[]) ArrayUtils.remove((Object[]) typeArr, i14);
                i14--;
            } else {
                typeArr[i14] = typeUnrollVariables;
            }
            i14++;
        }
        return typeArr;
    }

    private static Type unrollVariableAssignments(TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        Type type;
        while (true) {
            type = map.get(typeVariable);
            if (!(type instanceof TypeVariable) || type.equals(typeVariable)) {
                break;
            }
            typeVariable = (TypeVariable) type;
        }
        return type;
    }

    public static Type unrollVariables(Map<TypeVariable<?>, Type> map, Type type) {
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        if (containsTypeVariables(type)) {
            if (type instanceof TypeVariable) {
                return unrollVariables(map, map.get(type));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getOwnerType() != null) {
                    HashMap map2 = new HashMap(map);
                    map2.putAll(getTypeArguments(parameterizedType));
                    map = map2;
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i14 = 0; i14 < actualTypeArguments.length; i14++) {
                    Type typeUnrollVariables = unrollVariables(map, actualTypeArguments[i14]);
                    if (typeUnrollVariables != null) {
                        actualTypeArguments[i14] = typeUnrollVariables;
                    }
                }
                return parameterizeWithOwner(parameterizedType.getOwnerType(), (Class<?>) parameterizedType.getRawType(), actualTypeArguments);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType().withUpperBounds(unrollBounds(map, wildcardType.getUpperBounds())).withLowerBounds(unrollBounds(map, wildcardType.getLowerBounds())).build();
            }
        }
        return type;
    }

    public static WildcardTypeBuilder wildcardType() {
        return new WildcardTypeBuilder();
    }

    private static String wildcardTypeToString(WildcardType wildcardType) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append('?');
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length > 1 || (lowerBounds.length == 1 && lowerBounds[0] != null)) {
            sb3.append(" super ");
            appendAllTo(sb3, " & ", lowerBounds);
        } else if (upperBounds.length > 1 || (upperBounds.length == 1 && !Object.class.equals(upperBounds[0]))) {
            sb3.append(" extends ");
            appendAllTo(sb3, " & ", upperBounds);
        }
        return sb3.toString();
    }

    public static <T> Typed<T> wrap(Type type) {
        return new b(2, type);
    }

    public static class WildcardTypeBuilder implements Builder<WildcardType> {
        private Type[] lowerBounds;
        private Type[] upperBounds;

        @Override // org.apache.commons.lang3.builder.Builder
        public WildcardType build() {
            return new WildcardTypeImpl(this.upperBounds, this.lowerBounds);
        }

        public WildcardTypeBuilder withLowerBounds(Type... typeArr) {
            this.lowerBounds = typeArr;
            return this;
        }

        public WildcardTypeBuilder withUpperBounds(Type... typeArr) {
            this.upperBounds = typeArr;
            return this;
        }

        private WildcardTypeBuilder() {
        }
    }

    public static <T> Typed<T> wrap(Class<T> cls) {
        return wrap((Type) cls);
    }

    public static final ParameterizedType parameterize(Class<?> cls, Type... typeArr) {
        return parameterizeWithOwner((Type) null, cls, typeArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equals(GenericArrayType genericArrayType, Type type) {
        return (type instanceof GenericArrayType) && equals(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType());
    }

    public static boolean equals(Type type, Type type2) {
        if (Objects.equals(type, type2)) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            return equals((ParameterizedType) type, type2);
        }
        if (type instanceof GenericArrayType) {
            return equals((GenericArrayType) type, type2);
        }
        if (type instanceof WildcardType) {
            return equals((WildcardType) type, type2);
        }
        return false;
    }

    private static boolean equals(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        for (int i14 = 0; i14 < typeArr.length; i14++) {
            if (!equals(typeArr[i14], typeArr2[i14])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equals(WildcardType wildcardType, Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            if (equals(getImplicitLowerBounds(wildcardType), getImplicitLowerBounds(wildcardType2)) && equals(getImplicitUpperBounds(wildcardType), getImplicitUpperBounds(wildcardType2))) {
                return true;
            }
        }
        return false;
    }

    private static <T> String toString(T t7) {
        return t7 instanceof Type ? toString((Type) t7) : t7.toString();
    }

    private static Class<?> getRawType(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (rawType instanceof Class) {
            return (Class) rawType;
        }
        h.z(j.h("Wait... What!? Type of rawType: ", rawType));
        return null;
    }

    public static final ParameterizedType parameterizeWithOwner(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Validate.notNull(cls, "rawClass", new Object[0]);
        Validate.notNull(map, "typeVariableMap", new Object[0]);
        return parameterizeWithOwner(type, cls, extractTypeArgumentsFrom(map, cls.getTypeParameters()));
    }

    public static Map<TypeVariable<?>, Type> getTypeArguments(ParameterizedType parameterizedType) {
        return getTypeArguments(parameterizedType, getRawType(parameterizedType), (Map<TypeVariable<?>, Type>) null);
    }

    private static Map<TypeVariable<?>, Type> getTypeArguments(ParameterizedType parameterizedType, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Map<TypeVariable<?>, Type> map2;
        Class<?> rawType = getRawType(parameterizedType);
        if (!isAssignable((Type) rawType, cls)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            map2 = getTypeArguments(parameterizedType2, getRawType(parameterizedType2), map);
        } else {
            map2 = map == null ? new HashMap<>() : new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = rawType.getTypeParameters();
        for (int i14 = 0; i14 < typeParameters.length; i14++) {
            Type type = actualTypeArguments[i14];
            map2.put(typeParameters[i14], map2.getOrDefault(type, type));
        }
        return cls.equals(rawType) ? map2 : getTypeArguments(getClosestParentType(rawType, cls), cls, map2);
    }

    private static boolean isAssignable(Type type, GenericArrayType genericArrayType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (genericArrayType == null) {
            return false;
        }
        if (genericArrayType.equals(type)) {
            return true;
        }
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() && isAssignable(cls.getComponentType(), genericComponentType, map);
        }
        if (type instanceof GenericArrayType) {
            return isAssignable(((GenericArrayType) type).getGenericComponentType(), genericComponentType, map);
        }
        if (type instanceof WildcardType) {
            for (Type type2 : getImplicitUpperBounds((WildcardType) type)) {
                if (isAssignable(type2, genericArrayType)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof TypeVariable) {
            for (Type type3 : getImplicitBounds((TypeVariable) type)) {
                if (isAssignable(type3, genericArrayType)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof ParameterizedType) {
            return false;
        }
        h.z(j.h("found an unhandled type: ", type));
        return false;
    }

    public static Map<TypeVariable<?>, Type> getTypeArguments(Type type, Class<?> cls) {
        return getTypeArguments(type, cls, (Map<TypeVariable<?>, Type>) null);
    }

    private static Map<TypeVariable<?>, Type> getTypeArguments(Class<?> cls, Class<?> cls2, Map<TypeVariable<?>, Type> map) {
        if (!isAssignable((Type) cls, cls2)) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                return new HashMap();
            }
            cls = ClassUtils.primitiveToWrapper(cls);
        }
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        return cls2.equals(cls) ? map2 : getTypeArguments(getClosestParentType(cls, cls2), cls2, map2);
    }

    private static boolean isAssignable(Type type, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (parameterizedType == null || (type instanceof GenericArrayType)) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> rawType = getRawType(parameterizedType);
        Map<TypeVariable<?>, Type> typeArguments = getTypeArguments(type, rawType, (Map<TypeVariable<?>, Type>) null);
        if (typeArguments == null) {
            return false;
        }
        if (typeArguments.isEmpty()) {
            return true;
        }
        Map<TypeVariable<?>, Type> typeArguments2 = getTypeArguments(parameterizedType, rawType, map);
        for (TypeVariable<?> typeVariable : typeArguments2.keySet()) {
            Type typeUnrollVariableAssignments = unrollVariableAssignments(typeVariable, typeArguments2);
            Type typeUnrollVariableAssignments2 = unrollVariableAssignments(typeVariable, typeArguments);
            if (typeUnrollVariableAssignments != null || !(typeUnrollVariableAssignments2 instanceof Class)) {
                if (typeUnrollVariableAssignments2 != null && typeUnrollVariableAssignments != null && !typeUnrollVariableAssignments.equals(typeUnrollVariableAssignments2) && (!(typeUnrollVariableAssignments instanceof WildcardType) || !isAssignable(typeUnrollVariableAssignments2, typeUnrollVariableAssignments, map))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAssignable(Type type, Type type2) {
        return isAssignable(type, type2, (Map<TypeVariable<?>, Type>) null);
    }

    private static boolean isAssignable(Type type, Type type2, Map<TypeVariable<?>, Type> map) {
        if (type2 != null && !(type2 instanceof Class)) {
            if (type2 instanceof ParameterizedType) {
                return isAssignable(type, (ParameterizedType) type2, map);
            }
            if (type2 instanceof GenericArrayType) {
                return isAssignable(type, (GenericArrayType) type2, map);
            }
            if (type2 instanceof WildcardType) {
                return isAssignable(type, (WildcardType) type2, map);
            }
            if (type2 instanceof TypeVariable) {
                return isAssignable(type, (TypeVariable<?>) type2, map);
            }
            h.z(j.h("found an unhandled type: ", type2));
            return false;
        }
        return isAssignable(type, (Class<?>) type2);
    }

    private static boolean isAssignable(Type type, TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (typeVariable == null) {
            return false;
        }
        if (typeVariable.equals(type)) {
            return true;
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : getImplicitBounds((TypeVariable) type)) {
                if (isAssignable(type2, typeVariable, map)) {
                    return true;
                }
            }
        }
        if ((type instanceof Class) || (type instanceof ParameterizedType) || (type instanceof GenericArrayType) || (type instanceof WildcardType)) {
            return false;
        }
        h.z(j.h("found an unhandled type: ", type));
        return false;
    }

    private static boolean isAssignable(Type type, Class<?> cls) {
        if (type == null) {
            return cls == null || !cls.isPrimitive();
        }
        if (cls == null) {
            return false;
        }
        if (cls.equals(type)) {
            return true;
        }
        if (type instanceof Class) {
            return ClassUtils.isAssignable((Class<?>) type, cls);
        }
        if (type instanceof ParameterizedType) {
            return isAssignable((Type) getRawType((ParameterizedType) type), cls);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (isAssignable(type2, cls)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return cls.equals(Object.class) || (cls.isArray() && isAssignable(((GenericArrayType) type).getGenericComponentType(), cls.getComponentType()));
        }
        if (type instanceof WildcardType) {
            return false;
        }
        h.z(j.h("found an unhandled type: ", type));
        return false;
    }
}
