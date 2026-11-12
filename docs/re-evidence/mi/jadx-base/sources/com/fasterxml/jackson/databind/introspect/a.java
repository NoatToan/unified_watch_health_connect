package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.fd1;
import defpackage.gd1;
import defpackage.h04;
import defpackage.hd1;
import defpackage.ld1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends fd1 implements g {
    public static final C0179a n = new C0179a(null, Collections.emptyList(), Collections.emptyList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f7678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f7679b;
    public final TypeBindings c;
    public final List<JavaType> d;
    public final AnnotationIntrospector e;
    public final TypeFactory f;
    public final f.a g;
    public final Class<?> h;
    public final ld1 i;
    public C0179a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public gd1 f7680k;
    public List<AnnotatedField> l;
    public transient Boolean m;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.a$a, reason: collision with other inner class name */
    public static final class C0179a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnnotatedConstructor f7681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<AnnotatedConstructor> f7682b;
        public final List<AnnotatedMethod> c;

        public C0179a(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.f7681a = annotatedConstructor;
            this.f7682b = list;
            this.c = list2;
        }
    }

    public a(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, ld1 ld1Var, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, f.a aVar, TypeFactory typeFactory) {
        this.f7678a = javaType;
        this.f7679b = cls;
        this.d = list;
        this.h = cls2;
        this.i = ld1Var;
        this.c = typeBindings;
        this.e = annotationIntrospector;
        this.g = aVar;
        this.f = typeFactory;
    }

    @Override // com.fasterxml.jackson.databind.introspect.g
    public JavaType a(Type type) {
        return this.f.constructType(type, this.c);
    }

    @Override // defpackage.fd1
    @Deprecated
    public Iterable<Annotation> annotations() {
        ld1 ld1Var = this.i;
        if (ld1Var instanceof hd1) {
            return ((hd1) ld1Var).c();
        }
        if ((ld1Var instanceof AnnotationCollector.OneAnnotation) || (ld1Var instanceof AnnotationCollector.TwoAnnotations)) {
            throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.emptyList();
    }

    public final C0179a b() {
        C0179a c0179aO = this.j;
        if (c0179aO == null) {
            JavaType javaType = this.f7678a;
            c0179aO = javaType == null ? n : c.o(this.e, this, javaType, this.h);
            this.j = c0179aO;
        }
        return c0179aO;
    }

    public final List<AnnotatedField> c() {
        List<AnnotatedField> listEmptyList = this.l;
        if (listEmptyList == null) {
            JavaType javaType = this.f7678a;
            listEmptyList = javaType == null ? Collections.emptyList() : d.m(this.e, this, this.g, this.f, javaType);
            this.l = listEmptyList;
        }
        return listEmptyList;
    }

    public final gd1 d() {
        gd1 gd1Var = this.f7680k;
        if (gd1Var == null) {
            JavaType javaType = this.f7678a;
            gd1Var = javaType == null ? new gd1() : e.m(this.e, this, this.g, this.f, javaType, this.d, this.h);
            this.f7680k = gd1Var;
        }
        return gd1Var;
    }

    public Iterable<AnnotatedField> e() {
        return c();
    }

    @Override // defpackage.fd1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return h04.I(obj, a.class) && ((a) obj).f7679b == this.f7679b;
    }

    public AnnotatedMethod f(String str, Class<?>[] clsArr) {
        return d().e(str, clsArr);
    }

    @Override // defpackage.fd1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Class<?> getAnnotated() {
        return this.f7679b;
    }

    @Override // defpackage.fd1
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.i.get(cls);
    }

    @Override // defpackage.fd1
    public int getModifiers() {
        return this.f7679b.getModifiers();
    }

    @Override // defpackage.fd1
    public String getName() {
        return this.f7679b.getName();
    }

    @Override // defpackage.fd1
    public Class<?> getRawType() {
        return this.f7679b;
    }

    @Override // defpackage.fd1
    public JavaType getType() {
        return this.f7678a;
    }

    public ld1 h() {
        return this.i;
    }

    @Override // defpackage.fd1
    public boolean hasAnnotation(Class<?> cls) {
        return this.i.has(cls);
    }

    @Override // defpackage.fd1
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this.i.hasOneOf(clsArr);
    }

    @Override // defpackage.fd1
    public int hashCode() {
        return this.f7679b.getName().hashCode();
    }

    public List<AnnotatedConstructor> i() {
        return b().f7682b;
    }

    public AnnotatedConstructor j() {
        return b().f7681a;
    }

    public List<AnnotatedMethod> k() {
        return b().c;
    }

    public boolean m() {
        return this.i.size() > 0;
    }

    public boolean n() {
        Boolean boolValueOf = this.m;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(h04.P(this.f7679b));
            this.m = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public Iterable<AnnotatedMethod> o() {
        return d();
    }

    @Override // defpackage.fd1
    public String toString() {
        return "[AnnotedClass " + this.f7679b.getName() + "]";
    }

    public a(Class<?> cls) {
        this.f7678a = null;
        this.f7679b = cls;
        this.d = Collections.emptyList();
        this.h = null;
        this.i = AnnotationCollector.d();
        this.c = TypeBindings.emptyBindings();
        this.e = null;
        this.g = null;
        this.f = null;
    }
}
