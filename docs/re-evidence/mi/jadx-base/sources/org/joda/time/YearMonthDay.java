package org.joda.time;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;
import defpackage.j10;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.wq5;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class YearMonthDay extends BasePartial implements ogj, Serializable {
    public static final int DAY_OF_MONTH = 2;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public YearMonthDay() {
    }

    public static YearMonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonthDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonthDay fromDateFields(Date date) {
        if (date != null) {
            return new YearMonthDay(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public Property dayOfMonth() {
        return new Property(this, 2);
    }

    public int getDayOfMonth() {
        return getValue(2);
    }

    @Override // defpackage.i10
    public gq5 getField(int i, bw3 bw3Var) {
        if (i == 0) {
            return bw3Var.year();
        }
        if (i == 1) {
            return bw3Var.monthOfYear();
        }
        if (i == 2) {
            return bw3Var.dayOfMonth();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    @Override // defpackage.i10, defpackage.ogj
    public DateTimeFieldType getFieldType(int i) {
        return FIELD_TYPES[i];
    }

    @Override // defpackage.i10
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getMonthOfYear() {
        return getValue(1);
    }

    public int getYear() {
        return getValue(0);
    }

    public YearMonthDay minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public YearMonthDay minusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), fl9.k(i));
    }

    public YearMonthDay minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), fl9.k(i));
    }

    public YearMonthDay minusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), fl9.k(i));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonthDay plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public YearMonthDay plusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), i);
    }

    public YearMonthDay plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public YearMonthDay plusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.base.BasePartial, defpackage.ogj
    public int size() {
        return 3;
    }

    public DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    public DateTime toDateTime(TimeOfDay timeOfDay) {
        return toDateTime(timeOfDay, null);
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    public String toString() {
        return sxc.u().l(this);
    }

    public YearMonthDay withChronologyRetainFields(bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        if (bw3VarWithUTC == getChronology()) {
            return this;
        }
        YearMonthDay yearMonthDay = new YearMonthDay(this, bw3VarWithUTC);
        bw3VarWithUTC.validate(yearMonthDay, getValues());
        return yearMonthDay;
    }

    public YearMonthDay withDayOfMonth(int i) {
        return new YearMonthDay(this, getChronology().dayOfMonth().set(this, 2, getValues(), i));
    }

    public YearMonthDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(iIndexOfSupported)) {
            return this;
        }
        return new YearMonthDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i));
    }

    public YearMonthDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new YearMonthDay(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i));
    }

    public YearMonthDay withMonthOfYear(int i) {
        return new YearMonthDay(this, getChronology().monthOfYear().set(this, 1, getValues(), i));
    }

    public YearMonthDay withPeriodAdded(qgj qgjVar, int i) {
        if (qgjVar == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < qgjVar.size(); i2++) {
            int iIndexOf = indexOf(qgjVar.getFieldType(i2));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).add(this, iIndexOf, values, fl9.h(qgjVar.getValue(i2), i));
            }
        }
        return new YearMonthDay(this, values);
    }

    public YearMonthDay withYear(int i) {
        return new YearMonthDay(this, getChronology().year().set(this, 0, getValues(), i));
    }

    public Property year() {
        return new Property(this, 0);
    }

    public YearMonthDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(dateTimeZone));
    }

    public DateTime toDateTime(TimeOfDay timeOfDay, DateTimeZone dateTimeZone) {
        bw3 bw3VarWithZone = getChronology().withZone(dateTimeZone);
        long j = bw3VarWithZone.set(this, wq5.b());
        if (timeOfDay != null) {
            j = bw3VarWithZone.set(timeOfDay, j);
        }
        return new DateTime(j, bw3VarWithZone);
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        bw3 bw3VarWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(bw3VarWithZone.set(this, wq5.b()), bw3VarWithZone);
    }

    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(dateTimeZone));
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        return toDateMidnight(wq5.m(dateTimeZone)).toInterval();
    }

    @Deprecated
    public static class Property extends j10 implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final int iFieldIndex;
        private final YearMonthDay iYearMonthDay;

        public Property(YearMonthDay yearMonthDay, int i) {
            this.iYearMonthDay = yearMonthDay;
            this.iFieldIndex = i;
        }

        public YearMonthDay addToCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().add(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        public YearMonthDay addWrapFieldToCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().addWrapField(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        @Override // defpackage.j10
        public int get() {
            return this.iYearMonthDay.getValue(this.iFieldIndex);
        }

        @Override // defpackage.j10
        public gq5 getField() {
            return this.iYearMonthDay.getField(this.iFieldIndex);
        }

        @Override // defpackage.j10
        public ogj getReadablePartial() {
            return this.iYearMonthDay;
        }

        public YearMonthDay getYearMonthDay() {
            return this.iYearMonthDay;
        }

        public YearMonthDay setCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        public YearMonthDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public YearMonthDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public YearMonthDay setCopy(String str, Locale locale) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), str, locale));
        }

        public YearMonthDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public YearMonthDay(bw3 bw3Var) {
        super(bw3Var);
    }

    public YearMonthDay(long j) {
        super(j);
    }

    public YearMonthDay(long j, bw3 bw3Var) {
        super(j, bw3Var);
    }

    public YearMonthDay(Object obj) {
        super(obj, null, sxc.g());
    }

    public YearMonthDay(Object obj, bw3 bw3Var) {
        super(obj, wq5.c(bw3Var), sxc.g());
    }

    public YearMonthDay(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public YearMonthDay(int i, int i2, int i3, bw3 bw3Var) {
        super(new int[]{i, i2, i3}, bw3Var);
    }

    public YearMonthDay(YearMonthDay yearMonthDay, int[] iArr) {
        super(yearMonthDay, iArr);
    }

    public YearMonthDay(YearMonthDay yearMonthDay, bw3 bw3Var) {
        super((BasePartial) yearMonthDay, bw3Var);
    }
}
