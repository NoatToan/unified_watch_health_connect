package org.threeten.bp;

import java.io.Serializable;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.TemporalAmount;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Clock {

    public static final class a extends Clock implements Serializable {
        private static final long serialVersionUID = 7430389292664866958L;
        private final Instant a;
        private final ZoneId b;

        public a(Instant instant, ZoneId zoneId) {
            this.a = instant;
            this.b = zoneId;
        }

        @Override // org.threeten.bp.Clock
        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        @Override // org.threeten.bp.Clock
        public ZoneId getZone() {
            return this.b;
        }

        @Override // org.threeten.bp.Clock
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // org.threeten.bp.Clock
        public Instant instant() {
            return this.a;
        }

        @Override // org.threeten.bp.Clock
        public long millis() {
            return this.a.toEpochMilli();
        }

        public String toString() {
            return "FixedClock[" + this.a + "," + this.b + "]";
        }

        @Override // org.threeten.bp.Clock
        public Clock withZone(ZoneId zoneId) {
            return zoneId.equals(this.b) ? this : new a(this.a, zoneId);
        }
    }

    public static final class b extends Clock implements Serializable {
        private static final long serialVersionUID = 2007484719125426256L;
        private final Clock a;
        private final Duration b;

        public b(Clock clock, Duration duration) {
            this.a = clock;
            this.b = duration;
        }

        @Override // org.threeten.bp.Clock
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        @Override // org.threeten.bp.Clock
        public ZoneId getZone() {
            return this.a.getZone();
        }

        @Override // org.threeten.bp.Clock
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // org.threeten.bp.Clock
        public Instant instant() {
            return this.a.instant().plus((TemporalAmount) this.b);
        }

        @Override // org.threeten.bp.Clock
        public long millis() {
            return Jdk8Methods.safeAdd(this.a.millis(), this.b.toMillis());
        }

        public String toString() {
            return "OffsetClock[" + this.a + "," + this.b + "]";
        }

        @Override // org.threeten.bp.Clock
        public Clock withZone(ZoneId zoneId) {
            return zoneId.equals(this.a.getZone()) ? this : new b(this.a.withZone(zoneId), this.b);
        }
    }

    public static final class c extends Clock implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;
        private final ZoneId a;

        public c(ZoneId zoneId) {
            this.a = zoneId;
        }

        @Override // org.threeten.bp.Clock
        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        @Override // org.threeten.bp.Clock
        public ZoneId getZone() {
            return this.a;
        }

        @Override // org.threeten.bp.Clock
        public int hashCode() {
            return this.a.hashCode() + 1;
        }

        @Override // org.threeten.bp.Clock
        public Instant instant() {
            return Instant.ofEpochMilli(millis());
        }

        @Override // org.threeten.bp.Clock
        public long millis() {
            return System.currentTimeMillis();
        }

        public String toString() {
            return "SystemClock[" + this.a + "]";
        }

        @Override // org.threeten.bp.Clock
        public Clock withZone(ZoneId zoneId) {
            return zoneId.equals(this.a) ? this : new c(zoneId);
        }
    }

    public static final class d extends Clock implements Serializable {
        private static final long serialVersionUID = 6504659149906368850L;
        private final Clock a;
        private final long b;

        public d(Clock clock, long j) {
            this.a = clock;
            this.b = j;
        }

        @Override // org.threeten.bp.Clock
        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b;
        }

        @Override // org.threeten.bp.Clock
        public ZoneId getZone() {
            return this.a.getZone();
        }

        @Override // org.threeten.bp.Clock
        public int hashCode() {
            int iHashCode = this.a.hashCode();
            long j = this.b;
            return iHashCode ^ ((int) (j ^ (j >>> 32)));
        }

        @Override // org.threeten.bp.Clock
        public Instant instant() {
            if (this.b % 1000000 == 0) {
                long jMillis = this.a.millis();
                return Instant.ofEpochMilli(jMillis - Jdk8Methods.floorMod(jMillis, this.b / 1000000));
            }
            Instant instant = this.a.instant();
            return instant.minusNanos(Jdk8Methods.floorMod(instant.getNano(), this.b));
        }

        @Override // org.threeten.bp.Clock
        public long millis() {
            long jMillis = this.a.millis();
            return jMillis - Jdk8Methods.floorMod(jMillis, this.b / 1000000);
        }

        public String toString() {
            return "TickClock[" + this.a + "," + Duration.ofNanos(this.b) + "]";
        }

        @Override // org.threeten.bp.Clock
        public Clock withZone(ZoneId zoneId) {
            return zoneId.equals(this.a.getZone()) ? this : new d(this.a.withZone(zoneId), this.b);
        }
    }

    public static Clock fixed(Instant instant, ZoneId zoneId) {
        Jdk8Methods.requireNonNull(instant, "fixedInstant");
        Jdk8Methods.requireNonNull(zoneId, "zone");
        return new a(instant, zoneId);
    }

    public static Clock offset(Clock clock, Duration duration) {
        Jdk8Methods.requireNonNull(clock, "baseClock");
        Jdk8Methods.requireNonNull(duration, "offsetDuration");
        return duration.equals(Duration.ZERO) ? clock : new b(clock, duration);
    }

    public static Clock system(ZoneId zoneId) {
        Jdk8Methods.requireNonNull(zoneId, "zone");
        return new c(zoneId);
    }

    public static Clock systemDefaultZone() {
        return new c(ZoneId.systemDefault());
    }

    public static Clock systemUTC() {
        return new c(ZoneOffset.UTC);
    }

    public static Clock tick(Clock clock, Duration duration) {
        Jdk8Methods.requireNonNull(clock, "baseClock");
        Jdk8Methods.requireNonNull(duration, "tickDuration");
        if (duration.isNegative()) {
            throw new IllegalArgumentException("Tick duration must not be negative");
        }
        long nanos = duration.toNanos();
        if (nanos % 1000000 == 0 || 1000000000 % nanos == 0) {
            return nanos <= 1 ? clock : new d(clock, nanos);
        }
        throw new IllegalArgumentException("Invalid tick duration");
    }

    public static Clock tickMinutes(ZoneId zoneId) {
        return new d(system(zoneId), LocalTime.o);
    }

    public static Clock tickSeconds(ZoneId zoneId) {
        return new d(system(zoneId), 1000000000L);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public abstract ZoneId getZone();

    public int hashCode() {
        return super.hashCode();
    }

    public abstract Instant instant();

    public long millis() {
        return instant().toEpochMilli();
    }

    public abstract Clock withZone(ZoneId zoneId);
}
