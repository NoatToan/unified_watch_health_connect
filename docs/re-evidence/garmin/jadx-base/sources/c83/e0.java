package c83;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f25772c = new e0();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return d0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof d0;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + d0.class.getName() + "()";
    }
}
