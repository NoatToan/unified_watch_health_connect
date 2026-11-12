package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class acg {
    private final boolean f;
    private final ahn g;
    private final Class<?> h;
    private final MapperConfig<?> i;
    private final AnnotationIntrospector j;
    private final JavaType k;
    private final Class<?> n;
    private final ClassIntrospector.MixInResolver o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Annotations f245c = AnnotationCollector.emptyAnnotations();
    private static final Class<?> e = Object.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f243a = Enum.class;
    private static final Class<?> d = List.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f244b = Map.class;

    acg(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        this.i = mapperConfig;
        this.k = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this.h = rawClass;
        this.o = mixInResolver;
        this.g = javaType.getBindings();
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.j = annotationIntrospector;
        this.n = mixInResolver != null ? mixInResolver.findMixInClassFor(rawClass) : null;
        this.f = (annotationIntrospector == null || (ahw.n(rawClass) && javaType.isContainerType())) ? false : true;
    }

    acg(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        this.i = mapperConfig;
        this.k = null;
        this.h = cls;
        this.o = mixInResolver;
        this.g = ahn.e();
        if (mapperConfig == null) {
            this.j = null;
            this.n = null;
        } else {
            this.j = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            this.n = mixInResolver != null ? mixInResolver.findMixInClassFor(cls) : null;
        }
        this.f = this.j != null;
    }

    public static ack d(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType() && a(mapperConfig, javaType.getRawClass())) {
            return d(mapperConfig, javaType.getRawClass());
        }
        return new acg(mapperConfig, javaType, mixInResolver).b();
    }

    public static ack b(MapperConfig<?> mapperConfig, Class<?> cls) {
        return e(mapperConfig, cls, mapperConfig);
    }

    public static ack c(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType() && a(mapperConfig, javaType.getRawClass())) {
            return d(mapperConfig, javaType.getRawClass());
        }
        return new acg(mapperConfig, javaType, mixInResolver).c();
    }

    public static ack e(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        if (cls.isArray() && a(mapperConfig, cls)) {
            return d(mapperConfig, cls);
        }
        return new acg(mapperConfig, cls, mixInResolver).c();
    }

    private static boolean a(MapperConfig<?> mapperConfig, Class<?> cls) {
        return mapperConfig == null || mapperConfig.findMixInClassFor(cls) == null;
    }

    static ack c(Class<?> cls) {
        return new ack(cls);
    }

    static ack d(MapperConfig<?> mapperConfig, Class<?> cls) {
        return new ack(cls);
    }

    ack b() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.k.hasRawClass(Object.class)) {
            if (this.k.isInterface()) {
                e(this.k, (List<JavaType>) arrayList, false);
            } else {
                b(this.k, arrayList, false);
            }
        }
        return new ack(this.k, this.h, arrayList, this.n, d(arrayList), this.g, this.j, this.o, this.i.getTypeFactory(), this.f);
    }

    ack c() {
        List<JavaType> list = Collections.EMPTY_LIST;
        return new ack(null, this.h, list, this.n, d(list), this.g, this.j, this.o, this.i.getTypeFactory(), this.f);
    }

    private static void b(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == e || rawClass == f243a) {
            return;
        }
        if (z) {
            if (e(list, rawClass)) {
                return;
            } else {
                list.add(javaType);
            }
        }
        Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            e(it.next(), list, true);
        }
        JavaType superClass = javaType.getSuperClass();
        if (superClass != null) {
            b(superClass, list, true);
        }
    }

    private static void e(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> rawClass = javaType.getRawClass();
        if (z) {
            if (e(list, rawClass)) {
                return;
            }
            list.add(javaType);
            if (rawClass == d || rawClass == f244b) {
                return;
            }
        }
        Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            e(it.next(), list, true);
        }
    }

    private static boolean e(List<JavaType> list, Class<?> cls) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getRawClass() == cls) {
                return true;
            }
        }
        return false;
    }

    private Annotations d(List<JavaType> list) {
        if (this.j == null) {
            return f245c;
        }
        ClassIntrospector.MixInResolver mixInResolver = this.o;
        boolean z = mixInResolver != null && (!(mixInResolver instanceof ada) || ((ada) mixInResolver).e());
        if (!z && !this.f) {
            return f245c;
        }
        AnnotationCollector annotationCollectorEmptyCollector = AnnotationCollector.emptyCollector();
        Class<?> cls = this.n;
        if (cls != null) {
            annotationCollectorEmptyCollector = d(annotationCollectorEmptyCollector, this.h, cls);
        }
        if (this.f) {
            annotationCollectorEmptyCollector = e(annotationCollectorEmptyCollector, ahw.a(this.h));
        }
        for (JavaType javaType : list) {
            if (z) {
                Class<?> rawClass = javaType.getRawClass();
                annotationCollectorEmptyCollector = d(annotationCollectorEmptyCollector, rawClass, this.o.findMixInClassFor(rawClass));
            }
            if (this.f) {
                annotationCollectorEmptyCollector = e(annotationCollectorEmptyCollector, ahw.a(javaType.getRawClass()));
            }
        }
        if (z) {
            annotationCollectorEmptyCollector = d(annotationCollectorEmptyCollector, Object.class, this.o.findMixInClassFor(Object.class));
        }
        return annotationCollectorEmptyCollector.asAnnotations();
    }

    private AnnotationCollector d(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = e(annotationCollector, ahw.a(cls2));
            Iterator<Class<?>> it = ahw.b(cls2, cls, false).iterator();
            while (it.hasNext()) {
                annotationCollector = e(annotationCollector, ahw.a(it.next()));
            }
        }
        return annotationCollector;
    }

    private AnnotationCollector e(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.isPresent(annotation)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation);
                    if (this.j.isAnnotationBundle(annotation)) {
                        annotationCollector = e(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    private AnnotationCollector e(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ahw.a((Class<?>) annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this.j.isAnnotationBundle(annotation2)) {
                    annotationCollector = e(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
