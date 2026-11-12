package org.joda.time;

import am.j;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(long j8, String str) {
        super(createMessage(j8, str));
    }

    private static String createMessage(long j8, String str) {
        return j.m("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j8)), str != null ? j.m(" (", str, ")") : "");
    }

    public static boolean isIllegalInstant(Throwable th3) {
        if (th3 instanceof IllegalInstantException) {
            return true;
        }
        if (th3.getCause() == null || th3.getCause() == th3) {
            return false;
        }
        return isIllegalInstant(th3.getCause());
    }

    public IllegalInstantException(String str) {
        super(str);
    }
}
