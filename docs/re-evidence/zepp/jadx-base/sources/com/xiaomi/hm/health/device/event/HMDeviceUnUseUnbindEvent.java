package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/event/HMDeviceUnUseUnbindEvent;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "component1", "type", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getType", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMDeviceUnUseUnbindEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceType type;

    public HMDeviceUnUseUnbindEvent(@NotNull HMDeviceType hMDeviceType) {
        this.type = hMDeviceType;
    }

    public static /* synthetic */ HMDeviceUnUseUnbindEvent copy$default(HMDeviceUnUseUnbindEvent hMDeviceUnUseUnbindEvent, HMDeviceType hMDeviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = hMDeviceUnUseUnbindEvent.type;
        }
        return hMDeviceUnUseUnbindEvent.copy(hMDeviceType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceType getType() {
        return this.type;
    }

    @NotNull
    public final HMDeviceUnUseUnbindEvent copy(@NotNull HMDeviceType type) {
        return new HMDeviceUnUseUnbindEvent(type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HMDeviceUnUseUnbindEvent) && this.type == ((HMDeviceUnUseUnbindEvent) other).type;
    }

    @NotNull
    public final HMDeviceType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "HMDeviceUnUseUnbindEvent(type=" + this.type + ")";
    }
}
