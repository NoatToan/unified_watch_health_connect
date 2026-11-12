package com.xiaomi.hm.health.device.webapi.device;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003JC\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0019\u0010(\u001a\u00020#8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/device/StatisticInfo;", "", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "component1", "", "component2", "component3", "component4", "component5", "deviceInfo", "batteryInfo", "statisticInfo", "leftVersion", "rightVersion", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "b", "Ljava/lang/String;", "getBatteryInfo", "()Ljava/lang/String;", "c", "getStatisticInfo", GoogleApiAvailabilityLight.a, "getLeftVersion", "e", "getRightVersion", "Lorg/json/JSONObject;", "f", "Lorg/json/JSONObject;", "getDeviceInfoJson", "()Lorg/json/JSONObject;", "deviceInfoJson", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StatisticInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DeviceInfo deviceInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String batteryInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String statisticInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String leftVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String rightVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final JSONObject deviceInfoJson;

    public StatisticInfo(@NotNull DeviceInfo deviceInfo, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) throws JSONException {
        this.deviceInfo = deviceInfo;
        this.batteryInfo = str;
        this.statisticInfo = str2;
        this.leftVersion = str3;
        this.rightVersion = str4;
        JSONObject json = deviceInfo.toJson();
        String leftVersion = getLeftVersion();
        if (leftVersion != null) {
            json.put("leftVersion", leftVersion);
        }
        String rightVersion = getRightVersion();
        if (rightVersion != null) {
            json.put("rightVersion", rightVersion);
        }
        Unit unit = Unit.INSTANCE;
        this.deviceInfoJson = json;
    }

    public static /* synthetic */ StatisticInfo copy$default(StatisticInfo statisticInfo, DeviceInfo deviceInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceInfo = statisticInfo.deviceInfo;
        }
        if ((i & 2) != 0) {
            str = statisticInfo.batteryInfo;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = statisticInfo.statisticInfo;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = statisticInfo.leftVersion;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = statisticInfo.rightVersion;
        }
        return statisticInfo.copy(deviceInfo, str5, str6, str7, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBatteryInfo() {
        return this.batteryInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatisticInfo() {
        return this.statisticInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeftVersion() {
        return this.leftVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRightVersion() {
        return this.rightVersion;
    }

    @NotNull
    public final StatisticInfo copy(@NotNull DeviceInfo deviceInfo, @Nullable String batteryInfo, @Nullable String statisticInfo, @Nullable String leftVersion, @Nullable String rightVersion) {
        return new StatisticInfo(deviceInfo, batteryInfo, statisticInfo, leftVersion, rightVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticInfo)) {
            return false;
        }
        StatisticInfo statisticInfo = (StatisticInfo) other;
        return Intrinsics.areEqual(this.deviceInfo, statisticInfo.deviceInfo) && Intrinsics.areEqual(this.batteryInfo, statisticInfo.batteryInfo) && Intrinsics.areEqual(this.statisticInfo, statisticInfo.statisticInfo) && Intrinsics.areEqual(this.leftVersion, statisticInfo.leftVersion) && Intrinsics.areEqual(this.rightVersion, statisticInfo.rightVersion);
    }

    @Nullable
    public final String getBatteryInfo() {
        return this.batteryInfo;
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final JSONObject getDeviceInfoJson() {
        return this.deviceInfoJson;
    }

    @Nullable
    public final String getLeftVersion() {
        return this.leftVersion;
    }

    @Nullable
    public final String getRightVersion() {
        return this.rightVersion;
    }

    @Nullable
    public final String getStatisticInfo() {
        return this.statisticInfo;
    }

    public int hashCode() {
        int iHashCode = this.deviceInfo.hashCode() * 31;
        String str = this.batteryInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statisticInfo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leftVersion;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightVersion;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StatisticInfo(deviceInfo=" + this.deviceInfo + ", batteryInfo=" + this.batteryInfo + ", statisticInfo=" + this.statisticInfo + ", leftVersion=" + this.leftVersion + ", rightVersion=" + this.rightVersion + ")";
    }

    public /* synthetic */ StatisticInfo(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceInfo, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
