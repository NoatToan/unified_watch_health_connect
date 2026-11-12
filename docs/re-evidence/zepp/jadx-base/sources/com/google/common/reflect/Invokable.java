package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public abstract class Invokable<T, R> extends com.google.common.reflect.a implements GenericDeclaration {

    public static class a<T> extends Invokable<T, T> {
        public final Constructor<?> c;

        public a(Constructor<?> constructor) {
            super(constructor);
            this.c = constructor;
        }

        private boolean h() {
            Class<?> declaringClass = this.c.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            return (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] c() {
            return this.c.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] d() {
            Type[] genericParameterTypes = this.c.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !h()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.c.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.Invokable
        public Type e() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? d.m(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.Invokable
        public final Annotation[][] f() {
            return this.c.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        public final Object g(@NullableDecl Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            try {
                return this.c.newInstance(objArr);
            } catch (InstantiationException e) {
                throw new RuntimeException(this.c + " failed.", e);
            }
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.c.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return false;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.c.isVarArgs();
        }
    }

    public static class b<T> extends Invokable<T, Object> {
        public final Method c;

        public b(Method method) {
            super(method);
            this.c = method;
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] c() {
            return this.c.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] d() {
            return this.c.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.Invokable
        public Type e() {
            return this.c.getGenericReturnType();
        }

        @Override // com.google.common.reflect.Invokable
        public final Annotation[][] f() {
            return this.c.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        public final Object g(@NullableDecl Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            return this.c.invoke(obj, objArr);
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            return this.c.getTypeParameters();
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return (isFinal() || isPrivate() || isStatic() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.c.isVarArgs();
        }
    }

    public <M extends AccessibleObject & Member> Invokable(M m) {
        super(m);
    }

    public static Invokable<?, Object> from(Method method) {
        return new b(method);
    }

    public abstract Type[] c();

    public abstract Type[] d();

    public abstract Type e();

    @Override // com.google.common.reflect.a
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public abstract Annotation[][] f();

    public abstract Object g(@NullableDecl Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException;

    @Override // com.google.common.reflect.a, java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) super.getDeclaringClass();
    }

    public final ImmutableList<TypeToken<? extends Throwable>> getExceptionTypes() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : c()) {
            builder.add(TypeToken.of(type));
        }
        return builder.build();
    }

    @Override // com.google.common.reflect.a
    public TypeToken<T> getOwnerType() {
        return TypeToken.of((Class) getDeclaringClass());
    }

    public final ImmutableList<Parameter> getParameters() {
        Type[] typeArrD = d();
        Annotation[][] annotationArrF = f();
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < typeArrD.length; i++) {
            builder.add(new Parameter(this, i, TypeToken.of(typeArrD[i]), annotationArrF[i]));
        }
        return builder.build();
    }

    public final TypeToken<? extends R> getReturnType() {
        return (TypeToken<? extends R>) TypeToken.of(e());
    }

    @Override // com.google.common.reflect.a
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @CanIgnoreReturnValue
    public final R invoke(@NullableDecl T t, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        return (R) g(t, (Object[]) Preconditions.checkNotNull(objArr));
    }

    public abstract boolean isOverridable();

    public abstract boolean isVarArgs();

    public final <R1 extends R> Invokable<T, R1> returning(Class<R1> cls) {
        return returning(TypeToken.of((Class) cls));
    }

    @Override // com.google.common.reflect.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <T> Invokable<T, T> from(Constructor<T> constructor) {
        return new a(constructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> Invokable<T, R1> returning(TypeToken<R1> typeToken) {
        if (typeToken.isSupertypeOf(getReturnType())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + getReturnType() + ", not " + typeToken);
    }
}
