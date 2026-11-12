package com.fasterxml.jackson.databind.introspect;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.fd1;
import defpackage.h04;
import defpackage.hd1;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AnnotatedMember extends fd1 implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient hd1 _annotations;
    protected final transient g _typeContext;

    public AnnotatedMember(g gVar, hd1 hd1Var) {
        this._typeContext = gVar;
        this._annotations = hd1Var;
    }

    @Override // defpackage.fd1
    @Deprecated
    public Iterable<Annotation> annotations() {
        hd1 hd1Var = this._annotations;
        return hd1Var == null ? Collections.emptyList() : hd1Var.c();
    }

    public final void fixAccess(boolean z) {
        Member member = getMember();
        if (member != null) {
            h04.f(member, z);
        }
    }

    public hd1 getAllAnnotations() {
        return this._annotations;
    }

    @Override // defpackage.fd1
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        hd1 hd1Var = this._annotations;
        if (hd1Var == null) {
            return null;
        }
        return (A) hd1Var.get(cls);
    }

    public abstract Class<?> getDeclaringClass();

    public String getFullName() {
        return getDeclaringClass().getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + getName();
    }

    public abstract Member getMember();

    @Deprecated
    public g getTypeContext() {
        return this._typeContext;
    }

    public abstract Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    @Override // defpackage.fd1
    public final boolean hasAnnotation(Class<?> cls) {
        hd1 hd1Var = this._annotations;
        if (hd1Var == null) {
            return false;
        }
        return hd1Var.has(cls);
    }

    @Override // defpackage.fd1
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        hd1 hd1Var = this._annotations;
        if (hd1Var == null) {
            return false;
        }
        return hd1Var.hasOneOf(clsArr);
    }

    public abstract void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract fd1 withAnnotations(hd1 hd1Var);

    public AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }
}
