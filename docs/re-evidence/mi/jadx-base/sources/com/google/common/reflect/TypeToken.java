package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.s;
import defpackage.c6i;
import defpackage.h6i;
import defpackage.ich;
import defpackage.iz9;
import defpackage.l5q;
import defpackage.o4q;
import defpackage.prd;
import defpackage.uaq;
import defpackage.w1a;
import defpackage.w4q;
import defpackage.y8i;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class TypeToken<T> extends o4q<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    private transient com.google.common.reflect.b covariantTypeResolver;
    private transient com.google.common.reflect.b invariantTypeResolver;
    private final Type runtimeType;

    public class a extends com.google.common.reflect.a.b<T> {
        public a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.a
        public TypeToken<T> a() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.a
        public String toString() {
            String strValueOf = String.valueOf(a());
            String string = super.toString();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(string).length());
            sb.append(strValueOf);
            sb.append(".");
            sb.append(string);
            return sb.toString();
        }
    }

    public class b extends com.google.common.reflect.a.C0245a<T> {
        public b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.a
        public TypeToken<T> a() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.a.C0245a
        public Type[] b() {
            return TypeToken.this.getInvariantTypeResolver().l(super.b());
        }

        @Override // com.google.common.reflect.a
        public String toString() {
            String strValueOf = String.valueOf(a());
            String strE = prd.g(", ").e(b());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 2 + String.valueOf(strE).length());
            sb.append(strValueOf);
            sb.append("(");
            sb.append(strE);
            sb.append(")");
            return sb.toString();
        }
    }

    public class c extends l5q {
        public c() {
        }

        @Override // defpackage.l5q
        public void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // defpackage.l5q
        public void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // defpackage.l5q
        public void e(TypeVariable<?> typeVariable) {
            String strValueOf = String.valueOf(TypeToken.this.runtimeType);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
            sb.append(strValueOf);
            sb.append("contains a type variable and is not safe for the operation");
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // defpackage.l5q
        public void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    public class d extends l5q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImmutableSet.a f9292b;

        public d(TypeToken typeToken, ImmutableSet.a aVar) {
            this.f9292b = aVar;
        }

        @Override // defpackage.l5q
        public void b(Class<?> cls) {
            this.f9292b.a(cls);
        }

        @Override // defpackage.l5q
        public void c(GenericArrayType genericArrayType) {
            this.f9292b.a(com.google.common.reflect.c.h(TypeToken.of(genericArrayType.getGenericComponentType()).getRawType()));
        }

        @Override // defpackage.l5q
        public void d(ParameterizedType parameterizedType) {
            this.f9292b.a((Class) parameterizedType.getRawType());
        }

        @Override // defpackage.l5q
        public void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // defpackage.l5q
        public void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type[] f9293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9294b;

        public e(Type[] typeArr, boolean z) {
            this.f9293a = typeArr;
            this.f9294b = z;
        }

        public boolean a(Type type) {
            for (Type type2 : this.f9293a) {
                boolean zIsSubtypeOf = TypeToken.of(type2).isSubtypeOf(type);
                boolean z = this.f9294b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f9294b;
        }

        public boolean b(Type type) {
            TypeToken<?> typeTokenOf = TypeToken.of(type);
            for (Type type2 : this.f9293a) {
                boolean zIsSubtypeOf = typeTokenOf.isSubtypeOf(type2);
                boolean z = this.f9294b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f9294b;
        }
    }

    public final class f extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient ImmutableSet<TypeToken<? super T>> f9295a;

        public f() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) i.f9300b.a().c(TypeToken.this.getRawTypes()));
        }

        public /* synthetic */ f(TypeToken typeToken, a aVar) {
            this();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, defpackage.w1a, defpackage.i1a, defpackage.t1a
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f9295a;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetJ = iz9.h(i.f9299a.a().d(TypeToken.this)).g(j.f9303a).j();
            this.f9295a = immutableSetJ;
            return immutableSetJ;
        }
    }

    public static final class h<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public h(Type type) {
            super(type, null);
        }
    }

    public static abstract class i<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i<TypeToken<?>> f9299a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i<Class<?>> f9300b = new b();

        public class a extends i<TypeToken<?>> {
            public a() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends TypeToken<?>> e(TypeToken<?> typeToken) {
                return typeToken.getGenericInterfaces();
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public TypeToken<?> g(TypeToken<?> typeToken) {
                return typeToken.getGenericSuperclass();
            }
        }

        public class b extends i<Class<?>> {
            public b() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(Class<?> cls) {
                return cls;
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class<?> g(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        public class c extends e<K> {
            public c(i iVar, i iVar2) {
                super(iVar2);
            }

            @Override // com.google.common.reflect.TypeToken.i
            public ImmutableList<K> c(Iterable<? extends K> iterable) {
                ImmutableList.a aVarBuilder = ImmutableList.builder();
                for (K k2 : iterable) {
                    if (!f(k2).isInterface()) {
                        aVarBuilder.a(k2);
                    }
                }
                return super.c(aVarBuilder.k());
            }

            @Override // com.google.common.reflect.TypeToken.i
            public Iterable<? extends K> e(K k2) {
                return ImmutableSet.of();
            }
        }

        public class d extends ich<K> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Comparator f9301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map f9302b;

            public d(Comparator comparator, Map map) {
                this.f9301a = comparator;
                this.f9302b = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ich, java.util.Comparator
            public int compare(K k2, K k3) {
                Comparator comparator = this.f9301a;
                Object obj = this.f9302b.get(k2);
                Objects.requireNonNull(obj);
                Object obj2 = this.f9302b.get(k3);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        public static class e<K> extends i<K> {
            public final i<K> c;

            public e(i<K> iVar) {
                super(null);
                this.c = iVar;
            }

            @Override // com.google.common.reflect.TypeToken.i
            public Class<?> f(K k2) {
                return this.c.f(k2);
            }

            @Override // com.google.common.reflect.TypeToken.i
            public K g(K k2) {
                return this.c.g(k2);
            }
        }

        public i() {
        }

        public /* synthetic */ i(a aVar) {
            this();
        }

        public static <K, V> ImmutableList<K> h(Map<K, V> map, Comparator<? super V> comparator) {
            return (ImmutableList<K>) new d(comparator, map).b(map.keySet());
        }

        public final i<K> a() {
            return new c(this, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int b(K k2, Map<? super K, Integer> map) {
            Integer num = map.get(k2);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = f(k2).isInterface();
            Iterator<? extends K> it = e(k2).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, b(it.next(), map));
            }
            K kG = g(k2);
            int iMax2 = iMax;
            if (kG != null) {
                iMax2 = Math.max(iMax, b(kG, map));
            }
            int i = iMax2 + 1;
            map.put(k2, Integer.valueOf(i));
            return i;
        }

        public ImmutableList<K> c(Iterable<? extends K> iterable) {
            HashMap mapO = s.o();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), mapO);
            }
            return h(mapO, ich.e().h());
        }

        public final ImmutableList<K> d(K k2) {
            return c(ImmutableList.of(k2));
        }

        public abstract Iterable<? extends K> e(K k2);

        public abstract Class<?> f(K k2);

        public abstract K g(K k2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class j implements h6i<TypeToken<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f9303a = new a("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f9304b = new b("INTERFACE_ONLY", 1);
        public static final /* synthetic */ j[] c = a();

        public final enum a extends j {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.h6i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).runtimeType instanceof TypeVariable) || (((TypeToken) typeToken).runtimeType instanceof WildcardType)) ? false : true;
            }
        }

        public final enum b extends j {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.h6i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }

        public j(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ j[] a() {
            return new j[]{f9303a, f9304b};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) c.clone();
        }

        public /* synthetic */ j(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public /* synthetic */ TypeToken(Type type, a aVar) {
        this(type);
    }

    private static e any(Type[] typeArr) {
        return new e(typeArr, true);
    }

    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.getRawType().isInterface()) {
                aVarBuilder.a(typeTokenOf);
            }
        }
        return aVarBuilder.k();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? canonicalizeWildcardType(typeVariable, (WildcardType) type) : canonicalizeWildcardsInType(type);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).a(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new com.google.common.reflect.c.i(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            actualTypeArguments[i2] = canonicalizeTypeArg(typeParameters[i2], actualTypeArguments[i2]);
        }
        return com.google.common.reflect.c.m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        if (type instanceof ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((ParameterizedType) type);
        }
        return type instanceof GenericArrayType ? com.google.common.reflect.c.j(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static e every(Type[] typeArr) {
        return new e(typeArr, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            TypeToken<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? extends T>) of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).runtimeType));
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 36 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(" does not appear to be a subtype of ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType != 0) {
            Class<?> componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? super T>) of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).runtimeType));
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 23 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(" isn't a super type of ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.b getCovariantTypeResolver() {
        com.google.common.reflect.b bVar = this.covariantTypeResolver;
        if (bVar != null) {
            return bVar;
        }
        com.google.common.reflect.b bVarD = com.google.common.reflect.b.d(this.runtimeType);
        this.covariantTypeResolver = bVarD;
        return bVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.b getInvariantTypeResolver() {
        com.google.common.reflect.b bVar = this.invariantTypeResolver;
        if (bVar != null) {
            return bVar;
        }
        com.google.common.reflect.b bVarF = com.google.common.reflect.b.f(this.runtimeType);
        this.invariantTypeResolver = bVarF;
        return bVarF;
    }

    private Type getOwnerTypeIfPresent() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableSet<Class<? super T>> getRawTypes() {
        ImmutableSet.a aVarBuilder = ImmutableSet.builder();
        new d(this, aVarBuilder).a(this.runtimeType);
        return aVarBuilder.m();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(" isn't a subclass of ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) typeTokenOf.getSupertype(cls);
            }
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 23 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(" isn't a super type of ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
        }
        WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
        return every(wildcardTypeCanonicalizeWildcardType.getUpperBounds()).b(this.runtimeType) && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).a(this.runtimeType);
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator<TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = of(parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < typeParameters.length; i2++) {
            if (!of(getCovariantTypeResolver().j(typeParameters[i2])).is(actualTypeArguments[i2], typeParameters[i2])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType());
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean isWrapper() {
        return y8i.b().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return com.google.common.reflect.c.d.f9321b.c(type);
    }

    public static <T> TypeToken<T> of(Class<T> cls) {
        return new h(cls);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> typeTokenOf = of(getCovariantTypeResolver().j(type));
        typeTokenOf.covariantTypeResolver = this.covariantTypeResolver;
        typeTokenOf.invariantTypeResolver = this.invariantTypeResolver;
        return typeTokenOf;
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken genericType = toGenericType(cls);
        return new com.google.common.reflect.b().n(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).j(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        uaq<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (TypeToken<? extends T>) of(com.google.common.reflect.c.j(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (TypeToken<? extends T>) of(com.google.common.reflect.c.m(type, cls, typeParameters)) : of((Class) cls);
    }

    public final com.google.common.reflect.a<T, T> constructor(Constructor<?> constructor) {
        c6i.k(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new b(constructor);
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    public final TypeToken<?> getComponentType() {
        Type typeI = com.google.common.reflect.c.i(this.runtimeType);
        if (typeI == null) {
            return null;
        }
        return of(typeI);
    }

    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            aVarBuilder.a(resolveSupertype(type2));
        }
        return aVarBuilder.k();
    }

    public final TypeToken<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (TypeToken<? super T>) resolveSupertype(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        c6i.j(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        c6i.k(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) of(resolveTypeArgsForSubclass(cls));
        c6i.k(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        c6i.k(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds());
        }
        return cls.isArray() ? getArraySupertype(cls) : (TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final com.google.common.reflect.a<T, Object> method(Method method) {
        c6i.k(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new a(method);
    }

    public final TypeToken<T> rejectTypeVariables() {
        new c().a(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        c6i.o(type);
        return of(getInvariantTypeResolver().j(type));
    }

    public String toString() {
        return com.google.common.reflect.c.s(this.runtimeType);
    }

    public final TypeToken<T> unwrap() {
        return isWrapper() ? of(y8i.c((Class) this.runtimeType)) : this;
    }

    public final <X> TypeToken<T> where(w4q<X> w4qVar, TypeToken<X> typeToken) {
        new com.google.common.reflect.b();
        throw null;
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? of(y8i.d((Class) this.runtimeType)) : this;
    }

    public Object writeReplace() {
        return of(new com.google.common.reflect.b().j(this.runtimeType));
    }

    public class TypeSet extends w1a<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        private transient ImmutableSet<TypeToken<? super T>> types;

        public TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new f(TypeToken.this, null);
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new g(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) i.f9300b.c(TypeToken.this.getRawTypes()));
        }

        @Override // defpackage.w1a, defpackage.i1a, defpackage.t1a
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetJ = iz9.h(i.f9299a.d(TypeToken.this)).g(j.f9303a).j();
            this.types = immutableSetJ;
            return immutableSetJ;
        }
    }

    public final class g extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient TypeToken<T>.TypeSet f9297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient ImmutableSet<TypeToken<? super T>> f9298b;

        public g(TypeToken<T>.TypeSet typeSet) {
            super();
            this.f9297a = typeSet;
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return iz9.h(i.f9300b.c(TypeToken.this.getRawTypes())).g(new h6i() { // from class: g5q
                @Override // defpackage.h6i
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).j();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, defpackage.w1a, defpackage.i1a, defpackage.t1a
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f9298b;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetJ = iz9.h(this.f9297a).g(j.f9304b).j();
            this.f9298b = immutableSetJ;
            return immutableSetJ;
        }
    }

    public TypeToken() {
        Type typeCapture = capture();
        this.runtimeType = typeCapture;
        c6i.w(!(typeCapture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture);
    }

    public static TypeToken<?> of(Type type) {
        return new h(type);
    }

    public final boolean isSubtypeOf(Type type) {
        c6i.o(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).b(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return any(((WildcardType) type2).getUpperBounds()).a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).a(type);
        }
        if (type2 instanceof GenericArrayType) {
            return of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
        }
        if (type instanceof Class) {
            return someRawTypeIsSubclassOf((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return isSubtypeOfParameterizedType((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return isSubtypeOfArrayType((GenericArrayType) type);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final <X> TypeToken<T> where(w4q<X> w4qVar, Class<X> cls) {
        return where(w4qVar, of((Class) cls));
    }

    public TypeToken(Class<?> cls) {
        Type typeCapture = super.capture();
        if (typeCapture instanceof Class) {
            this.runtimeType = typeCapture;
        } else {
            this.runtimeType = com.google.common.reflect.b.d(cls).j(typeCapture);
        }
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) c6i.o(type);
    }
}
