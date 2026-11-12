package com.xiaomi.hm.health.bt.profile.gdsp.standhour;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/standhour/StandHourData;", "", "", "toString", "", "valid", "Ljava/util/Calendar;", "component1", "component2", "component3", "calendar", "stand", "wear", "copy", "", "hashCode", "other", "equals", "a", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "b", "Z", "getStand", "()Z", "c", "getWear", "<init>", "(Ljava/util/Calendar;ZZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StandHourData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Calendar calendar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean stand;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean wear;

    public StandHourData(@NotNull Calendar calendar, boolean z, boolean z2) {
        this.calendar = calendar;
        this.stand = z;
        this.wear = z2;
    }

    public static /* synthetic */ StandHourData copy$default(StandHourData standHourData, Calendar calendar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            calendar = standHourData.calendar;
        }
        if ((i & 2) != 0) {
            z = standHourData.stand;
        }
        if ((i & 4) != 0) {
            z2 = standHourData.wear;
        }
        return standHourData.copy(calendar, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Calendar getCalendar() {
        return this.calendar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getStand() {
        return this.stand;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getWear() {
        return this.wear;
    }

    @NotNull
    public final StandHourData copy(@NotNull Calendar calendar, boolean stand, boolean wear) {
        return new StandHourData(calendar, stand, wear);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandHourData)) {
            return false;
        }
        StandHourData standHourData = (StandHourData) other;
        return Intrinsics.areEqual(this.calendar, standHourData.calendar) && this.stand == standHourData.stand && this.wear == standHourData.wear;
    }

    @NotNull
    public final Calendar getCalendar() {
        return this.calendar;
    }

    public final boolean getStand() {
        return this.stand;
    }

    public final boolean getWear() {
        return this.wear;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.calendar.hashCode() * 31;
        boolean z = this.stand;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.wear;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "StandHourData: calendar: " + this.calendar.getTime() + ", stand: " + this.stand + ", wear: " + this.wear;
    }

    public final boolean valid() {
        return !this.stand || this.wear;
    }
}
