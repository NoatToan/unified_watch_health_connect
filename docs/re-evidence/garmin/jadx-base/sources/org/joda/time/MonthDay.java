package org.joda.time;

import am.j;
import j20.x;
import java.io.Serializable;
import java.util.ArrayList;
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
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class MonthDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int DAY_OF_MONTH = 1;
    public static final int MONTH_OF_YEAR = 0;
    private static final long serialVersionUID = 2954560699050434609L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendOptional(ISODateTimeFormat.localDateParser().getParser()).appendOptional(DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();

    public MonthDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public static MonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
        h.s("The calendar must not be null");
        return null;
    }

    public static MonthDay fromDateFields(Date date) {
        if (date != null) {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
        h.s("The date must not be null");
        return null;
    }

    public static MonthDay now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MonthDay(dateTimeZone);
        }
        x.l("Zone must not be null");
        return null;
    }

    public static MonthDay parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate localDate = dateTimeFormatter.parseLocalDate(str);
        return new MonthDay(localDate.getMonthOfYear(), localDate.getDayOfMonth());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new MonthDay(this, getChronology().withUTC()) : this;
    }

    public Property dayOfMonth() {
        return new Property(this, 1);
    }

    public int getDayOfMonth() {
        return getValue(1);
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i14, Chronology chronology) {
        if (i14 == 0) {
            return chronology.monthOfYear();
        }
        if (i14 == 1) {
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
        return getValue(0);
    }

    public MonthDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public MonthDay minusDays(int i14) {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i14));
    }

    public MonthDay minusMonths(int i14) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i14));
    }

    public Property monthOfYear() {
        return new Property(this, 0);
    }

    public MonthDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public MonthDay plusDays(int i14) {
        return withFieldAdded(DurationFieldType.days(), i14);
    }

    public MonthDay plusMonths(int i14) {
        return withFieldAdded(DurationFieldType.months(), i14);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 2;
    }

    public LocalDate toLocalDate(int i14) {
        return new LocalDate(i14, getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DateTimeFieldType.monthOfYear());
        arrayList.add(DateTimeFieldType.dayOfMonth());
        return ISODateTimeFormat.forFields(arrayList, true, true).print(this);
    }

    public MonthDay withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        MonthDay monthDay = new MonthDay(this, chronologyWithUTC);
        chronologyWithUTC.validate(monthDay, getValues());
        return monthDay;
    }

    public MonthDay withDayOfMonth(int i14) {
        return new MonthDay(this, getChronology().dayOfMonth().set(this, 1, getValues(), i14));
    }

    public MonthDay withField(DateTimeFieldType dateTimeFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i14 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new MonthDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i14));
    }

    public MonthDay withFieldAdded(DurationFieldType durationFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i14 == 0) {
            return this;
        }
        return new MonthDay(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i14));
    }

    public MonthDay withMonthOfYear(int i14) {
        return new MonthDay(this, getChronology().monthOfYear().set(this, 0, getValues(), i14));
    }

    public MonthDay withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
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
        return new MonthDay(this, values);
    }

    public MonthDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public MonthDay(Chronology chronology) {
        super(chronology);
    }

    public MonthDay(long j8) {
        super(j8);
    }

    public MonthDay(long j8, Chronology chronology) {
        super(j8, chronology);
    }

    public static MonthDay now() {
        return new MonthDay();
    }

    public MonthDay(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public static MonthDay now(Chronology chronology) {
        if (chronology != null) {
            return new MonthDay(chronology);
        }
        x.l("Chronology must not be null");
        return null;
    }

    public MonthDay() {
    }

    public MonthDay(int i14, int i15) {
        this(i14, i15, null);
    }

    @FromString
    public static MonthDay parse(String str) {
        return parse(str, PARSER);
    }

    public MonthDay(int i14, int i15, Chronology chronology) {
        super(new int[]{i14, i15}, chronology);
    }

    public MonthDay(MonthDay monthDay, int[] iArr) {
        super(monthDay, iArr);
    }

    public MonthDay(MonthDay monthDay, Chronology chronology) {
        super((BasePartial) monthDay, chronology);
    }

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final MonthDay iBase;
        private final int iFieldIndex;

        public Property(MonthDay monthDay, int i14) {
            this.iBase = monthDay;
            this.iFieldIndex = i14;
        }

        public MonthDay addToCopy(int i14) {
            return new MonthDay(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i14));
        }

        public MonthDay addWrapFieldToCopy(int i14) {
            return new MonthDay(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i14));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        public MonthDay getMonthDay() {
            return this.iBase;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public MonthDay setCopy(String str, Locale locale) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }

        public MonthDay setCopy(int i14) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i14));
        }

        public MonthDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print(this);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }
}
