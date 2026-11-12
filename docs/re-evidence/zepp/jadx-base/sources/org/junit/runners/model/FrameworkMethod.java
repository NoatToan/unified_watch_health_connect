package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import org.junit.internal.runners.model.ReflectiveCallable;

/* JADX INFO: loaded from: classes23.dex */
public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {
    private final Method a;

    public class a extends ReflectiveCallable {
        public final /* synthetic */ Object a;
        public final /* synthetic */ Object[] b;

        public a(Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            this.a = obj;
            this.b = objArr;
        }

        @Override // org.junit.internal.runners.model.ReflectiveCallable
        public Object runReflectiveCall() throws Throwable {
            return FrameworkMethod.this.a.invoke(this.a, this.b);
        }
    }

    public FrameworkMethod(Method method) {
        Objects.requireNonNull(method, "FrameworkMethod cannot be created without an underlying method.");
        this.a = method;
    }

    private Class<?>[] c() {
        return this.a.getParameterTypes();
    }

    public boolean equals(Object obj) {
        if (FrameworkMethod.class.isInstance(obj)) {
            return ((FrameworkMethod) obj).a.equals(this.a);
        }
        return false;
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.a.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getDeclaringClass() {
        return this.a.getDeclaringClass();
    }

    public Method getMethod() {
        return this.a;
    }

    @Override // org.junit.runners.model.FrameworkMember
    public int getModifiers() {
        return this.a.getModifiers();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public String getName() {
        return this.a.getName();
    }

    public Class<?> getReturnType() {
        return this.a.getReturnType();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getType() {
        return getReturnType();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object invokeExplosively(Object obj, Object... objArr) throws Throwable {
        return new a(obj, objArr).run();
    }

    @Deprecated
    public boolean producesType(Type type) {
        return c().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.a.getReturnType());
    }

    public String toString() {
        return this.a.toString();
    }

    public void validateNoTypeParametersOnArgs(List<Throwable> list) {
        new org.junit.runners.model.a(this.a).a(list);
    }

    public void validatePublicVoid(boolean z, List<Throwable> list) {
        if (isStatic() != z) {
            list.add(new Exception("Method " + this.a.getName() + "() " + (z ? "should" : "should not") + " be static"));
        }
        if (!isPublic()) {
            list.add(new Exception("Method " + this.a.getName() + "() should be public"));
        }
        if (this.a.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.a.getName() + "() should be void"));
        }
    }

    public void validatePublicVoidNoArg(boolean z, List<Throwable> list) {
        validatePublicVoid(z, list);
        if (this.a.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.a.getName() + " should have no parameters"));
        }
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isShadowedBy(FrameworkMethod frameworkMethod) {
        if (!frameworkMethod.getName().equals(getName()) || frameworkMethod.c().length != c().length) {
            return false;
        }
        for (int i = 0; i < frameworkMethod.c().length; i++) {
            if (!frameworkMethod.c()[i].equals(c()[i])) {
                return false;
            }
        }
        return true;
    }
}
