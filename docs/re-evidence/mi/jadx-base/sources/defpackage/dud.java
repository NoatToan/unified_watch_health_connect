package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: schemaItemDefinition */
/* JADX WARN: Method from annotation default annotation not found: schemaObjectPropertiesDefinition */
/* JADX WARN: Method from annotation default annotation not found: schemaType */
/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface dud {
    String id() default "";
}
