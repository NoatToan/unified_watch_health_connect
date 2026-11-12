package com.google.common.reflect;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class d {
    private static final Function<Type, String> a = new a();
    private static final Joiner b = Joiner.on(", ").useForNull("null");

    public static class a implements Function<Type, String> {
        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(Type type) {
            return e.CURRENT.c(type);
        }
    }

    public static class b extends com.google.common.reflect.c {
        public final /* synthetic */ AtomicReference b;

        public b(AtomicReference atomicReference) {
            this.b = atomicReference;
        }

        @Override // com.google.common.reflect.c
        public void b(Class<?> cls) {
            this.b.set(cls.getComponentType());
        }

        @Override // com.google.common.reflect.c
        public void c(GenericArrayType genericArrayType) {
            this.b.set(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.c
        public void e(TypeVariable<?> typeVariable) {
            this.b.set(d.q(typeVariable.getBounds()));
        }

        @Override // com.google.common.reflect.c
        public void f(WildcardType wildcardType) {
            this.b.set(d.q(wildcardType.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c JVM_BEHAVIOR;
        public static final c LOCAL_CLASS_HAS_NO_OWNER;
        public static final c OWNED_BY_ENCLOSING_CLASS;

        public static enum a extends c {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.d.c
            @NullableDecl
            public Class<?> b(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        public class b<T> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.d$c$c, reason: collision with other inner class name */
        public static enum C0228c extends c {
            public C0228c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.d.c
            @NullableDecl
            public Class<?> b(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.d$c$d, reason: collision with other inner class name */
        public static class C0229d extends b<String> {
        }

        static {
            a aVar = new a("OWNED_BY_ENCLOSING_CLASS", 0);
            OWNED_BY_ENCLOSING_CLASS = aVar;
            C0228c c0228c = new C0228c("LOCAL_CLASS_HAS_NO_OWNER", 1);
            LOCAL_CLASS_HAS_NO_OWNER = c0228c;
            $VALUES = new c[]{aVar, c0228c};
            JVM_BEHAVIOR = a();
        }

        private c(String str, int i) {
            super(str, i);
        }

        private static c a() {
            new C0229d();
            ParameterizedType parameterizedType = (ParameterizedType) C0229d.class.getGenericSuperclass();
            for (c cVar : values()) {
                if (cVar.b(b.class) == parameterizedType.getOwnerType()) {
                    return cVar;
                }
            }
            throw new AssertionError();
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @NullableDecl
        public abstract Class<?> b(Class<?> cls);

        public /* synthetic */ c(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.d$d, reason: collision with other inner class name */
    public static final class C0230d implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type a;

        public C0230d(Type type) {
            this.a = e.CURRENT.f(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return Objects.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return d.t(this.a) + "[]";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e CURRENT;
        public static final e JAVA6;
        public static final e JAVA7;
        public static final e JAVA8;
        public static final e JAVA9;

        public static enum a extends e {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.d.e
            public Type f(Type type) {
                Preconditions.checkNotNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new C0230d(cls.getComponentType()) : type;
            }

            @Override // com.google.common.reflect.d.e
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public GenericArrayType b(Type type) {
                return new C0230d(type);
            }
        }

        public static enum b extends e {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.d.e
            public Type b(Type type) {
                return type instanceof Class ? d.i((Class) type) : new C0230d(type);
            }

            @Override // com.google.common.reflect.d.e
            public Type f(Type type) {
                return (Type) Preconditions.checkNotNull(type);
            }
        }

        public static enum c extends e {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.d.e
            public Type b(Type type) {
                return e.JAVA7.b(type);
            }

            @Override // com.google.common.reflect.d.e
            public String c(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.d.e
            public Type f(Type type) {
                return e.JAVA7.f(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.d$e$d, reason: collision with other inner class name */
        public static enum C0231d extends e {
            public C0231d(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.d.e
            public boolean a() {
                return false;
            }

            @Override // com.google.common.reflect.d.e
            public Type b(Type type) {
                return e.JAVA8.b(type);
            }

            @Override // com.google.common.reflect.d.e
            public String c(Type type) {
                return e.JAVA8.c(type);
            }

            @Override // com.google.common.reflect.d.e
            public Type f(Type type) {
                return e.JAVA8.f(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.d$e$e, reason: collision with other inner class name */
        public static class C0232e extends com.google.common.reflect.b<Map.Entry<String, int[][]>> {
        }

        public static class f extends com.google.common.reflect.b<int[]> {
        }

        static {
            a aVar = new a("JAVA6", 0);
            JAVA6 = aVar;
            b bVar = new b("JAVA7", 1);
            JAVA7 = bVar;
            c cVar = new c("JAVA8", 2);
            JAVA8 = cVar;
            C0231d c0231d = new C0231d("JAVA9", 3);
            JAVA9 = c0231d;
            $VALUES = new e[]{aVar, bVar, cVar, c0231d};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new C0232e().a().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = cVar;
                    return;
                } else {
                    CURRENT = c0231d;
                    return;
                }
            }
            if (new f().a() instanceof Class) {
                CURRENT = bVar;
            } else {
                CURRENT = aVar;
            }
        }

        private e(String str, int i) {
            super(str, i);
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }

        public boolean a() {
            return true;
        }

        public abstract Type b(Type type);

        public String c(Type type) {
            return d.t(type);
        }

        public final ImmutableList<Type> e(Type[] typeArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Type type : typeArr) {
                builder.add(f(type));
            }
            return builder.build();
        }

        public abstract Type f(Type type);

        public /* synthetic */ e(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static final class f<X> {
        public static final boolean a = !f.class.getTypeParameters()[0].equals(d.l(f.class, "X", new Type[0]));
    }

    public static final class g implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        @NullableDecl
        private final Type a;
        private final ImmutableList<Type> b;
        private final Class<?> c;

        public g(@NullableDecl Type type, Class<?> cls, Type[] typeArr) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkArgument(typeArr.length == cls.getTypeParameters().length);
            d.g(typeArr, "type parameter");
            this.a = type;
            this.c = cls;
            this.b = e.CURRENT.e(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && Objects.equal(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return d.s(this.b);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.c;
        }

        public int hashCode() {
            Type type = this.a;
            return ((type == null ? 0 : type.hashCode()) ^ this.b.hashCode()) ^ this.c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                e eVar = e.CURRENT;
                if (eVar.a()) {
                    sb.append(eVar.c(this.a));
                    sb.append('.');
                }
            }
            sb.append(this.c.getName());
            sb.append(Typography.less);
            sb.append(d.b.join(Iterables.transform(this.b, d.a)));
            sb.append(Typography.greater);
            return sb.toString();
        }
    }

    public static final class h<D extends GenericDeclaration> {
        private final D a;
        private final String b;
        private final ImmutableList<Type> c;

        public h(D d, String str, Type[] typeArr) {
            d.g(typeArr, "bound for type variable");
            this.a = (D) Preconditions.checkNotNull(d);
            this.b = (String) Preconditions.checkNotNull(str);
            this.c = ImmutableList.copyOf(typeArr);
        }

        public Type[] a() {
            return d.s(this.c);
        }

        public D b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!f.a) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.b.equals(typeVariable.getName()) && this.a.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof i)) {
                return false;
            }
            h hVar = ((i) Proxy.getInvocationHandler(obj)).a;
            return this.b.equals(hVar.c()) && this.a.equals(hVar.b()) && this.c.equals(hVar.c);
        }

        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        public String toString() {
            return this.b;
        }
    }

    public static final class i implements InvocationHandler {
        private static final ImmutableMap<String, Method> b;
        private final h<?> a;

        static {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (Method method : h.class.getMethods()) {
                if (method.getDeclaringClass().equals(h.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.put(method.getName(), method);
                }
            }
            b = builder.build();
        }

        public i(h<?> hVar) {
            this.a = hVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    public static final class j implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> a;
        private final ImmutableList<Type> b;

        public j(Type[] typeArr, Type[] typeArr2) {
            d.g(typeArr, "lower bound for wildcard");
            d.g(typeArr2, "upper bound for wildcard");
            e eVar = e.CURRENT;
            this.a = eVar.e(typeArr);
            this.b = eVar.e(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.b.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return d.s(this.a);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return d.s(this.b);
        }

        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableIterator<Type> it2 = this.a.iterator();
            while (it2.hasNext()) {
                Type next = it2.next();
                sb.append(" super ");
                sb.append(e.CURRENT.c(next));
            }
            for (Type type : d.h(this.b)) {
                sb.append(" extends ");
                sb.append(e.CURRENT.c(type));
            }
            return sb.toString();
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                Preconditions.checkArgument(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable<Type> h(Iterable<Type> iterable) {
        return Iterables.filter(iterable, Predicates.not(Predicates.equalTo(Object.class)));
    }

    public static Class<?> i(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    @NullableDecl
    public static Type j(Type type) {
        Preconditions.checkNotNull(type);
        AtomicReference atomicReference = new AtomicReference();
        new b(atomicReference).a(type);
        return (Type) atomicReference.get();
    }

    public static Type k(Type type) {
        if (!(type instanceof WildcardType)) {
            return e.CURRENT.b(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Preconditions.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return r(k(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        Preconditions.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return p(k(upperBounds[0]));
    }

    public static <D extends GenericDeclaration> TypeVariable<D> l(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return o(d, str, typeArr);
    }

    public static ParameterizedType m(Class<?> cls, Type... typeArr) {
        return new g(c.JVM_BEHAVIOR.b(cls), cls, typeArr);
    }

    public static ParameterizedType n(@NullableDecl Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return m(cls, typeArr);
        }
        Preconditions.checkNotNull(typeArr);
        Preconditions.checkArgument(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new g(type, cls, typeArr);
    }

    private static <D extends GenericDeclaration> TypeVariable<D> o(D d, String str, Type[] typeArr) {
        return (TypeVariable) Reflection.newProxy(TypeVariable.class, new i(new h(d, str, typeArr)));
    }

    @VisibleForTesting
    public static WildcardType p(Type type) {
        return new j(new Type[0], new Type[]{type});
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public static Type q(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeJ = j(type);
            if (typeJ != null) {
                if (typeJ instanceof Class) {
                    Class cls = (Class) typeJ;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return p(typeJ);
            }
        }
        return null;
    }

    @VisibleForTesting
    public static WildcardType r(Type type) {
        return new j(new Type[]{type}, new Type[]{Object.class});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] s(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
