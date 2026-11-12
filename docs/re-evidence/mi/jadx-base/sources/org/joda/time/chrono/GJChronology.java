package org.joda.time.chrono;

import defpackage.bva;
import defpackage.bw3;
import defpackage.gq5;
import defpackage.kgj;
import defpackage.o62;
import defpackage.ogj;
import defpackage.sxc;
import defpackage.t67;
import defpackage.wq5;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.field.DecoratedDurationField;

/* JADX INFO: loaded from: classes3.dex */
public final class GJChronology extends AssembledChronology {
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<bva, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    public class a extends o62 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final gq5 f29544b;
        public final gq5 c;
        public final long d;
        public final boolean e;
        public t67 f;
        public t67 g;

        public a(GJChronology gJChronology, gq5 gq5Var, gq5 gq5Var2, long j) {
            this(gJChronology, gq5Var, gq5Var2, j, false);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int[] add(ogj ogjVar, int i, int[] iArr, int i2) {
            if (i2 == 0) {
                return iArr;
            }
            if (!wq5.n(ogjVar)) {
                return super.add(ogjVar, i, iArr, i2);
            }
            int size = ogjVar.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j = ogjVar.getFieldType(i3).getField(GJChronology.this).set(j, iArr[i3]);
            }
            return GJChronology.this.get(ogjVar, add(j, i2));
        }

        public long b(long j) {
            return this.e ? GJChronology.this.gregorianToJulianByWeekyear(j) : GJChronology.this.gregorianToJulianByYear(j);
        }

