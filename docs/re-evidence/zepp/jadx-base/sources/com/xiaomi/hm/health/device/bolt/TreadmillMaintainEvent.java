package com.xiaomi.hm.health.device.bolt;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/bolt/TreadmillMaintainEvent;", "", "", "component1", "maintain", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getMaintain", "()Z", "<init>", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TreadmillMaintainEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean maintain;

    public TreadmillMaintainEvent(boolean z) {
        this.maintain = z;
    }

    public static /* synthetic */ TreadmillMaintainEvent copy$default(TreadmillMaintainEvent treadmillMaintainEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = treadmillMaintainEvent.maintain;
        }
        return treadmillMaintainEvent.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getMaintain() {
        return this.maintain;
    }

    @NotNull
    public final TreadmillMaintainEvent copy(boolean maintain) {
        return new TreadmillMaintainEvent(maintain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TreadmillMaintainEvent) && this.maintain == ((TreadmillMaintainEvent) other).maintain;
    }

    public final boolean getMaintain() {
        return this.maintain;
    }

    public int hashCode() {
        boolean z = this.maintain;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "TreadmillMaintainEvent(maintain=" + this.maintain + ")";
    }
}
