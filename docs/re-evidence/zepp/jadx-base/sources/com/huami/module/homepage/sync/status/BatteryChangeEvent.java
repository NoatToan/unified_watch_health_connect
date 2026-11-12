package com.huami.module.homepage.sync.status;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/module/homepage/sync/status/BatteryChangeEvent;", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "component1", "", "component2", "type", FirebaseAnalytics.Param.LEVEL, "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getType", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "b", LogUtil.I, "getLevel", "()I", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BatteryChangeEvent extends SyncEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int level;

    public BatteryChangeEvent(@NotNull HMDeviceType hMDeviceType, int i) {
        super(null);
        this.type = hMDeviceType;
        this.level = i;
    }

    public static /* synthetic */ BatteryChangeEvent copy$default(BatteryChangeEvent batteryChangeEvent, HMDeviceType hMDeviceType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hMDeviceType = batteryChangeEvent.type;
        }
        if ((i2 & 2) != 0) {
            i = batteryChangeEvent.level;
        }
        return batteryChangeEvent.copy(hMDeviceType, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final BatteryChangeEvent copy(@NotNull HMDeviceType type, int level) {
        return new BatteryChangeEvent(type, level);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryChangeEvent)) {
            return false;
        }
        BatteryChangeEvent batteryChangeEvent = (BatteryChangeEvent) other;
        return this.type == batteryChangeEvent.type && this.level == batteryChangeEvent.level;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final HMDeviceType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.level;
    }

    @NotNull
    public String toString() {
        return "BatteryChangeEvent(type=" + this.type + ", level=" + this.level + ")";
    }
}
