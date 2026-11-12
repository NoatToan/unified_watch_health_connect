package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.huawei.operation.utils.Constants;
import defpackage.amn;
import defpackage.aps;
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
import javax.annotation.CheckForNull;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Types {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Joiner f4637c = Joiner.on(", ").useForNull(Constants.NULL);

    public static Type d(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Preconditions.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
            if (lowerBounds.length == 1) {
                return b(d(lowerBounds[0]));
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            Preconditions.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
            return a(d(upperBounds[0]));
        }
        return JavaVersion.CURRENT.newArrayType(type);
    }

    public static ParameterizedType b(@CheckForNull Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return a(cls, typeArr);
        }
        Preconditions.checkNotNull(typeArr);
        Preconditions.checkArgument(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new b(type, cls, typeArr);
    }

    static ParameterizedType a(Class<?> cls, Type... typeArr) {
        return new b(ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    /* JADX INFO: loaded from: classes21.dex */
    enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };

        static final ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();

        @CheckForNull
        abstract Class<?> getOwnerType(Class<?> cls);

        class d<T> {
            d() {
            }
        }

        private static ClassOwnership detectJvmBehavior() {
            ParameterizedType parameterizedType = (ParameterizedType) Objects.requireNonNull((ParameterizedType) new d<String>() { // from class: com.google.common.reflect.Types.ClassOwnership.5
            }.getClass().getGenericSuperclass());
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(d.class) == parameterizedType.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }
    }

    public static <D extends GenericDeclaration> TypeVariable<D> e(D d2, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return c(d2, str, typeArr);
    }

    static WildcardType a(Type type) {
        return new f(new Type[0], new Type[]{type});
    }

    static WildcardType b(Type type) {
        return new f(new Type[]{type}, new Type[]{Object.class});
    }

    static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    @CheckForNull
    public static Type e(Type type) {
        Preconditions.checkNotNull(type);
        final AtomicReference atomicReference = new AtomicReference();
        new TypeVisitor() { // from class: com.google.common.reflect.Types.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitTypeVariable(TypeVariable<?> typeVariable) {
                atomicReference.set(Types.c(typeVariable.getBounds()));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitWildcardType(WildcardType wildcardType) {
                atomicReference.set(Types.c(wildcardType.getUpperBounds()));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitGenericArrayType(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitClass(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }
        }.visit(type);
        return (Type) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public static Type c(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeE = e(type);
            if (typeE != null) {
                if (typeE instanceof Class) {
                    Class cls = (Class) typeE;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return a(typeE);
            }
        }
        return null;
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f4639b;

        a(Type type) {
            this.f4639b = JavaVersion.CURRENT.usedInGenericType(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f4639b;
        }

        public String toString() {
            return Types.c(this.f4639b) + "[]";
        }

        public int hashCode() {
            return this.f4639b.hashCode();
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private final Type f4640b;
        private final ImmutableList<Type> d;
        private final Class<?> e;

        b(@CheckForNull Type type, Class<?> cls, Type[] typeArr) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkArgument(typeArr.length == cls.getTypeParameters().length);
            Types.d(typeArr, "type parameter");
            this.f4640b = type;
            this.e = cls;
            this.d = JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.b((Collection<Type>) this.d);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.e;
        }

        @Override // java.lang.reflect.ParameterizedType
        @CheckForNull
        public Type getOwnerType() {
            return this.f4640b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f4640b != null && JavaVersion.CURRENT.jdkTypeDuplicatesOwnerName()) {
                sb.append(JavaVersion.CURRENT.typeName(this.f4640b));
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            }
            sb.append(this.e.getName());
            sb.append('<');
            Joiner joiner = Types.f4637c;
            ImmutableList<Type> immutableList = this.d;
            final JavaVersion javaVersion = JavaVersion.CURRENT;
            Objects.requireNonNull(javaVersion);
            sb.append(joiner.join(amn.d(immutableList, new Function() { // from class: aqa
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return javaVersion.typeName((Type) obj);
                }
            })));
            sb.append('>');
            return sb.toString();
        }

        public int hashCode() {
            Type type = this.f4640b;
            return ((type == null ? 0 : type.hashCode()) ^ this.d.hashCode()) ^ this.e.hashCode();
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && com.google.common.base.Objects.equal(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    private static <D extends GenericDeclaration> TypeVariable<D> c(D d2, String str, Type[] typeArr) {
        return (TypeVariable) aps.a(TypeVariable.class, new e(new d(d2, str, typeArr)));
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class e implements InvocationHandler {
        private static final ImmutableMap<String, Method> d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d<?> f4645b;

        static {
            ImmutableMap.b bVarBuilder = ImmutableMap.builder();
            for (Method method : d.class.getMethods()) {
                if (method.getDeclaringClass().equals(d.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    bVarBuilder.c(method.getName(), method);
                }
            }
            d = bVarBuilder.b();
        }

        e(d<?> dVar) {
            this.f4645b = dVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object obj, Method method, @CheckForNull Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = d.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f4645b, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class d<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableList<Type> f4642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f4643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D f4644c;

        d(D d, String str, Type[] typeArr) {
            Types.d(typeArr, "bound for type variable");
            this.f4644c = (D) Preconditions.checkNotNull(d);
            this.f4643b = (String) Preconditions.checkNotNull(str);
            this.f4642a = ImmutableList.copyOf(typeArr);
        }

        public D c() {
            return this.f4644c;
        }

        public String b() {
            return this.f4643b;
        }

        public String toString() {
            return this.f4643b;
        }

        public int hashCode() {
            return this.f4644c.hashCode() ^ this.f4643b.hashCode();
        }

        public boolean equals(@CheckForNull Object obj) {
            if (c.f4641b) {
                if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof e)) {
                    d dVar = ((e) Proxy.getInvocationHandler(obj)).f4645b;
                    if (this.f4643b.equals(dVar.b()) && this.f4644c.equals(dVar.c()) && this.f4642a.equals(dVar.f4642a)) {
                        return true;
                    }
                }
                return false;
            }
            if (obj instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (this.f4643b.equals(typeVariable.getName()) && this.f4644c.equals(typeVariable.getGenericDeclaration())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class f implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList<Type> f4646b;
        private final ImmutableList<Type> e;

        public f(Type[] typeArr, Type[] typeArr2) {
            Types.d(typeArr, "lower bound for wildcard");
            Types.d(typeArr2, "upper bound for wildcard");
            this.f4646b = JavaVersion.CURRENT.usedInGenericType(typeArr);
            this.e = JavaVersion.CURRENT.usedInGenericType(typeArr2);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.b((Collection<Type>) this.f4646b);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.b((Collection<Type>) this.e);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f4646b.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.e.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        public int hashCode() {
            return this.f4646b.hashCode() ^ this.e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableIterator<Type> it = this.f4646b.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(" super ");
                sb.append(JavaVersion.CURRENT.typeName(next));
            }
            for (Type type : Types.c(this.e)) {
                sb.append(" extends ");
                sb.append(JavaVersion.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] b(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable<Type> c(Iterable<Type> iterable) {
        return amn.d(iterable, Predicates.not(Predicates.equalTo(Object.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                Preconditions.checkArgument(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    static Class<?> e(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.reflect.Types$JavaVersion, still in use, count: 1, list:
      (r0v0 com.google.common.reflect.Types$JavaVersion) from 0x0063: SPUT (r0v0 com.google.common.reflect.Types$JavaVersion) (LINE:646) com.google.common.reflect.Types.JavaVersion.CURRENT com.google.common.reflect.Types$JavaVersion
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Types.JavaVersion
            public GenericArrayType newArrayType(Type type) {
                return new a(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
                Preconditions.checkNotNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new a(cls.getComponentType()) : type;
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
                if (type instanceof Class) {
                    return Types.e((Class<?>) type);
                }
                return new a(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
                return (Type) Preconditions.checkNotNull(type);
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
                return JAVA7.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
                return JAVA7.usedInGenericType(type);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
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
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type newArrayType(Type type) {
                return JAVA8.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type usedInGenericType(Type type) {
                return JAVA8.usedInGenericType(type);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                return JAVA8.typeName(type);
            }
        };

        static final JavaVersion CURRENT;

        boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        abstract Type newArrayType(Type type);

        abstract Type usedInGenericType(Type type);

        private JavaVersion(String str, int i) {
            super(str, i);
        }

        public static JavaVersion valueOf(String str) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, str);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) $VALUES.clone();
        }

        static {
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new TypeCapture<Map.Entry<String, int[][]>>() { // from class: com.google.common.reflect.Types.JavaVersion.5
                }.capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = javaVersion;
                    return;
                } else {
                    CURRENT = javaVersion;
                    return;
                }
            }
            if (new TypeCapture<int[]>() { // from class: com.google.common.reflect.Types.JavaVersion.7
            }.capture() instanceof Class) {
                CURRENT = javaVersion;
            } else {
                CURRENT = javaVersion;
            }
        }

        final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
            ImmutableList.c cVarBuilder = ImmutableList.builder();
            for (Type type : typeArr) {
                cVarBuilder.add(usedInGenericType(type));
            }
            return cVarBuilder.build();
        }

        public String typeName(Type type) {
            return Types.c(type);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class c<X> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f4641b = !c.class.getTypeParameters()[0].equals(Types.e(c.class, "X", new Type[0]));

        c() {
        }
    }
}
