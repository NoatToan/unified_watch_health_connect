package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.h04;
import defpackage.hd1;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;
    protected a _serialization;

    public static final class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Class<?> f7672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7673b;
        public Class<?>[] c;

        public a(Method method) {
            this.f7672a = method.getDeclaringClass();
            this.f7673b = method.getName();
            this.c = method.getParameterTypes();
        }
    }

    public AnnotatedMethod(g gVar, Method method, hd1 hd1Var, hd1[] hd1VarArr) {
        super(gVar, hd1Var, hd1VarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this._method = method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._method.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._method.invoke(null, obj);
    }

    public final Object callOn(Object obj) throws Exception {
        return this._method.invoke(obj, null);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this._method.invoke(obj, objArr);
    }

    @Override // defpackage.fd1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return h04.I(obj, AnnotatedMethod.class) && ((AnnotatedMethod) obj)._method == this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public String getFullName() {
        return String.format("%s(%d params)", super.getFullName(), Integer.valueOf(getParameterCount()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    @Deprecated
    public Type[] getGenericParameterTypes() {
        return this._method.getGenericParameterTypes();
    }

    @Override // defpackage.fd1
    @Deprecated
    public Type getGenericType() {
        return this._method.getGenericReturnType();
    }

    @Override // defpackage.fd1
    public int getModifiers() {
        return this._method.getModifiers();
    }

    @Override // defpackage.fd1
    public String getName() {
        return this._method.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.a(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    @Override // defpackage.fd1
    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    @Override // defpackage.fd1
    public JavaType getType() {
        return this._typeContext.a(this._method.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._method.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    public boolean hasReturnType() {
        Class<?> rawReturnType = getRawReturnType();
        return (rawReturnType == Void.TYPE || rawReturnType == Void.class) ? false : true;
    }

    @Override // defpackage.fd1
    public int hashCode() {
        return this._method.getName().hashCode();
    }

    public Object readResolve() {
        a aVar = this._serialization;
        Class<?> cls = aVar.f7672a;
        try {
            Method declaredMethod = cls.getDeclaredMethod(aVar.f7673b, aVar.c);
            if (!declaredMethod.isAccessible()) {
                h04.f(declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.f7673b + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._method.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    @Override // defpackage.fd1
    public String toString() {
        return "[method " + getFullName() + "]";
    }

    public Object writeReplace() {
        return new AnnotatedMethod(new a(this._method));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._method.invoke(null, objArr);
    }

    @Override // defpackage.fd1
    public Method getAnnotated() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Method getMember() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedMethod withAnnotations(hd1 hd1Var) {
        return new AnnotatedMethod(this._typeContext, this._method, hd1Var, this._paramAnnotations);
    }

    public AnnotatedMethod(a aVar) {
        super(null, null, null);
        this._method = null;
        this._serialization = aVar;
    }
}
