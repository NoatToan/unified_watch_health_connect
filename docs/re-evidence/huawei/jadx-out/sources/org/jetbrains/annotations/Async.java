package org.jetbrains.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes46.dex */
public final class Async {

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface Execute {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface Schedule {
    }
}
