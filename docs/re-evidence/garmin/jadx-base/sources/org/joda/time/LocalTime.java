package org.joda.time;

import am.j;
import j20.x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.e;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalTime extends BaseLocal implements ReadablePartial, Serializable {
    private static final int HOUR_OF_DAY = 0;
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
    private static final int MILLIS_OF_SECOND = 3;
    private static final int MINUTE_OF_HOUR = 1;
    private static final int SECOND_OF_MINUTE = 2;
    private static final Set<DurationFieldType> TIME_DURATION_TYPES;
    private static final long serialVersionUID = -12873158713873L;
    private final Chronology iChronology;
    private final long iLocalMillis;

    static {
        HashSet hashSet = new HashSet();
        TIME_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.millis());
        hashSet.add(DurationFieldType.seconds());
        hashSet.add(DurationFieldType.minutes());
        hashSet.add(DurationFieldType.hours());
    }

    public LocalTime(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        Chronology chronologyWithUTC = chronology.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localTimeParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(0L, partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public static LocalTime fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        h.s("The calendar must not be null");
        return null;
    }

    public static LocalTime fromDateFields(Date date) {
        if (date != null) {
            return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        h.s("The date must not be null");
        return null;
    }

    public static LocalTime fromMillisOfDay(long j8, Chronology chronology) {
        return new LocalTime(j8, DateTimeUtils.getChronology(chronology).withUTC());
    }

    public static LocalTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalTime(dateTimeZone);
        }
        x.l("Zone must not be null");
        return null;
    }

    @FromString
    public static LocalTime parse(String str) {
        return parse(str, ISODateTimeFormat.localTimeParser());
    }

    private Object readResolve() {
        Chronology chronology = this.iChronology;
        if (chronology == null) {
            return new LocalTime(this.iLocalMillis, ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(chronology.getZone()) ? new LocalTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    @Override // org.joda.time.base.AbstractPartial, java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalTime) {
            LocalTime localTime = (LocalTime) readablePartial;
            if (this.iChronology.equals(localTime.iChronology)) {
                long j8 = this.iLocalMillis;
                long j14 = localTime.iLocalMillis;
                if (j8 < j14) {
                    return -1;
                }
                return j8 == j14 ? 0 : 1;
            }
        }
        return super.compareTo(readablePartial);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.iChronology.equals(localTime.iChronology)) {
                return this.iLocalMillis == localTime.iLocalMillis;
            }
        }
        return super.equals(obj);
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

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
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

    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    @Override // org.joda.time.base.BaseLocal
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMillisOfDay() {
        return getChronology().millisOfDay().get(getLocalMillis());
    }

    public int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getLocalMillis());
    }

    public int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getLocalMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i14) {
        if (i14 == 0) {
            return getChronology().hourOfDay().get(getLocalMillis());
        }
        if (i14 == 1) {
            return getChronology().minuteOfHour().get(getLocalMillis());
        }
        if (i14 == 2) {
            return getChronology().secondOfMinute().get(getLocalMillis());
        }
        if (i14 == 3) {
            return getChronology().millisOfSecond().get(getLocalMillis());
        }
        e.v(j.h(i14, "Invalid index: "));
        return 0;
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int hashCode() {
        return getChronology().hashCode() + this.iChronology.millisOfSecond().getType().hashCode() + ((this.iChronology.millisOfSecond().get(this.iLocalMillis) + ((this.iChronology.secondOfMinute().getType().hashCode() + ((this.iChronology.secondOfMinute().get(this.iLocalMillis) + ((this.iChronology.minuteOfHour().getType().hashCode() + ((this.iChronology.minuteOfHour().get(this.iLocalMillis) + ((this.iChronology.hourOfDay().getType().hashCode() + ((this.iChronology.hourOfDay().get(this.iLocalMillis) + 3611) * 23)) * 23)) * 23)) * 23)) * 23)) * 23)) * 23);
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        DurationField field = durationFieldType.getField(getChronology());
        if (TIME_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() < getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalTime minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public LocalTime minusHours(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i14));
    }

    public LocalTime minusMillis(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i14));
    }

    public LocalTime minusMinutes(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i14));
    }

    public LocalTime minusSeconds(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i14));
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public LocalTime plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public LocalTime plusHours(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().hours().add(getLocalMillis(), i14));
    }

    public LocalTime plusMillis(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().millis().add(getLocalMillis(), i14));
    }

    public LocalTime plusMinutes(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().minutes().add(getLocalMillis(), i14));
    }

    public LocalTime plusSeconds(int i14) {
        return i14 == 0 ? this : withLocalMillis(getChronology().seconds().add(getLocalMillis(), i14));
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

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis()), chronologyWithZone);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public LocalTime withField(DateTimeFieldType dateTimeFieldType, int i14) {
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

    public LocalTime withFieldAdded(DurationFieldType durationFieldType, int i14) {
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

    public LocalTime withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    public LocalTime withHourOfDay(int i14) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i14));
    }

    public LocalTime withLocalMillis(long j8) {
        return j8 == getLocalMillis() ? this : new LocalTime(j8, getChronology());
    }

    public LocalTime withMillisOfDay(int i14) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i14));
    }

    public LocalTime withMillisOfSecond(int i14) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i14));
    }

    public LocalTime withMinuteOfHour(int i14) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i14));
    }

    public LocalTime withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
        return (readablePeriod == null || i14 == 0) ? this : withLocalMillis(getChronology().add(readablePeriod, getLocalMillis(), i14));
    }

    public LocalTime withSecondOfMinute(int i14) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i14));
    }

    public static LocalTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalTime(str);
    }

    public static LocalTime fromMillisOfDay(long j8) {
        return fromMillisOfDay(j8, null);
    }

    public static LocalTime now() {
        return new LocalTime();
    }

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -325842547277223L;
        private transient DateTimeField iField;
        private transient LocalTime iInstant;

        public Property(LocalTime localTime, DateTimeField dateTimeField) {
            this.iInstant = localTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (LocalTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalTime addCopy(int i14) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), i14));
        }

        public LocalTime addNoWrapToCopy(int i14) {
            long jAdd = this.iField.add(this.iInstant.getLocalMillis(), i14);
            if (this.iInstant.getChronology().millisOfDay().get(jAdd) == jAdd) {
                return this.iInstant.withLocalMillis(jAdd);
            }
            h.s("The addition exceeded the boundaries of LocalTime");
            return null;
        }

        public LocalTime addWrapFieldToCopy(int i14) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.addWrapField(localTime.getLocalMillis(), i14));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        public LocalTime getLocalTime() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalTime roundCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundFloor(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfEvenCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfEven(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfFloor(localTime.getLocalMillis()));
        }

        public LocalTime setCopy(int i14) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), i14));
        }

        public LocalTime withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalTime withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public LocalTime addCopy(long j8) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), j8));
        }

        public LocalTime setCopy(String str, Locale locale) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), str, locale));
        }

        public LocalTime setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public static LocalTime now(Chronology chronology) {
        if (chronology != null) {
            return new LocalTime(chronology);
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

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.time().print(this);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null || !isSupported(dateTimeFieldType.getDurationType())) {
            return false;
        }
        DurationFieldType rangeDurationType = dateTimeFieldType.getRangeDurationType();
        return isSupported(rangeDurationType) || rangeDurationType == DurationFieldType.days();
    }

    public LocalTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    public LocalTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalTime(long j8) {
        this(j8, ISOChronology.getInstance());
    }

    public LocalTime(long j8, DateTimeZone dateTimeZone) {
        this(j8, ISOChronology.getInstance(dateTimeZone));
    }

    public LocalTime(long j8, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        long millisKeepLocal = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j8);
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iLocalMillis = chronologyWithUTC.millisOfDay().get(millisKeepLocal);
        this.iChronology = chronologyWithUTC;
    }

    public LocalTime(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public LocalTime(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localTimeParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(0L, partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalTime(int i14, int i15) {
        this(i14, i15, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i14, int i15, int i16) {
        this(i14, i15, i16, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i14, int i15, int i16, int i17) {
        this(i14, i15, i16, i17, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i14, int i15, int i16, int i17, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = chronologyWithUTC.getDateTimeMillis(0L, i14, i15, i16, i17);
        this.iChronology = chronologyWithUTC;
        this.iLocalMillis = dateTimeMillis;
    }
}
