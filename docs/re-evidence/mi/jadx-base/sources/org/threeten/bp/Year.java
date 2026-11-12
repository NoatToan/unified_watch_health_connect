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
public final class Year extends sv5 implements s4p, w4p, Comparable<Year>, Serializable {
    public static final int MAX_VALUE = 999999999;
    public static final int MIN_VALUE = -999999999;
    private static final long serialVersionUID = -23038383694477807L;
    private final int year;
    public static final b5p<Year> FROM = new a();
    private static final iq5 PARSER = new kq5().n(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).v();

    public class a implements b5p<Year> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Year a(t4p t4pVar) {
            return Year.from(t4pVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29603b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f29603b = iArr;
            try {
                iArr[ChronoUnit.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29603b[ChronoUnit.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29603b[ChronoUnit.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29603b[ChronoUnit.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29603b[ChronoUnit.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f29602a = iArr2;
            try {
                iArr2[ChronoField.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29602a[ChronoField.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29602a[ChronoField.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private Year(int i) {
        this.year = i;
    }

    public static Year from(t4p t4pVar) {
        if (t4pVar instanceof Year) {
            return (Year) t4pVar;
        }
        try {
            if (!IsoChronology.INSTANCE.equals(org.threeten.bp.chrono.b.from(t4pVar))) {
                t4pVar = LocalDate.from(t4pVar);
            }
            return of(t4pVar.get(ChronoField.YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
        }
    }

    public static boolean isLeap(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    public static Year now() {
        return now(g14.d());
    }

    public static Year of(int i) {
        ChronoField.YEAR.checkValidValue(i);
        return new Year(i);
    }

    public static Year parse(CharSequence charSequence) {
        return parse(charSequence, PARSER);
    }

    public static Year readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new iwl((byte) 67, this);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        if (org.threeten.bp.chrono.b.from(s4pVar).equals(IsoChronology.INSTANCE)) {
            return s4pVar.with(ChronoField.YEAR, this.year);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public LocalDate atDay(int i) {
        return LocalDate.ofYearDay(this.year, i);
    }

    public YearMonth atMonth(Month month) {
        return YearMonth.of(this.year, month);
    }

    public LocalDate atMonthDay(MonthDay monthDay) {
        return monthDay.atYear(this.year);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Year) && this.year == ((Year) obj).year;
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
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        int i = b.f29602a[((ChronoField) z4pVar).ordinal()];
        if (i == 1) {
            int i2 = this.year;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.year;
        }
        if (i == 3) {
            return this.year < 1 ? 0 : 1;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
    }

    public int getValue() {
        return this.year;
    }

    public int hashCode() {
        return this.year;
    }

    public boolean isAfter(Year year) {
        return this.year > year.year;
    }

    public boolean isBefore(Year year) {
        return this.year < year.year;
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar == ChronoField.YEAR || z4pVar == ChronoField.YEAR_OF_ERA || z4pVar == ChronoField.ERA;
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    public boolean isValidMonthDay(MonthDay monthDay) {
        return monthDay != null && monthDay.isValidYear(this.year);
    }

    public int length() {
        return isLeap() ? 366 : 365;
    }

    @Override // defpackage.s4p
    public Year minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public Year minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public Year plusYears(long j) {
        return j == 0 ? this : of(ChronoField.YEAR.checkValidIntValue(((long) this.year) + j));
    }

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.a()) {
            return (R) IsoChronology.INSTANCE;
        }
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.YEARS;
        }
        if (b5pVar == a5p.b() || b5pVar == a5p.c() || b5pVar == a5p.f() || b5pVar == a5p.g() || b5pVar == a5p.d()) {
            return null;
        }
        return (R) super.query(b5pVar);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar == ChronoField.YEAR_OF_ERA) {
            return ValueRange.of(1L, this.year <= 0 ? FolmeCore.NANOS_TO_S : 999999999L);
        }
        return super.range(z4pVar);
    }

    public String toString() {
        return Integer.toString(this.year);
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        Year yearFrom = from(s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, yearFrom);
        }
        long j = ((long) yearFrom.year) - ((long) this.year);
        int i = b.f29603b[((ChronoUnit) c5pVar).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return yearFrom.getLong(chronoField) - getLong(chronoField);
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
    }

    public static Year now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    public static Year parse(CharSequence charSequence, iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return (Year) iq5Var.h(charSequence, FROM);
    }

    public YearMonth atMonth(int i) {
        return YearMonth.of(this.year, i);
    }

    @Override // java.lang.Comparable
    public int compareTo(Year year) {
        return this.year - year.year;
    }

    public boolean isLeap() {
        return isLeap(this.year);
    }

    public static Year now(g14 g14Var) {
        return of(LocalDate.now(g14Var).getYear());
    }

    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Year m2675plus(y4p y4pVar) {
        return (Year) y4pVar.addTo(this);
    }

    @Override // defpackage.s4p
    public Year with(w4p w4pVar) {
        return (Year) w4pVar.adjustInto(this);
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar == ChronoUnit.YEARS || c5pVar == ChronoUnit.DECADES || c5pVar == ChronoUnit.CENTURIES || c5pVar == ChronoUnit.MILLENNIA || c5pVar == ChronoUnit.ERAS;
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    @Override // defpackage.s4p
    public Year plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            int i = b.f29603b[((ChronoUnit) c5pVar).ordinal()];
            if (i == 1) {
                return plusYears(j);
            }
            if (i == 2) {
                return plusYears(crd.m(j, 10));
            }
            if (i == 3) {
                return plusYears(crd.m(j, 100));
            }
            if (i == 4) {
                return plusYears(crd.m(j, 1000));
            }
            if (i == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return with((z4p) chronoField, crd.k(getLong(chronoField), j));
            }
            throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
        }
        return (Year) c5pVar.addTo(this, j);
    }

    @Override // defpackage.s4p
    public Year with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) z4pVar;
            chronoField.checkValidValue(j);
            int i = b.f29602a[chronoField.ordinal()];
            if (i == 1) {
                if (this.year < 1) {
                    j = 1 - j;
                }
                return of((int) j);
            }
            if (i == 2) {
                return of((int) j);
            }
            if (i == 3) {
                return getLong(ChronoField.ERA) == j ? this : of(1 - this.year);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }
        return (Year) z4pVar.adjustInto(this, j);
    }

    /* JADX INFO: renamed from: minus, reason: merged with bridge method [inline-methods] */
    public Year m2674minus(y4p y4pVar) {
        return (Year) y4pVar.subtractFrom(this);
    }
}
