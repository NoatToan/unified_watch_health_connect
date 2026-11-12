package com.xiaomi.wearable.core.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/wearable/core/client/DeviceInfo;", "", "deviceName", "", "model", "deviceType", "", "mediumType", "did", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDeviceName", "()Ljava/lang/String;", "getModel", "getDeviceType", "()I", "getMediumType", "getDid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceInfo {

    @NotNull
    private final String deviceName;
    private final int deviceType;

    @NotNull
    private final String did;

    @NotNull
    private final String mediumType;

    @NotNull
    private final String model;

    public DeviceInfo(@NotNull String deviceName, @NotNull String model, int i, @NotNull String mediumType, @NotNull String did) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mediumType, "mediumType");
        Intrinsics.checkNotNullParameter(did, "did");
        this.deviceName = deviceName;
        this.model = model;
        this.deviceType = i;
        this.mediumType = mediumType;
        this.did = did;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceInfo.deviceName;
        }
        if ((i2 & 2) != 0) {
            str2 = deviceInfo.model;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = deviceInfo.deviceType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = deviceInfo.mediumType;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = deviceInfo.did;
        }
        return deviceInfo.copy(str, str5, i3, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMediumType() {
        return this.mediumType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String deviceName, @NotNull String model, int deviceType, @NotNull String mediumType, @NotNull String did) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mediumType, "mediumType");
        Intrinsics.checkNotNullParameter(did, "did");
        return new DeviceInfo(deviceName, model, deviceType, mediumType, did);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.deviceName, deviceInfo.deviceName) && Intrinsics.areEqual(this.model, deviceInfo.model) && this.deviceType == deviceInfo.deviceType && Intrinsics.areEqual(this.mediumType, deviceInfo.mediumType) && Intrinsics.areEqual(this.did, deviceInfo.did);
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getMediumType() {
        return this.mediumType;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return (((((((this.deviceName.hashCode() * 31) + this.model.hashCode()) * 31) + Integer.hashCode(this.deviceType)) * 31) + this.mediumType.hashCode()) * 31) + this.did.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(deviceName=" + this.deviceName + ", model=" + this.model + ", deviceType=" + this.deviceType + ", mediumType=" + this.mediumType + ", did=" + this.did + ")";
    }
}
