package c83;

import ch.qos.logback.classic.spi.CallerData;
import com.google.maps.android.BuildConfig;
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
import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f25773a = new Type[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f25774b = true;

    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f25775a;

        public a(Type type) {
            this.f25775a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && f0.b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f25775a;
        }

        public final int hashCode() {
            return this.f25775a.hashCode();
        }

        public final String toString() {
            return f0.n(this.f25775a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f25776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f25777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Type[] f25778c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    vb.h.w();
                    throw null;
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                f0.a(type3);
            }
            this.f25776a = type;
            this.f25777b = type2;
            this.f25778c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && f0.b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f25778c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f25776a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f25777b;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f25778c) ^ this.f25777b.hashCode();
            Type type = this.f25776a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f25778c;
            int length = typeArr.length;
            Type type = this.f25777b;
            if (length == 0) {
                return f0.n(type);
            }
            StringBuilder sb3 = new StringBuilder((typeArr.length + 1) * 30);
            sb3.append(f0.n(type));
            sb3.append("<");
            sb3.append(f0.n(typeArr[0]));
            for (int i14 = 1; i14 < typeArr.length; i14++) {
                sb3.append(", ");
                sb3.append(f0.n(typeArr[i14]));
            }
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f25779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f25780b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                vb.h.w();
                throw null;
            }
            if (typeArr.length != 1) {
                vb.h.w();
                throw null;
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                f0.a(typeArr[0]);
                this.f25780b = null;
                this.f25779a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            f0.a(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                vb.h.w();
                throw null;
            }
            this.f25780b = typeArr2[0];
            this.f25779a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && f0.b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f25780b;
            return type != null ? new Type[]{type} : f0.f25773a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f25779a};
        }

        public final int hashCode() {
            Type type = this.f25780b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f25779a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f25780b;
            if (type != null) {
                return "? super " + f0.n(type);
            }
            Type type2 = this.f25779a;
            if (type2 == Object.class) {
                return CallerData.NA;
            }
            return "? extends " + f0.n(type2);
        }
    }

    private f0() {
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            vb.h.w();
        }
    }

    public static boolean b(Type type, Type type2) {
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
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i14 = 0; i14 < length; i14++) {
                Class<?> cls3 = interfaces[i14];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i14];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i14], interfaces[i14], cls2);
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
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type d(int i14, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i14 >= 0 && i14 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i14];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbI = b71.i.i(i14, "Index ", " not in range [0,");
        sbI.append(actualTypeArguments.length);
        sbI.append(") for ");
        sbI.append(parameterizedType);
        throw new IllegalArgumentException(sbI.toString());
    }

    public static Class<?> e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            vb.h.w();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb3 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb3.append(type);
        c22.t.j(sb3, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type f(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return l(type, cls, c(type, cls, Map.class));
        }
        vb.h.w();
        return null;
    }

    public static boolean g(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return g(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            c22.t.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? BuildConfig.TRAVIS : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (g(type2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException i(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbI = sn.a.i(String.format(str, objArr), "\n    for method ");
        sbI.append(method.getDeclaringClass().getSimpleName());
        sbI.append(".");
        sbI.append(method.getName());
        return new IllegalArgumentException(sbI.toString(), exc);
    }

    public static IllegalArgumentException j(Method method, int i14, String str, Object... objArr) {
        return i(method, null, com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", w.f25882b.a(method, i14), ")"), objArr);
    }

    public static IllegalArgumentException k(Method method, Exception exc, int i14, String str, Object... objArr) {
        return i(method, exc, com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", w.f25882b.a(method, i14), ")"), objArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type l(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeL;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i14 = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeL2 = l(type, cls, componentType);
                        return componentType == typeL2 ? cls2 : new a(typeL2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeL3 = l(type, cls, genericComponentType);
                    return genericComponentType == typeL3 ? genericArrayType : new a(typeL3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeL4 = l(type, cls, ownerType);
                    boolean z14 = typeL4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i14 < length) {
                        Type typeL5 = l(type, cls, actualTypeArguments[i14]);
                        if (typeL5 != actualTypeArguments[i14]) {
                            if (!z14) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z14 = true;
                            }
                            actualTypeArguments[i14] = typeL5;
                        }
                        i14++;
                    }
                    return z14 ? new b(typeL4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeL6 = l(type, cls, lowerBounds[0]);
                        if (typeL6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new c(new Type[]{Object.class}, new Type[]{typeL6});
                        }
                    } else if (upperBounds.length == 1 && (typeL = l(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new c(new Type[]{typeL}, f25773a);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeC = c(type, cls, cls3);
                if (typeC instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i14 >= typeParameters.length) {
                            c22.t.g();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i14])) {
                            type4 = ((ParameterizedType) typeC).getActualTypeArguments()[i14];
                            break;
                        }
                        i14++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    public static void m(Throwable th3) {
        if (th3 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th3);
        }
        if (th3 instanceof ThreadDeath) {
            throw ((ThreadDeath) th3);
        }
        if (th3 instanceof LinkageError) {
            throw ((LinkageError) th3);
        }
    }

    public static String n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
