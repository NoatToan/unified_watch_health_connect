package org.threeten.bp.zone;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.Duration;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.jdk8.Jdk8Methods;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ZoneRules {

    public static final class a extends ZoneRules implements Serializable {
        private static final long serialVersionUID = -8733721350312276297L;
        private final ZoneOffset a;

        public a(ZoneOffset zoneOffset) {
            this.a = zoneOffset;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.isFixedOffset() && this.a.equals(bVar.getOffset(Instant.EPOCH));
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public Duration getDaylightSavings(Instant instant) {
            return Duration.ZERO;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public ZoneOffset getOffset(Instant instant) {
            return this.a;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public ZoneOffset getStandardOffset(Instant instant) {
            return this.a;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public ZoneOffsetTransition getTransition(LocalDateTime localDateTime) {
            return null;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public List<ZoneOffsetTransitionRule> getTransitionRules() {
            return Collections.emptyList();
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public List<ZoneOffsetTransition> getTransitions() {
            return Collections.emptyList();
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public List<ZoneOffset> getValidOffsets(LocalDateTime localDateTime) {
            return Collections.singletonList(this.a);
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public int hashCode() {
            return ((((this.a.hashCode() + 31) ^ 1) ^ 1) ^ (this.a.hashCode() + 31)) ^ 1;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public boolean isDaylightSavings(Instant instant) {
            return false;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public boolean isFixedOffset() {
            return true;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public boolean isValidOffset(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
            return this.a.equals(zoneOffset);
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public ZoneOffsetTransition nextTransition(Instant instant) {
            return null;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public ZoneOffsetTransition previousTransition(Instant instant) {
            return null;
        }

        public String toString() {
            return "FixedRules:" + this.a;
        }

        @Override // org.threeten.bp.zone.ZoneRules
        public ZoneOffset getOffset(LocalDateTime localDateTime) {
            return this.a;
        }
    }

    public static ZoneRules of(ZoneOffset zoneOffset, ZoneOffset zoneOffset2, List<ZoneOffsetTransition> list, List<ZoneOffsetTransition> list2, List<ZoneOffsetTransitionRule> list3) {
        Jdk8Methods.requireNonNull(zoneOffset, "baseStandardOffset");
        Jdk8Methods.requireNonNull(zoneOffset2, "baseWallOffset");
        Jdk8Methods.requireNonNull(list, "standardOffsetTransitionList");
        Jdk8Methods.requireNonNull(list2, "transitionList");
        Jdk8Methods.requireNonNull(list3, "lastRules");
        return new b(zoneOffset, zoneOffset2, list, list2, list3);
    }

    public abstract boolean equals(Object obj);

    public abstract Duration getDaylightSavings(Instant instant);

    public abstract ZoneOffset getOffset(Instant instant);

    public abstract ZoneOffset getOffset(LocalDateTime localDateTime);

    public abstract ZoneOffset getStandardOffset(Instant instant);

    public abstract ZoneOffsetTransition getTransition(LocalDateTime localDateTime);

    public abstract List<ZoneOffsetTransitionRule> getTransitionRules();

    public abstract List<ZoneOffsetTransition> getTransitions();

    public abstract List<ZoneOffset> getValidOffsets(LocalDateTime localDateTime);

    public abstract int hashCode();

    public abstract boolean isDaylightSavings(Instant instant);

    public abstract boolean isFixedOffset();

    public abstract boolean isValidOffset(LocalDateTime localDateTime, ZoneOffset zoneOffset);

    public abstract ZoneOffsetTransition nextTransition(Instant instant);

    public abstract ZoneOffsetTransition previousTransition(Instant instant);

    public static ZoneRules of(ZoneOffset zoneOffset) {
        Jdk8Methods.requireNonNull(zoneOffset, "offset");
        return new a(zoneOffset);
    }
}
