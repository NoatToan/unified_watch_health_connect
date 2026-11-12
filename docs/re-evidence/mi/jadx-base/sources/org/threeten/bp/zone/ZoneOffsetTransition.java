package org.threeten.bp.zone;

import defpackage.crd;
import defpackage.hwl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.Duration;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoneOffsetTransition implements Comparable<ZoneOffsetTransition>, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final LocalDateTime transition;

    public ZoneOffsetTransition(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.transition = localDateTime;
        this.offsetBefore = zoneOffset;
        this.offsetAfter = zoneOffset2;
    }

    private int getDurationSeconds() {
        return getOffsetAfter().getTotalSeconds() - getOffsetBefore().getTotalSeconds();
    }

    public static ZoneOffsetTransition of(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        crd.i(localDateTime, "transition");
        crd.i(zoneOffset, "offsetBefore");
        crd.i(zoneOffset2, "offsetAfter");
        if (zoneOffset.equals(zoneOffset2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        if (localDateTime.getNano() == 0) {
            return new ZoneOffsetTransition(localDateTime, zoneOffset, zoneOffset2);
        }
        throw new IllegalArgumentException("Nano-of-second must be zero");
    }

    public static ZoneOffsetTransition readExternal(DataInput dataInput) throws IOException {
        long jB = hwl.b(dataInput);
        ZoneOffset zoneOffsetD = hwl.d(dataInput);
        ZoneOffset zoneOffsetD2 = hwl.d(dataInput);
        if (zoneOffsetD.equals(zoneOffsetD2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new ZoneOffsetTransition(jB, zoneOffsetD, zoneOffsetD2);
    }

    private Object writeReplace() {
        return new hwl((byte) 2, this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransition)) {
            return false;
        }
        ZoneOffsetTransition zoneOffsetTransition = (ZoneOffsetTransition) obj;
        return this.transition.equals(zoneOffsetTransition.transition) && this.offsetBefore.equals(zoneOffsetTransition.offsetBefore) && this.offsetAfter.equals(zoneOffsetTransition.offsetAfter);
    }

    public LocalDateTime getDateTimeAfter() {
        return this.transition.plusSeconds(getDurationSeconds());
    }

    public LocalDateTime getDateTimeBefore() {
        return this.transition;
    }

    public Duration getDuration() {
        return Duration.ofSeconds(getDurationSeconds());
    }

    public Instant getInstant() {
        return this.transition.toInstant(this.offsetBefore);
    }

    public ZoneOffset getOffsetAfter() {
        return this.offsetAfter;
    }

    public ZoneOffset getOffsetBefore() {
        return this.offsetBefore;
    }

    public List<ZoneOffset> getValidOffsets() {
        return isGap() ? Collections.emptyList() : Arrays.asList(getOffsetBefore(), getOffsetAfter());
    }

    public int hashCode() {
        return (this.transition.hashCode() ^ this.offsetBefore.hashCode()) ^ Integer.rotateLeft(this.offsetAfter.hashCode(), 16);
    }

    public boolean isGap() {
        return getOffsetAfter().getTotalSeconds() > getOffsetBefore().getTotalSeconds();
    }

    public boolean isOverlap() {
        return getOffsetAfter().getTotalSeconds() < getOffsetBefore().getTotalSeconds();
    }

    public boolean isValidOffset(ZoneOffset zoneOffset) {
        if (isGap()) {
            return false;
        }
        return getOffsetBefore().equals(zoneOffset) || getOffsetAfter().equals(zoneOffset);
    }

    public long toEpochSecond() {
        return this.transition.toEpochSecond(this.offsetBefore);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(isGap() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.transition);
        sb.append(this.offsetBefore);
        sb.append(" to ");
        sb.append(this.offsetAfter);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        hwl.e(toEpochSecond(), dataOutput);
        hwl.g(this.offsetBefore, dataOutput);
        hwl.g(this.offsetAfter, dataOutput);
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoneOffsetTransition zoneOffsetTransition) {
        return getInstant().compareTo(zoneOffsetTransition.getInstant());
    }

    public ZoneOffsetTransition(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.transition = LocalDateTime.ofEpochSecond(j, 0, zoneOffset);
        this.offsetBefore = zoneOffset;
        this.offsetAfter = zoneOffset2;
    }
}
