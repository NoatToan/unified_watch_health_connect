package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.text.Typography;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;

/* JADX INFO: loaded from: classes3.dex */
public class k5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WildcardType f23494a = F().b(Object.class).a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Type[] f23495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Type[] f23496b;

        public /* synthetic */ a(j5q j5qVar) {
            this();
        }

        public WildcardType a() {
            return new b(this.f23495a, this.f23496b, null);
        }

        public a b(Type... typeArr) {
            this.f23495a = typeArr;
            return this;
        }

        public a() {
        }
    }

    public static final class b implements WildcardType {
        public static final Type[] c = new Type[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type[] f23497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type[] f23498b;

        public /* synthetic */ b(Type[] typeArr, Type[] typeArr2, j5q j5qVar) {
            this(typeArr, typeArr2);
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof WildcardType) && k5q.g(this, (WildcardType) obj));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return (Type[]) this.f23498b.clone();
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return (Type[]) this.f23497a.clone();
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f23497a) | 18688) << 8) | Arrays.hashCode(this.f23498b);
        }

        public String toString() {
            return k5q.C(this);
        }

        public b(Type[] typeArr, Type[] typeArr2) {
            Type[] typeArr3 = c;
            this.f23497a = (Type[]) ObjectUtils.a(typeArr, typeArr3);
            this.f23498b = (Type[]) ObjectUtils.a(typeArr2, typeArr3);
        }
    }

    public static String A(ParameterizedType parameterizedType) {
        StringBuilder sb = new StringBuilder();
        Type ownerType = parameterizedType.getOwnerType();
        Class cls = (Class) parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (ownerType == null) {
            sb.append(cls.getName());
        } else {
            if (ownerType instanceof Class) {
                sb.append(((Class) ownerType).getName());
            } else {
                sb.append(ownerType.toString());
            }
            sb.append('.');
            sb.append(cls.getSimpleName());
        }
        sb.append(Typography.less);
        b(sb, ", ", actualTypeArguments).append(Typography.greater);
        return sb.toString();
    }

    public static Type B(Type type, Map<TypeVariable<?>, Type> map) {
        if (!(type instanceof TypeVariable) || map == null) {
            return type;
        }
        Type type2 = map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalArgumentException("missing assignment type for type variable " + type);
    }

    public static String C(Type type) {
        zmq.h(type);
        if (type instanceof Class) {
            return c((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return A((ParameterizedType) type);
        }
        if (type instanceof WildcardType) {
            return G((WildcardType) type);
        }
        if (type instanceof TypeVariable) {
            return D((TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return i((GenericArrayType) type);
        }
        throw new IllegalArgumentException(ObjectUtils.d(type));
    }

    public static String D(TypeVariable<?> typeVariable) {
        StringBuilder sb = new StringBuilder(typeVariable.getName());
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length > 0 && (bounds.length != 1 || !Object.class.equals(bounds[0]))) {
            sb.append(" extends ");
            b(sb, " & ", typeVariable.getBounds());
        }
        return sb.toString();
    }

    public static Type E(TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
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

    public static a F() {
        return new a(null);
    }

    public static String G(WildcardType wildcardType) {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length > 0) {
            sb.append(" super ");
            b(sb, " & ", lowerBounds);
        } else if (upperBounds.length != 1 || !Object.class.equals(upperBounds[0])) {
            sb.append(" extends ");
            b(sb, " & ", upperBounds);
        }
        return sb.toString();
    }

    public static StringBuilder b(StringBuilder sb, String str, Type... typeArr) {
        zmq.f(zmq.d(typeArr));
        if (typeArr.length > 0) {
            sb.append(C(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(str);
                sb.append(C(typeArr[i]));
            }
        }
        return sb;
    }

    public static String c(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        if (cls.getEnclosingClass() != null) {
            sb.append(c(cls.getEnclosingClass()));
            sb.append('.');
            sb.append(cls.getSimpleName());
        } else {
            sb.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            sb.append(Typography.less);
            b(sb, ", ", cls.getTypeParameters());
            sb.append(Typography.greater);
        }
        return sb.toString();
    }

    public static boolean d(GenericArrayType genericArrayType, Type type) {
        return (type instanceof GenericArrayType) && f(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType());
    }

    public static boolean e(ParameterizedType parameterizedType, Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type;
        if (f(parameterizedType.getRawType(), parameterizedType2.getRawType()) && f(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType())) {
            return h(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        return false;
    }

    public static boolean f(Type type, Type type2) {
        if (ObjectUtils.b(type, type2)) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            return e((ParameterizedType) type, type2);
        }
        if (type instanceof GenericArrayType) {
            return d((GenericArrayType) type, type2);
        }
        if (type instanceof WildcardType) {
            return g((WildcardType) type, type2);
        }
        return false;
    }

    public static boolean g(WildcardType wildcardType, Type type) {
        if (!(type instanceof WildcardType)) {
            return true;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        return h(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()) && h(m(wildcardType), m(wildcardType2));
    }

    public static boolean h(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        for (int i = 0; i < typeArr.length; i++) {
            if (!f(typeArr[i], typeArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static String i(GenericArrayType genericArrayType) {
        return String.format("%s[]", C(genericArrayType.getGenericComponentType()));
    }

    public static Type j(Class<?> cls, Class<?> cls2) {
        Class<?> clsN;
        if (cls2.isInterface()) {
            Type type = null;
            for (Type type2 : cls.getGenericInterfaces()) {
                if (type2 instanceof ParameterizedType) {
                    clsN = n((ParameterizedType) type2);
                } else {
                    if (!(type2 instanceof Class)) {
                        throw new IllegalStateException("Unexpected generic interface type found: " + type2);
                    }
                    clsN = (Class) type2;
                }
                if (s(clsN, cls2) && v(type, clsN)) {
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
        }
        return cls.getGenericSuperclass();
    }

    public static Type[] k(TypeVariable<?> typeVariable) {
        zmq.i(typeVariable, "typeVariable is null", new Object[0]);
        Type[] bounds = typeVariable.getBounds();
        return bounds.length == 0 ? new Type[]{Object.class} : z(bounds);
    }

    public static Type[] l(WildcardType wildcardType) {
        zmq.i(wildcardType, "wildcardType is null", new Object[0]);
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length == 0 ? new Type[]{null} : lowerBounds;
    }

    public static Type[] m(WildcardType wildcardType) {
        zmq.i(wildcardType, "wildcardType is null", new Object[0]);
        Type[] upperBounds = wildcardType.getUpperBounds();
        return upperBounds.length == 0 ? new Type[]{Object.class} : z(upperBounds);
    }

    public static Class<?> n(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (rawType instanceof Class) {
            return (Class) rawType;
        }
        throw new IllegalStateException("Wait... What!? Type of rawType: " + rawType);
    }

    public static Map<TypeVariable<?>, Type> o(Class<?> cls, Class<?> cls2, Map<TypeVariable<?>, Type> map) {
        if (!s(cls, cls2)) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                return new HashMap();
            }
            cls = ClassUtils.f(cls);
        }
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        return cls2.equals(cls) ? map2 : r(j(cls, cls2), cls2, map2);
    }

    public static Map<TypeVariable<?>, Type> p(ParameterizedType parameterizedType, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Map<TypeVariable<?>, Type> map2;
        Class<?> clsN = n(parameterizedType);
        if (!s(clsN, cls)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            map2 = p(parameterizedType2, n(parameterizedType2), map);
        } else {
            map2 = map == null ? new HashMap<>() : new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = clsN.getTypeParameters();
        for (int i = 0; i < typeParameters.length; i++) {
            Type type = actualTypeArguments[i];
            TypeVariable<Class<?>> typeVariable = typeParameters[i];
            if (map2.containsKey(type)) {
                type = map2.get(type);
            }
            map2.put(typeVariable, type);
        }
        return cls.equals(clsN) ? map2 : r(j(clsN, cls), cls, map2);
    }

    public static Map<TypeVariable<?>, Type> q(Type type, Class<?> cls) {
        return r(type, cls, null);
    }

    public static Map<TypeVariable<?>, Type> r(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        if (type instanceof Class) {
            return o((Class) type, cls, map);
        }
        if (type instanceof ParameterizedType) {
            return p((ParameterizedType) type, cls, map);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (cls.isArray()) {
                cls = cls.getComponentType();
            }
            return r(genericComponentType, cls, map);
        }
        int i = 0;
        if (type instanceof WildcardType) {
            Type[] typeArrM = m((WildcardType) type);
            int length = typeArrM.length;
            while (i < length) {
                Type type2 = typeArrM[i];
                if (s(type2, cls)) {
                    return r(type2, cls, map);
                }
                i++;
            }
            return null;
        }
        if (!(type instanceof TypeVariable)) {
            throw new IllegalStateException("found an unhandled type: " + type);
        }
        Type[] typeArrK = k((TypeVariable) type);
        int length2 = typeArrK.length;
        while (i < length2) {
            Type type3 = typeArrK[i];
            if (s(type3, cls)) {
                return r(type3, cls, map);
            }
            i++;
        }
        return null;
    }

    public static boolean s(Type type, Class<?> cls) {
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
            return ClassUtils.c((Class) type, cls);
        }
        if (type instanceof ParameterizedType) {
            return s(n((ParameterizedType) type), cls);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (s(type2, cls)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (cls.equals(Object.class)) {
                return true;
            }
            return cls.isArray() && s(((GenericArrayType) type).getGenericComponentType(), cls.getComponentType());
        }
        if (type instanceof WildcardType) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    public static boolean t(Type type, GenericArrayType genericArrayType, Map<TypeVariable<?>, Type> map) {
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
            return cls.isArray() && w(cls.getComponentType(), genericComponentType, map);
        }
        if (type instanceof GenericArrayType) {
            return w(((GenericArrayType) type).getGenericComponentType(), genericComponentType, map);
        }
        if (type instanceof WildcardType) {
            for (Type type2 : m((WildcardType) type)) {
                if (v(type2, genericArrayType)) {
                    return true;
                }
            }
            return false;
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof ParameterizedType) {
                return false;
            }
            throw new IllegalStateException("found an unhandled type: " + type);
        }
        for (Type type3 : k((TypeVariable) type)) {
            if (v(type3, genericArrayType)) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(Type type, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (parameterizedType == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> clsN = n(parameterizedType);
        Map<TypeVariable<?>, Type> mapR = r(type, clsN, null);
        if (mapR == null) {
            return false;
        }
        if (mapR.isEmpty()) {
            return true;
        }
        Map<TypeVariable<?>, Type> mapP = p(parameterizedType, clsN, map);
        for (TypeVariable<?> typeVariable : mapP.keySet()) {
            Type typeE = E(typeVariable, mapP);
            Type typeE2 = E(typeVariable, mapR);
            if (typeE2 != null && !typeE.equals(typeE2) && (!(typeE instanceof WildcardType) || !w(typeE2, typeE, map))) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(Type type, Type type2) {
        return w(type, type2, null);
    }

    public static boolean w(Type type, Type type2, Map<TypeVariable<?>, Type> map) {
        if (type2 == null || (type2 instanceof Class)) {
            return s(type, (Class) type2);
        }
        if (type2 instanceof ParameterizedType) {
            return u(type, (ParameterizedType) type2, map);
        }
        if (type2 instanceof GenericArrayType) {
            return t(type, (GenericArrayType) type2, map);
        }
        if (type2 instanceof WildcardType) {
            return y(type, (WildcardType) type2, map);
        }
        if (type2 instanceof TypeVariable) {
            return x(type, (TypeVariable) type2, map);
        }
        throw new IllegalStateException("found an unhandled type: " + type2);
    }

    public static boolean x(Type type, TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
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
            for (Type type2 : k((TypeVariable) type)) {
                if (x(type2, typeVariable, map)) {
                    return true;
                }
            }
        }
        if ((type instanceof Class) || (type instanceof ParameterizedType) || (type instanceof GenericArrayType) || (type instanceof WildcardType)) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    public static boolean y(Type type, WildcardType wildcardType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (wildcardType == null) {
            return false;
        }
        if (wildcardType.equals(type)) {
            return true;
        }
        Type[] typeArrM = m(wildcardType);
        Type[] typeArrL = l(wildcardType);
        if (!(type instanceof WildcardType)) {
            for (Type type2 : typeArrM) {
                if (!w(type, B(type2, map), map)) {
                    return false;
                }
            }
            for (Type type3 : typeArrL) {
                if (!w(B(type3, map), type, map)) {
                    return false;
                }
            }
            return true;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        Type[] typeArrM2 = m(wildcardType2);
        Type[] typeArrL2 = l(wildcardType2);
        for (Type type4 : typeArrM) {
            Type typeB = B(type4, map);
            for (Type type5 : typeArrM2) {
                if (!w(type5, typeB, map)) {
                    return false;
                }
            }
        }
        for (Type type6 : typeArrL) {
            Type typeB2 = B(type6, map);
            for (Type type7 : typeArrL2) {
                if (!w(typeB2, type7, map)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Type[] z(Type[] typeArr) {
        zmq.i(typeArr, "null value specified for bounds array", new Object[0]);
        if (typeArr.length < 2) {
            return typeArr;
        }
        HashSet hashSet = new HashSet(typeArr.length);
        for (Type type : typeArr) {
            int length = typeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    hashSet.add(type);
                    break;
                }
                Type type2 = typeArr[i];
                if (type != type2 && w(type2, type, null)) {
                    break;
                }
                i++;
            }
        }
        return (Type[]) hashSet.toArray(new Type[hashSet.size()]);
    }
}
