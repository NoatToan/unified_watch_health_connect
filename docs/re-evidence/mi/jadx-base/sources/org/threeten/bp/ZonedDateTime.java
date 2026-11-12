package org.threeten.bp;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.a5p;
import defpackage.b5p;
import defpackage.c5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.i1s;
import defpackage.iq5;
import defpackage.iwl;
import defpackage.s4p;
import defpackage.t4p;
import defpackage.w4p;
import defpackage.y4p;
import defpackage.z4p;
import defpackage.zv3;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.zone.ZoneOffsetTransition;

/* JADX INFO: loaded from: classes3.dex */
public final class ZonedDateTime extends zv3<LocalDate> implements s4p, Serializable {
    public static final b5p<ZonedDateTime> FROM = new a();
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
    private final ZoneId zone;

    public class a implements b5p<ZonedDateTime> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ZonedDateTime a(t4p t4pVar) {
            return ZonedDateTime.from(t4pVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29607a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f29607a = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29607a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.dateTime = localDateTime;
        this.offset = zoneOffset;
        this.zone = zoneId;
    }

    private static ZonedDateTime create(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetA = zoneId.getRules().a(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.ofEpochSecond(j, i, zoneOffsetA), zoneOffsetA, zoneId);
    }

    public static ZonedDateTime from(t4p t4pVar) {
        if (t4pVar instanceof ZonedDateTime) {
            return (ZonedDateTime) t4pVar;
        }
        try {
            ZoneId zoneIdFrom = ZoneId.from(t4pVar);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (t4pVar.isSupported(chronoField)) {
                try {
                    return create(t4pVar.getLong(chronoField), t4pVar.get(ChronoField.NANO_OF_SECOND), zoneIdFrom);
                } catch (DateTimeException unused) {
                }
            }
            return of(LocalDateTime.from(t4pVar), zoneIdFrom);
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
        }
    }

    public static ZonedDateTime now() {
        return now(g14.d());
    }

