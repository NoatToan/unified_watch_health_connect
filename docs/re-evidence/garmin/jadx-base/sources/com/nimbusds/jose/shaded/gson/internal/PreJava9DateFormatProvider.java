package com.nimbusds.jose.shaded.gson.internal;

import am.j;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    private static String getDatePartOfDateTimePattern(int i14) {
        if (i14 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i14 == 1) {
            return "MMMM d, yyyy";
        }
        if (i14 == 2) {
            return "MMM d, yyyy";
        }
        if (i14 == 3) {
            return "M/d/yy";
        }
        h.s(j.h(i14, "Unknown DateFormat style: "));
        return null;
    }

    private static String getTimePartOfDateTimePattern(int i14) {
        if (i14 == 0 || i14 == 1) {
            return "h:mm:ss a z";
        }
        if (i14 == 2) {
            return "h:mm:ss a";
        }
        if (i14 == 3) {
            return "h:mm a";
        }
        h.s(j.h(i14, "Unknown DateFormat style: "));
        return null;
    }

    public static DateFormat getUsDateTimeFormat(int i14, int i15) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i14) + StringUtils.SPACE + getTimePartOfDateTimePattern(i15), Locale.US);
    }
}
