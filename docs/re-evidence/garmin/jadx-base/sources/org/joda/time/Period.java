package org.joda.time;

import am.j;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import org.apache.commons.lang3.e;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class Period extends BasePeriod implements ReadablePeriod, Serializable {
    public static final Period ZERO = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        super(i14, i15, i16, i17, i18, i19, i24, i25, PeriodType.standard());
    }

    private void checkYearsAndMonths(String str) {
        if (getMonths() != 0) {
            e.w(j.m("Cannot convert to ", str, " as this period contains months and months vary in length"));
        } else {
            if (getYears() == 0) {
                return;
            }
            e.w(j.m("Cannot convert to ", str, " as this period contains years and years vary in length"));
        }
    }

    public static Period days(int i14) {
        return new Period(new int[]{0, 0, 0, i14, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period fieldDifference(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if (readablePartial == null || readablePartial2 == null) {
            h.s("ReadablePartial objects must not be null");
            return null;
        }
        if (readablePartial.size() != readablePartial2.size()) {
            h.s("ReadablePartial objects must have the same set of fields");
            return null;
        }
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[readablePartial.size()];
        int[] iArr = new int[readablePartial.size()];
        int size = readablePartial.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (readablePartial.getFieldType(i14) != readablePartial2.getFieldType(i14)) {
                h.s("ReadablePartial objects must have the same set of fields");
                return null;
            }
            DurationFieldType durationType = readablePartial.getFieldType(i14).getDurationType();
            durationFieldTypeArr[i14] = durationType;
            if (i14 > 0 && durationFieldTypeArr[i14 - 1].equals(durationType)) {
                h.s("ReadablePartial objects must not have overlapping fields");
                return null;
            }
            iArr[i14] = readablePartial2.getValue(i14) - readablePartial.getValue(i14);
        }
        return new Period(iArr, PeriodType.forFields(durationFieldTypeArr));
    }

    public static Period hours(int i14) {
        return new Period(new int[]{0, 0, 0, 0, i14, 0, 0, 0}, PeriodType.standard());
    }

    public static Period millis(int i14) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, i14}, PeriodType.standard());
    }

    public static Period minutes(int i14) {
        return new Period(new int[]{0, 0, 0, 0, 0, i14, 0, 0}, PeriodType.standard());
    }

    public static Period months(int i14) {
        return new Period(new int[]{0, i14, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    @FromString
    public static Period parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    public static Period seconds(int i14) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i14, 0}, PeriodType.standard());
    }

    public static Period weeks(int i14) {
        return new Period(new int[]{0, 0, i14, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period years(int i14) {
        return new Period(new int[]{i14, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
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

    public Period minus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period minusDays(int i14) {
        return plusDays(-i14);
    }

    public Period minusHours(int i14) {
        return plusHours(-i14);
    }

    public Period minusMillis(int i14) {
        return plusMillis(-i14);
    }

    public Period minusMinutes(int i14) {
        return plusMinutes(-i14);
    }

    public Period minusMonths(int i14) {
        return plusMonths(-i14);
    }

    public Period minusSeconds(int i14) {
        return plusSeconds(-i14);
    }

    public Period minusWeeks(int i14) {
        return plusWeeks(-i14);
    }

    public Period minusYears(int i14) {
        return plusYears(-i14);
    }

    public Period multipliedBy(int i14) {
        if (this == ZERO || i14 == 1) {
            return this;
        }
        int[] values = getValues();
        for (int i15 = 0; i15 < values.length; i15++) {
            values[i15] = FieldUtils.safeMultiply(values[i15], i14);
        }
        return new Period(values, getPeriodType());
    }

    public Period negated() {
        return multipliedBy(-1);
    }

    public Period normalizedStandard(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        Period period = new Period((((long) getWeeks()) * CoreConstants.MILLIS_IN_ONE_WEEK) + (((long) getDays()) * 86400000) + (((long) getHours()) * 3600000) + (((long) getMinutes()) * 60000) + (((long) getSeconds()) * 1000) + ((long) getMillis()), periodType2, ISOChronology.getInstanceUTC());
        int years = getYears();
        int months = getMonths();
        if (years == 0 && months == 0) {
            return period;
        }
        long j8 = (((long) years) * 12) + ((long) months);
        if (periodType2.isSupported(DurationFieldType.YEARS_TYPE)) {
            int iSafeToInt = FieldUtils.safeToInt(j8 / 12);
            period = period.withYears(iSafeToInt);
            j8 -= ((long) iSafeToInt) * 12;
        }
        if (periodType2.isSupported(DurationFieldType.MONTHS_TYPE)) {
            int iSafeToInt2 = FieldUtils.safeToInt(j8);
            period = period.withMonths(iSafeToInt2);
            j8 -= (long) iSafeToInt2;
        }
        if (j8 == 0) {
            return period;
        }
        throw new UnsupportedOperationException("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: " + toString());
    }

    public Period plus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period plusDays(int i14) {
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period plusHours(int i14) {
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period plusMillis(int i14) {
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period plusMinutes(int i14) {
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period plusMonths(int i14) {
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period plusSeconds(int i14) {
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period plusWeeks(int i14) {
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period plusYears(int i14) {
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    @Override // org.joda.time.base.AbstractPeriod, org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return this;
    }

    public Days toStandardDays() {
        checkYearsAndMonths("Days");
        return Days.days(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getHours()) * 3600000) + ((((long) getMinutes()) * 60000) + ((((long) getSeconds()) * 1000) + ((long) getMillis())))) / 86400000, getDays()), ((long) getWeeks()) * 7)));
    }

    public Duration toStandardDuration() {
        checkYearsAndMonths("Duration");
        return new Duration((((long) getWeeks()) * CoreConstants.MILLIS_IN_ONE_WEEK) + (((long) getDays()) * 86400000) + (((long) getHours()) * 3600000) + (((long) getMinutes()) * 60000) + (((long) getSeconds()) * 1000) + ((long) getMillis()));
    }

    public Hours toStandardHours() {
        checkYearsAndMonths("Hours");
        return Hours.hours(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getMinutes()) * 60000) + ((((long) getSeconds()) * 1000) + ((long) getMillis()))) / 3600000, getHours()), ((long) getDays()) * 24), ((long) getWeeks()) * 168)));
    }

    public Minutes toStandardMinutes() {
        checkYearsAndMonths("Minutes");
        return Minutes.minutes(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getSeconds()) * 1000) + ((long) getMillis())) / 60000, getMinutes()), ((long) getHours()) * 60), ((long) getDays()) * 1440), ((long) getWeeks()) * 10080)));
    }

    public Seconds toStandardSeconds() {
        checkYearsAndMonths("Seconds");
        return Seconds.seconds(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(getMillis() / 1000, getSeconds()), ((long) getMinutes()) * 60), ((long) getHours()) * 3600), ((long) getDays()) * 86400), ((long) getWeeks()) * 604800)));
    }

    public Weeks toStandardWeeks() {
        checkYearsAndMonths("Weeks");
        long days = (((long) getDays()) * 86400000) + (((long) getHours()) * 3600000) + (((long) getMinutes()) * 60000) + (((long) getSeconds()) * 1000) + ((long) getMillis());
        return Weeks.weeks(FieldUtils.safeToInt((days / CoreConstants.MILLIS_IN_ONE_WEEK) + ((long) getWeeks())));
    }

    public Period withDays(int i14) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period withField(DurationFieldType durationFieldType, int i14) {
        if (durationFieldType == null) {
            h.s("Field must not be null");
            return null;
        }
        int[] values = getValues();
        super.setFieldInto(values, durationFieldType, i14);
        return new Period(values, getPeriodType());
    }

    public Period withFieldAdded(DurationFieldType durationFieldType, int i14) {
        if (durationFieldType == null) {
            h.s("Field must not be null");
            return null;
        }
        if (i14 == 0) {
            return this;
        }
        int[] values = getValues();
        super.addFieldInto(values, durationFieldType, i14);
        return new Period(values, getPeriodType());
    }

    public Period withFields(ReadablePeriod readablePeriod) {
        return readablePeriod == null ? this : new Period(super.mergePeriodInto(getValues(), readablePeriod), getPeriodType());
    }

    public Period withHours(int i14) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period withMillis(int i14) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period withMinutes(int i14) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period withMonths(int i14) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period withPeriodType(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        return periodType2.equals(getPeriodType()) ? this : new Period(this, periodType2);
    }

    public Period withSeconds(int i14) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period withWeeks(int i14) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public Period withYears(int i14) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, i14);
        return new Period(values, getPeriodType());
    }

    public static Period parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str);
    }

    public Period(int i14, int i15, int i16, int i17) {
        super(0, 0, 0, 0, i14, i15, i16, i17, PeriodType.standard());
    }

    public Period() {
        super(0L, (PeriodType) null, (Chronology) null);
    }

    public Period(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, PeriodType periodType) {
        super(i14, i15, i16, i17, i18, i19, i24, i25, periodType);
    }

    public Period(long j8) {
        super(j8);
    }

    public Period(long j8, PeriodType periodType) {
        super(j8, periodType, (Chronology) null);
    }

    public Period(long j8, Chronology chronology) {
        super(j8, (PeriodType) null, chronology);
    }

    public Period(long j8, PeriodType periodType, Chronology chronology) {
        super(j8, periodType, chronology);
    }

    public Period(long j8, long j14) {
        super(j8, j14, null, null);
    }

    public Period(long j8, long j14, PeriodType periodType) {
        super(j8, j14, periodType, null);
    }

    public Period(long j8, long j14, Chronology chronology) {
        super(j8, j14, null, chronology);
    }

    public Period(long j8, long j14, PeriodType periodType, Chronology chronology) {
        super(j8, j14, periodType, chronology);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        super(readablePartial, readablePartial2, (PeriodType) null);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        super(readablePartial, readablePartial2, periodType);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public Period(Object obj) {
        super(obj, (PeriodType) null, (Chronology) null);
    }

    public Period(Object obj, PeriodType periodType) {
        super(obj, periodType, (Chronology) null);
    }

    public Period(Object obj, Chronology chronology) {
        super(obj, (PeriodType) null, chronology);
    }

    public Period(Object obj, PeriodType periodType, Chronology chronology) {
        super(obj, periodType, chronology);
    }

    private Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }

    public Period normalizedStandard() {
        return normalizedStandard(PeriodType.standard());
    }
}
