package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.cva;
import defpackage.dva;
import defpackage.eg2;
import defpackage.eva;
import defpackage.fg2;
import defpackage.fl9;
import defpackage.fva;
import defpackage.gq5;
import defpackage.gva;
import defpackage.j5i;
import defpackage.k07;
import defpackage.t67;
import defpackage.vg2;
import defpackage.vik;
import defpackage.w6h;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.z0s;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends AssembledChronology {
    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final gq5 cClockhourOfDayField;
    private static final gq5 cClockhourOfHalfdayField;
    private static final t67 cDaysField;
    private static final gq5 cHalfdayOfDayField;
    private static final t67 cHalfdaysField;
    private static final gq5 cHourOfDayField;
    private static final gq5 cHourOfHalfdayField;
    private static final t67 cHoursField;
    private static final t67 cMillisField;
    private static final gq5 cMillisOfDayField;
    private static final gq5 cMillisOfSecondField;
    private static final gq5 cMinuteOfDayField;
    private static final gq5 cMinuteOfHourField;
    private static final t67 cMinutesField;
    private static final gq5 cSecondOfDayField;
    private static final gq5 cSecondOfMinuteField;
    private static final t67 cSecondsField;
    private static final t67 cWeeksField;
    private static final long serialVersionUID = 8283225332206808863L;
    private final int iMinDaysInFirstWeek;
    private final transient b[] iYearInfoCache;

    /* JADX INFO: renamed from: org.joda.time.chrono.a$a, reason: collision with other inner class name */
    public static class C1066a extends j5i {
        public C1066a() {
            super(DateTimeFieldType.halfdayOfDay(), a.cHalfdaysField, a.cDaysField);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsText(int i, Locale locale) {
            return eva.h(locale).p(i);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumTextLength(Locale locale) {
            return eva.h(locale).l();
        }

        @Override // defpackage.o62, defpackage.gq5
        public long set(long j, String str, Locale locale) {
            return set(j, eva.h(locale).o(str));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f29554b;

        public b(int i, long j) {
            this.f29553a = i;
            this.f29554b = j;
        }
    }

    static {
        t67 t67Var = MillisDurationField.INSTANCE;
        cMillisField = t67Var;
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
        cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), 604800000L);
        cMillisOfSecondField = new j5i(DateTimeFieldType.millisOfSecond(), t67Var, preciseDurationField);
        cMillisOfDayField = new j5i(DateTimeFieldType.millisOfDay(), t67Var, preciseDurationField5);
        cSecondOfMinuteField = new j5i(DateTimeFieldType.secondOfMinute(), preciseDurationField, preciseDurationField2);
        cSecondOfDayField = new j5i(DateTimeFieldType.secondOfDay(), preciseDurationField, preciseDurationField5);
        cMinuteOfHourField = new j5i(DateTimeFieldType.minuteOfHour(), preciseDurationField2, preciseDurationField3);
        cMinuteOfDayField = new j5i(DateTimeFieldType.minuteOfDay(), preciseDurationField2, preciseDurationField5);
        j5i j5iVar = new j5i(DateTimeFieldType.hourOfDay(), preciseDurationField3, preciseDurationField5);
        cHourOfDayField = j5iVar;
        j5i j5iVar2 = new j5i(DateTimeFieldType.hourOfHalfday(), preciseDurationField3, preciseDurationField4);
        cHourOfHalfdayField = j5iVar2;
        cClockhourOfDayField = new z0s(j5iVar, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new z0s(j5iVar2, DateTimeFieldType.clockhourOfHalfday());
        cHalfdayOfDayField = new C1066a();
    }

    public a(bw3 bw3Var, Object obj, int i) {
        super(bw3Var, obj);
        this.iYearInfoCache = new b[1024];
        if (i >= 1 && i <= 7) {
            this.iMinDaysInFirstWeek = i;
            return;
        }
        throw new IllegalArgumentException("Invalid min days in first week: " + i);
    }

    private long getDateTimeMillis0(int i, int i2, int i3, int i4) {
        long dateMidnightMillis = getDateMidnightMillis(i, i2, i3);
        if (dateMidnightMillis == Long.MIN_VALUE) {
            dateMidnightMillis = getDateMidnightMillis(i, i2, i3 + 1);
            i4 -= 86400000;
        }
        long j = ((long) i4) + dateMidnightMillis;
        if (j < 0 && dateMidnightMillis > 0) {
            return Long.MAX_VALUE;
        }
        if (j <= 0 || dateMidnightMillis >= 0) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    private b getYearInfo(int i) {
        int i2 = i & 1023;
        b bVar = this.iYearInfoCache[i2];
        if (bVar != null && bVar.f29553a == i) {
            return bVar;
        }
        b bVar2 = new b(i, calculateFirstDayOfYearMillis(i));
        this.iYearInfoCache[i2] = bVar2;
        return bVar2;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.a aVar) {
        aVar.f29540a = cMillisField;
        aVar.f29541b = cSecondsField;
        aVar.c = cMinutesField;
        aVar.d = cHoursField;
        aVar.e = cHalfdaysField;
        aVar.f = cDaysField;
        aVar.g = cWeeksField;
        aVar.m = cMillisOfSecondField;
        aVar.n = cMillisOfDayField;
        aVar.o = cSecondOfMinuteField;
        aVar.p = cSecondOfDayField;
        aVar.q = cMinuteOfHourField;
        aVar.f29543r = cMinuteOfDayField;
        aVar.s = cHourOfDayField;
        aVar.u = cHourOfHalfdayField;
        aVar.t = cClockhourOfDayField;
        aVar.v = cClockhourOfHalfdayField;
        aVar.w = cHalfdayOfDayField;
        xg2 xg2Var = new xg2(this);
        aVar.E = xg2Var;
        gva gvaVar = new gva(xg2Var, this);
        aVar.F = gvaVar;
        k07 k07Var = new k07(new w6h(gvaVar, 99), DateTimeFieldType.centuryOfEra(), 100);
        aVar.H = k07Var;
        aVar.f29542k = k07Var.getDurationField();
        aVar.G = new w6h(new vik((k07) aVar.H), DateTimeFieldType.yearOfCentury(), 1);
        aVar.I = new dva(this);
        aVar.x = new cva(this, aVar.f);
        aVar.y = new eg2(this, aVar.f);
        aVar.z = new fg2(this, aVar.f);
        aVar.D = new fva(this);
        aVar.B = new wg2(this);
        aVar.A = new vg2(this, aVar.g);
        aVar.C = new w6h(new vik(aVar.B, aVar.f29542k, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        aVar.j = aVar.E.getDurationField();
        aVar.i = aVar.D.getDurationField();
        aVar.h = aVar.B.getDurationField();
    }

    public abstract long calculateFirstDayOfYearMillis(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return getMinimumDaysInFirstWeek() == aVar.getMinimumDaysInFirstWeek() && getZone().equals(aVar.getZone());
    }

    public abstract long getApproxMillisAtEpochDividedByTwo();

    public abstract long getAverageMillisPerMonth();

    public abstract long getAverageMillisPerYear();

    public abstract long getAverageMillisPerYearDividedByTwo();

    public long getDateMidnightMillis(int i, int i2, int i3) {
        fl9.o(DateTimeFieldType.year(), i, getMinYear() - 1, getMaxYear() + 1);
        fl9.o(DateTimeFieldType.monthOfYear(), i2, 1, getMaxMonth(i));
        int daysInYearMonth = getDaysInYearMonth(i, i2);
        if (i3 >= 1 && i3 <= daysInYearMonth) {
            long yearMonthDayMillis = getYearMonthDayMillis(i, i2, i3);
            if (yearMonthDayMillis < 0 && i == getMaxYear() + 1) {
                return Long.MAX_VALUE;
            }
            if (yearMonthDayMillis <= 0 || i != getMinYear() - 1) {
                return yearMonthDayMillis;
            }
            return Long.MIN_VALUE;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.dayOfMonth(), Integer.valueOf(i3), 1, Integer.valueOf(daysInYearMonth), "year: " + i + " month: " + i2);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        bw3 base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4);
        }
        fl9.o(DateTimeFieldType.millisOfDay(), i4, 0, 86399999);
        return getDateTimeMillis0(i, i2, i3, i4);
    }

    public int getDayOfMonth(long j) {
        int year = getYear(j);
        return getDayOfMonth(j, year, getMonthOfYear(j, year));
    }

    public int getDayOfWeek(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    public int getDayOfYear(long j) {
        return getDayOfYear(j, getYear(j));
    }

    public int getDaysInMonthMax() {
        return 31;
    }

    public abstract int getDaysInMonthMax(int i);

    public int getDaysInMonthMaxForSet(long j, int i) {
        return getDaysInMonthMax(j);
    }

    public int getDaysInYear(int i) {
        return isLeapYear(i) ? 366 : 365;
    }

    public int getDaysInYearMax() {
        return 366;
    }

    public abstract int getDaysInYearMonth(int i, int i2);

    public long getFirstWeekOfYearMillis(int i) {
        long yearMillis = getYearMillis(i);
        int dayOfWeek = getDayOfWeek(yearMillis);
        return dayOfWeek > 8 - this.iMinDaysInFirstWeek ? yearMillis + (((long) (8 - dayOfWeek)) * 86400000) : yearMillis - (((long) (dayOfWeek - 1)) * 86400000);
    }

    public int getMaxMonth() {
        return 12;
    }

    public abstract int getMaxYear();

    public int getMillisOfDay(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    public int getMonthOfYear(long j) {
        return getMonthOfYear(j, getYear(j));
    }

    public abstract int getMonthOfYear(long j, int i);

    public abstract long getTotalMillisByYearMonth(int i, int i2);

    public int getWeekOfWeekyear(long j) {
        return getWeekOfWeekyear(j, getYear(j));
    }

    public int getWeeksInYear(int i) {
        return (int) ((getFirstWeekOfYearMillis(i + 1) - getFirstWeekOfYearMillis(i)) / 604800000);
    }

    public int getWeekyear(long j) {
        int year = getYear(j);
        int weekOfWeekyear = getWeekOfWeekyear(j, year);
        if (weekOfWeekyear == 1) {
            return getYear(j + 604800000);
        }
        return weekOfWeekyear > 51 ? getYear(j - 1209600000) : year;
    }

    public int getYear(long j) {
        long averageMillisPerYearDividedByTwo = getAverageMillisPerYearDividedByTwo();
        long approxMillisAtEpochDividedByTwo = (j >> 1) + getApproxMillisAtEpochDividedByTwo();
        if (approxMillisAtEpochDividedByTwo < 0) {
            approxMillisAtEpochDividedByTwo = (approxMillisAtEpochDividedByTwo - averageMillisPerYearDividedByTwo) + 1;
        }
        int i = (int) (approxMillisAtEpochDividedByTwo / averageMillisPerYearDividedByTwo);
        long yearMillis = getYearMillis(i);
        long j2 = j - yearMillis;
        if (j2 < 0) {
            return i - 1;
        }
        if (j2 >= 31536000000L) {
            return yearMillis + (isLeapYear(i) ? 31622400000L : 31536000000L) <= j ? i + 1 : i;
        }
        return i;
    }

    public abstract long getYearDifference(long j, long j2);

    public long getYearMillis(int i) {
        return getYearInfo(i).f29554b;
    }

    public long getYearMonthDayMillis(int i, int i2, int i3) {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, i2) + (((long) (i3 - 1)) * 86400000);
    }

    public long getYearMonthMillis(int i, int i2) {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, i2);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public DateTimeZone getZone() {
        bw3 base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public int hashCode() {
        return (getClass().getName().hashCode() * 11) + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }

    public boolean isLeapDay(long j) {
        return false;
    }

    public abstract boolean isLeapYear(int i);

    public abstract long setYear(long j, int i);

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb.append(name);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb.append(",mdfw=");
            sb.append(getMinimumDaysInFirstWeek());
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public int getDayOfYear(long j, int i) {
        return ((int) ((j - getYearMillis(i)) / 86400000)) + 1;
    }

    public int getDaysInMonthMax(long j) {
        int year = getYear(j);
        return getDaysInYearMonth(year, getMonthOfYear(j, year));
    }

    public int getMaxMonth(int i) {
        return getMaxMonth();
    }

    public int getWeekOfWeekyear(long j, int i) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i);
        if (j < firstWeekOfYearMillis) {
            return getWeeksInYear(i - 1);
        }
        if (j >= getFirstWeekOfYearMillis(i + 1)) {
            return 1;
        }
        return ((int) ((j - firstWeekOfYearMillis) / 604800000)) + 1;
    }

    public int getDayOfMonth(long j, int i) {
        return getDayOfMonth(j, i, getMonthOfYear(j, i));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        bw3 base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        fl9.o(DateTimeFieldType.hourOfDay(), i4, 0, 23);
        fl9.o(DateTimeFieldType.minuteOfHour(), i5, 0, 59);
        fl9.o(DateTimeFieldType.secondOfMinute(), i6, 0, 59);
        fl9.o(DateTimeFieldType.millisOfSecond(), i7, 0, 999);
        return getDateTimeMillis0(i, i2, i3, (int) ((((long) i4) * 3600000) + (((long) i5) * 60000) + (((long) i6) * 1000) + ((long) i7)));
    }

    public int getDayOfMonth(long j, int i, int i2) {
        return ((int) ((j - (getYearMillis(i) + getTotalMillisByYearMonth(i, i2))) / 86400000)) + 1;
    }
}
