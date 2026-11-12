package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.gq5;
import defpackage.o62;
import defpackage.ogj;
import defpackage.t67;
import java.util.HashMap;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.field.BaseDurationField;

/* JADX INFO: loaded from: classes3.dex */
public final class ZonedChronology extends AssembledChronology {
    private static final long NEAR_ZERO = 604800000;
    private static final long serialVersionUID = -1079258847191166848L;

    public static final class a extends o62 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final gq5 f29550b;
        public final DateTimeZone c;
        public final t67 d;
        public final boolean e;
        public final t67 f;
        public final t67 g;

        public a(gq5 gq5Var, DateTimeZone dateTimeZone, t67 t67Var, t67 t67Var2, t67 t67Var3) {
            super(gq5Var.getType());
            if (!gq5Var.isSupported()) {
                throw new IllegalArgumentException();
            }
            this.f29550b = gq5Var;
            this.c = dateTimeZone;
            this.d = t67Var;
            this.e = ZonedChronology.useTimeArithmetic(t67Var);
            this.f = t67Var2;
            this.g = t67Var3;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long add(long j, int i) {
            if (this.e) {
                long jB = b(j);
                return this.f29550b.add(j + jB, i) - jB;
            }
            return this.c.convertLocalToUTC(this.f29550b.add(this.c.convertUTCToLocal(j), i), false, j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long addWrapField(long j, int i) {
            if (this.e) {
                long jB = b(j);
                return this.f29550b.addWrapField(j + jB, i) - jB;
            }
            return this.c.convertLocalToUTC(this.f29550b.addWrapField(this.c.convertUTCToLocal(j), i), false, j);
        }

        public final int b(long j) {
            int offset = this.c.getOffset(j);
            long j2 = offset;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29550b.equals(aVar.f29550b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.f.equals(aVar.f);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int get(long j) {
            return this.f29550b.get(this.c.convertUTCToLocal(j));
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsShortText(long j, Locale locale) {
            return this.f29550b.getAsShortText(this.c.convertUTCToLocal(j), locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsText(long j, Locale locale) {
            return this.f29550b.getAsText(this.c.convertUTCToLocal(j), locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getDifference(long j, long j2) {
            int iB = b(j2);
            return this.f29550b.getDifference(j + ((long) (this.e ? iB : b(j))), j2 + ((long) iB));
        }

        @Override // defpackage.o62, defpackage.gq5
        public long getDifferenceAsLong(long j, long j2) {
            int iB = b(j2);
            return this.f29550b.getDifferenceAsLong(j + ((long) (this.e ? iB : b(j))), j2 + ((long) iB));
        }

        @Override // defpackage.o62, defpackage.gq5
        public final t67 getDurationField() {
            return this.d;
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getLeapAmount(long j) {
            return this.f29550b.getLeapAmount(this.c.convertUTCToLocal(j));
        }

        @Override // defpackage.o62, defpackage.gq5
        public final t67 getLeapDurationField() {
            return this.g;
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumShortTextLength(Locale locale) {
            return this.f29550b.getMaximumShortTextLength(locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumTextLength(Locale locale) {
            return this.f29550b.getMaximumTextLength(locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue() {
            return this.f29550b.getMaximumValue();
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue() {
            return this.f29550b.getMinimumValue();
        }

        @Override // defpackage.o62, defpackage.gq5
        public final t67 getRangeDurationField() {
            return this.f;
        }

        public int hashCode() {
            return this.f29550b.hashCode() ^ this.c.hashCode();
        }

        @Override // defpackage.o62, defpackage.gq5
        public boolean isLeap(long j) {
            return this.f29550b.isLeap(this.c.convertUTCToLocal(j));
        }

        @Override // defpackage.gq5
        public boolean isLenient() {
            return this.f29550b.isLenient();
        }

        @Override // defpackage.o62, defpackage.gq5
        public long remainder(long j) {
            return this.f29550b.remainder(this.c.convertUTCToLocal(j));
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundCeiling(long j) {
            if (this.e) {
                long jB = b(j);
                return this.f29550b.roundCeiling(j + jB) - jB;
            }
            return this.c.convertLocalToUTC(this.f29550b.roundCeiling(this.c.convertUTCToLocal(j)), false, j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundFloor(long j) {
            if (this.e) {
                long jB = b(j);
                return this.f29550b.roundFloor(j + jB) - jB;
            }
            return this.c.convertLocalToUTC(this.f29550b.roundFloor(this.c.convertUTCToLocal(j)), false, j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long set(long j, int i) {
            long j2 = this.f29550b.set(this.c.convertUTCToLocal(j), i);
            long jConvertLocalToUTC = this.c.convertLocalToUTC(j2, false, j);
            if (get(jConvertLocalToUTC) == i) {
                return jConvertLocalToUTC;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(j2, this.c.getID());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.f29550b.getType(), Integer.valueOf(i), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue(long j) {
            return this.f29550b.getMaximumValue(this.c.convertUTCToLocal(j));
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue(long j) {
            return this.f29550b.getMinimumValue(this.c.convertUTCToLocal(j));
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsShortText(int i, Locale locale) {
            return this.f29550b.getAsShortText(i, locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsText(int i, Locale locale) {
            return this.f29550b.getAsText(i, locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue(ogj ogjVar) {
            return this.f29550b.getMaximumValue(ogjVar);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue(ogj ogjVar) {
            return this.f29550b.getMinimumValue(ogjVar);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue(ogj ogjVar, int[] iArr) {
            return this.f29550b.getMaximumValue(ogjVar, iArr);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue(ogj ogjVar, int[] iArr) {
            return this.f29550b.getMinimumValue(ogjVar, iArr);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long add(long j, long j2) {
            if (this.e) {
                long jB = b(j);
                return this.f29550b.add(j + jB, j2) - jB;
            }
            return this.c.convertLocalToUTC(this.f29550b.add(this.c.convertUTCToLocal(j), j2), false, j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long set(long j, String str, Locale locale) {
            return this.c.convertLocalToUTC(this.f29550b.set(this.c.convertUTCToLocal(j), str, locale), false, j);
        }
    }

    public static class b extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t67 f29551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f29552b;
        public final DateTimeZone c;

        public b(t67 t67Var, DateTimeZone dateTimeZone) {
            super(t67Var.getType());
            if (!t67Var.isSupported()) {
                throw new IllegalArgumentException();
            }
            this.f29551a = t67Var;
            this.f29552b = ZonedChronology.useTimeArithmetic(t67Var);
            this.c = dateTimeZone;
        }

        public final long a(long j) {
            return this.c.convertUTCToLocal(j);
        }

        @Override // defpackage.t67
        public long add(long j, int i) {
            int iC = c(j);
            long jAdd = this.f29551a.add(j + ((long) iC), i);
            if (!this.f29552b) {
                iC = b(jAdd);
            }
            return jAdd - ((long) iC);
        }

        public final int b(long j) {
            int offsetFromLocal = this.c.getOffsetFromLocal(j);
            long j2 = offsetFromLocal;
            if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
                return offsetFromLocal;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        public final int c(long j) {
            int offset = this.c.getOffset(j);
            long j2 = offset;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f29551a.equals(bVar.f29551a) && this.c.equals(bVar.c);
        }

        @Override // org.joda.time.field.BaseDurationField, defpackage.t67
        public int getDifference(long j, long j2) {
            int iC = c(j2);
            return this.f29551a.getDifference(j + ((long) (this.f29552b ? iC : c(j))), j2 + ((long) iC));
        }

        @Override // defpackage.t67
        public long getDifferenceAsLong(long j, long j2) {
            int iC = c(j2);
            return this.f29551a.getDifferenceAsLong(j + ((long) (this.f29552b ? iC : c(j))), j2 + ((long) iC));
        }

        @Override // defpackage.t67
        public long getMillis(int i, long j) {
            return this.f29551a.getMillis(i, a(j));
        }

        @Override // defpackage.t67
        public long getUnitMillis() {
            return this.f29551a.getUnitMillis();
        }

        @Override // org.joda.time.field.BaseDurationField, defpackage.t67
        public int getValue(long j, long j2) {
            return this.f29551a.getValue(j, a(j2));
        }

        @Override // defpackage.t67
        public long getValueAsLong(long j, long j2) {
            return this.f29551a.getValueAsLong(j, a(j2));
        }

        public int hashCode() {
            return this.f29551a.hashCode() ^ this.c.hashCode();
        }

        @Override // defpackage.t67
        public boolean isPrecise() {
            if (this.f29552b) {
                return this.f29551a.isPrecise();
            }
            return this.f29551a.isPrecise() && this.c.isFixed();
        }

        @Override // defpackage.t67
        public long getMillis(long j, long j2) {
            return this.f29551a.getMillis(j, a(j2));
        }

        @Override // defpackage.t67
        public long add(long j, long j2) {
            int iC = c(j);
            long jAdd = this.f29551a.add(j + ((long) iC), j2);
            if (!this.f29552b) {
                iC = b(jAdd);
            }
            return jAdd - ((long) iC);
        }
    }

    private ZonedChronology(bw3 bw3Var, DateTimeZone dateTimeZone) {
        super(bw3Var, dateTimeZone);
    }

    private gq5 convertField(gq5 gq5Var, HashMap<Object, Object> map) {
        if (gq5Var == null || !gq5Var.isSupported()) {
            return gq5Var;
        }
        if (map.containsKey(gq5Var)) {
            return (gq5) map.get(gq5Var);
        }
        a aVar = new a(gq5Var, getZone(), convertField(gq5Var.getDurationField(), map), convertField(gq5Var.getRangeDurationField(), map), convertField(gq5Var.getLeapDurationField(), map));
        map.put(gq5Var, aVar);
        return aVar;
    }

    public static ZonedChronology getInstance(bw3 bw3Var, DateTimeZone dateTimeZone) {
        if (bw3Var == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        bw3 bw3VarWithUTC = bw3Var.withUTC();
        if (bw3VarWithUTC == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (dateTimeZone != null) {
            return new ZonedChronology(bw3VarWithUTC, dateTimeZone);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    private long localToUTC(long j) {
        if (j == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        DateTimeZone zone = getZone();
        int offsetFromLocal = zone.getOffsetFromLocal(j);
        long j2 = j - ((long) offsetFromLocal);
        if (j > 604800000 && j2 < 0) {
            return Long.MAX_VALUE;
        }
        if (j < -604800000 && j2 > 0) {
            return Long.MIN_VALUE;
        }
        if (offsetFromLocal == zone.getOffset(j2)) {
            return j2;
        }
        throw new IllegalInstantException(j, zone.getID());
    }

    public static boolean useTimeArithmetic(t67 t67Var) {
        return t67Var != null && t67Var.getUnitMillis() < 43200000;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.a aVar) {
        HashMap<Object, Object> map = new HashMap<>();
        aVar.l = convertField(aVar.l, map);
        aVar.f29542k = convertField(aVar.f29542k, map);
        aVar.j = convertField(aVar.j, map);
        aVar.i = convertField(aVar.i, map);
        aVar.h = convertField(aVar.h, map);
        aVar.g = convertField(aVar.g, map);
        aVar.f = convertField(aVar.f, map);
        aVar.e = convertField(aVar.e, map);
        aVar.d = convertField(aVar.d, map);
        aVar.c = convertField(aVar.c, map);
        aVar.f29541b = convertField(aVar.f29541b, map);
        aVar.f29540a = convertField(aVar.f29540a, map);
        aVar.E = convertField(aVar.E, map);
        aVar.F = convertField(aVar.F, map);
        aVar.G = convertField(aVar.G, map);
        aVar.H = convertField(aVar.H, map);
        aVar.I = convertField(aVar.I, map);
        aVar.x = convertField(aVar.x, map);
        aVar.y = convertField(aVar.y, map);
        aVar.z = convertField(aVar.z, map);
        aVar.D = convertField(aVar.D, map);
        aVar.A = convertField(aVar.A, map);
        aVar.B = convertField(aVar.B, map);
        aVar.C = convertField(aVar.C, map);
        aVar.m = convertField(aVar.m, map);
        aVar.n = convertField(aVar.n, map);
        aVar.o = convertField(aVar.o, map);
        aVar.p = convertField(aVar.p, map);
        aVar.q = convertField(aVar.q, map);
        aVar.f29543r = convertField(aVar.f29543r, map);
        aVar.s = convertField(aVar.s, map);
        aVar.u = convertField(aVar.u, map);
        aVar.t = convertField(aVar.t, map);
        aVar.v = convertField(aVar.v, map);
        aVar.w = convertField(aVar.w, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        return getBase().equals(zonedChronology.getBase()) && getZone().equals(zonedChronology.getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(i, i2, i3, i4));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public DateTimeZone getZone() {
        return (DateTimeZone) getParam();
    }

    public int hashCode() {
        return (getZone().hashCode() * 11) + 326565 + (getBase().hashCode() * 7);
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public String toString() {
        return "ZonedChronology[" + getBase() + ", " + getZone().getID() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withUTC() {
        return getBase();
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getParam()) {
            return this;
        }
        return dateTimeZone == DateTimeZone.UTC ? getBase() : new ZonedChronology(getBase(), dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(((long) getZone().getOffset(j)) + j, i, i2, i3, i4));
    }

    private t67 convertField(t67 t67Var, HashMap<Object, Object> map) {
        if (t67Var == null || !t67Var.isSupported()) {
            return t67Var;
        }
        if (map.containsKey(t67Var)) {
            return (t67) map.get(t67Var);
        }
        b bVar = new b(t67Var, getZone());
        map.put(t67Var, bVar);
        return bVar;
    }
}
