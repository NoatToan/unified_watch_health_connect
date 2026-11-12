package defpackage;

import java.time.Instant;
import java.time.ZoneId;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes20.dex */
public class xat {
    public static long c() {
        return (Instant.now().toEpochMilli() - 631065600000L) / 1000;
    }

    public static long c(long j) {
        return (j - 631065600000L) / 1000;
    }

    public static long b() {
        String id = ZoneId.systemDefault().getId();
        long jC = c();
        TimeZone timeZone = TimeZone.getTimeZone(id);
        return jC + ((long) ((timeZone.getRawOffset() + timeZone.getDSTSavings()) / 1000));
    }
}
