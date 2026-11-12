package com.xiaomi.fitness.sport.view.launch.adapter;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeModel;", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "isPrimaryDevice", "", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Z)V", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectedDeviceBadgeModel {

    @NotNull
    private final WearableDeviceModel deviceModel;
    private final boolean isPrimaryDevice;

    public ConnectedDeviceBadgeModel(@NotNull WearableDeviceModel deviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.deviceModel = deviceModel;
        this.isPrimaryDevice = z;
    }

    public static /* synthetic */ ConnectedDeviceBadgeModel copy$default(ConnectedDeviceBadgeModel connectedDeviceBadgeModel, WearableDeviceModel wearableDeviceModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wearableDeviceModel = connectedDeviceBadgeModel.deviceModel;
        }
        if ((i & 2) != 0) {
            z = connectedDeviceBadgeModel.isPrimaryDevice;
        }
        return connectedDeviceBadgeModel.copy(wearableDeviceModel, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPrimaryDevice() {
        return this.isPrimaryDevice;
    }

    @NotNull
    public final ConnectedDeviceBadgeModel copy(@NotNull WearableDeviceModel deviceModel, boolean isPrimaryDevice) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return new ConnectedDeviceBadgeModel(deviceModel, isPrimaryDevice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedDeviceBadgeModel)) {
            return false;
        }
        ConnectedDeviceBadgeModel connectedDeviceBadgeModel = (ConnectedDeviceBadgeModel) other;
        return Intrinsics.areEqual(this.deviceModel, connectedDeviceBadgeModel.deviceModel) && this.isPrimaryDevice == connectedDeviceBadgeModel.isPrimaryDevice;
    }

    @NotNull
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    public int hashCode() {
        return (this.deviceModel.hashCode() * 31) + Boolean.hashCode(this.isPrimaryDevice);
    }

    public final boolean isPrimaryDevice() {
        return this.isPrimaryDevice;
    }

    @NotNull
    public String toString() {
        return "ConnectedDeviceBadgeModel(deviceModel=" + this.deviceModel + ", isPrimaryDevice=" + this.isPrimaryDevice + ")";
    }
}
