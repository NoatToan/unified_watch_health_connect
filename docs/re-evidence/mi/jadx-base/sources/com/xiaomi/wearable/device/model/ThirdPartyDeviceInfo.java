package com.xiaomi.wearable.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/wearable/device/model/ThirdPartyDeviceInfo;", "", "deviceVersion", "", "mac", "sn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceVersion", "()Ljava/lang/String;", "getMac", "getSn", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "device_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThirdPartyDeviceInfo {

    @NotNull
    private final String deviceVersion;

    @NotNull
    private final String mac;

    @NotNull
    private final String sn;

    public ThirdPartyDeviceInfo(@NotNull String deviceVersion, @NotNull String mac, @NotNull String sn) {
        Intrinsics.checkNotNullParameter(deviceVersion, "deviceVersion");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(sn, "sn");
        this.deviceVersion = deviceVersion;
        this.mac = mac;
        this.sn = sn;
    }

    public static /* synthetic */ ThirdPartyDeviceInfo copy$default(ThirdPartyDeviceInfo thirdPartyDeviceInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyDeviceInfo.deviceVersion;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyDeviceInfo.mac;
        }
        if ((i & 4) != 0) {
            str3 = thirdPartyDeviceInfo.sn;
        }
        return thirdPartyDeviceInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceVersion() {
        return this.deviceVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final ThirdPartyDeviceInfo copy(@NotNull String deviceVersion, @NotNull String mac, @NotNull String sn) {
        Intrinsics.checkNotNullParameter(deviceVersion, "deviceVersion");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(sn, "sn");
        return new ThirdPartyDeviceInfo(deviceVersion, mac, sn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyDeviceInfo)) {
            return false;
        }
        ThirdPartyDeviceInfo thirdPartyDeviceInfo = (ThirdPartyDeviceInfo) other;
        return Intrinsics.areEqual(this.deviceVersion, thirdPartyDeviceInfo.deviceVersion) && Intrinsics.areEqual(this.mac, thirdPartyDeviceInfo.mac) && Intrinsics.areEqual(this.sn, thirdPartyDeviceInfo.sn);
    }

    @NotNull
    public final String getDeviceVersion() {
        return this.deviceVersion;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return (((this.deviceVersion.hashCode() * 31) + this.mac.hashCode()) * 31) + this.sn.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThirdPartyDeviceInfo(deviceVersion=" + this.deviceVersion + ", mac=" + this.mac + ", sn=" + this.sn + ")";
    }
}
