package org.apache.commons.lang3;

import androidx.room.a0;
import com.google.maps.android.BuildConfig;
import ds.e0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class Validate {
    private static final String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified exclusive range of %s to %s";
    private static final String DEFAULT_FINITE_EX_MESSAGE = "The value is invalid: %f";
    private static final String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified inclusive range of %s to %s";
    private static final String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE = "Cannot assign a %s to a %s";
    private static final String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE = "Expected type: %s, actual: %s";
    private static final String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";
    private static final String DEFAULT_IS_TRUE_EX_MESSAGE = "The validated expression is false";
    private static final String DEFAULT_MATCHES_PATTERN_EX = "The string %s does not match the pattern %s";
    private static final String DEFAULT_NOT_BLANK_EX_MESSAGE = "The validated character sequence is blank";
    private static final String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE = "The validated array is empty";
    private static final String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence is empty";
    private static final String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE = "The validated collection is empty";
    private static final String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE = "The validated map is empty";
    private static final String DEFAULT_NOT_NAN_EX_MESSAGE = "The validated value is not a number";
    private static final String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE = "The validated array contains null element at index: %d";
    private static final String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE = "The validated collection contains null element at index: %d";
    private static final String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE = "The validated array index is invalid: %d";
    private static final String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence index is invalid: %d";
    private static final String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE = "The validated collection index is invalid: %d";
    private static final String DEFAULT_VALID_STATE_EX_MESSAGE = "The validated state is false";

    public static void exclusiveBetween(long j8, long j14, long j15) {
        if (j15 <= j8 || j15 >= j14) {
            StringBuilder sbK = e0.k(j15, "The value ", " is not in the specified exclusive range of ");
            sbK.append(j8);
            sbK.append(" to ");
            sbK.append(j14);
            throw new IllegalArgumentException(sbK.toString());
        }
    }

    public static void finite(double d14, String str, Object... objArr) {
        if (Double.isNaN(d14) || Double.isInfinite(d14)) {
            e.n(str, objArr);
        }
    }

    public static void inclusiveBetween(long j8, long j14, long j15) {
        if (j15 < j8 || j15 > j14) {
            StringBuilder sbK = e0.k(j15, "The value ", " is not in the specified inclusive range of ");
            sbK.append(j8);
            sbK.append(" to ");
            sbK.append(j14);
            throw new IllegalArgumentException(sbK.toString());
        }
    }

    public static void isAssignableFrom(Class<?> cls, Class<?> cls2) {
        if (cls.isAssignableFrom(cls2)) {
        } else {
            throw new IllegalArgumentException(a0.j("Cannot assign a ", cls2 == null ? BuildConfig.TRAVIS : cls2.getName(), " to a ", cls.getName()));
        }
    }

    public static void isInstanceOf(Class<?> cls, Object obj) {
        if (cls.isInstance(obj)) {
        } else {
            throw new IllegalArgumentException(a0.j("Expected type: ", cls.getName(), ", actual: ", obj == null ? BuildConfig.TRAVIS : obj.getClass().getName()));
        }
    }

    public static void isTrue(boolean z14, String str, long j8) {
        if (z14) {
            return;
        }
        e.s(str, new Object[]{Long.valueOf(j8)});
    }

    public static void matchesPattern(CharSequence charSequence, String str) {
        if (Pattern.matches(str, charSequence)) {
            return;
        }
        e.s(DEFAULT_MATCHES_PATTERN_EX, new Object[]{charSequence, str});
    }

    public static <T extends Iterable<?>> T noNullElements(T t7, String str, Object... objArr) {
        notNull(t7);
        Iterator it = t7.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (it.next() == null) {
                e.n(str, ArrayUtils.addAll(objArr, Integer.valueOf(i14)));
                return null;
            }
            i14++;
        }
        return t7;
    }

    public static <T extends CharSequence> T notBlank(T t7, String str, Object... objArr) {
        Objects.requireNonNull(t7, new f(str, objArr, 1));
        if (!StringUtils.isBlank(t7)) {
            return t7;
        }
        e.n(str, objArr);
        return null;
    }

    public static <T extends Collection<?>> T notEmpty(T t7, String str, Object... objArr) {
        Objects.requireNonNull(t7, new f(str, objArr, 4));
        if (!t7.isEmpty()) {
            return t7;
        }
        e.n(str, objArr);
        return null;
    }

    public static void notNaN(double d14, String str, Object... objArr) {
        if (Double.isNaN(d14)) {
            e.n(str, objArr);
        }
    }

    public static <T> T notNull(T t7) {
        return (T) notNull(t7, DEFAULT_IS_NULL_EX_MESSAGE, new Object[0]);
    }

    public static <T extends Collection<?>> T validIndex(T t7, int i14, String str, Object... objArr) {
        notNull(t7);
        if (i14 < 0 || i14 >= t7.size()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t7;
    }

    public static void validState(boolean z14, String str, Object... objArr) {
        if (!z14) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> T notNull(T t7, String str, Object... objArr) {
        Objects.requireNonNull(t7, new f(str, objArr, 2));
        return t7;
    }

    public static void notNaN(double d14) {
        notNaN(d14, DEFAULT_NOT_NAN_EX_MESSAGE, new Object[0]);
    }

    public static void validState(boolean z14) {
        if (z14) {
            return;
        }
        h.z(DEFAULT_VALID_STATE_EX_MESSAGE);
    }

    public static void isTrue(boolean z14, String str, double d14) {
        if (z14) {
            return;
        }
        e.s(str, new Object[]{Double.valueOf(d14)});
    }

    public static void isTrue(boolean z14, String str, Object... objArr) {
        if (z14) {
            return;
        }
        e.n(str, objArr);
    }

    public static void finite(double d14) {
        finite(d14, DEFAULT_FINITE_EX_MESSAGE, Double.valueOf(d14));
    }

    public static void isTrue(boolean z14) {
        if (z14) {
            return;
        }
        h.s(DEFAULT_IS_TRUE_EX_MESSAGE);
    }

    public static void matchesPattern(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (Pattern.matches(str, charSequence)) {
            return;
        }
        e.n(str2, objArr);
    }

    public static <T extends CharSequence> T notBlank(T t7) {
        return (T) notBlank(t7, DEFAULT_NOT_BLANK_EX_MESSAGE, new Object[0]);
    }

    public static <T> T[] notEmpty(T[] tArr) {
        return (T[]) notEmpty(tArr, DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE, new Object[0]);
    }

    public static <T> T[] notEmpty(T[] tArr, String str, Object... objArr) {
        Objects.requireNonNull(tArr, new f(str, objArr, 5));
        if (tArr.length != 0) {
            return tArr;
        }
        e.n(str, objArr);
        return null;
    }

    public static <T> T[] validIndex(T[] tArr, int i14) {
        return (T[]) validIndex(tArr, i14, DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE, Integer.valueOf(i14));
    }

    public static <T> T[] validIndex(T[] tArr, int i14, String str, Object... objArr) {
        notNull(tArr);
        if (i14 < 0 || i14 >= tArr.length) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return tArr;
    }

    public static <T extends Collection<?>> T notEmpty(T t7) {
        return (T) notEmpty(t7, DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE, new Object[0]);
    }

    public static <T extends Map<?, ?>> T notEmpty(T t7, String str, Object... objArr) {
        Objects.requireNonNull(t7, new f(str, objArr, 0));
        if (!t7.isEmpty()) {
            return t7;
        }
        e.n(str, objArr);
        return null;
    }

    public static <T extends Collection<?>> T validIndex(T t7, int i14) {
        return (T) validIndex(t7, i14, DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE, Integer.valueOf(i14));
    }

    public static <T extends CharSequence> T validIndex(T t7, int i14, String str, Object... objArr) {
        notNull(t7);
        if (i14 < 0 || i14 >= t7.length()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t7;
    }

    public static <T extends Map<?, ?>> T notEmpty(T t7) {
        return (T) notEmpty(t7, DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE, new Object[0]);
    }

    public static <T extends CharSequence> T notEmpty(T t7, String str, Object... objArr) {
        Objects.requireNonNull(t7, new f(str, objArr, 3));
        if (t7.length() != 0) {
            return t7;
        }
        e.n(str, objArr);
        return null;
    }

    public static <T extends CharSequence> T validIndex(T t7, int i14) {
        return (T) validIndex(t7, i14, DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE, Integer.valueOf(i14));
    }

    public static <T extends CharSequence> T notEmpty(T t7) {
        return (T) notEmpty(t7, DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE, new Object[0]);
    }

    public static void isAssignableFrom(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        e.n(str, objArr);
    }

    public static <T> void exclusiveBetween(T t7, T t14, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t7) <= 0 || comparable.compareTo(t14) >= 0) {
            e.n(str, objArr);
        }
    }

    public static <T> void inclusiveBetween(T t7, T t14, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t7) < 0 || comparable.compareTo(t14) > 0) {
            e.n(str, objArr);
        }
    }

    public static void isInstanceOf(Class<?> cls, Object obj, String str, Object... objArr) {
        if (cls.isInstance(obj)) {
            return;
        }
        e.n(str, objArr);
    }

    public static <T> void exclusiveBetween(T t7, T t14, Comparable<T> comparable) {
        if (comparable.compareTo(t7) <= 0 || comparable.compareTo(t14) >= 0) {
            e.s(DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE, new Object[]{comparable, t7, t14});
        }
    }

    public static <T> void inclusiveBetween(T t7, T t14, Comparable<T> comparable) {
        if (comparable.compareTo(t7) < 0 || comparable.compareTo(t14) > 0) {
            e.s(DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE, new Object[]{comparable, t7, t14});
        }
    }

    public static <T> T[] noNullElements(T[] tArr) {
        return (T[]) noNullElements(tArr, DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE, new Object[0]);
    }

    public static <T> T[] noNullElements(T[] tArr, String str, Object... objArr) {
        notNull(tArr);
        for (int i14 = 0; i14 < tArr.length; i14++) {
            if (tArr[i14] == null) {
                e.n(str, ArrayUtils.add((Integer[]) objArr, Integer.valueOf(i14)));
                return null;
            }
        }
        return tArr;
    }

    public static void exclusiveBetween(long j8, long j14, long j15, String str) {
        if (j15 <= j8 || j15 >= j14) {
            h.s(str);
        }
    }

    public static void inclusiveBetween(long j8, long j14, long j15, String str) {
        if (j15 < j8 || j15 > j14) {
            h.s(str);
        }
    }

    public static void exclusiveBetween(double d14, double d15, double d16) {
        if (d16 <= d14 || d16 >= d15) {
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("The value ", d16, " is not in the specified exclusive range of ");
            sbA.append(d14);
            sbA.append(" to ");
            sbA.append(d15);
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    public static void inclusiveBetween(double d14, double d15, double d16) {
        if (d16 < d14 || d16 > d15) {
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("The value ", d16, " is not in the specified inclusive range of ");
            sbA.append(d14);
            sbA.append(" to ");
            sbA.append(d15);
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    public static void exclusiveBetween(double d14, double d15, double d16, String str) {
        if (d16 <= d14 || d16 >= d15) {
            h.s(str);
        }
    }

    public static void inclusiveBetween(double d14, double d15, double d16, String str) {
        if (d16 < d14 || d16 > d15) {
            h.s(str);
        }
    }

    public static <T extends Iterable<?>> T noNullElements(T t7) {
        return (T) noNullElements(t7, DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE, new Object[0]);
    }
}
