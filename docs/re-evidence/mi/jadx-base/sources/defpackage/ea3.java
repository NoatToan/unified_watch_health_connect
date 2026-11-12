package defpackage;

import org.joda.time.Instant;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class ea3 {
    public static LocalDate a(long j) {
        return b(j * 1000);
    }

    public static LocalDate b(long j) {
        return Instant.ofEpochMilli(j).toDateTime().toLocalDate();
    }
}
