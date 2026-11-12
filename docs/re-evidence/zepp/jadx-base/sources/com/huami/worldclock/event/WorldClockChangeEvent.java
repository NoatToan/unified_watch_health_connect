package com.huami.worldclock.event;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/worldclock/event/WorldClockChangeEvent;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "component1", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "component2", "type", "deviceSource", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getType", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "setType", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;)V", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "setDeviceSource", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WorldClockChangeEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private HMDeviceType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private HMDeviceSource deviceSource;

    /* JADX WARN: Multi-variable type inference failed */
    public WorldClockChangeEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public WorldClockChangeEvent(@NotNull HMDeviceType hMDeviceType, @NotNull HMDeviceSource hMDeviceSource) {
        this.type = hMDeviceType;
        this.deviceSource = hMDeviceSource;
    }

    public static /* synthetic */ WorldClockChangeEvent copy$default(WorldClockChangeEvent worldClockChangeEvent, HMDeviceType hMDeviceType, HMDeviceSource hMDeviceSource, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = worldClockChangeEvent.type;
        }
        if ((i & 2) != 0) {
            hMDeviceSource = worldClockChangeEvent.deviceSource;
        }
        return worldClockChangeEvent.copy(hMDeviceType, hMDeviceSource);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final WorldClockChangeEvent copy(@NotNull HMDeviceType type, @NotNull HMDeviceSource deviceSource) {
        return new WorldClockChangeEvent(type, deviceSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldClockChangeEvent)) {
            return false;
        }
        WorldClockChangeEvent worldClockChangeEvent = (WorldClockChangeEvent) other;
        return this.type == worldClockChangeEvent.type && this.deviceSource == worldClockChangeEvent.deviceSource;
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final HMDeviceType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.deviceSource.hashCode();
    }

    public final void setDeviceSource(@NotNull HMDeviceSource hMDeviceSource) {
        this.deviceSource = hMDeviceSource;
    }

    public final void setType(@NotNull HMDeviceType hMDeviceType) {
        this.type = hMDeviceType;
    }

    @NotNull
    public String toString() {
        return "WorldClockChangeEvent(type=" + this.type + ", deviceSource=" + this.deviceSource + ')';
    }

    public /* synthetic */ WorldClockChangeEvent(HMDeviceType hMDeviceType, HMDeviceSource hMDeviceSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HMDeviceType.MILI : hMDeviceType, (i & 2) != 0 ? HMDeviceSource.VDEVICE : hMDeviceSource);
    }
}
