package org.threeten.bp.temporal;

import org.threeten.bp.DayOfWeek;
import org.threeten.bp.jdk8.Jdk8Methods;

/* JADX INFO: loaded from: classes23.dex */
public final class TemporalAdjusters {

    public static final class b implements TemporalAdjuster {
        private final int a;
        private final int b;

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public Temporal adjustInto(Temporal temporal) {
            if (this.a >= 0) {
                Temporal temporalWith = temporal.with(ChronoField.DAY_OF_MONTH, 1L);
                return temporalWith.plus((int) (((long) (((this.b - temporalWith.get(ChronoField.DAY_OF_WEEK)) + 7) % 7)) + ((((long) this.a) - 1) * 7)), ChronoUnit.DAYS);
            }
            ChronoField chronoField = ChronoField.DAY_OF_MONTH;
            Temporal temporalWith2 = temporal.with(chronoField, temporal.range(chronoField).getMaximum());
            int i = this.b - temporalWith2.get(ChronoField.DAY_OF_WEEK);
            if (i == 0) {
                i = 0;
            } else if (i > 0) {
                i -= 7;
            }
            return temporalWith2.plus((int) (((long) i) - ((((long) (-this.a)) - 1) * 7)), ChronoUnit.DAYS);
        }

        private b(int i, DayOfWeek dayOfWeek) {
            this.a = i;
            this.b = dayOfWeek.getValue();
        }
    }

    public static class c implements TemporalAdjuster {
        private static final c b = new c(0);
        private static final c c = new c(1);
        private static final c d = new c(2);
        private static final c e = new c(3);
        private static final c f = new c(4);
        private static final c g = new c(5);
        private final int a;

        private c(int i) {
            this.a = i;
        }

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public Temporal adjustInto(Temporal temporal) {
            int i = this.a;
            if (i == 0) {
                return temporal.with(ChronoField.DAY_OF_MONTH, 1L);
            }
            if (i == 1) {
                ChronoField chronoField = ChronoField.DAY_OF_MONTH;
                return temporal.with(chronoField, temporal.range(chronoField).getMaximum());
            }
            if (i == 2) {
                return temporal.with(ChronoField.DAY_OF_MONTH, 1L).plus(1L, ChronoUnit.MONTHS);
            }
            if (i == 3) {
                return temporal.with(ChronoField.DAY_OF_YEAR, 1L);
            }
            if (i == 4) {
                ChronoField chronoField2 = ChronoField.DAY_OF_YEAR;
                return temporal.with(chronoField2, temporal.range(chronoField2).getMaximum());
            }
            if (i == 5) {
                return temporal.with(ChronoField.DAY_OF_YEAR, 1L).plus(1L, ChronoUnit.YEARS);
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    public static final class d implements TemporalAdjuster {
        private final int a;
        private final int b;

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public Temporal adjustInto(Temporal temporal) {
            int i = temporal.get(ChronoField.DAY_OF_WEEK);
            int i2 = this.a;
            if (i2 < 2 && i == this.b) {
                return temporal;
            }
            if ((i2 & 1) == 0) {
                int i3 = i - this.b;
                return temporal.plus(i3 >= 0 ? 7 - i3 : -i3, ChronoUnit.DAYS);
            }
            int i4 = this.b - i;
            return temporal.minus(i4 >= 0 ? 7 - i4 : -i4, ChronoUnit.DAYS);
        }

        private d(int i, DayOfWeek dayOfWeek) {
            Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
            this.a = i;
            this.b = dayOfWeek.getValue();
        }
    }

    private TemporalAdjusters() {
    }

    public static TemporalAdjuster dayOfWeekInMonth(int i, DayOfWeek dayOfWeek) {
        Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new b(i, dayOfWeek);
    }

    public static TemporalAdjuster firstDayOfMonth() {
        return c.b;
    }

    public static TemporalAdjuster firstDayOfNextMonth() {
        return c.d;
    }

    public static TemporalAdjuster firstDayOfNextYear() {
        return c.g;
    }

    public static TemporalAdjuster firstDayOfYear() {
        return c.e;
    }

    public static TemporalAdjuster firstInMonth(DayOfWeek dayOfWeek) {
        Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new b(1, dayOfWeek);
    }

    public static TemporalAdjuster lastDayOfMonth() {
        return c.c;
    }

    public static TemporalAdjuster lastDayOfYear() {
        return c.f;
    }

    public static TemporalAdjuster lastInMonth(DayOfWeek dayOfWeek) {
        Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new b(-1, dayOfWeek);
    }

    public static TemporalAdjuster next(DayOfWeek dayOfWeek) {
        return new d(2, dayOfWeek);
    }

    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        return new d(0, dayOfWeek);
    }

    public static TemporalAdjuster previous(DayOfWeek dayOfWeek) {
        return new d(3, dayOfWeek);
    }

    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        return new d(1, dayOfWeek);
    }
}
