package org.joda.time;

import am.j;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.lang3.e;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class YearMonthDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int DAY_OF_MONTH = 2;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public YearMonthDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.dateOptionalTimeParser());
    }

    public static YearMonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonthDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
        h.s("The calendar must not be null");
        return null;
    }

    public static YearMonthDay fromDateFields(Date date) {
        if (date != null) {
            return new YearMonthDay(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        h.s("The date must not be null");
        return null;
    }

    public Property dayOfMonth() {
        return new Property(this, 2);
    }

    public int getDayOfMonth() {
        return getValue(2);
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i14, Chronology chronology) {
        if (i14 == 0) {
            return chronology.year();
        }
        if (i14 == 1) {
            return chronology.monthOfYear();
        }
        if (i14 == 2) {
            return chronology.dayOfMonth();
        }
        e.v(j.h(i14, "Invalid index: "));
        return null;
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i14) {
        return FIELD_TYPES[i14];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getMonthOfYear() {
        return getValue(1);
    }

    public int getYear() {
        return getValue(0);
    }

    public YearMonthDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public YearMonthDay minusDays(int i14) {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i14));
    }

    public YearMonthDay minusMonths(int i14) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i14));
    }

    public YearMonthDay minusYears(int i14) {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i14));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonthDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public YearMonthDay plusDays(int i14) {
        return withFieldAdded(DurationFieldType.days(), i14);
    }

    public YearMonthDay plusMonths(int i14) {
        return withFieldAdded(DurationFieldType.months(), i14);
    }

    public YearMonthDay plusYears(int i14) {
        return withFieldAdded(DurationFieldType.years(), i14);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 3;
    }

    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(dateTimeZone));
    }

    public DateTime toDateTime(TimeOfDay timeOfDay, DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        long j8 = chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis());
        if (timeOfDay != null) {
            j8 = chronologyWithZone.set(timeOfDay, j8);
        }
        return new DateTime(j8, chronologyWithZone);
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis()), chronologyWithZone);
    }

    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(dateTimeZone));
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        return toDateMidnight(DateTimeUtils.getZone(dateTimeZone)).toInterval();
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        return ISODateTimeFormat.yearMonthDay().print(this);
    }

    public YearMonthDay withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        YearMonthDay yearMonthDay = new YearMonthDay(this, chronologyWithUTC);
        chronologyWithUTC.validate(yearMonthDay, getValues());
        return yearMonthDay;
    }

    public YearMonthDay withDayOfMonth(int i14) {
        return new YearMonthDay(this, getChronology().dayOfMonth().set(this, 2, getValues(), i14));
    }

    public YearMonthDay withField(DateTimeFieldType dateTimeFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i14 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new YearMonthDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i14));
    }

    public YearMonthDay withFieldAdded(DurationFieldType durationFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i14 == 0) {
            return this;
        }
        return new YearMonthDay(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i14));
    }

    public YearMonthDay withMonthOfYear(int i14) {
        return new YearMonthDay(this, getChronology().monthOfYear().set(this, 1, getValues(), i14));
    }

    public YearMonthDay withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
        if (readablePeriod == null || i14 == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i15 = 0; i15 < readablePeriod.size(); i15++) {
            int iIndexOf = indexOf(readablePeriod.getFieldType(i15));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).add(this, iIndexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i15), i14));
            }
        }
        return new YearMonthDay(this, values);
    }

    public YearMonthDay withYear(int i14) {
        return new YearMonthDay(this, getChronology().year().set(this, 0, getValues(), i14));
    }

    public Property year() {
        return new Property(this, 0);
    }

    public YearMonthDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public YearMonthDay(Chronology chronology) {
        super(chronology);
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public YearMonthDay(long j8) {
        super(j8);
    }

    public YearMonthDay(long j8, Chronology chronology) {
        super(j8, chronology);
    }

    public YearMonthDay(Object obj) {
        super(obj, null, ISODateTimeFormat.dateOptionalTimeParser());
    }

    public YearMonthDay() {
    }

    public YearMonthDay(int i14, int i15, int i16) {
        this(i14, i15, i16, null);
    }

    public YearMonthDay(int i14, int i15, int i16, Chronology chronology) {
        super(new int[]{i14, i15, i16}, chronology);
    }

    public YearMonthDay(YearMonthDay yearMonthDay, int[] iArr) {
        super(yearMonthDay, iArr);
    }

    public YearMonthDay(YearMonthDay yearMonthDay, Chronology chronology) {
        super((BasePartial) yearMonthDay, chronology);
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    public DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    @Deprecated
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final int iFieldIndex;
        private final YearMonthDay iYearMonthDay;

        public Property(YearMonthDay yearMonthDay, int i14) {
            this.iYearMonthDay = yearMonthDay;
            this.iFieldIndex = i14;
        }

        public YearMonthDay addToCopy(int i14) {
            return new YearMonthDay(this.iYearMonthDay, getField().add(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i14));
        }

        public YearMonthDay addWrapFieldToCopy(int i14) {
            return new YearMonthDay(this.iYearMonthDay, getField().addWrapField(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i14));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iYearMonthDay.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iYearMonthDay.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iYearMonthDay;
        }

        public YearMonthDay getYearMonthDay() {
            return this.iYearMonthDay;
        }

        public YearMonthDay setCopy(String str, Locale locale) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), str, locale));
        }

        public YearMonthDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public YearMonthDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public YearMonthDay setCopy(int i14) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i14));
        }

        public YearMonthDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public DateTime toDateTime(TimeOfDay timeOfDay) {
        return toDateTime(timeOfDay, null);
    }

    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }
}
