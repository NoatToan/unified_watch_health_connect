package com.xiaomi.hm.health.bt.profile.gdsp.breathrate;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEvent;", "", "other", "", "equals", "", "hashCode", "Ljava/util/Calendar;", "component1", "", "component2", "calendar", "raw", "copy", "", "toString", "a", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "b", "[B", "getRaw", "()[B", "<init>", "(Ljava/util/Calendar;[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathRateEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Calendar calendar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] raw;

    public BreathRateEvent(@NotNull Calendar calendar, @NotNull byte[] bArr) {
        this.calendar = calendar;
        this.raw = bArr;
    }

    public static /* synthetic */ BreathRateEvent copy$default(BreathRateEvent breathRateEvent, Calendar calendar, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            calendar = breathRateEvent.calendar;
        }
        if ((i & 2) != 0) {
            bArr = breathRateEvent.raw;
        }
        return breathRateEvent.copy(calendar, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Calendar getCalendar() {
        return this.calendar;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getRaw() {
        return this.raw;
    }

    @NotNull
    public final BreathRateEvent copy(@NotNull Calendar calendar, @NotNull byte[] raw) {
        return new BreathRateEvent(calendar, raw);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BreathRateEvent.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateEvent");
        BreathRateEvent breathRateEvent = (BreathRateEvent) other;
        return Intrinsics.areEqual(this.calendar, breathRateEvent.calendar) && Arrays.equals(this.raw, breathRateEvent.raw);
    }

    @NotNull
    public final Calendar getCalendar() {
        return this.calendar;
    }

    @NotNull
    public final byte[] getRaw() {
        return this.raw;
    }

    public int hashCode() {
        return (this.calendar.hashCode() * 31) + Arrays.hashCode(this.raw);
    }

    @NotNull
    public String toString() {
        return "BreathRateEvent(calendar=" + this.calendar + ", raw=" + Arrays.toString(this.raw) + ')';
    }
}
