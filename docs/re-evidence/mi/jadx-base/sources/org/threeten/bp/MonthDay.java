package org.threeten.bp;

import defpackage.a5p;
import defpackage.b5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.iq5;
import defpackage.iwl;
import defpackage.kq5;
import defpackage.s4p;
import defpackage.sv5;
import defpackage.t4p;
import defpackage.w4p;
import defpackage.z4p;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class MonthDay extends sv5 implements t4p, w4p, Comparable<MonthDay>, Serializable {
    public static final b5p<MonthDay> FROM = new a();
    private static final iq5 PARSER = new kq5().g("--").m(ChronoField.MONTH_OF_YEAR, 2).f('-').m(ChronoField.DAY_OF_MONTH, 2).v();
    private static final long serialVersionUID = -939150713474957432L;
    private final int day;
    private final int month;

    public class a implements b5p<MonthDay> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MonthDay a(t4p t4pVar) {
            return MonthDay.from(t4pVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29599a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f29599a = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29599a[ChronoField.MONTH_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private MonthDay(int i, int i2) {
        this.month = i;
        this.day = i2;
    }

    public static MonthDay from(t4p t4pVar) {
        if (t4pVar instanceof MonthDay) {
            return (MonthDay) t4pVar;
        }
        try {
            if (!IsoChronology.INSTANCE.equals(org.threeten.bp.chrono.b.from(t4pVar))) {
                t4pVar = LocalDate.from(t4pVar);
            }
            return of(t4pVar.get(ChronoField.MONTH_OF_YEAR), t4pVar.get(ChronoField.DAY_OF_MONTH));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain MonthDay from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName());
        }
    }

    public static MonthDay now() {
        return now(g14.d());
    }

    public static MonthDay of(Month month, int i) {
        crd.i(month, "month");
        ChronoField.DAY_OF_MONTH.checkValidValue(i);
        if (i <= month.maxLength()) {
            return new MonthDay(month.getValue(), i);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i + " is not valid for month " + month.name());
    }

    public static MonthDay parse(CharSequence charSequence) {
        return parse(charSequence, PARSER);
    }

    public static MonthDay readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new iwl((byte) 64, this);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        if (!org.threeten.bp.chrono.b.from(s4pVar).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        s4p s4pVarWith = s4pVar.with(ChronoField.MONTH_OF_YEAR, this.month);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return s4pVarWith.with(chronoField, Math.min(s4pVarWith.range(chronoField).getMaximum(), this.day));
    }

    public LocalDate atYear(int i) {
        return LocalDate.of(i, this.month, isValidYear(i) ? this.day : 28);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthDay)) {
            return false;
        }
        MonthDay monthDay = (MonthDay) obj;
        return this.month == monthDay.month && this.day == monthDay.day;
    }

    public String format(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return iq5Var.b(this);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        return range(z4pVar).checkValidIntValue(getLong(z4pVar), z4pVar);
    }

    public int getDayOfMonth() {
        return this.day;
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        int i;
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        int i2 = b.f29599a[((ChronoField) z4pVar).ordinal()];
        if (i2 == 1) {
            i = this.day;
        } else {
            if (i2 != 2) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
            }
            i = this.month;
        }
        return i;
    }

    public Month getMonth() {
        return Month.of(this.month);
    }

    public int getMonthValue() {
        return this.month;
    }

    public int hashCode() {
        return (this.month << 6) + this.day;
    }

    public boolean isAfter(MonthDay monthDay) {
        return compareTo(monthDay) > 0;
    }

    public boolean isBefore(MonthDay monthDay) {
        return compareTo(monthDay) < 0;
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar == ChronoField.MONTH_OF_YEAR || z4pVar == ChronoField.DAY_OF_MONTH;
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    public boolean isValidYear(int i) {
        return !(this.day == 29 && this.month == 2 && !Year.isLeap((long) i));
    }

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        return b5pVar == a5p.a() ? (R) IsoChronology.INSTANCE : (R) super.query(b5pVar);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar == ChronoField.MONTH_OF_YEAR) {
            return z4pVar.range();
        }
        return z4pVar == ChronoField.DAY_OF_MONTH ? ValueRange.of(1L, getMonth().minLength(), getMonth().maxLength()) : super.range(z4pVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.month < 10 ? "0" : "");
        sb.append(this.month);
        sb.append(this.day < 10 ? "-0" : "-");
        sb.append(this.day);
        return sb.toString();
    }

    public MonthDay with(Month month) {
        crd.i(month, "month");
        if (month.getValue() == this.month) {
            return this;
        }
        return new MonthDay(month.getValue(), Math.min(this.day, month.maxLength()));
    }

    public MonthDay withDayOfMonth(int i) {
        return i == this.day ? this : of(this.month, i);
    }

    public MonthDay withMonth(int i) {
        return with(Month.of(i));
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }

    public static MonthDay now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    public static MonthDay parse(CharSequence charSequence, iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return (MonthDay) iq5Var.h(charSequence, FROM);
    }

    @Override // java.lang.Comparable
    public int compareTo(MonthDay monthDay) {
        int i = this.month - monthDay.month;
        return i == 0 ? this.day - monthDay.day : i;
    }

    public static MonthDay now(g14 g14Var) {
        LocalDate localDateNow = LocalDate.now(g14Var);
        return of(localDateNow.getMonth(), localDateNow.getDayOfMonth());
    }

    public static MonthDay of(int i, int i2) {
        return of(Month.of(i), i2);
    }
}
