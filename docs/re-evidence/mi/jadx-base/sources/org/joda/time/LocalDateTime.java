package org.joda.time;

import com.miui.tsmclient.model.mitsm.h;
import defpackage.bw3;
import defpackage.fk4;
import defpackage.flh;
import defpackage.gq5;
import defpackage.hgj;
import defpackage.hq5;
import defpackage.jq5;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.v82;
import defpackage.wq5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDateTime extends v82 implements ogj, Serializable {
    private static final int DAY_OF_MONTH = 2;
    private static final int MILLIS_OF_DAY = 3;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -268716875315837168L;
    private final bw3 iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -358138762846288L;
        private transient gq5 iField;
        private transient LocalDateTime iInstant;

        public Property(LocalDateTime localDateTime, gq5 gq5Var) {
            this.iInstant = localDateTime;
            this.iField = gq5Var;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalDateTime addToCopy(int i) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.add(localDateTime.getLocalMillis(), i));
        }

        public LocalDateTime addWrapFieldToCopy(int i) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.addWrapField(localDateTime.getLocalMillis(), i));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public bw3 getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public gq5 getField() {
            return this.iField;
        }

        public LocalDateTime getLocalDateTime() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalDateTime roundCeilingCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundCeiling(localDateTime.getLocalMillis()));
        }

        public LocalDateTime roundFloorCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundFloor(localDateTime.getLocalMillis()));
        }

        public LocalDateTime roundHalfCeilingCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundHalfCeiling(localDateTime.getLocalMillis()));
        }

        public LocalDateTime roundHalfEvenCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundHalfEven(localDateTime.getLocalMillis()));
        }

        public LocalDateTime roundHalfFloorCopy() {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.roundHalfFloor(localDateTime.getLocalMillis()));
        }

        public LocalDateTime setCopy(int i) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.set(localDateTime.getLocalMillis(), i));
        }

        public LocalDateTime withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalDateTime withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public LocalDateTime addToCopy(long j) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.add(localDateTime.getLocalMillis(), j));
        }

        public LocalDateTime setCopy(String str, Locale locale) {
            LocalDateTime localDateTime = this.iInstant;
            return localDateTime.withLocalMillis(this.iField.set(localDateTime.getLocalMillis(), str, locale));
        }

        public LocalDateTime setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        long dateTimeMillis = bw3VarWithUTC.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        this.iChronology = bw3VarWithUTC;
        this.iLocalMillis = dateTimeMillis;
    }

    private Date correctDstTransition(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        LocalDateTime localDateTimeFromCalendarFields = fromCalendarFields(calendar);
        if (localDateTimeFromCalendarFields.isBefore(this)) {
            while (localDateTimeFromCalendarFields.isBefore(this)) {
                calendar.setTimeInMillis(calendar.getTimeInMillis() + 60000);
                localDateTimeFromCalendarFields = fromCalendarFields(calendar);
            }
            while (!localDateTimeFromCalendarFields.isBefore(this)) {
                calendar.setTimeInMillis(calendar.getTimeInMillis() - 1000);
                localDateTimeFromCalendarFields = fromCalendarFields(calendar);
            }
            calendar.setTimeInMillis(calendar.getTimeInMillis() + 1000);
        } else if (localDateTimeFromCalendarFields.equals(this)) {
            Calendar calendar2 = Calendar.getInstance(timeZone);
            calendar2.setTimeInMillis(calendar.getTimeInMillis() - ((long) timeZone.getDSTSavings()));
            if (fromCalendarFields(calendar2).equals(this)) {
                calendar = calendar2;
            }
        }
        return calendar.getTime();
    }

    public static LocalDateTime fromCalendarFields(Calendar calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("The calendar must not be null");
        }
        int i = calendar.get(0);
        int i2 = calendar.get(1);
        if (i != 1) {
            i2 = 1 - i2;
        }
        return new LocalDateTime(i2, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
    }

    public static LocalDateTime fromDateFields(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (date.getTime() >= 0) {
            return new LocalDateTime(date.getYear() + 1900, date.getMonth() + 1, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return fromCalendarFields(gregorianCalendar);
    }

    public static LocalDateTime now(bw3 bw3Var) {
        if (bw3Var != null) {
            return new LocalDateTime(bw3Var);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    @FromString
    public static LocalDateTime parse(String str) {
        return parse(str, sxc.l());
    }

    private Object readResolve() {
        bw3 bw3Var = this.iChronology;
        if (bw3Var == null) {
            return new LocalDateTime(this.iLocalMillis, ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(bw3Var.getZone()) ? new LocalDateTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // defpackage.i10, java.lang.Comparable
    public int compareTo(ogj ogjVar) {
        if (this == ogjVar) {
            return 0;
        }
        if (ogjVar instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) ogjVar;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localDateTime.iLocalMillis;
                if (j < j2) {
                    return -1;
                }
                return j == j2 ? 0 : 1;
            }
        }
        return super.compareTo(ogjVar);
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

    @Override // defpackage.i10
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                return this.iLocalMillis == localDateTime.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    @Override // defpackage.i10, defpackage.ogj
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

    @Override // defpackage.ogj
    public bw3 getChronology() {
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

    @Override // defpackage.i10
    public gq5 getField(int i, bw3 bw3Var) {
        if (i == 0) {
            return bw3Var.year();
        }
        if (i == 1) {
            return bw3Var.monthOfYear();
        }
        if (i == 2) {
            return bw3Var.dayOfMonth();
        }
        if (i == 3) {
            return bw3Var.millisOfDay();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    @Override // defpackage.v82
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

    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    @Override // defpackage.ogj
    public int getValue(int i) {
        if (i == 0) {
            return getChronology().year().get(getLocalMillis());
        }
        if (i == 1) {
            return getChronology().monthOfYear().get(getLocalMillis());
        }
        if (i == 2) {
            return getChronology().dayOfMonth().get(getLocalMillis());
        }
        if (i == 3) {
            return getChronology().millisOfDay().get(getLocalMillis());
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
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

    @Override // defpackage.i10
    public int hashCode() {
        return ((((((((((((((h.l + this.iChronology.year().get(this.iLocalMillis)) * 23) + this.iChronology.year().getType().hashCode()) * 23) + this.iChronology.monthOfYear().get(this.iLocalMillis)) * 23) + this.iChronology.monthOfYear().getType().hashCode()) * 23) + this.iChronology.dayOfMonth().get(this.iLocalMillis)) * 23) + this.iChronology.dayOfMonth().getType().hashCode()) * 23) + this.iChronology.millisOfDay().get(this.iLocalMillis)) * 23) + this.iChronology.millisOfDay().getType().hashCode() + getChronology().hashCode();
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    @Override // defpackage.i10, defpackage.ogj
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.getField(getChronology()).isSupported();
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalDateTime minus(hgj hgjVar) {
        return withDurationAdded(hgjVar, -1);
    }

    public LocalDateTime minusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
    }

    public LocalDateTime minusHours(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i));
    }

    public LocalDateTime minusMillis(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i));
    }

    public LocalDateTime minusMinutes(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i));
    }

    public LocalDateTime minusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
    }

    public LocalDateTime minusSeconds(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i));
    }

    public LocalDateTime minusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
    }

    public LocalDateTime minusYears(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDateTime plus(hgj hgjVar) {
        return withDurationAdded(hgjVar, 1);
    }

    public LocalDateTime plusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().add(getLocalMillis(), i));
    }

    public LocalDateTime plusHours(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().hours().add(getLocalMillis(), i));
    }

    public LocalDateTime plusMillis(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().millis().add(getLocalMillis(), i));
    }

    public LocalDateTime plusMinutes(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().minutes().add(getLocalMillis(), i));
    }

    public LocalDateTime plusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().add(getLocalMillis(), i));
    }

    public LocalDateTime plusSeconds(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().seconds().add(getLocalMillis(), i));
    }

    public LocalDateTime plusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
    }

    public LocalDateTime plusYears(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().years().add(getLocalMillis(), i));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // defpackage.ogj
    public int size() {
        return 4;
    }

    public Date toDate() {
        Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        date.setTime(date.getTime() + ((long) getMillisOfSecond()));
        return correctDstTransition(date, TimeZone.getDefault());
    }

    public DateTime toDateTime() {
        return toDateTime((DateTimeZone) null);
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getLocalMillis(), getChronology());
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getLocalMillis(), getChronology());
    }

    @ToString
    public String toString() {
        return sxc.h().l(this);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public LocalDateTime withCenturyOfEra(int i) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
    }

    public LocalDateTime withDate(int i, int i2, int i3) {
        bw3 chronology = getChronology();
        return withLocalMillis(chronology.dayOfMonth().set(chronology.monthOfYear().set(chronology.year().set(getLocalMillis(), i), i2), i3));
    }

    public LocalDateTime withDayOfMonth(int i) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
    }

    public LocalDateTime withDayOfWeek(int i) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
    }

    public LocalDateTime withDayOfYear(int i) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
    }

    public LocalDateTime withDurationAdded(hgj hgjVar, int i) {
        return (hgjVar == null || i == 0) ? this : withLocalMillis(getChronology().add(getLocalMillis(), hgjVar.getMillis(), i));
    }

    public LocalDateTime withEra(int i) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
    }

    public LocalDateTime withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public LocalDateTime withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            return i == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public LocalDateTime withFields(ogj ogjVar) {
        return ogjVar == null ? this : withLocalMillis(getChronology().set(ogjVar, getLocalMillis()));
    }

    public LocalDateTime withHourOfDay(int i) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
    }

    public LocalDateTime withLocalMillis(long j) {
        return j == getLocalMillis() ? this : new LocalDateTime(j, getChronology());
    }

    public LocalDateTime withMillisOfDay(int i) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
    }

    public LocalDateTime withMillisOfSecond(int i) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
    }

    public LocalDateTime withMinuteOfHour(int i) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
    }

    public LocalDateTime withMonthOfYear(int i) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
    }

    public LocalDateTime withPeriodAdded(qgj qgjVar, int i) {
        return (qgjVar == null || i == 0) ? this : withLocalMillis(getChronology().add(qgjVar, getLocalMillis(), i));
    }

    public LocalDateTime withSecondOfMinute(int i) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
    }

    public LocalDateTime withTime(int i, int i2, int i3, int i4) {
        bw3 chronology = getChronology();
        return withLocalMillis(chronology.millisOfSecond().set(chronology.secondOfMinute().set(chronology.minuteOfHour().set(chronology.hourOfDay().set(getLocalMillis(), i), i2), i3), i4));
    }

    public LocalDateTime withWeekOfWeekyear(int i) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
    }

    public LocalDateTime withWeekyear(int i) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
    }

    public LocalDateTime withYear(int i) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
    }

    public LocalDateTime withYearOfCentury(int i) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
    }

    public LocalDateTime withYearOfEra(int i) {
        return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i));
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

    public static LocalDateTime parse(String str, jq5 jq5Var) {
        return jq5Var.h(str);
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        return durationFieldType.getField(getChronology()).isSupported();
    }

    public DateTime toDateTime(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), this.iChronology.withZone(wq5.m(dateTimeZone)));
    }

    public String toString(String str) {
        return str == null ? toString() : hq5.b(str).l(this);
    }

    public LocalDateTime minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public LocalDateTime plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public static LocalDateTime now() {
        return new LocalDateTime();
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).v(locale).l(this);
    }

    public static LocalDateTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public Date toDate(TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(getYear(), getMonthOfYear() - 1, getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        Date time = calendar.getTime();
        time.setTime(time.getTime() + ((long) getMillisOfSecond()));
        return correctDstTransition(time, timeZone);
    }

    public LocalDateTime() {
        this(wq5.b(), ISOChronology.getInstance());
    }

    public LocalDateTime(DateTimeZone dateTimeZone) {
        this(wq5.b(), ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDateTime(bw3 bw3Var) {
        this(wq5.b(), bw3Var);
    }

    public LocalDateTime(long j) {
        this(j, ISOChronology.getInstance());
    }

    public LocalDateTime(long j, DateTimeZone dateTimeZone) {
        this(j, ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDateTime(long j, bw3 bw3Var) {
        bw3 bw3VarC = wq5.c(bw3Var);
        this.iLocalMillis = bw3VarC.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        this.iChronology = bw3VarC.withUTC();
    }

    public LocalDateTime(Object obj) {
        this(obj, (bw3) null);
    }

    public LocalDateTime(Object obj, DateTimeZone dateTimeZone) {
        flh flhVarE = fk4.b().e(obj);
        bw3 bw3VarC = wq5.c(flhVarE.a(obj, dateTimeZone));
        bw3 bw3VarWithUTC = bw3VarC.withUTC();
        this.iChronology = bw3VarWithUTC;
        int[] iArrK = flhVarE.k(this, obj, bw3VarC, sxc.l());
        this.iLocalMillis = bw3VarWithUTC.getDateTimeMillis(iArrK[0], iArrK[1], iArrK[2], iArrK[3]);
    }

    public LocalDateTime(Object obj, bw3 bw3Var) {
        flh flhVarE = fk4.b().e(obj);
        bw3 bw3VarC = wq5.c(flhVarE.b(obj, bw3Var));
        bw3 bw3VarWithUTC = bw3VarC.withUTC();
        this.iChronology = bw3VarWithUTC;
        int[] iArrK = flhVarE.k(this, obj, bw3VarC, sxc.l());
        this.iLocalMillis = bw3VarWithUTC.getDateTimeMillis(iArrK[0], iArrK[1], iArrK[2], iArrK[3]);
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6) {
        this(i, i2, i3, i4, i5, i6, 0, ISOChronology.getInstanceUTC());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, ISOChronology.getInstanceUTC());
    }
}
