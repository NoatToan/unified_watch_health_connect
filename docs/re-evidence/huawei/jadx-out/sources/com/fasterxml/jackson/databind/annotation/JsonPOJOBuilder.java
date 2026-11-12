package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonPOJOBuilder {
    public static final String DEFAULT_BUILD_METHOD = "build";
    public static final String DEFAULT_WITH_PREFIX = "with";

    String buildMethodName() default "build";

    String withPrefix() default "with";

    /* JADX INFO: loaded from: classes21.dex */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4098a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f4099c;

        public e(JsonPOJOBuilder jsonPOJOBuilder) {
            this(jsonPOJOBuilder.buildMethodName(), jsonPOJOBuilder.withPrefix());
        }

        public e(String str, String str2) {
            this.f4098a = str;
            this.f4099c = str2;
        }
    }
}
