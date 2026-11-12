package org.joda.time;

import am.j;
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
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class MutableDateTime extends BaseDateTime implements ReadWritableDateTime, Cloneable, Serializable {
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_FLOOR = 1;
    public static final int ROUND_HALF_CEILING = 4;
    public static final int ROUND_HALF_EVEN = 5;
    public static final int ROUND_HALF_FLOOR = 3;
    public static final int ROUND_NONE = 0;
    private static final long serialVersionUID = 2852608688135209575L;
    private DateTimeField iRoundingField;
    private int iRoundingMode;

    public MutableDateTime(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public static MutableDateTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MutableDateTime(dateTimeZone);
        }
        x.l("Zone must not be null");
        return null;
    }

    @FromString
    public static MutableDateTime parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(DurationFieldType durationFieldType, int i14) {
        if (durationFieldType == null) {
            h.s("Field must not be null");
        } else if (i14 != 0) {
            setMillis(durationFieldType.getField(getChronology()).add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addDays(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().days().add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addHours(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().hours().add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMillis(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().millis().add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMinutes(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().minutes().add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMonths(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().months().add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addSeconds(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().seconds().add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addWeeks(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().weeks().add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addWeekyears(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().weekyears().add(getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addYears(int i14) {
        if (i14 != 0) {
            setMillis(getChronology().years().add(getMillis(), i14));
        }
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutableDateTime copy() {
        return (MutableDateTime) clone();
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

    public DateTimeField getRoundingField() {
        return this.iRoundingField;
    }

    public int getRoundingMode() {
        return this.iRoundingMode;
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

    public Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
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

    @Override // org.joda.time.ReadWritableInstant
    public void set(DateTimeFieldType dateTimeFieldType, int i14) {
        if (dateTimeFieldType != null) {
            setMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i14));
        } else {
            h.s("Field must not be null");
        }
    }

    @Override // org.joda.time.base.BaseDateTime, org.joda.time.ReadWritableInstant
    public void setChronology(Chronology chronology) {
        super.setChronology(chronology);
    }

    public void setDate(ReadableInstant readableInstant) {
        DateTimeZone zone;
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        if ((readableInstant instanceof ReadableDateTime) && (zone = DateTimeUtils.getChronology(((ReadableDateTime) readableInstant).getChronology()).getZone()) != null) {
            instantMillis = zone.getMillisKeepLocal(getZone(), instantMillis);
        }
        setDate(instantMillis);
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        setMillis(getChronology().getDateTimeMillis(i14, i15, i16, i17, i18, i19, i24));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfMonth(int i14) {
        setMillis(getChronology().dayOfMonth().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfWeek(int i14) {
        setMillis(getChronology().dayOfWeek().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfYear(int i14) {
        setMillis(getChronology().dayOfYear().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setHourOfDay(int i14) {
        setMillis(getChronology().hourOfDay().set(getMillis(), i14));
    }

    @Override // org.joda.time.base.BaseDateTime, org.joda.time.ReadWritableInstant
    public void setMillis(long j8) {
        int i14 = this.iRoundingMode;
        if (i14 == 1) {
            j8 = this.iRoundingField.roundFloor(j8);
        } else if (i14 == 2) {
            j8 = this.iRoundingField.roundCeiling(j8);
        } else if (i14 == 3) {
            j8 = this.iRoundingField.roundHalfFloor(j8);
        } else if (i14 == 4) {
            j8 = this.iRoundingField.roundHalfCeiling(j8);
        } else if (i14 == 5) {
            j8 = this.iRoundingField.roundHalfEven(j8);
        }
        super.setMillis(j8);
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMillisOfDay(int i14) {
        setMillis(getChronology().millisOfDay().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMillisOfSecond(int i14) {
        setMillis(getChronology().millisOfSecond().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMinuteOfDay(int i14) {
        setMillis(getChronology().minuteOfDay().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMinuteOfHour(int i14) {
        setMillis(getChronology().minuteOfHour().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMonthOfYear(int i14) {
        setMillis(getChronology().monthOfYear().set(getMillis(), i14));
    }

    public void setRounding(DateTimeField dateTimeField, int i14) {
        if (dateTimeField != null && (i14 < 0 || i14 > 5)) {
            h.s(j.h(i14, "Illegal rounding mode: "));
            return;
        }
        this.iRoundingField = i14 == 0 ? null : dateTimeField;
        if (dateTimeField == null) {
            i14 = 0;
        }
        this.iRoundingMode = i14;
        setMillis(getMillis());
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setSecondOfDay(int i14) {
        setMillis(getChronology().secondOfDay().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setSecondOfMinute(int i14) {
        setMillis(getChronology().secondOfMinute().set(getMillis(), i14));
    }

    public void setTime(long j8) {
        setMillis(getChronology().millisOfDay().set(getMillis(), ISOChronology.getInstanceUTC().millisOfDay().get(j8)));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setWeekOfWeekyear(int i14) {
        setMillis(getChronology().weekOfWeekyear().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setWeekyear(int i14) {
        setMillis(getChronology().weekyear().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setYear(int i14) {
        setMillis(getChronology().year().set(getMillis(), i14));
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setZone(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        Chronology chronology = getChronology();
        if (chronology.getZone() != zone) {
            setChronology(chronology.withZone(zone));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        DateTimeZone zone2 = DateTimeUtils.getZone(getZone());
        if (zone == zone2) {
            return;
        }
        long millisKeepLocal = zone2.getMillisKeepLocal(zone, getMillis());
        setChronology(getChronology().withZone(zone));
        setMillis(millisKeepLocal);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
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

    public MutableDateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public MutableDateTime(Chronology chronology) {
        super(chronology);
    }

    public MutableDateTime(long j8) {
        super(j8);
    }

    public MutableDateTime(long j8, DateTimeZone dateTimeZone) {
        super(j8, dateTimeZone);
    }

    public MutableDateTime(long j8, Chronology chronology) {
        super(j8, chronology);
    }

    public MutableDateTime(Object obj) {
        super(obj, (Chronology) null);
    }

    public static MutableDateTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toMutableDateTime();
    }

    public MutableDateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public MutableDateTime() {
    }

    public static MutableDateTime now() {
        return new MutableDateTime();
    }

    public MutableDateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        super(i14, i15, i16, i17, i18, i19, i24);
    }

    public static MutableDateTime now(Chronology chronology) {
        if (chronology != null) {
            return new MutableDateTime(chronology);
        }
        x.l("Chronology must not be null");
        return null;
    }

    public MutableDateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24, DateTimeZone dateTimeZone) {
        super(i14, i15, i16, i17, i18, i19, i24, dateTimeZone);
    }

    public MutableDateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24, Chronology chronology) {
        super(i14, i15, i16, i17, i18, i19, i24, chronology);
    }

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private DateTimeField iField;
        private MutableDateTime iInstant;

        public Property(MutableDateTime mutableDateTime, DateTimeField dateTimeField) {
            this.iInstant = mutableDateTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public MutableDateTime add(int i14) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), i14));
            return this.iInstant;
        }

        public MutableDateTime addWrapField(int i14) {
            this.iInstant.setMillis(getField().addWrapField(this.iInstant.getMillis(), i14));
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getMillis();
        }

        public MutableDateTime getMutableDateTime() {
            return this.iInstant;
        }

        public MutableDateTime roundCeiling() {
            this.iInstant.setMillis(getField().roundCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundFloor() {
            this.iInstant.setMillis(getField().roundFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfCeiling() {
            this.iInstant.setMillis(getField().roundHalfCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfEven() {
            this.iInstant.setMillis(getField().roundHalfEven(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfFloor() {
            this.iInstant.setMillis(getField().roundHalfFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime set(int i14) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), i14));
            return this.iInstant;
        }

        public MutableDateTime add(long j8) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), j8));
            return this.iInstant;
        }

        public MutableDateTime set(String str, Locale locale) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), str, locale));
            return this.iInstant;
        }

        public MutableDateTime set(String str) {
            set(str, null);
            return this.iInstant;
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadableDuration readableDuration) {
        add(readableDuration, 1);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadableDuration readableDuration, int i14) {
        if (readableDuration != null) {
            add(FieldUtils.safeMultiply(readableDuration.getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadablePeriod readablePeriod) {
        add(readablePeriod, 1);
    }

    public void setTime(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        DateTimeZone zone = DateTimeUtils.getInstantChronology(readableInstant).getZone();
        if (zone != null) {
            instantMillis = zone.getMillisKeepLocal(DateTimeZone.UTC, instantMillis);
        }
        setTime(instantMillis);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadablePeriod readablePeriod, int i14) {
        if (readablePeriod != null) {
            setMillis(getChronology().add(readablePeriod, getMillis(), i14));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(long j8) {
        setMillis(FieldUtils.safeAdd(getMillis(), j8));
    }

    public void setDate(long j8) {
        setMillis(getChronology().millisOfDay().set(j8, getMillisOfDay()));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDate(int i14, int i15, int i16) {
        setDate(getChronology().getDateTimeMillis(i14, i15, i16, 0));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setTime(int i14, int i15, int i16, int i17) {
        setMillis(getChronology().getDateTimeMillis(getMillis(), i14, i15, i16, i17));
    }

    public void setRounding(DateTimeField dateTimeField) {
        setRounding(dateTimeField, 1);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setMillis(ReadableInstant readableInstant) {
        setMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }
}
