package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes3.dex */
public class MutablePeriod extends BasePeriod implements ReadWritablePeriod, Cloneable, Serializable {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        super(i14, i15, i16, i17, i18, i19, i24, i25, PeriodType.standard());
    }

    @FromString
    public static MutablePeriod parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        setPeriod(FieldUtils.safeAdd(getYears(), i14), FieldUtils.safeAdd(getMonths(), i15), FieldUtils.safeAdd(getWeeks(), i16), FieldUtils.safeAdd(getDays(), i17), FieldUtils.safeAdd(getHours(), i18), FieldUtils.safeAdd(getMinutes(), i19), FieldUtils.safeAdd(getSeconds(), i24), FieldUtils.safeAdd(getMillis(), i25));
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addDays(int i14) {
        super.addField(DurationFieldType.days(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addHours(int i14) {
        super.addField(DurationFieldType.hours(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMillis(int i14) {
        super.addField(DurationFieldType.millis(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMinutes(int i14) {
        super.addField(DurationFieldType.minutes(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMonths(int i14) {
        super.addField(DurationFieldType.months(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addSeconds(int i14) {
        super.addField(DurationFieldType.seconds(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addWeeks(int i14) {
        super.addField(DurationFieldType.weeks(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addYears(int i14) {
        super.addField(DurationFieldType.years(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void clear() {
        super.setValues(new int[size()]);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutablePeriod copy() {
        return (MutablePeriod) clone();
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    @Override // org.joda.time.base.BasePeriod
    public void mergePeriod(ReadablePeriod readablePeriod) {
        super.mergePeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void set(DurationFieldType durationFieldType, int i14) {
        super.setField(durationFieldType, i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setDays(int i14) {
        super.setField(DurationFieldType.days(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setHours(int i14) {
        super.setField(DurationFieldType.hours(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMillis(int i14) {
        super.setField(DurationFieldType.millis(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMinutes(int i14) {
        super.setField(DurationFieldType.minutes(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMonths(int i14) {
        super.setField(DurationFieldType.months(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setPeriod(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            setPeriod(0L);
        } else {
            setPeriod(readableInterval.getStartMillis(), readableInterval.getEndMillis(), DateTimeUtils.getChronology(readableInterval.getChronology()));
        }
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setSeconds(int i14) {
        super.setField(DurationFieldType.seconds(), i14);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setValue(int i14, int i15) {
        super.setValue(i14, i15);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setWeeks(int i14) {
        super.setField(DurationFieldType.weeks(), i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setYears(int i14) {
        super.setField(DurationFieldType.years(), i14);
    }

    public static MutablePeriod parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str).toMutablePeriod();
    }

    public MutablePeriod(PeriodType periodType) {
        super(0L, periodType, (Chronology) null);
    }

    public MutablePeriod(int i14, int i15, int i16, int i17) {
        super(0, 0, 0, 0, i14, i15, i16, i17, PeriodType.standard());
    }

    public MutablePeriod() {
        super(0L, (PeriodType) null, (Chronology) null);
    }

    public MutablePeriod(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, PeriodType periodType) {
        super(i14, i15, i16, i17, i18, i19, i24, i25, periodType);
    }

    public MutablePeriod(long j8) {
        super(j8);
    }

    public MutablePeriod(long j8, PeriodType periodType) {
        super(j8, periodType, (Chronology) null);
    }

    public MutablePeriod(long j8, Chronology chronology) {
        super(j8, (PeriodType) null, chronology);
    }

    public MutablePeriod(long j8, PeriodType periodType, Chronology chronology) {
        super(j8, periodType, chronology);
    }

    public MutablePeriod(long j8, long j14) {
        super(j8, j14, null, null);
    }

    public MutablePeriod(long j8, long j14, PeriodType periodType) {
        super(j8, j14, periodType, null);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setPeriod(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        super.setPeriod(i14, i15, i16, i17, i18, i19, i24, i25);
    }

    public MutablePeriod(long j8, long j14, Chronology chronology) {
        super(j8, j14, null, chronology);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setPeriod(ReadablePeriod readablePeriod) {
        super.setPeriod(readablePeriod);
    }

    public MutablePeriod(long j8, long j14, PeriodType periodType, Chronology chronology) {
        super(j8, j14, periodType, chronology);
    }

    public void setPeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == readableInstant2) {
            setPeriod(0L);
        } else {
            setPeriod(DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantMillis(readableInstant2), DateTimeUtils.getIntervalChronology(readableInstant, readableInstant2));
        }
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public MutablePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public void setPeriod(long j8, long j14) {
        setPeriod(j8, j14, null);
    }

    public MutablePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public void setPeriod(long j8, long j14, Chronology chronology) {
        setValues(DateTimeUtils.getChronology(chronology).get(this, j8, j14));
    }

    public MutablePeriod(Object obj) {
        super(obj, (PeriodType) null, (Chronology) null);
    }

    public MutablePeriod(Object obj, PeriodType periodType) {
        super(obj, periodType, (Chronology) null);
    }

    public void setPeriod(ReadableDuration readableDuration) {
        setPeriod(readableDuration, (Chronology) null);
    }

    public MutablePeriod(Object obj, Chronology chronology) {
        super(obj, (PeriodType) null, chronology);
    }

    public void setPeriod(ReadableDuration readableDuration, Chronology chronology) {
        setPeriod(DateTimeUtils.getDurationMillis(readableDuration), chronology);
    }

    public MutablePeriod(Object obj, PeriodType periodType, Chronology chronology) {
        super(obj, periodType, chronology);
    }

    public void setPeriod(long j8) {
        setPeriod(j8, (Chronology) null);
    }

    public void setPeriod(long j8, Chronology chronology) {
        setValues(DateTimeUtils.getChronology(chronology).get(this, j8));
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(ReadablePeriod readablePeriod) {
        super.addPeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(DurationFieldType durationFieldType, int i14) {
        super.addField(durationFieldType, i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(ReadableInterval readableInterval) {
        if (readableInterval != null) {
            add(readableInterval.toPeriod(getPeriodType()));
        }
    }

    public void add(ReadableDuration readableDuration) {
        if (readableDuration != null) {
            add(new Period(readableDuration.getMillis(), getPeriodType()));
        }
    }

    public void add(long j8) {
        add(new Period(j8, getPeriodType()));
    }

    public void add(long j8, Chronology chronology) {
        add(new Period(j8, getPeriodType(), chronology));
    }
}
