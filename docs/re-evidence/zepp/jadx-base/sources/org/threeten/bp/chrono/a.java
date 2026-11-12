package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes23.dex */
abstract class a<D extends ChronoLocalDate> extends ChronoLocalDate implements Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: renamed from: org.threeten.bp.chrono.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1209a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            a = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public a<D> a(long j) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE).f(1L) : f(-j);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public ChronoLocalDateTime<?> atTime(LocalTime localTime) {
        return b.a(this, localTime);
    }

    public a<D> b(long j) {
        return j == Long.MIN_VALUE ? g(Long.MAX_VALUE).g(1L) : g(-j);
    }

    public a<D> c(long j) {
        return j == Long.MIN_VALUE ? h(Long.MAX_VALUE).h(1L) : h(-j);
    }

    public a<D> e(long j) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE).i(1L) : i(-j);
    }

    public abstract a<D> f(long j);

    public abstract a<D> g(long j);

    public a<D> h(long j) {
        return f(Jdk8Methods.safeMultiply(j, 7));
    }

    public abstract a<D> i(long j);

    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        ChronoLocalDate chronoLocalDateDate = getChronology().date(temporal);
        return temporalUnit instanceof ChronoUnit ? LocalDate.from((TemporalAccessor) this).until(chronoLocalDateDate, temporalUnit) : temporalUnit.between(this, chronoLocalDateDate);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public a<D> plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (C1209a.a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return f(j);
                case 2:
                    return f(Jdk8Methods.safeMultiply(j, 7));
                case 3:
                    return g(j);
                case 4:
                    return i(j);
                case 5:
                    return i(Jdk8Methods.safeMultiply(j, 10));
                case 6:
                    return i(Jdk8Methods.safeMultiply(j, 100));
                case 7:
                    return i(Jdk8Methods.safeMultiply(j, 1000));
                default:
                    throw new DateTimeException(temporalUnit + " not valid for chronology " + getChronology().getId());
            }
        }
        return (a) getChronology().a(temporalUnit.addTo(this, j));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        throw new UnsupportedOperationException("Not supported in ThreeTen backport");
    }
}
