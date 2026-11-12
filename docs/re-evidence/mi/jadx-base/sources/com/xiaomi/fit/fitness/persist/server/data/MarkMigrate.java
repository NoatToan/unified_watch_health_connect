package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/MarkMigrate;", "", "timeZone", "", "supportECOSync", "", "<init>", "(ILjava/lang/Boolean;)V", "getTimeZone", "()I", "getSupportECOSync", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(ILjava/lang/Boolean;)Lcom/xiaomi/fit/fitness/persist/server/data/MarkMigrate;", "equals", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MarkMigrate {

    @SerializedName("support_eco_sync")
    @Nullable
    private final Boolean supportECOSync;

    @SerializedName("zone_offset")
    private final int timeZone;

    public MarkMigrate(int i, @Nullable Boolean bool) {
        this.timeZone = i;
        this.supportECOSync = bool;
    }

    public static /* synthetic */ MarkMigrate copy$default(MarkMigrate markMigrate, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = markMigrate.timeZone;
        }
        if ((i2 & 2) != 0) {
            bool = markMigrate.supportECOSync;
        }
        return markMigrate.copy(i, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSupportECOSync() {
        return this.supportECOSync;
    }

    @NotNull
    public final MarkMigrate copy(int timeZone, @Nullable Boolean supportECOSync) {
        return new MarkMigrate(timeZone, supportECOSync);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkMigrate)) {
            return false;
        }
        MarkMigrate markMigrate = (MarkMigrate) other;
        return this.timeZone == markMigrate.timeZone && Intrinsics.areEqual(this.supportECOSync, markMigrate.supportECOSync);
    }

    @Nullable
    public final Boolean getSupportECOSync() {
        return this.supportECOSync;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.timeZone) * 31;
        Boolean bool = this.supportECOSync;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "MarkMigrate(timeZone=" + this.timeZone + ", supportECOSync=" + this.supportECOSync + ")";
    }

    public /* synthetic */ MarkMigrate(int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : bool);
    }
}
