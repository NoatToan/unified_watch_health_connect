package org.joda.time;

import defpackage.hq5;

/* JADX INFO: loaded from: classes3.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j, String str) {
        String str2;
        String strK = hq5.b("yyyy-MM-dd'T'HH:mm:ss.SSS").k(new Instant(j));
        if (str != null) {
            str2 = " (" + str + ")";
        } else {
            str2 = "";
        }
        return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + strK + str2;
    }

    public static boolean isIllegalInstant(Throwable th) {
        if (th instanceof IllegalInstantException) {
            return true;
        }
        if (th.getCause() == null || th.getCause() == th) {
            return false;
        }
        return isIllegalInstant(th.getCause());
    }

    public IllegalInstantException(long j, String str) {
        super(createMessage(j, str));
    }
}
