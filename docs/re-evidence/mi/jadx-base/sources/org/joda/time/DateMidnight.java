package org.joda.time;

import defpackage.bw3;
import defpackage.ggj;
import defpackage.gq5;
import defpackage.hgj;
import defpackage.jq5;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.wq5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DateMidnight extends BaseDateTime implements ggj, Serializable {
    private static final long serialVersionUID = 156371964018738L;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = 257629620;
        private gq5 iField;
        private DateMidnight iInstant;

        public Property(DateMidnight dateMidnight, gq5 gq5Var) {
            this.iInstant = dateMidnight;
            this.iField = gq5Var;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (DateMidnight) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public DateMidnight addToCopy(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.add(dateMidnight.getMillis(), i));
        }

        public DateMidnight addWrapFieldToCopy(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.addWrapField(dateMidnight.getMillis(), i));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public bw3 getChronology() {
            return this.iInstant.getChronology();
        }

        public DateMidnight getDateMidnight() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public gq5 getField() {
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

        public DateMidnight setCopy(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.set(dateMidnight.getMillis(), i));
        }

        public DateMidnight withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public DateMidnight withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public DateMidnight addToCopy(long j) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.add(dateMidnight.getMillis(), j));
        }

        public DateMidnight setCopy(String str, Locale locale) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.set(dateMidnight.getMillis(), str, locale));
        }

        public DateMidnight setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public DateMidnight(int i, int i2, int i3, bw3 bw3Var) {
        super(i, i2, i3, 0, 0, 0, 0, bw3Var);
    }

    public static DateMidnight now(bw3 bw3Var) {
        if (bw3Var != null) {
            return new DateMidnight(bw3Var);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    @FromString
    public static DateMidnight parse(String str) {
        return parse(str, sxc.i().w());
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // org.joda.time.base.BaseDateTime
    public long checkInstant(long j, bw3 bw3Var) {
        return bw3Var.dayOfMonth().roundFloor(j);
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

    public DateMidnight minus(hgj hgjVar) {
        return withDurationAdded(hgjVar, -1);
    }

    public DateMidnight minusDays(int i) {
        return i == 0 ? this : withMillis(getChronology().days().subtract(getMillis(), i));
    }

    public DateMidnight minusMonths(int i) {
        return i == 0 ? this : withMillis(getChronology().months().subtract(getMillis(), i));
    }

    public DateMidnight minusWeeks(int i) {
        return i == 0 ? this : withMillis(getChronology().weeks().subtract(getMillis(), i));
    }

    public DateMidnight minusYears(int i) {
        return i == 0 ? this : withMillis(getChronology().years().subtract(getMillis(), i));
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public DateMidnight plus(hgj hgjVar) {
        return withDurationAdded(hgjVar, 1);
    }

    public DateMidnight plusDays(int i) {
        return i == 0 ? this : withMillis(getChronology().days().add(getMillis(), i));
    }

    public DateMidnight plusMonths(int i) {
        return i == 0 ? this : withMillis(getChronology().months().add(getMillis(), i));
    }

    public DateMidnight plusWeeks(int i) {
        return i == 0 ? this : withMillis(getChronology().weeks().add(getMillis(), i));
    }

    public DateMidnight plusYears(int i) {
        return i == 0 ? this : withMillis(getChronology().years().add(getMillis(), i));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        gq5 field = dateTimeFieldType.getField(getChronology());
        if (field.isSupported()) {
            return new Property(this, field);
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public Interval toInterval() {
        bw3 chronology = getChronology();
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

    public DateMidnight withCenturyOfEra(int i) {
        return withMillis(getChronology().centuryOfEra().set(getMillis(), i));
    }

    public DateMidnight withChronology(bw3 bw3Var) {
        return bw3Var == getChronology() ? this : new DateMidnight(getMillis(), bw3Var);
    }

    public DateMidnight withDayOfMonth(int i) {
        return withMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public DateMidnight withDayOfWeek(int i) {
        return withMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public DateMidnight withDayOfYear(int i) {
        return withMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public DateMidnight withDurationAdded(hgj hgjVar, int i) {
        return (hgjVar == null || i == 0) ? this : withDurationAdded(hgjVar.getMillis(), i);
    }

    public DateMidnight withEra(int i) {
        return withMillis(getChronology().era().set(getMillis(), i));
    }

    public DateMidnight withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return withMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public DateMidnight withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            return i == 0 ? this : withMillis(durationFieldType.getField(getChronology()).add(getMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public DateMidnight withFields(ogj ogjVar) {
        return ogjVar == null ? this : withMillis(getChronology().set(ogjVar, getMillis()));
    }

    public DateMidnight withMillis(long j) {
        bw3 chronology = getChronology();
        long jCheckInstant = checkInstant(j, chronology);
        return jCheckInstant == getMillis() ? this : new DateMidnight(jCheckInstant, chronology);
    }

    public DateMidnight withMonthOfYear(int i) {
        return withMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public DateMidnight withPeriodAdded(qgj qgjVar, int i) {
        return (qgjVar == null || i == 0) ? this : withMillis(getChronology().add(qgjVar, getMillis(), i));
    }

    public DateMidnight withWeekOfWeekyear(int i) {
        return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public DateMidnight withWeekyear(int i) {
        return withMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public DateMidnight withYear(int i) {
        return withMillis(getChronology().year().set(getMillis(), i));
    }

    public DateMidnight withYearOfCentury(int i) {
        return withMillis(getChronology().yearOfCentury().set(getMillis(), i));
    }

    public DateMidnight withYearOfEra(int i) {
        return withMillis(getChronology().yearOfEra().set(getMillis(), i));
    }

    public DateMidnight withZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZoneM = wq5.m(dateTimeZone);
        DateTimeZone dateTimeZoneM2 = wq5.m(getZone());
        return dateTimeZoneM == dateTimeZoneM2 ? this : new DateMidnight(dateTimeZoneM2.getMillisKeepLocal(dateTimeZoneM, getMillis()), getChronology().withZone(dateTimeZoneM));
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

    public static DateMidnight parse(String str, jq5 jq5Var) {
        return jq5Var.f(str).toDateMidnight();
    }

    public DateMidnight() {
    }

    public DateMidnight minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public DateMidnight plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public DateMidnight withDurationAdded(long j, int i) {
        return (j == 0 || i == 0) ? this : withMillis(getChronology().add(getMillis(), j, i));
    }

    public DateMidnight(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public static DateMidnight now() {
        return new DateMidnight();
    }

    public DateMidnight(bw3 bw3Var) {
        super(bw3Var);
    }

    public static DateMidnight now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new DateMidnight(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public DateMidnight minus(long j) {
        return withDurationAdded(j, -1);
    }

    public DateMidnight plus(long j) {
        return withDurationAdded(j, 1);
    }

    public DateMidnight(long j) {
        super(j);
    }

    public DateMidnight(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public DateMidnight(long j, bw3 bw3Var) {
        super(j, bw3Var);
    }

    public DateMidnight(Object obj) {
        super(obj, (bw3) null);
    }

    public DateMidnight(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public DateMidnight(Object obj, bw3 bw3Var) {
        super(obj, wq5.c(bw3Var));
    }

    public DateMidnight(int i, int i2, int i3) {
        super(i, i2, i3, 0, 0, 0, 0);
    }

    public DateMidnight(int i, int i2, int i3, DateTimeZone dateTimeZone) {
        super(i, i2, i3, 0, 0, 0, 0, dateTimeZone);
    }
}
