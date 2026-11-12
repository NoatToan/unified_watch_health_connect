package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.h04;
import defpackage.hd1;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class AnnotatedParameter extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final int _index;
    protected final AnnotatedWithParams _owner;
    protected final JavaType _type;

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, g gVar, hd1 hd1Var, int i) {
        super(gVar, hd1Var);
        this._owner = annotatedWithParams;
        this._type = javaType;
        this._index = i;
    }

    @Override // defpackage.fd1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!h04.I(obj, AnnotatedParameter.class)) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        return annotatedParameter._owner.equals(this._owner) && annotatedParameter._index == this._index;
    }

    @Override // defpackage.fd1
    public AnnotatedElement getAnnotated() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    @Override // defpackage.fd1
    @Deprecated
    public Type getGenericType() {
        return this._owner.getGenericParameterType(this._index);
    }

    public int getIndex() {
        return this._index;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._owner.getMember();
    }

    @Override // defpackage.fd1
    public int getModifiers() {
        return this._owner.getModifiers();
    }

    @Override // defpackage.fd1
    public String getName() {
        return "";
    }

    public AnnotatedWithParams getOwner() {
        return this._owner;
    }

    public Type getParameterType() {
        return this._type;
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
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // defpackage.fd1
    public int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // defpackage.fd1
    public String toString() {
        return "[parameter #" + getIndex() + ", annotations: " + this._annotations + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedParameter withAnnotations(hd1 hd1Var) {
        return hd1Var == this._annotations ? this : this._owner.replaceParameterAnnotations(this._index, hd1Var);
    }
}
