package org.joda.time;

import com.xiaomi.fitness.sync.SyncEngine;
import defpackage.bw3;
import defpackage.fk4;
import defpackage.fl9;
import defpackage.flh;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.jq5;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.t67;
import defpackage.v82;
import defpackage.wq5;
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
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDate extends v82 implements ogj, Serializable {
    private static final Set<DurationFieldType> DATE_DURATION_TYPES;
    private static final int DAY_OF_MONTH = 2;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -8775358157899L;
    private final bw3 iChronology;
    private transient int iHash;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -3193829732634L;
        private transient gq5 iField;
        private transient LocalDate iInstant;

        public Property(LocalDate localDate, gq5 gq5Var) {
            this.iInstant = localDate;
            this.iField = gq5Var;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalDate) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalDate addToCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.add(localDate.getLocalMillis(), i));
        }

        public LocalDate addWrapFieldToCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.addWrapField(localDate.getLocalMillis(), i));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public bw3 getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public gq5 getField() {
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

        public LocalDate setCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), i));
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

    public LocalDate() {
        this(wq5.b(), ISOChronology.getInstance());
    }

    public static LocalDate fromCalendarFields(Calendar calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("The calendar must not be null");
        }
        int i = calendar.get(0);
        int i2 = calendar.get(1);
        if (i != 1) {
            i2 = 1 - i2;
        }
        return new LocalDate(i2, calendar.get(2) + 1, calendar.get(5));
    }

    public static LocalDate fromDateFields(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (date.getTime() >= 0) {
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return fromCalendarFields(gregorianCalendar);
    }

    public static LocalDate now(bw3 bw3Var) {
        if (bw3Var != null) {
            return new LocalDate(bw3Var);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    @FromString
    public static LocalDate parse(String str) {
        return parse(str, sxc.m());
    }

    private Object readResolve() {
        bw3 bw3Var = this.iChronology;
        if (bw3Var == null) {
            return new LocalDate(this.iLocalMillis, ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(bw3Var.getZone()) ? new LocalDate(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // defpackage.i10, java.lang.Comparable
    public int compareTo(ogj ogjVar) {
        if (this == ogjVar) {
            return 0;
        }
        if (ogjVar instanceof LocalDate) {
            LocalDate localDate = (LocalDate) ogjVar;
            if (this.iChronology.equals(localDate.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localDate.iLocalMillis;
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

    @Override // defpackage.i10, defpackage.ogj
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
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
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    @Override // defpackage.v82
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
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
        int i = this.iHash;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.iHash = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.i10, defpackage.ogj
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

    public LocalDate minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public LocalDate minusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
    }

    public LocalDate minusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
    }

    public LocalDate minusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
    }

    public LocalDate minusYears(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDate plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public LocalDate plusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().add(getLocalMillis(), i));
    }

    public LocalDate plusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().add(getLocalMillis(), i));
    }

    public LocalDate plusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
    }

    public LocalDate plusYears(int i) {
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

    @Override // defpackage.ogj
    public int size() {
        return 3;
    }

    public Date toDate() {
        int dayOfMonth = getDayOfMonth();
        Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, dayOfMonth);
        LocalDate localDateFromDateFields = fromDateFields(date);
        if (!localDateFromDateFields.isBefore(this)) {
            if (!localDateFromDateFields.equals(this)) {
                return date;
            }
            Date date2 = new Date(date.getTime() - ((long) TimeZone.getDefault().getDSTSavings()));
            return date2.getDate() == dayOfMonth ? date2 : date;
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
    public DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    public DateTime toDateTime(LocalTime localTime) {
        return toDateTime(localTime, null);
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }

    public DateTime toDateTimeAtStartOfDay() {
        return toDateTimeAtStartOfDay(null);
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public LocalDateTime toLocalDateTime(LocalTime localTime) {
        if (localTime == null) {
            throw new IllegalArgumentException("The time must not be null");
        }
        if (getChronology() == localTime.getChronology()) {
            return new LocalDateTime(getLocalMillis() + localTime.getLocalMillis(), getChronology());
        }
        throw new IllegalArgumentException("The chronology of the time does not match");
    }

    @ToString
    public String toString() {
        return sxc.c().l(this);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public LocalDate withCenturyOfEra(int i) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfMonth(int i) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfWeek(int i) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfYear(int i) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
    }

    public LocalDate withEra(int i) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
    }

    public LocalDate withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public LocalDate withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(durationFieldType)) {
            return i == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i));
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }

    public LocalDate withFields(ogj ogjVar) {
        return ogjVar == null ? this : withLocalMillis(getChronology().set(ogjVar, getLocalMillis()));
    }

    public LocalDate withLocalMillis(long j) {
        long jRoundFloor = this.iChronology.dayOfMonth().roundFloor(j);
        return jRoundFloor == getLocalMillis() ? this : new LocalDate(jRoundFloor, getChronology());
    }

    public LocalDate withMonthOfYear(int i) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
    }

    public LocalDate withPeriodAdded(qgj qgjVar, int i) {
        if (qgjVar == null || i == 0) {
            return this;
        }
        long localMillis = getLocalMillis();
        bw3 chronology = getChronology();
        for (int i2 = 0; i2 < qgjVar.size(); i2++) {
            long jH = fl9.h(qgjVar.getValue(i2), i);
            DurationFieldType fieldType = qgjVar.getFieldType(i2);
            if (isSupported(fieldType)) {
                localMillis = fieldType.getField(chronology).add(localMillis, jH);
            }
        }
        return withLocalMillis(localMillis);
    }

    public LocalDate withWeekOfWeekyear(int i) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
    }

    public LocalDate withWeekyear(int i) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
    }

    public LocalDate withYear(int i) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
    }

    public LocalDate withYearOfCentury(int i) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
    }

    public LocalDate withYearOfEra(int i) {
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

    public LocalDate(DateTimeZone dateTimeZone) {
        this(wq5.b(), ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalDate parse(String str, jq5 jq5Var) {
        return jq5Var.g(str);
    }

    @Deprecated
    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(wq5.m(dateTimeZone)));
    }

    public DateTime toDateTime(LocalTime localTime, DateTimeZone dateTimeZone) {
        if (localTime == null) {
            return toDateTimeAtCurrentTime(dateTimeZone);
        }
        if (getChronology() != localTime.getChronology()) {
            throw new IllegalArgumentException("The chronology of the time does not match");
        }
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), localTime.getHourOfDay(), localTime.getMinuteOfHour(), localTime.getSecondOfMinute(), localTime.getMillisOfSecond(), getChronology().withZone(dateTimeZone));
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        bw3 bw3VarWithZone = getChronology().withZone(wq5.m(dateTimeZone));
        return new DateTime(bw3VarWithZone.set(this, wq5.b()), bw3VarWithZone);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(wq5.m(dateTimeZone)));
    }

    public DateTime toDateTimeAtStartOfDay(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZoneM = wq5.m(dateTimeZone);
        bw3 bw3VarWithZone = getChronology().withZone(dateTimeZoneM);
        return new DateTime(bw3VarWithZone.dayOfMonth().roundFloor(dateTimeZoneM.convertLocalToUTC(getLocalMillis() + SyncEngine.SYNC_TIME_DURATION, false)), bw3VarWithZone).withEarlierOffsetAtOverlap();
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZoneM = wq5.m(dateTimeZone);
        return new Interval(toDateTimeAtStartOfDay(dateTimeZoneM), plusDays(1).toDateTimeAtStartOfDay(dateTimeZoneM));
    }

    public String toString(String str) {
        return str == null ? toString() : hq5.b(str).l(this);
    }

    public LocalDate(bw3 bw3Var) {
        this(wq5.b(), bw3Var);
    }

    public LocalDate(long j) {
        this(j, ISOChronology.getInstance());
    }

    public static LocalDate now() {
        return new LocalDate();
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).v(locale).l(this);
    }

    public LocalDate(long j, DateTimeZone dateTimeZone) {
        this(j, ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalDate now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDate(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public LocalDate(long j, bw3 bw3Var) {
        bw3 bw3VarC = wq5.c(bw3Var);
        long millisKeepLocal = bw3VarC.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        bw3 bw3VarWithUTC = bw3VarC.withUTC();
        this.iLocalMillis = bw3VarWithUTC.dayOfMonth().roundFloor(millisKeepLocal);
        this.iChronology = bw3VarWithUTC;
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        t67 field = durationFieldType.getField(getChronology());
        if (DATE_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public LocalDate(Object obj) {
        this(obj, (bw3) null);
    }

    public LocalDate(Object obj, DateTimeZone dateTimeZone) {
        flh flhVarE = fk4.b().e(obj);
        bw3 bw3VarC = wq5.c(flhVarE.a(obj, dateTimeZone));
        bw3 bw3VarWithUTC = bw3VarC.withUTC();
        this.iChronology = bw3VarWithUTC;
        int[] iArrK = flhVarE.k(this, obj, bw3VarC, sxc.m());
        this.iLocalMillis = bw3VarWithUTC.getDateTimeMillis(iArrK[0], iArrK[1], iArrK[2], 0);
    }

    public LocalDate(Object obj, bw3 bw3Var) {
        flh flhVarE = fk4.b().e(obj);
        bw3 bw3VarC = wq5.c(flhVarE.b(obj, bw3Var));
        bw3 bw3VarWithUTC = bw3VarC.withUTC();
        this.iChronology = bw3VarWithUTC;
        int[] iArrK = flhVarE.k(this, obj, bw3VarC, sxc.m());
        this.iLocalMillis = bw3VarWithUTC.getDateTimeMillis(iArrK[0], iArrK[1], iArrK[2], 0);
    }

    public LocalDate(int i, int i2, int i3) {
        this(i, i2, i3, ISOChronology.getInstanceUTC());
    }

    public LocalDate(int i, int i2, int i3, bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        long dateTimeMillis = bw3VarWithUTC.getDateTimeMillis(i, i2, i3, 0);
        this.iChronology = bw3VarWithUTC;
        this.iLocalMillis = dateTimeMillis;
    }
}
