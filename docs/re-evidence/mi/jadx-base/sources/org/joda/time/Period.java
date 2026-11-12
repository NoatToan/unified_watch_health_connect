package org.joda.time;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
import defpackage.bw3;
import defpackage.fl9;
import defpackage.hgj;
import defpackage.kgj;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.txc;
import defpackage.wq5;
import defpackage.yqh;
import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public final class Period extends BasePeriod implements qgj, Serializable {
    public static final Period ZERO = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period(long j, long j2, bw3 bw3Var) {
        super(j, j2, null, bw3Var);
    }

    private void checkYearsAndMonths(String str) {
        if (getMonths() != 0) {
            throw new UnsupportedOperationException("Cannot convert to " + str + " as this period contains months and months vary in length");
        }
        if (getYears() == 0) {
            return;
        }
        throw new UnsupportedOperationException("Cannot convert to " + str + " as this period contains years and years vary in length");
    }

    public static Period days(int i) {
        return new Period(new int[]{0, 0, 0, i, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period fieldDifference(ogj ogjVar, ogj ogjVar2) {
        if (ogjVar == null || ogjVar2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (ogjVar.size() != ogjVar2.size()) {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[ogjVar.size()];
        int[] iArr = new int[ogjVar.size()];
        int size = ogjVar.size();
        for (int i = 0; i < size; i++) {
            if (ogjVar.getFieldType(i) != ogjVar2.getFieldType(i)) {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
            DurationFieldType durationType = ogjVar.getFieldType(i).getDurationType();
            durationFieldTypeArr[i] = durationType;
            if (i > 0 && durationFieldTypeArr[i - 1].equals(durationType)) {
                throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
            }
            iArr[i] = ogjVar2.getValue(i) - ogjVar.getValue(i);
        }
        return new Period(iArr, PeriodType.forFields(durationFieldTypeArr));
    }

    public static Period hours(int i) {
        return new Period(new int[]{0, 0, 0, 0, i, 0, 0, 0}, PeriodType.standard());
    }

    public static Period millis(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, i}, PeriodType.standard());
    }

    public static Period minutes(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, i, 0, 0}, PeriodType.standard());
    }

    public static Period months(int i) {
        return new Period(new int[]{0, i, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    @FromString
    public static Period parse(String str) {
        return parse(str, txc.a());
    }

    public static Period seconds(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i, 0}, PeriodType.standard());
    }

    public static Period weeks(int i) {
        return new Period(new int[]{0, 0, i, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period years(int i) {
        return new Period(new int[]{i, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
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

    public Period minus(qgj qgjVar) {
        if (qgjVar == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -qgjVar.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -qgjVar.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -qgjVar.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -qgjVar.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -qgjVar.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -qgjVar.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -qgjVar.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -qgjVar.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period minusDays(int i) {
        return plusDays(-i);
    }

    public Period minusHours(int i) {
        return plusHours(-i);
    }

    public Period minusMillis(int i) {
        return plusMillis(-i);
    }

    public Period minusMinutes(int i) {
        return plusMinutes(-i);
    }

    public Period minusMonths(int i) {
        return plusMonths(-i);
    }

    public Period minusSeconds(int i) {
        return plusSeconds(-i);
    }

    public Period minusWeeks(int i) {
        return plusWeeks(-i);
    }

    public Period minusYears(int i) {
        return plusYears(-i);
    }

    public Period multipliedBy(int i) {
        if (this == ZERO || i == 1) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < values.length; i2++) {
            values[i2] = fl9.h(values[i2], i);
        }
        return new Period(values, getPeriodType());
    }

    public Period negated() {
        return multipliedBy(-1);
    }

    public Period normalizedStandard() {
        return normalizedStandard(PeriodType.standard());
    }

    public Period plus(qgj qgjVar) {
        if (qgjVar == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, qgjVar.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, qgjVar.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, qgjVar.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, qgjVar.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, qgjVar.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, qgjVar.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, qgjVar.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, qgjVar.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period plusDays(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusHours(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMillis(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMinutes(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMonths(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusSeconds(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusWeeks(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusYears(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    @Override // defpackage.k10
    public Period toPeriod() {
        return this;
    }

    public Days toStandardDays() {
        checkYearsAndMonths("Days");
        return Days.days(fl9.m(fl9.e(fl9.e((((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) + (((long) getHours()) * 3600000)) / 86400000, getDays()), ((long) getWeeks()) * 7)));
    }

    public Duration toStandardDuration() {
        checkYearsAndMonths("Duration");
        return new Duration(((long) getMillis()) + (((long) getSeconds()) * 1000) + (((long) getMinutes()) * 60000) + (((long) getHours()) * 3600000) + (((long) getDays()) * 86400000) + (((long) getWeeks()) * 604800000));
    }

    public Hours toStandardHours() {
        checkYearsAndMonths("Hours");
        return Hours.hours(fl9.m(fl9.e(fl9.e(fl9.e(((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) / 3600000, getHours()), ((long) getDays()) * 24), ((long) getWeeks()) * 168)));
    }

    public Minutes toStandardMinutes() {
        checkYearsAndMonths("Minutes");
        return Minutes.minutes(fl9.m(fl9.e(fl9.e(fl9.e(fl9.e((((long) getMillis()) + (((long) getSeconds()) * 1000)) / 60000, getMinutes()), ((long) getHours()) * 60), ((long) getDays()) * DateTimeHelper.sDayInMinutes), ((long) getWeeks()) * 10080)));
    }

    public Seconds toStandardSeconds() {
        checkYearsAndMonths("Seconds");
        return Seconds.seconds(fl9.m(fl9.e(fl9.e(fl9.e(fl9.e(fl9.e(getMillis() / 1000, getSeconds()), ((long) getMinutes()) * 60), ((long) getHours()) * TimeDateUtil.TIME_HOUR), ((long) getDays()) * 86400), ((long) getWeeks()) * 604800)));
    }

    public Weeks toStandardWeeks() {
        checkYearsAndMonths("Weeks");
        return Weeks.weeks(fl9.m(((long) getWeeks()) + (((((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) + (((long) getHours()) * 3600000)) + (((long) getDays()) * 86400000)) / 604800000)));
    }

    public Period withDays(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withField(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        int[] values = getValues();
        super.setFieldInto(values, durationFieldType, i);
        return new Period(values, getPeriodType());
    }

    public Period withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        super.addFieldInto(values, durationFieldType, i);
        return new Period(values, getPeriodType());
    }

    public Period withFields(qgj qgjVar) {
        return qgjVar == null ? this : new Period(super.mergePeriodInto(getValues(), qgjVar), getPeriodType());
    }

    public Period withHours(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMillis(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMinutes(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMonths(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withPeriodType(PeriodType periodType) {
        PeriodType periodTypeK = wq5.k(periodType);
        return periodTypeK.equals(getPeriodType()) ? this : new Period(this, periodTypeK);
    }

    public Period withSeconds(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withWeeks(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withYears(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public static Period parse(String str, yqh yqhVar) {
        return yqhVar.h(str);
    }

    public Period normalizedStandard(PeriodType periodType) {
        PeriodType periodTypeK = wq5.k(periodType);
        Period period = new Period(((long) getMillis()) + (((long) getSeconds()) * 1000) + (((long) getMinutes()) * 60000) + (((long) getHours()) * 3600000) + (((long) getDays()) * 86400000) + (((long) getWeeks()) * 604800000), periodTypeK, ISOChronology.getInstanceUTC());
        int years = getYears();
        int months = getMonths();
        if (years != 0 || months != 0) {
            long j = (((long) years) * 12) + ((long) months);
            if (periodTypeK.isSupported(DurationFieldType.YEARS_TYPE)) {
                int iM = fl9.m(j / 12);
                period = period.withYears(iM);
                j -= ((long) iM) * 12;
            }
            if (periodTypeK.isSupported(DurationFieldType.MONTHS_TYPE)) {
                int iM2 = fl9.m(j);
                j -= (long) iM2;
                period = period.withMonths(iM2);
            }
            if (j != 0) {
                throw new UnsupportedOperationException("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: " + toString());
            }
        }
        return period;
    }

    public Period(long j, bw3 bw3Var) {
        super(j, (PeriodType) null, bw3Var);
    }

    public Period(hgj hgjVar, kgj kgjVar) {
        super(hgjVar, kgjVar, (PeriodType) null);
    }

    public Period(kgj kgjVar, hgj hgjVar) {
        super(kgjVar, hgjVar, (PeriodType) null);
    }

    public Period(kgj kgjVar, kgj kgjVar2) {
        super(kgjVar, kgjVar2, (PeriodType) null);
    }

    public Period(ogj ogjVar, ogj ogjVar2) {
        super(ogjVar, ogjVar2, (PeriodType) null);
    }

    public Period(Object obj, bw3 bw3Var) {
        super(obj, (PeriodType) null, bw3Var);
    }

    public Period() {
        super(0L, (PeriodType) null, (bw3) null);
    }

    public Period(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public Period(long j) {
        super(j);
    }

    public Period(long j, PeriodType periodType) {
        super(j, periodType, (bw3) null);
    }

    public Period(long j, PeriodType periodType, bw3 bw3Var) {
        super(j, periodType, bw3Var);
    }

    public Period(long j, long j2) {
        super(j, j2, null, null);
    }

    public Period(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, null);
    }

    public Period(long j, long j2, PeriodType periodType, bw3 bw3Var) {
        super(j, j2, periodType, bw3Var);
    }

    public Period(kgj kgjVar, kgj kgjVar2, PeriodType periodType) {
        super(kgjVar, kgjVar2, periodType);
    }

    public Period(ogj ogjVar, ogj ogjVar2, PeriodType periodType) {
        super(ogjVar, ogjVar2, periodType);
    }

    public Period(kgj kgjVar, hgj hgjVar, PeriodType periodType) {
        super(kgjVar, hgjVar, periodType);
    }

    public Period(hgj hgjVar, kgj kgjVar, PeriodType periodType) {
        super(hgjVar, kgjVar, periodType);
    }

    public Period(Object obj) {
        super(obj, (PeriodType) null, (bw3) null);
    }

    public Period(Object obj, PeriodType periodType) {
        super(obj, periodType, (bw3) null);
    }

    public Period(Object obj, PeriodType periodType, bw3 bw3Var) {
        super(obj, periodType, bw3Var);
    }

    private Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }
}
