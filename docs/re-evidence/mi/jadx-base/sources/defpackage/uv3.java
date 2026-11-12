package defpackage;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uv3<D extends org.threeten.bp.chrono.a> extends org.threeten.bp.chrono.a implements s4p, w4p, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36179a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f36179a = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36179a[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36179a[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36179a[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36179a[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36179a[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36179a[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // org.threeten.bp.chrono.a
    public vv3<?> atTime(LocalTime localTime) {
        return wv3.a(this, localTime);
    }

    public uv3<D> minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public uv3<D> minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public uv3<D> minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1L) : plusWeeks(-j);
    }

    public uv3<D> minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public abstract uv3<D> plusDays(long j);

    public abstract uv3<D> plusMonths(long j);

    public uv3<D> plusWeeks(long j) {
        return plusDays(crd.m(j, 7));
    }

    public abstract uv3<D> plusYears(long j);

    public long until(s4p s4pVar, c5p c5pVar) {
        org.threeten.bp.chrono.a aVarDate = getChronology().date(s4pVar);
        return c5pVar instanceof ChronoUnit ? LocalDate.from((t4p) this).until(aVarDate, c5pVar) : c5pVar.between(this, aVarDate);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.s4p
    public uv3<D> plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            switch (a.f36179a[((ChronoUnit) c5pVar).ordinal()]) {
                case 1:
                    return plusDays(j);
                case 2:
                    return plusDays(crd.m(j, 7));
                case 3:
                    return plusMonths(j);
                case 4:
                    return plusYears(j);
                case 5:
                    return plusYears(crd.m(j, 10));
                case 6:
                    return plusYears(crd.m(j, 100));
                case 7:
                    return plusYears(crd.m(j, 1000));
                default:
                    throw new DateTimeException(c5pVar + " not valid for chronology " + getChronology().getId());
            }
        }
        return (uv3) getChronology().ensureChronoLocalDate(c5pVar.addTo(this, j));
    }

    @Override // org.threeten.bp.chrono.a
    public xv3 until(org.threeten.bp.chrono.a aVar) {
        throw new UnsupportedOperationException("Not supported in ThreeTen backport");
    }
}
