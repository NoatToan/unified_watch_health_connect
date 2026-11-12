package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
public final class al {
    public static int a(int i14, int i15, String str) {
        String strA;
        if (i14 >= 0 && i14 < i15) {
            return i14;
        }
        if (i14 < 0) {
            strA = am.a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i14));
        } else {
            if (i15 < 0) {
                vb.h.s(am.j.h(i15, "negative size: "));
                return 0;
            }
            strA = am.a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int b(int i14, int i15, String str) {
        if (i14 >= 0 && i14 <= i15) {
            return i14;
        }
        org.apache.commons.lang3.e.v(d(i14, i15, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    public static void c(int i14, int i15, int i16) {
        String strD;
        if (i14 < 0 || i15 < i14 || i15 > i16) {
            if (i14 < 0 || i14 > i16) {
                strD = d(i14, i16, "start index");
            } else {
                strD = (i15 < 0 || i15 > i16) ? d(i15, i16, "end index") : am.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i15), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    private static String d(int i14, int i15, String str) {
        if (i14 < 0) {
            return am.a("%s (%s) must not be negative", str, Integer.valueOf(i14));
        }
        if (i15 >= 0) {
            return am.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        vb.h.s(am.j.h(i15, "negative size: "));
        return null;
    }
}
