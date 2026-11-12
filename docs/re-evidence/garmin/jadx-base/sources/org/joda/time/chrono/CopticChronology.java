package org.joda.time.chrono;

import am.j;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.field.SkipDateTimeField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class CopticChronology extends BasicFixedMonthChronology {
    public static final int AM = 1;
    private static final int MAX_YEAR = 292272708;
    private static final int MIN_YEAR = -292269337;
    private static final long serialVersionUID = -5972804258688333942L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AM");
    private static final ConcurrentHashMap<DateTimeZone, CopticChronology[]> cCache = new ConcurrentHashMap<>();
    private static final CopticChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public CopticChronology(Chronology chronology, Object obj, int i14) {
        super(chronology, obj, i14);
    }

    public static CopticChronology getInstance(DateTimeZone dateTimeZone, int i14) {
        CopticChronology copticChronology;
        CopticChronology[] copticChronologyArrPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, CopticChronology[]> concurrentHashMap = cCache;
        CopticChronology[] copticChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (copticChronologyArr == null && (copticChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (copticChronologyArr = new CopticChronology[7]))) != null) {
            copticChronologyArr = copticChronologyArrPutIfAbsent;
        }
        int i15 = i14 - 1;
        try {
            CopticChronology copticChronology2 = copticChronologyArr[i15];
            if (copticChronology2 != null) {
                return copticChronology2;
            }
            synchronized (copticChronologyArr) {
                try {
                    copticChronology = copticChronologyArr[i15];
                    if (copticChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                        if (dateTimeZone == dateTimeZone2) {
                            CopticChronology copticChronology3 = new CopticChronology(null, null, i14);
                            copticChronology = new CopticChronology(LimitChronology.getInstance(copticChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, copticChronology3), null), null, i14);
                        } else {
                            copticChronology = new CopticChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i14), dateTimeZone), null, i14);
                        }
                        copticChronologyArr[i15] = copticChronology;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return copticChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            h.s(j.h(i14, "Invalid min days in first week: "));
            return null;
        }
    }

    public static CopticChronology getInstanceUTC() {
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
            fields.era = ERA_FIELD;
            BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(this, 13);
            fields.monthOfYear = basicMonthOfYearDateTimeField;
            fields.months = basicMonthOfYearDateTimeField.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i14) {
        int i15;
        int i16 = i14 - 1687;
        if (i16 <= 0) {
            i15 = (i14 - 1684) >> 2;
        } else {
            int i17 = i16 >> 2;
            i15 = !isLeapYear(i14) ? i17 + 1 : i17;
        }
        return (((((long) i16) * 365) + ((long) i15)) * 86400000) + 21859200000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 26607895200000L;
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
    public boolean isLeapDay(long j8) {
        return dayOfMonth().get(j8) == 6 && monthOfYear().isLeap(j8);
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

    public static CopticChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static CopticChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }
}
