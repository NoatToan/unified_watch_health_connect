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
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DateMidnight extends BaseDateTime implements ReadableDateTime, Serializable {
    private static final long serialVersionUID = 156371964018738L;

    public DateMidnight(int i14, int i15, int i16, DateTimeZone dateTimeZone) {
        super(i14, i15, i16, 0, 0, 0, 0, dateTimeZone);
    }

    public static DateMidnight now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new DateMidnight(dateTimeZone);
        }
        x.l("Zone must not be null");
        return null;
    }

    @FromString
    public static DateMidnight parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // org.joda.time.base.BaseDateTime
    public long checkInstant(long j8, Chronology chronology) {
        return chronology.dayOfMonth().roundFloor(j8);
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

    public DateMidnight minus(long j8) {
        return withDurationAdded(j8, -1);
    }

    public DateMidnight minusDays(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().days().subtract(getMillis(), i14));
    }

    public DateMidnight minusMonths(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().months().subtract(getMillis(), i14));
    }

    public DateMidnight minusWeeks(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().weeks().subtract(getMillis(), i14));
    }

    public DateMidnight minusYears(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().years().subtract(getMillis(), i14));
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public DateMidnight plus(long j8) {
        return withDurationAdded(j8, 1);
    }

    public DateMidnight plusDays(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().days().add(getMillis(), i14));
    }

    public DateMidnight plusMonths(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().months().add(getMillis(), i14));
    }

    public DateMidnight plusWeeks(int i14) {
        return i14 == 0 ? this : withMillis(getChronology().weeks().add(getMillis(), i14));
    }

    public DateMidnight plusYears(int i14) {
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

    public Interval toInterval() {
        Chronology chronology = getChronology();
        long millis = getMillis();
        return new Interval(millis, DurationFieldType.days().getField(chronology).add(millis, 1), chronology);
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getMillis(), getChronology());
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

    public DateMidnight withCenturyOfEra(int i14) {
        return withMillis(getChronology().centuryOfEra().set(getMillis(), i14));
    }

    public DateMidnight withChronology(Chronology chronology) {
        return chronology == getChronology() ? this : new DateMidnight(getMillis(), chronology);
    }

    public DateMidnight withDayOfMonth(int i14) {
        return withMillis(getChronology().dayOfMonth().set(getMillis(), i14));
    }

    public DateMidnight withDayOfWeek(int i14) {
        return withMillis(getChronology().dayOfWeek().set(getMillis(), i14));
    }

    public DateMidnight withDayOfYear(int i14) {
        return withMillis(getChronology().dayOfYear().set(getMillis(), i14));
    }

    public DateMidnight withDurationAdded(long j8, int i14) {
        return (j8 == 0 || i14 == 0) ? this : withMillis(getChronology().add(getMillis(), j8, i14));
    }

    public DateMidnight withEra(int i14) {
        return withMillis(getChronology().era().set(getMillis(), i14));
    }

    public DateMidnight withField(DateTimeFieldType dateTimeFieldType, int i14) {
        if (dateTimeFieldType != null) {
            return withMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i14));
        }
        h.s("Field must not be null");
        return null;
    }

    public DateMidnight withFieldAdded(DurationFieldType durationFieldType, int i14) {
        if (durationFieldType != null) {
            return i14 == 0 ? this : withMillis(durationFieldType.getField(getChronology()).add(getMillis(), i14));
        }
        h.s("Field must not be null");
        return null;
    }

    public DateMidnight withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withMillis(getChronology().set(readablePartial, getMillis()));
    }

    public DateMidnight withMillis(long j8) {
        Chronology chronology = getChronology();
        long jCheckInstant = checkInstant(j8, chronology);
        return jCheckInstant == getMillis() ? this : new DateMidnight(jCheckInstant, chronology);
    }

    public DateMidnight withMonthOfYear(int i14) {
        return withMillis(getChronology().monthOfYear().set(getMillis(), i14));
    }

    public DateMidnight withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
        return (readablePeriod == null || i14 == 0) ? this : withMillis(getChronology().add(readablePeriod, getMillis(), i14));
    }

    public DateMidnight withWeekOfWeekyear(int i14) {
        return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i14));
    }

    public DateMidnight withWeekyear(int i14) {
        return withMillis(getChronology().weekyear().set(getMillis(), i14));
    }

    public DateMidnight withYear(int i14) {
        return withMillis(getChronology().year().set(getMillis(), i14));
    }

    public DateMidnight withYearOfCentury(int i14) {
        return withMillis(getChronology().yearOfCentury().set(getMillis(), i14));
    }

    public DateMidnight withYearOfEra(int i14) {
        return withMillis(getChronology().yearOfEra().set(getMillis(), i14));
    }

    public DateMidnight withZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        DateTimeZone zone2 = DateTimeUtils.getZone(getZone());
        return zone == zone2 ? this : new DateMidnight(zone2.getMillisKeepLocal(zone, getMillis()), getChronology().withZone(zone));
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

    public DateMidnight minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public DateMidnight plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    public DateMidnight minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public DateMidnight plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public DateMidnight(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public static DateMidnight parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toDateMidnight();
    }

    public DateMidnight(Chronology chronology) {
        super(chronology);
    }

    public DateMidnight(long j8) {
        super(j8);
    }

    public static DateMidnight now() {
        return new DateMidnight();
    }

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = 257629620;
        private DateTimeField iField;
        private DateMidnight iInstant;

        public Property(DateMidnight dateMidnight, DateTimeField dateTimeField) {
            this.iInstant = dateMidnight;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (DateMidnight) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public DateMidnight addToCopy(int i14) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.add(dateMidnight.getMillis(), i14));
        }

        public DateMidnight addWrapFieldToCopy(int i14) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.addWrapField(dateMidnight.getMillis(), i14));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        public DateMidnight getDateMidnight() {
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

        public DateMidnight roundCeilingCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundCeiling(dateMidnight.getMillis()));
        }

        public DateMidnight roundFloorCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundFloor(dateMidnight.getMillis()));
        }

        public DateMidnight roundHalfCeilingCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundHalfCeiling(dateMidnight.getMillis()));
        }

        public DateMidnight roundHalfEvenCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundHalfEven(dateMidnight.getMillis()));
        }

        public DateMidnight roundHalfFloorCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundHalfFloor(dateMidnight.getMillis()));
        }

        public DateMidnight setCopy(int i14) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.set(dateMidnight.getMillis(), i14));
        }

        public DateMidnight withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public DateMidnight withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public DateMidnight addToCopy(long j8) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.add(dateMidnight.getMillis(), j8));
        }

        public DateMidnight setCopy(String str, Locale locale) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.set(dateMidnight.getMillis(), str, locale));
        }

        public DateMidnight setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public DateMidnight(long j8, DateTimeZone dateTimeZone) {
        super(j8, dateTimeZone);
    }

    public static DateMidnight now(Chronology chronology) {
        if (chronology != null) {
            return new DateMidnight(chronology);
        }
        x.l("Chronology must not be null");
        return null;
    }

    public DateMidnight(long j8, Chronology chronology) {
        super(j8, chronology);
    }

    public DateMidnight(Object obj) {
        super(obj, (Chronology) null);
    }

    public DateMidnight(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public DateMidnight(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public DateMidnight(int i14, int i15, int i16) {
        super(i14, i15, i16, 0, 0, 0, 0);
    }

    public DateMidnight() {
    }

    public DateMidnight(int i14, int i15, int i16, Chronology chronology) {
        super(i14, i15, i16, 0, 0, 0, 0, chronology);
    }

    public DateMidnight withDurationAdded(ReadableDuration readableDuration, int i14) {
        return (readableDuration == null || i14 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i14);
    }
}
