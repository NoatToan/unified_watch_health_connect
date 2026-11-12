package org.threeten.bp;

import defpackage.a5p;
import defpackage.b5p;
import defpackage.c5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.iq5;
import defpackage.iwl;
import defpackage.kq5;
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
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.format.SignStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class YearMonth extends sv5 implements s4p, w4p, Comparable<YearMonth>, Serializable {
    public static final b5p<YearMonth> FROM = new a();
    private static final iq5 PARSER = new kq5().n(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).f('-').m(ChronoField.MONTH_OF_YEAR, 2).v();
    private static final long serialVersionUID = 4183400860270640070L;
    private final int month;
    private final int year;

    public class a implements b5p<YearMonth> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public YearMonth a(t4p t4pVar) {
            return YearMonth.from(t4pVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29605b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f29605b = iArr;
            try {
                iArr[ChronoUnit.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29605b[ChronoUnit.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29605b[ChronoUnit.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29605b[ChronoUnit.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29605b[ChronoUnit.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29605b[ChronoUnit.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f29604a = iArr2;
            try {
                iArr2[ChronoField.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29604a[ChronoField.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29604a[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29604a[ChronoField.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29604a[ChronoField.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private YearMonth(int i, int i2) {
        this.year = i;
        this.month = i2;
    }

    public static YearMonth from(t4p t4pVar) {
        if (t4pVar instanceof YearMonth) {
            return (YearMonth) t4pVar;
        }
        try {
            if (!IsoChronology.INSTANCE.equals(org.threeten.bp.chrono.b.from(t4pVar))) {
                t4pVar = LocalDate.from(t4pVar);
            }
            return of(t4pVar.get(ChronoField.YEAR), t4pVar.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
        }
    }

    private long getProlepticMonth() {
        return (((long) this.year) * 12) + ((long) (this.month - 1));
    }

    public static YearMonth now() {
        return now(g14.d());
    }

    public static YearMonth of(int i, Month month) {
        crd.i(month, "month");
        return of(i, month.getValue());
    }

    public static YearMonth parse(CharSequence charSequence) {
        return parse(charSequence, PARSER);
    }

    public static YearMonth readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readInt(), dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new iwl((byte) 68, this);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        if (org.threeten.bp.chrono.b.from(s4pVar).equals(IsoChronology.INSTANCE)) {
            return s4pVar.with(ChronoField.PROLEPTIC_MONTH, getProlepticMonth());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public LocalDate atDay(int i) {
        return LocalDate.of(this.year, this.month, i);
    }

    public LocalDate atEndOfMonth() {
        return LocalDate.of(this.year, this.month, lengthOfMonth());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        return this.year == yearMonth.year && this.month == yearMonth.month;
    }

    public String format(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return iq5Var.b(this);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        return range(z4pVar).checkValidIntValue(getLong(z4pVar), z4pVar);
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        int i;
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        int i2 = b.f29604a[((ChronoField) z4pVar).ordinal()];
        if (i2 == 1) {
            i = this.month;
        } else {
            if (i2 == 2) {
                return getProlepticMonth();
            }
            if (i2 == 3) {
                int i3 = this.year;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.year < 1 ? 0 : 1;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
            }
            i = this.year;
        }
        return i;
    }

    public Month getMonth() {
        return Month.of(this.month);
    }

    public int getMonthValue() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.year ^ (this.month << 27);
    }

    public boolean isAfter(YearMonth yearMonth) {
        return compareTo(yearMonth) > 0;
    }

    public boolean isBefore(YearMonth yearMonth) {
        return compareTo(yearMonth) < 0;
    }

    public boolean isLeapYear() {
        return IsoChronology.INSTANCE.isLeapYear(this.year);
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar == ChronoField.YEAR || z4pVar == ChronoField.MONTH_OF_YEAR || z4pVar == ChronoField.PROLEPTIC_MONTH || z4pVar == ChronoField.YEAR_OF_ERA || z4pVar == ChronoField.ERA;
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    public boolean isValidDay(int i) {
        return i >= 1 && i <= lengthOfMonth();
    }

    public int lengthOfMonth() {
        return getMonth().length(isLeapYear());
    }

    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // defpackage.s4p
    public YearMonth minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public YearMonth minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public YearMonth minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public YearMonth plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.year) * 12) + ((long) (this.month - 1)) + j;
        return with(ChronoField.YEAR.checkValidIntValue(crd.e(j2, 12L)), crd.g(j2, 12) + 1);
    }

    public YearMonth plusYears(long j) {
        return j == 0 ? this : with(ChronoField.YEAR.checkValidIntValue(((long) this.year) + j), this.month);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.a()) {
            return (R) IsoChronology.INSTANCE;
        }
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.MONTHS;
        }
        if (b5pVar == a5p.b() || b5pVar == a5p.c() || b5pVar == a5p.f() || b5pVar == a5p.g() || b5pVar == a5p.d()) {
            return null;
        }
        return (R) super.query(b5pVar);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar == ChronoField.YEAR_OF_ERA) {
            return ValueRange.of(1L, getYear() <= 0 ? FolmeCore.NANOS_TO_S : 999999999L);
        }
        return super.range(z4pVar);
    }

    public String toString() {
        int iAbs = Math.abs(this.year);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.year;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.year);
        }
        sb.append(this.month < 10 ? "-0" : "-");
        sb.append(this.month);
        return sb.toString();
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        YearMonth yearMonthFrom = from(s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, yearMonthFrom);
        }
        long prolepticMonth = yearMonthFrom.getProlepticMonth() - getProlepticMonth();
        switch (b.f29605b[((ChronoUnit) c5pVar).ordinal()]) {
            case 1:
                return prolepticMonth;
            case 2:
                return prolepticMonth / 12;
            case 3:
                return prolepticMonth / 120;
            case 4:
                return prolepticMonth / 1200;
            case 5:
                return prolepticMonth / 12000;
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return yearMonthFrom.getLong(chronoField) - getLong(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
        }
    }

    public YearMonth withMonth(int i) {
        ChronoField.MONTH_OF_YEAR.checkValidValue(i);
        return with(this.year, i);
    }

    public YearMonth withYear(int i) {
        ChronoField.YEAR.checkValidValue(i);
        return with(i, this.month);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
    }

    public static YearMonth now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    public static YearMonth parse(CharSequence charSequence, iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return (YearMonth) iq5Var.h(charSequence, FROM);
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth yearMonth) {
        int i = this.year - yearMonth.year;
        return i == 0 ? this.month - yearMonth.month : i;
    }

    public static YearMonth now(g14 g14Var) {
        LocalDate localDateNow = LocalDate.now(g14Var);
        return of(localDateNow.getYear(), localDateNow.getMonth());
    }

    public static YearMonth of(int i, int i2) {
        ChronoField.YEAR.checkValidValue(i);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        return new YearMonth(i, i2);
    }

    private YearMonth with(int i, int i2) {
        return (this.year == i && this.month == i2) ? this : new YearMonth(i, i2);
    }

    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public YearMonth m2677plus(y4p y4pVar) {
        return (YearMonth) y4pVar.addTo(this);
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar == ChronoUnit.MONTHS || c5pVar == ChronoUnit.YEARS || c5pVar == ChronoUnit.DECADES || c5pVar == ChronoUnit.CENTURIES || c5pVar == ChronoUnit.MILLENNIA || c5pVar == ChronoUnit.ERAS;
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    @Override // defpackage.s4p
    public YearMonth plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            switch (b.f29605b[((ChronoUnit) c5pVar).ordinal()]) {
                case 1:
                    return plusMonths(j);
                case 2:
                    return plusYears(j);
                case 3:
                    return plusYears(crd.m(j, 10));
                case 4:
                    return plusYears(crd.m(j, 100));
                case 5:
                    return plusYears(crd.m(j, 1000));
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return with((z4p) chronoField, crd.k(getLong(chronoField), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
            }
        }
        return (YearMonth) c5pVar.addTo(this, j);
    }

    /* JADX INFO: renamed from: minus, reason: merged with bridge method [inline-methods] */
    public YearMonth m2676minus(y4p y4pVar) {
        return (YearMonth) y4pVar.subtractFrom(this);
    }

    @Override // defpackage.s4p
    public YearMonth with(w4p w4pVar) {
        return (YearMonth) w4pVar.adjustInto(this);
    }

    @Override // defpackage.s4p
    public YearMonth with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) z4pVar;
            chronoField.checkValidValue(j);
            int i = b.f29604a[chronoField.ordinal()];
            if (i == 1) {
                return withMonth((int) j);
            }
            if (i == 2) {
                return plusMonths(j - getLong(ChronoField.PROLEPTIC_MONTH));
            }
            if (i == 3) {
                if (this.year < 1) {
                    j = 1 - j;
                }
                return withYear((int) j);
            }
            if (i == 4) {
                return withYear((int) j);
            }
            if (i == 5) {
                return getLong(ChronoField.ERA) == j ? this : withYear(1 - this.year);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }
        return (YearMonth) z4pVar.adjustInto(this, j);
    }
}
