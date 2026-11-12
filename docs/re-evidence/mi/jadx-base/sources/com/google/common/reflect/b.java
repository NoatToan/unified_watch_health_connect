package com.google.common.reflect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.s;
import defpackage.c6i;
import defpackage.j4h;
import defpackage.l5q;
import defpackage.prd;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9307a;

    public class a extends l5q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f9308b;
        public final /* synthetic */ Type c;

        public a(Map map, Type type) {
            this.f9308b = map;
            this.c = type;
        }

        @Override // defpackage.l5q
        public void b(Class<?> cls) {
            if (this.c instanceof WildcardType) {
                return;
            }
            String strValueOf = String.valueOf(cls);
            String strValueOf2 = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25 + strValueOf2.length());
            sb.append("No type mapping from ");
            sb.append(strValueOf);
            sb.append(" to ");
            sb.append(strValueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // defpackage.l5q
        public void c(GenericArrayType genericArrayType) {
            Type type = this.c;
            if (type instanceof WildcardType) {
                return;
            }
            Type typeI = com.google.common.reflect.c.i(type);
            c6i.j(typeI != null, "%s is not an array type.", this.c);
            b.g(this.f9308b, genericArrayType.getGenericComponentType(), typeI);
        }

        @Override // defpackage.l5q
        public void d(ParameterizedType parameterizedType) {
            Type type = this.c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) b.e(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                b.g(this.f9308b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            c6i.k(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            c6i.k(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                b.g(this.f9308b, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        }

        @Override // defpackage.l5q
        public void e(TypeVariable<?> typeVariable) {
            this.f9308b.put(new d(typeVariable), this.c);
        }

        @Override // defpackage.l5q
        public void f(WildcardType wildcardType) {
            Type type = this.c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                c6i.k(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, this.c);
                for (int i = 0; i < upperBounds.length; i++) {
                    b.g(this.f9308b, upperBounds[i], upperBounds2[i]);
                }
                for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                    b.g(this.f9308b, lowerBounds[i2], lowerBounds2[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$b, reason: collision with other inner class name */
    public static final class C0246b extends l5q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<d, Type> f9309b = s.o();

        public static ImmutableMap<d, Type> g(Type type) {
            c6i.o(type);
            C0246b c0246b = new C0246b();
            c0246b.a(type);
            return ImmutableMap.copyOf((Map) c0246b.f9309b);
        }

        @Override // defpackage.l5q
        public void b(Class<?> cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        @Override // defpackage.l5q
        public void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            c6i.t(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                h(new d(typeParameters[i]), actualTypeArguments[i]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
        }

        @Override // defpackage.l5q
        public void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // defpackage.l5q
        public void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }

        public final void h(d dVar, Type type) {
            if (this.f9309b.containsKey(dVar)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (dVar.a(type2)) {
                    while (type != null) {
                        type = this.f9309b.remove(d.c(type));
                    }
                    return;
                }
                type2 = this.f9309b.get(d.c(type2));
            }
            this.f9309b.put(dVar, type);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeVariable<?> f9312a;

        public d(TypeVariable<?> typeVariable) {
            this.f9312a = (TypeVariable) c6i.o(typeVariable);
        }

        public static d c(Type type) {
            if (type instanceof TypeVariable) {
                return new d((TypeVariable) type);
            }
            return null;
        }

        public boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public final boolean b(TypeVariable<?> typeVariable) {
            return this.f9312a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f9312a.getName().equals(typeVariable.getName());
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return b(((d) obj).f9312a);
            }
            return false;
        }

        public int hashCode() {
            return j4h.b(this.f9312a.getGenericDeclaration(), this.f9312a.getName());
        }

        public String toString() {
            return this.f9312a.toString();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f9313b = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f9314a;

        public class a extends e {
            public final /* synthetic */ TypeVariable c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.c = typeVariable;
            }

            @Override // com.google.common.reflect.b.e
            public TypeVariable<?> b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public /* synthetic */ e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        public final Type a(Type type) {
            c6i.o(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return com.google.common.reflect.c.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                actualTypeArguments[i] = d(typeParameters[i]).a(actualTypeArguments[i]);
            }
            return com.google.common.reflect.c.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        public TypeVariable<?> b(Type[] typeArr) {
            int iIncrementAndGet = this.f9314a.incrementAndGet();
            String strE = prd.f(Typography.amp).e(typeArr);
            StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 33);
            sb.append("capture#");
            sb.append(iIncrementAndGet);
            sb.append("-of ? extends ");
            sb.append(strE);
            return com.google.common.reflect.c.k(e.class, sb.toString(), typeArr);
        }

        public final Type c(Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        public final e d(TypeVariable<?> typeVariable) {
            return new a(this, this.f9314a, typeVariable);
        }

        public final e e() {
            return new e(this.f9314a);
        }

        public e() {
            this(new AtomicInteger());
        }

        public e(AtomicInteger atomicInteger) {
            this.f9314a = atomicInteger;
        }
    }

    public /* synthetic */ b(c cVar, a aVar) {
        this(cVar);
    }

    public static b d(Type type) {
        return new b().o(C0246b.g(type));
    }

    public static <T> T e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            String strValueOf = String.valueOf(obj);
            String simpleName = cls.getSimpleName();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 10 + simpleName.length());
            sb.append(strValueOf);
            sb.append(" is not a ");
            sb.append(simpleName);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static b f(Type type) {
        return new b().o(C0246b.g(e.f9313b.a(type)));
    }

    public static void g(Map<d, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new a(map, type2).a(type);
    }

    public final Type h(GenericArrayType genericArrayType) {
        return com.google.common.reflect.c.j(j(genericArrayType.getGenericComponentType()));
    }

    public final ParameterizedType i(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return com.google.common.reflect.c.m(ownerType == null ? null : j(ownerType), (Class) j(parameterizedType.getRawType()), k(parameterizedType.getActualTypeArguments()));
    }

    public Type j(Type type) {
        c6i.o(type);
        if (type instanceof TypeVariable) {
            return this.f9307a.a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return h((GenericArrayType) type);
        }
        return type instanceof WildcardType ? m((WildcardType) type) : type;
    }

    public final Type[] k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = j(typeArr[i]);
        }
        return typeArr2;
    }

    public Type[] l(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = j(typeArr[i]);
        }
        return typeArr;
    }

    public final WildcardType m(WildcardType wildcardType) {
        return new com.google.common.reflect.c.i(k(wildcardType.getLowerBounds()), k(wildcardType.getUpperBounds()));
    }

    public b n(Type type, Type type2) {
        HashMap mapO = s.o();
        g(mapO, (Type) c6i.o(type), (Type) c6i.o(type2));
        return o(mapO);
    }

    public b o(Map<d, ? extends Type> map) {
        return new b(this.f9307a.c(map));
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap<d, Type> f9310a;

        public class a extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TypeVariable f9311b;
            public final /* synthetic */ c c;

            public a(c cVar, TypeVariable typeVariable, c cVar2) {
                this.f9311b = typeVariable;
                this.c = cVar2;
            }

            @Override // com.google.common.reflect.b.c
            public Type b(TypeVariable<?> typeVariable, c cVar) {
                return typeVariable.getGenericDeclaration().equals(this.f9311b.getGenericDeclaration()) ? typeVariable : this.c.b(typeVariable, cVar);
            }
        }

        public c() {
            this.f9310a = ImmutableMap.of();
        }

        public final Type a(TypeVariable<?> typeVariable) {
            return b(typeVariable, new a(this, typeVariable, this));
        }

        public Type b(TypeVariable<?> typeVariable, c cVar) {
            Type type = this.f9310a.get(new d(typeVariable));
            a aVar = null;
            if (type != null) {
                return new b(cVar, aVar).j(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] typeArrK = new b(cVar, aVar).k(bounds);
            return (com.google.common.reflect.c.e.f9322a && Arrays.equals(bounds, typeArrK)) ? typeVariable : com.google.common.reflect.c.k(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrK);
        }

        public final c c(Map<d, ? extends Type> map) {
            ImmutableMap.b bVarBuilder = ImmutableMap.builder();
            bVarBuilder.j(this.f9310a);
            for (Map.Entry<d, ? extends Type> entry : map.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                c6i.j(!key.a(value), "Type variable %s bound to itself", key);
                bVarBuilder.g(key, value);
            }
            return new c(bVarBuilder.d());
        }

        public c(ImmutableMap<d, Type> immutableMap) {
            this.f9310a = immutableMap;
        }
    }

    public b() {
        this.f9307a = new c();
    }

    public b(c cVar) {
        this.f9307a = cVar;
    }
}
