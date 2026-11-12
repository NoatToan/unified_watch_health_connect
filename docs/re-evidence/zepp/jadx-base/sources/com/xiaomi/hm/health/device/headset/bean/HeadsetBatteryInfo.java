package com.xiaomi.hm.health.device.headset.bean;

import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b#\u0010$J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/bean/HeadsetBatteryInfo;", "", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "component1", "", "component2", "Lcom/xiaomi/hm/health/device/headset/bean/HeadsetPart;", "component3", "batteryInfo", "isCharging", "part", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getBatteryInfo", "()Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "setBatteryInfo", "(Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;)V", "b", "Z", "()Z", "setCharging", "(Z)V", "c", "Lcom/xiaomi/hm/health/device/headset/bean/HeadsetPart;", "getPart", "()Lcom/xiaomi/hm/health/device/headset/bean/HeadsetPart;", "setPart", "(Lcom/xiaomi/hm/health/device/headset/bean/HeadsetPart;)V", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;ZLcom/xiaomi/hm/health/device/headset/bean/HeadsetPart;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeadsetBatteryInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private BatteryInfo batteryInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isCharging;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private HeadsetPart part;

    public HeadsetBatteryInfo() {
        this(null, false, null, 7, null);
    }

    public HeadsetBatteryInfo(@Nullable BatteryInfo batteryInfo, boolean z, @Nullable HeadsetPart headsetPart) {
        this.batteryInfo = batteryInfo;
        this.isCharging = z;
        this.part = headsetPart;
    }

    public static /* synthetic */ HeadsetBatteryInfo copy$default(HeadsetBatteryInfo headsetBatteryInfo, BatteryInfo batteryInfo, boolean z, HeadsetPart headsetPart, int i, Object obj) {
        if ((i & 1) != 0) {
            batteryInfo = headsetBatteryInfo.batteryInfo;
        }
        if ((i & 2) != 0) {
            z = headsetBatteryInfo.isCharging;
        }
        if ((i & 4) != 0) {
            headsetPart = headsetBatteryInfo.part;
        }
        return headsetBatteryInfo.copy(batteryInfo, z, headsetPart);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BatteryInfo getBatteryInfo() {
        return this.batteryInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HeadsetPart getPart() {
        return this.part;
    }

    @NotNull
    public final HeadsetBatteryInfo copy(@Nullable BatteryInfo batteryInfo, boolean isCharging, @Nullable HeadsetPart part) {
        return new HeadsetBatteryInfo(batteryInfo, isCharging, part);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetBatteryInfo)) {
            return false;
        }
        HeadsetBatteryInfo headsetBatteryInfo = (HeadsetBatteryInfo) other;
        return Intrinsics.areEqual(this.batteryInfo, headsetBatteryInfo.batteryInfo) && this.isCharging == headsetBatteryInfo.isCharging && this.part == headsetBatteryInfo.part;
    }

    @Nullable
    public final BatteryInfo getBatteryInfo() {
        return this.batteryInfo;
    }

    @Nullable
    public final HeadsetPart getPart() {
        return this.part;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        BatteryInfo batteryInfo = this.batteryInfo;
        int iHashCode = (batteryInfo == null ? 0 : batteryInfo.hashCode()) * 31;
        boolean z = this.isCharging;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        HeadsetPart headsetPart = this.part;
        return i + (headsetPart != null ? headsetPart.hashCode() : 0);
    }

    public final boolean isCharging() {
        return this.isCharging;
    }

    public final void setBatteryInfo(@Nullable BatteryInfo batteryInfo) {
        this.batteryInfo = batteryInfo;
    }

    public final void setCharging(boolean z) {
        this.isCharging = z;
    }

    public final void setPart(@Nullable HeadsetPart headsetPart) {
        this.part = headsetPart;
    }

    @NotNull
    public String toString() {
        return "HeadsetBatteryInfo(batteryInfo=" + this.batteryInfo + ", isCharging=" + this.isCharging + ", part=" + this.part + ")";
    }

    public /* synthetic */ HeadsetBatteryInfo(BatteryInfo batteryInfo, boolean z, HeadsetPart headsetPart, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : batteryInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : headsetPart);
    }
}
