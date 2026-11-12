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
public final class TimeOfDay extends BasePartial implements ogj, Serializable {
    public static final int HOUR_OF_DAY = 0;
    public static final int MILLIS_OF_SECOND = 3;
    public static final int MINUTE_OF_HOUR = 1;
    public static final int SECOND_OF_MINUTE = 2;
    private static final long serialVersionUID = 3633353405803318660L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()};
    public static final TimeOfDay MIDNIGHT = new TimeOfDay(0, 0, 0, 0);

    public TimeOfDay(int i, int i2, int i3, bw3 bw3Var) {
        this(i, i2, i3, 0, bw3Var);
    }

    public static TimeOfDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new TimeOfDay(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static TimeOfDay fromDateFields(Date date) {
        if (date != null) {
            return new TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static TimeOfDay fromMillisOfDay(long j) {
        return fromMillisOfDay(j, null);
    }

    @Override // defpackage.i10
    public gq5 getField(int i, bw3 bw3Var) {
        if (i == 0) {
            return bw3Var.hourOfDay();
        }
        if (i == 1) {
            return bw3Var.minuteOfHour();
        }
        if (i == 2) {
            return bw3Var.secondOfMinute();
        }
        if (i == 3) {
            return bw3Var.millisOfSecond();
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

    public TimeOfDay minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public TimeOfDay minusHours(int i) {
        return withFieldAdded(DurationFieldType.hours(), fl9.k(i));
    }

    public TimeOfDay minusMillis(int i) {
        return withFieldAdded(DurationFieldType.millis(), fl9.k(i));
    }

    public TimeOfDay minusMinutes(int i) {
        return withFieldAdded(DurationFieldType.minutes(), fl9.k(i));
    }

    public TimeOfDay minusSeconds(int i) {
        return withFieldAdded(DurationFieldType.seconds(), fl9.k(i));
    }

    public Property minuteOfHour() {
        return new Property(this, 1);
    }

    public TimeOfDay plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public TimeOfDay plusHours(int i) {
        return withFieldAdded(DurationFieldType.hours(), i);
    }

    public TimeOfDay plusMillis(int i) {
        return withFieldAdded(DurationFieldType.millis(), i);
    }

    public TimeOfDay plusMinutes(int i) {
        return withFieldAdded(DurationFieldType.minutes(), i);
    }

    public TimeOfDay plusSeconds(int i) {
        return withFieldAdded(DurationFieldType.seconds(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public Property secondOfMinute() {
        return new Property(this, 2);
    }

    @Override // org.joda.time.base.BasePartial, defpackage.ogj
    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), getChronology());
    }

    public String toString() {
        return sxc.o().l(this);
    }

    public TimeOfDay withChronologyRetainFields(bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        if (bw3VarWithUTC == getChronology()) {
            return this;
        }
        TimeOfDay timeOfDay = new TimeOfDay(this, bw3VarWithUTC);
        bw3VarWithUTC.validate(timeOfDay, getValues());
        return timeOfDay;
    }

    public TimeOfDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(iIndexOfSupported)) {
            return this;
        }
        return new TimeOfDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i));
    }

    public TimeOfDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new TimeOfDay(this, getField(iIndexOfSupported).addWrapPartial(this, iIndexOfSupported, getValues(), i));
    }

    public TimeOfDay withHourOfDay(int i) {
        return new TimeOfDay(this, getChronology().hourOfDay().set(this, 0, getValues(), i));
    }

    public TimeOfDay withMillisOfSecond(int i) {
        return new TimeOfDay(this, getChronology().millisOfSecond().set(this, 3, getValues(), i));
    }

    public TimeOfDay withMinuteOfHour(int i) {
        return new TimeOfDay(this, getChronology().minuteOfHour().set(this, 1, getValues(), i));
    }

    public TimeOfDay withPeriodAdded(qgj qgjVar, int i) {
        if (qgjVar == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < qgjVar.size(); i2++) {
            int iIndexOf = indexOf(qgjVar.getFieldType(i2));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).addWrapPartial(this, iIndexOf, values, fl9.h(qgjVar.getValue(i2), i));
            }
        }
        return new TimeOfDay(this, values);
    }

    public TimeOfDay withSecondOfMinute(int i) {
        return new TimeOfDay(this, getChronology().secondOfMinute().set(this, 2, getValues(), i));
    }

    public static TimeOfDay fromMillisOfDay(long j, bw3 bw3Var) {
        return new TimeOfDay(j, wq5.c(bw3Var).withUTC());
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        bw3 bw3VarWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(bw3VarWithZone.set(this, wq5.b()), bw3VarWithZone);
    }

    @Deprecated
    public static class Property extends j10 implements Serializable {
        private static final long serialVersionUID = 5598459141741063833L;
        private final int iFieldIndex;
        private final TimeOfDay iTimeOfDay;

        public Property(TimeOfDay timeOfDay, int i) {
            this.iTimeOfDay = timeOfDay;
            this.iFieldIndex = i;
        }

        public TimeOfDay addNoWrapToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().add(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay addToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapPartial(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay addWrapFieldToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapField(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        @Override // defpackage.j10
        public int get() {
            return this.iTimeOfDay.getValue(this.iFieldIndex);
        }

        @Override // defpackage.j10
        public gq5 getField() {
            return this.iTimeOfDay.getField(this.iFieldIndex);
        }

        @Override // defpackage.j10
        public ogj getReadablePartial() {
            return this.iTimeOfDay;
        }

        public TimeOfDay getTimeOfDay() {
            return this.iTimeOfDay;
        }

        public TimeOfDay setCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public TimeOfDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public TimeOfDay setCopy(String str, Locale locale) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), str, locale));
        }

        public TimeOfDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public TimeOfDay(int i, int i2, bw3 bw3Var) {
        this(i, i2, 0, 0, bw3Var);
    }

    public TimeOfDay() {
    }

    public TimeOfDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public TimeOfDay(bw3 bw3Var) {
        super(bw3Var);
    }

    public TimeOfDay(long j) {
        super(j);
    }

    public TimeOfDay(long j, bw3 bw3Var) {
        super(j, bw3Var);
    }

    public TimeOfDay(Object obj) {
        super(obj, null, sxc.r());
    }

    public TimeOfDay(Object obj, bw3 bw3Var) {
        super(obj, wq5.c(bw3Var), sxc.r());
    }

    public TimeOfDay(int i, int i2) {
        this(i, i2, 0, 0, null);
    }

    public TimeOfDay(int i, int i2, int i3) {
        this(i, i2, i3, 0, null);
    }

    public TimeOfDay(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, null);
    }

    public TimeOfDay(int i, int i2, int i3, int i4, bw3 bw3Var) {
        super(new int[]{i, i2, i3, i4}, bw3Var);
    }

    public TimeOfDay(TimeOfDay timeOfDay, int[] iArr) {
        super(timeOfDay, iArr);
    }

    public TimeOfDay(TimeOfDay timeOfDay, bw3 bw3Var) {
        super((BasePartial) timeOfDay, bw3Var);
    }
}
