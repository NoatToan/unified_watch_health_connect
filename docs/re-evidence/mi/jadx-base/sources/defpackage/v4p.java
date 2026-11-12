package defpackage;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes.dex */
public class v4p extends d5p {
    public static Instant a(TemporalAccessor temporalAccessor) {
        if (temporalAccessor == null) {
            return null;
        }
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        if (temporalAccessor instanceof LocalDateTime) {
            return ((LocalDateTime) temporalAccessor).atZone(ZoneId.systemDefault()).toInstant();
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).toInstant();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toInstant();
        }
        if (temporalAccessor instanceof LocalDate) {
            return ((LocalDate) temporalAccessor).atStartOfDay(ZoneId.systemDefault()).toInstant();
        }
        if (temporalAccessor instanceof LocalTime) {
            return ((LocalTime) temporalAccessor).atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant();
        }
        return temporalAccessor instanceof OffsetTime ? ((OffsetTime) temporalAccessor).atDate(LocalDate.now()).toInstant() : Instant.from(temporalAccessor);
    }
}
