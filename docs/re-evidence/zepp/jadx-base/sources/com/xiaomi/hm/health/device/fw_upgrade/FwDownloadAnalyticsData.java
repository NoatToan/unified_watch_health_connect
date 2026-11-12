package com.xiaomi.hm.health.device.fw_upgrade;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u0011\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0011\u0010'R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R\u0019\u0010\u0013\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0014\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/xiaomi/hm/health/device/fw_upgrade/FwDownloadAnalyticsData;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "component1", "", "component2", "component3", "", "component4", "component5", "", "component6", "component7", "component8", "source", "localVersion", "cloudVersion", "isForceUpgrade", "firmwareType", "localFlag", "cloudFlag", "reason", "copy", "toString", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Ljava/lang/String;", "getLocalVersion", "()Ljava/lang/String;", "c", "getCloudVersion", GoogleApiAvailabilityLight.a, "Z", "()Z", "e", "getFirmwareType", "f", LogUtil.I, "getLocalFlag", "()I", "g", "getCloudFlag", "h", "getReason", "setReason", "(Ljava/lang/String;)V", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FwDownloadAnalyticsData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String localVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String cloudVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isForceUpgrade;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String firmwareType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int localFlag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int cloudFlag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private String reason;

    public FwDownloadAnalyticsData(@NotNull HMDeviceSource hMDeviceSource, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, int i, int i2, @NotNull String str4) {
        this.source = hMDeviceSource;
        this.localVersion = str;
        this.cloudVersion = str2;
        this.isForceUpgrade = z;
        this.firmwareType = str3;
        this.localFlag = i;
        this.cloudFlag = i2;
        this.reason = str4;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceSource getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLocalVersion() {
        return this.localVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCloudVersion() {
        return this.cloudVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsForceUpgrade() {
        return this.isForceUpgrade;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirmwareType() {
        return this.firmwareType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLocalFlag() {
        return this.localFlag;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCloudFlag() {
        return this.cloudFlag;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final FwDownloadAnalyticsData copy(@NotNull HMDeviceSource source, @NotNull String localVersion, @NotNull String cloudVersion, boolean isForceUpgrade, @NotNull String firmwareType, int localFlag, int cloudFlag, @NotNull String reason) {
        return new FwDownloadAnalyticsData(source, localVersion, cloudVersion, isForceUpgrade, firmwareType, localFlag, cloudFlag, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FwDownloadAnalyticsData)) {
            return false;
        }
        FwDownloadAnalyticsData fwDownloadAnalyticsData = (FwDownloadAnalyticsData) other;
        return this.source == fwDownloadAnalyticsData.source && Intrinsics.areEqual(this.localVersion, fwDownloadAnalyticsData.localVersion) && Intrinsics.areEqual(this.cloudVersion, fwDownloadAnalyticsData.cloudVersion) && this.isForceUpgrade == fwDownloadAnalyticsData.isForceUpgrade && Intrinsics.areEqual(this.firmwareType, fwDownloadAnalyticsData.firmwareType) && this.localFlag == fwDownloadAnalyticsData.localFlag && this.cloudFlag == fwDownloadAnalyticsData.cloudFlag && Intrinsics.areEqual(this.reason, fwDownloadAnalyticsData.reason);
    }

    public final int getCloudFlag() {
        return this.cloudFlag;
    }

    @NotNull
    public final String getCloudVersion() {
        return this.cloudVersion;
    }

    @NotNull
    public final String getFirmwareType() {
        return this.firmwareType;
    }

    public final int getLocalFlag() {
        return this.localFlag;
    }

    @NotNull
    public final String getLocalVersion() {
        return this.localVersion;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final HMDeviceSource getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.source.hashCode() * 31) + this.localVersion.hashCode()) * 31) + this.cloudVersion.hashCode()) * 31;
        boolean z = this.isForceUpgrade;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + this.firmwareType.hashCode()) * 31) + this.localFlag) * 31) + this.cloudFlag) * 31) + this.reason.hashCode();
    }

    public final boolean isForceUpgrade() {
        return this.isForceUpgrade;
    }

    public final void setReason(@NotNull String str) {
        this.reason = str;
    }

    @NotNull
    public String toString() {
        return "FwDownloadAnalyticsData(source=" + this.source + ", localVersion=" + this.localVersion + ", cloudVersion=" + this.cloudVersion + ", isForceUpgrade=" + this.isForceUpgrade + ", firmwareType=" + this.firmwareType + ", localFlag=" + this.localFlag + ", cloudFlag=" + this.cloudFlag + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ FwDownloadAnalyticsData(HMDeviceSource hMDeviceSource, String str, String str2, boolean z, String str3, int i, int i2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMDeviceSource, str, str2, z, str3, i, i2, (i3 & 128) != 0 ? "other" : str4);
    }
}
