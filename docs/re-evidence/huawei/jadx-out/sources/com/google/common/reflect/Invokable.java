package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import defpackage.apw;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class Invokable<T, R> implements AnnotatedElement, Member {
    private static final boolean ANNOTATED_TYPE_EXISTS = initAnnotatedTypeExists();
    private final AccessibleObject accessibleObject;
    private final Member member;

    abstract Type[] getGenericExceptionTypes();

    abstract Type[] getGenericParameterTypes();

    abstract Type getGenericReturnType();

    abstract Annotation[][] getParameterAnnotations();

    public abstract TypeVariable<?>[] getTypeParameters();

    @CheckForNull
    abstract Object invokeInternal(@CheckForNull Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException;

    public abstract boolean isOverridable();

    public abstract boolean isVarArgs();

    <M extends AccessibleObject & Member> Invokable(M m) {
        Preconditions.checkNotNull(m);
        this.accessibleObject = m;
        this.member = m;
    }

    public static Invokable<?, Object> from(Method method) {
        return new c(method);
    }

    public static <T> Invokable<T, T> from(Constructor<T> constructor) {
        return new e(constructor);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.accessibleObject.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.accessibleObject.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.accessibleObject.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.accessibleObject.getDeclaredAnnotations();
    }

    public final void setAccessible(boolean z) {
        this.accessibleObject.setAccessible(z);
    }

    public final boolean trySetAccessible() {
        try {
            this.accessibleObject.setAccessible(true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isAccessible() {
        return this.accessibleObject.isAccessible();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.member.getName();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.member.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.member.isSynthetic();
    }

    public final boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean isProtected() {
        return Modifier.isProtected(getModifiers());
    }

    public final boolean isPackagePrivate() {
        return (isPrivate() || isPublic() || isProtected()) ? false : true;
    }

    public final boolean isPrivate() {
        return Modifier.isPrivate(getModifiers());
    }

    public final boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean isNative() {
        return Modifier.isNative(getModifiers());
    }

    public final boolean isSynchronized() {
        return Modifier.isSynchronized(getModifiers());
    }

    final boolean isVolatile() {
        return Modifier.isVolatile(getModifiers());
    }

    final boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Invokable)) {
            return false;
        }
        Invokable invokable = (Invokable) obj;
        return getOwnerType().equals(invokable.getOwnerType()) && this.member.equals(invokable.member);
    }

    public int hashCode() {
        return this.member.hashCode();
    }

    public String toString() {
        return this.member.toString();
    }

    @CheckForNull
    public final R invoke(@CheckForNull T t, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        return (R) invokeInternal(t, (Object[]) Preconditions.checkNotNull(objArr));
    }

    public final TypeToken<? extends R> getReturnType() {
        return (TypeToken<? extends R>) TypeToken.of(getGenericReturnType());
    }

    public final ImmutableList<apw> getParameters() {
        Type[] genericParameterTypes = getGenericParameterTypes();
        Annotation[][] parameterAnnotations = getParameterAnnotations();
        Object[] objArr = new Object[genericParameterTypes.length];
        ImmutableList.c cVarBuilder = ImmutableList.builder();
        for (int i = 0; i < genericParameterTypes.length; i++) {
            cVarBuilder.add(new apw(this, i, TypeToken.of(genericParameterTypes[i]), parameterAnnotations[i], objArr[i]));
        }
        return cVarBuilder.build();
    }

    public final ImmutableList<TypeToken<? extends Throwable>> getExceptionTypes() {
        ImmutableList.c cVarBuilder = ImmutableList.builder();
        for (Type type : getGenericExceptionTypes()) {
            cVarBuilder.add(TypeToken.of(type));
        }
        return cVarBuilder.build();
    }

    public final <R1 extends R> Invokable<T, R1> returning(Class<R1> cls) {
        return returning(TypeToken.of((Class) cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> Invokable<T, R1> returning(TypeToken<R1> typeToken) {
        if (typeToken.isSupertypeOf(getReturnType())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + getReturnType() + ", not " + typeToken);
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.member.getDeclaringClass();
    }

    public TypeToken<T> getOwnerType() {
        return TypeToken.of((Class) getDeclaringClass());
    }

    static class c<T> extends Invokable<T, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Method f4629a;

        c(Method method) {
            super(method);
            this.f4629a = method;
        }

        @Override // com.google.common.reflect.Invokable
        @CheckForNull
        final Object invokeInternal(@CheckForNull Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            return this.f4629a.invoke(obj, objArr);
        }

        @Override // com.google.common.reflect.Invokable
        Type getGenericReturnType() {
            return this.f4629a.getGenericReturnType();
        }

        @Override // com.google.common.reflect.Invokable
        Type[] getGenericParameterTypes() {
            return this.f4629a.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.Invokable
        Type[] getGenericExceptionTypes() {
            return this.f4629a.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        final Annotation[][] getParameterAnnotations() {
            return this.f4629a.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f4629a.getTypeParameters();
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return (isFinal() || isPrivate() || isStatic() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.f4629a.isVarArgs();
        }
    }

    static class e<T> extends Invokable<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Constructor<?> f4630b;

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return false;
        }

        e(Constructor<?> constructor) {
            super(constructor);
            this.f4630b = constructor;
        }

        @Override // com.google.common.reflect.Invokable
        final Object invokeInternal(@CheckForNull Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            try {
                return this.f4630b.newInstance(objArr);
            } catch (InstantiationException e) {
                throw new RuntimeException(this.f4630b + " failed.", e);
            }
        }

        @Override // com.google.common.reflect.Invokable
        Type getGenericReturnType() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? Types.a(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.Invokable
        Type[] getGenericParameterTypes() {
            Type[] genericParameterTypes = this.f4630b.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !a()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f4630b.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.Invokable
        Type[] getGenericExceptionTypes() {
            return this.f4630b.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        final Annotation[][] getParameterAnnotations() {
            return this.f4630b.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f4630b.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.f4630b.isVarArgs();
        }

        private boolean a() {
            Class<?> declaringClass = this.f4630b.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            return (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }
    }

    private static boolean initAnnotatedTypeExists() {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
