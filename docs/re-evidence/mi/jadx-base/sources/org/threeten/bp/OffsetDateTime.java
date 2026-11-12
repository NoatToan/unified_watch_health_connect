package org.threeten.bp;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.a5p;
import defpackage.b5p;
import defpackage.c5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.iq5;
import defpackage.iwl;
import defpackage.rv5;
import defpackage.s4p;
import defpackage.t4p;
import defpackage.vv3;
import defpackage.w4p;
import defpackage.y4p;
import defpackage.z4p;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Comparator;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class OffsetDateTime extends rv5 implements s4p, w4p, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
    public static final OffsetDateTime MIN = LocalDateTime.MIN.atOffset(ZoneOffset.MAX);
    public static final OffsetDateTime MAX = LocalDateTime.MAX.atOffset(ZoneOffset.MIN);
    public static final b5p<OffsetDateTime> FROM = new a();
    private static final Comparator<OffsetDateTime> INSTANT_COMPARATOR = new b();

    public class a implements b5p<OffsetDateTime> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OffsetDateTime a(t4p t4pVar) {
            return OffsetDateTime.from(t4pVar);
        }
    }

    public class b implements Comparator<OffsetDateTime> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
            int iB = crd.b(offsetDateTime.toEpochSecond(), offsetDateTime2.toEpochSecond());
            return iB == 0 ? crd.b(offsetDateTime.getNano(), offsetDateTime2.getNano()) : iB;
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29600a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f29600a = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29600a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.dateTime = (LocalDateTime) crd.i(localDateTime, "dateTime");
        this.offset = (ZoneOffset) crd.i(zoneOffset, "offset");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [org.threeten.bp.OffsetDateTime] */
    public static OffsetDateTime from(t4p t4pVar) {
        if (t4pVar instanceof OffsetDateTime) {
            return (OffsetDateTime) t4pVar;
        }
        try {
            ZoneOffset zoneOffsetFrom = ZoneOffset.from(t4pVar);
            try {
                t4pVar = of(LocalDateTime.from(t4pVar), zoneOffsetFrom);
                return t4pVar;
            } catch (DateTimeException unused) {
                return ofInstant(Instant.from(t4pVar), zoneOffsetFrom);
            }
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
        }
    }

    public static OffsetDateTime now() {
        return now(g14.d());
    }

    public static OffsetDateTime of(LocalDate localDate, LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.of(localDate, localTime), zoneOffset);
    }

    public static OffsetDateTime ofInstant(Instant instant, ZoneId zoneId) {
        crd.i(instant, "instant");
        crd.i(zoneId, "zone");
        ZoneOffset zoneOffsetA = zoneId.getRules().a(instant);
        return new OffsetDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneOffsetA), zoneOffsetA);
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        return parse(charSequence, iq5.o);
    }

    public static OffsetDateTime readExternal(DataInput dataInput) throws IOException {
        return of(LocalDateTime.readExternal(dataInput), ZoneOffset.readExternal(dataInput));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Comparator<OffsetDateTime> timeLineOrder() {
        return INSTANT_COMPARATOR;
    }

    private Object writeReplace() {
        return new iwl((byte) 69, this);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        return s4pVar.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay()).with(ChronoField.OFFSET_SECONDS, getOffset().getTotalSeconds());
    }

    public ZonedDateTime atZoneSameInstant(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this.dateTime, this.offset, zoneId);
    }

    public ZonedDateTime atZoneSimilarLocal(ZoneId zoneId) {
        return ZonedDateTime.ofLocal(this.dateTime, zoneId, this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.dateTime.equals(offsetDateTime.dateTime) && this.offset.equals(offsetDateTime.offset);
    }

    public String format(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return iq5Var.b(this);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return super.get(z4pVar);
        }
        int i = c.f29600a[((ChronoField) z4pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.dateTime.get(z4pVar) : getOffset().getTotalSeconds();
        }
        throw new DateTimeException("Field too large for an int: " + z4pVar);
    }

    public int getDayOfMonth() {
        return this.dateTime.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return this.dateTime.getDayOfWeek();
    }

    public int getDayOfYear() {
        return this.dateTime.getDayOfYear();
    }

    public int getHour() {
        return this.dateTime.getHour();
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        int i = c.f29600a[((ChronoField) z4pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.dateTime.getLong(z4pVar) : getOffset().getTotalSeconds();
        }
        return toEpochSecond();
    }

    public int getMinute() {
        return this.dateTime.getMinute();
    }

    public Month getMonth() {
        return this.dateTime.getMonth();
    }

    public int getMonthValue() {
        return this.dateTime.getMonthValue();
    }

    public int getNano() {
        return this.dateTime.getNano();
    }

    public ZoneOffset getOffset() {
        return this.offset;
    }

    public int getSecond() {
        return this.dateTime.getSecond();
    }

    public int getYear() {
        return this.dateTime.getYear();
    }

    public int hashCode() {
        return this.dateTime.hashCode() ^ this.offset.hashCode();
    }

    public boolean isAfter(OffsetDateTime offsetDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = offsetDateTime.toEpochSecond();
        return epochSecond > epochSecond2 || (epochSecond == epochSecond2 && toLocalTime().getNano() > offsetDateTime.toLocalTime().getNano());
    }

    public boolean isBefore(OffsetDateTime offsetDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = offsetDateTime.toEpochSecond();
        return epochSecond < epochSecond2 || (epochSecond == epochSecond2 && toLocalTime().getNano() < offsetDateTime.toLocalTime().getNano());
    }

    public boolean isEqual(OffsetDateTime offsetDateTime) {
        return toEpochSecond() == offsetDateTime.toEpochSecond() && toLocalTime().getNano() == offsetDateTime.toLocalTime().getNano();
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        return (z4pVar instanceof ChronoField) || (z4pVar != null && z4pVar.isSupportedBy(this));
    }

    @Override // defpackage.rv5, defpackage.s4p
    public OffsetDateTime minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public OffsetDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public OffsetDateTime minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1L) : plusHours(-j);
    }

    public OffsetDateTime minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1L) : plusMinutes(-j);
    }

    public OffsetDateTime minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public OffsetDateTime minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1L) : plusNanos(-j);
    }

    public OffsetDateTime minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    public OffsetDateTime minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1L) : plusWeeks(-j);
    }

    public OffsetDateTime minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public OffsetDateTime plusDays(long j) {
        return with(this.dateTime.plusDays(j), this.offset);
    }

    public OffsetDateTime plusHours(long j) {
        return with(this.dateTime.plusHours(j), this.offset);
    }

    public OffsetDateTime plusMinutes(long j) {
        return with(this.dateTime.plusMinutes(j), this.offset);
    }

    public OffsetDateTime plusMonths(long j) {
        return with(this.dateTime.plusMonths(j), this.offset);
    }

    public OffsetDateTime plusNanos(long j) {
        return with(this.dateTime.plusNanos(j), this.offset);
    }

    public OffsetDateTime plusSeconds(long j) {
        return with(this.dateTime.plusSeconds(j), this.offset);
    }

    public OffsetDateTime plusWeeks(long j) {
        return with(this.dateTime.plusWeeks(j), this.offset);
    }

    public OffsetDateTime plusYears(long j) {
        return with(this.dateTime.plusYears(j), this.offset);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.a()) {
            return (R) IsoChronology.INSTANCE;
        }
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (b5pVar == a5p.d() || b5pVar == a5p.f()) {
            return (R) getOffset();
        }
        if (b5pVar == a5p.b()) {
            return (R) toLocalDate();
        }
        if (b5pVar == a5p.c()) {
            return (R) toLocalTime();
        }
        if (b5pVar == a5p.g()) {
            return null;
        }
        return (R) super.query(b5pVar);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return (z4pVar == ChronoField.INSTANT_SECONDS || z4pVar == ChronoField.OFFSET_SECONDS) ? z4pVar.range() : this.dateTime.range(z4pVar);
        }
        return z4pVar.rangeRefinedBy(this);
    }

    public long toEpochSecond() {
        return this.dateTime.toEpochSecond(this.offset);
    }

    public Instant toInstant() {
        return this.dateTime.toInstant(this.offset);
    }

    public LocalDate toLocalDate() {
        return this.dateTime.toLocalDate();
    }

    public LocalDateTime toLocalDateTime() {
        return this.dateTime;
    }

    public LocalTime toLocalTime() {
        return this.dateTime.toLocalTime();
    }

    public OffsetTime toOffsetTime() {
        return OffsetTime.of(this.dateTime.toLocalTime(), this.offset);
    }

    public String toString() {
        return this.dateTime.toString() + this.offset.toString();
    }

    public ZonedDateTime toZonedDateTime() {
        return ZonedDateTime.of(this.dateTime, this.offset);
    }

    public OffsetDateTime truncatedTo(c5p c5pVar) {
        return with(this.dateTime.truncatedTo(c5pVar), this.offset);
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        OffsetDateTime offsetDateTimeFrom = from(s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, offsetDateTimeFrom);
        }
        return this.dateTime.until(offsetDateTimeFrom.withOffsetSameInstant(this.offset).dateTime, c5pVar);
    }

    public OffsetDateTime withDayOfMonth(int i) {
        return with(this.dateTime.withDayOfMonth(i), this.offset);
    }

    public OffsetDateTime withDayOfYear(int i) {
        return with(this.dateTime.withDayOfYear(i), this.offset);
    }

    public OffsetDateTime withHour(int i) {
        return with(this.dateTime.withHour(i), this.offset);
    }

    public OffsetDateTime withMinute(int i) {
        return with(this.dateTime.withMinute(i), this.offset);
    }

    public OffsetDateTime withMonth(int i) {
        return with(this.dateTime.withMonth(i), this.offset);
    }

    public OffsetDateTime withNano(int i) {
        return with(this.dateTime.withNano(i), this.offset);
    }

    public OffsetDateTime withOffsetSameInstant(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.offset)) {
            return this;
        }
        return new OffsetDateTime(this.dateTime.plusSeconds(zoneOffset.getTotalSeconds() - this.offset.getTotalSeconds()), zoneOffset);
    }

    public OffsetDateTime withOffsetSameLocal(ZoneOffset zoneOffset) {
        return with(this.dateTime, zoneOffset);
    }

    public OffsetDateTime withSecond(int i) {
        return with(this.dateTime.withSecond(i), this.offset);
    }

    public OffsetDateTime withYear(int i) {
        return with(this.dateTime.withYear(i), this.offset);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        this.dateTime.writeExternal(dataOutput);
        this.offset.writeExternal(dataOutput);
    }

    public static OffsetDateTime now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    public static OffsetDateTime parse(CharSequence charSequence, iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return (OffsetDateTime) iq5Var.h(charSequence, FROM);
    }

    @Override // java.lang.Comparable
    public int compareTo(OffsetDateTime offsetDateTime) {
        if (getOffset().equals(offsetDateTime.getOffset())) {
            return toLocalDateTime().compareTo((vv3<?>) offsetDateTime.toLocalDateTime());
        }
        int iB = crd.b(toEpochSecond(), offsetDateTime.toEpochSecond());
        if (iB != 0) {
            return iB;
        }
        int nano = toLocalTime().getNano() - offsetDateTime.toLocalTime().getNano();
        return nano == 0 ? toLocalDateTime().compareTo((vv3<?>) offsetDateTime.toLocalDateTime()) : nano;
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar.isDateBased() || c5pVar.isTimeBased();
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    public static OffsetDateTime now(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        Instant instantB = g14Var.b();
        return ofInstant(instantB, g14Var.a().getRules().a(instantB));
    }

    public static OffsetDateTime of(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    private OffsetDateTime with(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.dateTime == localDateTime && this.offset.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // defpackage.rv5
    public OffsetDateTime plus(y4p y4pVar) {
        return (OffsetDateTime) y4pVar.addTo(this);
    }

    public static OffsetDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.of(i, i2, i3, i4, i5, i6, i7), zoneOffset);
    }

    @Override // defpackage.s4p
    public OffsetDateTime plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return with(this.dateTime.plus(j, c5pVar), this.offset);
        }
        return (OffsetDateTime) c5pVar.addTo(this, j);
    }

    @Override // defpackage.rv5
    public OffsetDateTime minus(y4p y4pVar) {
        return (OffsetDateTime) y4pVar.subtractFrom(this);
    }

    @Override // defpackage.rv5, defpackage.s4p
    public OffsetDateTime with(w4p w4pVar) {
        if (!(w4pVar instanceof LocalDate) && !(w4pVar instanceof LocalTime) && !(w4pVar instanceof LocalDateTime)) {
            if (w4pVar instanceof Instant) {
                return ofInstant((Instant) w4pVar, this.offset);
            }
            if (w4pVar instanceof ZoneOffset) {
                return with(this.dateTime, (ZoneOffset) w4pVar);
            }
            if (w4pVar instanceof OffsetDateTime) {
                return (OffsetDateTime) w4pVar;
            }
            return (OffsetDateTime) w4pVar.adjustInto(this);
        }
        return with(this.dateTime.with(w4pVar), this.offset);
    }

    @Override // defpackage.s4p
    public OffsetDateTime with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) z4pVar;
            int i = c.f29600a[chronoField.ordinal()];
            if (i == 1) {
                return ofInstant(Instant.ofEpochSecond(j, getNano()), this.offset);
            }
            if (i != 2) {
                return with(this.dateTime.with(z4pVar, j), this.offset);
            }
            return with(this.dateTime, ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j)));
        }
        return (OffsetDateTime) z4pVar.adjustInto(this, j);
    }
}
