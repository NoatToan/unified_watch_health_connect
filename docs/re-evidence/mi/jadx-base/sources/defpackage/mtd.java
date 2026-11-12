package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface mtd {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f27182b;

        public a(mtd mtdVar) {
            this(mtdVar.buildMethodName(), mtdVar.withPrefix());
        }

        public a(String str, String str2) {
            this.f27181a = str;
            this.f27182b = str2;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
