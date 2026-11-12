package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import okio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public final class kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f23989a = new Type[0];

    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f23990a;

        public a(Type type) {
            this.f23990a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && kmq.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f23990a;
        }

        public int hashCode() {
            return this.f23990a.hashCode();
        }

        public String toString() {
            return kmq.t(this.f23990a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f23991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f23992b;
        public final Type[] c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                kmq.b(type3);
            }
            this.f23991a = type;
            this.f23992b = type2;
            this.c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && kmq.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f23991a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f23992b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.c) ^ this.f23992b.hashCode();
            Type type = this.f23991a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.c;
            if (typeArr.length == 0) {
                return kmq.t(this.f23992b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(kmq.t(this.f23992b));
            sb.append("<");
            sb.append(kmq.t(this.c[0]));
            for (int i = 1; i < this.c.length; i++) {
                sb.append(", ");
                sb.append(kmq.t(this.c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f23993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f23994b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                kmq.b(typeArr[0]);
                this.f23994b = null;
                this.f23993a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            kmq.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f23994b = typeArr2[0];
            this.f23993a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && kmq.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f23994b;
            return type != null ? new Type[]{type} : kmq.f23989a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f23993a};
        }

        public int hashCode() {
            Type type = this.f23994b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f23993a.hashCode() + 31);
        }

        public String toString() {
            if (this.f23994b != null) {
                return "? super " + kmq.t(this.f23994b);
            }
            if (this.f23993a == Object.class) {
                return "?";
            }
            return "? extends " + kmq.t(this.f23993a);
        }
    }

    public static ResponseBody a(ResponseBody responseBody) throws IOException {
        Buffer buffer = new Buffer();
        responseBody.source().readAll(buffer);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static Class<?> c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type f(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static Type g(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    public static Class<?> h(Type type) {
        Objects.requireNonNull(type, "type == null");
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
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return q(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
    }

    public static int k(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static RuntimeException m(Method method, String str, Object... objArr) {
        return n(method, null, str, objArr);
    }

    public static RuntimeException n(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    public static RuntimeException o(Method method, int i, String str, Object... objArr) {
        return m(method, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    public static RuntimeException p(Method method, Throwable th, int i, String str, Object... objArr) {
        return n(method, th, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    public static Type q(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeQ;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Type typeR = r(type, cls, typeVariable);
            if (typeR == typeVariable) {
                return typeR;
            }
            type4 = typeR;
        }
        if (type4 instanceof Class) {
            Class cls2 = (Class) type4;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeQ2 = q(type, cls, componentType);
                return componentType == typeQ2 ? cls2 : new a(typeQ2);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeQ3 = q(type, cls, genericComponentType);
            return genericComponentType == typeQ3 ? genericArrayType : new a(typeQ3);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeQ4 = q(type, cls, ownerType);
            boolean z = typeQ4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeQ5 = q(type, cls, actualTypeArguments[i]);
                if (typeQ5 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeQ5;
                }
            }
            return z ? new b(typeQ4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type4 instanceof WildcardType) {
            wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeQ6 = q(type, cls, lowerBounds[0]);
                if (typeQ6 != lowerBounds[0]) {
                    type3 = type4;
                    type3 = wildcardType;
                    return new c(new Type[]{Object.class}, new Type[]{typeQ6});
                }
            } else if (upperBounds.length == 1 && (typeQ = q(type, cls, upperBounds[0])) != upperBounds[0]) {
                type3 = type4;
                type3 = wildcardType;
                type3 = wildcardType;
                return new c(new Type[]{typeQ}, f23989a);
            }
        }
        type3 = type4;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        return type3;
    }

    public static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsC = c(typeVariable);
        if (clsC == null) {
            return typeVariable;
        }
        Type typeE = e(type, cls, clsC);
        if (!(typeE instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeE).getActualTypeArguments()[k(clsC.getTypeParameters(), typeVariable)];
    }

    public static void s(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
