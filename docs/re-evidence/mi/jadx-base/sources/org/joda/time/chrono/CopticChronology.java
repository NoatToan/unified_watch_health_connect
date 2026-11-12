package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.gq5;
import defpackage.jg2;
import defpackage.ng2;
import defpackage.ug2;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.field.SkipDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
public final class CopticChronology extends jg2 {
    public static final int AM = 1;
    private static final int MAX_YEAR = 292272708;
    private static final int MIN_YEAR = -292269337;
    private static final long serialVersionUID = -5972804258688333942L;
    private static final gq5 ERA_FIELD = new ug2("AM");
    private static final ConcurrentHashMap<DateTimeZone, CopticChronology[]> cCache = new ConcurrentHashMap<>();
    private static final CopticChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public CopticChronology(bw3 bw3Var, Object obj, int i) {
        super(bw3Var, obj, i);
    }

    public static CopticChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static CopticChronology getInstanceUTC() {
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
            aVar.I = ERA_FIELD;
            ng2 ng2Var = new ng2(this, 13);
            aVar.D = ng2Var;
            aVar.i = ng2Var.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.a
    public long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i - 1687;
        if (i3 <= 0) {
            i2 = (i - 1684) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !isLeapYear(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) + 21859200000L;
    }

    @Override // org.joda.time.chrono.a
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.joda.time.chrono.a
    public long getApproxMillisAtEpochDividedByTwo() {
        return 26607895200000L;
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
    public boolean isLeapDay(long j) {
        return dayOfMonth().get(j) == 6 && monthOfYear().isLeap(j);
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

    public static CopticChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    @Override // org.joda.time.chrono.a, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return super.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
    }

    public static CopticChronology getInstance(DateTimeZone dateTimeZone, int i) {
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
        int i2 = i - 1;
        try {
            CopticChronology copticChronology2 = copticChronologyArr[i2];
            if (copticChronology2 == null) {
                synchronized (copticChronologyArr) {
                    try {
                        copticChronology2 = copticChronologyArr[i2];
                        if (copticChronology2 == null) {
                            DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                            if (dateTimeZone == dateTimeZone2) {
                                CopticChronology copticChronology3 = new CopticChronology(null, null, i);
                                copticChronology = new CopticChronology(LimitChronology.getInstance(copticChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, copticChronology3), null), null, i);
                            } else {
                                copticChronology = new CopticChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i), dateTimeZone), null, i);
                            }
                            copticChronologyArr[i2] = copticChronology;
                            copticChronology2 = copticChronology;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return copticChronology2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Invalid min days in first week: " + i);
        }
    }
}
