package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes23.dex */
public final class OffsetTime extends DefaultInterfaceTemporalAccessor implements Temporal, TemporalAdjuster, Comparable<OffsetTime>, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final LocalTime a;
    private final ZoneOffset b;
    public static final OffsetTime MIN = LocalTime.MIN.atOffset(ZoneOffset.MAX);
    public static final OffsetTime MAX = LocalTime.MAX.atOffset(ZoneOffset.MIN);
    public static final TemporalQuery<OffsetTime> FROM = new a();

    public class a implements TemporalQuery<OffsetTime> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OffsetTime queryFrom(TemporalAccessor temporalAccessor) {
            return OffsetTime.from(temporalAccessor);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        this.a = (LocalTime) Jdk8Methods.requireNonNull(localTime, "time");
        this.b = (ZoneOffset) Jdk8Methods.requireNonNull(zoneOffset, "offset");
    }

    public static OffsetTime a(DataInput dataInput) throws IOException {
        return of(LocalTime.e(dataInput), ZoneOffset.e(dataInput));
    }

    private long b() {
        return this.a.toNanoOfDay() - (((long) this.b.getTotalSeconds()) * 1000000000);
    }

    private OffsetTime c(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new OffsetTime(localTime, zoneOffset);
    }

    public static OffsetTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetTime) {
            return (OffsetTime) temporalAccessor;
        }
        try {
            return new OffsetTime(LocalTime.from(temporalAccessor), ZoneOffset.from(temporalAccessor));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporalAccessor + ", type " + temporalAccessor.getClass().getName());
        }
    }

    public static OffsetTime now() {
        return now(Clock.systemDefaultZone());
    }

    public static OffsetTime of(LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetTime(localTime, zoneOffset);
    }

    public static OffsetTime ofInstant(Instant instant, ZoneId zoneId) {
        Jdk8Methods.requireNonNull(instant, "instant");
        Jdk8Methods.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        long epochSecond = ((instant.getEpochSecond() % 86400) + ((long) offset.getTotalSeconds())) % 86400;
        if (epochSecond < 0) {
            epochSecond += 86400;
        }
        return new OffsetTime(LocalTime.c(epochSecond, instant.getNano()), offset);
    }

    public static OffsetTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_OFFSET_TIME);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new org.threeten.bp.a(org.threeten.bp.a.l, this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.NANO_OF_DAY, this.a.toNanoOfDay()).with(ChronoField.OFFSET_SECONDS, getOffset().getTotalSeconds());
    }

    public OffsetDateTime atDate(LocalDate localDate) {
        return OffsetDateTime.of(localDate, this.a, this.b);
    }

    public void e(DataOutput dataOutput) throws IOException {
        this.a.f(dataOutput);
        this.b.h(dataOutput);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetTime)) {
            return false;
        }
        OffsetTime offsetTime = (OffsetTime) obj;
        return this.a.equals(offsetTime.a) && this.b.equals(offsetTime.b);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return super.get(temporalField);
    }

    public int getHour() {
        return this.a.getHour();
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS ? getOffset().getTotalSeconds() : this.a.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    public int getMinute() {
        return this.a.getMinute();
    }

    public int getNano() {
        return this.a.getNano();
    }

    public ZoneOffset getOffset() {
        return this.b;
    }

    public int getSecond() {
        return this.a.getSecond();
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public boolean isAfter(OffsetTime offsetTime) {
        return b() > offsetTime.b();
    }

    public boolean isBefore(OffsetTime offsetTime) {
        return b() < offsetTime.b();
    }

    public boolean isEqual(OffsetTime offsetTime) {
        return b() == offsetTime.b();
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased() || temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    public OffsetTime minusHours(long j) {
        return c(this.a.minusHours(j), this.b);
    }

    public OffsetTime minusMinutes(long j) {
        return c(this.a.minusMinutes(j), this.b);
    }

    public OffsetTime minusNanos(long j) {
        return c(this.a.minusNanos(j), this.b);
    }

    public OffsetTime minusSeconds(long j) {
        return c(this.a.minusSeconds(j), this.b);
    }

    public OffsetTime plusHours(long j) {
        return c(this.a.plusHours(j), this.b);
    }

    public OffsetTime plusMinutes(long j) {
        return c(this.a.plusMinutes(j), this.b);
    }

    public OffsetTime plusNanos(long j) {
        return c(this.a.plusNanos(j), this.b);
    }

    public OffsetTime plusSeconds(long j) {
        return c(this.a.plusSeconds(j), this.b);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.precision()) {
            return (R) ChronoUnit.NANOS;
        }
        if (temporalQuery == TemporalQueries.offset() || temporalQuery == TemporalQueries.zone()) {
            return (R) getOffset();
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return (R) this.a;
        }
        if (temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.localDate() || temporalQuery == TemporalQueries.zoneId()) {
            return null;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS ? temporalField.range() : this.a.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    public LocalTime toLocalTime() {
        return this.a;
    }

    public String toString() {
        return this.a.toString() + this.b.toString();
    }

    public OffsetTime truncatedTo(TemporalUnit temporalUnit) {
        return c(this.a.truncatedTo(temporalUnit), this.b);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetTime offsetTimeFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, offsetTimeFrom);
        }
        long jB = offsetTimeFrom.b() - b();
        switch (b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jB;
            case 2:
                return jB / 1000;
            case 3:
                return jB / 1000000;
            case 4:
                return jB / 1000000000;
            case 5:
                return jB / LocalTime.o;
            case 6:
                return jB / LocalTime.p;
            case 7:
                return jB / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    public OffsetTime withHour(int i) {
        return c(this.a.withHour(i), this.b);
    }

    public OffsetTime withMinute(int i) {
        return c(this.a.withMinute(i), this.b);
    }

    public OffsetTime withNano(int i) {
        return c(this.a.withNano(i), this.b);
    }

    public OffsetTime withOffsetSameInstant(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.b)) {
            return this;
        }
        return new OffsetTime(this.a.plusSeconds(zoneOffset.getTotalSeconds() - this.b.getTotalSeconds()), zoneOffset);
    }

    public OffsetTime withOffsetSameLocal(ZoneOffset zoneOffset) {
        return (zoneOffset == null || !zoneOffset.equals(this.b)) ? new OffsetTime(this.a, zoneOffset) : this;
    }

    public OffsetTime withSecond(int i) {
        return c(this.a.withSecond(i), this.b);
    }

    public static OffsetTime now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static OffsetTime of(int i, int i2, int i3, int i4, ZoneOffset zoneOffset) {
        return new OffsetTime(LocalTime.of(i, i2, i3, i4), zoneOffset);
    }

    public static OffsetTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetTime) dateTimeFormatter.parse(charSequence, FROM);
    }

    @Override // java.lang.Comparable
    public int compareTo(OffsetTime offsetTime) {
        if (this.b.equals(offsetTime.b)) {
            return this.a.compareTo(offsetTime.a);
        }
        int iCompareLongs = Jdk8Methods.compareLongs(b(), offsetTime.b());
        return iCompareLongs == 0 ? this.a.compareTo(offsetTime.a) : iCompareLongs;
    }

    public static OffsetTime now(Clock clock) {
        Jdk8Methods.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        return ofInstant(instant, clock.getZone().getRules().getOffset(instant));
    }

    @Override // org.threeten.bp.temporal.Temporal
    public OffsetTime minus(TemporalAmount temporalAmount) {
        return (OffsetTime) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public OffsetTime plus(TemporalAmount temporalAmount) {
        return (OffsetTime) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public OffsetTime with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalTime) {
            return c((LocalTime) temporalAdjuster, this.b);
        }
        if (temporalAdjuster instanceof ZoneOffset) {
            return c(this.a, (ZoneOffset) temporalAdjuster);
        }
        if (temporalAdjuster instanceof OffsetTime) {
            return (OffsetTime) temporalAdjuster;
        }
        return (OffsetTime) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public boolean isSupported(TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return temporalUnit.isTimeBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public OffsetTime minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public OffsetTime plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return c(this.a.plus(j, temporalUnit), this.b);
        }
        return (OffsetTime) temporalUnit.addTo(this, j);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public OffsetTime with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return c(this.a, ZoneOffset.ofTotalSeconds(((ChronoField) temporalField).checkValidIntValue(j)));
            }
            return c(this.a.with(temporalField, j), this.b);
        }
        return (OffsetTime) temporalField.adjustInto(this, j);
    }
}
