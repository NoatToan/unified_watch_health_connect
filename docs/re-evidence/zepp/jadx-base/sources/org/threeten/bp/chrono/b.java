package org.threeten.bp.chrono;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes23.dex */
final class b<D extends ChronoLocalDate> extends ChronoLocalDateTime<D> implements Temporal, TemporalAdjuster, Serializable {
    private static final int d = 24;
    private static final int e = 60;
    private static final int f = 1440;
    private static final int g = 60;
    private static final int h = 3600;
    private static final int i = 86400;
    private static final long j = 86400000;
    private static final long k = 86400000000L;
    private static final long l = 1000000000;
    private static final long m = 60000000000L;
    private static final long n = 3600000000000L;
    private static final long o = 86400000000000L;
    private static final long serialVersionUID = 4556003607393004514L;
    private final D b;
    private final LocalTime c;

    public static /* synthetic */ class a {
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

    private b(D d2, LocalTime localTime) {
        Jdk8Methods.requireNonNull(d2, "date");
        Jdk8Methods.requireNonNull(localTime, "time");
        this.b = d2;
        this.c = localTime;
    }

    public static <R extends ChronoLocalDate> b<R> a(R r, LocalTime localTime) {
        return new b<>(r, localTime);
    }

    private b<D> c(long j2) {
        return k(this.b.plus(j2, ChronoUnit.DAYS), this.c);
    }

    private b<D> e(long j2) {
        return i(this.b, j2, 0L, 0L, 0L);
    }

    private b<D> f(long j2) {
        return i(this.b, 0L, j2, 0L, 0L);
    }

    private b<D> g(long j2) {
        return i(this.b, 0L, 0L, 0L, j2);
    }

    private b<D> i(D d2, long j2, long j3, long j4, long j5) {
        if ((j2 | j3 | j4 | j5) == 0) {
            return k(d2, this.c);
        }
        long nanoOfDay = this.c.toNanoOfDay();
        long j6 = (j5 % 86400000000000L) + ((j4 % 86400) * 1000000000) + ((j3 % 1440) * 60000000000L) + ((j2 % 24) * 3600000000000L) + nanoOfDay;
        long jFloorDiv = (j5 / 86400000000000L) + (j4 / 86400) + (j3 / 1440) + (j2 / 24) + Jdk8Methods.floorDiv(j6, 86400000000000L);
        long jFloorMod = Jdk8Methods.floorMod(j6, 86400000000000L);
        return k(d2.plus(jFloorDiv, ChronoUnit.DAYS), jFloorMod == nanoOfDay ? this.c : LocalTime.ofNanoOfDay(jFloorMod));
    }

    public static ChronoLocalDateTime<?> j(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((ChronoLocalDate) objectInput.readObject()).atTime((LocalTime) objectInput.readObject());
    }

    private b<D> k(Temporal temporal, LocalTime localTime) {
        D d2 = this.b;
        return (d2 == temporal && this.c == localTime) ? this : new b<>(d2.getChronology().a(temporal), localTime);
    }

    private Object writeReplace() {
        return new e((byte) 12, this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public ChronoZonedDateTime<D> atZone(ZoneId zoneId) {
        return d.b(this, zoneId, null);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.Temporal
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b<D> plus(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return this.b.getChronology().b(temporalUnit.addTo(this, j2));
        }
        switch (a.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return g(j2);
            case 2:
                return c(j2 / 86400000000L).g((j2 % 86400000000L) * 1000);
            case 3:
                return c(j2 / 86400000).g((j2 % 86400000) * 1000000);
            case 4:
                return h(j2);
            case 5:
                return f(j2);
            case 6:
                return e(j2);
            case 7:
                return c(j2 / 256).e((j2 % 256) * 12);
            default:
                return k(this.b.plus(j2, temporalUnit), this.c);
        }
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased() ? this.c.get(temporalField) : this.b.get(temporalField);
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased() ? this.c.getLong(temporalField) : this.b.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    public b<D> h(long j2) {
        return i(this.b, 0L, 0L, j2, 0L);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isDateBased() || temporalField.isTimeBased();
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b<D> with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof ChronoLocalDate) {
            return k((ChronoLocalDate) temporalAdjuster, this.c);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return k(this.b, (LocalTime) temporalAdjuster);
        }
        return temporalAdjuster instanceof b ? this.b.getChronology().b((b) temporalAdjuster) : this.b.getChronology().b((b) temporalAdjuster.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.Temporal
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b<D> with(TemporalField temporalField, long j2) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased() ? k(this.b, this.c.with(temporalField, j2)) : k(this.b.with(temporalField, j2), this.c);
        }
        return this.b.getChronology().b(temporalField.adjustInto(this, j2));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased() ? this.c.range(temporalField) : this.b.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public D toLocalDate() {
        return this.b;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.c;
    }

    @Override // org.threeten.bp.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        ChronoLocalDateTime<?> chronoLocalDateTimeLocalDateTime = toLocalDate().getChronology().localDateTime(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, chronoLocalDateTimeLocalDateTime);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (!chronoUnit.isTimeBased()) {
            ChronoLocalDate localDate = chronoLocalDateTimeLocalDateTime.toLocalDate();
            if (chronoLocalDateTimeLocalDateTime.toLocalTime().isBefore(this.c)) {
                localDate = localDate.minus(1L, (TemporalUnit) ChronoUnit.DAYS);
            }
            return this.b.until(localDate, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long jSafeMultiply = chronoLocalDateTimeLocalDateTime.getLong(chronoField) - this.b.getLong(chronoField);
        switch (a.a[chronoUnit.ordinal()]) {
            case 1:
                jSafeMultiply = Jdk8Methods.safeMultiply(jSafeMultiply, 86400000000000L);
                break;
            case 2:
                jSafeMultiply = Jdk8Methods.safeMultiply(jSafeMultiply, 86400000000L);
                break;
            case 3:
                jSafeMultiply = Jdk8Methods.safeMultiply(jSafeMultiply, 86400000L);
                break;
            case 4:
                jSafeMultiply = Jdk8Methods.safeMultiply(jSafeMultiply, 86400);
                break;
            case 5:
                jSafeMultiply = Jdk8Methods.safeMultiply(jSafeMultiply, 1440);
                break;
            case 6:
                jSafeMultiply = Jdk8Methods.safeMultiply(jSafeMultiply, 24);
                break;
            case 7:
                jSafeMultiply = Jdk8Methods.safeMultiply(jSafeMultiply, 2);
                break;
        }
        return Jdk8Methods.safeAdd(jSafeMultiply, this.c.until(chronoLocalDateTimeLocalDateTime.toLocalTime(), temporalUnit));
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public boolean isSupported(TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return temporalUnit.isDateBased() || temporalUnit.isTimeBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }
}
