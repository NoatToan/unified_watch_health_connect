package defpackage;

import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zv3<D extends org.threeten.bp.chrono.a> extends rv5 implements s4p, Comparable<zv3<?>> {
    private static Comparator<zv3<?>> INSTANT_COMPARATOR = new a();

    public class a implements Comparator<zv3<?>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(zv3<?> zv3Var, zv3<?> zv3Var2) {
            int iB = crd.b(zv3Var.toEpochSecond(), zv3Var2.toEpochSecond());
            return iB == 0 ? crd.b(zv3Var.toLocalTime().toNanoOfDay(), zv3Var2.toLocalTime().toNanoOfDay()) : iB;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41709a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f41709a = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41709a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static zv3<?> from(t4p t4pVar) {
        crd.i(t4pVar, "temporal");
        if (t4pVar instanceof zv3) {
            return (zv3) t4pVar;
        }
        org.threeten.bp.chrono.b bVar = (org.threeten.bp.chrono.b) t4pVar.query(a5p.a());
        if (bVar != null) {
            return bVar.zonedDateTime(t4pVar);
        }
        throw new DateTimeException("No Chronology found to create ChronoZonedDateTime: " + t4pVar.getClass());
    }

    public static Comparator<zv3<?>> timeLineOrder() {
        return INSTANT_COMPARATOR;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv3) && compareTo((zv3<?>) obj) == 0;
    }

    public String format(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        return iq5Var.b(this);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return super.get(z4pVar);
        }
        int i = b.f41709a[((ChronoField) z4pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? toLocalDateTime().get(z4pVar) : getOffset().getTotalSeconds();
        }
        throw new UnsupportedTemporalTypeException("Field too large for an int: " + z4pVar);
    }

    public org.threeten.bp.chrono.b getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        int i = b.f41709a[((ChronoField) z4pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? toLocalDateTime().getLong(z4pVar) : getOffset().getTotalSeconds();
        }
        return toEpochSecond();
    }

    public abstract ZoneOffset getOffset();

    public abstract ZoneId getZone();

    public int hashCode() {
        return (toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    public boolean isAfter(zv3<?> zv3Var) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = zv3Var.toEpochSecond();
        return epochSecond > epochSecond2 || (epochSecond == epochSecond2 && toLocalTime().getNano() > zv3Var.toLocalTime().getNano());
    }

    public boolean isBefore(zv3<?> zv3Var) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = zv3Var.toEpochSecond();
        return epochSecond < epochSecond2 || (epochSecond == epochSecond2 && toLocalTime().getNano() < zv3Var.toLocalTime().getNano());
    }

    public boolean isEqual(zv3<?> zv3Var) {
        return toEpochSecond() == zv3Var.toEpochSecond() && toLocalTime().getNano() == zv3Var.toLocalTime().getNano();
    }

    @Override // defpackage.s4p
    public abstract zv3<D> plus(long j, c5p c5pVar);

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.g() || b5pVar == a5p.f()) {
            return (R) getZone();
        }
        if (b5pVar == a5p.a()) {
            return (R) toLocalDate().getChronology();
        }
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (b5pVar == a5p.d()) {
            return (R) getOffset();
        }
        if (b5pVar == a5p.b()) {
            return (R) LocalDate.ofEpochDay(toLocalDate().toEpochDay());
        }
        return b5pVar == a5p.c() ? (R) toLocalTime() : (R) super.query(b5pVar);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return (z4pVar == ChronoField.INSTANT_SECONDS || z4pVar == ChronoField.OFFSET_SECONDS) ? z4pVar.range() : toLocalDateTime().range(z4pVar);
        }
        return z4pVar.rangeRefinedBy(this);
    }

    public long toEpochSecond() {
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) getOffset().getTotalSeconds());
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().getNano());
    }

    public D toLocalDate() {
        return (D) toLocalDateTime().toLocalDate();
    }

    public abstract vv3<D> toLocalDateTime();

    public LocalTime toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }

    public String toString() {
        String str = toLocalDateTime().toString() + getOffset().toString();
        if (getOffset() == getZone()) {
            return str;
        }
        return str + AbstractJsonLexerKt.BEGIN_LIST + getZone().toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // defpackage.s4p
    public abstract zv3<D> with(z4p z4pVar, long j);

    public abstract zv3<D> withEarlierOffsetAtOverlap();

    public abstract zv3<D> withLaterOffsetAtOverlap();

    public abstract zv3<D> withZoneSameInstant(ZoneId zoneId);

    public abstract zv3<D> withZoneSameLocal(ZoneId zoneId);

    @Override // java.lang.Comparable
    public int compareTo(zv3<?> zv3Var) {
        int iB = crd.b(toEpochSecond(), zv3Var.toEpochSecond());
        if (iB != 0) {
            return iB;
        }
        int nano = toLocalTime().getNano() - zv3Var.toLocalTime().getNano();
        if (nano != 0) {
            return nano;
        }
        int iCompareTo = toLocalDateTime().compareTo(zv3Var.toLocalDateTime());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getZone().getId().compareTo(zv3Var.getZone().getId());
        return iCompareTo2 == 0 ? toLocalDate().getChronology().compareTo(zv3Var.toLocalDate().getChronology()) : iCompareTo2;
    }

    @Override // defpackage.rv5
    public zv3<D> minus(y4p y4pVar) {
        return toLocalDate().getChronology().ensureChronoZonedDateTime(super.minus(y4pVar));
    }

    @Override // defpackage.rv5
    public zv3<D> plus(y4p y4pVar) {
        return toLocalDate().getChronology().ensureChronoZonedDateTime(super.plus(y4pVar));
    }

    @Override // defpackage.rv5, defpackage.s4p
    public zv3<D> with(w4p w4pVar) {
        return toLocalDate().getChronology().ensureChronoZonedDateTime(super.with(w4pVar));
    }

    @Override // defpackage.rv5, defpackage.s4p
    public zv3<D> minus(long j, c5p c5pVar) {
        return toLocalDate().getChronology().ensureChronoZonedDateTime(super.minus(j, c5pVar));
    }
}
