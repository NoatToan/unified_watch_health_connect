package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Verify {
    private Verify() {
    }

    public static void verify(boolean z14, String str, char c14, char c15) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Character.valueOf(c14), Character.valueOf(c15)));
    }

    @CanIgnoreReturnValue
    public static <T> T verifyNotNull(T t7, String str, Object... objArr) {
        if (t7 != null) {
            return t7;
        }
        a.b(Strings.lenientFormat(str, objArr));
        return null;
    }

    @CanIgnoreReturnValue
    public static <T> T verifyNotNull(T t7) {
        return (T) verifyNotNull(t7, "expected a non-null reference", new Object[0]);
    }

    public static void verify(boolean z14, String str, Object... objArr) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, objArr));
    }

    public static void verify(boolean z14, String str, char c14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Character.valueOf(c14)));
    }

    public static void verify(boolean z14, String str, int i14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Integer.valueOf(i14)));
    }

    public static void verify(boolean z14, String str, long j8) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Long.valueOf(j8)));
    }

    public static void verify(boolean z14, String str, Object obj) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, obj));
    }

    public static void verify(boolean z14) {
        if (!z14) {
            throw new VerifyException();
        }
    }

    public static void verify(boolean z14, String str, int i14, char c14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Integer.valueOf(i14), Character.valueOf(c14)));
    }

    public static void verify(boolean z14, String str, long j8, char c14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c14)));
    }

    public static void verify(boolean z14, String str, Object obj, char c14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, obj, Character.valueOf(c14)));
    }

    public static void verify(boolean z14, String str, char c14, int i14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Character.valueOf(c14), Integer.valueOf(i14)));
    }

    public static void verify(boolean z14, String str, int i14, int i15) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Integer.valueOf(i14), Integer.valueOf(i15)));
    }

    public static void verify(boolean z14, String str, long j8, int i14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i14)));
    }

    public static void verify(boolean z14, String str, Object obj, int i14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, obj, Integer.valueOf(i14)));
    }

    public static void verify(boolean z14, String str, char c14, long j8) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Character.valueOf(c14), Long.valueOf(j8)));
    }

    public static void verify(boolean z14, String str, int i14, long j8) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Integer.valueOf(i14), Long.valueOf(j8)));
    }

    public static void verify(boolean z14, String str, long j8, long j14) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j14)));
    }

    public static void verify(boolean z14, String str, Object obj, long j8) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, obj, Long.valueOf(j8)));
    }

    public static void verify(boolean z14, String str, char c14, Object obj) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Character.valueOf(c14), obj));
    }

    public static void verify(boolean z14, String str, int i14, Object obj) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Integer.valueOf(i14), obj));
    }

    public static void verify(boolean z14, String str, long j8, Object obj) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, Long.valueOf(j8), obj));
    }

    public static void verify(boolean z14, String str, Object obj, Object obj2) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, obj, obj2));
    }

    public static void verify(boolean z14, String str, Object obj, Object obj2, Object obj3) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    public static void verify(boolean z14, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (z14) {
            return;
        }
        a.b(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }
}
