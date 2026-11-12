package com.nimbusds.jose.shaded.gson.reflect;

import androidx.room.a0;
import c22.t;
import com.google.firebase.messaging.l;
import com.nimbusds.jose.shaded.gson.internal.C$Gson$Types;
import com.nimbusds.jose.shaded.gson.internal.TroubleshootingGuide;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import n23.j;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    private TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type typeCanonicalize = C$Gson$Types.canonicalize(type);
        this.type = typeCanonicalize;
        this.rawType = (Class<? super T>) C$Gson$Types.getRawType(typeCanonicalize);
        this.hashCode = typeCanonicalize.hashCode();
    }

    private static IllegalArgumentException buildUnsupportedTypeException(Type type, Class<?>... clsArr) {
        StringBuilder sb3 = new StringBuilder("Unsupported type, expected one of: ");
        for (Class<?> cls : clsArr) {
            sb3.append(cls.getName());
            sb3.append(", ");
        }
        sb3.append("but got: ");
        sb3.append(type.getClass().getName());
        sb3.append(", for type token: ");
        sb3.append(type.toString());
        return new IllegalArgumentException(sb3.toString());
    }

    public static TypeToken<?> get(Type type) {
        return new TypeToken<>(type);
    }

    public static TypeToken<?> getArray(Type type) {
        return new TypeToken<>(C$Gson$Types.arrayOf(type));
    }

    public static TypeToken<?> getParameterized(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (!(type instanceof Class)) {
            h.s(j.h("rawType must be of type Class, but was ", type));
            return null;
        }
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            l.g(length, cls.getName(), " requires ", " type arguments, but got ", length2);
            return null;
        }
        if (typeArr.length == 0) {
            return get(cls);
        }
        if (C$Gson$Types.requiresOwnerType(type)) {
            e.r("Raw type ", cls.getName(), " is not supported because it requires specifying an owner type");
            return null;
        }
        for (int i14 = 0; i14 < length; i14++) {
            Type type2 = typeArr[i14];
            Objects.requireNonNull(type2, "Type argument must not be null");
            Type type3 = type2;
            Class<?> rawType = C$Gson$Types.getRawType(type3);
            TypeVariable<Class<T>> typeVariable = typeParameters[i14];
            for (Type type4 : typeVariable.getBounds()) {
                if (!C$Gson$Types.getRawType(type4).isAssignableFrom(rawType)) {
                    l.k(type3, "Type argument ", " does not satisfy bounds for type variable ", typeVariable, " declared by ", type);
                    return null;
                }
            }
        }
        return new TypeToken<>(C$Gson$Types.newParameterizedTypeWithOwner(null, type, typeArr));
    }

    private Type getTypeTokenTypeArgument() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                Type typeCanonicalize = C$Gson$Types.canonicalize(parameterizedType.getActualTypeArguments()[0]);
                if (isCapturingTypeVariablesForbidden()) {
                    verifyNoTypeVariable(typeCanonicalize);
                }
                return typeCanonicalize;
            }
        } else if (genericSuperclass == TypeToken.class) {
            a0.s(TroubleshootingGuide.createUrl("type-token-raw"), "TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ");
            return null;
        }
        h.z("Must only create direct subclasses of TypeToken");
        return null;
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> rawType = C$Gson$Types.getRawType(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = rawType.getTypeParameters();
            for (int i14 = 0; i14 < actualTypeArguments.length; i14++) {
                Type type2 = actualTypeArguments[i14];
                TypeVariable<Class<?>> typeVariable = typeParameters[i14];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : rawType.getGenericInterfaces()) {
            if (isAssignableFrom(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(rawType.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean isCapturingTypeVariablesForbidden() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), BooleanUtils.TRUE);
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        if (type2.equals(type)) {
            return true;
        }
        return (type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName()));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i14 = 0; i14 < actualTypeArguments.length; i14++) {
            if (!matches(actualTypeArguments[i14], actualTypeArguments2[i14], map)) {
                return false;
            }
        }
        return true;
    }

    private static void verifyNoTypeVariable(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            StringBuilder sb3 = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
            sb3.append(typeVariable.getName());
            sb3.append(" declared by ");
            sb3.append(typeVariable.getGenericDeclaration());
            t.j(sb3, "\nSee ", TroubleshootingGuide.createUrl("typetoken-type-variable"));
            return;
        }
        if (type instanceof GenericArrayType) {
            verifyNoTypeVariable(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i14 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                verifyNoTypeVariable(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i14 < length) {
                verifyNoTypeVariable(actualTypeArguments[i14]);
                i14++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type != null) {
                return;
            }
            h.s("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            verifyNoTypeVariable(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i14 < length2) {
            verifyNoTypeVariable(upperBounds[i14]);
            i14++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C$Gson$Types.equals(this.type, ((TypeToken) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return C$Gson$Types.typeToString(this.type);
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    public TypeToken() {
        Type typeTokenTypeArgument = getTypeTokenTypeArgument();
        this.type = typeTokenTypeArgument;
        this.rawType = (Class<? super T>) C$Gson$Types.getRawType(typeTokenTypeArgument);
        this.hashCode = typeTokenTypeArgument.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        Type type2 = this.type;
        if (type2 instanceof Class) {
            return this.rawType.isAssignableFrom(C$Gson$Types.getRawType(type));
        }
        if (type2 instanceof ParameterizedType) {
            return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(C$Gson$Types.getRawType(type)) && isAssignableFrom(type, (GenericArrayType) this.type);
        }
        throw buildUnsupportedTypeException(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> typeToken) {
        return isAssignableFrom(typeToken.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return isAssignableFrom(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }
}
