package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.threeten.bp.Duration;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.jdk8.Jdk8Methods;

/* JADX INFO: loaded from: classes23.dex */
public final class ZoneOffsetTransition implements Comparable<ZoneOffsetTransition>, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneOffset c;

    public ZoneOffsetTransition(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneOffset2;
    }

    private int a() {
        return getOffsetAfter().getTotalSeconds() - getOffsetBefore().getTotalSeconds();
    }

    public static ZoneOffsetTransition c(DataInput dataInput) throws IOException {
        long jB = a.b(dataInput);
        ZoneOffset zoneOffsetE = a.e(dataInput);
        ZoneOffset zoneOffsetE2 = a.e(dataInput);
        if (zoneOffsetE.equals(zoneOffsetE2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new ZoneOffsetTransition(jB, zoneOffsetE, zoneOffsetE2);
    }

    public static ZoneOffsetTransition of(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        Jdk8Methods.requireNonNull(localDateTime, "transition");
        Jdk8Methods.requireNonNull(zoneOffset, "offsetBefore");
        Jdk8Methods.requireNonNull(zoneOffset2, "offsetAfter");
        if (zoneOffset.equals(zoneOffset2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        if (localDateTime.getNano() == 0) {
            return new ZoneOffsetTransition(localDateTime, zoneOffset, zoneOffset2);
        }
        throw new IllegalArgumentException("Nano-of-second must be zero");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public List<ZoneOffset> b() {
        return isGap() ? Collections.emptyList() : Arrays.asList(getOffsetBefore(), getOffsetAfter());
    }

    public void e(DataOutput dataOutput) throws IOException {
        a.g(toEpochSecond(), dataOutput);
        a.i(this.b, dataOutput);
        a.i(this.c, dataOutput);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransition)) {
            return false;
        }
        ZoneOffsetTransition zoneOffsetTransition = (ZoneOffsetTransition) obj;
        return this.a.equals(zoneOffsetTransition.a) && this.b.equals(zoneOffsetTransition.b) && this.c.equals(zoneOffsetTransition.c);
    }

    public LocalDateTime getDateTimeAfter() {
        return this.a.plusSeconds(a());
    }

    public LocalDateTime getDateTimeBefore() {
        return this.a;
    }

    public Duration getDuration() {
        return Duration.ofSeconds(a());
    }

    public Instant getInstant() {
        return this.a.toInstant(this.b);
    }

    public ZoneOffset getOffsetAfter() {
        return this.c;
    }

    public ZoneOffset getOffsetBefore() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 16);
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
        return this.a.toEpochSecond(this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(isGap() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.a);
        sb.append(this.b);
        sb.append(" to ");
        sb.append(this.c);
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoneOffsetTransition zoneOffsetTransition) {
        return getInstant().compareTo(zoneOffsetTransition.getInstant());
    }

    public ZoneOffsetTransition(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = LocalDateTime.ofEpochSecond(j, 0, zoneOffset);
        this.b = zoneOffset;
        this.c = zoneOffset2;
    }
}