        public long c(long j) {
            return this.e ? GJChronology.this.julianToGregorianByWeekyear(j) : GJChronology.this.julianToGregorianByYear(j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int get(long j) {
            return j >= this.d ? this.c.get(j) : this.f29544b.get(j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsShortText(long j, Locale locale) {
            return j >= this.d ? this.c.getAsShortText(j, locale) : this.f29544b.getAsShortText(j, locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsText(long j, Locale locale) {
            return j >= this.d ? this.c.getAsText(j, locale) : this.f29544b.getAsText(j, locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getDifference(long j, long j2) {
            return this.c.getDifference(j, j2);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long getDifferenceAsLong(long j, long j2) {
            return this.c.getDifferenceAsLong(j, j2);
        }

        @Override // defpackage.o62, defpackage.gq5
        public t67 getDurationField() {
            return this.f;
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getLeapAmount(long j) {
            return j >= this.d ? this.c.getLeapAmount(j) : this.f29544b.getLeapAmount(j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public t67 getLeapDurationField() {
            return this.c.getLeapDurationField();
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.f29544b.getMaximumShortTextLength(locale), this.c.getMaximumShortTextLength(locale));
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.f29544b.getMaximumTextLength(locale), this.c.getMaximumTextLength(locale));
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue() {
            return this.c.getMaximumValue();
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue() {
            return this.f29544b.getMinimumValue();
        }

        @Override // defpackage.o62, defpackage.gq5
        public t67 getRangeDurationField() {
            return this.g;
        }

        @Override // defpackage.o62, defpackage.gq5
        public boolean isLeap(long j) {
            return j >= this.d ? this.c.isLeap(j) : this.f29544b.isLeap(j);
        }

        @Override // defpackage.gq5
        public boolean isLenient() {
            return false;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundCeiling(long j) {
            if (j >= this.d) {
                return this.c.roundCeiling(j);
            }
            long jRoundCeiling = this.f29544b.roundCeiling(j);
            return (jRoundCeiling < this.d || jRoundCeiling - GJChronology.this.iGapDuration < this.d) ? jRoundCeiling : c(jRoundCeiling);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundFloor(long j) {
            if (j < this.d) {
                return this.f29544b.roundFloor(j);
            }
            long jRoundFloor = this.c.roundFloor(j);
            return (jRoundFloor >= this.d || GJChronology.this.iGapDuration + jRoundFloor >= this.d) ? jRoundFloor : b(jRoundFloor);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long set(long j, int i) {
            long jC;
            if (j >= this.d) {
                jC = this.c.set(j, i);
                if (jC < this.d) {
                    if (GJChronology.this.iGapDuration + jC < this.d) {
                        jC = b(jC);
                    }
                    if (get(jC) != i) {
                        throw new IllegalFieldValueException(this.c.getType(), Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            } else {
                jC = this.f29544b.set(j, i);
                if (jC >= this.d) {
                    if (jC - GJChronology.this.iGapDuration >= this.d) {
                        jC = c(jC);
                    }
                    if (get(jC) != i) {
                        throw new IllegalFieldValueException(this.f29544b.getType(), Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            }
            return jC;
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue(long j) {
            if (j >= this.d) {
                return this.c.getMaximumValue(j);
            }
            int maximumValue = this.f29544b.getMaximumValue(j);
            long j2 = this.f29544b.set(j, maximumValue);
            long j3 = this.d;
            if (j2 < j3) {
                return maximumValue;
            }
            gq5 gq5Var = this.f29544b;
            return gq5Var.get(gq5Var.add(j3, -1));
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue(ogj ogjVar) {
            return this.f29544b.getMinimumValue(ogjVar);
        }

        public a(GJChronology gJChronology, gq5 gq5Var, gq5 gq5Var2, long j, boolean z) {
            this(gq5Var, gq5Var2, null, j, z);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue(ogj ogjVar, int[] iArr) {
            return this.f29544b.getMinimumValue(ogjVar, iArr);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsShortText(int i, Locale locale) {
            return this.c.getAsShortText(i, locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsText(int i, Locale locale) {
            return this.c.getAsText(i, locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue(long j) {
            if (j < this.d) {
                return this.f29544b.getMinimumValue(j);
            }
            int minimumValue = this.c.getMinimumValue(j);
            long j2 = this.c.set(j, minimumValue);
            long j3 = this.d;
            return j2 < j3 ? this.c.get(j3) : minimumValue;
        }

        public a(gq5 gq5Var, gq5 gq5Var2, t67 t67Var, long j, boolean z) {
            super(gq5Var2.getType());
            this.f29544b = gq5Var;
            this.c = gq5Var2;
            this.d = j;
            this.e = z;
            this.f = gq5Var2.getDurationField();
            if (t67Var == null && (t67Var = gq5Var2.getRangeDurationField()) == null) {
                t67Var = gq5Var.getRangeDurationField();
            }
            this.g = t67Var;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long add(long j, int i) {
            return this.c.add(j, i);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue(ogj ogjVar) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(ogjVar, 0L));
        }

        @Override // defpackage.o62, defpackage.gq5
        public long add(long j, long j2) {
            return this.c.add(j, j2);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue(ogj ogjVar, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = ogjVar.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                gq5 field = ogjVar.getFieldType(i).getField(instanceUTC);
                if (iArr[i] <= field.getMaximumValue(j)) {
                    j = field.set(j, iArr[i]);
                }
            }
            return getMaximumValue(j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long set(long j, String str, Locale locale) {
            if (j >= this.d) {
                long j2 = this.c.set(j, str, locale);
                return (j2 >= this.d || GJChronology.this.iGapDuration + j2 >= this.d) ? j2 : b(j2);
            }
            long j3 = this.f29544b.set(j, str, locale);
            return (j3 < this.d || j3 - GJChronology.this.iGapDuration < this.d) ? j3 : c(j3);
        }
    }

    public static class c extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f29545a;

        public c(t67 t67Var, b bVar) {
            super(t67Var, t67Var.getType());
            this.f29545a = bVar;
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long add(long j, int i) {
            return this.f29545a.add(j, i);
        }

        @Override // org.joda.time.field.BaseDurationField, defpackage.t67
        public int getDifference(long j, long j2) {
            return this.f29545a.getDifference(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long getDifferenceAsLong(long j, long j2) {
            return this.f29545a.getDifferenceAsLong(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long add(long j, long j2) {
            return this.f29545a.add(j, j2);
        }
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j, bw3 bw3Var, bw3 bw3Var2) {
        return bw3Var2.millisOfDay().set(bw3Var2.dayOfWeek().set(bw3Var2.weekOfWeekyear().set(bw3Var2.weekyear().set(0L, bw3Var.weekyear().get(j)), bw3Var.weekOfWeekyear().get(j)), bw3Var.dayOfWeek().get(j)), bw3Var.millisOfDay().get(j));
    }

    private static long convertByYear(long j, bw3 bw3Var, bw3 bw3Var2) {
        return bw3Var2.getDateTimeMillis(bw3Var.year().get(j), bw3Var.monthOfYear().get(j), bw3Var.dayOfMonth().get(j), bw3Var.millisOfDay().get(j));
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, kgj kgjVar) {
        return getInstance(dateTimeZone, kgjVar, 4);
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.a aVar) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() != null) {
            return;
        }
        if (julianChronology.getMinimumDaysInFirstWeek() != gregorianChronology.getMinimumDaysInFirstWeek()) {
            throw new IllegalArgumentException();
        }
        long j = this.iCutoverMillis;
        this.iGapDuration = j - julianToGregorianByYear(j);
        aVar.a(gregorianChronology);
        if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
            aVar.m = new a(this, julianChronology.millisOfSecond(), aVar.m, this.iCutoverMillis);
            aVar.n = new a(this, julianChronology.millisOfDay(), aVar.n, this.iCutoverMillis);
            aVar.o = new a(this, julianChronology.secondOfMinute(), aVar.o, this.iCutoverMillis);
            aVar.p = new a(this, julianChronology.secondOfDay(), aVar.p, this.iCutoverMillis);
            aVar.q = new a(this, julianChronology.minuteOfHour(), aVar.q, this.iCutoverMillis);
            aVar.f29543r = new a(this, julianChronology.minuteOfDay(), aVar.f29543r, this.iCutoverMillis);
            aVar.s = new a(this, julianChronology.hourOfDay(), aVar.s, this.iCutoverMillis);
            aVar.u = new a(this, julianChronology.hourOfHalfday(), aVar.u, this.iCutoverMillis);
            aVar.t = new a(this, julianChronology.clockhourOfDay(), aVar.t, this.iCutoverMillis);
            aVar.v = new a(this, julianChronology.clockhourOfHalfday(), aVar.v, this.iCutoverMillis);
            aVar.w = new a(this, julianChronology.halfdayOfDay(), aVar.w, this.iCutoverMillis);
        }
        aVar.I = new a(this, julianChronology.era(), aVar.I, this.iCutoverMillis);
        b bVar = new b(this, julianChronology.year(), aVar.E, this.iCutoverMillis);
        aVar.E = bVar;
        aVar.j = bVar.getDurationField();
        aVar.F = new b(this, julianChronology.yearOfEra(), aVar.F, aVar.j, this.iCutoverMillis);
        b bVar2 = new b(this, julianChronology.centuryOfEra(), aVar.H, this.iCutoverMillis);
        aVar.H = bVar2;
        aVar.f29542k = bVar2.getDurationField();
        aVar.G = new b(this, julianChronology.yearOfCentury(), aVar.G, aVar.j, aVar.f29542k, this.iCutoverMillis);
        b bVar3 = new b(this, julianChronology.monthOfYear(), aVar.D, (t67) null, aVar.j, this.iCutoverMillis);
        aVar.D = bVar3;
        aVar.i = bVar3.getDurationField();
        b bVar4 = new b(julianChronology.weekyear(), aVar.B, (t67) null, this.iCutoverMillis, true);
        aVar.B = bVar4;
        aVar.h = bVar4.getDurationField();
        aVar.C = new b(this, julianChronology.weekyearOfCentury(), aVar.C, aVar.h, aVar.f29542k, this.iCutoverMillis);
        aVar.z = new a(julianChronology.dayOfYear(), aVar.z, aVar.j, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
        aVar.A = new a(julianChronology.weekOfWeekyear(), aVar.A, aVar.h, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
        a aVar2 = new a(this, julianChronology.dayOfMonth(), aVar.y, this.iCutoverMillis);
        aVar2.g = aVar.i;
        aVar.y = aVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        return this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        bw3 base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4);
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public DateTimeZone getZone() {
        bw3 base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public long gregorianToJulianByWeekyear(long j) {
        return convertByWeekyear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public long gregorianToJulianByYear(long j) {
        return convertByYear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return 25025 + getZone().hashCode() + getMinimumDaysInFirstWeek() + this.iCutoverInstant.hashCode();
    }

    public long julianToGregorianByWeekyear(long j) {
        return convertByWeekyear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    public long julianToGregorianByYear(long j) {
        return convertByYear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append(AbstractJsonLexerKt.BEGIN_LIST);
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? sxc.c() : sxc.h()).u(withUTC()).q(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(AbstractJsonLexerKt.END_LIST);
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone, this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    public final class b extends a {
        public b(GJChronology gJChronology, gq5 gq5Var, gq5 gq5Var2, long j) {
            this(gq5Var, gq5Var2, (t67) null, j, false);
        }

        @Override // org.joda.time.chrono.GJChronology.a, defpackage.o62, defpackage.gq5
        public long add(long j, int i) {
            if (j < this.d) {
                long jAdd = this.f29544b.add(j, i);
                return (jAdd < this.d || jAdd - GJChronology.this.iGapDuration < this.d) ? jAdd : c(jAdd);
            }
            long jAdd2 = this.c.add(j, i);
            if (jAdd2 >= this.d || GJChronology.this.iGapDuration + jAdd2 >= this.d) {
                return jAdd2;
            }
            if (this.e) {
                if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd2) <= 0) {
                    jAdd2 = GJChronology.this.iGregorianChronology.weekyear().add(jAdd2, -1);
                }
            } else if (GJChronology.this.iGregorianChronology.year().get(jAdd2) <= 0) {
                jAdd2 = GJChronology.this.iGregorianChronology.year().add(jAdd2, -1);
            }
            return b(jAdd2);
        }

        @Override // org.joda.time.chrono.GJChronology.a, defpackage.o62, defpackage.gq5
        public int getDifference(long j, long j2) {
            long j3 = this.d;
            if (j >= j3) {
                if (j2 >= j3) {
                    return this.c.getDifference(j, j2);
                }
                return this.f29544b.getDifference(b(j), j2);
            }
            if (j2 < j3) {
                return this.f29544b.getDifference(j, j2);
            }
            return this.c.getDifference(c(j), j2);
        }

        @Override // org.joda.time.chrono.GJChronology.a, defpackage.o62, defpackage.gq5
        public long getDifferenceAsLong(long j, long j2) {
            long j3 = this.d;
            if (j >= j3) {
                if (j2 >= j3) {
                    return this.c.getDifferenceAsLong(j, j2);
                }
                return this.f29544b.getDifferenceAsLong(b(j), j2);
            }
            if (j2 < j3) {
                return this.f29544b.getDifferenceAsLong(j, j2);
            }
            return this.c.getDifferenceAsLong(c(j), j2);
        }

        @Override // org.joda.time.chrono.GJChronology.a, defpackage.o62, defpackage.gq5
        public int getMaximumValue(long j) {
            return j >= this.d ? this.c.getMaximumValue(j) : this.f29544b.getMaximumValue(j);
        }

        @Override // org.joda.time.chrono.GJChronology.a, defpackage.o62, defpackage.gq5
        public int getMinimumValue(long j) {
            return j >= this.d ? this.c.getMinimumValue(j) : this.f29544b.getMinimumValue(j);
        }

        public b(GJChronology gJChronology, gq5 gq5Var, gq5 gq5Var2, t67 t67Var, long j) {
            this(gq5Var, gq5Var2, t67Var, j, false);
        }

        public b(GJChronology gJChronology, gq5 gq5Var, gq5 gq5Var2, t67 t67Var, t67 t67Var2, long j) {
            this(gq5Var, gq5Var2, t67Var, j, false);
            this.g = t67Var2;
        }

        public b(gq5 gq5Var, gq5 gq5Var2, t67 t67Var, long j, boolean z) {
            super(GJChronology.this, gq5Var, gq5Var2, j, z);
            this.f = t67Var == null ? new c(this.f, this) : t67Var;
        }

        @Override // org.joda.time.chrono.GJChronology.a, defpackage.o62, defpackage.gq5
        public long add(long j, long j2) {
            if (j >= this.d) {
                long jAdd = this.c.add(j, j2);
                if (jAdd >= this.d || GJChronology.this.iGapDuration + jAdd >= this.d) {
                    return jAdd;
                }
                if (this.e) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd) <= 0) {
                        jAdd = GJChronology.this.iGregorianChronology.weekyear().add(jAdd, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.year().get(jAdd) <= 0) {
                    jAdd = GJChronology.this.iGregorianChronology.year().add(jAdd, -1);
                }
                return b(jAdd);
            }
            long jAdd2 = this.f29544b.add(j, j2);
            return (jAdd2 < this.d || jAdd2 - GJChronology.this.iGapDuration < this.d) ? jAdd2 : c(jAdd2);
        }
    }

    private GJChronology(bw3 bw3Var, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(bw3Var, new Object[]{julianChronology, gregorianChronology, instant});
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, kgj kgjVar, int i) {
        Instant instant;
        GJChronology gJChronology;
        DateTimeZone dateTimeZoneM = wq5.m(dateTimeZone);
        if (kgjVar == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = kgjVar.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.getInstance(dateTimeZoneM)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        bva bvaVar = new bva(dateTimeZoneM, instant, i);
        ConcurrentHashMap<bva, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology2 = concurrentHashMap.get(bvaVar);
        if (gJChronology2 != null) {
            return gJChronology2;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
        if (dateTimeZoneM == dateTimeZone2) {
            gJChronology = new GJChronology(JulianChronology.getInstance(dateTimeZoneM, i), GregorianChronology.getInstance(dateTimeZoneM, i), instant);
        } else {
            GJChronology gJChronology3 = getInstance(dateTimeZone2, instant, i);
            gJChronology = new GJChronology(ZonedChronology.getInstance(gJChronology3, dateTimeZoneM), gJChronology3.iJulianChronology, gJChronology3.iGregorianChronology, gJChronology3.iCutoverInstant);
        }
        GJChronology gJChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(bvaVar, gJChronology);
        return gJChronologyPutIfAbsent != null ? gJChronologyPutIfAbsent : gJChronology;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        long dateTimeMillis;
        bw3 base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        try {
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        } catch (IllegalFieldValueException e) {
            if (i2 == 2 && i3 == 29) {
                dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i2, 28, i4, i5, i6, i7);
                if (dateTimeMillis >= this.iCutoverMillis) {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j, int i) {
        return getInstance(dateTimeZone, j == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j), i);
    }
}
