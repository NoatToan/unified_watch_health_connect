package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/event/NewDfuUpgradeEvent;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "component1", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "component2", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "component3", "source", "firmwareType", "progress", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "getFirmwareType", "()Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "c", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "getProgress", "()Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NewDfuUpgradeEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMFirmwareType firmwareType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Progress progress;

    public NewDfuUpgradeEvent(@NotNull HMDeviceSource hMDeviceSource, @NotNull HMFirmwareType hMFirmwareType, @NotNull Progress progress) {
        this.source = hMDeviceSource;
        this.firmwareType = hMFirmwareType;
        this.progress = progress;
    }

    public static /* synthetic */ NewDfuUpgradeEvent copy$default(NewDfuUpgradeEvent newDfuUpgradeEvent, HMDeviceSource hMDeviceSource, HMFirmwareType hMFirmwareType, Progress progress, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceSource = newDfuUpgradeEvent.source;
        }
        if ((i & 2) != 0) {
            hMFirmwareType = newDfuUpgradeEvent.firmwareType;
        }
        if ((i & 4) != 0) {
            progress = newDfuUpgradeEvent.progress;
        }
        return newDfuUpgradeEvent.copy(hMDeviceSource, hMFirmwareType, progress);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceSource getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMFirmwareType getFirmwareType() {
        return this.firmwareType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    public final NewDfuUpgradeEvent copy(@NotNull HMDeviceSource source, @NotNull HMFirmwareType firmwareType, @NotNull Progress progress) {
        return new NewDfuUpgradeEvent(source, firmwareType, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewDfuUpgradeEvent)) {
            return false;
        }
        NewDfuUpgradeEvent newDfuUpgradeEvent = (NewDfuUpgradeEvent) other;
        return this.source == newDfuUpgradeEvent.source && this.firmwareType == newDfuUpgradeEvent.firmwareType && Intrinsics.areEqual(this.progress, newDfuUpgradeEvent.progress);
    }

    @NotNull
    public final HMFirmwareType getFirmwareType() {
        return this.firmwareType;
    }

    @NotNull
    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    public final HMDeviceSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((this.source.hashCode() * 31) + this.firmwareType.hashCode()) * 31) + this.progress.hashCode();
    }

    @NotNull
    public String toString() {
        return "NewDfuUpgradeEvent(source=" + this.source + ", firmwareType=" + this.firmwareType + ", progress=" + this.progress + ")";
    }
}
