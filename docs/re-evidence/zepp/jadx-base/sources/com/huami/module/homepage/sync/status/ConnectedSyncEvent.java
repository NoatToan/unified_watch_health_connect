package com.huami.module.homepage.sync.status;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.sleep.eventbus.SlpHMDeviceSyncDataEventObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/module/homepage/sync/status/ConnectedSyncEvent;", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "component1", "", "component2", "type", SlpHMDeviceSyncDataEventObserver.SYNCING, "copy", "", "toString", "", "hashCode", "", "other", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getType", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "b", "Z", "getSyncing", "()Z", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;Z)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ConnectedSyncEvent extends SyncEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean syncing;

    public ConnectedSyncEvent(@NotNull HMDeviceType hMDeviceType, boolean z) {
        super(null);
        this.type = hMDeviceType;
        this.syncing = z;
    }

    public static /* synthetic */ ConnectedSyncEvent copy$default(ConnectedSyncEvent connectedSyncEvent, HMDeviceType hMDeviceType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = connectedSyncEvent.type;
        }
        if ((i & 2) != 0) {
            z = connectedSyncEvent.syncing;
        }
        return connectedSyncEvent.copy(hMDeviceType, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSyncing() {
        return this.syncing;
    }

    @NotNull
    public final ConnectedSyncEvent copy(@NotNull HMDeviceType type, boolean syncing) {
        return new ConnectedSyncEvent(type, syncing);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedSyncEvent)) {
            return false;
        }
        ConnectedSyncEvent connectedSyncEvent = (ConnectedSyncEvent) other;
        return this.type == connectedSyncEvent.type && this.syncing == connectedSyncEvent.syncing;
    }

    public final boolean getSyncing() {
        return this.syncing;
    }

    @NotNull
    public final HMDeviceType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z = this.syncing;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "ConnectedSyncEvent(type=" + this.type + ", syncing=" + this.syncing + ")";
    }
}
