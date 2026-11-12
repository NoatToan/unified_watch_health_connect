package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Primitives;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
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
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public abstract class TypeToken<T> extends com.google.common.reflect.b<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    private final Type a;

    @MonotonicNonNullDecl
    private transient TypeResolver b;

    @MonotonicNonNullDecl
    private transient TypeResolver c;

    public class a extends Invokable.b<T> {
        public a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.Invokable.b, com.google.common.reflect.Invokable
        public Type[] c() {
            return TypeToken.this.r().k(super.c());
        }

        @Override // com.google.common.reflect.Invokable.b, com.google.common.reflect.Invokable
        public Type[] d() {
            return TypeToken.this.u().k(super.d());
        }

        @Override // com.google.common.reflect.Invokable.b, com.google.common.reflect.Invokable
        public Type e() {
            return TypeToken.this.r().resolveType(super.e());
        }

        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.a
        public TypeToken<T> getOwnerType() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.a
        public String toString() {
            return getOwnerType() + "." + super.toString();
        }
    }

    public class b extends Invokable.a<T> {
        public b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.Invokable.a, com.google.common.reflect.Invokable
        public Type[] c() {
            return TypeToken.this.r().k(super.c());
        }

        @Override // com.google.common.reflect.Invokable.a, com.google.common.reflect.Invokable
        public Type[] d() {
            return TypeToken.this.u().k(super.d());
        }

        @Override // com.google.common.reflect.Invokable.a, com.google.common.reflect.Invokable
        public Type e() {
            return TypeToken.this.r().resolveType(super.e());
        }

        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.a
        public TypeToken<T> getOwnerType() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.a
        public String toString() {
            return getOwnerType() + "(" + Joiner.on(", ").join(d()) + ")";
        }
    }

    public class c extends com.google.common.reflect.c {
        public c() {
        }

        @Override // com.google.common.reflect.c
        public void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.c
        public void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.c
        public void e(TypeVariable<?> typeVariable) {
            throw new IllegalArgumentException(TypeToken.this.a + "contains a type variable and is not safe for the operation");
        }

        @Override // com.google.common.reflect.c
        public void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    public class d extends com.google.common.reflect.c {
        public final /* synthetic */ ImmutableSet.Builder b;

        public d(ImmutableSet.Builder builder) {
            this.b = builder;
        }

        @Override // com.google.common.reflect.c
        public void b(Class<?> cls) {
            this.b.add(cls);
        }

        @Override // com.google.common.reflect.c
        public void c(GenericArrayType genericArrayType) {
            this.b.add(com.google.common.reflect.d.i(TypeToken.of(genericArrayType.getGenericComponentType()).getRawType()));
        }

        @Override // com.google.common.reflect.c
        public void d(ParameterizedType parameterizedType) {
            this.b.add((Class) parameterizedType.getRawType());
        }

        @Override // com.google.common.reflect.c
        public void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.c
        public void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    public static class e {
        private final Type[] a;
        private final boolean b;

        public e(Type[] typeArr, boolean z) {
            this.a = typeArr;
            this.b = z;
        }

        public boolean a(Type type) {
            for (Type type2 : this.a) {
                boolean zIsSubtypeOf = TypeToken.of(type2).isSubtypeOf(type);
                boolean z = this.b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.b;
        }

        public boolean b(Type type) {
            TypeToken<?> typeTokenOf = TypeToken.of(type);
            for (Type type2 : this.a) {
                boolean zIsSubtypeOf = typeTokenOf.isSubtypeOf(type2);
                boolean z = this.b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.b;
        }
    }

    public final class f extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        private transient ImmutableSet<TypeToken<? super T>> c;

        private f() {
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
            return ImmutableSet.copyOf((Collection) i.b.a().c(TypeToken.this.w()));
        }

        public /* synthetic */ f(TypeToken typeToken, a aVar) {
            this();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.c;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(i.a.a().d(TypeToken.this)).filter(j.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.c = set;
            return set;
        }
    }

    public static final class h<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public h(Type type) {
            super(type, null);
        }
    }

    public static abstract class i<K> {
        public static final i<TypeToken<?>> a = new a();
        public static final i<Class<?>> b = new b();

        public static class a extends i<TypeToken<?>> {
            public a() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends TypeToken<?>> e(TypeToken<?> typeToken) {
                return typeToken.s();
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            @Override // com.google.common.reflect.TypeToken.i
            @NullableDecl
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public TypeToken<?> g(TypeToken<?> typeToken) {
                return typeToken.t();
            }
        }

        public static class b extends i<Class<?>> {
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
            @NullableDecl
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class<?> g(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        public class c extends e<K> {
            public c(i iVar) {
                super(iVar);
            }

            @Override // com.google.common.reflect.TypeToken.i
            public ImmutableList<K> c(Iterable<? extends K> iterable) {
                ImmutableList.Builder builder = ImmutableList.builder();
                for (K k : iterable) {
                    if (!f(k).isInterface()) {
                        builder.add(k);
                    }
                }
                return super.c(builder.build());
            }

            @Override // com.google.common.reflect.TypeToken.i.e, com.google.common.reflect.TypeToken.i
            public Iterable<? extends K> e(K k) {
                return ImmutableSet.of();
            }
        }

        public static class d extends Ordering<K> {
            public final /* synthetic */ Comparator c;
            public final /* synthetic */ Map d;

            public d(Comparator comparator, Map map) {
                this.c = comparator;
                this.d = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Ordering, java.util.Comparator
            public int compare(K k, K k2) {
                return this.c.compare(this.d.get(k), this.d.get(k2));
            }
        }

        public static class e<K> extends i<K> {
            private final i<K> c;

            public e(i<K> iVar) {
                super(null);
                this.c = iVar;
            }

            @Override // com.google.common.reflect.TypeToken.i
            public Iterable<? extends K> e(K k) {
                return this.c.e(k);
            }

            @Override // com.google.common.reflect.TypeToken.i
            public Class<?> f(K k) {
                return this.c.f(k);
            }

            @Override // com.google.common.reflect.TypeToken.i
            public K g(K k) {
                return this.c.g(k);
            }
        }

        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        private int b(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = f(k).isInterface();
            Iterator<? extends K> it2 = e(k).iterator();
            int iMax = zIsInterface;
            while (it2.hasNext()) {
                iMax = Math.max(iMax, b(it2.next(), map));
            }
            K kG = g(k);
            int iMax2 = iMax;
            if (kG != null) {
                iMax2 = Math.max(iMax, b(kG, map));
            }
            int i = iMax2 + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        private static <K, V> ImmutableList<K> h(Map<K, V> map, Comparator<? super V> comparator) {
            return (ImmutableList<K>) new d(comparator, map).immutableSortedCopy(map.keySet());
        }

        public final i<K> a() {
            return new c(this);
        }

        public ImmutableList<K> c(Iterable<? extends K> iterable) {
            HashMap mapNewHashMap = Maps.newHashMap();
            Iterator<? extends K> it2 = iterable.iterator();
            while (it2.hasNext()) {
                b(it2.next(), mapNewHashMap);
            }
            return h(mapNewHashMap, Ordering.natural().reverse());
        }

        public final ImmutableList<K> d(K k) {
            return c(ImmutableList.of(k));
        }

        public abstract Iterable<? extends K> e(K k);

        public abstract Class<?> f(K k);

        @NullableDecl
        public abstract K g(K k);

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class j implements Predicate<TypeToken<?>> {
        private static final /* synthetic */ j[] $VALUES;
        public static final j IGNORE_TYPE_VARIABLE_OR_WILDCARD;
        public static final j INTERFACE_ONLY;

        public static enum a extends j {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.base.Predicate
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).a instanceof TypeVariable) || (((TypeToken) typeToken).a instanceof WildcardType)) ? false : true;
            }
        }

        public static enum b extends j {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.base.Predicate
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }

        static {
            a aVar = new a("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
            IGNORE_TYPE_VARIABLE_OR_WILDCARD = aVar;
            b bVar = new b("INTERFACE_ONLY", 1);
            INTERFACE_ONLY = bVar;
            $VALUES = new j[]{aVar, bVar};
        }

        private j(String str, int i) {
            super(str, i);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }

        public /* synthetic */ j(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public /* synthetic */ TypeToken(Type type, a aVar) {
        this(type);
    }

    private boolean A(Type type) {
        Iterator<TypeToken<? super T>> it2 = getTypes().iterator();
        while (it2.hasNext()) {
            Type typeV = it2.next().v();
            if (typeV != null && of(typeV).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean B(GenericArrayType genericArrayType) {
        Type type = this.a;
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

    private boolean C(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = of(parameterizedType).getRawType();
        if (!J(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < typeParameters.length; i2++) {
            if (!of(r().resolveType(typeParameters[i2])).z(actualTypeArguments[i2], typeParameters[i2])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || A(parameterizedType.getOwnerType());
    }

    private boolean D(GenericArrayType genericArrayType) {
        Type type = this.a;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.a).getGenericComponentType());
        }
        return false;
    }

    private boolean E() {
        return Primitives.allWrapperTypes().contains(this.a);
    }

    private static Type F(Type type) {
        return com.google.common.reflect.d.e.JAVA7.b(type);
    }

    private TypeToken<?> H(Type type) {
        TypeToken<?> typeTokenOf = of(r().resolveType(type));
        typeTokenOf.c = this.c;
        typeTokenOf.b = this.b;
        return typeTokenOf;
    }

    private Type I(Class<?> cls) {
        if ((this.a instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken typeTokenK = K(cls);
        return new TypeResolver().where(typeTokenK.getSupertype(getRawType()).a, this.a).resolveType(typeTokenK.a);
    }

    private boolean J(Class<?> cls) {
        UnmodifiableIterator<Class<? super T>> it2 = w().iterator();
        while (it2.hasNext()) {
            if (cls.isAssignableFrom(it2.next())) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public static <T> TypeToken<? extends T> K(Class<T> cls) {
        if (cls.isArray()) {
            return (TypeToken<? extends T>) of(com.google.common.reflect.d.k(K(cls.getComponentType()).a));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : K(cls.getEnclosingClass()).a;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (TypeToken<? extends T>) of(com.google.common.reflect.d.n(type, cls, typeParameters)) : of((Class) cls);
    }

    private static e g(Type[] typeArr) {
        return new e(typeArr, true);
    }

    @NullableDecl
    private TypeToken<? super T> h(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    private ImmutableList<TypeToken<? super T>> i(Type[] typeArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.getRawType().isInterface()) {
                builder.add(typeTokenOf);
            }
        }
        return builder.build();
    }

    private static Type j(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? k(typeVariable, (WildcardType) type) : n(type);
    }

    private static WildcardType k(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!g(bounds).a(type)) {
                arrayList.add(n(type));
            }
        }
        return new com.google.common.reflect.d.j(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType m(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            actualTypeArguments[i2] = j(typeParameters[i2], actualTypeArguments[i2]);
        }
        return com.google.common.reflect.d.n(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type n(Type type) {
        if (type instanceof ParameterizedType) {
            return m((ParameterizedType) type);
        }
        return type instanceof GenericArrayType ? com.google.common.reflect.d.k(n(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static e o(Type[] typeArr) {
        return new e(typeArr, false);
    }

    public static <T> TypeToken<T> of(Class<T> cls) {
        return new h(cls);
    }

    private TypeToken<? extends T> p(Class<?> cls) {
        return (TypeToken<? extends T>) of(F(getComponentType().getSubtype(cls.getComponentType()).a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken<? super T> q(Class<? super T> cls) {
        return (TypeToken<? super T>) of(F(((TypeToken) Preconditions.checkNotNull(getComponentType(), "%s isn't a super type of %s", cls, this)).getSupertype(cls.getComponentType()).a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeResolver r() {
        TypeResolver typeResolver = this.c;
        if (typeResolver != null) {
            return typeResolver;
        }
        TypeResolver typeResolverD = TypeResolver.d(this.a);
        this.c = typeResolverD;
        return typeResolverD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeResolver u() {
        TypeResolver typeResolver = this.b;
        if (typeResolver != null) {
            return typeResolver;
        }
        TypeResolver typeResolverF = TypeResolver.f(this.a);
        this.b = typeResolverF;
        return typeResolverF;
    }

    @NullableDecl
    private Type v() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableSet<Class<? super T>> w() {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        new d(builder).a(this.a);
        return builder.build();
    }

    private TypeToken<? extends T> x(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private TypeToken<? super T> y(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) typeTokenOf.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    private boolean z(Type type, TypeVariable<?> typeVariable) {
        if (this.a.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return n(this.a).equals(n(type));
        }
        WildcardType wildcardTypeK = k(typeVariable, (WildcardType) type);
        return o(wildcardTypeK.getUpperBounds()).b(this.a) && o(wildcardTypeK.getLowerBounds()).a(this.a);
    }

    @CanIgnoreReturnValue
    public final TypeToken<T> G() {
        new c().a(this.a);
        return this;
    }

    public final Invokable<T, T> constructor(Constructor<?> constructor) {
        Preconditions.checkArgument(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new b(constructor);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof TypeToken) {
            return this.a.equals(((TypeToken) obj).a);
        }
        return false;
    }

    @NullableDecl
    public final TypeToken<?> getComponentType() {
        Type typeJ = com.google.common.reflect.d.j(this.a);
        if (typeJ == null) {
            return null;
        }
        return of(typeJ);
    }

    public final Class<? super T> getRawType() {
        return w().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        Preconditions.checkArgument(!(this.a instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.a;
        if (type instanceof WildcardType) {
            return x(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return p(cls);
        }
        Preconditions.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) of(I(cls));
        Preconditions.checkArgument(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        Preconditions.checkArgument(J(cls), "%s is not a super class of %s", cls, this);
        Type type = this.a;
        if (type instanceof TypeVariable) {
            return y(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return y(cls, ((WildcardType) type).getUpperBounds());
        }
        return cls.isArray() ? q(cls) : (TypeToken<? super T>) H(K(cls).a);
    }

    public final Type getType() {
        return this.a;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.a;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final Invokable<T, Object> method(Method method) {
        Preconditions.checkArgument(J(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new a(method);
    }

    public final TypeToken<?> resolveType(Type type) {
        Preconditions.checkNotNull(type);
        return of(u().resolveType(type));
    }

    public final ImmutableList<TypeToken<? super T>> s() {
        Type type = this.a;
        if (type instanceof TypeVariable) {
            return i(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return i(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            builder.add(H(type2));
        }
        return builder.build();
    }

    @NullableDecl
    public final TypeToken<? super T> t() {
        Type type = this.a;
        if (type instanceof TypeVariable) {
            return h(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (TypeToken<? super T>) H(genericSuperclass);
    }

    public String toString() {
        return com.google.common.reflect.d.t(this.a);
    }

    public final TypeToken<T> unwrap() {
        return E() ? of(Primitives.unwrap((Class) this.a)) : this;
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, TypeToken<X> typeToken) {
        return new h(new TypeResolver().m(ImmutableMap.of(new TypeResolver.d(typeParameter.a), typeToken.a)).resolveType(this.a));
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? of(Primitives.wrap((Class) this.a)) : this;
    }

    public Object writeReplace() {
        return of(new TypeResolver().resolveType(this.a));
    }

    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        @MonotonicNonNullDecl
        private transient ImmutableSet<TypeToken<? super T>> a;

        public TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new f(TypeToken.this, null);
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new g(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) i.b.c(TypeToken.this.w()));
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.a;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(i.a.d(TypeToken.this)).filter(j.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.a = set;
            return set;
        }
    }

    public final class g extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private final transient TypeToken<T>.TypeSet c;

        @MonotonicNonNullDecl
        private transient ImmutableSet<TypeToken<? super T>> d;

        public class a implements Predicate<Class<?>> {
            public a() {
            }

            @Override // com.google.common.base.Predicate
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(Class<?> cls) {
                return cls.isInterface();
            }
        }

        public g(TypeToken<T>.TypeSet typeSet) {
            super();
            this.c = typeSet;
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
            return FluentIterable.from(i.b.c(TypeToken.this.w())).filter(new a()).toSet();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.d;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(this.c).filter(j.INTERFACE_ONLY).toSet();
            this.d = set;
            return set;
        }
    }

    public TypeToken() {
        Type typeA = a();
        this.a = typeA;
        Preconditions.checkState(!(typeA instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeA);
    }

    public static TypeToken<?> of(Type type) {
        return new h(type);
    }

    public final boolean isSubtypeOf(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getLowerBounds()).b(this.a);
        }
        Type type2 = this.a;
        if (type2 instanceof WildcardType) {
            return g(((WildcardType) type2).getUpperBounds()).a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || g(((TypeVariable) this.a).getBounds()).a(type);
        }
        if (type2 instanceof GenericArrayType) {
            return of(type).D((GenericArrayType) this.a);
        }
        if (type instanceof Class) {
            return J((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return C((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return B((GenericArrayType) type);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public TypeToken(Class<?> cls) {
        Type typeA = super.a();
        if (typeA instanceof Class) {
            this.a = typeA;
        } else {
            this.a = TypeResolver.d(cls).resolveType(typeA);
        }
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, Class<X> cls) {
        return where(typeParameter, of((Class) cls));
    }

    private TypeToken(Type type) {
        this.a = (Type) Preconditions.checkNotNull(type);
    }
}
