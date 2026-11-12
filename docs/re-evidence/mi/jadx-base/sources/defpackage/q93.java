package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/* JADX INFO: loaded from: classes3.dex */
public final class q93 extends i00 implements acd, flh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q93 f31245a = new q93();

    @Override // defpackage.i00, defpackage.acd, defpackage.flh
    public bw3 a(Object obj, DateTimeZone dateTimeZone) {
        if (obj.getClass().getName().endsWith(".BuddhistCalendar")) {
            return BuddhistChronology.getInstance(dateTimeZone);
        }
        if (!(obj instanceof GregorianCalendar)) {
            return ISOChronology.getInstance(dateTimeZone);
        }
        long time = ((GregorianCalendar) obj).getGregorianChange().getTime();
        if (time == Long.MIN_VALUE) {
            return GregorianChronology.getInstance(dateTimeZone);
        }
        return time == Long.MAX_VALUE ? JulianChronology.getInstance(dateTimeZone) : GJChronology.getInstance(dateTimeZone, time, 4);
    }

    @Override // defpackage.i00, defpackage.acd, defpackage.flh
    public bw3 b(Object obj, bw3 bw3Var) {
        DateTimeZone dateTimeZoneForTimeZone;
        if (bw3Var != null) {
            return bw3Var;
        }
        Calendar calendar = (Calendar) obj;
        try {
            dateTimeZoneForTimeZone = DateTimeZone.forTimeZone(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            dateTimeZoneForTimeZone = DateTimeZone.getDefault();
        }
        return a(calendar, dateTimeZoneForTimeZone);
    }

    @Override // defpackage.ck4
    public Class<?> e() {
        return Calendar.class;
    }

    @Override // defpackage.i00, defpackage.acd
    public long i(Object obj, bw3 bw3Var) {
        return ((Calendar) obj).getTime().getTime();
    }
}
