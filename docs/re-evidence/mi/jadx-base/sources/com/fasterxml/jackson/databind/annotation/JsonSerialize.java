package com.fasterxml.jackson.databind.annotation;

import defpackage.ak4;
import defpackage.eud;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialize {

    @Deprecated
    public enum Inclusion {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    public enum Typing {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    Class<?> as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends ak4> contentConverter() default ak4.a.class;

    Class<? extends eud> contentUsing() default eud.a.class;

    Class<? extends ak4> converter() default ak4.a.class;

    @Deprecated
    Inclusion include() default Inclusion.DEFAULT_INCLUSION;

    Class<?> keyAs() default Void.class;

    Class<? extends eud> keyUsing() default eud.a.class;

    Class<? extends eud> nullsUsing() default eud.a.class;

    Typing typing() default Typing.DEFAULT_TYPING;

    Class<? extends eud> using() default eud.a.class;
}
