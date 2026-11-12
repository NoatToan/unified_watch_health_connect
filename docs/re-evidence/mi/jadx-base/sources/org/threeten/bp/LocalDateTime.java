package org.threeten.bp;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
import defpackage.a5p;
import defpackage.b5p;
import defpackage.c5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.iq5;
import defpackage.iwl;
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
import miuix.animation.internal.FolmeCore;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDateTime extends vv3<LocalDate> implements s4p, w4p, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate date;
    private final LocalTime time;
    public static final LocalDateTime MIN = of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = of(LocalDate.MAX, LocalTime.MAX);
    public static final b5p<LocalDateTime> FROM = new a();

    public class a implements b5p<LocalDateTime> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalDateTime a(t4p t4pVar) {
            return LocalDateTime.from(t4pVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29595a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f29595a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29595a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29595a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29595a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29595a[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29595a[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29595a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.date = localDate;
        this.time = localTime;
    }

    private int compareTo0(LocalDateTime localDateTime) {
        int iCompareTo0 = this.date.compareTo0(localDateTime.toLocalDate());
        return iCompareTo0 == 0 ? this.time.compareTo(localDateTime.toLocalTime()) : iCompareTo0;
    }

    public static LocalDateTime from(t4p t4pVar) {
        if (t4pVar instanceof LocalDateTime) {
            return (LocalDateTime) t4pVar;
        }
        if (t4pVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) t4pVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.from(t4pVar), LocalTime.from(t4pVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
        }
    }

    public static LocalDateTime now() {
        return now(g14.d());
    }

    public static LocalDateTime of(int i, Month month, int i2, int i3, int i4) {
        return new LocalDateTime(LocalDate.of(i, month, i2), LocalTime.of(i3, i4));
    }

    public static LocalDateTime ofEpochSecond(long j, int i, ZoneOffset zoneOffset) {
        crd.i(zoneOffset, "offset");
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        return new LocalDateTime(LocalDate.ofEpochDay(crd.e(totalSeconds, 86400L)), LocalTime.ofSecondOfDay(crd.g(totalSeconds, RepositoryManager.GAP_A_DAY), i));
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        crd.i(instant, "instant");
        crd.i(zoneId, "zone");
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().a(instant));
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        return parse(charSequence, iq5.n);
    }

    private LocalDateTime plusWithOverflow(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        if ((j | j2 | j3 | j4) == 0) {
            return with(localDate, this.time);
        }
        long j5 = (j4 / 86400000000000L) + (j3 / 86400) + (j2 / DateTimeHelper.sDayInMinutes) + (j / 24);
        long j6 = i;
        long j7 = (j4 % 86400000000000L) + ((j3 % 86400) * FolmeCore.NANOS_TO_S) + ((j2 % DateTimeHelper.sDayInMinutes) * 60000000000L) + ((j % 24) * 3600000000000L);
        long nanoOfDay = this.time.toNanoOfDay();
        long j8 = (j7 * j6) + nanoOfDay;
        long jE = (j5 * j6) + crd.e(j8, 86400000000000L);
        long jH = crd.h(j8, 86400000000000L);
        return with(localDate.plusDays(jE), jH == nanoOfDay ? this.time : LocalTime.ofNanoOfDay(jH));
    }

    public static LocalDateTime readExternal(DataInput dataInput) throws IOException {
        return of(LocalDate.readExternal(dataInput), LocalTime.readExternal(dataInput));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new iwl((byte) 4, this);
    }

    @Override // defpackage.vv3, defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        return super.adjustInto(s4pVar);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.of(this, zoneOffset);
    }

    @Override // defpackage.vv3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.date.equals(localDateTime.date) && this.time.equals(localDateTime.time);
    }

    @Override // defpackage.vv3
    public String format(iq5 iq5Var) {
        return super.format(iq5Var);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased() ? this.time.get(z4pVar) : this.date.get(z4pVar);
        }
        return super.get(z4pVar);
    }

    public int getDayOfMonth() {
        return this.date.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return this.date.getDayOfWeek();
    }

    public int getDayOfYear() {
        return this.date.getDayOfYear();
    }

    public int getHour() {
        return this.time.getHour();
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased() ? this.time.getLong(z4pVar) : this.date.getLong(z4pVar);
        }
        return z4pVar.getFrom(this);
    }

    public int getMinute() {
        return this.time.getMinute();
    }

    public Month getMonth() {
        return this.date.getMonth();
    }

    public int getMonthValue() {
        return this.date.getMonthValue();
    }

    public int getNano() {
        return this.time.getNano();
    }

    public int getSecond() {
        return this.time.getSecond();
    }

    public int getYear() {
        return this.date.getYear();
    }

    @Override // defpackage.vv3
    public int hashCode() {
        return this.date.hashCode() ^ this.time.hashCode();
    }

    @Override // defpackage.vv3
    public boolean isAfter(vv3<?> vv3Var) {
        if (vv3Var instanceof LocalDateTime) {
            return compareTo0((LocalDateTime) vv3Var) > 0;
        }
        return super.isAfter(vv3Var);
    }

    @Override // defpackage.vv3
    public boolean isBefore(vv3<?> vv3Var) {
        if (vv3Var instanceof LocalDateTime) {
            return compareTo0((LocalDateTime) vv3Var) < 0;
        }
        return super.isBefore(vv3Var);
    }

    @Override // defpackage.vv3
    public boolean isEqual(vv3<?> vv3Var) {
        if (vv3Var instanceof LocalDateTime) {
            return compareTo0((LocalDateTime) vv3Var) == 0;
        }
        return super.isEqual(vv3Var);
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isDateBased() || z4pVar.isTimeBased();
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    @Override // defpackage.vv3, defpackage.rv5, defpackage.s4p
    public LocalDateTime minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public LocalDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public LocalDateTime minusHours(long j) {
        return plusWithOverflow(this.date, j, 0L, 0L, 0L, -1);
    }

    public LocalDateTime minusMinutes(long j) {
        return plusWithOverflow(this.date, 0L, j, 0L, 0L, -1);
    }

    public LocalDateTime minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public LocalDateTime minusNanos(long j) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j, -1);
    }

    public LocalDateTime minusSeconds(long j) {
        return plusWithOverflow(this.date, 0L, 0L, j, 0L, -1);
    }

    public LocalDateTime minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1L) : plusWeeks(-j);
    }

    public LocalDateTime minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public LocalDateTime plusDays(long j) {
        return with(this.date.plusDays(j), this.time);
    }

    public LocalDateTime plusHours(long j) {
        return plusWithOverflow(this.date, j, 0L, 0L, 0L, 1);
    }

    public LocalDateTime plusMinutes(long j) {
        return plusWithOverflow(this.date, 0L, j, 0L, 0L, 1);
    }

    public LocalDateTime plusMonths(long j) {
        return with(this.date.plusMonths(j), this.time);
    }

    public LocalDateTime plusNanos(long j) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j, 1);
    }

    public LocalDateTime plusSeconds(long j) {
        return plusWithOverflow(this.date, 0L, 0L, j, 0L, 1);
    }

    public LocalDateTime plusWeeks(long j) {
        return with(this.date.plusWeeks(j), this.time);
    }

    public LocalDateTime plusYears(long j) {
        return with(this.date.plusYears(j), this.time);
    }

    @Override // defpackage.vv3, defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        return b5pVar == a5p.b() ? (R) toLocalDate() : (R) super.query(b5pVar);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased() ? this.time.range(z4pVar) : this.date.range(z4pVar);
        }
        return z4pVar.rangeRefinedBy(this);
    }

    @Override // defpackage.vv3
    public LocalTime toLocalTime() {
        return this.time;
    }

    @Override // defpackage.vv3
    public String toString() {
        return this.date.toString() + 'T' + this.time.toString();
    }

    public LocalDateTime truncatedTo(c5p c5pVar) {
        return with(this.date, this.time.truncatedTo(c5pVar));
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        LocalDateTime localDateTimeFrom = from((t4p) s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, localDateTimeFrom);
        }
        ChronoUnit chronoUnit = (ChronoUnit) c5pVar;
        if (!chronoUnit.isTimeBased()) {
            LocalDate localDatePlusDays = localDateTimeFrom.date;
            if (localDatePlusDays.isAfter(this.date) && localDateTimeFrom.time.isBefore(this.time)) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(this.date) && localDateTimeFrom.time.isAfter(this.time)) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.date.until(localDatePlusDays, c5pVar);
        }
        long jDaysUntil = this.date.daysUntil(localDateTimeFrom.date);
        long nanoOfDay = localDateTimeFrom.time.toNanoOfDay() - this.time.toNanoOfDay();
        if (jDaysUntil > 0 && nanoOfDay < 0) {
            jDaysUntil--;
            nanoOfDay += 86400000000000L;
        } else if (jDaysUntil < 0 && nanoOfDay > 0) {
            jDaysUntil++;
            nanoOfDay -= 86400000000000L;
        }
        switch (b.f29595a[chronoUnit.ordinal()]) {
            case 1:
                return crd.k(crd.n(jDaysUntil, 86400000000000L), nanoOfDay);
            case 2:
                return crd.k(crd.n(jDaysUntil, 86400000000L), nanoOfDay / 1000);
            case 3:
                return crd.k(crd.n(jDaysUntil, 86400000L), nanoOfDay / FolmeCore.NANOS_TO_MS);
            case 4:
                return crd.k(crd.m(jDaysUntil, RepositoryManager.GAP_A_DAY), nanoOfDay / FolmeCore.NANOS_TO_S);
            case 5:
                return crd.k(crd.m(jDaysUntil, 1440), nanoOfDay / 60000000000L);
            case 6:
                return crd.k(crd.m(jDaysUntil, 24), nanoOfDay / 3600000000000L);
            case 7:
                return crd.k(crd.m(jDaysUntil, 2), nanoOfDay / 43200000000000L);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
        }
    }

    public LocalDateTime withDayOfMonth(int i) {
        return with(this.date.withDayOfMonth(i), this.time);
    }

    public LocalDateTime withDayOfYear(int i) {
        return with(this.date.withDayOfYear(i), this.time);
    }

    public LocalDateTime withHour(int i) {
        return with(this.date, this.time.withHour(i));
    }

    public LocalDateTime withMinute(int i) {
        return with(this.date, this.time.withMinute(i));
    }

    public LocalDateTime withMonth(int i) {
        return with(this.date.withMonth(i), this.time);
    }

    public LocalDateTime withNano(int i) {
        return with(this.date, this.time.withNano(i));
    }

    public LocalDateTime withSecond(int i) {
        return with(this.date, this.time.withSecond(i));
    }

    public LocalDateTime withYear(int i) {
        return with(this.date.withYear(i), this.time);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        this.date.writeExternal(dataOutput);
        this.time.writeExternal(dataOutput);
    }

    public static LocalDateTime now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    public static LocalDateTime parse(CharSequence charSequence, iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return (LocalDateTime) iq5Var.h(charSequence, FROM);
    }

    @Override // defpackage.vv3
    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    @Override // defpackage.vv3, java.lang.Comparable
    public int compareTo(vv3<?> vv3Var) {
        return vv3Var instanceof LocalDateTime ? compareTo0((LocalDateTime) vv3Var) : super.compareTo(vv3Var);
    }

    @Override // defpackage.vv3
    public LocalDate toLocalDate() {
        return this.date;
    }

    public static LocalDateTime now(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        Instant instantB = g14Var.b();
        return ofEpochSecond(instantB.getEpochSecond(), instantB.getNano(), g14Var.a().getRules().a(instantB));
    }

    public static LocalDateTime of(int i, Month month, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.of(i, month, i2), LocalTime.of(i3, i4, i5));
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar.isDateBased() || c5pVar.isTimeBased();
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    private LocalDateTime with(LocalDate localDate, LocalTime localTime) {
        return (this.date == localDate && this.time == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // defpackage.vv3, defpackage.rv5
    public LocalDateTime plus(y4p y4pVar) {
        return (LocalDateTime) y4pVar.addTo(this);
    }

    @Override // defpackage.vv3, defpackage.s4p
    public LocalDateTime plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            switch (b.f29595a[((ChronoUnit) c5pVar).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return plusDays(j / 86400000000L).plusNanos((j % 86400000000L) * 1000);
                case 3:
                    return plusDays(j / 86400000).plusNanos((j % 86400000) * FolmeCore.NANOS_TO_MS);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusMinutes(j);
                case 6:
                    return plusHours(j);
                case 7:
                    return plusDays(j / 256).plusHours((j % 256) * 12);
                default:
                    return with(this.date.plus(j, c5pVar), this.time);
            }
        }
        return (LocalDateTime) c5pVar.addTo(this, j);
    }

    public static LocalDateTime of(int i, Month month, int i2, int i3, int i4, int i5, int i6) {
        return new LocalDateTime(LocalDate.of(i, month, i2), LocalTime.of(i3, i4, i5, i6));
    }

    @Override // defpackage.vv3, defpackage.rv5
    public LocalDateTime minus(y4p y4pVar) {
        return (LocalDateTime) y4pVar.subtractFrom(this);
    }

    @Override // defpackage.vv3, defpackage.rv5, defpackage.s4p
    public LocalDateTime with(w4p w4pVar) {
        if (w4pVar instanceof LocalDate) {
            return with((LocalDate) w4pVar, this.time);
        }
        if (w4pVar instanceof LocalTime) {
            return with(this.date, (LocalTime) w4pVar);
        }
        if (w4pVar instanceof LocalDateTime) {
            return (LocalDateTime) w4pVar;
        }
        return (LocalDateTime) w4pVar.adjustInto(this);
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5));
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5, i6));
    }

    @Override // defpackage.vv3, defpackage.s4p
    public LocalDateTime with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            if (z4pVar.isTimeBased()) {
                return with(this.date, this.time.with(z4pVar, j));
            }
            return with(this.date.with(z4pVar, j), this.time);
        }
        return (LocalDateTime) z4pVar.adjustInto(this, j);
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5, i6, i7));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        crd.i(localDate, DialWidgetType.DATE);
        crd.i(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }
}
