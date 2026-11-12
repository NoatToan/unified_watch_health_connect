package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.hd1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final hd1[] _paramAnnotations;

    public AnnotatedWithParams(g gVar, hd1 hd1Var, hd1[] hd1VarArr) {
        super(gVar, hd1Var);
        this._paramAnnotations = hd1VarArr;
    }

    public final void addOrOverrideParam(int i, Annotation annotation) {
        hd1 hd1Var = this._paramAnnotations[i];
        if (hd1Var == null) {
            hd1Var = new hd1();
            this._paramAnnotations[i] = hd1Var;
        }
        hd1Var.b(annotation);
    }

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    public final int getAnnotationCount() {
        return this._annotations.size();
    }

    @Deprecated
    public abstract Type getGenericParameterType(int i);

    public final AnnotatedParameter getParameter(int i) {
        return new AnnotatedParameter(this, getParameterType(i), this._typeContext, getParameterAnnotations(i), i);
    }

    public final hd1 getParameterAnnotations(int i) {
        hd1[] hd1VarArr = this._paramAnnotations;
        if (hd1VarArr == null || i < 0 || i >= hd1VarArr.length) {
            return null;
        }
        return hd1VarArr[i];
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i);

    public abstract Class<?> getRawParameterType(int i);

    public AnnotatedParameter replaceParameterAnnotations(int i, hd1 hd1Var) {
        this._paramAnnotations[i] = hd1Var;
        return getParameter(i);
    }

    public AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, hd1[] hd1VarArr) {
        super(annotatedWithParams);
        this._paramAnnotations = hd1VarArr;
    }
}
