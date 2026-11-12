package org.threeten.bp.chrono;

import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
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
import java.io.Serializable;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class ThaiBuddhistDate extends uv3<ThaiBuddhistDate> implements Serializable {
    private static final long serialVersionUID = -8722293800195731463L;
    private final LocalDate isoDate;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29616a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f29616a = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29616a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29616a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29616a[ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29616a[ChronoField.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29616a[ChronoField.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29616a[ChronoField.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ThaiBuddhistDate(LocalDate localDate) {
        crd.i(localDate, DialWidgetType.DATE);
        this.isoDate = localDate;
    }

    public static ThaiBuddhistDate from(t4p t4pVar) {
        return ThaiBuddhistChronology.INSTANCE.date(t4pVar);
    }

    private long getProlepticMonth() {
        return ((((long) getProlepticYear()) * 12) + ((long) this.isoDate.getMonthValue())) - 1;
    }

    private int getProlepticYear() {
        return this.isoDate.getYear() + 543;
    }

    public static ThaiBuddhistDate now() {
        return now(g14.d());
    }

    public static ThaiBuddhistDate of(int i, int i2, int i3) {
        return ThaiBuddhistChronology.INSTANCE.date(i, i2, i3);
    }

    public static org.threeten.bp.chrono.a readExternal(DataInput dataInput) throws IOException {
        return ThaiBuddhistChronology.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }

    private Object writeReplace() {
        return new gwl((byte) 7, this);
    }

    @Override // defpackage.uv3, org.threeten.bp.chrono.a
    public final vv3<ThaiBuddhistDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // org.threeten.bp.chrono.a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThaiBuddhistDate) {
            return this.isoDate.equals(((ThaiBuddhistDate) obj).isoDate);
        }
        return false;
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        int i = a.f29616a[((ChronoField) z4pVar).ordinal()];
        if (i == 4) {
            int prolepticYear = getProlepticYear();
            if (prolepticYear < 1) {
                prolepticYear = 1 - prolepticYear;
            }
            return prolepticYear;
        }
        if (i == 5) {
            return getProlepticMonth();
        }
        if (i == 6) {
            return getProlepticYear();
        }
        if (i != 7) {
            return this.isoDate.getLong(z4pVar);
        }
        return getProlepticYear() < 1 ? 0 : 1;
    }

    @Override // org.threeten.bp.chrono.a
    public int hashCode() {
        return getChronology().getId().hashCode() ^ this.isoDate.hashCode();
    }

    @Override // org.threeten.bp.chrono.a
    public int lengthOfMonth() {
        return this.isoDate.lengthOfMonth();
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
        int i = a.f29616a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.isoDate.range(z4pVar);
        }
        if (i != 4) {
            return getChronology().range(chronoField);
        }
        ValueRange valueRangeRange = ChronoField.YEAR.range();
        return ValueRange.of(1L, getProlepticYear() <= 0 ? (-(valueRangeRange.getMinimum() + 543)) + 1 : 543 + valueRangeRange.getMaximum());
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

    public static ThaiBuddhistDate now(ZoneId zoneId) {
        return now(g14.c(zoneId));
    }

    @Override // org.threeten.bp.chrono.a
    public ThaiBuddhistChronology getChronology() {
        return ThaiBuddhistChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.a
    public ThaiBuddhistEra getEra() {
        return (ThaiBuddhistEra) super.getEra();
    }

    @Override // defpackage.uv3
    public ThaiBuddhistDate plusDays(long j) {
        return with(this.isoDate.plusDays(j));
    }

    @Override // defpackage.uv3
    public ThaiBuddhistDate plusMonths(long j) {
        return with(this.isoDate.plusMonths(j));
    }

    @Override // defpackage.uv3
    public ThaiBuddhistDate plusYears(long j) {
        return with(this.isoDate.plusYears(j));
    }

    @Override // defpackage.uv3, org.threeten.bp.chrono.a
    public xv3 until(org.threeten.bp.chrono.a aVar) {
        Period periodUntil = this.isoDate.until(aVar);
        return getChronology().period(periodUntil.getYears(), periodUntil.getMonths(), periodUntil.getDays());
    }

    public static ThaiBuddhistDate now(g14 g14Var) {
        return new ThaiBuddhistDate(LocalDate.now(g14Var));
    }

    @Override // org.threeten.bp.chrono.a, defpackage.rv5
    public ThaiBuddhistDate minus(y4p y4pVar) {
        return (ThaiBuddhistDate) super.minus(y4pVar);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.rv5, defpackage.s4p
    public ThaiBuddhistDate with(w4p w4pVar) {
        return (ThaiBuddhistDate) super.with(w4pVar);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.rv5, defpackage.s4p
    public ThaiBuddhistDate minus(long j, c5p c5pVar) {
        return (ThaiBuddhistDate) super.minus(j, c5pVar);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.rv5
    public ThaiBuddhistDate plus(y4p y4pVar) {
        return (ThaiBuddhistDate) super.plus(y4pVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    @Override // org.threeten.bp.chrono.a, defpackage.s4p
    public ThaiBuddhistDate with(z4p z4pVar, long j) {
        int iCheckValidIntValue;
        int i;
        if (z4pVar instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) z4pVar;
            if (getLong(chronoField) == j) {
                return this;
            }
            int[] iArr = a.f29616a;
            int i2 = iArr[chronoField.ordinal()];
            if (i2 == 4) {
                iCheckValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
                i = iArr[chronoField.ordinal()];
                if (i != 4) {
                    LocalDate localDate = this.isoDate;
                    if (getProlepticYear() < 1) {
                        iCheckValidIntValue = 1 - iCheckValidIntValue;
                    }
                    return with(localDate.withYear(iCheckValidIntValue - 543));
                }
                if (i != 6) {
                    return with(this.isoDate.withYear(iCheckValidIntValue - 543));
                }
                if (i == 7) {
                    return with(this.isoDate.withYear((-542) - getProlepticYear()));
                }
            } else {
                if (i2 == 5) {
                    getChronology().range(chronoField).checkValidValue(j, chronoField);
                    return plusMonths(j - getProlepticMonth());
                }
                if (i2 == 6 || i2 == 7) {
                    iCheckValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
                    i = iArr[chronoField.ordinal()];
                    if (i != 4) {
                        LocalDate localDate2 = this.isoDate;
                        if (getProlepticYear() < 1) {
                            iCheckValidIntValue = 1 - iCheckValidIntValue;
                        }
                        return with(localDate2.withYear(iCheckValidIntValue - 543));
                    }
                    if (i != 6) {
                        return with(this.isoDate.withYear(iCheckValidIntValue - 543));
                    }
                    if (i == 7) {
                        return with(this.isoDate.withYear((-542) - getProlepticYear()));
                    }
                }
            }
            return with(this.isoDate.with(z4pVar, j));
        }
        return (ThaiBuddhistDate) z4pVar.adjustInto(this, j);
    }

    @Override // defpackage.uv3, org.threeten.bp.chrono.a, defpackage.s4p
    public ThaiBuddhistDate plus(long j, c5p c5pVar) {
        return (ThaiBuddhistDate) super.plus(j, c5pVar);
    }

    private ThaiBuddhistDate with(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new ThaiBuddhistDate(localDate);
    }
}
