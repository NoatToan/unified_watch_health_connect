package org.joda.time.chrono;

import defpackage.bw3;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.SkipDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
public final class JulianChronology extends b {
    private static final int MAX_YEAR = 292272992;
    private static final long MILLIS_PER_MONTH = 2629800000L;
    private static final long MILLIS_PER_YEAR = 31557600000L;
    private static final int MIN_YEAR = -292269054;
    private static final long serialVersionUID = -8731039522547897247L;
    private static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final JulianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public JulianChronology(bw3 bw3Var, Object obj, int i) {
        super(bw3Var, obj, i);
    }

    public static int adjustYearForSet(int i) {
        if (i > 0) {
            return i;
        }
        if (i != 0) {
            return i + 1;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i), (Number) null, (Number) null);
    }

    public static JulianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static JulianChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        bw3 base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        if (minimumDaysInFirstWeek == 0) {
            minimumDaysInFirstWeek = 4;
        }
        return base == null ? getInstance(DateTimeZone.UTC, minimumDaysInFirstWeek) : getInstance(base.getZone(), minimumDaysInFirstWeek);
    }

    @Override // org.joda.time.chrono.a, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.a aVar) {
        if (getBase() == null) {
            super.assemble(aVar);
            aVar.E = new SkipDateTimeField(this, aVar.E);
            aVar.B = new SkipDateTimeField(this, aVar.B);
        }
    }

    @Override // org.joda.time.chrono.a
    public long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i - 1968;
        if (i3 <= 0) {
            i2 = (i - 1965) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !isLeapYear(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) - 62035200000L;
    }

    @Override // org.joda.time.chrono.a
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.joda.time.chrono.a
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083663600000L;
    }

    @Override // org.joda.time.chrono.a
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.a
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.a
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.a
    public long getDateMidnightMillis(int i, int i2, int i3) throws IllegalArgumentException {
        return super.getDateMidnightMillis(adjustYearForSet(i), i2, i3);
    }

    @Override // org.joda.time.chrono.a, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return super.getDateTimeMillis(i, i2, i3, i4);
    }

    @Override // org.joda.time.chrono.a
    public int getMaxYear() {
        return MAX_YEAR;
    }

    @Override // org.joda.time.chrono.a
    public int getMinYear() {
        return MIN_YEAR;
    }

    @Override // org.joda.time.chrono.a
    public /* bridge */ /* synthetic */ int getMinimumDaysInFirstWeek() {
        return super.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.a, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public /* bridge */ /* synthetic */ DateTimeZone getZone() {
        return super.getZone();
    }

    @Override // org.joda.time.chrono.a
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.joda.time.chrono.a
    public boolean isLeapYear(int i) {
        return (i & 3) == 0;
    }

    @Override // org.joda.time.chrono.a, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    @Override // org.joda.time.chrono.a, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return super.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone, int i) {
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
        int i2 = i - 1;
        try {
            JulianChronology julianChronology2 = julianChronologyArr[i2];
            if (julianChronology2 == null) {
                synchronized (julianChronologyArr) {
                    try {
                        julianChronology2 = julianChronologyArr[i2];
                        if (julianChronology2 == null) {
                            DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                            if (dateTimeZone == dateTimeZone2) {
                                julianChronology = new JulianChronology(null, null, i);
                            } else {
                                julianChronology = new JulianChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i), dateTimeZone), null, i);
                            }
                            julianChronologyArr[i2] = julianChronology;
                            julianChronology2 = julianChronology;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return julianChronology2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Invalid min days in first week: " + i);
        }
    }
}
