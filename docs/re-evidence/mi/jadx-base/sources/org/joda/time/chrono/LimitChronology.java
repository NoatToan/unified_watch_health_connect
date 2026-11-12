package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.ggj;
import defpackage.gq5;
import defpackage.jq5;
import defpackage.sxc;
import defpackage.t67;
import defpackage.xs5;
import java.util.HashMap;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.field.DecoratedDurationField;

/* JADX INFO: loaded from: classes3.dex */
public final class LimitChronology extends AssembledChronology {
    private static final long serialVersionUID = 7670866536893052522L;
    final DateTime iLowerLimit;
    final DateTime iUpperLimit;
    private transient LimitChronology iWithUTC;

    public class c extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f29548a;

        public c(String str, boolean z) {
            super(str);
            this.f29548a = z;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuffer stringBuffer = new StringBuffer(85);
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                stringBuffer.append(' ');
                stringBuffer.append(message);
            }
            stringBuffer.append(" instant is ");
            jq5 jq5VarU = sxc.h().u(LimitChronology.this.getBase());
            if (this.f29548a) {
                stringBuffer.append("below the supported minimum of ");
                jq5VarU.q(stringBuffer, LimitChronology.this.getLowerLimit().getMillis());
            } else {
                stringBuffer.append("above the supported maximum of ");
                jq5VarU.q(stringBuffer, LimitChronology.this.getUpperLimit().getMillis());
            }
            stringBuffer.append(" (");
            stringBuffer.append(LimitChronology.this.getBase());
            stringBuffer.append(')');
            return stringBuffer.toString();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IllegalArgumentException: " + getMessage();
        }
    }

    private LimitChronology(bw3 bw3Var, DateTime dateTime, DateTime dateTime2) {
        super(bw3Var, null);
        this.iLowerLimit = dateTime;
        this.iUpperLimit = dateTime2;
    }

    private gq5 convertField(gq5 gq5Var, HashMap<Object, Object> map) {
        if (gq5Var == null || !gq5Var.isSupported()) {
            return gq5Var;
        }
        if (map.containsKey(gq5Var)) {
            return (gq5) map.get(gq5Var);
        }
        a aVar = new a(gq5Var, convertField(gq5Var.getDurationField(), map), convertField(gq5Var.getRangeDurationField(), map), convertField(gq5Var.getLeapDurationField(), map));
        map.put(gq5Var, aVar);
        return aVar;
    }

    public static LimitChronology getInstance(bw3 bw3Var, ggj ggjVar, ggj ggjVar2) {
        if (bw3Var == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        DateTime dateTime = ggjVar == null ? null : ggjVar.toDateTime();
        DateTime dateTime2 = ggjVar2 != null ? ggjVar2.toDateTime() : null;
        if (dateTime == null || dateTime2 == null || dateTime.isBefore(dateTime2)) {
            return new LimitChronology(bw3Var, dateTime, dateTime2);
        }
        throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
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

    public void checkLimits(long j, String str) {
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null && j < dateTime.getMillis()) {
            throw new c(str, true);
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null && j >= dateTime2.getMillis()) {
            throw new c(str, false);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitChronology)) {
            return false;
        }
        LimitChronology limitChronology = (LimitChronology) obj;
        return getBase().equals(limitChronology.getBase()) && fl9.a(getLowerLimit(), limitChronology.getLowerLimit()) && fl9.a(getUpperLimit(), limitChronology.getUpperLimit());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        long dateTimeMillis = getBase().getDateTimeMillis(i, i2, i3, i4);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    public DateTime getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTime getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        return (getLowerLimit() != null ? getLowerLimit().hashCode() : 0) + 317351877 + (getUpperLimit() != null ? getUpperLimit().hashCode() : 0) + (getBase().hashCode() * 7);
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LimitChronology[");
        sb.append(getBase().toString());
        sb.append(", ");
        sb.append(getLowerLimit() == null ? "NoLimit" : getLowerLimit().toString());
        sb.append(", ");
        sb.append(getUpperLimit() != null ? getUpperLimit().toString() : "NoLimit");
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withZone(DateTimeZone dateTimeZone) {
        LimitChronology limitChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getZone()) {
            return this;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
        if (dateTimeZone == dateTimeZone2 && (limitChronology = this.iWithUTC) != null) {
            return limitChronology;
        }
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null) {
            MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
            mutableDateTime.setZoneRetainFields(dateTimeZone);
            dateTime = mutableDateTime.toDateTime();
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null) {
            MutableDateTime mutableDateTime2 = dateTime2.toMutableDateTime();
            mutableDateTime2.setZoneRetainFields(dateTimeZone);
            dateTime2 = mutableDateTime2.toDateTime();
        }
        LimitChronology limitChronology2 = getInstance(getBase().withZone(dateTimeZone), dateTime, dateTime2);
        if (dateTimeZone == dateTimeZone2) {
            this.iWithUTC = limitChronology2;
        }
        return limitChronology2;
    }

    public class b extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;

        public b(t67 t67Var) {
            super(t67Var, t67Var.getType());
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long add(long j, int i) {
            LimitChronology.this.checkLimits(j, null);
            long jAdd = getWrappedField().add(j, i);
            LimitChronology.this.checkLimits(jAdd, "resulting");
            return jAdd;
        }

        @Override // org.joda.time.field.BaseDurationField, defpackage.t67
        public int getDifference(long j, long j2) {
            LimitChronology.this.checkLimits(j, "minuend");
            LimitChronology.this.checkLimits(j2, "subtrahend");
            return getWrappedField().getDifference(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long getDifferenceAsLong(long j, long j2) {
            LimitChronology.this.checkLimits(j, "minuend");
            LimitChronology.this.checkLimits(j2, "subtrahend");
            return getWrappedField().getDifferenceAsLong(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long getMillis(int i, long j) {
            LimitChronology.this.checkLimits(j, null);
            return getWrappedField().getMillis(i, j);
        }

        @Override // org.joda.time.field.BaseDurationField, defpackage.t67
        public int getValue(long j, long j2) {
            LimitChronology.this.checkLimits(j2, null);
            return getWrappedField().getValue(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long getValueAsLong(long j, long j2) {
            LimitChronology.this.checkLimits(j2, null);
            return getWrappedField().getValueAsLong(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long getMillis(long j, long j2) {
            LimitChronology.this.checkLimits(j2, null);
            return getWrappedField().getMillis(j, j2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
        public long add(long j, long j2) {
            LimitChronology.this.checkLimits(j, null);
            long jAdd = getWrappedField().add(j, j2);
            LimitChronology.this.checkLimits(jAdd, "resulting");
            return jAdd;
        }
    }

    public class a extends xs5 {
        public final t67 c;
        public final t67 d;
        public final t67 e;

        public a(gq5 gq5Var, t67 t67Var, t67 t67Var2, t67 t67Var3) {
            super(gq5Var, gq5Var.getType());
            this.c = t67Var;
            this.d = t67Var2;
            this.e = t67Var3;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long add(long j, int i) {
            LimitChronology.this.checkLimits(j, null);
            long jAdd = getWrappedField().add(j, i);
            LimitChronology.this.checkLimits(jAdd, "resulting");
            return jAdd;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long addWrapField(long j, int i) {
            LimitChronology.this.checkLimits(j, null);
            long jAddWrapField = getWrappedField().addWrapField(j, i);
            LimitChronology.this.checkLimits(jAddWrapField, "resulting");
            return jAddWrapField;
        }

        @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
        public int get(long j) {
            LimitChronology.this.checkLimits(j, null);
            return getWrappedField().get(j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsShortText(long j, Locale locale) {
            LimitChronology.this.checkLimits(j, null);
            return getWrappedField().getAsShortText(j, locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public String getAsText(long j, Locale locale) {
            LimitChronology.this.checkLimits(j, null);
            return getWrappedField().getAsText(j, locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getDifference(long j, long j2) {
            LimitChronology.this.checkLimits(j, "minuend");
            LimitChronology.this.checkLimits(j2, "subtrahend");
            return getWrappedField().getDifference(j, j2);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long getDifferenceAsLong(long j, long j2) {
            LimitChronology.this.checkLimits(j, "minuend");
            LimitChronology.this.checkLimits(j2, "subtrahend");
            return getWrappedField().getDifferenceAsLong(j, j2);
        }

        @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
        public final t67 getDurationField() {
            return this.c;
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getLeapAmount(long j) {
            LimitChronology.this.checkLimits(j, null);
            return getWrappedField().getLeapAmount(j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public final t67 getLeapDurationField() {
            return this.e;
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumShortTextLength(Locale locale) {
            return getWrappedField().getMaximumShortTextLength(locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumTextLength(Locale locale) {
            return getWrappedField().getMaximumTextLength(locale);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMaximumValue(long j) {
            LimitChronology.this.checkLimits(j, null);
            return getWrappedField().getMaximumValue(j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public int getMinimumValue(long j) {
            LimitChronology.this.checkLimits(j, null);
            return getWrappedField().getMinimumValue(j);
        }

        @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
        public final t67 getRangeDurationField() {
            return this.d;
        }

        @Override // defpackage.o62, defpackage.gq5
        public boolean isLeap(long j) {
            LimitChronology.this.checkLimits(j, null);
            return getWrappedField().isLeap(j);
        }

        @Override // defpackage.o62, defpackage.gq5
        public long remainder(long j) {
            LimitChronology.this.checkLimits(j, null);
            long jRemainder = getWrappedField().remainder(j);
            LimitChronology.this.checkLimits(jRemainder, "resulting");
            return jRemainder;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundCeiling(long j) {
            LimitChronology.this.checkLimits(j, null);
            long jRoundCeiling = getWrappedField().roundCeiling(j);
            LimitChronology.this.checkLimits(jRoundCeiling, "resulting");
            return jRoundCeiling;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundFloor(long j) {
            LimitChronology.this.checkLimits(j, null);
            long jRoundFloor = getWrappedField().roundFloor(j);
            LimitChronology.this.checkLimits(jRoundFloor, "resulting");
            return jRoundFloor;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundHalfCeiling(long j) {
            LimitChronology.this.checkLimits(j, null);
            long jRoundHalfCeiling = getWrappedField().roundHalfCeiling(j);
            LimitChronology.this.checkLimits(jRoundHalfCeiling, "resulting");
            return jRoundHalfCeiling;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundHalfEven(long j) {
            LimitChronology.this.checkLimits(j, null);
            long jRoundHalfEven = getWrappedField().roundHalfEven(j);
            LimitChronology.this.checkLimits(jRoundHalfEven, "resulting");
            return jRoundHalfEven;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long roundHalfFloor(long j) {
            LimitChronology.this.checkLimits(j, null);
            long jRoundHalfFloor = getWrappedField().roundHalfFloor(j);
            LimitChronology.this.checkLimits(jRoundHalfFloor, "resulting");
            return jRoundHalfFloor;
        }

        @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
        public long set(long j, int i) {
            LimitChronology.this.checkLimits(j, null);
            long j2 = getWrappedField().set(j, i);
            LimitChronology.this.checkLimits(j2, "resulting");
            return j2;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long add(long j, long j2) {
            LimitChronology.this.checkLimits(j, null);
            long jAdd = getWrappedField().add(j, j2);
            LimitChronology.this.checkLimits(jAdd, "resulting");
            return jAdd;
        }

        @Override // defpackage.o62, defpackage.gq5
        public long set(long j, String str, Locale locale) {
            LimitChronology.this.checkLimits(j, null);
            long j2 = getWrappedField().set(j, str, locale);
            LimitChronology.this.checkLimits(j2, "resulting");
            return j2;
        }
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        long dateTimeMillis = getBase().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, defpackage.bw3
    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        checkLimits(j, null);
        long dateTimeMillis = getBase().getDateTimeMillis(j, i, i2, i3, i4);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    private t67 convertField(t67 t67Var, HashMap<Object, Object> map) {
        if (t67Var == null || !t67Var.isSupported()) {
            return t67Var;
        }
        if (map.containsKey(t67Var)) {
            return (t67) map.get(t67Var);
        }
        b bVar = new b(t67Var);
        map.put(t67Var, bVar);
        return bVar;
    }
}
