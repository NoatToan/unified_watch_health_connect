package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.h04;
import defpackage.hd1;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class AnnotatedField extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Field _field;
    protected a _serialization;

    public static final class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Class<?> f7670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7671b;

        public a(Field field) {
            this.f7670a = field.getDeclaringClass();
            this.f7671b = field.getName();
        }
    }

    public AnnotatedField(g gVar, Field field, hd1 hd1Var) {
        super(gVar, hd1Var);
        this._field = field;
    }

    @Override // defpackage.fd1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return h04.I(obj, AnnotatedField.class) && ((AnnotatedField) obj)._field == this._field;
    }

    public int getAnnotationCount() {
        return this._annotations.size();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    @Override // defpackage.fd1
    @Deprecated
    public Type getGenericType() {
        return this._field.getGenericType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._field;
    }

    @Override // defpackage.fd1
    public int getModifiers() {
        return this._field.getModifiers();
    }

    @Override // defpackage.fd1
    public String getName() {
        return this._field.getName();
    }

    @Override // defpackage.fd1
    public Class<?> getRawType() {
        return this._field.getType();
    }

    @Override // defpackage.fd1
    public JavaType getType() {
        return this._typeContext.a(this._field.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    @Override // defpackage.fd1
    public int hashCode() {
        return this._field.getName().hashCode();
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public Object readResolve() {
        a aVar = this._serialization;
        Class<?> cls = aVar.f7670a;
        try {
            Field declaredField = cls.getDeclaredField(aVar.f7671b);
            if (!declaredField.isAccessible()) {
                h04.f(declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.f7671b + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    @Override // defpackage.fd1
    public String toString() {
        return "[field " + getFullName() + "]";
    }

    public Object writeReplace() {
        return new AnnotatedField(new a(this._field));
    }

    @Override // defpackage.fd1
    public Field getAnnotated() {
        return this._field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedField withAnnotations(hd1 hd1Var) {
        return new AnnotatedField(this._typeContext, this._field, hd1Var);
    }

    public AnnotatedField(a aVar) {
        super(null, null);
        this._field = null;
        this._serialization = aVar;
    }
}
