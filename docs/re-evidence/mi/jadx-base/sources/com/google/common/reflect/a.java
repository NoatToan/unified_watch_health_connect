package com.google.common.reflect;

import defpackage.c6i;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T, R> implements AnnotatedElement, Member {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibleObject f9305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Member f9306b;

    /* JADX INFO: renamed from: com.google.common.reflect.a$a, reason: collision with other inner class name */
    public static class C0245a<T> extends a<T, T> {
        public final Constructor<?> c;

        public C0245a(Constructor<?> constructor) {
            super(constructor);
            this.c = constructor;
        }

        public Type[] b() {
            Type[] genericParameterTypes = this.c.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !c()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.c.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        public final boolean c() {
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
    }

    public static class b<T> extends a<T, Object> {
        public final Method c;

        public b(Method method) {
            super(method);
            this.c = method;
        }
    }

    public <M extends AccessibleObject & Member> a(M m) {
        c6i.o(m);
        this.f9305a = m;
        this.f9306b = m;
    }

    public TypeToken<T> a() {
        return TypeToken.of((Class) getDeclaringClass());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return a().equals(aVar.a()) && this.f9306b.equals(aVar.f9306b);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f9305a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f9305a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f9305a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f9306b.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f9306b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f9306b.getName();
    }

    public int hashCode() {
        return this.f9306b.hashCode();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f9305a.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f9306b.isSynthetic();
    }

    public String toString() {
        return this.f9306b.toString();
    }
}
