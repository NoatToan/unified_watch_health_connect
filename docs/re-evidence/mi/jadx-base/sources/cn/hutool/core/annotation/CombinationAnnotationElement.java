package cn.hutool.core.annotation;

import cn.hutool.core.collection.CollUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CombinationAnnotationElement implements AnnotatedElement, Serializable {
    private static final Set<Class<? extends Annotation>> META_ANNOTATIONS = CollUtil.q(Target.class, Retention.class, Inherited.class, Documented.class, SuppressWarnings.class, Override.class, Deprecated.class);
    private static final long serialVersionUID = 1;
    private Map<Class<? extends Annotation>, Annotation> annotationMap;
    private Map<Class<? extends Annotation>, Annotation> declaredAnnotationMap;

    public CombinationAnnotationElement(AnnotatedElement annotatedElement) {
        init(annotatedElement);
    }

    private void init(AnnotatedElement annotatedElement) {
        Annotation[] declaredAnnotations = annotatedElement.getDeclaredAnnotations();
        this.declaredAnnotationMap = new HashMap();
        parseDeclared(declaredAnnotations);
        Annotation[] annotations = annotatedElement.getAnnotations();
        if (Arrays.equals(declaredAnnotations, annotations)) {
            this.annotationMap = this.declaredAnnotationMap;
        } else {
            this.annotationMap = new HashMap();
            parse(annotations);
        }
    }

    private void parse(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            if (!META_ANNOTATIONS.contains(clsAnnotationType)) {
                this.annotationMap.put(clsAnnotationType, annotation);
                parse(clsAnnotationType.getAnnotations());
            }
        }
    }

    private void parseDeclared(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            if (!META_ANNOTATIONS.contains(clsAnnotationType)) {
                this.declaredAnnotationMap.put(clsAnnotationType, annotation);
                parseDeclared(clsAnnotationType.getDeclaredAnnotations());
            }
        }
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        T t = (T) this.annotationMap.get(cls);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return (Annotation[]) this.annotationMap.values().toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.declaredAnnotationMap.values().toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.annotationMap.containsKey(cls);
    }
}
