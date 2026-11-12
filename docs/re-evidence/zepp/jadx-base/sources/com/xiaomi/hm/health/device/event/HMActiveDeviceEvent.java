package com.xiaomi.hm.health.device.event;

import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/event/HMActiveDeviceEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceEvent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "component1", "Lcom/xiaomi/hm/health/databases/model/Device;", "component2", "deviceSource", AppSettingsData.STATUS_ACTIVATED, "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "c", "Lcom/xiaomi/hm/health/databases/model/Device;", "getActivated", "()Lcom/xiaomi/hm/health/databases/model/Device;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/databases/model/Device;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMActiveDeviceEvent extends HMDeviceEvent {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Device activated;

    public HMActiveDeviceEvent(@NotNull HMDeviceSource hMDeviceSource, @Nullable Device device) {
        super(hMDeviceSource.getType());
        this.deviceSource = hMDeviceSource;
        this.activated = device;
    }

    public static /* synthetic */ HMActiveDeviceEvent copy$default(HMActiveDeviceEvent hMActiveDeviceEvent, HMDeviceSource hMDeviceSource, Device device, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceSource = hMActiveDeviceEvent.deviceSource;
        }
        if ((i & 2) != 0) {
            device = hMActiveDeviceEvent.activated;
        }
        return hMActiveDeviceEvent.copy(hMDeviceSource, device);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Device getActivated() {
        return this.activated;
    }

    @NotNull
    public final HMActiveDeviceEvent copy(@NotNull HMDeviceSource deviceSource, @Nullable Device activated) {
        return new HMActiveDeviceEvent(deviceSource, activated);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMActiveDeviceEvent)) {
            return false;
        }
        HMActiveDeviceEvent hMActiveDeviceEvent = (HMActiveDeviceEvent) other;
        return this.deviceSource == hMActiveDeviceEvent.deviceSource && Intrinsics.areEqual(this.activated, hMActiveDeviceEvent.activated);
    }

    @Nullable
    public final Device getActivated() {
        return this.activated;
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    public int hashCode() {
        int iHashCode = this.deviceSource.hashCode() * 31;
        Device device = this.activated;
        return iHashCode + (device == null ? 0 : device.hashCode());
    }

    @NotNull
    public String toString() {
        return "HMActiveDeviceEvent(deviceSource=" + this.deviceSource + ", activated=" + this.activated + ")";
    }
}
