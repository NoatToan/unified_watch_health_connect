package org.threeten.bp;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.a5p;
import defpackage.b5p;
import defpackage.c5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.iq5;
import defpackage.iwl;
import defpackage.s4p;
import defpackage.sv5;
import defpackage.t4p;
import defpackage.w4p;
import defpackage.y4p;
import defpackage.z4p;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import miuix.animation.internal.FolmeCore;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class OffsetTime extends sv5 implements s4p, w4p, Comparable<OffsetTime>, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final ZoneOffset offset;
    private final LocalTime time;
    public static final OffsetTime MIN = LocalTime.MIN.atOffset(ZoneOffset.MAX);
    public static final OffsetTime MAX = LocalTime.MAX.atOffset(ZoneOffset.MIN);
    public static final b5p<OffsetTime> FROM = new a();

    public class a implements b5p<OffsetTime> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OffsetTime a(t4p t4pVar) {
            return OffsetTime.from(t4pVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29601a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f29601a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29601a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29601a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29601a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29601a[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29601a[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29601a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        this.time = (LocalTime) crd.i(localTime, "time");
        this.offset = (ZoneOffset) crd.i(zoneOffset, "offset");
    }

    public static OffsetTime from(t4p t4pVar) {
        if (t4pVar instanceof OffsetTime) {
            return (OffsetTime) t4pVar;
        }
        try {
            return new OffsetTime(LocalTime.from(t4pVar), ZoneOffset.from(t4pVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
        }
    }

    public static OffsetTime now() {
        return now(g14.d());
    }

    public static OffsetTime of(LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetTime(localTime, zoneOffset);
    }

    public static OffsetTime ofInstant(Instant instant, ZoneId zoneId) {
        crd.i(instant, "instant");
        crd.i(zoneId, "zone");
        ZoneOffset zoneOffsetA = zoneId.getRules().a(instant);
        long epochSecond = ((instant.getEpochSecond() % 86400) + ((long) zoneOffsetA.getTotalSeconds())) % 86400;
        if (epochSecond < 0) {
            epochSecond += 86400;
        }
        return new OffsetTime(LocalTime.ofSecondOfDay(epochSecond, instant.getNano()), zoneOffsetA);
    }

    public static OffsetTime parse(CharSequence charSequence) {
        return parse(charSequence, iq5.l);
    }

    public static OffsetTime readExternal(DataInput dataInput) throws IOException {
        return of(LocalTime.readExternal(dataInput), ZoneOffset.readExternal(dataInput));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private long toEpochNano() {
        return this.time.toNanoOfDay() - (((long) this.offset.getTotalSeconds()) * FolmeCore.NANOS_TO_S);
    }

    private Object writeReplace() {
        return new iwl((byte) 66, this);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        return s4pVar.with(ChronoField.NANO_OF_DAY, this.time.toNanoOfDay()).with(ChronoField.OFFSET_SECONDS, getOffset().getTotalSeconds());
    }

    public OffsetDateTime atDate(LocalDate localDate) {
        return OffsetDateTime.of(localDate, this.time, this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetTime)) {
            return false;
        }
        OffsetTime offsetTime = (OffsetTime) obj;
        return this.time.equals(offsetTime.time) && this.offset.equals(offsetTime.offset);
    }

    public String format(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return iq5Var.b(this);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        return super.get(z4pVar);
    }

    public int getHour() {
        return this.time.getHour();
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar == ChronoField.OFFSET_SECONDS ? getOffset().getTotalSeconds() : this.time.getLong(z4pVar);
        }
        return z4pVar.getFrom(this);
    }

    public int getMinute() {
        return this.time.getMinute();
    }

    public int getNano() {
        return this.time.getNano();
    }

    public ZoneOffset getOffset() {
        return this.offset;
    }

    public int getSecond() {
        return this.time.getSecond();
    }

    public int hashCode() {
        return this.time.hashCode() ^ this.offset.hashCode();
    }

    public boolean isAfter(OffsetTime offsetTime) {
        return toEpochNano() > offsetTime.toEpochNano();
    }

    public boolean isBefore(OffsetTime offsetTime) {
        return toEpochNano() < offsetTime.toEpochNano();
    }

    public boolean isEqual(OffsetTime offsetTime) {
        return toEpochNano() == offsetTime.toEpochNano();
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased() || z4pVar == ChronoField.OFFSET_SECONDS;
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    @Override // defpackage.s4p
    public OffsetTime minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public OffsetTime minusHours(long j) {
        return with(this.time.minusHours(j), this.offset);
    }

    public OffsetTime minusMinutes(long j) {
        return with(this.time.minusMinutes(j), this.offset);
    }

    public OffsetTime minusNanos(long j) {
        return with(this.time.minusNanos(j), this.offset);
    }

    public OffsetTime minusSeconds(long j) {
        return with(this.time.minusSeconds(j), this.offset);
    }

    public OffsetTime plusHours(long j) {
        return with(this.time.plusHours(j), this.offset);
    }

    public OffsetTime plusMinutes(long j) {
        return with(this.time.plusMinutes(j), this.offset);
    }

    public OffsetTime plusNanos(long j) {
        return with(this.time.plusNanos(j), this.offset);
    }

    public OffsetTime plusSeconds(long j) {
        return with(this.time.plusSeconds(j), this.offset);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (b5pVar == a5p.d() || b5pVar == a5p.f()) {
            return (R) getOffset();
        }
        if (b5pVar == a5p.c()) {
            return (R) this.time;
        }
        if (b5pVar == a5p.a() || b5pVar == a5p.b() || b5pVar == a5p.g()) {
            return null;
        }
        return (R) super.query(b5pVar);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar == ChronoField.OFFSET_SECONDS ? z4pVar.range() : this.time.range(z4pVar);
        }
        return z4pVar.rangeRefinedBy(this);
    }

    public LocalTime toLocalTime() {
        return this.time;
    }

    public String toString() {
        return this.time.toString() + this.offset.toString();
    }

    public OffsetTime truncatedTo(c5p c5pVar) {
        return with(this.time.truncatedTo(c5pVar), this.offset);
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        OffsetTime offsetTimeFrom = from(s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, offsetTimeFrom);
        }
        long epochNano = offsetTimeFrom.toEpochNano() - toEpochNano();
        switch (b.f29601a[((ChronoUnit) c5pVar).ordinal()]) {
            case 1:
                return epochNano;
            case 2:
                return epochNano / 1000;
            case 3:
                return epochNano / FolmeCore.NANOS_TO_MS;
            case 4:
                return epochNano / FolmeCore.NANOS_TO_S;
            case 5:
                return epochNano / 60000000000L;
            case 6:
                return epochNano / 3600000000000L;
            case 7:
                return epochNano / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
        }
    }

    public OffsetTime withHour(int i) {
        return with(this.time.withHour(i), this.offset);
    }

    public OffsetTime withMinute(int i) {
        return with(this.time.withMinute(i), this.offset);
    }

    public OffsetTime withNano(int i) {
        return with(this.time.withNano(i), this.offset);
    }

    public OffsetTime withOffsetSameInstant(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.offset)) {
            return this;
        }
        return new OffsetTime(this.time.plusSeconds(zoneOffset.getTotalSeconds() - this.offset.getTotalSeconds()), zoneOffset);
    }

    public OffsetTime withOffsetSameLocal(ZoneOffset zoneOffset) {
        return (zoneOffset == null || !zoneOffset.equals(this.offset)) ? new OffsetTime(this.time, zoneOffset) : this;
    }

    public OffsetTime withSecond(int i) {
        return with(this.time.withSecond(i), this.offset);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        this.time.writeExternal(dataOutput);
        this.offset.writeExternal(dataOutput);
    }

    public static OffsetTime now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    public static OffsetTime of(int i, int i2, int i3, int i4, ZoneOffset zoneOffset) {
        return new OffsetTime(LocalTime.of(i, i2, i3, i4), zoneOffset);
    }

    public static OffsetTime parse(CharSequence charSequence, iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return (OffsetTime) iq5Var.h(charSequence, FROM);
    }

    @Override // java.lang.Comparable
    public int compareTo(OffsetTime offsetTime) {
        if (this.offset.equals(offsetTime.offset)) {
            return this.time.compareTo(offsetTime.time);
        }
        int iB = crd.b(toEpochNano(), offsetTime.toEpochNano());
        return iB == 0 ? this.time.compareTo(offsetTime.time) : iB;
    }

    public static OffsetTime now(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        Instant instantB = g14Var.b();
        return ofInstant(instantB, g14Var.a().getRules().a(instantB));
    }

    private OffsetTime with(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.time == localTime && this.offset.equals(zoneOffset)) ? this : new OffsetTime(localTime, zoneOffset);
    }

    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public OffsetTime m2673plus(y4p y4pVar) {
        return (OffsetTime) y4pVar.addTo(this);
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar.isTimeBased();
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    @Override // defpackage.s4p
    public OffsetTime plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return with(this.time.plus(j, c5pVar), this.offset);
        }
        return (OffsetTime) c5pVar.addTo(this, j);
    }

    /* JADX INFO: renamed from: minus, reason: merged with bridge method [inline-methods] */
    public OffsetTime m2672minus(y4p y4pVar) {
        return (OffsetTime) y4pVar.subtractFrom(this);
    }

    @Override // defpackage.s4p
    public OffsetTime with(w4p w4pVar) {
        if (w4pVar instanceof LocalTime) {
            return with((LocalTime) w4pVar, this.offset);
        }
        if (w4pVar instanceof ZoneOffset) {
            return with(this.time, (ZoneOffset) w4pVar);
        }
        if (w4pVar instanceof OffsetTime) {
            return (OffsetTime) w4pVar;
        }
        return (OffsetTime) w4pVar.adjustInto(this);
    }

    @Override // defpackage.s4p
    public OffsetTime with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            if (z4pVar == ChronoField.OFFSET_SECONDS) {
                return with(this.time, ZoneOffset.ofTotalSeconds(((ChronoField) z4pVar).checkValidIntValue(j)));
            }
            return with(this.time.with(z4pVar, j), this.offset);
        }
        return (OffsetTime) z4pVar.adjustInto(this, j);
    }
}
