package defpackage;

import cn.hutool.core.annotation.CombinationAnnotationElement;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* JADX INFO: loaded from: classes.dex */
public class id1 {
    public static <A extends Annotation> A a(AnnotatedElement annotatedElement, Class<A> cls) {
        if (annotatedElement == null) {
            return null;
        }
        return (A) c(annotatedElement).getAnnotation(cls);
    }

    public static boolean b(AnnotatedElement annotatedElement, Class<? extends Annotation> cls) {
        return a(annotatedElement, cls) != null;
    }

    public static CombinationAnnotationElement c(AnnotatedElement annotatedElement) {
        return annotatedElement instanceof CombinationAnnotationElement ? (CombinationAnnotationElement) annotatedElement : new CombinationAnnotationElement(annotatedElement);
    }
}
