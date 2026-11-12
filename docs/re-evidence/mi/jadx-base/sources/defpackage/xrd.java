package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface xrd {

    public @interface a {
        JsonInclude.Include include() default JsonInclude.Include.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    public @interface b {
        JsonInclude.Include include() default JsonInclude.Include.NON_NULL;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class<?> type() default Object.class;

        Class<? extends VirtualBeanPropertyWriter> value();
    }

    a[] attrs() default {};

    boolean prepend() default false;

    b[] props() default {};
}
