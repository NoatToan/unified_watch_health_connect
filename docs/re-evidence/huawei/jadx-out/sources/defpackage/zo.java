package defpackage;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

/* JADX INFO: loaded from: classes21.dex */
public final class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f54376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AnnotatedWithParams f54377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final b[] f54378c;
    protected final AnnotationIntrospector e;

    protected zo(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, b[] bVarArr, int i) {
        this.e = annotationIntrospector;
        this.f54377b = annotatedWithParams;
        this.f54378c = bVarArr;
        this.f54376a = i;
    }

    public static zo e(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition[] beanPropertyDefinitionArr) {
        int parameterCount = annotatedWithParams.getParameterCount();
        b[] bVarArr = new b[parameterCount];
        for (int i = 0; i < parameterCount; i++) {
            acp parameter = annotatedWithParams.getParameter(i);
            bVarArr[i] = new b(parameter, beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i], annotationIntrospector.findInjectableValue(parameter));
        }
        return new zo(annotationIntrospector, annotatedWithParams, bVarArr, parameterCount);
    }

    public AnnotatedWithParams a() {
        return this.f54377b;
    }

    public int e() {
        return this.f54376a;
    }

    public JacksonInject.b a(int i) {
        return this.f54378c[i].f54380c;
    }

    public acp b(int i) {
        return this.f54378c[i].e;
    }

    public BeanPropertyDefinition i(int i) {
        return this.f54378c[i].f54379b;
    }

    public ys d(int i) {
        BeanPropertyDefinition beanPropertyDefinition = this.f54378c[i].f54379b;
        if (beanPropertyDefinition != null) {
            return beanPropertyDefinition.getFullName();
        }
        return null;
    }

    public ys e(int i) {
        BeanPropertyDefinition beanPropertyDefinition = this.f54378c[i].f54379b;
        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
            return null;
        }
        return beanPropertyDefinition.getFullName();
    }

    public ys c(int i) {
        String strFindImplicitPropertyName = this.e.findImplicitPropertyName(this.f54378c[i].e);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return ys.c(strFindImplicitPropertyName);
    }

    public int b() {
        int i = -1;
        for (int i2 = 0; i2 < this.f54376a; i2++) {
            if (this.f54378c[i2].f54380c == null) {
                if (i >= 0) {
                    return -1;
                }
                i = i2;
            }
        }
        return i;
    }

    public String toString() {
        return this.f54377b.toString();
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BeanPropertyDefinition f54379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JacksonInject.b f54380c;
        public final acp e;

        public b(acp acpVar, BeanPropertyDefinition beanPropertyDefinition, JacksonInject.b bVar) {
            this.e = acpVar;
            this.f54379b = beanPropertyDefinition;
            this.f54380c = bVar;
        }
    }
}
