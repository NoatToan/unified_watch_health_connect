package com.google.gdata.util.common.base;

import com.google.common.base.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z14, String str, Object... objArr) {
        if (z14) {
            return;
        }
        h.s(format(str, objArr));
    }

    public static <T extends Iterable<?>> T checkContentsNotNull(T t7, Object obj) {
        if (containsOrIsNull(t7)) {
            throw new NullPointerException(String.valueOf(obj));
        }
        return t7;
    }

    public static void checkElementIndex(int i14, int i15, String str) {
        checkArgument(i15 >= 0, "negative size: %s", Integer.valueOf(i15));
        if (i14 < 0) {
            e.v(format("%s (%s) must not be negative", str, Integer.valueOf(i14)));
        } else {
            if (i14 < i15) {
                return;
            }
            e.v(format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i14), Integer.valueOf(i15)));
        }
    }

    public static <T> T checkNotNull(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkPositionIndex(int i14, int i15, String str) {
        checkArgument(i15 >= 0, "negative size: %s", Integer.valueOf(i15));
        if (i14 < 0) {
            e.v(format("%s (%s) must not be negative", str, Integer.valueOf(i14)));
        } else {
            if (i14 <= i15) {
                return;
            }
            e.v(format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i14), Integer.valueOf(i15)));
        }
    }

    public static void checkPositionIndexes(int i14, int i15, int i16) {
        checkPositionIndex(i14, i16, "start index");
        checkPositionIndex(i15, i16, "end index");
        if (i15 >= i14) {
            return;
        }
        e.v(format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i15), Integer.valueOf(i14)));
    }

    public static void checkState(boolean z14, Object obj) {
        if (!z14) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    private static boolean containsOrIsNull(Iterable<?> iterable) {
        if (iterable == null) {
            return true;
        }
        if (iterable instanceof Collection) {
            try {
                return ((Collection) iterable).contains(null);
            } catch (NullPointerException unused) {
                return false;
            }
        }
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }

    public static String format(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i14 = 0;
        int i15 = 0;
        while (i14 < objArr.length && (iIndexOf = str.indexOf("%s", i15)) != -1) {
            sb3.append(str.substring(i15, iIndexOf));
            sb3.append(objArr[i14]);
            i15 = iIndexOf + 2;
            i14++;
        }
        sb3.append(str.substring(i15));
        if (i14 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i14]);
            for (int i16 = i14 + 1; i16 < objArr.length; i16++) {
                sb3.append(", ");
                sb3.append(objArr[i16]);
            }
            sb3.append("]");
        }
        return sb3.toString();
    }

    public static void checkArgument(boolean z14, Object obj) {
        if (z14) {
            return;
        }
        a.a(obj);
    }

    public static void checkArgument(boolean z14) {
        if (z14) {
            return;
        }
        h.w();
    }

    public static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }

    public static void checkState(boolean z14) {
        if (z14) {
            return;
        }
        x.h();
    }

    public static <T> T checkNotNull(T t7, String str, Object... objArr) {
        if (t7 != null) {
            return t7;
        }
        x.l(format(str, objArr));
        return null;
    }

    public static void checkState(boolean z14, String str, Object... objArr) {
        if (z14) {
            return;
        }
        h.z(format(str, objArr));
    }

    public static <T extends Iterable<?>> T checkContentsNotNull(T t7) {
        if (containsOrIsNull(t7)) {
            throw null;
        }
        return t7;
    }

    public static <T extends Iterable<?>> T checkContentsNotNull(T t7, String str, Object... objArr) {
        if (!containsOrIsNull(t7)) {
            return t7;
        }
        x.l(format(str, objArr));
        return null;
    }

    public static void checkElementIndex(int i14, int i15) {
        checkElementIndex(i14, i15, FirebaseAnalytics.Param.INDEX);
    }

    public static void checkPositionIndex(int i14, int i15) {
        checkPositionIndex(i14, i15, FirebaseAnalytics.Param.INDEX);
    }
}
