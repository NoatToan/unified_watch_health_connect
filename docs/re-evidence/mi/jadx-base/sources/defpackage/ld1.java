package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public interface ld1 {
    <A extends Annotation> A get(Class<A> cls);

    boolean has(Class<?> cls);

    boolean hasOneOf(Class<? extends Annotation>[] clsArr);

    int size();
}
