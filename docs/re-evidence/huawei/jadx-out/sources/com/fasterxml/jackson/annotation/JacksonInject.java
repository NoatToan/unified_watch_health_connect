package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JacksonInject {
    OptBoolean useInput() default OptBoolean.DEFAULT;

    String value() default "";

    /* JADX INFO: loaded from: classes21.dex */
    public static class b implements JacksonAnnotationValue<JacksonInject>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected static final b f4047b = new b(null, null);
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Object f4048a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Boolean f4049c;

        private static boolean d(Object obj, Boolean bool) {
            return obj == null && bool == null;
        }

        protected b(Object obj, Boolean bool) {
            this.f4048a = obj;
            this.f4049c = bool;
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JacksonInject> valueFor() {
            return JacksonInject.class;
        }

        public static b c(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            if (d(obj, bool)) {
                return f4047b;
            }
            return new b(obj, bool);
        }

        public static b b(JacksonInject jacksonInject) {
            if (jacksonInject == null) {
                return f4047b;
            }
            return c(jacksonInject.value(), jacksonInject.useInput().asBoolean());
        }

        public static b d(Object obj) {
            return c(obj, null);
        }

        public b c(Object obj) {
            return (obj != null ? !obj.equals(this.f4048a) : this.f4048a != null) ? new b(obj, this.f4049c) : this;
        }

        public b e(Boolean bool) {
            return (bool != null ? !bool.equals(this.f4049c) : this.f4049c != null) ? new b(this.f4048a, bool) : this;
        }

        public Object c() {
            return this.f4048a;
        }

        public Boolean e() {
            return this.f4049c;
        }

        public boolean d() {
            return this.f4048a != null;
        }

        public boolean e(boolean z) {
            Boolean bool = this.f4049c;
            return bool == null ? z : bool.booleanValue();
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.f4048a, this.f4049c);
        }

        public int hashCode() {
            Object obj = this.f4048a;
            int iHashCode = obj != null ? 1 + obj.hashCode() : 1;
            Boolean bool = this.f4049c;
            return bool != null ? iHashCode + bool.hashCode() : iHashCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                b bVar = (b) obj;
                if (OptBoolean.equals(this.f4049c, bVar.f4049c)) {
                    Object obj2 = this.f4048a;
                    if (obj2 == null) {
                        return bVar.f4048a == null;
                    }
                    return obj2.equals(bVar.f4048a);
                }
            }
            return false;
        }
    }
}
