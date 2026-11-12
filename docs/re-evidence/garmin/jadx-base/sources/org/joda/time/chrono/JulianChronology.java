package org.joda.time.chrono;

import am.j;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.SkipDateTimeField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class JulianChronology extends BasicGJChronology {
    private static final int MAX_YEAR = 292272992;
    private static final long MILLIS_PER_MONTH = 2629800000L;
    private static final long MILLIS_PER_YEAR = 31557600000L;
    private static final int MIN_YEAR = -292269054;
    private static final long serialVersionUID = -8731039522547897247L;
    private static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final JulianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public JulianChronology(Chronology chronology, Object obj, int i14) {
        super(chronology, obj, i14);
    }

    public static int adjustYearForSet(int i14) {
        if (i14 > 0) {
            return i14;
        }
        if (i14 != 0) {
            return i14 + 1;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i14), (Number) null, (Number) null);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone, int i14) {
        JulianChronology julianChronology;
        JulianChronology[] julianChronologyArrPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, JulianChronology[]> concurrentHashMap = cCache;
        JulianChronology[] julianChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (julianChronologyArr == null && (julianChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (julianChronologyArr = new JulianChronology[7]))) != null) {
            julianChronologyArr = julianChronologyArrPutIfAbsent;
        }
        int i15 = i14 - 1;
        try {
            JulianChronology julianChronology2 = julianChronologyArr[i15];
            if (julianChronology2 != null) {
                return julianChronology2;
            }
            synchronized (julianChronologyArr) {
                try {
                    julianChronology = julianChronologyArr[i15];
                    if (julianChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                        julianChronology = dateTimeZone == dateTimeZone2 ? new JulianChronology(null, null, i14) : new JulianChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i14), dateTimeZone), null, i14);
                        julianChronologyArr[i15] = julianChronology;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return julianChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            h.s(j.h(i14, "Invalid min days in first week: "));
            return null;
        }
    }

    public static JulianChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        if (minimumDaysInFirstWeek == 0) {
            minimumDaysInFirstWeek = 4;
        }
        return base == null ? getInstance(DateTimeZone.UTC, minimumDaysInFirstWeek) : getInstance(base.getZone(), minimumDaysInFirstWeek);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i14) {
        int i15;
        int i16 = i14 - 1968;
        if (i16 <= 0) {
            i15 = (i14 - 1965) >> 2;
        } else {
            int i17 = i16 >> 2;
            i15 = !isLeapYear(i14) ? i17 + 1 : i17;
        }
        return (((((long) i16) * 365) + ((long) i15)) * 86400000) - 62035200000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083663600000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getDateMidnightMillis(int i14, int i15, int i16) {
        return super.getDateMidnightMillis(adjustYearForSet(i14), i15, i16);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i14, int i15, int i16, int i17) {
        return super.getDateTimeMillis(i14, i15, i16, i17);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxYear() {
        return MAX_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMinYear() {
        return MIN_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ int getMinimumDaysInFirstWeek() {
        return super.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ DateTimeZone getZone() {
        return super.getZone();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapYear(int i14) {
        return (i14 & 3) == 0;
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        return super.getDateTimeMillis(i14, i15, i16, i17, i18, i19, i24);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static JulianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }
}
