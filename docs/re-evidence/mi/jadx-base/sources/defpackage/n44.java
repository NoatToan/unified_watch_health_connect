package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
public class n44 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd1[] f27526b = new hd1[0];
    public static final Annotation[] c = new Annotation[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f27527a;

    public n44(AnnotationIntrospector annotationIntrospector) {
        this.f27527a = annotationIntrospector;
    }

    public static hd1 a() {
        return new hd1();
    }

    public static hd1[] b(int i) {
        if (i == 0) {
            return f27526b;
        }
        hd1[] hd1VarArr = new hd1[i];
        for (int i2 = 0; i2 < i; i2++) {
            hd1VarArr[i2] = a();
        }
        return hd1VarArr;
    }

    public static final boolean c(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    public final AnnotationCollector d(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.a(annotation);
            if (this.f27527a.isAnnotationBundle(annotation)) {
                annotationCollector = h(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector e(Annotation[] annotationArr) {
        AnnotationCollector annotationCollectorE = AnnotationCollector.e();
        for (Annotation annotation : annotationArr) {
            annotationCollectorE = annotationCollectorE.a(annotation);
            if (this.f27527a.isAnnotationBundle(annotation)) {
                annotationCollectorE = h(annotationCollectorE, annotation);
            }
        }
        return annotationCollectorE;
    }

    public final AnnotationCollector f(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.f(annotation)) {
                annotationCollector = annotationCollector.a(annotation);
                if (this.f27527a.isAnnotationBundle(annotation)) {
                    annotationCollector = g(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector g(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : h04.o(annotation.annotationType())) {
            if (!c(annotation2) && !annotationCollector.f(annotation2)) {
                annotationCollector = annotationCollector.a(annotation2);
                if (this.f27527a.isAnnotationBundle(annotation2)) {
                    annotationCollector = h(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector h(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : h04.o(annotation.annotationType())) {
            if (!c(annotation2)) {
                if (!this.f27527a.isAnnotationBundle(annotation2)) {
                    annotationCollector = annotationCollector.a(annotation2);
                } else if (!annotationCollector.f(annotation2)) {
                    annotationCollector = h(annotationCollector.a(annotation2), annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
