package org.threeten.bp;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
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
public final class LocalTime extends sv5 implements s4p, w4p, Comparable<LocalTime>, Serializable {
    public static final b5p<LocalTime> FROM = new a();
    private static final LocalTime[] HOURS = new LocalTime[24];
    static final int HOURS_PER_DAY = 24;
    public static final LocalTime MAX;
    static final long MICROS_PER_DAY = 86400000000L;
    public static final LocalTime MIDNIGHT;
    static final long MILLIS_PER_DAY = 86400000;
    public static final LocalTime MIN;
    static final int MINUTES_PER_DAY = 1440;
    static final int MINUTES_PER_HOUR = 60;
    static final long NANOS_PER_DAY = 86400000000000L;
    static final long NANOS_PER_HOUR = 3600000000000L;
    static final long NANOS_PER_MINUTE = 60000000000L;
    static final long NANOS_PER_SECOND = 1000000000;
    public static final LocalTime NOON;
    static final int SECONDS_PER_DAY = 86400;
    static final int SECONDS_PER_HOUR = 3600;
    static final int SECONDS_PER_MINUTE = 60;
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte hour;
    private final byte minute;
    private final int nano;
    private final byte second;

    public class a implements b5p<LocalTime> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalTime a(t4p t4pVar) {
            return LocalTime.from(t4pVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29597b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f29597b = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29597b[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29597b[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29597b[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29597b[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29597b[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29597b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f29596a = iArr2;
            try {
                iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29596a[ChronoField.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29596a[ChronoField.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29596a[ChronoField.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29596a[ChronoField.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29596a[ChronoField.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29596a[ChronoField.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29596a[ChronoField.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29596a[ChronoField.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29596a[ChronoField.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f29596a[ChronoField.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f29596a[ChronoField.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f29596a[ChronoField.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f29596a[ChronoField.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f29596a[ChronoField.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = HOURS;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                NOON = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, Year.MAX_VALUE);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.hour = (byte) i;
        this.minute = (byte) i2;
        this.second = (byte) i3;
        this.nano = i4;
    }

    private static LocalTime create(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? HOURS[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime from(t4p t4pVar) {
        LocalTime localTime = (LocalTime) t4pVar.query(a5p.c());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
    }

    private int get0(z4p z4pVar) {
        switch (b.f29596a[((ChronoField) z4pVar).ordinal()]) {
            case 1:
                return this.nano;
            case 2:
                throw new DateTimeException("Field too large for an int: " + z4pVar);
            case 3:
                return this.nano / 1000;
            case 4:
                throw new DateTimeException("Field too large for an int: " + z4pVar);
            case 5:
                return this.nano / 1000000;
            case 6:
                return (int) (toNanoOfDay() / FolmeCore.NANOS_TO_MS);
            case 7:
                return this.second;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.minute;
            case 10:
                return (this.hour * 60) + this.minute;
            case 11:
                return this.hour % AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
            case 12:
                int i = this.hour % AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.hour;
            case 14:
                byte b2 = this.hour;
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return this.hour / AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }
    }

    public static LocalTime now() {
        return now(g14.d());
    }

    public static LocalTime of(int i, int i2) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        if (i2 == 0) {
            return HOURS[i];
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        return new LocalTime(i, i2, 0, 0);
    }

    public static LocalTime ofNanoOfDay(long j) {
        ChronoField.NANO_OF_DAY.checkValidValue(j);
        int i = (int) (j / NANOS_PER_HOUR);
        long j2 = j - (((long) i) * NANOS_PER_HOUR);
        int i2 = (int) (j2 / NANOS_PER_MINUTE);
        long j3 = j2 - (((long) i2) * NANOS_PER_MINUTE);
        int i3 = (int) (j3 / 1000000000);
        return create(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime ofSecondOfDay(long j) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j);
        int i = (int) (j / TimeDateUtil.TIME_HOUR);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return create(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    public static LocalTime parse(CharSequence charSequence) {
        return parse(charSequence, iq5.f21984k);
    }

    public static LocalTime readExternal(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i = 0;
            i2 = 0;
        } else {
            byte b2 = dataInput.readByte();
            if (b2 < 0) {
                int i5 = ~b2;
                i2 = 0;
                i4 = i5;
                i = 0;
            } else {
                byte b3 = dataInput.readByte();
                if (b3 < 0) {
                    i = ~b3;
                } else {
                    i4 = dataInput.readInt();
                    i = b3;
                }
                i2 = i4;
                i4 = b2;
            }
        }
        return of(i3, i4, i, i2);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new iwl((byte) 5, this);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        return s4pVar.with(ChronoField.NANO_OF_DAY, toNanoOfDay());
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
        return this.hour == localTime.hour && this.minute == localTime.minute && this.second == localTime.second && this.nano == localTime.nano;
    }

    public String format(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return iq5Var.b(this);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        return z4pVar instanceof ChronoField ? get0(z4pVar) : super.get(z4pVar);
    }

    public int getHour() {
        return this.hour;
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        if (z4pVar == ChronoField.NANO_OF_DAY) {
            return toNanoOfDay();
        }
        return z4pVar == ChronoField.MICRO_OF_DAY ? toNanoOfDay() / 1000 : get0(z4pVar);
    }

    public int getMinute() {
        return this.minute;
    }

    public int getNano() {
        return this.nano;
    }

    public int getSecond() {
        return this.second;
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

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isTimeBased();
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    @Override // defpackage.s4p
    public LocalTime minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public LocalTime minusHours(long j) {
        return plusHours(-(j % 24));
    }

    public LocalTime minusMinutes(long j) {
        return plusMinutes(-(j % DateTimeHelper.sDayInMinutes));
    }

    public LocalTime minusNanos(long j) {
        return plusNanos(-(j % NANOS_PER_DAY));
    }

    public LocalTime minusSeconds(long j) {
        return plusSeconds(-(j % 86400));
    }

    public LocalTime plusHours(long j) {
        return j == 0 ? this : create(((((int) (j % 24)) + this.hour) + 24) % 24, this.minute, this.second, this.nano);
    }

    public LocalTime plusMinutes(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 60) + this.minute;
        int i2 = ((((int) (j % DateTimeHelper.sDayInMinutes)) + i) + MINUTES_PER_DAY) % MINUTES_PER_DAY;
        return i == i2 ? this : create(i2 / 60, i2 % 60, this.second, this.nano);
    }

    public LocalTime plusNanos(long j) {
        if (j == 0) {
            return this;
        }
        long nanoOfDay = toNanoOfDay();
        long j2 = (((j % NANOS_PER_DAY) + nanoOfDay) + NANOS_PER_DAY) % NANOS_PER_DAY;
        return nanoOfDay == j2 ? this : create((int) (j2 / NANOS_PER_HOUR), (int) ((j2 / NANOS_PER_MINUTE) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public LocalTime plusSeconds(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 3600) + (this.minute * 60) + this.second;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : create(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.nano);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (b5pVar == a5p.c()) {
            return this;
        }
        if (b5pVar == a5p.a() || b5pVar == a5p.g() || b5pVar == a5p.f() || b5pVar == a5p.d() || b5pVar == a5p.b()) {
            return null;
        }
        return b5pVar.a(this);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        return super.range(z4pVar);
    }

    public long toNanoOfDay() {
        return (((long) this.hour) * NANOS_PER_HOUR) + (((long) this.minute) * NANOS_PER_MINUTE) + (((long) this.second) * 1000000000) + ((long) this.nano);
    }

    public int toSecondOfDay() {
        return (this.hour * 3600) + (this.minute * 60) + this.second;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.hour;
        byte b3 = this.minute;
        byte b4 = this.second;
        int i = this.nano;
        sb.append(b2 < 10 ? "0" : "");
        sb.append((int) b2);
        sb.append(b3 < 10 ? ":0" : ":");
        sb.append((int) b3);
        if (b4 > 0 || i > 0) {
            sb.append(b4 < 10 ? ":0" : ":");
            sb.append((int) b4);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public LocalTime truncatedTo(c5p c5pVar) {
        if (c5pVar == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = c5pVar.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new DateTimeException("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (NANOS_PER_DAY % nanos == 0) {
            return ofNanoOfDay((toNanoOfDay() / nanos) * nanos);
        }
        throw new DateTimeException("Unit must divide into a standard day without remainder");
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        LocalTime localTimeFrom = from(s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, localTimeFrom);
        }
        long nanoOfDay = localTimeFrom.toNanoOfDay() - toNanoOfDay();
        switch (b.f29597b[((ChronoUnit) c5pVar).ordinal()]) {
            case 1:
                return nanoOfDay;
            case 2:
                return nanoOfDay / 1000;
            case 3:
                return nanoOfDay / FolmeCore.NANOS_TO_MS;
            case 4:
                return nanoOfDay / 1000000000;
            case 5:
                return nanoOfDay / NANOS_PER_MINUTE;
            case 6:
                return nanoOfDay / NANOS_PER_HOUR;
            case 7:
                return nanoOfDay / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
        }
    }

    public LocalTime withHour(int i) {
        if (this.hour == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        return create(i, this.minute, this.second, this.nano);
    }

    public LocalTime withMinute(int i) {
        if (this.minute == i) {
            return this;
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i);
        return create(this.hour, i, this.second, this.nano);
    }

    public LocalTime withNano(int i) {
        if (this.nano == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.checkValidValue(i);
        return create(this.hour, this.minute, this.second, i);
    }

    public LocalTime withSecond(int i) {
        if (this.second == i) {
            return this;
        }
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i);
        return create(this.hour, this.minute, i, this.nano);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        if (this.nano != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(this.second);
            dataOutput.writeInt(this.nano);
            return;
        }
        if (this.second != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(~this.second);
        } else if (this.minute == 0) {
            dataOutput.writeByte(~this.hour);
        } else {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(~this.minute);
        }
    }

    public static LocalTime now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    public static LocalTime parse(CharSequence charSequence, iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return (LocalTime) iq5Var.h(charSequence, FROM);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iA = crd.a(this.hour, localTime.hour);
        if (iA != 0) {
            return iA;
        }
        int iA2 = crd.a(this.minute, localTime.minute);
        if (iA2 != 0) {
            return iA2;
        }
        int iA3 = crd.a(this.second, localTime.second);
        return iA3 == 0 ? crd.a(this.nano, localTime.nano) : iA3;
    }

    public static LocalTime now(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        Instant instantB = g14Var.b();
        long epochSecond = ((instantB.getEpochSecond() % 86400) + ((long) g14Var.a().getRules().a(instantB).getTotalSeconds())) % 86400;
        if (epochSecond < 0) {
            epochSecond += 86400;
        }
        return ofSecondOfDay(epochSecond, instantB.getNano());
    }

    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public LocalTime m2671plus(y4p y4pVar) {
        return (LocalTime) y4pVar.addTo(this);
    }

    @Override // defpackage.s4p
    public LocalTime with(w4p w4pVar) {
        if (w4pVar instanceof LocalTime) {
            return (LocalTime) w4pVar;
        }
        return (LocalTime) w4pVar.adjustInto(this);
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar.isTimeBased();
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    @Override // defpackage.s4p
    public LocalTime plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            switch (b.f29597b[((ChronoUnit) c5pVar).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return plusNanos((j % MICROS_PER_DAY) * 1000);
                case 3:
                    return plusNanos((j % 86400000) * FolmeCore.NANOS_TO_MS);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusMinutes(j);
                case 6:
                    return plusHours(j);
                case 7:
                    return plusHours((j % 2) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
            }
        }
        return (LocalTime) c5pVar.addTo(this, j);
    }

    public static LocalTime of(int i, int i2, int i3) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        if ((i2 | i3) == 0) {
            return HOURS[i];
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i3);
        return new LocalTime(i, i2, i3, 0);
    }

    public static LocalTime ofSecondOfDay(long j, int i) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j);
        ChronoField.NANO_OF_SECOND.checkValidValue(i);
        int i2 = (int) (j / TimeDateUtil.TIME_HOUR);
        long j2 = j - ((long) (i2 * 3600));
        int i3 = (int) (j2 / 60);
        return create(i2, i3, (int) (j2 - ((long) (i3 * 60))), i);
    }

    /* JADX INFO: renamed from: minus, reason: merged with bridge method [inline-methods] */
    public LocalTime m2670minus(y4p y4pVar) {
        return (LocalTime) y4pVar.subtractFrom(this);
    }

    @Override // defpackage.s4p
    public LocalTime with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) z4pVar;
            chronoField.checkValidValue(j);
            switch (b.f29596a[chronoField.ordinal()]) {
                case 1:
                    return withNano((int) j);
                case 2:
                    return ofNanoOfDay(j);
                case 3:
                    return withNano(((int) j) * 1000);
                case 4:
                    return ofNanoOfDay(j * 1000);
                case 5:
                    return withNano(((int) j) * 1000000);
                case 6:
                    return ofNanoOfDay(j * FolmeCore.NANOS_TO_MS);
                case 7:
                    return withSecond((int) j);
                case 8:
                    return plusSeconds(j - ((long) toSecondOfDay()));
                case 9:
                    return withMinute((int) j);
                case 10:
                    return plusMinutes(j - ((long) ((this.hour * 60) + this.minute)));
                case 11:
                    return plusHours(j - ((long) (this.hour % AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT)));
                case 12:
                    if (j == 12) {
                        j = 0;
                    }
                    return plusHours(j - ((long) (this.hour % AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT)));
                case 13:
                    return withHour((int) j);
                case 14:
                    if (j == 24) {
                        j = 0;
                    }
                    return withHour((int) j);
                case 15:
                    return plusHours((j - ((long) (this.hour / AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT))) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
            }
        }
        return (LocalTime) z4pVar.adjustInto(this, j);
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i3);
        ChronoField.NANO_OF_SECOND.checkValidValue(i4);
        return create(i, i2, i3, i4);
    }
}
