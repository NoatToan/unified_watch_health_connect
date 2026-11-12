package i63;

import gl1.y;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m63.a2;
import m63.g1;
import m63.j1;
import m63.r1;
import m63.w0;
import o13.p;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k {
    public static final Class<?> a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return a(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objE = u.E(upperBounds);
            objE.getClass();
            return a((Type) objE);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return a(genericComponentType);
        }
        StringBuilder sb3 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb3.append(type);
        sb3.append(" has type ");
        vb.h.s(p6.b.h(s0.f105811a, type.getClass(), sb3));
        return null;
    }

    public static final <T> c<T> b(p63.e eVar, Class<T> cls, List<? extends c<Object>> list) {
        c[] cVarArr = (c[]) list.toArray(new c[0]);
        c<T> cVarA = j1.a(cls, (c[]) Arrays.copyOf(cVarArr, cVarArr.length));
        if (cVarA != null) {
            return cVarA;
        }
        t0 t0Var = s0.f105811a;
        k23.d dVarB = t0Var.b(cls);
        c<T> cVar = (c) r1.f117011a.get(dVarB);
        if (cVar != null) {
            return cVar;
        }
        c<T> cVarB = eVar.b(dVarB, list);
        if (cVarB != null) {
            return cVarB;
        }
        if (cls.isInterface()) {
            return new e(t0Var.b(cls));
        }
        return null;
    }

    public static final c<Object> c(p63.e eVar, Type type, boolean z14) {
        ArrayList<c> arrayList;
        c<Object> cVarC;
        c<Object> cVarC2;
        k23.d dVarB;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                upperBounds.getClass();
                genericComponentType = (Type) u.E(upperBounds);
            }
            genericComponentType.getClass();
            if (z14) {
                cVarC2 = y.K(eVar, genericComponentType);
            } else {
                eVar.getClass();
                cVarC2 = c(eVar, genericComponentType, false);
                if (cVarC2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                rawType.getClass();
                dVarB = s0.f105811a.b((Class) rawType);
            } else {
                if (!(genericComponentType instanceof k23.d)) {
                    vb.h.z(p6.b.h(s0.f105811a, genericComponentType.getClass(), new StringBuilder("unsupported type in GenericArray: ")));
                    return null;
                }
                dVarB = (k23.d) genericComponentType;
            }
            dVarB.getClass();
            return j63.a.a(dVarB, cVarC2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return b(eVar, cls, j0.f134944a);
            }
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            if (z14) {
                cVarC = y.K(eVar, componentType);
            } else {
                eVar.getClass();
                cVarC = c(eVar, componentType, false);
                if (cVarC == null) {
                    return null;
                }
            }
            return j63.a.a(s0.f105811a.b(componentType), cVarC);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                upperBounds2.getClass();
                Object objE = u.E(upperBounds2);
                objE.getClass();
                return c(eVar, (Type) objE, true);
            }
            StringBuilder sb3 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb3.append(type);
            sb3.append(" has type ");
            vb.h.s(p6.b.h(s0.f105811a, type.getClass(), sb3));
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        rawType2.getClass();
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        if (z14) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                type2.getClass();
                arrayList.add(y.K(eVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                type3.getClass();
                eVar.getClass();
                c<Object> cVarC3 = c(eVar, type3, false);
                if (cVarC3 == null) {
                    return null;
                }
                arrayList.add(cVarC3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            c cVar = (c) arrayList.get(0);
            cVar.getClass();
            return new m63.s0(cVar);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            return j63.a.b((c) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return j63.a.c((c) arrayList.get(0), (c) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            c cVar2 = (c) arrayList.get(0);
            c cVar3 = (c) arrayList.get(1);
            cVar2.getClass();
            cVar3.getClass();
            return new w0(cVar2, cVar3);
        }
        if (p.class.isAssignableFrom(cls2)) {
            c cVar4 = (c) arrayList.get(0);
            c cVar5 = (c) arrayList.get(1);
            cVar4.getClass();
            cVar5.getClass();
            return new g1(cVar4, cVar5);
        }
        if (o13.u.class.isAssignableFrom(cls2)) {
            c cVar6 = (c) arrayList.get(0);
            c cVar7 = (c) arrayList.get(1);
            c cVar8 = (c) arrayList.get(2);
            cVar6.getClass();
            cVar7.getClass();
            cVar8.getClass();
            return new a2(cVar6, cVar7, cVar8);
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (c cVar9 : arrayList) {
            cVar9.getClass();
            arrayList2.add(cVar9);
        }
        return b(eVar, cls2, arrayList2);
    }
}
