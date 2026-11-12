package defpackage;

import java.util.Comparator;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.a;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vv3<D extends org.threeten.bp.chrono.a> extends rv5 implements s4p, w4p, Comparable<vv3<?>> {
    private static final Comparator<vv3<?>> DATE_TIME_COMPARATOR = new a();

    public class a implements Comparator<vv3<?>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(vv3<?> vv3Var, vv3<?> vv3Var2) {
            int iB = crd.b(vv3Var.toLocalDate().toEpochDay(), vv3Var2.toLocalDate().toEpochDay());
            return iB == 0 ? crd.b(vv3Var.toLocalTime().toNanoOfDay(), vv3Var2.toLocalTime().toNanoOfDay()) : iB;
        }
    }

    public static vv3<?> from(t4p t4pVar) {
        crd.i(t4pVar, "temporal");
        if (t4pVar instanceof vv3) {
            return (vv3) t4pVar;
        }
        b bVar = (b) t4pVar.query(a5p.a());
        if (bVar != null) {
            return bVar.localDateTime(t4pVar);
        }
        throw new DateTimeException("No Chronology found to create ChronoLocalDateTime: " + t4pVar.getClass());
    }

    public static Comparator<vv3<?>> timeLineOrder() {
        return DATE_TIME_COMPARATOR;
    }

    public s4p adjustInto(s4p s4pVar) {
        return s4pVar.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay());
    }

    public abstract zv3<D> atZone(ZoneId zoneId);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vv3) && compareTo((vv3<?>) obj) == 0;
    }

    public String format(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return iq5Var.b(this);
    }

    public b getChronology() {
        return toLocalDate().getChronology();
    }

    public int hashCode() {
        return toLocalDate().hashCode() ^ toLocalTime().hashCode();
    }

    public boolean isAfter(vv3<?> vv3Var) {
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = vv3Var.toLocalDate().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && toLocalTime().toNanoOfDay() > vv3Var.toLocalTime().toNanoOfDay());
    }

    public boolean isBefore(vv3<?> vv3Var) {
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = vv3Var.toLocalDate().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && toLocalTime().toNanoOfDay() < vv3Var.toLocalTime().toNanoOfDay());
    }

    public boolean isEqual(vv3<?> vv3Var) {
        return toLocalTime().toNanoOfDay() == vv3Var.toLocalTime().toNanoOfDay() && toLocalDate().toEpochDay() == vv3Var.toLocalDate().toEpochDay();
    }

    @Override // defpackage.s4p
    public abstract vv3<D> plus(long j, c5p c5pVar);

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.a()) {
            return (R) getChronology();
        }
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (b5pVar == a5p.b()) {
            return (R) LocalDate.ofEpochDay(toLocalDate().toEpochDay());
        }
        if (b5pVar == a5p.c()) {
            return (R) toLocalTime();
        }
        if (b5pVar == a5p.f() || b5pVar == a5p.g() || b5pVar == a5p.d()) {
            return null;
        }
        return (R) super.query(b5pVar);
    }

    public long toEpochSecond(ZoneOffset zoneOffset) {
        crd.i(zoneOffset, "offset");
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    public Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().getNano());
    }

    public abstract D toLocalDate();

    public abstract LocalTime toLocalTime();

    public String toString() {
        return toLocalDate().toString() + 'T' + toLocalTime().toString();
    }

    @Override // defpackage.s4p
    public abstract vv3<D> with(z4p z4pVar, long j);

    @Override // java.lang.Comparable
    public int compareTo(vv3<?> vv3Var) {
        int iCompareTo = toLocalDate().compareTo(vv3Var.toLocalDate());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = toLocalTime().compareTo(vv3Var.toLocalTime());
        return iCompareTo2 == 0 ? getChronology().compareTo(vv3Var.getChronology()) : iCompareTo2;
    }

    @Override // defpackage.rv5
    public vv3<D> minus(y4p y4pVar) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.minus(y4pVar));
    }

    @Override // defpackage.rv5
    public vv3<D> plus(y4p y4pVar) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.plus(y4pVar));
    }

    @Override // defpackage.rv5, defpackage.s4p
    public vv3<D> with(w4p w4pVar) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.with(w4pVar));
    }

    @Override // defpackage.rv5, defpackage.s4p
    public vv3<D> minus(long j, c5p c5pVar) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.minus(j, c5pVar));
    }
}
