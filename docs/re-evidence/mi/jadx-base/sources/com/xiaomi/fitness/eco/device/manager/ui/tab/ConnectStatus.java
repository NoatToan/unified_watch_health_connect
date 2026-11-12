package com.xiaomi.fitness.eco.device.manager.ui.tab;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.onetrack.api.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/tab/ConnectStatus;", "", "code", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", b.M, "<init>", "(ILcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;I)V", "getCode", "()I", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getRetry", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectStatus {
    private final int code;

    @NotNull
    private final WearableDeviceModel deviceModel;
    private final int retry;

    public ConnectStatus(int i, @NotNull WearableDeviceModel deviceModel, int i2) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.code = i;
        this.deviceModel = deviceModel;
        this.retry = i2;
    }

    public static /* synthetic */ ConnectStatus copy$default(ConnectStatus connectStatus, int i, WearableDeviceModel wearableDeviceModel, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = connectStatus.code;
        }
        if ((i3 & 2) != 0) {
            wearableDeviceModel = connectStatus.deviceModel;
        }
        if ((i3 & 4) != 0) {
            i2 = connectStatus.retry;
        }
        return connectStatus.copy(i, wearableDeviceModel, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRetry() {
        return this.retry;
    }

    @NotNull
    public final ConnectStatus copy(int code, @NotNull WearableDeviceModel deviceModel, int retry) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return new ConnectStatus(code, deviceModel, retry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectStatus)) {
            return false;
        }
        ConnectStatus connectStatus = (ConnectStatus) other;
        return this.code == connectStatus.code && Intrinsics.areEqual(this.deviceModel, connectStatus.deviceModel) && this.retry == connectStatus.retry;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    public final int getRetry() {
        return this.retry;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.deviceModel.hashCode()) * 31) + Integer.hashCode(this.retry);
    }

    @NotNull
    public String toString() {
        return "ConnectStatus(code=" + this.code + ", deviceModel=" + this.deviceModel + ", retry=" + this.retry + ")";
    }

    public /* synthetic */ ConnectStatus(int i, WearableDeviceModel wearableDeviceModel, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, wearableDeviceModel, (i3 & 4) != 0 ? 0 : i2);
    }
}
