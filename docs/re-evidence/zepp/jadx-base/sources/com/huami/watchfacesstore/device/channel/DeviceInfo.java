package com.huami.watchfacesstore.device.channel;

import com.huami.watchfacesstore.device.config.IDeviceConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "", "", "component1", "component2", "Lcom/huami/watchfacesstore/device/config/IDeviceConfig;", "component3", "deviceId", "deviceName", "deviceConfig", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "b", "getDeviceName", "c", "Lcom/huami/watchfacesstore/device/config/IDeviceConfig;", "getDeviceConfig", "()Lcom/huami/watchfacesstore/device/config/IDeviceConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/watchfacesstore/device/config/IDeviceConfig;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final IDeviceConfig deviceConfig;

    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull IDeviceConfig iDeviceConfig) {
        this.deviceId = str;
        this.deviceName = str2;
        this.deviceConfig = iDeviceConfig;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, IDeviceConfig iDeviceConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.deviceName;
        }
        if ((i & 4) != 0) {
            iDeviceConfig = deviceInfo.deviceConfig;
        }
        return deviceInfo.copy(str, str2, iDeviceConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IDeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String deviceId, @NotNull String deviceName, @NotNull IDeviceConfig deviceConfig) {
        return new DeviceInfo(deviceId, deviceName, deviceConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.deviceId, deviceInfo.deviceId) && Intrinsics.areEqual(this.deviceName, deviceInfo.deviceName) && Intrinsics.areEqual(this.deviceConfig, deviceInfo.deviceConfig);
    }

    @NotNull
    public final IDeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + this.deviceName.hashCode()) * 31) + this.deviceConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(deviceId=" + this.deviceId + ", deviceName=" + this.deviceName + ", deviceConfig=" + this.deviceConfig + ")";
    }
}