    public static ZonedDateTime of(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return of(LocalDateTime.of(localDate, localTime), zoneId);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        crd.i(instant, "instant");
        crd.i(zoneId, "zone");
        return create(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    private static ZonedDateTime ofLenient(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        crd.i(localDateTime, "localDateTime");
        crd.i(zoneOffset, "offset");
        crd.i(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || zoneOffset.equals(zoneId)) {
            return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    public static ZonedDateTime ofLocal(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        crd.i(localDateTime, "localDateTime");
        crd.i(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        i1s rules = zoneId.getRules();
        List<ZoneOffset> listC = rules.c(localDateTime);
        if (listC.size() == 1) {
            zoneOffset = listC.get(0);
        } else if (listC.size() == 0) {
            ZoneOffsetTransition zoneOffsetTransitionB = rules.b(localDateTime);
            localDateTime = localDateTime.plusSeconds(zoneOffsetTransitionB.getDuration().getSeconds());
            zoneOffset = zoneOffsetTransitionB.getOffsetAfter();
        } else if (zoneOffset == null || !listC.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) crd.i(listC.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    public static ZonedDateTime ofStrict(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        crd.i(localDateTime, "localDateTime");
        crd.i(zoneOffset, "offset");
        crd.i(zoneId, "zone");
        i1s rules = zoneId.getRules();
        if (rules.f(localDateTime, zoneOffset)) {
            return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
        }
        ZoneOffsetTransition zoneOffsetTransitionB = rules.b(localDateTime);
        if (zoneOffsetTransitionB != null && zoneOffsetTransitionB.isGap()) {
            throw new DateTimeException("LocalDateTime '" + localDateTime + "' does not exist in zone '" + zoneId + "' due to a gap in the local time-line, typically caused by daylight savings");
        }
        throw new DateTimeException("ZoneOffset '" + zoneOffset + "' is not valid for LocalDateTime '" + localDateTime + "' in zone '" + zoneId + "'");
    }

    public static ZonedDateTime parse(CharSequence charSequence) {
        return parse(charSequence, iq5.p);
    }

    public static ZonedDateTime readExternal(DataInput dataInput) throws IOException {
        return ofLenient(LocalDateTime.readExternal(dataInput), ZoneOffset.readExternal(dataInput), (ZoneId) iwl.a(dataInput));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private ZonedDateTime resolveInstant(LocalDateTime localDateTime) {
        return ofInstant(localDateTime, this.offset, this.zone);
    }

    private ZonedDateTime resolveLocal(LocalDateTime localDateTime) {
        return ofLocal(localDateTime, this.zone, this.offset);
    }

    private ZonedDateTime resolveOffset(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.offset) || !this.zone.getRules().f(this.dateTime, zoneOffset)) ? this : new ZonedDateTime(this.dateTime, zoneOffset, this.zone);
    }

    private Object writeReplace() {
        return new iwl((byte) 6, this);
    }

    @Override // defpackage.zv3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.dateTime.equals(zonedDateTime.dateTime) && this.offset.equals(zonedDateTime.offset) && this.zone.equals(zonedDateTime.zone);
    }

    @Override // defpackage.zv3
    public String format(iq5 iq5Var) {
        return super.format(iq5Var);
    }

    @Override // defpackage.zv3, defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return super.get(z4pVar);
        }
        int i = b.f29607a[((ChronoField) z4pVar).ordinal()];
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

    @Override // defpackage.zv3, defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        int i = b.f29607a[((ChronoField) z4pVar).ordinal()];
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

    @Override // defpackage.zv3
    public ZoneOffset getOffset() {
        return this.offset;
    }

    public int getSecond() {
        return this.dateTime.getSecond();
    }

    public int getYear() {
        return this.dateTime.getYear();
    }

    @Override // defpackage.zv3
    public ZoneId getZone() {
        return this.zone;
    }

    @Override // defpackage.zv3
    public int hashCode() {
        return (this.dateTime.hashCode() ^ this.offset.hashCode()) ^ Integer.rotateLeft(this.zone.hashCode(), 3);
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        return (z4pVar instanceof ChronoField) || (z4pVar != null && z4pVar.isSupportedBy(this));
    }

    @Override // defpackage.zv3, defpackage.rv5, defpackage.s4p
    public ZonedDateTime minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public ZonedDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public ZonedDateTime minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1L) : plusHours(-j);
    }

    public ZonedDateTime minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1L) : plusMinutes(-j);
    }

