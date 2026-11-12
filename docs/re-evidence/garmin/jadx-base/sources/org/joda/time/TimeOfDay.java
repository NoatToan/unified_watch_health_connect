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
public final class TimeOfDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int HOUR_OF_DAY = 0;
    public static final int MILLIS_OF_SECOND = 3;
    public static final int MINUTE_OF_HOUR = 1;
    public static final int SECOND_OF_MINUTE = 2;
    private static final long serialVersionUID = 3633353405803318660L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()};
    public static final TimeOfDay MIDNIGHT = new TimeOfDay(0, 0, 0, 0);

    public TimeOfDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.timeParser());
    }

    public static TimeOfDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new TimeOfDay(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        h.s("The calendar must not be null");
        return null;
    }

    public static TimeOfDay fromDateFields(Date date) {
        if (date != null) {
            return new TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        h.s("The date must not be null");
        return null;
    }

    public static TimeOfDay fromMillisOfDay(long j8, Chronology chronology) {
        return new TimeOfDay(j8, DateTimeUtils.getChronology(chronology).withUTC());
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i14, Chronology chronology) {
        if (i14 == 0) {
            return chronology.hourOfDay();
        }
        if (i14 == 1) {
            return chronology.minuteOfHour();
        }
        if (i14 == 2) {
            return chronology.secondOfMinute();
        }
        if (i14 == 3) {
            return chronology.millisOfSecond();
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

    public int getHourOfDay() {
        return getValue(0);
    }

    public int getMillisOfSecond() {
        return getValue(3);
    }

    public int getMinuteOfHour() {
        return getValue(1);
    }

    public int getSecondOfMinute() {
        return getValue(2);
    }

    public Property hourOfDay() {
        return new Property(this, 0);
    }

    public Property millisOfSecond() {
        return new Property(this, 3);
    }

    public TimeOfDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public TimeOfDay minusHours(int i14) {
        return withFieldAdded(DurationFieldType.hours(), FieldUtils.safeNegate(i14));
    }

    public TimeOfDay minusMillis(int i14) {
        return withFieldAdded(DurationFieldType.millis(), FieldUtils.safeNegate(i14));
    }

    public TimeOfDay minusMinutes(int i14) {
        return withFieldAdded(DurationFieldType.minutes(), FieldUtils.safeNegate(i14));
    }

    public TimeOfDay minusSeconds(int i14) {
        return withFieldAdded(DurationFieldType.seconds(), FieldUtils.safeNegate(i14));
    }

    public Property minuteOfHour() {
        return new Property(this, 1);
    }

    public TimeOfDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public TimeOfDay plusHours(int i14) {
        return withFieldAdded(DurationFieldType.hours(), i14);
    }

    public TimeOfDay plusMillis(int i14) {
        return withFieldAdded(DurationFieldType.millis(), i14);
    }

    public TimeOfDay plusMinutes(int i14) {
        return withFieldAdded(DurationFieldType.minutes(), i14);
    }

    public TimeOfDay plusSeconds(int i14) {
        return withFieldAdded(DurationFieldType.seconds(), i14);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public Property secondOfMinute() {
        return new Property(this, 2);
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis()), chronologyWithZone);
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        return ISODateTimeFormat.tTime().print(this);
    }

    public TimeOfDay withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        TimeOfDay timeOfDay = new TimeOfDay(this, chronologyWithUTC);
        chronologyWithUTC.validate(timeOfDay, getValues());
        return timeOfDay;
    }

    public TimeOfDay withField(DateTimeFieldType dateTimeFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i14 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new TimeOfDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i14));
    }

    public TimeOfDay withFieldAdded(DurationFieldType durationFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i14 == 0) {
            return this;
        }
        return new TimeOfDay(this, getField(iIndexOfSupported).addWrapPartial(this, iIndexOfSupported, getValues(), i14));
    }

    public TimeOfDay withHourOfDay(int i14) {
        return new TimeOfDay(this, getChronology().hourOfDay().set(this, 0, getValues(), i14));
    }

    public TimeOfDay withMillisOfSecond(int i14) {
        return new TimeOfDay(this, getChronology().millisOfSecond().set(this, 3, getValues(), i14));
    }

    public TimeOfDay withMinuteOfHour(int i14) {
        return new TimeOfDay(this, getChronology().minuteOfHour().set(this, 1, getValues(), i14));
    }

    public TimeOfDay withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
        if (readablePeriod == null || i14 == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i15 = 0; i15 < readablePeriod.size(); i15++) {
            int iIndexOf = indexOf(readablePeriod.getFieldType(i15));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).addWrapPartial(this, iIndexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i15), i14));
            }
        }
        return new TimeOfDay(this, values);
    }

    public TimeOfDay withSecondOfMinute(int i14) {
        return new TimeOfDay(this, getChronology().secondOfMinute().set(this, 2, getValues(), i14));
    }

    public TimeOfDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public TimeOfDay(Chronology chronology) {
        super(chronology);
    }

    public TimeOfDay(long j8) {
        super(j8);
    }

    public static TimeOfDay fromMillisOfDay(long j8) {
        return fromMillisOfDay(j8, null);
    }

    public TimeOfDay(long j8, Chronology chronology) {
        super(j8, chronology);
    }

    public TimeOfDay(Object obj) {
        super(obj, null, ISODateTimeFormat.timeParser());
    }

    public TimeOfDay() {
    }

    public TimeOfDay(int i14, int i15) {
        this(i14, i15, 0, 0, null);
    }

    public TimeOfDay(int i14, int i15, Chronology chronology) {
        this(i14, i15, 0, 0, chronology);
    }

    public TimeOfDay(int i14, int i15, int i16) {
        this(i14, i15, i16, 0, null);
    }

    public TimeOfDay(int i14, int i15, int i16, Chronology chronology) {
        this(i14, i15, i16, 0, chronology);
    }

    public TimeOfDay(int i14, int i15, int i16, int i17) {
        this(i14, i15, i16, i17, null);
    }

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    public TimeOfDay(int i14, int i15, int i16, int i17, Chronology chronology) {
        super(new int[]{i14, i15, i16, i17}, chronology);
    }

    public TimeOfDay(TimeOfDay timeOfDay, int[] iArr) {
        super(timeOfDay, iArr);
    }

    public TimeOfDay(TimeOfDay timeOfDay, Chronology chronology) {
        super((BasePartial) timeOfDay, chronology);
    }

    @Deprecated
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5598459141741063833L;
        private final int iFieldIndex;
        private final TimeOfDay iTimeOfDay;

        public Property(TimeOfDay timeOfDay, int i14) {
            this.iTimeOfDay = timeOfDay;
            this.iFieldIndex = i14;
        }

        public TimeOfDay addNoWrapToCopy(int i14) {
            return new TimeOfDay(this.iTimeOfDay, getField().add(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i14));
        }

        public TimeOfDay addToCopy(int i14) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapPartial(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i14));
        }

        public TimeOfDay addWrapFieldToCopy(int i14) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapField(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i14));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iTimeOfDay.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iTimeOfDay.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iTimeOfDay;
        }

        public TimeOfDay getTimeOfDay() {
            return this.iTimeOfDay;
        }

        public TimeOfDay setCopy(String str, Locale locale) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), str, locale));
        }

        public TimeOfDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public TimeOfDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public TimeOfDay setCopy(int i14) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i14));
        }

        public TimeOfDay setCopy(String str) {
            return setCopy(str, null);
        }
    }
}
