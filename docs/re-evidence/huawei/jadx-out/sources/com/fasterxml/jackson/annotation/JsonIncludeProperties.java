package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonIncludeProperties {
    String[] value() default {};

    /* JADX INFO: loaded from: classes21.dex */
    public static class b implements JacksonAnnotationValue<JsonIncludeProperties>, Serializable {
        protected static final b d = new b(null);
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Set<String> f4065a;

        protected b(Set<String> set) {
            this.f4065a = set;
        }

        public static b b(JsonIncludeProperties jsonIncludeProperties) {
            if (jsonIncludeProperties == null) {
                return d;
            }
            return new b(a(jsonIncludeProperties.value()));
        }

        public static b d() {
            return d;
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonIncludeProperties> valueFor() {
            return JsonIncludeProperties.class;
        }

        public Set<String> b() {
            return this.f4065a;
        }

        public b a(b bVar) {
            Set<String> setB;
            if (bVar == null || (setB = bVar.b()) == null) {
                return this;
            }
            if (this.f4065a == null) {
                return bVar;
            }
            HashSet hashSet = new HashSet();
            for (String str : setB) {
                if (this.f4065a.contains(str)) {
                    hashSet.add(str);
                }
            }
            return new b(hashSet);
        }

        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this.f4065a);
        }

        public int hashCode() {
            Set<String> set = this.f4065a;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && c(this.f4065a, ((b) obj).f4065a);
        }

        private static boolean c(Set<String> set, Set<String> set2) {
            if (set == null) {
                return set2 == null;
            }
            return set.equals(set2);
        }

        private static Set<String> a(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.EMPTY_SET;
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }
    }
}
