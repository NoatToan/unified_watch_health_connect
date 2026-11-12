package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {

    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

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
        BOOLEAN;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        public boolean isStructured() {
            return this == OBJECT || this == ARRAY;
        }
    }

    public static class Value implements Serializable {
        private static final Value EMPTY = new Value();
        private static final long serialVersionUID = 1;
        private final a _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private transient TimeZone _timezone;
        private final String _timezoneStr;

        public Value() {
            this("", Shape.ANY, "", "", a.c(), (Boolean) null);
        }

        private static <T> boolean _equal(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }

        public static final Value empty() {
            return EMPTY;
        }

        public static Value forLeniency(boolean z) {
            return new Value(null, null, null, null, null, a.c(), Boolean.valueOf(z));
        }

        public static Value forPattern(String str) {
            return new Value(str, null, null, null, null, a.c(), null);
        }

        public static Value forShape(Shape shape) {
            return new Value(null, shape, null, null, null, a.c(), null);
        }

        public static final Value from(JsonFormat jsonFormat) {
            return jsonFormat == null ? EMPTY : new Value(jsonFormat);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value valueWithOverrides : valueArr) {
                if (valueWithOverrides != null) {
                    if (value != null) {
                        valueWithOverrides = value.withOverrides(valueWithOverrides);
                    }
                    value = valueWithOverrides;
                }
            }
            return value;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            if (this._shape == value._shape && this._features.equals(value._features)) {
                return _equal(this._lenient, value._lenient) && _equal(this._timezoneStr, value._timezoneStr) && _equal(this._pattern, value._pattern) && _equal(this._timezone, value._timezone) && _equal(this._locale, value._locale);
            }
            return false;
        }

        public Boolean getFeature(Feature feature) {
            return this._features.d(feature);
        }

        public a getFeatures() {
            return this._features;
        }

        public Boolean getLenient() {
            return this._lenient;
        }

        public Locale getLocale() {
            return this._locale;
        }

        public String getPattern() {
            return this._pattern;
        }

        public Shape getShape() {
            return this._shape;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this._timezone;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this._timezoneStr;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this._timezone = timeZone2;
            return timeZone2;
        }

        public boolean hasLenient() {
            return this._lenient != null;
        }

        public boolean hasLocale() {
            return this._locale != null;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            return str != null && str.length() > 0;
        }

        public boolean hasShape() {
            return this._shape != Shape.ANY;
        }

        public boolean hasTimeZone() {
            String str;
            return (this._timezone == null && ((str = this._timezoneStr) == null || str.isEmpty())) ? false : true;
        }

        public int hashCode() {
            String str = this._timezoneStr;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this._pattern;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = iHashCode + this._shape.hashCode();
            Boolean bool = this._lenient;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return iHashCode2 ^ this._features.hashCode();
        }

        public boolean isLenient() {
            return Boolean.TRUE.equals(this._lenient);
        }

        public String timeZoneAsString() {
            TimeZone timeZone = this._timezone;
            return timeZone != null ? timeZone.getID() : this._timezoneStr;
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr);
        }

        public Class<JsonFormat> valueFor() {
            return JsonFormat.class;
        }

        public Value withFeature(Feature feature) {
            a aVarE = this._features.e(feature);
            return aVarE == this._features ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, aVarE, this._lenient);
        }

        public Value withLenient(Boolean bool) {
            return bool == this._lenient ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, this._features, bool);
        }

        public Value withLocale(Locale locale) {
            return new Value(this._pattern, this._shape, locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public final Value withOverrides(Value value) {
            Value value2;
            String str;
            TimeZone timeZone;
            if (value == null || value == (value2 = EMPTY) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str2 = value._pattern;
            if (str2 == null || str2.isEmpty()) {
                str2 = this._pattern;
            }
            String str3 = str2;
            Shape shape = value._shape;
            if (shape == Shape.ANY) {
                shape = this._shape;
            }
            Shape shape2 = shape;
            Locale locale = value._locale;
            if (locale == null) {
                locale = this._locale;
            }
            Locale locale2 = locale;
            a aVar = this._features;
            a aVarF = aVar == null ? value._features : aVar.f(value._features);
            Boolean bool = value._lenient;
            if (bool == null) {
                bool = this._lenient;
            }
            Boolean bool2 = bool;
            String str4 = value._timezoneStr;
            if (str4 == null || str4.isEmpty()) {
                str = this._timezoneStr;
                timeZone = this._timezone;
            } else {
                timeZone = value._timezone;
                str = str4;
            }
            return new Value(str3, shape2, locale2, str, timeZone, aVarF, bool2);
        }

        public Value withPattern(String str) {
            return new Value(str, this._shape, this._locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public Value withShape(Shape shape) {
            return shape == this._shape ? this : new Value(this._pattern, shape, this._locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public Value withTimeZone(TimeZone timeZone) {
            return new Value(this._pattern, this._shape, this._locale, null, timeZone, this._features, this._lenient);
        }

        public Value withoutFeature(Feature feature) {
            a aVarG = this._features.g(feature);
            return aVarG == this._features ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, aVarG, this._lenient);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), a.a(jsonFormat), jsonFormat.lenient().asBoolean());
        }

        public Value(String str, Shape shape, String str2, String str3, a aVar, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, aVar, bool);
        }

        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, a aVar, Boolean bool) {
            this._pattern = str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = null;
            this._features = aVar == null ? a.c() : aVar;
            this._lenient = bool;
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, a aVar, Boolean bool) {
            this._pattern = str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = str2;
            this._features = aVar == null ? a.c() : aVar;
            this._lenient = bool;
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, a aVar) {
            this(str, shape, locale, str2, timeZone, aVar, null);
        }

        @Deprecated
        public Value(String str, Shape shape, String str2, String str3, a aVar) {
            this(str, shape, str2, str3, aVar, (Boolean) null);
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, a aVar) {
            this(str, shape, locale, timeZone, aVar, (Boolean) null);
        }
    }

    public static class a {
        public static final a c = new a(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7617b;

        public a(int i, int i2) {
            this.f7616a = i;
            this.f7617b = i2;
        }

        public static a a(JsonFormat jsonFormat) {
            return b(jsonFormat.with(), jsonFormat.without());
        }

        public static a b(Feature[] featureArr, Feature[] featureArr2) {
            int iOrdinal = 0;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            int iOrdinal2 = 0;
            for (Feature feature2 : featureArr2) {
                iOrdinal2 |= 1 << feature2.ordinal();
            }
            return new a(iOrdinal, iOrdinal2);
        }

        public static a c() {
            return c;
        }

        public Boolean d(Feature feature) {
            int iOrdinal = 1 << feature.ordinal();
            if ((this.f7617b & iOrdinal) != 0) {
                return Boolean.FALSE;
            }
            if ((iOrdinal & this.f7616a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public a e(Feature... featureArr) {
            int iOrdinal = this.f7616a;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            return iOrdinal == this.f7616a ? this : new a(iOrdinal, this.f7617b);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f7616a == this.f7616a && aVar.f7617b == this.f7617b;
        }

        public a f(a aVar) {
            if (aVar == null) {
                return this;
            }
            int i = aVar.f7617b;
            int i2 = aVar.f7616a;
            if (i == 0 && i2 == 0) {
                return this;
            }
            int i3 = this.f7616a;
            if (i3 == 0 && this.f7617b == 0) {
                return aVar;
            }
            int i4 = ((~i) & i3) | i2;
            int i5 = this.f7617b;
            int i6 = i | ((~i2) & i5);
            return (i4 == i3 && i6 == i5) ? this : new a(i4, i6);
        }

        public a g(Feature... featureArr) {
            int iOrdinal = this.f7617b;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            return iOrdinal == this.f7617b ? this : new a(this.f7616a, iOrdinal);
        }

        public int hashCode() {
            return this.f7617b + this.f7616a;
        }
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
