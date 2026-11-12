package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003JS\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u0010\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0010\u0010&R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/DeviceConnectedVo;", "", "", "component1", "Lcom/xiaomi/hm/health/device/setting/vo/ConnectStatus;", "component2", "component3", "", "component4", "Ljava/util/Calendar;", "component5", "component6", "component7", "progress", "connectStatus", "batteryLevel", "isCharge", "lastChargeTime", "earliestBoundTime", "deltaDay", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getProgress", "()I", "b", "Lcom/xiaomi/hm/health/device/setting/vo/ConnectStatus;", "getConnectStatus", "()Lcom/xiaomi/hm/health/device/setting/vo/ConnectStatus;", "c", "getBatteryLevel", GoogleApiAvailabilityLight.a, "Z", "()Z", "e", "Ljava/util/Calendar;", "getLastChargeTime", "()Ljava/util/Calendar;", "f", "getEarliestBoundTime", "g", "getDeltaDay", "<init>", "(ILcom/xiaomi/hm/health/device/setting/vo/ConnectStatus;IZLjava/util/Calendar;Ljava/util/Calendar;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceConnectedVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int progress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ConnectStatus connectStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int batteryLevel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isCharge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Calendar lastChargeTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Calendar earliestBoundTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int deltaDay;

    public DeviceConnectedVo(int i, @NotNull ConnectStatus connectStatus, int i2, boolean z, @Nullable Calendar calendar, @Nullable Calendar calendar2, int i3) {
        this.progress = i;
        this.connectStatus = connectStatus;
        this.batteryLevel = i2;
        this.isCharge = z;
        this.lastChargeTime = calendar;
        this.earliestBoundTime = calendar2;
        this.deltaDay = i3;
    }

    public static /* synthetic */ DeviceConnectedVo copy$default(DeviceConnectedVo deviceConnectedVo, int i, ConnectStatus connectStatus, int i2, boolean z, Calendar calendar, Calendar calendar2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = deviceConnectedVo.progress;
        }
        if ((i4 & 2) != 0) {
            connectStatus = deviceConnectedVo.connectStatus;
        }
        ConnectStatus connectStatus2 = connectStatus;
        if ((i4 & 4) != 0) {
            i2 = deviceConnectedVo.batteryLevel;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            z = deviceConnectedVo.isCharge;
        }
        boolean z2 = z;
        if ((i4 & 16) != 0) {
            calendar = deviceConnectedVo.lastChargeTime;
        }
        Calendar calendar3 = calendar;
        if ((i4 & 32) != 0) {
            calendar2 = deviceConnectedVo.earliestBoundTime;
        }
        Calendar calendar4 = calendar2;
        if ((i4 & 64) != 0) {
            i3 = deviceConnectedVo.deltaDay;
        }
        return deviceConnectedVo.copy(i, connectStatus2, i5, z2, calendar3, calendar4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectStatus getConnectStatus() {
        return this.connectStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsCharge() {
        return this.isCharge;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Calendar getLastChargeTime() {
        return this.lastChargeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Calendar getEarliestBoundTime() {
        return this.earliestBoundTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDeltaDay() {
        return this.deltaDay;
    }

    @NotNull
    public final DeviceConnectedVo copy(int progress, @NotNull ConnectStatus connectStatus, int batteryLevel, boolean isCharge, @Nullable Calendar lastChargeTime, @Nullable Calendar earliestBoundTime, int deltaDay) {
        return new DeviceConnectedVo(progress, connectStatus, batteryLevel, isCharge, lastChargeTime, earliestBoundTime, deltaDay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceConnectedVo)) {
            return false;
        }
        DeviceConnectedVo deviceConnectedVo = (DeviceConnectedVo) other;
        return this.progress == deviceConnectedVo.progress && this.connectStatus == deviceConnectedVo.connectStatus && this.batteryLevel == deviceConnectedVo.batteryLevel && this.isCharge == deviceConnectedVo.isCharge && Intrinsics.areEqual(this.lastChargeTime, deviceConnectedVo.lastChargeTime) && Intrinsics.areEqual(this.earliestBoundTime, deviceConnectedVo.earliestBoundTime) && this.deltaDay == deviceConnectedVo.deltaDay;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    @NotNull
    public final ConnectStatus getConnectStatus() {
        return this.connectStatus;
    }

    public final int getDeltaDay() {
        return this.deltaDay;
    }

    @Nullable
    public final Calendar getEarliestBoundTime() {
        return this.earliestBoundTime;
    }

    @Nullable
    public final Calendar getLastChargeTime() {
        return this.lastChargeTime;
    }

    public final int getProgress() {
        return this.progress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.progress * 31) + this.connectStatus.hashCode()) * 31) + this.batteryLevel) * 31;
        boolean z = this.isCharge;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        Calendar calendar = this.lastChargeTime;
        int iHashCode2 = (i + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.earliestBoundTime;
        return ((iHashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31) + this.deltaDay;
    }

    public final boolean isCharge() {
        return this.isCharge;
    }

    @NotNull
    public String toString() {
        return "DeviceConnectedVo(progress=" + this.progress + ", connectStatus=" + this.connectStatus + ", batteryLevel=" + this.batteryLevel + ", isCharge=" + this.isCharge + ", lastChargeTime=" + this.lastChargeTime + ", earliestBoundTime=" + this.earliestBoundTime + ", deltaDay=" + this.deltaDay + ")";
    }

    public /* synthetic */ DeviceConnectedVo(int i, ConnectStatus connectStatus, int i2, boolean z, Calendar calendar, Calendar calendar2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, connectStatus, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? null : calendar, (i4 & 32) != 0 ? null : calendar2, (i4 & 64) != 0 ? 0 : i3);
    }
}
