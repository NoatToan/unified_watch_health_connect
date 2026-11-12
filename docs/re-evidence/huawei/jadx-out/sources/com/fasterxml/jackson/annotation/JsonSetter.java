package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSetter {
    Nulls contentNulls() default Nulls.DEFAULT;

    Nulls nulls() default Nulls.DEFAULT;

    String value() default "";

    /* JADX INFO: loaded from: classes21.dex */
    public static class e implements JacksonAnnotationValue<JsonSetter>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected static final e f4066a = new e(Nulls.DEFAULT, Nulls.DEFAULT);
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Nulls f4067b;
        private final Nulls e;

        protected e(Nulls nulls, Nulls nulls2) {
            this.e = nulls;
            this.f4067b = nulls2;
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonSetter> valueFor() {
            return JsonSetter.class;
        }

        protected Object readResolve() {
            return e(this.e, this.f4067b) ? f4066a : this;
        }

        public static e a(JsonSetter jsonSetter) {
            if (jsonSetter == null) {
                return f4066a;
            }
            return d(jsonSetter.nulls(), jsonSetter.contentNulls());
        }

        public static e d(Nulls nulls, Nulls nulls2) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            if (nulls2 == null) {
                nulls2 = Nulls.DEFAULT;
            }
            if (e(nulls, nulls2)) {
                return f4066a;
            }
            return new e(nulls, nulls2);
        }

        public static e c() {
            return f4066a;
        }

        public e b(e eVar) {
            if (eVar != null && eVar != f4066a) {
                Nulls nulls = eVar.e;
                Nulls nulls2 = eVar.f4067b;
                if (nulls == Nulls.DEFAULT) {
                    nulls = this.e;
                }
                if (nulls2 == Nulls.DEFAULT) {
                    nulls2 = this.f4067b;
                }
                if (nulls != this.e || nulls2 != this.f4067b) {
                    return d(nulls, nulls2);
                }
            }
            return this;
        }

        public Nulls d() {
            if (this.e == Nulls.DEFAULT) {
                return null;
            }
            return this.e;
        }

        public Nulls b() {
            if (this.f4067b == Nulls.DEFAULT) {
                return null;
            }
            return this.f4067b;
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this.e, this.f4067b);
        }

        public int hashCode() {
            return this.e.ordinal() + (this.f4067b.ordinal() << 2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                e eVar = (e) obj;
                if (eVar.e == this.e && eVar.f4067b == this.f4067b) {
                    return true;
                }
            }
            return false;
        }

        private static boolean e(Nulls nulls, Nulls nulls2) {
            return nulls == Nulls.DEFAULT && nulls2 == Nulls.DEFAULT;
        }
    }
}
