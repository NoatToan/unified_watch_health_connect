package com.google.common.base;

import am.j;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i14, int i15, String str) {
        if (i14 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i14));
        }
        if (i15 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        h.s(j.h(i15, "negative size: "));
        return null;
    }

    private static String badPositionIndex(int i14, int i15, String str) {
        if (i14 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i14));
        }
        if (i15 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        h.s(j.h(i15, "negative size: "));
        return null;
    }

    private static String badPositionIndexes(int i14, int i15, int i16) {
        if (i14 < 0 || i14 > i16) {
            return badPositionIndex(i14, i16, "start index");
        }
        return (i15 < 0 || i15 > i16) ? badPositionIndex(i15, i16, "end index") : Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i15), Integer.valueOf(i14));
    }

    public static void checkArgument(boolean z14, String str, char c14, char c15) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Character.valueOf(c14), Character.valueOf(c15)));
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int i14, int i15, String str) {
        if (i14 >= 0 && i14 < i15) {
            return i14;
        }
        e.v(badElementIndex(i14, i15, str));
        return 0;
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, char c14, char c15) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Character.valueOf(c14), Character.valueOf(c15)));
        return null;
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int i14, int i15, String str) {
        if (i14 >= 0 && i14 <= i15) {
            return i14;
        }
        e.v(badPositionIndex(i14, i15, str));
        return 0;
    }

    public static void checkPositionIndexes(int i14, int i15, int i16) {
        if (i14 < 0 || i15 < i14 || i15 > i16) {
            e.v(badPositionIndexes(i14, i15, i16));
        }
    }

    public static void checkState(boolean z14, String str, char c14, char c15) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Character.valueOf(c14), Character.valueOf(c15)));
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int i14, int i15) {
        return checkElementIndex(i14, i15, FirebaseAnalytics.Param.INDEX);
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int i14, int i15) {
        return checkPositionIndex(i14, i15, FirebaseAnalytics.Param.INDEX);
    }

    public static void checkArgument(boolean z14, Object obj) {
        if (z14) {
            return;
        }
        a.a(obj);
    }

    public static void checkState(boolean z14, Object obj) {
        if (!z14) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z14, String str, Object... objArr) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, objArr));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z14, String str, Object... objArr) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, objArr));
    }

    public static void checkArgument(boolean z14, String str, char c14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Character.valueOf(c14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, Object... objArr) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, objArr));
        return null;
    }

    public static void checkState(boolean z14, String str, char c14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Character.valueOf(c14)));
    }

    public static void checkArgument(boolean z14, String str, int i14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Integer.valueOf(i14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, char c14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Character.valueOf(c14)));
        return null;
    }

    public static void checkState(boolean z14, String str, int i14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Integer.valueOf(i14)));
    }

    public static void checkArgument(boolean z14, String str, long j8) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Long.valueOf(j8)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, int i14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Integer.valueOf(i14)));
        return null;
    }

    public static void checkState(boolean z14, String str, long j8) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Long.valueOf(j8)));
    }

    public static void checkArgument(boolean z14, String str, Object obj) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, obj));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, long j8) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Long.valueOf(j8)));
        return null;
    }

    public static void checkState(boolean z14, String str, Object obj) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, obj));
    }

    public static void checkArgument(boolean z14) {
        if (z14) {
            return;
        }
        h.w();
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, Object obj) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, obj));
        return null;
    }

    public static void checkState(boolean z14) {
        if (z14) {
            return;
        }
        x.h();
    }

    public static void checkArgument(boolean z14, String str, char c14, int i14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Character.valueOf(c14), Integer.valueOf(i14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }

    public static void checkState(boolean z14, String str, char c14, int i14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Character.valueOf(c14), Integer.valueOf(i14)));
    }

    public static void checkArgument(boolean z14, String str, char c14, long j8) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Character.valueOf(c14), Long.valueOf(j8)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, char c14, int i14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Character.valueOf(c14), Integer.valueOf(i14)));
        return null;
    }

    public static void checkState(boolean z14, String str, char c14, long j8) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Character.valueOf(c14), Long.valueOf(j8)));
    }

    public static void checkArgument(boolean z14, String str, char c14, Object obj) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Character.valueOf(c14), obj));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, char c14, long j8) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Character.valueOf(c14), Long.valueOf(j8)));
        return null;
    }

    public static void checkState(boolean z14, String str, char c14, Object obj) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Character.valueOf(c14), obj));
    }

    public static void checkArgument(boolean z14, String str, int i14, char c14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Integer.valueOf(i14), Character.valueOf(c14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, char c14, Object obj) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Character.valueOf(c14), obj));
        return null;
    }

    public static void checkState(boolean z14, String str, int i14, char c14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Integer.valueOf(i14), Character.valueOf(c14)));
    }

    public static void checkArgument(boolean z14, String str, int i14, int i15) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Integer.valueOf(i14), Integer.valueOf(i15)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, int i14, char c14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Integer.valueOf(i14), Character.valueOf(c14)));
        return null;
    }

    public static void checkState(boolean z14, String str, int i14, int i15) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Integer.valueOf(i14), Integer.valueOf(i15)));
    }

    public static void checkArgument(boolean z14, String str, int i14, long j8) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Integer.valueOf(i14), Long.valueOf(j8)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, int i14, int i15) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Integer.valueOf(i14), Integer.valueOf(i15)));
        return null;
    }

    public static void checkState(boolean z14, String str, int i14, long j8) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Integer.valueOf(i14), Long.valueOf(j8)));
    }

    public static void checkArgument(boolean z14, String str, int i14, Object obj) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Integer.valueOf(i14), obj));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, int i14, long j8) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Integer.valueOf(i14), Long.valueOf(j8)));
        return null;
    }

    public static void checkState(boolean z14, String str, int i14, Object obj) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Integer.valueOf(i14), obj));
    }

    public static void checkArgument(boolean z14, String str, long j8, char c14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, int i14, Object obj) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Integer.valueOf(i14), obj));
        return null;
    }

    public static void checkState(boolean z14, String str, long j8, char c14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c14)));
    }

    public static void checkArgument(boolean z14, String str, long j8, int i14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, long j8, char c14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c14)));
        return null;
    }

    public static void checkState(boolean z14, String str, long j8, int i14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i14)));
    }

    public static void checkArgument(boolean z14, String str, long j8, long j14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, long j8, int i14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i14)));
        return null;
    }

    public static void checkState(boolean z14, String str, long j8, long j14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j14)));
    }

    public static void checkArgument(boolean z14, String str, long j8, Object obj) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, Long.valueOf(j8), obj));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, long j8, long j14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j14)));
        return null;
    }

    public static void checkState(boolean z14, String str, long j8, Object obj) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, Long.valueOf(j8), obj));
    }

    public static void checkArgument(boolean z14, String str, Object obj, char c14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, obj, Character.valueOf(c14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, long j8, Object obj) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, Long.valueOf(j8), obj));
        return null;
    }

    public static void checkState(boolean z14, String str, Object obj, char c14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, obj, Character.valueOf(c14)));
    }

    public static void checkArgument(boolean z14, String str, Object obj, int i14) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, obj, Integer.valueOf(i14)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, Object obj, char c14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, obj, Character.valueOf(c14)));
        return null;
    }

    public static void checkState(boolean z14, String str, Object obj, int i14) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, obj, Integer.valueOf(i14)));
    }

    public static void checkArgument(boolean z14, String str, Object obj, long j8) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, obj, Long.valueOf(j8)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, Object obj, int i14) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, obj, Integer.valueOf(i14)));
        return null;
    }

    public static void checkState(boolean z14, String str, Object obj, long j8) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, obj, Long.valueOf(j8)));
    }

    public static void checkArgument(boolean z14, String str, Object obj, Object obj2) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, obj, obj2));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, Object obj, long j8) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, obj, Long.valueOf(j8)));
        return null;
    }

    public static void checkState(boolean z14, String str, Object obj, Object obj2) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, obj, obj2));
    }

    public static void checkArgument(boolean z14, String str, Object obj, Object obj2, Object obj3) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, Object obj, Object obj2) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, obj, obj2));
        return null;
    }

    public static void checkState(boolean z14, String str, Object obj, Object obj2, Object obj3) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkArgument(boolean z14, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (z14) {
            return;
        }
        h.s(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, Object obj, Object obj2, Object obj3) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, obj, obj2, obj3));
        return null;
    }

    public static void checkState(boolean z14, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (z14) {
            return;
        }
        h.z(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t7, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (t7 != null) {
            return t7;
        }
        x.l(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        return null;
    }
}
