package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.fd1;
import defpackage.h04;
import defpackage.hd1;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes4.dex */
public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _declaringClass;
    protected final String _name;
    protected final JavaType _type;

    public VirtualAnnotatedMember(g gVar, Class<?> cls, String str, JavaType javaType) {
        super(gVar, null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    @Override // defpackage.fd1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!h04.I(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember._declaringClass == this._declaringClass && virtualAnnotatedMember._name.equals(this._name);
    }

    @Override // defpackage.fd1
    public Field getAnnotated() {
        return null;
    }

    public int getAnnotationCount() {
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return null;
    }

    @Override // defpackage.fd1
    public int getModifiers() {
        return 0;
    }

    @Override // defpackage.fd1
    public String getName() {
        return this._name;
    }

    @Override // defpackage.fd1
    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    @Override // defpackage.fd1
    public JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this._name + "'");
    }

    @Override // defpackage.fd1
    public int hashCode() {
        return this._name.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot set virtual property '" + this._name + "'");
    }

    @Override // defpackage.fd1
    public String toString() {
        return "[virtual " + getFullName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public fd1 withAnnotations(hd1 hd1Var) {
        return this;
    }
}
