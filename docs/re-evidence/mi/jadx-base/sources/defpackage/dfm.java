package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class dfm implements cfm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cfm f15489b = new dfm();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (kmq.l(annotationArr, cfm.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f15489b;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return cfm.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof cfm;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return gv5.CONNECT_VALUE_STR + cfm.class.getName() + "()";
    }
}
