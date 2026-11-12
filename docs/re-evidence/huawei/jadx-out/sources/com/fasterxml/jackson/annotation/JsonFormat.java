package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {
    public static final String DEFAULT_LOCALE = "##default";
    public static final String DEFAULT_TIMEZONE = "##default";

    /* JADX INFO: loaded from: classes21.dex */
    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};

    /* JADX INFO: loaded from: classes21.dex */
    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        public boolean isStructured() {
            return this == OBJECT || this == ARRAY;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b f4054b = new b(0, 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f4055c;
        private final int d;

        private b(int i, int i2) {
            this.d = i;
            this.f4055c = i2;
        }

        public static b e() {
            return f4054b;
        }

        public static b b(JsonFormat jsonFormat) {
            return d(jsonFormat.with(), jsonFormat.without());
        }

        public static b d(Feature[] featureArr, Feature[] featureArr2) {
            int iOrdinal = 0;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            int iOrdinal2 = 0;
            for (Feature feature2 : featureArr2) {
                iOrdinal2 |= 1 << feature2.ordinal();
            }
            return new b(iOrdinal, iOrdinal2);
        }

        public b e(b bVar) {
            if (bVar != null) {
                int i = bVar.f4055c;
                int i2 = bVar.d;
                if (i != 0 || i2 != 0) {
                    int i3 = this.d;
                    if (i3 == 0 && this.f4055c == 0) {
                        return bVar;
                    }
                    int i4 = ((~i) & i3) | i2;
                    int i5 = this.f4055c;
                    int i6 = i | ((~i2) & i5);
                    if (i4 != i3 || i6 != i5) {
                        return new b(i4, i6);
                    }
                }
            }
            return this;
        }

        public Boolean d(Feature feature) {
            int iOrdinal = 1 << feature.ordinal();
            if ((this.f4055c & iOrdinal) != 0) {
                return Boolean.FALSE;
            }
            if ((iOrdinal & this.d) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public String toString() {
            if (this == f4054b) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.d), Integer.valueOf(this.f4055c));
        }

        public int hashCode() {
            return this.f4055c + this.d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.d == this.d && bVar.f4055c == this.f4055c;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class c implements JacksonAnnotationValue<JsonFormat>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f4056c = new c();
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Boolean f4057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f4058b;
        private final Locale d;
        private final String e;
        private transient TimeZone g;
        private final Shape i;
        private final String j;

        public c() {
            this("", Shape.ANY, "", "", b.e(), null);
        }

        public c(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), b.b(jsonFormat), jsonFormat.lenient().asBoolean());
        }

        public c(String str, Shape shape, String str2, String str3, b bVar, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, bVar, bool);
        }

        public c(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, b bVar, Boolean bool) {
            this.e = str == null ? "" : str;
            this.i = shape == null ? Shape.ANY : shape;
            this.d = locale;
            this.g = timeZone;
            this.j = str2;
            this.f4058b = bVar == null ? b.e() : bVar;
            this.f4057a = bool;
        }

        public static final c e() {
            return f4056c;
        }

        public static c d(c cVar, c cVar2) {
            return cVar == null ? cVar2 : cVar.a(cVar2);
        }

        public static final c b(JsonFormat jsonFormat) {
            return jsonFormat == null ? f4056c : new c(jsonFormat);
        }

        public final c a(c cVar) {
            c cVar2;
            b bVarE;
            String str;
            TimeZone timeZone;
            if (cVar == null || cVar == (cVar2 = f4056c) || cVar == this) {
                return this;
            }
            if (this == cVar2) {
                return cVar;
            }
            String str2 = cVar.e;
            if (str2 == null || str2.isEmpty()) {
                str2 = this.e;
            }
            String str3 = str2;
            Shape shape = cVar.i;
            if (shape == Shape.ANY) {
                shape = this.i;
            }
            Shape shape2 = shape;
            Locale locale = cVar.d;
            if (locale == null) {
                locale = this.d;
            }
            Locale locale2 = locale;
            b bVar = this.f4058b;
            if (bVar == null) {
                bVarE = cVar.f4058b;
            } else {
                bVarE = bVar.e(cVar.f4058b);
            }
            b bVar2 = bVarE;
            Boolean bool = cVar.f4057a;
            if (bool == null) {
                bool = this.f4057a;
            }
            Boolean bool2 = bool;
            String str4 = cVar.j;
            if (str4 == null || str4.isEmpty()) {
                str = this.j;
                timeZone = this.g;
            } else {
                timeZone = cVar.g;
                str = str4;
            }
            return new c(str3, shape2, locale2, str, timeZone, bVar2, bool2);
        }

        public static c b(boolean z) {
            return new c("", null, null, null, null, b.e(), Boolean.valueOf(z));
        }

        public c c(Boolean bool) {
            return bool == this.f4057a ? this : new c(this.e, this.i, this.d, this.j, this.g, this.f4058b, bool);
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonFormat> valueFor() {
            return JsonFormat.class;
        }

        public String c() {
            return this.e;
        }

        public Shape b() {
            return this.i;
        }

        public Locale a() {
            return this.d;
        }

        public Boolean d() {
            return this.f4057a;
        }

        public TimeZone f() {
            TimeZone timeZone = this.g;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this.j;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.g = timeZone2;
            return timeZone2;
        }

        public boolean g() {
            return this.i != Shape.ANY;
        }

        public boolean j() {
            String str = this.e;
            return str != null && str.length() > 0;
        }

        public boolean i() {
            return this.d != null;
        }

        public boolean l() {
            if (this.g != null) {
                return true;
            }
            String str = this.j;
            return (str == null || str.isEmpty()) ? false : true;
        }

        public boolean h() {
            return this.f4057a != null;
        }

        public Boolean a(Feature feature) {
            return this.f4058b.d(feature);
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.e, this.i, this.f4057a, this.d, this.j, this.f4058b);
        }

        public int hashCode() {
            String str = this.j;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this.e;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = iHashCode + this.i.hashCode();
            Boolean bool = this.f4057a;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this.d;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return iHashCode2 ^ this.f4058b.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.i == cVar.i && this.f4058b.equals(cVar.f4058b) && d(this.f4057a, cVar.f4057a) && d(this.j, cVar.j) && d(this.e, cVar.e) && d(this.g, cVar.g) && d(this.d, cVar.d);
        }

        private static <T> boolean d(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }
    }
}
