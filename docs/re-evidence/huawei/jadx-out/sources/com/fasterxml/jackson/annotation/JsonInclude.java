package com.fasterxml.jackson.annotation;

import com.huawei.hms.network.embedded.g4;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonInclude {

    /* JADX INFO: loaded from: classes21.dex */
    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    Include content() default Include.ALWAYS;

    Class<?> contentFilter() default Void.class;

    Include value() default Include.ALWAYS;

    Class<?> valueFilter() default Void.class;

    /* JADX INFO: loaded from: classes21.dex */
    public static class b implements JacksonAnnotationValue<JsonInclude>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected static final b f4062b = new b(Include.USE_DEFAULTS, Include.USE_DEFAULTS, null, null);
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Include f4063a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Include f4064c;
        protected final Class<?> d;
        protected final Class<?> e;

        protected b(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            this.f4063a = include == null ? Include.USE_DEFAULTS : include;
            this.f4064c = include2 == null ? Include.USE_DEFAULTS : include2;
            this.e = cls == Void.class ? null : cls;
            this.d = cls2 == Void.class ? null : cls2;
        }

        public static b e() {
            return f4062b;
        }

        public static b c(b bVar, b bVar2) {
            return bVar == null ? bVar2 : bVar.b(bVar2);
        }

        public static b a(b... bVarArr) {
            b bVar = null;
            for (b bVarB : bVarArr) {
                if (bVarB != null) {
                    if (bVar != null) {
                        bVarB = bVar.b(bVarB);
                    }
                    bVar = bVarB;
                }
            }
            return bVar;
        }

        protected Object readResolve() {
            return (this.f4063a == Include.USE_DEFAULTS && this.f4064c == Include.USE_DEFAULTS && this.e == null && this.d == null) ? f4062b : this;
        }

        public b b(b bVar) {
            if (bVar != null && bVar != f4062b) {
                Include include = bVar.f4063a;
                Include include2 = bVar.f4064c;
                Class<?> cls = bVar.e;
                Class<?> cls2 = bVar.d;
                boolean z = (include == this.f4063a || include == Include.USE_DEFAULTS) ? false : true;
                boolean z2 = (include2 == this.f4064c || include2 == Include.USE_DEFAULTS) ? false : true;
                Class<?> cls3 = this.e;
                boolean z3 = (cls == cls3 && cls2 == cls3) ? false : true;
                if (z) {
                    if (z2) {
                        return new b(include, include2, cls, cls2);
                    }
                    return new b(include, this.f4064c, cls, cls2);
                }
                if (z2) {
                    return new b(this.f4063a, include2, cls, cls2);
                }
                if (z3) {
                    return new b(this.f4063a, this.f4064c, cls, cls2);
                }
            }
            return this;
        }

        public static b a(Include include, Include include2) {
            if ((include == Include.USE_DEFAULTS || include == null) && (include2 == Include.USE_DEFAULTS || include2 == null)) {
                return f4062b;
            }
            return new b(include, include2, null, null);
        }

        public static b b(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            if (cls == Void.class) {
                cls = null;
            }
            if (cls2 == Void.class) {
                cls2 = null;
            }
            if ((include == Include.USE_DEFAULTS || include == null) && ((include2 == Include.USE_DEFAULTS || include2 == null) && cls == null && cls2 == null)) {
                return f4062b;
            }
            return new b(include, include2, cls, cls2);
        }

        public static b c(JsonInclude jsonInclude) {
            if (jsonInclude == null) {
                return f4062b;
            }
            Include includeValue = jsonInclude.value();
            Include includeContent = jsonInclude.content();
            if (includeValue == Include.USE_DEFAULTS && includeContent == Include.USE_DEFAULTS) {
                return f4062b;
            }
            Class<?> clsValueFilter = jsonInclude.valueFilter();
            if (clsValueFilter == Void.class) {
                clsValueFilter = null;
            }
            Class<?> clsContentFilter = jsonInclude.contentFilter();
            return new b(includeValue, includeContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
        }

        public b c(Include include) {
            return include == this.f4063a ? this : new b(include, this.f4064c, this.e, this.d);
        }

        public b c(Class<?> cls) {
            Include include;
            if (cls == null || cls == Void.class) {
                include = Include.USE_DEFAULTS;
                cls = null;
            } else {
                include = Include.CUSTOM;
            }
            return b(this.f4063a, include, this.e, cls);
        }

        public b d(Include include) {
            return include == this.f4064c ? this : new b(this.f4063a, include, this.e, this.d);
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonInclude> valueFor() {
            return JsonInclude.class;
        }

        public Include b() {
            return this.f4063a;
        }

        public Include d() {
            return this.f4064c;
        }

        public Class<?> c() {
            return this.e;
        }

        public Class<?> a() {
            return this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(80);
            sb.append("JsonInclude.Value(value=");
            sb.append(this.f4063a);
            sb.append(",content=");
            sb.append(this.f4064c);
            if (this.e != null) {
                sb.append(",valueFilter=");
                sb.append(this.e.getName());
                sb.append(".class");
            }
            if (this.d != null) {
                sb.append(",contentFilter=");
                sb.append(this.d.getName());
                sb.append(".class");
            }
            sb.append(g4.l);
            return sb.toString();
        }

        public int hashCode() {
            return (this.f4063a.hashCode() << 2) + this.f4064c.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f4063a == this.f4063a && bVar.f4064c == this.f4064c && bVar.e == this.e && bVar.d == this.d;
        }
    }
}
