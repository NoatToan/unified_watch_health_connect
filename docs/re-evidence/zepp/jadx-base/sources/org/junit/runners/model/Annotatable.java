package org.junit.runners.model;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes23.dex */
public interface Annotatable {
    <T extends Annotation> T getAnnotation(Class<T> cls);

    Annotation[] getAnnotations();
}
