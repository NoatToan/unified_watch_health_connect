package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.h04;
import defpackage.hd1;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class AnnotatedConstructor extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    protected final Constructor<?> _constructor;
    protected a _serialization;

    public static final class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Class<?> f7668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Class<?>[] f7669b;

        public a(Constructor<?> constructor) {
            this.f7668a = constructor.getDeclaringClass();
            this.f7669b = constructor.getParameterTypes();
        }
    }

    public AnnotatedConstructor(g gVar, Constructor<?> constructor, hd1 hd1Var, hd1[] hd1VarArr) {
        super(gVar, hd1Var, hd1VarArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this._constructor = constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._constructor.newInstance(new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._constructor.newInstance(obj);
    }

    @Override // defpackage.fd1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return h04.I(obj, AnnotatedConstructor.class) && ((AnnotatedConstructor) obj)._constructor == this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._constructor;
    }

    @Override // defpackage.fd1
    public int getModifiers() {
        return this._constructor.getModifiers();
    }

    @Override // defpackage.fd1
    public String getName() {
        return this._constructor.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return this._constructor.getParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.a(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    @Override // defpackage.fd1
    public Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    @Override // defpackage.fd1
    public JavaType getType() {
        return this._typeContext.a(getRawType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + getDeclaringClass().getName());
    }

    @Override // defpackage.fd1
    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    public Object readResolve() {
        a aVar = this._serialization;
        Class<?> cls = aVar.f7668a;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(aVar.f7669b);
            if (!declaredConstructor.isAccessible()) {
                h04.f(declaredConstructor, false);
            }
            return new AnnotatedConstructor(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this._serialization.f7669b.length + " args from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + getDeclaringClass().getName());
    }

    @Override // defpackage.fd1
    public String toString() {
        return "[constructor for " + getName() + ", annotations: " + this._annotations + "]";
    }

    public Object writeReplace() {
        return new AnnotatedConstructor(new a(this._constructor));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    @Override // defpackage.fd1
    public Constructor<?> getAnnotated() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedConstructor withAnnotations(hd1 hd1Var) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, hd1Var, this._paramAnnotations);
    }

    public AnnotatedConstructor(a aVar) {
        super(null, null, null);
        this._constructor = null;
        this._serialization = aVar;
    }
}
