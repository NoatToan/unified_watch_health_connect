package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.c6i;
import defpackage.cpd;
import defpackage.dbk;
import defpackage.dua;
import defpackage.j4h;
import defpackage.k6i;
import defpackage.l5q;
import defpackage.o4q;
import defpackage.prd;
import defpackage.uaq;
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
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final prd f9315a = prd.g(", ").i(AbstractJsonLexerKt.NULL);

    public class a extends l5q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f9316b;

        public a(AtomicReference atomicReference) {
            this.f9316b = atomicReference;
        }

        @Override // defpackage.l5q
        public void b(Class<?> cls) {
            this.f9316b.set(cls.getComponentType());
        }

        @Override // defpackage.l5q
        public void c(GenericArrayType genericArrayType) {
            this.f9316b.set(genericArrayType.getGenericComponentType());
        }

        @Override // defpackage.l5q
        public void e(TypeVariable<?> typeVariable) {
            this.f9316b.set(c.p(typeVariable.getBounds()));
        }

        @Override // defpackage.l5q
        public void f(WildcardType wildcardType) {
            this.f9316b.set(c.p(wildcardType.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9317a = new a("OWNED_BY_ENCLOSING_CLASS", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f9318b = new C0248c("LOCAL_CLASS_HAS_NO_OWNER", 1);
        public static final /* synthetic */ b[] d = a();
        public static final b c = b();

        public final enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.c.b
            public Class<?> c(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.c$b$b, reason: collision with other inner class name */
        public class C0247b<T> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.c$b$c, reason: collision with other inner class name */
        public final enum C0248c extends b {
            public C0248c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.c.b
            public Class<?> c(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        public class d extends C0247b<String> {
        }

        public b(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f9317a, f9318b};
        }

        public static b b() {
            new d();
            ParameterizedType parameterizedType = (ParameterizedType) d.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (b bVar : values()) {
                if (bVar.c(C0247b.class) == parameterizedType2.getOwnerType()) {
                    return bVar;
                }
            }
            throw new AssertionError();
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }

        public abstract Class<?> c(Class<?> cls);

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.c$c, reason: collision with other inner class name */
    public static final class C0249c implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f9319a;

        public C0249c(Type type) {
            this.f9319a = d.e.h(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return j4h.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f9319a;
        }

        public int hashCode() {
            return this.f9319a.hashCode();
        }

        public String toString() {
            return String.valueOf(c.s(this.f9319a)).concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f9320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f9321b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final /* synthetic */ d[] f;

        public final enum a extends d {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.c.d
            public Type h(Type type) {
                c6i.o(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new C0249c(cls.getComponentType()) : type;
            }

            @Override // com.google.common.reflect.c.d
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public GenericArrayType c(Type type) {
                return new C0249c(type);
            }
        }

        public final enum b extends d {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.c.d
            public Type c(Type type) {
                return type instanceof Class ? c.h((Class) type) : new C0249c(type);
            }

            @Override // com.google.common.reflect.c.d
            public Type h(Type type) {
                return (Type) c6i.o(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.c$d$c, reason: collision with other inner class name */
        public final enum C0250c extends d {
            public C0250c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.c.d
            public Type c(Type type) {
                return d.f9321b.c(type);
            }

            @Override // com.google.common.reflect.c.d
            public String d(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }

            @Override // com.google.common.reflect.c.d
            public Type h(Type type) {
                return d.f9321b.h(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.c$d$d, reason: collision with other inner class name */
        public final enum C0251d extends d {
            public C0251d(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.c.d
            public boolean b() {
                return false;
            }

            @Override // com.google.common.reflect.c.d
            public Type c(Type type) {
                return d.c.c(type);
            }

            @Override // com.google.common.reflect.c.d
            public String d(Type type) {
                return d.c.d(type);
            }

            @Override // com.google.common.reflect.c.d
            public Type h(Type type) {
                return d.c.h(type);
            }
        }

        public class e extends o4q<Map.Entry<String, int[][]>> {
        }

        public class f extends o4q<int[]> {
        }

        static {
            a aVar = new a("JAVA6", 0);
            f9320a = aVar;
            b bVar = new b("JAVA7", 1);
            f9321b = bVar;
            C0250c c0250c = new C0250c("JAVA8", 2);
            c = c0250c;
            C0251d c0251d = new C0251d("JAVA9", 3);
            d = c0251d;
            f = a();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().capture().toString().contains("java.util.Map.java.util.Map")) {
                    e = c0250c;
                    return;
                } else {
                    e = c0251d;
                    return;
                }
            }
            if (new f().capture() instanceof Class) {
                e = bVar;
            } else {
                e = aVar;
            }
        }

        public d(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ d[] a() {
            return new d[]{f9320a, f9321b, c, d};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f.clone();
        }

        public boolean b() {
            return true;
        }

        public abstract Type c(Type type);

        public String d(Type type) {
            return c.s(type);
        }

        public final ImmutableList<Type> e(Type[] typeArr) {
            ImmutableList.a aVarBuilder = ImmutableList.builder();
            for (Type type : typeArr) {
                aVarBuilder.a(h(type));
            }
            return aVarBuilder.k();
        }

        public abstract Type h(Type type);

        public /* synthetic */ d(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static final class e<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f9322a = !e.class.getTypeParameters()[0].equals(c.k(e.class, "X", new Type[0]));
    }

    public static final class f implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f9323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList<Type> f9324b;
        public final Class<?> c;

        public f(Type type, Class<?> cls, Type[] typeArr) {
            c6i.o(cls);
            c6i.d(typeArr.length == cls.getTypeParameters().length);
            c.f(typeArr, "type parameter");
            this.f9323a = type;
            this.c = cls;
            this.f9324b = d.e.e(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && j4h.a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return c.r(this.f9324b);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f9323a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.c;
        }

        public int hashCode() {
            Type type = this.f9323a;
            return ((type == null ? 0 : type.hashCode()) ^ this.f9324b.hashCode()) ^ this.c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f9323a != null) {
                d dVar = d.e;
                if (dVar.b()) {
                    sb.append(dVar.d(this.f9323a));
                    sb.append('.');
                }
            }
            sb.append(this.c.getName());
            sb.append(Typography.less);
            prd prdVar = c.f9315a;
            ImmutableList<Type> immutableList = this.f9324b;
            final d dVar2 = d.e;
            Objects.requireNonNull(dVar2);
            sb.append(prdVar.c(cpd.n(immutableList, new dua() { // from class: b6q
                @Override // defpackage.dua
                public final Object apply(Object obj) {
                    return dVar2.d((Type) obj);
                }
            })));
            sb.append(Typography.greater);
            return sb.toString();
        }
    }

    public static final class g<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D f9325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9326b;
        public final ImmutableList<Type> c;

        public g(D d, String str, Type[] typeArr) {
            c.f(typeArr, "bound for type variable");
            this.f9325a = (D) c6i.o(d);
            this.f9326b = (String) c6i.o(str);
            this.c = ImmutableList.copyOf(typeArr);
        }

        public D a() {
            return this.f9325a;
        }

        public String b() {
            return this.f9326b;
        }

        public boolean equals(Object obj) {
            if (!e.f9322a) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f9326b.equals(typeVariable.getName()) && this.f9325a.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof h)) {
                return false;
            }
            g gVar = ((h) Proxy.getInvocationHandler(obj)).f9328a;
            return this.f9326b.equals(gVar.b()) && this.f9325a.equals(gVar.a()) && this.c.equals(gVar.c);
        }

        public int hashCode() {
            return this.f9325a.hashCode() ^ this.f9326b.hashCode();
        }

        public String toString() {
            return this.f9326b;
        }
    }

    public static final class h implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ImmutableMap<String, Method> f9327b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<?> f9328a;

        static {
            ImmutableMap.b bVarBuilder = ImmutableMap.builder();
            for (Method method : g.class.getMethods()) {
                if (method.getDeclaringClass().equals(g.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    bVarBuilder.g(method.getName(), method);
                }
            }
            f9327b = bVarBuilder.c();
        }

        public h(g<?> gVar) {
            this.f9328a = gVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f9327b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f9328a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    public static final class i implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<Type> f9329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList<Type> f9330b;

        public i(Type[] typeArr, Type[] typeArr2) {
            c.f(typeArr, "lower bound for wildcard");
            c.f(typeArr2, "upper bound for wildcard");
            d dVar = d.e;
            this.f9329a = dVar.e(typeArr);
            this.f9330b = dVar.e(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f9329a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f9330b.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return c.r(this.f9329a);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return c.r(this.f9330b);
        }

        public int hashCode() {
            return this.f9329a.hashCode() ^ this.f9330b.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            uaq<Type> it = this.f9329a.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(" super ");
                sb.append(d.e.d(next));
            }
            for (Type type : c.g(this.f9330b)) {
                sb.append(" extends ");
                sb.append(d.e.d(type));
            }
            return sb.toString();
        }
    }

    public static void f(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                c6i.k(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    public static Iterable<Type> g(Iterable<Type> iterable) {
        return cpd.d(iterable, k6i.f(k6i.c(Object.class)));
    }

    public static Class<?> h(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    public static Type i(Type type) {
        c6i.o(type);
        AtomicReference atomicReference = new AtomicReference();
        new a(atomicReference).a(type);
        return (Type) atomicReference.get();
    }

    public static Type j(Type type) {
        if (!(type instanceof WildcardType)) {
            return d.e.c(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        c6i.e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return q(j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        c6i.e(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return o(j(upperBounds[0]));
    }

    public static <D extends GenericDeclaration> TypeVariable<D> k(D d2, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return n(d2, str, typeArr);
    }

    public static ParameterizedType l(Class<?> cls, Type... typeArr) {
        return new f(b.c.c(cls), cls, typeArr);
    }

    public static ParameterizedType m(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return l(cls, typeArr);
        }
        c6i.o(typeArr);
        c6i.j(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new f(type, cls, typeArr);
    }

    public static <D extends GenericDeclaration> TypeVariable<D> n(D d2, String str, Type[] typeArr) {
        return (TypeVariable) dbk.a(TypeVariable.class, new h(new g(d2, str, typeArr)));
    }

    public static WildcardType o(Type type) {
        return new i(new Type[0], new Type[]{type});
    }

    public static Type p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeI = i(type);
            if (typeI != null) {
                if (typeI instanceof Class) {
                    Class cls = (Class) typeI;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(typeI);
            }
        }
        return null;
    }

    public static WildcardType q(Type type) {
        return new i(new Type[]{type}, new Type[]{Object.class});
    }

    public static Type[] r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    public static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
