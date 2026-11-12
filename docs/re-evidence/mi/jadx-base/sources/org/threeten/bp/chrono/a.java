package org.threeten.bp.chrono;

import defpackage.a5p;
import defpackage.ad8;
import defpackage.b5p;
import defpackage.c5p;
import defpackage.crd;
import defpackage.iq5;
import defpackage.rv5;
import defpackage.s4p;
import defpackage.t4p;
import defpackage.vv3;
import defpackage.w4p;
import defpackage.wv3;
import defpackage.xv3;
import defpackage.y4p;
import defpackage.z4p;
import java.util.Comparator;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends rv5 implements s4p, w4p, Comparable<a> {
    private static final Comparator<a> DATE_COMPARATOR = new C1068a();

    /* JADX INFO: renamed from: org.threeten.bp.chrono.a$a, reason: collision with other inner class name */
    public class C1068a implements Comparator<a> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            return crd.b(aVar.toEpochDay(), aVar2.toEpochDay());
        }
    }

    public static a from(t4p t4pVar) {
        crd.i(t4pVar, "temporal");
        if (t4pVar instanceof a) {
            return (a) t4pVar;
        }
        b bVar = (b) t4pVar.query(a5p.a());
        if (bVar != null) {
            return bVar.date(t4pVar);
        }
        throw new DateTimeException("No Chronology found to create ChronoLocalDate: " + t4pVar.getClass());
    }

    public static Comparator<a> timeLineOrder() {
        return DATE_COMPARATOR;
    }

    public s4p adjustInto(s4p s4pVar) {
        return s4pVar.with(ChronoField.EPOCH_DAY, toEpochDay());
    }

    public vv3<?> atTime(LocalTime localTime) {
        return wv3.a(this, localTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && compareTo((a) obj) == 0;
    }

    public String format(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return iq5Var.b(this);
    }

    public abstract b getChronology();

    public ad8 getEra() {
        return getChronology().eraOf(get(ChronoField.ERA));
    }

    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ getChronology().hashCode();
    }

    public boolean isAfter(a aVar) {
        return toEpochDay() > aVar.toEpochDay();
    }

    public boolean isBefore(a aVar) {
        return toEpochDay() < aVar.toEpochDay();
    }

    public boolean isEqual(a aVar) {
        return toEpochDay() == aVar.toEpochDay();
    }

    public boolean isLeapYear() {
        return getChronology().isLeapYear(getLong(ChronoField.YEAR));
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar.isDateBased();
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    public abstract int lengthOfMonth();

    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // defpackage.s4p
    public abstract a plus(long j, c5p c5pVar);

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.a()) {
            return (R) getChronology();
        }
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.DAYS;
        }
        if (b5pVar == a5p.b()) {
            return (R) LocalDate.ofEpochDay(toEpochDay());
        }
        if (b5pVar == a5p.c() || b5pVar == a5p.f() || b5pVar == a5p.g() || b5pVar == a5p.d()) {
            return null;
        }
        return (R) super.query(b5pVar);
    }

    public long toEpochDay() {
        return getLong(ChronoField.EPOCH_DAY);
    }

    public String toString() {
        long j = getLong(ChronoField.YEAR_OF_ERA);
        long j2 = getLong(ChronoField.MONTH_OF_YEAR);
        long j3 = getLong(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : "-");
        sb.append(j2);
        sb.append(j3 < 10 ? "-0" : "-");
        sb.append(j3);
        return sb.toString();
    }

    public abstract xv3 until(a aVar);

    @Override // defpackage.s4p
    public abstract a with(z4p z4pVar, long j);

    @Override // java.lang.Comparable
    public int compareTo(a aVar) {
        int iB = crd.b(toEpochDay(), aVar.toEpochDay());
        return iB == 0 ? getChronology().compareTo(aVar.getChronology()) : iB;
    }

    @Override // defpackage.rv5
    public a minus(y4p y4pVar) {
        return getChronology().ensureChronoLocalDate(super.minus(y4pVar));
    }

    @Override // defpackage.rv5
    public a plus(y4p y4pVar) {
        return getChronology().ensureChronoLocalDate(super.plus(y4pVar));
    }

    @Override // defpackage.rv5, defpackage.s4p
    public a with(w4p w4pVar) {
        return getChronology().ensureChronoLocalDate(super.with(w4pVar));
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar.isDateBased();
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    @Override // defpackage.rv5, defpackage.s4p
    public a minus(long j, c5p c5pVar) {
        return getChronology().ensureChronoLocalDate(super.minus(j, c5pVar));
    }
}
