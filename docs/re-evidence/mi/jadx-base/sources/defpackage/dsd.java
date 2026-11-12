package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface dsd {
    Class<?> as() default Void.class;

    Class<?> builder() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends ak4> contentConverter() default ak4.a.class;

    Class<? extends esd> contentUsing() default esd.a.class;

    Class<? extends ak4> converter() default ak4.a.class;

    Class<?> keyAs() default Void.class;

    Class<? extends vzd> keyUsing() default vzd.a.class;

    Class<? extends esd> using() default esd.a.class;
}
