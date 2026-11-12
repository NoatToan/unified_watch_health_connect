package org.threeten.bp.chrono;

import defpackage.c5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.gwl;
import defpackage.s4p;
import defpackage.t4p;
import defpackage.uv3;
import defpackage.vv3;
import defpackage.w4p;
import defpackage.xv3;
import defpackage.y4p;
import defpackage.z4p;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class JapaneseDate extends uv3<JapaneseDate> implements Serializable {
    static final LocalDate MIN_DATE = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private transient JapaneseEra era;
    private final LocalDate isoDate;
    private transient int yearOfEra;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29612a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f29612a = iArr;
            try {
                iArr[ChronoField.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29612a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29612a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29612a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29612a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29612a[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29612a[ChronoField.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public JapaneseDate(LocalDate localDate) {
        if (localDate.isBefore(MIN_DATE)) {
            throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
        }
        JapaneseEra japaneseEraFrom = JapaneseEra.from(localDate);
        this.era = japaneseEraFrom;
        this.yearOfEra = localDate.getYear() - (japaneseEraFrom.startDate().getYear() - 1);
        this.isoDate = localDate;
    }

    private ValueRange actualRange(int i) {
        Calendar calendar = Calendar.getInstance(JapaneseChronology.LOCALE);
        calendar.set(0, this.era.getValue() + 2);
        calendar.set(this.yearOfEra, this.isoDate.getMonthValue() - 1, this.isoDate.getDayOfMonth());
        return ValueRange.of(calendar.getActualMinimum(i), calendar.getActualMaximum(i));
    }

    public static JapaneseDate from(t4p t4pVar) {
        return JapaneseChronology.INSTANCE.date(t4pVar);
    }

    private long getDayOfYear() {
        return this.yearOfEra == 1 ? (this.isoDate.getDayOfYear() - this.era.startDate().getDayOfYear()) + 1 : this.isoDate.getDayOfYear();
    }

    public static JapaneseDate now() {
        return now(g14.d());
    }

    public static JapaneseDate of(JapaneseEra japaneseEra, int i, int i2, int i3) {
        crd.i(japaneseEra, "era");
        if (i < 1) {
            throw new DateTimeException("Invalid YearOfEra: " + i);
        }
        LocalDate localDateStartDate = japaneseEra.startDate();
        LocalDate localDateEndDate = japaneseEra.endDate();
        LocalDate localDateOf = LocalDate.of((localDateStartDate.getYear() - 1) + i, i2, i3);
        if (!localDateOf.isBefore(localDateStartDate) && !localDateOf.isAfter(localDateEndDate)) {
            return new JapaneseDate(japaneseEra, i, localDateOf);
        }
        throw new DateTimeException("Requested date is outside bounds of era " + japaneseEra);
    }

    public static JapaneseDate ofYearDay(JapaneseEra japaneseEra, int i, int i2) {
        crd.i(japaneseEra, "era");
        if (i < 1) {
            throw new DateTimeException("Invalid YearOfEra: " + i);
        }
        LocalDate localDateStartDate = japaneseEra.startDate();
        LocalDate localDateEndDate = japaneseEra.endDate();
        if (i == 1 && (i2 = i2 + (localDateStartDate.getDayOfYear() - 1)) > localDateStartDate.lengthOfYear()) {
            throw new DateTimeException("DayOfYear exceeds maximum allowed in the first year of era " + japaneseEra);
        }
        LocalDate localDateOfYearDay = LocalDate.ofYearDay((localDateStartDate.getYear() - 1) + i, i2);
        if (!localDateOfYearDay.isBefore(localDateStartDate) && !localDateOfYearDay.isAfter(localDateEndDate)) {
            return new JapaneseDate(japaneseEra, i, localDateOfYearDay);
        }
        throw new DateTimeException("Requested date is outside bounds of era " + japaneseEra);
    }

    public static org.threeten.bp.chrono.a readExternal(DataInput dataInput) throws IOException {
        return JapaneseChronology.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        JapaneseEra japaneseEraFrom = JapaneseEra.from(this.isoDate);
        this.era = japaneseEraFrom;
        this.yearOfEra = this.isoDate.getYear() - (japaneseEraFrom.startDate().getYear() - 1);
    }

    private JapaneseDate withYear(JapaneseEra japaneseEra, int i) {
        return with(this.isoDate.withYear(JapaneseChronology.INSTANCE.prolepticYear(japaneseEra, i)));
    }

    private Object writeReplace() {
        return new gwl((byte) 1, this);
    }

    @Override // defpackage.uv3, org.threeten.bp.chrono.a
    public final vv3<JapaneseDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // org.threeten.bp.chrono.a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JapaneseDate) {
            return this.isoDate.equals(((JapaneseDate) obj).isoDate);
        }
        return false;
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        switch (a.f29612a[((ChronoField) z4pVar).ordinal()]) {
            case 1:
                return getDayOfYear();
            case 2:
                return this.yearOfEra;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
            case 7:
                return this.era.getValue();
            default:
                return this.isoDate.getLong(z4pVar);
        }
    }

    @Override // org.threeten.bp.chrono.a
    public int hashCode() {
        return getChronology().getId().hashCode() ^ this.isoDate.hashCode();
    }

    @Override // org.threeten.bp.chrono.a, defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || z4pVar == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || z4pVar == ChronoField.ALIGNED_WEEK_OF_MONTH || z4pVar == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(z4pVar);
    }

    @Override // org.threeten.bp.chrono.a
    public int lengthOfMonth() {
        return this.isoDate.lengthOfMonth();
    }

    @Override // org.threeten.bp.chrono.a
    public int lengthOfYear() {
        Calendar calendar = Calendar.getInstance(JapaneseChronology.LOCALE);
        calendar.set(0, this.era.getValue() + 2);
        calendar.set(this.yearOfEra, this.isoDate.getMonthValue() - 1, this.isoDate.getDayOfMonth());
        return calendar.getActualMaximum(6);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.rangeRefinedBy(this);
        }
        if (!isSupported(z4pVar)) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }
        ChronoField chronoField = (ChronoField) z4pVar;
        int i = a.f29612a[chronoField.ordinal()];
        if (i != 1) {
            return i != 2 ? getChronology().range(chronoField) : actualRange(1);
        }
        return actualRange(6);
    }

    @Override // org.threeten.bp.chrono.a
    public long toEpochDay() {
        return this.isoDate.toEpochDay();
    }

    @Override // defpackage.uv3, defpackage.s4p
    public /* bridge */ /* synthetic */ long until(s4p s4pVar, c5p c5pVar) {
        return super.until(s4pVar, c5pVar);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(ChronoField.YEAR));
        dataOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        dataOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }

    public static JapaneseDate now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    @Override // org.threeten.bp.chrono.a
    public JapaneseChronology getChronology() {
        return JapaneseChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.a
    public JapaneseEra getEra() {
        return this.era;
    }

    @Override // defpackage.uv3
    public JapaneseDate plusDays(long j) {
        return with(this.isoDate.plusDays(j));
    }

    @Override // defpackage.uv3
    public JapaneseDate plusMonths(long j) {
        return with(this.isoDate.plusMonths(j));
    }

    @Override // defpackage.uv3
    public JapaneseDate plusYears(long j) {
        return with(this.isoDate.plusYears(j));
    }

    @Override // defpackage.uv3, org.threeten.bp.chrono.a
    public xv3 until(org.threeten.bp.chrono.a aVar) {
        Period periodUntil = this.isoDate.until(aVar);
        return getChronology().period(periodUntil.getYears(), periodUntil.getMonths(), periodUntil.getDays());
    }

    public static JapaneseDate now(g14 g14Var) {
        return new JapaneseDate(LocalDate.now(g14Var));
    }

    private JapaneseDate withYear(int i) {
        return withYear(getEra(), i);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.rv5
    public JapaneseDate minus(y4p y4pVar) {
        return (JapaneseDate) super.minus(y4pVar);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.rv5, defpackage.s4p
    public JapaneseDate with(w4p w4pVar) {
        return (JapaneseDate) super.with(w4pVar);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.rv5, defpackage.s4p
    public JapaneseDate minus(long j, c5p c5pVar) {
        return (JapaneseDate) super.minus(j, c5pVar);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.rv5
    public JapaneseDate plus(y4p y4pVar) {
        return (JapaneseDate) super.plus(y4pVar);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.s4p
    public JapaneseDate with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) z4pVar;
            if (getLong(chronoField) == j) {
                return this;
            }
            int[] iArr = a.f29612a;
            int i = iArr[chronoField.ordinal()];
            if (i == 1 || i == 2 || i == 7) {
                int iCheckValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 1) {
                    return with(this.isoDate.plusDays(((long) iCheckValidIntValue) - getDayOfYear()));
                }
                if (i2 == 2) {
                    return withYear(iCheckValidIntValue);
                }
                if (i2 == 7) {
                    return withYear(JapaneseEra.of(iCheckValidIntValue), this.yearOfEra);
                }
            }
            return with(this.isoDate.with(z4pVar, j));
        }
        return (JapaneseDate) z4pVar.adjustInto(this, j);
    }

    @Override // defpackage.uv3, org.threeten.bp.chrono.a, defpackage.s4p
    public JapaneseDate plus(long j, c5p c5pVar) {
        return (JapaneseDate) super.plus(j, c5pVar);
    }

    public JapaneseDate(JapaneseEra japaneseEra, int i, LocalDate localDate) {
        if (!localDate.isBefore(MIN_DATE)) {
            this.era = japaneseEra;
            this.yearOfEra = i;
            this.isoDate = localDate;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    public static JapaneseDate of(int i, int i2, int i3) {
        return new JapaneseDate(LocalDate.of(i, i2, i3));
    }

    private JapaneseDate with(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new JapaneseDate(localDate);
    }
}
