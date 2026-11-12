package defpackage;

import cn.hutool.core.lang.ParameterizedTypeImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public class i5q {
    public static Type a(Type type, ParameterizedType parameterizedType) {
        if (!q(parameterizedType.getActualTypeArguments())) {
            return parameterizedType;
        }
        Type[] typeArrC = c(type, parameterizedType.getActualTypeArguments());
        return qj1.E(typeArrC) ? new ParameterizedTypeImpl(typeArrC, parameterizedType.getOwnerType(), parameterizedType.getRawType()) : parameterizedType;
    }

    public static Type b(Type type, Type type2) {
        if (type2 instanceof ParameterizedType) {
            return a(type, (ParameterizedType) type2);
        }
        return type2 instanceof TypeVariable ? zo0.d(type, (TypeVariable) type2) : type2;
    }

    public static Type[] c(Type type, Type... typeArr) {
        return zo0.e(type, typeArr);
    }

    public static Class<?> d(Field field) {
        if (field == null) {
            return null;
        }
        return field.getType();
    }

    public static Class<?> e(Type type) {
        if (type == null) {
            return null;
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (!(type instanceof WildcardType)) {
            return null;
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        if (upperBounds.length == 1) {
            return e(upperBounds[0]);
        }
        return null;
    }

    public static Class<?> f(Method method) {
        return g(method, 0);
    }

    public static Class<?> g(Method method, int i) {
        Class<?>[] clsArrH = h(method);
        if (clsArrH == null || clsArrH.length <= i) {
            return null;
        }
        return clsArrH[i];
    }

    public static Class<?>[] h(Method method) {
        if (method == null) {
            return null;
        }
        return method.getParameterTypes();
    }

    public static Type i(Method method, int i) {
        Type[] typeArrJ = j(method);
        if (typeArrJ == null || typeArrJ.length <= i) {
            return null;
        }
        return typeArrJ[i];
    }

    public static Type[] j(Method method) {
        if (method == null) {
            return null;
        }
        return method.getGenericParameterTypes();
    }

    public static Class<?> k(Method method) {
        if (method == null) {
            return null;
        }
        return method.getReturnType();
    }

    public static Type l(Method method) {
        if (method == null) {
            return null;
        }
        return method.getGenericReturnType();
    }

    public static Type m(Field field) {
        if (field == null) {
            return null;
        }
        return field.getGenericType();
    }

    public static Type n(Type type) {
        return o(type, 0);
    }

    public static Type o(Type type, int i) {
        Type[] typeArrP = p(type);
        if (typeArrP == null || typeArrP.length <= i) {
            return null;
        }
        return typeArrP[i];
    }

    public static Type[] p(Type type) {
        ParameterizedType parameterizedTypeS;
        if (type == null || (parameterizedTypeS = s(type)) == null) {
            return null;
        }
        return parameterizedTypeS.getActualTypeArguments();
    }

    public static boolean q(Type... typeArr) {
        for (Type type : typeArr) {
            if (type instanceof TypeVariable) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(Type type) {
        return type == null || (type instanceof TypeVariable);
    }

    public static ParameterizedType s(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass == null || Object.class.equals(genericSuperclass)) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (qj1.E(genericInterfaces)) {
                genericSuperclass = genericInterfaces[0];
            }
        }
        return s(genericSuperclass);
    }
}
