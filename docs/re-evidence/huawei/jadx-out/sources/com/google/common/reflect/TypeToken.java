package com.google.common.reflect;

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
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.huawei.operation.utils.Constants;
import defpackage.apu;
import defpackage.apz;
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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    @CheckForNull
    @LazyInit
    private transient apz covariantTypeResolver;

    @CheckForNull
    @LazyInit
    private transient apz invariantTypeResolver;
    private final Type runtimeType;

    /* JADX INFO: loaded from: classes21.dex */
    enum TypeFilter implements Predicate<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).runtimeType instanceof TypeVariable) || (((TypeToken) typeToken).runtimeType instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }
    }

    public TypeToken() {
        Type typeCapture = capture();
        this.runtimeType = typeCapture;
        Preconditions.checkState(!(typeCapture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture);
    }

    protected TypeToken(Class<?> cls) {
        Type typeCapture = super.capture();
        if (typeCapture instanceof Class) {
            this.runtimeType = typeCapture;
        } else {
            this.runtimeType = apz.e(cls).d(typeCapture);
        }
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) Preconditions.checkNotNull(type);
    }

    public static <T> TypeToken<T> of(Class<T> cls) {
        return new e(cls);
    }

    public static TypeToken<?> of(Type type) {
        return new e(type);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, TypeToken<X> typeToken) {
        return new e(new apz().a(ImmutableMap.of(new apz.a(typeParameter.typeVariable), typeToken.runtimeType)).d(this.runtimeType));
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, Class<X> cls) {
        return where(typeParameter, of((Class) cls));
    }

    public final TypeToken<?> resolveType(Type type) {
        Preconditions.checkNotNull(type);
        return of(getInvariantTypeResolver().d(type));
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> typeTokenOf = of(getCovariantTypeResolver().d(type));
        typeTokenOf.covariantTypeResolver = this.covariantTypeResolver;
        typeTokenOf.invariantTypeResolver = this.invariantTypeResolver;
        return typeTokenOf;
    }

    @CheckForNull
    final TypeToken<? super T> getGenericSuperclass() {
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

    @CheckForNull
    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.c cVarBuilder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            cVarBuilder.add(resolveSupertype(type2));
        }
        return cVarBuilder.build();
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
        ImmutableList.c cVarBuilder = ImmutableList.builder();
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.getRawType().isInterface()) {
                cVarBuilder.add(typeTokenOf);
            }
        }
        return cVarBuilder.build();
    }

    public final TypeToken<T>.a getTypes() {
        return new a();
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        Preconditions.checkArgument(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            return getArraySupertype(cls);
        }
        return (TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        Preconditions.checkArgument(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        Preconditions.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) of(resolveTypeArgsForSubclass(cls));
        Preconditions.checkArgument(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSubtypeOf(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).a(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return any(((WildcardType) type2).getUpperBounds()).c(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).c(type);
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

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? of(apu.a((Class) this.runtimeType)) : this;
    }

    private boolean isWrapper() {
        return apu.b().contains(this.runtimeType);
    }

    public final TypeToken<T> unwrap() {
        return isWrapper() ? of(apu.c((Class) this.runtimeType)) : this;
    }

    @CheckForNull
    public final TypeToken<?> getComponentType() {
        Type typeE = Types.e(this.runtimeType);
        if (typeE == null) {
            return null;
        }
        return of(typeE);
    }

    public final Invokable<T, Object> method(Method method) {
        Preconditions.checkArgument(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new Invokable.c<T>(method) { // from class: com.google.common.reflect.TypeToken.4
            @Override // com.google.common.reflect.Invokable.c, com.google.common.reflect.Invokable
            Type getGenericReturnType() {
                return TypeToken.this.getCovariantTypeResolver().d(super.getGenericReturnType());
            }

            @Override // com.google.common.reflect.Invokable.c, com.google.common.reflect.Invokable
            Type[] getGenericParameterTypes() {
                return TypeToken.this.getInvariantTypeResolver().d(super.getGenericParameterTypes());
            }

            @Override // com.google.common.reflect.Invokable.c, com.google.common.reflect.Invokable
            Type[] getGenericExceptionTypes() {
                return TypeToken.this.getCovariantTypeResolver().d(super.getGenericExceptionTypes());
            }

            @Override // com.google.common.reflect.Invokable
            public TypeToken<T> getOwnerType() {
                return TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public String toString() {
                return getOwnerType() + "." + super.toString();
            }
        };
    }

    public final Invokable<T, T> constructor(Constructor<?> constructor) {
        Preconditions.checkArgument(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new Invokable.e<T>(constructor) { // from class: com.google.common.reflect.TypeToken.3
            @Override // com.google.common.reflect.Invokable.e, com.google.common.reflect.Invokable
            Type getGenericReturnType() {
                return TypeToken.this.getCovariantTypeResolver().d(super.getGenericReturnType());
            }

            @Override // com.google.common.reflect.Invokable.e, com.google.common.reflect.Invokable
            Type[] getGenericParameterTypes() {
                return TypeToken.this.getInvariantTypeResolver().d(super.getGenericParameterTypes());
            }

            @Override // com.google.common.reflect.Invokable.e, com.google.common.reflect.Invokable
            Type[] getGenericExceptionTypes() {
                return TypeToken.this.getCovariantTypeResolver().d(super.getGenericExceptionTypes());
            }

            @Override // com.google.common.reflect.Invokable
            public TypeToken<T> getOwnerType() {
                return TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public String toString() {
                return getOwnerType() + Constants.LEFT_BRACKET_ONLY + Joiner.on(", ").join(getGenericParameterTypes()) + Constants.RIGHT_BRACKET_ONLY;
            }
        };
    }

    /* JADX INFO: loaded from: classes21.dex */
    public class a extends ForwardingSet<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private transient ImmutableSet<TypeToken<? super T>> f4635b;

        a() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f4635b;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> set = FluentIterable.from(TypeCollector.FOR_GENERIC_TYPE.collectTypes(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.f4635b = set;
            return set;
        }

        public Set<Class<? super T>> a() {
            return ImmutableSet.copyOf((Collection) TypeCollector.FOR_RAW_TYPE.collectTypes(TypeToken.this.getRawTypes()));
        }
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public String toString() {
        return Types.c(this.runtimeType);
    }

    protected Object writeReplace() {
        return of(new apz().d(this.runtimeType));
    }

    final TypeToken<T> rejectTypeVariables() {
        new TypeVisitor() { // from class: com.google.common.reflect.TypeToken.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitTypeVariable(TypeVariable<?> typeVariable) {
                throw new IllegalArgumentException(TypeToken.this.runtimeType + "contains a type variable and is not safe for the operation");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitWildcardType(WildcardType wildcardType) {
                visit(wildcardType.getLowerBounds());
                visit(wildcardType.getUpperBounds());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitParameterizedType(ParameterizedType parameterizedType) {
                visit(parameterizedType.getActualTypeArguments());
                visit(parameterizedType.getOwnerType());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitGenericArrayType(GenericArrayType genericArrayType) {
                visit(genericArrayType.getGenericComponentType());
            }
        }.visit(this.runtimeType);
        return this;
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        UnmodifiableIterator<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
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
        for (int i = 0; i < typeParameters.length; i++) {
            if (!of(getCovariantTypeResolver().d(typeParameters[i])).is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType());
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return cls.isAssignableFrom(Object[].class);
            }
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
            return every(wildcardTypeCanonicalizeWildcardType.getUpperBounds()).a(this.runtimeType) && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).c(this.runtimeType);
        }
        return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        if (type instanceof WildcardType) {
            return canonicalizeWildcardType(typeVariable, (WildcardType) type);
        }
        return canonicalizeWildcardsInType(type);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        if (type instanceof ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((ParameterizedType) type);
        }
        return type instanceof GenericArrayType ? Types.d(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).c(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new Types.f(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = canonicalizeTypeArg(typeParameters[i], actualTypeArguments[i]);
        }
        return Types.b(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static b every(Type[] typeArr) {
        return new b(typeArr, false);
    }

    private static b any(Type[] typeArr) {
        return new b(typeArr, true);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Type[] f4636c;
        private final boolean d;

        b(Type[] typeArr, boolean z) {
            this.f4636c = typeArr;
            this.d = z;
        }

        boolean c(Type type) {
            for (Type type2 : this.f4636c) {
                boolean zIsSubtypeOf = TypeToken.of(type2).isSubtypeOf(type);
                boolean z = this.d;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.d;
        }

        boolean a(Type type) {
            TypeToken<?> typeTokenOf = TypeToken.of(type);
            for (Type type2 : this.f4636c) {
                boolean zIsSubtypeOf = typeTokenOf.isSubtypeOf(type2);
                boolean z = this.d;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableSet<Class<? super T>> getRawTypes() {
        final ImmutableSet.b bVarBuilder = ImmutableSet.builder();
        new TypeVisitor(this) { // from class: com.google.common.reflect.TypeToken.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitTypeVariable(TypeVariable<?> typeVariable) {
                visit(typeVariable.getBounds());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitWildcardType(WildcardType wildcardType) {
                visit(wildcardType.getUpperBounds());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitParameterizedType(ParameterizedType parameterizedType) {
                bVarBuilder.add((Class) parameterizedType.getRawType());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitClass(Class<?> cls) {
                bVarBuilder.add(cls);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeVisitor
            protected void visitGenericArrayType(GenericArrayType genericArrayType) {
                bVarBuilder.add(Types.e((Class<?>) TypeToken.of(genericArrayType.getGenericComponentType()).getRawType()));
            }
        }.visit(this.runtimeType);
        return bVarBuilder.build();
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

    @CheckForNull
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

    static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (TypeToken<? extends T>) of(Types.d(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        if (typeParameters.length > 0 || (type != null && type != cls.getEnclosingClass())) {
            return (TypeToken<? extends T>) of(Types.b(type, cls, typeParameters));
        }
        return of((Class) cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public apz getCovariantTypeResolver() {
        apz apzVar = this.covariantTypeResolver;
        if (apzVar != null) {
            return apzVar;
        }
        apz apzVarE = apz.e(this.runtimeType);
        this.covariantTypeResolver = apzVarE;
        return apzVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public apz getInvariantTypeResolver() {
        apz apzVar = this.invariantTypeResolver;
        if (apzVar != null) {
            return apzVar;
        }
        apz apzVarC = apz.c(this.runtimeType);
        this.invariantTypeResolver = apzVarC;
        return apzVarC;
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) typeTokenOf.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType == null) {
            throw new IllegalArgumentException(cls + " isn't a super type of " + this);
        }
        return (TypeToken<? super T>) of(newArrayClassOrGenericArrayType(componentType.getSupertype((Class) Objects.requireNonNull(cls.getComponentType())).runtimeType));
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType == null) {
            throw new IllegalArgumentException(cls + " does not appear to be a subtype of " + this);
        }
        return (TypeToken<? extends T>) of(newArrayClassOrGenericArrayType(((TypeToken) Objects.requireNonNull(getComponentType())).getSubtype(componentType).runtimeType));
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken genericType = toGenericType(cls);
        return new apz().b(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).d(genericType.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return Types.JavaVersion.JAVA7.newArrayType(type);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class e<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        e(Type type) {
            super(type);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static abstract class TypeCollector<K> {
        static final TypeCollector<TypeToken<?>> FOR_GENERIC_TYPE = new TypeCollector<TypeToken<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Class<?> getRawType(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends TypeToken<?>> getInterfaces(TypeToken<?> typeToken) {
                return typeToken.getGenericInterfaces();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public TypeToken<?> getSuperclass(TypeToken<?> typeToken) {
                return typeToken.getGenericSuperclass();
            }
        };
        static final TypeCollector<Class<?>> FOR_RAW_TYPE = new TypeCollector<Class<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Class<?> getRawType(Class<?> cls) {
                return cls;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> getInterfaces(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @CheckForNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Class<?> getSuperclass(Class<?> cls) {
                return cls.getSuperclass();
            }
        };

        abstract Iterable<? extends K> getInterfaces(K k);

        abstract Class<?> getRawType(K k);

        @CheckForNull
        abstract K getSuperclass(K k);

        private TypeCollector() {
        }

        final TypeCollector<K> classesOnly() {
            return new b<K>(this, this) { // from class: com.google.common.reflect.TypeToken.TypeCollector.1
                @Override // com.google.common.reflect.TypeToken.TypeCollector.b, com.google.common.reflect.TypeToken.TypeCollector
                Iterable<? extends K> getInterfaces(K k) {
                    return ImmutableSet.of();
                }

                @Override // com.google.common.reflect.TypeToken.TypeCollector
                ImmutableList<K> collectTypes(Iterable<? extends K> iterable) {
                    ImmutableList.c cVarBuilder = ImmutableList.builder();
                    for (K k : iterable) {
                        if (!getRawType(k).isInterface()) {
                            cVarBuilder.add(k);
                        }
                    }
                    return super.collectTypes((Iterable) cVarBuilder.build());
                }
            };
        }

        final ImmutableList<K> collectTypes(K k) {
            return collectTypes((Iterable) ImmutableList.of(k));
        }

        ImmutableList<K> collectTypes(Iterable<? extends K> iterable) {
            HashMap mapA = Maps.a();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                collectTypes(it.next(), mapA);
            }
            return sortKeysByValue(mapA, Ordering.natural().reverse());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int collectTypes(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = getRawType(k).isInterface();
            Iterator<? extends K> it = getInterfaces(k).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, collectTypes(it.next(), map));
            }
            K superclass = getSuperclass(k);
            int iMax2 = iMax;
            if (superclass != null) {
                iMax2 = Math.max(iMax, collectTypes(superclass, map));
            }
            int i = iMax2 + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        private static <K, V> ImmutableList<K> sortKeysByValue(final Map<K, V> map, final Comparator<? super V> comparator) {
            return (ImmutableList<K>) new Ordering<K>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.Ordering, java.util.Comparator
                public int compare(K k, K k2) {
                    return comparator.compare(Objects.requireNonNull(map.get(k)), Objects.requireNonNull(map.get(k2)));
                }
            }.immutableSortedCopy(map.keySet());
        }

        static class b<K> extends TypeCollector<K> {
            private final TypeCollector<K> e;

            b(TypeCollector<K> typeCollector) {
                super();
                this.e = typeCollector;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            Class<?> getRawType(K k) {
                return this.e.getRawType(k);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            Iterable<? extends K> getInterfaces(K k) {
                return this.e.getInterfaces(k);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @CheckForNull
            K getSuperclass(K k) {
                return this.e.getSuperclass(k);
            }
        }
    }
}
