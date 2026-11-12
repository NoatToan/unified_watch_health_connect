package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/DeviceInfoData;", "", "deviceName", "", "deviceType", "did", "sn", "sku", "model", "hardwareVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceName", "()Ljava/lang/String;", "getDeviceType", "getDid", "getSn", "getSku", "getModel", "getHardwareVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceInfoData {

    @SerializedName("device_name")
    @NotNull
    private final String deviceName;

    @SerializedName(DeviceContractKt.COLUMN_DEVICE_TYPE)
    @NotNull
    private final String deviceType;

    @SerializedName("did")
    @NotNull
    private final String did;

    @SerializedName("hardware_version")
    @NotNull
    private final String hardwareVersion;

    @SerializedName("model")
    @NotNull
    private final String model;

    @SerializedName("sku")
    @NotNull
    private final String sku;

    @SerializedName("sn")
    @NotNull
    private final String sn;

    public DeviceInfoData(@NotNull String deviceName, @NotNull String deviceType, @NotNull String did, @NotNull String sn, @NotNull String sku, @NotNull String model, @NotNull String hardwareVersion) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.did = did;
        this.sn = sn;
        this.sku = sku;
        this.model = model;
        this.hardwareVersion = hardwareVersion;
    }

    public static /* synthetic */ DeviceInfoData copy$default(DeviceInfoData deviceInfoData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfoData.deviceName;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfoData.deviceType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = deviceInfoData.did;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = deviceInfoData.sn;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = deviceInfoData.sku;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = deviceInfoData.model;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = deviceInfoData.hardwareVersion;
        }
        return deviceInfoData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @NotNull
    public final DeviceInfoData copy(@NotNull String deviceName, @NotNull String deviceType, @NotNull String did, @NotNull String sn, @NotNull String sku, @NotNull String model, @NotNull String hardwareVersion) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        return new DeviceInfoData(deviceName, deviceType, did, sn, sku, model, hardwareVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfoData)) {
            return false;
        }
        DeviceInfoData deviceInfoData = (DeviceInfoData) other;
        return Intrinsics.areEqual(this.deviceName, deviceInfoData.deviceName) && Intrinsics.areEqual(this.deviceType, deviceInfoData.deviceType) && Intrinsics.areEqual(this.did, deviceInfoData.did) && Intrinsics.areEqual(this.sn, deviceInfoData.sn) && Intrinsics.areEqual(this.sku, deviceInfoData.sku) && Intrinsics.areEqual(this.model, deviceInfoData.model) && Intrinsics.areEqual(this.hardwareVersion, deviceInfoData.hardwareVersion);
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return (((((((((((this.deviceName.hashCode() * 31) + this.deviceType.hashCode()) * 31) + this.did.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.sku.hashCode()) * 31) + this.model.hashCode()) * 31) + this.hardwareVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceInfoData(deviceName=" + this.deviceName + ", deviceType=" + this.deviceType + ", did=" + this.did + ", sn=" + this.sn + ", sku=" + this.sku + ", model=" + this.model + ", hardwareVersion=" + this.hardwareVersion + ")";
    }
}
