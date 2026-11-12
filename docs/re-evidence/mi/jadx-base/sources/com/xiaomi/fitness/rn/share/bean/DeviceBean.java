package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.fitness.rn.export.RNDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\nHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/DeviceBean;", "", "device", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/rn/export/RNDeviceModel;)V", "getDevice", "()Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "setDevice", "sharedCount", "", "getSharedCount", "()I", "setSharedCount", "(I)V", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceBean {

    @NotNull
    private RNDeviceModel device;
    private int sharedCount;

    public DeviceBean(@NotNull RNDeviceModel device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
    }

    public static /* synthetic */ DeviceBean copy$default(DeviceBean deviceBean, RNDeviceModel rNDeviceModel, int i, Object obj) {
        if ((i & 1) != 0) {
            rNDeviceModel = deviceBean.device;
        }
        return deviceBean.copy(rNDeviceModel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RNDeviceModel getDevice() {
        return this.device;
    }

    @NotNull
    public final DeviceBean copy(@NotNull RNDeviceModel device) {
        Intrinsics.checkNotNullParameter(device, "device");
        return new DeviceBean(device);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceBean) && Intrinsics.areEqual(this.device, ((DeviceBean) other).device);
    }

    @NotNull
    public final RNDeviceModel getDevice() {
        return this.device;
    }

    public final int getSharedCount() {
        return this.sharedCount;
    }

    public int hashCode() {
        return this.device.hashCode();
    }

    public final void setDevice(@NotNull RNDeviceModel rNDeviceModel) {
        Intrinsics.checkNotNullParameter(rNDeviceModel, "<set-?>");
        this.device = rNDeviceModel;
    }

    public final void setSharedCount(int i) {
        this.sharedCount = i;
    }

    @NotNull
    public String toString() {
        return "DeviceBean(device=" + this.device + ")";
    }
}
