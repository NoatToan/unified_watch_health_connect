package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
final class acw {
    acw() {
    }

    public static TypeResolutionContext e(Method method, JavaType javaType, ahp ahpVar, TypeResolutionContext typeResolutionContext) {
        ahn ahnVarC = c(method, javaType, typeResolutionContext);
        return ahnVarC == null ? typeResolutionContext : new TypeResolutionContext.e(ahpVar, ahnVarC);
    }

    static ahn c(Method method, JavaType javaType, TypeResolutionContext typeResolutionContext) {
        JavaType javaTypeE;
        TypeVariable<?> typeVariableB;
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();
        if (typeParameters.length == 0 || javaType.getBindings().a()) {
            return null;
        }
        Type genericReturnType = method.getGenericReturnType();
        if (!(genericReturnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
        if (!Objects.equals(javaType.getRawClass(), parameterizedType.getRawType())) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        ArrayList arrayList2 = new ArrayList(typeParameters.length);
        for (int i = 0; i < actualTypeArguments.length; i++) {
            TypeVariable<?> typeVariableD = d(actualTypeArguments[i]);
            if (typeVariableD != null) {
                String name = typeVariableD.getName();
                if (name == null || (javaTypeE = javaType.getBindings().e(i)) == null || (typeVariableB = b(typeParameters, name)) == null) {
                    return null;
                }
                if (a(typeResolutionContext, javaTypeE, typeVariableB.getBounds())) {
                    int iIndexOf = arrayList.indexOf(name);
                    if (iIndexOf != -1) {
                        JavaType javaType2 = (JavaType) arrayList2.get(iIndexOf);
                        if (javaTypeE.equals(javaType2)) {
                            continue;
                        } else {
                            boolean zIsTypeOrSubTypeOf = javaType2.isTypeOrSubTypeOf(javaTypeE.getRawClass());
                            boolean zIsTypeOrSubTypeOf2 = javaTypeE.isTypeOrSubTypeOf(javaType2.getRawClass());
                            if (!zIsTypeOrSubTypeOf && !zIsTypeOrSubTypeOf2) {
                                return null;
                            }
                            if ((zIsTypeOrSubTypeOf ^ zIsTypeOrSubTypeOf2) && zIsTypeOrSubTypeOf2) {
                                arrayList2.set(iIndexOf, javaTypeE);
                            }
                        }
                    } else {
                        arrayList.add(name);
                        arrayList2.add(javaTypeE);
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ahn.b(arrayList, arrayList2);
    }

    private static TypeVariable<?> d(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return d(upperBounds[0]);
            }
        }
        return null;
    }

    private static ParameterizedType e(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return e(upperBounds[0]);
            }
        }
        return null;
    }

    private static boolean a(TypeResolutionContext typeResolutionContext, JavaType javaType, Type[] typeArr) {
        for (Type type : typeArr) {
            if (!c(typeResolutionContext, javaType, type)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(TypeResolutionContext typeResolutionContext, JavaType javaType, Type type) {
        if (!javaType.isTypeOrSubTypeOf(typeResolutionContext.resolveType(type).getRawClass())) {
            return false;
        }
        ParameterizedType parameterizedTypeE = e(type);
        if (parameterizedTypeE == null || !Objects.equals(javaType.getRawClass(), parameterizedTypeE.getRawType())) {
            return true;
        }
        Type[] actualTypeArguments = parameterizedTypeE.getActualTypeArguments();
        ahn bindings = javaType.getBindings();
        if (bindings.c() != actualTypeArguments.length) {
            return false;
        }
        for (int i = 0; i < bindings.c(); i++) {
            if (!c(typeResolutionContext, bindings.e(i), actualTypeArguments[i])) {
                return false;
            }
        }
        return true;
    }

    private static TypeVariable<?> b(TypeVariable<?>[] typeVariableArr, String str) {
        if (typeVariableArr == null || str == null) {
            return null;
        }
        for (TypeVariable<?> typeVariable : typeVariableArr) {
            if (str.equals(typeVariable.getName())) {
                return typeVariable;
            }
        }
        return null;
    }
}
