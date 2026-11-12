package org.conscrypt;

import am.j;
import j20.x;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
final class Preconditions {
    private Preconditions() {
    }

    private static String badPositionIndex(int i14, int i15, String str) {
        if (i14 < 0) {
            return str + " (" + i14 + ") must not be negative";
        }
        if (i15 < 0) {
            h.s(j.h(i15, "negative size: "));
            return null;
        }
        return str + " (" + i14 + ") must not be greater than size (" + i15 + ")";
    }

    private static String badPositionIndexes(int i14, int i15, int i16) {
        if (i14 < 0 || i14 > i16) {
            return badPositionIndex(i14, i16, "start index");
        }
        return (i15 < 0 || i15 > i16) ? badPositionIndex(i15, i16, "end index") : j.g(i15, i14, "end index (", ") must not be less than start index (", ")");
    }

    public static void checkArgument(boolean z14, String str, Object obj) {
        if (z14) {
            return;
        }
        e.s(str, new Object[]{obj});
    }

    public static <T> T checkNotNull(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        x.l(str);
        return null;
    }

    public static void checkPositionIndexes(int i14, int i15, int i16) {
        if (i14 < 0 || i15 < i14 || i15 > i16) {
            e.v(badPositionIndexes(i14, i15, i16));
        }
    }

    public static void checkArgument(boolean z14, String str) {
        if (z14) {
            return;
        }
        h.s(str);
    }
}
