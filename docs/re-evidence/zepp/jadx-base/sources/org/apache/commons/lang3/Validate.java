package org.apache.commons.lang3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
public class Validate {
    private static final String a = "The validated value is not a number";
    private static final String b = "The value is invalid: %f";
    private static final String c = "The value %s is not in the specified exclusive range of %s to %s";
    private static final String d = "The value %s is not in the specified inclusive range of %s to %s";
    private static final String e = "The string %s does not match the pattern %s";
    private static final String f = "The validated object is null";
    private static final String g = "The validated expression is false";
    private static final String h = "The validated array contains null element at index: %d";
    private static final String i = "The validated collection contains null element at index: %d";
    private static final String j = "The validated character sequence is blank";
    private static final String k = "The validated array is empty";
    private static final String l = "The validated character sequence is empty";
    private static final String m = "The validated collection is empty";
    private static final String n = "The validated map is empty";
    private static final String o = "The validated array index is invalid: %d";
    private static final String p = "The validated character sequence index is invalid: %d";
    private static final String q = "The validated collection index is invalid: %d";
    private static final String r = "The validated state is false";
    private static final String s = "Cannot assign a %s to a %s";
    private static final String t = "Expected type: %s, actual: %s";

    public static <T> void exclusiveBetween(T t2, T t3, Comparable<T> comparable) {
        if (comparable.compareTo(t2) <= 0 || comparable.compareTo(t3) >= 0) {
            throw new IllegalArgumentException(String.format(c, comparable, t2, t3));
        }
    }

    public static void finite(double d2) {
        finite(d2, b, Double.valueOf(d2));
    }

    public static <T> void inclusiveBetween(T t2, T t3, Comparable<T> comparable) {
        if (comparable.compareTo(t2) < 0 || comparable.compareTo(t3) > 0) {
            throw new IllegalArgumentException(String.format(d, comparable, t2, t3));
        }
    }

    public static void isAssignableFrom(Class<?> cls, Class<?> cls2) {
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = cls2 == null ? "null" : cls2.getName();
        objArr[1] = cls.getName();
        throw new IllegalArgumentException(String.format(s, objArr));
    }

