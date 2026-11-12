package com.huami.module.homepage.sync.status;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/module/homepage/sync/status/PrimaryDeviceUpdateEvent;", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "component1", "primaryHMDeviceType", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getPrimaryHMDeviceType", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PrimaryDeviceUpdateEvent extends SyncEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceType primaryHMDeviceType;

    public PrimaryDeviceUpdateEvent(@NotNull HMDeviceType hMDeviceType) {
        super(null);
        this.primaryHMDeviceType = hMDeviceType;
    }

    public static /* synthetic */ PrimaryDeviceUpdateEvent copy$default(PrimaryDeviceUpdateEvent primaryDeviceUpdateEvent, HMDeviceType hMDeviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = primaryDeviceUpdateEvent.primaryHMDeviceType;
        }
        return primaryDeviceUpdateEvent.copy(hMDeviceType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceType getPrimaryHMDeviceType() {
        return this.primaryHMDeviceType;
    }

    @NotNull
    public final PrimaryDeviceUpdateEvent copy(@NotNull HMDeviceType primaryHMDeviceType) {
        return new PrimaryDeviceUpdateEvent(primaryHMDeviceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PrimaryDeviceUpdateEvent) && this.primaryHMDeviceType == ((PrimaryDeviceUpdateEvent) other).primaryHMDeviceType;
    }

    @NotNull
    public final HMDeviceType getPrimaryHMDeviceType() {
        return this.primaryHMDeviceType;
    }

    public int hashCode() {
        return this.primaryHMDeviceType.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrimaryDeviceUpdateEvent(primaryHMDeviceType=" + this.primaryHMDeviceType + ")";
    }
}
