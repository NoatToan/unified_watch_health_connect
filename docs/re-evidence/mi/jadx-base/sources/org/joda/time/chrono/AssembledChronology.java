package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.gq5;
import defpackage.t67;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AssembledChronology extends BaseChronology {
    private static final long serialVersionUID = -6728465968995518215L;
    private final bw3 iBase;
    private transient int iBaseFlags;
    private transient t67 iCenturies;
    private transient gq5 iCenturyOfEra;
    private transient gq5 iClockhourOfDay;
    private transient gq5 iClockhourOfHalfday;
    private transient gq5 iDayOfMonth;
    private transient gq5 iDayOfWeek;
    private transient gq5 iDayOfYear;
    private transient t67 iDays;
    private transient gq5 iEra;
    private transient t67 iEras;
    private transient gq5 iHalfdayOfDay;
    private transient t67 iHalfdays;
    private transient gq5 iHourOfDay;
    private transient gq5 iHourOfHalfday;
    private transient t67 iHours;
    private transient t67 iMillis;
    private transient gq5 iMillisOfDay;
    private transient gq5 iMillisOfSecond;
    private transient gq5 iMinuteOfDay;
    private transient gq5 iMinuteOfHour;
    private transient t67 iMinutes;
    private transient gq5 iMonthOfYear;
    private transient t67 iMonths;
    private final Object iParam;
    private transient gq5 iSecondOfDay;
    private transient gq5 iSecondOfMinute;
    private transient t67 iSeconds;
    private transient gq5 iWeekOfWeekyear;
    private transient t67 iWeeks;
    private transient gq5 iWeekyear;
    private transient gq5 iWeekyearOfCentury;
    private transient t67 iWeekyears;
    private transient gq5 iYear;
    private transient gq5 iYearOfCentury;
    private transient gq5 iYearOfEra;
    private transient t67 iYears;

    public static final class a {
        public gq5 A;
        public gq5 B;
        public gq5 C;
        public gq5 D;
        public gq5 E;
        public gq5 F;
        public gq5 G;
        public gq5 H;
        public gq5 I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t67 f29540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t67 f29541b;
        public t67 c;
        public t67 d;
        public t67 e;
        public t67 f;
        public t67 g;
        public t67 h;
        public t67 i;
        public t67 j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public t67 f29542k;
        public t67 l;
        public gq5 m;
        public gq5 n;
        public gq5 o;
        public gq5 p;
        public gq5 q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public gq5 f29543r;
        public gq5 s;
        public gq5 t;
        public gq5 u;
        public gq5 v;
        public gq5 w;
        public gq5 x;
        public gq5 y;
        public gq5 z;

        public static boolean b(gq5 gq5Var) {
            if (gq5Var == null) {
                return false;
            }
            return gq5Var.isSupported();
        }

        public static boolean c(t67 t67Var) {
            if (t67Var == null) {
                return false;
            }
            return t67Var.isSupported();
        }

        public void a(bw3 bw3Var) {
            t67 t67VarMillis = bw3Var.millis();
            if (c(t67VarMillis)) {
                this.f29540a = t67VarMillis;
            }
            t67 t67VarSeconds = bw3Var.seconds();
            if (c(t67VarSeconds)) {
                this.f29541b = t67VarSeconds;
            }
            t67 t67VarMinutes = bw3Var.minutes();
            if (c(t67VarMinutes)) {
                this.c = t67VarMinutes;
            }
            t67 t67VarHours = bw3Var.hours();
            if (c(t67VarHours)) {
                this.d = t67VarHours;
            }
            t67 t67VarHalfdays = bw3Var.halfdays();
            if (c(t67VarHalfdays)) {
                this.e = t67VarHalfdays;
            }
            t67 t67VarDays = bw3Var.days();
            if (c(t67VarDays)) {
                this.f = t67VarDays;
            }
            t67 t67VarWeeks = bw3Var.weeks();
            if (c(t67VarWeeks)) {
                this.g = t67VarWeeks;
            }
            t67 t67VarWeekyears = bw3Var.weekyears();
            if (c(t67VarWeekyears)) {
                this.h = t67VarWeekyears;
            }
            t67 t67VarMonths = bw3Var.months();
            if (c(t67VarMonths)) {
                this.i = t67VarMonths;
            }
            t67 t67VarYears = bw3Var.years();
            if (c(t67VarYears)) {
                this.j = t67VarYears;
            }
            t67 t67VarCenturies = bw3Var.centuries();
            if (c(t67VarCenturies)) {
                this.f29542k = t67VarCenturies;
            }
            t67 t67VarEras = bw3Var.eras();
            if (c(t67VarEras)) {
                this.l = t67VarEras;
            }
            gq5 gq5VarMillisOfSecond = bw3Var.millisOfSecond();
            if (b(gq5VarMillisOfSecond)) {
                this.m = gq5VarMillisOfSecond;
            }
            gq5 gq5VarMillisOfDay = bw3Var.millisOfDay();
            if (b(gq5VarMillisOfDay)) {
                this.n = gq5VarMillisOfDay;
            }
            gq5 gq5VarSecondOfMinute = bw3Var.secondOfMinute();
            if (b(gq5VarSecondOfMinute)) {
                this.o = gq5VarSecondOfMinute;
            }
            gq5 gq5VarSecondOfDay = bw3Var.secondOfDay();
            if (b(gq5VarSecondOfDay)) {
                this.p = gq5VarSecondOfDay;
            }
            gq5 gq5VarMinuteOfHour = bw3Var.minuteOfHour();
            if (b(gq5VarMinuteOfHour)) {
                this.q = gq5VarMinuteOfHour;
            }
            gq5 gq5VarMinuteOfDay = bw3Var.minuteOfDay();
            if (b(gq5VarMinuteOfDay)) {
                this.f29543r = gq5VarMinuteOfDay;
            }
            gq5 gq5VarHourOfDay = bw3Var.hourOfDay();
            if (b(gq5VarHourOfDay)) {
                this.s = gq5VarHourOfDay;
            }
            gq5 gq5VarClockhourOfDay = bw3Var.clockhourOfDay();
            if (b(gq5VarClockhourOfDay)) {
                this.t = gq5VarClockhourOfDay;
            }
            gq5 gq5VarHourOfHalfday = bw3Var.hourOfHalfday();
            if (b(gq5VarHourOfHalfday)) {
                this.u = gq5VarHourOfHalfday;
            }
            gq5 gq5VarClockhourOfHalfday = bw3Var.clockhourOfHalfday();
            if (b(gq5VarClockhourOfHalfday)) {
                this.v = gq5VarClockhourOfHalfday;
            }
            gq5 gq5VarHalfdayOfDay = bw3Var.halfdayOfDay();
            if (b(gq5VarHalfdayOfDay)) {
                this.w = gq5VarHalfdayOfDay;
            }
            gq5 gq5VarDayOfWeek = bw3Var.dayOfWeek();
            if (b(gq5VarDayOfWeek)) {
                this.x = gq5VarDayOfWeek;
            }
            gq5 gq5VarDayOfMonth = bw3Var.dayOfMonth();
            if (b(gq5VarDayOfMonth)) {
                this.y = gq5VarDayOfMonth;
            }
            gq5 gq5VarDayOfYear = bw3Var.dayOfYear();
            if (b(gq5VarDayOfYear)) {
                this.z = gq5VarDayOfYear;
            }
            gq5 gq5VarWeekOfWeekyear = bw3Var.weekOfWeekyear();
            if (b(gq5VarWeekOfWeekyear)) {
                this.A = gq5VarWeekOfWeekyear;
            }
            gq5 gq5VarWeekyear = bw3Var.weekyear();
            if (b(gq5VarWeekyear)) {
                this.B = gq5VarWeekyear;
            }
            gq5 gq5VarWeekyearOfCentury = bw3Var.weekyearOfCentury();
            if (b(gq5VarWeekyearOfCentury)) {
                this.C = gq5VarWeekyearOfCentury;
            }
            gq5 gq5VarMonthOfYear = bw3Var.monthOfYear();
            if (b(gq5VarMonthOfYear)) {
                this.D = gq5VarMonthOfYear;
            }
            gq5 gq5VarYear = bw3Var.year();
            if (b(gq5VarYear)) {
                this.E = gq5VarYear;
            }
            gq5 gq5VarYearOfEra = bw3Var.yearOfEra();
            if (b(gq5VarYearOfEra)) {
                this.F = gq5VarYearOfEra;
            }
            gq5 gq5VarYearOfCentury = bw3Var.yearOfCentury();
            if (b(gq5VarYearOfCentury)) {
                this.G = gq5VarYearOfCentury;
            }
            gq5 gq5VarCenturyOfEra = bw3Var.centuryOfEra();
            if (b(gq5VarCenturyOfEra)) {
                this.H = gq5VarCenturyOfEra;
            }
            gq5 gq5VarEra = bw3Var.era();
            if (b(gq5VarEra)) {
                this.I = gq5VarEra;
            }
        }
    }

    public AssembledChronology(bw3 bw3Var, Object obj) {
        this.iBase = bw3Var;
        this.iParam = obj;
        setFields();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        setFields();
    }

    private void setFields() {
        a aVar = new a();
        bw3 bw3Var = this.iBase;
        if (bw3Var != null) {
            aVar.a(bw3Var);
        }
        assemble(aVar);
        t67 t67VarMillis = aVar.f29540a;
        if (t67VarMillis == null) {
            t67VarMillis = super.millis();
        }
        this.iMillis = t67VarMillis;
        t67 t67VarSeconds = aVar.f29541b;
        if (t67VarSeconds == null) {
            t67VarSeconds = super.seconds();
        }
        this.iSeconds = t67VarSeconds;
        t67 t67VarMinutes = aVar.c;
        if (t67VarMinutes == null) {
            t67VarMinutes = super.minutes();
        }
        this.iMinutes = t67VarMinutes;
        t67 t67VarHours = aVar.d;
        if (t67VarHours == null) {
            t67VarHours = super.hours();
        }
        this.iHours = t67VarHours;
        t67 t67VarHalfdays = aVar.e;
        if (t67VarHalfdays == null) {
            t67VarHalfdays = super.halfdays();
        }
        this.iHalfdays = t67VarHalfdays;
        t67 t67VarDays = aVar.f;
        if (t67VarDays == null) {
            t67VarDays = super.days();
        }
        this.iDays = t67VarDays;
        t67 t67VarWeeks = aVar.g;
        if (t67VarWeeks == null) {
            t67VarWeeks = super.weeks();
        }
        this.iWeeks = t67VarWeeks;
        t67 t67VarWeekyears = aVar.h;
        if (t67VarWeekyears == null) {
            t67VarWeekyears = super.weekyears();
        }
        this.iWeekyears = t67VarWeekyears;
        t67 t67VarMonths = aVar.i;
        if (t67VarMonths == null) {
            t67VarMonths = super.months();
        }
        this.iMonths = t67VarMonths;
        t67 t67VarYears = aVar.j;
        if (t67VarYears == null) {
            t67VarYears = super.years();
        }
        this.iYears = t67VarYears;
        t67 t67VarCenturies = aVar.f29542k;
        if (t67VarCenturies == null) {
            t67VarCenturies = super.centuries();
        }
        this.iCenturies = t67VarCenturies;
        t67 t67VarEras = aVar.l;
        if (t67VarEras == null) {
            t67VarEras = super.eras();
        }
        this.iEras = t67VarEras;
        gq5 gq5VarMillisOfSecond = aVar.m;
        if (gq5VarMillisOfSecond == null) {
            gq5VarMillisOfSecond = super.millisOfSecond();
        }
        this.iMillisOfSecond = gq5VarMillisOfSecond;
        gq5 gq5VarMillisOfDay = aVar.n;
        if (gq5VarMillisOfDay == null) {
            gq5VarMillisOfDay = super.millisOfDay();
        }
        this.iMillisOfDay = gq5VarMillisOfDay;
        gq5 gq5VarSecondOfMinute = aVar.o;
        if (gq5VarSecondOfMinute == null) {
            gq5VarSecondOfMinute = super.secondOfMinute();
        }
        this.iSecondOfMinute = gq5VarSecondOfMinute;
        gq5 gq5VarSecondOfDay = aVar.p;
        if (gq5VarSecondOfDay == null) {
            gq5VarSecondOfDay = super.secondOfDay();
        }
        this.iSecondOfDay = gq5VarSecondOfDay;
        gq5 gq5VarMinuteOfHour = aVar.q;
        if (gq5VarMinuteOfHour == null) {
            gq5VarMinuteOfHour = super.minuteOfHour();
        }
        this.iMinuteOfHour = gq5VarMinuteOfHour;
        gq5 gq5VarMinuteOfDay = aVar.f29543r;
        if (gq5VarMinuteOfDay == null) {
            gq5VarMinuteOfDay = super.minuteOfDay();
        }
        this.iMinuteOfDay = gq5VarMinuteOfDay;
        gq5 gq5VarHourOfDay = aVar.s;
        if (gq5VarHourOfDay == null) {
            gq5VarHourOfDay = super.hourOfDay();
        }
        this.iHourOfDay = gq5VarHourOfDay;
        gq5 gq5VarClockhourOfDay = aVar.t;
        if (gq5VarClockhourOfDay == null) {
            gq5VarClockhourOfDay = super.clockhourOfDay();
        }
        this.iClockhourOfDay = gq5VarClockhourOfDay;
        gq5 gq5VarHourOfHalfday = aVar.u;
        if (gq5VarHourOfHalfday == null) {
            gq5VarHourOfHalfday = super.hourOfHalfday();
        }
        this.iHourOfHalfday = gq5VarHourOfHalfday;
        gq5 gq5VarClockhourOfHalfday = aVar.v;
        if (gq5VarClockhourOfHalfday == null) {
            gq5VarClockhourOfHalfday = super.clockhourOfHalfday();
        }
        this.iClockhourOfHalfday = gq5VarClockhourOfHalfday;
        gq5 gq5VarHalfdayOfDay = aVar.w;
        if (gq5VarHalfdayOfDay == null) {
            gq5VarHalfdayOfDay = super.halfdayOfDay();
        }
        this.iHalfdayOfDay = gq5VarHalfdayOfDay;
        gq5 gq5VarDayOfWeek = aVar.x;
        if (gq5VarDayOfWeek == null) {
            gq5VarDayOfWeek = super.dayOfWeek();
        }
        this.iDayOfWeek = gq5VarDayOfWeek;
        gq5 gq5VarDayOfMonth = aVar.y;
        if (gq5VarDayOfMonth == null) {
            gq5VarDayOfMonth = super.dayOfMonth();
        }
        this.iDayOfMonth = gq5VarDayOfMonth;
        gq5 gq5VarDayOfYear = aVar.z;
        if (gq5VarDayOfYear == null) {
            gq5VarDayOfYear = super.dayOfYear();
        }
        this.iDayOfYear = gq5VarDayOfYear;
        gq5 gq5VarWeekOfWeekyear = aVar.A;
        if (gq5VarWeekOfWeekyear == null) {
            gq5VarWeekOfWeekyear = super.weekOfWeekyear();
        }
        this.iWeekOfWeekyear = gq5VarWeekOfWeekyear;
        gq5 gq5VarWeekyear = aVar.B;
        if (gq5VarWeekyear == null) {
            gq5VarWeekyear = super.weekyear();
        }
        this.iWeekyear = gq5VarWeekyear;
        gq5 gq5VarWeekyearOfCentury = aVar.C;
        if (gq5VarWeekyearOfCentury == null) {
            gq5VarWeekyearOfCentury = super.weekyearOfCentury();
        }
        this.iWeekyearOfCentury = gq5VarWeekyearOfCentury;
        gq5 gq5VarMonthOfYear = aVar.D;
        if (gq5VarMonthOfYear == null) {
            gq5VarMonthOfYear = super.monthOfYear();
        }
        this.iMonthOfYear = gq5VarMonthOfYear;
        gq5 gq5VarYear = aVar.E;
        if (gq5VarYear == null) {
            gq5VarYear = super.year();
        }
        this.iYear = gq5VarYear;
        gq5 gq5VarYearOfEra = aVar.F;
        if (gq5VarYearOfEra == null) {
            gq5VarYearOfEra = super.yearOfEra();
        }
        this.iYearOfEra = gq5VarYearOfEra;
        gq5 gq5VarYearOfCentury = aVar.G;
        if (gq5VarYearOfCentury == null) {
            gq5VarYearOfCentury = super.yearOfCentury();
        }
        this.iYearOfCentury = gq5VarYearOfCentury;
        gq5 gq5VarCenturyOfEra = aVar.H;
        if (gq5VarCenturyOfEra == null) {
            gq5VarCenturyOfEra = super.centuryOfEra();
        }
        this.iCenturyOfEra = gq5VarCenturyOfEra;
        gq5 gq5VarEra = aVar.I;
        if (gq5VarEra == null) {
            gq5VarEra = super.era();
        }
        this.iEra = gq5VarEra;
        bw3 bw3Var2 = this.iBase;
        int i = 0;
        if (bw3Var2 != null) {
            int i2 = ((this.iHourOfDay == bw3Var2.hourOfDay() && this.iMinuteOfHour == this.iBase.minuteOfHour() && this.iSecondOfMinute == this.iBase.secondOfMinute() && this.iMillisOfSecond == this.iBase.millisOfSecond()) ? 1 : 0) | (this.iMillisOfDay == this.iBase.millisOfDay() ? 2 : 0);
            if (this.iYear == this.iBase.year() && this.iMonthOfYear == this.iBase.monthOfYear() && this.iDayOfMonth == this.iBase.dayOfMonth()) {
                i = 4;
            }
            i |= i2;
        }
        this.iBaseFlags = i;
    }

    public abstract void assemble(a aVar);

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 centuries() {
        return this.iCenturies;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 centuryOfEra() {
        return this.iCenturyOfEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 clockhourOfDay() {
        return this.iClockhourOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 clockhourOfHalfday() {
        return this.iClockhourOfHalfday;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 dayOfMonth() {
        return this.iDayOfMonth;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 dayOfWeek() {
        return this.iDayOfWeek;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 dayOfYear() {
        return this.iDayOfYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 days() {
        return this.iDays;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 era() {
        return this.iEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 eras() {
        return this.iEras;
    }

    public final bw3 getBase() {
        return this.iBase;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        bw3 bw3Var = this.iBase;
        return (bw3Var == null || (this.iBaseFlags & 6) != 6) ? super.getDateTimeMillis(i, i2, i3, i4) : bw3Var.getDateTimeMillis(i, i2, i3, i4);
    }

    public final Object getParam() {
        return this.iParam;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public DateTimeZone getZone() {
        bw3 bw3Var = this.iBase;
        if (bw3Var != null) {
            return bw3Var.getZone();
        }
        return null;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 halfdayOfDay() {
        return this.iHalfdayOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 halfdays() {
        return this.iHalfdays;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 hourOfDay() {
        return this.iHourOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 hourOfHalfday() {
        return this.iHourOfHalfday;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 hours() {
        return this.iHours;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 millis() {
        return this.iMillis;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 millisOfDay() {
        return this.iMillisOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 millisOfSecond() {
        return this.iMillisOfSecond;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 minuteOfDay() {
        return this.iMinuteOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 minuteOfHour() {
        return this.iMinuteOfHour;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 minutes() {
        return this.iMinutes;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 monthOfYear() {
        return this.iMonthOfYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 months() {
        return this.iMonths;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 secondOfDay() {
        return this.iSecondOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 secondOfMinute() {
        return this.iSecondOfMinute;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 seconds() {
        return this.iSeconds;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 weekOfWeekyear() {
        return this.iWeekOfWeekyear;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 weeks() {
        return this.iWeeks;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 weekyear() {
        return this.iWeekyear;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 weekyearOfCentury() {
        return this.iWeekyearOfCentury;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 weekyears() {
        return this.iWeekyears;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 year() {
        return this.iYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 yearOfCentury() {
        return this.iYearOfCentury;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final gq5 yearOfEra() {
        return this.iYearOfEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public final t67 years() {
        return this.iYears;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        bw3 bw3Var = this.iBase;
        if (bw3Var != null && (this.iBaseFlags & 5) == 5) {
            return bw3Var.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        return super.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        bw3 bw3Var = this.iBase;
        if (bw3Var != null && (this.iBaseFlags & 1) == 1) {
            return bw3Var.getDateTimeMillis(j, i, i2, i3, i4);
        }
        return super.getDateTimeMillis(j, i, i2, i3, i4);
    }
}
