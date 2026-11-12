package org.joda.time.chrono;

import am.j;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class BasicChronology extends AssembledChronology {
    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DurationField cDaysField;
    private static final DateTimeField cHalfdayOfDayField;
    private static final DurationField cHalfdaysField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DurationField cHoursField;
    private static final DurationField cMillisField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DurationField cMinutesField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DurationField cSecondsField;
    private static final DurationField cWeeksField;
    private static final long serialVersionUID = 8283225332206808863L;
    private final int iMinDaysInFirstWeek;
    private final transient YearInfo[] iYearInfoCache;

    public static class HalfdayField extends PreciseDateTimeField {
        private static final long serialVersionUID = 581601443656929254L;

        public HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i14, Locale locale) {
            return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i14);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j8, String str, Locale locale) {
            return set(j8, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(str));
        }
    }

    public static class YearInfo {
        public final long iFirstDayMillis;
        public final int iYear;

        public YearInfo(int i14, long j8) {
            this.iYear = i14;
            this.iFirstDayMillis = j8;
        }
    }

    static {
        DurationField durationField = MillisDurationField.INSTANCE;
        cMillisField = durationField;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.seconds(), 1000L);
        cSecondsField = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.minutes(), 60000L);
        cMinutesField = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.hours(), 3600000L);
        cHoursField = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.halfdays(), 43200000L);
        cHalfdaysField = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.days(), 86400000L);
        cDaysField = preciseDurationField5;
        cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), CoreConstants.MILLIS_IN_ONE_WEEK);
        cMillisOfSecondField = new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), durationField, preciseDurationField);
        cMillisOfDayField = new PreciseDateTimeField(DateTimeFieldType.millisOfDay(), durationField, preciseDurationField5);
        cSecondOfMinuteField = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), preciseDurationField, preciseDurationField2);
        cSecondOfDayField = new PreciseDateTimeField(DateTimeFieldType.secondOfDay(), preciseDurationField, preciseDurationField5);
        cMinuteOfHourField = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), preciseDurationField2, preciseDurationField3);
        cMinuteOfDayField = new PreciseDateTimeField(DateTimeFieldType.minuteOfDay(), preciseDurationField2, preciseDurationField5);
        PreciseDateTimeField preciseDateTimeField = new PreciseDateTimeField(DateTimeFieldType.hourOfDay(), preciseDurationField3, preciseDurationField5);
        cHourOfDayField = preciseDateTimeField;
        PreciseDateTimeField preciseDateTimeField2 = new PreciseDateTimeField(DateTimeFieldType.hourOfHalfday(), preciseDurationField3, preciseDurationField4);
        cHourOfHalfdayField = preciseDateTimeField2;
        cClockhourOfDayField = new ZeroIsMaxDateTimeField(preciseDateTimeField, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField(preciseDateTimeField2, DateTimeFieldType.clockhourOfHalfday());
        cHalfdayOfDayField = new HalfdayField();
    }

    public BasicChronology(Chronology chronology, Object obj, int i14) {
        super(chronology, obj);
        this.iYearInfoCache = new YearInfo[1024];
        if (i14 < 1 || i14 > 7) {
            h.s(j.h(i14, "Invalid min days in first week: "));
            throw null;
        }
        this.iMinDaysInFirstWeek = i14;
    }

    private long getDateTimeMillis0(int i14, int i15, int i16, int i17) {
        long dateMidnightMillis = getDateMidnightMillis(i14, i15, i16);
        if (dateMidnightMillis == Long.MIN_VALUE) {
            dateMidnightMillis = getDateMidnightMillis(i14, i15, i16 + 1);
            i17 -= DateTimeConstants.MILLIS_PER_DAY;
        }
        long j8 = ((long) i17) + dateMidnightMillis;
        if (j8 < 0 && dateMidnightMillis > 0) {
            return Long.MAX_VALUE;
        }
        if (j8 <= 0 || dateMidnightMillis >= 0) {
            return j8;
        }
        return Long.MIN_VALUE;
    }

    private YearInfo getYearInfo(int i14) {
        int i15 = i14 & 1023;
        YearInfo yearInfo = this.iYearInfoCache[i15];
        if (yearInfo != null && yearInfo.iYear == i14) {
            return yearInfo;
        }
        YearInfo yearInfo2 = new YearInfo(i14, calculateFirstDayOfYearMillis(i14));
        this.iYearInfoCache[i15] = yearInfo2;
        return yearInfo2;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        fields.millis = cMillisField;
        fields.seconds = cSecondsField;
        fields.minutes = cMinutesField;
        fields.hours = cHoursField;
        fields.halfdays = cHalfdaysField;
        fields.days = cDaysField;
        fields.weeks = cWeeksField;
        fields.millisOfSecond = cMillisOfSecondField;
        fields.millisOfDay = cMillisOfDayField;
        fields.secondOfMinute = cSecondOfMinuteField;
        fields.secondOfDay = cSecondOfDayField;
        fields.minuteOfHour = cMinuteOfHourField;
        fields.minuteOfDay = cMinuteOfDayField;
        fields.hourOfDay = cHourOfDayField;
        fields.hourOfHalfday = cHourOfHalfdayField;
        fields.clockhourOfDay = cClockhourOfDayField;
        fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        fields.halfdayOfDay = cHalfdayOfDayField;
        BasicYearDateTimeField basicYearDateTimeField = new BasicYearDateTimeField(this);
        fields.year = basicYearDateTimeField;
        GJYearOfEraDateTimeField gJYearOfEraDateTimeField = new GJYearOfEraDateTimeField(basicYearDateTimeField, this);
        fields.yearOfEra = gJYearOfEraDateTimeField;
        DividedDateTimeField dividedDateTimeField = new DividedDateTimeField(new OffsetDateTimeField(gJYearOfEraDateTimeField, 99), DateTimeFieldType.centuryOfEra(), 100);
        fields.centuryOfEra = dividedDateTimeField;
        fields.centuries = dividedDateTimeField.getDurationField();
        fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
        fields.era = new GJEraDateTimeField(this);
        fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        fields.weekyear = new BasicWeekyearDateTimeField(this);
        fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        fields.years = fields.year.getDurationField();
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyears = fields.weekyear.getDurationField();
    }

    public abstract long calculateFirstDayOfYearMillis(int i14);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BasicChronology basicChronology = (BasicChronology) obj;
            if (getMinimumDaysInFirstWeek() == basicChronology.getMinimumDaysInFirstWeek() && getZone().equals(basicChronology.getZone())) {
                return true;
            }
        }
        return false;
    }

    public abstract long getApproxMillisAtEpochDividedByTwo();

    public abstract long getAverageMillisPerMonth();

    public abstract long getAverageMillisPerYear();

    public abstract long getAverageMillisPerYearDividedByTwo();

    public long getDateMidnightMillis(int i14, int i15, int i16) {
        FieldUtils.verifyValueBounds(DateTimeFieldType.year(), i14, getMinYear() - 1, getMaxYear() + 1);
        FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), i15, 1, getMaxMonth(i14));
        int daysInYearMonth = getDaysInYearMonth(i14, i15);
        if (i16 < 1 || i16 > daysInYearMonth) {
            throw new IllegalFieldValueException(DateTimeFieldType.dayOfMonth(), Integer.valueOf(i16), 1, Integer.valueOf(daysInYearMonth), k.e(i14, i15, "year: ", " month: "));
        }
        long yearMonthDayMillis = getYearMonthDayMillis(i14, i15, i16);
        if (yearMonthDayMillis < 0 && i14 == getMaxYear() + 1) {
            return Long.MAX_VALUE;
        }
        if (yearMonthDayMillis <= 0 || i14 != getMinYear() - 1) {
            return yearMonthDayMillis;
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i14, i15, i16, i17, i18, i19, i24);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), i17, 0, 23);
        FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), i18, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), i19, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), i24, 0, 999);
        return getDateTimeMillis0(i14, i15, i16, (int) ((((long) i19) * 1000) + (((long) i18) * 60000) + (((long) i17) * 3600000) + ((long) i24)));
    }

    public int getDayOfMonth(long j8, int i14, int i15) {
        return ((int) ((j8 - (getYearMillis(i14) + getTotalMillisByYearMonth(i14, i15))) / 86400000)) + 1;
    }

    public int getDayOfWeek(long j8) {
        long j14;
        if (j8 >= 0) {
            j14 = j8 / 86400000;
        } else {
            j14 = (j8 - 86399999) / 86400000;
            if (j14 < -3) {
                return ((int) ((j14 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j14 + 3) % 7)) + 1;
    }

    public int getDayOfYear(long j8, int i14) {
        return ((int) ((j8 - getYearMillis(i14)) / 86400000)) + 1;
    }

    public abstract int getDaysInMonthMax(int i14);

    public int getDaysInMonthMax(long j8) {
        int year = getYear(j8);
        return getDaysInYearMonth(year, getMonthOfYear(j8, year));
    }

    public int getDaysInMonthMaxForSet(long j8, int i14) {
        return getDaysInMonthMax(j8);
    }

    public int getDaysInYear(int i14) {
        return isLeapYear(i14) ? 366 : 365;
    }

    public int getDaysInYearMax() {
        return 366;
    }

    public abstract int getDaysInYearMonth(int i14, int i15);

    public long getFirstWeekOfYearMillis(int i14) {
        long yearMillis = getYearMillis(i14);
        int dayOfWeek = getDayOfWeek(yearMillis);
        return dayOfWeek > 8 - this.iMinDaysInFirstWeek ? (((long) (8 - dayOfWeek)) * 86400000) + yearMillis : yearMillis - (((long) (dayOfWeek - 1)) * 86400000);
    }

    public int getMaxMonth(int i14) {
        return getMaxMonth();
    }

    public abstract int getMaxYear();

    public int getMillisOfDay(long j8) {
        return j8 >= 0 ? (int) (j8 % 86400000) : ((int) ((j8 + 1) % 86400000)) + 86399999;
    }

    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    public int getMonthOfYear(long j8) {
        return getMonthOfYear(j8, getYear(j8));
    }

    public abstract int getMonthOfYear(long j8, int i14);

    public abstract long getTotalMillisByYearMonth(int i14, int i15);

    public int getWeekOfWeekyear(long j8, int i14) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i14);
        if (j8 < firstWeekOfYearMillis) {
            return getWeeksInYear(i14 - 1);
        }
        if (j8 >= getFirstWeekOfYearMillis(i14 + 1)) {
            return 1;
        }
        return ((int) ((j8 - firstWeekOfYearMillis) / CoreConstants.MILLIS_IN_ONE_WEEK)) + 1;
    }

    public int getWeeksInYear(int i14) {
        return (int) ((getFirstWeekOfYearMillis(i14 + 1) - getFirstWeekOfYearMillis(i14)) / CoreConstants.MILLIS_IN_ONE_WEEK);
    }

    public int getWeekyear(long j8) {
        int year = getYear(j8);
        int weekOfWeekyear = getWeekOfWeekyear(j8, year);
        if (weekOfWeekyear == 1) {
            return getYear(j8 + CoreConstants.MILLIS_IN_ONE_WEEK);
        }
        return weekOfWeekyear > 51 ? getYear(j8 - 1209600000) : year;
    }

    public int getYear(long j8) {
        long averageMillisPerYearDividedByTwo = getAverageMillisPerYearDividedByTwo();
        long approxMillisAtEpochDividedByTwo = (j8 >> 1) + getApproxMillisAtEpochDividedByTwo();
        if (approxMillisAtEpochDividedByTwo < 0) {
            approxMillisAtEpochDividedByTwo = (approxMillisAtEpochDividedByTwo - averageMillisPerYearDividedByTwo) + 1;
        }
        int i14 = (int) (approxMillisAtEpochDividedByTwo / averageMillisPerYearDividedByTwo);
        long yearMillis = getYearMillis(i14);
        long j14 = j8 - yearMillis;
        if (j14 < 0) {
            return i14 - 1;
        }
        if (j14 >= 31536000000L) {
            return yearMillis + (isLeapYear(i14) ? 31622400000L : 31536000000L) <= j8 ? i14 + 1 : i14;
        }
        return i14;
    }

    public abstract long getYearDifference(long j8, long j14);

    public long getYearMillis(int i14) {
        return getYearInfo(i14).iFirstDayMillis;
    }

    public long getYearMonthDayMillis(int i14, int i15, int i16) {
        return (((long) (i16 - 1)) * 86400000) + getYearMillis(i14) + getTotalMillisByYearMonth(i14, i15);
    }

    public long getYearMonthMillis(int i14, int i15) {
        return getYearMillis(i14) + getTotalMillisByYearMonth(i14, i15);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public int hashCode() {
        return getZone().hashCode() + (getClass().getName().hashCode() * 11) + getMinimumDaysInFirstWeek();
    }

    public boolean isLeapDay(long j8) {
        return false;
    }

    public abstract boolean isLeapYear(int i14);

    public abstract long setYear(long j8, int i14);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuilder sb3 = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb3.append(name);
        sb3.append('[');
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb3.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb3.append(",mdfw=");
            sb3.append(getMinimumDaysInFirstWeek());
        }
        sb3.append(']');
        return sb3.toString();
    }

    public int getMaxMonth() {
        return 12;
    }

    public int getDayOfYear(long j8) {
        return getDayOfYear(j8, getYear(j8));
    }

    public int getDaysInMonthMax() {
        return 31;
    }

    public int getDayOfMonth(long j8, int i14) {
        return getDayOfMonth(j8, i14, getMonthOfYear(j8, i14));
    }

    public int getDayOfMonth(long j8) {
        int year = getYear(j8);
        return getDayOfMonth(j8, year, getMonthOfYear(j8, year));
    }

    public int getWeekOfWeekyear(long j8) {
        return getWeekOfWeekyear(j8, getYear(j8));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i14, int i15, int i16, int i17) {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i14, i15, i16, i17);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfDay(), i17, 0, 86399999);
        return getDateTimeMillis0(i14, i15, i16, i17);
    }
}
