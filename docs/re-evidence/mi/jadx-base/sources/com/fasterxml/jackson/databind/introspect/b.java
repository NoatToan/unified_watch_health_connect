package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import defpackage.h04;
import defpackage.ld1;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static final ld1 h = AnnotationCollector.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MapperConfig<?> f7683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnnotationIntrospector f7684b;
    public final f.a c;
    public final TypeBindings d;
    public final JavaType e;
    public final Class<?> f;
    public final Class<?> g;

    public b(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar) {
        this.f7683a = mapperConfig;
        this.e = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this.f = rawClass;
        this.c = aVar;
        this.d = javaType.getBindings();
        this.f7684b = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.g = mapperConfig.findMixInClassFor(rawClass);
    }

    public static a d(MapperConfig<?> mapperConfig, Class<?> cls) {
        return new a(cls);
    }

    public static a e(Class<?> cls) {
        return new a(cls);
    }

    public static a f(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar) {
        return (javaType.isArrayType() && m(mapperConfig, javaType.getRawClass())) ? d(mapperConfig, javaType.getRawClass()) : new b(mapperConfig, javaType, aVar).h();
    }

    public static a j(MapperConfig<?> mapperConfig, JavaType javaType, f.a aVar) {
        return (javaType.isArrayType() && m(mapperConfig, javaType.getRawClass())) ? d(mapperConfig, javaType.getRawClass()) : new b(mapperConfig, javaType, aVar).i();
    }

    public static a k(MapperConfig<?> mapperConfig, Class<?> cls) {
        return l(mapperConfig, cls, mapperConfig);
    }

    public static a l(MapperConfig<?> mapperConfig, Class<?> cls, f.a aVar) {
        return (cls.isArray() && m(mapperConfig, cls)) ? d(mapperConfig, cls) : new b(mapperConfig, cls, aVar).i();
    }

    public static boolean m(MapperConfig<?> mapperConfig, Class<?> cls) {
        return mapperConfig == null || mapperConfig.findMixInClassFor(cls) == null;
    }

    public final AnnotationCollector a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.f(annotation)) {
                    annotationCollector = annotationCollector.a(annotation);
                    if (this.f7684b.isAnnotationBundle(annotation)) {
                        annotationCollector = c(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector b(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = a(annotationCollector, h04.o(cls2));
            Iterator<Class<?>> it = h04.w(cls2, cls, false).iterator();
            while (it.hasNext()) {
                annotationCollector = a(annotationCollector, h04.o(it.next()));
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector c(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : h04.o(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.f(annotation2)) {
                annotationCollector = annotationCollector.a(annotation2);
                if (this.f7684b.isAnnotationBundle(annotation2)) {
                    annotationCollector = c(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final ld1 g(List<JavaType> list) {
        if (this.f7684b == null) {
            return h;
        }
        AnnotationCollector annotationCollectorE = AnnotationCollector.e();
        Class<?> cls = this.g;
        if (cls != null) {
            annotationCollectorE = b(annotationCollectorE, this.f, cls);
        }
        AnnotationCollector annotationCollectorA = a(annotationCollectorE, h04.o(this.f));
        for (JavaType javaType : list) {
            if (this.c != null) {
                Class<?> rawClass = javaType.getRawClass();
                annotationCollectorA = b(annotationCollectorA, rawClass, this.c.findMixInClassFor(rawClass));
            }
            annotationCollectorA = a(annotationCollectorA, h04.o(javaType.getRawClass()));
        }
        f.a aVar = this.c;
        if (aVar != null) {
            annotationCollectorA = b(annotationCollectorA, Object.class, aVar.findMixInClassFor(Object.class));
        }
        return annotationCollectorA.c();
    }

    public a h() {
        List<JavaType> listX = h04.x(this.e, null, false);
        return new a(this.e, this.f, listX, this.g, g(listX), this.d, this.f7684b, this.c, this.f7683a.getTypeFactory());
    }

    public a i() {
        List<JavaType> listEmptyList = Collections.emptyList();
        Class<?> cls = this.f;
        Class<?> cls2 = this.g;
        ld1 ld1VarG = g(listEmptyList);
        TypeBindings typeBindings = this.d;
        AnnotationIntrospector annotationIntrospector = this.f7684b;
        MapperConfig<?> mapperConfig = this.f7683a;
        return new a(null, cls, listEmptyList, cls2, ld1VarG, typeBindings, annotationIntrospector, mapperConfig, mapperConfig.getTypeFactory());
    }

    public b(MapperConfig<?> mapperConfig, Class<?> cls, f.a aVar) {
        this.f7683a = mapperConfig;
        this.e = null;
        this.f = cls;
        this.c = aVar;
        this.d = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this.f7684b = null;
            this.g = null;
        } else {
            this.f7684b = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            this.g = mapperConfig.findMixInClassFor(cls);
        }
    }
}
