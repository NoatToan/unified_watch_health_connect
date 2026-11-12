package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.acp;
import defpackage.act;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final act[] _paramAnnotations;

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    @Deprecated
    public abstract Type getGenericParameterType(int i);

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i);

    public abstract Class<?> getRawParameterType(int i);

    public AnnotatedWithParams(TypeResolutionContext typeResolutionContext, act actVar, act[] actVarArr) {
        super(typeResolutionContext, actVar);
        this._paramAnnotations = actVarArr;
    }

    protected AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, act[] actVarArr) {
        super(annotatedWithParams);
        this._paramAnnotations = actVarArr;
    }

    public final void addOrOverrideParam(int i, Annotation annotation) {
        act actVar = this._paramAnnotations[i];
        if (actVar == null) {
            actVar = new act();
            this._paramAnnotations[i] = actVar;
        }
        actVar.d(annotation);
    }

    public acp replaceParameterAnnotations(int i, act actVar) {
        this._paramAnnotations[i] = actVar;
        return getParameter(i);
    }

    public final act getParameterAnnotations(int i) {
        act[] actVarArr = this._paramAnnotations;
        if (actVarArr == null || i < 0 || i >= actVarArr.length) {
            return null;
        }
        return actVarArr[i];
    }

    public final acp getParameter(int i) {
        return new acp(this, getParameterType(i), this._typeContext, getParameterAnnotations(i), i);
    }

    public final int getAnnotationCount() {
        return this._annotations.size();
    }
}
