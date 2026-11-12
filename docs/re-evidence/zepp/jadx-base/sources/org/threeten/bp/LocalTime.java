package org.threeten.bp;

import com.airbnb.lottie.utils.Utils;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
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
public final class LocalTime extends DefaultInterfaceTemporalAccessor implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIDNIGHT;
    public static final LocalTime MIN;
    public static final LocalTime NOON;
    public static final int f = 24;
    public static final int g = 60;
    public static final int h = 1440;
    public static final int i = 60;
    public static final int j = 3600;
    public static final int k = 86400;
    public static final long l = 86400000;
    public static final long m = 86400000000L;
    public static final long n = 1000000000;
    public static final long o = 60000000000L;
    public static final long p = 3600000000000L;
    public static final long q = 86400000000000L;
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;
    public static final TemporalQuery<LocalTime> FROM = new a();
    private static final LocalTime[] e = new LocalTime[24];

    public class a implements TemporalQuery<LocalTime> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalTime queryFrom(TemporalAccessor temporalAccessor) {
            return LocalTime.from(temporalAccessor);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            b = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            a = iArr2;
            try {
                iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ChronoField.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ChronoField.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ChronoField.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ChronoField.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ChronoField.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[ChronoField.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[ChronoField.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[ChronoField.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[ChronoField.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[ChronoField.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[ChronoField.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[ChronoField.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[ChronoField.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[ChronoField.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i2 = 0;
        while (true) {
            LocalTime[] localTimeArr = e;
            if (i2 >= localTimeArr.length) {
                MIDNIGHT = localTimeArr[0];
                NOON = localTimeArr[12];
                MIN = localTimeArr[0];
                MAX = new LocalTime(23, 59, 59, Year.MAX_VALUE);
                return;
            }
            localTimeArr[i2] = new LocalTime(i2, 0, 0, 0);
            i2++;
        }
    }

    private LocalTime(int i2, int i3, int i4, int i5) {
        this.a = (byte) i2;
        this.b = (byte) i3;
        this.c = (byte) i4;
        this.d = i5;
    }

    private static LocalTime a(int i2, int i3, int i4, int i5) {
        return ((i3 | i4) | i5) == 0 ? e[i2] : new LocalTime(i2, i3, i4, i5);
    }

    private int b(TemporalField temporalField) {
        switch (b.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new DateTimeException("Field too large for an int: " + temporalField);
            case 3:
                return this.d / 1000;
            case 4:
                throw new DateTimeException("Field too large for an int: " + temporalField);
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (toNanoOfDay() / 1000000);
            case 7:
                return this.c;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.b;
            case 10:
                return (this.a * MiLiProProfile.ECF_COMMAND_SET_BEEP) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i2 = this.a % 12;
                if (i2 % 12 == 0) {
                    return 12;
                }
                return i2;
            case 13:
                return this.a;
            case 14:
                byte b2 = this.a;
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return this.a / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
    }

    public static LocalTime c(long j2, int i2) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j2);
        ChronoField.NANO_OF_SECOND.checkValidValue(i2);
        int i3 = (int) (j2 / TimeUtils.TIME_1_HOURS);
        long j3 = j2 - ((long) (i3 * 3600));
        int i4 = (int) (j3 / 60);
        return a(i3, i4, (int) (j3 - ((long) (i4 * 60))), i2);
    }

    public static LocalTime e(DataInput dataInput) throws IOException {
        int i2;
        int i3;
        int i4 = dataInput.readByte();
        int i5 = 0;
        if (i4 >= 0) {
            byte b2 = dataInput.readByte();
            if (b2 < 0) {
                int i6 = ~b2;
                i3 = 0;
                i5 = i6;
                i2 = 0;
            } else {
                byte b3 = dataInput.readByte();
                if (b3 < 0) {
                    i2 = ~b3;
                    i5 = b2;
                } else {
                    int i7 = dataInput.readInt();
                    i2 = b3;
                    i3 = i7;
                    i5 = b2;
                }
            }
            return of(i4, i5, i2, i3);
        }
        i4 = ~i4;
        i2 = 0;
        i3 = 0;
        return of(i4, i5, i2, i3);
    }

    public static LocalTime from(TemporalAccessor temporalAccessor) {
        LocalTime localTime = (LocalTime) temporalAccessor.query(TemporalQueries.localTime());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + ", type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime now() {
        return now(Clock.systemDefaultZone());
    }

    public static LocalTime of(int i2, int i3) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i2);
        if (i3 == 0) {
            return e[i2];
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i3);
        return new LocalTime(i2, i3, 0, 0);
    }

    public static LocalTime ofNanoOfDay(long j2) {
        ChronoField.NANO_OF_DAY.checkValidValue(j2);
        int i2 = (int) (j2 / p);
        long j3 = j2 - (((long) i2) * p);
        int i3 = (int) (j3 / o);
        long j4 = j3 - (((long) i3) * o);
        int i4 = (int) (j4 / 1000000000);
        return a(i2, i3, i4, (int) (j4 - (((long) i4) * 1000000000)));
    }

    public static LocalTime ofSecondOfDay(long j2) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j2);
        int i2 = (int) (j2 / TimeUtils.TIME_1_HOURS);
        long j3 = j2 - ((long) (i2 * 3600));
        int i3 = (int) (j3 / 60);
        return a(i2, i3, (int) (j3 - ((long) (i3 * 60))), 0);
    }

    public static LocalTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_TIME);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new org.threeten.bp.a((byte) 5, this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.NANO_OF_DAY, toNanoOfDay());
    }

    public LocalDateTime atDate(LocalDate localDate) {
        return LocalDateTime.of(localDate, this);
    }

    public OffsetTime atOffset(ZoneOffset zoneOffset) {
        return OffsetTime.of(this, zoneOffset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        return this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d;
    }

    public void f(DataOutput dataOutput) throws IOException {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
        } else if (this.b == 0) {
            dataOutput.writeByte(~this.a);
        } else {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(~this.b);
        }
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? b(temporalField) : super.get(temporalField);
    }

    public int getHour() {
        return this.a;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        if (temporalField == ChronoField.NANO_OF_DAY) {
            return toNanoOfDay();
        }
        return temporalField == ChronoField.MICRO_OF_DAY ? toNanoOfDay() / 1000 : b(temporalField);
    }

    public int getMinute() {
        return this.b;
    }

    public int getNano() {
        return this.d;
    }

    public int getSecond() {
        return this.c;
    }

    public int hashCode() {
        long nanoOfDay = toNanoOfDay();
        return (int) (nanoOfDay ^ (nanoOfDay >>> 32));
    }

    public boolean isAfter(LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public boolean isBefore(LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased();
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    public LocalTime minusHours(long j2) {
        return plusHours(-(j2 % 24));
    }

    public LocalTime minusMinutes(long j2) {
        return plusMinutes(-(j2 % 1440));
    }

    public LocalTime minusNanos(long j2) {
        return plusNanos(-(j2 % q));
    }

    public LocalTime minusSeconds(long j2) {
        return plusSeconds(-(j2 % 86400));
    }

    public LocalTime plusHours(long j2) {
        return j2 == 0 ? this : a(((((int) (j2 % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public LocalTime plusMinutes(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.a * MiLiProProfile.ECF_COMMAND_SET_BEEP) + this.b;
        int i3 = ((((int) (j2 % 1440)) + i2) + 1440) % 1440;
        return i2 == i3 ? this : a(i3 / 60, i3 % 60, this.c, this.d);
    }

    public LocalTime plusNanos(long j2) {
        if (j2 == 0) {
            return this;
        }
        long nanoOfDay = toNanoOfDay();
        long j3 = (((j2 % q) + nanoOfDay) + q) % q;
        return nanoOfDay == j3 ? this : a((int) (j3 / p), (int) ((j3 / o) % 60), (int) ((j3 / 1000000000) % 60), (int) (j3 % 1000000000));
    }

    public LocalTime plusSeconds(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.a * 3600) + (this.b * MiLiProProfile.ECF_COMMAND_SET_BEEP) + this.c;
        int i3 = ((((int) (j2 % 86400)) + i2) + 86400) % 86400;
        return i2 == i3 ? this : a(i3 / 3600, (i3 / 60) % 60, i3 % 60, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.precision()) {
            return (R) ChronoUnit.NANOS;
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return this;
        }
        if (temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.offset() || temporalQuery == TemporalQueries.localDate()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return super.range(temporalField);
    }

    public long toNanoOfDay() {
        return (((long) this.a) * p) + (((long) this.b) * o) + (((long) this.c) * 1000000000) + ((long) this.d);
    }

    public int toSecondOfDay() {
        return (this.a * 3600) + (this.b * MiLiProProfile.ECF_COMMAND_SET_BEEP) + this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.a;
        byte b3 = this.b;
        byte b4 = this.c;
        int i2 = this.d;
        sb.append(b2 < 10 ? "0" : "");
        sb.append((int) b2);
        sb.append(b3 < 10 ? ":0" : ":");
        sb.append((int) b3);
        if (b4 > 0 || i2 > 0) {
            sb.append(b4 >= 10 ? ":" : ":0");
            sb.append((int) b4);
            if (i2 > 0) {
                sb.append('.');
                if (i2 % 1000000 == 0) {
                    sb.append(Integer.toString((i2 / 1000000) + 1000).substring(1));
                } else if (i2 % 1000 == 0) {
                    sb.append(Integer.toString((i2 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i2 + Utils.SECOND_IN_NANOS).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public LocalTime truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new DateTimeException("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (q % nanos == 0) {
            return ofNanoOfDay((toNanoOfDay() / nanos) * nanos);
        }
        throw new DateTimeException("Unit must divide into a standard day without remainder");
    }

    @Override // org.threeten.bp.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localTimeFrom);
        }
        long nanoOfDay = localTimeFrom.toNanoOfDay() - toNanoOfDay();
        switch (b.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return nanoOfDay;
            case 2:
                return nanoOfDay / 1000;
            case 3:
                return nanoOfDay / 1000000;
            case 4:
                return nanoOfDay / 1000000000;
            case 5:
                return nanoOfDay / o;
            case 6:
                return nanoOfDay / p;
            case 7:
                return nanoOfDay / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    public LocalTime withHour(int i2) {
        if (this.a == i2) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.checkValidValue(i2);
        return a(i2, this.b, this.c, this.d);
    }

    public LocalTime withMinute(int i2) {
        if (this.b == i2) {
            return this;
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        return a(this.a, i2, this.c, this.d);
    }

    public LocalTime withNano(int i2) {
        if (this.d == i2) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.checkValidValue(i2);
        return a(this.a, this.b, this.c, i2);
    }

    public LocalTime withSecond(int i2) {
        if (this.c == i2) {
            return this;
        }
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i2);
        return a(this.a, this.b, i2, this.d);
    }

    public static LocalTime now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static LocalTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, FROM);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompareInts = Jdk8Methods.compareInts(this.a, localTime.a);
        if (iCompareInts != 0) {
            return iCompareInts;
        }
        int iCompareInts2 = Jdk8Methods.compareInts(this.b, localTime.b);
        if (iCompareInts2 != 0) {
            return iCompareInts2;
        }
        int iCompareInts3 = Jdk8Methods.compareInts(this.c, localTime.c);
        return iCompareInts3 == 0 ? Jdk8Methods.compareInts(this.d, localTime.d) : iCompareInts3;
    }

    public static LocalTime now(Clock clock) {
        Jdk8Methods.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        long epochSecond = ((instant.getEpochSecond() % 86400) + ((long) clock.getZone().getRules().getOffset(instant).getTotalSeconds())) % 86400;
        if (epochSecond < 0) {
            epochSecond += 86400;
        }
        return c(epochSecond, instant.getNano());
    }

    @Override // org.threeten.bp.temporal.Temporal
    public LocalTime minus(TemporalAmount temporalAmount) {
        return (LocalTime) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public LocalTime plus(TemporalAmount temporalAmount) {
        return (LocalTime) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public LocalTime with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalTime) {
            return (LocalTime) temporalAdjuster;
        }
        return (LocalTime) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public boolean isSupported(TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return temporalUnit.isTimeBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public LocalTime minus(long j2, TemporalUnit temporalUnit) {
        return j2 == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j2, temporalUnit);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public LocalTime plus(long j2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (b.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j2);
                case 2:
                    return plusNanos((j2 % m) * 1000);
                case 3:
                    return plusNanos((j2 % 86400000) * 1000000);
                case 4:
                    return plusSeconds(j2);
                case 5:
                    return plusMinutes(j2);
                case 6:
                    return plusHours(j2);
                case 7:
                    return plusHours((j2 % 2) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.addTo(this, j2);
    }

    public static LocalTime of(int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i2);
        if ((i3 | i4) == 0) {
            return e[i2];
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i3);
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i4);
        return new LocalTime(i2, i3, i4, 0);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public LocalTime with(TemporalField temporalField, long j2) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j2);
            switch (b.a[chronoField.ordinal()]) {
                case 1:
                    return withNano((int) j2);
                case 2:
                    return ofNanoOfDay(j2);
                case 3:
                    return withNano(((int) j2) * 1000);
                case 4:
                    return ofNanoOfDay(j2 * 1000);
                case 5:
                    return withNano(((int) j2) * 1000000);
                case 6:
                    return ofNanoOfDay(j2 * 1000000);
                case 7:
                    return withSecond((int) j2);
                case 8:
                    return plusSeconds(j2 - ((long) toSecondOfDay()));
                case 9:
                    return withMinute((int) j2);
                case 10:
                    return plusMinutes(j2 - ((long) ((this.a * MiLiProProfile.ECF_COMMAND_SET_BEEP) + this.b)));
                case 11:
                    return plusHours(j2 - ((long) (this.a % 12)));
                case 12:
                    if (j2 == 12) {
                        j2 = 0;
                    }
                    return plusHours(j2 - ((long) (this.a % 12)));
                case 13:
                    return withHour((int) j2);
                case 14:
                    if (j2 == 24) {
                        j2 = 0;
                    }
                    return withHour((int) j2);
                case 15:
                    return plusHours((j2 - ((long) (this.a / 12))) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
        }
        return (LocalTime) temporalField.adjustInto(this, j2);
    }

    public static LocalTime of(int i2, int i3, int i4, int i5) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i2);
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i3);
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i4);
        ChronoField.NANO_OF_SECOND.checkValidValue(i5);
        return a(i2, i3, i4, i5);
    }
}
