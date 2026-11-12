package org.joda.time;

import am.j;
import j20.x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.apache.commons.lang3.e;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDate extends BaseLocal implements ReadablePartial, Serializable {
    private static final Set<DurationFieldType> DATE_DURATION_TYPES;
    private static final int DAY_OF_MONTH = 2;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -8775358157899L;
    private final Chronology iChronology;
    private transient int iHash;
    private final long iLocalMillis;

    static {
        HashSet hashSet = new HashSet();
        DATE_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.days());
        hashSet.add(DurationFieldType.weeks());
        hashSet.add(DurationFieldType.months());
        hashSet.add(DurationFieldType.weekyears());
        hashSet.add(DurationFieldType.years());
        hashSet.add(DurationFieldType.centuries());
        hashSet.add(DurationFieldType.eras());
    }

    public LocalDate(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        Chronology chronologyWithUTC = chronology.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localDateParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], 0);
    }

    public static LocalDate fromCalendarFields(Calendar calendar) {
        if (calendar == null) {
            h.s("The calendar must not be null");
            return null;
        }
        int i14 = calendar.get(0);
        int i15 = calendar.get(1);
        if (i14 != 1) {
            i15 = 1 - i15;
        }
        return new LocalDate(i15, calendar.get(2) + 1, calendar.get(5));
    }

    public static LocalDate fromDateFields(Date date) {
        if (date == null) {
            h.s("The date must not be null");
            return null;
        }
        if (date.getTime() >= 0) {
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return fromCalendarFields(gregorianCalendar);
    }

    public static LocalDate now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDate(dateTimeZone);
        }
        x.l("Zone must not be null");
        return null;
    }

    @FromString
    public static LocalDate parse(String str) {
        return parse(str, ISODateTimeFormat.localDateParser());
    }

    private Object readResolve() {
        Chronology chronology = this.iChronology;
        if (chronology == null) {
            return new LocalDate(this.iLocalMillis, ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(chronology.getZone()) ? new LocalDate(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // org.joda.time.base.AbstractPartial, java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalDate) {
            LocalDate localDate = (LocalDate) readablePartial;
            if (this.iChronology.equals(localDate.iChronology)) {
                long j8 = this.iLocalMillis;
                long j14 = localDate.iLocalMillis;
                if (j8 < j14) {
                    return -1;
                }
                return j8 == j14 ? 0 : 1;
            }
        }
        return super.compareTo(readablePartial);
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

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            if (this.iChronology.equals(localDate.iChronology)) {
                return this.iLocalMillis == localDate.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            h.s("The DateTimeFieldType must not be null");
            return 0;
        }
        if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        e.l("Field '", dateTimeFieldType, "' is not supported");
        return 0;
    }

    public int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    public int getDayOfMonth() {
        return getChronology().dayOfMonth().get(getLocalMillis());
    }

    public int getDayOfWeek() {
        return getChronology().dayOfWeek().get(getLocalMillis());
    }

    public int getDayOfYear() {
        return getChronology().dayOfYear().get(getLocalMillis());
    }

    public int getEra() {
        return getChronology().era().get(getLocalMillis());
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

    @Override // org.joda.time.base.BaseLocal
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i14) {
        if (i14 == 0) {
            return getChronology().year().get(getLocalMillis());
        }
        if (i14 == 1) {
            return getChronology().monthOfYear().get(getLocalMillis());
        }
        if (i14 == 2) {
            return getChronology().dayOfMonth().get(getLocalMillis());
        }
        e.v(j.h(i14, "Invalid index: "));
        return 0;
    }

    public int getWeekOfWeekyear() {
        return getChronology().weekOfWeekyear().get(getLocalMillis());
    }

    public int getWeekyear() {
        return getChronology().weekyear().get(getLocalMillis());
    }

    public int getYear() {
        return getChronology().year().get(getLocalMillis());
    }

    public int getYearOfCentury() {
        return getChronology().yearOfCentury().get(getLocalMillis());
    }

    public int getYearOfEra() {
        return getChronology().yearOfEra().get(getLocalMillis());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int hashCode() {
        int i14 = this.iHash;
        if (i14 != 0) {
            return i14;
        }
        int iHashCode = super.hashCode();
        this.iHash = iHashCode;
        return iHashCode;
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        DurationFieldType durationType = dateTimeFieldType.getDurationType();
        if (DATE_DURATION_TYPES.contains(durationType) || durationType.getField(getChronology()).getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return dateTimeFieldType.getField(getChronology()).isSupported();
        }
        return false;
    }

    public LocalDate minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public LocalDate minusDays(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().days().subtract(getLocalMillis(), i14));
    }

    public LocalDate minusMonths(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().months().subtract(getLocalMillis(), i14));
    }

    public LocalDate minusWeeks(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i14));
    }

    public LocalDate minusYears(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().years().subtract(getLocalMillis(), i14));
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDate plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public LocalDate plusDays(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().days().add(getLocalMillis(), i14));
    }

    public LocalDate plusMonths(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().months().add(getLocalMillis(), i14));
    }

    public LocalDate plusWeeks(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().weeks().add(getLocalMillis(), i14));
    }

    public LocalDate plusYears(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().years().add(getLocalMillis(), i14));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            h.s("The DateTimeFieldType must not be null");
            return null;
        }
        if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        }
        e.l("Field '", dateTimeFieldType, "' is not supported");
        return null;
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 3;
    }

    public Date toDate() {
        int dayOfMonth = getDayOfMonth();
        Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, dayOfMonth);
        LocalDate localDateFromDateFields = fromDateFields(date);
        if (!localDateFromDateFields.isBefore(this)) {
            if (localDateFromDateFields.equals(this)) {
                Date date2 = new Date(date.getTime() - ((long) TimeZone.getDefault().getDSTSavings()));
                if (date2.getDate() == dayOfMonth) {
                    return date2;
                }
            }
            return date;
        }
        while (!localDateFromDateFields.equals(this)) {
            date.setTime(date.getTime() + 3600000);
            localDateFromDateFields = fromDateFields(date);
        }
        while (date.getDate() == dayOfMonth) {
            date.setTime(date.getTime() - 1000);
        }
        date.setTime(date.getTime() + 1000);
        return date;
    }

    @Deprecated
    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public DateTime toDateTime(LocalTime localTime, DateTimeZone dateTimeZone) {
        if (localTime == null) {
            return toDateTimeAtCurrentTime(dateTimeZone);
        }
        if (getChronology() == localTime.getChronology()) {
            return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), localTime.getHourOfDay(), localTime.getMinuteOfHour(), localTime.getSecondOfMinute(), localTime.getMillisOfSecond(), getChronology().withZone(dateTimeZone));
        }
        h.s("The chronology of the time does not match");
        return null;
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(DateTimeUtils.getZone(dateTimeZone));
        return new DateTime(chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis()), chronologyWithZone);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public DateTime toDateTimeAtStartOfDay(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        Chronology chronologyWithZone = getChronology().withZone(zone);
        return new DateTime(chronologyWithZone.dayOfMonth().roundFloor(zone.convertLocalToUTC(getLocalMillis() + 21600000, false)), chronologyWithZone).withEarlierOffsetAtOverlap();
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return new Interval(toDateTimeAtStartOfDay(zone), plusDays(1).toDateTimeAtStartOfDay(zone));
    }

    public LocalDateTime toLocalDateTime(LocalTime localTime) {
        if (localTime == null) {
            h.s("The time must not be null");
            return null;
        }
        if (getChronology() == localTime.getChronology()) {
            return new LocalDateTime(localTime.getLocalMillis() + getLocalMillis(), getChronology());
        }
        h.s("The chronology of the time does not match");
        return null;
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public LocalDate withCenturyOfEra(int i14) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i14));
    }

    public LocalDate withDayOfMonth(int i14) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i14));
    }

    public LocalDate withDayOfWeek(int i14) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i14));
    }

    public LocalDate withDayOfYear(int i14) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i14));
    }

    public LocalDate withEra(int i14) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i14));
    }

    public LocalDate withField(DateTimeFieldType dateTimeFieldType, int i14) {
        if (dateTimeFieldType == null) {
            h.s("Field must not be null");
            return null;
        }
        if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i14));
        }
        e.l("Field '", dateTimeFieldType, "' is not supported");
        return null;
    }

    public LocalDate withFieldAdded(DurationFieldType durationFieldType, int i14) {
        if (durationFieldType == null) {
            h.s("Field must not be null");
            return null;
        }
        if (isSupported(durationFieldType)) {
            return i14 == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i14));
        }
        e.l("Field '", durationFieldType, "' is not supported");
        return null;
    }

    public LocalDate withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    public LocalDate withLocalMillis(long j8) {
        long jRoundFloor = this.iChronology.dayOfMonth().roundFloor(j8);
        return jRoundFloor == getLocalMillis() ? this : new LocalDate(jRoundFloor, getChronology());
    }

    public LocalDate withMonthOfYear(int i14) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i14));
    }

    public LocalDate withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
        if (readablePeriod == null || i14 == 0) {
            return this;
        }
        long localMillis = getLocalMillis();
        Chronology chronology = getChronology();
        for (int i15 = 0; i15 < readablePeriod.size(); i15++) {
            long jSafeMultiply = FieldUtils.safeMultiply(readablePeriod.getValue(i15), i14);
            DurationFieldType fieldType = readablePeriod.getFieldType(i15);
            if (isSupported(fieldType)) {
                localMillis = fieldType.getField(chronology).add(localMillis, jSafeMultiply);
            }
        }
        return withLocalMillis(localMillis);
    }

    public LocalDate withWeekOfWeekyear(int i14) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i14));
    }

    public LocalDate withWeekyear(int i14) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i14));
    }

    public LocalDate withYear(int i14) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i14));
    }

    public LocalDate withYearOfCentury(int i14) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i14));
    }

    public LocalDate withYearOfEra(int i14) {
        return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i14));
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

    public static LocalDate parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalDate(str);
    }

    public static LocalDate now() {
        return new LocalDate();
    }

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -3193829732634L;
        private transient DateTimeField iField;
        private transient LocalDate iInstant;

        public Property(LocalDate localDate, DateTimeField dateTimeField) {
            this.iInstant = localDate;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (LocalDate) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalDate addToCopy(int i14) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.add(localDate.getLocalMillis(), i14));
        }

        public LocalDate addWrapFieldToCopy(int i14) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.addWrapField(localDate.getLocalMillis(), i14));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        public LocalDate getLocalDate() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalDate roundCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundCeiling(localDate.getLocalMillis()));
        }

        public LocalDate roundFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundFloor(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfCeiling(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfEvenCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfEven(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfFloor(localDate.getLocalMillis()));
        }

        public LocalDate setCopy(int i14) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), i14));
        }

        public LocalDate withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalDate withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public LocalDate setCopy(String str, Locale locale) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), str, locale));
        }

        public LocalDate setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public static LocalDate now(Chronology chronology) {
        if (chronology != null) {
            return new LocalDate(chronology);
        }
        x.l("Chronology must not be null");
        return null;
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print(this);
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.date().print(this);
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    @Deprecated
    public DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }

    public DateTime toDateTimeAtStartOfDay() {
        return toDateTimeAtStartOfDay(null);
    }

    public LocalDate(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDate(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalDate(long j8) {
        this(j8, ISOChronology.getInstance());
    }

    public LocalDate(long j8, DateTimeZone dateTimeZone) {
        this(j8, ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDate(long j8, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        long millisKeepLocal = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j8);
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iLocalMillis = chronologyWithUTC.dayOfMonth().roundFloor(millisKeepLocal);
        this.iChronology = chronologyWithUTC;
    }

    public LocalDate(Object obj) {
        this(obj, (Chronology) null);
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        DurationField field = durationFieldType.getField(getChronology());
        if (DATE_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public LocalDate() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public LocalDate(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localDateParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], 0);
    }

    public DateTime toDateTime(LocalTime localTime) {
        return toDateTime(localTime, null);
    }

    public LocalDate(int i14, int i15, int i16) {
        this(i14, i15, i16, ISOChronology.getInstanceUTC());
    }

    public LocalDate(int i14, int i15, int i16, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = chronologyWithUTC.getDateTimeMillis(i14, i15, i16, 0);
        this.iChronology = chronologyWithUTC;
        this.iLocalMillis = dateTimeMillis;
    }
}
