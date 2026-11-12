package defpackage;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.ElementTypesAreNonnullByDefault;
import com.google.common.reflect.TypeVisitor;
import com.google.common.reflect.Types;
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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apz {
    private final d e;

    public apz() {
        this.e = new d();
    }

    private apz(d dVar) {
        this.e = dVar;
    }

    public static apz e(Type type) {
        return new apz().a(b.b(type));
    }

    public static apz c(Type type) {
        return new apz().a(b.b(e.e.a(type)));
    }

    public apz b(Type type, Type type2) {
        HashMap mapA = Maps.a();
        a(mapA, (Type) Preconditions.checkNotNull(type), (Type) Preconditions.checkNotNull(type2));
        return a(mapA);
    }

    public apz a(Map<a, ? extends Type> map) {
        return new apz(this.e.e(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final Map<a, Type> map, Type type, final Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new TypeVisitor() { // from class: apz.2
            @Override // com.google.common.reflect.TypeVisitor
            public void visitTypeVariable(TypeVariable<?> typeVariable) {
                map.put(new a(typeVariable), type2);
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitWildcardType(WildcardType wildcardType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    WildcardType wildcardType2 = (WildcardType) type3;
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    Type[] upperBounds2 = wildcardType2.getUpperBounds();
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                    Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, type2);
                    for (int i = 0; i < upperBounds.length; i++) {
                        apz.a(map, upperBounds[i], upperBounds2[i]);
                    }
                    for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                        apz.a(map, lowerBounds[i2], lowerBounds2[i2]);
                    }
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitParameterizedType(ParameterizedType parameterizedType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    return;
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) apz.c(ParameterizedType.class, type3);
                if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                    apz.a(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                }
                Preconditions.checkArgument(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type2);
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    apz.a(map, actualTypeArguments[i], actualTypeArguments2[i]);
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitGenericArrayType(GenericArrayType genericArrayType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    return;
                }
                Type typeE = Types.e(type3);
                Preconditions.checkArgument(typeE != null, "%s is not an array type.", type2);
                apz.a(map, genericArrayType.getGenericComponentType(), typeE);
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitClass(Class<?> cls) {
                if (type2 instanceof WildcardType) {
                    return;
                }
                throw new IllegalArgumentException("No type mapping from " + cls + " to " + type2);
            }
        }.visit(type);
    }

    public Type d(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof TypeVariable) {
            return this.e.d((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return d((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return b((GenericArrayType) type);
        }
        return type instanceof WildcardType ? b((WildcardType) type) : type;
    }

    public Type[] d(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = d(typeArr[i]);
        }
        return typeArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Type[] c(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = d(typeArr[i]);
        }
        return typeArr2;
    }

    private WildcardType b(WildcardType wildcardType) {
        return new Types.f(c(wildcardType.getLowerBounds()), c(wildcardType.getUpperBounds()));
    }

    private Type b(GenericArrayType genericArrayType) {
        return Types.d(d(genericArrayType.getGenericComponentType()));
    }

    private ParameterizedType d(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return Types.b(ownerType == null ? null : d(ownerType), (Class) d(parameterizedType.getRawType()), c(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T c(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableMap<a, Type> f678b;

        d() {
            this.f678b = ImmutableMap.of();
        }

        private d(ImmutableMap<a, Type> immutableMap) {
            this.f678b = immutableMap;
        }

        final d e(Map<a, ? extends Type> map) {
            ImmutableMap.b bVarBuilder = ImmutableMap.builder();
            bVarBuilder.b(this.f678b);
            for (Map.Entry<a, ? extends Type> entry : map.entrySet()) {
                a key = entry.getKey();
                Type value = entry.getValue();
                Preconditions.checkArgument(!key.d(value), "Type variable %s bound to itself", key);
                bVarBuilder.c(key, value);
            }
            return new d(bVarBuilder.j());
        }

        final Type d(final TypeVariable<?> typeVariable) {
            return a(typeVariable, new d(this) { // from class: apz.d.5
                @Override // apz.d
                public Type a(TypeVariable<?> typeVariable2, d dVar) {
                    return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) ? typeVariable2 : this.a(typeVariable2, dVar);
                }
            });
        }

        Type a(TypeVariable<?> typeVariable, d dVar) {
            Type type = this.f678b.get(new a(typeVariable));
            if (type == null) {
                Type[] bounds = typeVariable.getBounds();
                if (bounds.length != 0) {
                    Type[] typeArrC = new apz(dVar).c(bounds);
                    if (!Types.c.f4641b || !Arrays.equals(bounds, typeArrC)) {
                        return Types.e(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrC);
                    }
                }
                return typeVariable;
            }
            return new apz(dVar).d(type);
        }
    }

    static final class b extends TypeVisitor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<a, Type> f677c = Maps.a();

        private b() {
        }

        static ImmutableMap<a, Type> b(Type type) {
            Preconditions.checkNotNull(type);
            b bVar = new b();
            bVar.visit(type);
            return ImmutableMap.copyOf((Map) bVar.f677c);
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitClass(Class<?> cls) {
            visit(cls.getGenericSuperclass());
            visit(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitParameterizedType(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                c(new a(typeParameters[i]), actualTypeArguments[i]);
            }
            visit(cls);
            visit(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitTypeVariable(TypeVariable<?> typeVariable) {
            visit(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitWildcardType(WildcardType wildcardType) {
            visit(wildcardType.getUpperBounds());
        }

        private void c(a aVar, Type type) {
            if (this.f677c.containsKey(aVar)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (aVar.d(type2)) {
                    while (type != null) {
                        type = this.f677c.remove(a.a(type));
                    }
                    return;
                }
                type2 = this.f677c.get(a.a(type2));
            }
            this.f677c.put(aVar, type);
        }
    }

    static class e {
        static final e e = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f680c;

        private e() {
            this(new AtomicInteger());
        }

        private e(AtomicInteger atomicInteger) {
            this.f680c = atomicInteger;
        }

        final Type a(Type type) {
            Preconditions.checkNotNull(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.d(a().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable<?>[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = c(typeParameters[i]).a(actualTypeArguments[i]);
                }
                return Types.b(a().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? a(wildcardType.getUpperBounds()) : type;
            }
            throw new AssertionError("must have been one of the known types");
        }

        TypeVariable<?> a(Type[] typeArr) {
            return Types.e(e.class, "capture#" + this.f680c.incrementAndGet() + "-of ? extends " + Joiner.on('&').join(typeArr), typeArr);
        }

        private e c(final TypeVariable<?> typeVariable) {
            return new e(this, this.f680c) { // from class: apz.e.4
                @Override // apz.e
                TypeVariable<?> a(Type[] typeArr) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                    linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(Object.class);
                    }
                    return super.a((Type[]) linkedHashSet.toArray(new Type[0]));
                }
            };
        }

        private e a() {
            return new e(this.f680c);
        }

        @CheckForNull
        private Type c(@CheckForNull Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }
    }

    public static final class a {
        private final TypeVariable<?> d;

        public a(TypeVariable<?> typeVariable) {
            this.d = (TypeVariable) Preconditions.checkNotNull(typeVariable);
        }

        public int hashCode() {
            return Objects.hashCode(this.d.getGenericDeclaration(), this.d.getName());
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof a) {
                return e(((a) obj).d);
            }
            return false;
        }

        public String toString() {
            return this.d.toString();
        }

        @CheckForNull
        static a a(Type type) {
            if (type instanceof TypeVariable) {
                return new a((TypeVariable) type);
            }
            return null;
        }

        boolean d(Type type) {
            if (type instanceof TypeVariable) {
                return e((TypeVariable) type);
            }
            return false;
        }

        private boolean e(TypeVariable<?> typeVariable) {
            return this.d.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.d.getName().equals(typeVariable.getName());
        }
    }
}
