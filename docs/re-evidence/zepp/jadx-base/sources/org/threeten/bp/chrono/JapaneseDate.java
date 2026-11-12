package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.bp.Clock;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes23.dex */
public final class JapaneseDate extends org.threeten.bp.chrono.a<JapaneseDate> implements Serializable {
    public static final LocalDate e = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final LocalDate b;
    private transient JapaneseEra c;
    private transient int d;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            a = iArr;
            try {
                iArr[ChronoField.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ChronoField.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public JapaneseDate(LocalDate localDate) {
        if (localDate.isBefore(e)) {
            throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
        }
        JapaneseEra japaneseEraB = JapaneseEra.b(localDate);
        this.c = japaneseEraB;
        this.d = localDate.getYear() - (japaneseEraB.f().getYear() - 1);
        this.b = localDate;
    }

    public static JapaneseDate from(TemporalAccessor temporalAccessor) {
        return JapaneseChronology.INSTANCE.date(temporalAccessor);
    }

    private ValueRange j(int i) {
        Calendar calendar = Calendar.getInstance(JapaneseChronology.d);
        calendar.set(0, this.c.getValue() + 2);
        calendar.set(this.d, this.b.getMonthValue() - 1, this.b.getDayOfMonth());
        return ValueRange.of(calendar.getActualMinimum(i), calendar.getActualMaximum(i));
    }

    private long k() {
        return this.d == 1 ? (this.b.getDayOfYear() - this.c.f().getDayOfYear()) + 1 : this.b.getDayOfYear();
    }

    public static JapaneseDate m(JapaneseEra japaneseEra, int i, int i2) {
        Jdk8Methods.requireNonNull(japaneseEra, "era");
        if (i < 1) {
            throw new DateTimeException("Invalid YearOfEra: " + i);
        }
        LocalDate localDateF = japaneseEra.f();
        LocalDate localDateA = japaneseEra.a();
        if (i == 1 && (i2 = i2 + (localDateF.getDayOfYear() - 1)) > localDateF.lengthOfYear()) {
            throw new DateTimeException("DayOfYear exceeds maximum allowed in the first year of era " + japaneseEra);
        }
        LocalDate localDateOfYearDay = LocalDate.ofYearDay((localDateF.getYear() - 1) + i, i2);
        if (!localDateOfYearDay.isBefore(localDateF) && !localDateOfYearDay.isAfter(localDateA)) {
            return new JapaneseDate(japaneseEra, i, localDateOfYearDay);
        }
        throw new DateTimeException("Requested date is outside bounds of era " + japaneseEra);
    }

    public static JapaneseDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static JapaneseDate of(JapaneseEra japaneseEra, int i, int i2, int i3) {
        Jdk8Methods.requireNonNull(japaneseEra, "era");
        if (i < 1) {
            throw new DateTimeException("Invalid YearOfEra: " + i);
        }
        LocalDate localDateF = japaneseEra.f();
        LocalDate localDateA = japaneseEra.a();
        LocalDate localDateOf = LocalDate.of((localDateF.getYear() - 1) + i, i2, i3);
        if (!localDateOf.isBefore(localDateF) && !localDateOf.isAfter(localDateA)) {
            return new JapaneseDate(japaneseEra, i, localDateOf);
        }
        throw new DateTimeException("Requested date is outside bounds of era " + japaneseEra);
    }

    public static ChronoLocalDate q(DataInput dataInput) throws IOException {
        return JapaneseChronology.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }

    private JapaneseDate r(LocalDate localDate) {
        return localDate.equals(this.b) ? this : new JapaneseDate(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        JapaneseEra japaneseEraB = JapaneseEra.b(this.b);
        this.c = japaneseEraB;
        this.d = this.b.getYear() - (japaneseEraB.f().getYear() - 1);
    }

    private JapaneseDate s(int i) {
        return t(getEra(), i);
    }

    private JapaneseDate t(JapaneseEra japaneseEra, int i) {
        return r(this.b.withYear(JapaneseChronology.INSTANCE.prolepticYear(japaneseEra, i)));
    }

    private Object writeReplace() {
        return new e((byte) 1, this);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.ChronoLocalDate
    public final ChronoLocalDateTime<JapaneseDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JapaneseDate) {
            return this.b.equals(((JapaneseDate) obj).b);
        }
        return false;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        switch (a.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return k();
            case 2:
                return this.d;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            case 7:
                return this.c.getValue();
            default:
                return this.b.getLong(temporalField);
        }
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public int hashCode() {
        return getChronology().getId().hashCode() ^ this.b.hashCode();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(temporalField);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        return this.b.lengthOfMonth();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public int lengthOfYear() {
        Calendar calendar = Calendar.getInstance(JapaneseChronology.d);
        calendar.set(0, this.c.getValue() + 2);
        calendar.set(this.d, this.b.getMonthValue() - 1, this.b.getDayOfMonth());
        return calendar.getActualMaximum(6);
    }

    @Override // org.threeten.bp.chrono.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public JapaneseDate f(long j) {
        return r(this.b.plusDays(j));
    }

    @Override // org.threeten.bp.chrono.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public JapaneseDate g(long j) {
        return r(this.b.plusMonths(j));
    }

    @Override // org.threeten.bp.chrono.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public JapaneseDate i(long j) {
        return r(this.b.plusYears(j));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.rangeRefinedBy(this);
        }
        if (!isSupported(temporalField)) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = a.a[chronoField.ordinal()];
        if (i != 1) {
            return i != 2 ? getChronology().range(chronoField) : j(1);
        }
        return j(6);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public long toEpochDay() {
        return this.b.toEpochDay();
    }

    public void u(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(ChronoField.YEAR));
        dataOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        dataOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.Temporal
    public /* bridge */ /* synthetic */ long until(Temporal temporal, TemporalUnit temporalUnit) {
        return super.until(temporal, temporalUnit);
    }

    public static JapaneseDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public JapaneseChronology getChronology() {
        return JapaneseChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public JapaneseEra getEra() {
        return this.c;
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        Period periodUntil = this.b.until(chronoLocalDate);
        return getChronology().period(periodUntil.getYears(), periodUntil.getMonths(), periodUntil.getDays());
    }

    public static JapaneseDate now(Clock clock) {
        return new JapaneseDate(LocalDate.now(clock));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public JapaneseDate minus(TemporalAmount temporalAmount) {
        return (JapaneseDate) super.minus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public JapaneseDate with(TemporalAdjuster temporalAdjuster) {
        return (JapaneseDate) super.with(temporalAdjuster);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public JapaneseDate minus(long j, TemporalUnit temporalUnit) {
        return (JapaneseDate) super.minus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public JapaneseDate plus(TemporalAmount temporalAmount) {
        return (JapaneseDate) super.plus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public JapaneseDate with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (getLong(chronoField) == j) {
                return this;
            }
            int[] iArr = a.a;
            int i = iArr[chronoField.ordinal()];
            if (i == 1 || i == 2 || i == 7) {
                int iCheckValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 1) {
                    return r(this.b.plusDays(((long) iCheckValidIntValue) - k()));
                }
                if (i2 == 2) {
                    return s(iCheckValidIntValue);
                }
                if (i2 == 7) {
                    return t(JapaneseEra.of(iCheckValidIntValue), this.d);
                }
            }
            return r(this.b.with(temporalField, j));
        }
        return (JapaneseDate) temporalField.adjustInto(this, j);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public JapaneseDate plus(long j, TemporalUnit temporalUnit) {
        return (JapaneseDate) super.plus(j, temporalUnit);
    }

    public JapaneseDate(JapaneseEra japaneseEra, int i, LocalDate localDate) {
        if (!localDate.isBefore(e)) {
            this.c = japaneseEra;
            this.d = i;
            this.b = localDate;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    public static JapaneseDate of(int i, int i2, int i3) {
        return new JapaneseDate(LocalDate.of(i, i2, i3));
    }
}
