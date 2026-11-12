package com.fasterxml.jackson.databind.introspect;

import defpackage.act;
import defpackage.ahw;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AnnotatedMember extends Annotated implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient act _annotations;
    protected final transient TypeResolutionContext _typeContext;

    public abstract Class<?> getDeclaringClass();

    public abstract Member getMember();

    public abstract Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract Annotated withAnnotations(act actVar);

    public AnnotatedMember(TypeResolutionContext typeResolutionContext, act actVar) {
        this._typeContext = typeResolutionContext;
        this._annotations = actVar;
    }

    protected AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName();
    }

    @Deprecated
    public TypeResolutionContext getTypeContext() {
        return this._typeContext;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        act actVar = this._annotations;
        if (actVar == null) {
            return null;
        }
        return (A) actVar.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final boolean hasAnnotation(Class<?> cls) {
        act actVar = this._annotations;
        if (actVar == null) {
            return false;
        }
        return actVar.has(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        act actVar = this._annotations;
        if (actVar == null) {
            return false;
        }
        return actVar.hasOneOf(clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    @Deprecated
    public Iterable<Annotation> annotations() {
        act actVar = this._annotations;
        if (actVar == null) {
            return Collections.EMPTY_LIST;
        }
        return actVar.b();
    }

    public act getAllAnnotations() {
        return this._annotations;
    }

    public final void fixAccess(boolean z) {
        Member member = getMember();
        if (member != null) {
            ahw.a(member, z);
        }
    }
}
