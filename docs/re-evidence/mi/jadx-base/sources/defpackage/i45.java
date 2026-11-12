package defpackage;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

/* JADX INFO: loaded from: classes4.dex */
public final class i45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f20761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnnotatedWithParams f20762b;
    public final int c;
    public final a[] d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnnotatedParameter f20763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ih2 f20764b;
        public final JacksonInject.Value c;

        public a(AnnotatedParameter annotatedParameter, ih2 ih2Var, JacksonInject.Value value) {
            this.f20763a = annotatedParameter;
            this.f20764b = ih2Var;
            this.c = value;
        }
    }

    public i45(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, a[] aVarArr, int i) {
        this.f20761a = annotationIntrospector;
        this.f20762b = annotatedWithParams;
        this.d = aVarArr;
        this.c = i;
    }

    public static i45 a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, ih2[] ih2VarArr) {
        int parameterCount = annotatedWithParams.getParameterCount();
        a[] aVarArr = new a[parameterCount];
        for (int i = 0; i < parameterCount; i++) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
            aVarArr[i] = new a(parameter, ih2VarArr == null ? null : ih2VarArr[i], annotationIntrospector.findInjectableValue(parameter));
        }
        return new i45(annotationIntrospector, annotatedWithParams, aVarArr, parameterCount);
    }

    public AnnotatedWithParams b() {
        return this.f20762b;
    }

    public PropertyName c(int i) {
        ih2 ih2Var = this.d[i].f20764b;
        if (ih2Var == null || !ih2Var.D()) {
            return null;
        }
        return ih2Var.getFullName();
    }

    public PropertyName d(int i) {
        String strFindImplicitPropertyName = this.f20761a.findImplicitPropertyName(this.d[i].f20763a);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    public int e() {
        int i = -1;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (this.d[i2].c == null) {
                if (i >= 0) {
                    return -1;
                }
                i = i2;
            }
        }
        return i;
    }

    public JacksonInject.Value f(int i) {
        return this.d[i].c;
    }

    public int g() {
        return this.c;
    }

    public PropertyName h(int i) {
        ih2 ih2Var = this.d[i].f20764b;
        if (ih2Var != null) {
            return ih2Var.getFullName();
        }
        return null;
    }

    public AnnotatedParameter i(int i) {
        return this.d[i].f20763a;
    }

    public ih2 j(int i) {
        return this.d[i].f20764b;
    }

    public String toString() {
        return this.f20762b.toString();
    }
}
