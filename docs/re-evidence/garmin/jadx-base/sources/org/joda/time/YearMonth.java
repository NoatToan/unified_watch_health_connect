package org.joda.time;

import am.j;
import j20.x;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.lang3.e;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class YearMonth extends BasePartial implements ReadablePartial, Serializable {
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public YearMonth(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public static YearMonth fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonth(calendar.get(1), calendar.get(2) + 1);
        }
        h.s("The calendar must not be null");
        return null;
    }

    public static YearMonth fromDateFields(Date date) {
        if (date != null) {
            return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
        }
        h.s("The date must not be null");
        return null;
    }

    public static YearMonth now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new YearMonth(dateTimeZone);
        }
        x.l("Zone must not be null");
        return null;
    }

    public static YearMonth parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate localDate = dateTimeFormatter.parseLocalDate(str);
        return new YearMonth(localDate.getYear(), localDate.getMonthOfYear());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new YearMonth(this, getChronology().withUTC()) : this;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i14, Chronology chronology) {
        if (i14 == 0) {
            return chronology.year();
        }
        if (i14 == 1) {
            return chronology.monthOfYear();
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

    public YearMonth minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public YearMonth minusMonths(int i14) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i14));
    }

    public YearMonth minusYears(int i14) {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i14));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonth plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public YearMonth plusMonths(int i14) {
        return withFieldAdded(DurationFieldType.months(), i14);
    }

    public YearMonth plusYears(int i14) {
        return withFieldAdded(DurationFieldType.years(), i14);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 2;
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return new Interval(toLocalDate(1).toDateTimeAtStartOfDay(zone), plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(zone));
    }

    public LocalDate toLocalDate(int i14) {
        return new LocalDate(getYear(), getMonthOfYear(), i14, getChronology());
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public YearMonth withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        YearMonth yearMonth = new YearMonth(this, chronologyWithUTC);
        chronologyWithUTC.validate(yearMonth, getValues());
        return yearMonth;
    }

    public YearMonth withField(DateTimeFieldType dateTimeFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i14 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new YearMonth(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i14));
    }

    public YearMonth withFieldAdded(DurationFieldType durationFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i14 == 0) {
            return this;
        }
        return new YearMonth(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i14));
    }

    public YearMonth withMonthOfYear(int i14) {
        return new YearMonth(this, getChronology().monthOfYear().set(this, 1, getValues(), i14));
    }

    public YearMonth withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
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
        return new YearMonth(this, values);
    }

    public YearMonth withYear(int i14) {
        return new YearMonth(this, getChronology().year().set(this, 0, getValues(), i14));
    }

    public Property year() {
        return new Property(this, 0);
    }

    public YearMonth(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public YearMonth(Chronology chronology) {
        super(chronology);
    }

    public YearMonth(long j8) {
        super(j8);
    }

    public YearMonth(long j8, Chronology chronology) {
        super(j8, chronology);
    }

    public static YearMonth now() {
        return new YearMonth();
    }

    public YearMonth(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public static YearMonth now(Chronology chronology) {
        if (chronology != null) {
            return new YearMonth(chronology);
        }
        x.l("Chronology must not be null");
        return null;
    }

    public YearMonth() {
    }

    public YearMonth(int i14, int i15) {
        this(i14, i15, null);
    }

    @FromString
    public static YearMonth parse(String str) {
        return parse(str, ISODateTimeFormat.localDateParser());
    }

    public YearMonth(int i14, int i15, Chronology chronology) {
        super(new int[]{i14, i15}, chronology);
    }

    public YearMonth(YearMonth yearMonth, int[] iArr) {
        super(yearMonth, iArr);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print(this);
    }

    public YearMonth(YearMonth yearMonth, Chronology chronology) {
        super((BasePartial) yearMonth, chronology);
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.yearMonth().print(this);
    }

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final YearMonth iBase;
        private final int iFieldIndex;

        public Property(YearMonth yearMonth, int i14) {
            this.iBase = yearMonth;
            this.iFieldIndex = i14;
        }

        public YearMonth addToCopy(int i14) {
            return new YearMonth(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i14));
        }

        public YearMonth addWrapFieldToCopy(int i14) {
            return new YearMonth(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i14));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public YearMonth getYearMonth() {
            return this.iBase;
        }

        public YearMonth setCopy(String str, Locale locale) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }

        public YearMonth setCopy(int i14) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i14));
        }

        public YearMonth setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public Interval toInterval() {
        return toInterval(null);
    }
}
