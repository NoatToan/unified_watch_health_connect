package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes21.dex */
class acu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final act[] f272b = new act[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Annotation[] f273c = new Annotation[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AnnotationIntrospector f274a;

    protected acu(AnnotationIntrospector annotationIntrospector) {
        this.f274a = annotationIntrospector;
    }

    protected final AnnotationCollector e(Annotation[] annotationArr) {
        AnnotationCollector annotationCollectorEmptyCollector = AnnotationCollector.emptyCollector();
        for (Annotation annotation : annotationArr) {
            annotationCollectorEmptyCollector = annotationCollectorEmptyCollector.addOrOverride(annotation);
            if (this.f274a.isAnnotationBundle(annotation)) {
                annotationCollectorEmptyCollector = a(annotationCollectorEmptyCollector, annotation);
            }
        }
        return annotationCollectorEmptyCollector;
    }

    protected final AnnotationCollector a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.addOrOverride(annotation);
            if (this.f274a.isAnnotationBundle(annotation)) {
                annotationCollector = a(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    protected final AnnotationCollector a(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ahw.a((Class<?>) annotation.annotationType())) {
            if (!a(annotation2)) {
                if (this.f274a.isAnnotationBundle(annotation2)) {
                    if (!annotationCollector.isPresent(annotation2)) {
                        annotationCollector = a(annotationCollector.addOrOverride(annotation2), annotation2);
                    }
                } else {
                    annotationCollector = annotationCollector.addOrOverride(annotation2);
                }
            }
        }
        return annotationCollector;
    }

    protected final AnnotationCollector b(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.isPresent(annotation)) {
                annotationCollector = annotationCollector.addOrOverride(annotation);
                if (this.f274a.isAnnotationBundle(annotation)) {
                    annotationCollector = e(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    protected final AnnotationCollector e(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ahw.a((Class<?>) annotation.annotationType())) {
            if (!a(annotation2) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this.f274a.isAnnotationBundle(annotation2)) {
                    annotationCollector = a(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    protected static final boolean a(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    static act e() {
        return new act();
    }

    static act[] c(int i) {
        if (i == 0) {
            return f272b;
        }
        act[] actVarArr = new act[i];
        for (int i2 = 0; i2 < i; i2++) {
            actVarArr[i2] = e();
        }
        return actVarArr;
    }
}
