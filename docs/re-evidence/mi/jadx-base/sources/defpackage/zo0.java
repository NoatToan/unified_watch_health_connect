package defpackage;

import cn.hutool.core.lang.SimpleCache;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleCache<Type, Map<Type, Type>> f41508a = new SimpleCache<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Class] */
    public static Map<Type, Type> b(Type type) {
        HashMap map = new HashMap();
        while (type != 0) {
            ParameterizedType parameterizedTypeS = i5q.s(type);
            if (parameterizedTypeS == null) {
                break;
            }
            Type[] actualTypeArguments = parameterizedTypeS.getActualTypeArguments();
            type = (Class) parameterizedTypeS.getRawType();
            TypeVariable[] typeParameters = type.getTypeParameters();
            for (int i = 0; i < typeParameters.length; i++) {
                map.put(typeParameters[i], actualTypeArguments[i]);
            }
        }
        return map;
    }

    public static Map<Type, Type> c(Type type) {
        return f41508a.get(type, new yo0(type));
    }

    public static Type d(Type type, TypeVariable<?> typeVariable) {
        Map<Type, Type> mapC = c(type);
        Type type2 = mapC.get(typeVariable);
        while (true) {
            Type type3 = type2;
            if (!(type3 instanceof TypeVariable)) {
                return type3;
            }
            type2 = mapC.get(type3);
        }
    }

    public static Type[] e(Type type, Type... typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            Type typeD = typeArr[i];
            if (typeD instanceof TypeVariable) {
                typeD = d(type, (TypeVariable) typeD);
            }
            typeArr2[i] = typeD;
        }
        return typeArr2;
    }
}
