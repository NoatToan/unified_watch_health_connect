package com.huami.treadmill.data;

import com.xiaomi.hm.health.databases.model.Trackrecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0007\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/treadmill/data/TdTrackrecord;", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "component1", "", "component2", "trackrecord", "isChecked", "copy", "", "toString", "", "hashCode", "other", "equals", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "getTrackrecord", "()Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "setTrackrecord", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;)V", "Z", "()Z", "setChecked", "(Z)V", "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;Z)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdTrackrecord {
    private boolean isChecked;

    @NotNull
    private Trackrecord trackrecord;

    public TdTrackrecord(@NotNull Trackrecord trackrecord, boolean z) {
        this.trackrecord = trackrecord;
        this.isChecked = z;
    }

    public static /* synthetic */ TdTrackrecord copy$default(TdTrackrecord tdTrackrecord, Trackrecord trackrecord, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            trackrecord = tdTrackrecord.trackrecord;
        }
        if ((i & 2) != 0) {
            z = tdTrackrecord.isChecked;
        }
        return tdTrackrecord.copy(trackrecord, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Trackrecord getTrackrecord() {
        return this.trackrecord;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final TdTrackrecord copy(@NotNull Trackrecord trackrecord, boolean isChecked) {
        return new TdTrackrecord(trackrecord, isChecked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdTrackrecord)) {
            return false;
        }
        TdTrackrecord tdTrackrecord = (TdTrackrecord) other;
        return Intrinsics.areEqual(this.trackrecord, tdTrackrecord.trackrecord) && this.isChecked == tdTrackrecord.isChecked;
    }

    @NotNull
    public final Trackrecord getTrackrecord() {
        return this.trackrecord;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.trackrecord.hashCode() * 31;
        boolean z = this.isChecked;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public final void setTrackrecord(@NotNull Trackrecord trackrecord) {
        this.trackrecord = trackrecord;
    }

    @NotNull
    public String toString() {
        return "TdTrackrecord(trackrecord=" + this.trackrecord + ", isChecked=" + this.isChecked + ')';
    }
}