    public static void isInstanceOf(Class<?> cls, Object obj) {
        if (cls.isInstance(obj)) {
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = cls.getName();
        objArr[1] = obj == null ? "null" : obj.getClass().getName();
        throw new IllegalArgumentException(String.format(t, objArr));
    }

    public static void isTrue(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, Long.valueOf(j2)));
        }
    }

    public static void matchesPattern(CharSequence charSequence, String str) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format(e, charSequence, str));
        }
    }

    public static <T> T[] noNullElements(T[] tArr, String str, Object... objArr) {
        notNull(tArr);
        for (int i2 = 0; i2 < tArr.length; i2++) {
            if (tArr[i2] == null) {
                throw new IllegalArgumentException(String.format(str, ArrayUtils.add((Integer[]) objArr, Integer.valueOf(i2))));
            }
        }
        return tArr;
    }

    public static <T extends CharSequence> T notBlank(T t2, String str, Object... objArr) {
        if (t2 == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
        if (StringUtils.isBlank(t2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t2;
    }

    public static <T> T[] notEmpty(T[] tArr, String str, Object... objArr) {
        if (tArr == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void notNaN(double d2) {
        notNaN(d2, a, new Object[0]);
    }

    public static <T> T notNull(T t2) {
        return (T) notNull(t2, f, new Object[0]);
    }

    public static <T> T[] validIndex(T[] tArr, int i2, String str, Object... objArr) {
        notNull(tArr);
        if (i2 < 0 || i2 >= tArr.length) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return tArr;
    }

    public static void validState(boolean z) {
        if (!z) {
            throw new IllegalStateException(r);
        }
    }

    public static void finite(double d2, String str, Object... objArr) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void isTrue(boolean z, String str, double d2) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, Double.valueOf(d2)));
        }
    }

    public static void notNaN(double d2, String str, Object... objArr) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T notNull(T t2, String str, Object... objArr) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static void validState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> void exclusiveBetween(T t2, T t3, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t2) <= 0 || comparable.compareTo(t3) >= 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> void inclusiveBetween(T t2, T t3, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t2) < 0 || comparable.compareTo(t3) > 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void isTrue(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void matchesPattern(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format(str2, objArr));
        }
    }

    public static void isTrue(boolean z) {
        if (!z) {
            throw new IllegalArgumentException(g);
        }
    }

    public static <T extends CharSequence> T notBlank(T t2) {
        return (T) notBlank(t2, j, new Object[0]);
    }

    public static <T> T[] notEmpty(T[] tArr) {
        return (T[]) notEmpty(tArr, k, new Object[0]);
    }

    public static <T> T[] validIndex(T[] tArr, int i2) {
        return (T[]) validIndex(tArr, i2, o, Integer.valueOf(i2));
    }

    public static void exclusiveBetween(long j2, long j3, long j4) {
        if (j4 <= j2 || j4 >= j3) {
            throw new IllegalArgumentException(String.format(c, Long.valueOf(j4), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void inclusiveBetween(long j2, long j3, long j4) {
        if (j4 < j2 || j4 > j3) {
            throw new IllegalArgumentException(String.format(d, Long.valueOf(j4), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void isAssignableFrom(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void isInstanceOf(Class<?> cls, Object obj, String str, Object... objArr) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends Collection<?>> T notEmpty(T t2, String str, Object... objArr) {
        if (t2 != null) {
            if (t2.isEmpty()) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t2;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends Collection<?>> T validIndex(T t2, int i2, String str, Object... objArr) {
        notNull(t2);
        if (i2 < 0 || i2 >= t2.size()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t2;
    }

    public static void exclusiveBetween(long j2, long j3, long j4, String str) {
        if (j4 <= j2 || j4 >= j3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void inclusiveBetween(long j2, long j3, long j4, String str) {
        if (j4 < j2 || j4 > j3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T[] noNullElements(T[] tArr) {
        return (T[]) noNullElements(tArr, h, new Object[0]);
    }

    public static void exclusiveBetween(double d2, double d3, double d4) {
        if (d4 <= d2 || d4 >= d3) {
            throw new IllegalArgumentException(String.format(c, Double.valueOf(d4), Double.valueOf(d2), Double.valueOf(d3)));
        }
    }

    public static void inclusiveBetween(double d2, double d3, double d4) {
        if (d4 < d2 || d4 > d3) {
            throw new IllegalArgumentException(String.format(d, Double.valueOf(d4), Double.valueOf(d2), Double.valueOf(d3)));
        }
    }

    public static <T extends Iterable<?>> T noNullElements(T t2, String str, Object... objArr) {
        notNull(t2);
        Iterator it2 = t2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next() == null) {
                throw new IllegalArgumentException(String.format(str, ArrayUtils.addAll(objArr, Integer.valueOf(i2))));
            }
            i2++;
        }
        return t2;
    }

    public static void exclusiveBetween(double d2, double d3, double d4, String str) {
        if (d4 <= d2 || d4 >= d3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void inclusiveBetween(double d2, double d3, double d4, String str) {
        if (d4 < d2 || d4 > d3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T extends Collection<?>> T notEmpty(T t2) {
        return (T) notEmpty(t2, m, new Object[0]);
    }

    public static <T extends Collection<?>> T validIndex(T t2, int i2) {
        return (T) validIndex(t2, i2, q, Integer.valueOf(i2));
    }

    public static <T extends Map<?, ?>> T notEmpty(T t2, String str, Object... objArr) {
        if (t2 != null) {
            if (t2.isEmpty()) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t2;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends CharSequence> T validIndex(T t2, int i2, String str, Object... objArr) {
        notNull(t2);
        if (i2 < 0 || i2 >= t2.length()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t2;
    }

    public static <T extends Iterable<?>> T noNullElements(T t2) {
        return (T) noNullElements(t2, i, new Object[0]);
    }

    public static <T extends Map<?, ?>> T notEmpty(T t2) {
        return (T) notEmpty(t2, n, new Object[0]);
    }

    public static <T extends CharSequence> T validIndex(T t2, int i2) {
        return (T) validIndex(t2, i2, p, Integer.valueOf(i2));
    }

    public static <T extends CharSequence> T notEmpty(T t2, String str, Object... objArr) {
        if (t2 != null) {
            if (t2.length() != 0) {
                return t2;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends CharSequence> T notEmpty(T t2) {
        return (T) notEmpty(t2, l, new Object[0]);
    }
}
