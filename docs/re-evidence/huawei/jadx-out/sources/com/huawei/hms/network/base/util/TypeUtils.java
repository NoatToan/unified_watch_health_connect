package com.huawei.hms.network.base.util;

import com.huawei.hihealth.HiDataFilter;
import com.huawei.operation.utils.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public class TypeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Type[] f14517a = new Type[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f14518b = 1;

    public static boolean hasUnresolvableType(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (hasUnresolvableType(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return hasUnresolvableType(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? Constants.NULL : type.getClass().getName()));
    }

    public static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return a(type, cls, a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static Type getSubmitResponseType(Type type) {
        if (type instanceof ParameterizedType) {
            return getParameterUpperBound(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Submit return type must be parameterized as Submit<Foo> or Submit<? extends Foo>");
    }

    public static Class<?> getRawType(Type type) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < actualTypeArguments.length && i >= 0) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static boolean c(Type type, Type type2) {
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && b(parameterizedType.getRawType(), parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            WildcardType wildcardType2 = (WildcardType) type;
            return Arrays.equals(wildcardType2.getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(wildcardType2.getLowerBounds(), wildcardType.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    private static Type c(Type type, Class<?> cls, Type type2) {
        Type typeA;
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length == 1) {
            Type typeA2 = a(type, cls, lowerBounds[0]);
            if (lowerBounds[0] != typeA2) {
                return new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{typeA2});
            }
        } else if (upperBounds.length == 1 && upperBounds[0] != (typeA = a(type, cls, upperBounds[0]))) {
            return new WildcardTypeImpl(new Type[]{typeA}, f14517a);
        }
        return wildcardType;
    }

    public static Class<?> boxIfPrimitive(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        return type instanceof Class ? type.equals(type2) : c(type, type2);
    }

    private static Type b(Type type, Class<?> cls, Type type2) {
        ParameterizedType parameterizedType = (ParameterizedType) type2;
        Type ownerType = parameterizedType.getOwnerType();
        Type typeA = a(type, cls, ownerType);
        boolean z = typeA != ownerType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments.length;
        for (int i = 0; i < length; i++) {
            Type typeA2 = a(type, cls, actualTypeArguments[i]);
            if (typeA2 != actualTypeArguments[i]) {
                if (!z) {
                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                    z = true;
                }
                actualTypeArguments[i] = typeA2;
            }
        }
        return z ? new ParameterizedTypeImpl(typeA, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
    }

    static final class ParameterizedTypeImpl implements ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f14520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f14521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Type[] f14522c;

        public String toString() {
            Type[] typeArr = this.f14522c;
            if (typeArr.length == 0) {
                return TypeUtils.d(this.f14520a);
            }
            StringBuffer stringBuffer = new StringBuffer((typeArr.length + 1) * 30);
            stringBuffer.append(TypeUtils.d(this.f14520a));
            stringBuffer.append(HiDataFilter.DataFilterExpression.LESS_THAN).append(TypeUtils.d(this.f14522c[0]));
            for (int i = 1; i < this.f14522c.length; i++) {
                stringBuffer.append(", ").append(TypeUtils.d(this.f14522c[i]));
            }
            return stringBuffer.append(HiDataFilter.DataFilterExpression.BIGGER_THAN).toString();
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f14522c);
            int iHashCode2 = this.f14520a.hashCode();
            Type type = this.f14521b;
            return (iHashCode ^ iHashCode2) ^ (type != null ? type.hashCode() : 0);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f14520a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f14521b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f14522c.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && TypeUtils.b(this, (ParameterizedType) obj);
        }

        ParameterizedTypeImpl(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((((Class) type2).getEnclosingClass() == null) != (type == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                if (type3 == null) {
                    throw new NullPointerException("typeArgument == null");
                }
                TypeUtils.c(type3);
            }
            this.f14520a = type2;
            this.f14521b = type;
            this.f14522c = (Type[]) typeArr.clone();
        }
    }

    static final class WildcardTypeImpl implements WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f14523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f14524b;

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f14524b != null) {
                sb = new StringBuilder("? super ");
                type = this.f14524b;
            } else {
                if (this.f14523a == Object.class) {
                    return "?";
                }
                sb = new StringBuilder("? extends ");
                type = this.f14523a;
            }
            sb.append(TypeUtils.d(type));
            return sb.toString();
        }

        public int hashCode() {
            Type type = this.f14524b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f14523a.hashCode() + 31);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f14523a};
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f14524b;
            return type != null ? new Type[]{type} : TypeUtils.f14517a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && TypeUtils.b(this, (WildcardType) obj);
        }

        WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Type type;
            if (typeArr2.length > 1 || typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                TypeUtils.c(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.f14524b = typeArr2[0];
                type = Object.class;
            } else {
                typeArr[0].getClass();
                TypeUtils.c(typeArr[0]);
                this.f14524b = null;
                type = typeArr[0];
            }
            this.f14523a = type;
        }
    }

    static final class GenericArrayTypeImpl implements GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f14519a;

        public String toString() {
            return TypeUtils.d(this.f14519a) + "[]";
        }

        public int hashCode() {
            return this.f14519a.hashCode();
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f14519a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && TypeUtils.b(this, (GenericArrayType) obj);
        }

        GenericArrayTypeImpl(Type type) {
            this.f14519a = type;
        }
    }

    private static Type a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
        if (cls2 != null) {
            Type typeA = a(type, cls, (Class<?>) cls2);
            if (typeA instanceof ParameterizedType) {
                return ((ParameterizedType) typeA).getActualTypeArguments()[a(cls2.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    private static Type a(Type type, Class<?> cls, Type type2) {
        GenericArrayType genericArrayType;
        Type genericComponentType;
        Type typeA;
        if (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type typeA2 = a(type, cls, (TypeVariable<?>) typeVariable);
            if (typeA2 != typeVariable) {
                return a(type, cls, typeA2);
            }
        } else if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType != null) {
                    Type typeA3 = a(type, cls, (Type) componentType);
                    return typeA3 == componentType ? cls2 : new GenericArrayTypeImpl(typeA3);
                }
            } else {
                if (type2 instanceof GenericArrayType) {
                    genericArrayType = (GenericArrayType) type2;
                    genericComponentType = genericArrayType.getGenericComponentType();
                    typeA = a(type, cls, genericComponentType);
                    if (typeA == genericComponentType) {
                        return genericArrayType;
                    }
                    return new GenericArrayTypeImpl(typeA);
                }
                if (type2 instanceof ParameterizedType) {
                    return b(type, cls, type2);
                }
                if (type2 instanceof WildcardType) {
                    return c(type, cls, type2);
                }
            }
        } else {
            if (type2 instanceof GenericArrayType) {
                genericArrayType = (GenericArrayType) type2;
                genericComponentType = genericArrayType.getGenericComponentType();
                typeA = a(type, cls, genericComponentType);
                if (typeA == genericComponentType) {
                    return genericArrayType;
                }
                return new GenericArrayTypeImpl(typeA);
            }
            if (type2 instanceof ParameterizedType) {
                return b(type, cls, type2);
            }
            if (type2 instanceof WildcardType) {
                return c(type, cls, type2);
            }
        }
        return type2;
    }

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static int a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }
}
