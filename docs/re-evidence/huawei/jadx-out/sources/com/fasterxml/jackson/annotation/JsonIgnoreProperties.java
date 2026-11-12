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
public @interface JsonIgnoreProperties {
    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};

    /* JADX INFO: loaded from: classes21.dex */
    public static class b implements JacksonAnnotationValue<JsonIgnoreProperties>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected static final b f4059c = new b(Collections.EMPTY_SET, false, false, false, true);
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final boolean f4060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final Set<String> f4061b;
        protected final boolean d;
        protected final boolean e;
        protected final boolean i;

        protected b(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (set == null) {
                this.f4061b = Collections.EMPTY_SET;
            } else {
                this.f4061b = set;
            }
            this.e = z;
            this.d = z2;
            this.f4060a = z3;
            this.i = z4;
        }

        public static b b(JsonIgnoreProperties jsonIgnoreProperties) {
            if (jsonIgnoreProperties == null) {
                return f4059c;
            }
            return c(d(jsonIgnoreProperties.value()), jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters(), false);
        }

        public static b c(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (e(set, z, z2, z3, z4)) {
                return f4059c;
            }
            return new b(set, z, z2, z3, z4);
        }

        public static b c() {
            return f4059c;
        }

        public static b c(b bVar, b bVar2) {
            return bVar == null ? bVar2 : bVar.c(bVar2);
        }

        public b c(b bVar) {
            if (bVar != null && bVar != f4059c) {
                if (!bVar.i) {
                    return bVar;
                }
                if (!b(this, bVar)) {
                    return c(a(this.f4061b, bVar.f4061b), this.e || bVar.e, this.d || bVar.d, this.f4060a || bVar.f4060a, true);
                }
            }
            return this;
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonIgnoreProperties> valueFor() {
            return JsonIgnoreProperties.class;
        }

        protected Object readResolve() {
            return e(this.f4061b, this.e, this.d, this.f4060a, this.i) ? f4059c : this;
        }

        public Set<String> e() {
            if (this.d) {
                return Collections.EMPTY_SET;
            }
            return this.f4061b;
        }

        public Set<String> b() {
            if (this.f4060a) {
                return Collections.EMPTY_SET;
            }
            return this.f4061b;
        }

        public boolean d() {
            return this.e;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.f4061b, Boolean.valueOf(this.e), Boolean.valueOf(this.d), Boolean.valueOf(this.f4060a), Boolean.valueOf(this.i));
        }

        public int hashCode() {
            int size = this.f4061b.size();
            int i = this.e ? 1 : -3;
            int i2 = this.d ? 3 : -7;
            return size + i + i2 + (this.f4060a ? 7 : -11) + (this.i ? 11 : -13);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && b(this, (b) obj);
        }

        private static boolean b(b bVar, b bVar2) {
            return bVar.e == bVar2.e && bVar.i == bVar2.i && bVar.d == bVar2.d && bVar.f4060a == bVar2.f4060a && bVar.f4061b.equals(bVar2.f4061b);
        }

        private static Set<String> d(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.EMPTY_SET;
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }

        private static Set<String> a(Set<String> set, Set<String> set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        private static boolean e(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            b bVar = f4059c;
            if (z == bVar.e && z2 == bVar.d && z3 == bVar.f4060a && z4 == bVar.i) {
                return set == null || set.size() == 0;
            }
            return false;
        }
    }
}
