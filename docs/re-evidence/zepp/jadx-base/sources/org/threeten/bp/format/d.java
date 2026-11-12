package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes23.dex */
final class d {
    private TemporalAccessor a;
    private Locale b;
    private DecimalStyle c;
    private int d;

    public class a extends DefaultInterfaceTemporalAccessor {
        public final /* synthetic */ ChronoLocalDate a;
        public final /* synthetic */ TemporalAccessor b;
        public final /* synthetic */ Chronology c;
        public final /* synthetic */ ZoneId d;

        public a(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
            this.a = chronoLocalDate;
            this.b = temporalAccessor;
            this.c = chronology;
            this.d = zoneId;
        }

        @Override // org.threeten.bp.temporal.TemporalAccessor
        public long getLong(TemporalField temporalField) {
            return (this.a == null || !temporalField.isDateBased()) ? this.b.getLong(temporalField) : this.a.getLong(temporalField);
        }

        @Override // org.threeten.bp.temporal.TemporalAccessor
        public boolean isSupported(TemporalField temporalField) {
            return (this.a == null || !temporalField.isDateBased()) ? this.b.isSupported(temporalField) : this.a.isSupported(temporalField);
        }

        @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
        public <R> R query(TemporalQuery<R> temporalQuery) {
            if (temporalQuery == TemporalQueries.chronology()) {
                return (R) this.c;
            }
            if (temporalQuery == TemporalQueries.zoneId()) {
                return (R) this.d;
            }
            return temporalQuery == TemporalQueries.precision() ? (R) this.b.query(temporalQuery) : temporalQuery.queryFrom(this);
        }

        @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
        public ValueRange range(TemporalField temporalField) {
            return (this.a == null || !temporalField.isDateBased()) ? this.b.range(temporalField) : this.a.range(temporalField);
        }
    }

    public d(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        this.a = a(temporalAccessor, dateTimeFormatter);
        this.b = dateTimeFormatter.getLocale();
        this.c = dateTimeFormatter.getDecimalStyle();
    }

    private static TemporalAccessor a(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.getChronology();
        ZoneId zone = dateTimeFormatter.getZone();
        if (chronology == null && zone == null) {
            return temporalAccessor;
        }
        Chronology chronology2 = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zoneId());
        ChronoLocalDate chronoLocalDateDate = null;
        if (Jdk8Methods.equals(chronology2, chronology)) {
            chronology = null;
        }
        if (Jdk8Methods.equals(zoneId, zone)) {
            zone = null;
        }
        if (chronology == null && zone == null) {
            return temporalAccessor;
        }
        Chronology chronology3 = chronology != null ? chronology : chronology2;
        if (zone != null) {
            zoneId = zone;
        }
        if (zone != null) {
            if (temporalAccessor.isSupported(ChronoField.INSTANT_SECONDS)) {
                if (chronology3 == null) {
                    chronology3 = IsoChronology.INSTANCE;
                }
                return chronology3.zonedDateTime(Instant.from(temporalAccessor), zone);
            }
            ZoneId zoneIdNormalized = zone.normalized();
            ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.query(TemporalQueries.offset());
            if ((zoneIdNormalized instanceof ZoneOffset) && zoneOffset != null && !zoneIdNormalized.equals(zoneOffset)) {
                throw new DateTimeException("Invalid override zone for temporal: " + zone + " " + temporalAccessor);
            }
        }
        if (chronology != null) {
            if (temporalAccessor.isSupported(ChronoField.EPOCH_DAY)) {
                chronoLocalDateDate = chronology3.date(temporalAccessor);
            } else if (chronology != IsoChronology.INSTANCE || chronology2 != null) {
                for (ChronoField chronoField : ChronoField.values()) {
                    if (chronoField.isDateBased() && temporalAccessor.isSupported(chronoField)) {
                        throw new DateTimeException("Invalid override chronology for temporal: " + chronology + " " + temporalAccessor);
                    }
                }
            }
        }
        return new a(chronoLocalDateDate, temporalAccessor, chronology3, zoneId);
    }

    public void b() {
        this.d--;
    }

    public Locale c() {
        return this.b;
    }

    public DecimalStyle d() {
        return this.c;
    }

    public TemporalAccessor e() {
        return this.a;
    }

    public Long f(TemporalField temporalField) {
        try {
            return Long.valueOf(this.a.getLong(temporalField));
        } catch (DateTimeException e) {
            if (this.d > 0) {
                return null;
            }
            throw e;
        }
    }

    public <R> R g(TemporalQuery<R> temporalQuery) {
        R r = (R) this.a.query(temporalQuery);
        if (r != null || this.d != 0) {
            return r;
        }
        throw new DateTimeException("Unable to extract value: " + this.a.getClass());
    }

    public void h(TemporalAccessor temporalAccessor) {
        Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        this.a = temporalAccessor;
    }

    public void i(Locale locale) {
        Jdk8Methods.requireNonNull(locale, "locale");
        this.b = locale;
    }

    public void j() {
        this.d++;
    }

    public String toString() {
        return this.a.toString();
    }

    public d(TemporalAccessor temporalAccessor, Locale locale, DecimalStyle decimalStyle) {
        this.a = temporalAccessor;
        this.b = locale;
        this.c = decimalStyle;
    }
}
