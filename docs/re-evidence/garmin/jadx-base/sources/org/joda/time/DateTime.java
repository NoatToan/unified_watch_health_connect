package org.joda.time;

import j20.x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.apache.commons.lang3.e;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTime extends BaseDateTime implements ReadableDateTime, Serializable {
    private static final long serialVersionUID = -5171125899451703815L;

    public DateTime(int i14, int i15, int i16, int i17, int i18, int i19, DateTimeZone dateTimeZone) {
        super(i14, i15, i16, i17, i18, i19, 0, dateTimeZone);
    }

    public static DateTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new DateTime(dateTimeZone);
        }
        x.l("Zone must not be null");
        return null;
    }

    @FromString
    public static DateTime parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public DateTime minus(long j8) {
        return withDurationAdded(j8, -1);
    }

    public DateTime minusDays(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().days().subtract(getMillis(), i14));
    }

    public DateTime minusHours(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().hours().subtract(getMillis(), i14));
    }

    public DateTime minusMillis(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().millis().subtract(getMillis(), i14));
    }

    public DateTime minusMinutes(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().minutes().subtract(getMillis(), i14));
    }

    public DateTime minusMonths(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().months().subtract(getMillis(), i14));
    }

    public DateTime minusSeconds(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().seconds().subtract(getMillis(), i14));
    }

    public DateTime minusWeeks(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().weeks().subtract(getMillis(), i14));
    }

    public DateTime minusYears(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().years().subtract(getMillis(), i14));
    }

    public Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public DateTime plus(long j8) {
        return withDurationAdded(j8, 1);
    }

    public DateTime plusDays(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().days().add(getMillis(), i14));
    }

    public DateTime plusHours(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().hours().add(getMillis(), i14));
    }

    public DateTime plusMillis(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().millis().add(getMillis(), i14));
    }

    public DateTime plusMinutes(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().minutes().add(getMillis(), i14));
    }

    public DateTime plusMonths(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().months().add(getMillis(), i14));
    }

    public DateTime plusSeconds(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().seconds().add(getMillis(), i14));
    }

    public DateTime plusWeeks(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().weeks().add(getMillis(), i14));
    }

    public DateTime plusYears(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().years().add(getMillis(), i14));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            h.s("The DateTimeFieldType must not be null");
            return null;
        }
        DateTimeField field = dateTimeFieldType.getField(getChronology());
        if (field.isSupported()) {
            return new Property(this, field);
        }
        e.l("Field '", dateTimeFieldType, "' is not supported");
        return null;
    }

    public Property secondOfDay() {
        return new Property(this, getChronology().secondOfDay());
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Deprecated
    public DateMidnight toDateMidnight() {
        return new DateMidnight(getMillis(), getChronology());
    }

    @Override // org.joda.time.base.AbstractInstant
    public DateTime toDateTime(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return getZone() == zone ? this : super.toDateTime(zone);
    }

    @Override // org.joda.time.base.AbstractInstant
    public DateTime toDateTimeISO() {
        return getChronology() == ISOChronology.getInstance() ? this : super.toDateTimeISO();
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getMillis(), getChronology());
    }

    public LocalDateTime toLocalDateTime() {
        return new LocalDateTime(getMillis(), getChronology());
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getMillis(), getChronology());
    }

    @Deprecated
    public TimeOfDay toTimeOfDay() {
        return new TimeOfDay(getMillis(), getChronology());
    }

    @Deprecated
    public YearMonthDay toYearMonthDay() {
        return new YearMonthDay(getMillis(), getChronology());
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public DateTime withCenturyOfEra(int i14) {
        return withMillis(getChronology().centuryOfEra().set(getMillis(), i14));
    }

    public DateTime withChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        return chronology2 == getChronology() ? this : new DateTime(getMillis(), chronology2);
    }

    public DateTime withDate(int i14, int i15, int i16) {
        Chronology chronology = getChronology();
        return withMillis(chronology.getZone().convertLocalToUTC(chronology.withUTC().getDateTimeMillis(i14, i15, i16, getMillisOfDay()), false, getMillis()));
    }

    public DateTime withDayOfMonth(int i14) {
        return withMillis(getChronology().dayOfMonth().set(getMillis(), i14));
    }

    public DateTime withDayOfWeek(int i14) {
        return withMillis(getChronology().dayOfWeek().set(getMillis(), i14));
    }

    public DateTime withDayOfYear(int i14) {
        return withMillis(getChronology().dayOfYear().set(getMillis(), i14));
    }

    public DateTime withDurationAdded(long j8, int i14) {
        return (j8 == 0 || i14 == 0) ? this : withMillis(getChronology().add(getMillis(), j8, i14));
    }

    public DateTime withEarlierOffsetAtOverlap() {
        return withMillis(getZone().adjustOffset(getMillis(), false));
    }

    public DateTime withEra(int i14) {
        return withMillis(getChronology().era().set(getMillis(), i14));
    }

    public DateTime withField(DateTimeFieldType dateTimeFieldType, int i14) {
        if (dateTimeFieldType != null) {
            return withMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i14));
        }
        h.s("Field must not be null");
        return null;
    }

    public DateTime withFieldAdded(DurationFieldType durationFieldType, int i14) {
        if (durationFieldType != null) {
            return i14 == 0 ? this : withMillis(durationFieldType.getField(getChronology()).add(getMillis(), i14));
        }
        h.s("Field must not be null");
        return null;
    }

    public DateTime withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withMillis(getChronology().set(readablePartial, getMillis()));
    }

    public DateTime withHourOfDay(int i14) {
        return withMillis(getChronology().hourOfDay().set(getMillis(), i14));
    }

    public DateTime withLaterOffsetAtOverlap() {
        return withMillis(getZone().adjustOffset(getMillis(), true));
    }

    public DateTime withMillis(long j8) {
        return j8 == getMillis() ? this : new DateTime(j8, getChronology());
    }

    public DateTime withMillisOfDay(int i14) {
        return withMillis(getChronology().millisOfDay().set(getMillis(), i14));
    }

    public DateTime withMillisOfSecond(int i14) {
        return withMillis(getChronology().millisOfSecond().set(getMillis(), i14));
    }

    public DateTime withMinuteOfHour(int i14) {
        return withMillis(getChronology().minuteOfHour().set(getMillis(), i14));
    }

    public DateTime withMonthOfYear(int i14) {
        return withMillis(getChronology().monthOfYear().set(getMillis(), i14));
    }

    public DateTime withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
        return (readablePeriod == null || i14 == 0) ? this : withMillis(getChronology().add(readablePeriod, getMillis(), i14));
    }

    public DateTime withSecondOfMinute(int i14) {
        return withMillis(getChronology().secondOfMinute().set(getMillis(), i14));
    }

    public DateTime withTime(int i14, int i15, int i16, int i17) {
        Chronology chronology = getChronology();
        return withMillis(chronology.getZone().convertLocalToUTC(chronology.withUTC().getDateTimeMillis(getYear(), getMonthOfYear(), getDayOfMonth(), i14, i15, i16, i17), false, getMillis()));
    }

    public DateTime withTimeAtStartOfDay() {
        return toLocalDate().toDateTimeAtStartOfDay(getZone());
    }

    public DateTime withWeekOfWeekyear(int i14) {
        return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i14));
    }

    public DateTime withWeekyear(int i14) {
        return withMillis(getChronology().weekyear().set(getMillis(), i14));
    }

    public DateTime withYear(int i14) {
        return withMillis(getChronology().year().set(getMillis(), i14));
    }

    public DateTime withYearOfCentury(int i14) {
        return withMillis(getChronology().yearOfCentury().set(getMillis(), i14));
    }

    public DateTime withYearOfEra(int i14) {
        return withMillis(getChronology().yearOfEra().set(getMillis(), i14));
    }

    public DateTime withZone(DateTimeZone dateTimeZone) {
        return withChronology(getChronology().withZone(dateTimeZone));
    }

    public DateTime withZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        DateTimeZone zone2 = DateTimeUtils.getZone(getZone());
        return zone == zone2 ? this : new DateTime(zone2.getMillisKeepLocal(zone, getMillis()), getChronology().withZone(zone));
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }

    public DateTime minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public DateTime plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    public DateTime minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public DateTime plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public static DateTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str);
    }

    public DateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public DateTime(Chronology chronology) {
        super(chronology);
    }

    public static DateTime now() {
        return new DateTime();
    }

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -6983323811635733510L;
        private DateTimeField iField;
        private DateTime iInstant;

        public Property(DateTime dateTime, DateTimeField dateTimeField) {
            this.iInstant = dateTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (DateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public DateTime addToCopy(int i14) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.add(dateTime.getMillis(), i14));
        }

        public DateTime addWrapFieldToCopy(int i14) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.addWrapField(dateTime.getMillis(), i14));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        public DateTime getDateTime() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getMillis();
        }

        public DateTime roundCeilingCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundCeiling(dateTime.getMillis()));
        }

        public DateTime roundFloorCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundFloor(dateTime.getMillis()));
        }

        public DateTime roundHalfCeilingCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundHalfCeiling(dateTime.getMillis()));
        }

        public DateTime roundHalfEvenCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundHalfEven(dateTime.getMillis()));
        }

        public DateTime roundHalfFloorCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundHalfFloor(dateTime.getMillis()));
        }

        public DateTime setCopy(int i14) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.set(dateTime.getMillis(), i14));
        }

        public DateTime withMaximumValue() {
            try {
                return setCopy(getMaximumValue());
            } catch (RuntimeException e4) {
                if (IllegalInstantException.isIllegalInstant(e4)) {
                    return new DateTime(getChronology().getZone().previousTransition(getMillis() + 86400000), getChronology());
                }
                throw e4;
            }
        }

        public DateTime withMinimumValue() {
            try {
                return setCopy(getMinimumValue());
            } catch (RuntimeException e4) {
                if (IllegalInstantException.isIllegalInstant(e4)) {
                    return new DateTime(getChronology().getZone().nextTransition(getMillis() - 86400000), getChronology());
                }
                throw e4;
            }
        }

        public DateTime addToCopy(long j8) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.add(dateTime.getMillis(), j8));
        }

        public DateTime setCopy(String str, Locale locale) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.set(dateTime.getMillis(), str, locale));
        }

        public DateTime setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public DateTime(long j8) {
        super(j8);
    }

    public static DateTime now(Chronology chronology) {
        if (chronology != null) {
            return new DateTime(chronology);
        }
        x.l("Chronology must not be null");
        return null;
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableDateTime
    public DateTime toDateTime() {
        return this;
    }

    public DateTime(long j8, DateTimeZone dateTimeZone) {
        super(j8, dateTimeZone);
    }

    @Override // org.joda.time.base.AbstractInstant
    public DateTime toDateTime(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        return getChronology() == chronology2 ? this : super.toDateTime(chronology2);
    }

    public DateTime(long j8, Chronology chronology) {
        super(j8, chronology);
    }

    public DateTime(Object obj) {
        super(obj, (Chronology) null);
    }

    public DateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public DateTime(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public DateTime(int i14, int i15, int i16, int i17, int i18) {
        super(i14, i15, i16, i17, i18, 0, 0);
    }

    public DateTime(int i14, int i15, int i16, int i17, int i18, DateTimeZone dateTimeZone) {
        super(i14, i15, i16, i17, i18, 0, 0, dateTimeZone);
    }

    public DateTime(int i14, int i15, int i16, int i17, int i18, Chronology chronology) {
        super(i14, i15, i16, i17, i18, 0, 0, chronology);
    }

    public DateTime(int i14, int i15, int i16, int i17, int i18, int i19) {
        super(i14, i15, i16, i17, i18, i19, 0);
    }

    public DateTime() {
    }

    public DateTime(int i14, int i15, int i16, int i17, int i18, int i19, Chronology chronology) {
        super(i14, i15, i16, i17, i18, i19, 0, chronology);
    }

    public DateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        super(i14, i15, i16, i17, i18, i19, i24);
    }

    public DateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24, DateTimeZone dateTimeZone) {
        super(i14, i15, i16, i17, i18, i19, i24, dateTimeZone);
    }

    public DateTime withDurationAdded(ReadableDuration readableDuration, int i14) {
        return (readableDuration == null || i14 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i14);
    }

    public DateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24, Chronology chronology) {
        super(i14, i15, i16, i17, i18, i19, i24, chronology);
    }

    public DateTime withDate(LocalDate localDate) {
        return withDate(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth());
    }

    public DateTime withTime(LocalTime localTime) {
        return withTime(localTime.getHourOfDay(), localTime.getMinuteOfHour(), localTime.getSecondOfMinute(), localTime.getMillisOfSecond());
    }
}