    public ZonedDateTime minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public ZonedDateTime minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1L) : plusNanos(-j);
    }

    public ZonedDateTime minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    public ZonedDateTime minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1L) : plusWeeks(-j);
    }

    public ZonedDateTime minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public ZonedDateTime plusDays(long j) {
        return resolveLocal(this.dateTime.plusDays(j));
    }

    public ZonedDateTime plusHours(long j) {
        return resolveInstant(this.dateTime.plusHours(j));
    }

    public ZonedDateTime plusMinutes(long j) {
        return resolveInstant(this.dateTime.plusMinutes(j));
    }

    public ZonedDateTime plusMonths(long j) {
        return resolveLocal(this.dateTime.plusMonths(j));
    }

    public ZonedDateTime plusNanos(long j) {
        return resolveInstant(this.dateTime.plusNanos(j));
    }

    public ZonedDateTime plusSeconds(long j) {
        return resolveInstant(this.dateTime.plusSeconds(j));
    }

    public ZonedDateTime plusWeeks(long j) {
        return resolveLocal(this.dateTime.plusWeeks(j));
    }

    public ZonedDateTime plusYears(long j) {
        return resolveLocal(this.dateTime.plusYears(j));
    }

    @Override // defpackage.zv3, defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        return b5pVar == a5p.b() ? (R) toLocalDate() : (R) super.query(b5pVar);
    }

    @Override // defpackage.zv3, defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return (z4pVar == ChronoField.INSTANT_SECONDS || z4pVar == ChronoField.OFFSET_SECONDS) ? z4pVar.range() : this.dateTime.range(z4pVar);
        }
        return z4pVar.rangeRefinedBy(this);
    }

    @Override // defpackage.zv3
    public LocalTime toLocalTime() {
        return this.dateTime.toLocalTime();
    }

    public OffsetDateTime toOffsetDateTime() {
        return OffsetDateTime.of(this.dateTime, this.offset);
    }

    @Override // defpackage.zv3
    public String toString() {
        String str = this.dateTime.toString() + this.offset.toString();
        if (this.offset == this.zone) {
            return str;
        }
        return str + AbstractJsonLexerKt.BEGIN_LIST + this.zone.toString() + AbstractJsonLexerKt.END_LIST;
    }

    public ZonedDateTime truncatedTo(c5p c5pVar) {
        return resolveLocal(this.dateTime.truncatedTo(c5pVar));
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        ZonedDateTime zonedDateTimeFrom = from((t4p) s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, zonedDateTimeFrom);
        }
        ZonedDateTime zonedDateTimeWithZoneSameInstant = zonedDateTimeFrom.withZoneSameInstant(this.zone);
        return c5pVar.isDateBased() ? this.dateTime.until(zonedDateTimeWithZoneSameInstant.dateTime, c5pVar) : toOffsetDateTime().until(zonedDateTimeWithZoneSameInstant.toOffsetDateTime(), c5pVar);
    }

    public ZonedDateTime withDayOfMonth(int i) {
        return resolveLocal(this.dateTime.withDayOfMonth(i));
    }

    public ZonedDateTime withDayOfYear(int i) {
        return resolveLocal(this.dateTime.withDayOfYear(i));
    }

    public ZonedDateTime withFixedOffsetZone() {
        if (this.zone.equals(this.offset)) {
            return this;
        }
        LocalDateTime localDateTime = this.dateTime;
        ZoneOffset zoneOffset = this.offset;
        return new ZonedDateTime(localDateTime, zoneOffset, zoneOffset);
    }

    public ZonedDateTime withHour(int i) {
        return resolveLocal(this.dateTime.withHour(i));
    }

    public ZonedDateTime withMinute(int i) {
        return resolveLocal(this.dateTime.withMinute(i));
    }

    public ZonedDateTime withMonth(int i) {
        return resolveLocal(this.dateTime.withMonth(i));
    }

    public ZonedDateTime withNano(int i) {
        return resolveLocal(this.dateTime.withNano(i));
    }

    public ZonedDateTime withSecond(int i) {
        return resolveLocal(this.dateTime.withSecond(i));
    }

    public ZonedDateTime withYear(int i) {
        return resolveLocal(this.dateTime.withYear(i));
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        this.dateTime.writeExternal(dataOutput);
        this.offset.writeExternal(dataOutput);
        this.zone.write(dataOutput);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return ofLocal(localDateTime, zoneId, null);
    }

    public static ZonedDateTime parse(CharSequence charSequence, iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return (ZonedDateTime) iq5Var.h(charSequence, FROM);
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar.isDateBased() || c5pVar.isTimeBased();
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    @Override // defpackage.zv3
    public LocalDate toLocalDate() {
        return this.dateTime.toLocalDate();
    }

    @Override // defpackage.zv3
    public LocalDateTime toLocalDateTime() {
        return this.dateTime;
    }

    @Override // defpackage.zv3
    public ZonedDateTime withEarlierOffsetAtOverlap() {
        ZoneOffsetTransition zoneOffsetTransitionB = getZone().getRules().b(this.dateTime);
        if (zoneOffsetTransitionB != null && zoneOffsetTransitionB.isOverlap()) {
            ZoneOffset offsetBefore = zoneOffsetTransitionB.getOffsetBefore();
            if (!offsetBefore.equals(this.offset)) {
                return new ZonedDateTime(this.dateTime, offsetBefore, this.zone);
            }
        }
        return this;
    }

    @Override // defpackage.zv3
    public ZonedDateTime withLaterOffsetAtOverlap() {
        ZoneOffsetTransition zoneOffsetTransitionB = getZone().getRules().b(toLocalDateTime());
        if (zoneOffsetTransitionB != null) {
            ZoneOffset offsetAfter = zoneOffsetTransitionB.getOffsetAfter();
            if (!offsetAfter.equals(this.offset)) {
                return new ZonedDateTime(this.dateTime, offsetAfter, this.zone);
            }
        }
        return this;
    }

    @Override // defpackage.zv3
    public ZonedDateTime withZoneSameInstant(ZoneId zoneId) {
        crd.i(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : create(this.dateTime.toEpochSecond(this.offset), this.dateTime.getNano(), zoneId);
    }

    @Override // defpackage.zv3
    public ZonedDateTime withZoneSameLocal(ZoneId zoneId) {
        crd.i(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : ofLocal(this.dateTime, zoneId, this.offset);
    }

    public static ZonedDateTime now(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        return ofInstant(g14Var.b(), g14Var.a());
    }

    public static ZonedDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ZoneId zoneId) {
        return ofLocal(LocalDateTime.of(i, i2, i3, i4, i5, i6, i7), zoneId, null);
    }

    public static ZonedDateTime ofInstant(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        crd.i(localDateTime, "localDateTime");
        crd.i(zoneOffset, "offset");
        crd.i(zoneId, "zone");
        return create(localDateTime.toEpochSecond(zoneOffset), localDateTime.getNano(), zoneId);
    }

    @Override // defpackage.zv3, defpackage.rv5
    public ZonedDateTime plus(y4p y4pVar) {
        return (ZonedDateTime) y4pVar.addTo(this);
    }

    @Override // defpackage.zv3, defpackage.rv5, defpackage.s4p
    public ZonedDateTime with(w4p w4pVar) {
        if (w4pVar instanceof LocalDate) {
            return resolveLocal(LocalDateTime.of((LocalDate) w4pVar, this.dateTime.toLocalTime()));
        }
        if (w4pVar instanceof LocalTime) {
            return resolveLocal(LocalDateTime.of(this.dateTime.toLocalDate(), (LocalTime) w4pVar));
        }
        if (w4pVar instanceof LocalDateTime) {
            return resolveLocal((LocalDateTime) w4pVar);
        }
        if (w4pVar instanceof Instant) {
            Instant instant = (Instant) w4pVar;
            return create(instant.getEpochSecond(), instant.getNano(), this.zone);
        }
        if (w4pVar instanceof ZoneOffset) {
            return resolveOffset((ZoneOffset) w4pVar);
        }
        return (ZonedDateTime) w4pVar.adjustInto(this);
    }

    @Override // defpackage.zv3, defpackage.s4p
    public ZonedDateTime plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            if (c5pVar.isDateBased()) {
                return resolveLocal(this.dateTime.plus(j, c5pVar));
            }
            return resolveInstant(this.dateTime.plus(j, c5pVar));
        }
        return (ZonedDateTime) c5pVar.addTo(this, j);
    }

    @Override // defpackage.zv3, defpackage.rv5
    public ZonedDateTime minus(y4p y4pVar) {
        return (ZonedDateTime) y4pVar.subtractFrom(this);
    }

    @Override // defpackage.zv3, defpackage.s4p
    public ZonedDateTime with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) z4pVar;
            int i = b.f29607a[chronoField.ordinal()];
            if (i == 1) {
                return create(j, getNano(), this.zone);
            }
            if (i != 2) {
                return resolveLocal(this.dateTime.with(z4pVar, j));
            }
            return resolveOffset(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j)));
        }
        return (ZonedDateTime) z4pVar.adjustInto(this, j);
    }
}
